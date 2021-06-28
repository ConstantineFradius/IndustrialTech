package mightydanp.industrialtech.common.materials;

import com.google.common.collect.HashMultimap;
import com.mojang.datafixers.util.Pair;;
import mightydanp.industrialtech.api.common.handler.MaterialHandler;
import mightydanp.industrialtech.api.common.libs.EnumMaterialFlags;
import mightydanp.industrialtech.api.common.libs.ITToolType;
import net.minecraftforge.common.ToolType;

import static mightydanp.industrialtech.api.common.libs.EnumMaterialFlags.*;
import static mightydanp.industrialtech.api.common.libs.EnumMaterialTextureFlags.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by MightyDanp on 9/26/2020.
 */

public class ModMaterials {
    public static List<MaterialHandler> materials = new ArrayList<MaterialHandler>();
    public static MaterialHandler alexandrite, almandine, amethyst, andradite, anthracite, apatite, aquamarine, arsenopyrite, azurite, balasruby, barite, bastnasite,
            bentonite, beryllium, bixbite, black_eye, blue_jasper, blue_sapphire, blue_topaz, bromargyrite, brown_limonite, cassiterite, cats_eye, certus_quartz, chalcopyrite,
            chromite, cinnabar, coal, cobaltite, cooperite, copper, craponite, diamond, dioptase, dragon_eye, emerald, ferberite, galena, garnierite, glauconite,
            gold, goshenite, graphite, green_jasper, green_sapphire, grossular, hawks_eye, heliodor, hematite, huebnerite, ilmenite, iodinesalt, iridium, jasper, kesterite,
            lapis, lazurite, lepidolite, lignite, magnesite, magnetite, malachite, maxixe, molybdenite, monazite, morganite, ocean_jasper, olivine, orange_sapphire,
            peat_bituminous, pentlandite, phosphate, phosphorite, phosphorus, pitchblende, powellite, purple_sapphire, pyrite, pyrolusite, pyrope, quartzite, rainforest_jasper,
            redstone, rocksalt, ruby, rutile, salt, sapphire, scheelite, sodalite, sperrylite, spessartine, sphalerite, spinel, spodumene, stannite, stibnite, subbituminous,
            tantalite, tetrahedrite, thorium, tiger_eye, tiger_iron, topaz, tungstate, uraninite, uvarovite, vanadium_magnetite, wolframite, yellow_jasper, yellow_limonite,
            yellow_sapphire, zircon, yellow_diamond, pink_diamond, blue_diamond, green_diamond, lime_diamond, black_diamond, magenta_diamond,
            red_diamond, gold_diamond, cyan_diamond, imperial_diamond, chrysoberyl, amber, blue_amber, balas_ruby, balas_sapphire, balas_ameythest, balas_emerald, black_spinel,
            yellow_spinel, white_spinel, melanite, demantoid, mandradite, hessanite, geversite, insizwaite, gaotaiite, laurite, osmiridium, ruthosmoxide, polarite, palladium,
            platinum, rhodium, osmium, bertrandite, thorite, euxenite, yellow_labradorite, orange_labradorite, blue_labradorite, imperial_bixbite, plutonite, rhodonite, tinaksite,
            suglite, tourmaline, kunzite, hubnerite, haurite, rhodochrosite, psilomelane, braunite, sulfur, crocite, terlinguaite, thortveitite, aeschynite, fergusonite, eudialyte,
            gadolinite, loparite, stannite, golden_cassiterite, joanneumite, bornite, tennantite, germanite, tanzanite, blue_tourmaline, siderite, cadmium_selenite, angelsite, vanadinite,
            litharge, altaite, dzhalindite, roquesite, greenocklite, wulfenite, drysdalite, molybdite, columbite, psilomelane, rhodochrosite, rhenium, turqoise, covellite, gallite, digenite,
            petalite, middlebackite, triazolite, zhemchuzhnikovite, chrysocolla, livingstonite, aurostibite, green_topaz, orange_topaz, white_topaz, red_topaz, pink_topaz, imperial_topaz, 
            black_topaz, white_topaz, black_flourite, white_flourite, cyan_flourite, green_flourite, red_flourite, blue_flourite, imperial_flourite, magenta_flourite, pink_flourite,
            orange_flourite, abelsonite, millerite, gerdorffite, rammelsbergite, villamaninite, patronite, taenite, vaesite, nickeline, epidote, hercynite, xylit, bathvillite, 
            teleginite, alginite, lamalginite, subbituminous, bituminous, cannel_coal, potash, glauconite, muscovite, iodine_salt, lautarite, silveriodine, nikolite, teslatite, electroline, 
            nephrite_jade, jade, white_jade, black_jade, purple_jade, green_jade, cyan_jade, zirconia, white_zircon, yellow_zircon, baddeleyite, tienmannite, stilleite, ferroselite, drysdallite,
            trogtalite, clausthalite, eskenbornite, penroseite, dzarkenite, ferroselite, gallium_selenide, krutaite, tellurite, altaite, calaverite, tellurobismuthite, tetradymite, hessite, sylanite,
            vulcanite, rickardite, melonite, merenskyite, empressite, coloradoite, petzite, cattierite, skutterudite, penroseite, safflorite, glaucodot, arquerite, acanthite, argyrodite, chlorargyrite,
            slyvanite, electrum, alumina, bismoclite, bismuthinite, bismite, kaolinite, bauxite, dumortierite, gypsum, earlandite, lithium_chloride, sal_ammoniac, glauberite, trona, calcite, hanksite, 
            feroxhyte, cervantite, kamiokite, periclase, gahnite, ferropericlase, paramelaconite, acetamide, evenkite, ozokerite, carpathite, grahamite, asphaltite, calclacite, chibaite, elaterite, fichtelite,
            guanine, hoelite, idrialie, kratochvilite, shungite, tinnunculite, uricite, wampenite, ravatite, oil_sands, tar_sands, garnet_sands, realgar, Erlichmanite, leucite, pollucite, carnallite,
            leucite, zinnwaldite, rubidium_oxide, scandium_oxide, brookite, anatase, titanite, akaogiite, perovskite, carnotite, perovskite, gallite, kernite, borax, ulexite, colemanite, boracite, painite,
            amblygonite, elbaite, eucryptite, hectorite, flur_liddicoatite, lithiophilite, nambulite, triphylite, neptunite, pezzottaite, zabuyelite,zinnwaldite, zektzerite, phenakite, natron, amphibole, zeolite,
            cryolite, feldspar, afganite, khomyakovite, kambaldaite, ferrokentbrooksite, cyrilovite, nenadkevichite, sampleite, thomsenolite, villiaumite, celestine, xenotime, strontianite, simpsonite, coltan, argentite,
            cerussite, chlorargyrite, sylvite, carnallite, avogadrite, rhodizite, benitoite, lanthanite, hafnon, crookesite, hutchinsonite, lorándite, bronze, lithium, boron, carbon, nitrogen, oxygen, fluorine, neon,
            sodium, magnesium, aluminium, silicon, white_phosphorus, red_phosphorus, violet_phosphorus, sulfur, chlorine, argon, potassium, calcium, scandium, titanium, vanadium, chromium, manganese, iron, cobalt, nickel,
            zinc, gallium, germanium, arsenic, metal_selenium, blood_selenium, bromine, krypton, rubidium, strontium, yttrium, zirconium, niobium, molybdenum, technetium, ruthenium, rhodium, palladium, silver, cadmium,
            indium, tin, antimony, tellurium, iodine, xenon, caesium, barium, caesium, lanthanum, caesium, praseodymium, neodymium, promethium, samarium, europium, gadolinium, dysprosium, holmium, erbium, thulium,
            ytterbium, hafnium, tantalum, tungsten, rhenium, osmium, terbium, platinum, terbium, mercury, thallium, lead, bismuth, polonium, astatine, radon, francium, radium, actinium, protactinium, uranium_235,
            uranium_238, neptunium, plutonium_238, plutonium_241, plutonium_244, americium, curium, neutronium, naquadah, naquada, naquadria,naquaxide, naqyrite, naquintrinide, curite, curaumaga, maganite, lincolnite, marianite, 
            mithril, midasium, adamantium, rubracium, orichalcum, selenigum, atlarus, eximite, meutoite, korboranium, byzantinite, ceruclase, sanguinite, vulcanium, kalendrite, hanninium, deep_iron, vyroxeres, blue_gahnite, gree_gahnite,
            yellow_gahnite, lutetium;

    public static MaterialHandler flint, stone;

    public static List<Pair<ToolType, Integer>> flintToolTypes, stoneToolTypes;


