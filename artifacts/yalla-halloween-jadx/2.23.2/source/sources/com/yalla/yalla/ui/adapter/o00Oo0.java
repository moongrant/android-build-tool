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
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<UserInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PagingViewHolder f27151OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O f27152OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessage f27153OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(PagingViewHolder pagingViewHolder, FriendRequestMessage friendRequestMessage, o00O0O o00o0o2) {
        super(1);
        this.f27151OooO0Oo = pagingViewHolder;
        this.f27153OooO0o0 = friendRequestMessage;
        this.f27152OooO0o = o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserInfo userInfo) {
        UserInfo userInfo2 = userInfo;
        if (userInfo2 != null) {
            int i = p562o0oOo000.o0OO00O.nivHeader;
            PagingViewHolder pagingViewHolder = this.f27151OooO0Oo;
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(pagingViewHolder.getView(i).getContext());
            oooO00o.f43126OooO0OO = userInfo2.getUserHeader();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.OooO0Oo((ImageView) pagingViewHolder.getView(i));
            ((UserPremiumView) pagingViewHolder.getView(p562o0oOo000.o0OO00O.vipView)).OooO0Oo(userInfo2.getPremiumLevel(), userInfo2.isPremium());
            pagingViewHolder.setText(p562o0oOo000.o0OO00O.tvTitle, userInfo2.getUserName());
            pagingViewHolder.setText(p562o0oOo000.o0OO00O.tvLevel, "LV." + userInfo2.getUserLevel() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
            int i2 = p562o0oOo000.o0OO00O.tvContent;
            FriendRequestMessage friendRequestMessage = this.f27153OooO0o0;
            pagingViewHolder.setText(i2, friendRequestMessage.getMessage());
            int state = friendRequestMessage.getState();
            o00O0O o00o0o2 = this.f27152OooO0o;
            if (state == -1) {
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btStatus, false);
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btAgree, false);
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btRefuse, false);
                pagingViewHolder.setText(i2, p562o0oOo000.o000000.add_you_as_friend);
            } else if (state != 0) {
                if (state == 1) {
                    int i3 = p562o0oOo000.o0OO00O.btStatus;
                    pagingViewHolder.setGone(i3, false);
                    pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btAgree, true);
                    pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btRefuse, true);
                    pagingViewHolder.setText(i3, p562o0oOo000.o000000.Accepted);
                } else if (state == 2) {
                    int i4 = p562o0oOo000.o0OO00O.btStatus;
                    pagingViewHolder.setGone(i4, false);
                    pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btAgree, true);
                    pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btRefuse, true);
                    pagingViewHolder.setText(i4, p562o0oOo000.o000000.Declined);
                } else if (state == 3) {
                    int i5 = p562o0oOo000.o0OO00O.btStatus;
                    pagingViewHolder.setGone(i5, false);
                    pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btAgree, true);
                    pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btRefuse, true);
                    pagingViewHolder.setText(i5, p562o0oOo000.o000000.Expired);
                }
            } else if (System.currentTimeMillis() - friendRequestMessage.getTime() < o00o0o2.f27135OooOOo) {
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btStatus, true);
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btAgree, false);
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btRefuse, false);
            } else {
                int i6 = p562o0oOo000.o0OO00O.btStatus;
                pagingViewHolder.setGone(i6, false);
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btAgree, true);
                pagingViewHolder.setGone(p562o0oOo000.o0OO00O.btRefuse, true);
                pagingViewHolder.setText(i6, p562o0oOo000.o000000.Expired);
            }
            pagingViewHolder.setGone(p562o0oOo000.o0OO00O.vLine, pagingViewHolder.getBindingAdapterPosition() == o00o0o2.getItemCount() - 1);
            ((UserVipView) pagingViewHolder.getView(p562o0oOo000.o0OO00O.ivKaVip)).OooOOOO(userInfo2.getVipLevel(), true, o00o0o2.f27136OooOOo0);
        }
        return Unit.INSTANCE;
    }
}
