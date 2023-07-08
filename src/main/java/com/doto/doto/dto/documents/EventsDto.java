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
public class EventsDto {

    private String eventTitle;
    private String eventDescription;
    private Date eventCreatedDate;
    private Date eventFinishedDate;
    private Date eventUpdatedCreatedDate;
    private Date eventUpdatedFinishedDate;

}
