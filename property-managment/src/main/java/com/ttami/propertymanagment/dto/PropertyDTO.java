package com.ttami.propertymanagment.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PropertyDTO {
    private Long id;
    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private Double proce;
    private String address;
    private Long userId;


}
