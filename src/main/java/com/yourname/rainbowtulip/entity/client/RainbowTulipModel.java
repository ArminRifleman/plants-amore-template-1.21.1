package com.yourname.rainbowtulip.entity.client;

import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class RainbowTulipModel extends EntityModel<RainbowTulipEntity> {

    public static final EntityModelLayer LAYER_LOCATION =
        new EntityModelLayer(Identifier.of("rainbowtulip", "rainbow_tulip"), "main");

    private final ModelPart bone6;
    private final ModelPart bone14;
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone7;
    private final ModelPart bone13;
    private final ModelPart bone8;
    private final ModelPart bone9;
    private final ModelPart bone12;
    private final ModelPart bone10;
    private final ModelPart bone11;

    public RainbowTulipModel(ModelPart root) {
        this.bone6  = root.getChild("bone6");
        this.bone14 = this.bone6.getChild("bone14");
        this.bone4  = this.bone14.getChild("bone4");
        this.bone5  = this.bone14.getChild("bone5");
        this.bone2  = this.bone6.getChild("bone2");
        this.bone3  = this.bone6.getChild("bone3");
        this.bone7  = root.getChild("bone7");
        this.bone13 = this.bone7.getChild("bone13");
        this.bone8  = this.bone13.getChild("bone8");
        this.bone9  = this.bone13.getChild("bone9");
        this.bone12 = this.bone13.getChild("bone12");
        this.bone10 = this.bone7.getChild("bone10");
        this.bone11 = this.bone7.getChild("bone11");
    }

    public static TexturedModelData createBodyLayer() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        ModelPartData bone6 = root.addChild("bone6",
            ModelPartBuilder.create().uv(2, 16).cuboid(-4.3F, 12.7685F, -0.5444F, 2, 5, 0),
            ModelTransform.of(6.3F, 8.2F, 4.2F, -0.3927F, 0.7418F, 0.0F));

        bone6.addChild("cube_r1",
            ModelPartBuilder.create().uv(1, 23).cuboid(-0.3226F, -7.6066F, 0.5569F, 4, 8, 0),
            ModelTransform.of(-3.6F, 12.9F, -1.2F, -0.48F, -0.3054F, -1.7453F));
        bone6.addChild("cube_r2",
            ModelPartBuilder.create().uv(1, 23).cuboid(-1.0151F, -8.3454F, 0.1691F, 4, 8, 0),
            ModelTransform.of(-2.5F, 13.6F, -1.0F, -0.7697F, 0.2201F, 0.1115F));
        bone6.addChild("cube_r3",
            ModelPartBuilder.create().uv(1, 23).cuboid(-1.7272F, -8.4558F, 1.271F, 4, 8, 0),
            ModelTransform.of(-3.3F, 15.3F, -0.5F, 1.2679F, 0.0134F, 1.0762F));

        ModelPartData bone14 = bone6.addChild("bone14",
            ModelPartBuilder.create().uv(27, 0).cuboid(-1.9F, -20.0315F, 0.2556F, 4, 15, 0),
            ModelTransform.of(-3.4F, 22.4194F, 1.1134F, 2.4937F, -0.9792F, -2.5189F));

        ModelPartData bone4 = bone14.addChild("bone4",
            ModelPartBuilder.create(),
            ModelTransform.pivot(3.4F, -17.8F, 0.8F));
        bone4.addChild("cube_r4",  ModelPartBuilder.create().uv(24, 26).cuboid(-2.309F,  -3.6903F, 1.4878F, 4, 3, 0), ModelTransform.of(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone4.addChild("cube_r5",  ModelPartBuilder.create().uv(26, 16).cuboid(-0.6673F, -4.8315F, 0.9109F, 3, 4, 0), ModelTransform.of(-2.1F, 0.1F,  -1.4F, 0.0F,    1.309F,   0.0F));
        bone4.addChild("cube_r6",  ModelPartBuilder.create().uv(12, 24).cuboid(-1.5399F, -8.7201F, 1.0034F, 3, 8, 0), ModelTransform.of(-0.2F, 0.7F,  -0.4F, 0.0F,   -0.6981F,  0.5236F));
        bone4.addChild("cube_r7",  ModelPartBuilder.create().uv(12, 24).cuboid(-1.0971F, -8.7201F, 0.4689F, 3, 8, 0), ModelTransform.of(-1.2F, 0.0F,  -1.7F, 0.0F,    0.6981F,  0.5236F));
        bone4.addChild("cube_r8",  ModelPartBuilder.create().uv(22, 15).cuboid(-1.7682F, -6.0185F,-3.4685F, 0, 6, 5), ModelTransform.of(0.0F,  1.6F,   1.9F, 0.7854F,  0.0F,    1.9635F));
        bone4.addChild("cube_r9",  ModelPartBuilder.create().uv(24, 26).cuboid(-2.1722F, -2.5548F, 1.763F,  4, 3, 0), ModelTransform.of(1.6F, -0.2F,  -1.4F, 2.4435F, -0.5236F,  0.0F));
        bone4.addChild("cube_r10", ModelPartBuilder.create().uv(26, 16).cuboid(-1.2983F, -4.8315F, 0.8278F, 3, 4, 0), ModelTransform.of(0.0F,  0.1F,   0.1F, 0.0F,   -1.0472F,  0.0F));
        bone4.addChild("cube_r11", ModelPartBuilder.create().uv(24, 26).cuboid(-2.159F,  -2.1667F, 1.3004F, 4, 3, 0), ModelTransform.of(1.1F, -0.2F,   1.0F,-0.6981F, -0.48F,   3.1416F));

        ModelPartData bone5 = bone14.addChild("bone5",
            ModelPartBuilder.create(),
            ModelTransform.of(-3.2F, -15.8F, 0.4F, -3.1416F, 0.0F, 3.1416F));
        bone5.addChild("cube_r12", ModelPartBuilder.create().uv(24, 26).cuboid(-1.6209F, -3.671F,  1.4648F, 4, 3, 0), ModelTransform.of(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone5.addChild("cube_r13", ModelPartBuilder.create().uv(26, 16).cuboid(-1.3327F, -4.8315F, 1.0891F, 3, 4, 0), ModelTransform.of(-2.1F, 0.1F,  -1.4F, 0.0F,    1.309F,   0.0F));
        bone5.addChild("cube_r14", ModelPartBuilder.create().uv(12, 24).cuboid(-1.0971F, -8.7201F, 1.5311F, 3, 8, 0), ModelTransform.of(-0.2F, 0.7F,  -0.4F, 0.0F,   -0.6981F,  0.5236F));
        bone5.addChild("cube_r15", ModelPartBuilder.create().uv(12, 24).cuboid(-1.5399F, -8.7201F, 0.9966F, 3, 8, 0), ModelTransform.of(-1.2F, 0.0F,  -1.7F, 0.0F,    0.6981F,  0.5236F));
        bone5.addChild("cube_r16", ModelPartBuilder.create().uv(22, 15).cuboid(-1.7682F, -5.5315F,-2.9815F, 0, 6, 5), ModelTransform.of(0.0F,  1.6F,   1.9F, 0.7854F,  0.0F,    1.9635F));
        bone5.addChild("cube_r17", ModelPartBuilder.create().uv(24, 26).cuboid(-1.8278F, -2.1713F, 1.306F,  4, 3, 0), ModelTransform.of(1.6F, -0.2F,  -1.4F, 2.4435F, -0.5236F,  0.0F));
        bone5.addChild("cube_r18", ModelPartBuilder.create().uv(26, 16).cuboid(-0.7017F, -4.8315F, 1.1722F, 3, 4, 0), ModelTransform.of(0.0F,  0.1F,   0.1F, 0.0F,   -1.0472F,  0.0F));
        bone5.addChild("cube_r19", ModelPartBuilder.create().uv(24, 26).cuboid(-1.841F,  -2.5594F, 1.7685F, 4, 3, 0), ModelTransform.of(1.1F, -0.2F,   1.0F,-0.6981F, -0.48F,   3.1416F));

        ModelPartData bone2 = bone6.addChild("bone2",
            ModelPartBuilder.create(),
            ModelTransform.of(-2.4F, 13.6F, -3.0F, 0.0F, -2.1817F, 0.0F));
        bone2.addChild("cube_r20", ModelPartBuilder.create().uv(0, 7).cuboid(-2.7425F, -6.6463F, 0.4291F, 6, 6, 0), ModelTransform.of(0.0F, 0.0F,  0.0F,  2.6612F, 0.0387F, 3.1214F));
        bone2.addChild("cube_r21", ModelPartBuilder.create().uv(1, 0).cuboid(-0.7425F, -6.4291F, 0.3537F, 6, 7, 0), ModelTransform.of(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        ModelPartData bone3 = bone6.addChild("bone3",
            ModelPartBuilder.create(),
            ModelTransform.of(-0.8F, 13.6F, 1.4F, 0.0F, 2.0944F, 0.0F));
        bone3.addChild("cube_r22", ModelPartBuilder.create().uv(0, 7).cuboid(-3.3214F, -6.658F,  0.4768F, 6, 6, 0), ModelTransform.of(0.0F, 0.0F,  0.0F,  2.6612F, 0.0387F, 3.1214F));
        bone3.addChild("cube_r23", ModelPartBuilder.create().uv(1, 0).cuboid(-1.3214F, -6.4768F, 0.342F,  6, 7, 0), ModelTransform.of(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        ModelPartData bone7 = root.addChild("bone7",
            ModelPartBuilder.create().uv(2, 16).cuboid(-4.3F, 12.7F, -0.2F, 2, 5, 0),
            ModelTransform.of(-0.6F, 7.6F, -4.4F, 0.2618F, 0.5236F, 0.0F));

        bone7.addChild("cube_r24", ModelPartBuilder.create().uv(1, 23).cuboid(-1.0F, -8.0F, 1.0F, 4, 8, 0), ModelTransform.of(-3.6F, 12.9F, -1.2F, -0.48F,   -0.3054F, -1.7453F));
        bone7.addChild("cube_r25", ModelPartBuilder.create().uv(1, 23).cuboid(-1.0F, -8.0F, 1.0F, 4, 8, 0), ModelTransform.of(-2.5F, 13.6F, -1.0F, -0.7697F,  0.2201F,  0.1115F));
        bone7.addChild("cube_r26", ModelPartBuilder.create().uv(1, 23).cuboid(-1.0F, -8.0F, 1.0F, 4, 8, 0), ModelTransform.of(-3.3F, 15.3F, -0.5F,  1.2679F,  0.0134F,  1.0762F));

        ModelPartData bone13 = bone7.addChild("bone13",
            ModelPartBuilder.create().uv(27, 0).cuboid(-2.1F, -18.4F, -0.2F, 4, 15, 0),
            ModelTransform.of(-3.2F, 17.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        ModelPartData bone8 = bone13.addChild("bone8",
            ModelPartBuilder.create(),
            ModelTransform.pivot(3.2F, -17.0F, 0.0F));
        bone8.addChild("cube_r27", ModelPartBuilder.create().uv(24, 26).cuboid(-2.0F, -3.0F, 1.0F, 4, 3, 0), ModelTransform.of(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone8.addChild("cube_r28", ModelPartBuilder.create().uv(26, 16).cuboid(-1.0F, -4.0F, 1.0F, 3, 4, 0), ModelTransform.of(-2.1F, 0.1F,  -1.4F, 0.0F,     1.309F,   0.0F));
        bone8.addChild("cube_r29", ModelPartBuilder.create().uv(12, 24).cuboid(-1.0F, -8.0F, 1.0F, 3, 8, 0), ModelTransform.of(-0.2F, 0.7F,  -0.4F, 0.0F,    -0.6981F,  0.5236F));
        bone8.addChild("cube_r30", ModelPartBuilder.create().uv(12, 24).cuboid(-1.0F, -8.0F, 1.0F, 3, 8, 0), ModelTransform.of(-1.2F, 0.0F,  -1.7F, 0.0F,     0.6981F,  0.5236F));
        bone8.addChild("cube_r31", ModelPartBuilder.create().uv(22, 15).cuboid(-1.0F, -6.0F, -3.0F, 0, 6, 5), ModelTransform.of(0.0F,  1.6F,   1.9F, 0.7854F,  0.0F,    1.9635F));
        bone8.addChild("cube_r32", ModelPartBuilder.create().uv(24, 26).cuboid(-2.0F, -3.0F,  1.0F, 4, 3, 0), ModelTransform.of(1.6F, -0.2F,  -1.4F, 2.4435F, -0.5236F,  0.0F));
        bone8.addChild("cube_r33", ModelPartBuilder.create().uv(26, 16).cuboid(-1.0F, -4.0F,  1.0F, 3, 4, 0), ModelTransform.of(0.0F,  0.1F,   0.1F, 0.0F,    -1.0472F,  0.0F));
        bone8.addChild("cube_r34", ModelPartBuilder.create().uv(24, 26).cuboid(-2.0F, -3.0F,  1.0F, 4, 3, 0), ModelTransform.of(1.1F, -0.2F,   1.0F,-0.6981F, -0.48F,   3.1416F));

        ModelPartData bone9 = bone13.addChild("bone9",
            ModelPartBuilder.create(),
            ModelTransform.pivot(-2.2F, -3.4F, 0.5F));
        bone9.addChild("cube_r35", ModelPartBuilder.create().uv(0, 7).cuboid(-3.0F, -6.0F, 1.0F, 6, 6, 0), ModelTransform.of(0.0F, 0.0F,  0.0F,  2.6612F, 0.0387F, 3.1214F));
        bone9.addChild("cube_r36", ModelPartBuilder.create().uv(1, 0).cuboid(-1.0F, -7.0F, 1.0F, 6, 7, 0), ModelTransform.of(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        ModelPartData bone12 = bone13.addChild("bone12",
            ModelPartBuilder.create(),
            ModelTransform.of(-3.4F, -15.0F, -0.4F, -3.1416F, 0.0F, 3.1416F));
        bone12.addChild("cube_r37", ModelPartBuilder.create().uv(24, 26).cuboid(-2.0F, -3.0F, 1.0F, 4, 3, 0), ModelTransform.of(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone12.addChild("cube_r38", ModelPartBuilder.create().uv(26, 16).cuboid(-1.0F, -4.0F, 1.0F, 3, 4, 0), ModelTransform.of(-2.1F, 0.1F,  -1.4F, 0.0F,     1.309F,   0.0F));
        bone12.addChild("cube_r39", ModelPartBuilder.create().uv(12, 24).cuboid(-1.0F, -8.0F, 1.0F, 3, 8, 0), ModelTransform.of(-0.2F, 0.7F,  -0.4F, 0.0F,    -0.6981F,  0.5236F));
        bone12.addChild("cube_r40", ModelPartBuilder.create().uv(12, 24).cuboid(-1.0F, -8.0F, 1.0F, 3, 8, 0), ModelTransform.of(-1.2F, 0.0F,  -1.7F, 0.0F,     0.6981F,  0.5236F));
        bone12.addChild("cube_r41", ModelPartBuilder.create().uv(22, 15).cuboid(-1.0F, -6.0F, -3.0F, 0, 6, 5), ModelTransform.of(0.0F,  1.6F,   1.9F, 0.7854F,  0.0F,    1.9635F));
        bone12.addChild("cube_r42", ModelPartBuilder.create().uv(24, 26).cuboid(-2.0F, -3.0F,  1.0F, 4, 3, 0), ModelTransform.of(1.6F, -0.2F,  -1.4F, 2.4435F, -0.5236F,  0.0F));
        bone12.addChild("cube_r43", ModelPartBuilder.create().uv(26, 16).cuboid(-1.0F, -4.0F,  1.0F, 3, 4, 0), ModelTransform.of(0.0F,  0.1F,   0.1F, 0.0F,    -1.0472F,  0.0F));
        bone12.addChild("cube_r44", ModelPartBuilder.create().uv(24, 26).cuboid(-2.0F, -3.0F,  1.0F, 4, 3, 0), ModelTransform.of(1.1F, -0.2F,   1.0F,-0.6981F, -0.48F,   3.1416F));

        ModelPartData bone10 = bone7.addChild("bone10",
            ModelPartBuilder.create(),
            ModelTransform.of(-2.4F, 13.6F, -3.0F, 0.0F, -2.1817F, 0.0F));
        bone10.addChild("cube_r45", ModelPartBuilder.create().uv(0, 7).cuboid(-3.0F, -6.0F, 1.0F, 6, 6, 0), ModelTransform.of(0.0F, 0.0F,  0.0F,  2.6612F, 0.0387F, 3.1214F));
        bone10.addChild("cube_r46", ModelPartBuilder.create().uv(1, 0).cuboid(-1.0F, -7.0F, 1.0F, 6, 7, 0), ModelTransform.of(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        ModelPartData bone11 = bone7.addChild("bone11",
            ModelPartBuilder.create(),
            ModelTransform.of(-0.8F, 13.6F, 1.4F, 0.0F, 2.0944F, 0.0F));
        bone11.addChild("cube_r47", ModelPartBuilder.create().uv(0, 7).cuboid(-3.0F, -6.0F, 1.0F, 6, 6, 0), ModelTransform.of(0.0F, 0.0F,  0.0F,  2.6612F, 0.0387F, 3.1214F));
        bone11.addChild("cube_r48", ModelPartBuilder.create().uv(1, 0).cuboid(-1.0F, -7.0F, 1.0F, 6, 7, 0), ModelTransform.of(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void setAngles(RainbowTulipEntity entity, float limbAngle, float limbDistance,
                          float animationProgress, float headYaw, float headPitch) {
        // Static plant — no animation
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices,
                       int light, int overlay, int color) {
        bone6.render(matrices, vertices, light, overlay, color);
        bone7.render(matrices, vertices, light, overlay, color);
    }
}
