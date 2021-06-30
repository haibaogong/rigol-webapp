package com.sdl.dxa.modules.solutions;

import com.sdl.dxa.modules.solutions.model.entity.*;
import com.sdl.webapp.common.api.mapping.views.AbstractModuleInitializer;
import com.sdl.webapp.common.api.mapping.views.ModuleInfo;
import com.sdl.webapp.common.api.mapping.views.RegisteredViewModel;
import com.sdl.webapp.common.api.mapping.views.RegisteredViewModels;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.sdl.dxa.modules.solutions"})
public class SolutionsInitializer {
    public SolutionsInitializer(){
    }

    @RegisteredViewModels({
            @RegisteredViewModel(viewName = "BannerList", modelClass = BannerList.class),
            @RegisteredViewModel(viewName = "BannerPicture", modelClass = BannerPicture.class),
            @RegisteredViewModel(viewName = "SolutionsContentList", modelClass = SolutionsContentList.class),
            @RegisteredViewModel(viewName = "SolutionsIndexContentList", modelClass = SolutionsIndexContentList.class),
            @RegisteredViewModel(viewName = "ErrorPageNotFound", modelClass = ErrorPageNotFound.class)
    })

    @Component
    @ModuleInfo(
            name = "Solutions module",
            areaName = "Solutions",
            description = "Solutions DXA module which contains basic views"
    )
    public static class TrainingModuleInitializer extends AbstractModuleInitializer {
        public TrainingModuleInitializer() {
        }

        protected String getAreaName() {
            return "Solutions";
        }
    }
}
