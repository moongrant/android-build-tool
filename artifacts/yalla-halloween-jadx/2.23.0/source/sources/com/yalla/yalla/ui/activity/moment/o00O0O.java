package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p406o0Oo0Ooo.oOO0O0O;
import p417o0OoO0.o0000O0O;
import p556o0oOOooo.oO00OO0O;
import p556o0oOOooo.oO00OOO;
import p556o0oOOooo.oO00OOOo;
import p556o0oOOooo.oO00Oo0;
import p556o0oOOooo.oO00o00O;
import p556o0oOOooo.oO0OOO00;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p595o0oo00Oo.o0000Ooo;
import p601o0oo0O0.o0000oo;
import p641o0ooOOOO.x6;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends o000O<MomentReplyModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f26435OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(MomentReplyActivity momentReplyActivity, int i) {
        super(momentReplyActivity, i);
        this.f26435OooOoo0 = momentReplyActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        MomentDetailActivityVM momentDetailActivityVMOooOoO;
        MomentDetailModel currentMomentDetail;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentReplyModel model = (MomentReplyModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "item");
        MomentReplyItemView momentReplyItemView = (MomentReplyItemView) helper.getView(oO00O0oO.itemView);
        int layoutPosition = helper.getLayoutPosition();
        momentReplyItemView.getClass();
        MomentReplyActivity activity = this.f26435OooOoo0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(model, "model");
        momentReplyItemView.activity = activity;
        momentReplyItemView.position = layoutPosition;
        momentReplyItemView.f31132OooO0o = model;
        if (model != null) {
            momentReplyItemView.f31132OooO0o = model;
            p592o0oo00O.OooOOO0.OooO0O0("BaseAdapter \nposition = " + layoutPosition + " \nitem= " + p140o00OOooo.OooOO0.OooO00o(model) + "\nitemSon= " + p140o00OOooo.OooOO0.OooO00o(momentReplyItemView.f31132OooO0o));
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(momentReplyItemView.getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(46, 46, model.getHeadurl());
            oooO00o.f43909OooO00o = 0;
            x6 x6Var = momentReplyItemView.f31131OooO0Oo;
            oooO00o.OooO0Oo(x6Var.f59280OooO0Oo);
            ImageView imageView = x6Var.f59287OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.roleSon");
            o000OO00.OooO0O0(imageView);
            if (model.getRole() == 2) {
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.roleSon");
                o000OO00.OooOOOO(imageView);
            }
            MomentReplyActivity momentReplyActivity = momentReplyItemView.activity;
            Long lValueOf = (momentReplyActivity == null || (momentDetailActivityVMOooOoO = momentReplyActivity.OooOoO()) == null || (currentMomentDetail = momentDetailActivityVMOooOoO.getCurrentMomentDetail()) == null) ? null : Long.valueOf(currentMomentDetail.getUserId());
            boolean z = lValueOf != null && lValueOf.longValue() == model.getUserid();
            UserTagView userTagView = x6Var.f59288OooOOO;
            userTagView.setAuthorComment(z);
            userTagView.OooO0oO(model.getVip(), model.getVipLevel());
            userTagView.setSex(model.getSex());
            int i = oO00O0o.color_333333_45;
            userTagView.setNameTextColor(i);
            userTagView.setNameTextSize(13.0f);
            long userid = model.getUserid();
            String nickname = model.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            userTagView.setName(com.code.android.util.o0OoOo0.OooOOO(oOO0O0O.OooO0O0(userid, nickname), ""));
            MomentReplyActivity momentReplyActivity2 = momentReplyItemView.activity;
            if (momentReplyActivity2 != null) {
                long userid2 = model.getUserid();
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                if (l != null && userid2 == l.longValue()) {
                    Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
                    int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
                    Pair pair2 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
                    userTagView.OooO0Oo(iIntValue, (pair2 != null ? ((Number) pair2.getFirst()).intValue() : 0) == VipState.Vip.getValue(), momentReplyActivity2);
                } else {
                    userTagView.OooO0Oo(model.getKaVIPLv(), true, momentReplyActivity2);
                }
                long userid3 = model.getUserid();
                Long l2 = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                if (l2 != null && userid3 == l2.longValue() && Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo().getValue(), Boolean.TRUE)) {
                    Intrinsics.checkNotNullExpressionValue(userTagView, "binding.userTagViewSon");
                    UserTagView.OooOO0o(userTagView, momentReplyActivity2, (Integer) p464o0Oooo.o000000O.OooO0oO().getValue(), (String) p464o0Oooo.o000000O.OooO0o0().getValue(), 8);
                } else {
                    Intrinsics.checkNotNullExpressionValue(userTagView, "binding.userTagViewSon");
                    UserTagView.OooOO0o(userTagView, momentReplyActivity2, Integer.valueOf(model.getWealthLevel()), model.getWealthBadgeImage(), 8);
                }
            }
            FixTextView fixTextView = x6Var.f59279OooO0OO;
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.contentSon");
            o000OO00.OooO0O0(fixTextView);
            model.getContent();
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.contentSon");
            o000OO00.OooOOOO(fixTextView);
            if (model.isHide()) {
                fixTextView.setText(oO00OOo0.comment_is_hidden);
                fixTextView.setTextColor(o0000.OooO00o(i));
            } else {
                o0000Ooo.OooO0OO(momentReplyItemView.activity, model.getContent(), fixTextView, new oO00OO0O());
                int i2 = oO00O0o.color_333333_85;
                fixTextView.setTextColor(o0000.OooO00o(i2));
                if (o0000O0O.OooO0o(model.getParentUserName())) {
                    String parentUserId = model.getParentUserId();
                    Intrinsics.checkNotNullParameter(AppEventsConstants.EVENT_PARAM_VALUE_NO, "content");
                    if (!Intrinsics.areEqual(parentUserId, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                        String parentUserId2 = model.getParentUserId();
                        long jOooO = parentUserId2 != null ? com.code.android.util.o0OoOo0.OooO(0L, parentUserId2) : 0L;
                        String parentUserName = model.getParentUserName();
                        fixTextView.getEditableText().insert(0, o0000O0O.OooO(androidx.camera.core.impl.OooOOOO.OooO00o(oOO0O0O.OooO0O0(jOooO, parentUserName != null ? parentUserName : ""), ": "), Integer.valueOf(i), new oO00OOO(momentReplyItemView, model)));
                        fixTextView.getEditableText().insert(0, o0000O0O.OooO(androidx.camera.core.impl.OooOOOO.OooO00o(o0000.OooO0OO(oO00OOo0.Reply_to), ": "), Integer.valueOf(i2), oO00OOOo.f56108OooO0Oo));
                    }
                }
            }
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
            if (model.getId() >= 1) {
                strOooO0OO = o0000oo.OooO0Oo(model.getCreateTime(), System.currentTimeMillis());
            }
            x6Var.f59289OooOOO0.setText(strOooO0OO);
            MutableLiveData<Integer> mutableLiveData = p427o0OoOO00.OooOo.f45669OooO00o;
            Context context = momentReplyItemView.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            mutableLiveData.observe((AppCompatActivity) context, new MomentReplyItemView.OooOOOO(new oO00Oo0(momentReplyItemView, model)));
            boolean z2 = model.isSendProp() && model.getPropNum() > 0;
            String strOooO0o = p590o0oo0.OooOOOO.OooO0o(model.getPropNum(), false);
            TextView textView = x6Var.f59276OooO;
            textView.setText(strOooO0o);
            textView.setTextColor(o0000.OooO00o(z2 ? oO00O0o.color_333333 : oO00O0o.color_333333_65));
            ImageView imageView2 = x6Var.f59285OooOO0;
            imageView2.setVisibility(0);
            imageView2.setImageResource(oOo00OO0.ic_moment_comment_reward_gray);
            if (model.isSendProp()) {
                imageView2.setImageResource(oOo00OO0.ic_moment_comment_reward_color);
            }
            SVGAView sVGAView = x6Var.f59286OooOO0O;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvgaSon");
            sVGAView.setVisibility(4);
            sVGAView.f10171OooOoo0 = new oO0OOO00(momentReplyItemView);
            sVGAView.f10170OooOoo = new oO00o00O(momentReplyItemView);
        }
    }
}
