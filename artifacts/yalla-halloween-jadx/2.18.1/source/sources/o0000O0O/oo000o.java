package o0000O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27328OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f27329OooO0OO = o00oO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27330OooO00o;

    public static final class OooO00o {
    }

    public static long OooO00o(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = OooO0O0(j);
        }
        if ((i & 2) != 0) {
            f2 = OooO0OO(j);
        }
        return o00oO0o.OooO00o(f, f2);
    }

    public static final float OooO0O0(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0OO(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    @Stable
    public static final long OooO0Oo(long j, long j2) {
        return o00oO0o.OooO00o(OooO0O0(j) - OooO0O0(j2), OooO0OO(j) - OooO0OO(j2));
    }

    @Stable
    public static final long OooO0o0(long j, long j2) {
        return o00oO0o.OooO00o(OooO0O0(j2) + OooO0O0(j), OooO0OO(j2) + OooO0OO(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oo000o) && this.f27330OooO00o == ((oo000o) obj).f27330OooO00o;
    }

    public final int hashCode() {
        long j = this.f27330OooO00o;
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public final String toString() {
        long j = this.f27330OooO00o;
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
        sbOooO00o.append(OooO0O0(j));
        sbOooO00o.append(", ");
        sbOooO00o.append(OooO0OO(j));
        sbOooO00o.append(") px/sec");
        return sbOooO00o.toString();
    }
}
