package p255o00ooOOo;

import com.android.billingclient.api.o0000O00;
import com.google.android.gms.common.internal.zas;
import net.sqlcipher.database.SQLiteDatabase;
import oo0ooO.OooOO0;
import oo0ooO.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00oO implements zas, OooOO0 {
    @Override // oo0ooO.OooOO0
    public void OooO00o(OooOO0O oooOO0O) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (oooOO0O.OooO0OO()) {
            sb.append(oooOO0O.OooO0O0());
            int i = oooOO0O.f60948OooO0o + 1;
            oooOO0O.f60948OooO0o = i;
            if (o0000O00.OooO0o0(oooOO0O.f60944OooO00o, i, 5) != 5) {
                oooOO0O.f60950OooO0oO = 0;
                break;
            }
        }
        int length = sb.length() - 1;
        int iOooO00o = oooOO0O.OooO00o() + length + 1;
        oooOO0O.OooO0Oo(iOooO00o);
        boolean z = oooOO0O.f60951OooO0oo.f60954OooO0O0 - iOooO00o > 0;
        if (oooOO0O.OooO0OO() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / SQLiteDatabase.MAX_SQL_CACHE_SIZE) + 249));
                sb.insert(1, (char) (length % SQLiteDatabase.MAX_SQL_CACHE_SIZE));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            int iOooO00o2 = (((oooOO0O.OooO00o() + 1) * 149) % 255) + 1 + sb.charAt(i2);
            if (iOooO00o2 > 255) {
                iOooO00o2 -= 256;
            }
            oooOO0O.OooO0o0((char) iOooO00o2);
        }
    }
}
