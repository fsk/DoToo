package com.doto.doto.dto.request.createrequest;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateEventsRequest {

    private String eventTitle;
    private String eventDescription;
    private Date eventCreatedDate;
    private Date eventFinishedDate;

}
