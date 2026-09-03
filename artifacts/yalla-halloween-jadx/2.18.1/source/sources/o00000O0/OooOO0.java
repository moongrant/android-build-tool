package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26908OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f26909OooO0o0 = new OooOO0(RangesKt__RangesKt.rangeTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f26910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ClosedFloatingPointRange<Float> f26911OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f26912OooO0OO;

    public static final class OooO00o {
    }

    public OooOO0(ClosedFloatingPointRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f26910OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f26911OooO0O0 = range;
        this.f26912OooO0OO = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO1 = (OooOO0) obj;
        return ((this.f26910OooO00o > oooOO1.f26910OooO00o ? 1 : (this.f26910OooO00o == oooOO1.f26910OooO00o ? 0 : -1)) == 0) && Intrinsics.areEqual(this.f26911OooO0O0, oooOO1.f26911OooO0O0) && this.f26912OooO0OO == oooOO1.f26912OooO0OO;
    }

    public final int hashCode() {
        return ((this.f26911OooO0O0.hashCode() + (Float.floatToIntBits(this.f26910OooO00o) * 31)) * 31) + this.f26912OooO0OO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ProgressBarRangeInfo(current=");
        sbOooO0o0.append(this.f26910OooO00o);
        sbOooO0o0.append(", range=");
        sbOooO0o0.append(this.f26911OooO0O0);
        sbOooO0o0.append(", steps=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f26912OooO0OO, ')');
    }

    public OooOO0(float f, @NotNull ClosedFloatingPointRange<Float> range, int i) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f26910OooO00o = f;
        this.f26911OooO0O0 = range;
        this.f26912OooO0OO = i;
    }
}
