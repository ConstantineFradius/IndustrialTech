package mightydanp.industrialtech.api.common.items;

import com.mojang.datafixers.util.Pair;;
import mightydanp.industrialtech.api.common.libs.EnumMaterialTextureFlags;
import mightydanp.industrialtech.api.common.libs.ITToolType;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MightyDanp on 3/29/2021.
 */
public class ToolHeadItem extends Item {
    public String material;
    public String element;
    public int color;
    public EnumMaterialTextureFlags textureFlag;
    public int temperature;
    public int meltingPoint;
    public int boilingPoint;
    public int efficiency;
    public int durability;
    public List<Pair<ToolType,Integer>> itToolType;
    public float attackDamage;
    public float weight;
    public int maxDamage;

    public ToolHeadItem(Item.Properties properties, String materialIn, String elementIn, int colorIn, EnumMaterialTextureFlags textureFlagIn, int boilingPointIn, int meltingPointIn, int efficiencyIn, int durabilityIn, float attackDamageIn, float weightIn, List<Pair<ToolType, Integer>> itToolTypeIn) {
        super(properties);
        material = materialIn;
        color = colorIn;
        textureFlag = textureFlagIn;
        meltingPoint = meltingPointIn;
        boilingPoint = boilingPointIn;
        element = elementIn;
        efficiency = efficiencyIn;
        durability = durabilityIn;
        attackDamage = attackDamageIn;
        weight = weightIn;
        itToolType = itToolTypeIn;
        properties.stacksTo(1);
        maxDamage = durabilityIn;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return maxDamage;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add(ITextComponent.nullToEmpty(element));
        if(durability != 0) {
            tooltip.add(ITextComponent.nullToEmpty("durability:" + (durability -stack.getDamageValue()) + "/" + durability));
        }
        if(efficiency != 0) {
            tooltip.add(ITextComponent.nullToEmpty("efficiency:" + efficiency));
        }

        if (meltingPoint != 0) {
            tooltip.add(ITextComponent.nullToEmpty("Melting Point of" + " §5" + meltingPoint));
        }
        if (boilingPoint != 0) {
            tooltip.add(ITextComponent.nullToEmpty("Boiling Point of" + " §5" + boilingPoint));
        }

        if (temperature == boilingPoint) {
            tooltip.add(ITextComponent.nullToEmpty("§5" + "Hot"));
        }

        if(element != null) {
            tooltip.add(ITextComponent.nullToEmpty(element));
        }

        if(itToolType != null) {
            for(Pair<ToolType,Integer> toolType : itToolType) {
                tooltip.add(ITextComponent.nullToEmpty(toolType.getFirst().getName() + " level: " + toolType.getSecond()));
            }
        }
    }
    public void setElement(String elementIn) {
        element = elementIn;
    }

    public void setBoilingPoint(int boilingPointIn){
        this.boilingPoint = boilingPointIn;
    }

    public void setMeltingPoint (int meltingPointIn){
        meltingPoint = meltingPointIn;
    }

    public int getTemperature(){
        return temperature;
    }

    public List<Pair<ToolType, Integer>> getItToolType() {
        return itToolType;
    }
}