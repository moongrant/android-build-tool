package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000O;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p590o0oOooo0.oOOO00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends p571o0oOoO0.o0000oo<TopicInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainMomentsTopicFollowingFragment f28350OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment, Context context, int i) {
        super(context, i);
        this.f28350OooOoo0 = mainMomentsTopicFollowingFragment;
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
            CardView cardView = (CardView) helper.getView(p562o0oOo000.o0OO00O.ownerCard);
            ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(p562o0oOo000.o0OO00O.layout);
            int positionid = topicInfoModel.getPositionid();
            Context context = this.f56423OooOo;
            boolean z = true;
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = this.f28350OooOoo0;
            if (positionid == 1) {
                Intrinsics.checkNotNull(cardView);
                o000O.OooOOOO(cardView);
                Intrinsics.checkNotNull(constraintLayout);
                o000O.OooO0O0(constraintLayout);
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(context);
                oooO00o.f43126OooO0OO = topicInfoModel.getImage();
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO00o(d1.OooO0oO());
                oooO00o.OooO0o0(12);
                oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.ownerHeader));
                helper.setText(p562o0oOo000.o0OO00O.ownerName, topicInfoModel.getName());
                TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.ownerContent);
                String postContent = topicInfoModel.getPostContent();
                if (postContent == null || StringsKt.isBlank(postContent)) {
                    textView.setText(p562o0oOo000.o000000.no_posts_yet);
                    return;
                }
                MomentSendContentModel momentSendContentModel = (MomentSendContentModel) oOOO00.OooO0O0(topicInfoModel.getPostContent(), new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$baseAdapter$2$1$convert$1$1$type$1
                }.getType());
                content = momentSendContentModel != null ? momentSendContentModel.getContent() : null;
                if (content != null && content.length() != 0) {
                    z = false;
                }
                if (!z) {
                    p599o0oo00o.o00O0O.OooO0O0(mainMomentsTopicFollowingFragment.getActivity(), momentSendContentModel, textView);
                    return;
                }
                int dyType = topicInfoModel.getDyType();
                if (dyType == MomentType.Image.getValue()) {
                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000._photo_);
                } else if (dyType == MomentType.Video.getValue()) {
                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000._Video_);
                } else {
                    strOooO0OO2 = dyType == MomentType.Poll.getValue() ? com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000._Poll_) : p004OooO0oO.o000oOoO.OooO0O0("[", com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Other), "]");
                }
                textView.setText(strOooO0OO2);
                return;
            }
            Intrinsics.checkNotNull(cardView);
            o000O.OooO0O0(cardView);
            Intrinsics.checkNotNull(constraintLayout);
            o000O.OooOOOO(constraintLayout);
            ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.ivManage);
            if (topicInfoModel.getPositionid() == 3) {
                Intrinsics.checkNotNull(imageView);
                o000O.OooOOOO(imageView);
            } else {
                Intrinsics.checkNotNull(imageView);
                o000O.OooO0O0(imageView);
            }
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(context);
            oooO00o2.f43126OooO0OO = topicInfoModel.getImage();
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO00o(d1.OooO0oO());
            oooO00o2.OooO0o0(12);
            oooO00o2.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.nivHeader));
            helper.setText(p562o0oOo000.o0OO00O.tvName, topicInfoModel.getName());
            TextView textView2 = (TextView) helper.getView(p562o0oOo000.o0OO00O.tvContent);
            String postContent2 = topicInfoModel.getPostContent();
            if (postContent2 == null || StringsKt.isBlank(postContent2)) {
                textView2.setText(p562o0oOo000.o000000.no_posts_yet);
                return;
            }
            MomentSendContentModel momentSendContentModel2 = (MomentSendContentModel) oOOO00.OooO0O0(topicInfoModel.getPostContent(), new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$baseAdapter$2$1$convert$1$type$1
            }.getType());
            content = momentSendContentModel2 != null ? momentSendContentModel2.getContent() : null;
            if (content != null && content.length() != 0) {
                z = false;
            }
            if (!z) {
                p599o0oo00o.o00O0O.OooO0O0(mainMomentsTopicFollowingFragment.getActivity(), momentSendContentModel2, textView2);
                return;
            }
            int dyType2 = topicInfoModel.getDyType();
            if (dyType2 == MomentType.Image.getValue()) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000._photo_);
            } else if (dyType2 == MomentType.Video.getValue()) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000._Video_);
            } else {
                strOooO0OO = dyType2 == MomentType.Poll.getValue() ? com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000._Poll_) : p004OooO0oO.o000oOoO.OooO0O0("[", com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Other), "]");
            }
            textView2.setText(strOooO0OO);
        }
    }
}
