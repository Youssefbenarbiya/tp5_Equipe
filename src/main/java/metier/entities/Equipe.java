package metier.entities;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "equipe")
public class Equipe implements Serializable{
@Id
@Column (name="ID_EQUIPE")
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long idEquipe;
@Column (name="NOM_EQUIPE")
private String nomEquipe;
private double Rank;
public Equipe() {
super();
}
public Equipe(String nomEquipe, double Rank) {
super();
this.nomEquipe = nomEquipe;
this.Rank = Rank;
}
public Long getIdEquipe() {
return idEquipe;
}
public void setIdEquipe(Long idEquipe) {
this.idEquipe = idEquipe;
}
public String getNomEquipe() {
return nomEquipe;
}
public void setNomEquipe(String nomEquipe) {
this.nomEquipe = nomEquipe;
}
public double getRank() {
return Rank;
}
public void setRank(double Rank) {
this.Rank = Rank;
}
}