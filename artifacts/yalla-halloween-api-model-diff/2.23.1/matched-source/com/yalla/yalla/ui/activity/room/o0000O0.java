package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import p407o0Oo0OOO.oOOo0O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f26386OooO0o0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f26385OooO0Oo = i;
        this.f26386OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f26385OooO0Oo;
        Object obj2 = this.f26386OooO0o0;
        switch (i) {
            case 0:
                LuckyPacketDetailActivity this$0 = (LuckyPacketDetailActivity) obj2;
                int i2 = LuckyPacketDetailActivity.f26106OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
                Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
                this$0.getClass();
                if (bonusDetailReply != null) {
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this$0);
                    oooO00o.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO00o());
                    oooO00o.f43127OooO0OO = p405o0Oo0OO.OooO0OO.OooO00o(bonusDetailReply.getFromuseravatar());
                    oooO00o.f43125OooO00o = 0;
                    oooO00o.OooO0Oo(this$0.OooOo().f45203OooO0O0.f45212OooO0O0);
                    if (bonusDetailReply.getBonustype() == 2) {
                        this$0.OooOo().f45203OooO0O0.f45213OooO0OO.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Lucky_Bag_Gifts_from_XXX), bonusDetailReply.getFromusername()));
                        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(this$0);
                        oooO00o2.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(bonusDetailReply.getGiftimg());
                        oooO00o2.f43125OooO00o = 0;
                        oooO00o2.f43139OooOOOo = p565o0oOo000.o0OOO0o.room_dialog_lucky_golds_send_gift_item_default;
                        oooO00o2.OooO0Oo(this$0.OooOo().f45203OooO0O0.f45215OooO0o0);
                        this$0.OooOo().f45203OooO0O0.f45214OooO0Oo.setText(com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
                    } else {
                        this$0.OooOo().f45203OooO0O0.f45213OooO0OO.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Lucky_Bag_Golds_from_XXX), bonusDetailReply.getFromusername()));
                        this$0.OooOo().f45203OooO0O0.f45215OooO0o0.setImageResource(p565o0oOo000.o0OOO0o.coin3);
                        this$0.OooOo().f45203OooO0O0.f45214OooO0Oo.setText(com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
                    }
                    o0000O0O o0000o0o2 = null;
                    oOOo0O00 oooo0o00 = null;
                    if (bonusDetailReply.getCode() == 0) {
                        this$0.OooOo().f45205OooO0Oo.OooOooO(true, true);
                        o0000O0O o0000o0o3 = this$0.f26111OooOo0o;
                        if (o0000o0o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            o0000o0o3 = null;
                        }
                        Boolean bool = Boolean.TRUE;
                        o0000o0o3.Oooo0(bool, bool, Boolean.FALSE);
                        if (bonusDetailReply.getBonusgrabnum() > 0) {
                            oOOo0O00 oooo0o01 = this$0.f26109OooOo00;
                            if (oooo0o01 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("header");
                                oooo0o01 = null;
                            }
                            oooo0o01.f45218OooO0OO.setVisibility(0);
                        } else {
                            oOOo0O00 oooo0o02 = this$0.f26109OooOo00;
                            if (oooo0o02 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("header");
                                oooo0o02 = null;
                            }
                            oooo0o02.f45218OooO0OO.setVisibility(8);
                        }
                        oOOo0O00 oooo0o03 = this$0.f26109OooOo00;
                        if (oooo0o03 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("header");
                            oooo0o03 = null;
                        }
                        oooo0o03.f45218OooO0OO.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getBonusgrabnum()), "") + "/" + com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getBonustotalnum()), ""));
                        o0000O0O o0000o0o4 = this$0.f26111OooOo0o;
                        if (o0000o0o4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        } else {
                            o0000o0o2 = o0000o0o4;
                        }
                        o0000o0o2.OooOoO0(bonusDetailReply.getBonusdetailsList());
                        if (!bonusDetailReply.getGotbonus()) {
                            this$0.OooOo().f45203OooO0O0.f45215OooO0o0.setVisibility(8);
                            this$0.OooOo().f45203OooO0O0.f45214OooO0Oo.setVisibility(8);
                        } else {
                            this$0.OooOo().f45203OooO0O0.f45215OooO0o0.setVisibility(0);
                            this$0.OooOo().f45203OooO0O0.f45214OooO0Oo.setVisibility(0);
                        }
                    } else {
                        this$0.OooOo().f45205OooO0Oo.OooOooO(true, false);
                        o0000O0O o0000o0o5 = this$0.f26111OooOo0o;
                        if (o0000o0o5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            o0000o0o5 = null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        Boolean bool3 = Boolean.FALSE;
                        o0000o0o5.Oooo0(bool2, bool3, bool3);
                        oOOo0O00 oooo0o04 = this$0.f26109OooOo00;
                        if (oooo0o04 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("header");
                        } else {
                            oooo0o00 = oooo0o04;
                        }
                        oooo0o00.f45218OooO0OO.setVisibility(8);
                    }
                }
                break;
            default:
                MomentUserListVM newMomentVM = (MomentUserListVM) obj2;
                MomentSendModel it = (MomentSendModel) obj;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                p597o0oo00O.OooOOOO.OooO0O0("动态任务 发送成功 刷新 taskModel = " + it);
                newMomentVM.postSendSuccess(it);
                break;
        }
    }
}
