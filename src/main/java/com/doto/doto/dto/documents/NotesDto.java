package com.doto.doto.dto.documents;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class NotesDto {

    private String id;

    private String noteTitle;

    private String noteDescription;

    private Date createdDate;

    private Date updatedDate;

    private boolean isActive;
}
