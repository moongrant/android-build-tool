package p023Oooo00O;

import OooO00o.OooO00o;
import Oooo000.o000O00O;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0Oo extends o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f1321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f1322OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f1323OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f1324OooO0Oo;

    public oo0o0Oo(float f, float f2, float f3, float f4) {
        this.f1321OooO00o = f;
        this.f1322OooO0O0 = f2;
        this.f1323OooO0OO = f3;
        this.f1324OooO0Oo = f4;
    }

    @Override // p023Oooo00O.o0O0O00
    public final float OooO00o(int i) {
        if (i == 0) {
            return this.f1321OooO00o;
        }
        if (i == 1) {
            return this.f1322OooO0O0;
        }
        if (i != 2) {
            return i != 3 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f1324OooO0Oo;
        }
        return this.f1323OooO0OO;
    }

    @Override // p023Oooo00O.o0O0O00
    public final int OooO0O0() {
        return 4;
    }

    @Override // p023Oooo00O.o0O0O00
    public final o0O0O00 OooO0OO() {
        return new oo0o0Oo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // p023Oooo00O.o0O0O00
    public final void OooO0Oo() {
        this.f1321OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f1322OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f1323OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f1324OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p023Oooo00O.o0O0O00
    public final void OooO0o0(int i, float f) {
        if (i == 0) {
            this.f1321OooO00o = f;
            return;
        }
        if (i == 1) {
            this.f1322OooO0O0 = f;
        } else if (i == 2) {
            this.f1323OooO0OO = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f1324OooO0Oo = f;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof oo0o0Oo) {
            oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
            if (oo0o0oo.f1321OooO00o == this.f1321OooO00o) {
                if (oo0o0oo.f1322OooO0O0 == this.f1322OooO0O0) {
                    if (oo0o0oo.f1323OooO0OO == this.f1323OooO0OO) {
                        if (oo0o0oo.f1324OooO0Oo == this.f1324OooO0Oo) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1324OooO0Oo) + o000O00O.OooO00o(this.f1323OooO0OO, o000O00O.OooO00o(this.f1322OooO0O0, Float.floatToIntBits(this.f1321OooO00o) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AnimationVector4D: v1 = ");
        sbOooO0o0.append(this.f1321OooO00o);
        sbOooO0o0.append(", v2 = ");
        sbOooO0o0.append(this.f1322OooO0O0);
        sbOooO0o0.append(", v3 = ");
        sbOooO0o0.append(this.f1323OooO0OO);
        sbOooO0o0.append(", v4 = ");
        sbOooO0o0.append(this.f1324OooO0Oo);
        return sbOooO0o0.toString();
    }
}
