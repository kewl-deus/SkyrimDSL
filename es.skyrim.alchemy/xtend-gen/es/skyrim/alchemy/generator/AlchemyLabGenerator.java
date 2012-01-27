package es.skyrim.alchemy.generator;

import es.skyrim.alchemy.alchemyLab.Effect;
import es.skyrim.alchemy.alchemyLab.EffectDef;
import es.skyrim.alchemy.alchemyLab.IngredientDef;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AlchemyLabGenerator implements IGenerator {
  private Map<String,BigInteger> effectIdCache = new Function0<Map<String,BigInteger>>() {
    public Map<String,BigInteger> apply() {
      HashMap<String,BigInteger> _newHashMap = CollectionLiterals.<String, BigInteger>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  private Map<String,BigInteger> ingredientIdCache = new Function0<Map<String,BigInteger>>() {
    public Map<String,BigInteger> apply() {
      HashMap<String,BigInteger> _newHashMap = CollectionLiterals.<String, BigInteger>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  private BigInteger idCounter = new Function0<BigInteger>() {
    public BigInteger apply() {
      BigInteger _bigInteger = new BigInteger("1400000000000000000");
      return _bigInteger;
    }
  }.apply();
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      this.fillEffectIdCache();
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterator<IngredientDef> _filter = IteratorExtensions.<IngredientDef>filter(_allContents, es.skyrim.alchemy.alchemyLab.IngredientDef.class);
      Iterator<IngredientDef> ings = _filter;
      String _generateSatchel = this.generateSatchel(ings);
      fsa.generateFile("satchel.xml", _generateSatchel);
  }
  
  public BigInteger fillEffectIdCache() {
    BigInteger _xblockexpression = null;
    {
      BigInteger _bigInteger = new BigInteger("1307545486242710000");
      this.effectIdCache.put("Anf\u00E4lligkeit f\u00FCr Blitz", _bigInteger);
      BigInteger _bigInteger_1 = new BigInteger("1307545486242720000");
      this.effectIdCache.put("Anf\u00E4lligkeit f\u00FCr Feuer", _bigInteger_1);
      BigInteger _bigInteger_2 = new BigInteger("1307545486242730000");
      this.effectIdCache.put("Anf\u00E4lligkeit f\u00FCr Frost", _bigInteger_2);
      BigInteger _bigInteger_3 = new BigInteger("1307545486242740000");
      this.effectIdCache.put("Anf\u00E4lligkeit f\u00FCr Gift", _bigInteger_3);
      BigInteger _bigInteger_4 = new BigInteger("1307545486242750000");
      this.effectIdCache.put("Anf\u00E4lligkeit f\u00FCr Magie", _bigInteger_4);
      BigInteger _bigInteger_5 = new BigInteger("1307545486242760000");
      this.effectIdCache.put("Ausdauer regenerieren", _bigInteger_5);
      BigInteger _bigInteger_6 = new BigInteger("1307545486242770000");
      this.effectIdCache.put("Ausdauer senken", _bigInteger_6);
      BigInteger _bigInteger_7 = new BigInteger("1307545486242780000");
      this.effectIdCache.put("Ausdauer verst\u00E4rken", _bigInteger_7);
      BigInteger _bigInteger_8 = new BigInteger("1307545486242790000");
      this.effectIdCache.put("Ausdauer wiederherstellen", _bigInteger_8);
      BigInteger _bigInteger_9 = new BigInteger("1307545486242800000");
      this.effectIdCache.put("Ausdauerregeneration senken", _bigInteger_9);
      BigInteger _bigInteger_10 = new BigInteger("1307545486242810000");
      this.effectIdCache.put("Beschw\u00F6rung verst\u00E4rken", _bigInteger_10);
      BigInteger _bigInteger_11 = new BigInteger("1307545486242820000");
      this.effectIdCache.put("Blitzresistenz", _bigInteger_11);
      BigInteger _bigInteger_12 = new BigInteger("1307545486242830000");
      this.effectIdCache.put("Blocken verst\u00E4rken", _bigInteger_12);
      BigInteger _bigInteger_13 = new BigInteger("1307545486242840000");
      this.effectIdCache.put("Dauerhafter Ausdauerschaden", _bigInteger_13);
      BigInteger _bigInteger_14 = new BigInteger("1307545486242850000");
      this.effectIdCache.put("Dauerhafter Magickaschaden", _bigInteger_14);
      BigInteger _bigInteger_15 = new BigInteger("1307545486242860000");
      this.effectIdCache.put("Einh\u00E4ndig verst\u00E4rken", _bigInteger_15);
      BigInteger _bigInteger_16 = new BigInteger("1307545486242870000");
      this.effectIdCache.put("Erz\u00FCrnen", _bigInteger_16);
      BigInteger _bigInteger_17 = new BigInteger("1307545486242880000");
      this.effectIdCache.put("Feuerresistenz", _bigInteger_17);
      BigInteger _bigInteger_18 = new BigInteger("1307545486242890000");
      this.effectIdCache.put("Frostresistenz", _bigInteger_18);
      BigInteger _bigInteger_19 = new BigInteger("1307545486242900000");
      this.effectIdCache.put("Furcht", _bigInteger_19);
      BigInteger _bigInteger_20 = new BigInteger("1307545486242910000");
      this.effectIdCache.put("Gesundheit regenerieren", _bigInteger_20);
      BigInteger _bigInteger_21 = new BigInteger("1307545486242920000");
      this.effectIdCache.put("Gesundheit senken", _bigInteger_21);
      BigInteger _bigInteger_22 = new BigInteger("1307545486242930000");
      this.effectIdCache.put("Gesundheit verst\u00E4rken", _bigInteger_22);
      BigInteger _bigInteger_23 = new BigInteger("1307545486242940000");
      this.effectIdCache.put("Gesundheit wiederherstellen", _bigInteger_23);
      BigInteger _bigInteger_24 = new BigInteger("1307545486242950000");
      this.effectIdCache.put("Giftresistenz", _bigInteger_24);
      BigInteger _bigInteger_25 = new BigInteger("1307545486242960000");
      this.effectIdCache.put("Illusion verst\u00E4rken", _bigInteger_25);
      BigInteger _bigInteger_26 = new BigInteger("1307545486242970000");
      this.effectIdCache.put("Krankheit heilen", _bigInteger_26);
      BigInteger _bigInteger_27 = new BigInteger("1307545486242980000");
      this.effectIdCache.put("L\u00E4hmen", _bigInteger_27);
      BigInteger _bigInteger_28 = new BigInteger("1307545486242990000");
      this.effectIdCache.put("Leichte R\u00FCstung verst\u00E4rken", _bigInteger_28);
      BigInteger _bigInteger_29 = new BigInteger("1307545486243000000");
      this.effectIdCache.put("Magicka regenerieren", _bigInteger_29);
      BigInteger _bigInteger_30 = new BigInteger("1307545486243010000");
      this.effectIdCache.put("Magicka senken", _bigInteger_30);
      BigInteger _bigInteger_31 = new BigInteger("1307545486243020000");
      this.effectIdCache.put("Magicka verst\u00E4rken", _bigInteger_31);
      BigInteger _bigInteger_32 = new BigInteger("1307545486243030000");
      this.effectIdCache.put("Magicka wiederherstellen", _bigInteger_32);
      BigInteger _bigInteger_33 = new BigInteger("1307545486243040000");
      this.effectIdCache.put("Magickaregeneration senken", _bigInteger_33);
      BigInteger _bigInteger_34 = new BigInteger("1307545486243050000");
      this.effectIdCache.put("Magieresistenz", _bigInteger_34);
      BigInteger _bigInteger_35 = new BigInteger("1307545486243060000");
      this.effectIdCache.put("Raserei", _bigInteger_35);
      BigInteger _bigInteger_36 = new BigInteger("1307545486243070000");
      this.effectIdCache.put("Redekunst verst\u00E4rken", _bigInteger_36);
      BigInteger _bigInteger_37 = new BigInteger("1307545486243080000");
      this.effectIdCache.put("Schleichen verst\u00E4rken", _bigInteger_37);
      BigInteger _bigInteger_38 = new BigInteger("1307545486243090000");
      this.effectIdCache.put("Schlo\u00DFknacken verst\u00E4rken", _bigInteger_38);
      BigInteger _bigInteger_39 = new BigInteger("1307545486243100000");
      this.effectIdCache.put("Schmiedekunst verst\u00E4rken", _bigInteger_39);
      BigInteger _bigInteger_40 = new BigInteger("1307545486243110000");
      this.effectIdCache.put("Schwere R\u00FCstung verst\u00E4rken", _bigInteger_40);
      BigInteger _bigInteger_41 = new BigInteger("1307545486243120000");
      this.effectIdCache.put("Taschendiebstahl verst\u00E4rken", _bigInteger_41);
      BigInteger _bigInteger_42 = new BigInteger("1307545486243130000");
      this.effectIdCache.put("Tragf\u00E4higkeit verst\u00E4rken", _bigInteger_42);
      BigInteger _bigInteger_43 = new BigInteger("1307545486243140000");
      this.effectIdCache.put("Unsichtbarkeit", _bigInteger_43);
      BigInteger _bigInteger_44 = new BigInteger("1307545486243150000");
      this.effectIdCache.put("Ver\u00E4nderung verst\u00E4rken", _bigInteger_44);
      BigInteger _bigInteger_45 = new BigInteger("1307545486243160000");
      this.effectIdCache.put("Verlangsamen", _bigInteger_45);
      BigInteger _bigInteger_46 = new BigInteger("1307545486243170000");
      this.effectIdCache.put("Verzaubern verst\u00E4rken", _bigInteger_46);
      BigInteger _bigInteger_47 = new BigInteger("1307545486243180000");
      this.effectIdCache.put("Wasseratmung", _bigInteger_47);
      BigInteger _bigInteger_48 = new BigInteger("1307545486243190000");
      this.effectIdCache.put("Wiederherstellung verst\u00E4rken", _bigInteger_48);
      BigInteger _bigInteger_49 = new BigInteger("1307545486243200000");
      this.effectIdCache.put("Zerst\u00F6rung verst\u00E4rken", _bigInteger_49);
      BigInteger _bigInteger_50 = new BigInteger("1307545486243210000");
      this.effectIdCache.put("Zielkunst verst\u00E4rken", _bigInteger_50);
      BigInteger _bigInteger_51 = new BigInteger("1307545486243220000");
      BigInteger _put = this.effectIdCache.put("Zweih\u00E4ndig verst\u00E4rken", _bigInteger_51);
      _xblockexpression = (_put);
    }
    return _xblockexpression;
  }
  
  public String generateSatchel(final Iterator<IngredientDef> ings) {
    StringBuilder _stringBuilder = new StringBuilder();
    final Function2<StringBuilder,IngredientDef,StringBuilder> _function = new Function2<StringBuilder,IngredientDef,StringBuilder>() {
        public StringBuilder apply(final StringBuilder sb, final IngredientDef ing) {
          CharSequence _generate = AlchemyLabGenerator.this.generate(ing);
          StringBuilder _append = sb.append(_generate);
          StringBuilder _append_1 = _append.append("\n");
          return _append_1;
        }
      };
    StringBuilder _fold = IteratorExtensions.<IngredientDef, StringBuilder>fold(ings, _stringBuilder, _function);
    String _string = _fold.toString();
    return _string;
  }
  
  public CharSequence generate(final IngredientDef ing) {
    CharSequence _xblockexpression = null;
    {
      BigInteger _nextId = this.nextId();
      final BigInteger ingId = _nextId;
      String _name = ing.getName();
      BigInteger _nextId_1 = this.nextId();
      this.ingredientIdCache.put(_name, _nextId_1);
      EList<Effect> _effects = ing.getEffects();
      final Function1<Effect,Effect> _function = new Function1<Effect,Effect>() {
          public Effect apply(final Effect it) {
            Effect _effect = it.getEffect();
            return _effect;
          }
        };
      List _map = ListExtensions.<Effect, Effect>map(_effects, _function);
      Object[] _array = _map.toArray();
      final Object[] effects = _array;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<node role=\"ingredient\" roleId=\"g0a9.1207545486242546030\" type=\"g0a9.Ingredient\" typeId=\"g0a9.6612588870387972505\" id=\"");
      _builder.append(ingId, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<property name=\"name\" nameId=\"tpck.1169194664001\" value=");
      String _name_1 = ing.getName();
      _builder.append(_name_1, "  ");
      _builder.append(" />");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<property name=\"price\" nameId=\"g0a9.6612588870387972509\" value=\"");
      float _price = ing.getPrice();
      int _intValue = Float.valueOf(_price).intValue();
      _builder.append(_intValue, "  ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<property name=\"weight\" nameId=\"g0a9.6612588870387972511\" value=\"");
      float _weight = ing.getWeight();
      _builder.append(_weight, "  ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<property name=\"source\" nameId=\"g0a9.6612588870387972512\" value=\"");
      String _source = ing.getSource();
      _builder.append(_source, "  ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      {
        for(final Object eff : effects) {
          _builder.append("  ");
          _builder.append("<node role=\"effect\" roleId=\"g0a9.2039275433489786449\" type=\"g0a9.EffectReference\" typeId=\"g0a9.6612588870387988288\" id=\"");
          BigInteger _nextId_2 = this.nextId();
          _builder.append(_nextId_2, "  ");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("  ");
          _builder.append("<link role=\"effect\" roleId=\"g0a9.6612588870387988289\" targetNodeId=\"");
          String _name_2 = ((EffectDef) eff).getName();
          BigInteger _get = this.effectIdCache.get(_name_2);
          _builder.append(_get, "    ");
          _builder.append("\" resolveInfo=");
          String _name_3 = ((EffectDef) eff).getName();
          _builder.append(_name_3, "    ");
          _builder.append(" />");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("</node>");
          _builder.newLine();
        }
      }
      _builder.append("</node>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final Effect eff) {
    CharSequence _xblockexpression = null;
    {
      String _name = ((EffectDef) eff).getName();
      final String effectName = _name;
      BigInteger _get = this.effectIdCache.get(effectName);
      final BigInteger effectId = _get;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<node role=\"effect\" roleId=\"g0a9.2039275433489786449\" type=\"g0a9.EffectReference\" typeId=\"g0a9.6612588870387988288\" id=\"");
      BigInteger _nextId = this.nextId();
      _builder.append(_nextId, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("<link role=\"effect\" roleId=\"g0a9.6612588870387988289\" targetNodeId=\"");
      _builder.append(effectId, "");
      _builder.append("\" resolveInfo=\"");
      _builder.append(effectName, "");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("</node>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public BigInteger nextId() {
    BigInteger _xblockexpression = null;
    {
      final BigInteger current = this.idCounter;
      BigInteger _bigInteger = new BigInteger("1");
      BigInteger _add = this.idCounter.add(_bigInteger);
      this.idCounter = _add;
      _xblockexpression = (current);
    }
    return _xblockexpression;
  }
}
