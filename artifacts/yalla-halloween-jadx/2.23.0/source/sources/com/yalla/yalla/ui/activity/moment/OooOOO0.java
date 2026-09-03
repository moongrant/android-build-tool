package com.yalla.yalla.ui.activity.moment;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.ui.view.UserIdentityView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p595o0oo00Oo.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends o000O<TopicInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ JoinTopicListActivity f26227OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(JoinTopicListActivity joinTopicListActivity, int i) {
        super(joinTopicListActivity, i);
        this.f26227OooOoo0 = joinTopicListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String strOooO0OO;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicInfoModel != null) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.f43911OooO0OO = topicInfoModel.getImage();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0oO());
            oooO00o.OooO0o0(12);
            oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.nivHeader));
            helper.setText(oO00O0oO.name, topicInfoModel.getName());
            ((UserIdentityView) helper.getView(oO00O0oO.identity)).OooO0Oo(topicInfoModel.getPositionid());
            ((TopicFollowPostNumberView) helper.getView(oO00O0oO.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
            TextView textView = (TextView) helper.getView(oO00O0oO.tvDesc);
            String postContent = topicInfoModel.getPostContent();
            if (postContent == null || StringsKt.isBlank(postContent)) {
                textView.setText(oO00OOo0.no_posts_yet);
                return;
            }
            MomentSendContentModel momentSendContentModel = (MomentSendContentModel) oOo00OO0.OooO0O0(topicInfoModel.getPostContent(), new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.ui.activity.moment.JoinTopicListActivity$mAdapter$2$1$convert$1$1$type$1
            }.getType());
            String content = momentSendContentModel != null ? momentSendContentModel.getContent() : null;
            if (!(content == null || content.length() == 0)) {
                JoinTopicListActivity joinTopicListActivity = this.f26227OooOoo0;
                joinTopicListActivity.getClass();
                o0000Ooo.OooO0O0(joinTopicListActivity, momentSendContentModel, textView);
                return;
            }
            int dyType = topicInfoModel.getDyType();
            if (dyType == MomentType.Image.getValue()) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0._photo_);
            } else if (dyType == MomentType.Video.getValue()) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0._Video_);
            } else {
                strOooO0OO = dyType == MomentType.Poll.getValue() ? o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", o0000.OooO0OO(oO00OOo0.Other), "]");
            }
            textView.setText(strOooO0OO);
        }
    }
}
