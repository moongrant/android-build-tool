package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.jvm.internal.Intrinsics;
import p475o0Ooooo0.o0O00oO0;
import p642o0ooOOO0.d1;
import p650o0ooo.k1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23016OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f23015OooO0Oo = i;
        this.f23016OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23015OooO0Oo;
        Object obj2 = this.f23016OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                Integer num = (Integer) obj;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                mixedRoomActivity.getClass();
                if (num.intValue() > -1) {
                    k1 k1Var = new k1(mixedRoomActivity);
                    String number = String.valueOf(num.intValue());
                    Intrinsics.checkNotNullParameter(number, "number");
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(k1Var.f58359OooOO0O);
                    oooO00o.OooO00o(d1.OooO0OO());
                    oooO00o.f43151OooOoo0 = 2;
                    oooO00o.f43141OooOOoo = 3;
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    oooO00o.f43126OooO0OO = com.code.android.util.o0OoOo0.OooOOO((String) o0O00oO0.OooO().getValue(), "");
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO0Oo(k1Var.OooOO0().f44448OooO0OO);
                    k1Var.OooOO0().f44451OooO0o0.setText(com.code.android.util.o0OoOo0.OooOOO((String) o0O00oO0.OooOOoo().getValue(), ""));
                    k1Var.OooOO0().f44449OooO0Oo.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_lucky_number_open_info_xxx), number));
                    k1Var.OooOO0().f44450OooO0o.setSize(NumberSize.Size.XX);
                    k1Var.OooOO0().f44450OooO0o.setNumCount(com.code.android.util.o0OoOo0.OooO0o0(0, com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().OooO0oo().getValue()));
                    k1Var.OooOO0().f44450OooO0o.setData(number);
                    k1Var.OooO();
                }
                break;
            case 1:
                BadgeFragment.initView$lambda$2((BadgeFragment) obj2, (Integer) obj);
                break;
            case 2:
                RoomInfoMemberListFragment.initObserve$lambda$11((RoomInfoMemberListFragment) obj2, obj);
                break;
            default:
                BaseMomentVM.hidePostObserver$lambda$0((BaseMomentVM) obj2, ((Long) obj).longValue());
                break;
        }
    }
}
