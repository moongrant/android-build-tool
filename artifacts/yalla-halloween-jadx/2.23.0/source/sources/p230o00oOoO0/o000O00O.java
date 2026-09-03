package p230o00oOoO0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import p206o00o0oOO.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o000O00O extends o0O00000 implements o000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o000 f40117OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f40118OooO0oO;

    public final void OooO(long j, o000 o000Var, long j2) {
        this.f39411OooO0o0 = j;
        this.f40117OooO0o = o000Var;
        if (j2 != LongCompanionObject.MAX_VALUE) {
            j = j2;
        }
        this.f40118OooO0oO = j;
    }

    @Override // p230o00oOoO0.o000
    public final int OooO00o(long j) {
        o000 o000Var = this.f40117OooO0o;
        o000Var.getClass();
        return o000Var.OooO00o(j - this.f40118OooO0oO);
    }

    @Override // p230o00oOoO0.o000
    public final List<Cue> OooO0O0(long j) {
        o000 o000Var = this.f40117OooO0o;
        o000Var.getClass();
        return o000Var.OooO0O0(j - this.f40118OooO0oO);
    }

    @Override // p230o00oOoO0.o000
    public final long OooO0OO(int i) {
        o000 o000Var = this.f40117OooO0o;
        o000Var.getClass();
        return o000Var.OooO0OO(i) + this.f40118OooO0oO;
    }

    @Override // p230o00oOoO0.o000
    public final int OooO0Oo() {
        o000 o000Var = this.f40117OooO0o;
        o000Var.getClass();
        return o000Var.OooO0Oo();
    }
}
