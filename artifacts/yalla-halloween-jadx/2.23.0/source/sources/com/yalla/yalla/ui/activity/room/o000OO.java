package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.e7;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LuckyPacketDetailActivity f26850OooO0Oo;

    public o000OO(LuckyPacketDetailActivity luckyPacketDetailActivity) {
        this.f26850OooO0Oo = luckyPacketDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
        Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
        LuckyPacketDetailActivity luckyPacketDetailActivity = this.f26850OooO0Oo;
        luckyPacketDetailActivity.getClass();
        if (bonusDetailReply != null) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(luckyPacketDetailActivity);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(bonusDetailReply.getFromuseravatar());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57735OooO0O0);
            if (bonusDetailReply.getBonustype() == 2) {
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57736OooO0OO.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_Gifts_from_XXX), bonusDetailReply.getFromusername()));
                o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(luckyPacketDetailActivity);
                oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(bonusDetailReply.getGiftimg());
                oooO00o2.f43909OooO00o = 0;
                oooO00o2.f43923OooOOOo = oOo00OO0.room_dialog_lucky_golds_send_gift_item_default;
                oooO00o2.OooO0Oo(luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57738OooO0o0);
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57737OooO0Oo.setText(com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
            } else {
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57736OooO0OO.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_Golds_from_XXX), bonusDetailReply.getFromusername()));
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57738OooO0o0.setImageResource(oOo00OO0.coin3);
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57737OooO0Oo.setText(com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
            }
            o0000O0 o0000o1 = null;
            e7 e7Var = null;
            if (bonusDetailReply.getCode() != 0) {
                luckyPacketDetailActivity.OooOo().f57666OooO0Oo.OooOooO(true, false);
                o0000O0 o0000o2 = luckyPacketDetailActivity.f26561OooOo0o;
                if (o0000o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o0000o2 = null;
                }
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                o0000o2.Oooo0(bool, bool2, bool2);
                e7 e7Var2 = luckyPacketDetailActivity.f26559OooOo00;
                if (e7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("header");
                } else {
                    e7Var = e7Var2;
                }
                e7Var.f57830OooO0OO.setVisibility(8);
                return;
            }
            luckyPacketDetailActivity.OooOo().f57666OooO0Oo.OooOooO(true, true);
            o0000O0 o0000o3 = luckyPacketDetailActivity.f26561OooOo0o;
            if (o0000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o0000o3 = null;
            }
            Boolean bool3 = Boolean.TRUE;
            o0000o3.Oooo0(bool3, bool3, Boolean.FALSE);
            if (bonusDetailReply.getBonusgrabnum() > 0) {
                e7 e7Var3 = luckyPacketDetailActivity.f26559OooOo00;
                if (e7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("header");
                    e7Var3 = null;
                }
                e7Var3.f57830OooO0OO.setVisibility(0);
            } else {
                e7 e7Var4 = luckyPacketDetailActivity.f26559OooOo00;
                if (e7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("header");
                    e7Var4 = null;
                }
                e7Var4.f57830OooO0OO.setVisibility(8);
            }
            e7 e7Var5 = luckyPacketDetailActivity.f26559OooOo00;
            if (e7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                e7Var5 = null;
            }
            e7Var5.f57830OooO0OO.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getBonusgrabnum()), "") + "/" + com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getBonustotalnum()), ""));
            o0000O0 o0000o4 = luckyPacketDetailActivity.f26561OooOo0o;
            if (o0000o4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                o0000o1 = o0000o4;
            }
            o0000o1.OooOoO0(bonusDetailReply.getBonusdetailsList());
            if (bonusDetailReply.getGotbonus()) {
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57738OooO0o0.setVisibility(0);
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57737OooO0Oo.setVisibility(0);
            } else {
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57738OooO0o0.setVisibility(8);
                luckyPacketDetailActivity.OooOo().f57664OooO0O0.f57737OooO0Oo.setVisibility(8);
            }
        }
    }
}
