package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000OO00;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends o000O<TopicInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainMomentsTopicFollowingFragment f28882OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment, Context context, int i) {
        super(context, i);
        this.f28882OooOoo0 = mainMomentsTopicFollowingFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String content;
        String strOooO0OO;
        String strOooO0OO2;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicInfoModel != null) {
            CardView ownerCard = (CardView) helper.getView(oO00O0oO.ownerCard);
            ConstraintLayout layout = (ConstraintLayout) helper.getView(oO00O0oO.layout);
            int positionid = topicInfoModel.getPositionid();
            Context context = this.f56196OooOo;
            boolean z = true;
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = this.f28882OooOoo0;
            if (positionid == 1) {
                Intrinsics.checkNotNullExpressionValue(ownerCard, "ownerCard");
                o000OO00.OooOOOO(ownerCard);
                Intrinsics.checkNotNullExpressionValue(layout, "layout");
                o000OO00.OooO0O0(layout);
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(context);
                oooO00o.f43911OooO0OO = topicInfoModel.getImage();
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0oO());
                oooO00o.OooO0o0(12);
                oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.ownerHeader));
                helper.setText(oO00O0oO.ownerName, topicInfoModel.getName());
                TextView textView = (TextView) helper.getView(oO00O0oO.ownerContent);
                String postContent = topicInfoModel.getPostContent();
                if (postContent == null || StringsKt.isBlank(postContent)) {
                    textView.setText(oO00OOo0.no_posts_yet);
                    return;
                }
                MomentSendContentModel momentSendContentModel = (MomentSendContentModel) oOo00OO0.OooO0O0(topicInfoModel.getPostContent(), new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$baseAdapter$2$1$convert$1$1$type$1
                }.getType());
                content = momentSendContentModel != null ? momentSendContentModel.getContent() : null;
                if (content != null && content.length() != 0) {
                    z = false;
                }
                if (!z) {
                    p595o0oo00Oo.o0000Ooo.OooO0O0(mainMomentsTopicFollowingFragment.getActivity(), momentSendContentModel, textView);
                    return;
                }
                int dyType = topicInfoModel.getDyType();
                if (dyType == MomentType.Image.getValue()) {
                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0._photo_);
                } else if (dyType == MomentType.Video.getValue()) {
                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0._Video_);
                } else {
                    strOooO0OO2 = dyType == MomentType.Poll.getValue() ? com.code.android.util.o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", com.code.android.util.o0000.OooO0OO(oO00OOo0.Other), "]");
                }
                textView.setText(strOooO0OO2);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(ownerCard, "ownerCard");
            o000OO00.OooO0O0(ownerCard);
            Intrinsics.checkNotNullExpressionValue(layout, "layout");
            o000OO00.OooOOOO(layout);
            ImageView it = (ImageView) helper.getView(oO00O0oO.ivManage);
            if (topicInfoModel.getPositionid() == 3) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o000OO00.OooOOOO(it);
            } else {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o000OO00.OooO0O0(it);
            }
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(context);
            oooO00o2.f43911OooO0OO = topicInfoModel.getImage();
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0oO());
            oooO00o2.OooO0o0(12);
            oooO00o2.OooO0Oo((ImageView) helper.getView(oO00O0oO.nivHeader));
            helper.setText(oO00O0oO.tvName, topicInfoModel.getName());
            TextView textView2 = (TextView) helper.getView(oO00O0oO.tvContent);
            String postContent2 = topicInfoModel.getPostContent();
            if (postContent2 == null || StringsKt.isBlank(postContent2)) {
                textView2.setText(oO00OOo0.no_posts_yet);
                return;
            }
            MomentSendContentModel momentSendContentModel2 = (MomentSendContentModel) oOo00OO0.OooO0O0(topicInfoModel.getPostContent(), new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$baseAdapter$2$1$convert$1$type$1
            }.getType());
            content = momentSendContentModel2 != null ? momentSendContentModel2.getContent() : null;
            if (content != null && content.length() != 0) {
                z = false;
            }
            if (!z) {
                p595o0oo00Oo.o0000Ooo.OooO0O0(mainMomentsTopicFollowingFragment.getActivity(), momentSendContentModel2, textView2);
                return;
            }
            int dyType2 = topicInfoModel.getDyType();
            if (dyType2 == MomentType.Image.getValue()) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0._photo_);
            } else if (dyType2 == MomentType.Video.getValue()) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0._Video_);
            } else {
                strOooO0OO = dyType2 == MomentType.Poll.getValue() ? com.code.android.util.o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", com.code.android.util.o0000.OooO0OO(oO00OOo0.Other), "]");
            }
            textView2.setText(strOooO0OO);
        }
    }
}
