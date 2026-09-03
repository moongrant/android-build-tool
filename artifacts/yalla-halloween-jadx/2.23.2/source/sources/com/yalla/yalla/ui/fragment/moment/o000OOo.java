package com.yalla.yalla.ui.fragment.moment;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p423o0OoO0OO.o00O000o;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends p571o0oOoO0.o0000oo<TopicInfoModel> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicInfoModel == null) {
            return;
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = topicInfoModel.getImage();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0oO());
        oooO00o.OooO0o0(12);
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.nivHeader));
        helper.setText(p562o0oOo000.o0OO00O.tvName, topicInfoModel.getName());
        String describe = topicInfoModel.getDescribe();
        if (describe == null || StringsKt.isBlank(describe)) {
            helper.setText(p562o0oOo000.o0OO00O.tvDesc, p562o0oOo000.o000000.topic_description_hint);
        } else {
            helper.setText(p562o0oOo000.o0OO00O.tvDesc, topicInfoModel.getDescribe());
        }
        ((TopicFollowPostNumberView) helper.getView(p562o0oOo000.o0OO00O.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
        int i = p562o0oOo000.o0OO00O.btFollow;
        helper.addOnClickListener(i);
        boolean zOooO0OO = o00O000o.OooO0OO(Integer.valueOf(topicInfoModel.getIsJoin()));
        helper.setText(i, zOooO0OO ? p562o0oOo000.o000000.Following : p562o0oOo000.o000000.Follow);
        View view = helper.getView(i);
        boolean z = !zOooO0OO;
        view.setEnabled(z);
        view.setClickable(z);
    }
}
