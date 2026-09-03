package p090o000o00o;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;
import p084o000Ooo0.o000oOoO;
import p089o000o00O.o00O00OO;
import p091o000o0O.o0Oo0oo;
import p096o000o0o0.o0000O0;
import p674oooo00o.oO0O00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 extends o00O0O0<o00O00OO> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f35234OooO0o0 = o000oOoO.OooO0o0("NetworkNotRoamingCtrlr");

    public oo0o0O0(Context context, o0000O0 o0000o1) {
        super(oO0O00oO.OooO00o(context, o0000o1).f60998OooO0OO);
    }

    @Override // p090o000o00o.o00O0O0
    public final boolean OooO0O0(@NonNull o0Oo0oo o0oo0oo2) {
        return o0oo0oo2.f35270OooOO0.f35083OooO00o == NetworkType.NOT_ROAMING;
    }

    @Override // p090o000o00o.o00O0O0
    public final boolean OooO0OO(@NonNull o00O00OO o00o00oo2) {
        o00O00OO o00o00oo3 = o00o00oo2;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            o000oOoO.OooO0OO().OooO00o(f35234OooO0o0, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !o00o00oo3.f35221OooO00o;
        }
        if (o00o00oo3.f35221OooO00o && o00o00oo3.f35224OooO0Oo) {
            z = false;
        }
        return z;
    }
}
