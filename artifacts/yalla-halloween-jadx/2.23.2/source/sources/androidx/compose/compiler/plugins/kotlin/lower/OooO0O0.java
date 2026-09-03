package androidx.compose.compiler.plugins.kotlin.lower;

import android.os.Bundle;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.o00Oo0;
import com.google.common.base.Oooo000;
import com.google.firebase.components.OooO;
import com.google.firebase.components.o00oO0o;
import java.util.Set;
import p315o0O0oOo.o0000O0;
import p315o0O0oOo.o0000O00;
import p315o0O0oOo.o0000oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements androidx.media3.common.OooO0OO.OooO00o, OooO {
    public static String OooO0O0(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO00o(o00oO0o o00oo0o2) {
        Set setOooO0oo = o00oo0o2.OooO0oo(o0000O0.class);
        o0000oo o0000ooVar = o0000oo.f41890OooO0O0;
        if (o0000ooVar == null) {
            synchronized (o0000oo.class) {
                o0000ooVar = o0000oo.f41890OooO0O0;
                if (o0000ooVar == null) {
                    o0000ooVar = new o0000oo();
                    o0000oo.f41890OooO0O0 = o0000ooVar;
                }
            }
        }
        return new o0000O00(setOooO0oo, o0000ooVar);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        androidx.compose.compiler.plugins.kotlin.k1.OooO00o oooO00o = o000oOoO.f6764OooOO0O;
        Bundle bundle2 = bundle.getBundle(o00Oo0.OooO00o.f6853OooO);
        bundle2.getClass();
        o000oOoO o000oooo2 = (o000oOoO) oooO00o.OooO0OO(bundle2);
        return new o00Oo0.OooO00o(o000oooo2, bundle.getBoolean(o00Oo0.OooO00o.f6856OooOO0o, false), (int[]) Oooo000.OooO00o(bundle.getIntArray(o00Oo0.OooO00o.f6854OooOO0), new int[o000oooo2.f6765OooO0Oo]), (boolean[]) Oooo000.OooO00o(bundle.getBooleanArray(o00Oo0.OooO00o.f6855OooOO0O), new boolean[o000oooo2.f6765OooO0Oo]));
    }
}
