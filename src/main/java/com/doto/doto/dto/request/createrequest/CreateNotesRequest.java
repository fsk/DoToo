package com.doto.doto.dto.request.createrequest;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateNotesRequest {

    private String noteTitle;
    private String noteDescription;
    private Date createdDate;

}
