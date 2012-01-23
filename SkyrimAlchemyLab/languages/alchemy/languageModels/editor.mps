<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:0c3bb6eb-2efe-41da-b18b-365bc5e8360a(es.skyrim.alchemy.editor)">
  <persistence version="7" />
  <language namespace="18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)" />
  <language namespace="c983b263-4a3e-46fb-be9c-dc95b4d6bba6(es.skyrim.alchemy)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="g0a9" modelUID="r:1f0f3801-823c-4c91-a527-689053c9a671(es.skyrim.alchemy.structure)" version="-1" />
  <import index="tpc2" modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <roots>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="296901729014143360">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.296901729014133200" resolveInfo="Effect" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="296901729014143393">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.296901729014143358" resolveInfo="EffectAlias" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="7730761602172222428">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.7730761602172222426" resolveInfo="AlchemyLab" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870387972517">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870387972505" resolveInfo="Ingredient" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870387988290">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870387988288" resolveInfo="EffectReference" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870388080417">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870388079545" resolveInfo="Recipe" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870388080427">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870388073287" resolveInfo="Mixture" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870388098424">
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870388073292" resolveInfo="IngredientReference" />
    </node>
  </roots>
  <root id="296901729014143360">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="296901729014143376">
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="296901729014143377" />
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143379">
        <property name="text" nameId="tpc2.1073389577007" value="effect" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="296901729014143385">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143387">
        <property name="text" nameId="tpc2.1073389577007" value="(" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="296901729014143392">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.296901729014143389" resolveInfo="nature" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143391">
        <property name="text" nameId="tpc2.1073389577007" value=")" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="7730761602172222434">
        <property name="text" nameId="tpc2.1073389577007" value=":" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="7730761602172222436">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.296901729014143414" resolveInfo="description" />
      </node>
    </node>
  </root>
  <root id="296901729014143393">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="296901729014143395">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143398">
        <property name="text" nameId="tpc2.1073389577007" value="alias" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="296901729014143400">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143402">
        <property name="text" nameId="tpc2.1073389577007" value="for" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefCell" typeId="tpc2.1088013125922" id="6612588870387815778">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.296901729014143404" />
        <node role="editorComponent" roleId="tpc2.1088186146602" type="tpc2.InlineEditorComponent" typeId="tpc2.1088185857835" id="6612588870387815779">
          <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_ReferencePresentation" typeId="tpc2.625126330682908270" id="6612588870387815781" />
        </node>
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="296901729014143397" />
    </node>
  </root>
  <root id="7730761602172222428">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Block" typeId="tpc2.1198489924438" id="7730761602172222440">
      <node role="header" roleId="tpc2.1198489985045" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="7730761602172245669">
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="7730761602172245673">
          <property name="text" nameId="tpc2.1073389577007" value="AlchemyLab" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="7730761602172245678">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="7730761602172245670" />
      </node>
      <node role="body" roleId="tpc2.1198489993734" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387982836">
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870387982842">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.7730761602172222427" />
          <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870387982843" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870387982844">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870387982835" />
          <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870387982845" />
        </node>
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870387982837" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870388087912">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388087910" />
          <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870388087913" />
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870388087914">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="6612588870387972517">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Block" typeId="tpc2.1198489924438" id="6612588870387972519">
      <node role="header" roleId="tpc2.1198489985045" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387972521">
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870387972522" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387972523">
          <property name="text" nameId="tpc2.1073389577007" value="ingredient" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870387972525">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
      </node>
      <node role="body" roleId="tpc2.1198489993734" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387972528">
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387972550">
          <property name="text" nameId="tpc2.1073389577007" value="effects:" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870387988304">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870387972515" />
          <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870387988305" />
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870387988306">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387972573">
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870387972574">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387972577">
            <property name="text" nameId="tpc2.1073389577007" value="price:" />
          </node>
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870387972579">
            <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870387972509" resolveInfo="price" />
          </node>
          <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870387972576" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387972580">
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870387972581">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387972588">
            <property name="text" nameId="tpc2.1073389577007" value="weight:" />
          </node>
          <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870387972583" />
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870387972591">
            <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870387972511" resolveInfo="weight" />
          </node>
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387972584">
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870387972585">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387972589">
            <property name="text" nameId="tpc2.1073389577007" value="source:" />
          </node>
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870387972593">
            <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870387972512" resolveInfo="source" />
          </node>
          <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870387972587" />
        </node>
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870387972529" />
      </node>
    </node>
  </root>
  <root id="6612588870387988290">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387988292">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387988296">
        <property name="text" nameId="tpc2.1073389577007" value="=&gt;" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefCell" typeId="tpc2.1088013125922" id="6612588870387988297">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870387988289" />
        <node role="editorComponent" roleId="tpc2.1088186146602" type="tpc2.InlineEditorComponent" typeId="tpc2.1088185857835" id="6612588870387988298">
          <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_ReferencePresentation" typeId="tpc2.625126330682908270" id="6612588870387988303" />
        </node>
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870387988294" />
    </node>
  </root>
  <root id="6612588870388080417">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870388080422">
      <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388080416" />
      <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Horizontal" typeId="tpc2.1106270549637" id="6612588870388080423" />
      <node role="emptyCellModel" roleId="tpc2.1140524464359" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870388080425">
        <property name="text" nameId="tpc2.1073389577007" value="+" />
      </node>
    </node>
  </root>
  <root id="6612588870388080427">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870388080467">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870388080472">
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870388080473">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870388080476">
          <property name="text" nameId="tpc2.1073389577007" value="mixture" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870388080478">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_BlockStart" typeId="tpc2.1198257632966" id="6612588870388080481" />
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870388080475" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870388080495">
        <property name="text" nameId="tpc2.1073389577007" value="effects:" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870388080496">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388073290" />
        <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870388080497" />
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870388080498">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870388080483">
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870388080484">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_BlockEnd" typeId="tpc2.1198257747917" id="6612588870388080488" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870388080489">
          <property name="text" nameId="tpc2.1073389577007" value="=" />
        </node>
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870388080486" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNode" typeId="tpc2.1073389882823" id="6612588870388080502">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388080426" />
        </node>
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870388080468" />
    </node>
  </root>
  <root id="6612588870388098424">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_RefCell" typeId="tpc2.1088013125922" id="6612588870388098426">
      <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388073293" />
      <node role="editorComponent" roleId="tpc2.1088186146602" type="tpc2.InlineEditorComponent" typeId="tpc2.1088185857835" id="6612588870388098427">
        <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_ReferencePresentation" typeId="tpc2.625126330682908270" id="6612588870388098429" />
      </node>
    </node>
  </root>
</model>

