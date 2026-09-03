package p218o00oOO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.common.base.OooO;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p245o00oo0o.o00OOOOo;
import p636o0ooOO.O0000000;
import p636o0ooOO.O0OO00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo000 extends O0OO00 {
    @Override // p636o0ooOO.O0OO00
    @Nullable
    public final Metadata OooO0O0(O0000000 o0000000, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        o00OOOOo o00ooooo2 = new o00OOOOo(byteBuffer.array(), byteBuffer.limit());
        o00ooooo2.OooOOO0(12);
        int iOooO0Oo = (o00ooooo2.OooO0Oo() + o00ooooo2.OooO0oO(12)) - 4;
        o00ooooo2.OooOOO0(44);
        o00ooooo2.OooOOO(o00ooooo2.OooO0oO(12));
        o00ooooo2.OooOOO0(16);
        ArrayList arrayList = new ArrayList();
        while (o00ooooo2.OooO0Oo() < iOooO0Oo) {
            o00ooooo2.OooOOO0(48);
            int iOooO0oO = o00ooooo2.OooO0oO(8);
            o00ooooo2.OooOOO0(4);
            int iOooO0Oo2 = o00ooooo2.OooO0Oo() + o00ooooo2.OooO0oO(12);
            String str = null;
            String str2 = null;
            while (o00ooooo2.OooO0Oo() < iOooO0Oo2) {
                int iOooO0oO2 = o00ooooo2.OooO0oO(8);
                int iOooO0oO3 = o00ooooo2.OooO0oO(8);
                int iOooO0Oo3 = o00ooooo2.OooO0Oo() + iOooO0oO3;
                if (iOooO0oO2 == 2) {
                    int iOooO0oO4 = o00ooooo2.OooO0oO(16);
                    o00ooooo2.OooOOO0(8);
                    if (iOooO0oO4 == 3) {
                        while (o00ooooo2.OooO0Oo() < iOooO0Oo3) {
                            int iOooO0oO5 = o00ooooo2.OooO0oO(8);
                            Charset charset = OooO.f19057OooO00o;
                            byte[] bArr = new byte[iOooO0oO5];
                            o00ooooo2.OooO(iOooO0oO5, bArr);
                            str = new String(bArr, charset);
                            int iOooO0oO6 = o00ooooo2.OooO0oO(8);
                            for (int i = 0; i < iOooO0oO6; i++) {
                                o00ooooo2.OooOOO(o00ooooo2.OooO0oO(8));
                            }
                        }
                    }
                } else if (iOooO0oO2 == 21) {
                    Charset charset2 = OooO.f19057OooO00o;
                    byte[] bArr2 = new byte[iOooO0oO3];
                    o00ooooo2.OooO(iOooO0oO3, bArr2);
                    str2 = new String(bArr2, charset2);
                }
                o00ooooo2.OooOO0O(iOooO0Oo3 * 8);
            }
            o00ooooo2.OooOO0O(iOooO0Oo2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(iOooO0oO, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
