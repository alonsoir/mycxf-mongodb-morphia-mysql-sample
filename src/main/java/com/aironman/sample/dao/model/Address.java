package com.aironman.sample.dao.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Date: 12 junio 2014
 *
 * @author Konrad Malawski
 * @author Alonso Isidoro
 */
@Entity("adresses")
public class Address {

    @Id
    private ObjectId id;

    private String street;
    
    private String latitud;
    
    private String longitud;

    public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
