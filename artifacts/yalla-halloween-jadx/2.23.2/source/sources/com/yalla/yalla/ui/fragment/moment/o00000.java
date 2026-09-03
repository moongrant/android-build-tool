package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p405o0Oo0OOO.oOO0O0;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p564o0oOo0O.o0O00O0o;
import p564o0oOo0O.o0O00OOO;
import p564o0oOo0O.o0O0o;
import p564o0oOo0O.o0OoO00O;
import p564o0oOo0O.o0OoOoOo;
import p564o0oOo0O.o0oO0Ooo;
import p564o0oOo0O.o0oOO;
import p605o0oo0O0O.o0O0O0Oo;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends p571o0oOoO0.o0000oo<MomentCommentDetailModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentFragment f28299OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(MomentDetailCommentFragment momentDetailCommentFragment, Context context, int i) {
        super(context, i);
        this.f28299OooOoo0 = momentDetailCommentFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        MomentReplyModel sonFirst;
        boolean z;
        LifecycleOwner viewLifecycleOwner;
        MomentDetailModel mPostDetailModel;
        LifecycleOwner viewLifecycleOwner2;
        MomentDetailModel mPostDetailModel2;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentCommentDetailModel item = (MomentCommentDetailModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        MomentDetailCommentItemView momentDetailCommentItemView = (MomentDetailCommentItemView) helper.getView(p562o0oOo000.o0OO00O.itemView);
        int layoutPosition = helper.getLayoutPosition();
        momentDetailCommentItemView.getClass();
        MomentDetailCommentFragment fragment = this.f28299OooOoo0;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(item, "item");
        momentDetailCommentItemView.fragment = fragment;
        momentDetailCommentItemView.position = layoutPosition;
        momentDetailCommentItemView.item = item;
        if (TextUtils.isEmpty(item.getUserid())) {
            return;
        }
        boolean zIsLocalMessageDiscolor = momentDetailCommentItemView.getItem().isLocalMessageDiscolor();
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        if (zIsLocalMessageDiscolor) {
            ooo0o0.f45048OooO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_EEFDFC));
            ooo0o0.f45050OooO0O0.setBackgroundColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.tr_00));
        } else {
            ooo0o0.f45048OooO.setBackgroundColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white));
            ooo0o0.f45050OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_fff5f5f7_r8);
        }
        p598o0oo00Oo.o0000O00.OooO0O0("comment item = ".concat(p187o00o00o0.OooO.OooO00o(momentDetailCommentItemView.getItem())));
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(momentDetailCommentItemView.getContext());
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(80, 80, momentDetailCommentItemView.getItem().getHeadurl());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(ooo0o0.f45053OooO0o);
        ImageView role = ooo0o0.f45073OooOoO0;
        Intrinsics.checkNotNullExpressionValue(role, "role");
        o000O.OooO0O0(role);
        if (UserInfo.Role.INSTANCE.isOfficial(momentDetailCommentItemView.getItem().getRole())) {
            Intrinsics.checkNotNullExpressionValue(role, "role");
            o000O.OooOOOO(role);
        }
        MomentDetailCommentFragment momentDetailCommentFragment = momentDetailCommentItemView.fragment;
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf((momentDetailCommentFragment == null || (mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel()) == null) ? null : Long.valueOf(mPostDetailModel2.getUserId())), momentDetailCommentItemView.getItem().getUserid());
        UserTagView userTagView = ooo0o0.f45075OooOoo;
        userTagView.setAuthorComment(zAreEqual);
        userTagView.OooO0oO(momentDetailCommentItemView.getItem().getVip(), momentDetailCommentItemView.getItem().getVipLevel());
        userTagView.setPremiumSize(16);
        userTagView.setSex(momentDetailCommentItemView.getItem().getSex());
        userTagView.setSexSize(14);
        userTagView.setNameTextColor(p562o0oOo000.o0OOO0o.color_A3A3A3);
        userTagView.setNameSize(14);
        userTagView.setNameTextSize(13.0f);
        long jOooO = com.code.android.util.o0OoOo0.OooO(0L, momentDetailCommentItemView.getItem().getUserid());
        TextView tagView = userTagView.getNameText();
        String defaultValue = com.code.android.util.o0OoOo0.OooOOO(momentDetailCommentItemView.getItem().getNickname(), "");
        o0oOO block = new o0oOO(momentDetailCommentItemView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(p562o0oOo000.o0OO00O.tag_friend_memo_name_tag, Long.valueOf(jOooO));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new p412o0Oo0o0O.o000O0o(jOooO, tagView, defaultValue, null, block), 2, null);
        userTagView.setKaVipSize(16);
        MomentDetailCommentFragment momentDetailCommentFragment2 = momentDetailCommentItemView.fragment;
        if (momentDetailCommentFragment2 != null && (viewLifecycleOwner2 = momentDetailCommentFragment2.getViewLifecycleOwner()) != null) {
            String userid = momentDetailCommentItemView.getItem().getUserid();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (oOOO0O0o.OooO00o(userid)) {
                Pair pair = (Pair) o0O00oO0.OooOO0().getValue();
                int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
                Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
                userTagView.OooO0Oo(iIntValue, (pair2 != null ? ((Number) pair2.getFirst()).intValue() : 0) == VipState.Vip.getValue(), viewLifecycleOwner2);
            } else {
                userTagView.OooO0Oo(momentDetailCommentItemView.getItem().getKaVIPLv(), true, viewLifecycleOwner2);
            }
            if (oOOO0O0o.OooO00o(momentDetailCommentItemView.getItem().getUserid()) && Intrinsics.areEqual(o0O00oO0.OooOo().getValue(), Boolean.TRUE)) {
                Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
                UserTagView.OooOO0o(userTagView, viewLifecycleOwner2, (Integer) o0O00oO0.OooO0oO().getValue(), (String) o0O00oO0.OooO0o0().getValue(), 8);
            } else {
                Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
                UserTagView.OooOO0o(userTagView, viewLifecycleOwner2, Integer.valueOf(momentDetailCommentItemView.getItem().getWealthLevel()), momentDetailCommentItemView.getItem().getWealthBadgeImage(), 8);
            }
        }
        int i = p562o0oOo000.o000000.post_comment_sending;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(i);
        if (momentDetailCommentItemView.getItem().getId() >= 1) {
            strOooO0OO = o0O0O0o0.OooO0Oo(momentDetailCommentItemView.getItem().getCreateTime(), System.currentTimeMillis());
        }
        ooo0o0.f45074OooOoOO.setText(strOooO0OO);
        FixTextView content = ooo0o0.f45051OooO0OO;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        o000O.OooO0O0(content);
        Intrinsics.checkNotNullExpressionValue(content, "content");
        o000O.OooOOOO(content);
        if (momentDetailCommentItemView.getItem().isHide()) {
            content.setText(p562o0oOo000.o000000.comment_is_hidden);
            content.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_333333_45));
        } else {
            MomentDetailCommentFragment momentDetailCommentFragment3 = momentDetailCommentItemView.fragment;
            p599o0oo00o.o00O0O.OooO0OO(momentDetailCommentFragment3 != null ? momentDetailCommentFragment3.getActivity() : null, momentDetailCommentItemView.getItem().getContent(), content, new p025Oooo0OO.o000O000(momentDetailCommentItemView));
            content.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_333333_85));
        }
        MutableLiveData<Integer> mutableLiveData = p429o0OoOO.OooOo00.f46776OooO00o;
        Context context = momentDetailCommentItemView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        mutableLiveData.observe((AppCompatActivity) context, new MomentDetailCommentItemView.o00O0O(new o0O0o(momentDetailCommentItemView)));
        boolean z2 = momentDetailCommentItemView.getItem().isSendProp() && momentDetailCommentItemView.getItem().getPropNum() > 0;
        String strOooO0o = o0O0O0Oo.OooO0o(momentDetailCommentItemView.getItem().getPropNum(), false);
        TextView textView = ooo0o0.f45066OooOOoo;
        textView.setText(strOooO0o);
        textView.setTextColor(z2 ? com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_333333) : com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_333333_65));
        ImageView rewardIv = ooo0o0.f45068OooOo0;
        Intrinsics.checkNotNullExpressionValue(rewardIv, "rewardIv");
        o000O.OooOOOO(rewardIv);
        int i2 = p562o0oOo000.o0Oo0oo.ic_moment_comment_reward_gray;
        rewardIv.setImageResource(i2);
        if (momentDetailCommentItemView.getItem().isSendProp()) {
            rewardIv.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_comment_reward_color);
        }
        SVGAView rewardSvga = ooo0o0.f45071OooOo0o;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        rewardSvga.setVisibility(4);
        rewardSvga.f13231OooOoo0 = new o0OoO00O(momentDetailCommentItemView);
        rewardSvga.f13230OooOoo = new o0O00O0o(momentDetailCommentItemView);
        ConstraintLayout layoutSon = ooo0o0.f45057OooOO0;
        Intrinsics.checkNotNullExpressionValue(layoutSon, "layoutSon");
        o000O.OooO0O0(layoutSon);
        if (momentDetailCommentItemView.getItem().isHide() || (sonFirst = momentDetailCommentItemView.getItem().getSonFirst()) == null) {
            return;
        }
        momentDetailCommentItemView.itemSon = sonFirst;
        int i3 = momentDetailCommentItemView.position;
        String strOooO00o = p187o00o00o0.OooO.OooO00o(momentDetailCommentItemView.getItem());
        String strOooO00o2 = p187o00o00o0.OooO.OooO00o(momentDetailCommentItemView.getItemSon());
        StringBuilder sbOooO00o = oo0o0O0.OooO0O0.OooO00o("BaseAdapter \nposition = ", i3, " \nitem= ", strOooO00o, "\nitemSon= ");
        sbOooO00o.append(strOooO00o2);
        p598o0oo00Oo.o0000O00.OooO0O0(sbOooO00o.toString());
        Intrinsics.checkNotNullExpressionValue(layoutSon, "layoutSon");
        o000O.OooOOOO(layoutSon);
        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(momentDetailCommentItemView.getContext());
        oooO00o2.OooO00o(d1.OooO0OO());
        oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(46, 46, momentDetailCommentItemView.getItemSon().getHeadurl());
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.OooO0Oo(ooo0o0.f45055OooO0oO);
        TextView contentNumSon = ooo0o0.f45052OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(contentNumSon, "contentNumSon");
        o000O.OooO0O0(contentNumSon);
        contentNumSon.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.xxx_replies), androidx.media3.session.o0000O00.OooO00o(momentDetailCommentItemView.getItem().getNum())));
        if (momentDetailCommentItemView.getItem().getNum() > 1) {
            Intrinsics.checkNotNullExpressionValue(contentNumSon, "contentNumSon");
            o000O.OooOOOO(contentNumSon);
        }
        ImageView roleSon = ooo0o0.f45072OooOoO;
        Intrinsics.checkNotNullExpressionValue(roleSon, "roleSon");
        o000O.OooO0O0(roleSon);
        if (momentDetailCommentItemView.getItemSon().getRole() == 2) {
            Intrinsics.checkNotNullExpressionValue(roleSon, "roleSon");
            o000O.OooOOOO(roleSon);
        }
        MomentDetailCommentFragment momentDetailCommentFragment4 = momentDetailCommentItemView.fragment;
        Long lValueOf = (momentDetailCommentFragment4 == null || (mPostDetailModel = momentDetailCommentFragment4.getMPostDetailModel()) == null) ? null : Long.valueOf(mPostDetailModel.getUserId());
        boolean z3 = lValueOf != null && lValueOf.longValue() == momentDetailCommentItemView.getItemSon().getUserid();
        UserTagView userTagViewSon = ooo0o0.f45077OooOooO;
        userTagViewSon.setAuthorComment(z3);
        userTagViewSon.OooO0oO(momentDetailCommentItemView.getItemSon().getVip(), momentDetailCommentItemView.getItemSon().getVipLevel());
        userTagViewSon.setSex(momentDetailCommentItemView.getItemSon().getSex());
        int i4 = p562o0oOo000.o0OOO0o.color_333333_45;
        userTagViewSon.setNameTextColor(i4);
        userTagViewSon.setNameTextSize(14.0f);
        long userid2 = momentDetailCommentItemView.getItemSon().getUserid();
        String nickname = momentDetailCommentItemView.getItemSon().getNickname();
        if (nickname == null) {
            nickname = "";
        }
        userTagViewSon.setName(com.code.android.util.o0OoOo0.OooOOO(p412o0Oo0o0O.o000O000.OooO0O0(userid2, nickname), ""));
        MomentDetailCommentFragment momentDetailCommentFragment5 = momentDetailCommentItemView.fragment;
        if (momentDetailCommentFragment5 == null || (viewLifecycleOwner = momentDetailCommentFragment5.getViewLifecycleOwner()) == null) {
            z = true;
        } else {
            long userid3 = momentDetailCommentItemView.getItemSon().getUserid();
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && userid3 == l.longValue()) {
                Pair pair3 = (Pair) o0O00oO0.OooOO0().getValue();
                int iIntValue2 = pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0;
                Pair pair4 = (Pair) o0O00oO0.OooOO0().getValue();
                userTagViewSon.OooO0Oo(iIntValue2, (pair4 != null ? ((Number) pair4.getFirst()).intValue() : 0) == VipState.Vip.getValue(), viewLifecycleOwner);
                z = true;
            } else {
                userTagViewSon.OooO0Oo(momentDetailCommentItemView.getItemSon().getKaVIPLv(), true, viewLifecycleOwner);
                z = true;
            }
            long userid4 = momentDetailCommentItemView.getItemSon().getUserid();
            Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
            if (l2 != null && userid4 == l2.longValue() && Intrinsics.areEqual(o0O00oO0.OooOo().getValue(), Boolean.TRUE)) {
                Intrinsics.checkNotNullExpressionValue(userTagViewSon, "userTagViewSon");
                UserTagView.OooOO0o(userTagViewSon, viewLifecycleOwner, (Integer) o0O00oO0.OooO0oO().getValue(), (String) o0O00oO0.OooO0o0().getValue(), 8);
            } else {
                Intrinsics.checkNotNullExpressionValue(userTagViewSon, "userTagViewSon");
                UserTagView.OooOO0o(userTagViewSon, viewLifecycleOwner, Integer.valueOf(momentDetailCommentItemView.getItemSon().getWealthLevel()), momentDetailCommentItemView.getItemSon().getWealthBadgeImage(), 8);
            }
        }
        FixTextView contentSon = ooo0o0.f45054OooO0o0;
        Intrinsics.checkNotNullExpressionValue(contentSon, "contentSon");
        o000O.OooO0O0(contentSon);
        Intrinsics.checkNotNullExpressionValue(contentSon, "contentSon");
        o000O.OooOOOO(contentSon);
        if (momentDetailCommentItemView.getItemSon().isHide()) {
            contentSon.setText(p562o0oOo000.o000000.comment_is_hidden);
            contentSon.setTextColor(com.code.android.util.o0000.OooO00o(i4));
        } else {
            MomentDetailCommentFragment momentDetailCommentFragment6 = momentDetailCommentItemView.fragment;
            p599o0oo00o.o00O0O.OooO0OO(momentDetailCommentFragment6 != null ? momentDetailCommentFragment6.getActivity() : null, momentDetailCommentItemView.getItemSon().getContent(), contentSon, new o000O00O.o0000Ooo(momentDetailCommentItemView, 5));
            contentSon.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_333333_85));
        }
        String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(i);
        if (momentDetailCommentItemView.getItemSon().getId() >= 1) {
            strOooO0OO2 = o0O0O0o0.OooO0Oo(momentDetailCommentItemView.getItemSon().getCreateTime(), System.currentTimeMillis());
        }
        ooo0o0.f45076OooOoo0.setText(strOooO0OO2);
        MomentReplyModel itemSon = momentDetailCommentItemView.getItemSon();
        Context context2 = momentDetailCommentItemView.getContext();
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        mutableLiveData.observe((AppCompatActivity) context2, new MomentDetailCommentItemView.o00O0O(new o0OoOoOo(momentDetailCommentItemView, itemSon)));
        MomentReplyModel itemSon2 = momentDetailCommentItemView.getItemSon();
        if (!itemSon2.isSendProp() || itemSon2.getPropNum() <= 0) {
            z = false;
        }
        String strOooO0o2 = o0O0O0Oo.OooO0o(itemSon2.getPropNum(), false);
        TextView textView2 = ooo0o0.f45069OooOo00;
        textView2.setText(strOooO0o2);
        textView2.setTextColor(com.code.android.util.o0000.OooO00o(z ? p562o0oOo000.o0OOO0o.color_333333 : p562o0oOo000.o0OOO0o.color_333333_65));
        ImageView rewardIvSon = ooo0o0.f45070OooOo0O;
        Intrinsics.checkNotNullExpressionValue(rewardIvSon, "rewardIvSon");
        o000O.OooOOOO(rewardIvSon);
        rewardIvSon.setImageResource(i2);
        if (itemSon2.isSendProp()) {
            rewardIvSon.setImageResource(p562o0oOo000.o0Oo0oo.ic_moment_comment_reward_color);
        }
        SVGAView rewardSvgaSon = ooo0o0.f45067OooOo;
        Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
        rewardSvgaSon.setVisibility(4);
        rewardSvgaSon.f13231OooOoo0 = new o0O00OOO(momentDetailCommentItemView);
        rewardSvgaSon.f13230OooOoo = new o0oO0Ooo(momentDetailCommentItemView);
    }
}
