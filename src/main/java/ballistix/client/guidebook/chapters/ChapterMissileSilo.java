package ballistix.client.guidebook.chapters;

import ballistix.References;
import ballistix.prefab.utils.TextUtils;
import ballistix.registers.BallistixBlocks;
import electrodynamics.client.guidebook.utils.components.Chapter;
import electrodynamics.client.guidebook.utils.components.Module;
import electrodynamics.client.guidebook.utils.pagedata.ImageWrapperObject;
import electrodynamics.client.guidebook.utils.pagedata.ItemWrapperObject;
import electrodynamics.client.guidebook.utils.pagedata.TextWrapperObject;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;

public class ChapterMissileSilo extends Chapter {

	private static final ItemWrapperObject LOGO = new ItemWrapperObject(7, 10, 2.0F, 32, 32, BallistixBlocks.blockMissileSilo.asItem());

	public ChapterMissileSilo(Module module) {
		super(module);
	}

	@Override
	public ItemWrapperObject getLogo() {
		return LOGO;
	}

	@Override
	public MutableComponent getTitle() {
		return TextUtils.guidebook("chapter.missilesilo");
	}

	@Override
	public void addData() {
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.missilesilo.l1")).setIndentions(1).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.missilesilo.range", TextUtils.guidebook("chapter.missilesilo.close"), 3000)).setIndentions(1).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.missilesilo.range", TextUtils.guidebook("chapter.missilesilo.medium"), 10000)).setIndentions(1).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.missilesilo.range", TextUtils.guidebook("chapter.missilesilo.close"), TextUtils.guidebook("chapter.missilesilo.unlimited"))).setIndentions(1).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.missilesilo.l2")).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.missilesilo.l3")).setIndentions(1).setSeparateStart());
		pageData.add(new ImageWrapperObject(0, 0, 0, 0, 150, 75, 150, 79, new ResourceLocation(References.ID, "textures/screen/guidebook/silo1.png")));
		pageData.add(new ImageWrapperObject(0, 0, 0, 0, 150, 75, 150, 79, new ResourceLocation(References.ID, "textures/screen/guidebook/silo2.png")));
		
	}

}