    public static void commonInit() { //materials.add(iron = new MaterialHandler("iron", 0, 51, 153, "", 8, ORE));
    //Materials that have ORES
        materials.add(alexandrite = new MaterialHandler("alexandrite", 0x6A4D6B, GEM_HORIZONTAL, 8, GEM));
        materials.add(almandine = new MaterialHandler("almandine", 0xff0000, ROUGH, 8, GEM));
        materials.add(amethyst = new MaterialHandler("amethyst", 0xd232d2, RUBY, 8, GEM));
        materials.add(andradite = new MaterialHandler("andradite", 0x967800, ROUGH, 8, GEM));
        materials.add(anthracite = new MaterialHandler("anthracite", 0x383E42, DULL, 8, ORE));
        materials.add(apatite = new MaterialHandler("apatite", 0x78b4fa, DULL, 8, ORE));
        materials.add(aquamarine = new MaterialHandler("aquamarine", 0x7FFFD4, GEM_HORIZONTAL, 8, GEM));
        materials.add(arsenopyrite = new MaterialHandler("arsenopyrite", 0xfaf01e, DULL, 8, ORE));
        materials.add(azurite = new MaterialHandler("azurite", 0x6da4f7, DULL, 8, ORE));
        materials.add(balasruby = new MaterialHandler("balasruby", 0xff6464, GEM_HORIZONTAL, 8, GEM));
        materials.add(barite = new MaterialHandler("barite", 0xe6ebff, DULL, 8, GEM));
        materials.add(bastnasite = new MaterialHandler("bastnasite", 0xc86e2d, FINE, 8, ORE));
        materials.add(bentonite = new MaterialHandler("bentonite", 0xf5d7d2, ROUGH, 16, "NaOH", ORE));
        materials.add(beryllium = new MaterialHandler("beryllium", 0x64b464, METALLIC, 16, "Be", 1560,  2742, ORE));
        materials.add(bixbite = new MaterialHandler("bixbite", 0xff5050, GEM_HORIZONTAL, 8, GEM));
        materials.add(black_eye = new MaterialHandler("black_eye", 0x424442, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_jasper = new MaterialHandler("blue_jasper", 0x3c7c97, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_sapphire = new MaterialHandler("blue_sapphire", 0x6464c8, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_topaz = new MaterialHandler("blue_topaz", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(bromargyrite = new MaterialHandler("bromargyrite", 0x5a2d0a, DULL, 8, ORE));
        materials.add(brown_limonite = new MaterialHandler("brown_limonite", 0xc86400, METALLIC, 8, ORE));
        materials.add(cassiterite = new MaterialHandler("cassiterite", 0xdcdcdc, METALLIC, 8, ORE));
        materials.add(cats_eye = new MaterialHandler("cats_eye", 0x4d7451, GEM_HORIZONTAL, 8, GEM));
        materials.add(certus_quartz = new MaterialHandler("certus_quartz", 0xd2d2e6, QUARTZ, 8, ORE));
        materials.add(chalcopyrite = new MaterialHandler("chalcopyrite", 0xa07828, DULL, 8, ORE));
        materials.add(chromite = new MaterialHandler("chromite", 0x23140f, DULL, 8, ORE));
        materials.add(cinnabar = new MaterialHandler("cinnabar", 0x960000, ROUGH, 8, ORE));
        materials.add(coal = new MaterialHandler("coal", 0x464646, LIGNITE, 8, ORE));
        materials.add(cobaltite = new MaterialHandler("cobaltite", 0x5050fa, METALLIC, 8, ORE));
        materials.add(cooperite = new MaterialHandler("cooperite", 0xffffc8, METALLIC, 8, ORE));
        materials.add(copper = new MaterialHandler("copper", 0xff6400, SHINY, 8, "Cu", ORE));
        materials.add(craponite = new MaterialHandler("craponite", 0xffaab9, GEM_HORIZONTAL, 8, GEM));
        materials.add(diamond = new MaterialHandler("diamond", 0xc8ffff, DIAMOND, 8, GEM));
        materials.add(dioptase = new MaterialHandler("dioptase", 0x00b4b4, GEM_HORIZONTAL, 8, GEM));
        materials.add(dragon_eye = new MaterialHandler("dragon_eye", 0xa45f53, GEM_HORIZONTAL, 8, GEM));
        materials.add(emerald = new MaterialHandler("emerald",  0x50ff50, GEM_HORIZONTAL, 8, GEM));
        materials.add(ferberite = new MaterialHandler("ferberite", 0x373223, DULL, 8, ORE));
        materials.add(galena = new MaterialHandler("galena", 0x643c64, DULL, 8, ORE));
        materials.add(garnierite = new MaterialHandler("garnierite", 0x32c846, METALLIC, 8, ORE));
        materials.add(glauconite = new MaterialHandler("glauconite", 0x82b43c, DULL, 8, ORE));
        materials.add(gold = new MaterialHandler("gold", 0xffff1e, SHINY, 16, "Au", 1337,  3129, ORE));
        materials.add(goshenite = new MaterialHandler("goshenite", 0xf0f0f0, GEM_HORIZONTAL, 8, GEM));
        materials.add(graphite = new MaterialHandler("graphite", 0x808080, DULL, 8, ORE));
        materials.add(green_jasper = new MaterialHandler("green_jasper", 0x5b836c, GEM_HORIZONTAL, 8, GEM));
        materials.add(green_sapphire = new MaterialHandler("green_sapphire", 0x64c882, GEM_HORIZONTAL, 8, GEM));
        materials.add(grossular = new MaterialHandler("grossular", 0xc86400, ROUGH, 8, ORE));
        materials.add(hawks_eye = new MaterialHandler("hawks_eye", 0x4c5e6d, GEM_HORIZONTAL, 8, GEM));
        materials.add(heliodor = new MaterialHandler("heliodor", 0xffff96, GEM_HORIZONTAL, 8, GEM));
        materials.add(hematite = new MaterialHandler("hematite", 145,  90,  90, 255, 8, ORE));
        materials.add(huebnerite = new MaterialHandler("huebnerite", 0x373223, DULL, 8, ORE));
        materials.add(ilmenite = new MaterialHandler("ilmenite", 0x463732, METALLIC, 8, ORE));
        materials.add(iodinesalt = new MaterialHandler("iodinesalt", 0xf0c8f0, DULL, 8, ORE));
        materials.add(iridium = new MaterialHandler("iridium",  0xf0f0f5, DULL, 16, "Ir",2719,  4701, ORE));
        materials.add(jasper = new MaterialHandler("jasper", 0xc85050, GEM_HORIZONTAL, 8, GEM));
        materials.add(kesterite = new MaterialHandler("kesterite", 0x699b69, DULL, 8, ORE));
        materials.add(lapis = new MaterialHandler("lapis", 0x4646dc, LAPIS, 8, ORE));
        materials.add(lazurite = new MaterialHandler("lazurite", 0x6478ff, LAPIS, 8, ORE));
        materials.add(lepidolite = new MaterialHandler("lepidolite", 0xf0328c, FINE, 8, ORE));
        materials.add(lignite = new MaterialHandler("lignite", 0x644646, LIGNITE, 8, ORE));
        materials.add(magnesite = new MaterialHandler("magnesite", 0xfafab4, METALLIC, 8, ORE));
        materials.add(magnetite = new MaterialHandler("magnetite", 0x1e1e1e, METALLIC, 8, ORE));
        materials.add(malachite = new MaterialHandler("malachite", 0x055f05, DULL, 8, ORE));
        materials.add(maxixe = new MaterialHandler("maxixe", 0x5050ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(molybdenite = new MaterialHandler("molybdenite", 0x191919, DULL, 8, ORE));
        materials.add(monazite = new MaterialHandler("monazite", 0x91919, METALLIC, 8, ORE));
        materials.add(morganite = new MaterialHandler("morganite", 0x324632, DIAMOND, 8, GEM));
        materials.add(ocean_jasper = new MaterialHandler("ocean_jasper", 0x8b7356, GEM_HORIZONTAL, 8, GEM));
        materials.add(olivine = new MaterialHandler("olivine", 0x96ff96, RUBY, 8, GEM));
        materials.add(orange_sapphire = new MaterialHandler("orange_sapphire", 0xdc9632, GEM_HORIZONTAL, 8, GEM));
        materials.add(peat_bituminous = new MaterialHandler("peat_bituminous", 0x50280a, GEM_HORIZONTAL, 8, ORE));
        materials.add(pentlandite = new MaterialHandler("pentlandite", 0xa59605, DULL, 8, ORE));
        materials.add(phosphate = new MaterialHandler("phosphate", 0xffff00, DULL, 8, ORE));
        materials.add(phosphorite = new MaterialHandler("phosphorite", 0x323241, DULL, 8, ORE));
        materials.add(phosphorus = new MaterialHandler("phosphorus", 0xffff00, FLINT, 8, ORE));
        materials.add(pitchblende = new MaterialHandler("pitchblende", 0xc8d200, DULL, 8, ORE));
        materials.add(powellite = new MaterialHandler("powellite", 0xffff00, DULL, 8, ORE));
        materials.add(purple_sapphire = new MaterialHandler("purple_sapphire", 0xdc32ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(pyrite = new MaterialHandler("pyrite", 0x967828, ROUGH, 8, ORE));
        materials.add(pyrolusite = new MaterialHandler("pyrolusite", 0x9696aa, DULL, 8, ORE));
        materials.add(pyrope = new MaterialHandler("pyrope", 0x783264, METALLIC, 8, GEM));
        materials.add(quartzite = new MaterialHandler("quartzite", 0xe6cdcd, QUARTZ, 8, ORE));
        materials.add(rainforest_jasper = new MaterialHandler("rainforest_jasper", 0x817b37, GEM_HORIZONTAL, 8, GEM));
        materials.add(redstone = new MaterialHandler("redstone", 0xc80000, ROUGH, 8, ORE));
        materials.add(rocksalt = new MaterialHandler("rocksalt", 0xf0c8c8, FINE, 8, ORE));
        materials.add(ruby = new MaterialHandler("ruby", 0xff6464, RUBY, 8, GEM));
        materials.add(rutile = new MaterialHandler("rutile", 0xd40d5c, GEM_HORIZONTAL, 8, ORE));
        materials.add(salt = new MaterialHandler("salt", 0xfafafa, FINE, 8, ORE));
        materials.add(sapphire = new MaterialHandler("sapphire", 0x6464c8, GEM_HORIZONTAL, 8, GEM));
        materials.add(scheelite = new MaterialHandler("scheelite", 0xc88c14, DULL, 8, ORE));
        materials.add(sodalite = new MaterialHandler("sodalite", 0x1414ff, LAPIS, 8, ORE));
        materials.add(sperrylite = new MaterialHandler("sperrylite", 0x696969, DULL, 8, ORE));
        materials.add(spessartine = new MaterialHandler("spessartine", 0xff6464, DULL, 8, ORE));
        materials.add(sphalerite = new MaterialHandler("sphalerite", 0xffffff, DULL, 8, ORE));
        materials.add(spinel = new MaterialHandler("spinel", 0x006400, GEM_HORIZONTAL, 8, GEM));
        materials.add(spodumene = new MaterialHandler("spodumene", 0xbeaaaa, DULL, 8, ORE));
        materials.add(stannite = new MaterialHandler("stannite", 0x9b9137, DULL, 8, ORE));
        materials.add(stibnite = new MaterialHandler("stibnite", 0x464646, METALLIC, 8, ORE));
        materials.add(subbituminous = new MaterialHandler("subbituminous", 0, 51, 153, alpha, "",0 , 0, 8, ORE));
        materials.add(tantalite = new MaterialHandler("tantalite", 0x915028, METALLIC, 8, ORE));
        materials.add(tetrahedrite = new MaterialHandler("tetrahedrite", 0xc82000, DULL, 8, ORE));
        materials.add(thorium = new MaterialHandler("thorium", 0x001e00, SHINY, 16, "Th", 2115,  5061, ORE));
        materials.add(tiger_eye = new MaterialHandler("tiger_eye", 0x8e743d, GEM_HORIZONTAL, 8, GEM));
        materials.add(tiger_iron = new MaterialHandler("tiger_iron", 0x6a5642, GEM_HORIZONTAL, 8, GEM));
        materials.add(topaz = new MaterialHandler("topaz", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(tungstate = new MaterialHandler("tungstate", 0x373223, DULL, 8, ORE));
        materials.add(uraninite = new MaterialHandler("uraninite", 0x232323, METALLIC, 8, ORE));
        materials.add(uvarovite = new MaterialHandler("uvarovite", 0xb4ffb4, DIAMOND, 8, GEM));
        //materials.add(vanadium_magnetite = new MaterialHandler("vanadium_magnetite", 0, 51, 153, alpha, "",0 , 0, 8, ORE));
        materials.add(wolframite = new MaterialHandler("wolframite", 0x373223, DULL, 8, ORE));
        materials.add(yellow_jasper = new MaterialHandler("yellow_jasper", 0x9c8027, GEM_HORIZONTAL, 8, GEM));
        materials.add(yellow_limonite = new MaterialHandler("yellow_limonite", 0xc8c800, METALLIC, 8, ORE));
        materials.add(yellow_sapphire = new MaterialHandler("yellow_sapphire", 0xd0dc78, GEM_HORIZONTAL, 8, GEM));
        materials.add(zircon = new MaterialHandler("zircon", 0x63181d, SHINY, 8, ORE));
        
        materials.add(yellow_diamond = new MaterialHandler("yellow_diamond", 0xffeb0f, DIAMOND, 8, GEM));
        materials.add(pink_diamond = new MaterialHandler("pink_diamond", 0xf19df2, DIAMOND, 8, GEM));
        materials.add(blue_diamond = new MaterialHandler("blue_diamond", 0x0f0fff, DIAMOND, 8, GEM));
        materials.add(green_diamond = new MaterialHandler("green_diamond", 0x075713, DIAMOND, 8, GEM));
        materials.add(lime_diamond = new MaterialHandler("lime_diamond", 0x0fff33, DIAMOND, 8, GEM));
        materials.add(black_diamond = new MaterialHandler("black_diamond", 0x1f211f, DIAMOND, 8, GEM));
        materials.add(magenta_diamond = new MaterialHandler("magenta_diamond", 0xe100ff, DIAMOND, 8, GEM));
        materials.add(red_diamond = new MaterialHandler("red_diamond", 0xf50531, DIAMOND, 8, GEM));
        materials.add(gold_diamond = new MaterialHandler("gold_diamond", 0xffb70f, DIAMOND, 8, GEM));
        materials.add(cyan_diamond = new MaterialHandler("cyan_diamond", 0x00fab7, DIAMOND, 8, GEM));
        materials.add(imperial_diamond = new MaterialHandler("imperial_diamond", 0x6300a1, DIAMOND, 8, GEM));
        materials.add(chrysoberyl = new MaterialHandler("chrysoberyl", 0xe0fad7, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_amber = new MaterialHandler("blue_amber", 0x335cf2, GEM_HORIZONTAL, 8, GEM));
        materials.add(amber = new MaterialHandler("amber", 0xf29633, GEM_HORIZONTAL, 8, GEM));
        materials.add(balas_ruby = new MaterialHandler("balas_ruby", 0xf50539, GEM_HORIZONTAL, 8, GEM));
        materials.add(balas_sapphire = new MaterialHandler("balas_sapphire", 0x3007e8, GEM_HORIZONTAL, 8, GEM));
        materials.add(balas_ameythest = new MaterialHandler("balas_ameythest", 0x8713ed, GEM_HORIZONTAL, 8, GEM));
        materials.add(balas_emerald = new MaterialHandler("balas_emerald", 0x0ba346, GEM_HORIZONTAL, 8, GEM));
        materials.add(balas_sapphire = new MaterialHandler("balas_sapphire", 0x0b83d4, GEM_HORIZONTAL, 8, GEM));
        materials.add(black_spinel = new MaterialHandler("black_spinel", 0x202121, GEM_HORIZONTAL, 8, GEM));
        materials.add(yellow_spinel = new MaterialHandler("yellow_spinel", 0xfff34f, GEM_HORIZONTAL, 8, GEM));
        materials.add(white_spinel = new MaterialHandler("white_spinel", 0xe0e0de, GEM_HORIZONTAL, 8, GEM));
        materials.add(melanite = new MaterialHandler("melanite", 0x000000, GEM_HORIZONTAL, 8, GEM));
        materials.add(demantoid = new MaterialHandler("demantoid", 0x1cff14, GEM_HORIZONTAL, 8, GEM));
        materials.add(hessanite = new MaterialHandler("hessanite", 0xe09563, GEM_HORIZONTAL, 8, GEM));
        materials.add(geversite = new MaterialHandler("geversite", 0xd1bc92, GEM_HORIZONTAL, 8, GEM));
        materials.add(insizwaite = new MaterialHandler("insizwaite", 0xe0b255, METALLIC, 8, ORE));
        materials.add(gaotaiite = new MaterialHandler("gaotaiite", 0x050504, METALLIC, 8, ORE));
        materials.add(laurite = new MaterialHandler("laurite", 0x121211, METALLIC, 8, ORE));
        materials.add(rutheniumoxide = new MaterialHandler("rutheniumoxide", 0x2a4554, METALLIC, 8, ORE));
        materials.add(osmiridium = new MaterialHandler("osmiridium", 0x436578, METALLIC, 8, ORE));
        materials.add(polarite = new MaterialHandler("polarite", 0xdbd8b6, DULL, 8, ORE));
        materials.add(bertrandite = new MaterialHandler("bertrandite", 0xcfceb4, DULL, 8, ORE));
        materials.add(thorite = new MaterialHandler("thorite", 0xb8744f, DULL, 8, ORE));
        materials.add(euxenite = new MaterialHandler("euxenite", 0xdb7356, DULL, 8, ORE));
        materials.add(yellow_labradorite = new MaterialHandler("yellow_labradorite", 0xffebab, GEM_HORIZONTAL, 8, GEM));
        materials.add(orange_labradorite = new MaterialHandler("orange_labradorite", 0xf58540, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_labradorite = new MaterialHandler("blue_labradorite", 0x2b59bd, GEM_HORIZONTAL, 8, GEM));
        materials.add(imperial_bixbite = new MaterialHandler("imperial_bixbite", 0xb937fa, GEM_HORIZONTAL, 8, GEM));
        materials.add(plutonite = new MaterialHandler("plutonite", 0xeb9834, SHINY, 8, ORE));
        materials.add(rhodonite = new MaterialHandler("rhodonite", 0xf74083, SHINY, 8, ORE));
        materials.add(tinaksite = new MaterialHandler("tinaksite", 0xc897db, SHINY, 8, ORE));
        materials.add(suglite = new MaterialHandler("suglite", 0x7a0aa3, SHINY, 8, ORE));
        materials.add(tourmaline = new MaterialHandler("tourmaline", 0xf264f5, GEM_HORIZONTAL, 8, GEM));
        materials.add(kunzite = new MaterialHandler("kunzite", 0xf1acf2, SHINY, 8, ORE));
        materials.add(hubnerite = new MaterialHandler("hubnerite", 0x990402, SHINY, 8, ORE));
        materials.add(realgar = new MaterialHandler("realgar", 0xd9120f, SHINY, 8, ORE));
        materials.add(rhodochrosite = new MaterialHandler("rhodochrosite", 0xd1117e, DULL, 8, ORE));
        materials.add(psilomelane = new MaterialHandler("psilomelane", 0x3d3a3c, DULL, 8, ORE));
        materials.add(braunite = new MaterialHandler("braunite", 0x362524, DULL, 8, ORE));
        materials.add(crocite = new MaterialHandler("crocite", 0xdb300d, DULL, 8, ORE));
        materials.add(thortveitite = new MaterialHandler("thortveitite", 0x626b56, DULL, 8, ORE));
        materials.add(terlinguaite = new MaterialHandler("terlinguaite", 0xa86a0d, DULL, 8, ORE));
        materials.add(aeschynite = new MaterialHandler("aeschynite", 0xa37229, DULL, 8, ORE));
        materials.add(fergusonite = new MaterialHandler("fergusonite", 0xcf6751, DULL, 8, ORE));
        materials.add(eudialyte = new MaterialHandler("eudialyte", 0xb50554, SHINY, 8, ORE));
        materials.add(gadolinite = new MaterialHandler("gadolinite", 0x382003, DULL, 8, ORE));
        materials.add(loparite = new MaterialHandler("loparite", 0x424242, DULL, 8, ORE));
        materials.add(stannite = new MaterialHandler("stannite", 0xd1b68e, DULL, 8, ORE));
        materials.add(golden_cassiterite = new MaterialHandler("golden_cassiterite", 0xd68f24, GEM_HORIZONTAL, 8, GEM));
        materials.add(joanneumite = new MaterialHandler("joanneumite", 0xa72ac9, DULL, 8, ORE));
        materials.add(bornite = new MaterialHandler("bornite", 0x0ba8b0, DULL, 8, ORE));
        materials.add(tennantite = new MaterialHandler("tennantite", 0x63797a, DULL, 8, ORE));
        materials.add(germanite = new MaterialHandler("germanite", 0x877e7a, DULL, 8, ORE));
        materials.add(tanzanite = new MaterialHandler("tanzanite", 0x581a8f, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_tourmaline = new MaterialHandler("blue_tourmaline", 0x0f0aa3, GEM_HORIZONTAL, 8, GEM));
        materials.add(siderite = new MaterialHandler("siderite", 0x8a660b, METALLIC, 8, ORE));
        materials.add(cadmium_selenite = new MaterialHandler("cadmium_selenite", 0xbd3026, METALLIC, 8, ORE));
        materials.add(angelsite = new MaterialHandler("angelsite", 0x85807f, METALLIC, 8, ORE));
        materials.add(vanadinite = new MaterialHandler("vanadinite", 0xd93f21, METALLIC, 8, ORE));
        materials.add(erlichmanite = new MaterialHandler("erlichmanite", 0xada8a6, METALLIC, 8, ORE));
        materials.add(litharge = new MaterialHandler("litharge", 0xfc9d74, METALLIC, 8, ORE));
        materials.add(altaite = new MaterialHandler("altaite", 0x878787, METALLIC, 8, ORE));
        materials.add(dzhalindite = new MaterialHandler("dzhalindite", 0xe8c941, METALLIC, 8, ORE));
        materials.add(roquesite = new MaterialHandler("roquesite", 0xf78b6a, METALLIC, 8, ORE));
        materials.add(greenocklite = new MaterialHandler("greenocklite", 0xe38502, METALLIC, 8, ORE));
        materials.add(wulfenite = new MaterialHandler("wulfenite", 0xe33302, METALLIC, 8, ORE));
        materials.add(drysdalite = new MaterialHandler("drysdalite", 0xa69d9a, METALLIC, 8, ORE));
        materials.add(molybdite = new MaterialHandler("molybdite", 0xe34f1e, METALLIC, 8, ORE));
        materials.add(columbite = new MaterialHandler("columbite", 0xd9b886, METALLIC, 8, ORE));
        materials.add(rhodochrosite = new MaterialHandler("rhodochrosite", 0xc8c800, METALLIC, 8, ORE));
        materials.add(psilomelane = new MaterialHandler("psilomelane", 0x121110, METALLIC, 8, ORE));
        materials.add(turqoise = new MaterialHandler("turqoise", 0x69c7b1, SHINY, 8, ORE));
        materials.add(covellite = new MaterialHandler("covellite", 0x010147, METALLIC, 8, ORE));
        materials.add(gallite = new MaterialHandler("gallite", 0x66586e, METALLIC, 8, ORE));
        materials.add(digenite = new MaterialHandler("digenite", 0xc5d6f0, METALLIC, 8, ORE));
        materials.add(petalite = new MaterialHandler("petalite", 0xdfe2e8, METALLIC, 8, ORE));
        materials.add(middlebackite = new MaterialHandler("middlebackite", 0x2cdbbe, SHINY, 8, ORE));
        materials.add(triazolite = new MaterialHandler("triazolite", 0x2b7cff, METALLIC, 8, ORE));
        materials.add(zhemchuzhnikovite = new MaterialHandler("zhemchuzhnikovite", 0x99ff2b, METALLIC, 8, ORE));
        materials.add(chrysocolla = new MaterialHandler("chrysocolla", 0x4fcae3, METALLIC, 8, ORE));
        materials.add(livingstonite = new MaterialHandler("livingstonite", 0xa4aaab, METALLIC, 8, ORE));
        materials.add(aurostibite = new MaterialHandler("aurostibite", 0xb3a2bd, METALLIC, 8, ORE));
        materials.add(green_topaz = new MaterialHandler("green_topaz", 0x93f587, GEM_HORIZONTAL, 8, GEM));
        materials.add(orange_topaz = new MaterialHandler("orange_topaz", 0xde5b28, GEM_HORIZONTAL, 8, GEM));
        materials.add(white_topaz = new MaterialHandler("white_topaz", 0xfcf9f7, GEM_HORIZONTAL, 8, GEM));
        materials.add(red_topaz = new MaterialHandler("red_topaz", 0xfc403d, GEM_HORIZONTAL, 8, GEM));
        materials.add(pink_topaz = new MaterialHandler("pink_topaz", 0xe6a8db, GEM_HORIZONTAL, 8, GEM));
        materials.add(imperial_topaz = new MaterialHandler("imperial_topaz", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(black_topaz = new MaterialHandler("black_topaz", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(white_topaz = new MaterialHandler("white_topaz", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(black_flourite = new MaterialHandler("black_flourite", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(white_flourite = new MaterialHandler("white_flourite", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(cyan_flourite = new MaterialHandler("cyan_flourite", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(green_flourite = new MaterialHandler("green_flourite", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(red_flourite = new MaterialHandler("red_flourite", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_flourite = new MaterialHandler("blue_flourite", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(imperial_flourite = new MaterialHandler("imperial_flourite", 0xa11087, GEM_HORIZONTAL, 8, GEM));
        materials.add(magenta_flourite = new MaterialHandler("magenta_flourite", 0xf74dd9, GEM_HORIZONTAL, 8, GEM));
        materials.add(pink_flourite = new MaterialHandler("pink_flourite", 0xde95d1, GEM_HORIZONTAL, 8, GEM));
        materials.add(orange_flourite = new MaterialHandler("orange_flourite", 0xeb7242, GEM_HORIZONTAL, 8, GEM));
        materials.add(abelsonite = new MaterialHandler("abelsonite", 0xed4021, SHINY, 8, ORE));
        materials.add(millerite = new MaterialHandler("millerite", 0xd9d49a, METALLIC, 8, ORE));
        materials.add(gerdorffite = new MaterialHandler("gerdorffite", 0x536361, METALLIC, 8, ORE));
        materials.add(rammelsbergite = new MaterialHandler("rammelsbergite", 0x626351, DULL, 8, ORE));
        materials.add(villamaninite = new MaterialHandler("villamaninite", 0x404559, DULL, 8, ORE));
        materials.add(patronite = new MaterialHandler("patronite", 0x282829, SHINY, 8, ORE));
        materials.add(taenite = new MaterialHandler("taenite", 0xdedebd, DULL, 8, ORE));
        materials.add(vaesite = new MaterialHandler("vaesite", 0xe6e6e6, SHINY, 8, ORE));
        materials.add(nickeline = new MaterialHandler("nickeline", 0xd1a25c, SHINY, 8, ORE));
        materials.add(epidote = new MaterialHandler("epidote", 0xb0d669, DULL, 8, ORE));
        materials.add(hercynite = new MaterialHandler("hercynite", 0x8647e6, SHINY, 8, ORE));
        materials.add(xylit = new MaterialHandler("xylit", 0xa9a7ab, DULL, 8, ORE));
        materials.add(bathvillite = new MaterialHandler("bathvillite", 0xe0c48b, DULL, 8, ORE));
        materials.add(nephrite_jade = new MaterialHandler("nephrite_jade", 0x587d57, DULL, 8, ORE));
        materials.add(jade = new MaterialHandler("jade", 0xb8f0b6, SHINY, 8, ORE));
        materials.add(white_jade = new MaterialHandler("white_jade", 0xf3faf2, SHINY, 8, ORE));
        materials.add(purple_jade = new MaterialHandler("purple_jade", 0xe999f0, SHINY, 8, ORE));
        materials.add(green_jade = new MaterialHandler("green_jade", 0x113614, SHINY, 8, ORE));
        materials.add(cyan_jade = new MaterialHandler("cyan_jade", 0x71ebe7, SHINY, 8, ORE));
        materials.add(zirconia = new MaterialHandler("zirconia", 0x0000ff, GEM_HORIZONTAL, 8, GEM));
        materials.add(white_zircon = new MaterialHandler("white_zircon", 0xcacfce, GEM_HORIZONTAL, 8, GEM));
        materials.add(baddeleyite = new MaterialHandler("baddeleyite", 0x505453, METALLIC, 8, ORE));
        materials.add(tienmannite = new MaterialHandler("tienmannite", 0xfaf9eb, SHINY, 8, ORE));
        materials.add(stilleite = new MaterialHandler("stilleite", 0x1a1916, DULL, 8, ORE));
        materials.add(ferroselite = new MaterialHandler("ferroselite", 0x474641, SHINY, 8, ORE));
        materials.add(drysdallite = new MaterialHandler("drysdallite", 0x7d7b73, SHINY, 8, ORE));
        materials.add(slyvanite = new MaterialHandler("slyvanite", 0xa6a19a, DULL, 8, ORE));
        materials.add(alumina = new MaterialHandler("alumina", 0xedf2f1, DULL, 8, ORE));
        materials.add(bismoclite = new MaterialHandler("bismoclite", 0xe0ceb8, GEM_HORIZONTAL, 8, GEM));
        materials.add(bismuthinite = new MaterialHandler("bismuthinite", 0xb8a793, GEM_HORIZONTAL, 8, GEM));
        materials.add(bismite = new MaterialHandler("bismite", 0x944d18, GEM_HORIZONTAL, 8, GEM));
        materials.add(bauxite = new MaterialHandler("bauxite", 0x7a5549, DULL, 8, ORE));
        materials.add(kaolinite = new MaterialHandler("kaolinite", 0xc2c2c2, DULL, 8, ORE));
        materials.add(dumortierite = new MaterialHandler("dumortierite", 0x3e8ebd, DULL, 8, ORE));
        materials.add(gypsum = new MaterialHandler("gypsum", 0xb8b8b8, DULL, 8, ORE));
        materials.add(earlandite = new MaterialHandler("earlandite", 0xdbf5d3, DULL, 8, ORE));
        materials.add(lithium_chloride = new MaterialHandler("lithium_chloride", 0xf6faf5, DULL, 8, ORE));
        materials.add(sal_ammoniac = new MaterialHandler("sal_ammoniac", 0x1ff4ff, DULL, 8, ORE));
        materials.add(glauberite = new MaterialHandler("glauberite", 0xfafcf5, DULL, 8, ORE));
        materials.add(trona = new MaterialHandler("trona", 0xebe5bc, DULL, 8, ORE));
        materials.add(calcite = new MaterialHandler("calcite", 0xdedcd3, DULL, 8, ORE));
        materials.add(hanksite = new MaterialHandler("hanksite", 0xf5d790, DULL, 8, ORE));
        materials.add(feroxhyte = new MaterialHandler("feroxhyte", 0xe02f10, DULL, 8, ORE));
        materials.add(cervantite = new MaterialHandler("cervantite", 0xffd863, DULL, 8, ORE));
        materials.add(kamiokite = new MaterialHandler("kamiokite", 0x7a7259, DULL, 8, ORE));
        materials.add(periclase = new MaterialHandler("periclase", 0x58ad67, DULL, 8, ORE));
        materials.add(gahnite = new MaterialHandler("gahnite", 0xf2f0eb, GEM_HORIZONTAL, 8, GEM));
        materials.add(yellow_gahnite = new MaterialHandler("yellow_gahnite", 0xe6fc19, GEM_HORIZONTAL, 8, GEM));
        materials.add(blue_gahnite = new MaterialHandler("blue_gahnite", 0x2a54fa, GEM_HORIZONTAL, 8, GEM));
        materials.add(green_gahnite = new MaterialHandler("green_gahnite", 0x08bf0e, GEM_HORIZONTAL, 8, GEM));
        materials.add(ferropericlase = new MaterialHandler("ferropericlase", 0xa5c7a6, DULL, 8, ORE));
        materials.add(paramelaconite = new MaterialHandler("paramelaconite", 0xc88c14, DULL, 8, ORE));
        materials.add(acetamide = new MaterialHandler("acetamide", 0xf5f5f5, DULL, 8, ORE));
        materials.add(evenkite = new MaterialHandler("evenkite", 0xdedcdc, DULL, 8, ORE));
        materials.add(ozokerite = new MaterialHandler("ozokerite", 0x171616, DULL, 8, ORE));
        materials.add(carpathite = new MaterialHandler("carpathite", 0xfff185, DULL, 8, ORE));
        materials.add(asphaltite = new MaterialHandler("asphaltite", 0x050505, DULL, 8, ORE));
        materials.add(calclacite = new MaterialHandler("calclacite", 0xa3a398, DULL, 8, ORE));
        materials.add(chibaite = new MaterialHandler("chibaite", 0xc4c4bc, DULL, 8, ORE));
        materials.add(elaterite = new MaterialHandler("elaterite", 0x66664a, DULL, 8, ORE));
        materials.add(fichtelite = new MaterialHandler("fichtelite", 0xe8e8e8, DULL, 8, ORE));
        materials.add(guanine = new MaterialHandler("guanine", 0xe8e8e8, DULL, 8, ORE));
        materials.add(hoelite = new MaterialHandler("hoelite", 0xccbc60, DULL, 8, ORE));
        materials.add(idrialie = new MaterialHandler("idrialie", 0xa7c95d, DULL, 8, ORE));
        materials.add(kratochvilte = new MaterialHandler("kratochvilte", 0xaaaba7, DULL, 8, ORE));
        materials.add(shungite = new MaterialHandler("shungite", 0x191a18, DULL, 8, ORE));
        materials.add(tinnunculite = new MaterialHandler("tinnunculite", 0x898c87, DULL, 8, ORE));
        materials.add(uricite = new MaterialHandler("uricite", 0xaba595, DULL, 8, ORE));
        materials.add(wampenite = new MaterialHandler("wampenite", 0x946850, DULL, 8, ORE));
        materials.add(ravatite = new MaterialHandler("ravatite", 0x7d6b61, DULL, 8, ORE));
        materials.add(oil_sands = new MaterialHandler("oil_sands", 0x1f1c1b, DULL, 8, ORE));
        materials.add(tar_sands = new MaterialHandler("tar_sands", 0x1f1816, DULL, 8, ORE));
        materials.add(garnet_sands = new MaterialHandler("garnet_sands", 0xc93004, SHINY, 8, ORE));
        
        materials.add(leucite = new MaterialHandler("leucite", 0x1a1818, DULL, 8, ORE));
        materials.add(pollucite = new MaterialHandler("pollucite", 0xbdc2a9, DULL, 8, ORE));
        materials.add(carnallite = new MaterialHandler("carnallite", 0xab897b, DULL, 8, ORE));
        materials.add(zinnwaldite = new MaterialHandler("zinnwaldite", 0xbab4a9, DULL, 8, ORE));
        materials.add(rubidium_oxide = new MaterialHandler("rubidium_oxide", 0xa89b83, DULL, 8, ORE));
        materials.add(scandium_oxide = new MaterialHandler("scandium_oxide", 0xd1d0cd, DULL, 8, ORE));
        materials.add(brookite = new MaterialHandler("brookite", 0x4f270d, SHINY, 8, ORE));
        materials.add(anatase = new MaterialHandler("anatase", 0xb0aaa5, SHINY, 8, ORE));
        materials.add(titanite = new MaterialHandler("titanite", 0x629950, SHINY, 8, ORE));
        materials.add(akaogiite = new MaterialHandler("akaogiite", 0x969689, SGINY, 8, ORE));
        materials.add(perovskite = new MaterialHandler("perovskite", 0x707064, DULL, 8, ORE));
        materials.add(carnotite = new MaterialHandler("carnotite", 0x9e9e59, DULL, 8, ORE));
        materials.add(gallite = new MaterialHandler("gallite", 0x404039c, METALLIC, 8, ORE));
        materials.add(kernite = new MaterialHandler("kernite", 0xccccc0, DULL, 8, ORE));
        materials.add(borax = new MaterialHandler("borax", 0xb8b8b8, DULL, 8, ORE));
        materials.add(ulexite = new MaterialHandler("ulexite", 0x84857d, DULL, 8, ORE));
        materials.add(colemanite = new MaterialHandler("colemanite", 0xa3a189, DULL, 8, ORE));
        materials.add(boracite = new MaterialHandler("boracite", 0xd40d5c, DULL, 8, ORE));
        materials.add(painite = new MaterialHandler("painite", 0xbd261e, GEM_HORIZONTAL, 8, ORE));
        materials.add(amblygonite = new MaterialHandler("amblygonite", 0x8abf88, GEM_HORIZONTAL, 8, ORE));
        materials.add(elbaite = new MaterialHandler("elbaite", 0x299925, GEM_HORIZONTAL, 8, ORE));
        materials.add(eucryptite = new MaterialHandler("eucryptite", 0x969990, DULL, 8, ORE));
        materials.add(hectorite = new MaterialHandler("hectorite", 0x99967c, DULL, 8, ORE));
        materials.add(flur_liddicoatite = new MaterialHandler("flur_liddicoatite", 0xbd0bae, GEM_HORIZONTAL, 8, ORE));
        materials.add(lithiophilite = new MaterialHandler("lithiophilite", 0x827681, METALLIC, 8, ORE));
        materials.add(nambulite = new MaterialHandler("nambulite", 0x912613, GEM_HORIZONTAL, 8, ORE));
        materials.add(triphylite = new MaterialHandler("triphylite", 0x001709, GEM_HORIZONTAL, 8, ORE));
        materials.add(neptunite = new MaterialHandler("neptunite", 0x181c1a, METALLIC, 8, ORE));
        materials.add(pezzottaite = new MaterialHandler("pezzottaite", 0xd602b3, GEM_HORIZONTAL, 8, ORE));
        materials.add(zabuyelite = new MaterialHandler("zabuyelite", 0xbfa6bb, DULL, 8, ORE));
        materials.add(zinnwaldite = new MaterialHandler("zinnwaldite", 0xa8a89e, DULL, 8, ORE));
        materials.add(zektzerite = new MaterialHandler("zektzerite", 0xb5b591, DULL, 8, ORE));
        materials.add(phenakite = new MaterialHandler("phenakite", 0xc7c79d, GEM_HORIZONTAL, 8, ORE));
        materials.add(natron = new MaterialHandler("natron", 0xadada1,DULL, 8, ORE));
        materials.add(amphibole = new MaterialHandler("amphibole", 0x405737, DULL, 8, ORE));
        materials.add(zeolite = new MaterialHandler("zeolite", 0x73604f, DULL, 8, ORE));
        materials.add(cryolite = new MaterialHandler("cryolite", 0xabb6ba, DULL, 8, ORE));
        materials.add(feldspar = new MaterialHandler("feldspar", 0xb6b895, DULL, 8, ORE));
        materials.add(afganite = new MaterialHandler("afganite", 0x003fc7, DULL, 8, ORE));
        materials.add(khomyakovite = new MaterialHandler("khomyakovite", 0xc77e00, GEM_HORIZONTAL, 8, ORE));
        materials.add(kambaldaite = new MaterialHandler("Kambaldaite", 0x4fe300, DULL, 8, ORE));
        materials.add(ferrokentbrooksite = new MaterialHandler("ferrokentbrooksite", 0xe38800, GEM_HORIZONTAL, 8, ORE));
        materials.add(cyrilovite = new MaterialHandler("cyrilovite", 0xfaf600, GEM_HORIZONTAL, 8, ORE));
        materials.add(nenadkevichite = new MaterialHandler("nenadkevichite", 0xad6d55, GEM_HORIZONTAL, 8, ORE));
        materials.add(sampleite = new MaterialHandler("sampleite", 0x51f0e5, GEM_HORIZONTAL, 8, ORE));
        materials.add(thomsenolite = new MaterialHandler("thomsenolite", 0xccdb42, GEM_HORIZONTAL, 8, ORE));
        materials.add(villiaumite = new MaterialHandler("villiaumite", 0xf03400, GEM_HORIZONTAL, 8, ORE));
        materials.add(celestine = new MaterialHandler("celestine", 0xbad9d7, SHINY, 8, ORE));
        materials.add(xenotime = new MaterialHandler("xenotime", 0x2b2212, DULL, 8, ORE));
        materials.add(strontianite = new MaterialHandler("strontianite", 0xa69d8d, SHINY, 8, ORE));
        materials.add(simpsonite = new MaterialHandler("simpsonite", 0xc49645, DULL, 8, ORE));
        materials.add(coltan = new MaterialHandler("coltan", 0x3b3830, SHINY, 8, ORE));
        materials.add(argentite = new MaterialHandler("argentite", 0x0c2e45, SHINY, 8, ORE));
        materials.add(cerussite = new MaterialHandler("cerussite", 0x5b5e43, SHINY, 8, ORE));
        materials.add(chlorargyrite = new MaterialHandler("chlorargyrite", 0x786640, SHINY, 8, ORE));
        materials.add(sylvite = new MaterialHandler("sylvite", 0xba533c, SHINY, 8, ORE));
        materials.add(avogadrite = new MaterialHandler("avogadrite", 0xd1c179, DULL, 8, ORE));
        materials.add(rhodizite = new MaterialHandler("rhodizite", 0xa6cc8f, GEM_HORIZONTAL, 8, ORE));
        materials.add(benitoite = new MaterialHandler("benitoite", 0x0422c9, GEM_HORIZONTAL, 8, ORE));
        materials.add(lanthanite = new MaterialHandler("lanthanite", 0xb06256, DULL, 8, ORE));
        materials.add(hafnon = new MaterialHandler("hafnon", 0xb81c04, SHINY, 8, ORE));
        materials.add(crookesite = new MaterialHandler("crookesite", 0x5b4761, DULL, 8, ORE));
        materials.add(hutchinsonite = new MaterialHandler("hutchinsonite", 0x5d665e, DULL, 8, ORE));
        materials.add(lorándite = new MaterialHandler("lorándite", 0xc40024, DULL, 8, ORE));
        materials.add(bronze = new MaterialHandler("bronze", 0xbf7d1b, DULL, 8, ORE));
        
        //end random expanded compounds begin natives
        materials.add(lithium = new MaterialHandler("lithium", 0xb3ada6, METALLIC, 16, "Li", 454,  1603, ORE));
        materials.add(boron = new MaterialHandler("boron", 0x3b3834, METALLIC, 16, "B", 2349,  4200, ORE));
        materials.add(carbon = new MaterialHandler("carbon", 0x1f1e1e, DULL, 16, "C", 3915, ORE));
        materials.add(nitrogen = new MaterialHandler("nitrogen", 0xffffff, DULL, 16, "N", 63, 77, GAS));
        materials.add(oxygen = new MaterialHandler("oxygen", 0x5cb4d6, DULL, 16, "O", 54, 155, GAS));        
        materials.add(fluorine = new MaterialHandler("fluorine", 0xcbcf59, DULL, 16, "F", 53, 85, GAS));        
        materials.add(neon = new MaterialHandler("neon", 0xe88b00, DULL, 16, "Ne", 25, 27, GAS)); 
        materials.add(sodium = new MaterialHandler("sodium", 0x888c99, METALLIC, 16, "Na", 371,  1156, ORE));
        materials.add(magnesium = new MaterialHandler("magnesium", 0x9e9e9e, METALLIC, 16, "Mg", 923,  1363, ORE));
        materials.add(aluminium = new MaterialHandler("aluminium", 0xa7cfcf, METALLIC, 16, "Al", 933,  2743, ORE));
        materials.add(silicon = new MaterialHandler("silicon", 0x3f6891, METALLIC, 16, "Si", 1687,  3538, ORE));
        materials.add(white_phosphorus = new MaterialHandler("white_phosphorus", 0xdbdbdb, DULL, 16, "P", 317, 553, ORE));
        materials.add(red_phosphorus = new MaterialHandler("red_phosphorus", 0xc44545, DULL, 16, "P", 893, ORE));
        materials.add(violet_phosphorus = new MaterialHandler("violet_phosphorus", 0x73416e, DULL, 16, "P", 690, ORE));
        materials.add(sulfur = new MaterialHandler("sulfur", 0xf6ff00, DULL, 16, "S", 388, 718, ORE));
        materials.add(chlorine = new MaterialHandler("chlorine", 0xa5ab02, DULL, 16, "Cl", 172, 239, GAS));        
        materials.add(argon = new MaterialHandler("argon", 0xe000e0, DULL, 16, "Ar", 84, 87, GAS));        
        materials.add(potassium = new MaterialHandler("potassium", 0x6a787d, METALLIC, 16, "K", 337,  1032, ORE));
        materials.add(calcium = new MaterialHandler("calcium", 0x9e9c86, METALLIC, 16, "Ca", 1115,  1757, ORE));
        materials.add(scandium = new MaterialHandler("scandium", 0xc4c4bc, METALLIC, 16, "Sc", 1814,  3109, ORE));
        materials.add(titanium = new MaterialHandler("titanium", 0x8c8c8c, METALLIC, 16, "Ti", 1941,  3560, ORE));
        materials.add(vanadium = new MaterialHandler("vanadium", 0x627e9e, METALLIC, 16, "V", 2183,  3680, ORE));
        materials.add(chromium = new MaterialHandler("chromium", 0xd6cdc9, METALLIC, 16, "Cr", 2180,  2944, ORE));
        materials.add(manganese = new MaterialHandler("manganese", 0xbabfba, METALLIC, 16, "Mn", 1519, 2334, ORE));
        materials.add(iron = new MaterialHandler("iron", 0xb8b8b8, METALLIC, 16, "Fe", 1811,  3134, ORE));
        materials.add(cobalt = new MaterialHandler("cobalt", 0xabb0a7, METALLIC, 16, "Co", 1768,  3200, ORE));
        materials.add(nickel = new MaterialHandler("nickel", 0xa5a88f, METALLIC, 16, "Ni", 1768,  3003, ORE));
        materials.add(zinc = new MaterialHandler("zinc", 0xbdbcb5, METALLIC, 16, "Zn", 693,  1180, ORE));
        materials.add(gallium = new MaterialHandler("gallium", 0xafc9c6, METALLIC, 16, "Ga", 303,  2673, ORE));
        materials.add(germanium = new MaterialHandler("germanium", 0xcccccc, METALLIC, 16, "Ga", 1211,  3106, ORE));      
        materials.add(arsenic = new MaterialHandler("arsenic", 0xe6e487, METALLIC, 16, "As", 887, ORE)); 
        materials.add(metal_selenium = new MaterialHandler("metal_selenium", 0xaa9fc4, DULL, 16, "Se", 494, 958, ORE));
        materials.add(blood_selenium = new MaterialHandler("blood_selenium", 0xcf4853, DULL, 16, "Se", 494, 958, ORE));
        materials.add(bromine = new MaterialHandler("bromine", 0x300b0e, DULL, 16, "Br", 265, 332, FLUID));
        materials.add(krypton = new MaterialHandler("krypton", 0xc3d4d6, DULL, 16, "Kr", 116, 120, GAS));
        materials.add(rubidium = new MaterialHandler("rubidium", 0xc9bdc6, METALLIC, 16, "Rb", 312,  961, ORE));
        materials.add(strontium = new MaterialHandler("strontium", 0xbaaf75, METALLIC, 16, "Sr", 1050,  1650, ORE));
        materials.add(yttrium = new MaterialHandler("yttrium", 0xc2c1bc, METALLIC, 16, "Y", 1799,  3203, ORE));
        materials.add(zirconium = new MaterialHandler("zirconium", 0xb4bdb1, METALLIC, 16, "Zr", 2128,  1855, ORE));
        materials.add(niobium = new MaterialHandler("niobium", 0x809cc4, METALLIC, 16, "Nb", 2750,  5017, ORE));
        materials.add(molybdenum = new MaterialHandler("molybdenum", 0x3b3c3d, METALLIC, 16, "Mo", 2896,  4912, ORE));
        materials.add(technetium = new MaterialHandler("technetium", 0x9d9d9e, METALLIC, 16, "Tc", 2430,  4538));
        materials.add(ruthenium = new MaterialHandler("ruthenium",  0xc2c2c4, METALLIC, 16, "Ru",2719, 4701, ORE));
        materials.add(rhodium = new MaterialHandler("rhodium",  0xc4afbd, METALLIC, 16, "Rh",2237,  3968, ORE));
        materials.add(palladium = new MaterialHandler("palladium",  0xd1cdd0, METALLIC, 16, "Pd",1828,  3236, ORE));
        materials.add(silver = new MaterialHandler("silver",  0x9e9e9e, METALLIC, 16, "Ag",1235, 2435, ORE));
        materials.add(cadmium = new MaterialHandler("cadmium",  0x8a9696, METALLIC, 16, "Cd",594 ,  1040, ORE));
        materials.add(indium = new MaterialHandler("indium",  0xbbc4c4, METALLIC, 16, "In",430 ,  2345, ORE));
        materials.add(tin = new MaterialHandler("tin",  0xbab9a4, METALLIC, 16, "Sn",505 ,  2875, ORE));
        materials.add(antimony = new MaterialHandler("antimony",  0xb8b8b6, METALLIC, 16, "Sb",904 ,  1908, ORE));
        materials.add(tellurium = new MaterialHandler("tellurium",  0x2b2b27, METALLIC, 16, "Te",723 ,  1261, ORE));
        materials.add(iodine = new MaterialHandler("iodine", 0x87017c, DULL, 16, "I", 387, 457, ORE));
        materials.add(xenon = new MaterialHandler("xenon", 0x36a3cf, DULL, 16, "Xe", 161, 165, GAS)); 
        materials.add(caesium = new MaterialHandler("caesium",  0xd6d6b0, METALLIC, 16, "Cs",302, 944, ORE));
        materials.add(barium = new MaterialHandler("barium",  0xbfbfac, METALLIC, 16, "Ba",1000, 2118, ORE));
        materials.add(caesium = new MaterialHandler("caesium",  0xf0f0f5, METALLIC, 16, "Cs",302, 944, ORE));
        materials.add(lanthanum = new MaterialHandler("lanthanum",  0xb0b090, METALLIC, 16, "La",1193, 3737, ORE));
        materials.add(caesium = new MaterialHandler("cerium",  0xa8a8a7, METALLIC, 16, "Cs",1068, 3716, ORE));
        materials.add(praseodymium = new MaterialHandler("praseodymium",  0x9e9e83, METALLIC, 16, "Pr",1208, 3403, ORE));
        materials.add(neodymium = new MaterialHandler("neodymium",  0xc4c4b9, METALLIC, 16, "Pr",1297, 	3347, ORE));
        materials.add(promethium = new MaterialHandler("promethium", 0xd663c7, METALLIC, 16, "Pm", 1315,  3273));
        materials.add(samarium = new MaterialHandler("samarium",  0xbfcca7, METALLIC, 16, "Sm",1345, 2173, ORE));
        materials.add(europium = new MaterialHandler("europium",  0xdfe3a3, METALLIC, 16, "Eu",1099, 1802, ORE));
        materials.add(gadolinium = new MaterialHandler("gadolinium",  0x9dba9c, METALLIC, 16, "Gd",1585, 3273, ORE));
        materials.add(dysprosium = new MaterialHandler("dysprosium",  0x696455, METALLIC, 16, "Dy",1629, 3396, ORE));
        materials.add(holmium = new MaterialHandler("holmium",  0xbab6ab, METALLIC, 16, "Ho",1734, 2873, ORE));
        materials.add(erbium = new MaterialHandler(" erbium",  0xcccac6, METALLIC, 16, "Er",1802, 3141, ORE));
        materials.add(thulium = new MaterialHandler("thulium",  0x82817e, METALLIC, 16, "Tm",1818, 2223, ORE));
        materials.add(ytterbium = new MaterialHandler("ytterbium",  0xd6d0bf, METALLIC, 16, "Yb",1097, 1469, ORE));
        materials.add(lutetium = new MaterialHandler("lutetium",  0x545351, METALLIC, 16, "Lu",1925, 3675, ORE));
        materials.add(hafnium = new MaterialHandler("hafnium",  0xb0aca5, METALLIC, 16, "Hf",2506, 4876, ORE));
        materials.add(tantalum = new MaterialHandler("tantalum",  0x94a0a1, METALLIC, 16, "Ta",3290, 5731, ORE));
        materials.add(tungsten = new MaterialHandler("tungsten",  0xbac1c2, METALLIC, 16, "W",3695, 6203, ORE));
        materials.add(rhenium = new MaterialHandler("rhenium",  0x607073, METALLIC, 16, "Re",3459, 5903, ORE));
        materials.add(osmium = new MaterialHandler("osmium",  0x7cabcc, METALLIC, 16, "Os",3306, 5285, ORE));
        materials.add(terbium = new MaterialHandler("terbium",  0xf0f0f5, METALLIC, 16, "Tb",1629, 3396, ORE));
        materials.add(platinum = new MaterialHandler("platinum",  0xcccecf, METALLIC, 16, "Pt",2041, 4098, ORE));
        materials.add(mercury = new MaterialHandler("mercury", 0x64b464, METALLIC, 16, "Hg", 234, 630, FLUID));
        materials.add(thallium = new MaterialHandler("thallium", 0x909191, METALLIC, 16, "Tl", 577, 1746, ORE));
        materials.add(lead = new MaterialHandler("lead", 0x373b3b, METALLIC, 16, "Pb", 601, 2022, ORE));
        materials.add(bismuth = new MaterialHandler("bismuth", 0x7d786a, METALLIC, 16, "Bi", 545, 1837, ORE));
        materials.add(polonium = new MaterialHandler("polonium", 0xb7ccb6, METALLIC, 16, "Po", 527,  1235));
        materials.add(astatine = new MaterialHandler("astatine", 0xc9c9c9, METALLIC, 16, "At"));
        materials.add(radon = new MaterialHandler("Radon", 0xa89b92, METALLIC, 16, "Rn", GAS));
        materials.add(francium = new MaterialHandler("francium", 0x915e3a, METALLIC, 16, "Fr", 300, 950));
        materials.add(radium = new MaterialHandler("radium", 0x64b464, METALLIC, 16, "Ra", 973, 2010));
        materials.add(actinium = new MaterialHandler("actinium", 0x90c1d6, METALLIC, 16, "Ac", 1500, 3615));
        materials.add(protactinium = new MaterialHandler("protactinium", 0xc4c49d, METALLIC, 16, "Pa", 1841, 4300, ORE));
        materials.add(uranium_235 = new MaterialHandler("uranium_235", 0x828a81, METALLIC, 16, "U", 1405, 4404, ORE));
        materials.add(uranium_238 = new MaterialHandler("uranium_238", 0x9cb099, METALLIC, 16, "U", 1405, 4404, ORE));
        materials.add(neptunium = new MaterialHandler("neptunium", 0xa8a8a5, METALLIC, 16, "Np", 913, 4447, ORE));
        materials.add(plutonium_238 = new MaterialHandler("plutonium_238", 0xcc1010, METALLIC, 16, "Pu", 913, 3505, ORE));
        materials.add(plutonium_241 = new MaterialHandler("plutonium_241", 0xb3b3ad, METALLIC, 16, "Pu", 913, 3505, ORE));
        materials.add(plutonium_244 = new MaterialHandler("plutonium_244", 0xcfcfca, METALLIC, 16, "Pu", 913, 3505, ORE));
        materials.add(americium = new MaterialHandler("americium", 0xa8a896, METALLIC, 16, "Am", 1449, 2880, ORE));
        materials.add(curium = new MaterialHandler("curium", 0x808a7b, METALLIC, 16, "Cu", 	1613, 3383, ORE));
        materials.add(neutronium = new MaterialHandler("neutronium", 0x64b464, METALLIC, 16, "Neu", 3321, 6331, ORE));
        materials.add(naquadah = new MaterialHandler("naquadah", 0x511599, METALLIC, 16, "Naqh", 4378, 8335, ORE));
        materials.add(naquada = new MaterialHandler("naquada", 0x7608fc, METALLIC, 16, "Naqa", 4378, 8335, ORE));
        materials.add(naquadria = new MaterialHandler("naquadria", 0x7924e0, METALLIC, 16, "Naia", 4378, 8335, ORE));
        //theoretical compounds
        materials.add(naquaxide = new MaterialHandler("naquaxide", 0xc204db, METALLIC, 16, 8000, 1200, ORE));
        materials.add(naqyrite = new MaterialHandler("naqyrite", 0x773ec7, METALLIC, 16, 8000, 1200, ORE));
        materials.add(naquintrinide = new MaterialHandler("naquintrinide", 0x533dbf, METALLIC, 16, 8000, 1200, ORE));
        materials.add(curite = new MaterialHandler("curite", 0xba206d, METALLIC, 16, ORE));
        materials.add(curaumaga = new MaterialHandler("curaumaga", 0x0027d4, METALLIC, 16, ORE));
        materials.add(maganite = new MaterialHandler("maganite", 0xab2035, METALLIC, 16, ORE));
        materials.add(lincolnite = new MaterialHandler("lincolnite", 0xededed, METALLIC, 16, ORE));
        materials.add(marianite = new MaterialHandler("marianite", 0xe6cccc, METALLIC, 16, ORE));
        materials.add(mithril = new MaterialHandler("mithril", 0x2599db, METALLIC, 16, 8000, 1200, ORE)); //platinum
        materials.add(midasium = new MaterialHandler("midasium", 0xdbaa25, METALLIC, 16, 8000, 1200, ORE)); //gold
        materials.add(adamantium = new MaterialHandler("adamantinum", 0x8c7781, METALLIC, 16, 8000, 1200, ORE)); //tungsten
        materials.add(rubracium = new MaterialHandler("adamantinum", 0xa17a8c, METALLIC, 16, 8000, 1200, ORE)); //chrome
        materials.add(orichalcum = new MaterialHandler("orichalcum", 0x40cf58, METALLIC, 16, 8000, 1200, ORE)); //copper
        materials.add(selenigum = new MaterialHandler("selenigum", 0x34c7b1, METALLIC, 16, 8000, 1200, ORE)); //selenium
        materials.add(atlarus = new MaterialHandler("atlarus", 0xb9cc0a, METALLIC, 16, 8000, 1200, ORE)); //palladium
        materials.add(eximite = new MaterialHandler("eximite", 0x411852, METALLIC, 16, 8000, 1200, ORE)); //osmium
        materials.add(meutoite = new MaterialHandler("meutoite", 0x9612cc, METALLIC, 16, 8000, 1200, ORE)); //iridium
        materials.add(korboranium = new MaterialHandler("korboranium", 0x083ec7, METALLIC, 16, 8000, 1200, ORE)); //cobalt
        materials.add(byzantinite = new MaterialHandler("byzantinite", 0x390157, METALLIC, 16, 8000, 1200, ORE)); //tin
        materials.add(ceruclase = new MaterialHandler("ceruclase", 0x4fa5c4, METALLIC, 16, 8000, 1200, ORE)); //sodium
        materials.add(sanguinite = new MaterialHandler("sanguinite", 0xff0400, METALLIC, 16, 8000, 1200, ORE)); //plutonium
        materials.add(vulcanium = new MaterialHandler("vulcanium", 0xff8c00, METALLIC, 16, 8000, 1200, ORE)); //magnesium
        materials.add(kalendrite = new MaterialHandler("kalendrite", 0x986cbd, METALLIC, 16, 8000, 1200, ORE)); //Rhodium
        materials.add(hanninium = new MaterialHandler("hanninium", 0xacbfa1, METALLIC, 16, 8000, 1200, ORE)); //rhenium
        materials.add(deep_iron = new MaterialHandler("deep_iron", 0x272e3b, METALLIC, 16, 8000, 1200, ORE)); //iron
        materials.add(vyroxeres = new MaterialHandler("vyroxeres", 0x3ed602, METALLIC, 16, 8000, 1200, ORE)); //uranium
        
        flintToolTypes = new ArrayList<Pair<ToolType, Integer>>(){{
                add(new Pair<>(ToolType.PICKAXE, 0));
        }};

        stoneToolTypes = new ArrayList<Pair<ToolType, Integer>>(){{
            add(new Pair<>(ToolType.PICKAXE, 0));
        }};


        materials.add(flint = new MaterialHandler("flint", 0x002040, CUBE, 20, 10, 20, 20F, 1F, flintToolTypes, TOOL_HEAD, TOOL_WEDGE, TOOL_WEDGE_HANDLE));

        materials.add(stone = new MaterialHandler("stone", 0x808080, CUBE_SHINY, 40, 20, 40, 40F, 2F, flintToolTypes, TOOL_HEAD, TOOL_WEDGE, TOOL_WEDGE_HANDLE));
    }

    public static void clientInit() {
        for(MaterialHandler material : materials) {
            material.registerColorHandlerForBlock();
            material.registerColorForItem();
        }
    }
}
