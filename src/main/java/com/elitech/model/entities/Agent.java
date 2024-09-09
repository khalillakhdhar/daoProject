package com.elitech.model.entities;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Agent extends BaseEntity {
@Column(nullable = false)
@NotBlank
private String nom;
@Column(nullable = false)
@NotBlank
private String prenom;
@Column(nullable = false)
private String adresse;
@Column(nullable = false,unique = true)
@Email
private String email;
@Min(value = 18)
@Max(value = 70)
//@NotNull
private int age;

}
