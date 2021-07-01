<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="dxa" uri="http://www.sdl.com/tridion-dxa" %>
<%@ taglib prefix="xpm" uri="http://www.sdl.com/tridion-xpm" %>

<jsp:useBean id="entity" type="com.sdl.dxa.modules.rigol.model.entity.ProductsCategory" scope="request"/>
<jsp:useBean id="markup" type="com.sdl.webapp.common.markup.Markup" scope="request"/>
<jsp:useBean id="screenWidth" type="com.sdl.webapp.common.api.ScreenWidth" scope="request"/>

<ProductsCategory class="rich-text ${entity.htmlClasses}" ${markup.entity(entity)}>


    大标题：${entity.headline}
    <br>
    小标题：${entity.title}
    <br>
    <c:forEach var="para" items="${entity.productCategory}" varStatus="status">
       图片: ${para.image}
        文字：${para.imageText}
        链接地址：${para.link.url}
        <br>
        =================================================================
        <br>
    </c:forEach>

</ProductsCategory>
