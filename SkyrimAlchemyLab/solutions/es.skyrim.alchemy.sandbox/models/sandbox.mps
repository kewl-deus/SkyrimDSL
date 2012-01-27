<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:c549184a-a027-4655-91ab-f158ddf833fd(es.skyrim.alchemy.sandbox.sandbox)">
  <persistence version="7" />
  <language namespace="c983b263-4a3e-46fb-be9c-dc95b4d6bba6(es.skyrim.alchemy)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="g0a9" modelUID="r:1f0f3801-823c-4c91-a527-689053c9a671(es.skyrim.alchemy.structure)" version="-1" implicit="yes" />
  <roots>
    <node type="g0a9.Satchel" typeId="g0a9.1207545486242546028" id="1820559564970883865">
      <property name="name" nameId="tpck.1169194664001" value="Zutaten" />
    </node>
    <node type="g0a9.Satchel" typeId="g0a9.1207545486242546028" id="1820559564970883866">
      <property name="name" nameId="tpck.1169194664001" value="Zutaten Aliases" />
    </node>
    <node type="g0a9.EffectTome" typeId="g0a9.1207545486242556212" id="1820559564970883867">
      <property name="name" nameId="tpck.1169194664001" value="Effekte" />
    </node>
    <node type="g0a9.EffectTome" typeId="g0a9.1207545486242556212" id="1820559564970883868">
      <property name="name" nameId="tpck.1169194664001" value="Effekte Aliases" />
    </node>
  </roots>
  <root id="1820559564970883865">
    <node role="ingredient" roleId="g0a9.1207545486242546030" type="g0a9.Ingredient" typeId="g0a9.6612588870387972505" id="1820559564970883878">
      <property name="name" nameId="tpck.1169194664001" value="Geheime Zutat" />
      <property name="price" nameId="g0a9.6612588870387972509" value="10" />
      <property name="weight" nameId="g0a9.6612588870387972511" value="0.1" />
      <node role="effect" roleId="g0a9.2039275433489786449" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="1820559564970883891">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1820559564970883872" resolveInfo="Positiver Effekt" />
      </node>
    </node>
  </root>
  <root id="1820559564970883866">
    <node role="ingredient" roleId="g0a9.1207545486242546030" type="g0a9.IngredientAlias" typeId="g0a9.1207545486242556193" id="1820559564970883893">
      <property name="name" nameId="tpck.1169194664001" value="Alias(Geheime Zutat)" />
      <link role="ingredient" roleId="g0a9.5703238871183979160" targetNodeId="1820559564970883878" resolveInfo="Geheime Zutat" />
    </node>
  </root>
  <root id="1820559564970883867">
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1820559564970883872">
      <property name="name" nameId="tpck.1169194664001" value="Positiver Effekt" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1820559564970883874">
      <property name="name" nameId="tpck.1169194664001" value="Negativer Effekt" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
  </root>
  <root id="1820559564970883868">
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.EffectAlias" typeId="g0a9.296901729014143358" id="1820559564970883875">
      <property name="name" nameId="tpck.1169194664001" value="Alias(Positiver Effekt)" />
      <link role="effect" roleId="g0a9.296901729014143404" targetNodeId="1820559564970883872" resolveInfo="Positiver Effekt" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.EffectAlias" typeId="g0a9.296901729014143358" id="1820559564970883877">
      <property name="name" nameId="tpck.1169194664001" value="Alias(Negativer Effekt)" />
      <link role="effect" roleId="g0a9.296901729014143404" targetNodeId="1820559564970883874" resolveInfo="Negativer Effekt" />
    </node>
  </root>
</model>

