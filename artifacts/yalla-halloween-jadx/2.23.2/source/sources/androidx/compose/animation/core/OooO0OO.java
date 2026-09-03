package androidx.compose.animation.core;

import android.os.Bundle;
import androidx.media3.common.OooOo;
import androidx.media3.common.OooOo00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements androidx.media3.common.OooO0OO.OooO00o {
    public static String OooO00o(String str, int i, char c) {
        return str + i + c;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        o00Oo0.OooO00o(bundle.getInt(OooOo00.f6627OooO0Oo, -1) == 2);
        int i = bundle.getInt(OooOo.f6623OooO0oo, 5);
        float f = bundle.getFloat(OooOo.f6622OooO, -1.0f);
        return f == -1.0f ? new OooOo(i) : new OooOo(i, f);
    }
}
