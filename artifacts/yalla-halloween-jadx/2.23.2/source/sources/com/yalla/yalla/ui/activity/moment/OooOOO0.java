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
import p571o0oOoO0.o0000oo;
import p590o0oOooo0.oOOO00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends o0000oo<TopicInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ JoinTopicListActivity f25778OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(JoinTopicListActivity joinTopicListActivity, int i) {
        super(joinTopicListActivity, i);
        this.f25778OooOoo0 = joinTopicListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String strOooO0OO;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicInfoModel != null) {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.f43126OooO0OO = topicInfoModel.getImage();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0oO());
            oooO00o.OooO0o0(12);
            oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.nivHeader));
            helper.setText(p562o0oOo000.o0OO00O.name, topicInfoModel.getName());
            ((UserIdentityView) helper.getView(p562o0oOo000.o0OO00O.identity)).OooO0Oo(topicInfoModel.getPositionid());
            ((TopicFollowPostNumberView) helper.getView(p562o0oOo000.o0OO00O.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
            TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.tvDesc);
            String postContent = topicInfoModel.getPostContent();
            if (postContent == null || StringsKt.isBlank(postContent)) {
                textView.setText(p562o0oOo000.o000000.no_posts_yet);
                return;
            }
            MomentSendContentModel momentSendContentModel = (MomentSendContentModel) oOOO00.OooO0O0(topicInfoModel.getPostContent(), new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.ui.activity.moment.JoinTopicListActivity$mAdapter$2$1$convert$1$1$type$1
            }.getType());
            String content = momentSendContentModel != null ? momentSendContentModel.getContent() : null;
            if (!(content == null || content.length() == 0)) {
                JoinTopicListActivity joinTopicListActivity = this.f25778OooOoo0;
                joinTopicListActivity.getClass();
                p599o0oo00o.o00O0O.OooO0O0(joinTopicListActivity, momentSendContentModel, textView);
                return;
            }
            int dyType = topicInfoModel.getDyType();
            if (dyType == MomentType.Image.getValue()) {
                strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000._photo_);
            } else if (dyType == MomentType.Video.getValue()) {
                strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000._Video_);
            } else {
                strOooO0OO = dyType == MomentType.Poll.getValue() ? o0000.OooO0OO(p562o0oOo000.o000000._Poll_) : p004OooO0oO.o000oOoO.OooO0O0("[", o0000.OooO0OO(p562o0oOo000.o000000.Other), "]");
            }
            textView.setText(strOooO0OO);
        }
    }
}
