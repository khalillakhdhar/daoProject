package com.elitech.model.entities;

import java.time.LocalDateTime;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Future;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reuinion extends BaseEntity{
@Future
private LocalDateTime date;
private String titre;
private String agence;
private String sujet;
}
