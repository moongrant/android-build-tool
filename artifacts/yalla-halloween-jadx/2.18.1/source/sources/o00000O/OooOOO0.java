package o00000O;

import Oooo000.o000O00O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0O f26784OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f26785OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f26786OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f26787OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f26788OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f26789OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f26790OooO0oO;

    public OooOOO0(@NotNull OooOO0O paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        this.f26784OooO00o = paragraph;
        this.f26785OooO0O0 = i;
        this.f26786OooO0OO = i2;
        this.f26787OooO0Oo = i3;
        this.f26789OooO0o0 = i4;
        this.f26788OooO0o = f;
        this.f26790OooO0oO = f2;
    }

    @NotNull
    public final o00O0O.OooOO0O OooO00o(@NotNull o00O0O.OooOO0O oooOO0O) {
        Intrinsics.checkNotNullParameter(oooOO0O, "<this>");
        return oooOO0O.OooO0Oo(o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f26788OooO0o));
    }

    public final int OooO0O0(int i) {
        return RangesKt.coerceIn(i, this.f26785OooO0O0, this.f26786OooO0OO) - this.f26785OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return Intrinsics.areEqual(this.f26784OooO00o, oooOOO0.f26784OooO00o) && this.f26785OooO0O0 == oooOOO0.f26785OooO0O0 && this.f26786OooO0OO == oooOOO0.f26786OooO0OO && this.f26787OooO0Oo == oooOOO0.f26787OooO0Oo && this.f26789OooO0o0 == oooOOO0.f26789OooO0o0 && Intrinsics.areEqual((Object) Float.valueOf(this.f26788OooO0o), (Object) Float.valueOf(oooOOO0.f26788OooO0o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f26790OooO0oO), (Object) Float.valueOf(oooOOO0.f26790OooO0oO));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f26790OooO0oO) + o000O00O.OooO00o(this.f26788OooO0o, ((((((((this.f26784OooO00o.hashCode() * 31) + this.f26785OooO0O0) * 31) + this.f26786OooO0OO) * 31) + this.f26787OooO0Oo) * 31) + this.f26789OooO0o0) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ParagraphInfo(paragraph=");
        sbOooO0o0.append(this.f26784OooO00o);
        sbOooO0o0.append(", startIndex=");
        sbOooO0o0.append(this.f26785OooO0O0);
        sbOooO0o0.append(", endIndex=");
        sbOooO0o0.append(this.f26786OooO0OO);
        sbOooO0o0.append(", startLineIndex=");
        sbOooO0o0.append(this.f26787OooO0Oo);
        sbOooO0o0.append(", endLineIndex=");
        sbOooO0o0.append(this.f26789OooO0o0);
        sbOooO0o0.append(", top=");
        sbOooO0o0.append(this.f26788OooO0o);
        sbOooO0o0.append(", bottom=");
        return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f26790OooO0oO, ')');
    }
}
