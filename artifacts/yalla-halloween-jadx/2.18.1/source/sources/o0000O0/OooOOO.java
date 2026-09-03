package o0000O0;

import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27264OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooOOO f27265OooO0Oo = new OooOOO(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f27266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f27267OooO0O0;

    public static final class OooO00o {
    }

    public OooOOO(float f, float f2) {
        this.f27266OooO00o = f;
        this.f27267OooO0O0 = f2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        if (this.f27266OooO00o == oooOOO.f27266OooO00o) {
            return (this.f27267OooO0O0 > oooOOO.f27267OooO0O0 ? 1 : (this.f27267OooO0O0 == oooOOO.f27267OooO0O0 ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f27267OooO0O0) + (Float.floatToIntBits(this.f27266OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextGeometricTransform(scaleX=");
        sbOooO0o0.append(this.f27266OooO00o);
        sbOooO0o0.append(", skewX=");
        return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f27267OooO0O0, ')');
    }

    public OooOOO() {
        this(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }
}
