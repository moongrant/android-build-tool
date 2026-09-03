package o00O0O;

import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f30408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f30409OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f30410OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f30411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f30412OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f30413OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f30414OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f30415OooO0oo;

    static {
        OooO00o.C0334OooO00o c0334OooO00o = OooO00o.f30396OooO00o;
        OooOOOO.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooO00o.f30397OooO0O0);
    }

    public OooOOO(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f30408OooO00o = f;
        this.f30409OooO0O0 = f2;
        this.f30410OooO0OO = f3;
        this.f30411OooO0Oo = f4;
        this.f30413OooO0o0 = j;
        this.f30412OooO0o = j2;
        this.f30414OooO0oO = j3;
        this.f30415OooO0oo = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f30408OooO00o), (Object) Float.valueOf(oooOOO.f30408OooO00o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f30409OooO0O0), (Object) Float.valueOf(oooOOO.f30409OooO0O0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f30410OooO0OO), (Object) Float.valueOf(oooOOO.f30410OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f30411OooO0Oo), (Object) Float.valueOf(oooOOO.f30411OooO0Oo)) && OooO00o.OooO00o(this.f30413OooO0o0, oooOOO.f30413OooO0o0) && OooO00o.OooO00o(this.f30412OooO0o, oooOOO.f30412OooO0o) && OooO00o.OooO00o(this.f30414OooO0oO, oooOOO.f30414OooO0oO) && OooO00o.OooO00o(this.f30415OooO0oo, oooOOO.f30415OooO0oo);
    }

    public final int hashCode() {
        return OooO00o.OooO0Oo(this.f30415OooO0oo) + ((OooO00o.OooO0Oo(this.f30414OooO0oO) + ((OooO00o.OooO0Oo(this.f30412OooO0o) + ((OooO00o.OooO0Oo(this.f30413OooO0o0) + o000O00O.OooO00o(this.f30411OooO0Oo, o000O00O.OooO00o(this.f30410OooO0OO, o000O00O.OooO00o(this.f30409OooO0O0, Float.floatToIntBits(this.f30408OooO00o) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        long j = this.f30413OooO0o0;
        long j2 = this.f30412OooO0o;
        long j3 = this.f30414OooO0oO;
        long j4 = this.f30415OooO0oo;
        String str = OooO0OO.OooO00o(this.f30408OooO00o) + ", " + OooO0OO.OooO00o(this.f30409OooO0O0) + ", " + OooO0OO.OooO00o(this.f30410OooO0OO) + ", " + OooO0OO.OooO00o(this.f30411OooO0Oo);
        if (!OooO00o.OooO00o(j, j2) || !OooO00o.OooO00o(j2, j3) || !OooO00o.OooO00o(j3, j4)) {
            StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("RoundRect(rect=", str, ", topLeft=");
            sbOooO0OO.append((Object) OooO00o.OooO0o0(j));
            sbOooO0OO.append(", topRight=");
            sbOooO0OO.append((Object) OooO00o.OooO0o0(j2));
            sbOooO0OO.append(", bottomRight=");
            sbOooO0OO.append((Object) OooO00o.OooO0o0(j3));
            sbOooO0OO.append(", bottomLeft=");
            sbOooO0OO.append((Object) OooO00o.OooO0o0(j4));
            sbOooO0OO.append(')');
            return sbOooO0OO.toString();
        }
        if (OooO00o.OooO0O0(j) == OooO00o.OooO0OO(j)) {
            StringBuilder sbOooO0OO2 = OooO0o.OooO0o.OooO0OO("RoundRect(rect=", str, ", radius=");
            sbOooO0OO2.append(OooO0OO.OooO00o(OooO00o.OooO0O0(j)));
            sbOooO0OO2.append(')');
            return sbOooO0OO2.toString();
        }
        StringBuilder sbOooO0OO3 = OooO0o.OooO0o.OooO0OO("RoundRect(rect=", str, ", x=");
        sbOooO0OO3.append(OooO0OO.OooO00o(OooO00o.OooO0O0(j)));
        sbOooO0OO3.append(", y=");
        sbOooO0OO3.append(OooO0OO.OooO00o(OooO00o.OooO0OO(j)));
        sbOooO0OO3.append(')');
        return sbOooO0OO3.toString();
    }
}
