package com.yourname.rainbowtulip.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class RainbowTulipModel extends EntityModel<RainbowTulipEntity> {

    public static final ModelLayerLocation LAYER_LOCATION =
        new ModelLayerLocation(new ResourceLocation("rainbowtulip", "rainbow_tulip"), "main");

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
        this.bone6 = root.getChild("bone6");
        this.bone14 = this.bone6.getChild("bone14");
        this.bone4 = this.bone14.getChild("bone4");
        this.bone5 = this.bone14.getChild("bone5");
        this.bone2 = this.bone6.getChild("bone2");
        this.bone3 = this.bone6.getChild("bone3");
        this.bone7 = root.getChild("bone7");
        this.bone13 = this.bone7.getChild("bone13");
        this.bone8 = this.bone13.getChild("bone8");
        this.bone9 = this.bone13.getChild("bone9");
        this.bone12 = this.bone13.getChild("bone12");
        this.bone10 = this.bone7.getChild("bone10");
        this.bone11 = this.bone7.getChild("bone11");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(2, 16).addBox(-4.3F, 12.7685F, -0.5444F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, 8.2F, 4.2F, -0.3927F, 0.7418F, 0.0F));

        PartDefinition cube_r1 = bone6.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 23).addBox(-0.3226F, -7.6066F, 0.5569F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 12.9F, -1.2F, -0.48F, -0.3054F, -1.7453F));
        PartDefinition cube_r2 = bone6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 23).addBox(-1.0151F, -8.3454F, 0.1691F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 13.6F, -1.0F, -0.7697F, 0.2201F, 0.1115F));
        PartDefinition cube_r3 = bone6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 23).addBox(-1.7272F, -8.4558F, 1.271F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 15.3F, -0.5F, 1.2679F, 0.0134F, 1.0762F));

        PartDefinition bone14 = bone6.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(27, 0).addBox(-1.9F, -20.0315F, 0.2556F, 4.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 22.4194F, 1.1134F, 2.4937F, -0.9792F, -2.5189F));

        PartDefinition bone4 = bone14.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(3.4F, -17.8F, 0.8F));
        PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 26).addBox(-2.309F, -3.6903F, 1.4878F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4435F, -1.5272F, -1.8326F));
        PartDefinition cube_r5 = bone4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 16).addBox(-0.6673F, -4.8315F, 0.9109F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 24).addBox(-1.5399F, -8.7201F, 1.0034F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        PartDefinition cube_r7 = bone4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0971F, -8.7201F, 0.4689F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        PartDefinition cube_r8 = bone4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 15).addBox(-1.7682F, -6.0185F, -3.4685F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 1.9F, 0.7854F, 0.0F, 1.9635F));
        PartDefinition cube_r9 = bone4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 26).addBox(-2.1722F, -2.5548F, 1.763F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        PartDefinition cube_r10 = bone4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 16).addBox(-1.2983F, -4.8315F, 0.8278F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, 0.0F, -1.0472F, 0.0F));
        PartDefinition cube_r11 = bone4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 26).addBox(-2.159F, -2.1667F, 1.3004F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone5 = bone14.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -15.8F, 0.4F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition cube_r12 = bone5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 26).addBox(-1.6209F, -3.671F, 1.4648F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4435F, -1.5272F, -1.8326F));
        PartDefinition cube_r13 = bone5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 16).addBox(-1.3327F, -4.8315F, 1.0891F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        PartDefinition cube_r14 = bone5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0971F, -8.7201F, 1.5311F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        PartDefinition cube_r15 = bone5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 24).addBox(-1.5399F, -8.7201F, 0.9966F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        PartDefinition cube_r16 = bone5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 15).addBox(-1.7682F, -5.5315F, -2.9815F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 1.9F, 0.7854F, 0.0F, 1.9635F));
        PartDefinition cube_r17 = bone5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 26).addBox(-1.8278F, -2.1713F, 1.306F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        PartDefinition cube_r18 = bone5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 16).addBox(-0.7017F, -4.8315F, 1.1722F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, 0.0F, -1.0472F, 0.0F));
        PartDefinition cube_r19 = bone5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 26).addBox(-1.841F, -2.5594F, 1.7685F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone2 = bone6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 13.6F, -3.0F, 0.0F, -2.1817F, 0.0F));
        PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 7).addBox(-2.7425F, -6.6463F, 0.4291F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(1, 0).addBox(-0.7425F, -6.4291F, 0.3537F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        PartDefinition bone3 = bone6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 13.6F, 1.4F, 0.0F, 2.0944F, 0.0F));
        PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 7).addBox(-3.3214F, -6.658F, 0.4768F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(1, 0).addBox(-1.3214F, -6.4768F, 0.342F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(2, 16).addBox(-4.3F, 12.7F, -0.2F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 7.6F, -4.4F, 0.2618F, 0.5236F, 0.0F));

        PartDefinition cube_r24 = bone7.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(1, 23).addBox(-1.0F, -8.0F, 1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 12.9F, -1.2F, -0.48F, -0.3054F, -1.7453F));
        PartDefinition cube_r25 = bone7.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(1, 23).addBox(-1.0F, -8.0F, 1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 13.6F, -1.0F, -0.7697F, 0.2201F, 0.1115F));
        PartDefinition cube_r26 = bone7.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(1, 23).addBox(-1.0F, -8.0F, 1.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 15.3F, -0.5F, 1.2679F, 0.0134F, 1.0762F));

        PartDefinition bone13 = bone7.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(27, 0).addBox(-2.1F, -18.4F, -0.2F, 4.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, 17.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition bone8 = bone13.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(3.2F, -17.0F, 0.0F));
        PartDefinition cube_r27 = bone8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(24, 26).addBox(-2.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4435F, -1.5272F, -1.8326F));
        PartDefinition cube_r28 = bone8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        PartDefinition cube_r29 = bone8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0F, -8.0F, 1.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        PartDefinition cube_r30 = bone8.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0F, -8.0F, 1.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        PartDefinition cube_r31 = bone8.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(22, 15).addBox(-1.0F, -6.0F, -3.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 1.9F, 0.7854F, 0.0F, 1.9635F));
        PartDefinition cube_r32 = bone8.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(24, 26).addBox(-2.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        PartDefinition cube_r33 = bone8.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, 0.0F, -1.0472F, 0.0F));
        PartDefinition cube_r34 = bone8.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 26).addBox(-2.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone9 = bone13.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-2.2F, -3.4F, 0.5F));
        PartDefinition cube_r35 = bone9.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -6.0F, 1.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        PartDefinition cube_r36 = bone9.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(1, 0).addBox(-1.0F, -7.0F, 1.0F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        PartDefinition bone12 = bone13.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, -15.0F, -0.4F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition cube_r37 = bone12.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(24, 26).addBox(-2.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4435F, -1.5272F, -1.8326F));
        PartDefinition cube_r38 = bone12.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        PartDefinition cube_r39 = bone12.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0F, -8.0F, 1.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        PartDefinition cube_r40 = bone12.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0F, -8.0F, 1.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        PartDefinition cube_r41 = bone12.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(22, 15).addBox(-1.0F, -6.0F, -3.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 1.9F, 0.7854F, 0.0F, 1.9635F));
        PartDefinition cube_r42 = bone12.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(24, 26).addBox(-2.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        PartDefinition cube_r43 = bone12.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, 0.0F, -1.0472F, 0.0F));
        PartDefinition cube_r44 = bone12.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(24, 26).addBox(-2.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 13.6F, -3.0F, 0.0F, -2.1817F, 0.0F));
        PartDefinition cube_r45 = bone10.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -6.0F, 1.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        PartDefinition cube_r46 = bone10.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(1, 0).addBox(-1.0F, -7.0F, 1.0F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        PartDefinition bone11 = bone7.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 13.6F, 1.4F, 0.0F, 2.0944F, 0.0F));
        PartDefinition cube_r47 = bone11.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -6.0F, 1.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        PartDefinition cube_r48 = bone11.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(1, 0).addBox(-1.0F, -7.0F, 1.0F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(RainbowTulipEntity entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {
        // Static plant — no animation
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
                               int packedLight, int packedOverlay,
                               float red, float green, float blue, float alpha) {
        bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
