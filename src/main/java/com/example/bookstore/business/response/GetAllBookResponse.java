package com.example.bookstore.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBookResponse {
    private int Id;
    private String Name;
    private String Descriptions;
}
