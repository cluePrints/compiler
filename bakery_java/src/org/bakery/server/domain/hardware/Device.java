package org.bakery.server.domain.hardware;

import java.util.Set;

import org.bakery.server.domain.BusinessEntity;
import org.bakery.server.domain.NamedEntity;
import org.bakery.server.validation.CouldNotBeEmpty;
/**
 * Represents concrete device, with it's concrete parameters 
 * 
 * @author Ivan_Sobolev1
 *
 */
public class Device extends BusinessEntity implements NamedEntity {
	private static final long serialVersionUID=1L;
	private String name;
	private String description;
	
	private Set<DeviceParameter> parameters;
	
	@CouldNotBeEmpty(message="�������� ���������� �� ����� ���� ������")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<DeviceParameter> getParameters() {
		return parameters;
	}

	public void setParameters(Set<DeviceParameter> parameters) {
		this.parameters = parameters;
	}	
	public String toString(){
		return name;
	}
}
