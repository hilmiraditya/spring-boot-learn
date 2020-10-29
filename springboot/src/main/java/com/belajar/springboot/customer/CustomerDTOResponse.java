package com.belajar.springboot.customer;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTOResponse {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static CustomerDTOResponse parse(Customer customer) {
        return CustomerDTOResponse.builder().id(customer.getId()).name(customer.getName())
                .createdAt(customer.getCreatedAt()).updatedAt(customer.getUpdatedAt()).build();
    }
}
