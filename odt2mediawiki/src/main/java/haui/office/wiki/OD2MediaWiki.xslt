<!-- 
 OpenDocument2MediaWiki
 Copyright (C) 2005 Octavi Estape www.activasoft.com
 Version 2006-01-03
  - reference of the document (user data 1) if doesnt find the filename
 Version 2005-12-26
  - fixed: ordered lists, indentation, subscript, superscript, linethrough (strike)
  - try to gent the image name but doesnt work
 Previuos
 based on:
 OpenDocument2UniWakka (v. 0.4) Copyright (C) 2005  Andrea Rossato
 
 OpenDocument2MediaWiki is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.
 
 OpenDocument2MediaWiki is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 
 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
-->

<xsl:stylesheet version="1.0"
		xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
		xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
		xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"
		xmlns:xlink="http://www.w3.org/1999/xlink"
		xmlns:dc="http://purl.org/dc/elements/1.1/"
		xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0"
		xmlns:number="urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0"
		xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0"
		xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		xmlns:math="http://www.w3.org/1998/Math/MathML"
		xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0"
		xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0"
		xmlns:ooo="http://openoffice.org/2004/office"
		xmlns:ooow="http://openoffice.org/2004/writer"
		xmlns:oooc="http://openoffice.org/2004/calc"
		xmlns:dom="http://www.w3.org/2001/xml-events"
		xmlns:xforms="http://www.w3.org/2002/xforms"
		xmlns:xsd="http://www.w3.org/2001/XMLSchema"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<xsl:output method="text" />
	<xsl:strip-space elements="*"/>
	<xsl:preserve-space elements="text:p" />
	<!-- Catch the non-content document sections -->
	<xsl:template match="/XML"/>
	<xsl:template match="/office:document/office:meta"/>
	<xsl:template match="/office:document/office:settings"/>
	<xsl:template match="/office:document/office:document-styles"/>
	<xsl:template match="/office:document/office:font-decls"/>
	<xsl:template match="/office:document/office:styles"/>
	<xsl:template match="/office:document/office:master-styles"/>
	<!-- Formats the text sections according to the style name -->

	<xsl:template name="style-font">
		<xsl:param name="style"/>
		<xsl:variable name="font-style" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@fo:font-style"/>
		<xsl:variable name="font-weight" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@fo:font-weight"/>
		<xsl:variable name="font-underline" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-underline-style"/>
		<xsl:variable name="centered" select="//office:automatic-styles/style:style[@style:name=$style]/style:paragraph-properties/@fo:text-align"/>
		<xsl:variable name="indented" select="//office:automatic-styles/style:style[@style:name=$style]/style:paragraph-properties/@fo:margin-left"/>
		<xsl:variable name="supscript" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-position"/>
		<xsl:variable name="subscript" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-position"/>
		<xsl:variable name="linethrough" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-line-through-style"/>

<!-- debug style
		<xsl:text>[</xsl:text>
		<xsl:value-of select="$subscript"/><xsl:text>, </xsl:text>
		<xsl:value-of select="$supscript"/><xsl:text>, </xsl:text>
		<xsl:value-of select="$linethrough"/>		
		<xsl:value-of select="$font-name"/>
		<xsl:text>]</xsl:text>

		<xsl:text>[</xsl:text>
		<xsl:value-of select="$font-weight"/><xsl:text>, </xsl:text>
 		<xsl:value-of select="$font-style"/><xsl:text>, </xsl:text>
		<xsl:value-of select="$font-underline"/><xsl:text>, </xsl:text>
		<xsl:value-of select="$centered"/>
		<xsl:text>]</xsl:text>
