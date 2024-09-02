// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldekus_first_mask_java<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dekus_first_mask_java"), "main");
	private final ModelPart bone;

	public Modeldekus_first_mask_java(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-4.5F, -1.9F, -4.4F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 9)
						.addBox(-4.1F, -7.15F, -2.8F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(4.1F, -7.15F, -2.8F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(21, 22)
						.addBox(-4.1F, -7.15F, 4.1995F, 8.2F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.483F, -12.4609F, -4.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-3.0F, -2.0F, 4.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.483F, -12.4609F, -4.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}