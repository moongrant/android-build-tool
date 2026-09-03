package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000OO00;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.moment.MomentGift;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p406o0Oo0Ooo.oOO0O0O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends o000O<MomentGift> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailGiftFragment f28845OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(MomentDetailGiftFragment momentDetailGiftFragment, Context context, int i) {
        super(context, i);
        this.f28845OooOoo0 = momentDetailGiftFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentGift item = (MomentGift) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        MomentDetailGiftFragment momentDetailGiftFragment = this.f28845OooOoo0;
        view.setOnClickListener(new o00000OO(momentDetailGiftFragment, item));
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(momentDetailGiftFragment.getActivity());
        oooO00o.f43911OooO0OO = item.getHeadUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.head));
        ImageView it = (ImageView) helper.getView(oO00O0oO.officials);
        if (UserInfo.Role.INSTANCE.isOfficial(item.role)) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooOOOO(it);
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooO0O0(it);
        }
        UserTagView userTagView = (UserTagView) helper.getView(oO00O0oO.gift_userTagView);
        userTagView.OooO0oO(item.getIsVip(), item.getVipLevel());
        long userId = item.getUserId();
        String nickname = item.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "item.nickname");
        userTagView.setName(oOO0O0O.OooO0O0(userId, nickname));
        userTagView.setNameTextColor(oO00O0o.color_333333_85);
        userTagView.setNameTextSize(15.0f);
        userTagView.setSex(item.getSex());
        userTagView.OooO0Oo(item.kaVIPLv, true, momentDetailGiftFragment.getViewLifecycleOwner());
        long userId2 = item.getUserId();
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
        if (l != null && userId2 == l.longValue() && Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo().getValue(), Boolean.TRUE)) {
            Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
            UserTagView.OooOO0o(userTagView, momentDetailGiftFragment.getViewLifecycleOwner(), (Integer) p464o0Oooo.o000000O.OooO0oO().getValue(), (String) p464o0Oooo.o000000O.OooO0o0().getValue(), 8);
        } else {
            Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
            UserTagView.OooOO0o(userTagView, momentDetailGiftFragment.getViewLifecycleOwner(), Integer.valueOf(item.wealthLevel), item.wealthBadgeImage, 8);
        }
        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(momentDetailGiftFragment.getActivity());
        oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(70, 70, item.getPropImage());
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0O0());
        oooO00o2.OooO0Oo((ImageView) helper.getView(oO00O0oO.item_post_detail_gift_list_gif_icon));
        helper.setText(oO00O0oO.item_post_detail_gift_list_gift_count, "× " + item.getPropNum());
    }
}
