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
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f30416OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f30417OooO0OO = OooOo.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f30418OooO0Oo = OooOo.OooO00o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f30419OooO00o;

    public static final class OooO00o {
    }

    public /* synthetic */ OooOo00(long j) {
        this.f30419OooO00o = j;
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final float OooO0O0(long j) {
        if (!(j != f30418OooO0Oo)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float OooO0OO(long j) {
        return Math.min(Math.abs(OooO0Oo(j)), Math.abs(OooO0O0(j)));
    }

    public static final float OooO0Oo(long j) {
        if (!(j != f30418OooO0Oo)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @Stable
    public static final boolean OooO0o(long j) {
        return OooO0Oo(j) <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || OooO0O0(j) <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public static int OooO0o0(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public static String OooO0oO(long j) {
        if (!(j != f30418OooO0Oo)) {
            return "Size.Unspecified";
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Size(");
        sbOooO0o0.append(OooO0OO.OooO00o(OooO0Oo(j)));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0OO.OooO00o(OooO0O0(j)));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooOo00) && this.f30419OooO00o == ((OooOo00) obj).f30419OooO00o;
    }

    public final int hashCode() {
        return OooO0o0(this.f30419OooO00o);
    }

    @NotNull
    public final String toString() {
        return OooO0oO(this.f30419OooO00o);
    }
}
