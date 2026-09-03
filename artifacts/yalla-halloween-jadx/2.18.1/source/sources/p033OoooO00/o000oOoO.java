package p033OoooO00;

import OooO00o.OooO00o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f3430OooO00o;

    public o000oOoO(float f) {
        this.f3430OooO00o = f;
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p033OoooO00.OooOo
    public final float OooO00o(long j, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return (this.f3430OooO00o / 100.0f) * OooOo00.OooO0OO(j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000oOoO) && Intrinsics.areEqual((Object) Float.valueOf(this.f3430OooO00o), (Object) Float.valueOf(((o000oOoO) obj).f3430OooO00o));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3430OooO00o);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CornerSize(size = ");
        sbOooO0o0.append(this.f3430OooO00o);
        sbOooO0o0.append("%)");
        return sbOooO0o0.toString();
    }
}
