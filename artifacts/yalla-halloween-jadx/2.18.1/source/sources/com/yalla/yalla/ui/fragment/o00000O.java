package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.model.MomentGift;
import kotlin.jvm.internal.Intrinsics;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O extends p188o00o00o0.OooO0OO<MomentGift> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PostDetailGiftFragment f24472OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(PostDetailGiftFragment postDetailGiftFragment, Context context) {
        super(context, R.layout.item_post_detail_gift_list);
        this.f24472OooO00o = postDetailGiftFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        MomentGift item = (MomentGift) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.itemView.setOnClickListener(new o00000O0(this.f24472OooO00o, item));
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f24472OooO00o.getActivity());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(item.getHeadUrl(), 70, 70);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.head));
        helper.OooO0oO(R.id.officials, item.getPropId() == 2);
        UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.gift_userTagView);
        userTagView.OooO0o(item.getIsVip(), item.getVipLevel());
        p520o0o0O0O0.o00O0O o00o0o2 = p520o0o0O0O0.o00O0O.f42677OooO00o;
        long userId = item.getUserId();
        String nickname = item.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "item.nickname");
        userTagView.setName(o00o0o2.OooO0O0(userId, nickname));
        userTagView.setSex(item.getSex());
        userTagView.setKaVip(item.kaVIPLv);
        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this.f24472OooO00o.getActivity());
        oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgSize(item.getPropImage(), 70, 70);
        oooO00o3.f48427OooO00o = 0;
        oooO00o3.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o3.OooO0o((ImageView) helper.OooO0Oo(R.id.item_post_detail_gift_list_gif_icon));
        helper.OooOO0(R.id.item_post_detail_gift_list_gift_count, "× " + item.getPropNum());
    }
}
