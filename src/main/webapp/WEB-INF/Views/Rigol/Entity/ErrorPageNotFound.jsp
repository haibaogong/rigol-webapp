<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="dxa" uri="http://www.sdl.com/tridion-dxa" %>
<%@ taglib prefix="xpm" uri="http://www.sdl.com/tridion-xpm" %>
<%@ taglib prefix="ugc" uri="http://www.sdl.com/delivery/tags/ugc/2.0" %>

<jsp:useBean id="entity" type="com.sdl.dxa.modules.rigol.model.entity.ErrorPageNotFound" scope="request"/>
<jsp:useBean id="markup" type="com.sdl.webapp.common.markup.Markup" scope="request"/>
<jsp:useBean id="screenWidth" type="com.sdl.webapp.common.api.ScreenWidth" scope="request"/>

<ErrorPageNotFound class="rich-text ${entity.htmlClasses}" ${markup.entity(entity)}>
    <h1>  ERROR  PAGE NOT FOUND </h1>
    <H2>404</H2>
    <H3>${entity}</H3>

    <H1>自定义错误页面     可以编辑</H1>

</ErrorPageNotFound>
