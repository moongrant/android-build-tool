package p028Oooo0o0;

import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.foundation.layout.SizeMode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o0000O0O.OooO;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
import o0000O0O.OooO0o;
import o0O0O00.OooOOOO;
import o0O0O00.OooOo00;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00OOO {

    public static final class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ LayoutOrientation f2133OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ float f2134OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ SizeMode f2135OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function5<Integer, int[], LayoutDirection, OooO, int[], Unit> f2136OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00O0O0 f2137OooO0o0;

        /* JADX INFO: renamed from: Oooo0o0.o0O00OOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0020OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ int f2138Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ List<o0O0O00> f2139Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o000O000[] f2140Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Function5<Integer, int[], LayoutDirection, OooO, int[], Unit> f2141Oooo0oo;

            /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
            public final /* synthetic */ o0oO0Ooo[] f2142OoooO;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ int[] f2143OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ o00000O0 f2144OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public final /* synthetic */ LayoutOrientation f2145OoooO0O;

            /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
            public final /* synthetic */ o00O0O0 f2146OoooOO0;

            /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f2147OoooOOO;

            /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
            public final /* synthetic */ int f2148o000oOoO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0020OooO00o(List<? extends o0O0O00> list, o000O000[] o000o000Arr, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super OooO, ? super int[], Unit> function5, int i, o00000O0 o00000o1, int[] iArr, LayoutOrientation layoutOrientation, o0oO0Ooo[] o0oo0oooArr, o00O0O0 o00o0o0, int i2, Ref.IntRef intRef) {
                super(1);
                this.f2139Oooo0o = list;
                this.f2140Oooo0oO = o000o000Arr;
                this.f2141Oooo0oo = function5;
                this.f2138Oooo = i;
                this.f2144OoooO00 = o00000o1;
                this.f2143OoooO0 = iArr;
                this.f2145OoooO0O = layoutOrientation;
                this.f2142OoooO = o0oo0oooArr;
                this.f2146OoooOO0 = o00o0o0;
                this.f2148o000oOoO = i2;
                this.f2147OoooOOO = intRef;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                int size = this.f2139Oooo0o.size();
                int[] iArr = new int[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    o000O000 o000o001 = this.f2140Oooo0oO[i2];
                    Intrinsics.checkNotNull(o000o001);
                    iArr[i2] = o0O00OOO.OooO0OO(o000o001, this.f2145OoooO0O);
                }
                this.f2141Oooo0oo.invoke(Integer.valueOf(this.f2138Oooo), iArr, this.f2144OoooO00.getLayoutDirection(), this.f2144OoooO00, this.f2143OoooO0);
                o000O000[] o000o000Arr = this.f2140Oooo0oO;
                o0oO0Ooo[] o0oo0oooArr = this.f2142OoooO;
                o00O0O0 o00o0o0 = this.f2146OoooOO0;
                int i3 = this.f2148o000oOoO;
                LayoutOrientation layoutOrientation = this.f2145OoooO0O;
                o00000O0 o00000o1 = this.f2144OoooO00;
                Ref.IntRef intRef = this.f2147OoooOOO;
                int[] iArr2 = this.f2143OoooO0;
                int length = o000o000Arr.length;
                int i4 = 0;
                while (i < length) {
                    o000O000 o000o002 = o000o000Arr[i];
                    int i5 = i4 + 1;
                    Intrinsics.checkNotNull(o000o002);
                    o0oO0Ooo o0oo0ooo2 = o0oo0oooArr[i4];
                    o00O0O0 o00o0o1 = o0oo0ooo2 != null ? o0oo0ooo2.f2217OooO0OO : null;
                    if (o00o0o1 == null) {
                        o00o0o1 = o00o0o0;
                    }
                    int iOooO0O0 = i3 - o0O00OOO.OooO0O0(o000o002, layoutOrientation);
                    o000O000[] o000o000Arr2 = o000o000Arr;
                    LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                    o0oO0Ooo[] o0oo0oooArr2 = o0oo0oooArr;
                    LayoutDirection layoutDirection = layoutOrientation == layoutOrientation2 ? LayoutDirection.Ltr : o00000o1.getLayoutDirection();
                    o00O0O0 o00o0o2 = o00o0o0;
                    int i6 = intRef.element;
                    int iOooO00o = o00o0o1.OooO00o(iOooO0O0, layoutDirection, o000o002);
                    if (layoutOrientation == layoutOrientation2) {
                        int i7 = iArr2[i4];
                        o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35268OooO00o;
                        layout.OooO0OO(o000o002, i7, iOooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    } else {
                        int i8 = iArr2[i4];
                        o000O000.OooO00o.C0363OooO00o c0363OooO00o2 = o000O000.OooO00o.f35268OooO00o;
                        layout.OooO0OO(o000o002, iOooO00o, i8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    }
                    i++;
                    o0oo0oooArr = o0oo0oooArr2;
                    i4 = i5;
                    o000o000Arr = o000o000Arr2;
                    o00o0o0 = o00o0o2;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(LayoutOrientation layoutOrientation, float f, SizeMode sizeMode, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super OooO, ? super int[], Unit> function5, o00O0O0 o00o0o0) {
            this.f2133OooO00o = layoutOrientation;
            this.f2134OooO0O0 = f;
            this.f2135OooO0OO = sizeMode;
            this.f2136OooO0Oo = function5;
            this.f2137OooO0o0 = o00o0o0;
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o00000O0 measure, @NotNull List<? extends o0O0O00> list, long j) {
            String str;
            int iCoerceAtMost;
            List<? extends o0O0O00> measurables = list;
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            LayoutOrientation layoutOrientation = this.f2133OooO00o;
            LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
            int iOooOO0 = layoutOrientation == layoutOrientation2 ? OooO0O0.OooOO0(j) : OooO0O0.OooO(j);
            int iOooO0oo = layoutOrientation == layoutOrientation2 ? OooO0O0.OooO0oo(j) : OooO0O0.OooO0oO(j);
            int iOooO = layoutOrientation == layoutOrientation2 ? OooO0O0.OooO(j) : OooO0O0.OooOO0(j);
            int iOooO0oO = layoutOrientation == layoutOrientation2 ? OooO0O0.OooO0oO(j) : OooO0O0.OooO0oo(j);
            int iOoooooO = measure.OoooooO(this.f2134OooO0O0);
            o000O000[] o000o000Arr = new o000O000[list.size()];
            int size = list.size();
            o0oO0Ooo[] o0oo0oooArr = new o0oO0Ooo[size];
            for (int i = 0; i < size; i++) {
                o0oo0oooArr[i] = o0O00OOO.OooO0Oo(measurables.get(i));
            }
            int size2 = list.size();
            int i2 = 0;
            int iMax = 0;
            int i3 = 0;
            float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            int i4 = 0;
            int iMin = 0;
            while (true) {
                str = "orientation";
                if (i2 >= size2) {
                    break;
                }
                o0O0O00 o0o0o00 = measurables.get(i2);
                float fOooO0o0 = o0O00OOO.OooO0o0(o0oo0oooArr[i2]);
                if (fOooO0o0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    f += fOooO0o0;
                    i3++;
                } else {
                    int i5 = iOooO0oo == Integer.MAX_VALUE ? Integer.MAX_VALUE : iOooO0oo - i4;
                    LayoutOrientation orientation = this.f2133OooO00o;
                    Intrinsics.checkNotNullParameter(orientation, "orientation");
                    LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                    o000O000 o000o000Oooo000 = o0o0o00.Oooo000(orientation == layoutOrientation3 ? OooO0OO.OooO00o(0, i5, 0, iOooO0oO) : OooO0OO.OooO00o(0, iOooO0oO, 0, i5));
                    iMin = Math.min(iOoooooO, (iOooO0oo - i4) - o0O00OOO.OooO0OO(o000o000Oooo000, this.f2133OooO00o));
                    LayoutOrientation layoutOrientation4 = this.f2133OooO00o;
                    i4 = (layoutOrientation4 == layoutOrientation3 ? o000o000Oooo000.f35265Oooo0o : o000o000Oooo000.f35266Oooo0oO) + iMin + i4;
                    iMax = Math.max(iMax, layoutOrientation4 == layoutOrientation3 ? o000o000Oooo000.f35266Oooo0oO : o000o000Oooo000.f35265Oooo0o);
                    o000o000Arr[i2] = o000o000Oooo000;
                }
                i2++;
                measurables = list;
                iOooO0oO = iOooO0oO;
                size2 = size2;
            }
            int iMax2 = iOooO0oO;
            if (i3 == 0) {
                i4 -= iMin;
                iCoerceAtMost = 0;
            } else {
                int i6 = (i3 - 1) * iOoooooO;
                int i7 = (((f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || iOooO0oo == Integer.MAX_VALUE) ? iOooOO0 : iOooO0oo) - i4) - i6;
                float f2 = f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? i7 / f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                int iRoundToInt = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    iRoundToInt += MathKt.roundToInt(o0O00OOO.OooO0o0(o0oo0oooArr[i8]) * f2);
                }
                int size3 = list.size();
                int i9 = i7 - iRoundToInt;
                int i10 = 0;
                int i11 = 0;
                while (i10 < size3) {
                    if (o000o000Arr[i10] == null) {
                        o0O0O00 o0o0o01 = list.get(i10);
                        o0oO0Ooo o0oo0ooo2 = o0oo0oooArr[i10];
                        float fOooO0o1 = o0O00OOO.OooO0o0(o0oo0ooo2);
                        if (!(fOooO0o1 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                            throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                        }
                        int sign = MathKt.getSign(i9);
                        int i12 = i9 - sign;
                        int iMax3 = Math.max(0, MathKt.roundToInt(fOooO0o1 * f2) + sign);
                        int i13 = (!(o0oo0ooo2 != null ? o0oo0ooo2.f2216OooO0O0 : true) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3;
                        LayoutOrientation layoutOrientation5 = this.f2133OooO00o;
                        Intrinsics.checkNotNullParameter(layoutOrientation5, str);
                        LayoutOrientation layoutOrientation6 = LayoutOrientation.Horizontal;
                        o000O000 o000o000Oooo001 = o0o0o01.Oooo000(layoutOrientation5 == layoutOrientation6 ? OooO0OO.OooO00o(i13, iMax3, 0, iMax2) : OooO0OO.OooO00o(0, iMax2, i13, iMax3));
                        int iOooO0OO = o0O00OOO.OooO0OO(o000o000Oooo001, this.f2133OooO00o) + i11;
                        iMax = Math.max(iMax, this.f2133OooO00o == layoutOrientation6 ? o000o000Oooo001.f35266Oooo0oO : o000o000Oooo001.f35265Oooo0o);
                        o000o000Arr[i10] = o000o000Oooo001;
                        i11 = iOooO0OO;
                        i9 = i12;
                    }
                    i10++;
                    size3 = size3;
                    str = str;
                }
                iCoerceAtMost = RangesKt.coerceAtMost(i11 + i6, iOooO0oo - i4);
            }
            Ref.IntRef intRef = new Ref.IntRef();
            int iMax4 = Math.max(i4 + iCoerceAtMost, iOooOO0);
            if (iMax2 == Integer.MAX_VALUE || this.f2135OooO0OO != SizeMode.Expand) {
                iMax2 = Math.max(iMax, Math.max(iOooO, intRef.element + 0));
            }
            LayoutOrientation layoutOrientation7 = this.f2133OooO00o;
            LayoutOrientation layoutOrientation8 = LayoutOrientation.Horizontal;
            int i14 = layoutOrientation7 == layoutOrientation8 ? iMax4 : iMax2;
            int i15 = layoutOrientation7 == layoutOrientation8 ? iMax2 : iMax4;
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i16 = 0; i16 < size4; i16++) {
                iArr[i16] = 0;
            }
            return measure.OooOooo(i14, i15, MapsKt.emptyMap(), new C0020OooO00o(list, o000o000Arr, this.f2136OooO0Oo, iMax4, measure, iArr, this.f2133OooO00o, o0oo0oooArr, this.f2137OooO0o0, iMax2, intRef));
        }

        @Override // o0O0O00.o000000
        public final int OooO0O0(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Function3<List<? extends OooOOOO>, Integer, Integer, Integer> function3;
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (this.f2133OooO00o == LayoutOrientation.Horizontal) {
                o00OO o00oo2 = o00OO.f2074OooO00o;
                function3 = o00OO.f2075OooO0O0;
            } else {
                o00OO o00oo3 = o00OO.f2074OooO00o;
                function3 = o00OO.f2076OooO0OO;
            }
            return function3.invoke(measurables, Integer.valueOf(i), Integer.valueOf(OooO0o.OooO00o((LayoutNode.OooOOOO) oooOo00, this.f2134OooO0O0))).intValue();
        }

        @Override // o0O0O00.o000000
        public final int OooO0OO(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Function3<List<? extends OooOOOO>, Integer, Integer, Integer> function3;
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (this.f2133OooO00o == LayoutOrientation.Horizontal) {
                o00OO o00oo2 = o00OO.f2074OooO00o;
                function3 = o00OO.f2078OooO0o;
            } else {
                o00OO o00oo3 = o00OO.f2074OooO00o;
                function3 = o00OO.f2080OooO0oO;
            }
            return function3.invoke(measurables, Integer.valueOf(i), Integer.valueOf(OooO0o.OooO00o((LayoutNode.OooOOOO) oooOo00, this.f2134OooO0O0))).intValue();
        }

        @Override // o0O0O00.o000000
        public final int OooO0Oo(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Function3<List<? extends OooOOOO>, Integer, Integer, Integer> function3;
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (this.f2133OooO00o == LayoutOrientation.Horizontal) {
                o00OO o00oo2 = o00OO.f2074OooO00o;
                function3 = o00OO.f2081OooO0oo;
            } else {
                o00OO o00oo3 = o00OO.f2074OooO00o;
                function3 = o00OO.f2073OooO;
            }
            return function3.invoke(measurables, Integer.valueOf(i), Integer.valueOf(OooO0o.OooO00o((LayoutNode.OooOOOO) oooOo00, this.f2134OooO0O0))).intValue();
        }

        @Override // o0O0O00.o000000
        public final int OooO0o0(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Function3<List<? extends OooOOOO>, Integer, Integer, Integer> function3;
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (this.f2133OooO00o == LayoutOrientation.Horizontal) {
                o00OO o00oo2 = o00OO.f2074OooO00o;
                function3 = o00OO.f2077OooO0Oo;
            } else {
                o00OO o00oo3 = o00OO.f2074OooO00o;
                function3 = o00OO.f2079OooO0o0;
            }
            return function3.invoke(measurables, Integer.valueOf(i), Integer.valueOf(OooO0o.OooO00o((LayoutNode.OooOOOO) oooOo00, this.f2134OooO0O0))).intValue();
        }
    }

    public static final int OooO00o(List list, Function2 function2, Function2 function3, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            int size = list.size();
            int iMax = 0;
            float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                OooOOOO oooOOOO = (OooOOOO) list.get(i4);
                float fOooO0o0 = OooO0o0(OooO0Oo(oooOOOO));
                int iIntValue = ((Number) function2.invoke(oooOOOO, Integer.valueOf(i))).intValue();
                if (fOooO0o0 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    i3 += iIntValue;
                } else if (fOooO0o0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    f += fOooO0o0;
                    iMax = Math.max(iMax, MathKt.roundToInt(iIntValue / fOooO0o0));
                }
            }
            return ((list.size() - 1) * i2) + MathKt.roundToInt(iMax * f) + i3;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int iMax2 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            OooOOOO oooOOOO2 = (OooOOOO) list.get(i5);
            float fOooO0o1 = OooO0o0(OooO0Oo(oooOOOO2));
            if (fOooO0o1 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                int iMin2 = Math.min(((Number) function3.invoke(oooOOOO2, Integer.MAX_VALUE)).intValue(), i - iMin);
                iMin += iMin2;
                iMax2 = Math.max(iMax2, ((Number) function2.invoke(oooOOOO2, Integer.valueOf(iMin2))).intValue());
            } else if (fOooO0o1 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f2 += fOooO0o1;
            }
        }
        int iRoundToInt = f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : MathKt.roundToInt(Math.max(i - iMin, 0) / f2);
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            OooOOOO oooOOOO3 = (OooOOOO) list.get(i6);
            float fOooO0o2 = OooO0o0(OooO0Oo(oooOOOO3));
            if (fOooO0o2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                iMax2 = Math.max(iMax2, ((Number) function2.invoke(oooOOOO3, Integer.valueOf(iRoundToInt != Integer.MAX_VALUE ? MathKt.roundToInt(iRoundToInt * fOooO0o2) : Integer.MAX_VALUE))).intValue());
            }
        }
        return iMax2;
    }

    public static final int OooO0O0(o000O000 o000o001, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o;
    }

    public static final int OooO0OO(o000O000 o000o001, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? o000o001.f35265Oooo0o : o000o001.f35266Oooo0oO;
    }

    public static final o0oO0Ooo OooO0Oo(OooOOOO oooOOOO) {
        Object objOooo0o = oooOOOO.Oooo0o();
        if (objOooo0o instanceof o0oO0Ooo) {
            return (o0oO0Ooo) objOooo0o;
        }
        return null;
    }

    @NotNull
    public static final o000000 OooO0o(@NotNull LayoutOrientation orientation, @NotNull Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super OooO, ? super int[], Unit> arrangement, float f, @NotNull SizeMode crossAxisSize, @NotNull o00O0O0 crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new OooO00o(orientation, f, crossAxisSize, arrangement, crossAxisAlignment);
    }

    public static final float OooO0o0(o0oO0Ooo o0oo0ooo2) {
        return o0oo0ooo2 != null ? o0oo0ooo2.f2215OooO00o : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }
}
