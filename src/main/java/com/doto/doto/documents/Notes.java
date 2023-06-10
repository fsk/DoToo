package com.doto.doto.documents;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;


@Document
@Data
@Builder
public class Notes implements Serializable {

    @Id
    private String id;
    private String noteTitle;
    private String noteDescription;
    private Date createdDate;
    private Date updatedDate;
    private boolean isActive;

}
