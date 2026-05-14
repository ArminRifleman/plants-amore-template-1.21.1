package com.yourname.rainbowtulip.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class RainbowTulipModel extends EntityModel<Entity> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rainbowtulip", "rainbow_tulip"), "main");

    // The two root bones — each tulip stem
    private final ModelPart bone6;
    private final ModelPart bone7;

    // The four flower-head bones that carry the grayscale petal/sepal cubes
    // and should receive biome tint.
    // bone4 & bone5 live under bone6 → bone14
    // bone8 & bone12 live under bone7 → bone13
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart bone8;
    private final ModelPart bone12;

    public RainbowTulipModel(ModelPart root) {
        this.bone6  = root.getChild("bone6");
        this.bone7  = root.getChild("bone7");
        // Resolve the flower bones through their parents so we can toggle them
        this.bone4  = this.bone6.getChild("bone14").getChild("bone4");
        this.bone5  = this.bone6.getChild("bone14").getChild("bone5");
        this.bone8  = this.bone7.getChild("bone13").getChild("bone8");
        this.bone12 = this.bone7.getChild("bone13").getChild("bone12");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3F, 8.2F, 4.2F, -0.3927F, 0.7418F, 0.0F));
        bone6.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 15).addBox(-2.092F, -7.2754F, -0.0259F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 12.9F, -1.2F, -0.48F, -0.3054F, -1.7453F));
        bone6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 15).addBox(-0.8229F, -5.9019F, 0.1245F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 13.6F, -1.0F, -0.7697F, 0.2201F, 0.1115F));
        bone6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 15).addBox(-0.6119F, -7.2191F, 2.6114F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, 17.7F, -1.5F, 1.7643F, -0.1992F, 0.5111F));

        PartDefinition bone14 = bone6.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(23, 1).addBox(-1.8846F, -19.1341F, 0.1891F, 4.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 22.4194F, 1.1134F, 2.4937F, -0.9792F, -2.5189F));
        PartDefinition bone4 = bone14.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(3.4F, -17.8F, 0.8F));
        bone4.addOrReplaceChild("cube_r4",  CubeListBuilder.create().texOffs(20, 26).addBox(-2.483F,  -2.4838F, 0.6137F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone4.addOrReplaceChild("cube_r5",  CubeListBuilder.create().texOffs(26, 16).addBox(-0.5536F, -3.3358F, 0.907F,  3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone4.addOrReplaceChild("cube_r6",  CubeListBuilder.create().texOffs(12, 24).addBox(-1.0212F, -7.4376F, 0.4235F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone4.addOrReplaceChild("cube_r7",  CubeListBuilder.create().texOffs(12, 24).addBox(-0.436F,  -7.4376F, 0.879F,  3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone4.addOrReplaceChild("cube_r8",  CubeListBuilder.create().texOffs(22, 15).addBox(-0.3962F, -6.3832F, -3.9529F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 0.8F, -0.5F, -0.7418F, 0.0F, 1.9635F));
        bone4.addOrReplaceChild("cube_r9",  CubeListBuilder.create().texOffs(20, 26).addBox(-2.2054F, -3.7705F, 0.8849F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 16).addBox(-1.3814F, -3.3358F, 0.7501F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 26).addBox(-2.233F,  -3.2569F, 0.2728F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F,  1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone5 = bone14.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -15.8F, 0.4F, -3.1416F, 0.0F, 3.1416F));
        bone5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 26).addBox(-1.704F,  -5.824F,   2.92F,   4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 16).addBox(-1.1356F, -7.424F,   1.0824F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 24).addBox(-2.184F,  -10.9876F, 2.1924F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 24).addBox(-2.3799F, -10.9876F, 0.041F,  3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 15).addBox(-4.1804F, -4.6795F, -2.5173F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.1F,  0.0F, -0.6981F, 0.0F, 1.9635F));
        bone5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 26).addBox(-1.8853F, -0.3066F,  3.1169F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 16).addBox(-0.8458F, -7.424F,   1.0376F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(20, 26).addBox(-1.9691F, -0.4771F,  3.3202F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F,  1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone2 = bone6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 13.6F, -3.0F, 0.0F, -2.1817F, 0.0F));
        PartDefinition bone3 = bone6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6601F, 13.694F, 1.1731F, 0.0F, 2.0944F, 0.0F));
        bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 7).addBox(-4.1962F, -4.9805F, 0.4526F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(9, 0).addBox(-2.1962F, -6.4526F, 2.0195F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 7.6F, -4.4F, 0.2618F, 0.5236F, 0.0F));
        bone7.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 15).addBox(0.308F,   -6.6943F, 2.4185F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 12.9F, -1.2F, 0.5821F, -0.7713F, -2.0554F));
        bone7.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 15).addBox(-2.0616F, -8.954F,  1.7569F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 13.6F, -1.0F, -0.7697F, 0.2201F, 0.1115F));

        PartDefinition bone13 = bone7.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(27, 0).addBox(-2.1F, -17.5F, -0.2F, 4.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.95F, 14.9353F, 1.1809F, -0.2618F, 0.0F, 0.0F));
        PartDefinition bone8 = bone13.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(3.2F, -17.0F, 0.0F));
        bone8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0379F, -2.2633F, 0.4844F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 0.7107F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 1.2893F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(22, 15).addBox(-0.1685F, -6.2732F, -3.2097F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.6F, -0.8F, -0.6545F, 0.0F, 1.9635F));
        bone8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone8.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone8.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F,  1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone9 = bone13.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.334F, -2.7F, 1.0F, 0.0F, 0.8727F, 0.0F));
        bone9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(8, 7).addBox(-3.4086F, -4.614F,   0.9542F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        bone9.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 0).addBox(-1.8138F,  -7.0693F, 2.3353F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        PartDefinition bone12 = bone13.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, -15.0F, -0.4F, -3.1416F, 0.0F, 3.1416F));
        bone12.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0379F, -2.2633F, 0.4844F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone12.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone12.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 0.7107F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone12.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 1.2893F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone12.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(22, 15).addBox(-0.1685F, -6.2539F, -3.2327F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.8F, -1.1F, -0.7418F, 0.0F, 1.9635F));
        bone12.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone12.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone12.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F,  1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3438F, 13.9371F, -1.7418F, 0.0F, -2.1817F, 0.0F));
        bone10.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(8, 7).addBox(-2.797F,  -5.1672F, 1.2743F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6612F, 0.0387F, 3.1214F));
        bone10.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(9, 0).addBox(-0.797F,   -7.2743F, 1.8328F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.8F, -4.0F, 1.0904F, 0.0387F, 3.1214F));

        PartDefinition bone11 = bone7.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 13.6F, 1.4F, 0.0F, 2.0944F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {}

    // Normal render — no tint
    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer,
                               int packedLight, int packedOverlay, int color) {
        bone6.render(poseStack, buffer, packedLight, packedOverlay, color);
        bone7.render(poseStack, buffer, packedLight, packedOverlay, color);
    }

    /**
     * Two-pass render:
     *   Pass 1 — everything EXCEPT bone4, bone5, bone8, bone12 renders untinted (white).
     *   Pass 2 — bone4, bone5, bone8, bone12 (the grayscale flower heads) render with biome tint.
     *
     * We hide the tinted bones during pass 1 by toggling skipDraw, then flip them back for pass 2.
     */
    public void renderWithBiomeTint(PoseStack poseStack, VertexConsumer buffer,
                                    int packedLight, int packedOverlay, int biomeColor) {
        int tint = 0xFF000000 | (biomeColor & 0xFFFFFF);

        // Hide the four untinted flower bones
        bone4.skipDraw  = true;
        bone5.skipDraw  = true;
        bone8.skipDraw  = true;
        bone12.skipDraw = true;

        // Pass 1: everything except bone4/5/8/12 renders with biome tint
        bone6.render(poseStack, buffer, packedLight, packedOverlay, tint);
        bone7.render(poseStack, buffer, packedLight, packedOverlay, tint);

        // Restore flower bones
        bone4.skipDraw  = false;
        bone5.skipDraw  = false;
        bone8.skipDraw  = false;
        bone12.skipDraw = false;

        // Grab references for pass 2
        ModelPart bone14 = bone6.getChild("bone14");
        ModelPart bone2  = bone6.getChild("bone2");
        ModelPart bone3  = bone6.getChild("bone3");
        ModelPart cr1    = bone6.getChild("cube_r1");
        ModelPart cr2    = bone6.getChild("cube_r2");
        ModelPart cr3    = bone6.getChild("cube_r3");

        ModelPart bone13 = bone7.getChild("bone13");
        ModelPart bone9  = bone13.getChild("bone9");
        ModelPart bone10 = bone7.getChild("bone10");
        ModelPart bone11 = bone7.getChild("bone11");
        ModelPart cr22   = bone7.getChild("cube_r22");
        ModelPart cr23   = bone7.getChild("cube_r23");

        ModelPart cr20 = bone3.getChild("cube_r20");
        ModelPart cr21 = bone3.getChild("cube_r21");
        ModelPart cr32 = bone9.getChild("cube_r32");
        ModelPart cr33 = bone9.getChild("cube_r33");
        ModelPart cr42 = bone10.getChild("cube_r42");
        ModelPart cr43 = bone10.getChild("cube_r43");

        // Pass 2: hide everything except bone4/5/8/12, render those untinted
        cr1.skipDraw    = true;
        cr2.skipDraw    = true;
        cr3.skipDraw    = true;
        bone2.skipDraw  = true;
        bone14.skipDraw = true;
        cr22.skipDraw   = true;
        cr23.skipDraw   = true;
        bone11.skipDraw = true;
        bone13.skipDraw = true;
        cr20.skipDraw   = true;
        cr21.skipDraw   = true;
        cr32.skipDraw   = true;
        cr33.skipDraw   = true;
        cr42.skipDraw   = true;
        cr43.skipDraw   = true;

        bone6.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
        bone7.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);

        // Restore everything
        cr1.skipDraw    = false;
        cr2.skipDraw    = false;
        cr3.skipDraw    = false;
        bone2.skipDraw  = false;
        bone14.skipDraw = false;
        cr22.skipDraw   = false;
        cr23.skipDraw   = false;
        bone11.skipDraw = false;
        bone13.skipDraw = false;
        cr20.skipDraw   = false;
        cr21.skipDraw   = false;
        cr32.skipDraw   = false;
        cr33.skipDraw   = false;
        cr42.skipDraw   = false;
        cr43.skipDraw   = false;
    }
}