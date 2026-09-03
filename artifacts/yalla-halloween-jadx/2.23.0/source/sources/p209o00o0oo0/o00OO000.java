package p209o00o0oo0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import p221o00oOOOo.oOO00O;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f39543OooO00o = new o00Oo00(10);

    @Nullable
    public final Metadata OooO00o(o00O00o0 o00o00o1, @Nullable oOO00O.OooO00o oooO00o) throws IOException {
        o00Oo00 o00oo00 = this.f39543OooO00o;
        Metadata metadataOooO0OO = null;
        int i = 0;
        while (true) {
            try {
                o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 10, false);
                o00oo00.Oooo00O(0);
                if (o00oo00.OooOo() != 4801587) {
                    break;
                }
                o00oo00.Oooo00o(3);
                int iOooOo0 = o00oo00.OooOo0();
                int i2 = iOooOo0 + 10;
                if (metadataOooO0OO == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(o00oo00.f40591OooO00o, 0, bArr, 0, 10);
                    o00o00o1.OooO0Oo(bArr, 10, iOooOo0, false);
                    metadataOooO0OO = new oOO00O(oooO00o).OooO0OO(i2, bArr);
                } else {
                    o00o00o1.OooOO0o(iOooOo0, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        o00o00o1.f39533OooO0o = 0;
        o00o00o1.OooOO0o(i, false);
        return metadataOooO0OO;
    }
}
