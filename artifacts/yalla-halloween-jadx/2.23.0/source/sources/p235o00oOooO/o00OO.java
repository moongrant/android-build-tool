package p235o00oOooO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.source.o00O0O;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.IOException;
import p209o00o0oo0.o00O00o0;
import p244o00oo0Oo.o00O000;
import p244o00oo0Oo.o00O0O0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OO extends oo0o0O0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f40246OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final long f40247OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f40248OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o00OO00O f40249OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile boolean f40250OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f40251OooOo00;

    public o00OO(OooO00o oooO00o, DataSpec dataSpec, OooOo oooOo, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, o00OO00O o00oo00o) {
        super(oooO00o, dataSpec, oooOo, i, obj, j, j2, j3, j4, j5);
        this.f40246OooOOOO = i2;
        this.f40247OooOOOo = j6;
        this.f40249OooOOo0 = o00oo00o;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO00o() throws IOException {
        int iOooO0oO;
        if (this.f40248OooOOo == 0) {
            o00O0OOO o00o0ooo2 = this.f40304OooOOO0;
            o00O000o.OooO0o0(o00o0ooo2);
            long j = this.f40247OooOOOo;
            for (o00O0O o00o0o2 : o00o0ooo2.f40245OooO0O0) {
                if (o00o0o2.f13330OooOooo != j) {
                    o00o0o2.f13330OooOooo = j;
                    o00o0o2.f13324OooOoO = true;
                }
            }
            o00OO00O o00oo00o = this.f40249OooOOo0;
            long j2 = this.f40301OooOO0O;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f40247OooOOOo;
            long j4 = this.f40302OooOO0o;
            ((o00O) o00oo00o).OooO0OO(o00o0ooo2, j3, j4 != -9223372036854775807L ? j4 - this.f40247OooOOOo : -9223372036854775807L);
        }
        try {
            DataSpec dataSpec = this.f40254OooO0O0;
            long j5 = this.f40248OooOOo;
            long j6 = dataSpec.f14167OooO0oO;
            long j7 = -1;
            if (j6 != -1) {
                j7 = j6 - j5;
            }
            DataSpec dataSpecOooO00o = dataSpec.OooO00o(j5, j7);
            o00O0O0 o00o0o0 = this.f40252OooO;
            o00O00o0 o00o00o1 = new o00O00o0(o00o0o0, dataSpecOooO00o.f14165OooO0o, o00o0o0.OooO00o(dataSpecOooO00o));
            do {
                try {
                    if (this.f40250OooOOoo) {
                        break;
                    }
                    iOooO0oO = ((o00O) this.f40249OooOOo0).f40227OooO0Oo.OooO0oO(o00o00o1, o00O.f40224OooOOO);
                    o00O000o.OooO0Oo(iOooO0oO != 1);
                } catch (Throwable th) {
                    this.f40248OooOOo = o00o00o1.f39532OooO0Oo - this.f40254OooO0O0.f14165OooO0o;
                    throw th;
                }
            } while (iOooO0oO == 0);
            this.f40248OooOOo = o00o00o1.f39532OooO0Oo - this.f40254OooO0O0.f14165OooO0o;
            o00O000.OooO00o(this.f40252OooO);
            this.f40251OooOo00 = !this.f40250OooOOoo;
        } catch (Throwable th2) {
            o00O000.OooO00o(this.f40252OooO);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO0O0() {
        this.f40250OooOOoo = true;
    }

    @Override // p235o00oOooO.o00OOO0
    public final long OooO0OO() {
        return this.f40291OooOO0 + ((long) this.f40246OooOOOO);
    }

    @Override // p235o00oOooO.o00OOO0
    public final boolean OooO0Oo() {
        return this.f40251OooOo00;
    }
}
