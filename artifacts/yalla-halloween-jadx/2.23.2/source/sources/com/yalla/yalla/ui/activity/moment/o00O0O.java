package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
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
import p039OoooOoo.o00O0OO0;
import p405o0Oo0OOO.oOOO00Oo;
import p412o0Oo0o0O.o000O000;
import p423o0OoO0OO.o00O00OO;
import p475o0Ooooo0.o0O00oO0;
import p564o0oOo0O.o0O0O0O;
import p564o0oOo0O.o0O0o000;
import p564o0oOo0O.o0oO0O0o;
import p564o0oOo0O.oo0OOoo;
import p571o0oOoO0.o0000oo;
import p598o0oo00Oo.o0000O00;
import p605o0oo0O0O.o0O0O0Oo;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends o0000oo<MomentReplyModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f25983OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(MomentReplyActivity momentReplyActivity, int i) {
        super(momentReplyActivity, i);
        this.f25983OooOoo0 = momentReplyActivity;
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
        MomentReplyItemView momentReplyItemView = (MomentReplyItemView) helper.getView(p562o0oOo000.o0OO00O.itemView);
        int layoutPosition = helper.getLayoutPosition();
        momentReplyItemView.getClass();
        MomentReplyActivity activity = this.f25983OooOoo0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(model, "model");
        momentReplyItemView.activity = activity;
        momentReplyItemView.position = layoutPosition;
        momentReplyItemView.f30591OooO0o = model;
        if (model != null) {
            momentReplyItemView.f30591OooO0o = model;
            String strOooO00o = p187o00o00o0.OooO.OooO00o(model);
            String strOooO00o2 = p187o00o00o0.OooO.OooO00o(momentReplyItemView.f30591OooO0o);
            StringBuilder sbOooO00o = oo0o0O0.OooO0O0.OooO00o("BaseAdapter \nposition = ", layoutPosition, " \nitem= ", strOooO00o, "\nitemSon= ");
            sbOooO00o.append(strOooO00o2);
            o0000O00.OooO0O0(sbOooO00o.toString());
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(momentReplyItemView.getContext());
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(46, 46, model.getHeadurl());
            oooO00o.f43124OooO00o = 0;
            oOOO00Oo oooo00oo = momentReplyItemView.f30590OooO0Oo;
            oooO00o.OooO0Oo(oooo00oo.f45146OooO0Oo);
            ImageView roleSon = oooo00oo.f45153OooOO0o;
            Intrinsics.checkNotNullExpressionValue(roleSon, "roleSon");
            o000O.OooO0O0(roleSon);
            if (model.getRole() == 2) {
                Intrinsics.checkNotNullExpressionValue(roleSon, "roleSon");
                o000O.OooOOOO(roleSon);
            }
            MomentReplyActivity momentReplyActivity = momentReplyItemView.activity;
            Long lValueOf = (momentReplyActivity == null || (momentDetailActivityVMOooOoO = momentReplyActivity.OooOoO()) == null || (currentMomentDetail = momentDetailActivityVMOooOoO.getCurrentMomentDetail()) == null) ? null : Long.valueOf(currentMomentDetail.getUserId());
            boolean z = lValueOf != null && lValueOf.longValue() == model.getUserid();
            UserTagView userTagViewSon = oooo00oo.f45154OooOOO;
            userTagViewSon.setAuthorComment(z);
            userTagViewSon.OooO0oO(model.getVip(), model.getVipLevel());
            userTagViewSon.setSex(model.getSex());
            int i = p562o0oOo000.o0OOO0o.color_333333_45;
            userTagViewSon.setNameTextColor(i);
            userTagViewSon.setNameTextSize(13.0f);
            long userid = model.getUserid();
            String nickname = model.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            userTagViewSon.setName(com.code.android.util.o0OoOo0.OooOOO(o000O000.OooO0O0(userid, nickname), ""));
            MomentReplyActivity momentReplyActivity2 = momentReplyItemView.activity;
            if (momentReplyActivity2 != null) {
                long userid2 = model.getUserid();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                if (l != null && userid2 == l.longValue()) {
                    Pair pair = (Pair) o0O00oO0.OooOO0().getValue();
                    int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
                    Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
                    userTagViewSon.OooO0Oo(iIntValue, (pair2 != null ? ((Number) pair2.getFirst()).intValue() : 0) == VipState.Vip.getValue(), momentReplyActivity2);
                } else {
                    userTagViewSon.OooO0Oo(model.getKaVIPLv(), true, momentReplyActivity2);
                }
                long userid3 = model.getUserid();
                Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
                if (l2 != null && userid3 == l2.longValue() && Intrinsics.areEqual(o0O00oO0.OooOo().getValue(), Boolean.TRUE)) {
                    Intrinsics.checkNotNullExpressionValue(userTagViewSon, "userTagViewSon");
                    UserTagView.OooOO0o(userTagViewSon, momentReplyActivity2, (Integer) o0O00oO0.OooO0oO().getValue(), (String) o0O00oO0.OooO0o0().getValue(), 8);
                } else {
                    Intrinsics.checkNotNullExpressionValue(userTagViewSon, "userTagViewSon");
                    UserTagView.OooOO0o(userTagViewSon, momentReplyActivity2, Integer.valueOf(model.getWealthLevel()), model.getWealthBadgeImage(), 8);
                }
            }
            FixTextView contentSon = oooo00oo.f45145OooO0OO;
            Intrinsics.checkNotNullExpressionValue(contentSon, "contentSon");
            o000O.OooO0O0(contentSon);
            model.getContent();
            Intrinsics.checkNotNullExpressionValue(contentSon, "contentSon");
            o000O.OooOOOO(contentSon);
            if (model.isHide()) {
                contentSon.setText(p562o0oOo000.o000000.comment_is_hidden);
                contentSon.setTextColor(o0000.OooO00o(i));
            } else {
                p599o0oo00o.o00O0O.OooO0OO(momentReplyItemView.activity, model.getContent(), contentSon, new o00O0OO0());
                int i2 = p562o0oOo000.o0OOO0o.color_333333_85;
                contentSon.setTextColor(o0000.OooO00o(i2));
                if (o00O00OO.OooO0o(model.getParentUserName())) {
                    String parentUserId = model.getParentUserId();
                    Intrinsics.checkNotNullParameter(AppEventsConstants.EVENT_PARAM_VALUE_NO, "content");
                    if (!Intrinsics.areEqual(parentUserId, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                        String parentUserId2 = model.getParentUserId();
                        long jOooO = parentUserId2 != null ? com.code.android.util.o0OoOo0.OooO(0L, parentUserId2) : 0L;
                        String parentUserName = model.getParentUserName();
                        contentSon.getEditableText().insert(0, o00O00OO.OooO(androidx.camera.core.impl.OooOOOO.OooO00o(o000O000.OooO0O0(jOooO, parentUserName != null ? parentUserName : ""), ": "), Integer.valueOf(i), new o0O0O0O(momentReplyItemView, model)));
                        contentSon.getEditableText().insert(0, o00O00OO.OooO(androidx.camera.core.impl.OooOOOO.OooO00o(o0000.OooO0OO(p562o0oOo000.o000000.Reply_to), ": "), Integer.valueOf(i2), o0oO0O0o.f56376OooO0Oo));
                    }
                }
            }
            String strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
            if (model.getId() >= 1) {
                strOooO0OO = o0O0O0o0.OooO0Oo(model.getCreateTime(), System.currentTimeMillis());
            }
            oooo00oo.f45155OooOOO0.setText(strOooO0OO);
            MutableLiveData<Integer> mutableLiveData = p429o0OoOO.OooOo00.f46776OooO00o;
            Context context = momentReplyItemView.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            mutableLiveData.observe((AppCompatActivity) context, new MomentReplyItemView.OooOOOO(new p564o0oOo0O.o0O0O0o0(momentReplyItemView, model)));
            boolean z2 = model.isSendProp() && model.getPropNum() > 0;
            String strOooO0o = o0O0O0Oo.OooO0o(model.getPropNum(), false);
            TextView textView = oooo00oo.f45142OooO;
            textView.setText(strOooO0o);
            textView.setTextColor(o0000.OooO00o(z2 ? p562o0oOo000.o0OOO0o.color_333333 : p562o0oOo000.o0OOO0o.color_333333_65));
            ImageView imageView = oooo00oo.f45151OooOO0;
            imageView.setVisibility(0);
            imageView.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_comment_reward_gray);
            if (model.isSendProp()) {
                imageView.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_comment_reward_color);
            }
            SVGAView rewardSvgaSon = oooo00oo.f45152OooOO0O;
            Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
            rewardSvgaSon.setVisibility(4);
            rewardSvgaSon.f13231OooOoo0 = new oo0OOoo(momentReplyItemView);
            rewardSvgaSon.f13230OooOoo = new o0O0o000(momentReplyItemView);
        }
    }
}
