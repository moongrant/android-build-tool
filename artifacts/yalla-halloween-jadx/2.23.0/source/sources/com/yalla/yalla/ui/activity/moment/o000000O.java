package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends o000O<TopicInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f26427OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(TopicSearchActivity topicSearchActivity, int i) {
        super(topicSearchActivity, i);
        this.f26427OooOoo0 = topicSearchActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicInfoModel == null) {
            return;
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = topicInfoModel.getImage();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0oO());
        oooO00o.OooO0o0(12);
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.nivHeader));
        TopicSearchActivity topicSearchActivity = this.f26427OooOoo0;
        String strOooOo = TopicSearchActivity.OooOo(topicSearchActivity);
        if (strOooOo == null || StringsKt.isBlank(strOooOo)) {
            helper.setText(oO00O0oO.tvName, topicInfoModel.getName());
        } else {
            helper.setText(oO00O0oO.tvName, p590o0oo0.OooOOOO.OooO0O0(o0000.OooO00o(oO00O0o.color_00d8c9), topicInfoModel.getName(), (String) topicSearchActivity.f26400OooOo.getValue()));
        }
        String describe = topicInfoModel.getDescribe();
        if (describe == null || StringsKt.isBlank(describe)) {
            helper.setText(oO00O0oO.tvDesc, oO00OOo0.topic_description_hint);
        } else {
            helper.setText(oO00O0oO.tvDesc, topicInfoModel.getDescribe());
        }
        ((TopicFollowPostNumberView) helper.getView(oO00O0oO.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
        boolean z = topicInfoModel.getIsJoin() == 1;
        int i = oO00O0oO.btFollow;
        helper.setText(i, z ? oO00OOo0.Following : oO00OOo0.Follow);
        helper.addOnClickListener(i);
        View view = helper.getView(i);
        boolean z2 = !z;
        view.setEnabled(z2);
        view.setClickable(z2);
    }
}
