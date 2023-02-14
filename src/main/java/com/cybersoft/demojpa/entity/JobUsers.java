package com.cybersoft.demojpa.entity;

import javax.persistence.*;

@Entity(name = "sub_job")
//@IdClass(IdJobUsers.class)
public class JobUsers {

//    @Id
//    private int userId;
//
//    @Id
//    private int jobId;

    @EmbeddedId
    IdJobUsers idJobUsers;
}
