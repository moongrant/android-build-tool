package p023Oooo00O;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo extends o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f1209OooO00o;

    public o0Oo0oo(float f) {
        this.f1209OooO00o = f;
    }

    @Override // p023Oooo00O.o0O0O00
    public final float OooO00o(int i) {
        return i == 0 ? this.f1209OooO00o : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p023Oooo00O.o0O0O00
    public final int OooO0O0() {
        return 1;
    }

    @Override // p023Oooo00O.o0O0O00
    public final o0O0O00 OooO0OO() {
        return new o0Oo0oo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // p023Oooo00O.o0O0O00
    public final void OooO0Oo() {
        this.f1209OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p023Oooo00O.o0O0O00
    public final void OooO0o0(int i, float f) {
        if (i == 0) {
            this.f1209OooO00o = f;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0Oo0oo) {
            if (((o0Oo0oo) obj).f1209OooO00o == this.f1209OooO00o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1209OooO00o);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AnimationVector1D: value = ");
        sbOooO0o0.append(this.f1209OooO00o);
        return sbOooO0o0.toString();
    }
}
