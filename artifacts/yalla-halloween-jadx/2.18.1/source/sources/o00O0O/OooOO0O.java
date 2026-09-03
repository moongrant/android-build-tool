package o00O0O;

import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f30404OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f30405OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f30406OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f30407OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f30403OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooOO0O f30402OooO0o = new OooOO0O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    public static final class OooO00o {
    }

    public OooOO0O(float f, float f2, float f3, float f4) {
        this.f30404OooO00o = f;
        this.f30405OooO0O0 = f2;
        this.f30406OooO0OO = f3;
        this.f30407OooO0Oo = f4;
    }

    public final long OooO00o() {
        float f = this.f30404OooO00o;
        float f2 = ((this.f30406OooO0OO - f) / 2.0f) + f;
        float f3 = this.f30405OooO0O0;
        return OooOO0.OooO00o(f2, ((this.f30407OooO0Oo - f3) / 2.0f) + f3);
    }

    public final boolean OooO0O0(@NotNull OooOO0O other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f30406OooO0OO > other.f30404OooO00o && other.f30406OooO0OO > this.f30404OooO00o && this.f30407OooO0Oo > other.f30405OooO0O0 && other.f30407OooO0Oo > this.f30405OooO0O0;
    }

    @Stable
    @NotNull
    public final OooOO0O OooO0OO(float f, float f2) {
        return new OooOO0O(this.f30404OooO00o + f, this.f30405OooO0O0 + f2, this.f30406OooO0OO + f, this.f30407OooO0Oo + f2);
    }

    @Stable
    @NotNull
    public final OooOO0O OooO0Oo(long j) {
        return new OooOO0O(OooO.OooO0OO(j) + this.f30404OooO00o, OooO.OooO0Oo(j) + this.f30405OooO0O0, OooO.OooO0OO(j) + this.f30406OooO0OO, OooO.OooO0Oo(j) + this.f30407OooO0Oo);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f30404OooO00o), (Object) Float.valueOf(oooOO0O.f30404OooO00o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f30405OooO0O0), (Object) Float.valueOf(oooOO0O.f30405OooO0O0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f30406OooO0OO), (Object) Float.valueOf(oooOO0O.f30406OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f30407OooO0Oo), (Object) Float.valueOf(oooOO0O.f30407OooO0Oo));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30407OooO0Oo) + o000O00O.OooO00o(this.f30406OooO0OO, o000O00O.OooO00o(this.f30405OooO0O0, Float.floatToIntBits(this.f30404OooO00o) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Rect.fromLTRB(");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30404OooO00o));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30405OooO0O0));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30406OooO0OO));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(this.f30407OooO0Oo));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
