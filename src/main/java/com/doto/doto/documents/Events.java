package com.doto.doto.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Events {

    @Id
    private String id;
    private String eventTitle;
    private String eventDescription;
    private Date eventCreatedDate;
    private Date eventFinishedDate;
    private Date eventUpdatedCreatedDate;
    private Date eventUpdatedFinishedDate;

}
