package p296o0O0OoO0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import p308o0O0o0o0.OooO;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f35930OooO00o = new o000(10);

    @Nullable
    public final Metadata OooO00o(o000oOoO o000oooo2, @Nullable OooO.OooO00o oooO00o) throws IOException {
        Metadata metadataOooO0Oo = null;
        int i = 0;
        while (true) {
            try {
                o000oooo2.OooOOO0(this.f35930OooO00o.f36661OooO00o, 0, 10);
                this.f35930OooO00o.OooOoOO(0);
                if (this.f35930OooO00o.OooOOoo() != 4801587) {
                    break;
                }
                this.f35930OooO00o.OooOoo0(3);
                int iOooOOOo = this.f35930OooO00o.OooOOOo();
                int i2 = iOooOOOo + 10;
                if (metadataOooO0Oo == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f35930OooO00o.f36661OooO00o, 0, bArr, 0, 10);
                    o000oooo2.OooOOO0(bArr, 10, iOooOOOo);
                    metadataOooO0Oo = new OooO(oooO00o).OooO0Oo(bArr, i2);
                } else {
                    o000oooo2.OooO0o0(iOooOOOo);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        o000oooo2.OooO();
        o000oooo2.OooO0o0(i);
        return metadataOooO0Oo;
    }
}
