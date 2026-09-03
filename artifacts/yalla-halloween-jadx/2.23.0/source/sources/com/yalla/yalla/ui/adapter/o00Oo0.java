package com.yalla.yalla.ui.adapter;

import android.widget.ImageView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserVipView;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<UserInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PagingViewHolder f27632OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O f27633OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessage f27634OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(PagingViewHolder pagingViewHolder, FriendRequestMessage friendRequestMessage, o00O0O o00o0o2) {
        super(1);
        this.f27632OooO0Oo = pagingViewHolder;
        this.f27634OooO0o0 = friendRequestMessage;
        this.f27633OooO0o = o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserInfo userInfo) {
        UserInfo userInfo2 = userInfo;
        if (userInfo2 != null) {
            int i = oO00O0oO.nivHeader;
            PagingViewHolder pagingViewHolder = this.f27632OooO0Oo;
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(pagingViewHolder.getView(i).getContext());
            oooO00o.f43911OooO0OO = userInfo2.getUserHeader();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.OooO0Oo((ImageView) pagingViewHolder.getView(i));
            ((UserPremiumView) pagingViewHolder.getView(oO00O0oO.vipView)).OooO0Oo(userInfo2.getPremiumLevel(), userInfo2.isPremium());
            pagingViewHolder.setText(oO00O0oO.tvTitle, userInfo2.getUserName());
            pagingViewHolder.setText(oO00O0oO.tvLevel, "LV." + userInfo2.getUserLevel() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
            int i2 = oO00O0oO.tvContent;
            FriendRequestMessage friendRequestMessage = this.f27634OooO0o0;
            pagingViewHolder.setText(i2, friendRequestMessage.getMessage());
            int state = friendRequestMessage.getState();
            o00O0O o00o0o2 = this.f27633OooO0o;
            if (state == -1) {
                pagingViewHolder.setGone(oO00O0oO.btStatus, false);
                pagingViewHolder.setGone(oO00O0oO.btAgree, false);
                pagingViewHolder.setGone(oO00O0oO.btRefuse, false);
                pagingViewHolder.setText(i2, oO00OOo0.add_you_as_friend);
            } else if (state != 0) {
                if (state == 1) {
                    int i3 = oO00O0oO.btStatus;
                    pagingViewHolder.setGone(i3, false);
                    pagingViewHolder.setGone(oO00O0oO.btAgree, true);
                    pagingViewHolder.setGone(oO00O0oO.btRefuse, true);
                    pagingViewHolder.setText(i3, oO00OOo0.Accepted);
                } else if (state == 2) {
                    int i4 = oO00O0oO.btStatus;
                    pagingViewHolder.setGone(i4, false);
                    pagingViewHolder.setGone(oO00O0oO.btAgree, true);
                    pagingViewHolder.setGone(oO00O0oO.btRefuse, true);
                    pagingViewHolder.setText(i4, oO00OOo0.Declined);
                } else if (state == 3) {
                    int i5 = oO00O0oO.btStatus;
                    pagingViewHolder.setGone(i5, false);
                    pagingViewHolder.setGone(oO00O0oO.btAgree, true);
                    pagingViewHolder.setGone(oO00O0oO.btRefuse, true);
                    pagingViewHolder.setText(i5, oO00OOo0.Expired);
                }
            } else if (System.currentTimeMillis() - friendRequestMessage.getTime() < o00o0o2.f27622OooOOo) {
                pagingViewHolder.setGone(oO00O0oO.btStatus, true);
                pagingViewHolder.setGone(oO00O0oO.btAgree, false);
                pagingViewHolder.setGone(oO00O0oO.btRefuse, false);
            } else {
                int i6 = oO00O0oO.btStatus;
                pagingViewHolder.setGone(i6, false);
                pagingViewHolder.setGone(oO00O0oO.btAgree, true);
                pagingViewHolder.setGone(oO00O0oO.btRefuse, true);
                pagingViewHolder.setText(i6, oO00OOo0.Expired);
            }
            pagingViewHolder.setGone(oO00O0oO.vLine, pagingViewHolder.getBindingAdapterPosition() == o00o0o2.getItemCount() - 1);
            ((UserVipView) pagingViewHolder.getView(oO00O0oO.ivKaVip)).OooOOOO(userInfo2.getVipLevel(), true, o00o0o2.f27623OooOOo0);
        }
        return Unit.INSTANCE;
    }
}
