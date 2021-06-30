package com.sdl.dxa.modules.solutions.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdl.dxa.modules.core.model.entity.Image;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticEntity;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticProperty;
import com.sdl.webapp.common.api.model.entity.AbstractEntityModel;
import com.sdl.webapp.common.api.model.entity.Link;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

import static com.sdl.webapp.common.api.mapping.semantic.config.SemanticVocabulary.SCHEMA_ORG;

@SemanticEntity(entityName = "SolutionsIndexContent", vocabulary = SCHEMA_ORG, prefix = "s", public_ = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class SolutionsIndexContent extends AbstractEntityModel {

    @JsonProperty("Headline")
    @SemanticProperty("s:headline")
    private String headline;

    @JsonProperty("Content")
    @SemanticProperty("s:content")
    private String content;

    @JsonProperty("Image")
    @SemanticProperty("s:image")
    private List<SolutionsPicture> image;
}
