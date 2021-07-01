package com.sdl.dxa.modules.rigol;

import com.sdl.dxa.modules.rigol.model.entity.*;
import com.sdl.webapp.common.api.mapping.views.AbstractModuleInitializer;
import com.sdl.webapp.common.api.mapping.views.ModuleInfo;
import com.sdl.webapp.common.api.mapping.views.RegisteredViewModel;
import com.sdl.webapp.common.api.mapping.views.RegisteredViewModels;
import com.sdl.webapp.common.api.model.entity.NavigationLinks;
import com.sdl.webapp.common.api.model.page.DefaultPageModel;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.sdl.dxa.modules.rigol"})
public class RigolInitializer {
    public RigolInitializer(){
    }

    @RegisteredViewModels({
            @RegisteredViewModel(viewName = "BannerList", modelClass = BannerList.class),
            @RegisteredViewModel(viewName = "BannerPicture", modelClass = BannerPicture.class),
            @RegisteredViewModel(viewName = "SolutionsContentList", modelClass = SolutionsContentList.class),
            @RegisteredViewModel(viewName = "SolutionsIndexContentList", modelClass = SolutionsIndexContentList.class),
            @RegisteredViewModel(viewName = "ErrorPageNotFound", modelClass = ErrorPageNotFound.class),
            //  core GeneralPage
            @RegisteredViewModel(viewName = "Breadcrumb", modelClass = NavigationLinks.class, controllerName = "Navigation"),
            @RegisteredViewModel(viewName = "LeftNavigation", modelClass = NavigationLinks.class, controllerName = "Navigation"),
            @RegisteredViewModel(viewName = "RigolPage", modelClass = DefaultPageModel.class)
    })

    @Component
    @ModuleInfo(
            name = "Rigol module",
            areaName = "Rigol",
            description = "Rigol DXA module which contains basic views"
    )
    public static class TrainingModuleInitializer extends AbstractModuleInitializer {
        public TrainingModuleInitializer() {
        }

        protected String getAreaName() {
            return "Rigol";
        }
    }
}