package com.doto.doto.documents;


import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;


@Document
@Data
@Builder
public class Notes implements Serializable {

    @Id
    @Generated
    private String id;
    private String noteTitle;
    private String noteDescription;
    private Date createdDate;
    private Date updatedDate;
    @Builder.Default
    private boolean isActive = true;

}
