package com.example.bookstore.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "Books")
@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity

public class Book {

	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int Id;

	@Column(name = "Name")
	public String Name;

	@Column(name = "Descriptions")
	public String Descriptions;
}
