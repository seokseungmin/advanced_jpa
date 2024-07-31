package com.springboot.advanced_jpa.data.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@ToString
public class ProductResponseDto {

    private Long number;
    private String name;
    private int price;
    private int stock;
}
