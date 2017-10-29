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

import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class OfficeUtilities implements OfficeConstants {

  public static Document createOfficeDocument(DocumentBuilder builder) {
    Document result = builder.newDocument();
    result.appendChild(createDocumentOfficeElement(result));
    return result;
  }

  public static Document createOfficeDocumentContent(DocumentBuilder builder) {
    Document result = builder.newDocument();
    result.appendChild(createDocumentContentOfficeElement(result));
    return result;
  }

  public static Document createOfficeDocumentMeta(DocumentBuilder builder) {
    Document result = builder.newDocument();
    result.appendChild(createDocumentMetaOfficeElement(result));
    return result;
  }

  public static Document createOfficeDocumentSettings(DocumentBuilder builder) {
    Document result = builder.newDocument();
    result.appendChild(createDocumentSettingsOfficeElement(result));
    return result;
  }

  public static Document createOfficeDocumentStyles(DocumentBuilder builder) {
    Document result = builder.newDocument();
    result.appendChild(createDocumentStylesOfficeElement(result));
    return result;
  }

  public static Element createDocumentOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, DOCUMENT_OFFICE_ELEMENT);
  }

  public static boolean isDocumentOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && DOCUMENT_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDocumentContentOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, DOCUMENT_CONTENT_OFFICE_ELEMENT);
  }

  public static boolean isDocumentContentOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && DOCUMENT_CONTENT_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDocumentStylesOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, DOCUMENT_STYLES_OFFICE_ELEMENT);
  }

  public static boolean isDocumentStylesOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && DOCUMENT_STYLES_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDocumentMetaOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, DOCUMENT_META_OFFICE_ELEMENT);
  }

  public static boolean isDocumentMetaOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && DOCUMENT_META_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDocumentSettingsOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, DOCUMENT_SETTINGS_OFFICE_ELEMENT);
  }

  public static boolean isDocumentSettingsOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && DOCUMENT_SETTINGS_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMetaOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, META_OFFICE_ELEMENT);
  }

  public static boolean isMetaOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && META_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBodyOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, BODY_OFFICE_ELEMENT);
  }

  public static boolean isBodyOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && BODY_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSettingsOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, SETTINGS_OFFICE_ELEMENT);
  }

  public static boolean isSettingsOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && SETTINGS_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConfigItemSetConfigElement(Document document) {
    return document.createElementNS(CONFIG_NS, CONFIG_ITEM_SET_CONFIG_ELEMENT);
  }

  public static boolean isConfigItemSetConfigElement(Element element) {
    return CONFIG_NS.equals(element.getNamespaceURI()) && CONFIG_ITEM_SET_CONFIG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConfigItemConfigElement(Document document) {
    return document.createElementNS(CONFIG_NS, CONFIG_ITEM_CONFIG_ELEMENT);
  }

  public static boolean isConfigItemConfigElement(Element element) {
    return CONFIG_NS.equals(element.getNamespaceURI()) && CONFIG_ITEM_CONFIG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConfigItemMapIndexedConfigElement(Document document) {
    return document.createElementNS(CONFIG_NS, CONFIG_ITEM_MAP_INDEXED_CONFIG_ELEMENT);
  }

  public static boolean isConfigItemMapIndexedConfigElement(Element element) {
    return CONFIG_NS.equals(element.getNamespaceURI()) && CONFIG_ITEM_MAP_INDEXED_CONFIG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConfigItemMapEntryConfigElement(Document document) {
    return document.createElementNS(CONFIG_NS, CONFIG_ITEM_MAP_ENTRY_CONFIG_ELEMENT);
  }

  public static boolean isConfigItemMapEntryConfigElement(Element element) {
    return CONFIG_NS.equals(element.getNamespaceURI()) && CONFIG_ITEM_MAP_ENTRY_CONFIG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConfigItemMapNamedConfigElement(Document document) {
    return document.createElementNS(CONFIG_NS, CONFIG_ITEM_MAP_NAMED_CONFIG_ELEMENT);
  }

  public static boolean isConfigItemMapNamedConfigElement(Element element) {
    return CONFIG_NS.equals(element.getNamespaceURI()) && CONFIG_ITEM_MAP_NAMED_CONFIG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createScriptsOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, SCRIPTS_OFFICE_ELEMENT);
  }

  public static boolean isScriptsOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && SCRIPTS_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createScriptOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, SCRIPT_OFFICE_ELEMENT);
  }

  public static boolean isScriptOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && SCRIPT_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFontFaceDeclsOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, FONT_FACE_DECLS_OFFICE_ELEMENT);
  }

  public static boolean isFontFaceDeclsOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && FONT_FACE_DECLS_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createStylesOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, STYLES_OFFICE_ELEMENT);
  }

  public static boolean isStylesOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && STYLES_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAutomaticStylesOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, AUTOMATIC_STYLES_OFFICE_ELEMENT);
  }

  public static boolean isAutomaticStylesOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && AUTOMATIC_STYLES_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMasterStylesOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, MASTER_STYLES_OFFICE_ELEMENT);
  }

  public static boolean isMasterStylesOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && MASTER_STYLES_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCreatorDcElement(Document document) {
    return document.createElementNS(DC_NS, CREATOR_DC_ELEMENT);
  }

  public static boolean isCreatorDcElement(Element element) {
    return DC_NS.equals(element.getNamespaceURI()) && CREATOR_DC_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDateDcElement(Document document) {
    return document.createElementNS(DC_NS, DATE_DC_ELEMENT);
  }

  public static boolean isDateDcElement(Element element) {
    return DC_NS.equals(element.getNamespaceURI()) && DATE_DC_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHTextElement(Document document) {
    return document.createElementNS(TEXT_NS, H_TEXT_ELEMENT);
  }

  public static boolean isHTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && H_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNumberTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NUMBER_TEXT_ELEMENT);
  }

  public static boolean isNumberTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NUMBER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPTextElement(Document document) {
    return document.createElementNS(TEXT_NS, P_TEXT_ELEMENT);
  }

  public static boolean isPTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && P_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageSequenceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PAGE_SEQUENCE_TEXT_ELEMENT);
  }

  public static boolean isPageSequenceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PAGE_SEQUENCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PAGE_TEXT_ELEMENT);
  }

  public static boolean isPageTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PAGE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LIST_TEXT_ELEMENT);
  }

  public static boolean isListTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LIST_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListItemTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LIST_ITEM_TEXT_ELEMENT);
  }

  public static boolean isListItemTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LIST_ITEM_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListHeaderTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LIST_HEADER_TEXT_ELEMENT);
  }

  public static boolean isListHeaderTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LIST_HEADER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNumberedParagraphTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NUMBERED_PARAGRAPH_TEXT_ELEMENT);
  }

  public static boolean isNumberedParagraphTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NUMBERED_PARAGRAPH_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSectionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SECTION_TEXT_ELEMENT);
  }

  public static boolean isSectionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SECTION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSectionSourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SECTION_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isSectionSourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SECTION_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTrackedChangesTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TRACKED_CHANGES_TEXT_ELEMENT);
  }

  public static boolean isTrackedChangesTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TRACKED_CHANGES_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChangedRegionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CHANGED_REGION_TEXT_ELEMENT);
  }

  public static boolean isChangedRegionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CHANGED_REGION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createVariableDeclTextElement(Document document) {
    return document.createElementNS(TEXT_NS, VARIABLE_DECL_TEXT_ELEMENT);
  }

  public static boolean isVariableDeclTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && VARIABLE_DECL_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserFieldDeclTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_FIELD_DECL_TEXT_ELEMENT);
  }

  public static boolean isUserFieldDeclTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_FIELD_DECL_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSequenceDeclTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SEQUENCE_DECL_TEXT_ELEMENT);
  }

  public static boolean isSequenceDeclTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SEQUENCE_DECL_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexBodyTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_BODY_TEXT_ELEMENT);
  }

  public static boolean isIndexBodyTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_BODY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexTitleTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_TITLE_TEXT_ELEMENT);
  }

  public static boolean isIndexTitleTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_TITLE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableOfContentTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TABLE_OF_CONTENT_TEXT_ELEMENT);
  }

  public static boolean isTableOfContentTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TABLE_OF_CONTENT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableOfContentSourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TABLE_OF_CONTENT_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isTableOfContentSourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TABLE_OF_CONTENT_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableOfContentEntryTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TABLE_OF_CONTENT_ENTRY_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isTableOfContentEntryTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TABLE_OF_CONTENT_ENTRY_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIllustrationIndexTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ILLUSTRATION_INDEX_TEXT_ELEMENT);
  }

  public static boolean isIllustrationIndexTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ILLUSTRATION_INDEX_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIllustrationIndexSourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ILLUSTRATION_INDEX_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isIllustrationIndexSourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ILLUSTRATION_INDEX_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIllustrationIndexEntryTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ILLUSTRATION_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isIllustrationIndexEntryTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ILLUSTRATION_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableIndexTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TABLE_INDEX_TEXT_ELEMENT);
  }

  public static boolean isTableIndexTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TABLE_INDEX_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableIndexSourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TABLE_INDEX_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isTableIndexSourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TABLE_INDEX_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableIndexEntryTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TABLE_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isTableIndexEntryTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TABLE_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createObjectIndexTextElement(Document document) {
    return document.createElementNS(TEXT_NS, OBJECT_INDEX_TEXT_ELEMENT);
  }

  public static boolean isObjectIndexTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && OBJECT_INDEX_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createObjectIndexSourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, OBJECT_INDEX_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isObjectIndexSourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && OBJECT_INDEX_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createObjectIndexEntryTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, OBJECT_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isObjectIndexEntryTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && OBJECT_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserIndexTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_INDEX_TEXT_ELEMENT);
  }

  public static boolean isUserIndexTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_INDEX_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserIndexSourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_INDEX_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isUserIndexSourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_INDEX_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserIndexEntryTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isUserIndexEntryTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAlphabeticalIndexTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ALPHABETICAL_INDEX_TEXT_ELEMENT);
  }

  public static boolean isAlphabeticalIndexTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ALPHABETICAL_INDEX_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAlphabeticalIndexSourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ALPHABETICAL_INDEX_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isAlphabeticalIndexSourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ALPHABETICAL_INDEX_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAlphabeticalIndexAutoMarkFileTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ALPHABETICAL_INDEX_AUTO_MARK_FILE_TEXT_ELEMENT);
  }

  public static boolean isAlphabeticalIndexAutoMarkFileTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ALPHABETICAL_INDEX_AUTO_MARK_FILE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAlphabeticalIndexEntryTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isAlphabeticalIndexEntryTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBibliographyTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BIBLIOGRAPHY_TEXT_ELEMENT);
  }

  public static boolean isBibliographyTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BIBLIOGRAPHY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBibliographySourceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BIBLIOGRAPHY_SOURCE_TEXT_ELEMENT);
  }

  public static boolean isBibliographySourceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BIBLIOGRAPHY_SOURCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBibliographyEntryTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BIBLIOGRAPHY_ENTRY_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isBibliographyEntryTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BIBLIOGRAPHY_ENTRY_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexSourceStylesTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_SOURCE_STYLES_TEXT_ELEMENT);
  }

  public static boolean isIndexSourceStylesTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_SOURCE_STYLES_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexSourceStyleTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_SOURCE_STYLE_TEXT_ELEMENT);
  }

  public static boolean isIndexSourceStyleTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_SOURCE_STYLE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexTitleTemplateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_TITLE_TEMPLATE_TEXT_ELEMENT);
  }

  public static boolean isIndexTitleTemplateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_TITLE_TEMPLATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntryChapterTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_CHAPTER_TEXT_ELEMENT);
  }

  public static boolean isIndexEntryChapterTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_CHAPTER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntryTextTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_TEXT_TEXT_ELEMENT);
  }

  public static boolean isIndexEntryTextTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_TEXT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntryPageNumberTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_PAGE_NUMBER_TEXT_ELEMENT);
  }

  public static boolean isIndexEntryPageNumberTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_PAGE_NUMBER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntrySpanTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_SPAN_TEXT_ELEMENT);
  }

  public static boolean isIndexEntrySpanTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_SPAN_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntryBibliographyTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_BIBLIOGRAPHY_TEXT_ELEMENT);
  }

  public static boolean isIndexEntryBibliographyTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_BIBLIOGRAPHY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntryTabStopTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_TAB_STOP_TEXT_ELEMENT);
  }

  public static boolean isIndexEntryTabStopTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_TAB_STOP_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntryLinkStartTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_LINK_START_TEXT_ELEMENT);
  }

  public static boolean isIndexEntryLinkStartTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_LINK_START_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIndexEntryLinkEndTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INDEX_ENTRY_LINK_END_TEXT_ELEMENT);
  }

  public static boolean isIndexEntryLinkEndTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INDEX_ENTRY_LINK_END_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_TABLE_ELEMENT);
  }

  public static boolean isTableTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableRowTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_ROW_TABLE_ELEMENT);
  }

  public static boolean isTableRowTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_ROW_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableCellTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_CELL_TABLE_ELEMENT);
  }

  public static boolean isTableCellTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_CELL_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCoveredTableCellTableElement(Document document) {
    return document.createElementNS(TABLE_NS, COVERED_TABLE_CELL_TABLE_ELEMENT);
  }

  public static boolean isCoveredTableCellTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && COVERED_TABLE_CELL_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableColumnTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_COLUMN_TABLE_ELEMENT);
  }

  public static boolean isTableColumnTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_COLUMN_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableHeaderColumnsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_HEADER_COLUMNS_TABLE_ELEMENT);
  }

  public static boolean isTableHeaderColumnsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_HEADER_COLUMNS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableColumnsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_COLUMNS_TABLE_ELEMENT);
  }

  public static boolean isTableColumnsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_COLUMNS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableColumnGroupTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_COLUMN_GROUP_TABLE_ELEMENT);
  }

  public static boolean isTableColumnGroupTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_COLUMN_GROUP_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableHeaderRowsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_HEADER_ROWS_TABLE_ELEMENT);
  }

  public static boolean isTableHeaderRowsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_HEADER_ROWS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableRowsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_ROWS_TABLE_ELEMENT);
  }

  public static boolean isTableRowsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_ROWS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableRowGroupTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_ROW_GROUP_TABLE_ELEMENT);
  }

  public static boolean isTableRowGroupTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_ROW_GROUP_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableSourceTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_SOURCE_TABLE_ELEMENT);
  }

  public static boolean isTableSourceTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_SOURCE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createScenarioTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SCENARIO_TABLE_ELEMENT);
  }

  public static boolean isScenarioTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SCENARIO_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createShapesTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SHAPES_TABLE_ELEMENT);
  }

  public static boolean isShapesTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SHAPES_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCellRangeSourceTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CELL_RANGE_SOURCE_TABLE_ELEMENT);
  }

  public static boolean isCellRangeSourceTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CELL_RANGE_SOURCE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDetectiveTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DETECTIVE_TABLE_ELEMENT);
  }

  public static boolean isDetectiveTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DETECTIVE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createOperationTableElement(Document document) {
    return document.createElementNS(TABLE_NS, OPERATION_TABLE_ELEMENT);
  }

  public static boolean isOperationTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && OPERATION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHighlightedRangeTableElement(Document document) {
    return document.createElementNS(TABLE_NS, HIGHLIGHTED_RANGE_TABLE_ELEMENT);
  }

  public static boolean isHighlightedRangeTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && HIGHLIGHTED_RANGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCalculationSettingsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CALCULATION_SETTINGS_TABLE_ELEMENT);
  }

  public static boolean isCalculationSettingsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CALCULATION_SETTINGS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNullDateTableElement(Document document) {
    return document.createElementNS(TABLE_NS, NULL_DATE_TABLE_ELEMENT);
  }

  public static boolean isNullDateTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && NULL_DATE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIterationTableElement(Document document) {
    return document.createElementNS(TABLE_NS, ITERATION_TABLE_ELEMENT);
  }

  public static boolean isIterationTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && ITERATION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createContentValidationsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CONTENT_VALIDATIONS_TABLE_ELEMENT);
  }

  public static boolean isContentValidationsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CONTENT_VALIDATIONS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createContentValidationTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CONTENT_VALIDATION_TABLE_ELEMENT);
  }

  public static boolean isContentValidationTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CONTENT_VALIDATION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHelpMessageTableElement(Document document) {
    return document.createElementNS(TABLE_NS, HELP_MESSAGE_TABLE_ELEMENT);
  }

  public static boolean isHelpMessageTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && HELP_MESSAGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createErrorMessageTableElement(Document document) {
    return document.createElementNS(TABLE_NS, ERROR_MESSAGE_TABLE_ELEMENT);
  }

  public static boolean isErrorMessageTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && ERROR_MESSAGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createErrorMacroTableElement(Document document) {
    return document.createElementNS(TABLE_NS, ERROR_MACRO_TABLE_ELEMENT);
  }

  public static boolean isErrorMacroTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && ERROR_MACRO_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLabelRangesTableElement(Document document) {
    return document.createElementNS(TABLE_NS, LABEL_RANGES_TABLE_ELEMENT);
  }

  public static boolean isLabelRangesTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && LABEL_RANGES_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLabelRangeTableElement(Document document) {
    return document.createElementNS(TABLE_NS, LABEL_RANGE_TABLE_ELEMENT);
  }

  public static boolean isLabelRangeTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && LABEL_RANGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNamedExpressionsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, NAMED_EXPRESSIONS_TABLE_ELEMENT);
  }

  public static boolean isNamedExpressionsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && NAMED_EXPRESSIONS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNamedRangeTableElement(Document document) {
    return document.createElementNS(TABLE_NS, NAMED_RANGE_TABLE_ELEMENT);
  }

  public static boolean isNamedRangeTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && NAMED_RANGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNamedExpressionTableElement(Document document) {
    return document.createElementNS(TABLE_NS, NAMED_EXPRESSION_TABLE_ELEMENT);
  }

  public static boolean isNamedExpressionTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && NAMED_EXPRESSION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseRangesTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATABASE_RANGES_TABLE_ELEMENT);
  }

  public static boolean isDatabaseRangesTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATABASE_RANGES_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseRangeTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATABASE_RANGE_TABLE_ELEMENT);
  }

  public static boolean isDatabaseRangeTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATABASE_RANGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseSourceSqlTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATABASE_SOURCE_SQL_TABLE_ELEMENT);
  }

  public static boolean isDatabaseSourceSqlTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATABASE_SOURCE_SQL_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseSourceTableTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATABASE_SOURCE_TABLE_TABLE_ELEMENT);
  }

  public static boolean isDatabaseSourceTableTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATABASE_SOURCE_TABLE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseSourceQueryTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATABASE_SOURCE_QUERY_TABLE_ELEMENT);
  }

  public static boolean isDatabaseSourceQueryTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATABASE_SOURCE_QUERY_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSortTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SORT_TABLE_ELEMENT);
  }

  public static boolean isSortTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SORT_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSortByTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SORT_BY_TABLE_ELEMENT);
  }

  public static boolean isSortByTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SORT_BY_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSubtotalRulesTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SUBTOTAL_RULES_TABLE_ELEMENT);
  }

  public static boolean isSubtotalRulesTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SUBTOTAL_RULES_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSortGroupsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SORT_GROUPS_TABLE_ELEMENT);
  }

  public static boolean isSortGroupsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SORT_GROUPS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSubtotalRuleTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SUBTOTAL_RULE_TABLE_ELEMENT);
  }

  public static boolean isSubtotalRuleTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SUBTOTAL_RULE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSubtotalFieldTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SUBTOTAL_FIELD_TABLE_ELEMENT);
  }

  public static boolean isSubtotalFieldTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SUBTOTAL_FIELD_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFilterTableElement(Document document) {
    return document.createElementNS(TABLE_NS, FILTER_TABLE_ELEMENT);
  }

  public static boolean isFilterTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && FILTER_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFilterAndTableElement(Document document) {
    return document.createElementNS(TABLE_NS, FILTER_AND_TABLE_ELEMENT);
  }

  public static boolean isFilterAndTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && FILTER_AND_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFilterOrTableElement(Document document) {
    return document.createElementNS(TABLE_NS, FILTER_OR_TABLE_ELEMENT);
  }

  public static boolean isFilterOrTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && FILTER_OR_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFilterConditionTableElement(Document document) {
    return document.createElementNS(TABLE_NS, FILTER_CONDITION_TABLE_ELEMENT);
  }

  public static boolean isFilterConditionTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && FILTER_CONDITION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotTablesTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_TABLES_TABLE_ELEMENT);
  }

  public static boolean isDataPilotTablesTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_TABLES_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotTableTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_TABLE_TABLE_ELEMENT);
  }

  public static boolean isDataPilotTableTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_TABLE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSourceCellRangeTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SOURCE_CELL_RANGE_TABLE_ELEMENT);
  }

  public static boolean isSourceCellRangeTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SOURCE_CELL_RANGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSourceServiceTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SOURCE_SERVICE_TABLE_ELEMENT);
  }

  public static boolean isSourceServiceTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SOURCE_SERVICE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotFieldTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_FIELD_TABLE_ELEMENT);
  }

  public static boolean isDataPilotFieldTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_FIELD_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotLevelTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_LEVEL_TABLE_ELEMENT);
  }

  public static boolean isDataPilotLevelTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_LEVEL_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotSubtotalsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_SUBTOTALS_TABLE_ELEMENT);
  }

  public static boolean isDataPilotSubtotalsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_SUBTOTALS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotSubtotalTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_SUBTOTAL_TABLE_ELEMENT);
  }

  public static boolean isDataPilotSubtotalTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_SUBTOTAL_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotMembersTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_MEMBERS_TABLE_ELEMENT);
  }

  public static boolean isDataPilotMembersTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_MEMBERS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotMemberTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_MEMBER_TABLE_ELEMENT);
  }

  public static boolean isDataPilotMemberTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_MEMBER_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotDisplayInfoTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_DISPLAY_INFO_TABLE_ELEMENT);
  }

  public static boolean isDataPilotDisplayInfoTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_DISPLAY_INFO_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotSortInfoTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_SORT_INFO_TABLE_ELEMENT);
  }

  public static boolean isDataPilotSortInfoTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_SORT_INFO_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotLayoutInfoTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_LAYOUT_INFO_TABLE_ELEMENT);
  }

  public static boolean isDataPilotLayoutInfoTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_LAYOUT_INFO_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotFieldReferenceTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_FIELD_REFERENCE_TABLE_ELEMENT);
  }

  public static boolean isDataPilotFieldReferenceTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_FIELD_REFERENCE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotGroupsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_GROUPS_TABLE_ELEMENT);
  }

  public static boolean isDataPilotGroupsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_GROUPS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotGroupTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_GROUP_TABLE_ELEMENT);
  }

  public static boolean isDataPilotGroupTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_GROUP_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPilotGroupMemberTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DATA_PILOT_GROUP_MEMBER_TABLE_ELEMENT);
  }

  public static boolean isDataPilotGroupMemberTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DATA_PILOT_GROUP_MEMBER_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConsolidationTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CONSOLIDATION_TABLE_ELEMENT);
  }

  public static boolean isConsolidationTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CONSOLIDATION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDdeLinksTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DDE_LINKS_TABLE_ELEMENT);
  }

  public static boolean isDdeLinksTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DDE_LINKS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTrackedChangesTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TRACKED_CHANGES_TABLE_ELEMENT);
  }

  public static boolean isTrackedChangesTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TRACKED_CHANGES_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createInsertionTableElement(Document document) {
    return document.createElementNS(TABLE_NS, INSERTION_TABLE_ELEMENT);
  }

  public static boolean isInsertionTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && INSERTION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDependenciesTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DEPENDENCIES_TABLE_ELEMENT);
  }

  public static boolean isDependenciesTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DEPENDENCIES_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDependencyTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DEPENDENCY_TABLE_ELEMENT);
  }

  public static boolean isDependencyTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DEPENDENCY_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDeletionsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DELETIONS_TABLE_ELEMENT);
  }

  public static boolean isDeletionsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DELETIONS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCellContentDeletionTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CELL_CONTENT_DELETION_TABLE_ELEMENT);
  }

  public static boolean isCellContentDeletionTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CELL_CONTENT_DELETION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChangeDeletionTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CHANGE_DELETION_TABLE_ELEMENT);
  }

  public static boolean isChangeDeletionTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CHANGE_DELETION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDeletionTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DELETION_TABLE_ELEMENT);
  }

  public static boolean isDeletionTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DELETION_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCutOffsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CUT_OFFS_TABLE_ELEMENT);
  }

  public static boolean isCutOffsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CUT_OFFS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createInsertionCutOffTableElement(Document document) {
    return document.createElementNS(TABLE_NS, INSERTION_CUT_OFF_TABLE_ELEMENT);
  }

  public static boolean isInsertionCutOffTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && INSERTION_CUT_OFF_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMovementCutOffTableElement(Document document) {
    return document.createElementNS(TABLE_NS, MOVEMENT_CUT_OFF_TABLE_ELEMENT);
  }

  public static boolean isMovementCutOffTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && MOVEMENT_CUT_OFF_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMovementTableElement(Document document) {
    return document.createElementNS(TABLE_NS, MOVEMENT_TABLE_ELEMENT);
  }

  public static boolean isMovementTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && MOVEMENT_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSourceRangeAddressTableElement(Document document) {
    return document.createElementNS(TABLE_NS, SOURCE_RANGE_ADDRESS_TABLE_ELEMENT);
  }

  public static boolean isSourceRangeAddressTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && SOURCE_RANGE_ADDRESS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTargetRangeAddressTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TARGET_RANGE_ADDRESS_TABLE_ELEMENT);
  }

  public static boolean isTargetRangeAddressTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TARGET_RANGE_ADDRESS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChangeTrackTableCellTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CHANGE_TRACK_TABLE_CELL_TABLE_ELEMENT);
  }

  public static boolean isChangeTrackTableCellTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CHANGE_TRACK_TABLE_CELL_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCellContentChangeTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CELL_CONTENT_CHANGE_TABLE_ELEMENT);
  }

  public static boolean isCellContentChangeTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CELL_CONTENT_CHANGE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCellAddressTableElement(Document document) {
    return document.createElementNS(TABLE_NS, CELL_ADDRESS_TABLE_ELEMENT);
  }

  public static boolean isCellAddressTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && CELL_ADDRESS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPreviousTableElement(Document document) {
    return document.createElementNS(TABLE_NS, PREVIOUS_TABLE_ELEMENT);
  }

  public static boolean isPreviousTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && PREVIOUS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHandoutMasterStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, HANDOUT_MASTER_STYLE_ELEMENT);
  }

  public static boolean isHandoutMasterStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && HANDOUT_MASTER_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLayerSetDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, LAYER_SET_DRAW_ELEMENT);
  }

  public static boolean isLayerSetDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && LAYER_SET_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLayerDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, LAYER_DRAW_ELEMENT);
  }

  public static boolean isLayerDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && LAYER_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, PAGE_DRAW_ELEMENT);
  }

  public static boolean isPageDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && PAGE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRectDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, RECT_DRAW_ELEMENT);
  }

  public static boolean isRectDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && RECT_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLineDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, LINE_DRAW_ELEMENT);
  }

  public static boolean isLineDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && LINE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPolylineDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, POLYLINE_DRAW_ELEMENT);
  }

  public static boolean isPolylineDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && POLYLINE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPolygonDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, POLYGON_DRAW_ELEMENT);
  }

  public static boolean isPolygonDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && POLYGON_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRegularPolygonDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, REGULAR_POLYGON_DRAW_ELEMENT);
  }

  public static boolean isRegularPolygonDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && REGULAR_POLYGON_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPathDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, PATH_DRAW_ELEMENT);
  }

  public static boolean isPathDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && PATH_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCircleDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, CIRCLE_DRAW_ELEMENT);
  }

  public static boolean isCircleDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && CIRCLE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEllipseDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, ELLIPSE_DRAW_ELEMENT);
  }

  public static boolean isEllipseDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && ELLIPSE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConnectorDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, CONNECTOR_DRAW_ELEMENT);
  }

  public static boolean isConnectorDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && CONNECTOR_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCaptionDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, CAPTION_DRAW_ELEMENT);
  }

  public static boolean isCaptionDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && CAPTION_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMeasureDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, MEASURE_DRAW_ELEMENT);
  }

  public static boolean isMeasureDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && MEASURE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createControlDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, CONTROL_DRAW_ELEMENT);
  }

  public static boolean isControlDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && CONTROL_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageThumbnailDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, PAGE_THUMBNAIL_DRAW_ELEMENT);
  }

  public static boolean isPageThumbnailDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && PAGE_THUMBNAIL_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, G_DRAW_ELEMENT);
  }

  public static boolean isGDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && G_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGluePointDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, GLUE_POINT_DRAW_ELEMENT);
  }

  public static boolean isGluePointDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && GLUE_POINT_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFrameDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, FRAME_DRAW_ELEMENT);
  }

  public static boolean isFrameDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && FRAME_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextBoxDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, TEXT_BOX_DRAW_ELEMENT);
  }

  public static boolean isTextBoxDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && TEXT_BOX_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createImageDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, IMAGE_DRAW_ELEMENT);
  }

  public static boolean isImageDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && IMAGE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBinaryDataOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, BINARY_DATA_OFFICE_ELEMENT);
  }

  public static boolean isBinaryDataOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && BINARY_DATA_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createObjectDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, OBJECT_DRAW_ELEMENT);
  }

  public static boolean isObjectDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && OBJECT_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createObjectOleDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, OBJECT_OLE_DRAW_ELEMENT);
  }

  public static boolean isObjectOleDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && OBJECT_OLE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAppletDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, APPLET_DRAW_ELEMENT);
  }

  public static boolean isAppletDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && APPLET_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPluginDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, PLUGIN_DRAW_ELEMENT);
  }

  public static boolean isPluginDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && PLUGIN_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createParamDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, PARAM_DRAW_ELEMENT);
  }

  public static boolean isParamDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && PARAM_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFloatingFrameDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, FLOATING_FRAME_DRAW_ELEMENT);
  }

  public static boolean isFloatingFrameDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && FLOATING_FRAME_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createContourPolygonDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, CONTOUR_POLYGON_DRAW_ELEMENT);
  }

  public static boolean isContourPolygonDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && CONTOUR_POLYGON_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createContourPathDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, CONTOUR_PATH_DRAW_ELEMENT);
  }

  public static boolean isContourPathDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && CONTOUR_PATH_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDescSvgElement(Document document) {
    return document.createElementNS(SVG_NS, DESC_SVG_ELEMENT);
  }

  public static boolean isDescSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && DESC_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createADrawElement(Document document) {
    return document.createElementNS(DRAW_NS, A_DRAW_ELEMENT);
  }

  public static boolean isADrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && A_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createImageMapDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, IMAGE_MAP_DRAW_ELEMENT);
  }

  public static boolean isImageMapDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && IMAGE_MAP_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAreaRectangleDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, AREA_RECTANGLE_DRAW_ELEMENT);
  }

  public static boolean isAreaRectangleDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && AREA_RECTANGLE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAreaCircleDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, AREA_CIRCLE_DRAW_ELEMENT);
  }

  public static boolean isAreaCircleDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && AREA_CIRCLE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAreaPolygonDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, AREA_POLYGON_DRAW_ELEMENT);
  }

  public static boolean isAreaPolygonDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && AREA_POLYGON_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSceneDr3dElement(Document document) {
    return document.createElementNS(DR3D_NS, SCENE_DR3D_ELEMENT);
  }

  public static boolean isSceneDr3dElement(Element element) {
    return DR3D_NS.equals(element.getNamespaceURI()) && SCENE_DR3D_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLightDr3dElement(Document document) {
    return document.createElementNS(DR3D_NS, LIGHT_DR3D_ELEMENT);
  }

  public static boolean isLightDr3dElement(Element element) {
    return DR3D_NS.equals(element.getNamespaceURI()) && LIGHT_DR3D_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCubeDr3dElement(Document document) {
    return document.createElementNS(DR3D_NS, CUBE_DR3D_ELEMENT);
  }

  public static boolean isCubeDr3dElement(Element element) {
    return DR3D_NS.equals(element.getNamespaceURI()) && CUBE_DR3D_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSphereDr3dElement(Document document) {
    return document.createElementNS(DR3D_NS, SPHERE_DR3D_ELEMENT);
  }

  public static boolean isSphereDr3dElement(Element element) {
    return DR3D_NS.equals(element.getNamespaceURI()) && SPHERE_DR3D_ELEMENT.equals(element.getLocalName());
  }

  public static Element createExtrudeDr3dElement(Document document) {
    return document.createElementNS(DR3D_NS, EXTRUDE_DR3D_ELEMENT);
  }

  public static boolean isExtrudeDr3dElement(Element element) {
    return DR3D_NS.equals(element.getNamespaceURI()) && EXTRUDE_DR3D_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRotateDr3dElement(Document document) {
    return document.createElementNS(DR3D_NS, ROTATE_DR3D_ELEMENT);
  }

  public static boolean isRotateDr3dElement(Element element) {
    return DR3D_NS.equals(element.getNamespaceURI()) && ROTATE_DR3D_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCustomShapeDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, CUSTOM_SHAPE_DRAW_ELEMENT);
  }

  public static boolean isCustomShapeDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && CUSTOM_SHAPE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEnhancedGeometryDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, ENHANCED_GEOMETRY_DRAW_ELEMENT);
  }

  public static boolean isEnhancedGeometryDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && ENHANCED_GEOMETRY_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEquationDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, EQUATION_DRAW_ELEMENT);
  }

  public static boolean isEquationDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && EQUATION_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHandleDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, HANDLE_DRAW_ELEMENT);
  }

  public static boolean isHandleDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && HANDLE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAnimationsPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, ANIMATIONS_PRESENTATION_ELEMENT);
  }

  public static boolean isAnimationsPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && ANIMATIONS_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSoundPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, SOUND_PRESENTATION_ELEMENT);
  }

  public static boolean isSoundPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && SOUND_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createShowShapePresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, SHOW_SHAPE_PRESENTATION_ELEMENT);
  }

  public static boolean isShowShapePresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && SHOW_SHAPE_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createShowTextPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, SHOW_TEXT_PRESENTATION_ELEMENT);
  }

  public static boolean isShowTextPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && SHOW_TEXT_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHideShapePresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, HIDE_SHAPE_PRESENTATION_ELEMENT);
  }

  public static boolean isHideShapePresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && HIDE_SHAPE_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHideTextPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, HIDE_TEXT_PRESENTATION_ELEMENT);
  }

  public static boolean isHideTextPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && HIDE_TEXT_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDimPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, DIM_PRESENTATION_ELEMENT);
  }

  public static boolean isDimPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && DIM_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPlayPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, PLAY_PRESENTATION_ELEMENT);
  }

  public static boolean isPlayPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && PLAY_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAnimationGroupPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, ANIMATION_GROUP_PRESENTATION_ELEMENT);
  }

  public static boolean isAnimationGroupPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && ANIMATION_GROUP_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEventListenerPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, EVENT_LISTENER_PRESENTATION_ELEMENT);
  }

  public static boolean isEventListenerPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && EVENT_LISTENER_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSettingsPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, SETTINGS_PRESENTATION_ELEMENT);
  }

  public static boolean isSettingsPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && SETTINGS_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createShowPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, SHOW_PRESENTATION_ELEMENT);
  }

  public static boolean isShowPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && SHOW_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChartChartElement(Document document) {
    return document.createElementNS(CHART_NS, CHART_CHART_ELEMENT);
  }

  public static boolean isChartChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && CHART_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTitleChartElement(Document document) {
    return document.createElementNS(CHART_NS, TITLE_CHART_ELEMENT);
  }

  public static boolean isTitleChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && TITLE_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSubtitleChartElement(Document document) {
    return document.createElementNS(CHART_NS, SUBTITLE_CHART_ELEMENT);
  }

  public static boolean isSubtitleChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && SUBTITLE_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFooterChartElement(Document document) {
    return document.createElementNS(CHART_NS, FOOTER_CHART_ELEMENT);
  }

  public static boolean isFooterChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && FOOTER_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLegendChartElement(Document document) {
    return document.createElementNS(CHART_NS, LEGEND_CHART_ELEMENT);
  }

  public static boolean isLegendChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && LEGEND_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPlotAreaChartElement(Document document) {
    return document.createElementNS(CHART_NS, PLOT_AREA_CHART_ELEMENT);
  }

  public static boolean isPlotAreaChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && PLOT_AREA_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createWallChartElement(Document document) {
    return document.createElementNS(CHART_NS, WALL_CHART_ELEMENT);
  }

  public static boolean isWallChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && WALL_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFloorChartElement(Document document) {
    return document.createElementNS(CHART_NS, FLOOR_CHART_ELEMENT);
  }

  public static boolean isFloorChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && FLOOR_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAxisChartElement(Document document) {
    return document.createElementNS(CHART_NS, AXIS_CHART_ELEMENT);
  }

  public static boolean isAxisChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && AXIS_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGridChartElement(Document document) {
    return document.createElementNS(CHART_NS, GRID_CHART_ELEMENT);
  }

  public static boolean isGridChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && GRID_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSeriesChartElement(Document document) {
    return document.createElementNS(CHART_NS, SERIES_CHART_ELEMENT);
  }

  public static boolean isSeriesChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && SERIES_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDomainChartElement(Document document) {
    return document.createElementNS(CHART_NS, DOMAIN_CHART_ELEMENT);
  }

  public static boolean isDomainChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && DOMAIN_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCategoriesChartElement(Document document) {
    return document.createElementNS(CHART_NS, CATEGORIES_CHART_ELEMENT);
  }

  public static boolean isCategoriesChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && CATEGORIES_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDataPointChartElement(Document document) {
    return document.createElementNS(CHART_NS, DATA_POINT_CHART_ELEMENT);
  }

  public static boolean isDataPointChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && DATA_POINT_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMeanValueChartElement(Document document) {
    return document.createElementNS(CHART_NS, MEAN_VALUE_CHART_ELEMENT);
  }

  public static boolean isMeanValueChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && MEAN_VALUE_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createErrorIndicatorChartElement(Document document) {
    return document.createElementNS(CHART_NS, ERROR_INDICATOR_CHART_ELEMENT);
  }

  public static boolean isErrorIndicatorChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && ERROR_INDICATOR_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRegressionCurveChartElement(Document document) {
    return document.createElementNS(CHART_NS, REGRESSION_CURVE_CHART_ELEMENT);
  }

  public static boolean isRegressionCurveChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && REGRESSION_CURVE_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createStockGainMarkerChartElement(Document document) {
    return document.createElementNS(CHART_NS, STOCK_GAIN_MARKER_CHART_ELEMENT);
  }

  public static boolean isStockGainMarkerChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && STOCK_GAIN_MARKER_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createStockLossMarkerChartElement(Document document) {
    return document.createElementNS(CHART_NS, STOCK_LOSS_MARKER_CHART_ELEMENT);
  }

  public static boolean isStockLossMarkerChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && STOCK_LOSS_MARKER_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createStockRangeLineChartElement(Document document) {
    return document.createElementNS(CHART_NS, STOCK_RANGE_LINE_CHART_ELEMENT);
  }

  public static boolean isStockRangeLineChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && STOCK_RANGE_LINE_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFormsOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, FORMS_OFFICE_ELEMENT);
  }

  public static boolean isFormsOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && FORMS_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFormFormElement(Document document) {
    return document.createElementNS(FORM_NS, FORM_FORM_ELEMENT);
  }

  public static boolean isFormFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && FORM_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConnectionResourceFormElement(Document document) {
    return document.createElementNS(FORM_NS, CONNECTION_RESOURCE_FORM_ELEMENT);
  }

  public static boolean isConnectionResourceFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && CONNECTION_RESOURCE_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createModelXformsElement(Document document) {
    return document.createElementNS(XFORMS_NS, MODEL_XFORMS_ELEMENT);
  }

  public static boolean isModelXformsElement(Element element) {
    return XFORMS_NS.equals(element.getNamespaceURI()) && MODEL_XFORMS_ELEMENT.equals(element.getLocalName());
  }

  public static Element createItemFormElement(Document document) {
    return document.createElementNS(FORM_NS, ITEM_FORM_ELEMENT);
  }

  public static boolean isItemFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && ITEM_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createOptionFormElement(Document document) {
    return document.createElementNS(FORM_NS, OPTION_FORM_ELEMENT);
  }

  public static boolean isOptionFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && OPTION_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createColumnFormElement(Document document) {
    return document.createElementNS(FORM_NS, COLUMN_FORM_ELEMENT);
  }

  public static boolean isColumnFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && COLUMN_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPropertiesFormElement(Document document) {
    return document.createElementNS(FORM_NS, PROPERTIES_FORM_ELEMENT);
  }

  public static boolean isPropertiesFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && PROPERTIES_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAnnotationOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, ANNOTATION_OFFICE_ELEMENT);
  }

  public static boolean isAnnotationOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && ANNOTATION_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDateStringMetaElement(Document document) {
    return document.createElementNS(META_NS, DATE_STRING_META_ELEMENT);
  }

  public static boolean isDateStringMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && DATE_STRING_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChangeInfoOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, CHANGE_INFO_OFFICE_ELEMENT);
  }

  public static boolean isChangeInfoOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && CHANGE_INFO_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEventListenersOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, EVENT_LISTENERS_OFFICE_ELEMENT);
  }

  public static boolean isEventListenersOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && EVENT_LISTENERS_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEventListenerScriptElement(Document document) {
    return document.createElementNS(SCRIPT_NS, EVENT_LISTENER_SCRIPT_ELEMENT);
  }

  public static boolean isEventListenerScriptElement(Element element) {
    return SCRIPT_NS.equals(element.getNamespaceURI()) && EVENT_LISTENER_SCRIPT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMathMathElement(Document document) {
    return document.createElementNS(MATH_NS, MATH_MATH_ELEMENT);
  }

  public static boolean isMathMathElement(Element element) {
    return MATH_NS.equals(element.getNamespaceURI()) && MATH_MATH_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDdeConnectionDeclTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DDE_CONNECTION_DECL_TEXT_ELEMENT);
  }

  public static boolean isDdeConnectionDeclTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DDE_CONNECTION_DECL_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDdeLinkTableElement(Document document) {
    return document.createElementNS(TABLE_NS, DDE_LINK_TABLE_ELEMENT);
  }

  public static boolean isDdeLinkTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && DDE_LINK_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDdeSourceOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, DDE_SOURCE_OFFICE_ELEMENT);
  }

  public static boolean isDdeSourceOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && DDE_SOURCE_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createStyleStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, STYLE_STYLE_ELEMENT);
  }

  public static boolean isStyleStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && STYLE_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMapStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, MAP_STYLE_ELEMENT);
  }

  public static boolean isMapStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && MAP_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDefaultStyleStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, DEFAULT_STYLE_STYLE_ELEMENT);
  }

  public static boolean isDefaultStyleStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && DEFAULT_STYLE_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageLayoutStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, PAGE_LAYOUT_STYLE_ELEMENT);
  }

  public static boolean isPageLayoutStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && PAGE_LAYOUT_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHeaderStyleStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, HEADER_STYLE_STYLE_ELEMENT);
  }

  public static boolean isHeaderStyleStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && HEADER_STYLE_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFooterStyleStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, FOOTER_STYLE_STYLE_ELEMENT);
  }

  public static boolean isFooterStyleStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && FOOTER_STYLE_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMasterPageStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, MASTER_PAGE_STYLE_ELEMENT);
  }

  public static boolean isMasterPageStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && MASTER_PAGE_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHeaderStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, HEADER_STYLE_ELEMENT);
  }

  public static boolean isHeaderStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && HEADER_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFooterStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, FOOTER_STYLE_ELEMENT);
  }

  public static boolean isFooterStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && FOOTER_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHeaderLeftStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, HEADER_LEFT_STYLE_ELEMENT);
  }

  public static boolean isHeaderLeftStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && HEADER_LEFT_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFooterLeftStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, FOOTER_LEFT_STYLE_ELEMENT);
  }

  public static boolean isFooterLeftStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && FOOTER_LEFT_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRegionLeftStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, REGION_LEFT_STYLE_ELEMENT);
  }

  public static boolean isRegionLeftStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && REGION_LEFT_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRegionCenterStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, REGION_CENTER_STYLE_ELEMENT);
  }

  public static boolean isRegionCenterStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && REGION_CENTER_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRegionRightStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, REGION_RIGHT_STYLE_ELEMENT);
  }

  public static boolean isRegionRightStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && REGION_RIGHT_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNotesPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, NOTES_PRESENTATION_ELEMENT);
  }

  public static boolean isNotesPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && NOTES_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableTemplateTableElement(Document document) {
    return document.createElementNS(TABLE_NS, TABLE_TEMPLATE_TABLE_ELEMENT);
  }

  public static boolean isTableTemplateTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && TABLE_TEMPLATE_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFirstRowTableElement(Document document) {
    return document.createElementNS(TABLE_NS, FIRST_ROW_TABLE_ELEMENT);
  }

  public static boolean isFirstRowTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && FIRST_ROW_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLastRowTableElement(Document document) {
    return document.createElementNS(TABLE_NS, LAST_ROW_TABLE_ELEMENT);
  }

  public static boolean isLastRowTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && LAST_ROW_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFirstColumnTableElement(Document document) {
    return document.createElementNS(TABLE_NS, FIRST_COLUMN_TABLE_ELEMENT);
  }

  public static boolean isFirstColumnTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && FIRST_COLUMN_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLastColumnTableElement(Document document) {
    return document.createElementNS(TABLE_NS, LAST_COLUMN_TABLE_ELEMENT);
  }

  public static boolean isLastColumnTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && LAST_COLUMN_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBodyTableElement(Document document) {
    return document.createElementNS(TABLE_NS, BODY_TABLE_ELEMENT);
  }

  public static boolean isBodyTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && BODY_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEvenRowsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, EVEN_ROWS_TABLE_ELEMENT);
  }

  public static boolean isEvenRowsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && EVEN_ROWS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createOddRowsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, ODD_ROWS_TABLE_ELEMENT);
  }

  public static boolean isOddRowsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && ODD_ROWS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEvenColumnsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, EVEN_COLUMNS_TABLE_ELEMENT);
  }

  public static boolean isEvenColumnsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && EVEN_COLUMNS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createOddColumnsTableElement(Document document) {
    return document.createElementNS(TABLE_NS, ODD_COLUMNS_TABLE_ELEMENT);
  }

  public static boolean isOddColumnsTableElement(Element element) {
    return TABLE_NS.equals(element.getNamespaceURI()) && ODD_COLUMNS_TABLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFontFaceStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, FONT_FACE_STYLE_ELEMENT);
  }

  public static boolean isFontFaceStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && FONT_FACE_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFontFaceSrcSvgElement(Document document) {
    return document.createElementNS(SVG_NS, FONT_FACE_SRC_SVG_ELEMENT);
  }

  public static boolean isFontFaceSrcSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && FONT_FACE_SRC_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFontFaceUriSvgElement(Document document) {
    return document.createElementNS(SVG_NS, FONT_FACE_URI_SVG_ELEMENT);
  }

  public static boolean isFontFaceUriSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && FONT_FACE_URI_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFontFaceFormatSvgElement(Document document) {
    return document.createElementNS(SVG_NS, FONT_FACE_FORMAT_SVG_ELEMENT);
  }

  public static boolean isFontFaceFormatSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && FONT_FACE_FORMAT_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFontFaceNameSvgElement(Document document) {
    return document.createElementNS(SVG_NS, FONT_FACE_NAME_SVG_ELEMENT);
  }

  public static boolean isFontFaceNameSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && FONT_FACE_NAME_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDefinitionSrcSvgElement(Document document) {
    return document.createElementNS(SVG_NS, DEFINITION_SRC_SVG_ELEMENT);
  }

  public static boolean isDefinitionSrcSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && DEFINITION_SRC_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNumberStyleNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, NUMBER_STYLE_NUMBER_ELEMENT);
  }

  public static boolean isNumberStyleNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && NUMBER_STYLE_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNumberNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, NUMBER_NUMBER_ELEMENT);
  }

  public static boolean isNumberNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && NUMBER_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEmbeddedTextNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, EMBEDDED_TEXT_NUMBER_ELEMENT);
  }

  public static boolean isEmbeddedTextNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && EMBEDDED_TEXT_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createScientificNumberNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, SCIENTIFIC_NUMBER_NUMBER_ELEMENT);
  }

  public static boolean isScientificNumberNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && SCIENTIFIC_NUMBER_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFractionNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, FRACTION_NUMBER_ELEMENT);
  }

  public static boolean isFractionNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && FRACTION_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCurrencyStyleNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, CURRENCY_STYLE_NUMBER_ELEMENT);
  }

  public static boolean isCurrencyStyleNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && CURRENCY_STYLE_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCurrencySymbolNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, CURRENCY_SYMBOL_NUMBER_ELEMENT);
  }

  public static boolean isCurrencySymbolNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && CURRENCY_SYMBOL_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPercentageStyleNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, PERCENTAGE_STYLE_NUMBER_ELEMENT);
  }

  public static boolean isPercentageStyleNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && PERCENTAGE_STYLE_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDateStyleNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, DATE_STYLE_NUMBER_ELEMENT);
  }

  public static boolean isDateStyleNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && DATE_STYLE_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDayNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, DAY_NUMBER_ELEMENT);
  }

  public static boolean isDayNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && DAY_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMonthNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, MONTH_NUMBER_ELEMENT);
  }

  public static boolean isMonthNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && MONTH_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createYearNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, YEAR_NUMBER_ELEMENT);
  }

  public static boolean isYearNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && YEAR_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEraNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, ERA_NUMBER_ELEMENT);
  }

  public static boolean isEraNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && ERA_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDayOfWeekNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, DAY_OF_WEEK_NUMBER_ELEMENT);
  }

  public static boolean isDayOfWeekNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && DAY_OF_WEEK_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createWeekOfYearNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, WEEK_OF_YEAR_NUMBER_ELEMENT);
  }

  public static boolean isWeekOfYearNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && WEEK_OF_YEAR_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createQuarterNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, QUARTER_NUMBER_ELEMENT);
  }

  public static boolean isQuarterNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && QUARTER_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTimeStyleNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, TIME_STYLE_NUMBER_ELEMENT);
  }

  public static boolean isTimeStyleNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && TIME_STYLE_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHoursNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, HOURS_NUMBER_ELEMENT);
  }

  public static boolean isHoursNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && HOURS_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMinutesNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, MINUTES_NUMBER_ELEMENT);
  }

  public static boolean isMinutesNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && MINUTES_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSecondsNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, SECONDS_NUMBER_ELEMENT);
  }

  public static boolean isSecondsNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && SECONDS_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAmPmNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, AM_PM_NUMBER_ELEMENT);
  }

  public static boolean isAmPmNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && AM_PM_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBooleanStyleNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, BOOLEAN_STYLE_NUMBER_ELEMENT);
  }

  public static boolean isBooleanStyleNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && BOOLEAN_STYLE_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBooleanNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, BOOLEAN_NUMBER_ELEMENT);
  }

  public static boolean isBooleanNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && BOOLEAN_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextStyleNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, TEXT_STYLE_NUMBER_ELEMENT);
  }

  public static boolean isTextStyleNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && TEXT_STYLE_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, TEXT_NUMBER_ELEMENT);
  }

  public static boolean isTextNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && TEXT_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextContentNumberElement(Document document) {
    return document.createElementNS(NUMBER_NS, TEXT_CONTENT_NUMBER_ELEMENT);
  }

  public static boolean isTextContentNumberElement(Element element) {
    return NUMBER_NS.equals(element.getNamespaceURI()) && TEXT_CONTENT_NUMBER_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLinenumberingConfigurationTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LINENUMBERING_CONFIGURATION_TEXT_ELEMENT);
  }

  public static boolean isLinenumberingConfigurationTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LINENUMBERING_CONFIGURATION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLinenumberingSeparatorTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LINENUMBERING_SEPARATOR_TEXT_ELEMENT);
  }

  public static boolean isLinenumberingSeparatorTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LINENUMBERING_SEPARATOR_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNotesConfigurationTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NOTES_CONFIGURATION_TEXT_ELEMENT);
  }

  public static boolean isNotesConfigurationTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NOTES_CONFIGURATION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBibliographyConfigurationTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BIBLIOGRAPHY_CONFIGURATION_TEXT_ELEMENT);
  }

  public static boolean isBibliographyConfigurationTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BIBLIOGRAPHY_CONFIGURATION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSortKeyTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SORT_KEY_TEXT_ELEMENT);
  }

  public static boolean isSortKeyTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SORT_KEY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListStyleTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LIST_STYLE_TEXT_ELEMENT);
  }

  public static boolean isListStyleTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LIST_STYLE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createOutlineStyleTextElement(Document document) {
    return document.createElementNS(TEXT_NS, OUTLINE_STYLE_TEXT_ELEMENT);
  }

  public static boolean isOutlineStyleTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && OUTLINE_STYLE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createOutlineLevelStyleTextElement(Document document) {
    return document.createElementNS(TEXT_NS, OUTLINE_LEVEL_STYLE_TEXT_ELEMENT);
  }

  public static boolean isOutlineLevelStyleTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && OUTLINE_LEVEL_STYLE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGraphicPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, GRAPHIC_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isGraphicPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && GRAPHIC_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDrawingPagePropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, DRAWING_PAGE_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isDrawingPagePropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && DRAWING_PAGE_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGradientDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, GRADIENT_DRAW_ELEMENT);
  }

  public static boolean isGradientDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && GRADIENT_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLinearGradientSvgElement(Document document) {
    return document.createElementNS(SVG_NS, LINEARGRADIENT_SVG_ELEMENT);
  }

  public static boolean isLinearGradientSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && LINEARGRADIENT_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRadialGradientSvgElement(Document document) {
    return document.createElementNS(SVG_NS, RADIALGRADIENT_SVG_ELEMENT);
  }

  public static boolean isRadialGradientSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && RADIALGRADIENT_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createStopSvgElement(Document document) {
    return document.createElementNS(SVG_NS, STOP_SVG_ELEMENT);
  }

  public static boolean isStopSvgElement(Element element) {
    return SVG_NS.equals(element.getNamespaceURI()) && STOP_SVG_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHatchDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, HATCH_DRAW_ELEMENT);
  }

  public static boolean isHatchDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && HATCH_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFillImageDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, FILL_IMAGE_DRAW_ELEMENT);
  }

  public static boolean isFillImageDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && FILL_IMAGE_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createOpacityDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, OPACITY_DRAW_ELEMENT);
  }

  public static boolean isOpacityDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && OPACITY_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMarkerDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, MARKER_DRAW_ELEMENT);
  }

  public static boolean isMarkerDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && MARKER_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createStrokeDashDrawElement(Document document) {
    return document.createElementNS(DRAW_NS, STROKE_DASH_DRAW_ELEMENT);
  }

  public static boolean isStrokeDashDrawElement(Element element) {
    return DRAW_NS.equals(element.getNamespaceURI()) && STROKE_DASH_DRAW_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPresentationPageLayoutStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, PRESENTATION_PAGE_LAYOUT_STYLE_ELEMENT);
  }

  public static boolean isPresentationPageLayoutStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && PRESENTATION_PAGE_LAYOUT_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPlaceholderPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, PLACEHOLDER_PRESENTATION_ELEMENT);
  }

  public static boolean isPlaceholderPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && PLACEHOLDER_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageLayoutPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, PAGE_LAYOUT_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isPageLayoutPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && PAGE_LAYOUT_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFootnoteSepStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, FOOTNOTE_SEP_STYLE_ELEMENT);
  }

  public static boolean isFootnoteSepStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && FOOTNOTE_SEP_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHeaderFooterPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, HEADER_FOOTER_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isHeaderFooterPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && HEADER_FOOTER_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, TEXT_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isTextPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && TEXT_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createParagraphPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, PARAGRAPH_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isParagraphPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && PARAGRAPH_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTabStopsStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, TAB_STOPS_STYLE_ELEMENT);
  }

  public static boolean isTabStopsStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && TAB_STOPS_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTabStopStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, TAB_STOP_STYLE_ELEMENT);
  }

  public static boolean isTabStopStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && TAB_STOP_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDropCapStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, DROP_CAP_STYLE_ELEMENT);
  }

  public static boolean isDropCapStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && DROP_CAP_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBackgroundImageStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, BACKGROUND_IMAGE_STYLE_ELEMENT);
  }

  public static boolean isBackgroundImageStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && BACKGROUND_IMAGE_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRubyPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, RUBY_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isRubyPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && RUBY_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSectionPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, SECTION_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isSectionPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && SECTION_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createColumnsStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, COLUMNS_STYLE_ELEMENT);
  }

  public static boolean isColumnsStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && COLUMNS_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createColumnStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, COLUMN_STYLE_ELEMENT);
  }

  public static boolean isColumnStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && COLUMN_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createColumnSepStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, COLUMN_SEP_STYLE_ELEMENT);
  }

  public static boolean isColumnSepStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && COLUMN_SEP_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTablePropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, TABLE_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isTablePropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && TABLE_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableColumnPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, TABLE_COLUMN_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isTableColumnPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && TABLE_COLUMN_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableRowPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, TABLE_ROW_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isTableRowPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && TABLE_ROW_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableCellPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, TABLE_CELL_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isTableCellPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && TABLE_CELL_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListLevelPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, LIST_LEVEL_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isListLevelPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && LIST_LEVEL_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChartPropertiesStyleElement(Document document) {
    return document.createElementNS(STYLE_NS, CHART_PROPERTIES_STYLE_ELEMENT);
  }

  public static boolean isChartPropertiesStyleElement(Element element) {
    return STYLE_NS.equals(element.getNamespaceURI()) && CHART_PROPERTIES_STYLE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, TEXT_OFFICE_ELEMENT);
  }

  public static boolean isTextOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && TEXT_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDrawingOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, DRAWING_OFFICE_ELEMENT);
  }

  public static boolean isDrawingOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && DRAWING_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPresentationOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, PRESENTATION_OFFICE_ELEMENT);
  }

  public static boolean isPresentationOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && PRESENTATION_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSpreadsheetOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, SPREADSHEET_OFFICE_ELEMENT);
  }

  public static boolean isSpreadsheetOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && SPREADSHEET_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChartOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, CHART_OFFICE_ELEMENT);
  }

  public static boolean isChartOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && CHART_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createImageOfficeElement(Document document) {
    return document.createElementNS(OFFICE_NS, IMAGE_OFFICE_ELEMENT);
  }

  public static boolean isImageOfficeElement(Element element) {
    return OFFICE_NS.equals(element.getNamespaceURI()) && IMAGE_OFFICE_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGeneratorMetaElement(Document document) {
    return document.createElementNS(META_NS, GENERATOR_META_ELEMENT);
  }

  public static boolean isGeneratorMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && GENERATOR_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTitleDcElement(Document document) {
    return document.createElementNS(DC_NS, TITLE_DC_ELEMENT);
  }

  public static boolean isTitleDcElement(Element element) {
    return DC_NS.equals(element.getNamespaceURI()) && TITLE_DC_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDescriptionDcElement(Document document) {
    return document.createElementNS(DC_NS, DESCRIPTION_DC_ELEMENT);
  }

  public static boolean isDescriptionDcElement(Element element) {
    return DC_NS.equals(element.getNamespaceURI()) && DESCRIPTION_DC_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSubjectDcElement(Document document) {
    return document.createElementNS(DC_NS, SUBJECT_DC_ELEMENT);
  }

  public static boolean isSubjectDcElement(Element element) {
    return DC_NS.equals(element.getNamespaceURI()) && SUBJECT_DC_ELEMENT.equals(element.getLocalName());
  }

  public static Element createKeywordMetaElement(Document document) {
    return document.createElementNS(META_NS, KEYWORD_META_ELEMENT);
  }

  public static boolean isKeywordMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && KEYWORD_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createInitialCreatorMetaElement(Document document) {
    return document.createElementNS(META_NS, INITIAL_CREATOR_META_ELEMENT);
  }

  public static boolean isInitialCreatorMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && INITIAL_CREATOR_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPrintedByMetaElement(Document document) {
    return document.createElementNS(META_NS, PRINTED_BY_META_ELEMENT);
  }

  public static boolean isPrintedByMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && PRINTED_BY_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCreationDateMetaElement(Document document) {
    return document.createElementNS(META_NS, CREATION_DATE_META_ELEMENT);
  }

  public static boolean isCreationDateMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && CREATION_DATE_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPrintDateMetaElement(Document document) {
    return document.createElementNS(META_NS, PRINT_DATE_META_ELEMENT);
  }

  public static boolean isPrintDateMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && PRINT_DATE_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTemplateMetaElement(Document document) {
    return document.createElementNS(META_NS, TEMPLATE_META_ELEMENT);
  }

  public static boolean isTemplateMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && TEMPLATE_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAutoReloadMetaElement(Document document) {
    return document.createElementNS(META_NS, AUTO_RELOAD_META_ELEMENT);
  }

  public static boolean isAutoReloadMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && AUTO_RELOAD_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHyperlinkBehaviourMetaElement(Document document) {
    return document.createElementNS(META_NS, HYPERLINK_BEHAVIOUR_META_ELEMENT);
  }

  public static boolean isHyperlinkBehaviourMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && HYPERLINK_BEHAVIOUR_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLanguageDcElement(Document document) {
    return document.createElementNS(DC_NS, LANGUAGE_DC_ELEMENT);
  }

  public static boolean isLanguageDcElement(Element element) {
    return DC_NS.equals(element.getNamespaceURI()) && LANGUAGE_DC_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEditingCyclesMetaElement(Document document) {
    return document.createElementNS(META_NS, EDITING_CYCLES_META_ELEMENT);
  }

  public static boolean isEditingCyclesMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && EDITING_CYCLES_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEditingDurationMetaElement(Document document) {
    return document.createElementNS(META_NS, EDITING_DURATION_META_ELEMENT);
  }

  public static boolean isEditingDurationMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && EDITING_DURATION_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDocumentStatisticMetaElement(Document document) {
    return document.createElementNS(META_NS, DOCUMENT_STATISTIC_META_ELEMENT);
  }

  public static boolean isDocumentStatisticMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && DOCUMENT_STATISTIC_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserDefinedMetaElement(Document document) {
    return document.createElementNS(META_NS, USER_DEFINED_META_ELEMENT);
  }

  public static boolean isUserDefinedMetaElement(Element element) {
    return META_NS.equals(element.getNamespaceURI()) && USER_DEFINED_META_ELEMENT.equals(element.getLocalName());
  }

  public static Element createInsertionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INSERTION_TEXT_ELEMENT);
  }

  public static boolean isInsertionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INSERTION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDeletionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DELETION_TEXT_ELEMENT);
  }

  public static boolean isDeletionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DELETION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFormatChangeTextElement(Document document) {
    return document.createElementNS(TEXT_NS, FORMAT_CHANGE_TEXT_ELEMENT);
  }

  public static boolean isFormatChangeTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && FORMAT_CHANGE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChangeTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CHANGE_TEXT_ELEMENT);
  }

  public static boolean isChangeTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CHANGE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChangeStartTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CHANGE_START_TEXT_ELEMENT);
  }

  public static boolean isChangeStartTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CHANGE_START_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChangeEndTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CHANGE_END_TEXT_ELEMENT);
  }

  public static boolean isChangeEndTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CHANGE_END_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createVariableDeclsTextElement(Document document) {
    return document.createElementNS(TEXT_NS, VARIABLE_DECLS_TEXT_ELEMENT);
  }

  public static boolean isVariableDeclsTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && VARIABLE_DECLS_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSequenceDeclsTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SEQUENCE_DECLS_TEXT_ELEMENT);
  }

  public static boolean isSequenceDeclsTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SEQUENCE_DECLS_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserFieldDeclsTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_FIELD_DECLS_TEXT_ELEMENT);
  }

  public static boolean isUserFieldDeclsTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_FIELD_DECLS_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDdeConnectionDeclsTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DDE_CONNECTION_DECLS_TEXT_ELEMENT);
  }

  public static boolean isDdeConnectionDeclsTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DDE_CONNECTION_DECLS_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSTextElement(Document document) {
    return document.createElementNS(TEXT_NS, S_TEXT_ELEMENT);
  }

  public static boolean isSTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && S_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTabTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TAB_TEXT_ELEMENT);
  }

  public static boolean isTabTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TAB_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createLineBreakTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LINE_BREAK_TEXT_ELEMENT);
  }

  public static boolean isLineBreakTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LINE_BREAK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSpanTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SPAN_TEXT_ELEMENT);
  }

  public static boolean isSpanTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SPAN_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createATextElement(Document document) {
    return document.createElementNS(TEXT_NS, A_TEXT_ELEMENT);
  }

  public static boolean isATextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && A_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBookmarkTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BOOKMARK_TEXT_ELEMENT);
  }

  public static boolean isBookmarkTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BOOKMARK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBookmarkStartTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BOOKMARK_START_TEXT_ELEMENT);
  }

  public static boolean isBookmarkStartTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BOOKMARK_START_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBookmarkEndTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BOOKMARK_END_TEXT_ELEMENT);
  }

  public static boolean isBookmarkEndTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BOOKMARK_END_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createReferenceMarkTextElement(Document document) {
    return document.createElementNS(TEXT_NS, REFERENCE_MARK_TEXT_ELEMENT);
  }

  public static boolean isReferenceMarkTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && REFERENCE_MARK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createReferenceMarkStartTextElement(Document document) {
    return document.createElementNS(TEXT_NS, REFERENCE_MARK_START_TEXT_ELEMENT);
  }

  public static boolean isReferenceMarkStartTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && REFERENCE_MARK_START_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createReferenceMarkEndTextElement(Document document) {
    return document.createElementNS(TEXT_NS, REFERENCE_MARK_END_TEXT_ELEMENT);
  }

  public static boolean isReferenceMarkEndTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && REFERENCE_MARK_END_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNoteCitationTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NOTE_CITATION_TEXT_ELEMENT);
  }

  public static boolean isNoteCitationTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NOTE_CITATION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNoteBodyTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NOTE_BODY_TEXT_ELEMENT);
  }

  public static boolean isNoteBodyTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NOTE_BODY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNoteTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NOTE_TEXT_ELEMENT);
  }

  public static boolean isNoteTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NOTE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRubyBaseTextElement(Document document) {
    return document.createElementNS(TEXT_NS, RUBY_BASE_TEXT_ELEMENT);
  }

  public static boolean isRubyBaseTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && RUBY_BASE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRubyTextTextElement(Document document) {
    return document.createElementNS(TEXT_NS, RUBY_TEXT_TEXT_ELEMENT);
  }

  public static boolean isRubyTextTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && RUBY_TEXT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRubyTextElement(Document document) {
    return document.createElementNS(TEXT_NS, RUBY_TEXT_ELEMENT);
  }

  public static boolean isRubyTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && RUBY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DATE_TEXT_ELEMENT);
  }

  public static boolean isDateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTimeTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TIME_TEXT_ELEMENT);
  }

  public static boolean isTimeTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TIME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageNumberTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PAGE_NUMBER_TEXT_ELEMENT);
  }

  public static boolean isPageNumberTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PAGE_NUMBER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageContinuationTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PAGE_CONTINUATION_TEXT_ELEMENT);
  }

  public static boolean isPageContinuationTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PAGE_CONTINUATION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderFirstnameTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_FIRSTNAME_TEXT_ELEMENT);
  }

  public static boolean isSenderFirstnameTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_FIRSTNAME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderLastnameTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_LASTNAME_TEXT_ELEMENT);
  }

  public static boolean isSenderLastnameTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_LASTNAME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderInitialsTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_INITIALS_TEXT_ELEMENT);
  }

  public static boolean isSenderInitialsTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_INITIALS_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderTitleTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_TITLE_TEXT_ELEMENT);
  }

  public static boolean isSenderTitleTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_TITLE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderPositionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_POSITION_TEXT_ELEMENT);
  }

  public static boolean isSenderPositionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_POSITION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderEmailTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_EMAIL_TEXT_ELEMENT);
  }

  public static boolean isSenderEmailTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_EMAIL_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderPhonePrivateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_PHONE_PRIVATE_TEXT_ELEMENT);
  }

  public static boolean isSenderPhonePrivateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_PHONE_PRIVATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderFaxTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_FAX_TEXT_ELEMENT);
  }

  public static boolean isSenderFaxTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_FAX_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderCompanyTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_COMPANY_TEXT_ELEMENT);
  }

  public static boolean isSenderCompanyTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_COMPANY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderPhoneWorkTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_PHONE_WORK_TEXT_ELEMENT);
  }

  public static boolean isSenderPhoneWorkTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_PHONE_WORK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderStreetTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_STREET_TEXT_ELEMENT);
  }

  public static boolean isSenderStreetTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_STREET_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderCityTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_CITY_TEXT_ELEMENT);
  }

  public static boolean isSenderCityTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_CITY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderPostalCodeTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_POSTAL_CODE_TEXT_ELEMENT);
  }

  public static boolean isSenderPostalCodeTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_POSTAL_CODE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderCountryTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_COUNTRY_TEXT_ELEMENT);
  }

  public static boolean isSenderCountryTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_COUNTRY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSenderStateOrProvinceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SENDER_STATE_OR_PROVINCE_TEXT_ELEMENT);
  }

  public static boolean isSenderStateOrProvinceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SENDER_STATE_OR_PROVINCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAuthorNameTextElement(Document document) {
    return document.createElementNS(TEXT_NS, AUTHOR_NAME_TEXT_ELEMENT);
  }

  public static boolean isAuthorNameTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && AUTHOR_NAME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAuthorInitialsTextElement(Document document) {
    return document.createElementNS(TEXT_NS, AUTHOR_INITIALS_TEXT_ELEMENT);
  }

  public static boolean isAuthorInitialsTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && AUTHOR_INITIALS_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createChapterTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CHAPTER_TEXT_ELEMENT);
  }

  public static boolean isChapterTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CHAPTER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFileNameTextElement(Document document) {
    return document.createElementNS(TEXT_NS, FILE_NAME_TEXT_ELEMENT);
  }

  public static boolean isFileNameTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && FILE_NAME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTemplateNameTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TEMPLATE_NAME_TEXT_ELEMENT);
  }

  public static boolean isTemplateNameTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TEMPLATE_NAME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSheetNameTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SHEET_NAME_TEXT_ELEMENT);
  }

  public static boolean isSheetNameTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SHEET_NAME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createVariableSetTextElement(Document document) {
    return document.createElementNS(TEXT_NS, VARIABLE_SET_TEXT_ELEMENT);
  }

  public static boolean isVariableSetTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && VARIABLE_SET_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createVariableGetTextElement(Document document) {
    return document.createElementNS(TEXT_NS, VARIABLE_GET_TEXT_ELEMENT);
  }

  public static boolean isVariableGetTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && VARIABLE_GET_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createVariableInputTextElement(Document document) {
    return document.createElementNS(TEXT_NS, VARIABLE_INPUT_TEXT_ELEMENT);
  }

  public static boolean isVariableInputTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && VARIABLE_INPUT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserFieldGetTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_FIELD_GET_TEXT_ELEMENT);
  }

  public static boolean isUserFieldGetTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_FIELD_GET_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserFieldInputTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_FIELD_INPUT_TEXT_ELEMENT);
  }

  public static boolean isUserFieldInputTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_FIELD_INPUT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSequenceTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SEQUENCE_TEXT_ELEMENT);
  }

  public static boolean isSequenceTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SEQUENCE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createExpressionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, EXPRESSION_TEXT_ELEMENT);
  }

  public static boolean isExpressionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && EXPRESSION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextInputTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TEXT_INPUT_TEXT_ELEMENT);
  }

  public static boolean isTextInputTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TEXT_INPUT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createInitialCreatorTextElement(Document document) {
    return document.createElementNS(TEXT_NS, INITIAL_CREATOR_TEXT_ELEMENT);
  }

  public static boolean isInitialCreatorTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && INITIAL_CREATOR_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCreationDateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CREATION_DATE_TEXT_ELEMENT);
  }

  public static boolean isCreationDateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CREATION_DATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCreationTimeTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CREATION_TIME_TEXT_ELEMENT);
  }

  public static boolean isCreationTimeTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CREATION_TIME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDescriptionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DESCRIPTION_TEXT_ELEMENT);
  }

  public static boolean isDescriptionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DESCRIPTION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserDefinedTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_DEFINED_TEXT_ELEMENT);
  }

  public static boolean isUserDefinedTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_DEFINED_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPrintTimeTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PRINT_TIME_TEXT_ELEMENT);
  }

  public static boolean isPrintTimeTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PRINT_TIME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPrintDateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PRINT_DATE_TEXT_ELEMENT);
  }

  public static boolean isPrintDateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PRINT_DATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPrintedByTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PRINTED_BY_TEXT_ELEMENT);
  }

  public static boolean isPrintedByTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PRINTED_BY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTitleTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TITLE_TEXT_ELEMENT);
  }

  public static boolean isTitleTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TITLE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSubjectTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SUBJECT_TEXT_ELEMENT);
  }

  public static boolean isSubjectTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SUBJECT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createKeywordsTextElement(Document document) {
    return document.createElementNS(TEXT_NS, KEYWORDS_TEXT_ELEMENT);
  }

  public static boolean isKeywordsTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && KEYWORDS_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEditingCyclesTextElement(Document document) {
    return document.createElementNS(TEXT_NS, EDITING_CYCLES_TEXT_ELEMENT);
  }

  public static boolean isEditingCyclesTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && EDITING_CYCLES_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createEditingDurationTextElement(Document document) {
    return document.createElementNS(TEXT_NS, EDITING_DURATION_TEXT_ELEMENT);
  }

  public static boolean isEditingDurationTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && EDITING_DURATION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createModificationTimeTextElement(Document document) {
    return document.createElementNS(TEXT_NS, MODIFICATION_TIME_TEXT_ELEMENT);
  }

  public static boolean isModificationTimeTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && MODIFICATION_TIME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createModificationDateTextElement(Document document) {
    return document.createElementNS(TEXT_NS, MODIFICATION_DATE_TEXT_ELEMENT);
  }

  public static boolean isModificationDateTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && MODIFICATION_DATE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCreatorTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CREATOR_TEXT_ELEMENT);
  }

  public static boolean isCreatorTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CREATOR_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseDisplayTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DATABASE_DISPLAY_TEXT_ELEMENT);
  }

  public static boolean isDatabaseDisplayTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DATABASE_DISPLAY_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseNextTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DATABASE_NEXT_TEXT_ELEMENT);
  }

  public static boolean isDatabaseNextTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DATABASE_NEXT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseRowSelectTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DATABASE_ROW_SELECT_TEXT_ELEMENT);
  }

  public static boolean isDatabaseRowSelectTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DATABASE_ROW_SELECT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseRowNumberTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DATABASE_ROW_NUMBER_TEXT_ELEMENT);
  }

  public static boolean isDatabaseRowNumberTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DATABASE_ROW_NUMBER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDatabaseNameTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DATABASE_NAME_TEXT_ELEMENT);
  }

  public static boolean isDatabaseNameTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DATABASE_NAME_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageVariableSetTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PAGE_VARIABLE_SET_TEXT_ELEMENT);
  }

  public static boolean isPageVariableSetTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PAGE_VARIABLE_SET_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPageVariableGetTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PAGE_VARIABLE_GET_TEXT_ELEMENT);
  }

  public static boolean isPageVariableGetTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PAGE_VARIABLE_GET_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPlaceholderTextElement(Document document) {
    return document.createElementNS(TEXT_NS, PLACEHOLDER_TEXT_ELEMENT);
  }

  public static boolean isPlaceholderTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && PLACEHOLDER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createConditionalTextTextElement(Document document) {
    return document.createElementNS(TEXT_NS, CONDITIONAL_TEXT_TEXT_ELEMENT);
  }

  public static boolean isConditionalTextTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && CONDITIONAL_TEXT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHiddenTextTextElement(Document document) {
    return document.createElementNS(TEXT_NS, HIDDEN_TEXT_TEXT_ELEMENT);
  }

  public static boolean isHiddenTextTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && HIDDEN_TEXT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNoteRefTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NOTE_REF_TEXT_ELEMENT);
  }

  public static boolean isNoteRefTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NOTE_REF_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSequenceRefTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SEQUENCE_REF_TEXT_ELEMENT);
  }

  public static boolean isSequenceRefTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SEQUENCE_REF_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createScriptTextElement(Document document) {
    return document.createElementNS(TEXT_NS, SCRIPT_TEXT_ELEMENT);
  }

  public static boolean isScriptTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && SCRIPT_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createExecuteMacroTextElement(Document document) {
    return document.createElementNS(TEXT_NS, EXECUTE_MACRO_TEXT_ELEMENT);
  }

  public static boolean isExecuteMacroTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && EXECUTE_MACRO_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHiddenParagraphTextElement(Document document) {
    return document.createElementNS(TEXT_NS, HIDDEN_PARAGRAPH_TEXT_ELEMENT);
  }

  public static boolean isHiddenParagraphTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && HIDDEN_PARAGRAPH_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDdeConnectionTextElement(Document document) {
    return document.createElementNS(TEXT_NS, DDE_CONNECTION_TEXT_ELEMENT);
  }

  public static boolean isDdeConnectionTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && DDE_CONNECTION_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createMeasureTextElement(Document document) {
    return document.createElementNS(TEXT_NS, MEASURE_TEXT_ELEMENT);
  }

  public static boolean isMeasureTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && MEASURE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTableFormulaTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TABLE_FORMULA_TEXT_ELEMENT);
  }

  public static boolean isTableFormulaTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TABLE_FORMULA_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTocMarkStartTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TOC_MARK_START_TEXT_ELEMENT);
  }

  public static boolean isTocMarkStartTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TOC_MARK_START_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTocMarkEndTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TOC_MARK_END_TEXT_ELEMENT);
  }

  public static boolean isTocMarkEndTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TOC_MARK_END_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTocMarkTextElement(Document document) {
    return document.createElementNS(TEXT_NS, TOC_MARK_TEXT_ELEMENT);
  }

  public static boolean isTocMarkTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && TOC_MARK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserIndexMarkStartTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_INDEX_MARK_START_TEXT_ELEMENT);
  }

  public static boolean isUserIndexMarkStartTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_INDEX_MARK_START_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserIndexMarkEndTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_INDEX_MARK_END_TEXT_ELEMENT);
  }

  public static boolean isUserIndexMarkEndTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_INDEX_MARK_END_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createUserIndexMarkTextElement(Document document) {
    return document.createElementNS(TEXT_NS, USER_INDEX_MARK_TEXT_ELEMENT);
  }

  public static boolean isUserIndexMarkTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && USER_INDEX_MARK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAlphabeticalIndexMarkStartTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ALPHABETICAL_INDEX_MARK_START_TEXT_ELEMENT);
  }

  public static boolean isAlphabeticalIndexMarkStartTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ALPHABETICAL_INDEX_MARK_START_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAlphabeticalIndexMarkEndTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ALPHABETICAL_INDEX_MARK_END_TEXT_ELEMENT);
  }

  public static boolean isAlphabeticalIndexMarkEndTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ALPHABETICAL_INDEX_MARK_END_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAlphabeticalIndexMarkTextElement(Document document) {
    return document.createElementNS(TEXT_NS, ALPHABETICAL_INDEX_MARK_TEXT_ELEMENT);
  }

  public static boolean isAlphabeticalIndexMarkTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && ALPHABETICAL_INDEX_MARK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createBibliographyMarkTextElement(Document document) {
    return document.createElementNS(TEXT_NS, BIBLIOGRAPHY_MARK_TEXT_ELEMENT);
  }

  public static boolean isBibliographyMarkTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && BIBLIOGRAPHY_MARK_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHeaderPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, HEADER_PRESENTATION_ELEMENT);
  }

  public static boolean isHeaderPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && HEADER_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFooterPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, FOOTER_PRESENTATION_ELEMENT);
  }

  public static boolean isFooterPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && FOOTER_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDateTimePresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, DATE_TIME_PRESENTATION_ELEMENT);
  }

  public static boolean isDateTimePresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && DATE_TIME_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHeaderDeclPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, HEADER_DECL_PRESENTATION_ELEMENT);
  }

  public static boolean isHeaderDeclPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && HEADER_DECL_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFooterDeclPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, FOOTER_DECL_PRESENTATION_ELEMENT);
  }

  public static boolean isFooterDeclPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && FOOTER_DECL_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDateTimeDeclPresentationElement(Document document) {
    return document.createElementNS(PRESENTATION_NS, DATE_TIME_DECL_PRESENTATION_ELEMENT);
  }

  public static boolean isDateTimeDeclPresentationElement(Element element) {
    return PRESENTATION_NS.equals(element.getNamespaceURI()) && DATE_TIME_DECL_PRESENTATION_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextFormElement(Document document) {
    return document.createElementNS(FORM_NS, TEXT_FORM_ELEMENT);
  }

  public static boolean isTextFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && TEXT_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTextareaFormElement(Document document) {
    return document.createElementNS(FORM_NS, TEXTAREA_FORM_ELEMENT);
  }

  public static boolean isTextareaFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && TEXTAREA_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFormattedTextFormElement(Document document) {
    return document.createElementNS(FORM_NS, FORMATTED_TEXT_FORM_ELEMENT);
  }

  public static boolean isFormattedTextFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && FORMATTED_TEXT_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNumberFormElement(Document document) {
    return document.createElementNS(FORM_NS, NUMBER_FORM_ELEMENT);
  }

  public static boolean isNumberFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && NUMBER_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createDateFormElement(Document document) {
    return document.createElementNS(FORM_NS, DATE_FORM_ELEMENT);
  }

  public static boolean isDateFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && DATE_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createComboboxFormElement(Document document) {
    return document.createElementNS(FORM_NS, COMBOBOX_FORM_ELEMENT);
  }

  public static boolean isComboboxFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && COMBOBOX_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListboxFormElement(Document document) {
    return document.createElementNS(FORM_NS, LISTBOX_FORM_ELEMENT);
  }

  public static boolean isListboxFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && LISTBOX_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCheckboxFormElement(Document document) {
    return document.createElementNS(FORM_NS, CHECKBOX_FORM_ELEMENT);
  }

  public static boolean isCheckboxFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && CHECKBOX_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPasswordFormElement(Document document) {
    return document.createElementNS(FORM_NS, PASSWORD_FORM_ELEMENT);
  }

  public static boolean isPasswordFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && PASSWORD_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFileFormElement(Document document) {
    return document.createElementNS(FORM_NS, FILE_FORM_ELEMENT);
  }

  public static boolean isFileFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && FILE_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTimeFormElement(Document document) {
    return document.createElementNS(FORM_NS, TIME_FORM_ELEMENT);
  }

  public static boolean isTimeFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && TIME_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFixedTextFormElement(Document document) {
    return document.createElementNS(FORM_NS, FIXED_TEXT_FORM_ELEMENT);
  }

  public static boolean isFixedTextFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && FIXED_TEXT_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createButtonFormElement(Document document) {
    return document.createElementNS(FORM_NS, BUTTON_FORM_ELEMENT);
  }

  public static boolean isButtonFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && BUTTON_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createImageFormElement(Document document) {
    return document.createElementNS(FORM_NS, IMAGE_FORM_ELEMENT);
  }

  public static boolean isImageFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && IMAGE_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createRadioFormElement(Document document) {
    return document.createElementNS(FORM_NS, RADIO_FORM_ELEMENT);
  }

  public static boolean isRadioFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && RADIO_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createFrameFormElement(Document document) {
    return document.createElementNS(FORM_NS, FRAME_FORM_ELEMENT);
  }

  public static boolean isFrameFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && FRAME_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createImageFrameFormElement(Document document) {
    return document.createElementNS(FORM_NS, IMAGE_FRAME_FORM_ELEMENT);
  }

  public static boolean isImageFrameFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && IMAGE_FRAME_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createHiddenFormElement(Document document) {
    return document.createElementNS(FORM_NS, HIDDEN_FORM_ELEMENT);
  }

  public static boolean isHiddenFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && HIDDEN_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGridFormElement(Document document) {
    return document.createElementNS(FORM_NS, GRID_FORM_ELEMENT);
  }

  public static boolean isGridFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && GRID_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createValueRangeFormElement(Document document) {
    return document.createElementNS(FORM_NS, VALUE_RANGE_FORM_ELEMENT);
  }

  public static boolean isValueRangeFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && VALUE_RANGE_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createGenericControlFormElement(Document document) {
    return document.createElementNS(FORM_NS, GENERIC_CONTROL_FORM_ELEMENT);
  }

  public static boolean isGenericControlFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && GENERIC_CONTROL_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createPropertyFormElement(Document document) {
    return document.createElementNS(FORM_NS, PROPERTY_FORM_ELEMENT);
  }

  public static boolean isPropertyFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && PROPERTY_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListPropertyFormElement(Document document) {
    return document.createElementNS(FORM_NS, LIST_PROPERTY_FORM_ELEMENT);
  }

  public static boolean isListPropertyFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && LIST_PROPERTY_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListValueFormElement(Document document) {
    return document.createElementNS(FORM_NS, LIST_VALUE_FORM_ELEMENT);
  }

  public static boolean isListValueFormElement(Element element) {
    return FORM_NS.equals(element.getNamespaceURI()) && LIST_VALUE_FORM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAnimateAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, ANIMATE_ANIM_ELEMENT);
  }

  public static boolean isAnimateAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && ANIMATE_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSetAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, SET_ANIM_ELEMENT);
  }

  public static boolean isSetAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && SET_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAnimateMotionAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, ANIMATEMOTION_ANIM_ELEMENT);
  }

  public static boolean isAnimateMotionAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && ANIMATEMOTION_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAnimateColorAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, ANIMATECOLOR_ANIM_ELEMENT);
  }

  public static boolean isAnimateColorAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && ANIMATECOLOR_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAnimateTransformAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, ANIMATETRANSFORM_ANIM_ELEMENT);
  }

  public static boolean isAnimateTransformAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && ANIMATETRANSFORM_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createTransitionFilterAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, TRANSITIONFILTER_ANIM_ELEMENT);
  }

  public static boolean isTransitionFilterAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && TRANSITIONFILTER_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createParAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, PAR_ANIM_ELEMENT);
  }

  public static boolean isParAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && PAR_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSeqAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, SEQ_ANIM_ELEMENT);
  }

  public static boolean isSeqAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && SEQ_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createIterateAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, ITERATE_ANIM_ELEMENT);
  }

  public static boolean isIterateAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && ITERATE_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createAudioAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, AUDIO_ANIM_ELEMENT);
  }

  public static boolean isAudioAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && AUDIO_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createParamAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, PARAM_ANIM_ELEMENT);
  }

  public static boolean isParamAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && PARAM_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createCommandAnimElement(Document document) {
    return document.createElementNS(ANIM_NS, COMMAND_ANIM_ELEMENT);
  }

  public static boolean isCommandAnimElement(Element element) {
    return ANIM_NS.equals(element.getNamespaceURI()) && COMMAND_ANIM_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNoteContinuationNoticeForwardTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NOTE_CONTINUATION_NOTICE_FORWARD_TEXT_ELEMENT);
  }

  public static boolean isNoteContinuationNoticeForwardTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NOTE_CONTINUATION_NOTICE_FORWARD_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createNoteContinuationNoticeBackwardTextElement(Document document) {
    return document.createElementNS(TEXT_NS, NOTE_CONTINUATION_NOTICE_BACKWARD_TEXT_ELEMENT);
  }

  public static boolean isNoteContinuationNoticeBackwardTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && NOTE_CONTINUATION_NOTICE_BACKWARD_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListLevelStyleNumberTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LIST_LEVEL_STYLE_NUMBER_TEXT_ELEMENT);
  }

  public static boolean isListLevelStyleNumberTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LIST_LEVEL_STYLE_NUMBER_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListLevelStyleBulletTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LIST_LEVEL_STYLE_BULLET_TEXT_ELEMENT);
  }

  public static boolean isListLevelStyleBulletTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LIST_LEVEL_STYLE_BULLET_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createListLevelStyleImageTextElement(Document document) {
    return document.createElementNS(TEXT_NS, LIST_LEVEL_STYLE_IMAGE_TEXT_ELEMENT);
  }

  public static boolean isListLevelStyleImageTextElement(Element element) {
    return TEXT_NS.equals(element.getNamespaceURI()) && LIST_LEVEL_STYLE_IMAGE_TEXT_ELEMENT.equals(element.getLocalName());
  }

  public static Element createSymbolImageChartElement(Document document) {
    return document.createElementNS(CHART_NS, SYMBOL_IMAGE_CHART_ELEMENT);
  }

  public static boolean isSymbolImageChartElement(Element element) {
    return CHART_NS.equals(element.getNamespaceURI()) && SYMBOL_IMAGE_CHART_ELEMENT.equals(element.getLocalName());
  }

  public static void setVersionOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, VERSION_OFFICE_ATTRIBUTE, value);
  }

  public static String getVersionOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, VERSION_OFFICE_ATTRIBUTE);
  }
  public static boolean hasVersionOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, VERSION_OFFICE_ATTRIBUTE);
  }

  public static void setMimetypeOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, MIMETYPE_OFFICE_ATTRIBUTE, value);
  }

  public static String getMimetypeOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, MIMETYPE_OFFICE_ATTRIBUTE);
  }

  public static void setNameConfigAttribute(Element element, String value) {
    element.setAttributeNS(CONFIG_NS, NAME_CONFIG_ATTRIBUTE, value);
  }

  public static String getNameConfigAttribute(Element element) {
    return element.getAttributeNS(CONFIG_NS, NAME_CONFIG_ATTRIBUTE);
  }

  public static void setTypeConfigAttribute(Element element, String value) {
    element.setAttributeNS(CONFIG_NS, TYPE_CONFIG_ATTRIBUTE, value);
  }

  public static String getTypeConfigAttribute(Element element) {
    return element.getAttributeNS(CONFIG_NS, TYPE_CONFIG_ATTRIBUTE);
  }

  public static void setLanguageScriptAttribute(Element element, String value) {
    element.setAttributeNS(SCRIPT_NS, LANGUAGE_SCRIPT_ATTRIBUTE, value);
  }

  public static String getLanguageScriptAttribute(Element element) {
    return element.getAttributeNS(SCRIPT_NS, LANGUAGE_SCRIPT_ATTRIBUTE);
  }

  public static void setIdTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ID_TEXT_ATTRIBUTE, value);
  }

  public static String getIdTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ID_TEXT_ATTRIBUTE);
  }

  public static void setCondStyleNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COND_STYLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getCondStyleNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COND_STYLE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasCondStyleNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COND_STYLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setClassNamesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CLASS_NAMES_TEXT_ATTRIBUTE, value);
  }

  public static String getClassNamesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CLASS_NAMES_TEXT_ATTRIBUTE);
  }
  public static boolean hasClassNamesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CLASS_NAMES_TEXT_ATTRIBUTE);
  }

  public static void setStyleNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, STYLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getStyleNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, STYLE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasStyleNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, STYLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setIsListHeaderTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, IS_LIST_HEADER_TEXT_ATTRIBUTE, value);
  }

  public static String getIsListHeaderTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, IS_LIST_HEADER_TEXT_ATTRIBUTE);
  }
  public static boolean hasIsListHeaderTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, IS_LIST_HEADER_TEXT_ATTRIBUTE);
  }

  public static void setStartValueTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, START_VALUE_TEXT_ATTRIBUTE, value);
  }

  public static String getStartValueTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, START_VALUE_TEXT_ATTRIBUTE);
  }
  public static boolean hasStartValueTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, START_VALUE_TEXT_ATTRIBUTE);
  }

  public static void setRestartNumberingTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, RESTART_NUMBERING_TEXT_ATTRIBUTE, value);
  }

  public static String getRestartNumberingTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, RESTART_NUMBERING_TEXT_ATTRIBUTE);
  }
  public static boolean hasRestartNumberingTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, RESTART_NUMBERING_TEXT_ATTRIBUTE);
  }

  public static void setOutlineLevelTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, OUTLINE_LEVEL_TEXT_ATTRIBUTE, value);
  }

  public static String getOutlineLevelTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, OUTLINE_LEVEL_TEXT_ATTRIBUTE);
  }

  public static void setMasterPageNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, MASTER_PAGE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getMasterPageNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, MASTER_PAGE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setContinueNumberingTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CONTINUE_NUMBERING_TEXT_ATTRIBUTE, value);
  }

  public static String getContinueNumberingTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CONTINUE_NUMBERING_TEXT_ATTRIBUTE);
  }
  public static boolean hasContinueNumberingTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CONTINUE_NUMBERING_TEXT_ATTRIBUTE);
  }

  public static void setLevelTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, LEVEL_TEXT_ATTRIBUTE, value);
  }

  public static String getLevelTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, LEVEL_TEXT_ATTRIBUTE);
  }
  public static boolean hasLevelTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, LEVEL_TEXT_ATTRIBUTE);
  }

  public static void setProtectionKeyTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, PROTECTION_KEY_TEXT_ATTRIBUTE, value);
  }

  public static String getProtectionKeyTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, PROTECTION_KEY_TEXT_ATTRIBUTE);
  }
  public static boolean hasProtectionKeyTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, PROTECTION_KEY_TEXT_ATTRIBUTE);
  }

  public static void setProtectedTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, PROTECTED_TEXT_ATTRIBUTE, value);
  }

  public static String getProtectedTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, PROTECTED_TEXT_ATTRIBUTE);
  }
  public static boolean hasProtectedTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, PROTECTED_TEXT_ATTRIBUTE);
  }

  public static void setNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, NAME_TEXT_ATTRIBUTE);
  }

  public static void setDisplayTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DISPLAY_TEXT_ATTRIBUTE, value);
  }

  public static String getDisplayTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DISPLAY_TEXT_ATTRIBUTE);
  }

  public static void setConditionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CONDITION_TEXT_ATTRIBUTE, value);
  }

  public static String getConditionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CONDITION_TEXT_ATTRIBUTE);
  }

  public static void setFilterNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, FILTER_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getFilterNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, FILTER_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasFilterNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, FILTER_NAME_TEXT_ATTRIBUTE);
  }

  public static void setSectionNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SECTION_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getSectionNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SECTION_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasSectionNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SECTION_NAME_TEXT_ATTRIBUTE);
  }

  public static void setShowXlinkAttribute(Element element, String value) {
    element.setAttributeNS(XLINK_NS, SHOW_XLINK_ATTRIBUTE, value);
  }

  public static String getShowXlinkAttribute(Element element) {
    return element.getAttributeNS(XLINK_NS, SHOW_XLINK_ATTRIBUTE);
  }
  public static boolean hasShowXlinkAttribute(Element element) {
    return element.hasAttributeNS(XLINK_NS, SHOW_XLINK_ATTRIBUTE);
  }

  public static void setTypeXlinkAttribute(Element element, String value) {
    element.setAttributeNS(XLINK_NS, TYPE_XLINK_ATTRIBUTE, value);
  }

  public static String getTypeXlinkAttribute(Element element) {
    return element.getAttributeNS(XLINK_NS, TYPE_XLINK_ATTRIBUTE);
  }
  public static boolean hasTypeXlinkAttribute(Element element) {
    return element.hasAttributeNS(XLINK_NS, TYPE_XLINK_ATTRIBUTE);
  }

  public static void setHrefXlinkAttribute(Element element, String value) {
    element.setAttributeNS(XLINK_NS, HREF_XLINK_ATTRIBUTE, value);
  }

  public static String getHrefXlinkAttribute(Element element) {
    return element.getAttributeNS(XLINK_NS, HREF_XLINK_ATTRIBUTE);
  }

  public static void setTrackChangesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, TRACK_CHANGES_TEXT_ATTRIBUTE, value);
  }

  public static String getTrackChangesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, TRACK_CHANGES_TEXT_ATTRIBUTE);
  }
  public static boolean hasTrackChangesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, TRACK_CHANGES_TEXT_ATTRIBUTE);
  }

  public static void setValueTypeOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, VALUE_TYPE_OFFICE_ATTRIBUTE, value);
  }

  public static String getValueTypeOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, VALUE_TYPE_OFFICE_ATTRIBUTE);
  }

  public static void setFormulaTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, FORMULA_TEXT_ATTRIBUTE, value);
  }

  public static String getFormulaTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, FORMULA_TEXT_ATTRIBUTE);
  }
  public static boolean hasFormulaTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, FORMULA_TEXT_ATTRIBUTE);
  }

  public static void setValueOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, VALUE_OFFICE_ATTRIBUTE, value);
  }

  public static String getValueOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, VALUE_OFFICE_ATTRIBUTE);
  }

  public static void setCurrencyOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, CURRENCY_OFFICE_ATTRIBUTE, value);
  }

  public static String getCurrencyOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, CURRENCY_OFFICE_ATTRIBUTE);
  }
  public static boolean hasCurrencyOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, CURRENCY_OFFICE_ATTRIBUTE);
  }

  public static void setDateValueOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, DATE_VALUE_OFFICE_ATTRIBUTE, value);
  }

  public static String getDateValueOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, DATE_VALUE_OFFICE_ATTRIBUTE);
  }

  public static void setTimeValueOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, TIME_VALUE_OFFICE_ATTRIBUTE, value);
  }

  public static String getTimeValueOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, TIME_VALUE_OFFICE_ATTRIBUTE);
  }

  public static void setBooleanValueOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, BOOLEAN_VALUE_OFFICE_ATTRIBUTE, value);
  }

  public static String getBooleanValueOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, BOOLEAN_VALUE_OFFICE_ATTRIBUTE);
  }

  public static void setStringValueOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, STRING_VALUE_OFFICE_ATTRIBUTE, value);
  }

  public static String getStringValueOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, STRING_VALUE_OFFICE_ATTRIBUTE);
  }
  public static boolean hasStringValueOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, STRING_VALUE_OFFICE_ATTRIBUTE);
  }

  public static void setSeparationCharacterTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SEPARATION_CHARACTER_TEXT_ATTRIBUTE, value);
  }

  public static String getSeparationCharacterTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SEPARATION_CHARACTER_TEXT_ATTRIBUTE);
  }
  public static boolean hasSeparationCharacterTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SEPARATION_CHARACTER_TEXT_ATTRIBUTE);
  }

  public static void setDisplayOutlineLevelTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DISPLAY_OUTLINE_LEVEL_TEXT_ATTRIBUTE, value);
  }

  public static String getDisplayOutlineLevelTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DISPLAY_OUTLINE_LEVEL_TEXT_ATTRIBUTE);
  }

  public static void setRelativeTabStopPositionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, RELATIVE_TAB_STOP_POSITION_TEXT_ATTRIBUTE, value);
  }

  public static String getRelativeTabStopPositionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, RELATIVE_TAB_STOP_POSITION_TEXT_ATTRIBUTE);
  }
  public static boolean hasRelativeTabStopPositionTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, RELATIVE_TAB_STOP_POSITION_TEXT_ATTRIBUTE);
  }

  public static void setIndexScopeTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, INDEX_SCOPE_TEXT_ATTRIBUTE, value);
  }

  public static String getIndexScopeTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, INDEX_SCOPE_TEXT_ATTRIBUTE);
  }
  public static boolean hasIndexScopeTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, INDEX_SCOPE_TEXT_ATTRIBUTE);
  }

  public static void setUseIndexSourceStylesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_INDEX_SOURCE_STYLES_TEXT_ATTRIBUTE, value);
  }

  public static String getUseIndexSourceStylesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_INDEX_SOURCE_STYLES_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseIndexSourceStylesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_INDEX_SOURCE_STYLES_TEXT_ATTRIBUTE);
  }

  public static void setUseIndexMarksTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_INDEX_MARKS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseIndexMarksTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_INDEX_MARKS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseIndexMarksTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_INDEX_MARKS_TEXT_ATTRIBUTE);
  }

  public static void setUseOutlineLevelTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_OUTLINE_LEVEL_TEXT_ATTRIBUTE, value);
  }

  public static String getUseOutlineLevelTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_OUTLINE_LEVEL_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseOutlineLevelTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_OUTLINE_LEVEL_TEXT_ATTRIBUTE);
  }

  public static void setCaptionSequenceFormatTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CAPTION_SEQUENCE_FORMAT_TEXT_ATTRIBUTE, value);
  }

  public static String getCaptionSequenceFormatTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CAPTION_SEQUENCE_FORMAT_TEXT_ATTRIBUTE);
  }
  public static boolean hasCaptionSequenceFormatTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CAPTION_SEQUENCE_FORMAT_TEXT_ATTRIBUTE);
  }

  public static void setCaptionSequenceNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CAPTION_SEQUENCE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getCaptionSequenceNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CAPTION_SEQUENCE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasCaptionSequenceNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CAPTION_SEQUENCE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setUseCaptionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_CAPTION_TEXT_ATTRIBUTE, value);
  }

  public static String getUseCaptionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_CAPTION_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseCaptionTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_CAPTION_TEXT_ATTRIBUTE);
  }

  public static void setUseOtherObjectsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_OTHER_OBJECTS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseOtherObjectsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_OTHER_OBJECTS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseOtherObjectsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_OTHER_OBJECTS_TEXT_ATTRIBUTE);
  }

  public static void setUseChartObjectsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_CHART_OBJECTS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseChartObjectsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_CHART_OBJECTS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseChartObjectsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_CHART_OBJECTS_TEXT_ATTRIBUTE);
  }

  public static void setUseDrawObjectsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_DRAW_OBJECTS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseDrawObjectsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_DRAW_OBJECTS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseDrawObjectsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_DRAW_OBJECTS_TEXT_ATTRIBUTE);
  }

  public static void setUseMathObjectsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_MATH_OBJECTS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseMathObjectsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_MATH_OBJECTS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseMathObjectsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_MATH_OBJECTS_TEXT_ATTRIBUTE);
  }

  public static void setUseSpreadsheetObjectsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_SPREADSHEET_OBJECTS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseSpreadsheetObjectsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_SPREADSHEET_OBJECTS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseSpreadsheetObjectsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_SPREADSHEET_OBJECTS_TEXT_ATTRIBUTE);
  }

  public static void setCopyOutlineLevelsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COPY_OUTLINE_LEVELS_TEXT_ATTRIBUTE, value);
  }

  public static String getCopyOutlineLevelsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COPY_OUTLINE_LEVELS_TEXT_ATTRIBUTE);
  }
  public static boolean hasCopyOutlineLevelsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COPY_OUTLINE_LEVELS_TEXT_ATTRIBUTE);
  }

  public static void setUseObjectsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_OBJECTS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseObjectsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_OBJECTS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseObjectsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_OBJECTS_TEXT_ATTRIBUTE);
  }

  public static void setUseFloatingFramesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_FLOATING_FRAMES_TEXT_ATTRIBUTE, value);
  }

  public static String getUseFloatingFramesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_FLOATING_FRAMES_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseFloatingFramesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_FLOATING_FRAMES_TEXT_ATTRIBUTE);
  }

  public static void setUseTablesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_TABLES_TEXT_ATTRIBUTE, value);
  }

  public static String getUseTablesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_TABLES_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseTablesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_TABLES_TEXT_ATTRIBUTE);
  }

  public static void setUseGraphicsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_GRAPHICS_TEXT_ATTRIBUTE, value);
  }

  public static String getUseGraphicsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_GRAPHICS_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseGraphicsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_GRAPHICS_TEXT_ATTRIBUTE);
  }

  public static void setIndexNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, INDEX_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getIndexNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, INDEX_NAME_TEXT_ATTRIBUTE);
  }

  public static void setSortAlgorithmTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SORT_ALGORITHM_TEXT_ATTRIBUTE, value);
  }

  public static String getSortAlgorithmTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SORT_ALGORITHM_TEXT_ATTRIBUTE);
  }
  public static boolean hasSortAlgorithmTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SORT_ALGORITHM_TEXT_ATTRIBUTE);
  }

  public static void setCountryFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, COUNTRY_FO_ATTRIBUTE, value);
  }

  public static String getCountryFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, COUNTRY_FO_ATTRIBUTE);
  }
  public static boolean hasCountryFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, COUNTRY_FO_ATTRIBUTE);
  }

  public static void setLanguageFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, LANGUAGE_FO_ATTRIBUTE, value);
  }

  public static String getLanguageFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, LANGUAGE_FO_ATTRIBUTE);
  }
  public static boolean hasLanguageFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, LANGUAGE_FO_ATTRIBUTE);
  }

  public static void setCommaSeparatedTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COMMA_SEPARATED_TEXT_ATTRIBUTE, value);
  }

  public static String getCommaSeparatedTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COMMA_SEPARATED_TEXT_ATTRIBUTE);
  }
  public static boolean hasCommaSeparatedTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COMMA_SEPARATED_TEXT_ATTRIBUTE);
  }

  public static void setCapitalizeEntriesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CAPITALIZE_ENTRIES_TEXT_ATTRIBUTE, value);
  }

  public static String getCapitalizeEntriesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CAPITALIZE_ENTRIES_TEXT_ATTRIBUTE);
  }
  public static boolean hasCapitalizeEntriesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CAPITALIZE_ENTRIES_TEXT_ATTRIBUTE);
  }

  public static void setUseKeysAsEntriesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, USE_KEYS_AS_ENTRIES_TEXT_ATTRIBUTE, value);
  }

  public static String getUseKeysAsEntriesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, USE_KEYS_AS_ENTRIES_TEXT_ATTRIBUTE);
  }
  public static boolean hasUseKeysAsEntriesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, USE_KEYS_AS_ENTRIES_TEXT_ATTRIBUTE);
  }

  public static void setCombineEntriesWithPpTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COMBINE_ENTRIES_WITH_PP_TEXT_ATTRIBUTE, value);
  }

  public static String getCombineEntriesWithPpTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COMBINE_ENTRIES_WITH_PP_TEXT_ATTRIBUTE);
  }
  public static boolean hasCombineEntriesWithPpTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COMBINE_ENTRIES_WITH_PP_TEXT_ATTRIBUTE);
  }

  public static void setCombineEntriesWithDashTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COMBINE_ENTRIES_WITH_DASH_TEXT_ATTRIBUTE, value);
  }

  public static String getCombineEntriesWithDashTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COMBINE_ENTRIES_WITH_DASH_TEXT_ATTRIBUTE);
  }
  public static boolean hasCombineEntriesWithDashTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COMBINE_ENTRIES_WITH_DASH_TEXT_ATTRIBUTE);
  }

  public static void setCombineEntriesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COMBINE_ENTRIES_TEXT_ATTRIBUTE, value);
  }

  public static String getCombineEntriesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COMBINE_ENTRIES_TEXT_ATTRIBUTE);
  }
  public static boolean hasCombineEntriesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COMBINE_ENTRIES_TEXT_ATTRIBUTE);
  }

  public static void setAlphabeticalSeparatorsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ALPHABETICAL_SEPARATORS_TEXT_ATTRIBUTE, value);
  }

  public static String getAlphabeticalSeparatorsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ALPHABETICAL_SEPARATORS_TEXT_ATTRIBUTE);
  }
  public static boolean hasAlphabeticalSeparatorsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ALPHABETICAL_SEPARATORS_TEXT_ATTRIBUTE);
  }

  public static void setMainEntryStyleNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, MAIN_ENTRY_STYLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getMainEntryStyleNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, MAIN_ENTRY_STYLE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasMainEntryStyleNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, MAIN_ENTRY_STYLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setIgnoreCaseTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, IGNORE_CASE_TEXT_ATTRIBUTE, value);
  }

  public static String getIgnoreCaseTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, IGNORE_CASE_TEXT_ATTRIBUTE);
  }
  public static boolean hasIgnoreCaseTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, IGNORE_CASE_TEXT_ATTRIBUTE);
  }

  public static void setBibliographyTypeTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, BIBLIOGRAPHY_TYPE_TEXT_ATTRIBUTE, value);
  }

  public static String getBibliographyTypeTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, BIBLIOGRAPHY_TYPE_TEXT_ATTRIBUTE);
  }

  public static void setBibliographyDataFieldTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, BIBLIOGRAPHY_DATA_FIELD_TEXT_ATTRIBUTE, value);
  }

  public static String getBibliographyDataFieldTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, BIBLIOGRAPHY_DATA_FIELD_TEXT_ATTRIBUTE);
  }

  public static void setLeaderCharStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEADER_CHAR_STYLE_ATTRIBUTE, value);
  }

  public static String getLeaderCharStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEADER_CHAR_STYLE_ATTRIBUTE);
  }
  public static boolean hasLeaderCharStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LEADER_CHAR_STYLE_ATTRIBUTE);
  }

  public static void setTypeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TYPE_STYLE_ATTRIBUTE, value);
  }

  public static String getTypeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TYPE_STYLE_ATTRIBUTE);
  }

  public static void setPositionStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, POSITION_STYLE_ATTRIBUTE, value);
  }

  public static String getPositionStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, POSITION_STYLE_ATTRIBUTE);
  }

  public static void setIsSubTableTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, IS_SUB_TABLE_TABLE_ATTRIBUTE, value);
  }

  public static String getIsSubTableTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, IS_SUB_TABLE_TABLE_ATTRIBUTE);
  }
  public static boolean hasIsSubTableTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, IS_SUB_TABLE_TABLE_ATTRIBUTE);
  }

  public static void setPrintRangesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PRINT_RANGES_TABLE_ATTRIBUTE, value);
  }

  public static String getPrintRangesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PRINT_RANGES_TABLE_ATTRIBUTE);
  }
  public static boolean hasPrintRangesTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PRINT_RANGES_TABLE_ATTRIBUTE);
  }

  public static void setPrintTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PRINT_TABLE_ATTRIBUTE, value);
  }

  public static String getPrintTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PRINT_TABLE_ATTRIBUTE);
  }
  public static boolean hasPrintTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PRINT_TABLE_ATTRIBUTE);
  }

  public static void setProtectionKeyTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PROTECTION_KEY_TABLE_ATTRIBUTE, value);
  }

  public static String getProtectionKeyTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PROTECTION_KEY_TABLE_ATTRIBUTE);
  }
  public static boolean hasProtectionKeyTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PROTECTION_KEY_TABLE_ATTRIBUTE);
  }

  public static void setProtectedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PROTECTED_TABLE_ATTRIBUTE, value);
  }

  public static String getProtectedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PROTECTED_TABLE_ATTRIBUTE);
  }
  public static boolean hasProtectedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PROTECTED_TABLE_ATTRIBUTE);
  }

  public static void setStyleNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, STYLE_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getStyleNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, STYLE_NAME_TABLE_ATTRIBUTE);
  }
  public static boolean hasStyleNameTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, STYLE_NAME_TABLE_ATTRIBUTE);
  }

  public static void setNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NAME_TABLE_ATTRIBUTE);
  }
  public static boolean hasNameTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NAME_TABLE_ATTRIBUTE);
  }

  public static void setVisibilityTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, VISIBILITY_TABLE_ATTRIBUTE, value);
  }

  public static String getVisibilityTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, VISIBILITY_TABLE_ATTRIBUTE);
  }
  public static boolean hasVisibilityTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, VISIBILITY_TABLE_ATTRIBUTE);
  }

  public static void setDefaultCellStyleNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DEFAULT_CELL_STYLE_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getDefaultCellStyleNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DEFAULT_CELL_STYLE_NAME_TABLE_ATTRIBUTE);
  }
  public static boolean hasDefaultCellStyleNameTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DEFAULT_CELL_STYLE_NAME_TABLE_ATTRIBUTE);
  }

  public static void setNumberRowsRepeatedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NUMBER_ROWS_REPEATED_TABLE_ATTRIBUTE, value);
  }

  public static String getNumberRowsRepeatedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NUMBER_ROWS_REPEATED_TABLE_ATTRIBUTE);
  }
  public static boolean hasNumberRowsRepeatedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NUMBER_ROWS_REPEATED_TABLE_ATTRIBUTE);
  }

  public static void setNumberMatrixRowsSpannedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NUMBER_MATRIX_ROWS_SPANNED_TABLE_ATTRIBUTE, value);
  }

  public static String getNumberMatrixRowsSpannedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NUMBER_MATRIX_ROWS_SPANNED_TABLE_ATTRIBUTE);
  }
  public static boolean hasNumberMatrixRowsSpannedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NUMBER_MATRIX_ROWS_SPANNED_TABLE_ATTRIBUTE);
  }

  public static void setNumberMatrixColumnsSpannedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NUMBER_MATRIX_COLUMNS_SPANNED_TABLE_ATTRIBUTE, value);
  }

  public static String getNumberMatrixColumnsSpannedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NUMBER_MATRIX_COLUMNS_SPANNED_TABLE_ATTRIBUTE);
  }
  public static boolean hasNumberMatrixColumnsSpannedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NUMBER_MATRIX_COLUMNS_SPANNED_TABLE_ATTRIBUTE);
  }

  public static void setNumberRowsSpannedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NUMBER_ROWS_SPANNED_TABLE_ATTRIBUTE, value);
  }

  public static String getNumberRowsSpannedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NUMBER_ROWS_SPANNED_TABLE_ATTRIBUTE);
  }
  public static boolean hasNumberRowsSpannedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NUMBER_ROWS_SPANNED_TABLE_ATTRIBUTE);
  }

  public static void setNumberColumnsSpannedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NUMBER_COLUMNS_SPANNED_TABLE_ATTRIBUTE, value);
  }

  public static String getNumberColumnsSpannedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NUMBER_COLUMNS_SPANNED_TABLE_ATTRIBUTE);
  }
  public static boolean hasNumberColumnsSpannedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NUMBER_COLUMNS_SPANNED_TABLE_ATTRIBUTE);
  }

  public static void setProtectTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PROTECT_TABLE_ATTRIBUTE, value);
  }

  public static String getProtectTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PROTECT_TABLE_ATTRIBUTE);
  }
  public static boolean hasProtectTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PROTECT_TABLE_ATTRIBUTE);
  }

  public static void setFormulaTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, FORMULA_TABLE_ATTRIBUTE, value);
  }

  public static String getFormulaTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, FORMULA_TABLE_ATTRIBUTE);
  }
  public static boolean hasFormulaTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, FORMULA_TABLE_ATTRIBUTE);
  }

  public static void setContentValidationNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CONTENT_VALIDATION_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getContentValidationNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CONTENT_VALIDATION_NAME_TABLE_ATTRIBUTE);
  }
  public static boolean hasContentValidationNameTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CONTENT_VALIDATION_NAME_TABLE_ATTRIBUTE);
  }

  public static void setNumberColumnsRepeatedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NUMBER_COLUMNS_REPEATED_TABLE_ATTRIBUTE, value);
  }

  public static String getNumberColumnsRepeatedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NUMBER_COLUMNS_REPEATED_TABLE_ATTRIBUTE);
  }
  public static boolean hasNumberColumnsRepeatedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NUMBER_COLUMNS_REPEATED_TABLE_ATTRIBUTE);
  }

  public static void setDisplayTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DISPLAY_TABLE_ATTRIBUTE, value);
  }

  public static String getDisplayTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DISPLAY_TABLE_ATTRIBUTE);
  }
  public static boolean hasDisplayTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DISPLAY_TABLE_ATTRIBUTE);
  }

  public static void setRefreshDelayTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, REFRESH_DELAY_TABLE_ATTRIBUTE, value);
  }

  public static String getRefreshDelayTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, REFRESH_DELAY_TABLE_ATTRIBUTE);
  }
  public static boolean hasRefreshDelayTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, REFRESH_DELAY_TABLE_ATTRIBUTE);
  }

  public static void setFilterOptionsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, FILTER_OPTIONS_TABLE_ATTRIBUTE, value);
  }

  public static String getFilterOptionsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, FILTER_OPTIONS_TABLE_ATTRIBUTE);
  }
  public static boolean hasFilterOptionsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, FILTER_OPTIONS_TABLE_ATTRIBUTE);
  }

  public static void setFilterNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, FILTER_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getFilterNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, FILTER_NAME_TABLE_ATTRIBUTE);
  }
  public static boolean hasFilterNameTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, FILTER_NAME_TABLE_ATTRIBUTE);
  }

  public static void setActuateXlinkAttribute(Element element, String value) {
    element.setAttributeNS(XLINK_NS, ACTUATE_XLINK_ATTRIBUTE, value);
  }

  public static String getActuateXlinkAttribute(Element element) {
    return element.getAttributeNS(XLINK_NS, ACTUATE_XLINK_ATTRIBUTE);
  }
  public static boolean hasActuateXlinkAttribute(Element element) {
    return element.hasAttributeNS(XLINK_NS, ACTUATE_XLINK_ATTRIBUTE);
  }

  public static void setTableNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TABLE_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getTableNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TABLE_NAME_TABLE_ATTRIBUTE);
  }
  public static boolean hasTableNameTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, TABLE_NAME_TABLE_ATTRIBUTE);
  }

  public static void setModeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MODE_TABLE_ATTRIBUTE, value);
  }

  public static String getModeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MODE_TABLE_ATTRIBUTE);
  }
  public static boolean hasModeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, MODE_TABLE_ATTRIBUTE);
  }

  public static void setCommentTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, COMMENT_TABLE_ATTRIBUTE, value);
  }

  public static String getCommentTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, COMMENT_TABLE_ATTRIBUTE);
  }
  public static boolean hasCommentTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, COMMENT_TABLE_ATTRIBUTE);
  }

  public static void setCopyFormulasTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, COPY_FORMULAS_TABLE_ATTRIBUTE, value);
  }

  public static String getCopyFormulasTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, COPY_FORMULAS_TABLE_ATTRIBUTE);
  }
  public static boolean hasCopyFormulasTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, COPY_FORMULAS_TABLE_ATTRIBUTE);
  }

  public static void setCopyStylesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, COPY_STYLES_TABLE_ATTRIBUTE, value);
  }

  public static String getCopyStylesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, COPY_STYLES_TABLE_ATTRIBUTE);
  }
  public static boolean hasCopyStylesTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, COPY_STYLES_TABLE_ATTRIBUTE);
  }

  public static void setCopyBackTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, COPY_BACK_TABLE_ATTRIBUTE, value);
  }

  public static String getCopyBackTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, COPY_BACK_TABLE_ATTRIBUTE);
  }
  public static boolean hasCopyBackTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, COPY_BACK_TABLE_ATTRIBUTE);
  }

  public static void setBorderColorTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, BORDER_COLOR_TABLE_ATTRIBUTE, value);
  }

  public static String getBorderColorTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, BORDER_COLOR_TABLE_ATTRIBUTE);
  }
  public static boolean hasBorderColorTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, BORDER_COLOR_TABLE_ATTRIBUTE);
  }

  public static void setDisplayBorderTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DISPLAY_BORDER_TABLE_ATTRIBUTE, value);
  }

  public static String getDisplayBorderTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DISPLAY_BORDER_TABLE_ATTRIBUTE);
  }
  public static boolean hasDisplayBorderTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DISPLAY_BORDER_TABLE_ATTRIBUTE);
  }

  public static void setIsActiveTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, IS_ACTIVE_TABLE_ATTRIBUTE, value);
  }

  public static String getIsActiveTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, IS_ACTIVE_TABLE_ATTRIBUTE);
  }

  public static void setScenarioRangesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SCENARIO_RANGES_TABLE_ATTRIBUTE, value);
  }

  public static String getScenarioRangesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SCENARIO_RANGES_TABLE_ATTRIBUTE);
  }

  public static void setLastRowSpannedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, LAST_ROW_SPANNED_TABLE_ATTRIBUTE, value);
  }

  public static String getLastRowSpannedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, LAST_ROW_SPANNED_TABLE_ATTRIBUTE);
  }

  public static void setLastColumnSpannedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, LAST_COLUMN_SPANNED_TABLE_ATTRIBUTE, value);
  }

  public static String getLastColumnSpannedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, LAST_COLUMN_SPANNED_TABLE_ATTRIBUTE);
  }

  public static void setIndexTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, INDEX_TABLE_ATTRIBUTE, value);
  }

  public static String getIndexTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, INDEX_TABLE_ATTRIBUTE);
  }

  public static void setContainsErrorTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CONTAINS_ERROR_TABLE_ATTRIBUTE, value);
  }

  public static String getContainsErrorTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CONTAINS_ERROR_TABLE_ATTRIBUTE);
  }
  public static boolean hasContainsErrorTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CONTAINS_ERROR_TABLE_ATTRIBUTE);
  }

  public static void setDirectionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DIRECTION_TABLE_ATTRIBUTE, value);
  }

  public static String getDirectionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DIRECTION_TABLE_ATTRIBUTE);
  }

  public static void setCellRangeAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CELL_RANGE_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getCellRangeAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CELL_RANGE_ADDRESS_TABLE_ATTRIBUTE);
  }
  public static boolean hasCellRangeAddressTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CELL_RANGE_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setMarkedInvalidTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MARKED_INVALID_TABLE_ATTRIBUTE, value);
  }

  public static String getMarkedInvalidTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MARKED_INVALID_TABLE_ATTRIBUTE);
  }

  public static void setNullYearTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, NULL_YEAR_TABLE_ATTRIBUTE, value);
  }

  public static String getNullYearTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, NULL_YEAR_TABLE_ATTRIBUTE);
  }
  public static boolean hasNullYearTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, NULL_YEAR_TABLE_ATTRIBUTE);
  }

  public static void setUseRegularExpressionsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, USE_REGULAR_EXPRESSIONS_TABLE_ATTRIBUTE, value);
  }

  public static String getUseRegularExpressionsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, USE_REGULAR_EXPRESSIONS_TABLE_ATTRIBUTE);
  }
  public static boolean hasUseRegularExpressionsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, USE_REGULAR_EXPRESSIONS_TABLE_ATTRIBUTE);
  }

  public static void setAutomaticFindLabelsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, AUTOMATIC_FIND_LABELS_TABLE_ATTRIBUTE, value);
  }

  public static String getAutomaticFindLabelsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, AUTOMATIC_FIND_LABELS_TABLE_ATTRIBUTE);
  }
  public static boolean hasAutomaticFindLabelsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, AUTOMATIC_FIND_LABELS_TABLE_ATTRIBUTE);
  }

  public static void setSearchCriteriaMustApplyToWholeCellTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_TABLE_ATTRIBUTE, value);
  }

  public static String getSearchCriteriaMustApplyToWholeCellTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_TABLE_ATTRIBUTE);
  }
  public static boolean hasSearchCriteriaMustApplyToWholeCellTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_TABLE_ATTRIBUTE);
  }

  public static void setPrecisionAsShownTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PRECISION_AS_SHOWN_TABLE_ATTRIBUTE, value);
  }

  public static String getPrecisionAsShownTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PRECISION_AS_SHOWN_TABLE_ATTRIBUTE);
  }
  public static boolean hasPrecisionAsShownTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PRECISION_AS_SHOWN_TABLE_ATTRIBUTE);
  }

  public static void setCaseSensitiveTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CASE_SENSITIVE_TABLE_ATTRIBUTE, value);
  }

  public static String getCaseSensitiveTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CASE_SENSITIVE_TABLE_ATTRIBUTE);
  }
  public static boolean hasCaseSensitiveTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CASE_SENSITIVE_TABLE_ATTRIBUTE);
  }

  public static void setDateValueTypeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATE_VALUE_TYPE_TABLE_ATTRIBUTE, value);
  }

  public static String getDateValueTypeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATE_VALUE_TYPE_TABLE_ATTRIBUTE);
  }
  public static boolean hasDateValueTypeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DATE_VALUE_TYPE_TABLE_ATTRIBUTE);
  }

  public static void setValueTypeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, VALUE_TYPE_TABLE_ATTRIBUTE, value);
  }

  public static String getValueTypeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, VALUE_TYPE_TABLE_ATTRIBUTE);
  }
  public static boolean hasValueTypeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, VALUE_TYPE_TABLE_ATTRIBUTE);
  }

  public static void setMaximumDifferenceTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MAXIMUM_DIFFERENCE_TABLE_ATTRIBUTE, value);
  }

  public static String getMaximumDifferenceTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MAXIMUM_DIFFERENCE_TABLE_ATTRIBUTE);
  }
  public static boolean hasMaximumDifferenceTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, MAXIMUM_DIFFERENCE_TABLE_ATTRIBUTE);
  }

  public static void setStepsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, STEPS_TABLE_ATTRIBUTE, value);
  }

  public static String getStepsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, STEPS_TABLE_ATTRIBUTE);
  }
  public static boolean hasStepsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, STEPS_TABLE_ATTRIBUTE);
  }

  public static void setStatusTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, STATUS_TABLE_ATTRIBUTE, value);
  }

  public static String getStatusTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, STATUS_TABLE_ATTRIBUTE);
  }
  public static boolean hasStatusTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, STATUS_TABLE_ATTRIBUTE);
  }

  public static void setDisplayListTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DISPLAY_LIST_TABLE_ATTRIBUTE, value);
  }

  public static String getDisplayListTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DISPLAY_LIST_TABLE_ATTRIBUTE);
  }
  public static boolean hasDisplayListTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DISPLAY_LIST_TABLE_ATTRIBUTE);
  }

  public static void setAllowEmptyCellTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ALLOW_EMPTY_CELL_TABLE_ATTRIBUTE, value);
  }

  public static String getAllowEmptyCellTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ALLOW_EMPTY_CELL_TABLE_ATTRIBUTE);
  }
  public static boolean hasAllowEmptyCellTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, ALLOW_EMPTY_CELL_TABLE_ATTRIBUTE);
  }

  public static void setBaseCellAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, BASE_CELL_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getBaseCellAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, BASE_CELL_ADDRESS_TABLE_ATTRIBUTE);
  }
  public static boolean hasBaseCellAddressTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, BASE_CELL_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setConditionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CONDITION_TABLE_ATTRIBUTE, value);
  }

  public static String getConditionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CONDITION_TABLE_ATTRIBUTE);
  }
  public static boolean hasConditionTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CONDITION_TABLE_ATTRIBUTE);
  }

  public static void setTitleTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TITLE_TABLE_ATTRIBUTE, value);
  }

  public static String getTitleTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TITLE_TABLE_ATTRIBUTE);
  }
  public static boolean hasTitleTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, TITLE_TABLE_ATTRIBUTE);
  }

  public static void setMessageTypeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MESSAGE_TYPE_TABLE_ATTRIBUTE, value);
  }

  public static String getMessageTypeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MESSAGE_TYPE_TABLE_ATTRIBUTE);
  }
  public static boolean hasMessageTypeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, MESSAGE_TYPE_TABLE_ATTRIBUTE);
  }

  public static void setExecuteTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, EXECUTE_TABLE_ATTRIBUTE, value);
  }

  public static String getExecuteTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, EXECUTE_TABLE_ATTRIBUTE);
  }
  public static boolean hasExecuteTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, EXECUTE_TABLE_ATTRIBUTE);
  }

  public static void setOrientationTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ORIENTATION_TABLE_ATTRIBUTE, value);
  }

  public static String getOrientationTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ORIENTATION_TABLE_ATTRIBUTE);
  }

  public static void setDataCellRangeAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATA_CELL_RANGE_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getDataCellRangeAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATA_CELL_RANGE_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setLabelCellRangeAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, LABEL_CELL_RANGE_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getLabelCellRangeAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, LABEL_CELL_RANGE_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setRangeUsableAsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, RANGE_USABLE_AS_TABLE_ATTRIBUTE, value);
  }

  public static String getRangeUsableAsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, RANGE_USABLE_AS_TABLE_ATTRIBUTE);
  }
  public static boolean hasRangeUsableAsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, RANGE_USABLE_AS_TABLE_ATTRIBUTE);
  }

  public static void setExpressionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, EXPRESSION_TABLE_ATTRIBUTE, value);
  }

  public static String getExpressionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, EXPRESSION_TABLE_ATTRIBUTE);
  }

  public static void setTargetRangeAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TARGET_RANGE_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getTargetRangeAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TARGET_RANGE_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setDisplayFilterButtonsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DISPLAY_FILTER_BUTTONS_TABLE_ATTRIBUTE, value);
  }

  public static String getDisplayFilterButtonsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DISPLAY_FILTER_BUTTONS_TABLE_ATTRIBUTE);
  }
  public static boolean hasDisplayFilterButtonsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DISPLAY_FILTER_BUTTONS_TABLE_ATTRIBUTE);
  }

  public static void setContainsHeaderTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CONTAINS_HEADER_TABLE_ATTRIBUTE, value);
  }

  public static String getContainsHeaderTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CONTAINS_HEADER_TABLE_ATTRIBUTE);
  }
  public static boolean hasContainsHeaderTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CONTAINS_HEADER_TABLE_ATTRIBUTE);
  }

  public static void setHasPersistentDataTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, HAS_PERSISTENT_DATA_TABLE_ATTRIBUTE, value);
  }

  public static String getHasPersistentDataTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, HAS_PERSISTENT_DATA_TABLE_ATTRIBUTE);
  }
  public static boolean hasHasPersistentDataTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, HAS_PERSISTENT_DATA_TABLE_ATTRIBUTE);
  }

  public static void setOnUpdateKeepSizeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ON_UPDATE_KEEP_SIZE_TABLE_ATTRIBUTE, value);
  }

  public static String getOnUpdateKeepSizeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ON_UPDATE_KEEP_SIZE_TABLE_ATTRIBUTE);
  }
  public static boolean hasOnUpdateKeepSizeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, ON_UPDATE_KEEP_SIZE_TABLE_ATTRIBUTE);
  }

  public static void setOnUpdateKeepStylesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ON_UPDATE_KEEP_STYLES_TABLE_ATTRIBUTE, value);
  }

  public static String getOnUpdateKeepStylesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ON_UPDATE_KEEP_STYLES_TABLE_ATTRIBUTE);
  }
  public static boolean hasOnUpdateKeepStylesTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, ON_UPDATE_KEEP_STYLES_TABLE_ATTRIBUTE);
  }

  public static void setIsSelectionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, IS_SELECTION_TABLE_ATTRIBUTE, value);
  }

  public static String getIsSelectionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, IS_SELECTION_TABLE_ATTRIBUTE);
  }
  public static boolean hasIsSelectionTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, IS_SELECTION_TABLE_ATTRIBUTE);
  }

  public static void setParseSqlStatementTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PARSE_SQL_STATEMENT_TABLE_ATTRIBUTE, value);
  }

  public static String getParseSqlStatementTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PARSE_SQL_STATEMENT_TABLE_ATTRIBUTE);
  }
  public static boolean hasParseSqlStatementTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PARSE_SQL_STATEMENT_TABLE_ATTRIBUTE);
  }

  public static void setSqlStatementTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SQL_STATEMENT_TABLE_ATTRIBUTE, value);
  }

  public static String getSqlStatementTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SQL_STATEMENT_TABLE_ATTRIBUTE);
  }

  public static void setDatabaseNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATABASE_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getDatabaseNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATABASE_NAME_TABLE_ATTRIBUTE);
  }

  public static void setDatabaseTableNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATABASE_TABLE_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getDatabaseTableNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATABASE_TABLE_NAME_TABLE_ATTRIBUTE);
  }

  public static void setQueryNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, QUERY_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getQueryNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, QUERY_NAME_TABLE_ATTRIBUTE);
  }

  public static void setAlgorithmTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ALGORITHM_TABLE_ATTRIBUTE, value);
  }

  public static String getAlgorithmTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ALGORITHM_TABLE_ATTRIBUTE);
  }
  public static boolean hasAlgorithmTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, ALGORITHM_TABLE_ATTRIBUTE);
  }

  public static void setCountryTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, COUNTRY_TABLE_ATTRIBUTE, value);
  }

  public static String getCountryTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, COUNTRY_TABLE_ATTRIBUTE);
  }
  public static boolean hasCountryTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, COUNTRY_TABLE_ATTRIBUTE);
  }

  public static void setLanguageTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, LANGUAGE_TABLE_ATTRIBUTE, value);
  }

  public static String getLanguageTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, LANGUAGE_TABLE_ATTRIBUTE);
  }
  public static boolean hasLanguageTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, LANGUAGE_TABLE_ATTRIBUTE);
  }

  public static void setBindStylesToContentTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, BIND_STYLES_TO_CONTENT_TABLE_ATTRIBUTE, value);
  }

  public static String getBindStylesToContentTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, BIND_STYLES_TO_CONTENT_TABLE_ATTRIBUTE);
  }
  public static boolean hasBindStylesToContentTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, BIND_STYLES_TO_CONTENT_TABLE_ATTRIBUTE);
  }

  public static void setOrderTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ORDER_TABLE_ATTRIBUTE, value);
  }

  public static String getOrderTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ORDER_TABLE_ATTRIBUTE);
  }
  public static boolean hasOrderTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, ORDER_TABLE_ATTRIBUTE);
  }

  public static void setDataTypeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATA_TYPE_TABLE_ATTRIBUTE, value);
  }

  public static String getDataTypeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATA_TYPE_TABLE_ATTRIBUTE);
  }
  public static boolean hasDataTypeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DATA_TYPE_TABLE_ATTRIBUTE);
  }

  public static void setFieldNumberTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, FIELD_NUMBER_TABLE_ATTRIBUTE, value);
  }

  public static String getFieldNumberTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, FIELD_NUMBER_TABLE_ATTRIBUTE);
  }

  public static void setPageBreaksOnGroupChangeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PAGE_BREAKS_ON_GROUP_CHANGE_TABLE_ATTRIBUTE, value);
  }

  public static String getPageBreaksOnGroupChangeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PAGE_BREAKS_ON_GROUP_CHANGE_TABLE_ATTRIBUTE);
  }
  public static boolean hasPageBreaksOnGroupChangeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PAGE_BREAKS_ON_GROUP_CHANGE_TABLE_ATTRIBUTE);
  }

  public static void setGroupByFieldNumberTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, GROUP_BY_FIELD_NUMBER_TABLE_ATTRIBUTE, value);
  }

  public static String getGroupByFieldNumberTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, GROUP_BY_FIELD_NUMBER_TABLE_ATTRIBUTE);
  }

  public static void setFunctionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, FUNCTION_TABLE_ATTRIBUTE, value);
  }

  public static String getFunctionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, FUNCTION_TABLE_ATTRIBUTE);
  }

  public static void setDisplayDuplicatesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DISPLAY_DUPLICATES_TABLE_ATTRIBUTE, value);
  }

  public static String getDisplayDuplicatesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DISPLAY_DUPLICATES_TABLE_ATTRIBUTE);
  }
  public static boolean hasDisplayDuplicatesTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DISPLAY_DUPLICATES_TABLE_ATTRIBUTE);
  }

  public static void setConditionSourceRangeAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CONDITION_SOURCE_RANGE_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getConditionSourceRangeAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CONDITION_SOURCE_RANGE_ADDRESS_TABLE_ATTRIBUTE);
  }
  public static boolean hasConditionSourceRangeAddressTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CONDITION_SOURCE_RANGE_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setConditionSourceTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CONDITION_SOURCE_TABLE_ATTRIBUTE, value);
  }

  public static String getConditionSourceTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CONDITION_SOURCE_TABLE_ATTRIBUTE);
  }
  public static boolean hasConditionSourceTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CONDITION_SOURCE_TABLE_ATTRIBUTE);
  }

  public static void setOperatorTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, OPERATOR_TABLE_ATTRIBUTE, value);
  }

  public static String getOperatorTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, OPERATOR_TABLE_ATTRIBUTE);
  }

  public static void setValueTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, VALUE_TABLE_ATTRIBUTE, value);
  }

  public static String getValueTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, VALUE_TABLE_ATTRIBUTE);
  }

  public static void setDrillDownOnDoubleClickTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DRILL_DOWN_ON_DOUBLE_CLICK_TABLE_ATTRIBUTE, value);
  }

  public static String getDrillDownOnDoubleClickTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DRILL_DOWN_ON_DOUBLE_CLICK_TABLE_ATTRIBUTE);
  }
  public static boolean hasDrillDownOnDoubleClickTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, DRILL_DOWN_ON_DOUBLE_CLICK_TABLE_ATTRIBUTE);
  }

  public static void setShowFilterButtonTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SHOW_FILTER_BUTTON_TABLE_ATTRIBUTE, value);
  }

  public static String getShowFilterButtonTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SHOW_FILTER_BUTTON_TABLE_ATTRIBUTE);
  }
  public static boolean hasShowFilterButtonTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, SHOW_FILTER_BUTTON_TABLE_ATTRIBUTE);
  }

  public static void setButtonsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, BUTTONS_TABLE_ATTRIBUTE, value);
  }

  public static String getButtonsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, BUTTONS_TABLE_ATTRIBUTE);
  }
  public static boolean hasButtonsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, BUTTONS_TABLE_ATTRIBUTE);
  }

  public static void setIdentifyCategoriesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, IDENTIFY_CATEGORIES_TABLE_ATTRIBUTE, value);
  }

  public static String getIdentifyCategoriesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, IDENTIFY_CATEGORIES_TABLE_ATTRIBUTE);
  }
  public static boolean hasIdentifyCategoriesTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, IDENTIFY_CATEGORIES_TABLE_ATTRIBUTE);
  }

  public static void setIgnoreEmptyRowsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, IGNORE_EMPTY_ROWS_TABLE_ATTRIBUTE, value);
  }

  public static String getIgnoreEmptyRowsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, IGNORE_EMPTY_ROWS_TABLE_ATTRIBUTE);
  }
  public static boolean hasIgnoreEmptyRowsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, IGNORE_EMPTY_ROWS_TABLE_ATTRIBUTE);
  }

  public static void setGrandTotalTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, GRAND_TOTAL_TABLE_ATTRIBUTE, value);
  }

  public static String getGrandTotalTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, GRAND_TOTAL_TABLE_ATTRIBUTE);
  }
  public static boolean hasGrandTotalTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, GRAND_TOTAL_TABLE_ATTRIBUTE);
  }

  public static void setApplicationDataTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, APPLICATION_DATA_TABLE_ATTRIBUTE, value);
  }

  public static String getApplicationDataTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, APPLICATION_DATA_TABLE_ATTRIBUTE);
  }
  public static boolean hasApplicationDataTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, APPLICATION_DATA_TABLE_ATTRIBUTE);
  }

  public static void setPasswordTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, PASSWORD_TABLE_ATTRIBUTE, value);
  }

  public static String getPasswordTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, PASSWORD_TABLE_ATTRIBUTE);
  }
  public static boolean hasPasswordTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, PASSWORD_TABLE_ATTRIBUTE);
  }

  public static void setUserNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, USER_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getUserNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, USER_NAME_TABLE_ATTRIBUTE);
  }
  public static boolean hasUserNameTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, USER_NAME_TABLE_ATTRIBUTE);
  }

  public static void setObjectNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, OBJECT_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getObjectNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, OBJECT_NAME_TABLE_ATTRIBUTE);
  }

  public static void setSourceNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SOURCE_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getSourceNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SOURCE_NAME_TABLE_ATTRIBUTE);
  }

  public static void setUsedHierarchyTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, USED_HIERARCHY_TABLE_ATTRIBUTE, value);
  }

  public static String getUsedHierarchyTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, USED_HIERARCHY_TABLE_ATTRIBUTE);
  }
  public static boolean hasUsedHierarchyTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, USED_HIERARCHY_TABLE_ATTRIBUTE);
  }

  public static void setIsDataLayoutFieldTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, IS_DATA_LAYOUT_FIELD_TABLE_ATTRIBUTE, value);
  }

  public static String getIsDataLayoutFieldTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, IS_DATA_LAYOUT_FIELD_TABLE_ATTRIBUTE);
  }
  public static boolean hasIsDataLayoutFieldTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, IS_DATA_LAYOUT_FIELD_TABLE_ATTRIBUTE);
  }

  public static void setSourceFieldNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SOURCE_FIELD_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getSourceFieldNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SOURCE_FIELD_NAME_TABLE_ATTRIBUTE);
  }

  public static void setSelectedPageTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SELECTED_PAGE_TABLE_ATTRIBUTE, value);
  }

  public static String getSelectedPageTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SELECTED_PAGE_TABLE_ATTRIBUTE);
  }

  public static void setShowEmptyTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SHOW_EMPTY_TABLE_ATTRIBUTE, value);
  }

  public static String getShowEmptyTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SHOW_EMPTY_TABLE_ATTRIBUTE);
  }
  public static boolean hasShowEmptyTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, SHOW_EMPTY_TABLE_ATTRIBUTE);
  }

  public static void setShowDetailsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SHOW_DETAILS_TABLE_ATTRIBUTE, value);
  }

  public static String getShowDetailsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SHOW_DETAILS_TABLE_ATTRIBUTE);
  }
  public static boolean hasShowDetailsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, SHOW_DETAILS_TABLE_ATTRIBUTE);
  }

  public static void setDisplayMemberModeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DISPLAY_MEMBER_MODE_TABLE_ATTRIBUTE, value);
  }

  public static String getDisplayMemberModeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DISPLAY_MEMBER_MODE_TABLE_ATTRIBUTE);
  }

  public static void setMemberCountTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MEMBER_COUNT_TABLE_ATTRIBUTE, value);
  }

  public static String getMemberCountTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MEMBER_COUNT_TABLE_ATTRIBUTE);
  }

  public static void setDataFieldTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATA_FIELD_TABLE_ATTRIBUTE, value);
  }

  public static String getDataFieldTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATA_FIELD_TABLE_ATTRIBUTE);
  }

  public static void setEnabledTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ENABLED_TABLE_ATTRIBUTE, value);
  }

  public static String getEnabledTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ENABLED_TABLE_ATTRIBUTE);
  }

  public static void setSortModeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SORT_MODE_TABLE_ATTRIBUTE, value);
  }

  public static String getSortModeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SORT_MODE_TABLE_ATTRIBUTE);
  }

  public static void setAddEmptyLinesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ADD_EMPTY_LINES_TABLE_ATTRIBUTE, value);
  }

  public static String getAddEmptyLinesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ADD_EMPTY_LINES_TABLE_ATTRIBUTE);
  }

  public static void setLayoutModeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, LAYOUT_MODE_TABLE_ATTRIBUTE, value);
  }

  public static String getLayoutModeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, LAYOUT_MODE_TABLE_ATTRIBUTE);
  }

  public static void setTypeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TYPE_TABLE_ATTRIBUTE, value);
  }

  public static String getTypeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TYPE_TABLE_ATTRIBUTE);
  }

  public static void setFieldNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, FIELD_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getFieldNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, FIELD_NAME_TABLE_ATTRIBUTE);
  }

  public static void setMemberNameTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MEMBER_NAME_TABLE_ATTRIBUTE, value);
  }

  public static String getMemberNameTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MEMBER_NAME_TABLE_ATTRIBUTE);
  }

  public static void setMemberTypeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MEMBER_TYPE_TABLE_ATTRIBUTE, value);
  }

  public static String getMemberTypeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MEMBER_TYPE_TABLE_ATTRIBUTE);
  }

  public static void setGroupedByTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, GROUPED_BY_TABLE_ATTRIBUTE, value);
  }

  public static String getGroupedByTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, GROUPED_BY_TABLE_ATTRIBUTE);
  }

  public static void setStepTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, STEP_TABLE_ATTRIBUTE, value);
  }

  public static String getStepTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, STEP_TABLE_ATTRIBUTE);
  }

  public static void setDateStartTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATE_START_TABLE_ATTRIBUTE, value);
  }

  public static String getDateStartTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATE_START_TABLE_ATTRIBUTE);
  }

  public static void setStartTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, START_TABLE_ATTRIBUTE, value);
  }

  public static String getStartTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, START_TABLE_ATTRIBUTE);
  }

  public static void setDateEndTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, DATE_END_TABLE_ATTRIBUTE, value);
  }

  public static String getDateEndTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, DATE_END_TABLE_ATTRIBUTE);
  }

  public static void setEndTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_TABLE_ATTRIBUTE, value);
  }

  public static String getEndTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_TABLE_ATTRIBUTE);
  }

  public static void setLinkToSourceDataTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, LINK_TO_SOURCE_DATA_TABLE_ATTRIBUTE, value);
  }

  public static String getLinkToSourceDataTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, LINK_TO_SOURCE_DATA_TABLE_ATTRIBUTE);
  }
  public static boolean hasLinkToSourceDataTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, LINK_TO_SOURCE_DATA_TABLE_ATTRIBUTE);
  }

  public static void setUseLabelsTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, USE_LABELS_TABLE_ATTRIBUTE, value);
  }

  public static String getUseLabelsTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, USE_LABELS_TABLE_ATTRIBUTE);
  }
  public static boolean hasUseLabelsTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, USE_LABELS_TABLE_ATTRIBUTE);
  }

  public static void setTargetCellAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TARGET_CELL_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getTargetCellAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TARGET_CELL_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setSourceCellRangeAddressesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, SOURCE_CELL_RANGE_ADDRESSES_TABLE_ATTRIBUTE, value);
  }

  public static String getSourceCellRangeAddressesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, SOURCE_CELL_RANGE_ADDRESSES_TABLE_ATTRIBUTE);
  }

  public static void setTrackChangesTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TRACK_CHANGES_TABLE_ATTRIBUTE, value);
  }

  public static String getTrackChangesTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TRACK_CHANGES_TABLE_ATTRIBUTE);
  }
  public static boolean hasTrackChangesTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, TRACK_CHANGES_TABLE_ATTRIBUTE);
  }

  public static void setRejectingChangeIdTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, REJECTING_CHANGE_ID_TABLE_ATTRIBUTE, value);
  }

  public static String getRejectingChangeIdTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, REJECTING_CHANGE_ID_TABLE_ATTRIBUTE);
  }
  public static boolean hasRejectingChangeIdTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, REJECTING_CHANGE_ID_TABLE_ATTRIBUTE);
  }

  public static void setAcceptanceStateTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ACCEPTANCE_STATE_TABLE_ATTRIBUTE, value);
  }

  public static String getAcceptanceStateTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ACCEPTANCE_STATE_TABLE_ATTRIBUTE);
  }
  public static boolean hasAcceptanceStateTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, ACCEPTANCE_STATE_TABLE_ATTRIBUTE);
  }

  public static void setIdTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ID_TABLE_ATTRIBUTE, value);
  }

  public static String getIdTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ID_TABLE_ATTRIBUTE);
  }

  public static void setTableTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TABLE_TABLE_ATTRIBUTE, value);
  }

  public static String getTableTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TABLE_TABLE_ATTRIBUTE);
  }
  public static boolean hasTableTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, TABLE_TABLE_ATTRIBUTE);
  }

  public static void setCountTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, COUNT_TABLE_ATTRIBUTE, value);
  }

  public static String getCountTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, COUNT_TABLE_ATTRIBUTE);
  }
  public static boolean hasCountTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, COUNT_TABLE_ATTRIBUTE);
  }

  public static void setPositionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, POSITION_TABLE_ATTRIBUTE, value);
  }

  public static String getPositionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, POSITION_TABLE_ATTRIBUTE);
  }

  public static void setMultiDeletionSpannedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MULTI_DELETION_SPANNED_TABLE_ATTRIBUTE, value);
  }

  public static String getMultiDeletionSpannedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MULTI_DELETION_SPANNED_TABLE_ATTRIBUTE);
  }
  public static boolean hasMultiDeletionSpannedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, MULTI_DELETION_SPANNED_TABLE_ATTRIBUTE);
  }

  public static void setEndPositionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_POSITION_TABLE_ATTRIBUTE, value);
  }

  public static String getEndPositionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_POSITION_TABLE_ATTRIBUTE);
  }

  public static void setStartPositionTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, START_POSITION_TABLE_ATTRIBUTE, value);
  }

  public static String getStartPositionTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, START_POSITION_TABLE_ATTRIBUTE);
  }

  public static void setRowTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ROW_TABLE_ATTRIBUTE, value);
  }

  public static String getRowTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ROW_TABLE_ATTRIBUTE);
  }

  public static void setColumnTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, COLUMN_TABLE_ATTRIBUTE, value);
  }

  public static String getColumnTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, COLUMN_TABLE_ATTRIBUTE);
  }

  public static void setEndTableTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_TABLE_TABLE_ATTRIBUTE, value);
  }

  public static String getEndTableTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_TABLE_TABLE_ATTRIBUTE);
  }

  public static void setEndRowTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_ROW_TABLE_ATTRIBUTE, value);
  }

  public static String getEndRowTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_ROW_TABLE_ATTRIBUTE);
  }

  public static void setEndColumnTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_COLUMN_TABLE_ATTRIBUTE, value);
  }

  public static String getEndColumnTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_COLUMN_TABLE_ATTRIBUTE);
  }

  public static void setStartTableTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, START_TABLE_TABLE_ATTRIBUTE, value);
  }

  public static String getStartTableTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, START_TABLE_TABLE_ATTRIBUTE);
  }

  public static void setStartRowTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, START_ROW_TABLE_ATTRIBUTE, value);
  }

  public static String getStartRowTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, START_ROW_TABLE_ATTRIBUTE);
  }

  public static void setStartColumnTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, START_COLUMN_TABLE_ATTRIBUTE, value);
  }

  public static String getStartColumnTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, START_COLUMN_TABLE_ATTRIBUTE);
  }

  public static void setMatrixCoveredTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, MATRIX_COVERED_TABLE_ATTRIBUTE, value);
  }

  public static String getMatrixCoveredTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, MATRIX_COVERED_TABLE_ATTRIBUTE);
  }
  public static boolean hasMatrixCoveredTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, MATRIX_COVERED_TABLE_ATTRIBUTE);
  }

  public static void setCellAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CELL_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getCellAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CELL_ADDRESS_TABLE_ATTRIBUTE);
  }
  public static boolean hasCellAddressTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CELL_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setStyleNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, STYLE_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getStyleNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, STYLE_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasStyleNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, STYLE_NAME_DRAW_ATTRIBUTE);
  }

  public static void setPageLayoutNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PAGE_LAYOUT_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getPageLayoutNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PAGE_LAYOUT_NAME_STYLE_ATTRIBUTE);
  }

  public static void setPresentationPageLayoutNamePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PRESENTATION_PAGE_LAYOUT_NAME_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPresentationPageLayoutNamePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PRESENTATION_PAGE_LAYOUT_NAME_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPresentationPageLayoutNamePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PRESENTATION_PAGE_LAYOUT_NAME_PRESENTATION_ATTRIBUTE);
  }

  public static void setUseDateTimeNamePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, USE_DATE_TIME_NAME_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getUseDateTimeNamePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, USE_DATE_TIME_NAME_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasUseDateTimeNamePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, USE_DATE_TIME_NAME_PRESENTATION_ATTRIBUTE);
  }

  public static void setUseFooterNamePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, USE_FOOTER_NAME_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getUseFooterNamePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, USE_FOOTER_NAME_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasUseFooterNamePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, USE_FOOTER_NAME_PRESENTATION_ATTRIBUTE);
  }

  public static void setUseHeaderNamePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, USE_HEADER_NAME_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getUseHeaderNamePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, USE_HEADER_NAME_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasUseHeaderNamePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, USE_HEADER_NAME_PRESENTATION_ATTRIBUTE);
  }

  public static void setDisplayDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DISPLAY_DRAW_ATTRIBUTE, value);
  }

  public static String getDisplayDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DISPLAY_DRAW_ATTRIBUTE);
  }
  public static boolean hasDisplayDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DISPLAY_DRAW_ATTRIBUTE);
  }

  public static void setProtectedDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, PROTECTED_DRAW_ATTRIBUTE, value);
  }

  public static String getProtectedDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, PROTECTED_DRAW_ATTRIBUTE);
  }
  public static boolean hasProtectedDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, PROTECTED_DRAW_ATTRIBUTE);
  }

  public static void setNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, NAME_DRAW_ATTRIBUTE);
  }

  public static void setIdDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, ID_DRAW_ATTRIBUTE, value);
  }

  public static String getIdDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, ID_DRAW_ATTRIBUTE);
  }
  public static boolean hasIdDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, ID_DRAW_ATTRIBUTE);
  }

  public static void setMasterPageNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MASTER_PAGE_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getMasterPageNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MASTER_PAGE_NAME_DRAW_ATTRIBUTE);
  }

  public static void setTextStyleNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_STYLE_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getTextStyleNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_STYLE_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextStyleNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_STYLE_NAME_DRAW_ATTRIBUTE);
  }

  public static void setAnchorPageNumberTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANCHOR_PAGE_NUMBER_TEXT_ATTRIBUTE, value);
  }

  public static String getAnchorPageNumberTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANCHOR_PAGE_NUMBER_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnchorPageNumberTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANCHOR_PAGE_NUMBER_TEXT_ATTRIBUTE);
  }

  public static void setAnchorTypeTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANCHOR_TYPE_TEXT_ATTRIBUTE, value);
  }

  public static String getAnchorTypeTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANCHOR_TYPE_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnchorTypeTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANCHOR_TYPE_TEXT_ATTRIBUTE);
  }

  public static void setTableBackgroundTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, TABLE_BACKGROUND_TABLE_ATTRIBUTE, value);
  }

  public static String getTableBackgroundTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, TABLE_BACKGROUND_TABLE_ATTRIBUTE);
  }
  public static boolean hasTableBackgroundTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, TABLE_BACKGROUND_TABLE_ATTRIBUTE);
  }

  public static void setEndYTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_Y_TABLE_ATTRIBUTE, value);
  }

  public static String getEndYTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_Y_TABLE_ATTRIBUTE);
  }
  public static boolean hasEndYTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, END_Y_TABLE_ATTRIBUTE);
  }

  public static void setEndXTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_X_TABLE_ATTRIBUTE, value);
  }

  public static String getEndXTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_X_TABLE_ATTRIBUTE);
  }
  public static boolean hasEndXTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, END_X_TABLE_ATTRIBUTE);
  }

  public static void setEndCellAddressTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, END_CELL_ADDRESS_TABLE_ATTRIBUTE, value);
  }

  public static String getEndCellAddressTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, END_CELL_ADDRESS_TABLE_ATTRIBUTE);
  }
  public static boolean hasEndCellAddressTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, END_CELL_ADDRESS_TABLE_ATTRIBUTE);
  }

  public static void setTransformDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TRANSFORM_DRAW_ATTRIBUTE, value);
  }

  public static String getTransformDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TRANSFORM_DRAW_ATTRIBUTE);
  }
  public static boolean hasTransformDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TRANSFORM_DRAW_ATTRIBUTE);
  }

  public static void setLayerDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, LAYER_DRAW_ATTRIBUTE, value);
  }

  public static String getLayerDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, LAYER_DRAW_ATTRIBUTE);
  }
  public static boolean hasLayerDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, LAYER_DRAW_ATTRIBUTE);
  }

  public static void setZIndexDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, Z_INDEX_DRAW_ATTRIBUTE, value);
  }

  public static String getZIndexDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, Z_INDEX_DRAW_ATTRIBUTE);
  }
  public static boolean hasZIndexDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, Z_INDEX_DRAW_ATTRIBUTE);
  }

  public static void setHeightSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, HEIGHT_SVG_ATTRIBUTE, value);
  }

  public static String getHeightSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, HEIGHT_SVG_ATTRIBUTE);
  }
  public static boolean hasHeightSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, HEIGHT_SVG_ATTRIBUTE);
  }

  public static void setWidthSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, WIDTH_SVG_ATTRIBUTE, value);
  }

  public static String getWidthSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, WIDTH_SVG_ATTRIBUTE);
  }
  public static boolean hasWidthSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, WIDTH_SVG_ATTRIBUTE);
  }

  public static void setYSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, Y_SVG_ATTRIBUTE, value);
  }

  public static String getYSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, Y_SVG_ATTRIBUTE);
  }
  public static boolean hasYSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, Y_SVG_ATTRIBUTE);
  }

  public static void setXSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, X_SVG_ATTRIBUTE, value);
  }

  public static String getXSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, X_SVG_ATTRIBUTE);
  }
  public static boolean hasXSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, X_SVG_ATTRIBUTE);
  }

  public static void setCornerRadiusDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CORNER_RADIUS_DRAW_ATTRIBUTE, value);
  }

  public static String getCornerRadiusDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CORNER_RADIUS_DRAW_ATTRIBUTE);
  }
  public static boolean hasCornerRadiusDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CORNER_RADIUS_DRAW_ATTRIBUTE);
  }

  public static void setClassNamesDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CLASS_NAMES_DRAW_ATTRIBUTE, value);
  }

  public static String getClassNamesDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CLASS_NAMES_DRAW_ATTRIBUTE);
  }
  public static boolean hasClassNamesDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CLASS_NAMES_DRAW_ATTRIBUTE);
  }

  public static void setClassNamesPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, CLASS_NAMES_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getClassNamesPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, CLASS_NAMES_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasClassNamesPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, CLASS_NAMES_PRESENTATION_ATTRIBUTE);
  }

  public static void setStyleNamePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, STYLE_NAME_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getStyleNamePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, STYLE_NAME_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasStyleNamePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, STYLE_NAME_PRESENTATION_ATTRIBUTE);
  }

  public static void setY2SvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, Y2_SVG_ATTRIBUTE, value);
  }

  public static String getY2SvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, Y2_SVG_ATTRIBUTE);
  }

  public static void setX2SvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, X2_SVG_ATTRIBUTE, value);
  }

  public static String getX2SvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, X2_SVG_ATTRIBUTE);
  }

  public static void setY1SvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, Y1_SVG_ATTRIBUTE, value);
  }

  public static String getY1SvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, Y1_SVG_ATTRIBUTE);
  }

  public static void setX1SvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, X1_SVG_ATTRIBUTE, value);
  }

  public static String getX1SvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, X1_SVG_ATTRIBUTE);
  }

  public static void setViewBoxSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, VIEWBOX_SVG_ATTRIBUTE, value);
  }

  public static String getViewBoxSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, VIEWBOX_SVG_ATTRIBUTE);
  }

  public static void setPointsDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, POINTS_DRAW_ATTRIBUTE, value);
  }

  public static String getPointsDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, POINTS_DRAW_ATTRIBUTE);
  }

  public static void setCornersDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CORNERS_DRAW_ATTRIBUTE, value);
  }

  public static String getCornersDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CORNERS_DRAW_ATTRIBUTE);
  }

  public static void setConcaveDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CONCAVE_DRAW_ATTRIBUTE, value);
  }

  public static String getConcaveDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CONCAVE_DRAW_ATTRIBUTE);
  }

  public static void setSharpnessDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHARPNESS_DRAW_ATTRIBUTE, value);
  }

  public static String getSharpnessDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHARPNESS_DRAW_ATTRIBUTE);
  }

  public static void setDSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, D_SVG_ATTRIBUTE, value);
  }

  public static String getDSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, D_SVG_ATTRIBUTE);
  }

  public static void setEndAngleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_ANGLE_DRAW_ATTRIBUTE, value);
  }

  public static String getEndAngleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_ANGLE_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndAngleDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_ANGLE_DRAW_ATTRIBUTE);
  }

  public static void setStartAngleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_ANGLE_DRAW_ATTRIBUTE, value);
  }

  public static String getStartAngleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_ANGLE_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartAngleDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_ANGLE_DRAW_ATTRIBUTE);
  }

  public static void setKindDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, KIND_DRAW_ATTRIBUTE, value);
  }

  public static String getKindDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, KIND_DRAW_ATTRIBUTE);
  }
  public static boolean hasKindDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, KIND_DRAW_ATTRIBUTE);
  }

  public static void setCySvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, CY_SVG_ATTRIBUTE, value);
  }

  public static String getCySvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, CY_SVG_ATTRIBUTE);
  }

  public static void setCxSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, CX_SVG_ATTRIBUTE, value);
  }

  public static String getCxSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, CX_SVG_ATTRIBUTE);
  }

  public static void setRSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, R_SVG_ATTRIBUTE, value);
  }

  public static String getRSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, R_SVG_ATTRIBUTE);
  }
  public static boolean hasRSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, R_SVG_ATTRIBUTE);
  }

  public static void setRySvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, RY_SVG_ATTRIBUTE, value);
  }

  public static String getRySvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, RY_SVG_ATTRIBUTE);
  }

  public static void setRxSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, RX_SVG_ATTRIBUTE, value);
  }

  public static String getRxSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, RX_SVG_ATTRIBUTE);
  }

  public static void setLineSkewDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, LINE_SKEW_DRAW_ATTRIBUTE, value);
  }

  public static String getLineSkewDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, LINE_SKEW_DRAW_ATTRIBUTE);
  }
  public static boolean hasLineSkewDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, LINE_SKEW_DRAW_ATTRIBUTE);
  }

  public static void setEndGluePointDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_GLUE_POINT_DRAW_ATTRIBUTE, value);
  }

  public static String getEndGluePointDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_GLUE_POINT_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndGluePointDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_GLUE_POINT_DRAW_ATTRIBUTE);
  }

  public static void setEndShapeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_SHAPE_DRAW_ATTRIBUTE, value);
  }

  public static String getEndShapeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_SHAPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndShapeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_SHAPE_DRAW_ATTRIBUTE);
  }

  public static void setStartGluePointDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_GLUE_POINT_DRAW_ATTRIBUTE, value);
  }

  public static String getStartGluePointDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_GLUE_POINT_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartGluePointDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_GLUE_POINT_DRAW_ATTRIBUTE);
  }

  public static void setStartShapeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_SHAPE_DRAW_ATTRIBUTE, value);
  }

  public static String getStartShapeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_SHAPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartShapeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_SHAPE_DRAW_ATTRIBUTE);
  }

  public static void setTypeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TYPE_DRAW_ATTRIBUTE, value);
  }

  public static String getTypeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TYPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasTypeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TYPE_DRAW_ATTRIBUTE);
  }

  public static void setCaptionPointYDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_POINT_Y_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionPointYDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_POINT_Y_DRAW_ATTRIBUTE);
  }

  public static void setCaptionPointXDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_POINT_X_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionPointXDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_POINT_X_DRAW_ATTRIBUTE);
  }

  public static void setControlDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CONTROL_DRAW_ATTRIBUTE, value);
  }

  public static String getControlDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CONTROL_DRAW_ATTRIBUTE);
  }

  public static void setUserTransformedPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, USER_TRANSFORMED_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getUserTransformedPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, USER_TRANSFORMED_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasUserTransformedPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, USER_TRANSFORMED_PRESENTATION_ATTRIBUTE);
  }

  public static void setPlaceholderPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PLACEHOLDER_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPlaceholderPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PLACEHOLDER_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPlaceholderPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PLACEHOLDER_PRESENTATION_ATTRIBUTE);
  }

  public static void setClassPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, CLASS_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getClassPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, CLASS_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasClassPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, CLASS_PRESENTATION_ATTRIBUTE);
  }

  public static void setPageNumberDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, PAGE_NUMBER_DRAW_ATTRIBUTE, value);
  }

  public static String getPageNumberDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, PAGE_NUMBER_DRAW_ATTRIBUTE);
  }
  public static boolean hasPageNumberDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, PAGE_NUMBER_DRAW_ATTRIBUTE);
  }

  public static void setAlignDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, ALIGN_DRAW_ATTRIBUTE, value);
  }

  public static String getAlignDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, ALIGN_DRAW_ATTRIBUTE);
  }

  public static void setCopyOfDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, COPY_OF_DRAW_ATTRIBUTE, value);
  }

  public static String getCopyOfDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, COPY_OF_DRAW_ATTRIBUTE);
  }
  public static boolean hasCopyOfDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, COPY_OF_DRAW_ATTRIBUTE);
  }

  public static void setRelHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, REL_HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getRelHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, REL_HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasRelHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, REL_HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setRelWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, REL_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getRelWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, REL_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasRelWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, REL_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setMaxWidthFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MAX_WIDTH_FO_ATTRIBUTE, value);
  }

  public static String getMaxWidthFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MAX_WIDTH_FO_ATTRIBUTE);
  }
  public static boolean hasMaxWidthFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MAX_WIDTH_FO_ATTRIBUTE);
  }

  public static void setMaxHeightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MAX_HEIGHT_FO_ATTRIBUTE, value);
  }

  public static String getMaxHeightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MAX_HEIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasMaxHeightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MAX_HEIGHT_FO_ATTRIBUTE);
  }

  public static void setMinWidthFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MIN_WIDTH_FO_ATTRIBUTE, value);
  }

  public static String getMinWidthFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MIN_WIDTH_FO_ATTRIBUTE);
  }
  public static boolean hasMinWidthFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MIN_WIDTH_FO_ATTRIBUTE);
  }

  public static void setMinHeightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MIN_HEIGHT_FO_ATTRIBUTE, value);
  }

  public static String getMinHeightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MIN_HEIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasMinHeightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MIN_HEIGHT_FO_ATTRIBUTE);
  }

  public static void setChainNextNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CHAIN_NEXT_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getChainNextNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CHAIN_NEXT_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasChainNextNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CHAIN_NEXT_NAME_DRAW_ATTRIBUTE);
  }

  public static void setFilterNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILTER_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getFilterNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILTER_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasFilterNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILTER_NAME_DRAW_ATTRIBUTE);
  }

  public static void setNotifyOnUpdateOfRangesDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, NOTIFY_ON_UPDATE_OF_RANGES_DRAW_ATTRIBUTE, value);
  }

  public static String getNotifyOnUpdateOfRangesDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, NOTIFY_ON_UPDATE_OF_RANGES_DRAW_ATTRIBUTE);
  }
  public static boolean hasNotifyOnUpdateOfRangesDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, NOTIFY_ON_UPDATE_OF_RANGES_DRAW_ATTRIBUTE);
  }

  public static void setClassIdDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CLASS_ID_DRAW_ATTRIBUTE, value);
  }

  public static String getClassIdDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CLASS_ID_DRAW_ATTRIBUTE);
  }
  public static boolean hasClassIdDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CLASS_ID_DRAW_ATTRIBUTE);
  }

  public static void setMayScriptDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MAY_SCRIPT_DRAW_ATTRIBUTE, value);
  }

  public static String getMayScriptDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MAY_SCRIPT_DRAW_ATTRIBUTE);
  }
  public static boolean hasMayScriptDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MAY_SCRIPT_DRAW_ATTRIBUTE);
  }

  public static void setArchiveDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, ARCHIVE_DRAW_ATTRIBUTE, value);
  }

  public static String getArchiveDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, ARCHIVE_DRAW_ATTRIBUTE);
  }
  public static boolean hasArchiveDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, ARCHIVE_DRAW_ATTRIBUTE);
  }

  public static void setObjectDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, OBJECT_DRAW_ATTRIBUTE, value);
  }

  public static String getObjectDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, OBJECT_DRAW_ATTRIBUTE);
  }
  public static boolean hasObjectDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, OBJECT_DRAW_ATTRIBUTE);
  }

  public static void setCodeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CODE_DRAW_ATTRIBUTE, value);
  }

  public static String getCodeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CODE_DRAW_ATTRIBUTE);
  }
  public static boolean hasCodeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CODE_DRAW_ATTRIBUTE);
  }

  public static void setMimeTypeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MIME_TYPE_DRAW_ATTRIBUTE, value);
  }

  public static String getMimeTypeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MIME_TYPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasMimeTypeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MIME_TYPE_DRAW_ATTRIBUTE);
  }

  public static void setValueDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, VALUE_DRAW_ATTRIBUTE, value);
  }

  public static String getValueDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, VALUE_DRAW_ATTRIBUTE);
  }
  public static boolean hasValueDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, VALUE_DRAW_ATTRIBUTE);
  }

  public static void setFrameNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FRAME_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getFrameNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FRAME_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasFrameNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FRAME_NAME_DRAW_ATTRIBUTE);
  }

  public static void setRecreateOnEditDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, RECREATE_ON_EDIT_DRAW_ATTRIBUTE, value);
  }

  public static String getRecreateOnEditDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, RECREATE_ON_EDIT_DRAW_ATTRIBUTE);
  }

  public static void setServerMapOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, SERVER_MAP_OFFICE_ATTRIBUTE, value);
  }

  public static String getServerMapOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, SERVER_MAP_OFFICE_ATTRIBUTE);
  }
  public static boolean hasServerMapOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, SERVER_MAP_OFFICE_ATTRIBUTE);
  }

  public static void setNameOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, NAME_OFFICE_ATTRIBUTE, value);
  }

  public static String getNameOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, NAME_OFFICE_ATTRIBUTE);
  }
  public static boolean hasNameOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, NAME_OFFICE_ATTRIBUTE);
  }

  public static void setTargetFrameNameOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, TARGET_FRAME_NAME_OFFICE_ATTRIBUTE, value);
  }

  public static String getTargetFrameNameOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, TARGET_FRAME_NAME_OFFICE_ATTRIBUTE);
  }
  public static boolean hasTargetFrameNameOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, TARGET_FRAME_NAME_OFFICE_ATTRIBUTE);
  }

  public static void setNohrefDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, NOHREF_DRAW_ATTRIBUTE, value);
  }

  public static String getNohrefDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, NOHREF_DRAW_ATTRIBUTE);
  }
  public static boolean hasNohrefDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, NOHREF_DRAW_ATTRIBUTE);
  }

  public static void setTransformDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, TRANSFORM_DR3D_ATTRIBUTE, value);
  }

  public static String getTransformDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, TRANSFORM_DR3D_ATTRIBUTE);
  }
  public static boolean hasTransformDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, TRANSFORM_DR3D_ATTRIBUTE);
  }

  public static void setLightingModeDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, LIGHTING_MODE_DR3D_ATTRIBUTE, value);
  }

  public static String getLightingModeDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, LIGHTING_MODE_DR3D_ATTRIBUTE);
  }
  public static boolean hasLightingModeDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, LIGHTING_MODE_DR3D_ATTRIBUTE);
  }

  public static void setAmbientColorDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, AMBIENT_COLOR_DR3D_ATTRIBUTE, value);
  }

  public static String getAmbientColorDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, AMBIENT_COLOR_DR3D_ATTRIBUTE);
  }
  public static boolean hasAmbientColorDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, AMBIENT_COLOR_DR3D_ATTRIBUTE);
  }

  public static void setShadeModeDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, SHADE_MODE_DR3D_ATTRIBUTE, value);
  }

  public static String getShadeModeDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, SHADE_MODE_DR3D_ATTRIBUTE);
  }
  public static boolean hasShadeModeDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, SHADE_MODE_DR3D_ATTRIBUTE);
  }

  public static void setShadowSlantDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, SHADOW_SLANT_DR3D_ATTRIBUTE, value);
  }

  public static String getShadowSlantDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, SHADOW_SLANT_DR3D_ATTRIBUTE);
  }
  public static boolean hasShadowSlantDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, SHADOW_SLANT_DR3D_ATTRIBUTE);
  }

  public static void setFocalLengthDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, FOCAL_LENGTH_DR3D_ATTRIBUTE, value);
  }

  public static String getFocalLengthDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, FOCAL_LENGTH_DR3D_ATTRIBUTE);
  }
  public static boolean hasFocalLengthDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, FOCAL_LENGTH_DR3D_ATTRIBUTE);
  }

  public static void setDistanceDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, DISTANCE_DR3D_ATTRIBUTE, value);
  }

  public static String getDistanceDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, DISTANCE_DR3D_ATTRIBUTE);
  }
  public static boolean hasDistanceDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, DISTANCE_DR3D_ATTRIBUTE);
  }

  public static void setProjectionDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, PROJECTION_DR3D_ATTRIBUTE, value);
  }

  public static String getProjectionDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, PROJECTION_DR3D_ATTRIBUTE);
  }
  public static boolean hasProjectionDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, PROJECTION_DR3D_ATTRIBUTE);
  }

  public static void setVupDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, VUP_DR3D_ATTRIBUTE, value);
  }

  public static String getVupDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, VUP_DR3D_ATTRIBUTE);
  }
  public static boolean hasVupDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, VUP_DR3D_ATTRIBUTE);
  }

  public static void setVpnDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, VPN_DR3D_ATTRIBUTE, value);
  }

  public static String getVpnDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, VPN_DR3D_ATTRIBUTE);
  }
  public static boolean hasVpnDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, VPN_DR3D_ATTRIBUTE);
  }

  public static void setVrpDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, VRP_DR3D_ATTRIBUTE, value);
  }

  public static String getVrpDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, VRP_DR3D_ATTRIBUTE);
  }
  public static boolean hasVrpDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, VRP_DR3D_ATTRIBUTE);
  }

  public static void setSpecularDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, SPECULAR_DR3D_ATTRIBUTE, value);
  }

  public static String getSpecularDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, SPECULAR_DR3D_ATTRIBUTE);
  }
  public static boolean hasSpecularDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, SPECULAR_DR3D_ATTRIBUTE);
  }

  public static void setEnabledDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, ENABLED_DR3D_ATTRIBUTE, value);
  }

  public static String getEnabledDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, ENABLED_DR3D_ATTRIBUTE);
  }
  public static boolean hasEnabledDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, ENABLED_DR3D_ATTRIBUTE);
  }

  public static void setDirectionDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, DIRECTION_DR3D_ATTRIBUTE, value);
  }

  public static String getDirectionDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, DIRECTION_DR3D_ATTRIBUTE);
  }

  public static void setDiffuseColorDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, DIFFUSE_COLOR_DR3D_ATTRIBUTE, value);
  }

  public static String getDiffuseColorDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, DIFFUSE_COLOR_DR3D_ATTRIBUTE);
  }
  public static boolean hasDiffuseColorDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, DIFFUSE_COLOR_DR3D_ATTRIBUTE);
  }

  public static void setMaxEdgeDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, MAX_EDGE_DR3D_ATTRIBUTE, value);
  }

  public static String getMaxEdgeDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, MAX_EDGE_DR3D_ATTRIBUTE);
  }
  public static boolean hasMaxEdgeDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, MAX_EDGE_DR3D_ATTRIBUTE);
  }

  public static void setMinEdgeDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, MIN_EDGE_DR3D_ATTRIBUTE, value);
  }

  public static String getMinEdgeDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, MIN_EDGE_DR3D_ATTRIBUTE);
  }
  public static boolean hasMinEdgeDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, MIN_EDGE_DR3D_ATTRIBUTE);
  }

  public static void setSizeDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, SIZE_DR3D_ATTRIBUTE, value);
  }

  public static String getSizeDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, SIZE_DR3D_ATTRIBUTE);
  }
  public static boolean hasSizeDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, SIZE_DR3D_ATTRIBUTE);
  }

  public static void setCenterDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, CENTER_DR3D_ATTRIBUTE, value);
  }

  public static String getCenterDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, CENTER_DR3D_ATTRIBUTE);
  }
  public static boolean hasCenterDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, CENTER_DR3D_ATTRIBUTE);
  }

  public static void setDataDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DATA_DRAW_ATTRIBUTE, value);
  }

  public static String getDataDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DATA_DRAW_ATTRIBUTE);
  }
  public static boolean hasDataDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DATA_DRAW_ATTRIBUTE);
  }

  public static void setEngineDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, ENGINE_DRAW_ATTRIBUTE, value);
  }

  public static String getEngineDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, ENGINE_DRAW_ATTRIBUTE);
  }
  public static boolean hasEngineDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, ENGINE_DRAW_ATTRIBUTE);
  }

  public static void setModifiersDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MODIFIERS_DRAW_ATTRIBUTE, value);
  }

  public static String getModifiersDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MODIFIERS_DRAW_ATTRIBUTE);
  }
  public static boolean hasModifiersDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MODIFIERS_DRAW_ATTRIBUTE);
  }

  public static void setTextPathSameLetterHeightsDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_PATH_SAME_LETTER_HEIGHTS_DRAW_ATTRIBUTE, value);
  }

  public static String getTextPathSameLetterHeightsDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_PATH_SAME_LETTER_HEIGHTS_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextPathSameLetterHeightsDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_PATH_SAME_LETTER_HEIGHTS_DRAW_ATTRIBUTE);
  }

  public static void setTextPathScaleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_PATH_SCALE_DRAW_ATTRIBUTE, value);
  }

  public static String getTextPathScaleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_PATH_SCALE_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextPathScaleDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_PATH_SCALE_DRAW_ATTRIBUTE);
  }

  public static void setTextPathModeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_PATH_MODE_DRAW_ATTRIBUTE, value);
  }

  public static String getTextPathModeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_PATH_MODE_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextPathModeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_PATH_MODE_DRAW_ATTRIBUTE);
  }

  public static void setTextPathDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_PATH_DRAW_ATTRIBUTE, value);
  }

  public static String getTextPathDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_PATH_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextPathDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_PATH_DRAW_ATTRIBUTE);
  }

  public static void setGluePointLeavingDirectionsDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GLUE_POINT_LEAVING_DIRECTIONS_DRAW_ATTRIBUTE, value);
  }

  public static String getGluePointLeavingDirectionsDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GLUE_POINT_LEAVING_DIRECTIONS_DRAW_ATTRIBUTE);
  }
  public static boolean hasGluePointLeavingDirectionsDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GLUE_POINT_LEAVING_DIRECTIONS_DRAW_ATTRIBUTE);
  }

  public static void setGluePointTypeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GLUE_POINT_TYPE_DRAW_ATTRIBUTE, value);
  }

  public static String getGluePointTypeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GLUE_POINT_TYPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasGluePointTypeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GLUE_POINT_TYPE_DRAW_ATTRIBUTE);
  }

  public static void setGluePointsDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GLUE_POINTS_DRAW_ATTRIBUTE, value);
  }

  public static String getGluePointsDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GLUE_POINTS_DRAW_ATTRIBUTE);
  }
  public static boolean hasGluePointsDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GLUE_POINTS_DRAW_ATTRIBUTE);
  }

  public static void setTextAreasDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_AREAS_DRAW_ATTRIBUTE, value);
  }

  public static String getTextAreasDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_AREAS_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextAreasDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_AREAS_DRAW_ATTRIBUTE);
  }

  public static void setPathStretchpointYDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, PATH_STRETCHPOINT_Y_DRAW_ATTRIBUTE, value);
  }

  public static String getPathStretchpointYDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, PATH_STRETCHPOINT_Y_DRAW_ATTRIBUTE);
  }
  public static boolean hasPathStretchpointYDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, PATH_STRETCHPOINT_Y_DRAW_ATTRIBUTE);
  }

  public static void setPathStretchpointXDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, PATH_STRETCHPOINT_X_DRAW_ATTRIBUTE, value);
  }

  public static String getPathStretchpointXDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, PATH_STRETCHPOINT_X_DRAW_ATTRIBUTE);
  }
  public static boolean hasPathStretchpointXDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, PATH_STRETCHPOINT_X_DRAW_ATTRIBUTE);
  }

  public static void setEnhancedPathDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, ENHANCED_PATH_DRAW_ATTRIBUTE, value);
  }

  public static String getEnhancedPathDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, ENHANCED_PATH_DRAW_ATTRIBUTE);
  }
  public static boolean hasEnhancedPathDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, ENHANCED_PATH_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_COLOR_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionColorDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_COLOR_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionOriginDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_ORIGIN_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionOriginDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_ORIGIN_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionOriginDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_ORIGIN_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionViewpointDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_VIEWPOINT_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionViewpointDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_VIEWPOINT_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionViewpointDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_VIEWPOINT_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionSpecularityDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_SPECULARITY_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionSpecularityDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_SPECULARITY_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionSpecularityDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_SPECULARITY_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionSkewDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_SKEW_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionSkewDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_SKEW_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionSkewDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_SKEW_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionShininessDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_SHININESS_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionShininessDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_SHININESS_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionShininessDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_SHININESS_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionRotationCenterDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_ROTATION_CENTER_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionRotationCenterDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_ROTATION_CENTER_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionRotationCenterDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_ROTATION_CENTER_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionRotationAngleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_ROTATION_ANGLE_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionRotationAngleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_ROTATION_ANGLE_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionRotationAngleDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_ROTATION_ANGLE_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionMetalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_METAL_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionMetalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_METAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionMetalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_METAL_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionSecondLightDirectionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_DIRECTION_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionSecondLightDirectionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_DIRECTION_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionSecondLightDirectionDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_DIRECTION_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionFirstLightDirectionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_DIRECTION_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionFirstLightDirectionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_DIRECTION_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionFirstLightDirectionDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_DIRECTION_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionSecondLightLevelDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_LEVEL_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionSecondLightLevelDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_LEVEL_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionSecondLightLevelDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_LEVEL_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionFirstLightLevelDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_LEVEL_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionFirstLightLevelDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_LEVEL_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionFirstLightLevelDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_LEVEL_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionSecondLightHarshDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_HARSH_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionSecondLightHarshDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_HARSH_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionSecondLightHarshDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_SECOND_LIGHT_HARSH_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionFirstLightHarshDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_HARSH_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionFirstLightHarshDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_HARSH_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionFirstLightHarshDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_FIRST_LIGHT_HARSH_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionLightFaceDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_LIGHT_FACE_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionLightFaceDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_LIGHT_FACE_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionLightFaceDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_LIGHT_FACE_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionNumberOfLineSegmentsDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_NUMBER_OF_LINE_SEGMENTS_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionNumberOfLineSegmentsDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_NUMBER_OF_LINE_SEGMENTS_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionNumberOfLineSegmentsDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_NUMBER_OF_LINE_SEGMENTS_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionDiffusionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_DIFFUSION_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionDiffusionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_DIFFUSION_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionDiffusionDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_DIFFUSION_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionDepthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_DEPTH_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionDepthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_DEPTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionDepthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_DEPTH_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionBrightnessDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_BRIGHTNESS_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionBrightnessDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_BRIGHTNESS_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionBrightnessDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_BRIGHTNESS_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_DRAW_ATTRIBUTE);
  }

  public static void setConcentricGradientFillAllowedDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CONCENTRIC_GRADIENT_FILL_ALLOWED_DRAW_ATTRIBUTE, value);
  }

  public static String getConcentricGradientFillAllowedDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CONCENTRIC_GRADIENT_FILL_ALLOWED_DRAW_ATTRIBUTE);
  }
  public static boolean hasConcentricGradientFillAllowedDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CONCENTRIC_GRADIENT_FILL_ALLOWED_DRAW_ATTRIBUTE);
  }

  public static void setTextPathAllowedDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_PATH_ALLOWED_DRAW_ATTRIBUTE, value);
  }

  public static String getTextPathAllowedDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_PATH_ALLOWED_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextPathAllowedDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_PATH_ALLOWED_DRAW_ATTRIBUTE);
  }

  public static void setExtrusionAllowedDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, EXTRUSION_ALLOWED_DRAW_ATTRIBUTE, value);
  }

  public static String getExtrusionAllowedDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, EXTRUSION_ALLOWED_DRAW_ATTRIBUTE);
  }
  public static boolean hasExtrusionAllowedDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, EXTRUSION_ALLOWED_DRAW_ATTRIBUTE);
  }

  public static void setTextRotateAngleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXT_ROTATE_ANGLE_DRAW_ATTRIBUTE, value);
  }

  public static String getTextRotateAngleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXT_ROTATE_ANGLE_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextRotateAngleDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXT_ROTATE_ANGLE_DRAW_ATTRIBUTE);
  }

  public static void setMirrorHorizontalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MIRROR_HORIZONTAL_DRAW_ATTRIBUTE, value);
  }

  public static String getMirrorHorizontalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MIRROR_HORIZONTAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasMirrorHorizontalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MIRROR_HORIZONTAL_DRAW_ATTRIBUTE);
  }

  public static void setMirrorVerticalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MIRROR_VERTICAL_DRAW_ATTRIBUTE, value);
  }

  public static String getMirrorVerticalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MIRROR_VERTICAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasMirrorVerticalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MIRROR_VERTICAL_DRAW_ATTRIBUTE);
  }

  public static void setFormulaDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FORMULA_DRAW_ATTRIBUTE, value);
  }

  public static String getFormulaDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FORMULA_DRAW_ATTRIBUTE);
  }
  public static boolean hasFormulaDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FORMULA_DRAW_ATTRIBUTE);
  }

  public static void setHandleRadiusRangeMaximumDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_RADIUS_RANGE_MAXIMUM_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleRadiusRangeMaximumDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_RADIUS_RANGE_MAXIMUM_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleRadiusRangeMaximumDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_RADIUS_RANGE_MAXIMUM_DRAW_ATTRIBUTE);
  }

  public static void setHandleRadiusRangeMinimumDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_RADIUS_RANGE_MINIMUM_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleRadiusRangeMinimumDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_RADIUS_RANGE_MINIMUM_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleRadiusRangeMinimumDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_RADIUS_RANGE_MINIMUM_DRAW_ATTRIBUTE);
  }

  public static void setHandlePolarDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_POLAR_DRAW_ATTRIBUTE, value);
  }

  public static String getHandlePolarDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_POLAR_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandlePolarDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_POLAR_DRAW_ATTRIBUTE);
  }

  public static void setHandleRangeYMaximumDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_RANGE_Y_MAXIMUM_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleRangeYMaximumDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_RANGE_Y_MAXIMUM_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleRangeYMaximumDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_RANGE_Y_MAXIMUM_DRAW_ATTRIBUTE);
  }

  public static void setHandleRangeYMinimumDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_RANGE_Y_MINIMUM_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleRangeYMinimumDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_RANGE_Y_MINIMUM_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleRangeYMinimumDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_RANGE_Y_MINIMUM_DRAW_ATTRIBUTE);
  }

  public static void setHandleRangeXMaximumDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_RANGE_X_MAXIMUM_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleRangeXMaximumDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_RANGE_X_MAXIMUM_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleRangeXMaximumDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_RANGE_X_MAXIMUM_DRAW_ATTRIBUTE);
  }

  public static void setHandleRangeXMinimumDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_RANGE_X_MINIMUM_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleRangeXMinimumDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_RANGE_X_MINIMUM_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleRangeXMinimumDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_RANGE_X_MINIMUM_DRAW_ATTRIBUTE);
  }

  public static void setHandlePositionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_POSITION_DRAW_ATTRIBUTE, value);
  }

  public static String getHandlePositionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_POSITION_DRAW_ATTRIBUTE);
  }

  public static void setHandleSwitchedDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_SWITCHED_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleSwitchedDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_SWITCHED_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleSwitchedDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_SWITCHED_DRAW_ATTRIBUTE);
  }

  public static void setHandleMirrorHorizontalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_MIRROR_HORIZONTAL_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleMirrorHorizontalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_MIRROR_HORIZONTAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleMirrorHorizontalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_MIRROR_HORIZONTAL_DRAW_ATTRIBUTE);
  }

  public static void setHandleMirrorVerticalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, HANDLE_MIRROR_VERTICAL_DRAW_ATTRIBUTE, value);
  }

  public static String getHandleMirrorVerticalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, HANDLE_MIRROR_VERTICAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasHandleMirrorVerticalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, HANDLE_MIRROR_VERTICAL_DRAW_ATTRIBUTE);
  }

  public static void setPlayFullPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PLAY_FULL_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPlayFullPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PLAY_FULL_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPlayFullPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PLAY_FULL_PRESENTATION_ATTRIBUTE);
  }

  public static void setPathIdPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PATH_ID_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPathIdPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PATH_ID_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPathIdPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PATH_ID_PRESENTATION_ATTRIBUTE);
  }

  public static void setStartScalePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, START_SCALE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getStartScalePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, START_SCALE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasStartScalePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, START_SCALE_PRESENTATION_ATTRIBUTE);
  }

  public static void setDelayPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, DELAY_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getDelayPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, DELAY_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasDelayPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, DELAY_PRESENTATION_ATTRIBUTE);
  }

  public static void setSpeedPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, SPEED_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getSpeedPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, SPEED_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasSpeedPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, SPEED_PRESENTATION_ATTRIBUTE);
  }

  public static void setDirectionPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, DIRECTION_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getDirectionPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, DIRECTION_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasDirectionPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, DIRECTION_PRESENTATION_ATTRIBUTE);
  }

  public static void setEffectPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, EFFECT_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getEffectPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, EFFECT_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasEffectPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, EFFECT_PRESENTATION_ATTRIBUTE);
  }

  public static void setShapeIdDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHAPE_ID_DRAW_ATTRIBUTE, value);
  }

  public static String getShapeIdDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHAPE_ID_DRAW_ATTRIBUTE);
  }

  public static void setColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, COLOR_DRAW_ATTRIBUTE);
  }

  public static void setVerbPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, VERB_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getVerbPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, VERB_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasVerbPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, VERB_PRESENTATION_ATTRIBUTE);
  }

  public static void setActionPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, ACTION_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getActionPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, ACTION_PRESENTATION_ATTRIBUTE);
  }

  public static void setEventNameScriptAttribute(Element element, String value) {
    element.setAttributeNS(SCRIPT_NS, EVENT_NAME_SCRIPT_ATTRIBUTE, value);
  }

  public static String getEventNameScriptAttribute(Element element) {
    return element.getAttributeNS(SCRIPT_NS, EVENT_NAME_SCRIPT_ATTRIBUTE);
  }

  public static void setStayOnTopPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, STAY_ON_TOP_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getStayOnTopPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, STAY_ON_TOP_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasStayOnTopPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, STAY_ON_TOP_PRESENTATION_ATTRIBUTE);
  }

  public static void setTransitionOnClickPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, TRANSITION_ON_CLICK_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getTransitionOnClickPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, TRANSITION_ON_CLICK_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasTransitionOnClickPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, TRANSITION_ON_CLICK_PRESENTATION_ATTRIBUTE);
  }

  public static void setAnimationsPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, ANIMATIONS_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getAnimationsPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, ANIMATIONS_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasAnimationsPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, ANIMATIONS_PRESENTATION_ATTRIBUTE);
  }

  public static void setStartWithNavigatorPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, START_WITH_NAVIGATOR_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getStartWithNavigatorPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, START_WITH_NAVIGATOR_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasStartWithNavigatorPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, START_WITH_NAVIGATOR_PRESENTATION_ATTRIBUTE);
  }

  public static void setMouseAsPenPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, MOUSE_AS_PEN_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getMouseAsPenPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, MOUSE_AS_PEN_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasMouseAsPenPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, MOUSE_AS_PEN_PRESENTATION_ATTRIBUTE);
  }

  public static void setMouseVisiblePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, MOUSE_VISIBLE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getMouseVisiblePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, MOUSE_VISIBLE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasMouseVisiblePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, MOUSE_VISIBLE_PRESENTATION_ATTRIBUTE);
  }

  public static void setForceManualPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, FORCE_MANUAL_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getForceManualPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, FORCE_MANUAL_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasForceManualPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, FORCE_MANUAL_PRESENTATION_ATTRIBUTE);
  }

  public static void setShowLogoPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, SHOW_LOGO_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getShowLogoPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, SHOW_LOGO_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasShowLogoPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, SHOW_LOGO_PRESENTATION_ATTRIBUTE);
  }

  public static void setPausePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PAUSE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPausePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PAUSE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPausePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PAUSE_PRESENTATION_ATTRIBUTE);
  }

  public static void setEndlessPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, ENDLESS_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getEndlessPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, ENDLESS_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasEndlessPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, ENDLESS_PRESENTATION_ATTRIBUTE);
  }

  public static void setFullScreenPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, FULL_SCREEN_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getFullScreenPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, FULL_SCREEN_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasFullScreenPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, FULL_SCREEN_PRESENTATION_ATTRIBUTE);
  }

  public static void setShowPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, SHOW_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getShowPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, SHOW_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasShowPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, SHOW_PRESENTATION_ATTRIBUTE);
  }

  public static void setStartPagePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, START_PAGE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getStartPagePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, START_PAGE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasStartPagePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, START_PAGE_PRESENTATION_ATTRIBUTE);
  }

  public static void setPagesPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PAGES_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPagesPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PAGES_PRESENTATION_ATTRIBUTE);
  }

  public static void setNamePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, NAME_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getNamePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, NAME_PRESENTATION_ATTRIBUTE);
  }

  public static void setStyleNameChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, STYLE_NAME_CHART_ATTRIBUTE, value);
  }

  public static String getStyleNameChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, STYLE_NAME_CHART_ATTRIBUTE);
  }
  public static boolean hasStyleNameChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, STYLE_NAME_CHART_ATTRIBUTE);
  }

  public static void setRowMappingChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, ROW_MAPPING_CHART_ATTRIBUTE, value);
  }

  public static String getRowMappingChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, ROW_MAPPING_CHART_ATTRIBUTE);
  }
  public static boolean hasRowMappingChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, ROW_MAPPING_CHART_ATTRIBUTE);
  }

  public static void setColumnMappingChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, COLUMN_MAPPING_CHART_ATTRIBUTE, value);
  }

  public static String getColumnMappingChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, COLUMN_MAPPING_CHART_ATTRIBUTE);
  }
  public static boolean hasColumnMappingChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, COLUMN_MAPPING_CHART_ATTRIBUTE);
  }

  public static void setClassChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, CLASS_CHART_ATTRIBUTE, value);
  }

  public static String getClassChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, CLASS_CHART_ATTRIBUTE);
  }

  public static void setCellRangeTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, CELL_RANGE_TABLE_ATTRIBUTE, value);
  }

  public static String getCellRangeTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, CELL_RANGE_TABLE_ATTRIBUTE);
  }
  public static boolean hasCellRangeTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, CELL_RANGE_TABLE_ATTRIBUTE);
  }

  public static void setLegendAlignChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, LEGEND_ALIGN_CHART_ATTRIBUTE, value);
  }

  public static String getLegendAlignChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, LEGEND_ALIGN_CHART_ATTRIBUTE);
  }
  public static boolean hasLegendAlignChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, LEGEND_ALIGN_CHART_ATTRIBUTE);
  }

  public static void setLegendPositionChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, LEGEND_POSITION_CHART_ATTRIBUTE, value);
  }

  public static String getLegendPositionChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, LEGEND_POSITION_CHART_ATTRIBUTE);
  }

  public static void setLegendExpansionStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEGEND_EXPANSION_STYLE_ATTRIBUTE, value);
  }

  public static String getLegendExpansionStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEGEND_EXPANSION_STYLE_ATTRIBUTE);
  }

  public static void setLegendExpansionAspectRatioStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEGEND_EXPANSION_ASPECT_RATIO_STYLE_ATTRIBUTE, value);
  }

  public static String getLegendExpansionAspectRatioStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEGEND_EXPANSION_ASPECT_RATIO_STYLE_ATTRIBUTE);
  }

  public static void setDataSourceHasLabelsChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, DATA_SOURCE_HAS_LABELS_CHART_ATTRIBUTE, value);
  }

  public static String getDataSourceHasLabelsChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, DATA_SOURCE_HAS_LABELS_CHART_ATTRIBUTE);
  }
  public static boolean hasDataSourceHasLabelsChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, DATA_SOURCE_HAS_LABELS_CHART_ATTRIBUTE);
  }

  public static void setNameChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, NAME_CHART_ATTRIBUTE, value);
  }

  public static String getNameChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, NAME_CHART_ATTRIBUTE);
  }
  public static boolean hasNameChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, NAME_CHART_ATTRIBUTE);
  }

  public static void setDimensionChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, DIMENSION_CHART_ATTRIBUTE, value);
  }

  public static String getDimensionChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, DIMENSION_CHART_ATTRIBUTE);
  }

  public static void setAttachedAxisChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, ATTACHED_AXIS_CHART_ATTRIBUTE, value);
  }

  public static String getAttachedAxisChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, ATTACHED_AXIS_CHART_ATTRIBUTE);
  }
  public static boolean hasAttachedAxisChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, ATTACHED_AXIS_CHART_ATTRIBUTE);
  }

  public static void setLabelCellAddressChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, LABEL_CELL_ADDRESS_CHART_ATTRIBUTE, value);
  }

  public static String getLabelCellAddressChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, LABEL_CELL_ADDRESS_CHART_ATTRIBUTE);
  }
  public static boolean hasLabelCellAddressChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, LABEL_CELL_ADDRESS_CHART_ATTRIBUTE);
  }

  public static void setValuesCellRangeAddressChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, VALUES_CELL_RANGE_ADDRESS_CHART_ATTRIBUTE, value);
  }

  public static String getValuesCellRangeAddressChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, VALUES_CELL_RANGE_ADDRESS_CHART_ATTRIBUTE);
  }
  public static boolean hasValuesCellRangeAddressChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, VALUES_CELL_RANGE_ADDRESS_CHART_ATTRIBUTE);
  }

  public static void setRepeatedChartAttribute(Element element, String value) {
    element.setAttributeNS(CHART_NS, REPEATED_CHART_ATTRIBUTE, value);
  }

  public static String getRepeatedChartAttribute(Element element) {
    return element.getAttributeNS(CHART_NS, REPEATED_CHART_ATTRIBUTE);
  }
  public static boolean hasRepeatedChartAttribute(Element element) {
    return element.hasAttributeNS(CHART_NS, REPEATED_CHART_ATTRIBUTE);
  }

  public static void setApplyDesignModeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, APPLY_DESIGN_MODE_FORM_ATTRIBUTE, value);
  }

  public static String getApplyDesignModeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, APPLY_DESIGN_MODE_FORM_ATTRIBUTE);
  }
  public static boolean hasApplyDesignModeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, APPLY_DESIGN_MODE_FORM_ATTRIBUTE);
  }

  public static void setAutomaticFocusFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, AUTOMATIC_FOCUS_FORM_ATTRIBUTE, value);
  }

  public static String getAutomaticFocusFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, AUTOMATIC_FOCUS_FORM_ATTRIBUTE);
  }
  public static boolean hasAutomaticFocusFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, AUTOMATIC_FOCUS_FORM_ATTRIBUTE);
  }

  public static void setTabCycleFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, TAB_CYCLE_FORM_ATTRIBUTE, value);
  }

  public static String getTabCycleFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, TAB_CYCLE_FORM_ATTRIBUTE);
  }
  public static boolean hasTabCycleFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, TAB_CYCLE_FORM_ATTRIBUTE);
  }

  public static void setOrderFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ORDER_FORM_ATTRIBUTE, value);
  }

  public static String getOrderFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ORDER_FORM_ATTRIBUTE);
  }
  public static boolean hasOrderFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ORDER_FORM_ATTRIBUTE);
  }

  public static void setNavigationModeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, NAVIGATION_MODE_FORM_ATTRIBUTE, value);
  }

  public static String getNavigationModeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, NAVIGATION_MODE_FORM_ATTRIBUTE);
  }
  public static boolean hasNavigationModeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, NAVIGATION_MODE_FORM_ATTRIBUTE);
  }

  public static void setIgnoreResultFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, IGNORE_RESULT_FORM_ATTRIBUTE, value);
  }

  public static String getIgnoreResultFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, IGNORE_RESULT_FORM_ATTRIBUTE);
  }
  public static boolean hasIgnoreResultFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, IGNORE_RESULT_FORM_ATTRIBUTE);
  }

  public static void setFilterFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, FILTER_FORM_ATTRIBUTE, value);
  }

  public static String getFilterFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, FILTER_FORM_ATTRIBUTE);
  }
  public static boolean hasFilterFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, FILTER_FORM_ATTRIBUTE);
  }

  public static void setEscapeProcessingFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ESCAPE_PROCESSING_FORM_ATTRIBUTE, value);
  }

  public static String getEscapeProcessingFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ESCAPE_PROCESSING_FORM_ATTRIBUTE);
  }
  public static boolean hasEscapeProcessingFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ESCAPE_PROCESSING_FORM_ATTRIBUTE);
  }

  public static void setDetailFieldsFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, DETAIL_FIELDS_FORM_ATTRIBUTE, value);
  }

  public static String getDetailFieldsFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, DETAIL_FIELDS_FORM_ATTRIBUTE);
  }
  public static boolean hasDetailFieldsFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, DETAIL_FIELDS_FORM_ATTRIBUTE);
  }

  public static void setMasterFieldsFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, MASTER_FIELDS_FORM_ATTRIBUTE, value);
  }

  public static String getMasterFieldsFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, MASTER_FIELDS_FORM_ATTRIBUTE);
  }
  public static boolean hasMasterFieldsFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, MASTER_FIELDS_FORM_ATTRIBUTE);
  }

  public static void setDatasourceFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, DATASOURCE_FORM_ATTRIBUTE, value);
  }

  public static String getDatasourceFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, DATASOURCE_FORM_ATTRIBUTE);
  }
  public static boolean hasDatasourceFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, DATASOURCE_FORM_ATTRIBUTE);
  }

  public static void setCommandFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, COMMAND_FORM_ATTRIBUTE, value);
  }

  public static String getCommandFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, COMMAND_FORM_ATTRIBUTE);
  }
  public static boolean hasCommandFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, COMMAND_FORM_ATTRIBUTE);
  }

  public static void setCommandTypeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, COMMAND_TYPE_FORM_ATTRIBUTE, value);
  }

  public static String getCommandTypeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, COMMAND_TYPE_FORM_ATTRIBUTE);
  }
  public static boolean hasCommandTypeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, COMMAND_TYPE_FORM_ATTRIBUTE);
  }

  public static void setApplyFilterFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, APPLY_FILTER_FORM_ATTRIBUTE, value);
  }

  public static String getApplyFilterFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, APPLY_FILTER_FORM_ATTRIBUTE);
  }
  public static boolean hasApplyFilterFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, APPLY_FILTER_FORM_ATTRIBUTE);
  }

  public static void setAllowUpdatesFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ALLOW_UPDATES_FORM_ATTRIBUTE, value);
  }

  public static String getAllowUpdatesFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ALLOW_UPDATES_FORM_ATTRIBUTE);
  }
  public static boolean hasAllowUpdatesFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ALLOW_UPDATES_FORM_ATTRIBUTE);
  }

  public static void setAllowInsertsFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ALLOW_INSERTS_FORM_ATTRIBUTE, value);
  }

  public static String getAllowInsertsFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ALLOW_INSERTS_FORM_ATTRIBUTE);
  }
  public static boolean hasAllowInsertsFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ALLOW_INSERTS_FORM_ATTRIBUTE);
  }

  public static void setAllowDeletesFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ALLOW_DELETES_FORM_ATTRIBUTE, value);
  }

  public static String getAllowDeletesFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ALLOW_DELETES_FORM_ATTRIBUTE);
  }
  public static boolean hasAllowDeletesFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ALLOW_DELETES_FORM_ATTRIBUTE);
  }

  public static void setEnctypeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ENCTYPE_FORM_ATTRIBUTE, value);
  }

  public static String getEnctypeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ENCTYPE_FORM_ATTRIBUTE);
  }
  public static boolean hasEnctypeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ENCTYPE_FORM_ATTRIBUTE);
  }

  public static void setMethodFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, METHOD_FORM_ATTRIBUTE, value);
  }

  public static String getMethodFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, METHOD_FORM_ATTRIBUTE);
  }
  public static boolean hasMethodFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, METHOD_FORM_ATTRIBUTE);
  }

  public static void setTargetFrameOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, TARGET_FRAME_OFFICE_ATTRIBUTE, value);
  }

  public static String getTargetFrameOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, TARGET_FRAME_OFFICE_ATTRIBUTE);
  }
  public static boolean hasTargetFrameOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, TARGET_FRAME_OFFICE_ATTRIBUTE);
  }

  public static void setControlImplementationFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, CONTROL_IMPLEMENTATION_FORM_ATTRIBUTE, value);
  }

  public static String getControlImplementationFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, CONTROL_IMPLEMENTATION_FORM_ATTRIBUTE);
  }
  public static boolean hasControlImplementationFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, CONTROL_IMPLEMENTATION_FORM_ATTRIBUTE);
  }

  public static void setNameFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, NAME_FORM_ATTRIBUTE, value);
  }

  public static String getNameFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, NAME_FORM_ATTRIBUTE);
  }
  public static boolean hasNameFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, NAME_FORM_ATTRIBUTE);
  }

  public static void setLabelFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, LABEL_FORM_ATTRIBUTE, value);
  }

  public static String getLabelFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, LABEL_FORM_ATTRIBUTE);
  }
  public static boolean hasLabelFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, LABEL_FORM_ATTRIBUTE);
  }

  public static void setValueFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, VALUE_FORM_ATTRIBUTE, value);
  }

  public static String getValueFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, VALUE_FORM_ATTRIBUTE);
  }
  public static boolean hasValueFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, VALUE_FORM_ATTRIBUTE);
  }

  public static void setSelectedFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, SELECTED_FORM_ATTRIBUTE, value);
  }

  public static String getSelectedFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, SELECTED_FORM_ATTRIBUTE);
  }
  public static boolean hasSelectedFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, SELECTED_FORM_ATTRIBUTE);
  }

  public static void setCurrentSelectedFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, CURRENT_SELECTED_FORM_ATTRIBUTE, value);
  }

  public static String getCurrentSelectedFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, CURRENT_SELECTED_FORM_ATTRIBUTE);
  }
  public static boolean hasCurrentSelectedFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, CURRENT_SELECTED_FORM_ATTRIBUTE);
  }

  public static void setTextStyleNameFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, TEXT_STYLE_NAME_FORM_ATTRIBUTE, value);
  }

  public static String getTextStyleNameFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, TEXT_STYLE_NAME_FORM_ATTRIBUTE);
  }
  public static boolean hasTextStyleNameFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, TEXT_STYLE_NAME_FORM_ATTRIBUTE);
  }

  public static void setDisplayOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, DISPLAY_OFFICE_ATTRIBUTE, value);
  }

  public static String getDisplayOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, DISPLAY_OFFICE_ATTRIBUTE);
  }
  public static boolean hasDisplayOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, DISPLAY_OFFICE_ATTRIBUTE);
  }

  public static void setMacroNameScriptAttribute(Element element, String value) {
    element.setAttributeNS(SCRIPT_NS, MACRO_NAME_SCRIPT_ATTRIBUTE, value);
  }

  public static String getMacroNameScriptAttribute(Element element) {
    return element.getAttributeNS(SCRIPT_NS, MACRO_NAME_SCRIPT_ATTRIBUTE);
  }

  public static void setAutomaticUpdateOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, AUTOMATIC_UPDATE_OFFICE_ATTRIBUTE, value);
  }

  public static String getAutomaticUpdateOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, AUTOMATIC_UPDATE_OFFICE_ATTRIBUTE);
  }
  public static boolean hasAutomaticUpdateOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, AUTOMATIC_UPDATE_OFFICE_ATTRIBUTE);
  }

  public static void setDdeItemOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, DDE_ITEM_OFFICE_ATTRIBUTE, value);
  }

  public static String getDdeItemOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, DDE_ITEM_OFFICE_ATTRIBUTE);
  }

  public static void setDdeTopicOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, DDE_TOPIC_OFFICE_ATTRIBUTE, value);
  }

  public static String getDdeTopicOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, DDE_TOPIC_OFFICE_ATTRIBUTE);
  }

  public static void setDdeApplicationOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, DDE_APPLICATION_OFFICE_ATTRIBUTE, value);
  }

  public static String getDdeApplicationOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, DDE_APPLICATION_OFFICE_ATTRIBUTE);
  }

  public static void setConversionModeOfficeAttribute(Element element, String value) {
    element.setAttributeNS(OFFICE_NS, CONVERSION_MODE_OFFICE_ATTRIBUTE, value);
  }

  public static String getConversionModeOfficeAttribute(Element element) {
    return element.getAttributeNS(OFFICE_NS, CONVERSION_MODE_OFFICE_ATTRIBUTE);
  }
  public static boolean hasConversionModeOfficeAttribute(Element element) {
    return element.hasAttributeNS(OFFICE_NS, CONVERSION_MODE_OFFICE_ATTRIBUTE);
  }

  public static void setDefaultOutlineLevelStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DEFAULT_OUTLINE_LEVEL_STYLE_ATTRIBUTE, value);
  }

  public static String getDefaultOutlineLevelStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DEFAULT_OUTLINE_LEVEL_STYLE_ATTRIBUTE);
  }
  public static boolean hasDefaultOutlineLevelStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DEFAULT_OUTLINE_LEVEL_STYLE_ATTRIBUTE);
  }

  public static void setClassStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, CLASS_STYLE_ATTRIBUTE, value);
  }

  public static String getClassStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, CLASS_STYLE_ATTRIBUTE);
  }
  public static boolean hasClassStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, CLASS_STYLE_ATTRIBUTE);
  }

  public static void setDataStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DATA_STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getDataStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DATA_STYLE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasDataStyleNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DATA_STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setAutoUpdateStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, AUTO_UPDATE_STYLE_ATTRIBUTE, value);
  }

  public static String getAutoUpdateStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, AUTO_UPDATE_STYLE_ATTRIBUTE);
  }
  public static boolean hasAutoUpdateStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, AUTO_UPDATE_STYLE_ATTRIBUTE);
  }

  public static void setMasterPageNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, MASTER_PAGE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getMasterPageNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, MASTER_PAGE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasMasterPageNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, MASTER_PAGE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setListStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LIST_STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getListStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LIST_STYLE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasListStyleNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LIST_STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setNextStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, NEXT_STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getNextStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, NEXT_STYLE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasNextStyleNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, NEXT_STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setParentStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PARENT_STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getParentStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PARENT_STYLE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasParentStyleNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PARENT_STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setDisplayNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DISPLAY_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getDisplayNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DISPLAY_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasDisplayNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DISPLAY_NAME_STYLE_ATTRIBUTE);
  }

  public static void setNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, NAME_STYLE_ATTRIBUTE);
  }

  public static void setFamilyStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FAMILY_STYLE_ATTRIBUTE, value);
  }

  public static String getFamilyStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FAMILY_STYLE_ATTRIBUTE);
  }

  public static void setBaseCellAddressStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, BASE_CELL_ADDRESS_STYLE_ATTRIBUTE, value);
  }

  public static String getBaseCellAddressStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, BASE_CELL_ADDRESS_STYLE_ATTRIBUTE);
  }
  public static boolean hasBaseCellAddressStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, BASE_CELL_ADDRESS_STYLE_ATTRIBUTE);
  }

  public static void setApplyStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, APPLY_STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getApplyStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, APPLY_STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setConditionStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, CONDITION_STYLE_ATTRIBUTE, value);
  }

  public static String getConditionStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, CONDITION_STYLE_ATTRIBUTE);
  }

  public static void setPageUsageStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PAGE_USAGE_STYLE_ATTRIBUTE, value);
  }

  public static String getPageUsageStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PAGE_USAGE_STYLE_ATTRIBUTE);
  }
  public static boolean hasPageUsageStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PAGE_USAGE_STYLE_ATTRIBUTE);
  }

  public static void setDisplayStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DISPLAY_STYLE_ATTRIBUTE, value);
  }

  public static String getDisplayStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DISPLAY_STYLE_ATTRIBUTE);
  }
  public static boolean hasDisplayStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DISPLAY_STYLE_ATTRIBUTE);
  }

  public static void setLastRowEndColumnTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, LAST_ROW_END_COLUMN_TEXT_ATTRIBUTE, value);
  }

  public static String getLastRowEndColumnTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, LAST_ROW_END_COLUMN_TEXT_ATTRIBUTE);
  }

  public static void setLastRowStartColumnTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, LAST_ROW_START_COLUMN_TEXT_ATTRIBUTE, value);
  }

  public static String getLastRowStartColumnTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, LAST_ROW_START_COLUMN_TEXT_ATTRIBUTE);
  }

  public static void setFirstRowEndColumnTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, FIRST_ROW_END_COLUMN_TEXT_ATTRIBUTE, value);
  }

  public static String getFirstRowEndColumnTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, FIRST_ROW_END_COLUMN_TEXT_ATTRIBUTE);
  }

  public static void setFirstRowStartColumnTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, FIRST_ROW_START_COLUMN_TEXT_ATTRIBUTE, value);
  }

  public static String getFirstRowStartColumnTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, FIRST_ROW_START_COLUMN_TEXT_ATTRIBUTE);
  }

  public static void setFontCharsetStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_CHARSET_STYLE_ATTRIBUTE, value);
  }

  public static String getFontCharsetStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_CHARSET_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontCharsetStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_CHARSET_STYLE_ATTRIBUTE);
  }

  public static void setFontPitchStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_PITCH_STYLE_ATTRIBUTE, value);
  }

  public static String getFontPitchStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_PITCH_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontPitchStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_PITCH_STYLE_ATTRIBUTE);
  }

  public static void setFontFamilyGenericStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_STYLE_ATTRIBUTE, value);
  }

  public static String getFontFamilyGenericStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontFamilyGenericStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_STYLE_ATTRIBUTE);
  }

  public static void setFontAdornmentsStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_ADORNMENTS_STYLE_ATTRIBUTE, value);
  }

  public static String getFontAdornmentsStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_ADORNMENTS_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontAdornmentsStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_ADORNMENTS_STYLE_ATTRIBUTE);
  }

  public static void setOverlineThicknessSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, OVERLINE_THICKNESS_SVG_ATTRIBUTE, value);
  }

  public static String getOverlineThicknessSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, OVERLINE_THICKNESS_SVG_ATTRIBUTE);
  }
  public static boolean hasOverlineThicknessSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, OVERLINE_THICKNESS_SVG_ATTRIBUTE);
  }

  public static void setOverlinePositionSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, OVERLINE_POSITION_SVG_ATTRIBUTE, value);
  }

  public static String getOverlinePositionSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, OVERLINE_POSITION_SVG_ATTRIBUTE);
  }
  public static boolean hasOverlinePositionSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, OVERLINE_POSITION_SVG_ATTRIBUTE);
  }

  public static void setStrikethroughThicknessSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STRIKETHROUGH_THICKNESS_SVG_ATTRIBUTE, value);
  }

  public static String getStrikethroughThicknessSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STRIKETHROUGH_THICKNESS_SVG_ATTRIBUTE);
  }
  public static boolean hasStrikethroughThicknessSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STRIKETHROUGH_THICKNESS_SVG_ATTRIBUTE);
  }

  public static void setStrikethroughPositionSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STRIKETHROUGH_POSITION_SVG_ATTRIBUTE, value);
  }

  public static String getStrikethroughPositionSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STRIKETHROUGH_POSITION_SVG_ATTRIBUTE);
  }
  public static boolean hasStrikethroughPositionSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STRIKETHROUGH_POSITION_SVG_ATTRIBUTE);
  }

  public static void setUnderlineThicknessSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, UNDERLINE_THICKNESS_SVG_ATTRIBUTE, value);
  }

  public static String getUnderlineThicknessSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, UNDERLINE_THICKNESS_SVG_ATTRIBUTE);
  }
  public static boolean hasUnderlineThicknessSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, UNDERLINE_THICKNESS_SVG_ATTRIBUTE);
  }

  public static void setUnderlinePositionSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, UNDERLINE_POSITION_SVG_ATTRIBUTE, value);
  }

  public static String getUnderlinePositionSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, UNDERLINE_POSITION_SVG_ATTRIBUTE);
  }
  public static boolean hasUnderlinePositionSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, UNDERLINE_POSITION_SVG_ATTRIBUTE);
  }

  public static void setVHangingSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, V_HANGING_SVG_ATTRIBUTE, value);
  }

  public static String getVHangingSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, V_HANGING_SVG_ATTRIBUTE);
  }
  public static boolean hasVHangingSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, V_HANGING_SVG_ATTRIBUTE);
  }

  public static void setVMathematicalSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, V_MATHEMATICAL_SVG_ATTRIBUTE, value);
  }

  public static String getVMathematicalSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, V_MATHEMATICAL_SVG_ATTRIBUTE);
  }
  public static boolean hasVMathematicalSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, V_MATHEMATICAL_SVG_ATTRIBUTE);
  }

  public static void setVAlphabeticSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, V_ALPHABETIC_SVG_ATTRIBUTE, value);
  }

  public static String getVAlphabeticSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, V_ALPHABETIC_SVG_ATTRIBUTE);
  }
  public static boolean hasVAlphabeticSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, V_ALPHABETIC_SVG_ATTRIBUTE);
  }

  public static void setVIdeographicSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, V_IDEOGRAPHIC_SVG_ATTRIBUTE, value);
  }

  public static String getVIdeographicSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, V_IDEOGRAPHIC_SVG_ATTRIBUTE);
  }
  public static boolean hasVIdeographicSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, V_IDEOGRAPHIC_SVG_ATTRIBUTE);
  }

  public static void setHangingSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, HANGING_SVG_ATTRIBUTE, value);
  }

  public static String getHangingSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, HANGING_SVG_ATTRIBUTE);
  }
  public static boolean hasHangingSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, HANGING_SVG_ATTRIBUTE);
  }

  public static void setMathematicalSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, MATHEMATICAL_SVG_ATTRIBUTE, value);
  }

  public static String getMathematicalSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, MATHEMATICAL_SVG_ATTRIBUTE);
  }
  public static boolean hasMathematicalSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, MATHEMATICAL_SVG_ATTRIBUTE);
  }

  public static void setAlphabeticSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, ALPHABETIC_SVG_ATTRIBUTE, value);
  }

  public static String getAlphabeticSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, ALPHABETIC_SVG_ATTRIBUTE);
  }
  public static boolean hasAlphabeticSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, ALPHABETIC_SVG_ATTRIBUTE);
  }

  public static void setIdeographicSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, IDEOGRAPHIC_SVG_ATTRIBUTE, value);
  }

  public static String getIdeographicSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, IDEOGRAPHIC_SVG_ATTRIBUTE);
  }
  public static boolean hasIdeographicSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, IDEOGRAPHIC_SVG_ATTRIBUTE);
  }

  public static void setBboxSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, BBOX_SVG_ATTRIBUTE, value);
  }

  public static String getBboxSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, BBOX_SVG_ATTRIBUTE);
  }
  public static boolean hasBboxSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, BBOX_SVG_ATTRIBUTE);
  }

  public static void setWidthsSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, WIDTHS_SVG_ATTRIBUTE, value);
  }

  public static String getWidthsSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, WIDTHS_SVG_ATTRIBUTE);
  }
  public static boolean hasWidthsSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, WIDTHS_SVG_ATTRIBUTE);
  }

  public static void setDescentSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, DESCENT_SVG_ATTRIBUTE, value);
  }

  public static String getDescentSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, DESCENT_SVG_ATTRIBUTE);
  }
  public static boolean hasDescentSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, DESCENT_SVG_ATTRIBUTE);
  }

  public static void setAscentSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, ASCENT_SVG_ATTRIBUTE, value);
  }

  public static String getAscentSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, ASCENT_SVG_ATTRIBUTE);
  }
  public static boolean hasAscentSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, ASCENT_SVG_ATTRIBUTE);
  }

  public static void setAccentHeightSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, ACCENT_HEIGHT_SVG_ATTRIBUTE, value);
  }

  public static String getAccentHeightSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, ACCENT_HEIGHT_SVG_ATTRIBUTE);
  }
  public static boolean hasAccentHeightSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, ACCENT_HEIGHT_SVG_ATTRIBUTE);
  }

  public static void setXHeightSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, X_HEIGHT_SVG_ATTRIBUTE, value);
  }

  public static String getXHeightSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, X_HEIGHT_SVG_ATTRIBUTE);
  }
  public static boolean hasXHeightSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, X_HEIGHT_SVG_ATTRIBUTE);
  }

  public static void setCapHeightSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, CAP_HEIGHT_SVG_ATTRIBUTE, value);
  }

  public static String getCapHeightSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, CAP_HEIGHT_SVG_ATTRIBUTE);
  }
  public static boolean hasCapHeightSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, CAP_HEIGHT_SVG_ATTRIBUTE);
  }

  public static void setSlopeSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, SLOPE_SVG_ATTRIBUTE, value);
  }

  public static String getSlopeSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, SLOPE_SVG_ATTRIBUTE);
  }
  public static boolean hasSlopeSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, SLOPE_SVG_ATTRIBUTE);
  }

  public static void setStemhSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STEMH_SVG_ATTRIBUTE, value);
  }

  public static String getStemhSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STEMH_SVG_ATTRIBUTE);
  }
  public static boolean hasStemhSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STEMH_SVG_ATTRIBUTE);
  }

  public static void setStemvSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STEMV_SVG_ATTRIBUTE, value);
  }

  public static String getStemvSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STEMV_SVG_ATTRIBUTE);
  }
  public static boolean hasStemvSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STEMV_SVG_ATTRIBUTE);
  }

  public static void setPanose1SvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, PANOSE_1_SVG_ATTRIBUTE, value);
  }

  public static String getPanose1SvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, PANOSE_1_SVG_ATTRIBUTE);
  }
  public static boolean hasPanose1SvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, PANOSE_1_SVG_ATTRIBUTE);
  }

  public static void setUnitsPerEmSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, UNITS_PER_EM_SVG_ATTRIBUTE, value);
  }

  public static String getUnitsPerEmSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, UNITS_PER_EM_SVG_ATTRIBUTE);
  }
  public static boolean hasUnitsPerEmSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, UNITS_PER_EM_SVG_ATTRIBUTE);
  }

  public static void setUnicodeRangeSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, UNICODE_RANGE_SVG_ATTRIBUTE, value);
  }

  public static String getUnicodeRangeSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, UNICODE_RANGE_SVG_ATTRIBUTE);
  }
  public static boolean hasUnicodeRangeSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, UNICODE_RANGE_SVG_ATTRIBUTE);
  }

  public static void setFontSizeSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FONT_SIZE_SVG_ATTRIBUTE, value);
  }

  public static String getFontSizeSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FONT_SIZE_SVG_ATTRIBUTE);
  }
  public static boolean hasFontSizeSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FONT_SIZE_SVG_ATTRIBUTE);
  }

  public static void setFontStretchSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FONT_STRETCH_SVG_ATTRIBUTE, value);
  }

  public static String getFontStretchSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FONT_STRETCH_SVG_ATTRIBUTE);
  }
  public static boolean hasFontStretchSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FONT_STRETCH_SVG_ATTRIBUTE);
  }

  public static void setFontWeightSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FONT_WEIGHT_SVG_ATTRIBUTE, value);
  }

  public static String getFontWeightSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FONT_WEIGHT_SVG_ATTRIBUTE);
  }
  public static boolean hasFontWeightSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FONT_WEIGHT_SVG_ATTRIBUTE);
  }

  public static void setFontVariantSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FONT_VARIANT_SVG_ATTRIBUTE, value);
  }

  public static String getFontVariantSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FONT_VARIANT_SVG_ATTRIBUTE);
  }
  public static boolean hasFontVariantSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FONT_VARIANT_SVG_ATTRIBUTE);
  }

  public static void setFontStyleSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FONT_STYLE_SVG_ATTRIBUTE, value);
  }

  public static String getFontStyleSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FONT_STYLE_SVG_ATTRIBUTE);
  }
  public static boolean hasFontStyleSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FONT_STYLE_SVG_ATTRIBUTE);
  }

  public static void setFontFamilySvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FONT_FAMILY_SVG_ATTRIBUTE, value);
  }

  public static String getFontFamilySvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FONT_FAMILY_SVG_ATTRIBUTE);
  }
  public static boolean hasFontFamilySvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FONT_FAMILY_SVG_ATTRIBUTE);
  }

  public static void setStringSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STRING_SVG_ATTRIBUTE, value);
  }

  public static String getStringSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STRING_SVG_ATTRIBUTE);
  }
  public static boolean hasStringSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STRING_SVG_ATTRIBUTE);
  }

  public static void setNameAttribute(Element element, String value) {
    element.setAttributeNS(null, NAME_ATTRIBUTE, value);
  }

  public static String getNameAttribute(Element element) {
    return element.getAttributeNS(null, NAME_ATTRIBUTE);
  }
  public static boolean hasNameAttribute(Element element) {
    return element.hasAttributeNS(null, NAME_ATTRIBUTE);
  }

  public static void setTransliterationStyleNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, TRANSLITERATION_STYLE_NUMBER_ATTRIBUTE, value);
  }

  public static String getTransliterationStyleNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, TRANSLITERATION_STYLE_NUMBER_ATTRIBUTE);
  }
  public static boolean hasTransliterationStyleNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, TRANSLITERATION_STYLE_NUMBER_ATTRIBUTE);
  }

  public static void setTransliterationCountryNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, TRANSLITERATION_COUNTRY_NUMBER_ATTRIBUTE, value);
  }

  public static String getTransliterationCountryNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, TRANSLITERATION_COUNTRY_NUMBER_ATTRIBUTE);
  }
  public static boolean hasTransliterationCountryNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, TRANSLITERATION_COUNTRY_NUMBER_ATTRIBUTE);
  }

  public static void setTransliterationLanguageNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, TRANSLITERATION_LANGUAGE_NUMBER_ATTRIBUTE, value);
  }

  public static String getTransliterationLanguageNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, TRANSLITERATION_LANGUAGE_NUMBER_ATTRIBUTE);
  }
  public static boolean hasTransliterationLanguageNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, TRANSLITERATION_LANGUAGE_NUMBER_ATTRIBUTE);
  }

  public static void setTransliterationFormatNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, TRANSLITERATION_FORMAT_NUMBER_ATTRIBUTE, value);
  }

  public static String getTransliterationFormatNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, TRANSLITERATION_FORMAT_NUMBER_ATTRIBUTE);
  }
  public static boolean hasTransliterationFormatNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, TRANSLITERATION_FORMAT_NUMBER_ATTRIBUTE);
  }

  public static void setVolatileStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, VOLATILE_STYLE_ATTRIBUTE, value);
  }

  public static String getVolatileStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, VOLATILE_STYLE_ATTRIBUTE);
  }
  public static boolean hasVolatileStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, VOLATILE_STYLE_ATTRIBUTE);
  }

  public static void setTitleNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, TITLE_NUMBER_ATTRIBUTE, value);
  }

  public static String getTitleNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, TITLE_NUMBER_ATTRIBUTE);
  }
  public static boolean hasTitleNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, TITLE_NUMBER_ATTRIBUTE);
  }

  public static void setCountryNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, COUNTRY_NUMBER_ATTRIBUTE, value);
  }

  public static String getCountryNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, COUNTRY_NUMBER_ATTRIBUTE);
  }
  public static boolean hasCountryNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, COUNTRY_NUMBER_ATTRIBUTE);
  }

  public static void setLanguageNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, LANGUAGE_NUMBER_ATTRIBUTE, value);
  }

  public static String getLanguageNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, LANGUAGE_NUMBER_ATTRIBUTE);
  }
  public static boolean hasLanguageNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, LANGUAGE_NUMBER_ATTRIBUTE);
  }

  public static void setGroupingNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, GROUPING_NUMBER_ATTRIBUTE, value);
  }

  public static String getGroupingNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, GROUPING_NUMBER_ATTRIBUTE);
  }
  public static boolean hasGroupingNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, GROUPING_NUMBER_ATTRIBUTE);
  }

  public static void setMinIntegerDigitsNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, MIN_INTEGER_DIGITS_NUMBER_ATTRIBUTE, value);
  }

  public static String getMinIntegerDigitsNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, MIN_INTEGER_DIGITS_NUMBER_ATTRIBUTE);
  }
  public static boolean hasMinIntegerDigitsNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, MIN_INTEGER_DIGITS_NUMBER_ATTRIBUTE);
  }

  public static void setDecimalPlacesNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, DECIMAL_PLACES_NUMBER_ATTRIBUTE, value);
  }

  public static String getDecimalPlacesNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, DECIMAL_PLACES_NUMBER_ATTRIBUTE);
  }
  public static boolean hasDecimalPlacesNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, DECIMAL_PLACES_NUMBER_ATTRIBUTE);
  }

  public static void setDisplayFactorNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, DISPLAY_FACTOR_NUMBER_ATTRIBUTE, value);
  }

  public static String getDisplayFactorNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, DISPLAY_FACTOR_NUMBER_ATTRIBUTE);
  }
  public static boolean hasDisplayFactorNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, DISPLAY_FACTOR_NUMBER_ATTRIBUTE);
  }

  public static void setDecimalReplacementNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, DECIMAL_REPLACEMENT_NUMBER_ATTRIBUTE, value);
  }

  public static String getDecimalReplacementNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, DECIMAL_REPLACEMENT_NUMBER_ATTRIBUTE);
  }
  public static boolean hasDecimalReplacementNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, DECIMAL_REPLACEMENT_NUMBER_ATTRIBUTE);
  }

  public static void setPositionNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, POSITION_NUMBER_ATTRIBUTE, value);
  }

  public static String getPositionNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, POSITION_NUMBER_ATTRIBUTE);
  }

  public static void setMinExponentDigitsNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, MIN_EXPONENT_DIGITS_NUMBER_ATTRIBUTE, value);
  }

  public static String getMinExponentDigitsNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, MIN_EXPONENT_DIGITS_NUMBER_ATTRIBUTE);
  }
  public static boolean hasMinExponentDigitsNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, MIN_EXPONENT_DIGITS_NUMBER_ATTRIBUTE);
  }

  public static void setDenominatorValueNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, DENOMINATOR_VALUE_NUMBER_ATTRIBUTE, value);
  }

  public static String getDenominatorValueNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, DENOMINATOR_VALUE_NUMBER_ATTRIBUTE);
  }
  public static boolean hasDenominatorValueNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, DENOMINATOR_VALUE_NUMBER_ATTRIBUTE);
  }

  public static void setMinDenominatorDigitsNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, MIN_DENOMINATOR_DIGITS_NUMBER_ATTRIBUTE, value);
  }

  public static String getMinDenominatorDigitsNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, MIN_DENOMINATOR_DIGITS_NUMBER_ATTRIBUTE);
  }
  public static boolean hasMinDenominatorDigitsNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, MIN_DENOMINATOR_DIGITS_NUMBER_ATTRIBUTE);
  }

  public static void setMinNumeratorDigitsNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, MIN_NUMERATOR_DIGITS_NUMBER_ATTRIBUTE, value);
  }

  public static String getMinNumeratorDigitsNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, MIN_NUMERATOR_DIGITS_NUMBER_ATTRIBUTE);
  }
  public static boolean hasMinNumeratorDigitsNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, MIN_NUMERATOR_DIGITS_NUMBER_ATTRIBUTE);
  }

  public static void setAutomaticOrderNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, AUTOMATIC_ORDER_NUMBER_ATTRIBUTE, value);
  }

  public static String getAutomaticOrderNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, AUTOMATIC_ORDER_NUMBER_ATTRIBUTE);
  }
  public static boolean hasAutomaticOrderNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, AUTOMATIC_ORDER_NUMBER_ATTRIBUTE);
  }

  public static void setFormatSourceNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, FORMAT_SOURCE_NUMBER_ATTRIBUTE, value);
  }

  public static String getFormatSourceNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, FORMAT_SOURCE_NUMBER_ATTRIBUTE);
  }
  public static boolean hasFormatSourceNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, FORMAT_SOURCE_NUMBER_ATTRIBUTE);
  }

  public static void setCalendarNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, CALENDAR_NUMBER_ATTRIBUTE, value);
  }

  public static String getCalendarNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, CALENDAR_NUMBER_ATTRIBUTE);
  }
  public static boolean hasCalendarNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, CALENDAR_NUMBER_ATTRIBUTE);
  }

  public static void setStyleNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, STYLE_NUMBER_ATTRIBUTE, value);
  }

  public static String getStyleNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, STYLE_NUMBER_ATTRIBUTE);
  }
  public static boolean hasStyleNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, STYLE_NUMBER_ATTRIBUTE);
  }

  public static void setPossessiveFormNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, POSSESSIVE_FORM_NUMBER_ATTRIBUTE, value);
  }

  public static String getPossessiveFormNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, POSSESSIVE_FORM_NUMBER_ATTRIBUTE);
  }
  public static boolean hasPossessiveFormNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, POSSESSIVE_FORM_NUMBER_ATTRIBUTE);
  }

  public static void setTextualNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, TEXTUAL_NUMBER_ATTRIBUTE, value);
  }

  public static String getTextualNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, TEXTUAL_NUMBER_ATTRIBUTE);
  }
  public static boolean hasTextualNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, TEXTUAL_NUMBER_ATTRIBUTE);
  }

  public static void setTruncateOnOverflowNumberAttribute(Element element, String value) {
    element.setAttributeNS(NUMBER_NS, TRUNCATE_ON_OVERFLOW_NUMBER_ATTRIBUTE, value);
  }

  public static String getTruncateOnOverflowNumberAttribute(Element element) {
    return element.getAttributeNS(NUMBER_NS, TRUNCATE_ON_OVERFLOW_NUMBER_ATTRIBUTE);
  }
  public static boolean hasTruncateOnOverflowNumberAttribute(Element element) {
    return element.hasAttributeNS(NUMBER_NS, TRUNCATE_ON_OVERFLOW_NUMBER_ATTRIBUTE);
  }

  public static void setRestartOnPageTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, RESTART_ON_PAGE_TEXT_ATTRIBUTE, value);
  }

  public static String getRestartOnPageTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, RESTART_ON_PAGE_TEXT_ATTRIBUTE);
  }
  public static boolean hasRestartOnPageTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, RESTART_ON_PAGE_TEXT_ATTRIBUTE);
  }

  public static void setCountInTextBoxesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COUNT_IN_TEXT_BOXES_TEXT_ATTRIBUTE, value);
  }

  public static String getCountInTextBoxesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COUNT_IN_TEXT_BOXES_TEXT_ATTRIBUTE);
  }
  public static boolean hasCountInTextBoxesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COUNT_IN_TEXT_BOXES_TEXT_ATTRIBUTE);
  }

  public static void setCountEmptyLinesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COUNT_EMPTY_LINES_TEXT_ATTRIBUTE, value);
  }

  public static String getCountEmptyLinesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COUNT_EMPTY_LINES_TEXT_ATTRIBUTE);
  }
  public static boolean hasCountEmptyLinesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, COUNT_EMPTY_LINES_TEXT_ATTRIBUTE);
  }

  public static void setOffsetTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, OFFSET_TEXT_ATTRIBUTE, value);
  }

  public static String getOffsetTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, OFFSET_TEXT_ATTRIBUTE);
  }
  public static boolean hasOffsetTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, OFFSET_TEXT_ATTRIBUTE);
  }

  public static void setNumberPositionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, NUMBER_POSITION_TEXT_ATTRIBUTE, value);
  }

  public static String getNumberPositionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, NUMBER_POSITION_TEXT_ATTRIBUTE);
  }
  public static boolean hasNumberPositionTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, NUMBER_POSITION_TEXT_ATTRIBUTE);
  }

  public static void setIncrementTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, INCREMENT_TEXT_ATTRIBUTE, value);
  }

  public static String getIncrementTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, INCREMENT_TEXT_ATTRIBUTE);
  }
  public static boolean hasIncrementTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, INCREMENT_TEXT_ATTRIBUTE);
  }

  public static void setNumberLinesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, NUMBER_LINES_TEXT_ATTRIBUTE, value);
  }

  public static String getNumberLinesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, NUMBER_LINES_TEXT_ATTRIBUTE);
  }
  public static boolean hasNumberLinesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, NUMBER_LINES_TEXT_ATTRIBUTE);
  }

  public static void setNumFormatStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, NUM_FORMAT_STYLE_ATTRIBUTE, value);
  }

  public static String getNumFormatStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, NUM_FORMAT_STYLE_ATTRIBUTE);
  }

  public static void setNumLetterSyncStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, NUM_LETTER_SYNC_STYLE_ATTRIBUTE, value);
  }

  public static String getNumLetterSyncStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, NUM_LETTER_SYNC_STYLE_ATTRIBUTE);
  }
  public static boolean hasNumLetterSyncStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, NUM_LETTER_SYNC_STYLE_ATTRIBUTE);
  }

  public static void setFootnotesPositionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, FOOTNOTES_POSITION_TEXT_ATTRIBUTE, value);
  }

  public static String getFootnotesPositionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, FOOTNOTES_POSITION_TEXT_ATTRIBUTE);
  }
  public static boolean hasFootnotesPositionTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, FOOTNOTES_POSITION_TEXT_ATTRIBUTE);
  }

  public static void setStartNumberingAtTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, START_NUMBERING_AT_TEXT_ATTRIBUTE, value);
  }

  public static String getStartNumberingAtTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, START_NUMBERING_AT_TEXT_ATTRIBUTE);
  }
  public static boolean hasStartNumberingAtTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, START_NUMBERING_AT_TEXT_ATTRIBUTE);
  }

  public static void setNumSuffixStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, NUM_SUFFIX_STYLE_ATTRIBUTE, value);
  }

  public static String getNumSuffixStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, NUM_SUFFIX_STYLE_ATTRIBUTE);
  }
  public static boolean hasNumSuffixStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, NUM_SUFFIX_STYLE_ATTRIBUTE);
  }

  public static void setNumPrefixStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, NUM_PREFIX_STYLE_ATTRIBUTE, value);
  }

  public static String getNumPrefixStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, NUM_PREFIX_STYLE_ATTRIBUTE);
  }
  public static boolean hasNumPrefixStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, NUM_PREFIX_STYLE_ATTRIBUTE);
  }

  public static void setDefaultStyleNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DEFAULT_STYLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getDefaultStyleNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DEFAULT_STYLE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasDefaultStyleNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DEFAULT_STYLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setCitationBodyStyleNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CITATION_BODY_STYLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getCitationBodyStyleNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CITATION_BODY_STYLE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasCitationBodyStyleNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CITATION_BODY_STYLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setCitationStyleNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CITATION_STYLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getCitationStyleNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CITATION_STYLE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasCitationStyleNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CITATION_STYLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setNoteClassTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, NOTE_CLASS_TEXT_ATTRIBUTE, value);
  }

  public static String getNoteClassTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, NOTE_CLASS_TEXT_ATTRIBUTE);
  }

  public static void setSortByPositionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SORT_BY_POSITION_TEXT_ATTRIBUTE, value);
  }

  public static String getSortByPositionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SORT_BY_POSITION_TEXT_ATTRIBUTE);
  }
  public static boolean hasSortByPositionTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SORT_BY_POSITION_TEXT_ATTRIBUTE);
  }

  public static void setNumberedEntriesTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, NUMBERED_ENTRIES_TEXT_ATTRIBUTE, value);
  }

  public static String getNumberedEntriesTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, NUMBERED_ENTRIES_TEXT_ATTRIBUTE);
  }
  public static boolean hasNumberedEntriesTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, NUMBERED_ENTRIES_TEXT_ATTRIBUTE);
  }

  public static void setSuffixTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SUFFIX_TEXT_ATTRIBUTE, value);
  }

  public static String getSuffixTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SUFFIX_TEXT_ATTRIBUTE);
  }
  public static boolean hasSuffixTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SUFFIX_TEXT_ATTRIBUTE);
  }

  public static void setPrefixTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, PREFIX_TEXT_ATTRIBUTE, value);
  }

  public static String getPrefixTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, PREFIX_TEXT_ATTRIBUTE);
  }
  public static boolean hasPrefixTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, PREFIX_TEXT_ATTRIBUTE);
  }

  public static void setSortAscendingTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SORT_ASCENDING_TEXT_ATTRIBUTE, value);
  }

  public static String getSortAscendingTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SORT_ASCENDING_TEXT_ATTRIBUTE);
  }
  public static boolean hasSortAscendingTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SORT_ASCENDING_TEXT_ATTRIBUTE);
  }

  public static void setKeyTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, KEY_TEXT_ATTRIBUTE, value);
  }

  public static String getKeyTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, KEY_TEXT_ATTRIBUTE);
  }

  public static void setConsecutiveNumberingTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CONSECUTIVE_NUMBERING_TEXT_ATTRIBUTE, value);
  }

  public static String getConsecutiveNumberingTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CONSECUTIVE_NUMBERING_TEXT_ATTRIBUTE);
  }
  public static boolean hasConsecutiveNumberingTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CONSECUTIVE_NUMBERING_TEXT_ATTRIBUTE);
  }

  public static void setDisplayLevelsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DISPLAY_LEVELS_TEXT_ATTRIBUTE, value);
  }

  public static String getDisplayLevelsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DISPLAY_LEVELS_TEXT_ATTRIBUTE);
  }
  public static boolean hasDisplayLevelsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DISPLAY_LEVELS_TEXT_ATTRIBUTE);
  }

  public static void setFillRuleSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FILL_RULE_SVG_ATTRIBUTE, value);
  }

  public static String getFillRuleSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FILL_RULE_SVG_ATTRIBUTE);
  }
  public static boolean hasFillRuleSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FILL_RULE_SVG_ATTRIBUTE);
  }

  public static void setOpacityNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, OPACITY_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getOpacityNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, OPACITY_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasOpacityNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, OPACITY_NAME_DRAW_ATTRIBUTE);
  }

  public static void setOpacityDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, OPACITY_DRAW_ATTRIBUTE, value);
  }

  public static String getOpacityDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, OPACITY_DRAW_ATTRIBUTE);
  }
  public static boolean hasOpacityDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, OPACITY_DRAW_ATTRIBUTE);
  }

  public static void setTileRepeatOffsetDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TILE_REPEAT_OFFSET_DRAW_ATTRIBUTE, value);
  }

  public static String getTileRepeatOffsetDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TILE_REPEAT_OFFSET_DRAW_ATTRIBUTE);
  }
  public static boolean hasTileRepeatOffsetDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TILE_REPEAT_OFFSET_DRAW_ATTRIBUTE);
  }

  public static void setFillImageRefPointDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_DRAW_ATTRIBUTE, value);
  }

  public static String getFillImageRefPointDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillImageRefPointDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_DRAW_ATTRIBUTE);
  }

  public static void setFillImageRefPointYDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_Y_DRAW_ATTRIBUTE, value);
  }

  public static String getFillImageRefPointYDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_Y_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillImageRefPointYDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_Y_DRAW_ATTRIBUTE);
  }

  public static void setFillImageRefPointXDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_X_DRAW_ATTRIBUTE, value);
  }

  public static String getFillImageRefPointXDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_X_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillImageRefPointXDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_IMAGE_REF_POINT_X_DRAW_ATTRIBUTE);
  }

  public static void setFillImageHeightDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_IMAGE_HEIGHT_DRAW_ATTRIBUTE, value);
  }

  public static String getFillImageHeightDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_IMAGE_HEIGHT_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillImageHeightDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_IMAGE_HEIGHT_DRAW_ATTRIBUTE);
  }

  public static void setFillImageWidthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_IMAGE_WIDTH_DRAW_ATTRIBUTE, value);
  }

  public static String getFillImageWidthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_IMAGE_WIDTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillImageWidthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_IMAGE_WIDTH_DRAW_ATTRIBUTE);
  }

  public static void setRepeatStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, REPEAT_STYLE_ATTRIBUTE, value);
  }

  public static String getRepeatStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, REPEAT_STYLE_ATTRIBUTE);
  }
  public static boolean hasRepeatStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, REPEAT_STYLE_ATTRIBUTE);
  }

  public static void setFillImageNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_IMAGE_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getFillImageNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_IMAGE_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillImageNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_IMAGE_NAME_DRAW_ATTRIBUTE);
  }

  public static void setFillHatchSolidDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_HATCH_SOLID_DRAW_ATTRIBUTE, value);
  }

  public static String getFillHatchSolidDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_HATCH_SOLID_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillHatchSolidDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_HATCH_SOLID_DRAW_ATTRIBUTE);
  }

  public static void setFillHatchNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_HATCH_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getFillHatchNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_HATCH_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillHatchNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_HATCH_NAME_DRAW_ATTRIBUTE);
  }

  public static void setGradientStepCountDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GRADIENT_STEP_COUNT_DRAW_ATTRIBUTE, value);
  }

  public static String getGradientStepCountDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GRADIENT_STEP_COUNT_DRAW_ATTRIBUTE);
  }
  public static boolean hasGradientStepCountDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GRADIENT_STEP_COUNT_DRAW_ATTRIBUTE);
  }

  public static void setFillGradientNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_GRADIENT_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getFillGradientNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_GRADIENT_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillGradientNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_GRADIENT_NAME_DRAW_ATTRIBUTE);
  }

  public static void setSecondaryFillColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SECONDARY_FILL_COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getSecondaryFillColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SECONDARY_FILL_COLOR_DRAW_ATTRIBUTE);
  }
  public static boolean hasSecondaryFillColorDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SECONDARY_FILL_COLOR_DRAW_ATTRIBUTE);
  }

  public static void setFillColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getFillColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_COLOR_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillColorDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_COLOR_DRAW_ATTRIBUTE);
  }

  public static void setFillDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FILL_DRAW_ATTRIBUTE, value);
  }

  public static String getFillDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FILL_DRAW_ATTRIBUTE);
  }
  public static boolean hasFillDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FILL_DRAW_ATTRIBUTE);
  }

  public static void setOleDrawAspectDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, OLE_DRAW_ASPECT_DRAW_ATTRIBUTE, value);
  }

  public static String getOleDrawAspectDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, OLE_DRAW_ASPECT_DRAW_ATTRIBUTE);
  }
  public static boolean hasOleDrawAspectDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, OLE_DRAW_ASPECT_DRAW_ATTRIBUTE);
  }

  public static void setVisibleAreaHeightDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, VISIBLE_AREA_HEIGHT_DRAW_ATTRIBUTE, value);
  }

  public static String getVisibleAreaHeightDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, VISIBLE_AREA_HEIGHT_DRAW_ATTRIBUTE);
  }
  public static boolean hasVisibleAreaHeightDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, VISIBLE_AREA_HEIGHT_DRAW_ATTRIBUTE);
  }

  public static void setVisibleAreaWidthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, VISIBLE_AREA_WIDTH_DRAW_ATTRIBUTE, value);
  }

  public static String getVisibleAreaWidthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, VISIBLE_AREA_WIDTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasVisibleAreaWidthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, VISIBLE_AREA_WIDTH_DRAW_ATTRIBUTE);
  }

  public static void setVisibleAreaTopDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, VISIBLE_AREA_TOP_DRAW_ATTRIBUTE, value);
  }

  public static String getVisibleAreaTopDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, VISIBLE_AREA_TOP_DRAW_ATTRIBUTE);
  }
  public static boolean hasVisibleAreaTopDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, VISIBLE_AREA_TOP_DRAW_ATTRIBUTE);
  }

  public static void setVisibleAreaLeftDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, VISIBLE_AREA_LEFT_DRAW_ATTRIBUTE, value);
  }

  public static String getVisibleAreaLeftDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, VISIBLE_AREA_LEFT_DRAW_ATTRIBUTE);
  }
  public static boolean hasVisibleAreaLeftDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, VISIBLE_AREA_LEFT_DRAW_ATTRIBUTE);
  }

  public static void setFrameMarginVerticalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FRAME_MARGIN_VERTICAL_DRAW_ATTRIBUTE, value);
  }

  public static String getFrameMarginVerticalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FRAME_MARGIN_VERTICAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasFrameMarginVerticalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FRAME_MARGIN_VERTICAL_DRAW_ATTRIBUTE);
  }

  public static void setFrameMarginHorizontalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FRAME_MARGIN_HORIZONTAL_DRAW_ATTRIBUTE, value);
  }

  public static String getFrameMarginHorizontalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FRAME_MARGIN_HORIZONTAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasFrameMarginHorizontalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FRAME_MARGIN_HORIZONTAL_DRAW_ATTRIBUTE);
  }

  public static void setFrameDisplayBorderDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FRAME_DISPLAY_BORDER_DRAW_ATTRIBUTE, value);
  }

  public static String getFrameDisplayBorderDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FRAME_DISPLAY_BORDER_DRAW_ATTRIBUTE);
  }
  public static boolean hasFrameDisplayBorderDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FRAME_DISPLAY_BORDER_DRAW_ATTRIBUTE);
  }

  public static void setFrameDisplayScrollbarDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FRAME_DISPLAY_SCROLLBAR_DRAW_ATTRIBUTE, value);
  }

  public static String getFrameDisplayScrollbarDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FRAME_DISPLAY_SCROLLBAR_DRAW_ATTRIBUTE);
  }
  public static boolean hasFrameDisplayScrollbarDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FRAME_DISPLAY_SCROLLBAR_DRAW_ATTRIBUTE);
  }

  public static void setWrapInfluenceOnPositionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, WRAP_INFLUENCE_ON_POSITION_DRAW_ATTRIBUTE, value);
  }

  public static String getWrapInfluenceOnPositionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, WRAP_INFLUENCE_ON_POSITION_DRAW_ATTRIBUTE);
  }
  public static boolean hasWrapInfluenceOnPositionDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, WRAP_INFLUENCE_ON_POSITION_DRAW_ATTRIBUTE);
  }

  public static void setClipFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, CLIP_FO_ATTRIBUTE, value);
  }

  public static String getClipFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, CLIP_FO_ATTRIBUTE);
  }
  public static boolean hasClipFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, CLIP_FO_ATTRIBUTE);
  }

  public static void setMirrorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, MIRROR_STYLE_ATTRIBUTE, value);
  }

  public static String getMirrorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, MIRROR_STYLE_ATTRIBUTE);
  }
  public static boolean hasMirrorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, MIRROR_STYLE_ATTRIBUTE);
  }

  public static void setOverflowBehaviorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, OVERFLOW_BEHAVIOR_STYLE_ATTRIBUTE, value);
  }

  public static String getOverflowBehaviorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, OVERFLOW_BEHAVIOR_STYLE_ATTRIBUTE);
  }
  public static boolean hasOverflowBehaviorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, OVERFLOW_BEHAVIOR_STYLE_ATTRIBUTE);
  }

  public static void setFlowWithTextStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FLOW_WITH_TEXT_STYLE_ATTRIBUTE, value);
  }

  public static String getFlowWithTextStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FLOW_WITH_TEXT_STYLE_ATTRIBUTE);
  }
  public static boolean hasFlowWithTextStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FLOW_WITH_TEXT_STYLE_ATTRIBUTE);
  }

  public static void setRunThroughStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, RUN_THROUGH_STYLE_ATTRIBUTE, value);
  }

  public static String getRunThroughStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, RUN_THROUGH_STYLE_ATTRIBUTE);
  }
  public static boolean hasRunThroughStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, RUN_THROUGH_STYLE_ATTRIBUTE);
  }

  public static void setWrapContourModeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, WRAP_CONTOUR_MODE_STYLE_ATTRIBUTE, value);
  }

  public static String getWrapContourModeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, WRAP_CONTOUR_MODE_STYLE_ATTRIBUTE);
  }
  public static boolean hasWrapContourModeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, WRAP_CONTOUR_MODE_STYLE_ATTRIBUTE);
  }

  public static void setWrapContourStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, WRAP_CONTOUR_STYLE_ATTRIBUTE, value);
  }

  public static String getWrapContourStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, WRAP_CONTOUR_STYLE_ATTRIBUTE);
  }
  public static boolean hasWrapContourStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, WRAP_CONTOUR_STYLE_ATTRIBUTE);
  }

  public static void setNumberWrappedParagraphsStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, NUMBER_WRAPPED_PARAGRAPHS_STYLE_ATTRIBUTE, value);
  }

  public static String getNumberWrappedParagraphsStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, NUMBER_WRAPPED_PARAGRAPHS_STYLE_ATTRIBUTE);
  }
  public static boolean hasNumberWrappedParagraphsStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, NUMBER_WRAPPED_PARAGRAPHS_STYLE_ATTRIBUTE);
  }

  public static void setWrapDynamicTresholdStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, WRAP_DYNAMIC_TRESHOLD_STYLE_ATTRIBUTE, value);
  }

  public static String getWrapDynamicTresholdStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, WRAP_DYNAMIC_TRESHOLD_STYLE_ATTRIBUTE);
  }
  public static boolean hasWrapDynamicTresholdStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, WRAP_DYNAMIC_TRESHOLD_STYLE_ATTRIBUTE);
  }

  public static void setWrapStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, WRAP_STYLE_ATTRIBUTE, value);
  }

  public static String getWrapStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, WRAP_STYLE_ATTRIBUTE);
  }
  public static boolean hasWrapStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, WRAP_STYLE_ATTRIBUTE);
  }

  public static void setEditableStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, EDITABLE_STYLE_ATTRIBUTE, value);
  }

  public static String getEditableStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, EDITABLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasEditableStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, EDITABLE_STYLE_ATTRIBUTE);
  }

  public static void setBackgroundColorFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BACKGROUND_COLOR_FO_ATTRIBUTE, value);
  }

  public static String getBackgroundColorFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BACKGROUND_COLOR_FO_ATTRIBUTE);
  }
  public static boolean hasBackgroundColorFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BACKGROUND_COLOR_FO_ATTRIBUTE);
  }

  public static void setShadowStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, SHADOW_STYLE_ATTRIBUTE, value);
  }

  public static String getShadowStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, SHADOW_STYLE_ATTRIBUTE);
  }
  public static boolean hasShadowStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, SHADOW_STYLE_ATTRIBUTE);
  }

  public static void setPaddingRightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, PADDING_RIGHT_FO_ATTRIBUTE, value);
  }

  public static String getPaddingRightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, PADDING_RIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasPaddingRightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, PADDING_RIGHT_FO_ATTRIBUTE);
  }

  public static void setPaddingLeftFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, PADDING_LEFT_FO_ATTRIBUTE, value);
  }

  public static String getPaddingLeftFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, PADDING_LEFT_FO_ATTRIBUTE);
  }
  public static boolean hasPaddingLeftFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, PADDING_LEFT_FO_ATTRIBUTE);
  }

  public static void setPaddingBottomFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, PADDING_BOTTOM_FO_ATTRIBUTE, value);
  }

  public static String getPaddingBottomFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, PADDING_BOTTOM_FO_ATTRIBUTE);
  }
  public static boolean hasPaddingBottomFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, PADDING_BOTTOM_FO_ATTRIBUTE);
  }

  public static void setPaddingTopFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, PADDING_TOP_FO_ATTRIBUTE, value);
  }

  public static String getPaddingTopFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, PADDING_TOP_FO_ATTRIBUTE);
  }
  public static boolean hasPaddingTopFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, PADDING_TOP_FO_ATTRIBUTE);
  }

  public static void setPaddingFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, PADDING_FO_ATTRIBUTE, value);
  }

  public static String getPaddingFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, PADDING_FO_ATTRIBUTE);
  }
  public static boolean hasPaddingFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, PADDING_FO_ATTRIBUTE);
  }

  public static void setBorderLineWidthRightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_RIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getBorderLineWidthRightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_RIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasBorderLineWidthRightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_RIGHT_STYLE_ATTRIBUTE);
  }

  public static void setBorderLineWidthLeftStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_LEFT_STYLE_ATTRIBUTE, value);
  }

  public static String getBorderLineWidthLeftStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_LEFT_STYLE_ATTRIBUTE);
  }
  public static boolean hasBorderLineWidthLeftStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_LEFT_STYLE_ATTRIBUTE);
  }

  public static void setBorderLineWidthBottomStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_BOTTOM_STYLE_ATTRIBUTE, value);
  }

  public static String getBorderLineWidthBottomStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_BOTTOM_STYLE_ATTRIBUTE);
  }
  public static boolean hasBorderLineWidthBottomStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_BOTTOM_STYLE_ATTRIBUTE);
  }

  public static void setBorderLineWidthTopStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_TOP_STYLE_ATTRIBUTE, value);
  }

  public static String getBorderLineWidthTopStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_TOP_STYLE_ATTRIBUTE);
  }
  public static boolean hasBorderLineWidthTopStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_TOP_STYLE_ATTRIBUTE);
  }

  public static void setBorderLineWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getBorderLineWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasBorderLineWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, BORDER_LINE_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setBorderRightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BORDER_RIGHT_FO_ATTRIBUTE, value);
  }

  public static String getBorderRightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BORDER_RIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasBorderRightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BORDER_RIGHT_FO_ATTRIBUTE);
  }

  public static void setBorderLeftFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BORDER_LEFT_FO_ATTRIBUTE, value);
  }

  public static String getBorderLeftFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BORDER_LEFT_FO_ATTRIBUTE);
  }
  public static boolean hasBorderLeftFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BORDER_LEFT_FO_ATTRIBUTE);
  }

  public static void setBorderBottomFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BORDER_BOTTOM_FO_ATTRIBUTE, value);
  }

  public static String getBorderBottomFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BORDER_BOTTOM_FO_ATTRIBUTE);
  }
  public static boolean hasBorderBottomFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BORDER_BOTTOM_FO_ATTRIBUTE);
  }

  public static void setBorderTopFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BORDER_TOP_FO_ATTRIBUTE, value);
  }

  public static String getBorderTopFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BORDER_TOP_FO_ATTRIBUTE);
  }
  public static boolean hasBorderTopFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BORDER_TOP_FO_ATTRIBUTE);
  }

  public static void setBorderFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BORDER_FO_ATTRIBUTE, value);
  }

  public static String getBorderFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BORDER_FO_ATTRIBUTE);
  }
  public static boolean hasBorderFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BORDER_FO_ATTRIBUTE);
  }

  public static void setVerticalRelStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, VERTICAL_REL_STYLE_ATTRIBUTE, value);
  }

  public static String getVerticalRelStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, VERTICAL_REL_STYLE_ATTRIBUTE);
  }
  public static boolean hasVerticalRelStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, VERTICAL_REL_STYLE_ATTRIBUTE);
  }

  public static void setVerticalPosStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, VERTICAL_POS_STYLE_ATTRIBUTE, value);
  }

  public static String getVerticalPosStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, VERTICAL_POS_STYLE_ATTRIBUTE);
  }
  public static boolean hasVerticalPosStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, VERTICAL_POS_STYLE_ATTRIBUTE);
  }

  public static void setHorizontalRelStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, HORIZONTAL_REL_STYLE_ATTRIBUTE, value);
  }

  public static String getHorizontalRelStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, HORIZONTAL_REL_STYLE_ATTRIBUTE);
  }
  public static boolean hasHorizontalRelStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, HORIZONTAL_REL_STYLE_ATTRIBUTE);
  }

  public static void setHorizontalPosStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, HORIZONTAL_POS_STYLE_ATTRIBUTE, value);
  }

  public static String getHorizontalPosStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, HORIZONTAL_POS_STYLE_ATTRIBUTE);
  }
  public static boolean hasHorizontalPosStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, HORIZONTAL_POS_STYLE_ATTRIBUTE);
  }

  public static void setProtectStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PROTECT_STYLE_ATTRIBUTE, value);
  }

  public static String getProtectStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PROTECT_STYLE_ATTRIBUTE);
  }
  public static boolean hasProtectStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PROTECT_STYLE_ATTRIBUTE);
  }

  public static void setPrintContentStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PRINT_CONTENT_STYLE_ATTRIBUTE, value);
  }

  public static String getPrintContentStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PRINT_CONTENT_STYLE_ATTRIBUTE);
  }
  public static boolean hasPrintContentStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PRINT_CONTENT_STYLE_ATTRIBUTE);
  }

  public static void setMarginFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MARGIN_FO_ATTRIBUTE, value);
  }

  public static String getMarginFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MARGIN_FO_ATTRIBUTE);
  }
  public static boolean hasMarginFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MARGIN_FO_ATTRIBUTE);
  }

  public static void setMarginBottomFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MARGIN_BOTTOM_FO_ATTRIBUTE, value);
  }

  public static String getMarginBottomFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MARGIN_BOTTOM_FO_ATTRIBUTE);
  }
  public static boolean hasMarginBottomFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MARGIN_BOTTOM_FO_ATTRIBUTE);
  }

  public static void setMarginTopFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MARGIN_TOP_FO_ATTRIBUTE, value);
  }

  public static String getMarginTopFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MARGIN_TOP_FO_ATTRIBUTE);
  }
  public static boolean hasMarginTopFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MARGIN_TOP_FO_ATTRIBUTE);
  }

  public static void setMarginRightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MARGIN_RIGHT_FO_ATTRIBUTE, value);
  }

  public static String getMarginRightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MARGIN_RIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasMarginRightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MARGIN_RIGHT_FO_ATTRIBUTE);
  }

  public static void setMarginLeftFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, MARGIN_LEFT_FO_ATTRIBUTE, value);
  }

  public static String getMarginLeftFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, MARGIN_LEFT_FO_ATTRIBUTE);
  }
  public static boolean hasMarginLeftFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, MARGIN_LEFT_FO_ATTRIBUTE);
  }

  public static void setShadowDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, SHADOW_DR3D_ATTRIBUTE, value);
  }

  public static String getShadowDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, SHADOW_DR3D_ATTRIBUTE);
  }
  public static boolean hasShadowDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, SHADOW_DR3D_ATTRIBUTE);
  }

  public static void setShininessDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, SHININESS_DR3D_ATTRIBUTE, value);
  }

  public static String getShininessDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, SHININESS_DR3D_ATTRIBUTE);
  }
  public static boolean hasShininessDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, SHININESS_DR3D_ATTRIBUTE);
  }

  public static void setSpecularColorDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, SPECULAR_COLOR_DR3D_ATTRIBUTE, value);
  }

  public static String getSpecularColorDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, SPECULAR_COLOR_DR3D_ATTRIBUTE);
  }
  public static boolean hasSpecularColorDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, SPECULAR_COLOR_DR3D_ATTRIBUTE);
  }

  public static void setEmissiveColorDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, EMISSIVE_COLOR_DR3D_ATTRIBUTE, value);
  }

  public static String getEmissiveColorDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, EMISSIVE_COLOR_DR3D_ATTRIBUTE);
  }
  public static boolean hasEmissiveColorDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, EMISSIVE_COLOR_DR3D_ATTRIBUTE);
  }

  public static void setTextureModeDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, TEXTURE_MODE_DR3D_ATTRIBUTE, value);
  }

  public static String getTextureModeDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, TEXTURE_MODE_DR3D_ATTRIBUTE);
  }
  public static boolean hasTextureModeDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, TEXTURE_MODE_DR3D_ATTRIBUTE);
  }

  public static void setTextureFilterDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, TEXTURE_FILTER_DR3D_ATTRIBUTE, value);
  }

  public static String getTextureFilterDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, TEXTURE_FILTER_DR3D_ATTRIBUTE);
  }
  public static boolean hasTextureFilterDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, TEXTURE_FILTER_DR3D_ATTRIBUTE);
  }

  public static void setTextureKindDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, TEXTURE_KIND_DR3D_ATTRIBUTE, value);
  }

  public static String getTextureKindDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, TEXTURE_KIND_DR3D_ATTRIBUTE);
  }
  public static boolean hasTextureKindDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, TEXTURE_KIND_DR3D_ATTRIBUTE);
  }

  public static void setTextureGenerationModeYDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, TEXTURE_GENERATION_MODE_Y_DR3D_ATTRIBUTE, value);
  }

  public static String getTextureGenerationModeYDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, TEXTURE_GENERATION_MODE_Y_DR3D_ATTRIBUTE);
  }
  public static boolean hasTextureGenerationModeYDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, TEXTURE_GENERATION_MODE_Y_DR3D_ATTRIBUTE);
  }

  public static void setTextureGenerationModeXDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, TEXTURE_GENERATION_MODE_X_DR3D_ATTRIBUTE, value);
  }

  public static String getTextureGenerationModeXDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, TEXTURE_GENERATION_MODE_X_DR3D_ATTRIBUTE);
  }
  public static boolean hasTextureGenerationModeXDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, TEXTURE_GENERATION_MODE_X_DR3D_ATTRIBUTE);
  }

  public static void setNormalsDirectionDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, NORMALS_DIRECTION_DR3D_ATTRIBUTE, value);
  }

  public static String getNormalsDirectionDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, NORMALS_DIRECTION_DR3D_ATTRIBUTE);
  }
  public static boolean hasNormalsDirectionDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, NORMALS_DIRECTION_DR3D_ATTRIBUTE);
  }

  public static void setNormalsKindDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, NORMALS_KIND_DR3D_ATTRIBUTE, value);
  }

  public static String getNormalsKindDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, NORMALS_KIND_DR3D_ATTRIBUTE);
  }
  public static boolean hasNormalsKindDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, NORMALS_KIND_DR3D_ATTRIBUTE);
  }

  public static void setCloseBackDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, CLOSE_BACK_DR3D_ATTRIBUTE, value);
  }

  public static String getCloseBackDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, CLOSE_BACK_DR3D_ATTRIBUTE);
  }
  public static boolean hasCloseBackDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, CLOSE_BACK_DR3D_ATTRIBUTE);
  }

  public static void setCloseFrontDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, CLOSE_FRONT_DR3D_ATTRIBUTE, value);
  }

  public static String getCloseFrontDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, CLOSE_FRONT_DR3D_ATTRIBUTE);
  }
  public static boolean hasCloseFrontDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, CLOSE_FRONT_DR3D_ATTRIBUTE);
  }

  public static void setEndAngleDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, END_ANGLE_DR3D_ATTRIBUTE, value);
  }

  public static String getEndAngleDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, END_ANGLE_DR3D_ATTRIBUTE);
  }
  public static boolean hasEndAngleDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, END_ANGLE_DR3D_ATTRIBUTE);
  }

  public static void setBackfaceCullingDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, BACKFACE_CULLING_DR3D_ATTRIBUTE, value);
  }

  public static String getBackfaceCullingDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, BACKFACE_CULLING_DR3D_ATTRIBUTE);
  }
  public static boolean hasBackfaceCullingDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, BACKFACE_CULLING_DR3D_ATTRIBUTE);
  }

  public static void setDepthDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, DEPTH_DR3D_ATTRIBUTE, value);
  }

  public static String getDepthDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, DEPTH_DR3D_ATTRIBUTE);
  }
  public static boolean hasDepthDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, DEPTH_DR3D_ATTRIBUTE);
  }

  public static void setBackScaleDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, BACK_SCALE_DR3D_ATTRIBUTE, value);
  }

  public static String getBackScaleDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, BACK_SCALE_DR3D_ATTRIBUTE);
  }
  public static boolean hasBackScaleDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, BACK_SCALE_DR3D_ATTRIBUTE);
  }

  public static void setEdgeRoundingModeDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, EDGE_ROUNDING_MODE_DR3D_ATTRIBUTE, value);
  }

  public static String getEdgeRoundingModeDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, EDGE_ROUNDING_MODE_DR3D_ATTRIBUTE);
  }
  public static boolean hasEdgeRoundingModeDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, EDGE_ROUNDING_MODE_DR3D_ATTRIBUTE);
  }

  public static void setEdgeRoundingDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, EDGE_ROUNDING_DR3D_ATTRIBUTE, value);
  }

  public static String getEdgeRoundingDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, EDGE_ROUNDING_DR3D_ATTRIBUTE);
  }
  public static boolean hasEdgeRoundingDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, EDGE_ROUNDING_DR3D_ATTRIBUTE);
  }

  public static void setVerticalSegmentsDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, VERTICAL_SEGMENTS_DR3D_ATTRIBUTE, value);
  }

  public static String getVerticalSegmentsDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, VERTICAL_SEGMENTS_DR3D_ATTRIBUTE);
  }
  public static boolean hasVerticalSegmentsDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, VERTICAL_SEGMENTS_DR3D_ATTRIBUTE);
  }

  public static void setHorizontalSegmentsDr3dAttribute(Element element, String value) {
    element.setAttributeNS(DR3D_NS, HORIZONTAL_SEGMENTS_DR3D_ATTRIBUTE, value);
  }

  public static String getHorizontalSegmentsDr3dAttribute(Element element) {
    return element.getAttributeNS(DR3D_NS, HORIZONTAL_SEGMENTS_DR3D_ATTRIBUTE);
  }
  public static boolean hasHorizontalSegmentsDr3dAttribute(Element element) {
    return element.hasAttributeNS(DR3D_NS, HORIZONTAL_SEGMENTS_DR3D_ATTRIBUTE);
  }

  public static void setCaptionFitLineLengthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_FIT_LINE_LENGTH_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionFitLineLengthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_FIT_LINE_LENGTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionFitLineLengthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_FIT_LINE_LENGTH_DRAW_ATTRIBUTE);
  }

  public static void setCaptionLineLengthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_LINE_LENGTH_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionLineLengthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_LINE_LENGTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionLineLengthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_LINE_LENGTH_DRAW_ATTRIBUTE);
  }

  public static void setCaptionEscapeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_ESCAPE_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionEscapeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_ESCAPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionEscapeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_ESCAPE_DRAW_ATTRIBUTE);
  }

  public static void setCaptionEscapeDirectionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_ESCAPE_DIRECTION_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionEscapeDirectionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_ESCAPE_DIRECTION_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionEscapeDirectionDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_ESCAPE_DIRECTION_DRAW_ATTRIBUTE);
  }

  public static void setCaptionGapDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_GAP_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionGapDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_GAP_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionGapDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_GAP_DRAW_ATTRIBUTE);
  }

  public static void setCaptionAngleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_ANGLE_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionAngleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_ANGLE_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionAngleDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_ANGLE_DRAW_ATTRIBUTE);
  }

  public static void setCaptionAngleTypeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_ANGLE_TYPE_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionAngleTypeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_ANGLE_TYPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionAngleTypeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_ANGLE_TYPE_DRAW_ATTRIBUTE);
  }

  public static void setCaptionTypeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CAPTION_TYPE_DRAW_ATTRIBUTE, value);
  }

  public static String getCaptionTypeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CAPTION_TYPE_DRAW_ATTRIBUTE);
  }
  public static boolean hasCaptionTypeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CAPTION_TYPE_DRAW_ATTRIBUTE);
  }

  public static void setDecimalPlacesDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DECIMAL_PLACES_DRAW_ATTRIBUTE, value);
  }

  public static String getDecimalPlacesDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DECIMAL_PLACES_DRAW_ATTRIBUTE);
  }
  public static boolean hasDecimalPlacesDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DECIMAL_PLACES_DRAW_ATTRIBUTE);
  }

  public static void setShowUnitDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHOW_UNIT_DRAW_ATTRIBUTE, value);
  }

  public static String getShowUnitDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHOW_UNIT_DRAW_ATTRIBUTE);
  }
  public static boolean hasShowUnitDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SHOW_UNIT_DRAW_ATTRIBUTE);
  }

  public static void setUnitDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, UNIT_DRAW_ATTRIBUTE, value);
  }

  public static String getUnitDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, UNIT_DRAW_ATTRIBUTE);
  }
  public static boolean hasUnitDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, UNIT_DRAW_ATTRIBUTE);
  }

  public static void setMeasureVerticalAlignDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MEASURE_VERTICAL_ALIGN_DRAW_ATTRIBUTE, value);
  }

  public static String getMeasureVerticalAlignDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MEASURE_VERTICAL_ALIGN_DRAW_ATTRIBUTE);
  }
  public static boolean hasMeasureVerticalAlignDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MEASURE_VERTICAL_ALIGN_DRAW_ATTRIBUTE);
  }

  public static void setMeasureAlignDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MEASURE_ALIGN_DRAW_ATTRIBUTE, value);
  }

  public static String getMeasureAlignDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MEASURE_ALIGN_DRAW_ATTRIBUTE);
  }
  public static boolean hasMeasureAlignDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MEASURE_ALIGN_DRAW_ATTRIBUTE);
  }

  public static void setParallelDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, PARALLEL_DRAW_ATTRIBUTE, value);
  }

  public static String getParallelDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, PARALLEL_DRAW_ATTRIBUTE);
  }
  public static boolean hasParallelDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, PARALLEL_DRAW_ATTRIBUTE);
  }

  public static void setPlacingDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, PLACING_DRAW_ATTRIBUTE, value);
  }

  public static String getPlacingDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, PLACING_DRAW_ATTRIBUTE);
  }
  public static boolean hasPlacingDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, PLACING_DRAW_ATTRIBUTE);
  }

  public static void setEndGuideDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_GUIDE_DRAW_ATTRIBUTE, value);
  }

  public static String getEndGuideDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_GUIDE_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndGuideDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_GUIDE_DRAW_ATTRIBUTE);
  }

  public static void setStartGuideDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_GUIDE_DRAW_ATTRIBUTE, value);
  }

  public static String getStartGuideDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_GUIDE_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartGuideDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_GUIDE_DRAW_ATTRIBUTE);
  }

  public static void setGuideDistanceDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GUIDE_DISTANCE_DRAW_ATTRIBUTE, value);
  }

  public static String getGuideDistanceDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GUIDE_DISTANCE_DRAW_ATTRIBUTE);
  }
  public static boolean hasGuideDistanceDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GUIDE_DISTANCE_DRAW_ATTRIBUTE);
  }

  public static void setGuideOverhangDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GUIDE_OVERHANG_DRAW_ATTRIBUTE, value);
  }

  public static String getGuideOverhangDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GUIDE_OVERHANG_DRAW_ATTRIBUTE);
  }
  public static boolean hasGuideOverhangDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GUIDE_OVERHANG_DRAW_ATTRIBUTE);
  }

  public static void setLineDistanceDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, LINE_DISTANCE_DRAW_ATTRIBUTE, value);
  }

  public static String getLineDistanceDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, LINE_DISTANCE_DRAW_ATTRIBUTE);
  }
  public static boolean hasLineDistanceDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, LINE_DISTANCE_DRAW_ATTRIBUTE);
  }

  public static void setEndLineSpacingVerticalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_LINE_SPACING_VERTICAL_DRAW_ATTRIBUTE, value);
  }

  public static String getEndLineSpacingVerticalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_LINE_SPACING_VERTICAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndLineSpacingVerticalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_LINE_SPACING_VERTICAL_DRAW_ATTRIBUTE);
  }

  public static void setEndLineSpacingHorizontalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_LINE_SPACING_HORIZONTAL_DRAW_ATTRIBUTE, value);
  }

  public static String getEndLineSpacingHorizontalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_LINE_SPACING_HORIZONTAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndLineSpacingHorizontalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_LINE_SPACING_HORIZONTAL_DRAW_ATTRIBUTE);
  }

  public static void setStartLineSpacingVerticalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_LINE_SPACING_VERTICAL_DRAW_ATTRIBUTE, value);
  }

  public static String getStartLineSpacingVerticalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_LINE_SPACING_VERTICAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartLineSpacingVerticalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_LINE_SPACING_VERTICAL_DRAW_ATTRIBUTE);
  }

  public static void setStartLineSpacingHorizontalDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_LINE_SPACING_HORIZONTAL_DRAW_ATTRIBUTE, value);
  }

  public static String getStartLineSpacingHorizontalDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_LINE_SPACING_HORIZONTAL_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartLineSpacingHorizontalDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_LINE_SPACING_HORIZONTAL_DRAW_ATTRIBUTE);
  }

  public static void setShadowOpacityDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHADOW_OPACITY_DRAW_ATTRIBUTE, value);
  }

  public static String getShadowOpacityDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHADOW_OPACITY_DRAW_ATTRIBUTE);
  }
  public static boolean hasShadowOpacityDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SHADOW_OPACITY_DRAW_ATTRIBUTE);
  }

  public static void setShadowColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHADOW_COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getShadowColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHADOW_COLOR_DRAW_ATTRIBUTE);
  }
  public static boolean hasShadowColorDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SHADOW_COLOR_DRAW_ATTRIBUTE);
  }

  public static void setShadowOffsetYDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHADOW_OFFSET_Y_DRAW_ATTRIBUTE, value);
  }

  public static String getShadowOffsetYDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHADOW_OFFSET_Y_DRAW_ATTRIBUTE);
  }
  public static boolean hasShadowOffsetYDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SHADOW_OFFSET_Y_DRAW_ATTRIBUTE);
  }

  public static void setShadowOffsetXDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHADOW_OFFSET_X_DRAW_ATTRIBUTE, value);
  }

  public static String getShadowOffsetXDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHADOW_OFFSET_X_DRAW_ATTRIBUTE);
  }
  public static boolean hasShadowOffsetXDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SHADOW_OFFSET_X_DRAW_ATTRIBUTE);
  }

  public static void setShadowDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SHADOW_DRAW_ATTRIBUTE, value);
  }

  public static String getShadowDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SHADOW_DRAW_ATTRIBUTE);
  }
  public static boolean hasShadowDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SHADOW_DRAW_ATTRIBUTE);
  }

  public static void setImageOpacityDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, IMAGE_OPACITY_DRAW_ATTRIBUTE, value);
  }

  public static String getImageOpacityDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, IMAGE_OPACITY_DRAW_ATTRIBUTE);
  }
  public static boolean hasImageOpacityDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, IMAGE_OPACITY_DRAW_ATTRIBUTE);
  }

  public static void setBlueDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, BLUE_DRAW_ATTRIBUTE, value);
  }

  public static String getBlueDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, BLUE_DRAW_ATTRIBUTE);
  }
  public static boolean hasBlueDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, BLUE_DRAW_ATTRIBUTE);
  }

  public static void setGreenDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GREEN_DRAW_ATTRIBUTE, value);
  }

  public static String getGreenDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GREEN_DRAW_ATTRIBUTE);
  }
  public static boolean hasGreenDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GREEN_DRAW_ATTRIBUTE);
  }

  public static void setRedDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, RED_DRAW_ATTRIBUTE, value);
  }

  public static String getRedDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, RED_DRAW_ATTRIBUTE);
  }
  public static boolean hasRedDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, RED_DRAW_ATTRIBUTE);
  }

  public static void setGammaDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, GAMMA_DRAW_ATTRIBUTE, value);
  }

  public static String getGammaDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, GAMMA_DRAW_ATTRIBUTE);
  }
  public static boolean hasGammaDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, GAMMA_DRAW_ATTRIBUTE);
  }

  public static void setContrastDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CONTRAST_DRAW_ATTRIBUTE, value);
  }

  public static String getContrastDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CONTRAST_DRAW_ATTRIBUTE);
  }
  public static boolean hasContrastDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CONTRAST_DRAW_ATTRIBUTE);
  }

  public static void setLuminanceDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, LUMINANCE_DRAW_ATTRIBUTE, value);
  }

  public static String getLuminanceDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, LUMINANCE_DRAW_ATTRIBUTE);
  }
  public static boolean hasLuminanceDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, LUMINANCE_DRAW_ATTRIBUTE);
  }

  public static void setColorInversionDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, COLOR_INVERSION_DRAW_ATTRIBUTE, value);
  }

  public static String getColorInversionDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, COLOR_INVERSION_DRAW_ATTRIBUTE);
  }
  public static boolean hasColorInversionDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, COLOR_INVERSION_DRAW_ATTRIBUTE);
  }

  public static void setColorModeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, COLOR_MODE_DRAW_ATTRIBUTE, value);
  }

  public static String getColorModeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, COLOR_MODE_DRAW_ATTRIBUTE);
  }
  public static boolean hasColorModeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, COLOR_MODE_DRAW_ATTRIBUTE);
  }

  public static void setWrapOptionFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, WRAP_OPTION_FO_ATTRIBUTE, value);
  }

  public static String getWrapOptionFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, WRAP_OPTION_FO_ATTRIBUTE);
  }
  public static boolean hasWrapOptionFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, WRAP_OPTION_FO_ATTRIBUTE);
  }

  public static void setTextareaHorizontalAlignDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXTAREA_HORIZONTAL_ALIGN_DRAW_ATTRIBUTE, value);
  }

  public static String getTextareaHorizontalAlignDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXTAREA_HORIZONTAL_ALIGN_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextareaHorizontalAlignDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXTAREA_HORIZONTAL_ALIGN_DRAW_ATTRIBUTE);
  }

  public static void setTextareaVerticalAlignDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, TEXTAREA_VERTICAL_ALIGN_DRAW_ATTRIBUTE, value);
  }

  public static String getTextareaVerticalAlignDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, TEXTAREA_VERTICAL_ALIGN_DRAW_ATTRIBUTE);
  }
  public static boolean hasTextareaVerticalAlignDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, TEXTAREA_VERTICAL_ALIGN_DRAW_ATTRIBUTE);
  }

  public static void setFitToContourDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FIT_TO_CONTOUR_DRAW_ATTRIBUTE, value);
  }

  public static String getFitToContourDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FIT_TO_CONTOUR_DRAW_ATTRIBUTE);
  }
  public static boolean hasFitToContourDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FIT_TO_CONTOUR_DRAW_ATTRIBUTE);
  }

  public static void setFitToSizeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, FIT_TO_SIZE_DRAW_ATTRIBUTE, value);
  }

  public static String getFitToSizeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, FIT_TO_SIZE_DRAW_ATTRIBUTE);
  }
  public static boolean hasFitToSizeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, FIT_TO_SIZE_DRAW_ATTRIBUTE);
  }

  public static void setAutoGrowHeightDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, AUTO_GROW_HEIGHT_DRAW_ATTRIBUTE, value);
  }

  public static String getAutoGrowHeightDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, AUTO_GROW_HEIGHT_DRAW_ATTRIBUTE);
  }
  public static boolean hasAutoGrowHeightDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, AUTO_GROW_HEIGHT_DRAW_ATTRIBUTE);
  }

  public static void setAutoGrowWidthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, AUTO_GROW_WIDTH_DRAW_ATTRIBUTE, value);
  }

  public static String getAutoGrowWidthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, AUTO_GROW_WIDTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasAutoGrowWidthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, AUTO_GROW_WIDTH_DRAW_ATTRIBUTE);
  }

  public static void setAnimationStepsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANIMATION_STEPS_TEXT_ATTRIBUTE, value);
  }

  public static String getAnimationStepsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANIMATION_STEPS_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnimationStepsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANIMATION_STEPS_TEXT_ATTRIBUTE);
  }

  public static void setAnimationDelayTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANIMATION_DELAY_TEXT_ATTRIBUTE, value);
  }

  public static String getAnimationDelayTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANIMATION_DELAY_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnimationDelayTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANIMATION_DELAY_TEXT_ATTRIBUTE);
  }

  public static void setAnimationRepeatTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANIMATION_REPEAT_TEXT_ATTRIBUTE, value);
  }

  public static String getAnimationRepeatTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANIMATION_REPEAT_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnimationRepeatTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANIMATION_REPEAT_TEXT_ATTRIBUTE);
  }

  public static void setAnimationStopInsideTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANIMATION_STOP_INSIDE_TEXT_ATTRIBUTE, value);
  }

  public static String getAnimationStopInsideTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANIMATION_STOP_INSIDE_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnimationStopInsideTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANIMATION_STOP_INSIDE_TEXT_ATTRIBUTE);
  }

  public static void setAnimationStartInsideTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANIMATION_START_INSIDE_TEXT_ATTRIBUTE, value);
  }

  public static String getAnimationStartInsideTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANIMATION_START_INSIDE_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnimationStartInsideTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANIMATION_START_INSIDE_TEXT_ATTRIBUTE);
  }

  public static void setAnimationDirectionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANIMATION_DIRECTION_TEXT_ATTRIBUTE, value);
  }

  public static String getAnimationDirectionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANIMATION_DIRECTION_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnimationDirectionTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANIMATION_DIRECTION_TEXT_ATTRIBUTE);
  }

  public static void setAnimationTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ANIMATION_TEXT_ATTRIBUTE, value);
  }

  public static String getAnimationTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ANIMATION_TEXT_ATTRIBUTE);
  }
  public static boolean hasAnimationTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ANIMATION_TEXT_ATTRIBUTE);
  }

  public static void setSymbolColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, SYMBOL_COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getSymbolColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, SYMBOL_COLOR_DRAW_ATTRIBUTE);
  }
  public static boolean hasSymbolColorDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, SYMBOL_COLOR_DRAW_ATTRIBUTE);
  }

  public static void setStrokeLinejoinDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, STROKE_LINEJOIN_DRAW_ATTRIBUTE, value);
  }

  public static String getStrokeLinejoinDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, STROKE_LINEJOIN_DRAW_ATTRIBUTE);
  }
  public static boolean hasStrokeLinejoinDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, STROKE_LINEJOIN_DRAW_ATTRIBUTE);
  }

  public static void setStrokeOpacitySvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STROKE_OPACITY_SVG_ATTRIBUTE, value);
  }

  public static String getStrokeOpacitySvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STROKE_OPACITY_SVG_ATTRIBUTE);
  }
  public static boolean hasStrokeOpacitySvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STROKE_OPACITY_SVG_ATTRIBUTE);
  }

  public static void setMarkerEndCenterDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MARKER_END_CENTER_DRAW_ATTRIBUTE, value);
  }

  public static String getMarkerEndCenterDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MARKER_END_CENTER_DRAW_ATTRIBUTE);
  }
  public static boolean hasMarkerEndCenterDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MARKER_END_CENTER_DRAW_ATTRIBUTE);
  }

  public static void setMarkerStartCenterDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MARKER_START_CENTER_DRAW_ATTRIBUTE, value);
  }

  public static String getMarkerStartCenterDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MARKER_START_CENTER_DRAW_ATTRIBUTE);
  }
  public static boolean hasMarkerStartCenterDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MARKER_START_CENTER_DRAW_ATTRIBUTE);
  }

  public static void setMarkerEndWidthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MARKER_END_WIDTH_DRAW_ATTRIBUTE, value);
  }

  public static String getMarkerEndWidthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MARKER_END_WIDTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasMarkerEndWidthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MARKER_END_WIDTH_DRAW_ATTRIBUTE);
  }

  public static void setMarkerStartWidthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MARKER_START_WIDTH_DRAW_ATTRIBUTE, value);
  }

  public static String getMarkerStartWidthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MARKER_START_WIDTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasMarkerStartWidthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MARKER_START_WIDTH_DRAW_ATTRIBUTE);
  }

  public static void setMarkerEndDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MARKER_END_DRAW_ATTRIBUTE, value);
  }

  public static String getMarkerEndDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MARKER_END_DRAW_ATTRIBUTE);
  }
  public static boolean hasMarkerEndDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MARKER_END_DRAW_ATTRIBUTE);
  }

  public static void setMarkerStartDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, MARKER_START_DRAW_ATTRIBUTE, value);
  }

  public static String getMarkerStartDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, MARKER_START_DRAW_ATTRIBUTE);
  }
  public static boolean hasMarkerStartDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, MARKER_START_DRAW_ATTRIBUTE);
  }

  public static void setStrokeColorSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STROKE_COLOR_SVG_ATTRIBUTE, value);
  }

  public static String getStrokeColorSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STROKE_COLOR_SVG_ATTRIBUTE);
  }
  public static boolean hasStrokeColorSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STROKE_COLOR_SVG_ATTRIBUTE);
  }

  public static void setStrokeWidthSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STROKE_WIDTH_SVG_ATTRIBUTE, value);
  }

  public static String getStrokeWidthSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STROKE_WIDTH_SVG_ATTRIBUTE);
  }
  public static boolean hasStrokeWidthSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STROKE_WIDTH_SVG_ATTRIBUTE);
  }

  public static void setStrokeDashNamesDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, STROKE_DASH_NAMES_DRAW_ATTRIBUTE, value);
  }

  public static String getStrokeDashNamesDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, STROKE_DASH_NAMES_DRAW_ATTRIBUTE);
  }
  public static boolean hasStrokeDashNamesDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, STROKE_DASH_NAMES_DRAW_ATTRIBUTE);
  }

  public static void setStrokeDashDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, STROKE_DASH_DRAW_ATTRIBUTE, value);
  }

  public static String getStrokeDashDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, STROKE_DASH_DRAW_ATTRIBUTE);
  }
  public static boolean hasStrokeDashDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, STROKE_DASH_DRAW_ATTRIBUTE);
  }

  public static void setStrokeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, STROKE_DRAW_ATTRIBUTE, value);
  }

  public static String getStrokeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, STROKE_DRAW_ATTRIBUTE);
  }
  public static boolean hasStrokeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, STROKE_DRAW_ATTRIBUTE);
  }

  public static void setDisplayDateTimePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, DISPLAY_DATE_TIME_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getDisplayDateTimePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, DISPLAY_DATE_TIME_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasDisplayDateTimePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, DISPLAY_DATE_TIME_PRESENTATION_ATTRIBUTE);
  }

  public static void setDisplayPageNumberPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, DISPLAY_PAGE_NUMBER_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getDisplayPageNumberPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, DISPLAY_PAGE_NUMBER_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasDisplayPageNumberPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, DISPLAY_PAGE_NUMBER_PRESENTATION_ATTRIBUTE);
  }

  public static void setDisplayFooterPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, DISPLAY_FOOTER_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getDisplayFooterPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, DISPLAY_FOOTER_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasDisplayFooterPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, DISPLAY_FOOTER_PRESENTATION_ATTRIBUTE);
  }

  public static void setDisplayHeaderPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, DISPLAY_HEADER_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getDisplayHeaderPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, DISPLAY_HEADER_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasDisplayHeaderPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, DISPLAY_HEADER_PRESENTATION_ATTRIBUTE);
  }

  public static void setBackgroundVisiblePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, BACKGROUND_VISIBLE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getBackgroundVisiblePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, BACKGROUND_VISIBLE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasBackgroundVisiblePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, BACKGROUND_VISIBLE_PRESENTATION_ATTRIBUTE);
  }

  public static void setBackgroundObjectsVisiblePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, BACKGROUND_OBJECTS_VISIBLE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getBackgroundObjectsVisiblePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, BACKGROUND_OBJECTS_VISIBLE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasBackgroundObjectsVisiblePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, BACKGROUND_OBJECTS_VISIBLE_PRESENTATION_ATTRIBUTE);
  }

  public static void setBackgroundSizeDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, BACKGROUND_SIZE_DRAW_ATTRIBUTE, value);
  }

  public static String getBackgroundSizeDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, BACKGROUND_SIZE_DRAW_ATTRIBUTE);
  }
  public static boolean hasBackgroundSizeDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, BACKGROUND_SIZE_DRAW_ATTRIBUTE);
  }

  public static void setVisibilityPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, VISIBILITY_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getVisibilityPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, VISIBILITY_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasVisibilityPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, VISIBILITY_PRESENTATION_ATTRIBUTE);
  }

  public static void setDurationPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, DURATION_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getDurationPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, DURATION_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasDurationPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, DURATION_PRESENTATION_ATTRIBUTE);
  }

  public static void setFadeColorSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, FADECOLOR_SMIL_ATTRIBUTE, value);
  }

  public static String getFadeColorSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, FADECOLOR_SMIL_ATTRIBUTE);
  }
  public static boolean hasFadeColorSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, FADECOLOR_SMIL_ATTRIBUTE);
  }

  public static void setDirectionSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, DIRECTION_SMIL_ATTRIBUTE, value);
  }

  public static String getDirectionSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, DIRECTION_SMIL_ATTRIBUTE);
  }
  public static boolean hasDirectionSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, DIRECTION_SMIL_ATTRIBUTE);
  }

  public static void setSubtypeSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, SUBTYPE_SMIL_ATTRIBUTE, value);
  }

  public static String getSubtypeSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, SUBTYPE_SMIL_ATTRIBUTE);
  }
  public static boolean hasSubtypeSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, SUBTYPE_SMIL_ATTRIBUTE);
  }

  public static void setTypeSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, TYPE_SMIL_ATTRIBUTE, value);
  }

  public static String getTypeSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, TYPE_SMIL_ATTRIBUTE);
  }
  public static boolean hasTypeSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, TYPE_SMIL_ATTRIBUTE);
  }

  public static void setTransitionSpeedPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, TRANSITION_SPEED_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getTransitionSpeedPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, TRANSITION_SPEED_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasTransitionSpeedPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, TRANSITION_SPEED_PRESENTATION_ATTRIBUTE);
  }

  public static void setTransitionStylePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, TRANSITION_STYLE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getTransitionStylePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, TRANSITION_STYLE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasTransitionStylePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, TRANSITION_STYLE_PRESENTATION_ATTRIBUTE);
  }

  public static void setTransitionTypePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, TRANSITION_TYPE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getTransitionTypePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, TRANSITION_TYPE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasTransitionTypePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, TRANSITION_TYPE_PRESENTATION_ATTRIBUTE);
  }

  public static void setEndIntensityDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_INTENSITY_DRAW_ATTRIBUTE, value);
  }

  public static String getEndIntensityDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_INTENSITY_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndIntensityDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_INTENSITY_DRAW_ATTRIBUTE);
  }

  public static void setStartIntensityDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_INTENSITY_DRAW_ATTRIBUTE, value);
  }

  public static String getStartIntensityDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_INTENSITY_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartIntensityDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_INTENSITY_DRAW_ATTRIBUTE);
  }

  public static void setEndColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getEndColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_COLOR_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndColorDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_COLOR_DRAW_ATTRIBUTE);
  }

  public static void setStartColorDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_COLOR_DRAW_ATTRIBUTE, value);
  }

  public static String getStartColorDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_COLOR_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartColorDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_COLOR_DRAW_ATTRIBUTE);
  }

  public static void setBorderDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, BORDER_DRAW_ATTRIBUTE, value);
  }

  public static String getBorderDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, BORDER_DRAW_ATTRIBUTE);
  }
  public static boolean hasBorderDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, BORDER_DRAW_ATTRIBUTE);
  }

  public static void setAngleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, ANGLE_DRAW_ATTRIBUTE, value);
  }

  public static String getAngleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, ANGLE_DRAW_ATTRIBUTE);
  }
  public static boolean hasAngleDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, ANGLE_DRAW_ATTRIBUTE);
  }

  public static void setCyDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CY_DRAW_ATTRIBUTE, value);
  }

  public static String getCyDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CY_DRAW_ATTRIBUTE);
  }
  public static boolean hasCyDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CY_DRAW_ATTRIBUTE);
  }

  public static void setCxDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, CX_DRAW_ATTRIBUTE, value);
  }

  public static String getCxDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, CX_DRAW_ATTRIBUTE);
  }
  public static boolean hasCxDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, CX_DRAW_ATTRIBUTE);
  }

  public static void setStyleDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, STYLE_DRAW_ATTRIBUTE, value);
  }

  public static String getStyleDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, STYLE_DRAW_ATTRIBUTE);
  }

  public static void setDisplayNameDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DISPLAY_NAME_DRAW_ATTRIBUTE, value);
  }

  public static String getDisplayNameDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DISPLAY_NAME_DRAW_ATTRIBUTE);
  }
  public static boolean hasDisplayNameDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DISPLAY_NAME_DRAW_ATTRIBUTE);
  }

  public static void setSpreadMethodSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, SPREADMETHOD_SVG_ATTRIBUTE, value);
  }

  public static String getSpreadMethodSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, SPREADMETHOD_SVG_ATTRIBUTE);
  }
  public static boolean hasSpreadMethodSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, SPREADMETHOD_SVG_ATTRIBUTE);
  }

  public static void setGradientTransformSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, GRADIENTTRANSFORM_SVG_ATTRIBUTE, value);
  }

  public static String getGradientTransformSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, GRADIENTTRANSFORM_SVG_ATTRIBUTE);
  }
  public static boolean hasGradientTransformSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, GRADIENTTRANSFORM_SVG_ATTRIBUTE);
  }

  public static void setGradientUnitsSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, GRADIENTUNITS_SVG_ATTRIBUTE, value);
  }

  public static String getGradientUnitsSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, GRADIENTUNITS_SVG_ATTRIBUTE);
  }
  public static boolean hasGradientUnitsSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, GRADIENTUNITS_SVG_ATTRIBUTE);
  }

  public static void setFySvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FY_SVG_ATTRIBUTE, value);
  }

  public static String getFySvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FY_SVG_ATTRIBUTE);
  }
  public static boolean hasFySvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FY_SVG_ATTRIBUTE);
  }

  public static void setFxSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, FX_SVG_ATTRIBUTE, value);
  }

  public static String getFxSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, FX_SVG_ATTRIBUTE);
  }
  public static boolean hasFxSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, FX_SVG_ATTRIBUTE);
  }

  public static void setStopOpacitySvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STOP_OPACITY_SVG_ATTRIBUTE, value);
  }

  public static String getStopOpacitySvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STOP_OPACITY_SVG_ATTRIBUTE);
  }
  public static boolean hasStopOpacitySvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STOP_OPACITY_SVG_ATTRIBUTE);
  }

  public static void setStopColorSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, STOP_COLOR_SVG_ATTRIBUTE, value);
  }

  public static String getStopColorSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, STOP_COLOR_SVG_ATTRIBUTE);
  }
  public static boolean hasStopColorSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, STOP_COLOR_SVG_ATTRIBUTE);
  }

  public static void setOffsetSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, OFFSET_SVG_ATTRIBUTE, value);
  }

  public static String getOffsetSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, OFFSET_SVG_ATTRIBUTE);
  }

  public static void setRotationDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, ROTATION_DRAW_ATTRIBUTE, value);
  }

  public static String getRotationDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, ROTATION_DRAW_ATTRIBUTE);
  }
  public static boolean hasRotationDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, ROTATION_DRAW_ATTRIBUTE);
  }

  public static void setDistanceDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DISTANCE_DRAW_ATTRIBUTE, value);
  }

  public static String getDistanceDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DISTANCE_DRAW_ATTRIBUTE);
  }
  public static boolean hasDistanceDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DISTANCE_DRAW_ATTRIBUTE);
  }

  public static void setEndDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, END_DRAW_ATTRIBUTE, value);
  }

  public static String getEndDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, END_DRAW_ATTRIBUTE);
  }
  public static boolean hasEndDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, END_DRAW_ATTRIBUTE);
  }

  public static void setStartDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, START_DRAW_ATTRIBUTE, value);
  }

  public static String getStartDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, START_DRAW_ATTRIBUTE);
  }
  public static boolean hasStartDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, START_DRAW_ATTRIBUTE);
  }

  public static void setDots2LengthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DOTS2_LENGTH_DRAW_ATTRIBUTE, value);
  }

  public static String getDots2LengthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DOTS2_LENGTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasDots2LengthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DOTS2_LENGTH_DRAW_ATTRIBUTE);
  }

  public static void setDots2DrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DOTS2_DRAW_ATTRIBUTE, value);
  }

  public static String getDots2DrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DOTS2_DRAW_ATTRIBUTE);
  }
  public static boolean hasDots2DrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DOTS2_DRAW_ATTRIBUTE);
  }

  public static void setDots1LengthDrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DOTS1_LENGTH_DRAW_ATTRIBUTE, value);
  }

  public static String getDots1LengthDrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DOTS1_LENGTH_DRAW_ATTRIBUTE);
  }
  public static boolean hasDots1LengthDrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DOTS1_LENGTH_DRAW_ATTRIBUTE);
  }

  public static void setDots1DrawAttribute(Element element, String value) {
    element.setAttributeNS(DRAW_NS, DOTS1_DRAW_ATTRIBUTE, value);
  }

  public static String getDots1DrawAttribute(Element element) {
    return element.getAttributeNS(DRAW_NS, DOTS1_DRAW_ATTRIBUTE);
  }
  public static boolean hasDots1DrawAttribute(Element element) {
    return element.hasAttributeNS(DRAW_NS, DOTS1_DRAW_ATTRIBUTE);
  }

  public static void setObjectPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, OBJECT_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getObjectPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, OBJECT_PRESENTATION_ATTRIBUTE);
  }

  public static void setLayoutGridDisplayStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_DISPLAY_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridDisplayStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_DISPLAY_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridDisplayStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_DISPLAY_STYLE_ATTRIBUTE);
  }

  public static void setLayoutGridPrintStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_PRINT_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridPrintStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_PRINT_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridPrintStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_PRINT_STYLE_ATTRIBUTE);
  }

  public static void setLayoutGridRubyBelowStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_RUBY_BELOW_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridRubyBelowStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_RUBY_BELOW_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridRubyBelowStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_RUBY_BELOW_STYLE_ATTRIBUTE);
  }

  public static void setLayoutGridColorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_COLOR_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridColorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_COLOR_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridColorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_COLOR_STYLE_ATTRIBUTE);
  }

  public static void setLayoutGridLinesStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_LINES_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridLinesStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_LINES_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridLinesStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_LINES_STYLE_ATTRIBUTE);
  }

  public static void setLayoutGridRubyHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_RUBY_HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridRubyHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_RUBY_HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridRubyHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_RUBY_HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setLayoutGridBaseHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_BASE_HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridBaseHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_BASE_HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridBaseHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_BASE_HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setLayoutGridModeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LAYOUT_GRID_MODE_STYLE_ATTRIBUTE, value);
  }

  public static String getLayoutGridModeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LAYOUT_GRID_MODE_STYLE_ATTRIBUTE);
  }
  public static boolean hasLayoutGridModeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LAYOUT_GRID_MODE_STYLE_ATTRIBUTE);
  }

  public static void setWritingModeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, WRITING_MODE_STYLE_ATTRIBUTE, value);
  }

  public static String getWritingModeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, WRITING_MODE_STYLE_ATTRIBUTE);
  }
  public static boolean hasWritingModeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, WRITING_MODE_STYLE_ATTRIBUTE);
  }

  public static void setFootnoteMaxHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FOOTNOTE_MAX_HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getFootnoteMaxHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FOOTNOTE_MAX_HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasFootnoteMaxHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FOOTNOTE_MAX_HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setTableCenteringStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TABLE_CENTERING_STYLE_ATTRIBUTE, value);
  }

  public static String getTableCenteringStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TABLE_CENTERING_STYLE_ATTRIBUTE);
  }
  public static boolean hasTableCenteringStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TABLE_CENTERING_STYLE_ATTRIBUTE);
  }

  public static void setScaleToPagesStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, SCALE_TO_PAGES_STYLE_ATTRIBUTE, value);
  }

  public static String getScaleToPagesStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, SCALE_TO_PAGES_STYLE_ATTRIBUTE);
  }
  public static boolean hasScaleToPagesStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, SCALE_TO_PAGES_STYLE_ATTRIBUTE);
  }

  public static void setScaleToStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, SCALE_TO_STYLE_ATTRIBUTE, value);
  }

  public static String getScaleToStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, SCALE_TO_STYLE_ATTRIBUTE);
  }
  public static boolean hasScaleToStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, SCALE_TO_STYLE_ATTRIBUTE);
  }

  public static void setFirstPageNumberStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FIRST_PAGE_NUMBER_STYLE_ATTRIBUTE, value);
  }

  public static String getFirstPageNumberStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FIRST_PAGE_NUMBER_STYLE_ATTRIBUTE);
  }
  public static boolean hasFirstPageNumberStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FIRST_PAGE_NUMBER_STYLE_ATTRIBUTE);
  }

  public static void setPrintPageOrderStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PRINT_PAGE_ORDER_STYLE_ATTRIBUTE, value);
  }

  public static String getPrintPageOrderStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PRINT_PAGE_ORDER_STYLE_ATTRIBUTE);
  }
  public static boolean hasPrintPageOrderStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PRINT_PAGE_ORDER_STYLE_ATTRIBUTE);
  }

  public static void setPrintStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PRINT_STYLE_ATTRIBUTE, value);
  }

  public static String getPrintStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PRINT_STYLE_ATTRIBUTE);
  }
  public static boolean hasPrintStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PRINT_STYLE_ATTRIBUTE);
  }

  public static void setRegisterTruthRefStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, REGISTER_TRUTH_REF_STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getRegisterTruthRefStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, REGISTER_TRUTH_REF_STYLE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasRegisterTruthRefStyleNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, REGISTER_TRUTH_REF_STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setPrintOrientationStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PRINT_ORIENTATION_STYLE_ATTRIBUTE, value);
  }

  public static String getPrintOrientationStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PRINT_ORIENTATION_STYLE_ATTRIBUTE);
  }
  public static boolean hasPrintOrientationStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PRINT_ORIENTATION_STYLE_ATTRIBUTE);
  }

  public static void setPaperTrayNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PAPER_TRAY_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getPaperTrayNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PAPER_TRAY_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasPaperTrayNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PAPER_TRAY_NAME_STYLE_ATTRIBUTE);
  }

  public static void setPageHeightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, PAGE_HEIGHT_FO_ATTRIBUTE, value);
  }

  public static String getPageHeightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, PAGE_HEIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasPageHeightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, PAGE_HEIGHT_FO_ATTRIBUTE);
  }

  public static void setPageWidthFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, PAGE_WIDTH_FO_ATTRIBUTE, value);
  }

  public static String getPageWidthFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, PAGE_WIDTH_FO_ATTRIBUTE);
  }
  public static boolean hasPageWidthFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, PAGE_WIDTH_FO_ATTRIBUTE);
  }

  public static void setDistanceAfterSepStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DISTANCE_AFTER_SEP_STYLE_ATTRIBUTE, value);
  }

  public static String getDistanceAfterSepStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DISTANCE_AFTER_SEP_STYLE_ATTRIBUTE);
  }
  public static boolean hasDistanceAfterSepStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DISTANCE_AFTER_SEP_STYLE_ATTRIBUTE);
  }

  public static void setDistanceBeforeSepStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DISTANCE_BEFORE_SEP_STYLE_ATTRIBUTE, value);
  }

  public static String getDistanceBeforeSepStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DISTANCE_BEFORE_SEP_STYLE_ATTRIBUTE);
  }
  public static boolean hasDistanceBeforeSepStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DISTANCE_BEFORE_SEP_STYLE_ATTRIBUTE);
  }

  public static void setAdjustmentStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, ADJUSTMENT_STYLE_ATTRIBUTE, value);
  }

  public static String getAdjustmentStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, ADJUSTMENT_STYLE_ATTRIBUTE);
  }
  public static boolean hasAdjustmentStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, ADJUSTMENT_STYLE_ATTRIBUTE);
  }

  public static void setLineStyleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LINE_STYLE_STYLE_ATTRIBUTE, value);
  }

  public static String getLineStyleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LINE_STYLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasLineStyleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LINE_STYLE_STYLE_ATTRIBUTE);
  }

  public static void setColorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, COLOR_STYLE_ATTRIBUTE, value);
  }

  public static String getColorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, COLOR_STYLE_ATTRIBUTE);
  }
  public static boolean hasColorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, COLOR_STYLE_ATTRIBUTE);
  }

  public static void setWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setHyphenationPushCharCountFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, HYPHENATION_PUSH_CHAR_COUNT_FO_ATTRIBUTE, value);
  }

  public static String getHyphenationPushCharCountFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, HYPHENATION_PUSH_CHAR_COUNT_FO_ATTRIBUTE);
  }
  public static boolean hasHyphenationPushCharCountFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, HYPHENATION_PUSH_CHAR_COUNT_FO_ATTRIBUTE);
  }

  public static void setHyphenationRemainCharCountFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, HYPHENATION_REMAIN_CHAR_COUNT_FO_ATTRIBUTE, value);
  }

  public static String getHyphenationRemainCharCountFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, HYPHENATION_REMAIN_CHAR_COUNT_FO_ATTRIBUTE);
  }
  public static boolean hasHyphenationRemainCharCountFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, HYPHENATION_REMAIN_CHAR_COUNT_FO_ATTRIBUTE);
  }

  public static void setHyphenateFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, HYPHENATE_FO_ATTRIBUTE, value);
  }

  public static String getHyphenateFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, HYPHENATE_FO_ATTRIBUTE);
  }
  public static boolean hasHyphenateFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, HYPHENATE_FO_ATTRIBUTE);
  }

  public static void setTextRotationScaleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_ROTATION_SCALE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextRotationScaleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_ROTATION_SCALE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextRotationScaleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_ROTATION_SCALE_STYLE_ATTRIBUTE);
  }

  public static void setTextRotationAngleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_ROTATION_ANGLE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextRotationAngleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_ROTATION_ANGLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextRotationAngleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_ROTATION_ANGLE_STYLE_ATTRIBUTE);
  }

  public static void setTextScaleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_SCALE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextScaleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_SCALE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextScaleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_SCALE_STYLE_ATTRIBUTE);
  }

  public static void setTextEmphasizeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_EMPHASIZE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextEmphasizeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_EMPHASIZE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextEmphasizeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_EMPHASIZE_STYLE_ATTRIBUTE);
  }

  public static void setTextCombineEndCharStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_COMBINE_END_CHAR_STYLE_ATTRIBUTE, value);
  }

  public static String getTextCombineEndCharStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_COMBINE_END_CHAR_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextCombineEndCharStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_COMBINE_END_CHAR_STYLE_ATTRIBUTE);
  }

  public static void setTextCombineStartCharStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_COMBINE_START_CHAR_STYLE_ATTRIBUTE, value);
  }

  public static String getTextCombineStartCharStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_COMBINE_START_CHAR_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextCombineStartCharStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_COMBINE_START_CHAR_STYLE_ATTRIBUTE);
  }

  public static void setTextCombineStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_COMBINE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextCombineStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_COMBINE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextCombineStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_COMBINE_STYLE_ATTRIBUTE);
  }

  public static void setTextBlinkingStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_BLINKING_STYLE_ATTRIBUTE, value);
  }

  public static String getTextBlinkingStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_BLINKING_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextBlinkingStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_BLINKING_STYLE_ATTRIBUTE);
  }

  public static void setLetterKerningStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LETTER_KERNING_STYLE_ATTRIBUTE, value);
  }

  public static String getLetterKerningStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LETTER_KERNING_STYLE_ATTRIBUTE);
  }
  public static boolean hasLetterKerningStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LETTER_KERNING_STYLE_ATTRIBUTE);
  }

  public static void setTextLineThroughModeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_MODE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextLineThroughModeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_MODE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextLineThroughModeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_MODE_STYLE_ATTRIBUTE);
  }

  public static void setTextUnderlineModeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_UNDERLINE_MODE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextUnderlineModeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_UNDERLINE_MODE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextUnderlineModeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_UNDERLINE_MODE_STYLE_ATTRIBUTE);
  }

  public static void setFontWeightComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_WEIGHT_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontWeightComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_WEIGHT_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontWeightComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_WEIGHT_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontWeightAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_WEIGHT_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontWeightAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_WEIGHT_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontWeightAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_WEIGHT_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontWeightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, FONT_WEIGHT_FO_ATTRIBUTE, value);
  }

  public static String getFontWeightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, FONT_WEIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasFontWeightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, FONT_WEIGHT_FO_ATTRIBUTE);
  }

  public static void setTextUnderlineColorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_UNDERLINE_COLOR_STYLE_ATTRIBUTE, value);
  }

  public static String getTextUnderlineColorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_UNDERLINE_COLOR_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextUnderlineColorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_UNDERLINE_COLOR_STYLE_ATTRIBUTE);
  }

  public static void setTextUnderlineWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_UNDERLINE_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getTextUnderlineWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_UNDERLINE_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextUnderlineWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_UNDERLINE_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setTextUnderlineStyleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_UNDERLINE_STYLE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextUnderlineStyleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_UNDERLINE_STYLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextUnderlineStyleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_UNDERLINE_STYLE_STYLE_ATTRIBUTE);
  }

  public static void setTextUnderlineTypeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_UNDERLINE_TYPE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextUnderlineTypeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_UNDERLINE_TYPE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextUnderlineTypeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_UNDERLINE_TYPE_STYLE_ATTRIBUTE);
  }

  public static void setTextShadowFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, TEXT_SHADOW_FO_ATTRIBUTE, value);
  }

  public static String getTextShadowFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, TEXT_SHADOW_FO_ATTRIBUTE);
  }
  public static boolean hasTextShadowFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, TEXT_SHADOW_FO_ATTRIBUTE);
  }

  public static void setFontReliefStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_RELIEF_STYLE_ATTRIBUTE, value);
  }

  public static String getFontReliefStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_RELIEF_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontReliefStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_RELIEF_STYLE_ATTRIBUTE);
  }

  public static void setFontStyleComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_STYLE_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontStyleComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_STYLE_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontStyleComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_STYLE_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontStyleAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_STYLE_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontStyleAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_STYLE_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontStyleAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_STYLE_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontStyleFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, FONT_STYLE_FO_ATTRIBUTE, value);
  }

  public static String getFontStyleFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, FONT_STYLE_FO_ATTRIBUTE);
  }
  public static boolean hasFontStyleFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, FONT_STYLE_FO_ATTRIBUTE);
  }

  public static void setCountryComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, COUNTRY_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getCountryComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, COUNTRY_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasCountryComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, COUNTRY_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setCountryAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, COUNTRY_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getCountryAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, COUNTRY_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasCountryAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, COUNTRY_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setLanguageComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LANGUAGE_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getLanguageComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LANGUAGE_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasLanguageComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LANGUAGE_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setLanguageAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LANGUAGE_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getLanguageAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LANGUAGE_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasLanguageAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LANGUAGE_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setLetterSpacingFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, LETTER_SPACING_FO_ATTRIBUTE, value);
  }

  public static String getLetterSpacingFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, LETTER_SPACING_FO_ATTRIBUTE);
  }
  public static boolean hasLetterSpacingFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, LETTER_SPACING_FO_ATTRIBUTE);
  }

  public static void setScriptTypeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, SCRIPT_TYPE_STYLE_ATTRIBUTE, value);
  }

  public static String getScriptTypeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, SCRIPT_TYPE_STYLE_ATTRIBUTE);
  }
  public static boolean hasScriptTypeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, SCRIPT_TYPE_STYLE_ATTRIBUTE);
  }

  public static void setFontSizeRelComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_SIZE_REL_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontSizeRelComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_SIZE_REL_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontSizeRelComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_SIZE_REL_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontSizeRelAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_SIZE_REL_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontSizeRelAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_SIZE_REL_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontSizeRelAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_SIZE_REL_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontSizeRelStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_SIZE_REL_STYLE_ATTRIBUTE, value);
  }

  public static String getFontSizeRelStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_SIZE_REL_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontSizeRelStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_SIZE_REL_STYLE_ATTRIBUTE);
  }

  public static void setFontSizeComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_SIZE_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontSizeComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_SIZE_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontSizeComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_SIZE_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontSizeAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_SIZE_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontSizeAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_SIZE_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontSizeAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_SIZE_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontSizeFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, FONT_SIZE_FO_ATTRIBUTE, value);
  }

  public static String getFontSizeFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, FONT_SIZE_FO_ATTRIBUTE);
  }
  public static boolean hasFontSizeFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, FONT_SIZE_FO_ATTRIBUTE);
  }

  public static void setFontPitchComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_PITCH_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontPitchComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_PITCH_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontPitchComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_PITCH_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontPitchAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_PITCH_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontPitchAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_PITCH_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontPitchAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_PITCH_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontStyleNameComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_STYLE_NAME_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontStyleNameComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_STYLE_NAME_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontStyleNameComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_STYLE_NAME_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontStyleNameAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_STYLE_NAME_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontStyleNameAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_STYLE_NAME_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontStyleNameAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_STYLE_NAME_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getFontStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_STYLE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontStyleNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setFontFamilyGenericComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontFamilyGenericComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontFamilyGenericComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontFamilyGenericAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontFamilyGenericAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontFamilyGenericAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_FAMILY_GENERIC_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontFamilyComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_FAMILY_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontFamilyComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_FAMILY_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontFamilyComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_FAMILY_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontFamilyAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_FAMILY_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontFamilyAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_FAMILY_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontFamilyAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_FAMILY_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontFamilyFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, FONT_FAMILY_FO_ATTRIBUTE, value);
  }

  public static String getFontFamilyFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, FONT_FAMILY_FO_ATTRIBUTE);
  }
  public static boolean hasFontFamilyFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, FONT_FAMILY_FO_ATTRIBUTE);
  }

  public static void setFontNameComplexStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_NAME_COMPLEX_STYLE_ATTRIBUTE, value);
  }

  public static String getFontNameComplexStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_NAME_COMPLEX_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontNameComplexStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_NAME_COMPLEX_STYLE_ATTRIBUTE);
  }

  public static void setFontNameAsianStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_NAME_ASIAN_STYLE_ATTRIBUTE, value);
  }

  public static String getFontNameAsianStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_NAME_ASIAN_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontNameAsianStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_NAME_ASIAN_STYLE_ATTRIBUTE);
  }

  public static void setFontNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getFontNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_NAME_STYLE_ATTRIBUTE);
  }

  public static void setTextPositionStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_POSITION_STYLE_ATTRIBUTE, value);
  }

  public static String getTextPositionStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_POSITION_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextPositionStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_POSITION_STYLE_ATTRIBUTE);
  }

  public static void setTextLineThroughTextStyleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TEXT_STYLE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextLineThroughTextStyleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TEXT_STYLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextLineThroughTextStyleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TEXT_STYLE_STYLE_ATTRIBUTE);
  }

  public static void setTextLineThroughTextStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TEXT_STYLE_ATTRIBUTE, value);
  }

  public static String getTextLineThroughTextStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TEXT_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextLineThroughTextStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TEXT_STYLE_ATTRIBUTE);
  }

  public static void setTextLineThroughColorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_COLOR_STYLE_ATTRIBUTE, value);
  }

  public static String getTextLineThroughColorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_COLOR_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextLineThroughColorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_COLOR_STYLE_ATTRIBUTE);
  }

  public static void setTextLineThroughWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getTextLineThroughWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextLineThroughWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setTextLineThroughStyleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_STYLE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextLineThroughStyleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_STYLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextLineThroughStyleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_STYLE_STYLE_ATTRIBUTE);
  }

  public static void setTextLineThroughTypeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TYPE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextLineThroughTypeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TYPE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextLineThroughTypeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_LINE_THROUGH_TYPE_STYLE_ATTRIBUTE);
  }

  public static void setTextOutlineStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_OUTLINE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextOutlineStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_OUTLINE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextOutlineStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_OUTLINE_STYLE_ATTRIBUTE);
  }

  public static void setUseWindowFontColorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, USE_WINDOW_FONT_COLOR_STYLE_ATTRIBUTE, value);
  }

  public static String getUseWindowFontColorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, USE_WINDOW_FONT_COLOR_STYLE_ATTRIBUTE);
  }
  public static boolean hasUseWindowFontColorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, USE_WINDOW_FONT_COLOR_STYLE_ATTRIBUTE);
  }

  public static void setColorFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, COLOR_FO_ATTRIBUTE, value);
  }

  public static String getColorFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, COLOR_FO_ATTRIBUTE);
  }
  public static boolean hasColorFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, COLOR_FO_ATTRIBUTE);
  }

  public static void setTextTransformFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, TEXT_TRANSFORM_FO_ATTRIBUTE, value);
  }

  public static String getTextTransformFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, TEXT_TRANSFORM_FO_ATTRIBUTE);
  }
  public static boolean hasTextTransformFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, TEXT_TRANSFORM_FO_ATTRIBUTE);
  }

  public static void setFontVariantFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, FONT_VARIANT_FO_ATTRIBUTE, value);
  }

  public static String getFontVariantFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, FONT_VARIANT_FO_ATTRIBUTE);
  }
  public static boolean hasFontVariantFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, FONT_VARIANT_FO_ATTRIBUTE);
  }

  public static void setBackgroundTransparencyStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, BACKGROUND_TRANSPARENCY_STYLE_ATTRIBUTE, value);
  }

  public static String getBackgroundTransparencyStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, BACKGROUND_TRANSPARENCY_STYLE_ATTRIBUTE);
  }
  public static boolean hasBackgroundTransparencyStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, BACKGROUND_TRANSPARENCY_STYLE_ATTRIBUTE);
  }

  public static void setPageNumberStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PAGE_NUMBER_STYLE_ATTRIBUTE, value);
  }

  public static String getPageNumberStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PAGE_NUMBER_STYLE_ATTRIBUTE);
  }
  public static boolean hasPageNumberStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PAGE_NUMBER_STYLE_ATTRIBUTE);
  }

  public static void setSnapToLayoutGridStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, SNAP_TO_LAYOUT_GRID_STYLE_ATTRIBUTE, value);
  }

  public static String getSnapToLayoutGridStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, SNAP_TO_LAYOUT_GRID_STYLE_ATTRIBUTE);
  }
  public static boolean hasSnapToLayoutGridStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, SNAP_TO_LAYOUT_GRID_STYLE_ATTRIBUTE);
  }

  public static void setWritingModeAutomaticStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, WRITING_MODE_AUTOMATIC_STYLE_ATTRIBUTE, value);
  }

  public static String getWritingModeAutomaticStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, WRITING_MODE_AUTOMATIC_STYLE_ATTRIBUTE);
  }
  public static boolean hasWritingModeAutomaticStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, WRITING_MODE_AUTOMATIC_STYLE_ATTRIBUTE);
  }

  public static void setVerticalAlignStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, VERTICAL_ALIGN_STYLE_ATTRIBUTE, value);
  }

  public static String getVerticalAlignStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, VERTICAL_ALIGN_STYLE_ATTRIBUTE);
  }
  public static boolean hasVerticalAlignStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, VERTICAL_ALIGN_STYLE_ATTRIBUTE);
  }

  public static void setLineBreakStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LINE_BREAK_STYLE_ATTRIBUTE, value);
  }

  public static String getLineBreakStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LINE_BREAK_STYLE_ATTRIBUTE);
  }
  public static boolean hasLineBreakStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LINE_BREAK_STYLE_ATTRIBUTE);
  }

  public static void setPunctuationWrapStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, PUNCTUATION_WRAP_STYLE_ATTRIBUTE, value);
  }

  public static String getPunctuationWrapStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, PUNCTUATION_WRAP_STYLE_ATTRIBUTE);
  }
  public static boolean hasPunctuationWrapStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, PUNCTUATION_WRAP_STYLE_ATTRIBUTE);
  }

  public static void setTextAutospaceStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_AUTOSPACE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextAutospaceStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_AUTOSPACE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextAutospaceStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_AUTOSPACE_STYLE_ATTRIBUTE);
  }

  public static void setLineNumberTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, LINE_NUMBER_TEXT_ATTRIBUTE, value);
  }

  public static String getLineNumberTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, LINE_NUMBER_TEXT_ATTRIBUTE);
  }
  public static boolean hasLineNumberTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, LINE_NUMBER_TEXT_ATTRIBUTE);
  }

  public static void setKeepWithNextFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, KEEP_WITH_NEXT_FO_ATTRIBUTE, value);
  }

  public static String getKeepWithNextFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, KEEP_WITH_NEXT_FO_ATTRIBUTE);
  }
  public static boolean hasKeepWithNextFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, KEEP_WITH_NEXT_FO_ATTRIBUTE);
  }

  public static void setBreakAfterFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BREAK_AFTER_FO_ATTRIBUTE, value);
  }

  public static String getBreakAfterFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BREAK_AFTER_FO_ATTRIBUTE);
  }
  public static boolean hasBreakAfterFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BREAK_AFTER_FO_ATTRIBUTE);
  }

  public static void setBreakBeforeFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, BREAK_BEFORE_FO_ATTRIBUTE, value);
  }

  public static String getBreakBeforeFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, BREAK_BEFORE_FO_ATTRIBUTE);
  }
  public static boolean hasBreakBeforeFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, BREAK_BEFORE_FO_ATTRIBUTE);
  }

  public static void setAutoTextIndentStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, AUTO_TEXT_INDENT_STYLE_ATTRIBUTE, value);
  }

  public static String getAutoTextIndentStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, AUTO_TEXT_INDENT_STYLE_ATTRIBUTE);
  }
  public static boolean hasAutoTextIndentStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, AUTO_TEXT_INDENT_STYLE_ATTRIBUTE);
  }

  public static void setTextIndentFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, TEXT_INDENT_FO_ATTRIBUTE, value);
  }

  public static String getTextIndentFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, TEXT_INDENT_FO_ATTRIBUTE);
  }
  public static boolean hasTextIndentFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, TEXT_INDENT_FO_ATTRIBUTE);
  }

  public static void setRegisterTrueStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, REGISTER_TRUE_STYLE_ATTRIBUTE, value);
  }

  public static String getRegisterTrueStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, REGISTER_TRUE_STYLE_ATTRIBUTE);
  }
  public static boolean hasRegisterTrueStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, REGISTER_TRUE_STYLE_ATTRIBUTE);
  }

  public static void setHyphenationLadderCountFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, HYPHENATION_LADDER_COUNT_FO_ATTRIBUTE, value);
  }

  public static String getHyphenationLadderCountFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, HYPHENATION_LADDER_COUNT_FO_ATTRIBUTE);
  }
  public static boolean hasHyphenationLadderCountFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, HYPHENATION_LADDER_COUNT_FO_ATTRIBUTE);
  }

  public static void setHyphenationKeepFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, HYPHENATION_KEEP_FO_ATTRIBUTE, value);
  }

  public static String getHyphenationKeepFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, HYPHENATION_KEEP_FO_ATTRIBUTE);
  }
  public static boolean hasHyphenationKeepFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, HYPHENATION_KEEP_FO_ATTRIBUTE);
  }

  public static void setTabStopDistanceStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TAB_STOP_DISTANCE_STYLE_ATTRIBUTE, value);
  }

  public static String getTabStopDistanceStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TAB_STOP_DISTANCE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTabStopDistanceStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TAB_STOP_DISTANCE_STYLE_ATTRIBUTE);
  }

  public static void setOrphansFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, ORPHANS_FO_ATTRIBUTE, value);
  }

  public static String getOrphansFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, ORPHANS_FO_ATTRIBUTE);
  }
  public static boolean hasOrphansFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, ORPHANS_FO_ATTRIBUTE);
  }

  public static void setWidowsFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, WIDOWS_FO_ATTRIBUTE, value);
  }

  public static String getWidowsFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, WIDOWS_FO_ATTRIBUTE);
  }
  public static boolean hasWidowsFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, WIDOWS_FO_ATTRIBUTE);
  }

  public static void setKeepTogetherFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, KEEP_TOGETHER_FO_ATTRIBUTE, value);
  }

  public static String getKeepTogetherFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, KEEP_TOGETHER_FO_ATTRIBUTE);
  }
  public static boolean hasKeepTogetherFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, KEEP_TOGETHER_FO_ATTRIBUTE);
  }

  public static void setJustifySingleWordStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, JUSTIFY_SINGLE_WORD_STYLE_ATTRIBUTE, value);
  }

  public static String getJustifySingleWordStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, JUSTIFY_SINGLE_WORD_STYLE_ATTRIBUTE);
  }
  public static boolean hasJustifySingleWordStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, JUSTIFY_SINGLE_WORD_STYLE_ATTRIBUTE);
  }

  public static void setTextAlignLastFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, TEXT_ALIGN_LAST_FO_ATTRIBUTE, value);
  }

  public static String getTextAlignLastFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, TEXT_ALIGN_LAST_FO_ATTRIBUTE);
  }
  public static boolean hasTextAlignLastFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, TEXT_ALIGN_LAST_FO_ATTRIBUTE);
  }

  public static void setTextAlignFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, TEXT_ALIGN_FO_ATTRIBUTE, value);
  }

  public static String getTextAlignFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, TEXT_ALIGN_FO_ATTRIBUTE);
  }
  public static boolean hasTextAlignFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, TEXT_ALIGN_FO_ATTRIBUTE);
  }

  public static void setFontIndependentLineSpacingStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FONT_INDEPENDENT_LINE_SPACING_STYLE_ATTRIBUTE, value);
  }

  public static String getFontIndependentLineSpacingStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FONT_INDEPENDENT_LINE_SPACING_STYLE_ATTRIBUTE);
  }
  public static boolean hasFontIndependentLineSpacingStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FONT_INDEPENDENT_LINE_SPACING_STYLE_ATTRIBUTE);
  }

  public static void setLineSpacingStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LINE_SPACING_STYLE_ATTRIBUTE, value);
  }

  public static String getLineSpacingStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LINE_SPACING_STYLE_ATTRIBUTE);
  }
  public static boolean hasLineSpacingStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LINE_SPACING_STYLE_ATTRIBUTE);
  }

  public static void setLineHeightAtLeastStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LINE_HEIGHT_AT_LEAST_STYLE_ATTRIBUTE, value);
  }

  public static String getLineHeightAtLeastStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LINE_HEIGHT_AT_LEAST_STYLE_ATTRIBUTE);
  }
  public static boolean hasLineHeightAtLeastStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LINE_HEIGHT_AT_LEAST_STYLE_ATTRIBUTE);
  }

  public static void setLineHeightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, LINE_HEIGHT_FO_ATTRIBUTE, value);
  }

  public static String getLineHeightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, LINE_HEIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasLineHeightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, LINE_HEIGHT_FO_ATTRIBUTE);
  }

  public static void setLeaderTextStyleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEADER_TEXT_STYLE_STYLE_ATTRIBUTE, value);
  }

  public static String getLeaderTextStyleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEADER_TEXT_STYLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasLeaderTextStyleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LEADER_TEXT_STYLE_STYLE_ATTRIBUTE);
  }

  public static void setLeaderTextStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEADER_TEXT_STYLE_ATTRIBUTE, value);
  }

  public static String getLeaderTextStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEADER_TEXT_STYLE_ATTRIBUTE);
  }
  public static boolean hasLeaderTextStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LEADER_TEXT_STYLE_ATTRIBUTE);
  }

  public static void setLeaderColorStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEADER_COLOR_STYLE_ATTRIBUTE, value);
  }

  public static String getLeaderColorStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEADER_COLOR_STYLE_ATTRIBUTE);
  }
  public static boolean hasLeaderColorStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LEADER_COLOR_STYLE_ATTRIBUTE);
  }

  public static void setLeaderWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEADER_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getLeaderWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEADER_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasLeaderWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LEADER_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setLeaderStyleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEADER_STYLE_STYLE_ATTRIBUTE, value);
  }

  public static String getLeaderStyleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEADER_STYLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasLeaderStyleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LEADER_STYLE_STYLE_ATTRIBUTE);
  }

  public static void setLeaderTypeStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LEADER_TYPE_STYLE_ATTRIBUTE, value);
  }

  public static String getLeaderTypeStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LEADER_TYPE_STYLE_ATTRIBUTE);
  }
  public static boolean hasLeaderTypeStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LEADER_TYPE_STYLE_ATTRIBUTE);
  }

  public static void setCharStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, CHAR_STYLE_ATTRIBUTE, value);
  }

  public static String getCharStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, CHAR_STYLE_ATTRIBUTE);
  }

  public static void setStyleNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, STYLE_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getStyleNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, STYLE_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasStyleNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, STYLE_NAME_STYLE_ATTRIBUTE);
  }

  public static void setDistanceStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DISTANCE_STYLE_ATTRIBUTE, value);
  }

  public static String getDistanceStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DISTANCE_STYLE_ATTRIBUTE);
  }
  public static boolean hasDistanceStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DISTANCE_STYLE_ATTRIBUTE);
  }

  public static void setLinesStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LINES_STYLE_ATTRIBUTE, value);
  }

  public static String getLinesStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LINES_STYLE_ATTRIBUTE);
  }
  public static boolean hasLinesStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LINES_STYLE_ATTRIBUTE);
  }

  public static void setLengthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, LENGTH_STYLE_ATTRIBUTE, value);
  }

  public static String getLengthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, LENGTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasLengthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, LENGTH_STYLE_ATTRIBUTE);
  }

  public static void setFilterNameStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, FILTER_NAME_STYLE_ATTRIBUTE, value);
  }

  public static String getFilterNameStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, FILTER_NAME_STYLE_ATTRIBUTE);
  }
  public static boolean hasFilterNameStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, FILTER_NAME_STYLE_ATTRIBUTE);
  }

  public static void setRubyAlignStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, RUBY_ALIGN_STYLE_ATTRIBUTE, value);
  }

  public static String getRubyAlignStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, RUBY_ALIGN_STYLE_ATTRIBUTE);
  }
  public static boolean hasRubyAlignStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, RUBY_ALIGN_STYLE_ATTRIBUTE);
  }

  public static void setRubyPositionStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, RUBY_POSITION_STYLE_ATTRIBUTE, value);
  }

  public static String getRubyPositionStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, RUBY_POSITION_STYLE_ATTRIBUTE);
  }
  public static boolean hasRubyPositionStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, RUBY_POSITION_STYLE_ATTRIBUTE);
  }

  public static void setDontBalanceTextColumnsTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DONT_BALANCE_TEXT_COLUMNS_TEXT_ATTRIBUTE, value);
  }

  public static String getDontBalanceTextColumnsTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DONT_BALANCE_TEXT_COLUMNS_TEXT_ATTRIBUTE);
  }
  public static boolean hasDontBalanceTextColumnsTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DONT_BALANCE_TEXT_COLUMNS_TEXT_ATTRIBUTE);
  }

  public static void setColumnGapFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, COLUMN_GAP_FO_ATTRIBUTE, value);
  }

  public static String getColumnGapFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, COLUMN_GAP_FO_ATTRIBUTE);
  }
  public static boolean hasColumnGapFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, COLUMN_GAP_FO_ATTRIBUTE);
  }

  public static void setColumnCountFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, COLUMN_COUNT_FO_ATTRIBUTE, value);
  }

  public static String getColumnCountFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, COLUMN_COUNT_FO_ATTRIBUTE);
  }

  public static void setSpaceAfterFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, SPACE_AFTER_FO_ATTRIBUTE, value);
  }

  public static String getSpaceAfterFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, SPACE_AFTER_FO_ATTRIBUTE);
  }
  public static boolean hasSpaceAfterFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, SPACE_AFTER_FO_ATTRIBUTE);
  }

  public static void setSpaceBeforeFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, SPACE_BEFORE_FO_ATTRIBUTE, value);
  }

  public static String getSpaceBeforeFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, SPACE_BEFORE_FO_ATTRIBUTE);
  }
  public static boolean hasSpaceBeforeFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, SPACE_BEFORE_FO_ATTRIBUTE);
  }

  public static void setEndIndentFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, END_INDENT_FO_ATTRIBUTE, value);
  }

  public static String getEndIndentFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, END_INDENT_FO_ATTRIBUTE);
  }
  public static boolean hasEndIndentFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, END_INDENT_FO_ATTRIBUTE);
  }

  public static void setStartIndentFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, START_INDENT_FO_ATTRIBUTE, value);
  }

  public static String getStartIndentFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, START_INDENT_FO_ATTRIBUTE);
  }
  public static boolean hasStartIndentFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, START_INDENT_FO_ATTRIBUTE);
  }

  public static void setHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setStyleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, STYLE_STYLE_ATTRIBUTE, value);
  }

  public static String getStyleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, STYLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasStyleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, STYLE_STYLE_ATTRIBUTE);
  }

  public static void setBorderModelTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, BORDER_MODEL_TABLE_ATTRIBUTE, value);
  }

  public static String getBorderModelTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, BORDER_MODEL_TABLE_ATTRIBUTE);
  }
  public static boolean hasBorderModelTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, BORDER_MODEL_TABLE_ATTRIBUTE);
  }

  public static void setMayBreakBetweenRowsStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, MAY_BREAK_BETWEEN_ROWS_STYLE_ATTRIBUTE, value);
  }

  public static String getMayBreakBetweenRowsStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, MAY_BREAK_BETWEEN_ROWS_STYLE_ATTRIBUTE);
  }
  public static boolean hasMayBreakBetweenRowsStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, MAY_BREAK_BETWEEN_ROWS_STYLE_ATTRIBUTE);
  }

  public static void setAlignTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, ALIGN_TABLE_ATTRIBUTE, value);
  }

  public static String getAlignTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, ALIGN_TABLE_ATTRIBUTE);
  }
  public static boolean hasAlignTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, ALIGN_TABLE_ATTRIBUTE);
  }

  public static void setUseOptimalColumnWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, USE_OPTIMAL_COLUMN_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getUseOptimalColumnWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, USE_OPTIMAL_COLUMN_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasUseOptimalColumnWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, USE_OPTIMAL_COLUMN_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setRelColumnWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, REL_COLUMN_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getRelColumnWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, REL_COLUMN_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasRelColumnWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, REL_COLUMN_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setColumnWidthStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, COLUMN_WIDTH_STYLE_ATTRIBUTE, value);
  }

  public static String getColumnWidthStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, COLUMN_WIDTH_STYLE_ATTRIBUTE);
  }
  public static boolean hasColumnWidthStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, COLUMN_WIDTH_STYLE_ATTRIBUTE);
  }

  public static void setUseOptimalRowHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, USE_OPTIMAL_ROW_HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getUseOptimalRowHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, USE_OPTIMAL_ROW_HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasUseOptimalRowHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, USE_OPTIMAL_ROW_HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setMinRowHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, MIN_ROW_HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getMinRowHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, MIN_ROW_HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasMinRowHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, MIN_ROW_HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setRowHeightStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, ROW_HEIGHT_STYLE_ATTRIBUTE, value);
  }

  public static String getRowHeightStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, ROW_HEIGHT_STYLE_ATTRIBUTE);
  }
  public static boolean hasRowHeightStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, ROW_HEIGHT_STYLE_ATTRIBUTE);
  }

  public static void setShrinkToFitStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, SHRINK_TO_FIT_STYLE_ATTRIBUTE, value);
  }

  public static String getShrinkToFitStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, SHRINK_TO_FIT_STYLE_ATTRIBUTE);
  }
  public static boolean hasShrinkToFitStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, SHRINK_TO_FIT_STYLE_ATTRIBUTE);
  }

  public static void setRepeatContentStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, REPEAT_CONTENT_STYLE_ATTRIBUTE, value);
  }

  public static String getRepeatContentStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, REPEAT_CONTENT_STYLE_ATTRIBUTE);
  }
  public static boolean hasRepeatContentStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, REPEAT_CONTENT_STYLE_ATTRIBUTE);
  }

  public static void setDecimalPlacesStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DECIMAL_PLACES_STYLE_ATTRIBUTE, value);
  }

  public static String getDecimalPlacesStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DECIMAL_PLACES_STYLE_ATTRIBUTE);
  }
  public static boolean hasDecimalPlacesStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DECIMAL_PLACES_STYLE_ATTRIBUTE);
  }

  public static void setCellProtectStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, CELL_PROTECT_STYLE_ATTRIBUTE, value);
  }

  public static String getCellProtectStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, CELL_PROTECT_STYLE_ATTRIBUTE);
  }
  public static boolean hasCellProtectStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, CELL_PROTECT_STYLE_ATTRIBUTE);
  }

  public static void setRotationAlignStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, ROTATION_ALIGN_STYLE_ATTRIBUTE, value);
  }

  public static String getRotationAlignStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, ROTATION_ALIGN_STYLE_ATTRIBUTE);
  }
  public static boolean hasRotationAlignStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, ROTATION_ALIGN_STYLE_ATTRIBUTE);
  }

  public static void setRotationAngleStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, ROTATION_ANGLE_STYLE_ATTRIBUTE, value);
  }

  public static String getRotationAngleStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, ROTATION_ANGLE_STYLE_ATTRIBUTE);
  }
  public static boolean hasRotationAngleStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, ROTATION_ANGLE_STYLE_ATTRIBUTE);
  }

  public static void setDiagonalBlTrWidthsStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DIAGONAL_BL_TR_WIDTHS_STYLE_ATTRIBUTE, value);
  }

  public static String getDiagonalBlTrWidthsStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DIAGONAL_BL_TR_WIDTHS_STYLE_ATTRIBUTE);
  }
  public static boolean hasDiagonalBlTrWidthsStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DIAGONAL_BL_TR_WIDTHS_STYLE_ATTRIBUTE);
  }

  public static void setDiagonalBlTrStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DIAGONAL_BL_TR_STYLE_ATTRIBUTE, value);
  }

  public static String getDiagonalBlTrStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DIAGONAL_BL_TR_STYLE_ATTRIBUTE);
  }
  public static boolean hasDiagonalBlTrStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DIAGONAL_BL_TR_STYLE_ATTRIBUTE);
  }

  public static void setDiagonalTlBrWidthsStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DIAGONAL_TL_BR_WIDTHS_STYLE_ATTRIBUTE, value);
  }

  public static String getDiagonalTlBrWidthsStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DIAGONAL_TL_BR_WIDTHS_STYLE_ATTRIBUTE);
  }
  public static boolean hasDiagonalTlBrWidthsStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DIAGONAL_TL_BR_WIDTHS_STYLE_ATTRIBUTE);
  }

  public static void setDiagonalTlBrStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DIAGONAL_TL_BR_STYLE_ATTRIBUTE, value);
  }

  public static String getDiagonalTlBrStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DIAGONAL_TL_BR_STYLE_ATTRIBUTE);
  }
  public static boolean hasDiagonalTlBrStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DIAGONAL_TL_BR_STYLE_ATTRIBUTE);
  }

  public static void setGlyphOrientationVerticalStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, GLYPH_ORIENTATION_VERTICAL_STYLE_ATTRIBUTE, value);
  }

  public static String getGlyphOrientationVerticalStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, GLYPH_ORIENTATION_VERTICAL_STYLE_ATTRIBUTE);
  }
  public static boolean hasGlyphOrientationVerticalStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, GLYPH_ORIENTATION_VERTICAL_STYLE_ATTRIBUTE);
  }

  public static void setDirectionStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, DIRECTION_STYLE_ATTRIBUTE, value);
  }

  public static String getDirectionStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, DIRECTION_STYLE_ATTRIBUTE);
  }
  public static boolean hasDirectionStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, DIRECTION_STYLE_ATTRIBUTE);
  }

  public static void setTextAlignSourceStyleAttribute(Element element, String value) {
    element.setAttributeNS(STYLE_NS, TEXT_ALIGN_SOURCE_STYLE_ATTRIBUTE, value);
  }

  public static String getTextAlignSourceStyleAttribute(Element element) {
    return element.getAttributeNS(STYLE_NS, TEXT_ALIGN_SOURCE_STYLE_ATTRIBUTE);
  }
  public static boolean hasTextAlignSourceStyleAttribute(Element element) {
    return element.hasAttributeNS(STYLE_NS, TEXT_ALIGN_SOURCE_STYLE_ATTRIBUTE);
  }

  public static void setHeightFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, HEIGHT_FO_ATTRIBUTE, value);
  }

  public static String getHeightFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, HEIGHT_FO_ATTRIBUTE);
  }
  public static boolean hasHeightFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, HEIGHT_FO_ATTRIBUTE);
  }

  public static void setWidthFoAttribute(Element element, String value) {
    element.setAttributeNS(FO_NS, WIDTH_FO_ATTRIBUTE, value);
  }

  public static String getWidthFoAttribute(Element element) {
    return element.getAttributeNS(FO_NS, WIDTH_FO_ATTRIBUTE);
  }
  public static boolean hasWidthFoAttribute(Element element) {
    return element.hasAttributeNS(FO_NS, WIDTH_FO_ATTRIBUTE);
  }

  public static void setMinLabelDistanceTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, MIN_LABEL_DISTANCE_TEXT_ATTRIBUTE, value);
  }

  public static String getMinLabelDistanceTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, MIN_LABEL_DISTANCE_TEXT_ATTRIBUTE);
  }
  public static boolean hasMinLabelDistanceTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, MIN_LABEL_DISTANCE_TEXT_ATTRIBUTE);
  }

  public static void setMinLabelWidthTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, MIN_LABEL_WIDTH_TEXT_ATTRIBUTE, value);
  }

  public static String getMinLabelWidthTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, MIN_LABEL_WIDTH_TEXT_ATTRIBUTE);
  }
  public static boolean hasMinLabelWidthTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, MIN_LABEL_WIDTH_TEXT_ATTRIBUTE);
  }

  public static void setSpaceBeforeTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SPACE_BEFORE_TEXT_ATTRIBUTE, value);
  }

  public static String getSpaceBeforeTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SPACE_BEFORE_TEXT_ATTRIBUTE);
  }
  public static boolean hasSpaceBeforeTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SPACE_BEFORE_TEXT_ATTRIBUTE);
  }

  public static void setGlobalTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, GLOBAL_TEXT_ATTRIBUTE, value);
  }

  public static String getGlobalTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, GLOBAL_TEXT_ATTRIBUTE);
  }
  public static boolean hasGlobalTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, GLOBAL_TEXT_ATTRIBUTE);
  }

  public static void setStructureProtectedTableAttribute(Element element, String value) {
    element.setAttributeNS(TABLE_NS, STRUCTURE_PROTECTED_TABLE_ATTRIBUTE, value);
  }

  public static String getStructureProtectedTableAttribute(Element element) {
    return element.getAttributeNS(TABLE_NS, STRUCTURE_PROTECTED_TABLE_ATTRIBUTE);
  }
  public static boolean hasStructureProtectedTableAttribute(Element element) {
    return element.hasAttributeNS(TABLE_NS, STRUCTURE_PROTECTED_TABLE_ATTRIBUTE);
  }

  public static void setDateMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, DATE_META_ATTRIBUTE, value);
  }

  public static String getDateMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, DATE_META_ATTRIBUTE);
  }
  public static boolean hasDateMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, DATE_META_ATTRIBUTE);
  }

  public static void setTitleXlinkAttribute(Element element, String value) {
    element.setAttributeNS(XLINK_NS, TITLE_XLINK_ATTRIBUTE, value);
  }

  public static String getTitleXlinkAttribute(Element element) {
    return element.getAttributeNS(XLINK_NS, TITLE_XLINK_ATTRIBUTE);
  }
  public static boolean hasTitleXlinkAttribute(Element element) {
    return element.hasAttributeNS(XLINK_NS, TITLE_XLINK_ATTRIBUTE);
  }

  public static void setDelayMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, DELAY_META_ATTRIBUTE, value);
  }

  public static String getDelayMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, DELAY_META_ATTRIBUTE);
  }
  public static boolean hasDelayMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, DELAY_META_ATTRIBUTE);
  }

  public static void setObjectCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, OBJECT_COUNT_META_ATTRIBUTE, value);
  }

  public static String getObjectCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, OBJECT_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasObjectCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, OBJECT_COUNT_META_ATTRIBUTE);
  }

  public static void setCellCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, CELL_COUNT_META_ATTRIBUTE, value);
  }

  public static String getCellCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, CELL_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasCellCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, CELL_COUNT_META_ATTRIBUTE);
  }

  public static void setRowCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, ROW_COUNT_META_ATTRIBUTE, value);
  }

  public static String getRowCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, ROW_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasRowCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, ROW_COUNT_META_ATTRIBUTE);
  }

  public static void setNonWhitespaceCharacterCountAttribute(Element element, String value) {
    element.setAttributeNS(null, NON_WHITESPACE_CHARACTER_COUNT_ATTRIBUTE, value);
  }

  public static String getNonWhitespaceCharacterCountAttribute(Element element) {
    return element.getAttributeNS(null, NON_WHITESPACE_CHARACTER_COUNT_ATTRIBUTE);
  }
  public static boolean hasNonWhitespaceCharacterCountAttribute(Element element) {
    return element.hasAttributeNS(null, NON_WHITESPACE_CHARACTER_COUNT_ATTRIBUTE);
  }

  public static void setSyllableCountAttribute(Element element, String value) {
    element.setAttributeNS(null, SYLLABLE_COUNT_ATTRIBUTE, value);
  }

  public static String getSyllableCountAttribute(Element element) {
    return element.getAttributeNS(null, SYLLABLE_COUNT_ATTRIBUTE);
  }
  public static boolean hasSyllableCountAttribute(Element element) {
    return element.hasAttributeNS(null, SYLLABLE_COUNT_ATTRIBUTE);
  }

  public static void setSentenceCountAttribute(Element element, String value) {
    element.setAttributeNS(null, SENTENCE_COUNT_ATTRIBUTE, value);
  }

  public static String getSentenceCountAttribute(Element element) {
    return element.getAttributeNS(null, SENTENCE_COUNT_ATTRIBUTE);
  }
  public static boolean hasSentenceCountAttribute(Element element) {
    return element.hasAttributeNS(null, SENTENCE_COUNT_ATTRIBUTE);
  }

  public static void setFrameCountAttribute(Element element, String value) {
    element.setAttributeNS(null, FRAME_COUNT_ATTRIBUTE, value);
  }

  public static String getFrameCountAttribute(Element element) {
    return element.getAttributeNS(null, FRAME_COUNT_ATTRIBUTE);
  }
  public static boolean hasFrameCountAttribute(Element element) {
    return element.hasAttributeNS(null, FRAME_COUNT_ATTRIBUTE);
  }

  public static void setCharacterCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, CHARACTER_COUNT_META_ATTRIBUTE, value);
  }

  public static String getCharacterCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, CHARACTER_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasCharacterCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, CHARACTER_COUNT_META_ATTRIBUTE);
  }

  public static void setWordCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, WORD_COUNT_META_ATTRIBUTE, value);
  }

  public static String getWordCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, WORD_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasWordCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, WORD_COUNT_META_ATTRIBUTE);
  }

  public static void setParagraphCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, PARAGRAPH_COUNT_META_ATTRIBUTE, value);
  }

  public static String getParagraphCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, PARAGRAPH_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasParagraphCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, PARAGRAPH_COUNT_META_ATTRIBUTE);
  }

  public static void setOleObjectCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, OLE_OBJECT_COUNT_META_ATTRIBUTE, value);
  }

  public static String getOleObjectCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, OLE_OBJECT_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasOleObjectCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, OLE_OBJECT_COUNT_META_ATTRIBUTE);
  }

  public static void setImageCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, IMAGE_COUNT_META_ATTRIBUTE, value);
  }

  public static String getImageCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, IMAGE_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasImageCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, IMAGE_COUNT_META_ATTRIBUTE);
  }

  public static void setDrawCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, DRAW_COUNT_META_ATTRIBUTE, value);
  }

  public static String getDrawCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, DRAW_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasDrawCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, DRAW_COUNT_META_ATTRIBUTE);
  }

  public static void setTableCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, TABLE_COUNT_META_ATTRIBUTE, value);
  }

  public static String getTableCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, TABLE_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasTableCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, TABLE_COUNT_META_ATTRIBUTE);
  }

  public static void setPageCountMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, PAGE_COUNT_META_ATTRIBUTE, value);
  }

  public static String getPageCountMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, PAGE_COUNT_META_ATTRIBUTE);
  }
  public static boolean hasPageCountMetaAttribute(Element element) {
    return element.hasAttributeNS(META_NS, PAGE_COUNT_META_ATTRIBUTE);
  }

  public static void setNameMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, NAME_META_ATTRIBUTE, value);
  }

  public static String getNameMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, NAME_META_ATTRIBUTE);
  }

  public static void setValueTypeMetaAttribute(Element element, String value) {
    element.setAttributeNS(META_NS, VALUE_TYPE_META_ATTRIBUTE, value);
  }

  public static String getValueTypeMetaAttribute(Element element) {
    return element.getAttributeNS(META_NS, VALUE_TYPE_META_ATTRIBUTE);
  }

  public static void setChangeIdTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CHANGE_ID_TEXT_ATTRIBUTE, value);
  }

  public static String getChangeIdTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CHANGE_ID_TEXT_ATTRIBUTE);
  }

  public static void setCTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, C_TEXT_ATTRIBUTE, value);
  }

  public static String getCTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, C_TEXT_ATTRIBUTE);
  }
  public static boolean hasCTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, C_TEXT_ATTRIBUTE);
  }

  public static void setTabRefTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, TAB_REF_TEXT_ATTRIBUTE, value);
  }

  public static String getTabRefTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, TAB_REF_TEXT_ATTRIBUTE);
  }
  public static boolean hasTabRefTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, TAB_REF_TEXT_ATTRIBUTE);
  }

  public static void setVisitedStyleNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, VISITED_STYLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getVisitedStyleNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, VISITED_STYLE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasVisitedStyleNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, VISITED_STYLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setLabelTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, LABEL_TEXT_ATTRIBUTE, value);
  }

  public static String getLabelTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, LABEL_TEXT_ATTRIBUTE);
  }
  public static boolean hasLabelTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, LABEL_TEXT_ATTRIBUTE);
  }

  public static void setDateAdjustTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DATE_ADJUST_TEXT_ATTRIBUTE, value);
  }

  public static String getDateAdjustTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DATE_ADJUST_TEXT_ATTRIBUTE);
  }
  public static boolean hasDateAdjustTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DATE_ADJUST_TEXT_ATTRIBUTE);
  }

  public static void setDateValueTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DATE_VALUE_TEXT_ATTRIBUTE, value);
  }

  public static String getDateValueTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DATE_VALUE_TEXT_ATTRIBUTE);
  }
  public static boolean hasDateValueTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DATE_VALUE_TEXT_ATTRIBUTE);
  }

  public static void setFixedTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, FIXED_TEXT_ATTRIBUTE, value);
  }

  public static String getFixedTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, FIXED_TEXT_ATTRIBUTE);
  }
  public static boolean hasFixedTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, FIXED_TEXT_ATTRIBUTE);
  }

  public static void setTimeAdjustTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, TIME_ADJUST_TEXT_ATTRIBUTE, value);
  }

  public static String getTimeAdjustTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, TIME_ADJUST_TEXT_ATTRIBUTE);
  }
  public static boolean hasTimeAdjustTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, TIME_ADJUST_TEXT_ATTRIBUTE);
  }

  public static void setTimeValueTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, TIME_VALUE_TEXT_ATTRIBUTE, value);
  }

  public static String getTimeValueTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, TIME_VALUE_TEXT_ATTRIBUTE);
  }
  public static boolean hasTimeValueTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, TIME_VALUE_TEXT_ATTRIBUTE);
  }

  public static void setSelectPageTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, SELECT_PAGE_TEXT_ATTRIBUTE, value);
  }

  public static String getSelectPageTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, SELECT_PAGE_TEXT_ATTRIBUTE);
  }
  public static boolean hasSelectPageTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, SELECT_PAGE_TEXT_ATTRIBUTE);
  }

  public static void setPageAdjustTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, PAGE_ADJUST_TEXT_ATTRIBUTE, value);
  }

  public static String getPageAdjustTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, PAGE_ADJUST_TEXT_ATTRIBUTE);
  }
  public static boolean hasPageAdjustTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, PAGE_ADJUST_TEXT_ATTRIBUTE);
  }

  public static void setStringValueTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, STRING_VALUE_TEXT_ATTRIBUTE, value);
  }

  public static String getStringValueTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, STRING_VALUE_TEXT_ATTRIBUTE);
  }
  public static boolean hasStringValueTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, STRING_VALUE_TEXT_ATTRIBUTE);
  }

  public static void setDescriptionTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DESCRIPTION_TEXT_ATTRIBUTE, value);
  }

  public static String getDescriptionTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DESCRIPTION_TEXT_ATTRIBUTE);
  }
  public static boolean hasDescriptionTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DESCRIPTION_TEXT_ATTRIBUTE);
  }

  public static void setRefNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, REF_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getRefNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, REF_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasRefNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, REF_NAME_TEXT_ATTRIBUTE);
  }

  public static void setDurationTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DURATION_TEXT_ATTRIBUTE, value);
  }

  public static String getDurationTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DURATION_TEXT_ATTRIBUTE);
  }
  public static boolean hasDurationTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DURATION_TEXT_ATTRIBUTE);
  }

  public static void setColumnNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, COLUMN_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getColumnNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, COLUMN_NAME_TEXT_ATTRIBUTE);
  }

  public static void setTableTypeTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, TABLE_TYPE_TEXT_ATTRIBUTE, value);
  }

  public static String getTableTypeTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, TABLE_TYPE_TEXT_ATTRIBUTE);
  }
  public static boolean hasTableTypeTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, TABLE_TYPE_TEXT_ATTRIBUTE);
  }

  public static void setTableNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, TABLE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getTableNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, TABLE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setDatabaseNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, DATABASE_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getDatabaseNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, DATABASE_NAME_TEXT_ATTRIBUTE);
  }
  public static boolean hasDatabaseNameTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, DATABASE_NAME_TEXT_ATTRIBUTE);
  }

  public static void setRowNumberTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ROW_NUMBER_TEXT_ATTRIBUTE, value);
  }

  public static String getRowNumberTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ROW_NUMBER_TEXT_ATTRIBUTE);
  }
  public static boolean hasRowNumberTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ROW_NUMBER_TEXT_ATTRIBUTE);
  }

  public static void setValueTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, VALUE_TEXT_ATTRIBUTE, value);
  }

  public static String getValueTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, VALUE_TEXT_ATTRIBUTE);
  }
  public static boolean hasValueTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, VALUE_TEXT_ATTRIBUTE);
  }

  public static void setActiveTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, ACTIVE_TEXT_ATTRIBUTE, value);
  }

  public static String getActiveTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, ACTIVE_TEXT_ATTRIBUTE);
  }
  public static boolean hasActiveTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, ACTIVE_TEXT_ATTRIBUTE);
  }

  public static void setPlaceholderTypeTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, PLACEHOLDER_TYPE_TEXT_ATTRIBUTE, value);
  }

  public static String getPlaceholderTypeTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, PLACEHOLDER_TYPE_TEXT_ATTRIBUTE);
  }

  public static void setCurrentValueTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CURRENT_VALUE_TEXT_ATTRIBUTE, value);
  }

  public static String getCurrentValueTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CURRENT_VALUE_TEXT_ATTRIBUTE);
  }
  public static boolean hasCurrentValueTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, CURRENT_VALUE_TEXT_ATTRIBUTE);
  }

  public static void setStringValueIfFalseTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, STRING_VALUE_IF_FALSE_TEXT_ATTRIBUTE, value);
  }

  public static String getStringValueIfFalseTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, STRING_VALUE_IF_FALSE_TEXT_ATTRIBUTE);
  }

  public static void setStringValueIfTrueTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, STRING_VALUE_IF_TRUE_TEXT_ATTRIBUTE, value);
  }

  public static String getStringValueIfTrueTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, STRING_VALUE_IF_TRUE_TEXT_ATTRIBUTE);
  }

  public static void setIsHiddenTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, IS_HIDDEN_TEXT_ATTRIBUTE, value);
  }

  public static String getIsHiddenTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, IS_HIDDEN_TEXT_ATTRIBUTE);
  }
  public static boolean hasIsHiddenTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, IS_HIDDEN_TEXT_ATTRIBUTE);
  }

  public static void setReferenceFormatTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, REFERENCE_FORMAT_TEXT_ATTRIBUTE, value);
  }

  public static String getReferenceFormatTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, REFERENCE_FORMAT_TEXT_ATTRIBUTE);
  }
  public static boolean hasReferenceFormatTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, REFERENCE_FORMAT_TEXT_ATTRIBUTE);
  }

  public static void setConnectionNameTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, CONNECTION_NAME_TEXT_ATTRIBUTE, value);
  }

  public static String getConnectionNameTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, CONNECTION_NAME_TEXT_ATTRIBUTE);
  }

  public static void setKindTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, KIND_TEXT_ATTRIBUTE, value);
  }

  public static String getKindTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, KIND_TEXT_ATTRIBUTE);
  }

  public static void setMainEntryTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, MAIN_ENTRY_TEXT_ATTRIBUTE, value);
  }

  public static String getMainEntryTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, MAIN_ENTRY_TEXT_ATTRIBUTE);
  }
  public static boolean hasMainEntryTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, MAIN_ENTRY_TEXT_ATTRIBUTE);
  }

  public static void setKey2PhoneticTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, KEY2_PHONETIC_TEXT_ATTRIBUTE, value);
  }

  public static String getKey2PhoneticTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, KEY2_PHONETIC_TEXT_ATTRIBUTE);
  }
  public static boolean hasKey2PhoneticTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, KEY2_PHONETIC_TEXT_ATTRIBUTE);
  }

  public static void setKey1PhoneticTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, KEY1_PHONETIC_TEXT_ATTRIBUTE, value);
  }

  public static String getKey1PhoneticTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, KEY1_PHONETIC_TEXT_ATTRIBUTE);
  }
  public static boolean hasKey1PhoneticTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, KEY1_PHONETIC_TEXT_ATTRIBUTE);
  }

  public static void setStringValuePhoneticTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, STRING_VALUE_PHONETIC_TEXT_ATTRIBUTE, value);
  }

  public static String getStringValuePhoneticTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, STRING_VALUE_PHONETIC_TEXT_ATTRIBUTE);
  }
  public static boolean hasStringValuePhoneticTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, STRING_VALUE_PHONETIC_TEXT_ATTRIBUTE);
  }

  public static void setKey2TextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, KEY2_TEXT_ATTRIBUTE, value);
  }

  public static String getKey2TextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, KEY2_TEXT_ATTRIBUTE);
  }
  public static boolean hasKey2TextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, KEY2_TEXT_ATTRIBUTE);
  }

  public static void setKey1TextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, KEY1_TEXT_ATTRIBUTE, value);
  }

  public static String getKey1TextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, KEY1_TEXT_ATTRIBUTE);
  }
  public static boolean hasKey1TextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, KEY1_TEXT_ATTRIBUTE);
  }

  public static void setSourcePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, SOURCE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getSourcePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, SOURCE_PRESENTATION_ATTRIBUTE);
  }

  public static void setDataFieldFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, DATA_FIELD_FORM_ATTRIBUTE, value);
  }

  public static String getDataFieldFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, DATA_FIELD_FORM_ATTRIBUTE);
  }
  public static boolean hasDataFieldFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, DATA_FIELD_FORM_ATTRIBUTE);
  }

  public static void setConvertEmptyToNullFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, CONVERT_EMPTY_TO_NULL_FORM_ATTRIBUTE, value);
  }

  public static String getConvertEmptyToNullFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, CONVERT_EMPTY_TO_NULL_FORM_ATTRIBUTE);
  }
  public static boolean hasConvertEmptyToNullFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, CONVERT_EMPTY_TO_NULL_FORM_ATTRIBUTE);
  }

  public static void setTitleFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, TITLE_FORM_ATTRIBUTE, value);
  }

  public static String getTitleFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, TITLE_FORM_ATTRIBUTE);
  }
  public static boolean hasTitleFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, TITLE_FORM_ATTRIBUTE);
  }

  public static void setTabStopFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, TAB_STOP_FORM_ATTRIBUTE, value);
  }

  public static String getTabStopFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, TAB_STOP_FORM_ATTRIBUTE);
  }
  public static boolean hasTabStopFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, TAB_STOP_FORM_ATTRIBUTE);
  }

  public static void setTabIndexFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, TAB_INDEX_FORM_ATTRIBUTE, value);
  }

  public static String getTabIndexFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, TAB_INDEX_FORM_ATTRIBUTE);
  }
  public static boolean hasTabIndexFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, TAB_INDEX_FORM_ATTRIBUTE);
  }

  public static void setReadonlyFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, READONLY_FORM_ATTRIBUTE, value);
  }

  public static String getReadonlyFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, READONLY_FORM_ATTRIBUTE);
  }
  public static boolean hasReadonlyFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, READONLY_FORM_ATTRIBUTE);
  }

  public static void setPrintableFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, PRINTABLE_FORM_ATTRIBUTE, value);
  }

  public static String getPrintableFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, PRINTABLE_FORM_ATTRIBUTE);
  }
  public static boolean hasPrintableFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, PRINTABLE_FORM_ATTRIBUTE);
  }

  public static void setMaxLengthFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, MAX_LENGTH_FORM_ATTRIBUTE, value);
  }

  public static String getMaxLengthFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, MAX_LENGTH_FORM_ATTRIBUTE);
  }
  public static boolean hasMaxLengthFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, MAX_LENGTH_FORM_ATTRIBUTE);
  }

  public static void setDisabledFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, DISABLED_FORM_ATTRIBUTE, value);
  }

  public static String getDisabledFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, DISABLED_FORM_ATTRIBUTE);
  }
  public static boolean hasDisabledFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, DISABLED_FORM_ATTRIBUTE);
  }

  public static void setCurrentValueFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, CURRENT_VALUE_FORM_ATTRIBUTE, value);
  }

  public static String getCurrentValueFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, CURRENT_VALUE_FORM_ATTRIBUTE);
  }
  public static boolean hasCurrentValueFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, CURRENT_VALUE_FORM_ATTRIBUTE);
  }

  public static void setBindXformsAttribute(Element element, String value) {
    element.setAttributeNS(XFORMS_NS, BIND_XFORMS_ATTRIBUTE, value);
  }

  public static String getBindXformsAttribute(Element element) {
    return element.getAttributeNS(XFORMS_NS, BIND_XFORMS_ATTRIBUTE);
  }
  public static boolean hasBindXformsAttribute(Element element) {
    return element.hasAttributeNS(XFORMS_NS, BIND_XFORMS_ATTRIBUTE);
  }

  public static void setIdFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ID_FORM_ATTRIBUTE, value);
  }

  public static String getIdFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ID_FORM_ATTRIBUTE);
  }

  public static void setValidationFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, VALIDATION_FORM_ATTRIBUTE, value);
  }

  public static String getValidationFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, VALIDATION_FORM_ATTRIBUTE);
  }
  public static boolean hasValidationFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, VALIDATION_FORM_ATTRIBUTE);
  }

  public static void setMinValueFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, MIN_VALUE_FORM_ATTRIBUTE, value);
  }

  public static String getMinValueFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, MIN_VALUE_FORM_ATTRIBUTE);
  }
  public static boolean hasMinValueFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, MIN_VALUE_FORM_ATTRIBUTE);
  }

  public static void setMaxValueFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, MAX_VALUE_FORM_ATTRIBUTE, value);
  }

  public static String getMaxValueFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, MAX_VALUE_FORM_ATTRIBUTE);
  }
  public static boolean hasMaxValueFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, MAX_VALUE_FORM_ATTRIBUTE);
  }

  public static void setAutoCompleteFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, AUTO_COMPLETE_FORM_ATTRIBUTE, value);
  }

  public static String getAutoCompleteFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, AUTO_COMPLETE_FORM_ATTRIBUTE);
  }
  public static boolean hasAutoCompleteFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, AUTO_COMPLETE_FORM_ATTRIBUTE);
  }

  public static void setListSourceTypeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, LIST_SOURCE_TYPE_FORM_ATTRIBUTE, value);
  }

  public static String getListSourceTypeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, LIST_SOURCE_TYPE_FORM_ATTRIBUTE);
  }
  public static boolean hasListSourceTypeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, LIST_SOURCE_TYPE_FORM_ATTRIBUTE);
  }

  public static void setListSourceFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, LIST_SOURCE_FORM_ATTRIBUTE, value);
  }

  public static String getListSourceFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, LIST_SOURCE_FORM_ATTRIBUTE);
  }
  public static boolean hasListSourceFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, LIST_SOURCE_FORM_ATTRIBUTE);
  }

  public static void setSizeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, SIZE_FORM_ATTRIBUTE, value);
  }

  public static String getSizeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, SIZE_FORM_ATTRIBUTE);
  }
  public static boolean hasSizeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, SIZE_FORM_ATTRIBUTE);
  }

  public static void setDropdownFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, DROPDOWN_FORM_ATTRIBUTE, value);
  }

  public static String getDropdownFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, DROPDOWN_FORM_ATTRIBUTE);
  }
  public static boolean hasDropdownFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, DROPDOWN_FORM_ATTRIBUTE);
  }

  public static void setXformsListSourceFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, XFORMS_LIST_SOURCE_FORM_ATTRIBUTE, value);
  }

  public static String getXformsListSourceFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, XFORMS_LIST_SOURCE_FORM_ATTRIBUTE);
  }
  public static boolean hasXformsListSourceFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, XFORMS_LIST_SOURCE_FORM_ATTRIBUTE);
  }

  public static void setMultipleFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, MULTIPLE_FORM_ATTRIBUTE, value);
  }

  public static String getMultipleFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, MULTIPLE_FORM_ATTRIBUTE);
  }
  public static boolean hasMultipleFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, MULTIPLE_FORM_ATTRIBUTE);
  }

  public static void setBoundColumnFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, BOUND_COLUMN_FORM_ATTRIBUTE, value);
  }

  public static String getBoundColumnFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, BOUND_COLUMN_FORM_ATTRIBUTE);
  }
  public static boolean hasBoundColumnFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, BOUND_COLUMN_FORM_ATTRIBUTE);
  }

  public static void setStateFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, STATE_FORM_ATTRIBUTE, value);
  }

  public static String getStateFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, STATE_FORM_ATTRIBUTE);
  }
  public static boolean hasStateFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, STATE_FORM_ATTRIBUTE);
  }

  public static void setIsTristateFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, IS_TRISTATE_FORM_ATTRIBUTE, value);
  }

  public static String getIsTristateFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, IS_TRISTATE_FORM_ATTRIBUTE);
  }
  public static boolean hasIsTristateFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, IS_TRISTATE_FORM_ATTRIBUTE);
  }

  public static void setCurrentStateFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, CURRENT_STATE_FORM_ATTRIBUTE, value);
  }

  public static String getCurrentStateFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, CURRENT_STATE_FORM_ATTRIBUTE);
  }
  public static boolean hasCurrentStateFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, CURRENT_STATE_FORM_ATTRIBUTE);
  }

  public static void setVisualEffectFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, VISUAL_EFFECT_FORM_ATTRIBUTE, value);
  }

  public static String getVisualEffectFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, VISUAL_EFFECT_FORM_ATTRIBUTE);
  }
  public static boolean hasVisualEffectFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, VISUAL_EFFECT_FORM_ATTRIBUTE);
  }

  public static void setImagePositionFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, IMAGE_POSITION_FORM_ATTRIBUTE, value);
  }

  public static String getImagePositionFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, IMAGE_POSITION_FORM_ATTRIBUTE);
  }
  public static boolean hasImagePositionFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, IMAGE_POSITION_FORM_ATTRIBUTE);
  }

  public static void setImageAlignFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, IMAGE_ALIGN_FORM_ATTRIBUTE, value);
  }

  public static String getImageAlignFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, IMAGE_ALIGN_FORM_ATTRIBUTE);
  }
  public static boolean hasImageAlignFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, IMAGE_ALIGN_FORM_ATTRIBUTE);
  }

  public static void setEchoCharFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ECHO_CHAR_FORM_ATTRIBUTE, value);
  }

  public static String getEchoCharFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ECHO_CHAR_FORM_ATTRIBUTE);
  }
  public static boolean hasEchoCharFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ECHO_CHAR_FORM_ATTRIBUTE);
  }

  public static void setMultiLineFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, MULTI_LINE_FORM_ATTRIBUTE, value);
  }

  public static String getMultiLineFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, MULTI_LINE_FORM_ATTRIBUTE);
  }
  public static boolean hasMultiLineFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, MULTI_LINE_FORM_ATTRIBUTE);
  }

  public static void setForFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, FOR_FORM_ATTRIBUTE, value);
  }

  public static String getForFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, FOR_FORM_ATTRIBUTE);
  }
  public static boolean hasForFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, FOR_FORM_ATTRIBUTE);
  }

  public static void setXformsSubmissionFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, XFORMS_SUBMISSION_FORM_ATTRIBUTE, value);
  }

  public static String getXformsSubmissionFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, XFORMS_SUBMISSION_FORM_ATTRIBUTE);
  }
  public static boolean hasXformsSubmissionFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, XFORMS_SUBMISSION_FORM_ATTRIBUTE);
  }

  public static void setFocusOnClickFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, FOCUS_ON_CLICK_FORM_ATTRIBUTE, value);
  }

  public static String getFocusOnClickFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, FOCUS_ON_CLICK_FORM_ATTRIBUTE);
  }
  public static boolean hasFocusOnClickFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, FOCUS_ON_CLICK_FORM_ATTRIBUTE);
  }

  public static void setToggleFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, TOGGLE_FORM_ATTRIBUTE, value);
  }

  public static String getToggleFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, TOGGLE_FORM_ATTRIBUTE);
  }
  public static boolean hasToggleFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, TOGGLE_FORM_ATTRIBUTE);
  }

  public static void setDefaultButtonFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, DEFAULT_BUTTON_FORM_ATTRIBUTE, value);
  }

  public static String getDefaultButtonFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, DEFAULT_BUTTON_FORM_ATTRIBUTE);
  }
  public static boolean hasDefaultButtonFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, DEFAULT_BUTTON_FORM_ATTRIBUTE);
  }

  public static void setImageDataFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, IMAGE_DATA_FORM_ATTRIBUTE, value);
  }

  public static String getImageDataFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, IMAGE_DATA_FORM_ATTRIBUTE);
  }
  public static boolean hasImageDataFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, IMAGE_DATA_FORM_ATTRIBUTE);
  }

  public static void setButtonTypeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, BUTTON_TYPE_FORM_ATTRIBUTE, value);
  }

  public static String getButtonTypeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, BUTTON_TYPE_FORM_ATTRIBUTE);
  }
  public static boolean hasButtonTypeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, BUTTON_TYPE_FORM_ATTRIBUTE);
  }

  public static void setOrientationFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, ORIENTATION_FORM_ATTRIBUTE, value);
  }

  public static String getOrientationFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, ORIENTATION_FORM_ATTRIBUTE);
  }
  public static boolean hasOrientationFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, ORIENTATION_FORM_ATTRIBUTE);
  }

  public static void setDelayForRepeatFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, DELAY_FOR_REPEAT_FORM_ATTRIBUTE, value);
  }

  public static String getDelayForRepeatFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, DELAY_FOR_REPEAT_FORM_ATTRIBUTE);
  }
  public static boolean hasDelayForRepeatFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, DELAY_FOR_REPEAT_FORM_ATTRIBUTE);
  }

  public static void setPageStepSizeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, PAGE_STEP_SIZE_FORM_ATTRIBUTE, value);
  }

  public static String getPageStepSizeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, PAGE_STEP_SIZE_FORM_ATTRIBUTE);
  }
  public static boolean hasPageStepSizeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, PAGE_STEP_SIZE_FORM_ATTRIBUTE);
  }

  public static void setStepSizeFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, STEP_SIZE_FORM_ATTRIBUTE, value);
  }

  public static String getStepSizeFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, STEP_SIZE_FORM_ATTRIBUTE);
  }
  public static boolean hasStepSizeFormAttribute(Element element) {
    return element.hasAttributeNS(FORM_NS, STEP_SIZE_FORM_ATTRIBUTE);
  }

  public static void setPropertyNameFormAttribute(Element element, String value) {
    element.setAttributeNS(FORM_NS, PROPERTY_NAME_FORM_ATTRIBUTE, value);
  }

  public static String getPropertyNameFormAttribute(Element element) {
    return element.getAttributeNS(FORM_NS, PROPERTY_NAME_FORM_ATTRIBUTE);
  }

  public static void setAdditiveSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, ADDITIVE_SMIL_ATTRIBUTE, value);
  }

  public static String getAdditiveSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, ADDITIVE_SMIL_ATTRIBUTE);
  }
  public static boolean hasAdditiveSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, ADDITIVE_SMIL_ATTRIBUTE);
  }

  public static void setAccumulateSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, ACCUMULATE_SMIL_ATTRIBUTE, value);
  }

  public static String getAccumulateSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, ACCUMULATE_SMIL_ATTRIBUTE);
  }
  public static boolean hasAccumulateSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, ACCUMULATE_SMIL_ATTRIBUTE);
  }

  public static void setFillSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, FILL_SMIL_ATTRIBUTE, value);
  }

  public static String getFillSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, FILL_SMIL_ATTRIBUTE);
  }
  public static boolean hasFillSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, FILL_SMIL_ATTRIBUTE);
  }

  public static void setRepeatCountSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, REPEATCOUNT_SMIL_ATTRIBUTE, value);
  }

  public static String getRepeatCountSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, REPEATCOUNT_SMIL_ATTRIBUTE);
  }

  public static void setRepeatDurSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, REPEATDUR_SMIL_ATTRIBUTE, value);
  }

  public static String getRepeatDurSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, REPEATDUR_SMIL_ATTRIBUTE);
  }

  public static void setKeySplinesSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, KEYSPLINES_SMIL_ATTRIBUTE, value);
  }

  public static String getKeySplinesSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, KEYSPLINES_SMIL_ATTRIBUTE);
  }
  public static boolean hasKeySplinesSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, KEYSPLINES_SMIL_ATTRIBUTE);
  }

  public static void setKeyTimesSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, KEYTIMES_SMIL_ATTRIBUTE, value);
  }

  public static String getKeyTimesSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, KEYTIMES_SMIL_ATTRIBUTE);
  }
  public static boolean hasKeyTimesSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, KEYTIMES_SMIL_ATTRIBUTE);
  }

  public static void setCalcModeSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, CALCMODE_SMIL_ATTRIBUTE, value);
  }

  public static String getCalcModeSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, CALCMODE_SMIL_ATTRIBUTE);
  }
  public static boolean hasCalcModeSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, CALCMODE_SMIL_ATTRIBUTE);
  }

  public static void setBySmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, BY_SMIL_ATTRIBUTE, value);
  }

  public static String getBySmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, BY_SMIL_ATTRIBUTE);
  }
  public static boolean hasBySmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, BY_SMIL_ATTRIBUTE);
  }

  public static void setFromSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, FROM_SMIL_ATTRIBUTE, value);
  }

  public static String getFromSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, FROM_SMIL_ATTRIBUTE);
  }
  public static boolean hasFromSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, FROM_SMIL_ATTRIBUTE);
  }

  public static void setToSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, TO_SMIL_ATTRIBUTE, value);
  }

  public static String getToSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, TO_SMIL_ATTRIBUTE);
  }
  public static boolean hasToSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, TO_SMIL_ATTRIBUTE);
  }

  public static void setFormulaAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, FORMULA_ANIM_ATTRIBUTE, value);
  }

  public static String getFormulaAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, FORMULA_ANIM_ATTRIBUTE);
  }
  public static boolean hasFormulaAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, FORMULA_ANIM_ATTRIBUTE);
  }

  public static void setValuesSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, VALUES_SMIL_ATTRIBUTE, value);
  }

  public static String getValuesSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, VALUES_SMIL_ATTRIBUTE);
  }
  public static boolean hasValuesSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, VALUES_SMIL_ATTRIBUTE);
  }

  public static void setAttributeNameSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, ATTRIBUTENAME_SMIL_ATTRIBUTE, value);
  }

  public static String getAttributeNameSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, ATTRIBUTENAME_SMIL_ATTRIBUTE);
  }

  public static void setSubItemAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, SUB_ITEM_ANIM_ATTRIBUTE, value);
  }

  public static String getSubItemAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, SUB_ITEM_ANIM_ATTRIBUTE);
  }
  public static boolean hasSubItemAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, SUB_ITEM_ANIM_ATTRIBUTE);
  }

  public static void setTargetElementSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, TARGETELEMENT_SMIL_ATTRIBUTE, value);
  }

  public static String getTargetElementSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, TARGETELEMENT_SMIL_ATTRIBUTE);
  }
  public static boolean hasTargetElementSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, TARGETELEMENT_SMIL_ATTRIBUTE);
  }

  public static void setOriginSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, ORIGIN_SVG_ATTRIBUTE, value);
  }

  public static String getOriginSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, ORIGIN_SVG_ATTRIBUTE);
  }
  public static boolean hasOriginSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, ORIGIN_SVG_ATTRIBUTE);
  }

  public static void setPathSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, PATH_SVG_ATTRIBUTE, value);
  }

  public static String getPathSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, PATH_SVG_ATTRIBUTE);
  }
  public static boolean hasPathSvgAttribute(Element element) {
    return element.hasAttributeNS(SVG_NS, PATH_SVG_ATTRIBUTE);
  }

  public static void setColorInterpolationDirectionAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, COLOR_INTERPOLATION_DIRECTION_ANIM_ATTRIBUTE, value);
  }

  public static String getColorInterpolationDirectionAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, COLOR_INTERPOLATION_DIRECTION_ANIM_ATTRIBUTE);
  }
  public static boolean hasColorInterpolationDirectionAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, COLOR_INTERPOLATION_DIRECTION_ANIM_ATTRIBUTE);
  }

  public static void setColorInterpolationAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, COLOR_INTERPOLATION_ANIM_ATTRIBUTE, value);
  }

  public static String getColorInterpolationAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, COLOR_INTERPOLATION_ANIM_ATTRIBUTE);
  }
  public static boolean hasColorInterpolationAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, COLOR_INTERPOLATION_ANIM_ATTRIBUTE);
  }

  public static void setTypeSvgAttribute(Element element, String value) {
    element.setAttributeNS(SVG_NS, TYPE_SVG_ATTRIBUTE, value);
  }

  public static String getTypeSvgAttribute(Element element) {
    return element.getAttributeNS(SVG_NS, TYPE_SVG_ATTRIBUTE);
  }

  public static void setModeSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, MODE_SMIL_ATTRIBUTE, value);
  }

  public static String getModeSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, MODE_SMIL_ATTRIBUTE);
  }
  public static boolean hasModeSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, MODE_SMIL_ATTRIBUTE);
  }

  public static void setEndsyncSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, ENDSYNC_SMIL_ATTRIBUTE, value);
  }

  public static String getEndsyncSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, ENDSYNC_SMIL_ATTRIBUTE);
  }
  public static boolean hasEndsyncSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, ENDSYNC_SMIL_ATTRIBUTE);
  }

  public static void setAutoReverseSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, AUTOREVERSE_SMIL_ATTRIBUTE, value);
  }

  public static String getAutoReverseSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, AUTOREVERSE_SMIL_ATTRIBUTE);
  }
  public static boolean hasAutoReverseSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, AUTOREVERSE_SMIL_ATTRIBUTE);
  }

  public static void setDecelerateSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, DECELERATE_SMIL_ATTRIBUTE, value);
  }

  public static String getDecelerateSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, DECELERATE_SMIL_ATTRIBUTE);
  }
  public static boolean hasDecelerateSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, DECELERATE_SMIL_ATTRIBUTE);
  }

  public static void setAccelerateSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, ACCELERATE_SMIL_ATTRIBUTE, value);
  }

  public static String getAccelerateSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, ACCELERATE_SMIL_ATTRIBUTE);
  }
  public static boolean hasAccelerateSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, ACCELERATE_SMIL_ATTRIBUTE);
  }

  public static void setFillDefaultSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, FILLDEFAULT_SMIL_ATTRIBUTE, value);
  }

  public static String getFillDefaultSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, FILLDEFAULT_SMIL_ATTRIBUTE);
  }
  public static boolean hasFillDefaultSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, FILLDEFAULT_SMIL_ATTRIBUTE);
  }

  public static void setRestartDefaultSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, RESTARTDEFAULT_SMIL_ATTRIBUTE, value);
  }

  public static String getRestartDefaultSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, RESTARTDEFAULT_SMIL_ATTRIBUTE);
  }
  public static boolean hasRestartDefaultSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, RESTARTDEFAULT_SMIL_ATTRIBUTE);
  }

  public static void setRestartSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, RESTART_SMIL_ATTRIBUTE, value);
  }

  public static String getRestartSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, RESTART_SMIL_ATTRIBUTE);
  }
  public static boolean hasRestartSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, RESTART_SMIL_ATTRIBUTE);
  }

  public static void setDurSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, DUR_SMIL_ATTRIBUTE, value);
  }

  public static String getDurSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, DUR_SMIL_ATTRIBUTE);
  }
  public static boolean hasDurSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, DUR_SMIL_ATTRIBUTE);
  }

  public static void setEndSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, END_SMIL_ATTRIBUTE, value);
  }

  public static String getEndSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, END_SMIL_ATTRIBUTE);
  }
  public static boolean hasEndSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, END_SMIL_ATTRIBUTE);
  }

  public static void setBeginSmilAttribute(Element element, String value) {
    element.setAttributeNS(SMIL_NS, BEGIN_SMIL_ATTRIBUTE, value);
  }

  public static String getBeginSmilAttribute(Element element) {
    return element.getAttributeNS(SMIL_NS, BEGIN_SMIL_ATTRIBUTE);
  }
  public static boolean hasBeginSmilAttribute(Element element) {
    return element.hasAttributeNS(SMIL_NS, BEGIN_SMIL_ATTRIBUTE);
  }

  public static void setIdAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, ID_ANIM_ATTRIBUTE, value);
  }

  public static String getIdAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, ID_ANIM_ATTRIBUTE);
  }
  public static boolean hasIdAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, ID_ANIM_ATTRIBUTE);
  }

  public static void setGroupIdPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, GROUP_ID_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getGroupIdPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, GROUP_ID_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasGroupIdPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, GROUP_ID_PRESENTATION_ATTRIBUTE);
  }

  public static void setMasterElementPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, MASTER_ELEMENT_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getMasterElementPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, MASTER_ELEMENT_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasMasterElementPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, MASTER_ELEMENT_PRESENTATION_ATTRIBUTE);
  }

  public static void setPresetClassPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PRESET_CLASS_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPresetClassPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PRESET_CLASS_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPresetClassPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PRESET_CLASS_PRESENTATION_ATTRIBUTE);
  }

  public static void setPresetSubTypePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PRESET_SUB_TYPE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPresetSubTypePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PRESET_SUB_TYPE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPresetSubTypePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PRESET_SUB_TYPE_PRESENTATION_ATTRIBUTE);
  }

  public static void setPresetIdPresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, PRESET_ID_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getPresetIdPresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, PRESET_ID_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasPresetIdPresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, PRESET_ID_PRESENTATION_ATTRIBUTE);
  }

  public static void setNodeTypePresentationAttribute(Element element, String value) {
    element.setAttributeNS(PRESENTATION_NS, NODE_TYPE_PRESENTATION_ATTRIBUTE, value);
  }

  public static String getNodeTypePresentationAttribute(Element element) {
    return element.getAttributeNS(PRESENTATION_NS, NODE_TYPE_PRESENTATION_ATTRIBUTE);
  }
  public static boolean hasNodeTypePresentationAttribute(Element element) {
    return element.hasAttributeNS(PRESENTATION_NS, NODE_TYPE_PRESENTATION_ATTRIBUTE);
  }

  public static void setIterateIntervalAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, ITERATE_INTERVAL_ANIM_ATTRIBUTE, value);
  }

  public static String getIterateIntervalAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, ITERATE_INTERVAL_ANIM_ATTRIBUTE);
  }
  public static boolean hasIterateIntervalAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, ITERATE_INTERVAL_ANIM_ATTRIBUTE);
  }

  public static void setIterateTypeAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, ITERATE_TYPE_ANIM_ATTRIBUTE, value);
  }

  public static String getIterateTypeAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, ITERATE_TYPE_ANIM_ATTRIBUTE);
  }
  public static boolean hasIterateTypeAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, ITERATE_TYPE_ANIM_ATTRIBUTE);
  }

  public static void setAudioLevelAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, AUDIO_LEVEL_ANIM_ATTRIBUTE, value);
  }

  public static String getAudioLevelAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, AUDIO_LEVEL_ANIM_ATTRIBUTE);
  }
  public static boolean hasAudioLevelAnimAttribute(Element element) {
    return element.hasAttributeNS(ANIM_NS, AUDIO_LEVEL_ANIM_ATTRIBUTE);
  }

  public static void setValueAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, VALUE_ANIM_ATTRIBUTE, value);
  }

  public static String getValueAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, VALUE_ANIM_ATTRIBUTE);
  }

  public static void setNameAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, NAME_ANIM_ATTRIBUTE, value);
  }

  public static String getNameAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, NAME_ANIM_ATTRIBUTE);
  }

  public static void setCommandAnimAttribute(Element element, String value) {
    element.setAttributeNS(ANIM_NS, COMMAND_ANIM_ATTRIBUTE, value);
  }

  public static String getCommandAnimAttribute(Element element) {
    return element.getAttributeNS(ANIM_NS, COMMAND_ANIM_ATTRIBUTE);
  }

  public static void setBulletRelativeSizeTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, BULLET_RELATIVE_SIZE_TEXT_ATTRIBUTE, value);
  }

  public static String getBulletRelativeSizeTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, BULLET_RELATIVE_SIZE_TEXT_ATTRIBUTE);
  }
  public static boolean hasBulletRelativeSizeTextAttribute(Element element) {
    return element.hasAttributeNS(TEXT_NS, BULLET_RELATIVE_SIZE_TEXT_ATTRIBUTE);
  }

  public static void setBulletCharTextAttribute(Element element, String value) {
    element.setAttributeNS(TEXT_NS, BULLET_CHAR_TEXT_ATTRIBUTE, value);
  }

  public static String getBulletCharTextAttribute(Element element) {
    return element.getAttributeNS(TEXT_NS, BULLET_CHAR_TEXT_ATTRIBUTE);
  }
public static final Map<String, String> NAMESPACE_BY_PREFIX = new HashMap<String, String>();
public static final Map<String, String> PREFIX_BY_NAMESPACE = new HashMap<String, String>();
static {
PREFIX_BY_NAMESPACE.put(OFFICE_NS, OFFICE_PREFIX);
NAMESPACE_BY_PREFIX.put(OFFICE_PREFIX, OFFICE_NS);
PREFIX_BY_NAMESPACE.put(CONFIG_NS, CONFIG_PREFIX);
NAMESPACE_BY_PREFIX.put(CONFIG_PREFIX, CONFIG_NS);
PREFIX_BY_NAMESPACE.put(DC_NS, DC_PREFIX);
NAMESPACE_BY_PREFIX.put(DC_PREFIX, DC_NS);
PREFIX_BY_NAMESPACE.put(TEXT_NS, TEXT_PREFIX);
NAMESPACE_BY_PREFIX.put(TEXT_PREFIX, TEXT_NS);
PREFIX_BY_NAMESPACE.put(TABLE_NS, TABLE_PREFIX);
NAMESPACE_BY_PREFIX.put(TABLE_PREFIX, TABLE_NS);
PREFIX_BY_NAMESPACE.put(STYLE_NS, STYLE_PREFIX);
NAMESPACE_BY_PREFIX.put(STYLE_PREFIX, STYLE_NS);
PREFIX_BY_NAMESPACE.put(DRAW_NS, DRAW_PREFIX);
NAMESPACE_BY_PREFIX.put(DRAW_PREFIX, DRAW_NS);
PREFIX_BY_NAMESPACE.put(SVG_NS, SVG_PREFIX);
NAMESPACE_BY_PREFIX.put(SVG_PREFIX, SVG_NS);
PREFIX_BY_NAMESPACE.put(DR3D_NS, DR3D_PREFIX);
NAMESPACE_BY_PREFIX.put(DR3D_PREFIX, DR3D_NS);
PREFIX_BY_NAMESPACE.put(PRESENTATION_NS, PRESENTATION_PREFIX);
NAMESPACE_BY_PREFIX.put(PRESENTATION_PREFIX, PRESENTATION_NS);
PREFIX_BY_NAMESPACE.put(CHART_NS, CHART_PREFIX);
NAMESPACE_BY_PREFIX.put(CHART_PREFIX, CHART_NS);
PREFIX_BY_NAMESPACE.put(FORM_NS, FORM_PREFIX);
NAMESPACE_BY_PREFIX.put(FORM_PREFIX, FORM_NS);
PREFIX_BY_NAMESPACE.put(XFORMS_NS, XFORMS_PREFIX);
NAMESPACE_BY_PREFIX.put(XFORMS_PREFIX, XFORMS_NS);
PREFIX_BY_NAMESPACE.put(META_NS, META_PREFIX);
NAMESPACE_BY_PREFIX.put(META_PREFIX, META_NS);
PREFIX_BY_NAMESPACE.put(SCRIPT_NS, SCRIPT_PREFIX);
NAMESPACE_BY_PREFIX.put(SCRIPT_PREFIX, SCRIPT_NS);
PREFIX_BY_NAMESPACE.put(MATH_NS, MATH_PREFIX);
NAMESPACE_BY_PREFIX.put(MATH_PREFIX, MATH_NS);
PREFIX_BY_NAMESPACE.put(NUMBER_NS, NUMBER_PREFIX);
NAMESPACE_BY_PREFIX.put(NUMBER_PREFIX, NUMBER_NS);
PREFIX_BY_NAMESPACE.put(ANIM_NS, ANIM_PREFIX);
NAMESPACE_BY_PREFIX.put(ANIM_PREFIX, ANIM_NS);
PREFIX_BY_NAMESPACE.put(XLINK_NS, XLINK_PREFIX);
NAMESPACE_BY_PREFIX.put(XLINK_PREFIX, XLINK_NS);
PREFIX_BY_NAMESPACE.put(FO_NS, FO_PREFIX);
NAMESPACE_BY_PREFIX.put(FO_PREFIX, FO_NS);
PREFIX_BY_NAMESPACE.put(SMIL_NS, SMIL_PREFIX);
NAMESPACE_BY_PREFIX.put(SMIL_PREFIX, SMIL_NS);

}
}
