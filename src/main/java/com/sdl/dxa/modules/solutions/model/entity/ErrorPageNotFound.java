package com.sdl.dxa.modules.solutions.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdl.dxa.modules.core.model.entity.Image;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticEntity;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticProperty;
import com.sdl.webapp.common.api.model.entity.AbstractEntityModel;
import com.sdl.webapp.common.api.model.entity.Link;
import lombok.Data;
import lombok.EqualsAndHashCode;

import static com.sdl.webapp.common.api.mapping.semantic.config.SemanticVocabulary.SCHEMA_ORG;

@SemanticEntity(entityName = "ErrorPageNotFound", vocabulary = SCHEMA_ORG, prefix = "s", public_ = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class ErrorPageNotFound extends AbstractEntityModel {
    @JsonProperty("Describe")
    @SemanticProperty("s:describe")
    private String describe;

}
