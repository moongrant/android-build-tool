package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000O;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.moment.MomentGift;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p475o0Ooooo0.o0O00oO0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends p571o0oOoO0.o0000oo<MomentGift> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailGiftFragment f28308OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(MomentDetailGiftFragment momentDetailGiftFragment, Context context, int i) {
        super(context, i);
        this.f28308OooOoo0 = momentDetailGiftFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentGift item = (MomentGift) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        MomentDetailGiftFragment momentDetailGiftFragment = this.f28308OooOoo0;
        view.setOnClickListener(new o00000O(momentDetailGiftFragment, item));
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(momentDetailGiftFragment.getActivity());
        oooO00o.f43126OooO0OO = item.getHeadUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.head));
        ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.officials);
        if (UserInfo.Role.INSTANCE.isOfficial(item.role)) {
            Intrinsics.checkNotNull(imageView);
            o000O.OooOOOO(imageView);
        } else {
            Intrinsics.checkNotNull(imageView);
            o000O.OooO0O0(imageView);
        }
        UserTagView userTagView = (UserTagView) helper.getView(p562o0oOo000.o0OO00O.gift_userTagView);
        userTagView.OooO0oO(item.getIsVip(), item.getVipLevel());
        long userId = item.getUserId();
        String nickname = item.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "getNickname(...)");
        userTagView.setName(p412o0Oo0o0O.o000O000.OooO0O0(userId, nickname));
        userTagView.setNameTextColor(p562o0oOo000.o0OOO0o.color_333333_85);
        userTagView.setNameTextSize(15.0f);
        userTagView.setSex(item.getSex());
        userTagView.OooO0Oo(item.kaVIPLv, true, momentDetailGiftFragment.getViewLifecycleOwner());
        long userId2 = item.getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null && userId2 == l.longValue() && Intrinsics.areEqual(o0O00oO0.OooOo().getValue(), Boolean.TRUE)) {
            Intrinsics.checkNotNull(userTagView);
            UserTagView.OooOO0o(userTagView, momentDetailGiftFragment.getViewLifecycleOwner(), (Integer) o0O00oO0.OooO0oO().getValue(), (String) o0O00oO0.OooO0o0().getValue(), 8);
        } else {
            Intrinsics.checkNotNull(userTagView);
            UserTagView.OooOO0o(userTagView, momentDetailGiftFragment.getViewLifecycleOwner(), Integer.valueOf(item.wealthLevel), item.wealthBadgeImage, 8);
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(momentDetailGiftFragment.getActivity());
        oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(70, 70, item.getPropImage());
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.OooO00o(d1.OooO0O0());
        oooO00o2.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.item_post_detail_gift_list_gif_icon));
        helper.setText(p562o0oOo000.o0OO00O.item_post_detail_gift_list_gift_count, "× " + item.getPropNum());
    }
}
