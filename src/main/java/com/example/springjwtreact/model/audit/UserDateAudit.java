package com.example.springjwtreact.model.audit;

import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@MappedSuperclass
@JsonIgnoreProperties(
        value = {"createdBy", "updatedBy"},
        allowGetters = true
)
@Data
public abstract class UserDateAudit extends DateAudit {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@CreatedBy
    private Long createdBy;

    @LastModifiedBy
    private Long updatedBy;

}