-->
		<xsl:choose>
			<xsl:when test="$centered='center'">&lt;center&gt;</xsl:when>
			<xsl:when test="contains($supscript, 'sup')">&lt;sup&gt;</xsl:when>
			<xsl:when test="contains($subscript, 'sub')">&lt;sub&gt;</xsl:when>
			<xsl:when test="contains($linethrough, 'solid')">&lt;strike&gt;</xsl:when>

			<xsl:when test="$font-weight='bold' and $font-style='italic' and $font-underline='none'">'''''</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='italic' and $font-underline='solid'">'''''&lt;u&gt;</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='normal' and $font-underline='solid'">'''&lt;u&gt;</xsl:when>
			<xsl:when test="$font-weight='normal' and $font-style='italic' and $font-underline='solid'">''&lt;u&gt;</xsl:when>
			<xsl:when test="$font-weight='normal' and $font-style='normal' and $font-underline='solid'">&lt;u&gt;</xsl:when>
			<xsl:when test="$font-weight='bold' and not($font-style) and not($font-underline)">'''</xsl:when>
			<xsl:when test="not($font-weight) and $font-style='italic' and not($font-underline)">''</xsl:when>
			<xsl:when test="not($font-weight) and not($font-style) and $font-underline='solid'">&lt;u&gt;</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='normal' and not($font-underline)">'''</xsl:when>
			<xsl:when test="$font-weight='normal' and $font-style='italic' and not($font-underline)">''</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='italic' and not($font-underline)">'''''</xsl:when>
			<xsl:when test="$font-weight='bold' and not($font-style) and $font-underline='solid'">'''&lt;u&gt;</xsl:when>
			<xsl:when test="not($font-weight) and $font-style='italic' and $font-underline='solid'">''&lt;u&gt;</xsl:when>
			<xsl:when test="contains($indented, 'cm')">
				<xsl:choose>
					<xsl:when test="translate($indented, 'cm', '') &gt; 0 and translate($indented, 'cm', '') &lt; 2">
					<xsl:text disable-output-escaping="yes">:</xsl:text>
					</xsl:when>
					<xsl:when test="translate($indented, 'cm', '') &gt; 2 and translate($indented, 'cm', '') &lt; 3.5">
					<xsl:text disable-output-escaping="yes">::</xsl:text>
					</xsl:when>
					<xsl:when test="translate($indented, 'cm', '') &gt; 3.5">
					<xsl:text disable-output-escaping="yes">:::</xsl:text>
					</xsl:when>
					</xsl:choose>
			</xsl:when>
			<xsl:when test="contains($indented, 'in')">
				<xsl:choose>
					<xsl:when test="translate($indented, 'in', '') &gt; 0 and translate($indented, 'inch', '') &lt; 0.5">
					<xsl:text disable-output-escaping="yes">:</xsl:text>
					</xsl:when>
					<xsl:when test="translate($indented, 'in', '') &gt; 0.5 and translate($indented, 'inch', '') &lt; 1">
					<xsl:text disable-output-escaping="yes">::</xsl:text>
					</xsl:when>
					<xsl:when test="translate($indented, 'in', '') &gt; 1">
					<xsl:text disable-output-escaping="yes">:::</xsl:text>
					</xsl:when>
				</xsl:choose>
			</xsl:when>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="style-font-close">
		<xsl:param name="style"/>
		<xsl:variable name="font-style" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@fo:font-style"/>
		<xsl:variable name="font-weight" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@fo:font-weight"/>
		<xsl:variable name="font-underline" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-underline-style"/>
		<xsl:variable name="centered" select="//office:automatic-styles/style:style[@style:name=$style]/style:paragraph-properties/@fo:text-align"/>
		<xsl:variable name="supscript" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-position"/>
		<xsl:variable name="subscript" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-position"/>
		<xsl:variable name="linethrough" select="//office:automatic-styles/style:style[@style:name=$style]/style:text-properties/@style:text-line-through-style"/>

<!-- style debug
		<xsl:text>[</xsl:text>
		<xsl:value-of select="$font-weight"/><xsl:text>, </xsl:text>
 		<xsl:value-of select="$font-style"/><xsl:text>, </xsl:text>
		<xsl:value-of select="$font-name"/>
		<xsl:text>]</xsl:text>

		<xsl:text>[</xsl:text>
		<xsl:value-of select="$font-weight"/><xsl:text>, </xsl:text>
 		<xsl:value-of select="$font-style"/><xsl:text>, </xsl:text>
		<xsl:value-of select="$font-underline"/><xsl:text>, </xsl:text>
		<xsl:value-of select="$style"/>
		<xsl:text>]</xsl:text>
-->
		<xsl:choose>

			<xsl:when test="$centered='center'">&lt;/center&gt;</xsl:when>
			<xsl:when test="contains($supscript, 'sup')">&lt;/sup&gt;</xsl:when>
			<xsl:when test="contains($subscript, 'sub')">&lt;/sub&gt;</xsl:when>
			<xsl:when test="contains($linethrough, 'solid')">&lt;/strike&gt;</xsl:when>

			<xsl:when test="$font-weight='bold' and $font-style='italic' and $font-underline='none'">'''''</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='italic' and $font-underline='solid'">&lt;/u&gt;'''''</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='normal' and $font-underline='solid'">&lt;/u&gt;'''</xsl:when>
			<xsl:when test="$font-weight='normal' and $font-style='italic' and $font-underline='solid'">&lt;/u&gt;''</xsl:when>
			<xsl:when test="$font-weight='normal' and $font-style='normal' and $font-underline='solid'">&lt;/u&gt;</xsl:when>
			<xsl:when test="$font-weight='bold' and not($font-style) and not($font-underline)">'''</xsl:when>
			<xsl:when test="not($font-weight) and $font-style='italic' and not($font-underline)">''</xsl:when>
			<xsl:when test="not($font-weight) and not($font-style) and $font-underline='solid'">&lt;/u&gt;</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='normal' and not($font-underline)">'''</xsl:when>
			<xsl:when test="$font-weight='normal' and $font-style='italic' and not($font-underline)">''</xsl:when>
			<xsl:when test="$font-weight='bold' and $font-style='italic' and not($font-underline)">'''''</xsl:when>
			<xsl:when test="$font-weight='bold' and not($font-style) and $font-underline='solid'">&lt;/u&gt;'''</xsl:when>
			<xsl:when test="not($font-weight) and $font-style='italic' and $font-underline='solid'">&lt;/u&gt;''</xsl:when>

		</xsl:choose>
	</xsl:template>

	<!-- Image -->
	<xsl:template match="draw:image">
		<!-- I dont know why this doesnt work -->
		<xsl:variable name="imagelinknum">
			<xsl:value-of select="count(preceding::draw:image)"/>
		</xsl:variable>
		<xsl:variable name="imagelink">
			<xsl:value-of select="@xlink:href"/>
		</xsl:variable>
		<xsl:text disable-output-escaping="yes">[[Image:</xsl:text>
		<xsl:choose>
			<!-- I dont know whe event is not empty it doesnt write anything -->
			<xsl:when test="$imagelink = ''">
				<xsl:value-of select="preceding::text:user-defined"/>
				<xsl:text disable-output-escaping="yes"> Image </xsl:text>
				<xsl:value-of select="$imagelinknum"/>
			</xsl:when>
			<xsl:when test="string-length($imagelink) = 0">
				<xsl:value-of select="preceding::text:user-defined"/>
				<xsl:text disable-output-escaping="yes"> image </xsl:text>
				<xsl:value-of select="$imagelinknum"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$imagelink"/>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:text disable-output-escaping="yes">]]
</xsl:text>
	</xsl:template>

	<!-- ole object -->
	<xsl:template match="draw:object-ole">
		<!-- I dont know why this doesnt work -->
		<xsl:variable name="imagelinknum">
			<xsl:value-of select="count(preceding::draw:image)"/>
		</xsl:variable>
		<xsl:variable name="imagelink">
			<xsl:value-of select="@xlink:href"/>
		</xsl:variable>
		<xsl:text disable-output-escaping="yes">[[Image:</xsl:text>
		<xsl:choose>
			<!-- I dont know whe event is not empty it doesnt write anything -->
			<xsl:when test="$imagelink = ''">
				<xsl:value-of select="preceding::text:user-defined"/>
				<xsl:text disable-output-escaping="yes"> Object-OLE </xsl:text>
				<xsl:value-of select="$imagelinknum"/>
			</xsl:when>
			<xsl:when test="count($imagelink) = 0">
				<xsl:value-of select="preceding::text:user-defined"/>
				<xsl:text disable-output-escaping="yes"> object-ole </xsl:text>
				<xsl:value-of select="$imagelinknum"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$imagelink"/>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:text disable-output-escaping="yes">]]
</xsl:text>
	</xsl:template>


	<!-- Text blocks -->
	<xsl:template match="//text:p">
		<xsl:variable name="cur-style-name">
			<xsl:value-of select="@text:style-name"/>
		</xsl:variable>
		<xsl:variable name="text" select="."/>
		<xsl:if test="$text!=''">
			<xsl:call-template name="style-font">
				<xsl:with-param name="style">
					<xsl:value-of select="$cur-style-name"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:apply-templates/>
			<xsl:call-template name="style-font-close">
				<xsl:with-param name="style">
					<xsl:value-of select="$cur-style-name"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- these are all newline rules -->
			<xsl:choose>
				<!-- we shouldn't add a newline for elements inside a table -->
				<xsl:when test="ancestor::table:table-cell and not(following-sibling::text:p)">
				</xsl:when>
				<!-- but we would want two new between two text:p in a cell -->
				<xsl:when test="ancestor::table:table-cell and following-sibling::text:p">
				<xsl:text disable-output-escaping="yes">

</xsl:text>
				</xsl:when>
				<!-- we do want a single newline at the end of a list item -->
				<xsl:when test="ancestor::text:list-item and following::text:list-item">
					<xsl:text disable-output-escaping="yes">
</xsl:text>
				</xsl:when>
				<!-- and double at the end of the list-->
				<xsl:when test="preceding-sibling::text:ordered-list or preceding-sibling::text:unordered-list">
					<xsl:text disable-output-escaping="yes">

</xsl:text>
				</xsl:when>
				<xsl:when test="ancestor::text:align='center'">
					<xsl:text disable-output-escaping="yes">

					</xsl:text>
				</xsl:when>
				<xsl:when test="ancestor::text:note-body">
					<xsl:text disable-output-escaping="yes"></xsl:text>
				</xsl:when>
				<xsl:otherwise>
					<xsl:text disable-output-escaping="yes">

</xsl:text>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$text=''">
			<xsl:text disable-output-escaping="yes">
</xsl:text>
		</xsl:if>
	</xsl:template>
	<!-- span formatting -->
	<xsl:template match="//text:span">
		<xsl:variable name="cur-style-name">
			<xsl:value-of select="@text:style-name"/>
		</xsl:variable>
		<xsl:variable name="text" select="."/>
		<xsl:if test="$text!=''">
			<xsl:call-template name="style-font">
				<xsl:with-param name="style">
					<xsl:value-of select="$cur-style-name"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:apply-templates/>
 			<xsl:call-template name="style-font-close">
				<xsl:with-param name="style">
					<xsl:value-of select="$cur-style-name"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>

	<!-- Tables -->
	<xsl:template match="//table:table">
		<!--<xsl:variable name="table-name" select="@table:name"/>-->
		<xsl:text disable-output-escaping="yes">{|
|</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">}</xsl:text>
	</xsl:template>
	<!-- Table header rows -->
	<xsl:template match="//table:table-header-rows">
	<xsl:choose>
                <xsl:when test="following-sibling::table:table-row">
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">-
|</xsl:text>	
	</xsl:when>		
	<xsl:otherwise>
 		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text> 
	</xsl:otherwise>
	</xsl:choose>

	</xsl:template>
	<!-- Table rows -->
	<xsl:template match="//table:table-row">
	<xsl:choose>
                <xsl:when test="following-sibling::table:table-row">
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">-
|</xsl:text>	
	</xsl:when>		
	<xsl:otherwise>
 		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text> 
	</xsl:otherwise>
	</xsl:choose>

	</xsl:template>
	<!-- Table cells -->
	<xsl:template match="//table:table//table:table-row/table:table-cell">
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> 
|</xsl:text>
	</xsl:template>
	<!-- Handles horizontally merged cells -->
	<xsl:template match="//table:covered-table-cell">
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<!-- Table of Contents -->
	<xsl:template match="//text:table-of-content">
		<xsl:text disable-output-escaping="yes">__TOC__
</xsl:text>
	</xsl:template>


	<xsl:template match="//text:h[@text:outline-level='1']">
		<xsl:text disable-output-escaping="yes">= </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> =
</xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='2']">
		<xsl:text disable-output-escaping="yes">== </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> ==
</xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='3']">
		<xsl:text disable-output-escaping="yes">=== </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> ===
</xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='4']">
		<xsl:text disable-output-escaping="yes">==== </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> ====
</xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='5']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='6']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='7']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='8']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='9']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:h[@text:outline-level='10']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>

	</xsl:template>
	<!-- My Headings -->
	<xsl:template match="//text:p[@text:style-name='Heading 1']">
		<xsl:text disable-output-escaping="yes">= </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">= 
