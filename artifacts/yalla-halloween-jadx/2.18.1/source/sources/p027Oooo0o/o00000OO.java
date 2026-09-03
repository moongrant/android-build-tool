package p027Oooo0o;

import Oooo0.o0OoOo0;
import Oooo0.oo0oOO0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.OooOo;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
import o0000O0O.OooOOO0;
import o0000O0O.Oooo000;
import o0O0O00.o000000O;
import p028Oooo0o0.o00O000;
import p028Oooo0o0.o0O00O0o;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO extends Lambda implements Function2<OooOo, OooO0O0, o0000oo> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O00O f1815Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f1816Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00O0o f1817Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f1818Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f1819OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooOo f1820OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f1821OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO0o f1822OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ o00O0O f1823OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0.OooO0OO f1824OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f1825OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0.OooO0O0 f1826o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(boolean z, o0O00O0o o0o00o0o, boolean z2, o000O00O o000o00o2, o0OO00O o0oo00o2, o00O000.OooOo oooOo, o00O000.OooO0o oooO0o, o0OOO0o o0ooo0o2, o00O0O o00o0o2, o00OO0O0.OooO0O0 oooO0O0, o00OO0O0.OooO0OO oooO0OO, oo0oOO0 oo0ooo0) {
        super(2);
        this.f1816Oooo0o = z;
        this.f1817Oooo0oO = o0o00o0o;
        this.f1818Oooo0oo = z2;
        this.f1815Oooo = o000o00o2;
        this.f1821OoooO00 = o0oo00o2;
        this.f1820OoooO0 = oooOo;
        this.f1822OoooO0O = oooO0o;
        this.f1819OoooO = o0ooo0o2;
        this.f1823OoooOO0 = o00o0o2;
        this.f1826o000oOoO = oooO0O0;
        this.f1824OoooOOO = oooO0OO;
        this.f1825OoooOOo = oo0ooo0;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:158:0x042f  */
    /* JADX WARN: Code duplicated, block: B:285:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:288:0x06b7 A[LOOP:12: B:284:0x06a9->B:288:0x06b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:291:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:292:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:294:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:295:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:297:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:299:0x06da  */
    /* JADX WARN: Code duplicated, block: B:300:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:302:0x06df  */
    /* JADX WARN: Code duplicated, block: B:305:0x06f8 A[LOOP:14: B:304:0x06f6->B:305:0x06f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x0731  */
    /* JADX WARN: Code duplicated, block: B:310:0x074c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0750  */
    /* JADX WARN: Code duplicated, block: B:314:0x0770  */
    /* JADX WARN: Code duplicated, block: B:315:0x0777 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:316:0x0779  */
    /* JADX WARN: Code duplicated, block: B:317:0x0780  */
    /* JADX WARN: Code duplicated, block: B:320:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:321:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:325:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:326:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:329:0x07c6 A[LOOP:16: B:328:0x07c4->B:329:0x07c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:331:0x082d  */
    /* JADX WARN: Code duplicated, block: B:332:0x083e  */
    /* JADX WARN: Code duplicated, block: B:334:0x0852  */
    /* JADX WARN: Code duplicated, block: B:335:0x086d  */
    /* JADX WARN: Code duplicated, block: B:339:0x089c  */
    /* JADX WARN: Code duplicated, block: B:340:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:344:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:348:0x092f  */
    /* JADX WARN: Code duplicated, block: B:350:0x095c  */
    /* JADX WARN: Code duplicated, block: B:352:0x0964  */
    /* JADX WARN: Code duplicated, block: B:353:0x0966  */
    /* JADX WARN: Code duplicated, block: B:357:0x096d A[LOOP:18: B:347:0x092d->B:357:0x096d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:361:0x0984  */
    /* JADX WARN: Code duplicated, block: B:364:0x099a A[LOOP:19: B:360:0x0982->B:364:0x099a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:375:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:388:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:396:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:506:0x06ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x06b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0a6c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x08f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x08df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x096b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0977 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x099d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0998 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0o.OooOo>] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0o.OooOo>] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0o.OooOo>] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r3v70, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.ArrayList, java.util.List, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v40 */
    @Override // kotlin.jvm.functions.Function2
    public final o0000oo invoke(OooOo oooOo, OooO0O0 oooO0O0) {
        int i;
        float fOooO00o;
        long jOooO00o;
        int i2;
        int i3;
        int i4;
        List listEmptyList;
        List listEmptyList2;
        int i5;
        List list;
        String str;
        ArrayList arrayList;
        int i6;
        o000OO o000ooOooO00o;
        int i7;
        int size;
        int i8;
        boolean z;
        boolean z2;
        int i9;
        int i10;
        long jOooO00o2;
        o000OO o000oo2;
        o000OO o000oo3;
        int size2;
        int i11;
        int i12;
        o000OO o000oo4;
        float f;
        int size3;
        int size4;
        int i13;
        int i14;
        o000OO o000oo5;
        o000OO o000oo6;
        o000O o000o;
        int i15;
        ArrayList arrayList2;
        int i16;
        int i17;
        Iterator it;
        int i18;
        int i19;
        ArrayList arrayList3;
        int i20;
        Map.Entry entry;
        OooOo oooOo2;
        o000O o000o2;
        Integer num;
        int size5;
        int i21;
        ?? r8;
        long j;
        int i22;
        boolean z3;
        ?? r4;
        int size6;
        int i23;
        boolean z4;
        o000O0O0 o000o0o0OooO00o;
        int iOooO00o;
        int i24;
        int i25;
        ArrayList arrayList4;
        oOO00O ooo00o;
        ?? r15;
        int i26;
        int i27;
        long jOooO00o3;
        boolean z5;
        o000OO o000oo7;
        OooOo oooOo3;
        o000OO o000oo8;
        o000OO o000oo9;
        o000O o000o3;
        int i28;
        int i29;
        ArrayList arrayList5;
        int i30;
        int i31;
        OooOo oooOo4;
        Integer num2;
        long jOooO0Oo;
        int iOooO0OO;
        int iOooO0OO2;
        int i32;
        int iOooO0OO3;
        long jOooO00o4;
        int iOooO0o0;
        int i33;
        boolean z6;
        o000OO o000oo10;
        ArrayList arrayList6;
        int size7;
        int i34;
        Object obj;
        o000OO o000oo11;
        Orientation orientation;
        o0000oo measureResult;
        int[] iArr;
        OooOo density = oooOo;
        long j2 = oooO0O0.f27302OooO00o;
        Intrinsics.checkNotNullParameter(density, "$this$null");
        o0OoOo0.OooO00o(j2, this.f1816Oooo0o ? Orientation.Vertical : Orientation.Horizontal);
        int iOoooooO = this.f1816Oooo0o ? density.OoooooO(this.f1817Oooo0oO.OooO0O0(density.getLayoutDirection())) : density.OoooooO(PaddingKt.OooO0OO(this.f1817Oooo0oO, density.getLayoutDirection()));
        int iOoooooO2 = this.f1816Oooo0o ? density.OoooooO(this.f1817Oooo0oO.OooO0OO(density.getLayoutDirection())) : density.OoooooO(PaddingKt.OooO0O0(this.f1817Oooo0oO, density.getLayoutDirection()));
        int iOoooooO3 = density.OoooooO(this.f1817Oooo0oO.OooO0Oo());
        int iOoooooO4 = density.OoooooO(this.f1817Oooo0oO.OooO00o());
        int i35 = iOoooooO3 + iOoooooO4;
        int i36 = iOoooooO + iOoooooO2;
        boolean z7 = this.f1816Oooo0o;
        int i37 = z7 ? i35 : i36;
        if (z7 && !this.f1818Oooo0oo) {
            i = iOoooooO3;
        } else if (z7 && this.f1818Oooo0oo) {
            i = iOoooooO4;
        } else {
            i = (z7 || this.f1818Oooo0oo) ? iOoooooO2 : iOoooooO;
        }
        int i38 = i37 - i;
        long jOooO0oO = OooO0OO.OooO0oO(j2, -i36, -i35);
        this.f1815Oooo.OooOO0O(this.f1821OoooO00);
        o000O00O o000o00o2 = this.f1815Oooo;
        Objects.requireNonNull(o000o00o2);
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        o000o00o2.f1872OooO0o0.setValue(density);
        this.f1821OoooO00.OooO0Oo().f2006OooO00o.setValue(new OooOOO0(density.OooO0o0(OooO0O0.OooO0oo(jOooO0oO))));
        this.f1821OoooO00.OooO0Oo().f2007OooO0O0.setValue(new OooOOO0(density.OooO0o0(OooO0O0.OooO0oO(jOooO0oO))));
        if (this.f1816Oooo0o) {
            o00O000.OooOo oooOo5 = this.f1820OoooO0;
            if (oooOo5 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            fOooO00o = oooOo5.OooO00o();
        } else {
            o00O000.OooO0o oooO0o = this.f1822OoooO0O;
            if (oooO0o == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            fOooO00o = oooO0o.OooO00o();
        }
        int iOoooooO5 = density.OoooooO(fOooO00o);
        int iOooO0oo = this.f1821OoooO00.OooO0oo();
        int iOooO0oO = this.f1816Oooo0o ? OooO0O0.OooO0oO(j2) - i35 : OooO0O0.OooO0oo(j2) - i36;
        if (!this.f1818Oooo0oo || iOooO0oO > 0) {
            jOooO00o = Oooo000.OooO00o(iOoooooO, iOoooooO3);
        } else {
            boolean z8 = this.f1816Oooo0o;
            if (!z8) {
                iOoooooO += iOooO0oO;
            }
            if (z8) {
                iOoooooO3 += iOooO0oO;
            }
            jOooO00o = Oooo000.OooO00o(iOoooooO, iOoooooO3);
        }
        boolean z9 = this.f1816Oooo0o;
        int i39 = i;
        o000O itemProvider = new o000O(jOooO0oO, z9, this.f1821OoooO00, density, new o00000O(iOooO0oo, iOoooooO5, density, z9, this.f1826o000oOoO, this.f1824OoooOOO, this.f1818Oooo0oo, i, i38, this.f1819OoooO, jOooO00o));
        this.f1815Oooo.f1880OooOOOO.setValue(new OooO0O0(itemProvider.f1853OooO0Oo));
        o000O00O o000o00o3 = this.f1815Oooo;
        oo00o oo00oVarOooO0oO = oo0o0O0.OooO0oO(oo0o0O0.f4157OooO0O0.OooO00o(), null, false);
        try {
            oo00o oo00oVarOooO = oo00oVarOooO0oO.OooO();
            try {
                int iOooO0o1 = o000o00o3.OooO0o0();
                int iOooO0o = o000o00o3.OooO0o();
                Unit unit = Unit.INSTANCE;
                oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                oo00oVarOooO0oO.OooO0OO();
                float f2 = this.f1815Oooo.f1870OooO0Oo;
                boolean z10 = this.f1816Oooo0o;
                List<Integer> headerIndexes = this.f1821OoooO00.OooO0o0();
                o00O000.OooOo oooOo6 = this.f1820OoooO0;
                o00O000.OooO0o oooO0o2 = this.f1822OoooO0O;
                boolean z11 = this.f1818Oooo0oo;
                o0OOO0o o0ooo0o2 = this.f1819OoooO;
                o00O0O beyondBoundsInfo = this.f1823OoooOO0;
                o0OOO0o placementAnimator = o0ooo0o2;
                o00000O0 layout = new o00000O0(density, j2, i36, i35);
                String str2 = "itemProvider";
                Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
                Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
                Intrinsics.checkNotNullParameter(density, "density");
                Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
                Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
                Intrinsics.checkNotNullParameter(layout, "layout");
                String str3 = "Failed requirement.";
                if (!(i39 >= 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(i38 >= 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (iOooO0oo <= 0) {
                    measureResult = new o0000oo(null, 0, false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (o000000O) layout.invoke(Integer.valueOf(OooO0O0.OooOO0(jOooO0oO)), Integer.valueOf(OooO0O0.OooO(jOooO0oO)), o0000.f1772Oooo0o), CollectionsKt.emptyList(), iOooO0oO + i38, 0, z10 ? Orientation.Vertical : Orientation.Horizontal);
                } else {
                    int i40 = iOooO0oO;
                    if (iOooO0o1 >= iOooO0oo) {
                        iOooO0o1 = iOooO0oo - 1;
                        i2 = 0;
                    } else {
                        i2 = iOooO0o;
                    }
                    int iRoundToInt = MathKt.roundToInt(f2);
                    int i41 = i2 - iRoundToInt;
                    if ((iOooO0o1 == 0) && i41 < 0) {
                        iRoundToInt += i41;
                        i41 = 0;
                    }
                    int i42 = iOooO0o1;
                    ArrayList arrayList7 = new ArrayList();
                    int i43 = i41 - i39;
                    int iMin = -i39;
                    int i44 = i42;
                    String str4 = "headerIndexes";
                    int iMax = 0;
                    while (i43 < 0 && i44 + 0 > 0) {
                        o0OOO0o o0ooo0o3 = placementAnimator;
                        int i45 = i44 - 1;
                        String str5 = str2;
                        o000O0O0 o000o0o0OooO00o2 = itemProvider.OooO00o(i45);
                        i44 = i45;
                        arrayList7.add(0, o000o0o0OooO00o2);
                        iMax = Math.max(iMax, o000o0o0OooO00o2.f1909OooOOOo);
                        i43 += o000o0o0OooO00o2.f1908OooOOOO;
                        str2 = str5;
                        placementAnimator = o0ooo0o3;
                    }
                    o0OOO0o o0ooo0o4 = placementAnimator;
                    String str6 = str2;
                    if (i43 < iMin) {
                        iRoundToInt += i43;
                        i43 = iMin;
                    }
                    int i46 = i43 + i39;
                    int i47 = i40 + i38;
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(i47, 0);
                    int i48 = iMax;
                    int i49 = -i46;
                    int i50 = i44;
                    int i51 = 0;
                    for (int size8 = arrayList7.size(); i51 < size8; size8 = size8) {
                        i50++;
                        i49 += ((o000O0O0) arrayList7.get(i51)).f1908OooOOOO;
                        i51++;
                    }
                    int iMax2 = i48;
                    int i52 = i46;
                    int i53 = i50;
                    while (true) {
                        if ((i49 > iCoerceAtLeast && !arrayList7.isEmpty()) || i53 >= iOooO0oo) {
                            break;
                        }
                        int i54 = iCoerceAtLeast;
                        o000O0O0 o000o0o0OooO00o3 = itemProvider.OooO00o(i53);
                        String str7 = str3;
                        int i55 = o000o0o0OooO00o3.f1908OooOOOO;
                        int i56 = i49 + i55;
                        if (i56 <= iMin) {
                            i3 = i56;
                            if (i53 != iOooO0oo - 1) {
                                i52 -= i55;
                                i44 = i53 + 1;
                            }
                            i53++;
                            iCoerceAtLeast = i54;
                            str3 = str7;
                            i49 = i3;
                        } else {
                            i3 = i56;
                        }
                        iMax2 = Math.max(iMax2, o000o0o0OooO00o3.f1909OooOOOo);
                        arrayList7.add(o000o0o0OooO00o3);
                        i53++;
                        iCoerceAtLeast = i54;
                        str3 = str7;
                        i49 = i3;
                    }
                    String str8 = str3;
                    if (i49 < i40) {
                        int i57 = i40 - i49;
                        i52 -= i57;
                        i49 += i57;
                        while (i52 < i39 && i44 + 0 > 0) {
                            int i58 = i44 - 1;
                            o000O0O0 o000o0o0OooO00o4 = itemProvider.OooO00o(i58);
                            i44 = i58;
                            arrayList7.add(0, o000o0o0OooO00o4);
                            iMax2 = Math.max(iMax2, o000o0o0OooO00o4.f1909OooOOOo);
                            i52 += o000o0o0OooO00o4.f1908OooOOOO;
                        }
                        iRoundToInt += i57;
                        if (i52 < 0) {
                            iRoundToInt += i52;
                            i49 += i52;
                            i52 = 0;
                        }
                    }
                    int i59 = i49;
                    int i60 = iRoundToInt;
                    if (MathKt.getSign(MathKt.roundToInt(f2)) == MathKt.getSign(i60) && Math.abs(MathKt.roundToInt(f2)) >= Math.abs(i60)) {
                        f2 = i60;
                    }
                    int i61 = -i52;
                    o000O0O0 o000o0o1 = (o000O0O0) CollectionsKt.first((List) arrayList7);
                    if (i39 <= 0) {
                        i4 = iMax2;
                        break;
                    }
                    int size9 = arrayList7.size();
                    int i62 = 0;
                    while (true) {
                        if (i62 >= size9) {
                            i4 = iMax2;
                            break;
                        }
                        i4 = iMax2;
                        int i63 = ((o000O0O0) arrayList7.get(i62)).f1908OooOOOO;
                        if (i52 == 0 || i63 > i52) {
                            break;
                        }
                        int i64 = size9;
                        if (i62 == CollectionsKt.getLastIndex(arrayList7)) {
                            break;
                        }
                        i52 -= i63;
                        i62++;
                        o000o0o1 = (o000O0O0) arrayList7.get(i62);
                        size9 = i64;
                        iMax2 = i4;
                    }
                    int i65 = i52;
                    o000O0O0 o000o0o2 = o000o0o1;
                    if (beyondBoundsInfo.OooO0Oo()) {
                        int i66 = iOooO0oo - 1;
                        if (((o000O0O0) CollectionsKt.first((List) arrayList7)).f1895OooO00o > Math.min(beyondBoundsInfo.OooO0OO(), i66)) {
                            ArrayList arrayList8 = new ArrayList();
                            int i67 = ((o000O0O0) CollectionsKt.first((List) arrayList7)).f1895OooO00o - 1;
                            int iMin2 = Math.min(beyondBoundsInfo.OooO0OO(), i66);
                            if (iMin2 <= i67) {
                                while (true) {
                                    arrayList8.add(itemProvider.OooO00o(i67));
                                    if (i67 == iMin2) {
                                        break;
                                    }
                                    i67--;
                                }
                            }
                            Unit unit2 = Unit.INSTANCE;
                            listEmptyList = arrayList8;
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    if (beyondBoundsInfo.OooO0Oo()) {
                        int i68 = iOooO0oo - 1;
                        if (((o000O0O0) CollectionsKt.last((List) arrayList7)).f1895OooO00o < Math.min(beyondBoundsInfo.OooO0O0(), i68)) {
                            ArrayList arrayList9 = new ArrayList();
                            int i69 = ((o000O0O0) CollectionsKt.last((List) arrayList7)).f1895OooO00o;
                            int iMin3 = Math.min(beyondBoundsInfo.OooO0O0(), i68);
                            while (i69 < iMin3) {
                                i69++;
                                arrayList9.add(itemProvider.OooO00o(i69));
                            }
                            Unit unit3 = Unit.INSTANCE;
                            listEmptyList2 = arrayList9;
                        } else {
                            listEmptyList2 = CollectionsKt.emptyList();
                        }
                    } else {
                        listEmptyList2 = CollectionsKt.emptyList();
                    }
                    boolean z12 = Intrinsics.areEqual(o000o0o2, CollectionsKt.first((List) arrayList7)) && listEmptyList.isEmpty() && listEmptyList2.isEmpty();
                    int iOooO0o2 = OooO0OO.OooO0o(jOooO0oO, z10 ? i4 : i59);
                    int iOooO0o3 = OooO0OO.OooO0o0(jOooO0oO, z10 ? i59 : i4);
                    int i70 = z10 ? iOooO0o3 : iOooO0o2;
                    boolean z13 = i59 < Math.min(i70, i40);
                    if (z13) {
                        if (!(i61 == 0)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    boolean z14 = z12;
                    ArrayList positionedItems = new ArrayList(listEmptyList2.size() + listEmptyList.size() + arrayList7.size());
                    if (z13) {
                        if (!(listEmptyList.isEmpty() && listEmptyList2.isEmpty())) {
                            throw new IllegalArgumentException(str8.toString());
                        }
                        int size10 = arrayList7.size();
                        int[] iArr2 = new int[size10];
                        for (int i71 = 0; i71 < size10; i71++) {
                            iArr2[i71] = ((o000O0O0) arrayList7.get(!z11 ? i71 : (size10 - i71) - 1)).f1906OooOOO;
                        }
                        int[] iArr3 = new int[size10];
                        for (int i72 = 0; i72 < size10; i72++) {
                            iArr3[i72] = 0;
                        }
                        if (z10) {
                            if (oooOo6 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            oooOo6.OooO0OO(density, i70, iArr2, iArr3);
                            iArr = iArr3;
                            i5 = iOooO0oo;
                        } else {
                            if (oooO0o2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            iArr = iArr3;
                            i5 = iOooO0oo;
                            oooO0o2.OooO0O0(density, i70, iArr2, LayoutDirection.Ltr, iArr);
                        }
                        IntProgression indices = ArraysKt.getIndices(iArr);
                        if (z11) {
                            indices = RangesKt.reversed(indices);
                        }
                        int first = indices.getFirst();
                        int last = indices.getLast();
                        int step = indices.getStep();
                        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                            while (true) {
                                int i73 = iArr[first];
                                o000O0O0 o000o0o3 = (o000O0O0) arrayList7.get(!z11 ? first : (size10 - first) - 1);
                                if (z11) {
                                    i73 = (i70 - i73) - o000o0o3.f1906OooOOO;
                                }
                                positionedItems.add(o000o0o3.OooO00o(i73, iOooO0o2, iOooO0o3));
                                if (first == last) {
                                    break;
                                }
                                first += step;
                            }
                        }
                    } else {
                        str4 = str4;
                        z10 = z10;
                        i5 = iOooO0oo;
                        i40 = i40;
                        int size11 = listEmptyList.size();
                        int i74 = 0;
                        int i75 = i61;
                        while (i74 < size11) {
                            list = listEmptyList;
                            o000O0O0 o000o0o4 = (o000O0O0) list.get(i74);
                            i75 -= o000o0o4.f1908OooOOOO;
                            positionedItems.add(o000o0o4.OooO00o(i75, iOooO0o2, iOooO0o3));
                            i74++;
                            list = list;
                        }
                        list = listEmptyList;
                        int size12 = arrayList7.size();
                        int i76 = i61;
                        for (int i77 = 0; i77 < size12; i77++) {
                            o000O0O0 o000o0o5 = (o000O0O0) arrayList7.get(i77);
                            positionedItems.add(o000o0o5.OooO00o(i76, iOooO0o2, iOooO0o3));
                            i76 += o000o0o5.f1908OooOOOO;
                        }
                        int size13 = listEmptyList2.size();
                        for (int i78 = 0; i78 < size13; i78++) {
                            o000O0O0 o000o0o6 = (o000O0O0) listEmptyList2.get(i78);
                            positionedItems.add(o000o0o6.OooO00o(i76, iOooO0o2, iOooO0o3));
                            i76 += o000o0o6.f1908OooOOOO;
                        }
                    }
                    if (!headerIndexes.isEmpty()) {
                        Intrinsics.checkNotNullParameter(positionedItems, "composedVisibleItems");
                        str = str6;
                        Intrinsics.checkNotNullParameter(itemProvider, str);
                        Intrinsics.checkNotNullParameter(headerIndexes, str4);
                        int i79 = ((o000OO) CollectionsKt.first((List) positionedItems)).f1918OooO0O0;
                        int size14 = headerIndexes.size();
                        int i80 = 0;
                        int iIntValue = -1;
                        int iIntValue2 = -1;
                        while (i80 < size14) {
                            int i81 = size14;
                            if (headerIndexes.get(i80).intValue() > i79) {
                                break;
                            }
                            iIntValue = headerIndexes.get(i80).intValue();
                            i80++;
                            iIntValue2 = ((i80 < 0 || i80 > CollectionsKt.getLastIndex(headerIndexes)) ? -1 : headerIndexes.get(i80)).intValue();
                            size14 = i81;
                        }
                        int size15 = positionedItems.size();
                        int i82 = 0;
                        int i83 = -1;
                        int i84 = Integer.MIN_VALUE;
                        arrayList = arrayList7;
                        int i85 = Integer.MIN_VALUE;
                        while (i82 < size15) {
                            int i86 = size15;
                            o000OO o000oo12 = (o000OO) positionedItems.get(i82);
                            int i87 = i40;
                            int i88 = o000oo12.f1918OooO0O0;
                            if (i88 == iIntValue) {
                                i84 = o000oo12.f1917OooO00o;
                                i83 = i82;
                            } else if (i88 == iIntValue2) {
                                i85 = o000oo12.f1917OooO00o;
                            }
                            i82++;
                            size15 = i86;
                            i40 = i87;
                        }
                        i6 = i40;
                        if (iIntValue != -1) {
                            o000O0O0 o000o0o0OooO00o5 = itemProvider.OooO00o(iIntValue);
                            if (i84 != Integer.MIN_VALUE) {
                                iMin = Math.max(iMin, i84);
                            }
                            if (i85 != Integer.MIN_VALUE) {
                                iMin = Math.min(iMin, i85 - o000o0o0OooO00o5.f1906OooOOO);
                            }
                            o000ooOooO00o = o000o0o0OooO00o5.OooO00o(iMin, iOooO0o2, iOooO0o3);
                            if (i83 != -1) {
                                positionedItems.set(i83, o000ooOooO00o);
                            } else {
                                positionedItems.add(0, o000ooOooO00o);
                            }
                        }
                        i7 = (int) f2;
                        Objects.requireNonNull(o0ooo0o4);
                        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
                        Intrinsics.checkNotNullParameter(itemProvider, str);
                        size = positionedItems.size();
                        i8 = 0;
                        while (true) {
                            if (i8 < size) {
                                z = false;
                                break;
                            }
                            if (((o000OO) positionedItems.get(i8)).f1927OooOO0o) {
                                z = true;
                                break;
                            }
                            i8++;
                        }
                        if (z) {
                            z2 = o0ooo0o4.f1995OooO0O0;
                            if (z2) {
                                i9 = iOooO0o3;
                            } else {
                                i9 = iOooO0o2;
                            }
                            if (z11) {
                                i7 = -i7;
                            }
                            if (z2) {
                                i10 = 0;
                            } else {
                                i10 = i7;
                            }
                            if (!z2) {
                                i7 = 0;
                            }
                            jOooO00o2 = Oooo000.OooO00o(i10, i7);
                            o000oo2 = (o000OO) CollectionsKt.first((List) positionedItems);
                            o000oo3 = (o000OO) CollectionsKt.last((List) positionedItems);
                            size2 = positionedItems.size();
                            i11 = 0;
                            i12 = 0;
                            while (i11 < size2) {
                                int i89 = size2;
                                o000OO o000oo13 = (o000OO) positionedItems.get(i11);
                                o000OO o000oo14 = o000ooOooO00o;
                                i12 += o000oo13.f1922OooO0o0;
                                i11++;
                                size2 = i89;
                                o000ooOooO00o = o000oo14;
                                f2 = f2;
                            }
                            o000oo4 = o000ooOooO00o;
                            f = f2;
                            size3 = i12 / positionedItems.size();
                            o0ooo0o4.f1993OooO.clear();
                            size4 = positionedItems.size();
                            i13 = 0;
                            while (i13 < size4) {
                                o000oo7 = (o000OO) positionedItems.get(i13);
                                int i90 = size4;
                                o0ooo0o4.f1993OooO.add(o000oo7.f1919OooO0OO);
                                oooOo3 = (OooOo) o0ooo0o4.f1996OooO0OO.get(o000oo7.f1919OooO0OO);
                                if (oooOo3 == null) {
                                    iOooO0o3 = iOooO0o3;
                                    o000oo8 = o000oo2;
                                    o000oo9 = o000oo3;
                                    o000o3 = itemProvider;
                                    i28 = size3;
                                    i29 = i59;
                                    arrayList5 = positionedItems;
                                    i30 = iOooO0o2;
                                    i31 = i9;
                                    if (o000oo7.f1927OooOO0o) {
                                        long j3 = oooOo3.f1744OooO00o;
                                        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
                                        oooOo3.f1744OooO00o = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j3), ((int) (j3 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                        o0ooo0o4.OooO0o0(o000oo7, oooOo3);
                                    } else {
                                        o0ooo0o4.f1996OooO0OO.remove(o000oo7.f1919OooO0OO);
                                    }
                                } else if (o000oo7.f1927OooOO0o) {
                                    oooOo4 = new OooOo();
                                    i29 = i59;
                                    num2 = o0ooo0o4.f1997OooO0Oo.get(o000oo7.f1919OooO0OO);
                                    o000oo9 = o000oo3;
                                    o000o3 = itemProvider;
                                    jOooO0Oo = o000oo7.OooO0Oo(0);
                                    iOooO0OO = o000oo7.OooO0OO(0);
                                    if (num2 == null) {
                                        iOooO0OO3 = o0ooo0o4.OooO0OO(jOooO0Oo);
                                        iOooO0o3 = iOooO0o3;
                                    } else {
                                        if (z11) {
                                            iOooO0OO2 = (o0ooo0o4.OooO0OO(jOooO0Oo) - o000oo7.f1922OooO0o0) + iOooO0OO;
                                        } else {
                                            iOooO0OO2 = o0ooo0o4.OooO0OO(jOooO0Oo);
                                        }
                                        int iOooO00o2 = o0ooo0o4.OooO00o(num2.intValue(), o000oo7.f1922OooO0o0, size3, jOooO00o2, z11, i9, iOooO0OO2, positionedItems);
                                        if (z11) {
                                            i32 = o000oo7.f1920OooO0Oo - iOooO0OO;
                                        } else {
                                            i32 = 0;
                                        }
                                        iOooO0OO3 = i32 + iOooO00o2;
                                    }
                                    if (o0ooo0o4.f1995OooO0O0) {
                                        jOooO00o4 = o0000O0O.OooOo.OooO00o(jOooO0Oo, 0, iOooO0OO3, 1);
                                    } else {
                                        jOooO00o4 = o0000O0O.OooOo.OooO00o(jOooO0Oo, iOooO0OO3, 0, 2);
                                    }
                                    iOooO0o0 = o000oo7.OooO0o0();
                                    i33 = 0;
                                    while (i33 < iOooO0o0) {
                                        long jOooO0Oo2 = o000oo7.OooO0Oo(i33);
                                        ArrayList arrayList10 = positionedItems;
                                        int i91 = i9;
                                        long jOooO00o5 = Oooo000.OooO00o(((int) (jOooO0Oo2 >> 32)) - ((int) (jOooO0Oo >> 32)), o0000O0O.OooOo.OooO0OO(jOooO0Oo2) - o0000O0O.OooOo.OooO0OO(jOooO0Oo));
                                        int i92 = iOooO0o0;
                                        oooOo4.f1745OooO0O0.add(new oOO00O(o00oO0o.OooO00o(jOooO00o5, o0000O0O.OooOo.OooO0OO(jOooO00o4), ((int) (jOooO00o4 >> 32)) + ((int) (jOooO00o5 >> 32))), o000oo7.OooO0OO(i33)));
                                        Unit unit4 = Unit.INSTANCE;
                                        i33++;
                                        size3 = size3;
                                        i9 = i91;
                                        iOooO0o2 = iOooO0o2;
                                        iOooO0o0 = i92;
                                        o000oo2 = o000oo2;
                                        jOooO0Oo = jOooO0Oo;
                                        positionedItems = arrayList10;
                                    }
                                    o000oo8 = o000oo2;
                                    i28 = size3;
                                    arrayList5 = positionedItems;
                                    i30 = iOooO0o2;
                                    i31 = i9;
                                    o0ooo0o4.f1996OooO0OO.put(o000oo7.f1919OooO0OO, oooOo4);
                                    o0ooo0o4.OooO0o0(o000oo7, oooOo4);
                                } else {
                                    iOooO0o3 = iOooO0o3;
                                    o000oo8 = o000oo2;
                                    o000oo9 = o000oo3;
                                    o000o3 = itemProvider;
                                    i28 = size3;
                                    i29 = i59;
                                    arrayList5 = positionedItems;
                                    i30 = iOooO0o2;
                                    i31 = i9;
                                }
                                i13++;
                                size4 = i90;
                                size3 = i28;
                                i9 = i31;
                                i59 = i29;
                                itemProvider = o000o3;
                                o000oo3 = o000oo9;
                                iOooO0o2 = i30;
                                iOooO0o3 = iOooO0o3;
                                o000oo2 = o000oo8;
                                positionedItems = arrayList5;
                            }
                            i14 = iOooO0o3;
                            o000oo5 = o000oo2;
                            o000oo6 = o000oo3;
                            o000o = itemProvider;
                            i15 = size3;
                            int i93 = i59;
                            arrayList2 = positionedItems;
                            i16 = iOooO0o2;
                            i17 = i9;
                            if (z11) {
                                o0ooo0o4.f1999OooO0o0 = o000oo6.f1918OooO0O0;
                                o0ooo0o4.f1998OooO0o = (i17 - o000oo6.f1917OooO00o) - o000oo6.f1920OooO0Oo;
                                o0ooo0o4.f2000OooO0oO = o000oo5.f1918OooO0O0;
                                o0ooo0o4.f2001OooO0oo = (o000oo5.f1922OooO0o0 - o000oo5.f1920OooO0Oo) + (-o000oo5.f1917OooO00o);
                            } else {
                                o0ooo0o4.f1999OooO0o0 = o000oo5.f1918OooO0O0;
                                o0ooo0o4.f1998OooO0o = o000oo5.f1917OooO00o;
                                o0ooo0o4.f2000OooO0oO = o000oo6.f1918OooO0O0;
                                o0ooo0o4.f2001OooO0oo = (o000oo6.f1917OooO00o + o000oo6.f1922OooO0o0) - i17;
                            }
                            it = o0ooo0o4.f1996OooO0OO.entrySet().iterator();
                            while (it.hasNext()) {
                                entry = (Map.Entry) it.next();
                                if (!o0ooo0o4.f1993OooO.contains(entry.getKey())) {
                                    oooOo2 = (OooOo) entry.getValue();
                                    long j4 = oooOo2.f1744OooO00o;
                                    o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
                                    oooOo2.f1744OooO00o = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j4), ((int) (j4 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                    o000o2 = o000o;
                                    num = o000o2.f1850OooO00o.OooO0o().get(entry.getKey());
                                    ?? r9 = oooOo2.f1745OooO0O0;
                                    size5 = r9.size();
                                    i21 = 0;
                                    r8 = r9;
                                    while (true) {
                                        if (i21 < size5) {
                                            j = jOooO00o2;
                                            i22 = i17;
                                            z3 = false;
                                            break;
                                        }
                                        ooo00o = (oOO00O) r8.get(i21);
                                        long j5 = ooo00o.f2012OooO0OO;
                                        r15 = r8;
                                        i26 = size5;
                                        long j6 = oooOo2.f1744OooO00o;
                                        i27 = i17;
                                        j = jOooO00o2;
                                        jOooO00o3 = o00oO0o.OooO00o(j6, o0000O0O.OooOo.OooO0OO(j5), ((int) (j5 >> 32)) + ((int) (j6 >> 32)));
                                        if (o0ooo0o4.OooO0OO(jOooO00o3) + ooo00o.f2010OooO00o > 0) {
                                            i22 = i27;
                                            z5 = o0ooo0o4.OooO0OO(jOooO00o3) < i22;
                                            if (z5) {
                                                z3 = true;
                                                break;
                                            }
                                            i21++;
                                            size5 = i26;
                                            i17 = i22;
                                            r8 = r15;
                                            jOooO00o2 = j;
                                        } else {
                                            i22 = i27;
                                        }
                                        if (z5) {
                                            z3 = true;
                                            break;
                                        }
                                        i21++;
                                        size5 = i26;
                                        i17 = i22;
                                        r8 = r15;
                                        jOooO00o2 = j;
                                    }
                                    r4 = oooOo2.f1745OooO0O0;
                                    size6 = r4.size();
                                    i23 = 0;
                                    while (true) {
                                        if (i23 < size6) {
                                            z4 = false;
                                            break;
                                        }
                                        if (((Boolean) ((oOO00O) r4.get(i23)).f2013OooO0Oo.getValue()).booleanValue()) {
                                            z4 = true;
                                            break;
                                        }
                                        i23++;
                                    }
                                    boolean z15 = !z4;
                                    if ((z3 && z15) || num == null || oooOo2.f1745OooO0O0.isEmpty()) {
                                        i24 = i16;
                                        i25 = i14;
                                        arrayList4 = arrayList2;
                                        it.remove();
                                    } else {
                                        o000o0o0OooO00o = o000o2.OooO00o(num.intValue());
                                        iOooO00o = o0ooo0o4.OooO00o(num.intValue(), o000o0o0OooO00o.f1908OooOOOO, i15, j, z11, i22, i22, arrayList2);
                                        if (z11) {
                                            iOooO00o = (i22 - iOooO00o) - o000o0o0OooO00o.f1906OooOOO;
                                        }
                                        i24 = i16;
                                        i25 = i14;
                                        o000OO o000ooOooO00o2 = o000o0o0OooO00o.OooO00o(iOooO00o, i24, i25);
                                        arrayList4 = arrayList2;
                                        arrayList4.add(o000ooOooO00o2);
                                        o0ooo0o4.OooO0o0(o000ooOooO00o2, oooOo2);
                                    }
                                    arrayList2 = arrayList4;
                                    i16 = i24;
                                    o000o = o000o2;
                                    i14 = i25;
                                    i17 = i22;
                                    jOooO00o2 = j;
                                }
                            }
                            i18 = i16;
                            i19 = i14;
                            arrayList3 = arrayList2;
                            o0ooo0o4.f1997OooO0Oo = o000o.f1850OooO00o.OooO0o();
                            i20 = i93;
                        } else {
                            o0ooo0o4.OooO0Oo();
                            o000oo4 = o000ooOooO00o;
                            i19 = iOooO0o3;
                            f = f2;
                            i20 = i59;
                            arrayList3 = positionedItems;
                            i18 = iOooO0o2;
                        }
                        if (i20 > i6) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        o000oo10 = o000oo4;
                        o000000O o000000o2 = (o000000O) layout.invoke(Integer.valueOf(i18), Integer.valueOf(i19), new o0000O00(arrayList3, o000oo10));
                        if (z14) {
                            arrayList6 = arrayList3;
                        } else {
                            arrayList6 = new ArrayList(arrayList3.size());
                            size7 = arrayList3.size();
                            for (i34 = 0; i34 < size7; i34++) {
                                obj = arrayList3.get(i34);
                                o000oo11 = (o000OO) obj;
                                if ((o000oo11.f1918OooO0O0 < ((o000O0O0) CollectionsKt.first((List) arrayList)).f1895OooO00o && o000oo11.f1918OooO0O0 <= ((o000O0O0) CollectionsKt.last((List) arrayList)).f1895OooO00o) || o000oo11 == o000oo10) {
                                    arrayList6.add(obj);
                                }
                            }
                        }
                        if (z10) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        measureResult = new o0000oo(o000o0o2, i65, z6, f, o000000o2, arrayList6, i47, i5, orientation);
                    } else {
                        str = str6;
                        arrayList = arrayList7;
                        i6 = i40;
                    }
                    o000ooOooO00o = null;
                    i7 = (int) f2;
                    Objects.requireNonNull(o0ooo0o4);
                    Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
                    Intrinsics.checkNotNullParameter(itemProvider, str);
                    size = positionedItems.size();
                    i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            z = false;
                            break;
                        }
                        if (((o000OO) positionedItems.get(i8)).f1927OooOO0o) {
                            z = true;
                            break;
                        }
                        i8++;
                    }
                    if (z) {
                        o0ooo0o4.OooO0Oo();
                        o000oo4 = o000ooOooO00o;
                        i19 = iOooO0o3;
                        f = f2;
                        i20 = i59;
                        arrayList3 = positionedItems;
                        i18 = iOooO0o2;
                    } else {
                        z2 = o0ooo0o4.f1995OooO0O0;
                        if (z2) {
                            i9 = iOooO0o3;
                        } else {
                            i9 = iOooO0o2;
                        }
                        if (z11) {
                            i7 = -i7;
                        }
                        if (z2) {
                            i10 = 0;
                        } else {
                            i10 = i7;
                        }
                        if (!z2) {
                            i7 = 0;
                        }
                        jOooO00o2 = Oooo000.OooO00o(i10, i7);
                        o000oo2 = (o000OO) CollectionsKt.first((List) positionedItems);
                        o000oo3 = (o000OO) CollectionsKt.last((List) positionedItems);
                        size2 = positionedItems.size();
                        i11 = 0;
                        i12 = 0;
                        while (i11 < size2) {
                            int i810 = size2;
                            o000OO o000oo15 = (o000OO) positionedItems.get(i11);
                            o000OO o000oo16 = o000ooOooO00o;
                            i12 += o000oo15.f1922OooO0o0;
                            i11++;
                            size2 = i810;
                            o000ooOooO00o = o000oo16;
                            f2 = f2;
                        }
                        o000oo4 = o000ooOooO00o;
                        f = f2;
                        size3 = i12 / positionedItems.size();
                        o0ooo0o4.f1993OooO.clear();
                        size4 = positionedItems.size();
                        i13 = 0;
                        while (i13 < size4) {
                            o000oo7 = (o000OO) positionedItems.get(i13);
                            int i94 = size4;
                            o0ooo0o4.f1993OooO.add(o000oo7.f1919OooO0OO);
                            oooOo3 = (OooOo) o0ooo0o4.f1996OooO0OO.get(o000oo7.f1919OooO0OO);
                            if (oooOo3 == null) {
                                iOooO0o3 = iOooO0o3;
                                o000oo8 = o000oo2;
                                o000oo9 = o000oo3;
                                o000o3 = itemProvider;
                                i28 = size3;
                                i29 = i59;
                                arrayList5 = positionedItems;
                                i30 = iOooO0o2;
                                i31 = i9;
                                if (o000oo7.f1927OooOO0o) {
                                    long j7 = oooOo3.f1744OooO00o;
                                    o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
                                    oooOo3.f1744OooO00o = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j7), ((int) (j7 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                    o0ooo0o4.OooO0o0(o000oo7, oooOo3);
                                } else {
                                    o0ooo0o4.f1996OooO0OO.remove(o000oo7.f1919OooO0OO);
                                }
                            } else if (o000oo7.f1927OooOO0o) {
                                oooOo4 = new OooOo();
                                i29 = i59;
                                num2 = o0ooo0o4.f1997OooO0Oo.get(o000oo7.f1919OooO0OO);
                                o000oo9 = o000oo3;
                                o000o3 = itemProvider;
                                jOooO0Oo = o000oo7.OooO0Oo(0);
                                iOooO0OO = o000oo7.OooO0OO(0);
                                if (num2 == null) {
                                    iOooO0OO3 = o0ooo0o4.OooO0OO(jOooO0Oo);
                                    iOooO0o3 = iOooO0o3;
                                } else {
                                    if (z11) {
                                        iOooO0OO2 = o0ooo0o4.OooO0OO(jOooO0Oo);
                                    } else {
                                        iOooO0OO2 = (o0ooo0o4.OooO0OO(jOooO0Oo) - o000oo7.f1922OooO0o0) + iOooO0OO;
                                    }
                                    int iOooO00o3 = o0ooo0o4.OooO00o(num2.intValue(), o000oo7.f1922OooO0o0, size3, jOooO00o2, z11, i9, iOooO0OO2, positionedItems);
                                    if (z11) {
                                        i32 = o000oo7.f1920OooO0Oo - iOooO0OO;
                                    } else {
                                        i32 = 0;
                                    }
                                    iOooO0OO3 = i32 + iOooO00o3;
                                }
                                if (o0ooo0o4.f1995OooO0O0) {
                                    jOooO00o4 = o0000O0O.OooOo.OooO00o(jOooO0Oo, 0, iOooO0OO3, 1);
                                } else {
                                    jOooO00o4 = o0000O0O.OooOo.OooO00o(jOooO0Oo, iOooO0OO3, 0, 2);
                                }
                                iOooO0o0 = o000oo7.OooO0o0();
                                i33 = 0;
                                while (i33 < iOooO0o0) {
                                    long jOooO0Oo3 = o000oo7.OooO0Oo(i33);
                                    ArrayList arrayList11 = positionedItems;
                                    int i95 = i9;
                                    long jOooO00o6 = Oooo000.OooO00o(((int) (jOooO0Oo3 >> 32)) - ((int) (jOooO0Oo >> 32)), o0000O0O.OooOo.OooO0OO(jOooO0Oo3) - o0000O0O.OooOo.OooO0OO(jOooO0Oo));
                                    int i96 = iOooO0o0;
                                    oooOo4.f1745OooO0O0.add(new oOO00O(o00oO0o.OooO00o(jOooO00o6, o0000O0O.OooOo.OooO0OO(jOooO00o4), ((int) (jOooO00o4 >> 32)) + ((int) (jOooO00o6 >> 32))), o000oo7.OooO0OO(i33)));
                                    Unit unit5 = Unit.INSTANCE;
                                    i33++;
                                    size3 = size3;
                                    i9 = i95;
                                    iOooO0o2 = iOooO0o2;
                                    iOooO0o0 = i96;
                                    o000oo2 = o000oo2;
                                    jOooO0Oo = jOooO0Oo;
                                    positionedItems = arrayList11;
                                }
                                o000oo8 = o000oo2;
                                i28 = size3;
                                arrayList5 = positionedItems;
                                i30 = iOooO0o2;
                                i31 = i9;
                                o0ooo0o4.f1996OooO0OO.put(o000oo7.f1919OooO0OO, oooOo4);
                                o0ooo0o4.OooO0o0(o000oo7, oooOo4);
                            } else {
                                iOooO0o3 = iOooO0o3;
                                o000oo8 = o000oo2;
                                o000oo9 = o000oo3;
                                o000o3 = itemProvider;
                                i28 = size3;
                                i29 = i59;
                                arrayList5 = positionedItems;
                                i30 = iOooO0o2;
                                i31 = i9;
                            }
                            i13++;
                            size4 = i94;
                            size3 = i28;
                            i9 = i31;
                            i59 = i29;
                            itemProvider = o000o3;
                            o000oo3 = o000oo9;
                            iOooO0o2 = i30;
                            iOooO0o3 = iOooO0o3;
                            o000oo2 = o000oo8;
                            positionedItems = arrayList5;
                        }
                        i14 = iOooO0o3;
                        o000oo5 = o000oo2;
                        o000oo6 = o000oo3;
                        o000o = itemProvider;
                        i15 = size3;
                        int i97 = i59;
                        arrayList2 = positionedItems;
                        i16 = iOooO0o2;
                        i17 = i9;
                        if (z11) {
                            o0ooo0o4.f1999OooO0o0 = o000oo5.f1918OooO0O0;
                            o0ooo0o4.f1998OooO0o = o000oo5.f1917OooO00o;
                            o0ooo0o4.f2000OooO0oO = o000oo6.f1918OooO0O0;
                            o0ooo0o4.f2001OooO0oo = (o000oo6.f1917OooO00o + o000oo6.f1922OooO0o0) - i17;
                        } else {
                            o0ooo0o4.f1999OooO0o0 = o000oo6.f1918OooO0O0;
                            o0ooo0o4.f1998OooO0o = (i17 - o000oo6.f1917OooO00o) - o000oo6.f1920OooO0Oo;
                            o0ooo0o4.f2000OooO0oO = o000oo5.f1918OooO0O0;
                            o0ooo0o4.f2001OooO0oo = (o000oo5.f1922OooO0o0 - o000oo5.f1920OooO0Oo) + (-o000oo5.f1917OooO00o);
                        }
                        it = o0ooo0o4.f1996OooO0OO.entrySet().iterator();
                        while (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                            if (!o0ooo0o4.f1993OooO.contains(entry.getKey())) {
                                oooOo2 = (OooOo) entry.getValue();
                                long j8 = oooOo2.f1744OooO00o;
                                o0000O0O.OooOo.OooO00o oooO00o4 = o0000O0O.OooOo.f27310OooO0O0;
                                oooOo2.f1744OooO00o = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j8), ((int) (j8 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                o000o2 = o000o;
                                num = o000o2.f1850OooO00o.OooO0o().get(entry.getKey());
                                ?? r10 = oooOo2.f1745OooO0O0;
                                size5 = r10.size();
                                i21 = 0;
                                r8 = r10;
                                while (true) {
                                    if (i21 < size5) {
                                        j = jOooO00o2;
                                        i22 = i17;
                                        z3 = false;
                                        break;
                                    }
                                    ooo00o = (oOO00O) r8.get(i21);
                                    long j9 = ooo00o.f2012OooO0OO;
                                    r15 = r8;
                                    i26 = size5;
                                    long j10 = oooOo2.f1744OooO00o;
                                    i27 = i17;
                                    j = jOooO00o2;
                                    jOooO00o3 = o00oO0o.OooO00o(j10, o0000O0O.OooOo.OooO0OO(j9), ((int) (j9 >> 32)) + ((int) (j10 >> 32)));
                                    if (o0ooo0o4.OooO0OO(jOooO00o3) + ooo00o.f2010OooO00o > 0) {
                                        i22 = i27;
                                        if (o0ooo0o4.OooO0OO(jOooO00o3) < i22) {
                                        }
                                        if (z5) {
                                            z3 = true;
                                            break;
                                        }
                                        i21++;
                                        size5 = i26;
                                        i17 = i22;
                                        r8 = r15;
                                        jOooO00o2 = j;
                                    } else {
                                        i22 = i27;
                                    }
                                    if (z5) {
                                        z3 = true;
                                        break;
                                    }
                                    i21++;
                                    size5 = i26;
                                    i17 = i22;
                                    r8 = r15;
                                    jOooO00o2 = j;
                                }
                                r4 = oooOo2.f1745OooO0O0;
                                size6 = r4.size();
                                i23 = 0;
                                while (true) {
                                    if (i23 < size6) {
                                        z4 = false;
                                        break;
                                    }
                                    if (((Boolean) ((oOO00O) r4.get(i23)).f2013OooO0Oo.getValue()).booleanValue()) {
                                        z4 = true;
                                        break;
                                    }
                                    i23++;
                                }
                                boolean z16 = !z4;
                                if (z3) {
                                    o000o0o0OooO00o = o000o2.OooO00o(num.intValue());
                                    iOooO00o = o0ooo0o4.OooO00o(num.intValue(), o000o0o0OooO00o.f1908OooOOOO, i15, j, z11, i22, i22, arrayList2);
                                    if (z11) {
                                        iOooO00o = (i22 - iOooO00o) - o000o0o0OooO00o.f1906OooOOO;
                                    }
                                    i24 = i16;
                                    i25 = i14;
                                    o000OO o000ooOooO00o3 = o000o0o0OooO00o.OooO00o(iOooO00o, i24, i25);
                                    arrayList4 = arrayList2;
                                    arrayList4.add(o000ooOooO00o3);
                                    o0ooo0o4.OooO0o0(o000ooOooO00o3, oooOo2);
                                } else {
                                    o000o0o0OooO00o = o000o2.OooO00o(num.intValue());
                                    iOooO00o = o0ooo0o4.OooO00o(num.intValue(), o000o0o0OooO00o.f1908OooOOOO, i15, j, z11, i22, i22, arrayList2);
                                    if (z11) {
                                        iOooO00o = (i22 - iOooO00o) - o000o0o0OooO00o.f1906OooOOO;
                                    }
                                    i24 = i16;
                                    i25 = i14;
                                    o000OO o000ooOooO00o4 = o000o0o0OooO00o.OooO00o(iOooO00o, i24, i25);
                                    arrayList4 = arrayList2;
                                    arrayList4.add(o000ooOooO00o4);
                                    o0ooo0o4.OooO0o0(o000ooOooO00o4, oooOo2);
                                }
                                arrayList2 = arrayList4;
                                i16 = i24;
                                o000o = o000o2;
                                i14 = i25;
                                i17 = i22;
                                jOooO00o2 = j;
                            }
                        }
                        i18 = i16;
                        i19 = i14;
                        arrayList3 = arrayList2;
                        o0ooo0o4.f1997OooO0Oo = o000o.f1850OooO00o.OooO0o();
                        i20 = i97;
                    }
                    if (i20 > i6) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    o000oo10 = o000oo4;
                    o000000O o000000o3 = (o000000O) layout.invoke(Integer.valueOf(i18), Integer.valueOf(i19), new o0000O00(arrayList3, o000oo10));
                    if (z14) {
                        arrayList6 = arrayList3;
                    } else {
                        arrayList6 = new ArrayList(arrayList3.size());
                        size7 = arrayList3.size();
                        while (i34 < size7) {
                            obj = arrayList3.get(i34);
                            o000oo11 = (o000OO) obj;
                            if ((o000oo11.f1918OooO0O0 < ((o000O0O0) CollectionsKt.first((List) arrayList)).f1895OooO00o && o000oo11.f1918OooO0O0 <= ((o000O0O0) CollectionsKt.last((List) arrayList)).f1895OooO00o) || o000oo11 == o000oo10) {
                                arrayList6.add(obj);
                            }
                        }
                    }
                    if (z10) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    measureResult = new o0000oo(o000o0o2, i65, z6, f, o000000o3, arrayList6, i47, i5, orientation);
                }
                o000O00O o000o00o4 = this.f1815Oooo;
                oo0oOO0 oo0ooo0 = this.f1825OoooOOo;
                Objects.requireNonNull(o000o00o4);
                Intrinsics.checkNotNullParameter(measureResult, "result");
                o000O0o o000o0o7 = o000o00o4.f1867OooO00o;
                Objects.requireNonNull(o000o0o7);
                Intrinsics.checkNotNullParameter(measureResult, "measureResult");
                o000O0O0 o000o0o8 = measureResult.f1842OooO00o;
                o000o0o7.f1915OooO0Oo = o000o0o8 != null ? o000o0o8.f1907OooOOO0 : null;
                if (o000o0o7.f1914OooO0OO || measureResult.f1848OooO0oO > 0) {
                    o000o0o7.f1914OooO0OO = true;
                    int i98 = measureResult.f1843OooO0O0;
                    if (!(((float) i98) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                        throw new IllegalStateException(OooOOO0.OooO00o("scrollOffset should be non-negative (", i98, ')').toString());
                    }
                    oo00o oo00oVarOooO0oO2 = oo0o0O0.OooO0oO(oo0o0O0.f4157OooO0O0.OooO00o(), null, false);
                    try {
                        oo00o oo00oVarOooO2 = oo00oVarOooO0oO2.OooO();
                        try {
                            o000O0O0 o000o0o9 = measureResult.f1842OooO00o;
                            o000o0o7.OooO0OO(o000o0o9 != null ? o000o0o9.f1895OooO00o : 0, i98);
                            Unit unit6 = Unit.INSTANCE;
                            oo00oVarOooO0oO2.OooOOOo(oo00oVarOooO2);
                            oo00oVarOooO0oO2.OooO0OO();
                        } catch (Throwable th) {
                            oo00oVarOooO0oO2.OooOOOo(oo00oVarOooO2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        oo00oVarOooO0oO2.OooO0OO();
                        throw th2;
                    }
                }
                o000o00o4.f1870OooO0Oo -= measureResult.f1845OooO0Oo;
                o000o00o4.f1868OooO0O0.setValue(measureResult);
                boolean z17 = measureResult.f1844OooO0OO;
                o000o00o4.f1883OooOOo0 = z17;
                o000O0O0 o000o0o10 = measureResult.f1842OooO00o;
                o000o00o4.f1881OooOOOo = ((o000o0o10 != null ? o000o0o10.f1895OooO00o : 0) == 0 && measureResult.f1843OooO0O0 == 0) ? false : true;
                oo0ooo0.setEnabled(z17 || ((o000o0o10 != null ? o000o0o10.f1895OooO00o : 0) != 0 || measureResult.f1843OooO0O0 != 0));
                return measureResult;
            } catch (Throwable th3) {
                oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                throw th3;
            }
        } catch (Throwable th4) {
            oo00oVarOooO0oO.OooO0OO();
            throw th4;
        }
    }
}
