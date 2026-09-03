package o00O0O;

import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final C0334OooO00o f30396OooO00o = new C0334OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f30397OooO0O0 = OooO0O0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: o00O0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0334OooO00o {
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final float OooO0O0(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0OO(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int OooO0Oo(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public static String OooO0o0(long j) {
        if (OooO0O0(j) == OooO0OO(j)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CornerRadius.circular(");
            sbOooO0o0.append(OooO0OO.OooO00o(OooO0O0(j)));
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("CornerRadius.elliptical(");
        sbOooO0o1.append(OooO0OO.OooO00o(OooO0O0(j)));
        sbOooO0o1.append(", ");
        sbOooO0o1.append(OooO0OO.OooO00o(OooO0OO(j)));
        sbOooO0o1.append(')');
        return sbOooO0o1.toString();
    }
}
