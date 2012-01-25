<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:c549184a-a027-4655-91ab-f158ddf833fd(es.skyrim.alchemy.sandbox.sandbox)">
  <persistence version="7" />
  <language namespace="c983b263-4a3e-46fb-be9c-dc95b4d6bba6(es.skyrim.alchemy)" />
  <import index="g0a9" modelUID="r:1f0f3801-823c-4c91-a527-689053c9a671(es.skyrim.alchemy.structure)" version="-1" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <roots>
    <node type="g0a9.Satchel" typeId="g0a9.1207545486242546028" id="1207545486242716656">
      <property name="name" nameId="tpck.1169194664001" value="Skyrim's natural resources" />
    </node>
    <node type="g0a9.EffectTome" typeId="g0a9.1207545486242556212" id="1207545486242716659">
      <property name="name" nameId="tpck.1169194664001" value="All known effects" />
    </node>
    <node type="g0a9.EffectTome" typeId="g0a9.1207545486242556212" id="1207545486242716662">
      <property name="name" nameId="tpck.1169194664001" value="English effect aliases" />
    </node>
    <node type="g0a9.MixtureList" typeId="g0a9.7730761602172222426" id="5703238871183979135">
      <property name="name" nameId="tpck.1169194664001" value="Useful Potions" />
    </node>
    <node type="g0a9.Satchel" typeId="g0a9.1207545486242546028" id="3233403453751488518">
      <property name="name" nameId="tpck.1169194664001" value="English ingredient aliases" />
    </node>
  </roots>
  <root id="1207545486242716656">
    <node role="ingredient" roleId="g0a9.1207545486242546030" type="g0a9.Ingredient" typeId="g0a9.6612588870387972505" id="1207545486242716657">
      <property name="name" nameId="tpck.1169194664001" value="TestIngredient" />
      <property name="price" nameId="g0a9.6612588870387972509" value="10" />
      <property name="weight" nameId="g0a9.6612588870387972511" value="0.5" />
      <property name="source" nameId="g0a9.6612588870387972512" value="unknown" />
      <node role="effect" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="1207545486242716658">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242710000" resolveInfo="Anfälligkeit für Blitz" />
      </node>
      <node role="effect" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="3233403453751488520">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242720000" resolveInfo="Anfälligkeit für Feuer" />
      </node>
      <node role="effect" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="3233403453751488521">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242730000" resolveInfo="Anfälligkeit für Frost" />
      </node>
      <node role="effect" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="3233403453751488522">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242740000" resolveInfo="Anfälligkeit für Gift" />
      </node>
    </node>
    <node role="ingredient" roleId="g0a9.1207545486242546030" type="g0a9.Ingredient" typeId="g0a9.6612588870387972505" id="5703238871183979144">
      <property name="name" nameId="tpck.1169194664001" value="Another Ingredient" />
      <property name="price" nameId="g0a9.6612588870387972509" value="100" />
      <property name="source" nameId="g0a9.6612588870387972512" value="unknown" />
      <property name="weight" nameId="g0a9.6612588870387972511" value="0.2" />
      <node role="effect" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="5703238871183979145">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242760000" resolveInfo="Ausdauer regenerieren" />
      </node>
    </node>
  </root>
  <root id="1207545486242716659">
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242710000">
      <property name="name" nameId="tpck.1169194664001" value="Anfälligkeit für Blitz" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242720000">
      <property name="name" nameId="tpck.1169194664001" value="Anfälligkeit für Feuer" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242730000">
      <property name="name" nameId="tpck.1169194664001" value="Anfälligkeit für Frost" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242740000">
      <property name="name" nameId="tpck.1169194664001" value="Anfälligkeit für Gift" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242750000">
      <property name="name" nameId="tpck.1169194664001" value="Anfälligkeit für Magie" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242760000">
      <property name="name" nameId="tpck.1169194664001" value="Ausdauer regenerieren" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242770000">
      <property name="name" nameId="tpck.1169194664001" value="Ausdauer senken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242780000">
      <property name="name" nameId="tpck.1169194664001" value="Ausdauer verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242790000">
      <property name="name" nameId="tpck.1169194664001" value="Ausdauer wiederherstellen" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242800000">
      <property name="name" nameId="tpck.1169194664001" value="Ausdauerregeneration senken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242810000">
      <property name="name" nameId="tpck.1169194664001" value="Beschwörung verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242820000">
      <property name="name" nameId="tpck.1169194664001" value="Blitzresistenz" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242830000">
      <property name="name" nameId="tpck.1169194664001" value="Blocken verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242840000">
      <property name="name" nameId="tpck.1169194664001" value="Dauerhafter Ausdauerschaden" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242850000">
      <property name="name" nameId="tpck.1169194664001" value="Dauerhafter Magickaschaden" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242860000">
      <property name="name" nameId="tpck.1169194664001" value="Einhändig verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242870000">
      <property name="name" nameId="tpck.1169194664001" value="Erzürnen" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242880000">
      <property name="name" nameId="tpck.1169194664001" value="Feuerresistenz" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242890000">
      <property name="name" nameId="tpck.1169194664001" value="Frostresistenz" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242900000">
      <property name="name" nameId="tpck.1169194664001" value="Furcht" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242910000">
      <property name="name" nameId="tpck.1169194664001" value="Gesundheit regenerieren" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242920000">
      <property name="name" nameId="tpck.1169194664001" value="Gesundheit senken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242930000">
      <property name="name" nameId="tpck.1169194664001" value="Gesundheit verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242940000">
      <property name="name" nameId="tpck.1169194664001" value="Gesundheit wiederherstellen" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242950000">
      <property name="name" nameId="tpck.1169194664001" value="Giftresistenz" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242960000">
      <property name="name" nameId="tpck.1169194664001" value="Illusion verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242970000">
      <property name="name" nameId="tpck.1169194664001" value="Krankheit heilen" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242980000">
      <property name="name" nameId="tpck.1169194664001" value="Lähmen" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486242990000">
      <property name="name" nameId="tpck.1169194664001" value="Leichte Rüstung verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243000000">
      <property name="name" nameId="tpck.1169194664001" value="Magicka regenerieren" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243010000">
      <property name="name" nameId="tpck.1169194664001" value="Magicka senken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243020000">
      <property name="name" nameId="tpck.1169194664001" value="Magicka verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243030000">
      <property name="name" nameId="tpck.1169194664001" value="Magicka wiederherstellen" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243040000">
      <property name="name" nameId="tpck.1169194664001" value="Magickaregeneration senken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243050000">
      <property name="name" nameId="tpck.1169194664001" value="Magieresistenz" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243060000">
      <property name="name" nameId="tpck.1169194664001" value="Raserei" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243070000">
      <property name="name" nameId="tpck.1169194664001" value="Redekunst verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243080000">
      <property name="name" nameId="tpck.1169194664001" value="Schleichen verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243090000">
      <property name="name" nameId="tpck.1169194664001" value="Schloßknacken verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243100000">
      <property name="name" nameId="tpck.1169194664001" value="Schmiedekunst verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243110000">
      <property name="name" nameId="tpck.1169194664001" value="Schwere Rüstung verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243120000">
      <property name="name" nameId="tpck.1169194664001" value="Taschendiebstahl verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243130000">
      <property name="name" nameId="tpck.1169194664001" value="Tragfähigkeit verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243140000">
      <property name="name" nameId="tpck.1169194664001" value="Unsichtbarkeit" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243150000">
      <property name="name" nameId="tpck.1169194664001" value="Veränderung verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243160000">
      <property name="name" nameId="tpck.1169194664001" value="Verlangsamen" />
      <property name="nature" nameId="g0a9.296901729014143389" value="W" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243170000">
      <property name="name" nameId="tpck.1169194664001" value="Verzaubern verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243180000">
      <property name="name" nameId="tpck.1169194664001" value="Wasseratmung" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243190000">
      <property name="name" nameId="tpck.1169194664001" value="Wiederherstellung verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243200000">
      <property name="name" nameId="tpck.1169194664001" value="Zerstörung verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243210000">
      <property name="name" nameId="tpck.1169194664001" value="Zielkunst verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1307545486243220000">
      <property name="name" nameId="tpck.1169194664001" value="Zweihändig verstärken" />
      <property name="nature" nameId="g0a9.296901729014143389" value="F" />
    </node>
  </root>
  <root id="1207545486242716662">
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.EffectAlias" typeId="g0a9.296901729014143358" id="5703238871183979148">
      <property name="name" nameId="tpck.1169194664001" value="English name for an effect" />
      <link role="effect" roleId="g0a9.296901729014143404" targetNodeId="1307545486242710000" resolveInfo="Anfälligkeit für Blitz" />
    </node>
  </root>
  <root id="5703238871183979135">
    <node role="mixture" roleId="g0a9.6612588870388087910" type="g0a9.Mixture" typeId="g0a9.6612588870388073287" id="3233403453751768775">
      <property name="name" nameId="tpck.1169194664001" value="testmix" />
      <property name="price" nameId="g0a9.6612588870388123806" value="440" />
      <node role="effect" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="3233403453751768776">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242860000" resolveInfo="Einhändig verstärken" />
      </node>
      <node role="recipe" roleId="g0a9.6612588870388080426" type="g0a9.Recipe" typeId="g0a9.3233403453751666098" id="7344367026218335185">
        <node role="head" roleId="g0a9.7344367026218301892" type="g0a9.IngredientReference" typeId="g0a9.6612588870388073292" id="7344367026218335188">
          <link role="ingredient" roleId="g0a9.6612588870388073293" targetNodeId="5703238871183979144" resolveInfo="Another Ingredient" />
        </node>
        <node role="tail" roleId="g0a9.7344367026218301894" type="g0a9.IngredientReference" typeId="g0a9.6612588870388073292" id="7344367026218335189">
          <link role="ingredient" roleId="g0a9.6612588870388073293" targetNodeId="3233403453751488519" resolveInfo="English ingredient name" />
        </node>
      </node>
    </node>
    <node role="mixture" roleId="g0a9.6612588870388087910" type="g0a9.Potion" typeId="g0a9.1207545486242702954" id="5703238871183979136">
      <property name="name" nameId="tpck.1169194664001" value="Test Potion" />
      <property name="price" nameId="g0a9.6612588870388123806" value="100" />
      <node role="effect" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="5703238871183979137">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242710000" resolveInfo="Anfälligkeit für Blitz" />
      </node>
      <node role="effect" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="5703238871183992800">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242720000" resolveInfo="Anfälligkeit für Feuer" />
      </node>
      <node role="effect" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="5703238871183992801">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242730000" resolveInfo="Anfälligkeit für Frost" />
      </node>
      <node role="effect" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="5703238871183992802">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242740000" resolveInfo="Anfälligkeit für Gift" />
      </node>
      <node role="recipe" roleId="g0a9.6612588870388080426" type="g0a9.Recipe" typeId="g0a9.3233403453751666098" id="7344367026218335179">
        <node role="head" roleId="g0a9.7344367026218301892" type="g0a9.IngredientReference" typeId="g0a9.6612588870388073292" id="7344367026218335182">
          <link role="ingredient" roleId="g0a9.6612588870388073293" targetNodeId="1207545486242716657" resolveInfo="TestIngredient" />
        </node>
        <node role="tail" roleId="g0a9.7344367026218301894" type="g0a9.IngredientReference" typeId="g0a9.6612588870388073292" id="7344367026218335183">
          <link role="ingredient" roleId="g0a9.6612588870388073293" targetNodeId="3233403453751488519" resolveInfo="English ingredient name" />
        </node>
      </node>
    </node>
    <node role="mixture" roleId="g0a9.6612588870388087910" type="g0a9.Poison" typeId="g0a9.1207545486242702955" id="7344367026218301873">
      <property name="name" nameId="tpck.1169194664001" value="tödliches gift" />
      <property name="price" nameId="g0a9.6612588870388123806" value="400" />
      <node role="effect" roleId="g0a9.6612588870388073290" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="7344367026218301874">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1307545486242840000" resolveInfo="Dauerhafter Ausdauerschaden" />
      </node>
      <node role="recipe" roleId="g0a9.6612588870388080426" type="g0a9.Recipe" typeId="g0a9.3233403453751666098" id="7344367026218335173">
        <node role="head" roleId="g0a9.7344367026218301892" type="g0a9.IngredientReference" typeId="g0a9.6612588870388073292" id="7344367026218335176">
          <link role="ingredient" roleId="g0a9.6612588870388073293" targetNodeId="5703238871183979144" resolveInfo="Another Ingredient" />
        </node>
        <node role="tail" roleId="g0a9.7344367026218301894" type="g0a9.IngredientReference" typeId="g0a9.6612588870388073292" id="7344367026218335177">
          <link role="ingredient" roleId="g0a9.6612588870388073293" targetNodeId="1207545486242716657" resolveInfo="TestIngredient" />
        </node>
      </node>
    </node>
  </root>
  <root id="3233403453751488518">
    <node role="ingredient" roleId="g0a9.1207545486242546030" type="g0a9.IngredientAlias" typeId="g0a9.1207545486242556193" id="3233403453751488519">
      <property name="name" nameId="tpck.1169194664001" value="English ingredient name" />
      <link role="ingredient" roleId="g0a9.5703238871183979160" targetNodeId="1207545486242716657" resolveInfo="TestIngredient" />
    </node>
  </root>
</model>

