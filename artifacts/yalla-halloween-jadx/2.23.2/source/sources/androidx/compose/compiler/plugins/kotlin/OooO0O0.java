package androidx.compose.compiler.plugins.kotlin;

import android.os.Bundle;
import androidx.media3.common.Oooo0;
import com.google.common.collect.o0O00;
import p080o000OoO.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements androidx.media3.common.OooO0OO.OooO00o {
    public static String OooO00o(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        o0O00 o0o00OooO0OO = Oooo0.OooO0OO(Oooo0.OooO0o.f6667Oooo0OO, oo000o.OooO00o(bundle, Oooo0.f6631OooO0o0));
        o0O00 o0o00OooO0OO2 = Oooo0.OooO0OO(Oooo0.OooO0O0.f6639OooOOOo, oo000o.OooO00o(bundle, Oooo0.f6630OooO0o));
        int[] intArray = bundle.getIntArray(Oooo0.f6632OooO0oO);
        if (intArray == null) {
            int i = o0o00OooO0OO.f19062OooO0oO;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = i2;
            }
            intArray = iArr;
        }
        return new Oooo0.OooO0OO(o0o00OooO0OO, o0o00OooO0OO2, intArray);
    }
}
