package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.ui.view.SexView;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserVipView;
import com.yalla.yalla.ui.view.UserWealthTagView;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p642o0ooOOO0.d1;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO extends h3<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f27102OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Context f27103OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public String f27104OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner) {
        super(Integer.valueOf(p562o0oOo000.oo0o0Oo.message_item_friend), o0OoOo0.f27215OooO00o);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f27103OooOOo0 = context;
        this.f27102OooOOo = lifecycleOwner;
        this.f27104OooOOoo = "";
    }

    @Override // p643o0ooOOOO.h3
    public final void OooO0o(PagingViewHolder holder, FriendInfo friendInfo) {
        FriendInfo item = friendInfo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfo userInfo = item.getUserInfo();
        if (userInfo == null) {
            return;
        }
        String memoName = item.getFriend().getMemoName();
        String memoName2 = !(memoName == null || StringsKt.isBlank(memoName)) ? item.getFriend().getMemoName() : userInfo.getUserName();
        int i = p562o0oOo000.o0OO00O.tv_name;
        holder.setText(i, memoName2);
        int i2 = p562o0oOo000.o0OO00O.tv_bio;
        holder.getView(i2);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27103OooOOo0);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = userInfo.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) holder.getView(p562o0oOo000.o0OO00O.niv_header));
        SVGAView sVGAView = (SVGAView) holder.getView(p562o0oOo000.o0OO00O.svgaView);
        String userHeaderFrame = userInfo.getUserHeaderFrame();
        boolean z = userHeaderFrame == null || StringsKt.isBlank(userHeaderFrame);
        LifecycleOwner lifecycleOwner = this.f27102OooOOo;
        if (z) {
            com.code.android.util.o000O.OooO0O0(sVGAView);
        } else {
            com.code.android.util.o000O.OooOOOO(sVGAView);
            sVGAView.OooOO0O(String.valueOf(userInfo.getUserHeaderFrame()), lifecycleOwner);
            sVGAView.OooOO0o();
        }
        TextView textView = (TextView) holder.getView(i);
        TextView textView2 = (TextView) holder.getView(i2);
        String str = this.f27104OooOOoo;
        String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string == null || StringsKt.isBlank(string)) {
            com.code.android.util.o000O.OooOOOO(textView2);
            String bio = userInfo.getBio();
            textView2.setText(!(bio == null || StringsKt.isBlank(bio)) ? userInfo.getBio() : com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Userinfo_Sign_Hint));
        } else {
            int i3 = p562o0oOo000.o0OOO0o.color_00d8c9;
            com.code.android.util.o000.OooO0O0(textView, com.code.android.util.o0000.OooO00o(i3), string);
            String memoName3 = item.getFriend().getMemoName();
            if (!(memoName3 == null || StringsKt.isBlank(memoName3)) && StringsKt__StringsKt.contains$default(userInfo.getUserName(), string, false, 2, (Object) null)) {
                textView2.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + userInfo.getUserName());
                com.code.android.util.o000O.OooOOOO(textView2);
            } else if (StringsKt__StringsKt.contains$default(userInfo.getUserIdx(), string, false, 2, (Object) null)) {
                textView2.setText("ID:" + userInfo.getUserIdx());
                com.code.android.util.o000O.OooOOOO(textView2);
            } else {
                com.code.android.util.o000O.OooO0O0(textView2);
            }
            com.code.android.util.o000.OooO0O0(textView2, com.code.android.util.o0000.OooO00o(i3), string);
        }
        ((UserPremiumView) holder.getView(p562o0oOo000.o0OO00O.vipView)).OooO0Oo(userInfo.getPremiumLevel(), userInfo.isPremium());
        ((SexView) holder.getView(p562o0oOo000.o0OO00O.sexView)).setSex(userInfo.getSex());
        holder.setGone(p562o0oOo000.o0OO00O.iv_room, !item.getFriend().getInRoom());
        holder.setGone(p562o0oOo000.o0OO00O.iv_official, !userInfo.isOfficialRole());
        UserVipView userVipView = (UserVipView) holder.getView(p562o0oOo000.o0OO00O.ivKaVip);
        UserInfo userInfo2 = item.getUserInfo();
        userVipView.OooOOOO(userInfo2 != null ? userInfo2.getVipLevel() : VipLevel.Vip0.getValue(), true, lifecycleOwner);
        UserInfo userInfo3 = item.getUserInfo();
        if (userInfo3 != null) {
            ((UserWealthTagView) holder.getView(p562o0oOo000.o0OO00O.wealthView)).OooO0O0(lifecycleOwner, Integer.valueOf(userInfo3.getWealthLevel()), userInfo3.getWealthBadgeWithBg(), 9.0f);
        }
    }
}
