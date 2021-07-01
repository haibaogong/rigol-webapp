package com.sdl.dxa.modules.rigol.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdl.dxa.modules.core.model.entity.Image;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticEntity;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticProperty;
import com.sdl.webapp.common.api.model.entity.AbstractEntityModel;
import com.sdl.webapp.common.api.model.entity.Link;
import lombok.Data;
import lombok.EqualsAndHashCode;

import static com.sdl.webapp.common.api.mapping.semantic.config.SemanticVocabulary.SCHEMA_ORG;

@SemanticEntity(entityName = "SolutionsPicture", vocabulary = SCHEMA_ORG, prefix = "s", public_ = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class SolutionsPicture extends AbstractEntityModel {
    @JsonProperty("Image")
    @SemanticProperty("s:image")
    private Image image;

    @JsonProperty("ImageText")
    @SemanticProperty("s:imageText")
    private String imageText;

    @JsonProperty("AlternateText")
    @SemanticProperty("s:alternateText")
    private String alternateText;

    @JsonProperty("Link")
    @SemanticProperty("s:link")
    private Link link;


}
