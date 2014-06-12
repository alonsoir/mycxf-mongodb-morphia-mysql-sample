package com.aironman.sample.transformer;

import com.aironman.sample.dao.model.User;
import com.aironman.sample.dto.SignupForm;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;


/**
 * User: aironman
 * Date: 4 de junio del 2014
 */
@Component
public class UserTransformer {

    private DozerBeanMapper mapper = new DozerBeanMapper();

    public User signupFormToUser(SignupForm signupForm) {
        User user = mapper.map(signupForm, User.class);
        return user;
    }

    public SignupForm userToSignupForm(User user) {
        SignupForm signupForm = mapper.map(user, SignupForm.class);
        return signupForm;
    }

}
