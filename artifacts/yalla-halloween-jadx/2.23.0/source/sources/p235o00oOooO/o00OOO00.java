package p235o00oOooO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.IOException;
import p209o00o0oo0.o00O00o0;
import p244o00oo0Oo.o00O000;
import p244o00oo0Oo.o00O0O0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOO00 extends o00OO000 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00OO00O f40292OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00OO00O.OooO00o f40293OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f40294OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile boolean f40295OooOOO0;

    public o00OOO00(OooO00o oooO00o, DataSpec dataSpec, OooOo oooOo, int i, @Nullable Object obj, o00OO00O o00oo00o) {
        super(oooO00o, dataSpec, 2, oooOo, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f40292OooOO0 = o00oo00o;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO00o() throws IOException {
        boolean z;
        if (this.f40294OooOO0o == 0) {
            ((o00O) this.f40292OooOO0).OooO0OO(this.f40293OooOO0O, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            DataSpec dataSpec = this.f40254OooO0O0;
            long j = this.f40294OooOO0o;
            long j2 = dataSpec.f14167OooO0oO;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            DataSpec dataSpecOooO00o = dataSpec.OooO00o(j, j3);
            o00O0O0 o00o0o0 = this.f40252OooO;
            o00O00o0 o00o00o1 = new o00O00o0(o00o0o0, dataSpecOooO00o.f14165OooO0o, o00o0o0.OooO00o(dataSpecOooO00o));
            do {
                try {
                    if (this.f40295OooOOO0) {
                        break;
                    }
                    int iOooO0oO = ((o00O) this.f40292OooOO0).f40227OooO0Oo.OooO0oO(o00o00o1, o00O.f40224OooOOO);
                    z = false;
                    o00O000o.OooO0Oo(iOooO0oO != 1);
                    if (iOooO0oO == 0) {
                        z = true;
                    }
                } catch (Throwable th) {
                    this.f40294OooOO0o = o00o00o1.f39532OooO0Oo - this.f40254OooO0O0.f14165OooO0o;
                    throw th;
                }
            } while (z);
            this.f40294OooOO0o = o00o00o1.f39532OooO0Oo - this.f40254OooO0O0.f14165OooO0o;
            o00O000.OooO00o(this.f40252OooO);
        } catch (Throwable th2) {
            o00O000.OooO00o(this.f40252OooO);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO0O0() {
        this.f40295OooOOO0 = true;
    }
}
