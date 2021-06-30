package com.sdl.dxa.modules.solutions.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticEntity;
import com.sdl.webapp.common.api.mapping.semantic.annotations.SemanticProperty;
import com.sdl.webapp.common.api.model.entity.AbstractEntityModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

import static com.sdl.webapp.common.api.mapping.semantic.config.SemanticVocabulary.SCHEMA_ORG;

@SemanticEntity(entityName = "BannerList", vocabulary = SCHEMA_ORG, prefix = "s", public_ = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class BannerList extends AbstractEntityModel {

    @JsonProperty("content")
    @SemanticProperty("s:content")
    private List<Banner> content;

}
