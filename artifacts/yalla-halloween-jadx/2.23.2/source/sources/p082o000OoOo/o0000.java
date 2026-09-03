package p082o000OoOo;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import com.google.common.base.OooOO0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p080o000OoO.o000;
import p081o000OoOO.o00000OO;
import p081o000OoOO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0000 extends o0000Ooo {
    @Override // p081o000OoOO.o0000Ooo
    @Nullable
    public final Metadata OooO0O0(o00000OO o00000oo2, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        o000 o000Var = new o000(byteBuffer.array(), byteBuffer.limit());
        o000Var.OooOOO0(12);
        int iOooO0Oo = (o000Var.OooO0Oo() + o000Var.OooO0oO(12)) - 4;
        o000Var.OooOOO0(44);
        o000Var.OooOOO(o000Var.OooO0oO(12));
        o000Var.OooOOO0(16);
        ArrayList arrayList = new ArrayList();
        while (o000Var.OooO0Oo() < iOooO0Oo) {
            o000Var.OooOOO0(48);
            int iOooO0oO = o000Var.OooO0oO(8);
            o000Var.OooOOO0(4);
            int iOooO0Oo2 = o000Var.OooO0Oo() + o000Var.OooO0oO(12);
            String str = null;
            String str2 = null;
            while (o000Var.OooO0Oo() < iOooO0Oo2) {
                int iOooO0oO2 = o000Var.OooO0oO(8);
                int iOooO0oO3 = o000Var.OooO0oO(8);
                int iOooO0Oo3 = o000Var.OooO0Oo() + iOooO0oO3;
                if (iOooO0oO2 == 2) {
                    int iOooO0oO4 = o000Var.OooO0oO(16);
                    o000Var.OooOOO0(8);
                    if (iOooO0oO4 == 3) {
                        while (o000Var.OooO0Oo() < iOooO0Oo3) {
                            int iOooO0oO5 = o000Var.OooO0oO(8);
                            Charset charset = OooOO0.f18590OooO00o;
                            byte[] bArr = new byte[iOooO0oO5];
                            o000Var.OooO(iOooO0oO5, bArr);
                            str = new String(bArr, charset);
                            int iOooO0oO6 = o000Var.OooO0oO(8);
                            for (int i = 0; i < iOooO0oO6; i++) {
                                o000Var.OooOOO(o000Var.OooO0oO(8));
                            }
                        }
                    }
                } else if (iOooO0oO2 == 21) {
                    Charset charset2 = OooOO0.f18590OooO00o;
                    byte[] bArr2 = new byte[iOooO0oO3];
                    o000Var.OooO(iOooO0oO3, bArr2);
                    str2 = new String(bArr2, charset2);
                }
                o000Var.OooOO0O(iOooO0Oo3 * 8);
            }
            o000Var.OooOO0O(iOooO0Oo2 * 8);
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
