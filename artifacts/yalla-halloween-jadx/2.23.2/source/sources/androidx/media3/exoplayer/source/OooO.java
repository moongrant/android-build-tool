package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements androidx.media3.datasource.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f7867OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f7868OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f7869OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f7870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f7871OooO0o0;

    public interface OooO00o {
    }

    public OooO(o000O0O.OooOOOO oooOOOO, int i, OooO00o oooO00o) {
        p080o000OoO.o00Oo0.OooO00o(i > 0);
        this.f7867OooO00o = oooOOOO;
        this.f7868OooO0O0 = i;
        this.f7869OooO0OO = oooO00o;
        this.f7870OooO0Oo = new byte[1];
        this.f7871OooO0o0 = i;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final Map<String, List<String>> OooO0Oo() {
        return this.f7867OooO00o.OooO0Oo();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void OooO0oO(o000O0O.OooOo oooOo) {
        oooOo.getClass();
        this.f7867OooO00o.OooO0oO(oooOo);
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f7867OooO00o.OooOO0O();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long jMax;
        int i3 = this.f7871OooO0o0;
        androidx.media3.datasource.OooO00o oooO00o = this.f7867OooO00o;
        if (i3 == 0) {
            byte[] bArr2 = this.f7870OooO0Oo;
            boolean z = false;
            if (oooO00o.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 == 0) {
                    z = true;
                    break;
                }
                byte[] bArr3 = new byte[i4];
                int i5 = i4;
                int i6 = 0;
                while (true) {
                    if (i5 <= 0) {
                        while (i4 > 0) {
                            int i7 = i4 - 1;
                            if (bArr3[i7] != 0) {
                                break;
                            }
                            i4 = i7;
                        }
                        if (i4 > 0) {
                            o000O000 o000o001 = new o000O000(bArr3, i4);
                            Oooo0.OooO00o oooO00o2 = (Oooo0.OooO00o) this.f7869OooO0OO;
                            if (oooO00o2.f8019OooOOO0) {
                                Map<String, String> map = Oooo0.f7962Oooo;
                                jMax = Math.max(Oooo0.this.OooOo0O(true), oooO00o2.f8015OooOO0);
                            } else {
                                jMax = oooO00o2.f8015OooOO0;
                            }
                            int i8 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
                            o00O0O o00o0o2 = oooO00o2.f8017OooOO0o;
                            o00o0o2.getClass();
                            o00o0o2.OooO0Oo(i8, o000o001);
                            o00o0o2.OooO0o0(jMax, 1, i8, 0, null);
                            oooO00o2.f8019OooOOO0 = true;
                        }
                        z = true;
                        break;
                    }
                    int i9 = oooO00o.read(bArr3, i6, i5);
                    if (i9 == -1) {
                        break;
                    }
                    i6 += i9;
                    i5 -= i9;
                }
            }
            if (!z) {
                return -1;
            }
            this.f7871OooO0o0 = this.f7868OooO0O0;
        }
        int i10 = oooO00o.read(bArr, i, Math.min(this.f7871OooO0o0, i2));
        if (i10 != -1) {
            this.f7871OooO0o0 -= i10;
        }
        return i10;
    }
}