</xsl:text>
	</xsl:template>

	<xsl:template match="//text:p[@text:style-name='Heading 2']">
		<xsl:text disable-output-escaping="yes">== </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> ==
</xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 3']">
		<xsl:text disable-output-escaping="yes">=== </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> ===
</xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 4']">
		<xsl:text disable-output-escaping="yes">==== </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"> ====
</xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 5']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 6']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 7']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 8']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 9']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>
	<xsl:template match="//text:p[@text:style-name='Heading 10']">
		<xsl:text disable-output-escaping="yes"></xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes"></xsl:text>
	</xsl:template>


	<!-- Footnote -->
	<xsl:template match="//text:note-body">
		<xsl:text disable-output-escaping="yes">{{fn </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">}}</xsl:text>
	</xsl:template>
	<xsl:template match="//text:note-citation">
	</xsl:template>

	<!-- my styles -->
	<xsl:template match="//text:span[@text:style-name='emph']">
		<xsl:text disable-output-escaping="yes">''</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">''</xsl:text>
	</xsl:template>
	<xsl:template match="//text:span[@text:style-name='italic']">
		<xsl:text disable-output-escaping="yes">''</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">''</xsl:text>
	</xsl:template>
	<xsl:template match="//text:span[@text:style-name='underline']">
		<xsl:text disable-output-escaping="yes">&lt;u&gt;</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">&lt;/u&gt;</xsl:text>
	</xsl:template>
	<xsl:template match="//text:span[@text:style-name='textbf']">
		<xsl:text disable-output-escaping="yes">'''</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">'''</xsl:text>
	</xsl:template>
	<xsl:template match="//text:span[@text:style-name='linethrough']">
		<xsl:text disable-output-escaping="yes">&lt;strike&gt;</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">&lt;/strike&gt;</xsl:text>
	</xsl:template>
	<xsl:template match="//text:span[@text:style-name='subscript']">
		<xsl:text disable-output-escaping="yes">&lt;sub&gt;</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">&lt;/sub&gt;</xsl:text>
	</xsl:template>
	<xsl:template match="//text:span[@text:style-name='supscript']">
		<xsl:text disable-output-escaping="yes">&lt;sup&gt;</xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">&lt;/sup&gt;</xsl:text>
	</xsl:template>

	<!-- biblio citations -->
	<xsl:template match="//text:span[@text:style-name='bibliocit']">
		<xsl:text disable-output-escaping="yes">[[cite </xsl:text>
		<xsl:apply-templates/>
		<xsl:text disable-output-escaping="yes">]]</xsl:text>
	</xsl:template>

	<!-- links -->
	<xsl:template match="//text:a">
		<xsl:variable name="link">
			<xsl:value-of select="@xlink:href"/>
		</xsl:variable>
		<xsl:variable name="link-text">
			<xsl:value-of select="."/>
		</xsl:variable>
		<xsl:choose>
		<xsl:when test="$link = $link-text">
			<xsl:apply-templates/>
		</xsl:when>
		<xsl:otherwise>
			<xsl:text disable-output-escaping="yes">[</xsl:text>
			<xsl:value-of select="$link"/>
			<xsl:text disable-output-escaping="yes"> </xsl:text>
			<xsl:apply-templates/>
			<xsl:text disable-output-escaping="yes">]</xsl:text>
		</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<!-- lists -->
	<xsl:template match="//text:list/text:list-item">
		<xsl:variable name="level">
			<xsl:value-of select="count(ancestor::text:list)"/>
		</xsl:variable>
		<xsl:variable name="stylename" select="ancestor::text:list/@text:style-name" />
		<xsl:variable name="number-type" select="1"/>
		<xsl:variable name="num-type">
		<xsl:choose>
			<xsl:when test="../@text:style-name='upper-roman' or //office:automatic-styles/text:list-style[@style:name = $stylename][text:list-level-style-number[@text:level = $level and @style:num-format = 'I']]">
				<xsl:text>#</xsl:text>
			</xsl:when>
			<xsl:when test="../@text:style-name='upper-roman' or //office:automatic-styles/text:list-style[@style:name = $stylename][text:list-level-style-number[@text:level = $level and @style:num-format = '1']]">
				<xsl:text>#</xsl:text>
			</xsl:when>
			<xsl:when test="../@text:style-name='lower-roman' or //office:automatic-styles/text:list-style[@style:name = $stylename][text:list-level-style-number[@text:level = $level and @style:num-format = 'i']]">
				<xsl:text>#</xsl:text>
			</xsl:when>
			<xsl:when test="../@text:style-name='upper-alpha' or //office:automatic-styles/text:list-style[@style:name = $stylename][text:list-level-style-number[@text:level = $level and @style:num-format = 'A']]">
				<xsl:text>#</xsl:text>
			</xsl:when>
			<xsl:when test="../@text:style-name='lower-alpha' or //office:automatic-styles/text:list-style[@style:name = $stylename][text:list-level-style-number[@text:level = $level and @style:num-format = 'a']]">
				<xsl:text>#</xsl:text>
			</xsl:when>
		<xsl:when test="//office:automatic-styles/text:list-style[@style:name = $stylename][text:list-level-style-bullet[@text:level = $level and @text:style-name='Bullet_20_Symbols']]">
				<xsl:text>*</xsl:text>
			</xsl:when>

			<xsl:otherwise>
				<xsl:text>*</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
		</xsl:variable>
		<xsl:if test="$level=1">
			<xsl:choose>
				<xsl:when test="not(child::text:p)">
				</xsl:when>
				<xsl:otherwise>
					<xsl:text disable-output-escaping="yes"></xsl:text>
					<xsl:value-of select="$num-type"/>
					<xsl:text disable-output-escaping="yes"> </xsl:text>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$level=2">

			<xsl:choose>
			<xsl:when test="not(child::text:p)">

			</xsl:when>

			<xsl:otherwise>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:text disable-output-escaping="yes"> </xsl:text>
			</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$level=3">
			<xsl:choose>
			<xsl:when test="not(child::text:p)">

			</xsl:when>

			<xsl:otherwise>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:text disable-output-escaping="yes"> </xsl:text>
			</xsl:otherwise>
			</xsl:choose>

		</xsl:if>
		<xsl:if test="$level=4">
			<xsl:choose>
			<xsl:when test="not(child::text:p)">
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:text disable-output-escaping="yes"> </xsl:text>
			</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$level=5">
			<xsl:choose>
			<xsl:when test="not(child::text:p)">
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:text disable-output-escaping="yes"> </xsl:text>
			</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$level=6">
			<xsl:choose>
			<xsl:when test="not(child::text:p)">
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:text disable-output-escaping="yes"> </xsl:text>
			</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$level=7">
			<xsl:choose>
			<xsl:when test="not(child::text:p)">
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:value-of select="$num-type"/>
				<xsl:text disable-output-escaping="yes"> </xsl:text>
			</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:apply-templates/> 
	</xsl:template>
</xsl:stylesheet>
