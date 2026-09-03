package p677o0oooo0o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OO0O extends InputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final oO f52173Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f52174Oooo0oO = true;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public InputStream f52175Oooo0oo;

    public oOO0OO0O(oO oOVar) {
        this.f52173Oooo0o = oOVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ooo0o ooo0oVar;
        if (this.f52175Oooo0oo == null) {
            if (!this.f52174Oooo0oO || (ooo0oVar = (ooo0o) this.f52173Oooo0o.OooO00o()) == null) {
                return -1;
            }
            this.f52174Oooo0oO = false;
            this.f52175Oooo0oo = ooo0oVar.OooO00o();
        }
        while (true) {
            int i = this.f52175Oooo0oo.read();
            if (i >= 0) {
                return i;
            }
            ooo0o ooo0oVar2 = (ooo0o) this.f52173Oooo0o.OooO00o();
            if (ooo0oVar2 == null) {
                this.f52175Oooo0oo = null;
                return -1;
            }
            this.f52175Oooo0oo = ooo0oVar2.OooO00o();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        ooo0o ooo0oVar;
        int i3 = 0;
        if (this.f52175Oooo0oo == null) {
            if (!this.f52174Oooo0oO || (ooo0oVar = (ooo0o) this.f52173Oooo0o.OooO00o()) == null) {
                return -1;
            }
            this.f52174Oooo0oO = false;
            this.f52175Oooo0oo = ooo0oVar.OooO00o();
        }
        while (true) {
            int i4 = this.f52175Oooo0oo.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                ooo0o ooo0oVar2 = (ooo0o) this.f52173Oooo0o.OooO00o();
                if (ooo0oVar2 == null) {
                    this.f52175Oooo0oo = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f52175Oooo0oo = ooo0oVar2.OooO00o();
            }
        }
    }
}
