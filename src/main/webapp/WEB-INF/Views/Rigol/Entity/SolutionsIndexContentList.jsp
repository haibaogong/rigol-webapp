<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="dxa" uri="http://www.sdl.com/tridion-dxa" %>
<%@ taglib prefix="xpm" uri="http://www.sdl.com/tridion-xpm" %>

<jsp:useBean id="entity" type="com.sdl.dxa.modules.rigol.model.entity.SolutionsIndexContentList" scope="request"/>
<jsp:useBean id="markup" type="com.sdl.webapp.common.markup.Markup" scope="request"/>
<jsp:useBean id="screenWidth" type="com.sdl.webapp.common.api.ScreenWidth" scope="request"/>

<SolutionsContent class="rich-text ${entity.htmlClasses}" ${markup.entity(entity)}>
    <c:forEach var="para" items="${entity.content}" varStatus="status">
        ${status.count}
        <h3 class="mo_pro_title">
            <c:if test="${not empty para.headline}">
               <div ${markup.property(para, "headline")}>
                   ${para.headline}
               </div>
           </c:if>
        </h3>
        <c:if test="${not empty para.content}">
             <p ${markup.property(para, "content")} >
                   ${para.content}
             </p>
        </c:if>
        ------------------------------------------<br>
        image forEach
        <br>
        <c:forEach var="image" items="${para.image}" varStatus="imgStatus">
            ${imgStatus.count}
            image:${image.image}
            imageText:${image.imageText}
            link:${image.link.url}<br>
            ${image.link}
        </c:forEach>
    </c:forEach>

</SolutionsContent>
