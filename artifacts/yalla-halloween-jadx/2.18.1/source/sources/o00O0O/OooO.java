package o00O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f30391OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f30392OooO0OO = OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f30393OooO0Oo = OooOO0.OooO00o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f30394OooO0o0 = OooOO0.OooO00o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f30395OooO00o;

    public static final class OooO00o {
    }

    @NotNull
    public static String OooO(long j) {
        if (!OooOO0.OooO0OO(j)) {
            return "Offset.Unspecified";
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Offset(");
        sbOooO0o0.append(OooO0OO.OooO00o(OooO0OO(j)));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(OooO0Oo(j)));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    @Stable
    public static final float OooO0O0(long j) {
        return (float) Math.sqrt((OooO0Oo(j) * OooO0Oo(j)) + (OooO0OO(j) * OooO0OO(j)));
    }

    public static final float OooO0OO(long j) {
        if (!(j != f30394OooO0o0)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0Oo(long j) {
        if (!(j != f30394OooO0o0)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    @Stable
    public static final long OooO0o(long j, long j2) {
        return OooOO0.OooO00o(OooO0OO(j) - OooO0OO(j2), OooO0Oo(j) - OooO0Oo(j2));
    }

    public static int OooO0o0(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Stable
    public static final long OooO0oO(long j, long j2) {
        return OooOO0.OooO00o(OooO0OO(j2) + OooO0OO(j), OooO0Oo(j2) + OooO0Oo(j));
    }

    @Stable
    public static final long OooO0oo(long j, float f) {
        return OooOO0.OooO00o(OooO0OO(j) * f, OooO0Oo(j) * f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooO) && this.f30395OooO00o == ((OooO) obj).f30395OooO00o;
    }

    public final int hashCode() {
        return OooO0o0(this.f30395OooO00o);
    }

    @NotNull
    public final String toString() {
        return OooO(this.f30395OooO00o);
    }
}
