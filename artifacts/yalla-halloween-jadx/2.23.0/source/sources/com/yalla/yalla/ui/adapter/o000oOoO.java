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
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO extends p400o0Oo0OO.OooOO0O<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f27565OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Context f27566OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public String f27567OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner) {
        super(Integer.valueOf(oO00OO0O.message_item_friend), o0OoOo0.f27671OooO00o);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f27566OooOOo0 = context;
        this.f27565OooOOo = lifecycleOwner;
        this.f27567OooOOoo = "";
    }

    @Override // p400o0Oo0OO.OooOO0O
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
        int i = oO00O0oO.tv_name;
        holder.setText(i, memoName2);
        int i2 = oO00O0oO.tv_bio;
        holder.getView(i2);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f27566OooOOo0);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = userInfo.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) holder.getView(oO00O0oO.niv_header));
        SVGAView sVGAView = (SVGAView) holder.getView(oO00O0oO.svgaView);
        String userHeaderFrame = userInfo.getUserHeaderFrame();
        boolean z = userHeaderFrame == null || StringsKt.isBlank(userHeaderFrame);
        LifecycleOwner lifecycleOwner = this.f27565OooOOo;
        if (z) {
            com.code.android.util.o000OO00.OooO0O0(sVGAView);
        } else {
            com.code.android.util.o000OO00.OooOOOO(sVGAView);
            sVGAView.OooOO0O(String.valueOf(userInfo.getUserHeaderFrame()), lifecycleOwner);
            sVGAView.OooOO0o();
        }
        TextView textView = (TextView) holder.getView(i);
        TextView textView2 = (TextView) holder.getView(i2);
        String str = this.f27567OooOOoo;
        String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string == null || StringsKt.isBlank(string)) {
            com.code.android.util.o000OO00.OooOOOO(textView2);
            String bio = userInfo.getBio();
            textView2.setText(!(bio == null || StringsKt.isBlank(bio)) ? userInfo.getBio() : com.code.android.util.o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint));
        } else {
            int i3 = oO00O0o.color_00d8c9;
            com.code.android.util.o000.OooO0O0(textView, com.code.android.util.o0000.OooO00o(i3), string);
            String memoName3 = item.getFriend().getMemoName();
            if (!(memoName3 == null || StringsKt.isBlank(memoName3)) && StringsKt.OooO0o(userInfo.getUserName(), string)) {
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + userInfo.getUserName());
                com.code.android.util.o000OO00.OooOOOO(textView2);
            } else if (StringsKt.OooO0o(userInfo.getUserIdx(), string)) {
                textView2.setText("ID:" + userInfo.getUserIdx());
                com.code.android.util.o000OO00.OooOOOO(textView2);
            } else {
                com.code.android.util.o000OO00.OooO0O0(textView2);
            }
            com.code.android.util.o000.OooO0O0(textView2, com.code.android.util.o0000.OooO00o(i3), string);
        }
        ((UserPremiumView) holder.getView(oO00O0oO.vipView)).OooO0Oo(userInfo.getPremiumLevel(), userInfo.isPremium());
        ((SexView) holder.getView(oO00O0oO.sexView)).setSex(userInfo.getSex());
        holder.setGone(oO00O0oO.iv_room, !item.getFriend().getInRoom());
        holder.setGone(oO00O0oO.iv_official, !userInfo.isOfficialRole());
        UserVipView userVipView = (UserVipView) holder.getView(oO00O0oO.ivKaVip);
        UserInfo userInfo2 = item.getUserInfo();
        userVipView.OooOOOO(userInfo2 != null ? userInfo2.getVipLevel() : VipLevel.Vip0.getValue(), true, lifecycleOwner);
        UserInfo userInfo3 = item.getUserInfo();
        if (userInfo3 != null) {
            ((UserWealthTagView) holder.getView(oO00O0oO.wealthView)).OooO0O0(lifecycleOwner, Integer.valueOf(userInfo3.getWealthLevel()), userInfo3.getWealthBadgeWithBg(), 9.0f);
        }
    }
}
