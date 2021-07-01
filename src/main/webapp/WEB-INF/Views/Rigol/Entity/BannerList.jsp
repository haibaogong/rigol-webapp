<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="dxa" uri="http://www.sdl.com/tridion-dxa" %>
<%@ taglib prefix="xpm" uri="http://www.sdl.com/tridion-xpm" %>

<jsp:useBean id="entity" type="com.sdl.dxa.modules.rigol.model.entity.BannerList" scope="request"/>
<jsp:useBean id="markup" type="com.sdl.webapp.common.markup.Markup" scope="request"/>
<jsp:useBean id="screenWidth" type="com.sdl.webapp.common.api.ScreenWidth" scope="request"/>

<BannerList class="rich-text ${entity.htmlClasses}" ${markup.entity(entity)}>

    <c:forEach var="para" items="${entity.content}" varStatus="status">
        ${status.count}
        <c:if test="${not empty para.image}">
            <p ${markup.property(para, "image")} >
                    ${para.image}
            </p>
        </c:if>
        <br>
        <c:if test="${not empty para.link}">
            <p ${markup.property(para, "link")} >
                    ${para.link}
            </p>
        </c:if>
    </c:forEach>

</BannerList>
