package p418o0Oo0oo;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.o000oOoO;
import o00O0O.OooO;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {
    public static final boolean OooO00o(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        return (o0oo0oo2.OooO0OO() || o0oo0oo2.f39748OooO0oO || !o0oo0oo2.f39745OooO0Oo) ? false : true;
    }

    public static final boolean OooO0O0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        return !o0oo0oo2.f39748OooO0oO && o0oo0oo2.f39745OooO0Oo;
    }

    public static final boolean OooO0OO(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        return (o0oo0oo2.OooO0OO() || !o0oo0oo2.f39748OooO0oO || o0oo0oo2.f39745OooO0Oo) ? false : true;
    }

    public static final boolean OooO0Oo(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        return o0oo0oo2.f39748OooO0oO && !o0oo0oo2.f39745OooO0Oo;
    }

    public static final boolean OooO0o(@NotNull o0Oo0oo isOutOfBounds, long j, long j2) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        if (!(isOutOfBounds.f39749OooO0oo == 1)) {
            return OooO0o0(isOutOfBounds, j);
        }
        long j3 = isOutOfBounds.f39744OooO0OO;
        float fOooO0OO = OooO.OooO0OO(j3);
        float fOooO0Oo = OooO.OooO0Oo(j3);
        return fOooO0OO < (-OooOo00.OooO0Oo(j2)) || fOooO0OO > OooOo00.OooO0Oo(j2) + ((float) ((int) (j >> 32))) || fOooO0Oo < (-OooOo00.OooO0O0(j2)) || fOooO0Oo > OooOo00.OooO0O0(j2) + ((float) o000oOoO.OooO0O0(j));
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean OooO0o0(@NotNull o0Oo0oo isOutOfBounds, long j) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        long j2 = isOutOfBounds.f39744OooO0OO;
        float fOooO0OO = OooO.OooO0OO(j2);
        float fOooO0Oo = OooO.OooO0Oo(j2);
        return fOooO0OO < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || fOooO0OO > ((float) ((int) (j >> 32))) || fOooO0Oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || fOooO0Oo > ((float) o000oOoO.OooO0O0(j));
    }

    public static final long OooO0oO(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        return OooO0oo(o0oo0oo2, false);
    }

    public static final long OooO0oo(o0Oo0oo o0oo0oo2, boolean z) {
        long jOooO0o = OooO.OooO0o(o0oo0oo2.f39744OooO0OO, o0oo0oo2.f39746OooO0o);
        if (z || !o0oo0oo2.OooO0OO()) {
            return jOooO0o;
        }
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        return OooO.f30392OooO0OO;
    }
}
