package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000OO00;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p406o0Oo0Ooo.oOO0O0O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends o000O<PostUserModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailLikeFragment f28846OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(MomentDetailLikeFragment momentDetailLikeFragment, Context context, int i) {
        super(context, i);
        this.f28846OooOoo0 = momentDetailLikeFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        PostUserModel item = (PostUserModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        MomentDetailLikeFragment momentDetailLikeFragment = this.f28846OooOoo0;
        view.setOnClickListener(new o0000O00(momentDetailLikeFragment, item));
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(momentDetailLikeFragment.getActivity());
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(80, 80, item.getHeadurl());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.head));
        long userid = item.getUserid();
        String nickname = item.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "item.nickname");
        String strOooO0O0 = oOO0O0O.OooO0O0(userid, nickname);
        UserTagView userTagView = (UserTagView) helper.getView(oO00O0oO.praise_userTagView);
        userTagView.setName(strOooO0O0);
        userTagView.setNameTextColor(oO00O0o.color_333333_85);
        userTagView.setNameTextSize(15.0f);
        userTagView.OooO0oO(item.getVip(), item.getVipLevel());
        userTagView.setSex(item.getSex());
        userTagView.OooO0Oo(item.kaVIPLv, true, momentDetailLikeFragment.getViewLifecycleOwner());
        long userid2 = item.getUserid();
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
        if (l != null && userid2 == l.longValue() && Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo().getValue(), Boolean.TRUE)) {
            Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
            UserTagView.OooOO0o(userTagView, momentDetailLikeFragment.getViewLifecycleOwner(), (Integer) p464o0Oooo.o000000O.OooO0oO().getValue(), (String) p464o0Oooo.o000000O.OooO0o0().getValue(), 8);
        } else {
            Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
            UserTagView.OooOO0o(userTagView, momentDetailLikeFragment.getViewLifecycleOwner(), Integer.valueOf(item.wealthLevel), item.wealthBadgeImage, 8);
        }
        ImageView it = (ImageView) helper.getView(oO00O0oO.officials);
        if (UserInfo.Role.INSTANCE.isOfficial(item.getRole())) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooOOOO(it);
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooO0O0(it);
        }
    }
}
