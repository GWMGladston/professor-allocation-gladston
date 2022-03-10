package com.project.professor.allocation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "alternativa")
public class Alternativa {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String texto;

    @Column(unique = true, nullable = false)
    private Boolean isGabarito;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "questao_id", nullable = false)
    private Long questaoId;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonIgnoreProperties({"questao"})
    @ManyToOne(optional = false)
    @JoinColumn(name = "questao_id", nullable = false, insertable = false, updatable = false)
    private Questao questao;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Boolean getIsGabarito() {
		return isGabarito;
	}

	public void setIsGabarito(Boolean isGabarito) {
		this.isGabarito = isGabarito;
	}

	public Long getQuestaoId() {
		return questaoId;
	}

	public void setQuestaoId(Long questaoId) {
		this.questaoId = questaoId;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

//	@Override
//    public String toString() {
//        return "Professor{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", cpf='" + cpf + '\'' +
//                ", departmentId=" + departmentId +
//                ", department=" + department +
//                '}';
//    }
}
