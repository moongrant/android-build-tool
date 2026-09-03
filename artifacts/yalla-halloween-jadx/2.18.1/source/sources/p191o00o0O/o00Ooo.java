package p191o00o0O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f33076OooO00o;

    public o00Ooo(o0ooOOo o0ooooo2) {
        this.f33076OooO00o = o0ooooo2;
    }

    @Override // p191o00o0O.oo0o0Oo
    public final void OooO00o(float f, float f2, float f3, float f4, int i) {
        this.f33076OooO00o.OooO0o().OooO00o(f, f2, f3, f4, i);
    }

    @Override // p191o00o0O.oo0o0Oo
    public final void OooO0O0(float f, float f2) {
        this.f33076OooO00o.OooO0o().OooO0O0(f, f2);
    }

    @Override // p191o00o0O.oo0o0Oo
    public final void OooO0OO(@NotNull o000O0o path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f33076OooO00o.OooO0o().OooO0OO(path, i);
    }

    @Override // p191o00o0O.oo0o0Oo
    public final void OooO0Oo(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f33076OooO00o.OooO0o().OooOOO0(matrix);
    }

    @Override // p191o00o0O.oo0o0Oo
    public final void OooO0o(float f, float f2, float f3, float f4) {
        o0O0O00 o0o0o00OooO0o = this.f33076OooO00o.OooO0o();
        o0ooOOo o0ooooo2 = this.f33076OooO00o;
        long jOooO00o = OooOo.OooO00o(OooOo00.OooO0Oo(o0ooooo2.OooO0OO()) - (f3 + f), OooOo00.OooO0O0(this.f33076OooO00o.OooO0OO()) - (f4 + f2));
        if (!(OooOo00.OooO0Oo(jOooO00o) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOo00.OooO0O0(jOooO00o) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }
        o0ooooo2.OooO0o0(jOooO00o);
        o0o0o00OooO0o.OooO0O0(f, f2);
    }

    @Override // p191o00o0O.oo0o0Oo
    public final void OooO0o0(float f, float f2, long j) {
        o0O0O00 o0o0o00OooO0o = this.f33076OooO00o.OooO0o();
        o0o0o00OooO0o.OooO0O0(OooO.OooO0OO(j), OooO.OooO0Oo(j));
        o0o0o00OooO0o.OooO0Oo(f, f2);
        o0o0o00OooO0o.OooO0O0(-OooO.OooO0OO(j), -OooO.OooO0Oo(j));
    }

    @Override // p191o00o0O.oo0o0Oo
    public final void OooO0oO(long j) {
        o0O0O00 o0o0o00OooO0o = this.f33076OooO00o.OooO0o();
        o0o0o00OooO0o.OooO0O0(OooO.OooO0OO(j), OooO.OooO0Oo(j));
        o0o0o00OooO0o.OooOOOo();
        o0o0o00OooO0o.OooO0O0(-OooO.OooO0OO(j), -OooO.OooO0Oo(j));
    }
}
