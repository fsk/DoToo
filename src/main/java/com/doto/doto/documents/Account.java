package com.doto.doto.documents;


import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Document
@Data
@Builder
public class Account implements Serializable {

    @Id
    @Generated
    private String id;
    private String name;
    private String surname;
    private String userName;
    private String email;
    private String password;


}
