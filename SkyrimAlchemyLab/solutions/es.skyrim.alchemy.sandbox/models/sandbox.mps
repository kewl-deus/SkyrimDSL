<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:c549184a-a027-4655-91ab-f158ddf833fd(es.skyrim.alchemy.sandbox.sandbox)">
  <persistence version="7" />
  <language namespace="c983b263-4a3e-46fb-be9c-dc95b4d6bba6(es.skyrim.alchemy)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="g0a9" modelUID="r:1f0f3801-823c-4c91-a527-689053c9a671(es.skyrim.alchemy.structure)" version="-1" implicit="yes" />
  <roots>
    <node type="g0a9.AlchemyLab" typeId="g0a9.7730761602172222426" id="7730761602172243044">
      <property name="name" nameId="tpck.1169194664001" value="MyFirstLab" />
    </node>
    <node type="g0a9.AlchemyLab" typeId="g0a9.7730761602172222426" id="6612588870387972498">
      <property name="name" nameId="tpck.1169194664001" value="MySecondLab" />
    </node>
    <node type="g0a9.AlchemyLab" typeId="g0a9.7730761602172222426" id="6612588870388022707">
      <property name="name" nameId="tpck.1169194664001" value="ThirdLab" />
    </node>
  </roots>
  <root id="7730761602172243044">
    <node role="effects" roleId="g0a9.7730761602172222427" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="7730761602172249803">
      <property name="name" nameId="tpck.1169194664001" value="Anfälligkeit für Feuer" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effects" roleId="g0a9.7730761602172222427" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="7730761602172249805">
      <property name="name" nameId="tpck.1169194664001" value="Anfälligkeit für Gift" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effects" roleId="g0a9.7730761602172222427" type="g0a9.EffectAlias" typeId="g0a9.296901729014143358" id="6612588870387972496">
      <property name="name" nameId="tpck.1169194664001" value="Weakness to Fire" />
      <link role="effect" roleId="g0a9.296901729014143404" targetNodeId="7730761602172249803" resolveInfo="Anfälligkeit für Feuer" />
    </node>
    <node role="ingredients" roleId="g0a9.6612588870387982835" type="g0a9.Ingredient" typeId="g0a9.6612588870387972505" id="6612588870388011020">
      <property name="source" nameId="g0a9.6612588870387972512" value="Flüsse" />
      <property name="name" nameId="tpck.1169194664001" value="testzutat" />
      <property name="price" nameId="g0a9.6612588870387972509" value="20" />
      <property name="weight" nameId="g0a9.6612588870387972511" value="0.5" />
      <node role="effects" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="6612588870388011022">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="7730761602172249803" resolveInfo="Anfälligkeit für Feuer" />
      </node>
      <node role="effects" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="6612588870388011023">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="6612588870387972504" resolveInfo="An alias for an alias for Fireweakness" />
      </node>
      <node role="effects" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="6612588870388011024">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="6612588870387972496" resolveInfo="Weakness to Fire" />
      </node>
    </node>
    <node role="ingredients" roleId="g0a9.6612588870387982835" type="g0a9.Ingredient" typeId="g0a9.6612588870387972505" id="6612588870388119471">
      <property name="name" nameId="tpck.1169194664001" value="noch eine zutat" />
      <property name="price" nameId="g0a9.6612588870387972509" value="20" />
      <property name="weight" nameId="g0a9.6612588870387972511" value="0.2" />
      <property name="source" nameId="g0a9.6612588870387972512" value="irgendwo her" />
      <node role="effects" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="6612588870388119472">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="7730761602172249805" resolveInfo="Anfälligkeit für Gift" />
      </node>
    </node>
    <node role="ingredients" roleId="g0a9.6612588870387982835" type="g0a9.Ingredient" typeId="g0a9.6612588870387972505" id="6612588870388119477">
      <property name="name" nameId="tpck.1169194664001" value="chemikalie X" />
      <property name="price" nameId="g0a9.6612588870387972509" value="30" />
      <property name="weight" nameId="g0a9.6612588870387972511" value="0.3" />
      <property name="source" nameId="g0a9.6612588870387972512" value="unbekannt" />
      <node role="effects" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="6612588870388119478">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="7730761602172249803" resolveInfo="Anfälligkeit für Feuer" />
      </node>
    </node>
  </root>
  <root id="6612588870387972498">
    <node role="effects" roleId="g0a9.7730761602172222427" type="g0a9.EffectAlias" typeId="g0a9.296901729014143358" id="6612588870387972504">
      <property name="name" nameId="tpck.1169194664001" value="An alias for an alias for Fireweakness" />
      <link role="effect" roleId="g0a9.296901729014143404" targetNodeId="6612588870387972496" resolveInfo="Weakness to Fire" />
    </node>
  </root>
  <root id="6612588870388022707">
    <node role="mixtures" roleId="g0a9.6612588870388087910" type="g0a9.Mixture" typeId="g0a9.6612588870388073287" id="6612588870388111499">
      <property name="name" nameId="tpck.1169194664001" value="Mein Trank" />
      <node role="effects" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="6612588870388111500">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="7730761602172249803" resolveInfo="Anfälligkeit für Feuer" />
      </node>
      <node role="effects" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="6612588870388119468">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="7730761602172249805" resolveInfo="Anfälligkeit für Gift" />
      </node>
      <node role="recipe" roleId="g0a9.6612588870388080426" type="g0a9.Recipe" typeId="g0a9.6612588870388079545" id="6612588870388119479">
        <node role="ingredients" roleId="g0a9.6612588870388080416" type="g0a9.IngredientReference" typeId="g0a9.6612588870388073292" id="6612588870388119481">
          <link role="ingredient" roleId="g0a9.6612588870388073293" targetNodeId="6612588870388011020" resolveInfo="testzutat" />
        </node>
      </node>
    </node>
  </root>
</model>

