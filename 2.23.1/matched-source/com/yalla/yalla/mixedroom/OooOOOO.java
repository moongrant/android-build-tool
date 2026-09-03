package com.yalla.yalla.mixedroom;

import android.app.Dialog;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p425o0OoO0OO.o000O0;
import p587o0oOooO.oOO0O0O0;
import p675oO0Oo.c2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOOOO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23032OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23033OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f23032OooO0Oo = i;
        this.f23033OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(final Object obj) {
        int i = this.f23032OooO0Oo;
        Object obj2 = this.f23033OooO0o0;
        switch (i) {
            case 0:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.getClass();
                if (obj instanceof Dialog) {
                    oOO0O0O0.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.o0OO00O
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            c2 c2Var = (c2) obj3;
                            int i3 = MixedRoomActivity.f22961OoooO0O;
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            mixedRoomActivity2.getClass();
                            o000O0.OooO0O0((Dialog) obj, c2Var.f59574OooO0o0);
                            mixedRoomActivity2.f22989OoooO00 = c2Var;
                            return null;
                        }
                    });
                }
                break;
            default:
                BadgeRankDataFragment.initData$lambda$3((BadgeRankDataFragment) obj2, (List) obj);
                break;
        }
    }
}
