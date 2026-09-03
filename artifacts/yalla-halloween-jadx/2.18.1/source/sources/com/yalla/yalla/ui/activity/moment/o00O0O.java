package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends p188o00o00o0.OooO0OO<TopicInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f22725OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(TopicSearchActivity topicSearchActivity) {
        super(topicSearchActivity, R.layout.item_topic_recommend);
        this.f22725OooO00o = topicSearchActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicInfoModel == null) {
            return;
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.f48429OooO0OO = topicInfoModel.getImage();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO());
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.nivHeader));
        TopicSearchActivity topicSearchActivity = this.f22725OooO00o;
        TopicSearchActivity.OooO00o oooO00o3 = TopicSearchActivity.f22654OooooOo;
        String string = topicSearchActivity.OooOooO().f50444OooO0O0.getText().toString();
        if (string == null || StringsKt.isBlank(string)) {
            helper.OooOO0(R.id.tvName, topicInfoModel.getName());
        } else {
            helper.OooOO0(R.id.tvName, o0O0O00.OooO0O0(o000O0O0.OooO00o(R.color.color_00d8c9), topicInfoModel.getName(), string));
        }
        String describe = topicInfoModel.getDescribe();
        if (describe == null || StringsKt.isBlank(describe)) {
            helper.OooO(R.id.tvDesc, R.string.topic_description_hint);
        } else {
            helper.OooOO0(R.id.tvDesc, topicInfoModel.getDescribe());
        }
        ((TopicFollowPostNumberView) helper.OooO0Oo(R.id.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
        boolean z = topicInfoModel.getIsJoin() == 1;
        helper.OooO(R.id.btFollow, z ? R.string.Following : R.string.Follow);
        helper.OooO0O0(R.id.btFollow);
        View viewOooO0Oo = helper.OooO0Oo(R.id.btFollow);
        boolean z2 = !z;
        viewOooO0Oo.setEnabled(z2);
        viewOooO0Oo.setClickable(z2);
    }
}
