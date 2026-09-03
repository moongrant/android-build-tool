package androidx.compose.animation;

import android.os.Bundle;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements androidx.media3.common.OooO0OO.OooO00o {
    public static String OooO00o(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        o00Oo0.OooO00o(bundle.getInt(androidx.media3.common.OooOo00.f6627OooO0Oo, -1) == 0);
        return bundle.getBoolean(androidx.media3.common.OooOO0O.f6468OooO0oo, false) ? new androidx.media3.common.OooOO0O(bundle.getBoolean(androidx.media3.common.OooOO0O.f6467OooO, false)) : new androidx.media3.common.OooOO0O();
    }
}
