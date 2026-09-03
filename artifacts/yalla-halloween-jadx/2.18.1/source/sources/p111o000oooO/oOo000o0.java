package p111o000oooO;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;
import o00O000.OooO00o;
import p102o000oo.o0OoOo0;
import p109o000ooo.o00000O;
import p112o000oooo.oO0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class oOo000o0 extends oO0OO00o<o00000O> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f30041OooO0o0 = o0OoOo0.OooO0o0("NetworkNotRoamingCtrlr");

    public oOo000o0(Context context, OooO00o oooO00o) {
        super(oO0O0O00.OooO00o(context, oooO00o).f30065OooO0OO);
    }

    @Override // p111o000oooO.oO0OO00o
    public final boolean OooO0O0(@NonNull o00O0000.o0OoOo0 o0oooo1) {
        return o0oooo1.f30160OooOO0.f29789OooO00o == NetworkType.NOT_ROAMING;
    }

    @Override // p111o000oooO.oO0OO00o
    public final boolean OooO0OO(@NonNull o00000O o00000o) {
        o00000O o00000o2 = o00000o;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            o0OoOo0.OooO0OO().OooO00o(f30041OooO0o0, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !o00000o2.f30020OooO00o;
        }
        if (o00000o2.f30020OooO00o && o00000o2.f30023OooO0Oo) {
            z = false;
        }
        return z;
    }
}
