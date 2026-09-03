package p092o000o0O0;

import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import o000O00.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class o000000 extends OooOO0O implements o0OO00O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0OO00O f35190OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f35191OooO0oO;

    public final void OooO(long j, o0OO00O o0oo00o2, long j2) {
        this.f33932OooO0o0 = j;
        this.f35190OooO0o = o0oo00o2;
        if (j2 != LongCompanionObject.MAX_VALUE) {
            j = j2;
        }
        this.f35191OooO0oO = j;
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO00o(long j) {
        o0OO00O o0oo00o2 = this.f35190OooO0o;
        o0oo00o2.getClass();
        return o0oo00o2.OooO00o(j - this.f35191OooO0oO);
    }

    @Override // p092o000o0O0.o0OO00O
    public final List<Cue> OooO0O0(long j) {
        o0OO00O o0oo00o2 = this.f35190OooO0o;
        o0oo00o2.getClass();
        return o0oo00o2.OooO0O0(j - this.f35191OooO0oO);
    }

    @Override // p092o000o0O0.o0OO00O
    public final long OooO0OO(int i) {
        o0OO00O o0oo00o2 = this.f35190OooO0o;
        o0oo00o2.getClass();
        return o0oo00o2.OooO0OO(i) + this.f35191OooO0oO;
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO0Oo() {
        o0OO00O o0oo00o2 = this.f35190OooO0o;
        o0oo00o2.getClass();
        return o0oo00o2.OooO0Oo();
    }
}
