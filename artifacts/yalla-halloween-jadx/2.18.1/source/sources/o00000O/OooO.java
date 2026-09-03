package o00000O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000O.OooO00o f26748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o00000O.OooO00o.OooO0O0<Oooo000>> f26749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f26750OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f26751OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<OooOOO> f26752OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<Float> {
        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooOOO>] */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            Object obj;
            OooOOOO oooOOOO;
            ?? r0 = OooO.this.f26752OooO0o0;
            if (r0.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = r0.get(0);
                float fOooO0OO = ((OooOOO) obj2).f26781OooO00o.OooO0OO();
                int lastIndex = CollectionsKt.getLastIndex(r0);
                int i = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        Object obj3 = r0.get(i);
                        float fOooO0OO2 = ((OooOOO) obj3).f26781OooO00o.OooO0OO();
                        if (Float.compare(fOooO0OO, fOooO0OO2) < 0) {
                            obj2 = obj3;
                            fOooO0OO = fOooO0OO2;
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            OooOOO oooOOO = (OooOOO) obj;
            return Float.valueOf((oooOOO == null || (oooOOOO = oooOOO.f26781OooO00o) == null) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooOOOO.OooO0OO());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Float> {
        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooOOO>] */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            Object obj;
            OooOOOO oooOOOO;
            ?? r0 = OooO.this.f26752OooO0o0;
            if (r0.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = r0.get(0);
                float fOooO0O0 = ((OooOOO) obj2).f26781OooO00o.OooO0O0();
                int lastIndex = CollectionsKt.getLastIndex(r0);
                int i = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        Object obj3 = r0.get(i);
                        float fOooO0O1 = ((OooOOO) obj3).f26781OooO00o.OooO0O0();
                        if (Float.compare(fOooO0O0, fOooO0O1) < 0) {
                            obj2 = obj3;
                            fOooO0O0 = fOooO0O1;
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            OooOOO oooOOO = (OooOOO) obj;
            return Float.valueOf((oooOOO == null || (oooOOOO = oooOOO.f26781OooO00o) == null) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooOOOO.OooO0O0());
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c9 A[LOOP:2: B:37:0x01a9->B:48:0x01c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0206  */
    /* JADX WARN: Code duplicated, block: B:56:0x020b  */
    /* JADX WARN: Code duplicated, block: B:59:0x025d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0274  */
    /* JADX WARN: Code duplicated, block: B:65:0x0292  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a9 A[LOOP:4: B:64:0x0290->B:72:0x02a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    public OooO(@NotNull o00000O.OooO00o oooO00o, @NotNull oo0o0Oo oo0o0oo, @NotNull List<o00000O.OooO00o.OooO0O0<Oooo000>> placeholders, @NotNull o0000O0O.OooO density, @NotNull o00000oO.o000OOo.OooO0O0 fontFamilyResolver) {
        String text;
        ArrayList arrayList;
        ?? spanStyles;
        List<o00000O.OooO00o.OooO0O0<o00Oo0>> listEmptyList;
        List paragraphStyles;
        int size;
        int i;
        int i2;
        OooOo00 other;
        String str;
        List<o00000O.OooO00o.OooO0O0<Oooo000>> list;
        int i3;
        int i4;
        ArrayList arrayList2;
        int size2;
        int i5;
        ArrayList placeholders2;
        int size3;
        int i6;
        o00000O.OooO00o.OooO0O0 oooO0O0;
        int i7;
        int i8;
        ArrayList arrayList3;
        boolean z;
        o00000O.OooO00o.OooO0O0<Oooo000> oooO0O1;
        o00000O.OooO00o.OooO0O0<Oooo000> oooO0O2;
        o00000O.OooO00o.OooO0O0 oooO0O3;
        List list2;
        boolean z2;
        boolean z3;
        o00000O.OooO00o annotatedString = oooO00o;
        oo0o0Oo style = oo0o0oo;
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        String str2 = "density";
        Intrinsics.checkNotNullParameter(density, "density");
        String str3 = "fontFamilyResolver";
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f26748OooO00o = annotatedString;
        this.f26749OooO0O0 = placeholders;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f26750OooO0OO = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new OooO0O0());
        this.f26751OooO0Oo = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new OooO00o());
        OooOo00 defaultParagraphStyle = style.f26902OooO0O0;
        o00000O.OooO00o oooO00o2 = o00000O.OooO0O0.f26772OooO00o;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        int length = annotatedString.f26756Oooo0o.length();
        List<o00000O.OooO00o.OooO0O0<OooOo00>> list3 = annotatedString.f26758Oooo0oo;
        ArrayList arrayList4 = new ArrayList();
        int size4 = list3.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size4) {
            List<o00000O.OooO00o.OooO0O0<OooOo00>> list4 = list3;
            o00000O.OooO00o.OooO0O0<OooOo00> oooO0O4 = list3.get(i9);
            int i11 = size4;
            OooOo00 oooOo00 = oooO0O4.f26768OooO00o;
            int i12 = oooO0O4.f26769OooO0O0;
            int i13 = oooO0O4.f26770OooO0OO;
            String str4 = str3;
            if (i12 != i10) {
                arrayList4.add(new o00000O.OooO00o.OooO0O0(defaultParagraphStyle, i10, i12));
            }
            arrayList4.add(new o00000O.OooO00o.OooO0O0(defaultParagraphStyle.OooO00o(oooOo00), i12, i13));
            i9++;
            i10 = i13;
            size4 = i11;
            str3 = str4;
            list3 = list4;
        }
        String str5 = str3;
        if (i10 != length) {
            arrayList4.add(new o00000O.OooO00o.OooO0O0(defaultParagraphStyle, i10, length));
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new o00000O.OooO00o.OooO0O0(defaultParagraphStyle, 0, 0));
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size5 = arrayList4.size();
        int i14 = 0;
        while (i14 < size5) {
            o00000O.OooO00o.OooO0O0 oooO0O5 = (o00000O.OooO00o.OooO0O0) arrayList4.get(i14);
            int i15 = oooO0O5.f26769OooO0O0;
            int i16 = oooO0O5.f26770OooO0OO;
            if (i15 != i16) {
                text = annotatedString.f26756Oooo0o.substring(i15, i16);
                Intrinsics.checkNotNullExpressionValue(text, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                text = "";
            }
            if (i15 == i16) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                if (i15 != 0 || i16 < annotatedString.f26756Oooo0o.length()) {
                    List<o00000O.OooO00o.OooO0O0<o00Oo0>> list5 = annotatedString.f26757Oooo0oO;
                    ArrayList arrayList6 = new ArrayList(list5.size());
                    int size6 = list5.size();
                    int i17 = 0;
                    while (i17 < size6) {
                        int i18 = size6;
                        o00000O.OooO00o.OooO0O0<o00Oo0> oooO0O6 = list5.get(i17);
                        List<o00000O.OooO00o.OooO0O0<o00Oo0>> list6 = list5;
                        o00000O.OooO00o.OooO0O0<o00Oo0> oooO0O7 = oooO0O6;
                        ArrayList arrayList7 = arrayList5;
                        if (o00000O.OooO0O0.OooO0OO(i15, i16, oooO0O7.f26769OooO0O0, oooO0O7.f26770OooO0OO)) {
                            arrayList6.add(oooO0O6);
                        }
                        i17++;
                        size6 = i18;
                        list5 = list6;
                        arrayList5 = arrayList7;
                    }
                    arrayList = arrayList5;
                    spanStyles = new ArrayList(arrayList6.size());
                    int i19 = 0;
                    for (int size7 = arrayList6.size(); i19 < size7; size7 = size7) {
                        o00000O.OooO00o.OooO0O0 oooO0O8 = (o00000O.OooO00o.OooO0O0) arrayList6.get(i19);
                        spanStyles.add(new o00000O.OooO00o.OooO0O0(oooO0O8.f26768OooO00o, RangesKt.coerceIn(oooO0O8.f26769OooO0O0, i15, i16) - i15, RangesKt.coerceIn(oooO0O8.f26770OooO0OO, i15, i16) - i15));
                        i19++;
                        arrayList6 = arrayList6;
                    }
                } else {
                    listEmptyList = annotatedString.f26757Oooo0oO;
                }
                paragraphStyles = CollectionsKt.emptyList();
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
                Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
                List annotations = CollectionsKt.emptyList();
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
                Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                size = paragraphStyles.size();
                i = -1;
                i2 = 0;
                while (i2 < size) {
                    oooO0O3 = (o00000O.OooO00o.OooO0O0) paragraphStyles.get(i2);
                    list2 = paragraphStyles;
                    if (oooO0O3.f26769OooO0O0 >= i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                    }
                    if (oooO0O3.f26770OooO0OO <= text.length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ParagraphStyle range [");
                        sbOooO0o0.append(oooO0O3.f26769OooO0O0);
                        sbOooO0o0.append(", ");
                        throw new IllegalArgumentException(o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, oooO0O3.f26770OooO0OO, ") is out of boundary").toString());
                    }
                    i = oooO0O3.f26770OooO0OO;
                    i2++;
                    paragraphStyles = list2;
                }
                other = (OooOo00) oooO0O5.f26768OooO00o;
                if (other.f26794OooO0O0 != null) {
                    str = str2;
                } else {
                    str = str2;
                    other = new OooOo00(other.f26793OooO00o, defaultParagraphStyle.f26794OooO0O0, other.f26795OooO0OO, other.f26796OooO0Oo, other.f26798OooO0o0, other.f26797OooO0o);
                }
                Intrinsics.checkNotNullParameter(other, "other");
                oo0o0Oo style2 = new oo0o0Oo(style.f26901OooO00o, style.f26902OooO0O0.OooO00o(other));
                list = this.f26749OooO0O0;
                i3 = oooO0O5.f26769OooO0O0;
                i4 = oooO0O5.f26770OooO0OO;
                arrayList2 = new ArrayList(list.size());
                size2 = list.size();
                i5 = 0;
                while (i5 < size2) {
                    o00000O.OooO00o.OooO0O0 oooO0O9 = oooO0O5;
                    oooO0O1 = list.get(i5);
                    List<o00000O.OooO00o.OooO0O0<Oooo000>> list7 = list;
                    oooO0O2 = oooO0O1;
                    int i20 = size2;
                    if (o00000O.OooO0O0.OooO0OO(i3, i4, oooO0O2.f26769OooO0O0, oooO0O2.f26770OooO0OO)) {
                        arrayList2.add(oooO0O1);
                    }
                    i5++;
                    oooO0O5 = oooO0O9;
                    list = list7;
                    size2 = i20;
                }
                o00000O.OooO00o.OooO0O0 oooO0O10 = oooO0O5;
                placeholders2 = new ArrayList(arrayList2.size());
                size3 = arrayList2.size();
                i6 = 0;
                while (i6 < size3) {
                    oooO0O0 = (o00000O.OooO00o.OooO0O0) arrayList2.get(i6);
                    i7 = size3;
                    i8 = oooO0O0.f26769OooO0O0;
                    arrayList3 = arrayList2;
                    if (i3 <= i8 || oooO0O0.f26770OooO0OO > i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                    }
                    placeholders2.add(new o00000O.OooO00o.OooO0O0(oooO0O0.f26768OooO00o, i8 - i3, oooO0O0.f26770OooO0OO - i3));
                    i6++;
                    size3 = i7;
                    arrayList2 = arrayList3;
                    i4 = i4;
                }
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(style2, "style");
                Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
                Intrinsics.checkNotNullParameter(placeholders2, "placeholders");
                String str6 = str;
                Intrinsics.checkNotNullParameter(density, str6);
                String str7 = str5;
                Intrinsics.checkNotNullParameter(fontFamilyResolver, str7);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(style2, "style");
                Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
                Intrinsics.checkNotNullParameter(placeholders2, "placeholders");
                Intrinsics.checkNotNullParameter(density, str6);
                Intrinsics.checkNotNullParameter(fontFamilyResolver, str7);
                OooOOO oooOOO = new OooOOO(new o0000O00.OooO0o(text, style2, spanStyles, placeholders2, fontFamilyResolver, density), oooO0O10.f26769OooO0O0, oooO0O10.f26770OooO0OO);
                ArrayList arrayList8 = arrayList;
                arrayList8.add(oooOOO);
                i14++;
                style = oo0o0oo;
                arrayList4 = arrayList4;
                str2 = str6;
                defaultParagraphStyle = defaultParagraphStyle;
                arrayList5 = arrayList8;
                str5 = str7;
                size5 = size5;
                annotatedString = oooO00o;
            }
            spanStyles = listEmptyList;
            arrayList = arrayList5;
            paragraphStyles = CollectionsKt.emptyList();
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
            Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
            List annotations2 = CollectionsKt.emptyList();
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
            Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
            Intrinsics.checkNotNullParameter(annotations2, "annotations");
            size = paragraphStyles.size();
            i = -1;
            i2 = 0;
            while (i2 < size) {
                oooO0O3 = (o00000O.OooO00o.OooO0O0) paragraphStyles.get(i2);
                list2 = paragraphStyles;
                if (oooO0O3.f26769OooO0O0 >= i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
                if (oooO0O3.f26770OooO0OO <= text.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("ParagraphStyle range [");
                    sbOooO0o1.append(oooO0O3.f26769OooO0O0);
                    sbOooO0o1.append(", ");
                    throw new IllegalArgumentException(o0O0O00.o0ooOOo.OooO00o(sbOooO0o1, oooO0O3.f26770OooO0OO, ") is out of boundary").toString());
                }
                i = oooO0O3.f26770OooO0OO;
                i2++;
                paragraphStyles = list2;
            }
            other = (OooOo00) oooO0O5.f26768OooO00o;
            if (other.f26794OooO0O0 != null) {
                str = str2;
            } else {
                str = str2;
                other = new OooOo00(other.f26793OooO00o, defaultParagraphStyle.f26794OooO0O0, other.f26795OooO0OO, other.f26796OooO0Oo, other.f26798OooO0o0, other.f26797OooO0o);
            }
            Intrinsics.checkNotNullParameter(other, "other");
            oo0o0Oo style3 = new oo0o0Oo(style.f26901OooO00o, style.f26902OooO0O0.OooO00o(other));
            list = this.f26749OooO0O0;
            i3 = oooO0O5.f26769OooO0O0;
            i4 = oooO0O5.f26770OooO0OO;
            arrayList2 = new ArrayList(list.size());
            size2 = list.size();
            i5 = 0;
            while (i5 < size2) {
                o00000O.OooO00o.OooO0O0 oooO0O11 = oooO0O5;
                oooO0O1 = list.get(i5);
                List<o00000O.OooO00o.OooO0O0<Oooo000>> list8 = list;
                oooO0O2 = oooO0O1;
                int i21 = size2;
                if (o00000O.OooO0O0.OooO0OO(i3, i4, oooO0O2.f26769OooO0O0, oooO0O2.f26770OooO0OO)) {
                    arrayList2.add(oooO0O1);
                }
                i5++;
                oooO0O5 = oooO0O11;
                list = list8;
                size2 = i21;
            }
            o00000O.OooO00o.OooO0O0 oooO0O12 = oooO0O5;
            placeholders2 = new ArrayList(arrayList2.size());
            size3 = arrayList2.size();
            i6 = 0;
            while (i6 < size3) {
                oooO0O0 = (o00000O.OooO00o.OooO0O0) arrayList2.get(i6);
                i7 = size3;
                i8 = oooO0O0.f26769OooO0O0;
                arrayList3 = arrayList2;
                if (i3 <= i8) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                placeholders2.add(new o00000O.OooO00o.OooO0O0(oooO0O0.f26768OooO00o, i8 - i3, oooO0O0.f26770OooO0OO - i3));
                i6++;
                size3 = i7;
                arrayList2 = arrayList3;
                i4 = i4;
            }
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style3, "style");
            Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
            Intrinsics.checkNotNullParameter(placeholders2, "placeholders");
            String str8 = str;
            Intrinsics.checkNotNullParameter(density, str8);
            String str9 = str5;
            Intrinsics.checkNotNullParameter(fontFamilyResolver, str9);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style3, "style");
            Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
            Intrinsics.checkNotNullParameter(placeholders2, "placeholders");
            Intrinsics.checkNotNullParameter(density, str8);
            Intrinsics.checkNotNullParameter(fontFamilyResolver, str9);
            OooOOO oooOOO2 = new OooOOO(new o0000O00.OooO0o(text, style3, spanStyles, placeholders2, fontFamilyResolver, density), oooO0O12.f26769OooO0O0, oooO0O12.f26770OooO0OO);
            ArrayList arrayList9 = arrayList;
            arrayList9.add(oooOOO2);
            i14++;
            style = oo0o0oo;
            arrayList4 = arrayList4;
            str2 = str8;
            defaultParagraphStyle = defaultParagraphStyle;
            arrayList5 = arrayList9;
            str5 = str9;
            size5 = size5;
            annotatedString = oooO00o;
        }
        this.f26752OooO0o0 = arrayList5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooOOO>] */
    @Override // o00000O.OooOOOO
    public final boolean OooO00o() {
        ?? r0 = this.f26752OooO0o0;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            if (((OooOOO) r0.get(i)).f26781OooO00o.OooO00o()) {
                return true;
            }
        }
        return false;
    }

    @Override // o00000O.OooOOOO
    public final float OooO0O0() {
        return ((Number) this.f26750OooO0OO.getValue()).floatValue();
    }

    @Override // o00000O.OooOOOO
    public final float OooO0OO() {
        return ((Number) this.f26751OooO0Oo.getValue()).floatValue();
    }
}
