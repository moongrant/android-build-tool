package p111o000oooO;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;
import o00O000.OooO00o;
import o00O0000.o0OoOo0;
import p109o000ooo.o00000O;
import p112o000oooo.oO0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class oOo000Oo extends oO0OO00o<o00000O> {
    public oOo000Oo(Context context, OooO00o oooO00o) {
        super(oO0O0O00.OooO00o(context, oooO00o).f30065OooO0OO);
    }

    @Override // p111o000oooO.oO0OO00o
    public final boolean OooO0O0(@NonNull o0OoOo0 o0oooo1) {
        return o0oooo1.f30160OooOO0.f29789OooO00o == NetworkType.CONNECTED;
    }

    @Override // p111o000oooO.oO0OO00o
    public final boolean OooO0OO(@NonNull o00000O o00000o) {
        o00000O o00000o2 = o00000o;
        if (Build.VERSION.SDK_INT >= 26) {
            return (o00000o2.f30020OooO00o && o00000o2.f30021OooO0O0) ? false : true;
        }
        return true ^ o00000o2.f30020OooO00o;
    }
}
