package com.aironman.sample.mongo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aironman.sample.dao.model.Employee;
import com.aironman.sample.mongo.documents.Role;
import com.aironman.sample.mongo.documents.UserAccount;
import com.aironman.sample.service.DbService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationTestContext.xml")
public abstract class AbstractMongoTest {

	@Autowired 
	private MongoOperations operations;
	
    @Autowired 
    protected PasswordEncoder encoder;
    
    @Autowired 
    protected DbService dbService;
    
	protected Role userRole, adminRole, superAdminRole;
	
	protected String testPasswordEncoded;

	@Before
	public void setUp() {
		//clear all collections, but leave indexes intact
		dbService.cleanUp();
		testPasswordEncoded = encoder.encode("test");
		
//	alternative to @Indexed in UserAccount.class 
//		operations.indexOps(UserAccount.class).ensureIndex(new Index().on("username", Direction.DESC).unique(Duplicates.DROP));
		
		//establish roles
		userRole = new Role();
		userRole.setId("ROLE_USER");
		operations.insert(userRole, "role");
		
		adminRole = new Role();
		adminRole.setId("ROLE_ADMIN");
		operations.insert(adminRole, "role");

		superAdminRole = new Role();
		superAdminRole.setId("ROLE_SUPERADMIN");
		operations.insert(superAdminRole, "role");
	}

	protected UserAccount buildJdoe() {
		UserAccount jdoe = new UserAccount();
		jdoe.setFirstname("John");
		jdoe.setLastname("Doe");
		jdoe.setPassword(testPasswordEncoded);
		jdoe.addRole(adminRole);
		jdoe.addRole(userRole);
		jdoe.setUsername("jdoe");
		return jdoe;
	}
	
//	protected Employee buildEmployee() {
//		Employee employee = new Employee();
//		employee.se
//	}
}
