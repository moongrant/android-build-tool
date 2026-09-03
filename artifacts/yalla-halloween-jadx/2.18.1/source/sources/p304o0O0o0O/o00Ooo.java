package p304o0O0o0O;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import o0O0o0.OooO;
import o0O0o0.OooO0OO;
import o0OOOO0o.OooO0o;
import p318o0O0oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends OooO {
    @Override // o0O0o0.OooO
    @Nullable
    public final Metadata OooO0O0(OooO0OO oooO0OO, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        o0000OO0 o0000oo1 = new o0000OO0(byteBuffer.array(), byteBuffer.limit());
        o0000oo1.OooOOO0(12);
        int iOooO0Oo = (o0000oo1.OooO0Oo() + o0000oo1.OooO0oO(12)) - 4;
        o0000oo1.OooOOO0(44);
        o0000oo1.OooOOO(o0000oo1.OooO0oO(12));
        o0000oo1.OooOOO0(16);
        ArrayList arrayList = new ArrayList();
        while (o0000oo1.OooO0Oo() < iOooO0Oo) {
            o0000oo1.OooOOO0(48);
            int iOooO0oO = o0000oo1.OooO0oO(8);
            o0000oo1.OooOOO0(4);
            int iOooO0Oo2 = o0000oo1.OooO0Oo() + o0000oo1.OooO0oO(12);
            String str = null;
            String str2 = null;
            while (o0000oo1.OooO0Oo() < iOooO0Oo2) {
                int iOooO0oO2 = o0000oo1.OooO0oO(8);
                int iOooO0oO3 = o0000oo1.OooO0oO(8);
                int iOooO0Oo3 = o0000oo1.OooO0Oo() + iOooO0oO3;
                if (iOooO0oO2 == 2) {
                    int iOooO0oO4 = o0000oo1.OooO0oO(16);
                    o0000oo1.OooOOO0(8);
                    if (iOooO0oO4 == 3) {
                        while (o0000oo1.OooO0Oo() < iOooO0Oo3) {
                            int iOooO0oO5 = o0000oo1.OooO0oO(8);
                            Charset charset = OooO0o.f38230OooO00o;
                            byte[] bArr = new byte[iOooO0oO5];
                            o0000oo1.OooO(bArr, iOooO0oO5);
                            str = new String(bArr, charset);
                            int iOooO0oO6 = o0000oo1.OooO0oO(8);
                            for (int i = 0; i < iOooO0oO6; i++) {
                                o0000oo1.OooOOO(o0000oo1.OooO0oO(8));
                            }
                        }
                    }
                } else if (iOooO0oO2 == 21) {
                    Charset charset2 = OooO0o.f38230OooO00o;
                    byte[] bArr2 = new byte[iOooO0oO3];
                    o0000oo1.OooO(bArr2, iOooO0oO3);
                    str2 = new String(bArr2, charset2);
                }
                o0000oo1.OooOO0O(iOooO0Oo3 * 8);
            }
            o0000oo1.OooOO0O(iOooO0Oo2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(iOooO0oO, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
