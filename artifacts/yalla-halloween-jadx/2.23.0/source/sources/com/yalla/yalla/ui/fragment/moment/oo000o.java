package com.yalla.yalla.ui.fragment.moment;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends o000O<TopicInfoModel> {
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
        helper.setText(oO00O0oO.tvName, topicInfoModel.getName());
        String describe = topicInfoModel.getDescribe();
        if (describe == null || StringsKt.isBlank(describe)) {
            helper.setText(oO00O0oO.tvDesc, oO00OOo0.topic_description_hint);
        } else {
            helper.setText(oO00O0oO.tvDesc, topicInfoModel.getDescribe());
        }
        ((TopicFollowPostNumberView) helper.getView(oO00O0oO.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
        int i = oO00O0oO.btFollow;
        helper.addOnClickListener(i);
        boolean zOooO0OO = p417o0OoO0.o0000.OooO0OO(Integer.valueOf(topicInfoModel.getIsJoin()));
        helper.setText(i, zOooO0OO ? oO00OOo0.Following : oO00OOo0.Follow);
        View view = helper.getView(i);
        boolean z = !zOooO0OO;
        view.setEnabled(z);
        view.setClickable(z);
    }
}
