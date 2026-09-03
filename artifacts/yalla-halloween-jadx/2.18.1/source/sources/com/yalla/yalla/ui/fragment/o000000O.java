package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.app.base.view.FixTextView;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import com.yalla.yalla.ui.fragment.o00O0O;
import com.yalla.yalla.ui.fragment.o00Oo0;
import com.yalla.yalla.ui.fragment.o00Ooo;
import com.yalla.yalla.ui.fragment.o0ooOOo;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p173o00OooO0.o0o0Oo;
import p174o00OooOO.o0O00OOO;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends p188o00o00o0.OooO0OO<PostCommentDetailModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24471OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(PostDetailCommentFragment postDetailCommentFragment, Context context) {
        super(context, R.layout.item_post_detail_comment);
        this.f24471OooO00o = postDetailCommentFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        int i;
        Context context;
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        final PostCommentDetailModel item = (PostCommentDetailModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (TextUtils.isEmpty(item.getUserid())) {
            return;
        }
        if (item.isLocalMessageDiscolor()) {
            helper.OooO0o0(R.id.item_post_detail_comment_bg_layout, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_E9FFFD));
            helper.OooO0o(R.id.item_post_detail_comment_layout_content_son, R.drawable.bg_round_bg_d7fbf8);
        } else {
            helper.OooO0o0(R.id.item_post_detail_comment_bg_layout, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_white));
            helper.OooO0o(R.id.item_post_detail_comment_layout_content_son, R.drawable.bg_round_bg_f5f5f5_r4);
        }
        helper.OooOOOO(R.id.item_post_detail_comment_bg_layout, new o000oOoO(this.f24471OooO00o, item));
        final PostDetailCommentFragment postDetailCommentFragment = this.f24471OooO00o;
        helper.OooOOOo(R.id.item_post_detail_comment_bg_layout, new View.OnLongClickListener() { // from class: o0oOoOoO.m2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                PostDetailCommentFragment this$0 = postDetailCommentFragment;
                PostCommentDetailModel item2 = item;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item2, "$item");
                o00O0O onLogin = new o00O0O(this$0, item2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return true;
                }
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 == null) {
                    return true;
                }
                LoginActivity.OooO00o oooO00o2 = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return true;
            }
        });
        final PostDetailCommentFragment postDetailCommentFragment2 = this.f24471OooO00o;
        helper.OooOOOo(R.id.item_post_detail_comment_edit_content, new View.OnLongClickListener() { // from class: o0oOoOoO.n2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                PostDetailCommentFragment this$0 = postDetailCommentFragment2;
                PostCommentDetailModel item2 = item;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item2, "$item");
                o00Oo0 onLogin = new o00Oo0(this$0, item2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return true;
                }
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 == null) {
                    return true;
                }
                LoginActivity.OooO00o oooO00o2 = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return true;
            }
        });
        final PostDetailCommentFragment postDetailCommentFragment3 = this.f24471OooO00o;
        helper.OooOOOo(R.id.item_post_detail_comment_layout_content_son, new View.OnLongClickListener() { // from class: o0oOoOoO.o2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                PostDetailCommentFragment this$0 = postDetailCommentFragment3;
                PostCommentDetailModel item2 = item;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item2, "$item");
                o00Ooo onLogin = new o00Ooo(this$0, item2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return true;
                }
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 == null) {
                    return true;
                }
                LoginActivity.OooO00o oooO00o2 = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return true;
            }
        });
        helper.OooOOOO(R.id.item_post_detail_comment_head_iv, new oo000o(this.f24471OooO00o, item));
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.OooO0OO(1, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_e2e2e2));
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(item.getHeadurl(), 80, 80);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.item_post_detail_comment_head_iv));
        UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.comment_userTagView);
        userTagView.OooO0o(item.getVip(), item.getVipLevel());
        userTagView.setSex(item.getSex());
        userTagView.setNameTextColor(R.color.color_666666);
        userTagView.setNameTextSize(14.0f);
        helper.OooO0oO(R.id.item_post_detail_comment_role_iv, item.getRole() == 2);
        p520o0o0O0O0.o00O0O o00o0o2 = p520o0o0O0O0.o00O0O.f42677OooO00o;
        String userid = item.getUserid();
        Intrinsics.checkNotNullExpressionValue(userid, "item.userid");
        long jOooO0o = com.yalla.support.common.util.OooO.OooO0o(userid);
        View view = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "helper.itemView");
        String nickname = item.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "item.nickname");
        o00o0o2.OooO0OO(jOooO0o, view, nickname, new o00oO0o(userTagView));
        String userid2 = item.getUserid();
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (p142o00OOooO.o0000O.OooO00o(oooOOO, userid2)) {
            Pair<Integer, Integer> value = oooOOO.OooO().getValue();
            int iIntValue = value != null ? value.getSecond().intValue() : 0;
            Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
            userTagView.OooO0OO(iIntValue, (value2 != null ? value2.getFirst().intValue() : 0) == VipState.Vip.getValue());
        } else {
            userTagView.setKaVip(item.kaVIPLv);
        }
        String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.post_comment_sending);
        if (item.getId() >= 1) {
            strOooO0OO = o00O0.f48624OooO00o.OooO0Oo(item.getCreateTime(), System.currentTimeMillis());
        }
        helper.OooOO0(R.id.item_post_detail_comment_time_tv, "" + strOooO0OO);
        FixTextView fixTextView = (FixTextView) helper.OooO0Oo(R.id.item_post_detail_comment_edit_content);
        if (item.getContent() != null) {
            fixTextView.setVisibility(0);
            FragmentActivity activity = this.f24471OooO00o.getActivity();
            MomentSendContentModel content = item.getContent();
            final PostDetailCommentFragment postDetailCommentFragment4 = this.f24471OooO00o;
            o0o0Oo.OooO0O0(activity, content, fixTextView, new o0O00OOO.OooO00o() { // from class: o0oOoOoO.p2
                @Override // o00OooOO.o0O00OOO.OooO00o
                public final void OooO00o() {
                    PostDetailCommentFragment this$0 = postDetailCommentFragment4;
                    PostCommentDetailModel item2 = item;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    o0ooOOo onLogin = new o0ooOOo(this$0, item2);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                        return;
                    }
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o3 = LoginActivity.f21752OooooO0;
                        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                }
            });
        } else {
            fixTextView.setVisibility(8);
        }
        MomentDetailModel momentDetailModel = this.f24471OooO00o.mPostDetailModel;
        userTagView.setAuthor(Intrinsics.areEqual(String.valueOf(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null), item.getUserid()));
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(item.getSon())) {
            helper.OooO0oO(R.id.item_post_detail_comment_layout_content_son, true);
            helper.OooOO0(R.id.item_post_detail_comment_tv_content_son_num, com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.xxx_replies), item.getNum() + ""));
            helper.OooO0oO(R.id.item_post_detail_comment_tv_content_son_num, item.getNum() > 1);
            PostCommentSonModel postCommentSonModel = item.getSon().get(0);
            FixTextView fixTextView2 = (FixTextView) helper.OooO0Oo(R.id.item_post_detail_comment_edit_content_son);
            if (postCommentSonModel.getContent() != null) {
                fixTextView2.setVisibility(0);
                FragmentActivity activity2 = this.f24471OooO00o.getActivity();
                MomentSendContentModel content2 = postCommentSonModel.getContent();
                final PostDetailCommentFragment postDetailCommentFragment5 = this.f24471OooO00o;
                o0o0Oo.OooO0O0(activity2, content2, fixTextView2, new o0O00OOO.OooO00o() { // from class: o0oOoOoO.q2
                    @Override // o00OooOO.o0O00OOO.OooO00o
                    public final void OooO00o() {
                        PostDetailCommentFragment this$0 = postDetailCommentFragment5;
                        PostCommentDetailModel item2 = item;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(item2, "$item");
                        PostDetailCommentSonListActivity.f22473o0ooOOo.OooO00o(this$0.getActivity(), true, this$0.mPostDetailModel, item2, null);
                    }
                });
                long userid3 = postCommentSonModel.getUserid();
                String nickname2 = postCommentSonModel.getNickname();
                Intrinsics.checkNotNullExpressionValue(nickname2, "postCommentSonModel.nickname");
                String strOooO0O0 = o00o0o2.OooO0O0(userid3, nickname2);
                Editable editableText = fixTextView2.getEditableText();
                String strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0O0, ": ");
                i = R.color.color_666666;
                editableText.insert(0, p522o0o0O0o.o00O0.OooO0oo(strOooO0Oo, Integer.valueOf(R.color.color_666666), new o0OOO0o(this.f24471OooO00o, postCommentSonModel)));
            } else {
                i = R.color.color_666666;
                fixTextView2.setVisibility(8);
            }
        } else {
            i = R.color.color_666666;
            helper.OooO0oO(R.id.item_post_detail_comment_layout_content_son, false);
        }
        helper.OooOOOO(R.id.item_post_detail_comment_layout_content_son, new o0OoOo0(this.f24471OooO00o, item));
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.OooO0Oo(R.id.item_post_detail_comment_praiseCount);
        PraiseView praiseView = (PraiseView) helper.OooO0Oo(R.id.item_post_detail_comment_praiseIv);
        textView.setText(p168o00Ooo0.o0O0O00.OooO0oO(item.getPraiseNum(), false));
        praiseView.OooO0OO(item.isPraise() && item.getPraiseNum() > 0);
        if (!item.isPraise() || item.getPraiseNum() <= 0) {
            textView.setTextColor(o000O000.OooO00o.OooO0O0(getContext(), R.color.color_54000000));
        } else {
            textView.setTextColor(o000O000.OooO00o.OooO0O0(getContext(), R.color.color_FE6C6C));
        }
        helper.OooOO0o(R.id.item_post_detail_comment_hot, this.f24471OooO00o.mSortType == 0 && item.getIsFeature() == 1);
        o0OO00O o0oo00o2 = new o0OO00O(this.f24471OooO00o, item, praiseView, helper);
        praiseView.setOnClickListener(o0oo00o2);
        textView.setOnClickListener(o0oo00o2);
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z = item.isSendProp() && item.getPropNum() > 0;
        TextView textView2 = (TextView) helper.OooO0Oo(R.id.item_post_detail_comment_rewardCount);
        SVGAView rewardSvga = (SVGAView) helper.OooO0Oo(R.id.item_post_detail_comment_reward_svga);
        ImageView imageView = (ImageView) helper.OooO0Oo(R.id.item_post_detail_comment_reward_iv);
        textView2.setText(p168o00Ooo0.o0O0O00.OooO0oO(item.getPropNum(), false));
        if (z) {
            context = getContext();
            i = R.color.color_FFA16C;
        } else {
            context = getContext();
        }
        textView2.setTextColor(o000O000.OooO00o.OooO0O0(context, i));
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.icon_reward_gray);
        if (item.isSendProp()) {
            imageView.setImageResource(R.drawable.icon_reward_red);
        }
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        rewardSvga.setVisibility(4);
        rewardSvga.f21008Ooooo00 = new oo0o0Oo(rewardSvga, imageView);
        rewardSvga.f21009Ooooo0o = new o0O0O00(rewardSvga, imageView);
        o000000 o000000Var = new o000000(item, this.f24471OooO00o, rewardSvga, textView2);
        textView2.setOnClickListener(o000000Var);
        rewardSvga.setOnClickListener(o000000Var);
        imageView.setOnClickListener(o000000Var);
    }
}
