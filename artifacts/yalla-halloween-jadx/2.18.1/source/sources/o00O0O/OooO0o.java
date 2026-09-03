package o00O0O;

import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f30398OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f30399OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f30400OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f30401OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    @Stable
    public final void OooO00o(float f, float f2, float f3, float f4) {
        this.f30398OooO00o = Math.max(f, this.f30398OooO00o);
        this.f30399OooO0O0 = Math.max(f2, this.f30399OooO0O0);
        this.f30400OooO0OO = Math.min(f3, this.f30400OooO0OO);
        this.f30401OooO0Oo = Math.min(f4, this.f30401OooO0Oo);
    }

    public final boolean OooO0O0() {
        return this.f30398OooO00o >= this.f30400OooO0OO || this.f30399OooO0O0 >= this.f30401OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MutableRect(");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30398OooO00o));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30399OooO0O0));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30400OooO0OO));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30401OooO0Oo));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
