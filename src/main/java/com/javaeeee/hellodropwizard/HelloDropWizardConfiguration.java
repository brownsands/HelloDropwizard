package com.javaeeee.hellodropwizard;

import io.dropwizard.Configuration;




import com.fasterxml.jackson.annotation.JsonProperty;
import com.javaeeee.restcontroller.GameApplicationREST;

import org.hibernate.validator.constraints.*;

import java.util.Map;

import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

import org.glassfish.jersey.server.ResourceConfig;

public class HelloDropWizardConfiguration extends Configuration {

	//@JsonProperty
	@NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }


}
