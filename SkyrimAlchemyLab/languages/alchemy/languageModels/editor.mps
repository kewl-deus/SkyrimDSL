<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:0c3bb6eb-2efe-41da-b18b-365bc5e8360a(es.skyrim.alchemy.editor)">
  <persistence version="7" />
  <language namespace="18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)" />
  <language namespace="c983b263-4a3e-46fb-be9c-dc95b4d6bba6(es.skyrim.alchemy)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="g0a9" modelUID="r:1f0f3801-823c-4c91-a527-689053c9a671(es.skyrim.alchemy.structure)" version="-1" />
  <import index="1t7x" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.awt(JDK/java.awt@java_stub)" version="-1" />
  <import index="tpc2" modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="-1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="8vxu" modelUID="r:a31ef4a8-c0ff-4a6f-90af-9ea7069e0dd2(es.skyrim.alchemy.behavior)" version="-1" implicit="yes" />
  <roots>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="296901729014143360">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.296901729014133200" resolveInfo="Effect" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="296901729014143393">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.296901729014143358" resolveInfo="EffectAlias" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="7730761602172222428">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.7730761602172222426" resolveInfo="RecipeScroll" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870387972517">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870387972505" resolveInfo="Ingredient" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870387988290">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870387988288" resolveInfo="EffectReference" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870388080417">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870388079545" resolveInfo="IngredientList" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870388080427">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870388073287" resolveInfo="Mixture" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="6612588870388098424">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870388073292" resolveInfo="IngredientReference" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="1207545486242702882">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.1207545486242556193" resolveInfo="IngredientAlias" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="1207545486242702901">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.1207545486242546028" resolveInfo="Satchel" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="1207545486242702907">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.1207545486242556212" resolveInfo="EffectTome" />
    </node>
    <node type="tpc2.StyleSheet" typeId="tpc2.1186402211651" id="7344367026218504801">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="" />
      <property name="name" nameId="tpck.1169194664001" value="AlchemyEditorStyles" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="4521199767040192983">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="ingredient" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.4521199767040192981" resolveInfo="SatchelImport" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="4521199767040192996">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="effect" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.4521199767040192994" resolveInfo="EffectTomeImport" />
    </node>
    <node type="tpc2.EditorComponentDeclaration" typeId="tpc2.1078938745671" id="1098823917305199709">
      <property name="name" nameId="tpck.1169194664001" value="MixtureBody" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.6612588870388073287" resolveInfo="Mixture" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="1098823917305199775">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.1207545486242702955" resolveInfo="Poison" />
    </node>
    <node type="tpc2.ConceptEditorDeclaration" typeId="tpc2.1071666914219" id="1098823917305199844">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="mixture" />
      <link role="conceptDeclaration" roleId="tpc2.1166049300910" targetNodeId="g0a9.1207545486242702954" resolveInfo="Potion" />
    </node>
  </roots>
  <root id="296901729014143360">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="296901729014143376">
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="296901729014143377" />
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143379">
        <property name="text" nameId="tpc2.1073389577007" value="effect" />
        <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="296901729014143385">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.ForegroundColorStyleClassItem" typeId="tpc2.1186404549998" id="7344367026218478844">
          <node role="query" roleId="tpc2.1186403803051" type="tpc2.QueryFunction_Color" typeId="tpc2.1176809959526" id="7344367026218478846">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7344367026218478847">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7344367026218491285">
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7344367026218491286">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7344367026218503859">
                    <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1098823917305170586">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1098823917305170588">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1t7x.~Color%d&lt;init&gt;(int)" resolveInfo="Color" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.HexIntegerLiteral" typeId="tpee.1179360813171" id="1098823917305176900">
                          <property name="value" nameId="tpee.1179360856892" value="0039E6" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7344367026218491357">
                  <node role="operand" roleId="tpee.1197027771414" type="tpc2.ConceptFunctionParameter_node" typeId="tpc2.1142886811589" id="7344367026218491293" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="6128846238145421358">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="8vxu.6128846238145199793" resolveInfo="isPositive" />
                  </node>
                </node>
                <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7344367026218504819">
                  <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7344367026218504820">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7344367026218504821">
                      <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1098823917305176902">
                        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1098823917305176904">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1t7x.~Color%d&lt;init&gt;(int)" resolveInfo="Color" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.HexIntegerLiteral" typeId="tpee.1179360813171" id="1098823917305176905">
                            <property name="value" nameId="tpee.1179360856892" value="008020" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
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
        <node role="renderingCondition" roleId="tpc2.1142887637401" type="tpc2.QueryFunction_NodeCondition" typeId="tpc2.1142886221719" id="7344367026218442244">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7344367026218442245">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7344367026218464342">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7344367026218464353">
                <node role="operand" roleId="tpee.1197027771414" type="tpc2.ConceptFunctionParameter_node" typeId="tpc2.1142886811589" id="7344367026218464343" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7344367026218464357">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="8vxu.7344367026218464287" resolveInfo="hasDescription" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="7730761602172222436">
        <property name="allowEmptyText" nameId="tpc2.1140114345053" value="true" />
        <property name="emptyNoTargetText" nameId="tpc2.1214560368769" value="true" />
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.296901729014143414" resolveInfo="description" />
      </node>
    </node>
  </root>
  <root id="296901729014143393">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="296901729014143395">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143398">
        <property name="text" nameId="tpc2.1073389577007" value="alias" />
        <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="296901729014143400">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="296901729014143402">
        <property name="text" nameId="tpc2.1073389577007" value="for" />
        <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
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
          <property name="text" nameId="tpc2.1073389577007" value="RecipeScroll" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="7730761602172245678">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="7730761602172245670" />
      </node>
      <node role="body" roleId="tpc2.1198489993734" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387982836">
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="4521199767040213542">
          <property name="usesFolding" nameId="tpc2.1160590307797" value="true" />
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.4521199767040213534" />
          <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="4521199767040213543" />
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="4521199767040213544">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
          <node role="foldedCellModel" roleId="tpc2.6046489571270834038" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6408533231780961954">
            <property name="text" nameId="tpc2.1073389577007" value="used satchels..." />
            <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
          </node>
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Empty" typeId="tpc2.8313721352726366579" id="4521199767040213541" />
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870387982837" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870388087912">
          <property name="separatorText" nameId="tpc2.1140524450557" value="\n" />
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
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870387972525">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
      </node>
      <node role="body" roleId="tpc2.1198489993734" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387972528">
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387972550">
          <property name="text" nameId="tpc2.1073389577007" value="effects:" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870387988304">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.2039275433489786449" />
          <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="6612588870387988305" />
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870387988306">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Empty" typeId="tpc2.8313721352726366579" id="6612588870388121032" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870387972573">
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870387972574">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="6612588870387972577">
            <property name="text" nameId="tpc2.1073389577007" value="price:" />
            <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
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
            <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
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
            <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
          </node>
          <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870387972593">
            <property name="allowEmptyText" nameId="tpc2.1140114345053" value="true" />
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
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870388172265">
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870388172266" />
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="6612588870388172269">
        <property name="separatorText" nameId="tpc2.1140524450557" value=" +" />
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388080416" />
        <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870388172270" />
      </node>
    </node>
  </root>
  <root id="6612588870388080427">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870388080467">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="6612588870388080472">
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="6612588870388080473">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1098823917305249584">
          <property name="text" nameId="tpc2.1073389577007" value="mixture" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="6612588870388080478">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_BlockStart" typeId="tpc2.1198257632966" id="6612588870388080481" />
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="6612588870388080475" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Component" typeId="tpc2.1078939183254" id="1098823917305284920">
        <link role="editorComponent" roleId="tpc2.1078939183255" targetNodeId="1098823917305199709" resolveInfo="MixtureBody" />
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
  <root id="1207545486242702882">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1207545486242702884">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1207545486242702887">
        <property name="text" nameId="tpc2.1073389577007" value="alias" />
        <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="1207545486242702889">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1207545486242702891">
        <property name="text" nameId="tpc2.1073389577007" value="for" />
        <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1207545486242702886" />
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefCell" typeId="tpc2.1088013125922" id="1207545486242702893">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.5703238871183979160" />
        <node role="editorComponent" roleId="tpc2.1088186146602" type="tpc2.InlineEditorComponent" typeId="tpc2.1088185857835" id="1207545486242702894">
          <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_ReferencePresentation" typeId="tpc2.625126330682908270" id="1207545486242702896" />
        </node>
      </node>
    </node>
  </root>
  <root id="1207545486242702901">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Block" typeId="tpc2.1198489924438" id="1207545486242702945">
      <node role="body" roleId="tpc2.1198489993734" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="1207545486242702952">
        <property name="separatorText" nameId="tpc2.1140524450557" value="\n" />
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.1207545486242546030" />
        <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="1207545486242702953" />
      </node>
      <node role="header" roleId="tpc2.1198489985045" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1207545486242702947">
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1207545486242702948" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1207545486242702949">
          <property name="text" nameId="tpc2.1073389577007" value="Satchel" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="1207545486242702951">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
      </node>
    </node>
  </root>
  <root id="1207545486242702907">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Block" typeId="tpc2.1198489924438" id="1207545486242702936">
      <node role="body" roleId="tpc2.1198489993734" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="1207545486242702943">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.1207545486242556213" />
        <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="1207545486242702944" />
      </node>
      <node role="header" roleId="tpc2.1198489985045" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1207545486242702938">
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1207545486242702939" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1207545486242702940">
          <property name="text" nameId="tpc2.1073389577007" value="EffectTome" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="1207545486242702942">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
        </node>
      </node>
    </node>
  </root>
  <root id="7344367026218504801">
    <node role="styleClass" roleId="tpc2.1186402402630" type="tpc2.StyleSheetClass" typeId="tpc2.1186402373407" id="7344367026218504802">
      <property name="name" nameId="tpck.1169194664001" value="toxicItem" />
      <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.ForegroundColorStyleClassItem" typeId="tpc2.1186404549998" id="7344367026218504804">
        <property name="color" nameId="tpc2.1186403713874" value="green" />
        <node role="query" roleId="tpc2.1186403803051" type="tpc2.RGBColor" typeId="tpc2.1225456267680" id="7344367026218535942">
          <property name="value" nameId="tpc2.1225456424731" value="008020" />
        </node>
      </node>
    </node>
    <node role="styleClass" roleId="tpc2.1186402402630" type="tpc2.StyleSheetClass" typeId="tpc2.1186402373407" id="6408533231780759734">
      <property name="name" nameId="tpck.1169194664001" value="keyword" />
      <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.ForegroundColorStyleClassItem" typeId="tpc2.1186404549998" id="6408533231780759735">
        <node role="query" roleId="tpc2.1186403803051" type="tpc2.RGBColor" typeId="tpc2.1225456267680" id="6408533231780780263">
          <property name="value" nameId="tpc2.1225456424731" value="7F0055" />
        </node>
      </node>
      <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.FontStyleStyleClassItem" typeId="tpc2.1186403751766" id="6128846238145421398">
        <property name="style" nameId="tpc2.1186403771423" value="BOLD" />
      </node>
    </node>
  </root>
  <root id="4521199767040192983">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="4521199767040192985">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="4521199767040192988">
        <property name="text" nameId="tpc2.1073389577007" value="using satchel" />
        <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="4521199767040192987" />
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefCell" typeId="tpc2.1088013125922" id="4521199767040192990">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.4521199767040192982" />
        <node role="editorComponent" roleId="tpc2.1088186146602" type="tpc2.InlineEditorComponent" typeId="tpc2.1088185857835" id="4521199767040192991">
          <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_ReferencePresentation" typeId="tpc2.625126330682908270" id="4521199767040192993" />
        </node>
      </node>
    </node>
  </root>
  <root id="4521199767040192996">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="4521199767040192998">
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="4521199767040193000" />
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="4521199767040193002">
        <property name="text" nameId="tpc2.1073389577007" value="using tome" />
        <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefCell" typeId="tpc2.1088013125922" id="4521199767040193004">
        <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.4521199767040192995" />
        <node role="editorComponent" roleId="tpc2.1088186146602" type="tpc2.InlineEditorComponent" typeId="tpc2.1088185857835" id="4521199767040193005">
          <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_ReferencePresentation" typeId="tpc2.625126330682908270" id="4521199767040193007" />
        </node>
      </node>
    </node>
  </root>
  <root id="1098823917305199709">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199711">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199746">
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1098823917305199747" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Indent" typeId="tpc2.1198256887712" id="1098823917305199748" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1098823917305199749">
          <property name="text" nameId="tpc2.1073389577007" value="effects:" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199750">
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1098823917305199751" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Indent" typeId="tpc2.1198256887712" id="1098823917305199752" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNodeList" typeId="tpc2.1073390211982" id="1098823917305199753">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.2039275433489786449" />
          <node role="cellLayout" roleId="tpc2.1140524464360" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="1098823917305199754" />
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="1098823917305199755">
            <property name="flag" nameId="tpc2.1186414551515" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199756">
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1098823917305199757" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Indent" typeId="tpc2.1198256887712" id="1098823917305199758" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Empty" typeId="tpc2.8313721352726366579" id="1098823917305199759" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199760">
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="1098823917305199761">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Indent" typeId="tpc2.1198256887712" id="1098823917305199762" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1098823917305199763">
          <property name="text" nameId="tpc2.1073389577007" value="price:" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="1098823917305199764">
          <property name="allowEmptyText" nameId="tpc2.1140114345053" value="true" />
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388123806" resolveInfo="price" />
        </node>
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1098823917305199765" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199766">
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="1098823917305199767">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_BlockEnd" typeId="tpc2.1198257747917" id="1098823917305199768" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1098823917305199769">
          <property name="text" nameId="tpc2.1073389577007" value="=" />
        </node>
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1098823917305199770" />
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_RefNode" typeId="tpc2.1073389882823" id="1098823917305199771">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="g0a9.6612588870388080426" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1098823917305199772">
          <property name="text" nameId="tpc2.1073389577007" value=";" />
        </node>
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="1098823917305199773" />
    </node>
  </root>
  <root id="1098823917305199775">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199777">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199778">
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="1098823917305199779">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1098823917305199841">
          <property name="text" nameId="tpc2.1073389577007" value="poison" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="1098823917305199843">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="7344367026218504802" resolveInfo="toxicItem" />
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.FontStyleStyleClassItem" typeId="tpc2.1186403751766" id="1098823917305232001">
            <property name="style" nameId="tpc2.1186403771423" value="BOLD" />
          </node>
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_BlockStart" typeId="tpc2.1198257632966" id="1098823917305199810" />
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1098823917305199811" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Component" typeId="tpc2.1078939183254" id="1098823917305284916">
        <link role="editorComponent" roleId="tpc2.1078939183255" targetNodeId="1098823917305199709" resolveInfo="MixtureBody" />
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="1098823917305199839" />
    </node>
  </root>
  <root id="1098823917305199844">
    <node role="cellModel" roleId="tpc2.1080736633877" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199852">
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Collection" typeId="tpc2.1073389446423" id="1098823917305199853">
        <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.SelectableStyleSheetItem" typeId="tpc2.1186414928363" id="1098823917305199854">
          <property name="flag" nameId="tpc2.1186414551515" value="false" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Constant" typeId="tpc2.1073389577006" id="1098823917305199855">
          <property name="text" nameId="tpc2.1073389577007" value="potion" />
          <link role="styleClass" roleId="tpc2.1186406756722" targetNodeId="6408533231780759734" resolveInfo="keyword" />
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Property" typeId="tpc2.1073389658414" id="1098823917305199856">
          <link role="relationDeclaration" roleId="tpc2.1140103550593" targetNodeId="tpck.1169194664001" resolveInfo="name" />
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.ForegroundColorStyleClassItem" typeId="tpc2.1186404549998" id="1098823917305232002">
            <node role="query" roleId="tpc2.1186403803051" type="tpc2.RGBColor" typeId="tpc2.1225456267680" id="1098823917305232003">
              <property name="value" nameId="tpc2.1225456424731" value="0039E6" />
            </node>
          </node>
          <node role="styleItem" roleId="tpc2.1219418656006" type="tpc2.FontStyleStyleClassItem" typeId="tpc2.1186403751766" id="1098823917305232005">
            <property name="style" nameId="tpc2.1186403771423" value="BOLD" />
          </node>
        </node>
        <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_BlockStart" typeId="tpc2.1198257632966" id="1098823917305199857" />
        <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Indent" typeId="tpc2.1237303669825" id="1098823917305199858" />
      </node>
      <node role="childCellModel" roleId="tpc2.1073389446424" type="tpc2.CellModel_Component" typeId="tpc2.1078939183254" id="1098823917305284918">
        <link role="editorComponent" roleId="tpc2.1078939183255" targetNodeId="1098823917305199709" resolveInfo="MixtureBody" />
      </node>
      <node role="cellLayout" roleId="tpc2.1106270802874" type="tpc2.CellLayout_Vertical" typeId="tpc2.1106270571710" id="1098823917305199860" />
    </node>
  </root>
</model>

