package p363o0OOOoo0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements OooOo.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ byte[] f38570OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int[] f38571OooO0O0;

    public Oooo000(byte[] bArr, int[] iArr) {
        this.f38570OooO00o = bArr;
        this.f38571OooO0O0 = iArr;
    }

    public final void OooO00o(InputStream inputStream, int i) throws IOException {
        try {
            inputStream.read(this.f38570OooO00o, this.f38571OooO0O0[0], i);
            int[] iArr = this.f38571OooO0O0;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
