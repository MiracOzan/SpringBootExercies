package com.example.bookstore.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBooksRequest {
    private String Name;
    private String Descriptions;
}
