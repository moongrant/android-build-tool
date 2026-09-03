package p028Oooo0o0;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O000 f2029OooO00o = new o00O000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOOOO f2030OooO0O0 = new OooOOOO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f2031OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f2032OooO0Oo = new OooOo00();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f2034OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f2033OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final OooOOO0 f2035OooO0oO = new OooOOO0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final OooOO0O f2036OooO0oo = new OooOO0O();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f2028OooO = new OooOO0();

    @Stable
    public interface OooO extends OooO0o, OooOo {
    }

    public static final class OooO00o implements OooOo {
        @Override // Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return 0;
        }

        @Override // Oooo0o0.o00O000.OooOo
        public final void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            o00O000.f2029OooO00o.OooO0Oo(i, sizes, outPositions, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    public static final class OooO0O0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f2037OooO00o = 0;

        @Override // Oooo0o0.o00O000.OooO0o, Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return this.f2037OooO00o;
        }

        @Override // Oooo0o0.o00O000.OooO0o
        public final void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                o00O000.f2029OooO00o.OooO0O0(i, sizes, outPositions, false);
            } else {
                o00O000.f2029OooO00o.OooO0O0(i, sizes, outPositions, true);
            }
        }

        @Override // Oooo0o0.o00O000.OooOo
        public final void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            o00O000.f2029OooO00o.OooO0O0(i, sizes, outPositions, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class OooO0OO implements OooO0o {
        @Override // Oooo0o0.o00O000.OooO0o, Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return 0;
        }

        @Override // Oooo0o0.o00O000.OooO0o
        public final void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                o00O000.f2029OooO00o.OooO0Oo(i, sizes, outPositions, false);
            } else {
                o00O000.f2029OooO00o.OooO0OO(sizes, outPositions, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#End";
        }
    }

    @Stable
    public interface OooO0o {
        float OooO00o();

        void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2);
    }

    public static final class OooOO0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f2038OooO00o = 0;

        @Override // Oooo0o0.o00O000.OooO0o, Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return this.f2038OooO00o;
        }

        @Override // Oooo0o0.o00O000.OooO0o
        public final void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                o00O000.f2029OooO00o.OooO0o0(i, sizes, outPositions, false);
            } else {
                o00O000.f2029OooO00o.OooO0o0(i, sizes, outPositions, true);
            }
        }

        @Override // Oooo0o0.o00O000.OooOo
        public final void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            o00O000.f2029OooO00o.OooO0o0(i, sizes, outPositions, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public static final class OooOO0O implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f2039OooO00o = 0;

        @Override // Oooo0o0.o00O000.OooO0o, Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return this.f2039OooO00o;
        }

        @Override // Oooo0o0.o00O000.OooO0o
        public final void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                o00O000.f2029OooO00o.OooO0o(i, sizes, outPositions, false);
            } else {
                o00O000.f2029OooO00o.OooO0o(i, sizes, outPositions, true);
            }
        }

        @Override // Oooo0o0.o00O000.OooOo
        public final void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            o00O000.f2029OooO00o.OooO0o(i, sizes, outPositions, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @Immutable
    public static final class OooOOO implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f2040OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f2041OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Function2<Integer, LayoutDirection, Integer> f2042OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f2043OooO0Oo;

        public OooOOO(float f, boolean z, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this.f2040OooO00o = f;
            this.f2041OooO0O0 = z;
            this.f2042OooO0OO = function2;
            this.f2043OooO0Oo = f;
        }

        @Override // Oooo0o0.o00O000.OooO0o, Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return this.f2043OooO0Oo;
        }

        @Override // Oooo0o0.o00O000.OooO0o
        public final void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            int i2;
            int iMin;
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (sizes.length == 0) {
                return;
            }
            int iOoooooO = oooO.OoooooO(this.f2040OooO00o);
            boolean z = this.f2041OooO0O0 && layoutDirection == LayoutDirection.Rtl;
            o00O000 o00o001 = o00O000.f2029OooO00o;
            if (z) {
                i2 = 0;
                iMin = 0;
                for (int length = sizes.length - 1; -1 < length; length--) {
                    int i3 = sizes[length];
                    outPositions[length] = Math.min(i2, i - i3);
                    iMin = Math.min(iOoooooO, (i - outPositions[length]) - i3);
                    i2 = outPositions[length] + i3 + iMin;
                }
            } else {
                int length2 = sizes.length;
                int i4 = 0;
                i2 = 0;
                iMin = 0;
                int i5 = 0;
                while (i4 < length2) {
                    int i6 = sizes[i4];
                    outPositions[i5] = Math.min(i2, i - i6);
                    int iMin2 = Math.min(iOoooooO, (i - outPositions[i5]) - i6);
                    int i7 = outPositions[i5] + i6 + iMin2;
                    i4++;
                    i5++;
                    iMin = iMin2;
                    i2 = i7;
                }
            }
            int i8 = i2 - iMin;
            Function2<Integer, LayoutDirection, Integer> function2 = this.f2042OooO0OO;
            if (function2 == null || i8 >= i) {
                return;
            }
            int iIntValue = function2.invoke(Integer.valueOf(i - i8), layoutDirection).intValue();
            int length3 = outPositions.length;
            for (int i9 = 0; i9 < length3; i9++) {
                outPositions[i9] = outPositions[i9] + iIntValue;
            }
        }

        @Override // Oooo0o0.o00O000.OooOo
        public final void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            OooO0O0(oooO, i, sizes, LayoutDirection.Ltr, outPositions);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO)) {
                return false;
            }
            OooOOO oooOOO = (OooOOO) obj;
            return o0000O0O.OooOOO0.OooO00o(this.f2040OooO00o, oooOOO.f2040OooO00o) && this.f2041OooO0O0 == oooOOO.f2041OooO0O0 && Intrinsics.areEqual(this.f2042OooO0OO, oooOOO.f2042OooO0OO);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final int hashCode() {
            int iFloatToIntBits = Float.floatToIntBits(this.f2040OooO00o) * 31;
            boolean z = this.f2041OooO0O0;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iFloatToIntBits + r1) * 31;
            Function2<Integer, LayoutDirection, Integer> function2 = this.f2042OooO0OO;
            return i + (function2 == null ? 0 : function2.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2041OooO0O0 ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) o0000O0O.OooOOO0.OooO0O0(this.f2040OooO00o));
            sb.append(", ");
            sb.append(this.f2042OooO0OO);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class OooOOO0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f2044OooO00o = 0;

        @Override // Oooo0o0.o00O000.OooO0o, Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return this.f2044OooO00o;
        }

        @Override // Oooo0o0.o00O000.OooO0o
        public final void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                o00O000.f2029OooO00o.OooO0oO(i, sizes, outPositions, false);
            } else {
                o00O000.f2029OooO00o.OooO0oO(i, sizes, outPositions, true);
            }
        }

        @Override // Oooo0o0.o00O000.OooOo
        public final void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            o00O000.f2029OooO00o.OooO0oO(i, sizes, outPositions, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public static final class OooOOOO implements OooO0o {
        @Override // Oooo0o0.o00O000.OooO0o, Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return 0;
        }

        @Override // Oooo0o0.o00O000.OooO0o
        public final void OooO0O0(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                o00O000.f2029OooO00o.OooO0OO(sizes, outPositions, false);
            } else {
                o00O000.f2029OooO00o.OooO0Oo(i, sizes, outPositions, true);
            }
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Start";
        }
    }

    @Stable
    public interface OooOo {
        float OooO00o();

        void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] iArr, @NotNull int[] iArr2);
    }

    public static final class OooOo00 implements OooOo {
        @Override // Oooo0o0.o00O000.OooOo
        public final float OooO00o() {
            return 0;
        }

        @Override // Oooo0o0.o00O000.OooOo
        public final void OooO0OO(@NotNull o0000O0O.OooO oooO, int i, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            o00O000.f2029OooO00o.OooO0OO(sizes, outPositions, false);
        }

        @NotNull
        public final String toString() {
            return "Arrangement#Top";
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo000 f2045Oooo0o = new Oooo000();

        public Oooo000() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
            int iIntValue = num.intValue();
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            int i = o00OO0O0.f4169OooO00o;
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            return Integer.valueOf(MathKt.roundToInt((1 + (layoutDirection2 != LayoutDirection.Ltr ? (-1.0f) * (-1) : -1.0f)) * ((iIntValue + 0) / 2.0f)));
        }
    }

    @NotNull
    public final OooO OooO00o() {
        return f2033OooO0o;
    }

    public final void OooO0O0(int i, @NotNull int[] size, @NotNull int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f = (i - i3) / 2;
        if (!z) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                outPosition[i5] = MathKt.roundToInt(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = size[length2];
            outPosition[length2] = MathKt.roundToInt(f);
            f += i7;
        }
    }

    public final void OooO0OO(@NotNull int[] size, @NotNull int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i = 0;
        if (!z) {
            int length = size.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = size[i];
                outPosition[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i5 = size[length2];
            outPosition[length2] = i;
            i += i5;
        }
    }

    public final void OooO0Oo(int i, @NotNull int[] size, @NotNull int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = size.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = size[i2];
                outPosition[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = size[length2];
            outPosition[length2] = i5;
            i5 += i8;
        }
    }

    public final void OooO0o(int i, @NotNull int[] size, @NotNull int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        int length = size.length;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float length2 = length > 1 ? (i - i3) / (size.length - 1) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (z) {
            for (int length3 = size.length - 1; -1 < length3; length3--) {
                int i5 = size[length3];
                outPosition[length3] = MathKt.roundToInt(f);
                f += i5 + length2;
            }
            return;
        }
        int length4 = size.length;
        int i6 = 0;
        while (i2 < length4) {
            int i7 = size[i2];
            outPosition[i6] = MathKt.roundToInt(f);
            f += i7 + length2;
            i2++;
            i6++;
        }
    }

    public final void OooO0o0(int i, @NotNull int[] size, @NotNull int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = (size.length == 0) ^ true ? (i - i3) / size.length : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f = length / 2;
        if (z) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i5 = size[length2];
                outPosition[length2] = MathKt.roundToInt(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = size.length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = size[i2];
            outPosition[i6] = MathKt.roundToInt(f);
            f += i7 + length;
            i2++;
            i6++;
        }
    }

    public final void OooO0oO(int i, @NotNull int[] size, @NotNull int[] outPosition, boolean z) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = (i - i3) / (size.length + 1);
        if (z) {
            float f = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i5 = size[length2];
                outPosition[length2] = MathKt.roundToInt(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = size.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = size[i2];
            outPosition[i6] = MathKt.roundToInt(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    @Stable
    @NotNull
    public final OooO OooO0oo(float f) {
        return new OooOOO(f, true, Oooo000.f2045Oooo0o, null);
    }
}
