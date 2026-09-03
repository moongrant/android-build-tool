package androidx.compose.compiler.plugins.kotlin.inference;

import android.os.Bundle;
import androidx.media3.common.OooO0OO;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.Oooo0;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements OooO0OO.OooO00o {
    public static /* synthetic */ int OooO00o(int i, int i2, String str) {
        String string = str.subSequence(i, i2).toString();
        if (string.length() > 1 && string.charAt(0) == '+') {
            string = string.substring(1);
        }
        long j = Long.parseLong(string, 10);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException(o000oOoO.OooO0O0("Input ", string, " in base 10 is not in the range of an unsigned integer"));
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public OooO0OO OooO0OO(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Oooo0.OooO0o.f6651OooOo);
        OooOOO0 oooOOO0 = bundle2 != null ? (OooOOO0) OooOOO0.f6482OooOOo0.OooO0OO(bundle2) : OooOOO0.f6475OooOO0;
        long j = bundle.getLong(Oooo0.OooO0o.f6656OooOoO0, -9223372036854775807L);
        long j2 = bundle.getLong(Oooo0.OooO0o.f6655OooOoO, -9223372036854775807L);
        long j3 = bundle.getLong(Oooo0.OooO0o.f6657OooOoOO, -9223372036854775807L);
        boolean z = bundle.getBoolean(Oooo0.OooO0o.f6659OooOoo0, false);
        boolean z2 = bundle.getBoolean(Oooo0.OooO0o.f6658OooOoo, false);
        Bundle bundle3 = bundle.getBundle(Oooo0.OooO0o.f6660OooOooO);
        OooOOO0.OooOO0 oooOO1 = bundle3 != null ? (OooOOO0.OooOO0) OooOOO0.OooOO0.f6555OooOOOO.OooO0OO(bundle3) : null;
        boolean z3 = bundle.getBoolean(Oooo0.OooO0o.f6661OooOooo, false);
        long j4 = bundle.getLong(Oooo0.OooO0o.f6663Oooo000, 0L);
        long j5 = bundle.getLong(Oooo0.OooO0o.f6664Oooo00O, -9223372036854775807L);
        int i = bundle.getInt(Oooo0.OooO0o.f6665Oooo00o, 0);
        int i2 = bundle.getInt(Oooo0.OooO0o.f6662Oooo0, 0);
        long j6 = bundle.getLong(Oooo0.OooO0o.f6666Oooo0O0, 0L);
        Oooo0.OooO0o oooO0o = new Oooo0.OooO0o();
        oooO0o.OooO0o0(Oooo0.OooO0o.f6653OooOo0O, oooOOO0, null, j, j2, j3, z, z2, oooOO1, j4, j5, i, i2, j6);
        oooO0o.f6679OooOOOO = z3;
        return oooO0o;
    }
}
