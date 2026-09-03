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
import p571o0oOoO0.o0000oo;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends o0000oo<TopicInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f25975OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(TopicSearchActivity topicSearchActivity, int i) {
        super(topicSearchActivity, i);
        this.f25975OooOoo0 = topicSearchActivity;
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
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = topicInfoModel.getImage();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0oO());
        oooO00o.OooO0o0(12);
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.nivHeader));
        TopicSearchActivity topicSearchActivity = this.f25975OooOoo0;
        String strOooOo = TopicSearchActivity.OooOo(topicSearchActivity);
        if (strOooOo == null || StringsKt.isBlank(strOooOo)) {
            helper.setText(p562o0oOo000.o0OO00O.tvName, topicInfoModel.getName());
        } else {
            helper.setText(p562o0oOo000.o0OO00O.tvName, o0O0O0Oo.OooO0O0(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9), topicInfoModel.getName(), (String) topicSearchActivity.f25949OooOo.getValue()));
        }
        String describe = topicInfoModel.getDescribe();
        if (describe == null || StringsKt.isBlank(describe)) {
            helper.setText(p562o0oOo000.o0OO00O.tvDesc, p562o0oOo000.o000000.topic_description_hint);
        } else {
            helper.setText(p562o0oOo000.o0OO00O.tvDesc, topicInfoModel.getDescribe());
        }
        ((TopicFollowPostNumberView) helper.getView(p562o0oOo000.o0OO00O.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
        boolean z = topicInfoModel.getIsJoin() == 1;
        int i = p562o0oOo000.o0OO00O.btFollow;
        helper.setText(i, z ? p562o0oOo000.o000000.Following : p562o0oOo000.o000000.Follow);
        helper.addOnClickListener(i);
        View view = helper.getView(i);
        boolean z2 = !z;
        view.setEnabled(z2);
        view.setClickable(z2);
    }
}
