package p145o00Oo0;

import OooO00o.OooO00o;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000OO extends o000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<o00000O0> f32100OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f32101OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final List<Float> f32102OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f32103OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f32104OooO0oo;

    public o000OO(List list, long j, long j2, int i) {
        this.f32100OooO0Oo = list;
        this.f32101OooO0o = j;
        this.f32103OooO0oO = j2;
        this.f32104OooO0oo = i;
    }

    @Override // p145o00Oo0.o000O
    @NotNull
    public final Shader OooO0O0(long j) {
        int i;
        int[] iArr;
        int i2;
        char c;
        float fFloatValue;
        float[] floatArray;
        Shader.TileMode tileModeOooO0O0;
        float fOooO0Oo = (OooO.OooO0OO(this.f32101OooO0o) > Float.POSITIVE_INFINITY ? 1 : (OooO.OooO0OO(this.f32101OooO0o) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? OooOo00.OooO0Oo(j) : OooO.OooO0OO(this.f32101OooO0o);
        float fOooO0O0 = (OooO.OooO0Oo(this.f32101OooO0o) > Float.POSITIVE_INFINITY ? 1 : (OooO.OooO0Oo(this.f32101OooO0o) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? OooOo00.OooO0O0(j) : OooO.OooO0Oo(this.f32101OooO0o);
        float fOooO0Oo2 = (OooO.OooO0OO(this.f32103OooO0oO) > Float.POSITIVE_INFINITY ? 1 : (OooO.OooO0OO(this.f32103OooO0oO) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? OooOo00.OooO0Oo(j) : OooO.OooO0OO(this.f32103OooO0oO);
        float fOooO0O1 = (OooO.OooO0Oo(this.f32103OooO0oO) > Float.POSITIVE_INFINITY ? 1 : (OooO.OooO0Oo(this.f32103OooO0oO) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? OooOo00.OooO0O0(j) : OooO.OooO0Oo(this.f32103OooO0oO);
        List<o00000O0> colors = this.f32100OooO0Oo;
        List<Float> list = this.f32102OooO0o0;
        long jOooO00o = OooOO0.OooO00o(fOooO0Oo, fOooO0O0);
        long jOooO00o2 = OooOO0.OooO00o(fOooO0Oo2, fOooO0O1);
        int i3 = this.f32104OooO0oo;
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (list == null) {
            if (colors.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (colors.size() != list.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int lastIndex = CollectionsKt.getLastIndex(colors);
            i = 0;
            for (int i4 = 1; i4 < lastIndex; i4++) {
                if (o00000O0.OooO0o0(colors.get(i4).f32070OooO00o) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    i++;
                }
            }
        }
        float fOooO0OO = OooO.OooO0OO(jOooO00o);
        float fOooO0Oo3 = OooO.OooO0Oo(jOooO00o);
        float fOooO0OO2 = OooO.OooO0OO(jOooO00o2);
        float fOooO0Oo4 = OooO.OooO0Oo(jOooO00o2);
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr2 = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr2[i5] = o00000OO.OooO0oO(colors.get(i5).f32070OooO00o);
            }
            iArr = iArr2;
        } else {
            int[] iArr3 = new int[colors.size() + i];
            int lastIndex2 = CollectionsKt.getLastIndex(colors);
            int size2 = colors.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                long j2 = colors.get(i7).f32070OooO00o;
                if (!(o00000O0.OooO0o0(j2) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    iArr3[i6] = o00000OO.OooO0oO(j2);
                    i2 = i6 + 1;
                } else if (i7 == 0) {
                    i2 = i6 + 1;
                    iArr3[i6] = o00000OO.OooO0oO(o00000O0.OooO0OO(colors.get(1).f32070OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else {
                    if (i7 == lastIndex2) {
                        i2 = i6 + 1;
                        iArr3[i6] = o00000OO.OooO0oO(o00000O0.OooO0OO(colors.get(i7 - 1).f32070OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                    } else {
                        int i8 = i6 + 1;
                        iArr3[i6] = o00000OO.OooO0oO(o00000O0.OooO0OO(colors.get(i7 - 1).f32070OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                        iArr3[i8] = o00000OO.OooO0oO(o00000O0.OooO0OO(colors.get(i7 + 1).f32070OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                        i6 = i8 + 1;
                    }
                }
                i6 = i2;
            }
            iArr = iArr3;
        }
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            floatArray = list != null ? CollectionsKt.toFloatArray(list) : null;
        } else {
            float[] fArr = new float[colors.size() + i];
            if (list != null) {
                c = 0;
                fFloatValue = list.get(0).floatValue();
            } else {
                c = 0;
                fFloatValue = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            fArr[c] = fFloatValue;
            int lastIndex3 = CollectionsKt.getLastIndex(colors);
            int i9 = 1;
            for (int i10 = 1; i10 < lastIndex3; i10++) {
                long j3 = colors.get(i10).f32070OooO00o;
                float fFloatValue2 = list != null ? list.get(i10).floatValue() : i10 / CollectionsKt.getLastIndex(colors);
                int i11 = i9 + 1;
                fArr[i9] = fFloatValue2;
                if (o00000O0.OooO0o0(j3) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    i9 = i11 + 1;
                    fArr[i11] = fFloatValue2;
                } else {
                    i9 = i11;
                }
            }
            fArr[i9] = list != null ? list.get(CollectionsKt.getLastIndex(colors)).floatValue() : 1.0f;
            floatArray = fArr;
        }
        if (i3 == 0) {
            tileModeOooO0O0 = Shader.TileMode.CLAMP;
        } else if (i3 == 1) {
            tileModeOooO0O0 = Shader.TileMode.REPEAT;
        } else {
            tileModeOooO0O0 = i3 == 2 ? Shader.TileMode.MIRROR : (!(i3 == 3) || Build.VERSION.SDK_INT < 31) ? Shader.TileMode.CLAMP : o00O000o.f32134OooO00o.OooO0O0();
        }
        return new LinearGradient(fOooO0OO, fOooO0Oo3, fOooO0OO2, fOooO0Oo4, iArr, floatArray, tileModeOooO0O0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OO)) {
            return false;
        }
        o000OO o000oo2 = (o000OO) obj;
        if (Intrinsics.areEqual(this.f32100OooO0Oo, o000oo2.f32100OooO0Oo) && Intrinsics.areEqual(this.f32102OooO0o0, o000oo2.f32102OooO0o0) && OooO.OooO00o(this.f32101OooO0o, o000oo2.f32101OooO0o) && OooO.OooO00o(this.f32103OooO0oO, o000oo2.f32103OooO0oO)) {
            return this.f32104OooO0oo == o000oo2.f32104OooO0oo;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f32100OooO0Oo.hashCode() * 31;
        List<Float> list = this.f32102OooO0o0;
        return ((OooO.OooO0o0(this.f32103OooO0oO) + ((OooO.OooO0o0(this.f32101OooO0o) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31) + this.f32104OooO0oo;
    }

    @NotNull
    public final String toString() {
        String string;
        String str;
        String string2 = "";
        if (OooOO0.OooO0O0(this.f32101OooO0o)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("start=");
            sbOooO0o0.append((Object) OooO.OooO(this.f32101OooO0o));
            sbOooO0o0.append(", ");
            string = sbOooO0o0.toString();
        } else {
            string = "";
        }
        if (OooOO0.OooO0O0(this.f32103OooO0oO)) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("end=");
            sbOooO0o1.append((Object) OooO.OooO(this.f32103OooO0oO));
            sbOooO0o1.append(", ");
            string2 = sbOooO0o1.toString();
        }
        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("LinearGradient(colors=");
        sbOooO0o2.append(this.f32100OooO0Oo);
        sbOooO0o2.append(", stops=");
        sbOooO0o2.append(this.f32102OooO0o0);
        sbOooO0o2.append(", ");
        sbOooO0o2.append(string);
        sbOooO0o2.append(string2);
        sbOooO0o2.append("tileMode=");
        int i = this.f32104OooO0oo;
        if (i == 0) {
            str = "Clamp";
        } else {
            if (i == 1) {
                str = "Repeated";
            } else {
                if (i == 2) {
                    str = "Mirror";
                } else {
                    str = i == 3 ? "Decal" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
            }
        }
        sbOooO0o2.append((Object) str);
        sbOooO0o2.append(')');
        return sbOooO0o2.toString();
    }
}
