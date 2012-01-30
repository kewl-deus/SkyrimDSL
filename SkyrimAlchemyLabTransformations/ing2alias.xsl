<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ing="http:/ingredient.lookupdata">

    <xsl:output omit-xml-declaration="yes"/>

    <xsl:key name="ing-alias-lookup" match="ing:ingredient" use="ing:name"/>

    <xsl:variable name="ingredients-top" select="document('')/*/ing:ingredients"/>

    <xsl:variable name="idPrefix" select="640853323178076"/>


    <xsl:template match="node[@type='g0a9.Ingredient']">


        <xsl:variable name="ingName"
                      select="current()/property[@name='name']/@value"/>

        <xsl:variable name="idCounter" select="1000 + count(preceding-sibling::node)"/>

        <xsl:element name="node">

            <xsl:attribute name="role">ingredient</xsl:attribute>
            <xsl:attribute name="roleId">g0a9.1207545486242546030</xsl:attribute>
            <xsl:attribute name="type">g0a9.IngredientAlias</xsl:attribute>
            <xsl:attribute name="typeId">g0a9.1207545486242556193</xsl:attribute>
            <xsl:attribute name="id">
                <xsl:value-of select="concat($idPrefix, $idCounter)"/>
            </xsl:attribute>

            <xsl:element name="property">
                <xsl:attribute name="name">name</xsl:attribute>
                <xsl:attribute name="nameId">tpck.1169194664001</xsl:attribute>
                <xsl:attribute name="value">
                    <xsl:apply-templates select="$ingredients-top">
                        <xsl:with-param name="ing-name" select="$ingName"/>
                    </xsl:apply-templates>
                </xsl:attribute>
            </xsl:element>

            <xsl:element name="link">
                <xsl:attribute name="role">ingredient</xsl:attribute>
                <xsl:attribute name="roleId">g0a9.5703238871183979160</xsl:attribute>
                <xsl:attribute name="targetNodeId">
                    <xsl:value-of select="@id"/>
                </xsl:attribute>
                <xsl:attribute name="resolveInfo">
                    <xsl:value-of select="$ingName"/>
                </xsl:attribute>
            </xsl:element>
        </xsl:element>

    </xsl:template>


    <xsl:template match="ing:ingredients" name="lookup-alias-by-name">
        <xsl:param name="ing-name"/>
            <xsl:value-of select="key('ing-alias-lookup', $ing-name)/ing:alias"/>
    </xsl:template>

    <ing:ingredients>
        <ing:ingredient><ing:name>Abeceanischer Mirakelbarsch</ing:name><ing:alias>Abecean Longfin</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Bärenklaue</ing:name><ing:alias>Bear Claws</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Berits Asche</ing:name><ing:alias>Berit's Ashes</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Biene</ing:name><ing:alias>Bee</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Bienenstockhülle</ing:name><ing:alias>Beehive Husk</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Blasenpilz</ing:name><ing:alias>Blisterwort</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Blaue Bergblume</ing:name><ing:alias>Blue Mountain Flower</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Blaue Pfeilfedern</ing:name><ing:alias>Blue Dartwing</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Blauer Schmetterlingsflügel</ing:name><ing:alias>Blue Butterfly Wing</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Blutende Krone</ing:name><ing:alias>Bleeding Crown</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Caniswurzel</ing:name><ing:alias>Canis Root</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Chauruseier</ing:name><ing:alias>Chaurus Eggs</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Cyrodilischer Spatenschwanz</ing:name><ing:alias>Cyrodilic Spadetail</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Daedraherz</ing:name><ing:alias>Daedra Heart</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Distelzweig</ing:name><ing:alias>Thistle Branch</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Dornenherz</ing:name><ing:alias>Briar Heart</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Drachenbaum</ing:name><ing:alias>Dragon's Tongue</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Drosselei</ing:name><ing:alias>Pine Thrush Egg</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Eisgeistzähne</ing:name><ing:alias>Ice Wraith Teeth</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Eismirriam</ing:name><ing:alias>Frost Mirriam</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Ektoplasma</ing:name><ing:alias>Ectoplasm</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Elfenohr</ing:name><ing:alias>Elves Ear</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Fackelwürmchenbrust</ing:name><ing:alias>Torchbug Thorax</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Falkenfedern</ing:name><ing:alias>Hawk Feathers</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Falkenschnabel</ing:name><ing:alias>Hawk Beak</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Falmerohr</ing:name><ing:alias>Falmer Ear</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Feuersalze</ing:name><ing:alias>Fire Salts</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Flusspeitscher</ing:name><ing:alias>River Betty</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Frostsalze</ing:name><ing:alias>Frost Salts</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Glühstaub</ing:name><ing:alias>Glow Dust</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Grassamen</ing:name><ing:alias>Grass Pod</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Großes Geweih</ing:name><ing:alias>Large Antlers</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Hängemoos</ing:name><ing:alias>Hanging Moss</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Hexenrabenfedern</ing:name><ing:alias>Hagraven Feathers</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Hexenrabenklaue</ing:name><ing:alias>Hagraven Claw</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Histkarpfen</ing:name><ing:alias>Histcarp</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Honigwabe</ing:name><ing:alias>Honeycomb</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Hühnerei</ing:name><ing:alias>Chicken's Egg</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Jarrinwurzel</ing:name><ing:alias>Jarrin Root</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Jasbaytrauben</ing:name><ing:alias>Jazbay Grapes</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Kleine Perle</ing:name><ing:alias>Small Pearl</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Kleines Geweih</ing:name><ing:alias>Small Antlers</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Knoblauch</ing:name><ing:alias>Garlic</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Knochenmehl</ing:name><ing:alias>Bone Meal</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Koboldschemel</ing:name><ing:alias>Imp Stool</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Kriechranke</ing:name><ing:alias>Creep Cluster</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Lavendel</ing:name><ing:alias>Lavender</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Magisches Leichentuch</ing:name><ing:alias>Wisp Wrappings</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Menschenfleisch</ing:name><ing:alias>Human Flesh</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Menschliches Herz</ing:name><ing:alias>Human Heart</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Mondfalterflügel</ing:name><ing:alias>Luna Moth Wing</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Mondzucker</ing:name><ing:alias>Moon Sugar</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Mora Tapinella</ing:name><ing:alias>Mora Tapinella</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Namiras Fäulnis</ing:name><ing:alias>Namira's Rot</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Nirnwurz</ing:name><ing:alias>Nirnroot</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Nordranke</ing:name><ing:alias>Nordic Barnacle</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Orangene Pfeilfedern</ing:name><ing:alias>Orange Dartwing</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Perle</ing:name><ing:alias>Pearl</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Pfahlwurzel</ing:name><ing:alias>Taproot</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Pulverisierter Mammutstoßzahn</ing:name><ing:alias>Powdered Mammoth Tusk</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Purpurne Nirnwurz</ing:name><ing:alias>Crimson Nirnroot</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Rauer Wulstling</ing:name><ing:alias>Fly Amanita</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Riesenflechte</ing:name><ing:alias>Giant Lichen</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Riesenzeh</ing:name><ing:alias>Giant's Toe</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Rote Bergblume</ing:name><ing:alias>Red Mountain Flower</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Säbelzahntigerauge</ing:name><ing:alias>Eye of Sabre Cat</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Säbelzahntigerreißzahn</ing:name><ing:alias>Sabre Cat Tooth</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Salz</ing:name><ing:alias>Salt Pile</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Salze der Leere</ing:name><ing:alias>Void Salts</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Schimmerpilz</ing:name><ing:alias>Glowing Mushroom</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Schlachterfischei</ing:name><ing:alias>Slaughterfish Egg</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Schlachterfischschuppen</ing:name><ing:alias>Slaughterfish Scales</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Schlammkrabben Chitin</ing:name><ing:alias>Mudcrab Chitin</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Schmetterlingsflügel</ing:name><ing:alias>Butterfly Wing</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Schneebeeren</ing:name><ing:alias>Snowberries</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Schuppenschwamm</ing:name><ing:alias>Scaly Pholiota</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Silberbarsch</ing:name><ing:alias>Silverside Perch</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Skeeverschwanz</ing:name><ing:alias>Skeever Tail</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Spinnenei</ing:name><ing:alias>Spider Egg</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Steinhuscherei</ing:name><ing:alias>Rock Warbler Egg</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Sumpfpilzschote</ing:name><ing:alias>Swamp Fungal Pod</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Todesglockenblume</ing:name><ing:alias>Deathbell</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Tollkirsche</ing:name><ing:alias>Nightshade</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Trollfett</ing:name><ing:alias>Troll Fat</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Tundrabaumwolle</ing:name><ing:alias>Tundra Cotton</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Vampirstaub</ing:name><ing:alias>Vampire Dust</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Verkohltes Skeeverfell</ing:name><ing:alias>Charred Skeever Hide</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Violette Bergblume</ing:name><ing:alias>Purple Mountain Flower</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Wacholderbeeren</ing:name><ing:alias>Juniper Berries</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Weißkappe</ing:name><ing:alias>White Cap</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Weizen</ing:name><ing:alias>Wheat</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Zweiglingsaft</ing:name><ing:alias>Spriggan Sap</ing:alias></ing:ingredient>
        <ing:ingredient><ing:name>Zwergenöl</ing:name><ing:alias>Dwarven Oil</ing:alias></ing:ingredient>
    </ing:ingredients>
</xsl:stylesheet>