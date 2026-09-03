package com.yalla.yalla.mixedroom;

import android.app.Dialog;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p423o0OoO0OO.o000O0Oo;
import p590o0oOooo0.k0;
import p650o0ooo.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOOOO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23026OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23027OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f23026OooO0Oo = i;
        this.f23027OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(final Object obj) {
        int i = this.f23026OooO0Oo;
        Object obj2 = this.f23027OooO0o0;
        switch (i) {
            case 0:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                mixedRoomActivity.getClass();
                if (obj instanceof Dialog) {
                    k0.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.o0OO00O
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            f0 f0Var = (f0) obj3;
                            int i3 = MixedRoomActivity.f22956OoooO0O;
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            mixedRoomActivity2.getClass();
                            o000O0Oo.OooO0O0((Dialog) obj, f0Var.f58509OooO0o0);
                            mixedRoomActivity2.f22984OoooO00 = f0Var;
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
