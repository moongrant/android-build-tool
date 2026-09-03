package p090o000o00o;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;
import p089o000o00O.o00O00OO;
import p091o000o0O.o0Oo0oo;
import p096o000o0o0.o0000O0;
import p674oooo00o.oO0O00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O extends o00O0O0<o00O00OO> {
    public o00O0O0O(Context context, o0000O0 o0000o1) {
        super(oO0O00oO.OooO00o(context, o0000o1).f60998OooO0OO);
    }

    @Override // p090o000o00o.o00O0O0
    public final boolean OooO0O0(@NonNull o0Oo0oo o0oo0oo2) {
        return o0oo0oo2.f35270OooOO0.f35083OooO00o == NetworkType.CONNECTED;
    }

    @Override // p090o000o00o.o00O0O0
    public final boolean OooO0OO(@NonNull o00O00OO o00o00oo2) {
        o00O00OO o00o00oo3 = o00o00oo2;
        if (Build.VERSION.SDK_INT >= 26) {
            return (o00o00oo3.f35221OooO00o && o00o00oo3.f35222OooO0O0) ? false : true;
        }
        return true ^ o00o00oo3.f35221OooO00o;
    }
}
