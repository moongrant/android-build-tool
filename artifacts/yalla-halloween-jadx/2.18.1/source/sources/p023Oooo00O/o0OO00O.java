package p023Oooo00O;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O extends o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f1207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f1208OooO0O0;

    public o0OO00O(float f, float f2) {
        this.f1207OooO00o = f;
        this.f1208OooO0O0 = f2;
    }

    @Override // p023Oooo00O.o0O0O00
    public final float OooO00o(int i) {
        if (i != 0) {
            return i != 1 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f1208OooO0O0;
        }
        return this.f1207OooO00o;
    }

    @Override // p023Oooo00O.o0O0O00
    public final int OooO0O0() {
        return 2;
    }

    @Override // p023Oooo00O.o0O0O00
    public final o0O0O00 OooO0OO() {
        return new o0OO00O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // p023Oooo00O.o0O0O00
    public final void OooO0Oo() {
        this.f1207OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f1208OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p023Oooo00O.o0O0O00
    public final void OooO0o0(int i, float f) {
        if (i == 0) {
            this.f1207OooO00o = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f1208OooO0O0 = f;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0OO00O) {
            o0OO00O o0oo00o2 = (o0OO00O) obj;
            if (o0oo00o2.f1207OooO00o == this.f1207OooO00o) {
                if (o0oo00o2.f1208OooO0O0 == this.f1208OooO0O0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1208OooO0O0) + (Float.floatToIntBits(this.f1207OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AnimationVector2D: v1 = ");
        sbOooO0o0.append(this.f1207OooO00o);
        sbOooO0o0.append(", v2 = ");
        sbOooO0o0.append(this.f1208OooO0O0);
        return sbOooO0o0.toString();
    }
}
