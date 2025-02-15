package mightydanp.industrialtech.client.rendering.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import mightydanp.industrialtech.api.client.helper.RenderHelper;
import mightydanp.industrialtech.common.tileentities.CampfireTileEntityOverride;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.BlockFaceUV;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3f;

/**
 * Created by MightyDanp on 5/9/2021.
 */
public class CampfireModel extends Model {

    private ModelRenderer log1;
    private ModelRenderer log2;
    private ModelRenderer log3;

    private ModelRenderer log4;
    private ModelRenderer ash;

    private CampfireTileEntityOverride campfireTileEntityOverride;

    public CampfireModel(CampfireTileEntityOverride campfireTileEntityOverrideIn) {
        super(RenderType::entitySolid);
        campfireTileEntityOverride = campfireTileEntityOverrideIn;
        texWidth = 16;
        texHeight = 16; }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        matrixStack.pushPose();
        if(campfireTileEntityOverride != null){
            ItemStack logItemStack = campfireTileEntityOverride.getLogItemSlots().get(0);
            RenderHelper.renderUVCube(matrixStack, iVertexBuilder, packedLight, packedOverlay, red, green, blue, alpha, texHeight, texWidth, new AxisAlignedBB(1, 0, 0, 5, 4, 16),
                    new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                    new BlockFaceUV(new float[]{0, 0, 16, 4}, 0),
                    new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                    new BlockFaceUV(new float[]{16, 0, 0, 4}, 0),
                    new BlockFaceUV(new float[]{0, 0, 16, 4}, 90),
                    new BlockFaceUV(new float[]{0, 0, 16, 4}, 90));
            //log 2
            if (logItemStack != ItemStack.EMPTY && logItemStack.getCount() > 2) {
                RenderHelper.renderUVCube(matrixStack, iVertexBuilder, packedLight, packedOverlay, red, green, blue, alpha, texHeight, texWidth, new AxisAlignedBB(11, 0, 0, 15, 4, 16),
                        new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 0),
                        new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                        new BlockFaceUV(new float[]{16, 0, 0, 4}, 0),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 90),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 90));
            }

            //log 3
            if (logItemStack != ItemStack.EMPTY && logItemStack.getCount() > 3) {
                RenderHelper.renderUVCube(matrixStack, iVertexBuilder, packedLight, packedOverlay, red, green, blue, alpha, texHeight, texWidth, new AxisAlignedBB(0, 3, 11, 16, 7, 15),
                        new BlockFaceUV(new float[]{16, 0, 0, 4}, 0),
                        new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 0),
                        new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 0),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 0));
            }

            //log 4
            if (logItemStack != ItemStack.EMPTY && logItemStack.getCount() > 4) {
                RenderHelper.renderUVCube(matrixStack, iVertexBuilder, packedLight, packedOverlay, red, green, blue, alpha, texHeight, texWidth, new AxisAlignedBB(0, 3, 1, 16, 7, 5),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 0),
                        new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                        new BlockFaceUV(new float[]{16, 0, 0, 4}, 0),
                        new BlockFaceUV(new float[]{0, 4, 4, 8}, 0),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 0),
                        new BlockFaceUV(new float[]{0, 0, 16, 4}, 0));
            }

            //ash
            if (campfireTileEntityOverride.getCampfireNBT().getHaveAsh()) {
                RenderHelper.renderUVCube(matrixStack, iVertexBuilder, packedLight, packedOverlay, red, green, blue, alpha, texHeight, texWidth, new AxisAlignedBB(5, 0, 0, 11, 1, 16),
                        new BlockFaceUV(new float[]{0, 15, 6, 16}, 0),
                        new BlockFaceUV(new float[]{0, 0, 0, 0}, 0),
                        new BlockFaceUV(new float[]{10, 15, 16, 16}, 0),
                        new BlockFaceUV(new float[]{0, 0, 0, 0}, 0),
                        new BlockFaceUV(new float[]{0, 8, 16, 14}, 90),
                        new BlockFaceUV(new float[]{0, 8, 16, 14}, 90));
            }
        }

        matrixStack.mulPose(Vector3f.YP.rotationDegrees(180));

        matrixStack.popPose();
    }


/*
    public void drawTextureQuad(AxisAlignedBB axisAlignedBB, Vector4f north, Vector4f east, Vector4f south, Vector4f west, Vector4f top, Vector4f bottom){
        ModelRenderer.PositionTextureVertex(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ, minU, minV);
        ModelRenderer.PositionTextureVertex(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ, minU, minV);
        ModelRenderer.PositionTextureVertex(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ, 0.0F, 0.0F);
        ModelRenderer.PositionTextureVertex(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ, 0.0F, 0.0F);
    }
    */
        //uv is x, y                                                                                                                       u,   v
        //ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex7 = new ModelRenderer.PositionTextureVertex(x, y, z, 0.0F, 0.0F);
}
