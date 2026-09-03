package o0O0O0O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.coroutines.Continuation;
import o0000O0O.o00oO0o;
import o0000O0O.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p346o0OOO0o.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooOOO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f35328Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f35329Oooo0oO;

    public OooO00o(boolean z, boolean z2) {
        this.f35328Oooo0o = z;
        this.f35329Oooo0oO = z2;
    }

    @Override // p346o0OOO0o.OooOOO
    @Nullable
    public final Object OooO00o(long j, long j2, @NotNull Continuation<? super oo000o> continuation) {
        boolean z = this.f35328Oooo0o;
        boolean z2 = this.f35329Oooo0oO;
        float fOooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fOooO0O0 = z ? oo000o.OooO0O0(j2) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (z2) {
            fOooO0OO = oo000o.OooO0OO(j2);
        }
        return new oo000o(o00oO0o.OooO00o(fOooO0O0, fOooO0OO));
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0O0(long j, int i) {
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        return o00O0O.OooO.f30392OooO0OO;
    }

    @Override // p346o0OOO0o.OooOOO
    public final /* synthetic */ Object OooO0OO(long j, Continuation continuation) {
        return p346o0OOO0o.OooOOO0.OooO00o();
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0Oo(long j, long j2, int i) {
        if (!(i == 2)) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }
        boolean z = this.f35328Oooo0o;
        boolean z2 = this.f35329Oooo0oO;
        float fOooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fOooO0OO = z ? o00O0O.OooO.OooO0OO(j2) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (z2) {
            fOooO0Oo = o00O0O.OooO.OooO0Oo(j2);
        }
        return o00O0O.OooOO0.OooO00o(fOooO0OO, fOooO0Oo);
    }
}
