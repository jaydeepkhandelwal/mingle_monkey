package com.jarvis.mm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jarvis.mm.config.DbConfig;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.dropwizard.Configuration;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * Created by jafar.rizvi on 10/09/16.
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuinkConfiguration extends Configuration {

    @NotNull
    @Valid
    @Getter
    @Setter
    private DbConfig dbConfig;
}
