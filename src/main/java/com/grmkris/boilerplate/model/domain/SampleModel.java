package com.grmkris.boilerplate.model.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class SampleModel implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sample_id")
    private long id;

    @Column(name = "sample_string")
    private String sampleString;
    @Column(name = "sample_int")
    private int sampleInt;

    	 
    @Temporal(TemporalType.DATE)
    @Column(name = "publication_date")
    private Date publicationDate;
    
    @Column(name = "publication_time")
    @Temporal(TemporalType.TIME)
    private Date publicationTime;

    @Column(name = "publication_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "building_id")
    private SampleBuilding building; //immutable

    // todo sampleBuilding object
    // rename sampleModel to sampleRoom
    
    //add many to one non-immutable

    //add manytomany
    //add onetomany 


}