<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1f0f3801-823c-4c91-a527-689053c9a671(es.skyrim.alchemy.structure)">
  <persistence version="7" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <language namespace="c983b263-4a3e-46fb-be9c-dc95b4d6bba6(es.skyrim.alchemy)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="g0a9" modelUID="r:1f0f3801-823c-4c91-a527-689053c9a671(es.skyrim.alchemy.structure)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <roots>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="296901729014133200">
      <property name="name" nameId="tpck.1169194664001" value="Effect" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/flash.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="296901729014143358">
      <property name="name" nameId="tpck.1169194664001" value="EffectAlias" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/flash.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.InterfaceConceptDeclaration" typeId="tpce.1169125989551" id="296901729014143406">
      <property name="name" nameId="tpck.1169194664001" value="IEffect" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="7730761602172222426">
      <property name="name" nameId="tpck.1169194664001" value="MixtureList" />
      <property name="rootable" nameId="tpce.1096454100552" value="true" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/scroll.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="7730761602172222430">
      <property name="name" nameId="tpck.1169194664001" value="EffectNature" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <property name="memberIdentifierPolicy" nameId="tpce.1197591154882" value="custom" />
      <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
      <link role="defaultMember" roleId="tpce.1083241965437" targetNodeId="7730761602172222431" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="6612588870387972505">
      <property name="name" nameId="tpck.1169194664001" value="Ingredient" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/flower_blue.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConstrainedDataTypeDeclaration" typeId="tpce.1082978499127" id="6612588870387972510">
      <property name="name" nameId="tpck.1169194664001" value="number" />
      <property name="constraint" nameId="tpce.1083066089218" value="[0-9]+(\\.[0-9]+)?" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="6612588870387988288">
      <property name="name" nameId="tpck.1169194664001" value="EffectReference" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/flash.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="6612588870388073287">
      <property name="name" nameId="tpck.1169194664001" value="Mixture" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/potion_blue.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="6612588870388073292">
      <property name="name" nameId="tpck.1169194664001" value="IngredientReference" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/flower_blue.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="6612588870388079545">
      <property name="name" nameId="tpck.1169194664001" value="IngredientList" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/note.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1207545486242546028">
      <property name="name" nameId="tpck.1169194664001" value="Satchel" />
      <property name="rootable" nameId="tpce.1096454100552" value="true" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/wallet_closed.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.InterfaceConceptDeclaration" typeId="tpce.1169125989551" id="1207545486242556190">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <property name="name" nameId="tpck.1169194664001" value="IIngredient" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1207545486242556193">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <property name="name" nameId="tpck.1169194664001" value="IngredientAlias" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/flower_blue.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1207545486242556212">
      <property name="name" nameId="tpck.1169194664001" value="EffectTome" />
      <property name="rootable" nameId="tpce.1096454100552" value="true" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/book_yellow.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1207545486242702954">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <property name="name" nameId="tpck.1169194664001" value="Potion" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/potion_red.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="6612588870388073287" resolveInfo="Mixture" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1207545486242702955">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <property name="name" nameId="tpck.1169194664001" value="Poison" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/potion_green.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="6612588870388073287" resolveInfo="Mixture" />
    </node>
    <node type="tpce.InterfaceConceptDeclaration" typeId="tpce.1169125989551" id="7344367026218133618">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <property name="name" nameId="tpck.1169194664001" value="IMixture" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4521199767040192981">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <property name="name" nameId="tpck.1169194664001" value="SatchelImport" />
      <property name="iconPath" nameId="tpce.1160488491229" value="U:/coding/SkyrimDSL/icons/16x16/wallet_open.png" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4521199767040192994">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <property name="name" nameId="tpck.1169194664001" value="EffectTomeImport" />
      <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    </node>
    <node type="tpce.InterfaceConceptDeclaration" typeId="tpce.1169125989551" id="2039275433489786448">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <property name="name" nameId="tpck.1169194664001" value="IEffectSource" />
    </node>
  </roots>
  <root id="296901729014133200">
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="296901729014143410">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="296901729014143406" resolveInfo="IEffect" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="296901729014143389">
      <property name="name" nameId="tpck.1169194664001" value="nature" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="7730761602172222430" resolveInfo="EffectNature" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="296901729014143414">
      <property name="name" nameId="tpck.1169194664001" value="description" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388073277">
      <property name="value" nameId="tpce.1105725733873" value="effect" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388073280">
      <property name="value" nameId="tpce.1105725733873" value="magical effect" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="296901729014143358">
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="296901729014143411">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="296901729014143406" resolveInfo="IEffect" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="296901729014143404">
      <property name="metaClass" nameId="tpce.1071599937831" value="reference" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <property name="role" nameId="tpce.1071599776563" value="effect" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="296901729014133200" resolveInfo="Effect" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388073281">
      <property name="value" nameId="tpce.1105725733873" value="alias" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388073283">
      <property name="value" nameId="tpce.1105725733873" value="alternative name for an effect" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="296901729014143406">
    <node role="extends" roleId="tpce.1169127546356" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="296901729014143409">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="7730761602172222426">
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702911">
      <property name="value" nameId="tpce.1105725733873" value="RecipeScroll" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702913">
      <property name="value" nameId="tpce.1105725733873" value="list of recipes for mixtures" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4521199767040213534">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="usedSatchel" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="4521199767040192981" resolveInfo="SatchelImport" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="6612588870388087910">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="potion" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="7344367026218133618" resolveInfo="IMixture" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="7730761602172245675">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1233160296597" resolveInfo="IContainer" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="7730761602172245677">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="7730761602172222430">
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="7730761602172222431">
      <property name="externalValue" nameId="tpce.1083923523172" value="+" />
      <property name="internalValue" nameId="tpce.1083923523171" value="F" />
      <property name="javaIdentifier" nameId="tpce.1192116978809" value="FORTIFY" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="7730761602172222432">
      <property name="externalValue" nameId="tpce.1083923523172" value="-" />
      <property name="internalValue" nameId="tpce.1083923523171" value="W" />
      <property name="javaIdentifier" nameId="tpce.1192116978809" value="WEAKEN" />
    </node>
  </root>
  <root id="6612588870387972505">
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="6612588870387972509">
      <property name="name" nameId="tpck.1169194664001" value="price" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="6612588870387972511">
      <property name="name" nameId="tpck.1169194664001" value="weight" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="6612588870387972510" resolveInfo="number" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="6612588870387972512">
      <property name="name" nameId="tpck.1169194664001" value="source" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388073284">
      <property name="value" nameId="tpce.1105725733873" value="ingredient" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388073286">
      <property name="value" nameId="tpce.1105725733873" value="ingredient for brewing a potion" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1207545486242556192">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="1207545486242556190" resolveInfo="IIngredient" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="2039275433489786451">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="2039275433489786448" resolveInfo="IEffectSource" />
    </node>
  </root>
  <root id="6612588870387972510" />
  <root id="6612588870387988288">
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="6612588870387988289">
      <property name="metaClass" nameId="tpce.1071599937831" value="reference" />
      <property name="role" nameId="tpce.1071599776563" value="effect" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="296901729014143406" resolveInfo="IEffect" />
    </node>
  </root>
  <root id="6612588870388073287">
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="6612588870388123806">
      <property name="name" nameId="tpck.1169194664001" value="price" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="6612588870388080426">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="recipe" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="6612588870388079545" resolveInfo="IngredientList" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="7344367026218133620">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="7344367026218133618" resolveInfo="IMixture" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388087920">
      <property name="value" nameId="tpce.1105725733873" value="concoction" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388087918">
      <property name="value" nameId="tpce.1105725733873" value="mixed ingredients" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="6612588870388073292">
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="6612588870388073293">
      <property name="metaClass" nameId="tpce.1071599937831" value="reference" />
      <property name="role" nameId="tpce.1071599776563" value="ingredient" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1207545486242556190" resolveInfo="IIngredient" />
    </node>
  </root>
  <root id="6612588870388079545">
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="6612588870388080416">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="ingredient" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="6612588870388073292" resolveInfo="IngredientReference" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388087917">
      <property name="value" nameId="tpce.1105725733873" value="ingredient-list" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="6612588870388087915">
      <property name="value" nameId="tpce.1105725733873" value="list of ingredients" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1207545486242546028">
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702898">
      <property name="value" nameId="tpce.1105725733873" value="Satchel" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702900">
      <property name="value" nameId="tpce.1105725733873" value="container for ingredients" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1207545486242546030">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="ingredient" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1207545486242556190" resolveInfo="IIngredient" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1207545486242546032">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1233160296597" resolveInfo="IContainer" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1207545486242546033">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="1207545486242556190">
    <node role="extends" roleId="tpce.1169127546356" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1207545486242556191">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="1207545486242556193">
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702879">
      <property name="value" nameId="tpce.1105725733873" value="alias" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702881">
      <property name="value" nameId="tpce.1105725733873" value="alternative name for an ingredient" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1207545486242556194">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="1207545486242556190" resolveInfo="IIngredient" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="5703238871183979160">
      <property name="metaClass" nameId="tpce.1071599937831" value="reference" />
      <property name="role" nameId="tpce.1071599776563" value="ingredient" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="6612588870387972505" resolveInfo="Ingredient" />
    </node>
  </root>
  <root id="1207545486242556212">
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702904">
      <property name="value" nameId="tpce.1105725733873" value="EffectTome" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="1207545486242702906">
      <property name="value" nameId="tpce.1105725733873" value="tome of effects" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1207545486242556213">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <property name="role" nameId="tpce.1071599776563" value="effect" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="296901729014143406" resolveInfo="IEffect" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1207545486242556216">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1233160296597" resolveInfo="IContainer" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1207545486242556217">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="1207545486242702954">
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="7344367026218301881">
      <property name="value" nameId="tpce.1105725733873" value="potion" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="7344367026218301883">
      <property name="value" nameId="tpce.1105725733873" value="magic potion" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1207545486242702955">
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="7344367026218301877">
      <property name="value" nameId="tpce.1105725733873" value="poison" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="tpce.1105725339613" type="tpce.StringConceptProperty" typeId="tpce.1105725638761" id="7344367026218301879">
      <property name="value" nameId="tpce.1105725733873" value="toxic mixture" />
      <link role="conceptPropertyDeclaration" roleId="tpce.1105725439818" targetNodeId="tpck.1137473914776" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="7344367026218133618">
    <node role="extends" roleId="tpce.1169127546356" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="7344367026218133619">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
    <node role="extends" roleId="tpce.1169127546356" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="2039275433489786453">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="2039275433489786448" resolveInfo="IEffectSource" />
    </node>
  </root>
  <root id="4521199767040192981">
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4521199767040192982">
      <property name="metaClass" nameId="tpce.1071599937831" value="reference" />
      <property name="role" nameId="tpce.1071599776563" value="satchel" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1207545486242546028" resolveInfo="Satchel" />
    </node>
  </root>
  <root id="4521199767040192994">
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4521199767040192995">
      <property name="metaClass" nameId="tpce.1071599937831" value="reference" />
      <property name="role" nameId="tpce.1071599776563" value="tome" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1207545486242556212" resolveInfo="EffectTome" />
    </node>
  </root>
  <root id="2039275433489786448">
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="2039275433489786449">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <property name="role" nameId="tpce.1071599776563" value="effect" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="6612588870387988288" resolveInfo="EffectReference" />
    </node>
  </root>
</model>

