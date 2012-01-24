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
      <property name="name" nameId="tpck.1169194664001" value="English aliases for effects" />
    </node>
  </roots>
  <root id="1207545486242716656">
    <node role="ingredient" roleId="g0a9.1207545486242546030" type="g0a9.Ingredient" typeId="g0a9.6612588870387972505" id="1207545486242716657">
      <property name="name" nameId="tpck.1169194664001" value="TestIngredient" />
      <property name="price" nameId="g0a9.6612588870387972509" value="10" />
      <property name="weight" nameId="g0a9.6612588870387972511" value="0.5" />
      <property name="source" nameId="g0a9.6612588870387972512" value="unknown" />
      <node role="effect" roleId="g0a9.6612588870387972515" type="g0a9.EffectReference" typeId="g0a9.6612588870387988288" id="1207545486242716658">
        <link role="effect" roleId="g0a9.6612588870387988289" targetNodeId="1207545486242716661" resolveInfo="TestEffect" />
      </node>
    </node>
  </root>
  <root id="1207545486242716659">
    <node role="effect" roleId="g0a9.1207545486242556213" type="g0a9.Effect" typeId="g0a9.296901729014133200" id="1207545486242716661">
      <property name="name" nameId="tpck.1169194664001" value="TestEffect" />
    </node>
  </root>
  <root id="1207545486242716662" />
</model>

