package o0OO00OO;

import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements OooO {
    @Override // o0OO00OO.OooO
    public final void OooO00o(OooOO0 oooOO1) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (oooOO1.OooO0OO()) {
            sb.append(oooOO1.OooO0O0());
            int i = oooOO1.f42295OooO0o + 1;
            oooOO1.f42295OooO0o = i;
            if (OooOOO0.OooO0o0(oooOO1.f42291OooO00o, i, 5) != 5) {
                oooOO1.f42297OooO0oO = 0;
                break;
            }
        }
        int length = sb.length() - 1;
        int iOooO00o = oooOO1.OooO00o() + length + 1;
        oooOO1.OooO0Oo(iOooO00o);
        boolean z = oooOO1.f42298OooO0oo.f42305OooO0O0 - iOooO00o > 0;
        if (oooOO1.OooO0OO() || z) {
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
            int iOooO00o2 = (((oooOO1.OooO00o() + 1) * 149) % 255) + 1 + sb.charAt(i2);
            if (iOooO00o2 > 255) {
                iOooO00o2 -= 256;
            }
            oooOO1.OooO0o0((char) iOooO00o2);
        }
    }
}
