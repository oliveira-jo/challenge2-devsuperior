package com.devjoliveira.challenge2_devsuperior.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_block")
public class Block {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant momentStar;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant momentEnd;

  public Block() {
  }

  public Block(Integer id, Instant star, Instant end) {
    this.id = id;
    this.momentStar = star;
    this.momentEnd = end;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Instant getMomentStar() {
    return momentStar;
  }

  public void setMomentStar(Instant star) {
    this.momentStar = star;
  }

  public Instant getMomentEnd() {
    return momentEnd;
  }

  public void setMomentEnd(Instant end) {
    this.momentEnd = end;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Block other = (Block) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Block [id=" + id + ", star=" + momentStar + ", end=" + momentEnd + "]";
  }

}
