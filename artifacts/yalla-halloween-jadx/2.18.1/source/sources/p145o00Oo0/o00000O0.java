package p145o00Oo0;

import Oooo000.o00oO0o;
import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p167o00Ooo.OooO;
import p167o00Ooo.OooOO0O;
import p167o00Ooo.OooOOO0;
import p167o00Ooo.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f32062OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f32063OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f32064OooO0OO = o00000OO.OooO0OO(4278190080L);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f32065OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final long f32066OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f32067OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final long f32068OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final long f32069OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f32070OooO00o;

    public static final class OooO00o {
    }

    static {
        o00000OO.OooO0OO(4282664004L);
        o00000OO.OooO0OO(4287137928L);
        f32065OooO0Oo = o00000OO.OooO0OO(4291611852L);
        f32067OooO0o0 = o00000OO.OooO0OO(4294967295L);
        f32066OooO0o = o00000OO.OooO0OO(4294901760L);
        o00000OO.OooO0OO(4278255360L);
        f32068OooO0oO = o00000OO.OooO0OO(4278190335L);
        o00000OO.OooO0OO(4294967040L);
        o00000OO.OooO0OO(4278255615L);
        o00000OO.OooO0OO(4294902015L);
        f32069OooO0oo = o00000OO.OooO0O0(0);
        OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
        f32062OooO = o00000OO.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOOO0.f32586OooOo00);
    }

    public /* synthetic */ o00000O0(long j) {
        this.f32070OooO00o = j;
    }

    public static final float OooO(long j) {
        if (ULong.m674constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        short sM674constructorimpl = (short) ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 48) & 65535);
        o0000Ooo.OooO00o oooO00o = o0000Ooo.f32077Oooo0o;
        return o0000Ooo.OooO0O0(sM674constructorimpl);
    }

    public static final /* synthetic */ o00000O0 OooO00o(long j) {
        return new o00000O0(j);
    }

    public static final long OooO0O0(long j, @NotNull OooO colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        if (Intrinsics.areEqual(colorSpace, OooO0oO(j))) {
            return j;
        }
        OooOOOO oooOOOOOooO0Oo = OooOO0O.OooO0Oo(OooO0oO(j), colorSpace, 2);
        float[] fArrOooO0o0 = o00000OO.OooO0o0(j);
        oooOOOOOooO0Oo.OooO00o(fArrOooO0o0);
        return o00000OO.OooO00o(fArrOooO0o0[0], fArrOooO0o0[1], fArrOooO0o0[2], fArrOooO0o0[3], colorSpace);
    }

    public static long OooO0OO(long j, float f) {
        return o00000OO.OooO00o(OooO(j), OooO0oo(j), OooO0o(j), f, OooO0oO(j));
    }

    public static final boolean OooO0Oo(long j, long j2) {
        return j == j2;
    }

    public static final float OooO0o(long j) {
        if (ULong.m674constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        short sM674constructorimpl = (short) ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 16) & 65535);
        o0000Ooo.OooO00o oooO00o = o0000Ooo.f32077Oooo0o;
        return o0000Ooo.OooO0O0(sM674constructorimpl);
    }

    public static final float OooO0o0(long j) {
        float fUlongToDouble;
        float f;
        if (ULong.m674constructorimpl(63 & j) == 0) {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return fUlongToDouble / f;
    }

    @NotNull
    public static final OooO OooO0oO(long j) {
        OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
        return OooOOO0.f32587OooOo0O[(int) ULong.m674constructorimpl(j & 63)];
    }

    public static final float OooO0oo(long j) {
        if (ULong.m674constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        short sM674constructorimpl = (short) ULong.m674constructorimpl(ULong.m674constructorimpl(j >>> 32) & 65535);
        o0000Ooo.OooO00o oooO00o = o0000Ooo.f32077Oooo0o;
        return o0000Ooo.OooO0O0(sM674constructorimpl);
    }

    @NotNull
    public static String OooOO0(long j) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Color(");
        sbOooO0o0.append(OooO(j));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0oo(j));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0o(j));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0o0(j));
        sbOooO0o0.append(", ");
        return o00oO0o.OooO0O0(sbOooO0o0, OooO0oO(j).f32556OooO00o, ')');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00000O0) && this.f32070OooO00o == ((o00000O0) obj).f32070OooO00o;
    }

    public final int hashCode() {
        return ULong.m686hashCodeimpl(this.f32070OooO00o);
    }

    @NotNull
    public final String toString() {
        return OooOO0(this.f32070OooO00o);
    }
}
