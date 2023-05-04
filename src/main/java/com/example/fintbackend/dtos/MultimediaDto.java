package com.example.fintbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MultimediaDto {

    private int id;             //PK
    private String title;
    private String content;
    private int duration;
    private int contendId;      //FK

}
