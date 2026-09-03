package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p244o00oo0Oo.o00O0O0;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO implements com.google.android.exoplayer2.upstream.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f12968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f12969OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f12970OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f12971OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f12972OooO0o0;

    public interface OooO00o {
    }

    public OooO(o00O0O0 o00o0o0, int i, OooO00o oooO00o) {
        o00O000o.OooO00o(i > 0);
        this.f12968OooO00o = o00o0o0;
        this.f12969OooO0O0 = i;
        this.f12970OooO0OO = oooO00o;
        this.f12971OooO0Oo = new byte[1];
        this.f12972OooO0o0 = i;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooO0OO(o00O0OO0 o00o0oo1) {
        o00o0oo1.getClass();
        this.f12968OooO00o.OooO0OO(o00o0oo1);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0o0() {
        return this.f12968OooO00o.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f12968OooO00o.OooOO0O();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long jMax;
        int i3 = this.f12972OooO0o0;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f12968OooO00o;
        if (i3 == 0) {
            byte[] bArr2 = this.f12971OooO0Oo;
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
                            o00Oo00 o00oo00 = new o00Oo00(bArr3, i4);
                            Oooo0.OooO00o oooO00o2 = (Oooo0.OooO00o) this.f12970OooO0OO;
                            if (oooO00o2.f13120OooOOO0) {
                                Map<String, String> map = Oooo0.f13063Oooo;
                                jMax = Math.max(Oooo0.this.OooOo0o(true), oooO00o2.f13116OooOO0);
                            } else {
                                jMax = oooO00o2.f13116OooOO0;
                            }
                            int i8 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
                            o00O0O o00o0o2 = oooO00o2.f13118OooOO0o;
                            o00o0o2.getClass();
                            o00o0o2.OooO0Oo(i8, o00oo00);
                            o00o0o2.OooO0o0(jMax, 1, i8, 0, null);
                            oooO00o2.f13120OooOOO0 = true;
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
            this.f12972OooO0o0 = this.f12969OooO0O0;
        }
        int i10 = oooO00o.read(bArr, i, Math.min(this.f12972OooO0o0, i2));
        if (i10 != -1) {
            this.f12972OooO0o0 -= i10;
        }
        return i10;
    }
}
