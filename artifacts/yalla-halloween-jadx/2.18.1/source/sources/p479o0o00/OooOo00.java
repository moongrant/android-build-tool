package p479o0o00;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f40746OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f40747OooO0O0;

    public OooOo00(float f, float f2) {
        this.f40746OooO00o = f;
        this.f40747OooO0O0 = f2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0Oo)) {
            return false;
        }
        float f = this.f40746OooO00o;
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        Objects.requireNonNull(o000o0oo2);
        if (!OooOOO0.OooO00o(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            return false;
        }
        float f2 = this.f40747OooO0O0;
        Objects.requireNonNull(o000o0oo2);
        return OooOOO0.OooO00o(f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f40747OooO0O0) + (Float.floatToIntBits(this.f40746OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TabPosition(left=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f40746OooO00o));
        sbOooO0o0.append(", right=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f40746OooO00o + this.f40747OooO0O0));
        sbOooO0o0.append(", width=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f40747OooO0O0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
