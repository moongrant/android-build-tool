package androidx.constraintlayout.core.widgets;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o0O0O00.OooOOOO;
import o0O0O00.OooOo;
import o0O0O00.Oooo0;
import o0O0O00.o000oOoO;
import o0O0O00.o0OoOo0;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends oo0o0Oo.OooO0OO {

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f4475o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public int f4476o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public final androidx.constraintlayout.core.OooO0OO f4477o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f4478o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public int f4479o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public OooO0OO[] f4480o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f4481o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public OooO0OO[] f4482o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public int f4483o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public boolean f4484o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f4485o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f4486o00000oo;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f4487o0000O00;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public boolean f4488o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public final o0O0O00.OooO0O0.OooO00o f4489o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public final HashSet<ConstraintWidget> f4490o0000oo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f4491o000OOo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public o0O0O00.OooO0O0.InterfaceC0449OooO0O0 f4492o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public final o0O0O00.OooO f4493o0OO00O;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public final o0O0O00.OooO0O0 f4494o0Oo0oo;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f4495oo0o0Oo;

    public OooO0o() {
        this.f4494o0Oo0oo = new o0O0O00.OooO0O0(this);
        this.f4493o0OO00O = new o0O0O00.OooO(this);
        this.f4492o0O0O00 = null;
        this.f4491o000OOo = false;
        this.f4477o000000 = new androidx.constraintlayout.core.OooO0OO();
        this.f4476o00000 = 0;
        this.f4481o00000O0 = 0;
        this.f4480o00000O = new OooO0OO[4];
        this.f4482o00000OO = new OooO0OO[4];
        this.f4483o00000Oo = 257;
        this.f4484o00000o0 = false;
        this.f4488o0000Ooo = false;
        this.f4485o00000oO = null;
        this.f4486o00000oo = null;
        this.f4475o0000 = null;
        this.f4487o0000O00 = null;
        this.f4490o0000oo = new HashSet<>();
        this.f4489o0000oO = new o0O0O00.OooO0O0.OooO00o();
    }

    public static void OooooO0(ConstraintWidget constraintWidget, o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O0, o0O0O00.OooO0O0.OooO00o oooO00o) {
        int i;
        int i2;
        if (interfaceC0449OooO0O0 == null) {
            return;
        }
        if (constraintWidget.f4403o0OoOo0 == 8 || (constraintWidget instanceof OooOO0) || (constraintWidget instanceof OooO00o)) {
            oooO00o.f41853OooO0o0 = 0;
            oooO00o.f41852OooO0o = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4381OoooOOO;
        oooO00o.f41848OooO00o = dimensionBehaviourArr[0];
        oooO00o.f41849OooO0O0 = dimensionBehaviourArr[1];
        oooO00o.f41850OooO0OO = constraintWidget.OooOo0O();
        oooO00o.f41851OooO0Oo = constraintWidget.OooOOOo();
        oooO00o.f41847OooO = false;
        oooO00o.f41856OooOO0 = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = oooO00o.f41848OooO00o;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = oooO00o.f41849OooO0O0 == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f4385OoooOoo > 0.0f;
        boolean z4 = z2 && constraintWidget.f4385OoooOoo > 0.0f;
        if (z && constraintWidget.OooOoO0(0) && constraintWidget.f4355OooOo00 == 0 && !z3) {
            oooO00o.f41848OooO00o = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.f4354OooOo0 == 0) {
                oooO00o.f41848OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.OooOoO0(1) && constraintWidget.f4354OooOo0 == 0 && !z4) {
            oooO00o.f41849OooO0O0 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.f4355OooOo00 == 0) {
                oooO00o.f41849OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.Oooo000()) {
            oooO00o.f41848OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.Oooo00O()) {
            oooO00o.f41849OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        int[] iArr = constraintWidget.f4356OooOo0O;
        if (z3) {
            if (iArr[0] == 4) {
                oooO00o.f41848OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = oooO00o.f41849OooO0O0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i2 = oooO00o.f41851OooO0Oo;
                } else {
                    oooO00o.f41848OooO00o = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0449OooO0O0.OooO0O0(constraintWidget, oooO00o);
                    i2 = oooO00o.f41852OooO0o;
                }
                oooO00o.f41848OooO00o = dimensionBehaviour4;
                oooO00o.f41850OooO0OO = (int) (constraintWidget.f4385OoooOoo * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                oooO00o.f41849OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = oooO00o.f41848OooO00o;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i = oooO00o.f41850OooO0OO;
                } else {
                    oooO00o.f41849OooO0O0 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0449OooO0O0.OooO0O0(constraintWidget, oooO00o);
                    i = oooO00o.f41853OooO0o0;
                }
                oooO00o.f41849OooO0O0 = dimensionBehaviour6;
                if (constraintWidget.f4386Ooooo00 == -1) {
                    oooO00o.f41851OooO0Oo = (int) (i / constraintWidget.f4385OoooOoo);
                } else {
                    oooO00o.f41851OooO0Oo = (int) (constraintWidget.f4385OoooOoo * i);
                }
            }
        }
        interfaceC0449OooO0O0.OooO0O0(constraintWidget, oooO00o);
        constraintWidget.o000oOoO(oooO00o.f41853OooO0o0);
        constraintWidget.OoooO00(oooO00o.f41852OooO0o);
        constraintWidget.f4368Oooo00O = oooO00o.f41855OooO0oo;
        int i3 = oooO00o.f41854OooO0oO;
        constraintWidget.f4389OooooOO = i3;
        constraintWidget.f4368Oooo00O = i3 > 0;
        oooO00o.f41856OooOO0 = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooOOoo(StringBuilder sb) {
        sb.append(this.f4345OooOO0o + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f4383OoooOo0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f4384OoooOoO);
        sb.append("\n");
        Iterator<ConstraintWidget> it = this.f60905o0OOO0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOoo(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // oo0o0Oo.OooO0OO, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Oooo00o() {
        this.f4477o000000.OooOOoo();
        this.f4478o000000O = 0;
        this.f4479o000000o = 0;
        super.Oooo00o();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OoooOOO(boolean z, boolean z2) {
        super.OoooOOO(z, z2);
        int size = this.f60905o0OOO0o.size();
        for (int i = 0; i < size; i++) {
            this.f60905o0OOO0o.get(i).OoooOOO(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:352:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:355:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:362:0x0610  */
    /* JADX WARN: Code duplicated, block: B:363:0x0619  */
    /* JADX WARN: Code duplicated, block: B:381:0x0647  */
    /* JADX WARN: Code duplicated, block: B:386:0x065d  */
    /* JADX WARN: Code duplicated, block: B:398:0x068b  */
    /* JADX WARN: Code duplicated, block: B:403:0x069c  */
    /* JADX WARN: Code duplicated, block: B:410:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:415:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:422:0x06e6 A[Catch: Exception -> 0x07a0, LOOP:12: B:421:0x06e4->B:422:0x06e6, LOOP_END, TryCatch #0 {Exception -> 0x07a0, blocks: (B:420:0x06d8, B:422:0x06e6, B:423:0x06f4), top: B:535:0x06d8 }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0722 A[Catch: Exception -> 0x0794, PHI: r22
      0x0722: PHI (r22v8 androidx.constraintlayout.core.widgets.ConstraintAnchor) = 
      (r22v3 androidx.constraintlayout.core.widgets.ConstraintAnchor)
      (r22v3 androidx.constraintlayout.core.widgets.ConstraintAnchor)
      (r22v10 androidx.constraintlayout.core.widgets.ConstraintAnchor)
     binds: [B:425:0x06fa, B:427:0x0700, B:432:0x0717] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {Exception -> 0x0794, blocks: (B:424:0x06f7, B:426:0x06fc, B:428:0x0702, B:432:0x0717, B:435:0x0722, B:437:0x0726, B:439:0x072c, B:440:0x0745, B:442:0x0749, B:444:0x074f, B:448:0x0764, B:452:0x0770, B:454:0x0774, B:456:0x077a), top: B:543:0x06f7 }] */
    /* JADX WARN: Code duplicated, block: B:437:0x0726 A[Catch: Exception -> 0x0794, TryCatch #4 {Exception -> 0x0794, blocks: (B:424:0x06f7, B:426:0x06fc, B:428:0x0702, B:432:0x0717, B:435:0x0722, B:437:0x0726, B:439:0x072c, B:440:0x0745, B:442:0x0749, B:444:0x074f, B:448:0x0764, B:452:0x0770, B:454:0x0774, B:456:0x077a), top: B:543:0x06f7 }] */
    /* JADX WARN: Code duplicated, block: B:442:0x0749 A[Catch: Exception -> 0x0794, TryCatch #4 {Exception -> 0x0794, blocks: (B:424:0x06f7, B:426:0x06fc, B:428:0x0702, B:432:0x0717, B:435:0x0722, B:437:0x0726, B:439:0x072c, B:440:0x0745, B:442:0x0749, B:444:0x074f, B:448:0x0764, B:452:0x0770, B:454:0x0774, B:456:0x077a), top: B:543:0x06f7 }] */
    /* JADX WARN: Code duplicated, block: B:454:0x0774 A[Catch: Exception -> 0x0794, TryCatch #4 {Exception -> 0x0794, blocks: (B:424:0x06f7, B:426:0x06fc, B:428:0x0702, B:432:0x0717, B:435:0x0722, B:437:0x0726, B:439:0x072c, B:440:0x0745, B:442:0x0749, B:444:0x074f, B:448:0x0764, B:452:0x0770, B:454:0x0774, B:456:0x077a), top: B:543:0x06f7 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x0796  */
    /* JADX WARN: Code duplicated, block: B:471:0x07be  */
    /* JADX WARN: Code duplicated, block: B:473:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:475:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:479:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:481:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:484:0x0805  */
    /* JADX WARN: Code duplicated, block: B:486:0x080e A[LOOP:15: B:485:0x080c->B:486:0x080e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:490:0x0822 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:495:0x082e A[LOOP:14: B:494:0x082c->B:495:0x082e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:498:0x0863  */
    /* JADX WARN: Code duplicated, block: B:502:0x0877  */
    /* JADX WARN: Code duplicated, block: B:507:0x0899  */
    /* JADX WARN: Code duplicated, block: B:510:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:511:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:513:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:515:0x08d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:518:0x08da  */
    /* JADX WARN: Code duplicated, block: B:521:0x08ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:525:0x0908 A[PHI: r21 r26
      0x0908: PHI (r21v7 ??) = (r21v6 ??), (r21v9 ??), (r21v9 ??), (r21v9 ??) binds: [B:512:0x08c7, B:520:0x08ed, B:521:0x08ef, B:523:0x08f5] A[DONT_GENERATE, DONT_INLINE]
      0x0908: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean), (r26v7 boolean), (r26v7 boolean) binds: [B:512:0x08c7, B:520:0x08ed, B:521:0x08ef, B:523:0x08f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:527:0x090e  */
    /* JADX WARN: Code duplicated, block: B:528:0x0910  */
    /* JADX WARN: Code duplicated, block: B:532:0x091d  */
    /* JADX WARN: Code duplicated, block: B:594:0x06c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x07f8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32 */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v34 */
    /* JADX WARN: Type inference failed for: r21v35 */
    /* JADX WARN: Type inference failed for: r21v36 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.OooO0o, oo0o0Oo.OooO0OO] */
    @Override // oo0o0Oo.OooO0OO
    public final void OoooOo0() {
        int i;
        ConstraintAnchor constraintAnchor;
        int i2;
        androidx.constraintlayout.core.OooO0OO oooO0OO;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintAnchor constraintAnchor2;
        int i3;
        int iOooOo0O;
        int iOooOOOo;
        boolean z;
        boolean z2;
        char c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        boolean z3;
        int i4;
        int i5;
        boolean zOooooOO;
        boolean z4;
        int i6;
        ?? r13;
        boolean z5;
        int i7;
        ?? r23;
        boolean[] zArr;
        boolean z6;
        int i8;
        boolean z7;
        int iMax;
        boolean z8;
        int iMax2;
        ?? r12;
        ?? r21;
        int i9;
        ?? r22;
        ?? r14;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        int i10;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        boolean zOooooOO2;
        int size;
        int i11;
        boolean z9;
        ConstraintWidget constraintWidget;
        boolean z10;
        ?? r15;
        int i12;
        WeakReference<ConstraintAnchor> weakReference;
        WeakReference<ConstraintAnchor> weakReference2;
        WeakReference<ConstraintAnchor> weakReference3;
        WeakReference<ConstraintAnchor> weakReference4;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        int i13;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10;
        o000oOoO o000oooo2;
        o000oOoO o000oooo3;
        boolean z11;
        int i14;
        int iOooO0O0;
        androidx.constraintlayout.core.OooO0OO oooO0OO2;
        o000oOoO o000oooo4;
        o000oOoO o000oooo5;
        int i15;
        int i16;
        int i17;
        this.f4387Ooooo0o = 0;
        this.f4388OooooO0 = 0;
        this.f4484o00000o0 = false;
        this.f4488o0000Ooo = false;
        int size2 = this.f60905o0OOO0o.size();
        int iMax7 = Math.max(0, OooOo0O());
        int iMax8 = Math.max(0, OooOOOo());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f4381OoooOOO;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviourArr[0];
        int i18 = this.f4495oo0o0Oo;
        ConstraintAnchor constraintAnchor4 = this.f4372Oooo0o;
        ConstraintAnchor constraintAnchor5 = this.f4373Oooo0o0;
        if (i18 == 0 && OooOO0O.OooO0O0(this.f4483o00000Oo, 1)) {
            o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O0 = this.f4492o0O0O00;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f4381OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr2[1];
            Oooo0O0();
            ArrayList<ConstraintWidget> arrayList = this.f60905o0OOO0o;
            int size3 = arrayList.size();
            for (int i19 = 0; i19 < size3; i19++) {
                arrayList.get(i19).Oooo0O0();
            }
            boolean z12 = this.f4491o000OOo;
            if (dimensionBehaviour13 == ConstraintWidget.DimensionBehaviour.FIXED) {
                Oooo0oo(0, OooOo0O());
            } else {
                constraintAnchor5.OooOO0o(0);
                this.f4387Ooooo0o = 0;
            }
            boolean z13 = false;
            int i20 = 0;
            boolean z14 = false;
            while (i20 < size3) {
                ConstraintWidget constraintWidget3 = arrayList.get(i20);
                ConstraintAnchor constraintAnchor6 = constraintAnchor5;
                if (constraintWidget3 instanceof OooOO0) {
                    OooOO0 oooOO1 = (OooOO0) constraintWidget3;
                    i17 = iMax8;
                    if (oooOO1.f4497o0O0O00 == 1) {
                        int i21 = oooOO1.f4500o0Oo0oo;
                        if (i21 != -1) {
                            oooOO1.OoooOo0(i21);
                        } else if (oooOO1.f4498o0OO00O != -1 && Oooo000()) {
                            oooOO1.OoooOo0(OooOo0O() - oooOO1.f4498o0OO00O);
                        } else if (Oooo000()) {
                            oooOO1.OoooOo0((int) ((oooOO1.f4499o0OOO0o * OooOo0O()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    i17 = iMax8;
                    if ((constraintWidget3 instanceof OooO00o) && ((OooO00o) constraintWidget3).OoooOoo() == 0) {
                        z14 = true;
                    }
                }
                i20++;
                constraintAnchor5 = constraintAnchor6;
                iMax8 = i17;
            }
            i = iMax8;
            constraintAnchor = constraintAnchor5;
            if (z13) {
                for (int i22 = 0; i22 < size3; i22++) {
                    ConstraintWidget constraintWidget4 = arrayList.get(i22);
                    if (constraintWidget4 instanceof OooOO0) {
                        OooOO0 oooOO2 = (OooOO0) constraintWidget4;
                        if (oooOO2.f4497o0O0O00 == 1) {
                            o0O0O00.OooOOO0.OooO0O0(0, oooOO2, interfaceC0449OooO0O0, z12);
                        }
                    }
                }
            }
            o0O0O00.OooOOO0.OooO0O0(0, this, interfaceC0449OooO0O0, z12);
            if (z14) {
                for (int i23 = 0; i23 < size3; i23++) {
                    ConstraintWidget constraintWidget5 = arrayList.get(i23);
                    if (constraintWidget5 instanceof OooO00o) {
                        OooO00o oooO00o = (OooO00o) constraintWidget5;
                        if (oooO00o.OoooOoo() == 0 && oooO00o.OoooOoO()) {
                            o0O0O00.OooOOO0.OooO0O0(1, oooO00o, interfaceC0449OooO0O0, z12);
                        }
                    }
                }
            }
            if (dimensionBehaviour14 == ConstraintWidget.DimensionBehaviour.FIXED) {
                Oooo(0, OooOOOo());
            } else {
                constraintAnchor4.OooOO0o(0);
                this.f4388OooooO0 = 0;
            }
            boolean z15 = false;
            boolean z16 = false;
            for (int i24 = 0; i24 < size3; i24++) {
                ConstraintWidget constraintWidget6 = arrayList.get(i24);
                if (constraintWidget6 instanceof OooOO0) {
                    OooOO0 oooOO3 = (OooOO0) constraintWidget6;
                    if (oooOO3.f4497o0O0O00 == 0) {
                        int i25 = oooOO3.f4500o0Oo0oo;
                        if (i25 != -1) {
                            oooOO3.OoooOo0(i25);
                        } else if (oooOO3.f4498o0OO00O != -1 && Oooo00O()) {
                            oooOO3.OoooOo0(OooOOOo() - oooOO3.f4498o0OO00O);
                        } else if (Oooo00O()) {
                            oooOO3.OoooOo0((int) ((oooOO3.f4499o0OOO0o * OooOOOo()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((constraintWidget6 instanceof OooO00o) && ((OooO00o) constraintWidget6).OoooOoo() == 1) {
                    z16 = true;
                }
            }
            if (z15) {
                for (int i26 = 0; i26 < size3; i26++) {
                    ConstraintWidget constraintWidget7 = arrayList.get(i26);
                    if (constraintWidget7 instanceof OooOO0) {
                        OooOO0 oooOO4 = (OooOO0) constraintWidget7;
                        if (oooOO4.f4497o0O0O00 == 0) {
                            o0O0O00.OooOOO0.OooO0oO(1, oooOO4, interfaceC0449OooO0O0);
                        }
                    }
                }
            }
            o0O0O00.OooOOO0.OooO0oO(0, this, interfaceC0449OooO0O0);
            if (z16) {
                for (int i27 = 0; i27 < size3; i27++) {
                    ConstraintWidget constraintWidget8 = arrayList.get(i27);
                    if (constraintWidget8 instanceof OooO00o) {
                        OooO00o oooO00o2 = (OooO00o) constraintWidget8;
                        if (oooO00o2.OoooOoo() == 1 && oooO00o2.OoooOoO()) {
                            o0O0O00.OooOOO0.OooO0oO(1, oooO00o2, interfaceC0449OooO0O0);
                        }
                    }
                }
            }
            for (int i28 = 0; i28 < size3; i28++) {
                ConstraintWidget constraintWidget9 = arrayList.get(i28);
                if (constraintWidget9.OooOooo() && o0O0O00.OooOOO0.OooO00o(constraintWidget9)) {
                    OooooO0(constraintWidget9, interfaceC0449OooO0O0, o0O0O00.OooOOO0.f41872OooO00o);
                    if (!(constraintWidget9 instanceof OooOO0)) {
                        o0O0O00.OooOOO0.OooO0O0(0, constraintWidget9, interfaceC0449OooO0O0, z12);
                        o0O0O00.OooOOO0.OooO0oO(0, constraintWidget9, interfaceC0449OooO0O0);
                    } else if (((OooOO0) constraintWidget9).f4497o0O0O00 == 0) {
                        o0O0O00.OooOOO0.OooO0oO(0, constraintWidget9, interfaceC0449OooO0O0);
                    } else {
                        o0O0O00.OooOOO0.OooO0O0(0, constraintWidget9, interfaceC0449OooO0O0, z12);
                    }
                }
            }
            for (int i29 = 0; i29 < size2; i29++) {
                ConstraintWidget constraintWidget10 = this.f60905o0OOO0o.get(i29);
                if (constraintWidget10.OooOooo() && !(constraintWidget10 instanceof OooOO0) && !(constraintWidget10 instanceof OooO00o) && !(constraintWidget10 instanceof OooOOO) && !constraintWidget10.f4366Oooo0) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO = constraintWidget10.OooOOOO(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO2 = constraintWidget10.OooOOOO(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (!(dimensionBehaviourOooOOOO == dimensionBehaviour15 && constraintWidget10.f4355OooOo00 != 1 && dimensionBehaviourOooOOOO2 == dimensionBehaviour15 && constraintWidget10.f4354OooOo0 != 1)) {
                        OooooO0(constraintWidget10, this.f4492o0O0O00, new o0O0O00.OooO0O0.OooO00o());
                    }
                }
            }
        } else {
            i = iMax8;
            constraintAnchor = constraintAnchor5;
        }
        androidx.constraintlayout.core.OooO0OO oooO0OO3 = this.f4477o000000;
        if (size2 > 2 && ((dimensionBehaviour12 == (dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour11 == dimensionBehaviour8) && OooOO0O.OooO0O0(this.f4483o00000Oo, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY))) {
            o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O1 = this.f4492o0O0O00;
            ArrayList<ConstraintWidget> arrayList2 = this.f60905o0OOO0o;
            int size4 = arrayList2.size();
            int i30 = 0;
            while (true) {
                if (i30 >= size4) {
                    constraintAnchor2 = constraintAnchor4;
                    ArrayList arrayList3 = null;
                    ArrayList<oo0o0Oo.OooO0O0> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<oo0o0Oo.OooO0O0> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size2;
                        ConstraintWidget constraintWidget11 = arrayList2.get(i31);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviour11;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.f4381OoooOOO;
                        int i33 = iMax7;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr3[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr3[1];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour12;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidget11.f4381OoooOOO;
                        androidx.constraintlayout.core.OooO0OO oooO0OO4 = oooO0OO3;
                        if (!o0O0O00.OooOOO.OooO0O0(dimensionBehaviour17, dimensionBehaviour18, dimensionBehaviourArr4[0], dimensionBehaviourArr4[1])) {
                            OooooO0(constraintWidget11, interfaceC0449OooO0O1, this.f4489o0000oO);
                        }
                        boolean z17 = constraintWidget11 instanceof OooOO0;
                        if (z17) {
                            OooOO0 oooOO5 = (OooOO0) constraintWidget11;
                            if (oooOO5.f4497o0O0O00 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(oooOO5);
                            }
                            if (oooOO5.f4497o0O0O00 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(oooOO5);
                            }
                        }
                        if (constraintWidget11 instanceof oo0o0Oo.OooO0O0) {
                            if (constraintWidget11 instanceof OooO00o) {
                                OooO00o oooO00o3 = (OooO00o) constraintWidget11;
                                if (oooO00o3.OoooOoo() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(oooO00o3);
                                }
                                if (oooO00o3.OoooOoo() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(oooO00o3);
                                }
                            } else {
                                oo0o0Oo.OooO0O0 oooO0O0 = (oo0o0Oo.OooO0O0) constraintWidget11;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(oooO0O0);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(oooO0O0);
                            }
                        }
                        if (constraintWidget11.f4373Oooo0o0.f4329OooO0o == null && constraintWidget11.f4374Oooo0oO.f4329OooO0o == null && !z17 && !(constraintWidget11 instanceof OooO00o)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(constraintWidget11);
                        }
                        if (constraintWidget11.f4372Oooo0o.f4329OooO0o == null && constraintWidget11.f4375Oooo0oo.f4329OooO0o == null && constraintWidget11.f4365Oooo.f4329OooO0o == null && !z17 && !(constraintWidget11 instanceof OooO00o)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(constraintWidget11);
                        }
                        i31++;
                        dimensionBehaviour11 = dimensionBehaviour16;
                        size2 = i32;
                        iMax7 = i33;
                        dimensionBehaviour12 = dimensionBehaviour19;
                        oooO0OO3 = oooO0OO4;
                    }
                    i13 = iMax7;
                    i2 = size2;
                    androidx.constraintlayout.core.OooO0OO oooO0OO5 = oooO0OO3;
                    dimensionBehaviour9 = dimensionBehaviour12;
                    dimensionBehaviour10 = dimensionBehaviour11;
                    ArrayList<o000oOoO> arrayList9 = new ArrayList<>();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            o0O0O00.OooOOO.OooO00o((OooOO0) it.next(), 0, arrayList9, null);
                        }
                    }
                    o000oOoO o000oooo6 = null;
                    int i34 = 0;
                    if (arrayList4 != null) {
                        for (oo0o0Oo.OooO0O0 oooO0O1 : arrayList4) {
                            o000oOoO o000ooooOooO00o = o0O0O00.OooOOO.OooO00o(oooO0O1, i34, arrayList9, o000oooo6);
                            oooO0O1.OoooOo0(i34, o000ooooOooO00o, arrayList9);
                            o000ooooOooO00o.OooO00o(arrayList9);
                            o000oooo6 = null;
                            i34 = 0;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet = OooOOO(ConstraintAnchor.Type.LEFT).f4325OooO00o;
                    if (hashSet != null) {
                        Iterator<ConstraintAnchor> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            o0O0O00.OooOOO.OooO00o(it2.next().f4328OooO0Oo, 0, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet2 = OooOOO(ConstraintAnchor.Type.RIGHT).f4325OooO00o;
                    if (hashSet2 != null) {
                        Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            o0O0O00.OooOOO.OooO00o(it3.next().f4328OooO0Oo, 0, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet3 = OooOOO(ConstraintAnchor.Type.CENTER).f4325OooO00o;
                    if (hashSet3 != null) {
                        Iterator<ConstraintAnchor> it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            o0O0O00.OooOOO.OooO00o(it4.next().f4328OooO0Oo, 0, arrayList9, null);
                        }
                    }
                    o000oOoO o000oooo7 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            o0O0O00.OooOOO.OooO00o((ConstraintWidget) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            o0O0O00.OooOOO.OooO00o((OooOO0) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i35 = 1;
                    if (arrayList6 != null) {
                        for (oo0o0Oo.OooO0O0 oooO0O2 : arrayList6) {
                            o000oOoO o000ooooOooO00o2 = o0O0O00.OooOOO.OooO00o(oooO0O2, i35, arrayList9, o000oooo7);
                            oooO0O2.OoooOo0(i35, o000ooooOooO00o2, arrayList9);
                            o000ooooOooO00o2.OooO00o(arrayList9);
                            o000oooo7 = null;
                            i35 = 1;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet4 = OooOOO(ConstraintAnchor.Type.TOP).f4325OooO00o;
                    if (hashSet4 != null) {
                        Iterator<ConstraintAnchor> it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            o0O0O00.OooOOO.OooO00o(it7.next().f4328OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet5 = OooOOO(ConstraintAnchor.Type.BASELINE).f4325OooO00o;
                    if (hashSet5 != null) {
                        Iterator<ConstraintAnchor> it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            o0O0O00.OooOOO.OooO00o(it8.next().f4328OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet6 = OooOOO(ConstraintAnchor.Type.BOTTOM).f4325OooO00o;
                    if (hashSet6 != null) {
                        Iterator<ConstraintAnchor> it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            o0O0O00.OooOOO.OooO00o(it9.next().f4328OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet7 = OooOOO(ConstraintAnchor.Type.CENTER).f4325OooO00o;
                    if (hashSet7 != null) {
                        Iterator<ConstraintAnchor> it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            o0O0O00.OooOOO.OooO00o(it10.next().f4328OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            o0O0O00.OooOOO.OooO00o((ConstraintWidget) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i36 = 0; i36 < size4; i36++) {
                        ConstraintWidget constraintWidget12 = arrayList2.get(i36);
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = constraintWidget12.f4381OoooOOO;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviourArr5[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour20 == dimensionBehaviour21 && dimensionBehaviourArr5[1] == dimensionBehaviour21) {
                            int i37 = constraintWidget12.f4405o0ooOOo;
                            int size5 = arrayList9.size();
                            int i38 = 0;
                            while (true) {
                                if (i38 >= size5) {
                                    o000oooo4 = null;
                                    break;
                                }
                                o000oooo4 = arrayList9.get(i38);
                                if (i37 == o000oooo4.f41882OooO0O0) {
                                    break;
                                } else {
                                    i38++;
                                }
                            }
                            int i39 = constraintWidget12.f4406o0ooOoO;
                            int size6 = arrayList9.size();
                            int i40 = 0;
                            while (true) {
                                if (i40 >= size6) {
                                    o000oooo5 = null;
                                    break;
                                }
                                o000oooo5 = arrayList9.get(i40);
                                if (i39 == o000oooo5.f41882OooO0O0) {
                                    break;
                                } else {
                                    i40++;
                                }
                            }
                            if (o000oooo4 != null && o000oooo5 != null) {
                                o000oooo4.OooO0OO(0, o000oooo5);
                                o000oooo5.f41883OooO0OO = 2;
                                arrayList9.remove(o000oooo4);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (this.f4381OoooOOO[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                            o000oooo2 = null;
                            int i41 = 0;
                            for (o000oOoO o000oooo8 : arrayList9) {
                                if (o000oooo8.f41883OooO0OO == 1) {
                                    oooO0OO2 = oooO0OO5;
                                } else {
                                    oooO0OO2 = oooO0OO5;
                                    int iOooO0O1 = o000oooo8.OooO0O0(oooO0OO2, 0);
                                    if (iOooO0O1 > i41) {
                                        o000oooo2 = o000oooo8;
                                        oooO0OO5 = oooO0OO2;
                                        i41 = iOooO0O1;
                                    }
                                }
                                oooO0OO5 = oooO0OO2;
                            }
                            oooO0OO = oooO0OO5;
                            if (o000oooo2 != null) {
                                OoooO0(ConstraintWidget.DimensionBehaviour.FIXED);
                                o000oOoO(i41);
                            }
                            if (this.f4381OoooOOO[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                o000oooo3 = null;
                                i14 = 0;
                                for (o000oOoO o000oooo9 : arrayList9) {
                                    if (o000oooo9.f41883OooO0OO != 0 && (iOooO0O0 = o000oooo9.OooO0O0(oooO0OO, 1)) > i14) {
                                        o000oooo3 = o000oooo9;
                                        i14 = iOooO0O0;
                                    }
                                }
                                if (o000oooo3 != null) {
                                    OoooO(ConstraintWidget.DimensionBehaviour.FIXED);
                                    OoooO00(i14);
                                } else {
                                    o000oooo3 = null;
                                }
                            } else {
                                o000oooo3 = null;
                            }
                            if (o000oooo2 == null || o000oooo3 != null) {
                                z11 = true;
                                break;
                            }
                        } else {
                            oooO0OO = oooO0OO5;
                        }
                        o000oooo2 = null;
                        if (this.f4381OoooOOO[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                            o000oooo3 = null;
                            i14 = 0;
                            while (r0.hasNext()) {
                                if (o000oooo9.f41883OooO0OO != 0) {
                                    o000oooo3 = o000oooo9;
                                    i14 = iOooO0O0;
                                }
                            }
                            if (o000oooo3 != null) {
                                OoooO(ConstraintWidget.DimensionBehaviour.FIXED);
                                OoooO00(i14);
                            } else {
                                o000oooo3 = null;
                            }
                        } else {
                            o000oooo3 = null;
                        }
                        if (o000oooo2 == null) {
                        }
                        z11 = true;
                        break;
                    }
                    oooO0OO = oooO0OO5;
                } else {
                    ConstraintWidget constraintWidget13 = arrayList2.get(i30);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr6 = this.f4381OoooOOO;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = dimensionBehaviourArr6[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour23 = dimensionBehaviourArr6[1];
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr7 = constraintWidget13.f4381OoooOOO;
                    constraintAnchor2 = constraintAnchor4;
                    if (o0O0O00.OooOOO.OooO0O0(dimensionBehaviour22, dimensionBehaviour23, dimensionBehaviourArr7[0], dimensionBehaviourArr7[1]) && !(constraintWidget13 instanceof OooO)) {
                        i30++;
                        constraintAnchor4 = constraintAnchor2;
                    } else {
                        i13 = iMax7;
                        i2 = size2;
                        oooO0OO = oooO0OO3;
                        dimensionBehaviour9 = dimensionBehaviour12;
                        dimensionBehaviour10 = dimensionBehaviour11;
                    }
                }
                z11 = false;
                break;
            }
            if (z11) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour24 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                dimensionBehaviour = dimensionBehaviour9;
                if (dimensionBehaviour == dimensionBehaviour24) {
                    i15 = i13;
                    if (i15 >= OooOo0O() || i15 <= 0) {
                        iOooOo0O = OooOo0O();
                    } else {
                        o000oOoO(i15);
                        this.f4484o00000o0 = true;
                    }
                    dimensionBehaviour2 = dimensionBehaviour10;
                    if (dimensionBehaviour2 == dimensionBehaviour24) {
                        i16 = i;
                        if (i16 < OooOOOo() || i16 <= 0) {
                            iOooOOOo = OooOOOo();
                        } else {
                            OoooO00(i16);
                            this.f4488o0000Ooo = true;
                        }
                        z = true;
                    } else {
                        i16 = i;
                    }
                    iOooOOOo = i16;
                    z = true;
                } else {
                    i15 = i13;
                }
                iOooOo0O = i15;
                dimensionBehaviour2 = dimensionBehaviour10;
                if (dimensionBehaviour2 == dimensionBehaviour24) {
                    i16 = i;
                    if (i16 < OooOOOo()) {
                    }
                    iOooOOOo = OooOOOo();
                    z = true;
                } else {
                    i16 = i;
                }
                iOooOOOo = i16;
                z = true;
            } else {
                dimensionBehaviour2 = dimensionBehaviour10;
                i3 = i13;
                dimensionBehaviour = dimensionBehaviour9;
            }
            if (!OooooOO(64) || OooooOO(128)) {
                z2 = true;
            } else {
                z2 = false;
            }
            oooO0OO.getClass();
            oooO0OO.f4242OooO0oO = false;
            if (this.f4483o00000Oo == 0 && z2) {
                c = 1;
                oooO0OO.f4242OooO0oO = true;
            } else {
                c = 1;
            }
            ArrayList<ConstraintWidget> arrayList10 = this.f60905o0OOO0o;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr8 = this.f4381OoooOOO;
            dimensionBehaviour3 = dimensionBehaviourArr8[0];
            dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour3 != dimensionBehaviour4 || dimensionBehaviourArr8[c] == dimensionBehaviour4) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4476o00000 = 0;
            this.f4481o00000O0 = 0;
            i4 = i2;
            for (i5 = 0; i5 < i4; i5++) {
                constraintWidget2 = this.f60905o0OOO0o.get(i5);
                if (constraintWidget2 instanceof oo0o0Oo.OooO0OO) {
                    ((oo0o0Oo.OooO0OO) constraintWidget2).OoooOo0();
                }
            }
            zOooooOO = OooooOO(64);
            z4 = z;
            i6 = 0;
            r13 = 1;
            while (r13 != 0) {
                i7 = i6 + 1;
                try {
                    oooO0OO.OooOOoo();
                    this.f4476o00000 = 0;
                    this.f4481o00000O0 = 0;
                    OooOO0o(oooO0OO);
                    for (i12 = 0; i12 < i4; i12++) {
                        this.f60905o0OOO0o.get(i12).OooOO0o(oooO0OO);
                    }
                    OoooOoo(oooO0OO);
                    try {
                        weakReference = this.f4485o00000oO;
                        if (weakReference != null || weakReference.get() == null) {
                            weakReference2 = this.f4475o0000;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4375Oooo0oo), oooO0OO.OooOO0O(this.f4475o0000.get()), 0, 5);
                                this.f4475o0000 = null;
                            }
                            weakReference3 = this.f4486o00000oo;
                            if (weakReference3 != null && weakReference3.get() != null) {
                                constraintAnchor3 = constraintAnchor;
                                try {
                                    constraintAnchor = constraintAnchor3;
                                    oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4486o00000oo.get()), oooO0OO.OooOO0O(constraintAnchor3), 0, 5);
                                    this.f4486o00000oo = null;
                                } catch (Exception e) {
                                    e = e;
                                    constraintAnchor = constraintAnchor3;
                                    r15 = 1;
                                    e.printStackTrace();
                                    r23 = r15;
                                    System.out.println("EXCEPTION : " + e);
                                    zArr = OooOO0O.f4503OooO00o;
                                    if (r23 != 0) {
                                        zArr[2] = false;
                                        zOooooOO2 = OooooOO(64);
                                        OoooOOo(oooO0OO, zOooooOO2);
                                        size = this.f60905o0OOO0o.size();
                                        i11 = 0;
                                        z9 = false;
                                        while (i11 < size) {
                                            int i42 = size;
                                            constraintWidget = this.f60905o0OOO0o.get(i11);
                                            constraintWidget.OoooOOo(oooO0OO, zOooooOO2);
                                            boolean z18 = zOooooOO2;
                                            boolean z19 = z4;
                                            if (constraintWidget.f4334OooO == -1) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (z10) {
                                                z9 = true;
                                            }
                                            i11++;
                                            size = i42;
                                            zOooooOO2 = z18;
                                            z4 = z19 ? 1 : 0;
                                            z9 = z9;
                                        }
                                        z6 = z4;
                                        z7 = z9;
                                    } else {
                                        z6 = z4 ? 1 : 0;
                                        OoooOOo(oooO0OO, zOooooOO);
                                        for (i8 = 0; i8 < i4; i8++) {
                                            this.f60905o0OOO0o.get(i8).OoooOOo(oooO0OO, zOooooOO);
                                        }
                                        z7 = false;
                                    }
                                    if (z3) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        for (i10 = 0; i10 < i4; i10++) {
                                            ConstraintWidget constraintWidget14 = this.f60905o0OOO0o.get(i10);
                                            iMax4 = Math.max(iMax4, constraintWidget14.OooOo0O() + constraintWidget14.f4387Ooooo0o);
                                            iMax3 = Math.max(iMax3, constraintWidget14.OooOOOo() + constraintWidget14.f4388OooooO0);
                                        }
                                        iMax5 = Math.max(this.f4390OooooOo, iMax4);
                                        iMax6 = Math.max(this.f4392Oooooo0, iMax3);
                                        dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                        z7 = z7;
                                        if (dimensionBehaviour == dimensionBehaviour7) {
                                            z7 = z7;
                                            o000oOoO(iMax5);
                                            this.f4381OoooOOO[0] = dimensionBehaviour7;
                                            z7 = true;
                                            z6 = true;
                                        }
                                        if (dimensionBehaviour2 == dimensionBehaviour7) {
                                            OoooO00(iMax6);
                                            this.f4381OoooOOO[1] = dimensionBehaviour7;
                                            z7 = true;
                                            z6 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f4390OooooOo, OooOo0O());
                                    z8 = z7;
                                    if (iMax > OooOo0O()) {
                                        o000oOoO(iMax);
                                        this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                        z8 = true;
                                        z6 = true;
                                    }
                                    iMax2 = Math.max(this.f4392Oooooo0, OooOOOo());
                                    if (iMax2 > OooOOOo()) {
                                        OoooO00(iMax2);
                                        r12 = 1;
                                        this.f4381OoooOOO[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                                        r21 = 1;
                                        z6 = true;
                                    } else {
                                        r12 = 1;
                                    }
                                    if (z6) {
                                        r21 = z8;
                                        z4 = z6;
                                        i9 = 8;
                                        r22 = r21;
                                    } else {
                                        r21 = z8;
                                        dimensionBehaviour5 = this.f4381OoooOOO[0];
                                        dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                        if (dimensionBehaviour5 == dimensionBehaviour6) {
                                            r21 = r21;
                                            if (OooOo0O() > iOooOo0O) {
                                                this.f4484o00000o0 = r12;
                                                this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                                o000oOoO(iOooOo0O);
                                                ?? r24 = r12;
                                                z6 = r24 == true ? 1 : 0;
                                                r21 = r24;
                                            }
                                        }
                                        r21 = r21;
                                        r21 = r21;
                                        if (this.f4381OoooOOO[r12] == dimensionBehaviour6) {
                                            r21 = z8;
                                            z4 = z6;
                                            i9 = 8;
                                            r22 = r21;
                                        } else {
                                            r21 = z8;
                                            z4 = z6;
                                            i9 = 8;
                                            r22 = r21;
                                        }
                                    }
                                    if (i7 > i9) {
                                        r14 = 0;
                                    } else {
                                        r14 = r22;
                                    }
                                    i6 = i7;
                                    r13 = r14;
                                }
                            }
                            weakReference4 = this.f4487o0000O00;
                            if (weakReference4 == null && weakReference4.get() != null) {
                                oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4374Oooo0oO), oooO0OO.OooOO0O(this.f4487o0000O00.get()), 0, 5);
                                try {
                                    this.f4487o0000O00 = null;
                                } catch (Exception e2) {
                                    e = e2;
                                    r15 = 1;
                                    e.printStackTrace();
                                    r23 = r15;
                                    System.out.println("EXCEPTION : " + e);
                                }
                            }
                            oooO0OO.OooOOOo();
                            r23 = 1;
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintAnchor2;
                            try {
                                constraintAnchor2 = constraintAnchor7;
                                oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4485o00000oO.get()), oooO0OO.OooOO0O(constraintAnchor7), 0, 5);
                                this.f4485o00000oO = null;
                                weakReference2 = this.f4475o0000;
                                if (weakReference2 != null) {
                                    oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4375Oooo0oo), oooO0OO.OooOO0O(this.f4475o0000.get()), 0, 5);
                                    this.f4475o0000 = null;
                                }
                                weakReference3 = this.f4486o00000oo;
                                if (weakReference3 != null) {
                                    constraintAnchor3 = constraintAnchor;
                                    constraintAnchor = constraintAnchor3;
                                    oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4486o00000oo.get()), oooO0OO.OooOO0O(constraintAnchor3), 0, 5);
                                    this.f4486o00000oo = null;
                                }
                                weakReference4 = this.f4487o0000O00;
                                if (weakReference4 == null) {
                                }
                                oooO0OO.OooOOOo();
                                r23 = 1;
                            } catch (Exception e3) {
                                e = e3;
                                constraintAnchor2 = constraintAnchor7;
                                r15 = 1;
                                e.printStackTrace();
                                r23 = r15;
                                System.out.println("EXCEPTION : " + e);
                                zArr = OooOO0O.f4503OooO00o;
                                if (r23 != 0) {
                                    zArr[2] = false;
                                    zOooooOO2 = OooooOO(64);
                                    OoooOOo(oooO0OO, zOooooOO2);
                                    size = this.f60905o0OOO0o.size();
                                    i11 = 0;
                                    z9 = false;
                                    while (i11 < size) {
                                        int i43 = size;
                                        constraintWidget = this.f60905o0OOO0o.get(i11);
                                        constraintWidget.OoooOOo(oooO0OO, zOooooOO2);
                                        boolean z110 = zOooooOO2;
                                        boolean z111 = z4;
                                        if (constraintWidget.f4334OooO == -1) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            z9 = true;
                                        }
                                        i11++;
                                        size = i43;
                                        zOooooOO2 = z110;
                                        z4 = z111 ? 1 : 0;
                                        z9 = z9;
                                    }
                                    z6 = z4;
                                    z7 = z9;
                                } else {
                                    z6 = z4 ? 1 : 0;
                                    OoooOOo(oooO0OO, zOooooOO);
                                    while (i8 < i4) {
                                        this.f60905o0OOO0o.get(i8).OoooOOo(oooO0OO, zOooooOO);
                                    }
                                    z7 = false;
                                }
                                if (z3) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i10 < i4) {
                                        ConstraintWidget constraintWidget15 = this.f60905o0OOO0o.get(i10);
                                        iMax4 = Math.max(iMax4, constraintWidget15.OooOo0O() + constraintWidget15.f4387Ooooo0o);
                                        iMax3 = Math.max(iMax3, constraintWidget15.OooOOOo() + constraintWidget15.f4388OooooO0);
                                    }
                                    iMax5 = Math.max(this.f4390OooooOo, iMax4);
                                    iMax6 = Math.max(this.f4392Oooooo0, iMax3);
                                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                    z7 = z7;
                                    if (dimensionBehaviour == dimensionBehaviour7) {
                                        z7 = z7;
                                        o000oOoO(iMax5);
                                        this.f4381OoooOOO[0] = dimensionBehaviour7;
                                        z7 = true;
                                        z6 = true;
                                    }
                                    if (dimensionBehaviour2 == dimensionBehaviour7) {
                                        OoooO00(iMax6);
                                        this.f4381OoooOOO[1] = dimensionBehaviour7;
                                        z7 = true;
                                        z6 = true;
                                    }
                                }
                                iMax = Math.max(this.f4390OooooOo, OooOo0O());
                                z8 = z7;
                                if (iMax > OooOo0O()) {
                                    o000oOoO(iMax);
                                    this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                    z8 = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.f4392Oooooo0, OooOOOo());
                                if (iMax2 > OooOOOo()) {
                                    OoooO00(iMax2);
                                    r12 = 1;
                                    this.f4381OoooOOO[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                                    r21 = 1;
                                    z6 = true;
                                } else {
                                    r12 = 1;
                                }
                                if (z6) {
                                    r21 = z8;
                                    dimensionBehaviour5 = this.f4381OoooOOO[0];
                                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                                        r21 = r21;
                                        if (OooOo0O() > iOooOo0O) {
                                            this.f4484o00000o0 = r12;
                                            this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                            o000oOoO(iOooOo0O);
                                            ?? r25 = r12;
                                            z6 = r25 == true ? 1 : 0;
                                            r21 = r25;
                                        }
                                    }
                                    r21 = r21;
                                    r21 = r21;
                                    if (this.f4381OoooOOO[r12] == dimensionBehaviour6) {
                                        r21 = z8;
                                        z4 = z6;
                                        i9 = 8;
                                        r22 = r21;
                                    } else {
                                        r21 = z8;
                                        z4 = z6;
                                        i9 = 8;
                                        r22 = r21;
                                    }
                                } else {
                                    r21 = z8;
                                    z4 = z6;
                                    i9 = 8;
                                    r22 = r21;
                                }
                                if (i7 > i9) {
                                    r14 = 0;
                                } else {
                                    r14 = r22;
                                }
                                i6 = i7;
                                r13 = r14;
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    r15 = r13;
                }
                zArr = OooOO0O.f4503OooO00o;
                if (r23 != 0) {
                    zArr[2] = false;
                    zOooooOO2 = OooooOO(64);
                    OoooOOo(oooO0OO, zOooooOO2);
                    size = this.f60905o0OOO0o.size();
                    i11 = 0;
                    z9 = false;
                    while (i11 < size) {
                        int i44 = size;
                        constraintWidget = this.f60905o0OOO0o.get(i11);
                        constraintWidget.OoooOOo(oooO0OO, zOooooOO2);
                        boolean z112 = zOooooOO2;
                        boolean z113 = z4;
                        if (constraintWidget.f4334OooO == -1 || constraintWidget.f4343OooOO0 != -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z9 = true;
                        }
                        i11++;
                        size = i44;
                        zOooooOO2 = z112;
                        z4 = z113 ? 1 : 0;
                        z9 = z9;
                    }
                    z6 = z4;
                    z7 = z9;
                } else {
                    z6 = z4 ? 1 : 0;
                    OoooOOo(oooO0OO, zOooooOO);
                    while (i8 < i4) {
                        this.f60905o0OOO0o.get(i8).OoooOOo(oooO0OO, zOooooOO);
                    }
                    z7 = false;
                }
                if (z3 && i7 < 8 && zArr[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i10 < i4) {
                        ConstraintWidget constraintWidget16 = this.f60905o0OOO0o.get(i10);
                        iMax4 = Math.max(iMax4, constraintWidget16.OooOo0O() + constraintWidget16.f4387Ooooo0o);
                        iMax3 = Math.max(iMax3, constraintWidget16.OooOOOo() + constraintWidget16.f4388OooooO0);
                    }
                    iMax5 = Math.max(this.f4390OooooOo, iMax4);
                    iMax6 = Math.max(this.f4392Oooooo0, iMax3);
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z7 = z7;
                    if (dimensionBehaviour == dimensionBehaviour7 && OooOo0O() < iMax5) {
                        z7 = z7;
                        o000oOoO(iMax5);
                        this.f4381OoooOOO[0] = dimensionBehaviour7;
                        z7 = true;
                        z6 = true;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour7 && OooOOOo() < iMax6) {
                        OoooO00(iMax6);
                        this.f4381OoooOOO[1] = dimensionBehaviour7;
                        z7 = true;
                        z6 = true;
                    }
                }
                iMax = Math.max(this.f4390OooooOo, OooOo0O());
                z8 = z7;
                if (iMax > OooOo0O()) {
                    o000oOoO(iMax);
                    this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    z8 = true;
                    z6 = true;
                }
                iMax2 = Math.max(this.f4392Oooooo0, OooOOOo());
                if (iMax2 > OooOOOo()) {
                    OoooO00(iMax2);
                    r12 = 1;
                    this.f4381OoooOOO[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                    r21 = 1;
                    z6 = true;
                } else {
                    r12 = 1;
                }
                if (z6) {
                    r21 = z8;
                    dimensionBehaviour5 = this.f4381OoooOOO[0];
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour5 == dimensionBehaviour6 && iOooOo0O > 0) {
                        r21 = r21;
                        if (OooOo0O() > iOooOo0O) {
                            this.f4484o00000o0 = r12;
                            this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                            o000oOoO(iOooOo0O);
                            ?? r26 = r12;
                            z6 = r26 == true ? 1 : 0;
                            r21 = r26;
                        }
                    }
                    r21 = r21;
                    r21 = r21;
                    if (this.f4381OoooOOO[r12] == dimensionBehaviour6 || iOooOOOo <= 0 || OooOOOo() <= iOooOOOo) {
                        r21 = z8;
                        z4 = z6;
                        i9 = 8;
                        r22 = r21;
                    } else {
                        this.f4488o0000Ooo = r12;
                        this.f4381OoooOOO[r12] = ConstraintWidget.DimensionBehaviour.FIXED;
                        OoooO00(iOooOOOo);
                        i9 = 8;
                        z4 = true;
                        r22 = 1;
                    }
                } else {
                    r21 = z8;
                    z4 = z6;
                    i9 = 8;
                    r22 = r21;
                }
                if (i7 > i9) {
                    r14 = 0;
                } else {
                    r14 = r22;
                }
                i6 = i7;
                r13 = r14;
            }
            z5 = z4 ? 1 : 0;
            this.f60905o0OOO0o = arrayList10;
            if (z5) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr9 = this.f4381OoooOOO;
                dimensionBehaviourArr9[0] = dimensionBehaviour;
                dimensionBehaviourArr9[1] = dimensionBehaviour2;
            }
            Oooo0OO(oooO0OO.f4246OooOO0o);
        }
        i2 = size2;
        oooO0OO = oooO0OO3;
        dimensionBehaviour = dimensionBehaviour12;
        dimensionBehaviour2 = dimensionBehaviour11;
        constraintAnchor2 = constraintAnchor4;
        i3 = iMax7;
        iOooOo0O = i3;
        iOooOOOo = i;
        z = false;
        if (OooooOO(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        oooO0OO.getClass();
        oooO0OO.f4242OooO0oO = false;
        if (this.f4483o00000Oo == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList<ConstraintWidget> arrayList11 = this.f60905o0OOO0o;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr10 = this.f4381OoooOOO;
        dimensionBehaviour3 = dimensionBehaviourArr10[0];
        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour3 != dimensionBehaviour4) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.f4476o00000 = 0;
        this.f4481o00000O0 = 0;
        i4 = i2;
        while (i5 < i4) {
            constraintWidget2 = this.f60905o0OOO0o.get(i5);
            if (constraintWidget2 instanceof oo0o0Oo.OooO0OO) {
                ((oo0o0Oo.OooO0OO) constraintWidget2).OoooOo0();
            }
        }
        zOooooOO = OooooOO(64);
        z4 = z;
        i6 = 0;
        r13 = 1;
        while (r13 != 0) {
            i7 = i6 + 1;
            oooO0OO.OooOOoo();
            this.f4476o00000 = 0;
            this.f4481o00000O0 = 0;
            OooOO0o(oooO0OO);
            while (i12 < i4) {
                this.f60905o0OOO0o.get(i12).OooOO0o(oooO0OO);
            }
            OoooOoo(oooO0OO);
            weakReference = this.f4485o00000oO;
            if (weakReference != null) {
                weakReference2 = this.f4475o0000;
                if (weakReference2 != null) {
                    oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4375Oooo0oo), oooO0OO.OooOO0O(this.f4475o0000.get()), 0, 5);
                    this.f4475o0000 = null;
                }
                weakReference3 = this.f4486o00000oo;
                if (weakReference3 != null) {
                    constraintAnchor3 = constraintAnchor;
                    constraintAnchor = constraintAnchor3;
                    oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4486o00000oo.get()), oooO0OO.OooOO0O(constraintAnchor3), 0, 5);
                    this.f4486o00000oo = null;
                }
                weakReference4 = this.f4487o0000O00;
                if (weakReference4 == null) {
                }
                oooO0OO.OooOOOo();
                r23 = 1;
            } else {
                weakReference2 = this.f4475o0000;
                if (weakReference2 != null) {
                    oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4375Oooo0oo), oooO0OO.OooOO0O(this.f4475o0000.get()), 0, 5);
                    this.f4475o0000 = null;
                }
                weakReference3 = this.f4486o00000oo;
                if (weakReference3 != null) {
                    constraintAnchor3 = constraintAnchor;
                    constraintAnchor = constraintAnchor3;
                    oooO0OO.OooO0o(oooO0OO.OooOO0O(this.f4486o00000oo.get()), oooO0OO.OooOO0O(constraintAnchor3), 0, 5);
                    this.f4486o00000oo = null;
                }
                weakReference4 = this.f4487o0000O00;
                if (weakReference4 == null) {
                }
                oooO0OO.OooOOOo();
                r23 = 1;
            }
            zArr = OooOO0O.f4503OooO00o;
            if (r23 != 0) {
                zArr[2] = false;
                zOooooOO2 = OooooOO(64);
                OoooOOo(oooO0OO, zOooooOO2);
                size = this.f60905o0OOO0o.size();
                i11 = 0;
                z9 = false;
                while (i11 < size) {
                    int i45 = size;
                    constraintWidget = this.f60905o0OOO0o.get(i11);
                    constraintWidget.OoooOOo(oooO0OO, zOooooOO2);
                    boolean z114 = zOooooOO2;
                    boolean z115 = z4;
                    if (constraintWidget.f4334OooO == -1) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        z9 = true;
                    }
                    i11++;
                    size = i45;
                    zOooooOO2 = z114;
                    z4 = z115 ? 1 : 0;
                    z9 = z9;
                }
                z6 = z4;
                z7 = z9;
            } else {
                z6 = z4 ? 1 : 0;
                OoooOOo(oooO0OO, zOooooOO);
                while (i8 < i4) {
                    this.f60905o0OOO0o.get(i8).OoooOOo(oooO0OO, zOooooOO);
                }
                z7 = false;
            }
            if (z3) {
                iMax3 = 0;
                iMax4 = 0;
                while (i10 < i4) {
                    ConstraintWidget constraintWidget17 = this.f60905o0OOO0o.get(i10);
                    iMax4 = Math.max(iMax4, constraintWidget17.OooOo0O() + constraintWidget17.f4387Ooooo0o);
                    iMax3 = Math.max(iMax3, constraintWidget17.OooOOOo() + constraintWidget17.f4388OooooO0);
                }
                iMax5 = Math.max(this.f4390OooooOo, iMax4);
                iMax6 = Math.max(this.f4392Oooooo0, iMax3);
                dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                z7 = z7;
                if (dimensionBehaviour == dimensionBehaviour7) {
                    z7 = z7;
                    o000oOoO(iMax5);
                    this.f4381OoooOOO[0] = dimensionBehaviour7;
                    z7 = true;
                    z6 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour7) {
                    OoooO00(iMax6);
                    this.f4381OoooOOO[1] = dimensionBehaviour7;
                    z7 = true;
                    z6 = true;
                }
            }
            iMax = Math.max(this.f4390OooooOo, OooOo0O());
            z8 = z7;
            if (iMax > OooOo0O()) {
                o000oOoO(iMax);
                this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z8 = true;
                z6 = true;
            }
            iMax2 = Math.max(this.f4392Oooooo0, OooOOOo());
            if (iMax2 > OooOOOo()) {
                OoooO00(iMax2);
                r12 = 1;
                this.f4381OoooOOO[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                r21 = 1;
                z6 = true;
            } else {
                r12 = 1;
            }
            if (z6) {
                r21 = z8;
                dimensionBehaviour5 = this.f4381OoooOOO[0];
                dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    r21 = r21;
                    if (OooOo0O() > iOooOo0O) {
                        this.f4484o00000o0 = r12;
                        this.f4381OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        o000oOoO(iOooOo0O);
                        ?? r27 = r12;
                        z6 = r27 == true ? 1 : 0;
                        r21 = r27;
                    }
                }
                r21 = r21;
                r21 = r21;
                if (this.f4381OoooOOO[r12] == dimensionBehaviour6) {
                    r21 = z8;
                    z4 = z6;
                    i9 = 8;
                    r22 = r21;
                } else {
                    r21 = z8;
                    z4 = z6;
                    i9 = 8;
                    r22 = r21;
                }
            } else {
                r21 = z8;
                z4 = z6;
                i9 = 8;
                r22 = r21;
            }
            if (i7 > i9) {
                r14 = 0;
            } else {
                r14 = r22;
            }
            i6 = i7;
            r13 = r14;
        }
        z5 = z4 ? 1 : 0;
        this.f60905o0OOO0o = arrayList11;
        if (z5) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr11 = this.f4381OoooOOO;
            dimensionBehaviourArr11[0] = dimensionBehaviour;
            dimensionBehaviourArr11[1] = dimensionBehaviour2;
        }
        Oooo0OO(oooO0OO.f4246OooOO0o);
    }

    public final void OoooOoO(int i, ConstraintWidget constraintWidget) {
        if (i == 0) {
            int i2 = this.f4476o00000 + 1;
            OooO0OO[] oooO0OOArr = this.f4482o00000OO;
            if (i2 >= oooO0OOArr.length) {
                this.f4482o00000OO = (OooO0OO[]) Arrays.copyOf(oooO0OOArr, oooO0OOArr.length * 2);
            }
            OooO0OO[] oooO0OOArr2 = this.f4482o00000OO;
            int i3 = this.f4476o00000;
            oooO0OOArr2[i3] = new OooO0OO(constraintWidget, 0, this.f4491o000OOo);
            this.f4476o00000 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f4481o00000O0 + 1;
            OooO0OO[] oooO0OOArr3 = this.f4480o00000O;
            if (i4 >= oooO0OOArr3.length) {
                this.f4480o00000O = (OooO0OO[]) Arrays.copyOf(oooO0OOArr3, oooO0OOArr3.length * 2);
            }
            OooO0OO[] oooO0OOArr4 = this.f4480o00000O;
            int i5 = this.f4481o00000O0;
            oooO0OOArr4[i5] = new OooO0OO(constraintWidget, 1, this.f4491o000OOo);
            this.f4481o00000O0 = i5 + 1;
        }
    }

    public final void OoooOoo(androidx.constraintlayout.core.OooO0OO oooO0OO) {
        boolean z;
        boolean zOooooOO = OooooOO(64);
        OooO0o(oooO0OO, zOooooOO);
        int size = this.f60905o0OOO0o.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f60905o0OOO0o.get(i);
            boolean[] zArr = constraintWidget.f4395o000oOoO;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof OooO00o) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.f60905o0OOO0o.get(i2);
                if (constraintWidget2 instanceof OooO00o) {
                    OooO00o oooO00o = (OooO00o) constraintWidget2;
                    for (int i3 = 0; i3 < oooO00o.f60904o0Oo0oo; i3++) {
                        ConstraintWidget constraintWidget3 = oooO00o.f60903o0OOO0o[i3];
                        if (oooO00o.f4457oo0o0Oo || constraintWidget3.OooO0oO()) {
                            int i4 = oooO00o.f4456o0OO00O;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.f4395o000oOoO[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.f4395o000oOoO[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.f4490o0000oo;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = this.f60905o0OOO0o.get(i5);
            constraintWidget4.getClass();
            if ((constraintWidget4 instanceof OooOOO) || (constraintWidget4 instanceof OooOO0)) {
                if (constraintWidget4 instanceof OooOOO) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.OooO0o(oooO0OO, zOooooOO);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (it.hasNext()) {
                OooOOO oooOOO = (OooOOO) it.next();
                int i6 = 0;
                while (true) {
                    if (i6 >= oooOOO.f60904o0Oo0oo) {
                        z = false;
                        break;
                    } else {
                        if (hashSet.contains(oooOOO.f60903o0OOO0o[i6])) {
                            z = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (z) {
                    oooOOO.OooO0o(oooO0OO, zOooooOO);
                    hashSet.remove(oooOOO);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().OooO0o(oooO0OO, zOooooOO);
                }
                hashSet.clear();
            }
        }
        if (androidx.constraintlayout.core.OooO0OO.f4233OooOOOo) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = this.f60905o0OOO0o.get(i7);
                constraintWidget5.getClass();
                if (!((constraintWidget5 instanceof OooOOO) || (constraintWidget5 instanceof OooOO0))) {
                    hashSet2.add(constraintWidget5);
                }
            }
            OooO0o0(this, oooO0OO, hashSet2, this.f4381OoooOOO[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget6 : hashSet2) {
                OooOO0O.OooO00o(this, oooO0OO, constraintWidget6);
                constraintWidget6.OooO0o(oooO0OO, zOooooOO);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget7 = this.f60905o0OOO0o.get(i8);
                if (constraintWidget7 instanceof OooO0o) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f4381OoooOOO;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.OoooO0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.OoooO(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.OooO0o(oooO0OO, zOooooOO);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.OoooO0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.OoooO(dimensionBehaviour2);
                    }
                } else {
                    OooOO0O.OooO00o(this, oooO0OO, constraintWidget7);
                    if (!((constraintWidget7 instanceof OooOOO) || (constraintWidget7 instanceof OooOO0))) {
                        constraintWidget7.OooO0o(oooO0OO, zOooooOO);
                    }
                }
            }
        }
        if (this.f4476o00000 > 0) {
            OooO0O0.OooO00o(this, oooO0OO, null, 0);
        }
        if (this.f4481o00000O0 > 0) {
            OooO0O0.OooO00o(this, oooO0OO, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    public final boolean Ooooo00(int i, boolean z) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = true;
        boolean z4 = z & true;
        o0O0O00.OooO oooO = this.f4493o0OO00O;
        OooO0o oooO0o = oooO.f41836OooO00o;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO = oooO0o.OooOOOO(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO2 = oooO0o.OooOOOO(1);
        int iOooOo0o = oooO0o.OooOo0o();
        int iOooOo = oooO0o.OooOo();
        ArrayList<o0OoOo0> arrayList = oooO.f41841OooO0o0;
        if (z4 && (dimensionBehaviourOooOOOO == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourOooOOOO2 == dimensionBehaviour)) {
            for (o0OoOo0 o0oooo0 : arrayList) {
                if (o0oooo0.f41891OooO0o == i && !o0oooo0.OooOO0O()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && dimensionBehaviourOooOOOO == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    oooO0o.OoooO0(ConstraintWidget.DimensionBehaviour.FIXED);
                    oooO0o.o000oOoO(oooO.OooO0Oo(oooO0o, 0));
                    oooO0o.f4338OooO0Oo.f41892OooO0o0.OooO0Oo(oooO0o.OooOo0O());
                }
            } else if (z4 && dimensionBehaviourOooOOOO2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                oooO0o.OoooO(ConstraintWidget.DimensionBehaviour.FIXED);
                oooO0o.OoooO00(oooO.OooO0Oo(oooO0o, 1));
                oooO0o.f4340OooO0o0.f41892OooO0o0.OooO0Oo(oooO0o.OooOOOo());
            }
        }
        if (i == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = oooO0o.f4381OoooOOO[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iOooOo0O = oooO0o.OooOo0O() + iOooOo0o;
                oooO0o.f4338OooO0Oo.f41886OooO.OooO0Oo(iOooOo0O);
                oooO0o.f4338OooO0Oo.f41892OooO0o0.OooO0Oo(iOooOo0O - iOooOo0o);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = oooO0o.f4381OoooOOO[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iOooOOOo = oooO0o.OooOOOo() + iOooOo;
                oooO0o.f4340OooO0o0.f41886OooO.OooO0Oo(iOooOOOo);
                oooO0o.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iOooOOOo - iOooOo);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        oooO.OooO0oO();
        for (o0OoOo0 o0oooo1 : arrayList) {
            if (o0oooo1.f41891OooO0o == i && (o0oooo1.f41888OooO0O0 != oooO0o || o0oooo1.f41893OooO0oO)) {
                o0oooo1.OooO0o0();
            }
        }
        for (o0OoOo0 o0oooo2 : arrayList) {
            if (o0oooo2.f41891OooO0o == i && (z2 || o0oooo2.f41888OooO0O0 != oooO0o)) {
                if (!o0oooo2.f41894OooO0oo.f41868OooOO0 || !o0oooo2.f41886OooO.f41868OooOO0 || (!(o0oooo2 instanceof o0O0O00.OooO0OO) && !o0oooo2.f41892OooO0o0.f41868OooOO0)) {
                    z3 = false;
                    break;
                }
            }
        }
        oooO0o.OoooO0(dimensionBehaviourOooOOOO);
        oooO0o.OoooO(dimensionBehaviourOooOOOO2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x03a8 A[PHI: r13
      0x03a8: PHI (r13v7 boolean) = (r13v6 boolean), (r13v6 boolean), (r13v6 boolean), (r13v10 boolean) binds: [B:202:0x0371, B:204:0x0377, B:206:0x037b, B:222:0x039d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void Ooooo0o(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O0;
        int i8;
        boolean zOoooo00;
        int i9;
        ArrayList<ConstraintWidget> arrayList;
        int i10;
        o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O1;
        o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O2;
        boolean z2;
        int i11;
        boolean z3;
        OooOo oooOo;
        Oooo0 oooo0;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        boolean z5;
        OooO0o oooO0o = this;
        oooO0o.f4478o000000O = i6;
        oooO0o.f4479o000000o = i7;
        o0O0O00.OooO0O0 oooO0O0 = oooO0o.f4494o0Oo0oo;
        oooO0O0.getClass();
        o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O3 = oooO0o.f4492o0O0O00;
        int size = oooO0o.f60905o0OOO0o.size();
        int iOooOo0O = OooOo0O();
        int iOooOOOo = OooOOOo();
        boolean zOooO0O0 = OooOO0O.OooO0O0(i, 128);
        char c = 0;
        boolean z6 = zOooO0O0 || OooOO0O.OooO0O0(i, 64);
        if (z6) {
            int i16 = 0;
            while (i16 < size) {
                ConstraintWidget constraintWidget = oooO0o.f60905o0OOO0o.get(i16);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4381OoooOOO;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[c];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z7 = (dimensionBehaviour == dimensionBehaviour2) && (dimensionBehaviourArr[1] == dimensionBehaviour2) && constraintWidget.f4385OoooOoo > 0.0f;
                if ((constraintWidget.OooOoo() && z7) || ((constraintWidget.OooOooO() && z7) || (constraintWidget instanceof OooOOO) || constraintWidget.OooOoo() || constraintWidget.OooOooO())) {
                    z6 = false;
                    break;
                } else {
                    i16++;
                    c = 0;
                }
            }
        }
        boolean z8 = z6 & ((i2 == 1073741824 && i4 == 1073741824) || zOooO0O0);
        if (z8) {
            int iMin = Math.min(oooO0o.f4364OooOooo[0], i3);
            int iMin2 = Math.min(oooO0o.f4364OooOooo[1], i5);
            o0O0O00.OooO oooO = oooO0o.f4493o0OO00O;
            if (i2 == 1073741824 && OooOo0O() != iMin) {
                oooO0o.o000oOoO(iMin);
                oooO.f41837OooO0O0 = true;
            }
            if (i4 == 1073741824 && OooOOOo() != iMin2) {
                oooO0o.OoooO00(iMin2);
                oooO.f41837OooO0O0 = true;
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                boolean z9 = zOooO0O0 & true;
                boolean z10 = oooO.f41837OooO0O0;
                OooO0o oooO0o2 = oooO.f41836OooO00o;
                if (z10 || oooO.f41838OooO0OO) {
                    for (ConstraintWidget constraintWidget2 : oooO0o2.f60905o0OOO0o) {
                        constraintWidget2.OooOOO0();
                        constraintWidget2.f4335OooO00o = false;
                        constraintWidget2.f4338OooO0Oo.OooOOO();
                        constraintWidget2.f4340OooO0o0.OooOOO0();
                    }
                    i15 = 0;
                    oooO0o2.OooOOO0();
                    oooO0o2.f4335OooO00o = false;
                    oooO0o2.f4338OooO0Oo.OooOOO();
                    oooO0o2.f4340OooO0o0.OooOOO0();
                    oooO.f41838OooO0OO = false;
                } else {
                    i15 = 0;
                }
                oooO.OooO0O0(oooO.f41839OooO0Oo);
                oooO0o2.f4387Ooooo0o = i15;
                oooO0o2.f4388OooooO0 = i15;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO = oooO0o2.OooOOOO(i15);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO2 = oooO0o2.OooOOOO(1);
                if (oooO.f41837OooO0O0) {
                    oooO.OooO0OO();
                }
                int iOooOo0o = oooO0o2.OooOo0o();
                int iOooOo = oooO0o2.OooOo();
                z = z8;
                oooO0o2.f4338OooO0Oo.f41894OooO0oo.OooO0Oo(iOooOo0o);
                oooO0o2.f4340OooO0o0.f41894OooO0oo.OooO0Oo(iOooOo);
                oooO.OooO0oO();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                interfaceC0449OooO0O0 = interfaceC0449OooO0O3;
                ArrayList<o0OoOo0> arrayList2 = oooO.f41841OooO0o0;
                if (dimensionBehaviourOooOOOO == dimensionBehaviour3 || dimensionBehaviourOooOOOO2 == dimensionBehaviour3) {
                    if (z9) {
                        Iterator<o0OoOo0> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (!it.next().OooOO0O()) {
                                z9 = false;
                                break;
                            }
                        }
                    }
                    if (z9 && dimensionBehaviourOooOOOO == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        oooO0o2.OoooO0(ConstraintWidget.DimensionBehaviour.FIXED);
                        oooO0o2.o000oOoO(oooO.OooO0Oo(oooO0o2, 0));
                        oooO0o2.f4338OooO0Oo.f41892OooO0o0.OooO0Oo(oooO0o2.OooOo0O());
                    }
                    if (z9 && dimensionBehaviourOooOOOO2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        oooO0o2.OoooO(ConstraintWidget.DimensionBehaviour.FIXED);
                        oooO0o2.OoooO00(oooO.OooO0Oo(oooO0o2, 1));
                        oooO0o2.f4340OooO0o0.f41892OooO0o0.OooO0Oo(oooO0o2.OooOOOo());
                    }
                } else {
                    iOooOo0O = iOooOo0O;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = oooO0o2.f4381OoooOOO[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    int iOooOo0O2 = oooO0o2.OooOo0O() + iOooOo0o;
                    oooO0o2.f4338OooO0Oo.f41886OooO.OooO0Oo(iOooOo0O2);
                    oooO0o2.f4338OooO0Oo.f41892OooO0o0.OooO0Oo(iOooOo0O2 - iOooOo0o);
                    oooO.OooO0oO();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = oooO0o2.f4381OoooOOO[1];
                    if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        int iOooOOOo2 = oooO0o2.OooOOOo() + iOooOo;
                        oooO0o2.f4340OooO0o0.f41886OooO.OooO0Oo(iOooOOOo2);
                        oooO0o2.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iOooOOOo2 - iOooOo);
                    }
                    oooO.OooO0oO();
                    z4 = true;
                } else {
                    z4 = false;
                }
                for (o0OoOo0 o0oooo0 : arrayList2) {
                    if (o0oooo0.f41888OooO0O0 != oooO0o2 || o0oooo0.f41893OooO0oO) {
                        o0oooo0.OooO0o0();
                    }
                }
                Iterator<o0OoOo0> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z5 = true;
                        break;
                    }
                    o0OoOo0 next = it2.next();
                    if (z4 || next.f41888OooO0O0 != oooO0o2) {
                        if (!next.f41894OooO0oo.f41868OooOO0 || ((!next.f41886OooO.f41868OooOO0 && !(next instanceof OooOOOO)) || (!next.f41892OooO0o0.f41868OooOO0 && !(next instanceof o0O0O00.OooO0OO) && !(next instanceof OooOOOO)))) {
                            z5 = false;
                            break;
                        }
                    }
                }
                oooO0o2.OoooO0(dimensionBehaviourOooOOOO);
                oooO0o2.OoooO(dimensionBehaviourOooOOOO2);
                zOoooo00 = z5;
                i13 = Pow2.MAX_POW2;
                i8 = 2;
            } else {
                z = z8;
                interfaceC0449OooO0O0 = interfaceC0449OooO0O3;
                iOooOo0O = iOooOo0O;
                boolean z11 = oooO.f41837OooO0O0;
                OooO0o oooO0o3 = oooO.f41836OooO00o;
                if (z11) {
                    for (ConstraintWidget constraintWidget3 : oooO0o3.f60905o0OOO0o) {
                        constraintWidget3.OooOOO0();
                        constraintWidget3.f4335OooO00o = false;
                        OooOo oooOo2 = constraintWidget3.f4338OooO0Oo;
                        oooOo2.f41892OooO0o0.f41868OooOO0 = false;
                        oooOo2.f41893OooO0oO = false;
                        oooOo2.OooOOO();
                        Oooo0 oooo1 = constraintWidget3.f4340OooO0o0;
                        oooo1.f41892OooO0o0.f41868OooOO0 = false;
                        oooo1.f41893OooO0oO = false;
                        oooo1.OooOOO0();
                    }
                    i12 = 0;
                    oooO0o3.OooOOO0();
                    oooO0o3.f4335OooO00o = false;
                    OooOo oooOo3 = oooO0o3.f4338OooO0Oo;
                    oooOo3.f41892OooO0o0.f41868OooOO0 = false;
                    oooOo3.f41893OooO0oO = false;
                    oooOo3.OooOOO();
                    Oooo0 oooo2 = oooO0o3.f4340OooO0o0;
                    oooo2.f41892OooO0o0.f41868OooOO0 = false;
                    oooo2.f41893OooO0oO = false;
                    oooo2.OooOOO0();
                    oooO.OooO0OO();
                } else {
                    i12 = 0;
                }
                oooO.OooO0O0(oooO.f41839OooO0Oo);
                oooO0o3.f4387Ooooo0o = i12;
                oooO0o3.f4388OooooO0 = i12;
                oooO0o3.f4338OooO0Oo.f41894OooO0oo.OooO0Oo(i12);
                oooO0o3.f4340OooO0o0.f41894OooO0oo.OooO0Oo(i12);
                i13 = Pow2.MAX_POW2;
                if (i2 == 1073741824) {
                    i14 = 1;
                    i8 = 1;
                    zOoooo00 = oooO0o.Ooooo00(i12, zOooO0O0) & true;
                } else {
                    i14 = 1;
                    zOoooo00 = true;
                    i8 = 0;
                }
                if (i4 == 1073741824) {
                    i8++;
                    zOoooo00 &= oooO0o.Ooooo00(i14, zOooO0O0);
                }
            }
            if (zOoooo00) {
                oooO0o.OoooOOO(i2 == i13, i4 == i13);
            }
        } else {
            z = z8;
            interfaceC0449OooO0O0 = interfaceC0449OooO0O3;
            iOooOo0O = iOooOo0O;
            i8 = 0;
            zOoooo00 = false;
        }
        if (zOoooo00 && i8 == 2) {
            return;
        }
        int i17 = oooO0o.f4483o00000Oo;
        if (size > 0) {
            int size2 = oooO0o.f60905o0OOO0o.size();
            boolean zOooooOO = oooO0o.OooooOO(64);
            o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O4 = oooO0o.f4492o0O0O00;
            for (int i18 = 0; i18 < size2; i18++) {
                ConstraintWidget constraintWidget4 = oooO0o.f60905o0OOO0o.get(i18);
                if (!(constraintWidget4 instanceof OooOO0) && !(constraintWidget4 instanceof OooO00o) && !constraintWidget4.f4366Oooo0 && (!zOooooOO || (oooOo = constraintWidget4.f4338OooO0Oo) == null || (oooo0 = constraintWidget4.f4340OooO0o0) == null || !oooOo.f41892OooO0o0.f41868OooOO0 || !oooo0.f41892OooO0o0.f41868OooOO0)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO3 = constraintWidget4.OooOOOO(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOOO4 = constraintWidget4.OooOOOO(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z12 = dimensionBehaviourOooOOOO3 == dimensionBehaviour7 && constraintWidget4.f4355OooOo00 != 1 && dimensionBehaviourOooOOOO4 == dimensionBehaviour7 && constraintWidget4.f4354OooOo0 != 1;
                    if (!z12 && oooO0o.OooooOO(1) && !(constraintWidget4 instanceof OooOOO)) {
                        if (dimensionBehaviourOooOOOO3 == dimensionBehaviour7 && constraintWidget4.f4355OooOo00 == 0 && dimensionBehaviourOooOOOO4 != dimensionBehaviour7 && !constraintWidget4.OooOoo()) {
                            z12 = true;
                        }
                        if (dimensionBehaviourOooOOOO4 == dimensionBehaviour7 && constraintWidget4.f4354OooOo0 == 0 && dimensionBehaviourOooOOOO3 != dimensionBehaviour7 && !constraintWidget4.OooOoo()) {
                            z12 = true;
                        }
                        if (dimensionBehaviourOooOOOO3 == dimensionBehaviour7 || dimensionBehaviourOooOOOO4 == dimensionBehaviour7) {
                            if (constraintWidget4.f4385OoooOoo > 0.0f) {
                                z12 = true;
                            }
                        }
                    }
                    if (!z12) {
                        oooO0O0.OooO00o(0, constraintWidget4, interfaceC0449OooO0O4);
                    }
                }
            }
            interfaceC0449OooO0O4.OooO00o();
        }
        oooO0O0.OooO0OO(oooO0o);
        ArrayList<ConstraintWidget> arrayList3 = oooO0O0.f41844OooO00o;
        int size3 = arrayList3.size();
        int i19 = iOooOo0O;
        if (size > 0) {
            oooO0O0.OooO0O0(oooO0o, 0, i19, iOooOOOo);
        }
        if (size3 > 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = oooO0o.f4381OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z13 = dimensionBehaviour8 == dimensionBehaviour9;
            boolean z14 = dimensionBehaviourArr2[1] == dimensionBehaviour9;
            int iOooOo0O3 = OooOo0O();
            OooO0o oooO0o4 = oooO0O0.f41846OooO0OO;
            int iMax = Math.max(iOooOo0O3, oooO0o4.f4390OooooOo);
            int iMax2 = Math.max(OooOOOo(), oooO0o4.f4392Oooooo0);
            int i20 = 0;
            boolean z15 = false;
            while (i20 < size3) {
                ConstraintWidget constraintWidget5 = arrayList3.get(i20);
                if (constraintWidget5 instanceof OooOOO) {
                    int iOooOo0O4 = constraintWidget5.OooOo0O();
                    int iOooOOOo3 = constraintWidget5.OooOOOo();
                    interfaceC0449OooO0O2 = interfaceC0449OooO0O0;
                    boolean zOooO00o = z15 | oooO0O0.OooO00o(1, constraintWidget5, interfaceC0449OooO0O2);
                    int iOooOo0O5 = constraintWidget5.OooOo0O();
                    int iOooOOOo4 = constraintWidget5.OooOOOo();
                    if (iOooOo0O5 != iOooOo0O4) {
                        constraintWidget5.o000oOoO(iOooOo0O5);
                        if (z13 && constraintWidget5.OooOo0o() + constraintWidget5.f4383OoooOo0 > iMax) {
                            iMax = Math.max(iMax, constraintWidget5.OooOOO(ConstraintAnchor.Type.RIGHT).OooO0o0() + constraintWidget5.OooOo0o() + constraintWidget5.f4383OoooOo0);
                        }
                        z2 = true;
                    } else {
                        z2 = zOooO00o;
                    }
                    if (iOooOOOo4 != iOooOOOo3) {
                        constraintWidget5.OoooO00(iOooOOOo4);
                        if (z14 && constraintWidget5.OooOo() + constraintWidget5.f4384OoooOoO > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget5.OooOOO(ConstraintAnchor.Type.BOTTOM).OooO0o0() + constraintWidget5.OooOo() + constraintWidget5.f4384OoooOoO);
                        }
                        i11 = iMax2;
                        z3 = true;
                    } else {
                        i11 = iMax2;
                        z3 = z2;
                    }
                    z15 = z3 | ((OooOOO) constraintWidget5).f4507o000000o;
                    iMax2 = i11;
                } else {
                    interfaceC0449OooO0O2 = interfaceC0449OooO0O0;
                }
                i20++;
                interfaceC0449OooO0O0 = interfaceC0449OooO0O2;
                i17 = i17;
            }
            i9 = i17;
            o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O5 = interfaceC0449OooO0O0;
            int i21 = 2;
            int i22 = 0;
            while (i22 < i21) {
                int iMax3 = iMax2;
                boolean zOooO00o2 = z15;
                int i23 = 0;
                while (i23 < size3) {
                    ConstraintWidget constraintWidget6 = arrayList3.get(i23);
                    if (((constraintWidget6 instanceof oo0o0Oo.OooO00o) && !(constraintWidget6 instanceof OooOOO)) || (constraintWidget6 instanceof OooOO0) || constraintWidget6.f4403o0OoOo0 == 8 || ((z && constraintWidget6.f4338OooO0Oo.f41892OooO0o0.f41868OooOO0 && constraintWidget6.f4340OooO0o0.f41892OooO0o0.f41868OooOO0) || (constraintWidget6 instanceof OooOOO))) {
                        interfaceC0449OooO0O1 = interfaceC0449OooO0O5;
                        arrayList = arrayList3;
                        i10 = size3;
                    } else {
                        int iOooOo0O6 = constraintWidget6.OooOo0O();
                        int iOooOOOo5 = constraintWidget6.OooOOOo();
                        arrayList = arrayList3;
                        int i24 = constraintWidget6.f4389OooooOO;
                        i10 = size3;
                        zOooO00o2 |= oooO0O0.OooO00o(i22 == 1 ? 2 : 1, constraintWidget6, interfaceC0449OooO0O5);
                        int iOooOo0O7 = constraintWidget6.OooOo0O();
                        interfaceC0449OooO0O1 = interfaceC0449OooO0O5;
                        int iOooOOOo6 = constraintWidget6.OooOOOo();
                        if (iOooOo0O7 != iOooOo0O6) {
                            constraintWidget6.o000oOoO(iOooOo0O7);
                            if (z13 && constraintWidget6.OooOo0o() + constraintWidget6.f4383OoooOo0 > iMax) {
                                iMax = Math.max(iMax, constraintWidget6.OooOOO(ConstraintAnchor.Type.RIGHT).OooO0o0() + constraintWidget6.OooOo0o() + constraintWidget6.f4383OoooOo0);
                            }
                            zOooO00o2 = true;
                        }
                        if (iOooOOOo6 != iOooOOOo5) {
                            constraintWidget6.OoooO00(iOooOOOo6);
                            if (z14 && constraintWidget6.OooOo() + constraintWidget6.f4384OoooOoO > iMax3) {
                                iMax3 = Math.max(iMax3, constraintWidget6.OooOOO(ConstraintAnchor.Type.BOTTOM).OooO0o0() + constraintWidget6.OooOo() + constraintWidget6.f4384OoooOoO);
                            }
                            zOooO00o2 = true;
                        }
                        if (constraintWidget6.f4368Oooo00O && i24 != constraintWidget6.f4389OooooOO) {
                            zOooO00o2 = true;
                        }
                    }
                    i23++;
                    size3 = i10;
                    arrayList3 = arrayList;
                    interfaceC0449OooO0O5 = interfaceC0449OooO0O1;
                }
                o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O6 = interfaceC0449OooO0O5;
                ArrayList<ConstraintWidget> arrayList4 = arrayList3;
                int i25 = size3;
                if (!zOooO00o2) {
                    break;
                }
                i22++;
                oooO0O0.OooO0O0(this, i22, i19, iOooOOOo);
                size3 = i25;
                iMax2 = iMax3;
                arrayList3 = arrayList4;
                interfaceC0449OooO0O5 = interfaceC0449OooO0O6;
                i21 = 2;
                z15 = false;
            }
            oooO0o = this;
        } else {
            i9 = i17;
        }
        oooO0o.f4483o00000Oo = i9;
        androidx.constraintlayout.core.OooO0OO.f4233OooOOOo = oooO0o.OooooOO(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    public final boolean OooooOO(int i) {
        return (this.f4483o00000Oo & i) == i;
    }

    public OooO0o(int i) {
        super(0);
        this.f4494o0Oo0oo = new o0O0O00.OooO0O0(this);
        this.f4493o0OO00O = new o0O0O00.OooO(this);
        this.f4492o0O0O00 = null;
        this.f4491o000OOo = false;
        this.f4477o000000 = new androidx.constraintlayout.core.OooO0OO();
        this.f4476o00000 = 0;
        this.f4481o00000O0 = 0;
        this.f4480o00000O = new OooO0OO[4];
        this.f4482o00000OO = new OooO0OO[4];
        this.f4483o00000Oo = 257;
        this.f4484o00000o0 = false;
        this.f4488o0000Ooo = false;
        this.f4485o00000oO = null;
        this.f4486o00000oo = null;
        this.f4475o0000 = null;
        this.f4487o0000O00 = null;
        this.f4490o0000oo = new HashSet<>();
        this.f4489o0000oO = new o0O0O00.OooO0O0.OooO00o();
    }
}
