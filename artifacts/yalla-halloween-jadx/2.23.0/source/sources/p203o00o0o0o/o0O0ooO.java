package p203o00o0o0o;

import android.util.Log;
import com.google.android.exoplayer2.Player;
import o0O0OOOo.OooO00o;
import p245o00oo0o.o00O;
import p298o0O0o00o.OooO0O0;
import p298o0O0o00o.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0ooO implements o00O.OooO00o, OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39289OooO0Oo;

    public /* synthetic */ o0O0ooO(Object obj) {
        this.f39289OooO0Oo = obj;
    }

    @Override // o0O0o00o.OooO0O0.OooO00o
    public final void OooO00o(OooO0OO oooO0OO) {
        o0O0OOOo.OooO0OO oooO0OO2 = (o0O0OOOo.OooO0OO) this.f39289OooO0Oo;
        oooO0OO2.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        oooO0OO2.f42082OooO0O0.set((OooO00o) oooO0OO.get());
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        o0O000o0 o0o000o1 = (o0O000o0) this.f39289OooO0Oo;
        Player.OooO0OO oooO0OO = (Player.OooO0OO) obj;
        oooO0OO.onLoadingChanged(o0o000o1.f39268OooO0oO);
        oooO0OO.onIsLoadingChanged(o0o000o1.f39268OooO0oO);
    }
}
