package p310o0O0o0oo;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p709oo0oOOo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 implements com.google.android.exoplayer2.upstream.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f36257OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36258OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f36259OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f36260OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36261OooO0o0;

    public interface OooO00o {
    }

    public o00(com.google.android.exoplayer2.upstream.OooO00o oooO00o, int i, OooO00o oooO00o2) {
        o00000O0.OooO00o(i > 0);
        this.f36257OooO00o = oooO00o;
        this.f36258OooO0O0 = i;
        this.f36259OooO0OO = oooO00o2;
        this.f36260OooO0Oo = new byte[1];
        this.f36261OooO0o0 = i;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0oo() {
        return this.f36257OooO00o.OooO0oo();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooOO0O(o000oOoO o000oooo2) {
        Objects.requireNonNull(o000oooo2);
        this.f36257OooO00o.OooOO0O(o000oooo2);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        return this.f36257OooO00o.OooOO0o();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long jMax;
        if (this.f36261OooO0o0 == 0) {
            boolean z = true;
            if (this.f36257OooO00o.read(this.f36260OooO0Oo, 0, 1) == -1) {
                z = false;
                break;
            }
            int i3 = (this.f36260OooO0Oo[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
            if (i3 != 0) {
                byte[] bArr2 = new byte[i3];
                int i4 = i3;
                int i5 = 0;
                while (true) {
                    if (i4 <= 0) {
                        while (i3 > 0) {
                            int i6 = i3 - 1;
                            if (bArr2[i6] != 0) {
                                break;
                            }
                            i3 = i6;
                        }
                        if (i3 <= 0) {
                            break;
                        }
                        OooO00o oooO00o = this.f36259OooO0OO;
                        o000 o000Var = new o000(bArr2, i3);
                        o00O0OO0.OooO00o oooO00o2 = (o00O0OO0.OooO00o) oooO00o;
                        if (oooO00o2.f36419OooOOO) {
                            o00O0OO0 o00o0oo1 = o00O0OO0.this;
                            Map<String, String> map = o00O0OO0.f36364o0Oo0oo;
                            jMax = Math.max(o00o0oo1.OooOo0o(), oooO00o2.f36416OooOO0);
                        } else {
                            jMax = oooO00o2.f36416OooOO0;
                        }
                        int i7 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
                        TrackOutput trackOutput = oooO00o2.f36420OooOOO0;
                        Objects.requireNonNull(trackOutput);
                        trackOutput.OooO0OO(o000Var, i7);
                        trackOutput.OooO0Oo(jMax, 1, i7, 0, null);
                        oooO00o2.f36419OooOOO = true;
                        break;
                    }
                    int i8 = this.f36257OooO00o.read(bArr2, i5, i4);
                    if (i8 == -1) {
                        z = false;
                        break;
                    }
                    i5 += i8;
                    i4 -= i8;
                }
            }
            if (!z) {
                return -1;
            }
            this.f36261OooO0o0 = this.f36258OooO0O0;
        }
        int i9 = this.f36257OooO00o.read(bArr, i, Math.min(this.f36261OooO0o0, i2));
        if (i9 != -1) {
            this.f36261OooO0o0 -= i9;
        }
        return i9;
    }
}
