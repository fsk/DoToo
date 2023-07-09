package com.doto.doto.dto.documents;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotesDto {

    private String noteTitle;
    private String noteDescription;
    private Date createdDate;
    private Date updatedDate;


}
