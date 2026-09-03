package p029Oooo0oO;

import Oooo0.o0OoOo0;
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
import o0000O0O.OooO;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
import o0000O0O.Oooo000;
import o0000O0O.o000oOoO;
import o0O0O00.o000000O;
import p027Oooo0o.OooOOO0;
import p027Oooo0o.o00oO0o;
import p028Oooo0o0.o00O000;
import p028Oooo0o0.o0O00O0o;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0oOO0 extends Lambda implements Function2<OooOo, OooO0O0, o00OO0O0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f2500Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f2501Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00O0o f2502Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f2503Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO0o f2504OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function2<OooO, OooO0O0, List<Integer>> f2505OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O00 f2506OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooOo f2507OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ o00O000 f2508OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ Oooo0.oo0oOO0 f2509o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0oOO0(boolean z, o0O00O0o o0o00o0o, boolean z2, o00OOOOo o00ooooo2, o00O00 o00o01, Function2<? super OooO, ? super OooO0O0, ? extends List<Integer>> function2, o00O000.OooOo oooOo, o00O000.OooO0o oooO0o, o00O000 o00o001, Oooo0.oo0oOO0 oo0ooo0) {
        super(2);
        this.f2501Oooo0o = z;
        this.f2502Oooo0oO = o0o00o0o;
        this.f2503Oooo0oo = z2;
        this.f2500Oooo = o00ooooo2;
        this.f2506OoooO00 = o00o01;
        this.f2505OoooO0 = function2;
        this.f2507OoooO0O = oooOo;
        this.f2504OoooO = oooO0o;
        this.f2508OoooOO0 = o00o001;
        this.f2509o000oOoO = oo0ooo0;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0395  */
    /* JADX WARN: Code duplicated, block: B:142:0x039c  */
    /* JADX WARN: Code duplicated, block: B:150:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:151:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03db  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:173:0x040f A[LOOP:5: B:172:0x040d->B:173:0x040f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0429  */
    /* JADX WARN: Code duplicated, block: B:178:0x0432 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0434  */
    /* JADX WARN: Code duplicated, block: B:180:0x0438  */
    /* JADX WARN: Code duplicated, block: B:184:0x0456 A[LOOP:7: B:183:0x0454->B:184:0x0456, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x045f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0463  */
    /* JADX WARN: Code duplicated, block: B:189:0x047b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0485 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x0487  */
    /* JADX WARN: Code duplicated, block: B:195:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:203:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:204:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:207:0x04db  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e9 A[LOOP:8: B:201:0x04c9->B:210:0x04e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:213:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:215:0x050c A[LOOP:18: B:214:0x050a->B:215:0x050c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:218:0x0532  */
    /* JADX WARN: Code duplicated, block: B:221:0x053e A[LOOP:9: B:217:0x0530->B:221:0x053e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x0544  */
    /* JADX WARN: Code duplicated, block: B:225:0x0552  */
    /* JADX WARN: Code duplicated, block: B:227:0x055a  */
    /* JADX WARN: Code duplicated, block: B:228:0x055c  */
    /* JADX WARN: Code duplicated, block: B:230:0x055f  */
    /* JADX WARN: Code duplicated, block: B:232:0x0562  */
    /* JADX WARN: Code duplicated, block: B:233:0x0564  */
    /* JADX WARN: Code duplicated, block: B:235:0x0567  */
    /* JADX WARN: Code duplicated, block: B:238:0x057f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0593  */
    /* JADX WARN: Code duplicated, block: B:241:0x0596  */
    /* JADX WARN: Code duplicated, block: B:243:0x059a  */
    /* JADX WARN: Code duplicated, block: B:244:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:247:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:248:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:254:0x05db  */
    /* JADX WARN: Code duplicated, block: B:266:0x0636  */
    /* JADX WARN: Code duplicated, block: B:268:0x064f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0653  */
    /* JADX WARN: Code duplicated, block: B:272:0x0659  */
    /* JADX WARN: Code duplicated, block: B:273:0x0661  */
    /* JADX WARN: Code duplicated, block: B:276:0x066d  */
    /* JADX WARN: Code duplicated, block: B:277:0x0678  */
    /* JADX WARN: Code duplicated, block: B:280:0x0694  */
    /* JADX WARN: Code duplicated, block: B:281:0x0699 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:282:0x069b  */
    /* JADX WARN: Code duplicated, block: B:283:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:287:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:288:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:291:0x06de A[LOOP:14: B:290:0x06dc->B:291:0x06de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x0706  */
    /* JADX WARN: Code duplicated, block: B:294:0x070f  */
    /* JADX WARN: Code duplicated, block: B:296:0x071b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0736  */
    /* JADX WARN: Code duplicated, block: B:301:0x0751  */
    /* JADX WARN: Code duplicated, block: B:302:0x0771  */
    /* JADX WARN: Code duplicated, block: B:304:0x0796  */
    /* JADX WARN: Code duplicated, block: B:305:0x079d  */
    /* JADX WARN: Code duplicated, block: B:310:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:314:0x0801  */
    /* JADX WARN: Code duplicated, block: B:319:0x0836  */
    /* JADX WARN: Code duplicated, block: B:322:0x083b A[LOOP:16: B:313:0x07ff->B:322:0x083b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:326:0x0857  */
    /* JADX WARN: Code duplicated, block: B:329:0x086d A[LOOP:17: B:325:0x0855->B:329:0x086d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:340:0x088a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0893  */
    /* JADX WARN: Code duplicated, block: B:344:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:351:0x0906  */
    /* JADX WARN: Code duplicated, block: B:352:0x090a  */
    /* JADX WARN: Code duplicated, block: B:355:0x0926  */
    /* JADX WARN: Code duplicated, block: B:356:0x0929  */
    /* JADX WARN: Code duplicated, block: B:480:0x051f A[EDGE_INSN: B:480:0x051f->B:216:0x051f BREAK  A[LOOP:8: B:201:0x04c9->B:210:0x04e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x05ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x07b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0839 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0847 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0870 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x086b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0oO.o000O>] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0oO.o000O>] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList, java.util.List, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0oO.o000O>] */
    /* JADX WARN: Type inference failed for: r3v131, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v52 */
    @Override // kotlin.jvm.functions.Function2
    public final o00OO0O0 invoke(OooOo oooOo, OooO0O0 oooO0O0) throws Throwable {
        int i;
        float fOooO00o;
        float fOooO00o2;
        long jOooO00o;
        int iOooO0o0;
        int iOooO0OO;
        int i2;
        int i3;
        int i4;
        int i5;
        o0oOOo o0oooo2;
        int i6;
        long j;
        int iOooO0o;
        int iOooO0oO;
        int i7;
        int i8;
        boolean z;
        int size;
        int i9;
        int i10;
        int length;
        ArrayList arrayList;
        ArrayList positionedItems;
        ArrayList arrayList2;
        int size2;
        int i11;
        int i12;
        int i13;
        int size3;
        int i14;
        boolean z2;
        boolean z3;
        int i15;
        int i16;
        long jOooO00o2;
        oo0O oo0o;
        oo0O oo0o2;
        int size4;
        int i17;
        float f;
        o00oOoo o00oooo2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int size5;
        int i24;
        ArrayList arrayList3;
        int i25;
        oo00oO oo00oo;
        int iOooO0O0;
        Iterator it;
        ArrayList arrayList4;
        Map.Entry entry;
        o000O o000o;
        oo00oO oo00oo2;
        Integer num;
        int size6;
        int i26;
        ?? r6;
        long j2;
        int i27;
        oo00oO oo00oo3;
        boolean z4;
        ?? r1;
        int size7;
        int i28;
        boolean z5;
        long jOooO0Oo;
        oo00oO oo00oo4;
        o0O00o0 o0o00o0OooO00o;
        int iOooO00o;
        ArrayList arrayList5;
        o0O00OO o0o00oo2;
        ?? r17;
        int i29;
        long jOooO00o3;
        boolean z6;
        oo0O oo0o3;
        o000O o000o2;
        ArrayList arrayList6;
        int i30;
        o000O o000o3;
        char c;
        int iOooO0O1;
        int iOooO0OO2;
        Integer num2;
        long j3;
        int iOooO0O2;
        int iOooO00o2;
        long jOooO00o4;
        int iOooO0o2;
        int i31;
        int iIntValue;
        int iMax;
        oo0O oo0o4;
        o000O o000o4;
        char c2;
        int iOooO0O3;
        int iOooO0OO3;
        boolean z7;
        Orientation orientation;
        o00OO0O0 measureResult;
        int size8;
        int[] iArr;
        int i32;
        int[] iArr2;
        int i33;
        int[] iArr3;
        IntProgression indices;
        int first;
        int last;
        int step;
        int i34;
        int i35;
        o0oOOo o0oooo3;
        o00O000.OooOo oooOo2;
        int i36;
        boolean z8;
        int size9;
        int i37;
        o0O00o0[] o0o00o0Arr;
        o0O00o0 o0o00o1;
        int i38;
        Object obj;
        o0O00o0[] o0o00o0Arr2;
        o0O00o0[] o0o00o0Arr3;
        o0O00o0 o0o00o2;
        OooOo density = oooOo;
        long j4 = oooO0O0.f27302OooO00o;
        Intrinsics.checkNotNullParameter(density, "$this$null");
        o0OoOo0.OooO00o(j4, this.f2501Oooo0o ? Orientation.Vertical : Orientation.Horizontal);
        int iOoooooO = this.f2501Oooo0o ? density.OoooooO(this.f2502Oooo0oO.OooO0O0(density.getLayoutDirection())) : density.OoooooO(PaddingKt.OooO0OO(this.f2502Oooo0oO, density.getLayoutDirection()));
        int iOoooooO2 = this.f2501Oooo0o ? density.OoooooO(this.f2502Oooo0oO.OooO0OO(density.getLayoutDirection())) : density.OoooooO(PaddingKt.OooO0O0(this.f2502Oooo0oO, density.getLayoutDirection()));
        int iOoooooO3 = density.OoooooO(this.f2502Oooo0oO.OooO0Oo());
        int iOoooooO4 = density.OoooooO(this.f2502Oooo0oO.OooO00o());
        int i39 = iOoooooO3 + iOoooooO4;
        int i40 = iOoooooO + iOoooooO2;
        boolean z9 = this.f2501Oooo0o;
        int i41 = z9 ? i39 : i40;
        if (z9 && !this.f2503Oooo0oo) {
            i = iOoooooO3;
        } else if (z9 && this.f2503Oooo0oo) {
            i = iOoooooO4;
        } else {
            i = (z9 || this.f2503Oooo0oo) ? iOoooooO2 : iOoooooO;
        }
        int i42 = i41 - i;
        long jOooO0oO = OooO0OO.OooO0oO(j4, -i40, -i39);
        this.f2500Oooo.OooO0oO(this.f2506OoooO00);
        o00OOOO0 o00oooo0OooO0oO = this.f2506OoooO00.OooO0oO();
        List<Integer> listInvoke = this.f2505OoooO0.invoke(density, new OooO0O0(j4));
        int size10 = listInvoke.size();
        if (size10 != o00oooo0OooO0oO.f2362OooO) {
            o00oooo0OooO0oO.f2362OooO = size10;
            o00oooo0OooO0oO.f2364OooO0O0.clear();
            o00oooo0OooO0oO.f2364OooO0O0.add(new o00OOOO0.OooO00o(0));
            o00oooo0OooO0oO.f2365OooO0OO = 0;
            o00oooo0OooO0oO.f2366OooO0Oo = 0;
            o00oooo0OooO0oO.f2367OooO0o = -1;
            o00oooo0OooO0oO.f2369OooO0oO.clear();
        }
        o00OOOOo o00ooooo2 = this.f2500Oooo;
        Objects.requireNonNull(o00ooooo2);
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        o00ooooo2.f2384OooO0o.setValue(density);
        this.f2500Oooo.f2385OooO0o0.setValue(Integer.valueOf(listInvoke.size()));
        if (this.f2501Oooo0o) {
            o00O000.OooOo oooOo3 = this.f2507OoooO0O;
            if (oooOo3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            fOooO00o = oooOo3.OooO00o();
        } else {
            o00O000.OooO0o oooO0o = this.f2504OoooO;
            if (oooO0o == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            fOooO00o = oooO0o.OooO00o();
        }
        int iOoooooO5 = density.OoooooO(fOooO00o);
        if (this.f2501Oooo0o) {
            o00O000.OooO0o oooO0o2 = this.f2504OoooO;
            if (oooO0o2 != null) {
                fOooO00o2 = oooO0o2.OooO00o();
            } else {
                fOooO00o2 = 0;
            }
        } else {
            o00O000.OooOo oooOo4 = this.f2507OoooO0O;
            if (oooOo4 != null) {
                fOooO00o2 = oooOo4.OooO00o();
            } else {
                fOooO00o2 = 0;
            }
        }
        int iOoooooO6 = density.OoooooO(fOooO00o2);
        int iOooO0oo = this.f2506OoooO00.OooO0oo();
        int iOooO0oO2 = this.f2501Oooo0o ? OooO0O0.OooO0oO(j4) - i39 : OooO0O0.OooO0oo(j4) - i40;
        if (!this.f2503Oooo0oo || iOooO0oO2 > 0) {
            jOooO00o = Oooo000.OooO00o(iOoooooO, iOoooooO3);
        } else {
            boolean z10 = this.f2501Oooo0o;
            if (!z10) {
                iOoooooO += iOooO0oO2;
            }
            if (z10) {
                iOoooooO3 += iOooO0oO2;
            }
            jOooO00o = Oooo000.OooO00o(iOoooooO, iOoooooO3);
        }
        int i43 = iOooO0oO2;
        int i44 = i;
        long j5 = jOooO0oO;
        oo00oO measuredItemProvider = new oo00oO(this.f2506OoooO00, density, iOoooooO5, new o00O0OO(density, this.f2501Oooo0o, this.f2503Oooo0oo, i, i42, this.f2508OoooOO0, jOooO00o));
        boolean z11 = this.f2501Oooo0o;
        o0O0o measuredLineProvider = new o0O0o(z11, listInvoke, iOoooooO6, iOooO0oo, iOoooooO5, measuredItemProvider, o00oooo0OooO0oO, new o00O0OOO(z11, listInvoke, density, iOoooooO6));
        o00OOOOo o00ooooo3 = this.f2500Oooo;
        o00O0OO0 o00o0oo1 = new o00O0OO0(o00oooo0OooO0oO, measuredLineProvider);
        Objects.requireNonNull(o00ooooo3);
        Intrinsics.checkNotNullParameter(o00o0oo1, "<set-?>");
        o00ooooo3.f2394OooOOOo.setValue(o00o0oo1);
        o00OOOOo o00ooooo4 = this.f2500Oooo;
        oo00o oo00oVarOooO0oO = oo0o0O0.OooO0oO(oo0o0O0.f4157OooO0O0.OooO00o(), null, false);
        try {
            oo00o oo00oVarOooO = oo00oVarOooO0oO.OooO();
            try {
                int i45 = iOooO0oo;
                if (o00ooooo4.OooO0Oo() < i45 || i45 <= 0) {
                    int iOooO0OO4 = o00oooo0OooO0oO.OooO0OO(o00ooooo4.OooO0Oo());
                    iOooO0o0 = o00ooooo4.OooO0o0();
                    iOooO0OO = iOooO0OO4;
                } else {
                    iOooO0OO = o00oooo0OooO0oO.OooO0OO(i45 - 1);
                    iOooO0o0 = 0;
                }
                Unit unit = Unit.INSTANCE;
                oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                oo00oVarOooO0oO.OooO0OO();
                int size11 = listInvoke.size();
                float f2 = this.f2500Oooo.f2383OooO0Oo;
                boolean z12 = this.f2501Oooo0o;
                o00O000.OooOo oooOo5 = this.f2507OoooO0O;
                o00O000.OooO0o oooO0o3 = this.f2504OoooO;
                boolean z13 = this.f2503Oooo0oo;
                o00O000 placementAnimator = this.f2508OoooOO0;
                oo0o0O0 layout = oo0o0o0;
                int i46 = size11;
                o00O000.OooOo oooOo6 = oooOo5;
                oo0o0O0 oo0o0o0 = new oo0o0O0(density, j4, i40, i39);
                Intrinsics.checkNotNullParameter(measuredLineProvider, "measuredLineProvider");
                String str = "measuredItemProvider";
                Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
                Intrinsics.checkNotNullParameter(density, "density");
                Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
                Intrinsics.checkNotNullParameter(layout, "layout");
                if (!(i44 >= 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(i42 >= 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (i45 <= 0) {
                    measureResult = new o00OO0O0(null, 0, false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (o000000O) layout.invoke(Integer.valueOf(OooO0O0.OooOO0(j5)), Integer.valueOf(OooO0O0.OooO(j5)), o00OO000.f2339Oooo0o), CollectionsKt.emptyList(), 0, z12 ? Orientation.Vertical : Orientation.Horizontal);
                } else {
                    int iRoundToInt = MathKt.roundToInt(f2);
                    int i47 = iOooO0o0 - iRoundToInt;
                    if ((iOooO0OO == 0) && i47 < 0) {
                        iRoundToInt += i47;
                        i47 = 0;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    int i48 = i47 - i44;
                    int i49 = -i44;
                    while (i48 < 0 && iOooO0OO + 0 > 0) {
                        iOooO0OO--;
                        o0oOOo o0ooooOooO00o = measuredLineProvider.OooO00o(iOooO0OO);
                        arrayList7.add(0, o0ooooOooO00o);
                        i48 += o0ooooOooO00o.f2472OooOO0;
                        str = str;
                    }
                    String str2 = str;
                    if (i48 < i49) {
                        iRoundToInt += i48;
                        i48 = i49;
                    }
                    int i50 = i48 + i44;
                    int i51 = i43 + i42;
                    int i52 = iOooO0OO;
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(i51, 0);
                    int i53 = -i50;
                    int i54 = i52;
                    int i55 = 0;
                    for (int size12 = arrayList7.size(); i55 < size12; size12 = size12) {
                        i54++;
                        i53 += ((o0oOOo) arrayList7.get(i55)).f2472OooOO0;
                        i55++;
                    }
                    int i56 = i53;
                    int i57 = i50;
                    int i58 = i49;
                    int i59 = i54;
                    while (true) {
                        if (i56 > iCoerceAtLeast && !arrayList7.isEmpty()) {
                            break;
                        }
                        int i60 = iCoerceAtLeast;
                        o0oOOo o0ooooOooO00o2 = measuredLineProvider.OooO00o(i59);
                        int i61 = i59;
                        o0O00o0[] o0o00o0Arr4 = o0ooooOooO00o2.f2465OooO0O0;
                        if (o0o00o0Arr4.length == 0) {
                            break;
                        }
                        String str3 = str2;
                        OooOo oooOo7 = density;
                        int i62 = i45;
                        boolean z14 = z12;
                        long j6 = j5;
                        o00O000.OooOo oooOo8 = oooOo6;
                        ArrayList arrayList8 = arrayList7;
                        o0O0o o0o0o = measuredLineProvider;
                        oo00oO oo00oo5 = measuredItemProvider;
                        int i63 = i46;
                        oo0o0O0 oo0o0o1 = layout;
                        i56 += o0ooooOooO00o2.f2472OooOO0;
                        int i64 = i58;
                        if (i56 <= i64) {
                            i58 = i64;
                            if (((o0O00o0) ArraysKt.last(o0o00o0Arr4)).f2432OooO00o != i62 - 1) {
                                i57 -= o0ooooOooO00o2.f2472OooOO0;
                                i52 = i61 + 1;
                            }
                            i59 = i61 + 1;
                            density = oooOo7;
                            i46 = i63;
                            oooOo6 = oooOo8;
                            layout = oo0o0o1;
                            arrayList7 = arrayList8;
                            iCoerceAtLeast = i60;
                            j5 = j6;
                            str2 = str3;
                            i45 = i62;
                            z12 = z14;
                            measuredItemProvider = oo00oo5;
                            measuredLineProvider = o0o0o;
                        } else {
                            i58 = i64;
                        }
                        arrayList8.add(o0ooooOooO00o2);
                        i59 = i61 + 1;
                        density = oooOo7;
                        i46 = i63;
                        oooOo6 = oooOo8;
                        layout = oo0o0o1;
                        arrayList7 = arrayList8;
                        iCoerceAtLeast = i60;
                        j5 = j6;
                        str2 = str3;
                        i45 = i62;
                        z12 = z14;
                        measuredItemProvider = oo00oo5;
                        measuredLineProvider = o0o0o;
                    }
                    if (i56 < i43) {
                        int i65 = i43 - i56;
                        i57 -= i65;
                        i56 += i65;
                        while (i57 < i44 && i52 + 0 > 0) {
                            int i66 = i52 - 1;
                            int i67 = i45;
                            o0oOOo o0ooooOooO00o3 = measuredLineProvider.OooO00o(i66);
                            arrayList7.add(0, o0ooooOooO00o3);
                            i57 += o0ooooOooO00o3.f2472OooOO0;
                            i52 = i66;
                            measuredLineProvider = measuredLineProvider;
                            i45 = i67;
                        }
                        i2 = i45;
                        iRoundToInt += i65;
                        if (i57 < 0) {
                            iRoundToInt += i57;
                            i4 = 0;
                            i3 = i56 + i57;
                        }
                        if (MathKt.getSign(MathKt.roundToInt(f2)) == MathKt.getSign(iRoundToInt) && Math.abs(MathKt.roundToInt(f2)) >= Math.abs(iRoundToInt)) {
                            f2 = iRoundToInt;
                        }
                        i5 = -i4;
                        o0oOOo o0oooo4 = (o0oOOo) CollectionsKt.first((List) arrayList7);
                        if (i44 > 0) {
                            size9 = arrayList7.size();
                            i37 = 0;
                            while (i37 < size9) {
                                int i68 = ((o0oOOo) arrayList7.get(i37)).f2472OooOO0;
                                if (i4 == 0 || i68 > i4 || i37 == CollectionsKt.getLastIndex(arrayList7)) {
                                    break;
                                }
                                i4 -= i68;
                                i37++;
                                o0oooo4 = (o0oOOo) arrayList7.get(i37);
                            }
                        }
                        o0oooo2 = o0oooo4;
                        i6 = i4;
                        if (z12) {
                            iOooO0o = OooO0O0.OooO0oo(j5);
                            j = j5;
                        } else {
                            j = j5;
                            iOooO0o = OooO0OO.OooO0o(j, i3);
                        }
                        if (z12) {
                            iOooO0oO = OooO0OO.OooO0o0(j, i3);
                        } else {
                            iOooO0oO = OooO0O0.OooO0oO(j);
                        }
                        i7 = iOooO0oO;
                        if (z12) {
                            i8 = i7;
                        } else {
                            i8 = iOooO0o;
                        }
                        if (i3 < Math.min(i8, i43)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (i5 == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (!z8) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                        i9 = i7;
                        i10 = 0;
                        length = 0;
                        for (size = arrayList7.size(); i10 < size; size = size) {
                            length += ((o0oOOo) arrayList7.get(i10)).f2465OooO0O0.length;
                            i10++;
                        }
                        arrayList = new ArrayList(length);
                        if (z) {
                            size8 = arrayList7.size();
                            iArr = new int[size8];
                            i32 = 0;
                            while (i32 < size8) {
                                if (z13) {
                                    i36 = (size8 - i32) - 1;
                                } else {
                                    i36 = i32;
                                }
                                iArr[i32] = ((o0oOOo) arrayList7.get(i36)).f2463OooO;
                                i32++;
                                arrayList = arrayList;
                            }
                            positionedItems = arrayList;
                            iArr2 = new int[size8];
                            for (i33 = 0; i33 < size8; i33++) {
                                iArr2[i33] = 0;
                            }
                            if (z12) {
                                oooOo2 = oooOo6;
                                if (oooOo2 != null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                oooOo2.OooO0OO(density, i8, iArr, iArr2);
                                iArr3 = iArr2;
                            } else {
                                if (oooO0o3 != null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                iArr3 = iArr2;
                                oooO0o3.OooO0O0(density, i8, iArr, LayoutDirection.Ltr, iArr3);
                            }
                            indices = ArraysKt.getIndices(iArr3);
                            if (z13) {
                                indices = RangesKt.reversed(indices);
                            }
                            first = indices.getFirst();
                            last = indices.getLast();
                            step = indices.getStep();
                            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                                while (true) {
                                    i34 = iArr3[first];
                                    if (z13) {
                                        i35 = (size8 - first) - 1;
                                    } else {
                                        i35 = first;
                                    }
                                    o0oooo3 = (o0oOOo) arrayList7.get(i35);
                                    if (z13) {
                                        i34 = (i8 - i34) - o0oooo3.f2463OooO;
                                    }
                                    positionedItems.addAll(o0oooo3.OooO00o(i34, iOooO0o, i9));
                                    if (first == last) {
                                        break;
                                    }
                                    first += step;
                                }
                            }
                        } else {
                            layout = layout;
                            o0oooo2 = o0oooo2;
                            i6 = i6;
                            z12 = z12;
                            i9 = i9;
                            str2 = str2;
                            positionedItems = arrayList;
                            arrayList2 = arrayList7;
                            size2 = arrayList2.size();
                            i12 = i5;
                            for (i11 = 0; i11 < size2; i11++) {
                                o0oOOo o0oooo5 = (o0oOOo) arrayList2.get(i11);
                                positionedItems.addAll(o0oooo5.OooO00o(i12, iOooO0o, i9));
                                i12 += o0oooo5.f2472OooOO0;
                            }
                        }
                        i13 = (int) f2;
                        Objects.requireNonNull(placementAnimator);
                        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
                        Intrinsics.checkNotNullParameter(measuredItemProvider, str2);
                        size3 = positionedItems.size();
                        i14 = 0;
                        while (true) {
                            if (i14 < size3) {
                                z2 = false;
                                break;
                            }
                            if (((oo0O) positionedItems.get(i14)).f2495OooOOOo) {
                                z2 = true;
                                break;
                            }
                            i14++;
                        }
                        if (z2) {
                            placementAnimator.f2279OooO0OO = i46;
                            z3 = placementAnimator.f2278OooO0O0;
                            if (z3) {
                                i15 = i9;
                            } else {
                                i15 = iOooO0o;
                            }
                            if (z13) {
                                i13 = -i13;
                            }
                            if (z3) {
                                i16 = 0;
                            } else {
                                i16 = i13;
                            }
                            if (!z3) {
                                i13 = 0;
                            }
                            jOooO00o2 = Oooo000.OooO00o(i16, i13);
                            oo0o = (oo0O) CollectionsKt.first((List) positionedItems);
                            oo0o2 = (oo0O) CollectionsKt.last((List) positionedItems);
                            size4 = positionedItems.size();
                            i17 = 0;
                            while (i17 < size4) {
                                oo0o4 = (oo0O) positionedItems.get(i17);
                                int i69 = size4;
                                o000o4 = (o000O) placementAnimator.f2280OooO0Oo.get(oo0o4.f2484OooO0Oo);
                                if (o000o4 == null) {
                                    f2 = f2;
                                } else {
                                    if (oo0o4.f2491OooOO0o) {
                                        c2 = ' ';
                                        iOooO0O3 = (int) (oo0o4.f2487OooO0oO >> 32);
                                    } else {
                                        c2 = ' ';
                                        iOooO0O3 = o000oOoO.OooO0O0(oo0o4.f2487OooO0oO);
                                    }
                                    o000o4.f2251OooO00o = iOooO0O3;
                                    if (oo0o4.f2491OooOO0o) {
                                        long j7 = oo0o4.f2481OooO00o;
                                        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
                                        iOooO0OO3 = (int) (j7 >> c2);
                                    } else {
                                        iOooO0OO3 = o0000O0O.OooOo.OooO0OO(oo0o4.f2481OooO00o);
                                    }
                                    o000o4.f2252OooO0O0 = iOooO0OO3;
                                }
                                i17++;
                                size4 = i69;
                                f2 = f2;
                            }
                            f = f2;
                            o00oooo2 = new o00oOoo(placementAnimator, positionedItems);
                            i18 = 0;
                            i19 = 0;
                            i20 = 0;
                            while (i18 < positionedItems.size()) {
                                iIntValue = ((Number) o00oooo2.invoke(Integer.valueOf(i18))).intValue();
                                i3 = i3;
                                if (iIntValue == -1) {
                                    i18++;
                                } else {
                                    iMax = 0;
                                    int i70 = i9;
                                    while (i18 < positionedItems.size() && ((Number) o00oooo2.invoke(Integer.valueOf(i18))).intValue() == iIntValue) {
                                        iMax = Math.max(iMax, ((oo0O) positionedItems.get(i18)).OooO0o0());
                                        i18++;
                                    }
                                    i19 += iMax;
                                    i20++;
                                    i9 = i70;
                                }
                            }
                            i21 = i3;
                            i22 = i9;
                            i23 = i19 / i20;
                            placementAnimator.f2285OooOO0.clear();
                            size5 = positionedItems.size();
                            i24 = 0;
                            while (i24 < size5) {
                                oo0o3 = (oo0O) positionedItems.get(i24);
                                placementAnimator.f2285OooOO0.add(oo0o3.f2484OooO0Oo);
                                o000o2 = (o000O) placementAnimator.f2280OooO0Oo.get(oo0o3.f2484OooO0Oo);
                                if (o000o2 == null) {
                                    size5 = size5;
                                    arrayList6 = positionedItems;
                                    i30 = iOooO0o;
                                    measuredItemProvider = measuredItemProvider;
                                    if (oo0o3.f2495OooOOOo) {
                                        long j8 = o000o2.f2253OooO0OO;
                                        o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
                                        o000o2.f2253OooO0OO = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j8), ((int) (j8 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                        placementAnimator.OooO0Oo(oo0o3, o000o2);
                                    } else {
                                        placementAnimator.f2280OooO0Oo.remove(oo0o3.f2484OooO0Oo);
                                    }
                                } else if (oo0o3.f2495OooOOOo) {
                                    if (oo0o3.f2491OooOO0o) {
                                        c = ' ';
                                        iOooO0O1 = (int) (oo0o3.f2487OooO0oO >> 32);
                                    } else {
                                        c = ' ';
                                        iOooO0O1 = o000oOoO.OooO0O0(oo0o3.f2487OooO0oO);
                                    }
                                    if (oo0o3.f2491OooOO0o) {
                                        long j9 = oo0o3.f2481OooO00o;
                                        o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
                                        iOooO0OO2 = (int) (j9 >> c);
                                    } else {
                                        iOooO0OO2 = o0000O0O.OooOo.OooO0OO(oo0o3.f2481OooO00o);
                                    }
                                    o000o3 = new o000O(iOooO0O1, iOooO0OO2);
                                    num2 = placementAnimator.f2282OooO0o0.get(oo0o3.f2484OooO0Oo);
                                    i30 = iOooO0o;
                                    j3 = oo0o3.f2482OooO0O0;
                                    if (num2 == null) {
                                        iOooO00o2 = placementAnimator.OooO0O0(j3);
                                    } else {
                                        if (z13) {
                                            iOooO0O2 = placementAnimator.OooO0O0(j3) - oo0o3.OooO0o0();
                                        } else {
                                            iOooO0O2 = placementAnimator.OooO0O0(j3);
                                        }
                                        iOooO00o2 = placementAnimator.OooO00o(num2.intValue(), oo0o3.OooO0o0(), i23, jOooO00o2, z13, i15, iOooO0O2);
                                    }
                                    if (placementAnimator.f2278OooO0O0) {
                                        jOooO00o4 = o0000O0O.OooOo.OooO00o(j3, 0, iOooO00o2, 1);
                                    } else {
                                        jOooO00o4 = o0000O0O.OooOo.OooO00o(j3, iOooO00o2, 0, 2);
                                    }
                                    iOooO0o2 = oo0o3.OooO0o();
                                    i31 = 0;
                                    while (i31 < iOooO0o2) {
                                        int i71 = iOooO0o2;
                                        o000o3.f2254OooO0Oo.add(new o0O00OO(jOooO00o4, oo0o3.OooO0Oo(i31)));
                                        Unit unit2 = Unit.INSTANCE;
                                        i31++;
                                        iOooO0o2 = i71;
                                        positionedItems = positionedItems;
                                    }
                                    arrayList6 = positionedItems;
                                    placementAnimator.f2280OooO0Oo.put(oo0o3.f2484OooO0Oo, o000o3);
                                    placementAnimator.OooO0Oo(oo0o3, o000o3);
                                } else {
                                    size5 = size5;
                                    arrayList6 = positionedItems;
                                    i30 = iOooO0o;
                                    measuredItemProvider = measuredItemProvider;
                                }
                                i24++;
                                iOooO0o = i30;
                                size5 = size5;
                                measuredItemProvider = measuredItemProvider;
                                positionedItems = arrayList6;
                            }
                            arrayList3 = positionedItems;
                            i25 = iOooO0o;
                            oo00oo = measuredItemProvider;
                            if (z13) {
                                placementAnimator.f2281OooO0o = oo0o2.f2483OooO0OO;
                                placementAnimator.f2283OooO0oO = (i15 - placementAnimator.OooO0O0(oo0o2.f2481OooO00o)) - oo0o2.f2488OooO0oo;
                                placementAnimator.f2284OooO0oo = oo0o.f2483OooO0OO;
                                int i72 = -placementAnimator.OooO0O0(oo0o.f2481OooO00o);
                                int i73 = oo0o.f2480OooO + oo0o.f2488OooO0oo;
                                if (placementAnimator.f2278OooO0O0) {
                                    iOooO0O0 = o000oOoO.OooO0O0(oo0o.f2487OooO0oO);
                                } else {
                                    iOooO0O0 = (int) (oo0o.f2487OooO0oO >> 32);
                                }
                                placementAnimator.f2276OooO = (i73 - iOooO0O0) + i72;
                            } else {
                                placementAnimator.f2281OooO0o = oo0o.f2483OooO0OO;
                                placementAnimator.f2283OooO0oO = placementAnimator.OooO0O0(oo0o.f2481OooO00o);
                                placementAnimator.f2284OooO0oo = oo0o2.f2483OooO0OO;
                                placementAnimator.f2276OooO = ((oo0o2.f2480OooO + oo0o2.f2488OooO0oo) + placementAnimator.OooO0O0(oo0o2.f2481OooO00o)) - i15;
                            }
                            it = placementAnimator.f2280OooO0Oo.entrySet().iterator();
                            while (it.hasNext()) {
                                entry = (Map.Entry) it.next();
                                if (!placementAnimator.f2285OooOO0.contains(entry.getKey())) {
                                    o000o = (o000O) entry.getValue();
                                    long j10 = o000o.f2253OooO0OO;
                                    o0000O0O.OooOo.OooO00o oooO00o4 = o0000O0O.OooOo.f27310OooO0O0;
                                    o000o.f2253OooO0OO = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j10), ((int) (j10 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                    oo00oo2 = oo00oo;
                                    num = oo00oo2.f2476OooO00o.OooO0o().get(entry.getKey());
                                    ?? r7 = o000o.f2254OooO0Oo;
                                    size6 = r7.size();
                                    i26 = 0;
                                    r6 = r7;
                                    while (true) {
                                        if (i26 < size6) {
                                            j2 = jOooO00o2;
                                            i27 = i23;
                                            oo00oo3 = oo00oo2;
                                            z4 = false;
                                            break;
                                        }
                                        o0o00oo2 = (o0O00OO) r6.get(i26);
                                        long j11 = o0o00oo2.f2429OooO0OO;
                                        j2 = jOooO00o2;
                                        long j12 = o000o.f2253OooO0OO;
                                        r17 = r6;
                                        i27 = i23;
                                        oo00oo3 = oo00oo2;
                                        i29 = size6;
                                        jOooO00o3 = o00oO0o.OooO00o(j12, o0000O0O.OooOo.OooO0OO(j11), ((int) (j11 >> 32)) + ((int) (j12 >> 32)));
                                        if (placementAnimator.OooO0O0(jOooO00o3) + o0o00oo2.f2427OooO00o > 0 || placementAnimator.OooO0O0(jOooO00o3) >= i15) {
                                            z6 = false;
                                        } else {
                                            z6 = true;
                                        }
                                        if (z6) {
                                            z4 = true;
                                            break;
                                        }
                                        i26++;
                                        i23 = i27;
                                        size6 = i29;
                                        r6 = r17;
                                        oo00oo2 = oo00oo3;
                                        jOooO00o2 = j2;
                                    }
                                    r1 = o000o.f2254OooO0Oo;
                                    size7 = r1.size();
                                    i28 = 0;
                                    while (true) {
                                        if (i28 < size7) {
                                            z5 = false;
                                            break;
                                        }
                                        if (((Boolean) ((o0O00OO) r1.get(i28)).f2430OooO0Oo.getValue()).booleanValue()) {
                                            z5 = true;
                                            break;
                                        }
                                        i28++;
                                    }
                                    boolean z15 = !z5;
                                    if ((z4 && z15) || num == null || o000o.f2254OooO0Oo.isEmpty()) {
                                        oo00oo4 = oo00oo3;
                                        arrayList5 = arrayList3;
                                        it.remove();
                                    } else {
                                        int iIntValue2 = num.intValue();
                                        if (placementAnimator.f2278OooO0O0) {
                                            jOooO0Oo = OooO0O0.f27298OooO0O0.OooO0o0(o000o.f2251OooO00o);
                                        } else {
                                            jOooO0Oo = OooO0O0.f27298OooO0O0.OooO0Oo(o000o.f2251OooO00o);
                                        }
                                        oo00oo4 = oo00oo3;
                                        o0o00o0OooO00o = oo00oo4.OooO00o(iIntValue2, oo00oo4.f2478OooO0OO, jOooO0Oo);
                                        iOooO00o = placementAnimator.OooO00o(num.intValue(), o0o00o0OooO00o.f2443OooOOO, i27, j2, z13, i15, i15);
                                        if (z13) {
                                            iOooO00o = (i15 - iOooO00o) - o0o00o0OooO00o.f2444OooOOO0;
                                        }
                                        oo0O oo0oOooO00o = o0o00o0OooO00o.OooO00o(iOooO00o, o000o.f2252OooO0O0, i25, i22, -1, -1, o0o00o0OooO00o.f2444OooOOO0);
                                        arrayList5 = arrayList3;
                                        arrayList5.add(oo0oOooO00o);
                                        placementAnimator.OooO0Oo(oo0oOooO00o, o000o);
                                    }
                                    i23 = i27;
                                    arrayList3 = arrayList5;
                                    oo00oo = oo00oo4;
                                    jOooO00o2 = j2;
                                }
                            }
                            arrayList4 = arrayList3;
                            placementAnimator.f2282OooO0o0 = oo00oo.f2476OooO00o.OooO0o();
                        } else {
                            placementAnimator.OooO0OO();
                            i21 = i3;
                            arrayList4 = positionedItems;
                            i22 = i9;
                            i25 = iOooO0o;
                            f = f2;
                        }
                        if (i21 > i43) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        o000000O o000000o2 = (o000000O) layout.invoke(Integer.valueOf(i25), Integer.valueOf(i22), new o00OO00O(arrayList4));
                        if (z12) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        measureResult = new o00OO0O0(o0oooo2, i6, z7, f, o000000o2, arrayList4, i2, orientation);
                    } else {
                        i2 = i45;
                    }
                    i3 = i56;
                    i4 = i57;
                    if (MathKt.getSign(MathKt.roundToInt(f2)) == MathKt.getSign(iRoundToInt)) {
                        f2 = iRoundToInt;
                    }
                    i5 = -i4;
                    o0oOOo o0oooo6 = (o0oOOo) CollectionsKt.first((List) arrayList7);
                    if (i44 > 0) {
                        size9 = arrayList7.size();
                        i37 = 0;
                        while (i37 < size9) {
                            int i610 = ((o0oOOo) arrayList7.get(i37)).f2472OooOO0;
                            if (i4 == 0) {
                                break;
                            }
                            break;
                        }
                    }
                    o0oooo2 = o0oooo6;
                    i6 = i4;
                    if (z12) {
                        iOooO0o = OooO0O0.OooO0oo(j5);
                        j = j5;
                    } else {
                        j = j5;
                        iOooO0o = OooO0OO.OooO0o(j, i3);
                    }
                    if (z12) {
                        iOooO0oO = OooO0OO.OooO0o0(j, i3);
                    } else {
                        iOooO0oO = OooO0O0.OooO0oO(j);
                    }
                    i7 = iOooO0oO;
                    if (z12) {
                        i8 = i7;
                    } else {
                        i8 = iOooO0o;
                    }
                    if (i3 < Math.min(i8, i43)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (i5 == 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (!z8) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    i9 = i7;
                    i10 = 0;
                    length = 0;
                    while (i10 < size) {
                        length += ((o0oOOo) arrayList7.get(i10)).f2465OooO0O0.length;
                        i10++;
                    }
                    arrayList = new ArrayList(length);
                    if (z) {
                        size8 = arrayList7.size();
                        iArr = new int[size8];
                        i32 = 0;
                        while (i32 < size8) {
                            if (z13) {
                                i36 = i32;
                            } else {
                                i36 = (size8 - i32) - 1;
                            }
                            iArr[i32] = ((o0oOOo) arrayList7.get(i36)).f2463OooO;
                            i32++;
                            arrayList = arrayList;
                        }
                        positionedItems = arrayList;
                        iArr2 = new int[size8];
                        while (i33 < size8) {
                            iArr2[i33] = 0;
                        }
                        if (z12) {
                            oooOo2 = oooOo6;
                            if (oooOo2 != null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            oooOo2.OooO0OO(density, i8, iArr, iArr2);
                            iArr3 = iArr2;
                        } else {
                            if (oooO0o3 != null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            iArr3 = iArr2;
                            oooO0o3.OooO0O0(density, i8, iArr, LayoutDirection.Ltr, iArr3);
                        }
                        indices = ArraysKt.getIndices(iArr3);
                        if (z13) {
                            indices = RangesKt.reversed(indices);
                        }
                        first = indices.getFirst();
                        last = indices.getLast();
                        step = indices.getStep();
                        if (step > 0) {
                            while (true) {
                                i34 = iArr3[first];
                                if (z13) {
                                    i35 = first;
                                } else {
                                    i35 = (size8 - first) - 1;
                                }
                                o0oooo3 = (o0oOOo) arrayList7.get(i35);
                                if (z13) {
                                    i34 = (i8 - i34) - o0oooo3.f2463OooO;
                                }
                                positionedItems.addAll(o0oooo3.OooO00o(i34, iOooO0o, i9));
                                if (first == last) {
                                    break;
                                    break;
                                }
                                first += step;
                            }
                        } else {
                            while (true) {
                                i34 = iArr3[first];
                                if (z13) {
                                    i35 = first;
                                } else {
                                    i35 = (size8 - first) - 1;
                                }
                                o0oooo3 = (o0oOOo) arrayList7.get(i35);
                                if (z13) {
                                    i34 = (i8 - i34) - o0oooo3.f2463OooO;
                                }
                                positionedItems.addAll(o0oooo3.OooO00o(i34, iOooO0o, i9));
                                if (first == last) {
                                    break;
                                    break;
                                }
                                first += step;
                            }
                        }
                    } else {
                        layout = layout;
                        o0oooo2 = o0oooo2;
                        i6 = i6;
                        z12 = z12;
                        i9 = i9;
                        str2 = str2;
                        positionedItems = arrayList;
                        arrayList2 = arrayList7;
                        size2 = arrayList2.size();
                        i12 = i5;
                        while (i11 < size2) {
                            o0oOOo o0oooo7 = (o0oOOo) arrayList2.get(i11);
                            positionedItems.addAll(o0oooo7.OooO00o(i12, iOooO0o, i9));
                            i12 += o0oooo7.f2472OooOO0;
                        }
                    }
                    i13 = (int) f2;
                    Objects.requireNonNull(placementAnimator);
                    Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
                    Intrinsics.checkNotNullParameter(measuredItemProvider, str2);
                    size3 = positionedItems.size();
                    i14 = 0;
                    while (true) {
                        if (i14 < size3) {
                            z2 = false;
                            break;
                        }
                        if (((oo0O) positionedItems.get(i14)).f2495OooOOOo) {
                            z2 = true;
                            break;
                        }
                        i14++;
                    }
                    if (z2) {
                        placementAnimator.OooO0OO();
                        i21 = i3;
                        arrayList4 = positionedItems;
                        i22 = i9;
                        i25 = iOooO0o;
                        f = f2;
                    } else {
                        placementAnimator.f2279OooO0OO = i46;
                        z3 = placementAnimator.f2278OooO0O0;
                        if (z3) {
                            i15 = i9;
                        } else {
                            i15 = iOooO0o;
                        }
                        if (z13) {
                            i13 = -i13;
                        }
                        if (z3) {
                            i16 = 0;
                        } else {
                            i16 = i13;
                        }
                        if (!z3) {
                            i13 = 0;
                        }
                        jOooO00o2 = Oooo000.OooO00o(i16, i13);
                        oo0o = (oo0O) CollectionsKt.first((List) positionedItems);
                        oo0o2 = (oo0O) CollectionsKt.last((List) positionedItems);
                        size4 = positionedItems.size();
                        i17 = 0;
                        while (i17 < size4) {
                            oo0o4 = (oo0O) positionedItems.get(i17);
                            int i611 = size4;
                            o000o4 = (o000O) placementAnimator.f2280OooO0Oo.get(oo0o4.f2484OooO0Oo);
                            if (o000o4 == null) {
                                f2 = f2;
                            } else {
                                if (oo0o4.f2491OooOO0o) {
                                    c2 = ' ';
                                    iOooO0O3 = (int) (oo0o4.f2487OooO0oO >> 32);
                                } else {
                                    c2 = ' ';
                                    iOooO0O3 = o000oOoO.OooO0O0(oo0o4.f2487OooO0oO);
                                }
                                o000o4.f2251OooO00o = iOooO0O3;
                                if (oo0o4.f2491OooOO0o) {
                                    long j13 = oo0o4.f2481OooO00o;
                                    o0000O0O.OooOo.OooO00o oooO00o5 = o0000O0O.OooOo.f27310OooO0O0;
                                    iOooO0OO3 = (int) (j13 >> c2);
                                } else {
                                    iOooO0OO3 = o0000O0O.OooOo.OooO0OO(oo0o4.f2481OooO00o);
                                }
                                o000o4.f2252OooO0O0 = iOooO0OO3;
                            }
                            i17++;
                            size4 = i611;
                            f2 = f2;
                        }
                        f = f2;
                        o00oooo2 = new o00oOoo(placementAnimator, positionedItems);
                        i18 = 0;
                        i19 = 0;
                        i20 = 0;
                        while (i18 < positionedItems.size()) {
                            iIntValue = ((Number) o00oooo2.invoke(Integer.valueOf(i18))).intValue();
                            i3 = i3;
                            if (iIntValue == -1) {
                                i18++;
                            } else {
                                iMax = 0;
                                int i74 = i9;
                                while (i18 < positionedItems.size()) {
                                    iMax = Math.max(iMax, ((oo0O) positionedItems.get(i18)).OooO0o0());
                                    i18++;
                                }
                                i19 += iMax;
                                i20++;
                                i9 = i74;
                            }
                        }
                        i21 = i3;
                        i22 = i9;
                        i23 = i19 / i20;
                        placementAnimator.f2285OooOO0.clear();
                        size5 = positionedItems.size();
                        i24 = 0;
                        while (i24 < size5) {
                            oo0o3 = (oo0O) positionedItems.get(i24);
                            placementAnimator.f2285OooOO0.add(oo0o3.f2484OooO0Oo);
                            o000o2 = (o000O) placementAnimator.f2280OooO0Oo.get(oo0o3.f2484OooO0Oo);
                            if (o000o2 == null) {
                                size5 = size5;
                                arrayList6 = positionedItems;
                                i30 = iOooO0o;
                                measuredItemProvider = measuredItemProvider;
                                if (oo0o3.f2495OooOOOo) {
                                    long j14 = o000o2.f2253OooO0OO;
                                    o0000O0O.OooOo.OooO00o oooO00o6 = o0000O0O.OooOo.f27310OooO0O0;
                                    o000o2.f2253OooO0OO = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j14), ((int) (j14 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                    placementAnimator.OooO0Oo(oo0o3, o000o2);
                                } else {
                                    placementAnimator.f2280OooO0Oo.remove(oo0o3.f2484OooO0Oo);
                                }
                            } else if (oo0o3.f2495OooOOOo) {
                                if (oo0o3.f2491OooOO0o) {
                                    c = ' ';
                                    iOooO0O1 = (int) (oo0o3.f2487OooO0oO >> 32);
                                } else {
                                    c = ' ';
                                    iOooO0O1 = o000oOoO.OooO0O0(oo0o3.f2487OooO0oO);
                                }
                                if (oo0o3.f2491OooOO0o) {
                                    long j15 = oo0o3.f2481OooO00o;
                                    o0000O0O.OooOo.OooO00o oooO00o7 = o0000O0O.OooOo.f27310OooO0O0;
                                    iOooO0OO2 = (int) (j15 >> c);
                                } else {
                                    iOooO0OO2 = o0000O0O.OooOo.OooO0OO(oo0o3.f2481OooO00o);
                                }
                                o000o3 = new o000O(iOooO0O1, iOooO0OO2);
                                num2 = placementAnimator.f2282OooO0o0.get(oo0o3.f2484OooO0Oo);
                                i30 = iOooO0o;
                                j3 = oo0o3.f2482OooO0O0;
                                if (num2 == null) {
                                    iOooO00o2 = placementAnimator.OooO0O0(j3);
                                } else {
                                    if (z13) {
                                        iOooO0O2 = placementAnimator.OooO0O0(j3);
                                    } else {
                                        iOooO0O2 = placementAnimator.OooO0O0(j3) - oo0o3.OooO0o0();
                                    }
                                    iOooO00o2 = placementAnimator.OooO00o(num2.intValue(), oo0o3.OooO0o0(), i23, jOooO00o2, z13, i15, iOooO0O2);
                                }
                                if (placementAnimator.f2278OooO0O0) {
                                    jOooO00o4 = o0000O0O.OooOo.OooO00o(j3, 0, iOooO00o2, 1);
                                } else {
                                    jOooO00o4 = o0000O0O.OooOo.OooO00o(j3, iOooO00o2, 0, 2);
                                }
                                iOooO0o2 = oo0o3.OooO0o();
                                i31 = 0;
                                while (i31 < iOooO0o2) {
                                    int i75 = iOooO0o2;
                                    o000o3.f2254OooO0Oo.add(new o0O00OO(jOooO00o4, oo0o3.OooO0Oo(i31)));
                                    Unit unit3 = Unit.INSTANCE;
                                    i31++;
                                    iOooO0o2 = i75;
                                    positionedItems = positionedItems;
                                }
                                arrayList6 = positionedItems;
                                placementAnimator.f2280OooO0Oo.put(oo0o3.f2484OooO0Oo, o000o3);
                                placementAnimator.OooO0Oo(oo0o3, o000o3);
                            } else {
                                size5 = size5;
                                arrayList6 = positionedItems;
                                i30 = iOooO0o;
                                measuredItemProvider = measuredItemProvider;
                            }
                            i24++;
                            iOooO0o = i30;
                            size5 = size5;
                            measuredItemProvider = measuredItemProvider;
                            positionedItems = arrayList6;
                        }
                        arrayList3 = positionedItems;
                        i25 = iOooO0o;
                        oo00oo = measuredItemProvider;
                        if (z13) {
                            placementAnimator.f2281OooO0o = oo0o.f2483OooO0OO;
                            placementAnimator.f2283OooO0oO = placementAnimator.OooO0O0(oo0o.f2481OooO00o);
                            placementAnimator.f2284OooO0oo = oo0o2.f2483OooO0OO;
                            placementAnimator.f2276OooO = ((oo0o2.f2480OooO + oo0o2.f2488OooO0oo) + placementAnimator.OooO0O0(oo0o2.f2481OooO00o)) - i15;
                        } else {
                            placementAnimator.f2281OooO0o = oo0o2.f2483OooO0OO;
                            placementAnimator.f2283OooO0oO = (i15 - placementAnimator.OooO0O0(oo0o2.f2481OooO00o)) - oo0o2.f2488OooO0oo;
                            placementAnimator.f2284OooO0oo = oo0o.f2483OooO0OO;
                            int i76 = -placementAnimator.OooO0O0(oo0o.f2481OooO00o);
                            int i77 = oo0o.f2480OooO + oo0o.f2488OooO0oo;
                            if (placementAnimator.f2278OooO0O0) {
                                iOooO0O0 = o000oOoO.OooO0O0(oo0o.f2487OooO0oO);
                            } else {
                                iOooO0O0 = (int) (oo0o.f2487OooO0oO >> 32);
                            }
                            placementAnimator.f2276OooO = (i77 - iOooO0O0) + i76;
                        }
                        it = placementAnimator.f2280OooO0Oo.entrySet().iterator();
                        while (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                            if (!placementAnimator.f2285OooOO0.contains(entry.getKey())) {
                                o000o = (o000O) entry.getValue();
                                long j16 = o000o.f2253OooO0OO;
                                o0000O0O.OooOo.OooO00o oooO00o8 = o0000O0O.OooOo.f27310OooO0O0;
                                o000o.f2253OooO0OO = o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(j16), ((int) (j16 >> 32)) + ((int) (jOooO00o2 >> 32)));
                                oo00oo2 = oo00oo;
                                num = oo00oo2.f2476OooO00o.OooO0o().get(entry.getKey());
                                ?? r8 = o000o.f2254OooO0Oo;
                                size6 = r8.size();
                                i26 = 0;
                                r6 = r8;
                                while (true) {
                                    if (i26 < size6) {
                                        j2 = jOooO00o2;
                                        i27 = i23;
                                        oo00oo3 = oo00oo2;
                                        z4 = false;
                                        break;
                                    }
                                    o0o00oo2 = (o0O00OO) r6.get(i26);
                                    long j17 = o0o00oo2.f2429OooO0OO;
                                    j2 = jOooO00o2;
                                    long j18 = o000o.f2253OooO0OO;
                                    r17 = r6;
                                    i27 = i23;
                                    oo00oo3 = oo00oo2;
                                    i29 = size6;
                                    jOooO00o3 = o00oO0o.OooO00o(j18, o0000O0O.OooOo.OooO0OO(j17), ((int) (j17 >> 32)) + ((int) (j18 >> 32)));
                                    if (placementAnimator.OooO0O0(jOooO00o3) + o0o00oo2.f2427OooO00o > 0) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        z4 = true;
                                        break;
                                    }
                                    i26++;
                                    i23 = i27;
                                    size6 = i29;
                                    r6 = r17;
                                    oo00oo2 = oo00oo3;
                                    jOooO00o2 = j2;
                                }
                                r1 = o000o.f2254OooO0Oo;
                                size7 = r1.size();
                                i28 = 0;
                                while (true) {
                                    if (i28 < size7) {
                                        z5 = false;
                                        break;
                                    }
                                    if (((Boolean) ((o0O00OO) r1.get(i28)).f2430OooO0Oo.getValue()).booleanValue()) {
                                        z5 = true;
                                        break;
                                    }
                                    i28++;
                                }
                                boolean z16 = !z5;
                                if (z4) {
                                    int iIntValue3 = num.intValue();
                                    if (placementAnimator.f2278OooO0O0) {
                                        jOooO0Oo = OooO0O0.f27298OooO0O0.OooO0o0(o000o.f2251OooO00o);
                                    } else {
                                        jOooO0Oo = OooO0O0.f27298OooO0O0.OooO0Oo(o000o.f2251OooO00o);
                                    }
                                    oo00oo4 = oo00oo3;
                                    o0o00o0OooO00o = oo00oo4.OooO00o(iIntValue3, oo00oo4.f2478OooO0OO, jOooO0Oo);
                                    iOooO00o = placementAnimator.OooO00o(num.intValue(), o0o00o0OooO00o.f2443OooOOO, i27, j2, z13, i15, i15);
                                    if (z13) {
                                        iOooO00o = (i15 - iOooO00o) - o0o00o0OooO00o.f2444OooOOO0;
                                    }
                                    oo0O oo0oOooO00o2 = o0o00o0OooO00o.OooO00o(iOooO00o, o000o.f2252OooO0O0, i25, i22, -1, -1, o0o00o0OooO00o.f2444OooOOO0);
                                    arrayList5 = arrayList3;
                                    arrayList5.add(oo0oOooO00o2);
                                    placementAnimator.OooO0Oo(oo0oOooO00o2, o000o);
                                } else {
                                    int iIntValue4 = num.intValue();
                                    if (placementAnimator.f2278OooO0O0) {
                                        jOooO0Oo = OooO0O0.f27298OooO0O0.OooO0o0(o000o.f2251OooO00o);
                                    } else {
                                        jOooO0Oo = OooO0O0.f27298OooO0O0.OooO0Oo(o000o.f2251OooO00o);
                                    }
                                    oo00oo4 = oo00oo3;
                                    o0o00o0OooO00o = oo00oo4.OooO00o(iIntValue4, oo00oo4.f2478OooO0OO, jOooO0Oo);
                                    iOooO00o = placementAnimator.OooO00o(num.intValue(), o0o00o0OooO00o.f2443OooOOO, i27, j2, z13, i15, i15);
                                    if (z13) {
                                        iOooO00o = (i15 - iOooO00o) - o0o00o0OooO00o.f2444OooOOO0;
                                    }
                                    oo0O oo0oOooO00o3 = o0o00o0OooO00o.OooO00o(iOooO00o, o000o.f2252OooO0O0, i25, i22, -1, -1, o0o00o0OooO00o.f2444OooOOO0);
                                    arrayList5 = arrayList3;
                                    arrayList5.add(oo0oOooO00o3);
                                    placementAnimator.OooO0Oo(oo0oOooO00o3, o000o);
                                }
                                i23 = i27;
                                arrayList3 = arrayList5;
                                oo00oo = oo00oo4;
                                jOooO00o2 = j2;
                            }
                        }
                        arrayList4 = arrayList3;
                        placementAnimator.f2282OooO0o0 = oo00oo.f2476OooO00o.OooO0o();
                    }
                    if (i21 > i43) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    o000000O o000000o3 = (o000000O) layout.invoke(Integer.valueOf(i25), Integer.valueOf(i22), new o00OO00O(arrayList4));
                    if (z12) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    measureResult = new o00OO0O0(o0oooo2, i6, z7, f, o000000o3, arrayList4, i2, orientation);
                }
                o00OOOOo o00ooooo5 = this.f2500Oooo;
                Oooo0.oo0oOO0 oo0ooo0 = this.f2509o000oOoO;
                Objects.requireNonNull(o00ooooo5);
                Intrinsics.checkNotNullParameter(measureResult, "result");
                o00OOO0O o00ooo0o2 = o00ooooo5.f2380OooO00o;
                Objects.requireNonNull(o00ooo0o2);
                Intrinsics.checkNotNullParameter(measureResult, "measureResult");
                o0oOOo o0oooo8 = measureResult.f2341OooO00o;
                o00ooo0o2.f2361OooO0Oo = (o0oooo8 == null || (o0o00o0Arr3 = o0oooo8.f2465OooO0O0) == null || (o0o00o2 = (o0O00o0) ArraysKt.firstOrNull(o0o00o0Arr3)) == null) ? null : o0o00o2.f2433OooO0O0;
                if (o00ooo0o2.f2360OooO0OO || measureResult.f2345OooO0o > 0) {
                    o00ooo0o2.f2360OooO0OO = true;
                    int i78 = measureResult.f2342OooO0O0;
                    if (!(((float) i78) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                        throw new IllegalStateException(OooOOO0.OooO00o("scrollOffset should be non-negative (", i78, ')').toString());
                    }
                    oo00o oo00oVarOooO0oO2 = oo0o0O0.OooO0oO(oo0o0O0.f4157OooO0O0.OooO00o(), null, false);
                    try {
                        oo00o oo00oVarOooO2 = oo00oVarOooO0oO2.OooO();
                        try {
                            o0oOOo o0oooo9 = measureResult.f2341OooO00o;
                            o00ooo0o2.OooO0OO((o0oooo9 == null || (o0o00o0Arr = o0oooo9.f2465OooO0O0) == null || (o0o00o1 = (o0O00o0) ArraysKt.firstOrNull(o0o00o0Arr)) == null) ? 0 : o0o00o1.f2432OooO00o, i78);
                            Unit unit4 = Unit.INSTANCE;
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
                o00ooooo5.f2383OooO0Oo -= measureResult.f2344OooO0Oo;
                o00ooooo5.f2381OooO0O0.setValue(measureResult);
                boolean z17 = measureResult.f2343OooO0OO;
                o00ooooo5.f2397OooOOoo = z17;
                o0oOOo o0oooo10 = measureResult.f2341OooO00o;
                o00ooooo5.f2395OooOOo = ((o0oooo10 != null ? o0oooo10.f2464OooO00o : 0) == 0 && measureResult.f2342OooO0O0 == 0) ? false : true;
                if (o0oooo10 == null || (o0o00o0Arr2 = o0oooo10.f2465OooO0O0) == null || (obj = (o0O00o0) ArraysKt.firstOrNull(o0o00o0Arr2)) == null) {
                    i38 = 0;
                    obj = 0;
                } else {
                    i38 = 0;
                }
                oo0ooo0.setEnabled(z17 || (!Intrinsics.areEqual(obj, Integer.valueOf(i38)) || measureResult.f2342OooO0O0 != 0));
                return measureResult;
            } catch (Throwable th3) {
                try {
                    oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                    throw th3;
                } catch (Throwable th4) {
                    th = th4;
                    oo00oVarOooO0oO.OooO0OO();
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
