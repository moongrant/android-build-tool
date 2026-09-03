package p028Oooo0o0;

import OooO00o.OooO00o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f2215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f2216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o00O0O0 f2217OooO0OO;

    public o0oO0Ooo() {
        this(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, null, 7, null);
    }

    public o0oO0Ooo(float f, boolean z, o00O0O0 o00o0o0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f2215OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f2216OooO0O0 = true;
        this.f2217OooO0OO = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0oO0Ooo)) {
            return false;
        }
        o0oO0Ooo o0oo0ooo2 = (o0oO0Ooo) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f2215OooO00o), (Object) Float.valueOf(o0oo0ooo2.f2215OooO00o)) && this.f2216OooO0O0 == o0oo0ooo2.f2216OooO0O0 && Intrinsics.areEqual(this.f2217OooO0OO, o0oo0ooo2.f2217OooO0OO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f2215OooO00o) * 31;
        boolean z = this.f2216OooO0O0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iFloatToIntBits + r1) * 31;
        o00O0O0 o00o0o0 = this.f2217OooO0OO;
        return i + (o00o0o0 == null ? 0 : o00o0o0.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RowColumnParentData(weight=");
        sbOooO0o0.append(this.f2215OooO00o);
        sbOooO0o0.append(", fill=");
        sbOooO0o0.append(this.f2216OooO0O0);
        sbOooO0o0.append(", crossAxisAlignment=");
        sbOooO0o0.append(this.f2217OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
