/*
 * SVG Import Filter for OpenOffice.org 2.0
 * Copyright (C) 2005  Bernhard Haumacher <haui@haumacher.de>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package haui.office.dom;

import static haui.office.dom.OfficeUtilities.createAutomaticStylesOfficeElement;
import static haui.office.dom.OfficeUtilities.createBodyOfficeElement;
import static haui.office.dom.OfficeUtilities.createDrawingOfficeElement;
import static haui.office.dom.OfficeUtilities.createDrawingPagePropertiesStyleElement;
import static haui.office.dom.OfficeUtilities.createLayerDrawElement;
import static haui.office.dom.OfficeUtilities.createLayerSetDrawElement;
import static haui.office.dom.OfficeUtilities.createMasterPageStyleElement;
import static haui.office.dom.OfficeUtilities.createMasterStylesOfficeElement;
import static haui.office.dom.OfficeUtilities.createOfficeDocument;
import static haui.office.dom.OfficeUtilities.createPageDrawElement;
import static haui.office.dom.OfficeUtilities.createPageLayoutPropertiesStyleElement;
import static haui.office.dom.OfficeUtilities.createPageLayoutStyleElement;
import static haui.office.dom.OfficeUtilities.createParagraphPropertiesStyleElement;
import static haui.office.dom.OfficeUtilities.createStyleStyleElement;
import static haui.office.dom.OfficeUtilities.createStylesOfficeElement;
import static haui.office.dom.OfficeUtilities.setBackgroundSizeDrawAttribute;
import static haui.office.dom.OfficeUtilities.setDisplayNameDrawAttribute;
import static haui.office.dom.OfficeUtilities.setFamilyStyleAttribute;
import static haui.office.dom.OfficeUtilities.setFillColorDrawAttribute;
import static haui.office.dom.OfficeUtilities.setFillDrawAttribute;
import static haui.office.dom.OfficeUtilities.setMarginBottomFoAttribute;
import static haui.office.dom.OfficeUtilities.setMarginLeftFoAttribute;
import static haui.office.dom.OfficeUtilities.setMarginRightFoAttribute;
import static haui.office.dom.OfficeUtilities.setMarginTopFoAttribute;
import static haui.office.dom.OfficeUtilities.setMasterPageNameDrawAttribute;
import static haui.office.dom.OfficeUtilities.setNameDrawAttribute;
import static haui.office.dom.OfficeUtilities.setNameStyleAttribute;
import static haui.office.dom.OfficeUtilities.setPageLayoutNameStyleAttribute;
import static haui.office.dom.OfficeUtilities.setPrintOrientationStyleAttribute;
import static haui.office.dom.OfficeUtilities.setStrokeDrawAttribute;
import static haui.office.dom.OfficeUtilities.setStyleNameDrawAttribute;
import static haui.office.dom.OfficeUtilities.setStyleNameTextAttribute;
import static haui.office.dom.OfficeUtilities.setTextAlignFoAttribute;
import static haui.office.dom.OfficeUtilities.setUnitDrawAttribute;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class OOoDocumentBuilder {
	/**
	 * The document builder from the underlying DOM implementation.
	 */
	private DocumentBuilder builder;
	
	private Document oodoc;

	private Element officeDocument;

	private Element officeStyles;

	private Element automaticStyles;

	private String rootGraphicStyleName;

	private Element pageLayout;

	private Element pageLayoutProperties;

	private Element body;

	private int nextStyleNr = 1;
	private int nextGradientNr = 1;

	public OOoDocumentBuilder() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			throw new AssertionError(e);
		}
	}
	
	public void initDocument() {
		oodoc = createOfficeDocument(builder);
		officeDocument = oodoc.getDocumentElement();
		{
			officeStyles = createStylesOfficeElement(oodoc);
			officeDocument.appendChild(officeStyles);
			{
				// Gradient elements are added to this element during the
				// transformation.
			}

			// <office:automatic-styles>
			{
				automaticStyles = createAutomaticStylesOfficeElement(oodoc);
				officeDocument.appendChild(automaticStyles);

				// <style:page-layout style:name="PM0">
				{
					pageLayout = createPageLayoutStyleElement(oodoc);
					automaticStyles.appendChild(pageLayout);

					setNameStyleAttribute(pageLayout, "PM1");

					// <style:page-layout-properties
					// fo:margin-top="0cm"
					// fo:margin-bottom="0cm"
					// fo:margin-left="0cm"
					// fo:margin-right="0cm"
					// fo:page-width="{$page-width}cm"
					// fo:page-height="{$page-height}cm"
					// style:print-orientation="portrait"/>
					{
						pageLayoutProperties = createPageLayoutPropertiesStyleElement(oodoc);
						pageLayout.appendChild(pageLayoutProperties);

						setMarginTopFoAttribute(pageLayoutProperties, "0cm");
						setMarginBottomFoAttribute(pageLayoutProperties, "0cm");
						setMarginLeftFoAttribute(pageLayoutProperties, "0cm");
						setMarginRightFoAttribute(pageLayoutProperties, "0cm");
						setPrintOrientationStyleAttribute(pageLayoutProperties,
								"portrait");

						setPrintOrientationStyleAttribute(pageLayoutProperties,
								"portrait");
					}
				}

				// <style:style style:name="DP1" style:family="drawing-page">
				{
					Element style = createStyleStyleElement(oodoc);
					automaticStyles.appendChild(style);

					setNameStyleAttribute(style, "DP1");
					setFamilyStyleAttribute(style, "drawing-page");

					// <style:drawing-page-properties
					// draw:background-size="border"
					// draw:fill="none"/>
					{
						Element properties = createDrawingPagePropertiesStyleElement(oodoc);
						style.appendChild(properties);

						setBackgroundSizeDrawAttribute(properties, "border");
						setFillDrawAttribute(properties, "none");
					}
				}

				// <style:style style:name="PG1" style:family="paragraph">
				{
					Element style = createStyleStyleElement(oodoc);
					automaticStyles.appendChild(style);

					setNameStyleAttribute(style, "PG1");
					setFamilyStyleAttribute(style, "paragraph");

					// <style:paragraph-properties
					// fo:text-align="center"/>
					{
						Element properties = createParagraphPropertiesStyleElement(oodoc);
						style.appendChild(properties);

						setTextAlignFoAttribute(properties, "center");
					}
				}

				// <style:style style:name="GR1" style:family="graphic">
				{
					Element style = createStyleStyleElement(oodoc);
					automaticStyles.appendChild(style);

					rootGraphicStyleName = createNewStyleName();
					setNameStyleAttribute(style, rootGraphicStyleName);
					setFamilyStyleAttribute(style, "graphic");

					// <style:graphic-properties
					// draw:unit="cm"
					// draw:stroke="none"
					// draw:fill-color="#000000"/>
					{
						Element properties = OfficeUtilities.createGraphicPropertiesStyleElement(oodoc);
						style.appendChild(properties);

						setUnitDrawAttribute(properties, "cm");
						setStrokeDrawAttribute(properties, "none");
						setFillColorDrawAttribute(properties, "#000000");
					}
				}
			}

			// <office:master-styles>
			{
				Element masterStyles = createMasterStylesOfficeElement(oodoc);
				officeDocument.appendChild(masterStyles);

				// <draw:layer-set>
				// <draw:layer draw:name="layout"/>
				// <draw:layer draw:name="background"/>
				// <draw:layer draw:name="backgroundobjects"/>
				// <draw:layer draw:name="controls"/>
				// <draw:layer draw:name="measurelines"/>
				// </draw:layer-set>
				{
					Element layerSet = createLayerSetDrawElement(oodoc);
					masterStyles.appendChild(layerSet);

					{
						Element layer = createLayerDrawElement(oodoc);
						layerSet.appendChild(layer);

						setNameDrawAttribute(layer, "layout");
					}

					{
						Element layer = createLayerDrawElement(oodoc);
						layerSet.appendChild(layer);

						setNameDrawAttribute(layer, "background");
					}

					{
						Element layer = createLayerDrawElement(oodoc);
						layerSet.appendChild(layer);

						setNameDrawAttribute(layer, "backgroundobjects");
					}

					{
						Element layer = createLayerDrawElement(oodoc);
						layerSet.appendChild(layer);

						setNameDrawAttribute(layer, "controls");
					}

					{
						Element layer = createLayerDrawElement(oodoc);
						layerSet.appendChild(layer);

						setNameDrawAttribute(layer, "measurelines");
					}
				}

				// <style:master-page
				// style:name="Default"
				// style:page-layout-name="PM1"
				// draw:style-name="DP1"/>
				{
					Element masterPage = createMasterPageStyleElement(oodoc);
					masterStyles.appendChild(masterPage);

					setNameStyleAttribute(masterPage, "Default");
					setPageLayoutNameStyleAttribute(masterPage, "PM1");
					setStyleNameDrawAttribute(masterPage, "DP1");
				}
			}

			// <office:body>
			// <office:drawing>
			// <draw:page
			// draw:name="page1"
			// draw:style-name="DP1"
			// draw:master-page-name="Default">
			// ...
			// </draw:page>
			// </office:drawing>
			// </office:body>
			body = createBodyOfficeElement(oodoc);
			officeDocument.appendChild(body);
		}

	}

	public Element createDrawing() {
		Element drawing = createDrawingOfficeElement(oodoc);
		body.appendChild(drawing);
		
		return drawing;
	}

	public Element createPage(Element drawing) {
		Element page = createPageDrawElement(oodoc);
		drawing.appendChild(page);
		
		setNameDrawAttribute(page, "page1");
		setStyleNameDrawAttribute(page, "DP1");
		setMasterPageNameDrawAttribute(page, "Default");
		
		return page;
	}

	public Element createGDrawElement(Element parent) {
		Element g = OfficeUtilities.createGDrawElement(oodoc);
		parent.appendChild(g);
		return g;
	}

	public Element createLineDrawElement(Element parent) {
		Element line;
		line = OfficeUtilities.createLineDrawElement(oodoc);
		parent.appendChild(line);
		return line;
	}

	public Element createRectDrawElement(Element parent) {
		Element rect;
		rect = OfficeUtilities.createRectDrawElement(oodoc);
		parent.appendChild(rect);
		return rect;
	}

	public Element createImageDrawElement(Element parent) {
		Element image;
		image = OfficeUtilities.createImageDrawElement(oodoc);
		parent.appendChild(image);
		return image;
	}

	public Element createBinaryDataOfficeElement(Element parent) {
		Element binary;
		binary = OfficeUtilities.createBinaryDataOfficeElement(oodoc);
		parent.appendChild(binary);
		return binary;
	}

	public Element createEllipseDrawElement(Element parent) {
		Element circle;
		circle = OfficeUtilities.createEllipseDrawElement(oodoc);
		parent.appendChild(circle);
		return circle;
	}

	public Element createCircleDrawElement(Element parent) {
		Element circle;
		circle = OfficeUtilities.createCircleDrawElement(oodoc);
		parent.appendChild(circle);
		return circle;
	}

	public Element createPolygonDrawElement(Element parent) {
		Element polygon;
		polygon = OfficeUtilities.createPolygonDrawElement(oodoc);
		parent.appendChild(polygon);
		return polygon;
	}

	public Element createPolylineDrawElement(Element parent) {
		Element polyline;
		polyline = OfficeUtilities.createPolylineDrawElement(oodoc);
		parent.appendChild(polyline);
		return polyline;
	}

	public Element createPathDrawElement(Element parent) {
		Element path;
		path = OfficeUtilities.createPathDrawElement(oodoc);
		parent.appendChild(path);
		return path;
	}

	public Element createPTextElement(Element textbox) {
		Element p;
		p = OfficeUtilities.createPTextElement(oodoc);
		textbox.appendChild(p);
		return p;
	}

	public Element createTextBoxDrawElement(Element frame) {
		Element textbox = OfficeUtilities.createTextBoxDrawElement(oodoc);
		frame.appendChild(textbox);
		return textbox;
	}

	public Element createSpanTextElement(Element paragraph) {
		Element textspan = OfficeUtilities.createSpanTextElement(oodoc);
		paragraph.appendChild(textspan);
		return textspan;
	}

	public Element createFrameDrawElement(Element parent) {
		Element frame = OfficeUtilities.createFrameDrawElement(oodoc);
		parent.appendChild(frame);
		return frame;
	}

	public Element createOpacityDrawElement() {
		return OfficeUtilities.createOpacityDrawElement(oodoc);
	}

	public Element createGradientDrawElement() {
		return OfficeUtilities.createGradientDrawElement(oodoc);
	}

	public void createTextNode(Element parent, String textValue) {
		Node textNode = oodoc.createTextNode(textValue);
		parent.appendChild(textNode);
	}

	public Element createGraphicPropertiesStyleElement() {
		Element graphicProperties = OfficeUtilities.createGraphicPropertiesStyleElement(oodoc);
		return graphicProperties;
	}
	
	public Element createTextPropertiesStyleElement() {
		Element textProperties = OfficeUtilities.createTextPropertiesStyleElement(oodoc);
		return textProperties;
	}

	public void createTextStyle(Element officeElem, 
			boolean isParagraph, Element textProperties) {

		// Create new style. TODO: To reduce the number of styles created,
		// check, whether a style already exists that can be used as super-style
		// for this style.
		Element style = createStyleStyleElement(oodoc);
		setFamilyStyleAttribute(style, isParagraph ? "paragraph" : "text");

		String styleName = createNewStyleName();
		setNameStyleAttribute(style, styleName);
		style.appendChild(textProperties);
		automaticStyles.appendChild(style);

		// Link the office element to the newly created style.
		setStyleNameTextAttribute(officeElem, styleName);
	}

	/**
	 * Creates a new graphics style element with a new name, assigns the 
	 * given set of graphics properties to the new style, adds the style 
	 * to the set of automatic styles and assigns the style to the given 
	 * graphics element.
	 * @param officeElem 
	 *    
	 * @param officeElem
	 * @param graphicProperties 
	 * @param graphicProperties
	 * @return
	 */
	public Element createGraphicStyle(Element officeElem, Element graphicProperties) {
		String styleName = createNewStyleName();

		// Create new style.
		//
		// TODO: To reduce the number of styles created, check, whether a style
		// already exists that can be used (e.g as super-style) for this style.
		Element style = createStyleStyleElement(oodoc);
		setFamilyStyleAttribute(style, "graphic");
		setNameStyleAttribute(style, styleName);
		style.appendChild(graphicProperties);
		automaticStyles.appendChild(style);

		// Link the office element to the newly created style.
		setStyleNameDrawAttribute(officeElem, styleName);
		
		return style;
	}

	public void enterGradient(Element gradient) {
		officeStyles.appendChild(gradient);

		String gradientName = createNewGradientName();		
		setNameDrawAttribute(gradient, gradientName);
		setDisplayNameDrawAttribute(gradient, gradientName);
	}

	public Document getOfficeDocument() {
		return oodoc;
	}

	public Element getPageLayoutProperties() {
		return pageLayoutProperties;
	}

	private String createNewStyleName() {
		return "style-" + (nextStyleNr++);
	}

	private String createNewGradientName() {
		return "gradient-" + (nextGradientNr++);
	}
}
