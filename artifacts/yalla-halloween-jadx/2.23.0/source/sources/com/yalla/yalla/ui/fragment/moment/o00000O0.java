package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.o000OOo0;
import androidx.camera.core.impl.o00OOO00;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
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
import p029Oooo0oo.oo0ooO;
import p406o0Oo0Ooo.oOO0O0O;
import p406o0Oo0Ooo.oOO0OO0O;
import p556o0oOOooo.o0oo0000;
import p556o0oOOooo.oO00000o;
import p556o0oOOooo.oO000O0O;
import p556o0oOOooo.oO000OOo;
import p556o0oOOooo.oO000Oo;
import p556o0oOOooo.oO000Oo0;
import p556o0oOOooo.oO0Oo0oo;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends o000O<MomentCommentDetailModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentFragment f28831OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MomentDetailCommentFragment momentDetailCommentFragment, Context context, int i) {
        super(context, i);
        this.f28831OooOoo0 = momentDetailCommentFragment;
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
        MomentDetailCommentItemView momentDetailCommentItemView = (MomentDetailCommentItemView) helper.getView(oO00O0oO.itemView);
        int layoutPosition = helper.getLayoutPosition();
        momentDetailCommentItemView.getClass();
        MomentDetailCommentFragment fragment = this.f28831OooOoo0;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(item, "item");
        momentDetailCommentItemView.fragment = fragment;
        momentDetailCommentItemView.position = layoutPosition;
        momentDetailCommentItemView.item = item;
        if (TextUtils.isEmpty(item.getUserid())) {
            return;
        }
        boolean zIsLocalMessageDiscolor = momentDetailCommentItemView.getItem().isLocalMessageDiscolor();
        l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
        if (zIsLocalMessageDiscolor) {
            l6Var.f58337OooO.setBackgroundColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_EEFDFC));
            l6Var.f58339OooO0O0.setBackgroundColor(com.code.android.util.o0000.OooO00o(oO00O0o.tr_00));
        } else {
            l6Var.f58337OooO.setBackgroundColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_white));
            l6Var.f58339OooO0O0.setBackgroundResource(oOo00OO0.bg_fff5f5f7_r8);
        }
        p592o0oo00O.OooOOO0.OooO0O0("comment item = ".concat(p140o00OOooo.OooOO0.OooO00o(momentDetailCommentItemView.getItem())));
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(momentDetailCommentItemView.getContext());
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(80, 80, momentDetailCommentItemView.getItem().getHeadurl());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(l6Var.f58342OooO0o);
        ImageView imageView = l6Var.f58362OooOoO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.role");
        o000OO00.OooO0O0(imageView);
        if (UserInfo.Role.INSTANCE.isOfficial(momentDetailCommentItemView.getItem().getRole())) {
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.role");
            o000OO00.OooOOOO(imageView);
        }
        MomentDetailCommentFragment momentDetailCommentFragment = momentDetailCommentItemView.fragment;
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf((momentDetailCommentFragment == null || (mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel()) == null) ? null : Long.valueOf(mPostDetailModel2.getUserId())), momentDetailCommentItemView.getItem().getUserid());
        UserTagView userTagView = l6Var.f58364OooOoo;
        userTagView.setAuthorComment(zAreEqual);
        userTagView.OooO0oO(momentDetailCommentItemView.getItem().getVip(), momentDetailCommentItemView.getItem().getVipLevel());
        userTagView.setPremiumSize(16);
        userTagView.setSex(momentDetailCommentItemView.getItem().getSex());
        userTagView.setSexSize(14);
        userTagView.setNameTextColor(oO00O0o.color_A3A3A3);
        userTagView.setNameSize(14);
        userTagView.setNameTextSize(13.0f);
        long jOooO = com.code.android.util.o0OoOo0.OooO(0L, momentDetailCommentItemView.getItem().getUserid());
        TextView tagView = userTagView.getNameText();
        String defaultValue = com.code.android.util.o0OoOo0.OooOOO(momentDetailCommentItemView.getItem().getNickname(), "");
        o0oo0000 block = new o0oo0000(momentDetailCommentItemView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_friend_memo_name_tag, Long.valueOf(jOooO));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0OO0O(jOooO, tagView, defaultValue, null, block), 2, null);
        userTagView.setKaVipSize(16);
        MomentDetailCommentFragment momentDetailCommentFragment2 = momentDetailCommentItemView.fragment;
        if (momentDetailCommentFragment2 != null && (viewLifecycleOwner2 = momentDetailCommentFragment2.getViewLifecycleOwner()) != null) {
            String userid = momentDetailCommentItemView.getItem().getUserid();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (o00OOO00.OooO0O0(userid)) {
                Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
                int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
                Pair pair2 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
                userTagView.OooO0Oo(iIntValue, (pair2 != null ? ((Number) pair2.getFirst()).intValue() : 0) == VipState.Vip.getValue(), viewLifecycleOwner2);
            } else {
                userTagView.OooO0Oo(momentDetailCommentItemView.getItem().getKaVIPLv(), true, viewLifecycleOwner2);
            }
            if (o00OOO00.OooO0O0(momentDetailCommentItemView.getItem().getUserid()) && Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo().getValue(), Boolean.TRUE)) {
                Intrinsics.checkNotNullExpressionValue(userTagView, "binding.userTagView");
                UserTagView.OooOO0o(userTagView, viewLifecycleOwner2, (Integer) p464o0Oooo.o000000O.OooO0oO().getValue(), (String) p464o0Oooo.o000000O.OooO0o0().getValue(), 8);
            } else {
                Intrinsics.checkNotNullExpressionValue(userTagView, "binding.userTagView");
                UserTagView.OooOO0o(userTagView, viewLifecycleOwner2, Integer.valueOf(momentDetailCommentItemView.getItem().getWealthLevel()), momentDetailCommentItemView.getItem().getWealthBadgeImage(), 8);
            }
        }
        int i = oO00OOo0.post_comment_sending;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(i);
        if (momentDetailCommentItemView.getItem().getId() >= 1) {
            strOooO0OO = p601o0oo0O0.o0000oo.OooO0Oo(momentDetailCommentItemView.getItem().getCreateTime(), System.currentTimeMillis());
        }
        l6Var.f58363OooOoOO.setText(strOooO0OO);
        FixTextView fixTextView = l6Var.f58340OooO0OO;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.content");
        o000OO00.OooO0O0(fixTextView);
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.content");
        o000OO00.OooOOOO(fixTextView);
        if (momentDetailCommentItemView.getItem().isHide()) {
            fixTextView.setText(oO00OOo0.comment_is_hidden);
            fixTextView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_333333_45));
        } else {
            MomentDetailCommentFragment momentDetailCommentFragment3 = momentDetailCommentItemView.fragment;
            p595o0oo00Oo.o0000Ooo.OooO0OO(momentDetailCommentFragment3 != null ? momentDetailCommentFragment3.getActivity() : null, momentDetailCommentItemView.getItem().getContent(), fixTextView, new p499o0o00o0O.o0000O(momentDetailCommentItemView));
            fixTextView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_333333_85));
        }
        MutableLiveData<Integer> mutableLiveData = p427o0OoOO00.OooOo.f45669OooO00o;
        Context context = momentDetailCommentItemView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        mutableLiveData.observe((AppCompatActivity) context, new MomentDetailCommentItemView.o00Ooo(new oO00000o(momentDetailCommentItemView)));
        boolean z2 = momentDetailCommentItemView.getItem().isSendProp() && momentDetailCommentItemView.getItem().getPropNum() > 0;
        String strOooO0o = p590o0oo0.OooOOOO.OooO0o(momentDetailCommentItemView.getItem().getPropNum(), false);
        TextView textView = l6Var.f58355OooOOoo;
        textView.setText(strOooO0o);
        textView.setTextColor(z2 ? com.code.android.util.o0000.OooO00o(oO00O0o.color_333333) : com.code.android.util.o0000.OooO00o(oO00O0o.color_333333_65));
        ImageView imageView2 = l6Var.f58357OooOo0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.rewardIv");
        o000OO00.OooOOOO(imageView2);
        int i2 = oOo00OO0.ic_moment_comment_reward_gray;
        imageView2.setImageResource(i2);
        if (momentDetailCommentItemView.getItem().isSendProp()) {
            imageView2.setImageResource(oOo00OO0.ic_moment_comment_reward_color);
        }
        SVGAView sVGAView = l6Var.f58360OooOo0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvga");
        sVGAView.setVisibility(4);
        sVGAView.f10171OooOoo0 = new oO0Oo0oo(momentDetailCommentItemView);
        sVGAView.f10170OooOoo = new oO000OOo(momentDetailCommentItemView);
        ConstraintLayout constraintLayout = l6Var.f58346OooOO0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutSon");
        o000OO00.OooO0O0(constraintLayout);
        if (momentDetailCommentItemView.getItem().isHide() || (sonFirst = momentDetailCommentItemView.getItem().getSonFirst()) == null) {
            return;
        }
        momentDetailCommentItemView.itemSon = sonFirst;
        p592o0oo00O.OooOOO0.OooO0O0("BaseAdapter \nposition = " + momentDetailCommentItemView.position + " \nitem= " + p140o00OOooo.OooOO0.OooO00o(momentDetailCommentItemView.getItem()) + "\nitemSon= " + p140o00OOooo.OooOO0.OooO00o(momentDetailCommentItemView.getItemSon()));
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutSon");
        o000OO00.OooOOOO(constraintLayout);
        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(momentDetailCommentItemView.getContext());
        oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(46, 46, momentDetailCommentItemView.getItemSon().getHeadurl());
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.OooO0Oo(l6Var.f58344OooO0oO);
        TextView textView2 = l6Var.f58341OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.contentNumSon");
        o000OO00.OooO0O0(textView2);
        textView2.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.xxx_replies), oo0ooO.OooO00o(momentDetailCommentItemView.getItem().getNum())));
        if (momentDetailCommentItemView.getItem().getNum() > 1) {
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.contentNumSon");
            o000OO00.OooOOOO(textView2);
        }
        ImageView imageView3 = l6Var.f58361OooOoO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.roleSon");
        o000OO00.OooO0O0(imageView3);
        if (momentDetailCommentItemView.getItemSon().getRole() == 2) {
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.roleSon");
            o000OO00.OooOOOO(imageView3);
        }
        MomentDetailCommentFragment momentDetailCommentFragment4 = momentDetailCommentItemView.fragment;
        Long lValueOf = (momentDetailCommentFragment4 == null || (mPostDetailModel = momentDetailCommentFragment4.getMPostDetailModel()) == null) ? null : Long.valueOf(mPostDetailModel.getUserId());
        boolean z3 = lValueOf != null && lValueOf.longValue() == momentDetailCommentItemView.getItemSon().getUserid();
        UserTagView userTagView2 = l6Var.f58366OooOooO;
        userTagView2.setAuthorComment(z3);
        userTagView2.OooO0oO(momentDetailCommentItemView.getItemSon().getVip(), momentDetailCommentItemView.getItemSon().getVipLevel());
        userTagView2.setSex(momentDetailCommentItemView.getItemSon().getSex());
        int i3 = oO00O0o.color_333333_45;
        userTagView2.setNameTextColor(i3);
        userTagView2.setNameTextSize(14.0f);
        long userid2 = momentDetailCommentItemView.getItemSon().getUserid();
        String nickname = momentDetailCommentItemView.getItemSon().getNickname();
        if (nickname == null) {
            nickname = "";
        }
        userTagView2.setName(com.code.android.util.o0OoOo0.OooOOO(oOO0O0O.OooO0O0(userid2, nickname), ""));
        MomentDetailCommentFragment momentDetailCommentFragment5 = momentDetailCommentItemView.fragment;
        if (momentDetailCommentFragment5 == null || (viewLifecycleOwner = momentDetailCommentFragment5.getViewLifecycleOwner()) == null) {
            z = true;
        } else {
            long userid3 = momentDetailCommentItemView.getItemSon().getUserid();
            p464o0Oooo.o000000O o000000o3 = p464o0Oooo.o000000O.f46674OooO00o;
            Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            if (l != null && userid3 == l.longValue()) {
                Pair pair3 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
                int iIntValue2 = pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0;
                Pair pair4 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
                userTagView2.OooO0Oo(iIntValue2, (pair4 != null ? ((Number) pair4.getFirst()).intValue() : 0) == VipState.Vip.getValue(), viewLifecycleOwner);
                z = true;
            } else {
                userTagView2.OooO0Oo(momentDetailCommentItemView.getItemSon().getKaVIPLv(), true, viewLifecycleOwner);
                z = true;
            }
            long userid4 = momentDetailCommentItemView.getItemSon().getUserid();
            Long l2 = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            if (l2 != null && userid4 == l2.longValue() && Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo().getValue(), Boolean.TRUE)) {
                Intrinsics.checkNotNullExpressionValue(userTagView2, "binding.userTagViewSon");
                UserTagView.OooOO0o(userTagView2, viewLifecycleOwner, (Integer) p464o0Oooo.o000000O.OooO0oO().getValue(), (String) p464o0Oooo.o000000O.OooO0o0().getValue(), 8);
            } else {
                Intrinsics.checkNotNullExpressionValue(userTagView2, "binding.userTagViewSon");
                UserTagView.OooOO0o(userTagView2, viewLifecycleOwner, Integer.valueOf(momentDetailCommentItemView.getItemSon().getWealthLevel()), momentDetailCommentItemView.getItemSon().getWealthBadgeImage(), 8);
            }
        }
        FixTextView fixTextView2 = l6Var.f58343OooO0o0;
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.contentSon");
        o000OO00.OooO0O0(fixTextView2);
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.contentSon");
        o000OO00.OooOOOO(fixTextView2);
        if (momentDetailCommentItemView.getItemSon().isHide()) {
            fixTextView2.setText(oO00OOo0.comment_is_hidden);
            fixTextView2.setTextColor(com.code.android.util.o0000.OooO00o(i3));
        } else {
            MomentDetailCommentFragment momentDetailCommentFragment6 = momentDetailCommentItemView.fragment;
            p595o0oo00Oo.o0000Ooo.OooO0OO(momentDetailCommentFragment6 != null ? momentDetailCommentFragment6.getActivity() : null, momentDetailCommentItemView.getItemSon().getContent(), fixTextView2, new o000OOo0(momentDetailCommentItemView));
            fixTextView2.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_333333_85));
        }
        String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(i);
        if (momentDetailCommentItemView.getItemSon().getId() >= 1) {
            strOooO0OO2 = p601o0oo0O0.o0000oo.OooO0Oo(momentDetailCommentItemView.getItemSon().getCreateTime(), System.currentTimeMillis());
        }
        l6Var.f58365OooOoo0.setText(strOooO0OO2);
        MomentReplyModel itemSon = momentDetailCommentItemView.getItemSon();
        Context context2 = momentDetailCommentItemView.getContext();
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        mutableLiveData.observe((AppCompatActivity) context2, new MomentDetailCommentItemView.o00Ooo(new oO000O0O(momentDetailCommentItemView, itemSon)));
        MomentReplyModel itemSon2 = momentDetailCommentItemView.getItemSon();
        if (!itemSon2.isSendProp() || itemSon2.getPropNum() <= 0) {
            z = false;
        }
        String strOooO0o2 = p590o0oo0.OooOOOO.OooO0o(itemSon2.getPropNum(), false);
        TextView textView3 = l6Var.f58358OooOo00;
        textView3.setText(strOooO0o2);
        textView3.setTextColor(com.code.android.util.o0000.OooO00o(z ? oO00O0o.color_333333 : oO00O0o.color_333333_65));
        ImageView imageView4 = l6Var.f58359OooOo0O;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.rewardIvSon");
        o000OO00.OooOOOO(imageView4);
        imageView4.setImageResource(i2);
        if (itemSon2.isSendProp()) {
            imageView4.setImageResource(oOo00OO0.ic_moment_comment_reward_color);
        }
        SVGAView sVGAView2 = l6Var.f58356OooOo;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.rewardSvgaSon");
        sVGAView2.setVisibility(4);
        sVGAView2.f10171OooOoo0 = new oO000Oo0(momentDetailCommentItemView);
        sVGAView2.f10170OooOoo = new oO000Oo(momentDetailCommentItemView);
    }
}
