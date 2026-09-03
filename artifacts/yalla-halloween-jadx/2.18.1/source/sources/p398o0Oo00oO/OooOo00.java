package p398o0Oo00oO;

import androidx.compose.ui.platform.o00O0;
import kotlin.KotlinVersion;
import net.sqlcipher.database.SQLiteDatabase;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements o0OoOo0 {
    @Override // p398o0Oo00oO.o0OoOo0
    public final void OooO00o(o00O0O o00o0o2) {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o((char) 0);
        while (o00o0o2.OooO0Oo()) {
            sbOooO00o.append(o00o0o2.OooO0O0());
            int i = o00o0o2.f38966OooO0o + 1;
            o00o0o2.f38966OooO0o = i;
            if (o00O0.OooOOO(o00o0o2.f38962OooO00o, i, 5) != 5) {
                o00o0o2.f38968OooO0oO = 0;
                break;
            }
        }
        int length = sbOooO00o.length() - 1;
        int iOooO00o = o00o0o2.OooO00o() + length + 1;
        o00o0o2.OooO0o(iOooO00o);
        boolean z = o00o0o2.f38969OooO0oo.f38976OooO0O0 - iOooO00o > 0;
        if (o00o0o2.OooO0Oo() || z) {
            if (length <= 249) {
                sbOooO00o.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sbOooO00o.setCharAt(0, (char) ((length / SQLiteDatabase.MAX_SQL_CACHE_SIZE) + 249));
                sbOooO00o.insert(1, (char) (length % SQLiteDatabase.MAX_SQL_CACHE_SIZE));
            }
        }
        int length2 = sbOooO00o.length();
        for (int i2 = 0; i2 < length2; i2++) {
            int iOooO00o2 = (((o00o0o2.OooO00o() + 1) * 149) % KotlinVersion.MAX_COMPONENT_VALUE) + 1 + sbOooO00o.charAt(i2);
            if (iOooO00o2 > 255) {
                iOooO00o2 -= 256;
            }
            o00o0o2.OooO0oO((char) iOooO00o2);
        }
    }
}
