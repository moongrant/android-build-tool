package androidx.constraintlayout.core.widgets;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p061o0000o0.OooOo;
import p061o0000o0.Oooo000;
import p061o0000o0.o000oOoO;
import p061o0000o0.o00Ooo;
import p061o0000o0.o00oO0o;
import p061o0000o0.o0O0O00;
import p061o0000o0.o0OO00O;
import p061o0000o0.o0OOO0o;
import p061o0000o0.oo000o;
import p061o0000o0.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends p058o0000OoO.OooOOO0 {

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f7041o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public int f7042o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public androidx.constraintlayout.core.OooO0OO f7043o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f7044o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public int f7045o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public OooO0OO[] f7046o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f7047o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public OooO0OO[] f7048o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public int f7049o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public boolean f7050o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f7051o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f7052o00000oo;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f7053o0000O00;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public boolean f7054o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public OooOo.OooO00o f7055o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public HashSet<ConstraintWidget> f7056o0000oo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f7057o000OOo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public OooOo.OooO0O0 f7058o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public o000oOoO f7059o0OO00O;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public OooOo f7060o0Oo0oo;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f7061oo0o0Oo;

    public OooO0o() {
        this.f7060o0Oo0oo = new OooOo(this);
        this.f7059o0OO00O = new o000oOoO(this);
        this.f7058o0O0O00 = null;
        this.f7057o000OOo = false;
        this.f7043o000000 = new androidx.constraintlayout.core.OooO0OO();
        this.f7042o00000 = 0;
        this.f7047o00000O0 = 0;
        this.f7046o00000O = new OooO0OO[4];
        this.f7048o00000OO = new OooO0OO[4];
        this.f7049o00000Oo = 257;
        this.f7050o00000o0 = false;
        this.f7054o0000Ooo = false;
        this.f7051o00000oO = null;
        this.f7052o00000oo = null;
        this.f7041o0000 = null;
        this.f7053o0000O00 = null;
        this.f7056o0000oo = new HashSet<>();
        this.f7055o0000oO = new OooOo.OooO00o();
    }

    public static boolean o00o0O(ConstraintWidget constraintWidget, OooOo.OooO0O0 oooO0O0, OooOo.OooO00o oooO00o) {
        int i;
        int i2;
        if (oooO0O0 == null) {
            return false;
        }
        if (constraintWidget.f6969o0OoOo0 == 8 || (constraintWidget instanceof OooOO0) || (constraintWidget instanceof OooO00o)) {
            oooO00o.f27843OooO0o0 = 0;
            oooO00o.f27842OooO0o = 0;
            return false;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f6947OoooOOO;
        oooO00o.f27838OooO00o = dimensionBehaviourArr[0];
        oooO00o.f27839OooO0O0 = dimensionBehaviourArr[1];
        oooO00o.f27840OooO0OO = constraintWidget.OooOoO0();
        oooO00o.f27841OooO0Oo = constraintWidget.OooOOo();
        oooO00o.f27837OooO = false;
        oooO00o.f27846OooOO0 = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = oooO00o.f27838OooO00o;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = oooO00o.f27839OooO0O0 == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        boolean z4 = z2 && constraintWidget.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (z && constraintWidget.OooOoo0(0) && constraintWidget.f6921OooOo00 == 0 && !z3) {
            oooO00o.f27838OooO00o = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.f6920OooOo0 == 0) {
                oooO00o.f27838OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.OooOoo0(1) && constraintWidget.f6920OooOo0 == 0 && !z4) {
            oooO00o.f27839OooO0O0 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.f6921OooOo00 == 0) {
                oooO00o.f27839OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.Oooo0()) {
            oooO00o.f27838OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.Oooo0O0()) {
            oooO00o.f27839OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.f6922OooOo0O[0] == 4) {
                oooO00o.f27838OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = oooO00o.f27839OooO0O0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i2 = oooO00o.f27841OooO0Oo;
                } else {
                    oooO00o.f27838OooO00o = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    oooO0O0.OooO0O0(constraintWidget, oooO00o);
                    i2 = oooO00o.f27842OooO0o;
                }
                oooO00o.f27838OooO00o = dimensionBehaviour4;
                oooO00o.f27840OooO0OO = (int) (constraintWidget.f6951OoooOoo * i2);
            }
        }
        if (z4) {
            if (constraintWidget.f6922OooOo0O[1] == 4) {
                oooO00o.f27839OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = oooO00o.f27838OooO00o;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i = oooO00o.f27840OooO0OO;
                } else {
                    oooO00o.f27839OooO0O0 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    oooO0O0.OooO0O0(constraintWidget, oooO00o);
                    i = oooO00o.f27843OooO0o0;
                }
                oooO00o.f27839OooO0O0 = dimensionBehaviour6;
                if (constraintWidget.f6952Ooooo00 == -1) {
                    oooO00o.f27841OooO0Oo = (int) (i / constraintWidget.f6951OoooOoo);
                } else {
                    oooO00o.f27841OooO0Oo = (int) (constraintWidget.f6951OoooOoo * i);
                }
            }
        }
        oooO0O0.OooO0O0(constraintWidget, oooO00o);
        constraintWidget.Ooooo00(oooO00o.f27843OooO0o0);
        constraintWidget.OoooOO0(oooO00o.f27842OooO0o);
        constraintWidget.f6934Oooo00O = oooO00o.f27845OooO0oo;
        constraintWidget.OoooO00(oooO00o.f27844OooO0oO);
        oooO00o.f27846OooOO0 = 0;
        return oooO00o.f27837OooO;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void OooOo0O(StringBuilder sb) {
        sb.append(this.f6911OooOO0o + ":{\n");
        sb.append("  actualWidth:" + this.f6949OoooOo0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f6950OoooOoO);
        sb.append("\n");
        Iterator<ConstraintWidget> it = this.f27656o0OOO0o.iterator();
        while (it.hasNext()) {
            it.next().OooOo0O(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // p058o0000OoO.OooOOO0, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Oooo0OO() {
        this.f7043o000000.OooOo0();
        this.f7044o000000O = 0;
        this.f7045o000000o = 0;
        super.Oooo0OO();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Ooooo0o(boolean z, boolean z2) {
        super.Ooooo0o(z, z2);
        int size = this.f27656o0OOO0o.size();
        for (int i = 0; i < size; i++) {
            this.f27656o0OOO0o.get(i).Ooooo0o(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:331:0x0590  */
    /* JADX WARN: Code duplicated, block: B:345:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:363:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:368:0x060c  */
    /* JADX WARN: Code duplicated, block: B:380:0x0636  */
    /* JADX WARN: Code duplicated, block: B:385:0x0649  */
    /* JADX WARN: Code duplicated, block: B:392:0x065b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0665  */
    /* JADX WARN: Code duplicated, block: B:397:0x0671  */
    /* JADX WARN: Code duplicated, block: B:401:0x0682  */
    /* JADX WARN: Code duplicated, block: B:404:0x0697 A[Catch: Exception -> 0x0760, LOOP:12: B:403:0x0695->B:404:0x0697, LOOP_END, TryCatch #0 {Exception -> 0x0760, blocks: (B:402:0x0685, B:404:0x0697, B:405:0x06a7), top: B:509:0x0685 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x0755  */
    /* JADX WARN: Code duplicated, block: B:445:0x077d  */
    /* JADX WARN: Code duplicated, block: B:447:0x0799  */
    /* JADX WARN: Code duplicated, block: B:453:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:455:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:458:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:460:0x07cd A[LOOP:15: B:459:0x07cb->B:460:0x07cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:469:0x07f1 A[LOOP:14: B:468:0x07ef->B:469:0x07f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:481:0x085a  */
    /* JADX WARN: Code duplicated, block: B:484:0x0877  */
    /* JADX WARN: Code duplicated, block: B:485:0x0885  */
    /* JADX WARN: Code duplicated, block: B:487:0x0888  */
    /* JADX WARN: Code duplicated, block: B:499:0x08c6 A[PHI: r10 r20
      0x08c6: PHI (r10v7 boolean) = (r10v6 boolean), (r10v9 boolean), (r10v9 boolean), (r10v9 boolean) binds: [B:486:0x0886, B:494:0x08ab, B:495:0x08ad, B:497:0x08b3] A[DONT_GENERATE, DONT_INLINE]
      0x08c6: PHI (r20v8 boolean) = (r20v7 boolean), (r20v10 boolean), (r20v10 boolean), (r20v10 boolean) binds: [B:486:0x0886, B:494:0x08ab, B:495:0x08ad, B:497:0x08b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:501:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:502:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:506:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:564:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x07b9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean] */
    @Override // p058o0000OoO.OooOOO0
    public final void OooooOO() {
        int i;
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i3;
        int iOooOoO0;
        int iOooOOo;
        boolean z;
        boolean z2;
        char c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        boolean z3;
        int i4;
        int i5;
        boolean zO00ooo;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        boolean z6;
        int iMax;
        int iMax2;
        ?? r12;
        int i9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        int i10;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        androidx.constraintlayout.core.OooO0OO oooO0OO;
        boolean zO00ooo2;
        int size;
        int i11;
        ConstraintWidget constraintWidget;
        boolean z7;
        int i12;
        WeakReference<ConstraintAnchor> weakReference;
        WeakReference<ConstraintAnchor> weakReference2;
        WeakReference<ConstraintAnchor> weakReference3;
        WeakReference<ConstraintAnchor> weakReference4;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        int i13;
        int i14;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10;
        oo0o0Oo oo0o0oo;
        oo0o0Oo oo0o0oo2;
        boolean z8;
        int iOooO0OO;
        int iOooO0OO2;
        int i15;
        int i16;
        this.f6953Ooooo0o = 0;
        this.f6954OooooO0 = 0;
        this.f7050o00000o0 = false;
        this.f7054o0000Ooo = false;
        int size2 = this.f27656o0OOO0o.size();
        int iMax7 = Math.max(0, OooOoO0());
        int iMax8 = Math.max(0, OooOOo());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f6947OoooOOO;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviourArr[0];
        if (this.f7061oo0o0Oo == 0 && OooOO0O.OooO0O0(this.f7049o00000Oo, 1)) {
            OooOo.OooO0O0 oooO0O0 = this.f7058o0O0O00;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f6947OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr2[1];
            Oooo0o();
            ArrayList<ConstraintWidget> arrayList = this.f27656o0OOO0o;
            int size3 = arrayList.size();
            for (int i17 = 0; i17 < size3; i17++) {
                arrayList.get(i17).Oooo0o();
            }
            boolean z9 = this.f7057o000OOo;
            if (dimensionBehaviour13 == ConstraintWidget.DimensionBehaviour.FIXED) {
                OoooO0O(0, OooOoO0());
            } else {
                this.f6939Oooo0o0.OooOOO0(0);
                this.f6953Ooooo0o = 0;
            }
            boolean z10 = false;
            boolean z11 = false;
            for (int i18 = 0; i18 < size3; i18++) {
                ConstraintWidget constraintWidget3 = arrayList.get(i18);
                if (constraintWidget3 instanceof OooOO0) {
                    OooOO0 oooOO1 = (OooOO0) constraintWidget3;
                    if (oooOO1.f7063o0O0O00 == 1) {
                        int i19 = oooOO1.f7066o0Oo0oo;
                        if (i19 != -1) {
                            oooOO1.OooooOO(i19);
                        } else if (oooOO1.f7064o0OO00O != -1 && Oooo0()) {
                            oooOO1.OooooOO(OooOoO0() - oooOO1.f7064o0OO00O);
                        } else if (Oooo0()) {
                            oooOO1.OooooOO((int) ((oooOO1.f7065o0OOO0o * OooOoO0()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else if ((constraintWidget3 instanceof OooO00o) && ((OooO00o) constraintWidget3).Oooooo0() == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                for (int i20 = 0; i20 < size3; i20++) {
                    ConstraintWidget constraintWidget4 = arrayList.get(i20);
                    if (constraintWidget4 instanceof OooOO0) {
                        OooOO0 oooOO2 = (OooOO0) constraintWidget4;
                        if (oooOO2.f7063o0O0O00 == 1) {
                            o00Ooo.OooO0O0(0, oooOO2, oooO0O0, z9);
                        }
                    }
                }
            }
            o00Ooo.OooO0O0(0, this, oooO0O0, z9);
            if (z11) {
                for (int i21 = 0; i21 < size3; i21++) {
                    ConstraintWidget constraintWidget5 = arrayList.get(i21);
                    if (constraintWidget5 instanceof OooO00o) {
                        OooO00o oooO00o = (OooO00o) constraintWidget5;
                        if (oooO00o.Oooooo0() == 0 && oooO00o.OooooOo()) {
                            o00Ooo.OooO0O0(1, oooO00o, oooO0O0, z9);
                        }
                    }
                }
            }
            if (dimensionBehaviour14 == ConstraintWidget.DimensionBehaviour.FIXED) {
                OoooO(0, OooOOo());
            } else {
                this.f6938Oooo0o.OooOOO0(0);
                this.f6954OooooO0 = 0;
            }
            boolean z12 = false;
            boolean z13 = false;
            for (int i22 = 0; i22 < size3; i22++) {
                ConstraintWidget constraintWidget6 = arrayList.get(i22);
                if (constraintWidget6 instanceof OooOO0) {
                    OooOO0 oooOO3 = (OooOO0) constraintWidget6;
                    if (oooOO3.f7063o0O0O00 == 0) {
                        int i23 = oooOO3.f7066o0Oo0oo;
                        if (i23 != -1) {
                            oooOO3.OooooOO(i23);
                        } else if (oooOO3.f7064o0OO00O != -1 && Oooo0O0()) {
                            oooOO3.OooooOO(OooOOo() - oooOO3.f7064o0OO00O);
                        } else if (Oooo0O0()) {
                            oooOO3.OooooOO((int) ((oooOO3.f7065o0OOO0o * OooOOo()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else if ((constraintWidget6 instanceof OooO00o) && ((OooO00o) constraintWidget6).Oooooo0() == 1) {
                    z13 = true;
                }
            }
            if (z12) {
                for (int i24 = 0; i24 < size3; i24++) {
                    ConstraintWidget constraintWidget7 = arrayList.get(i24);
                    if (constraintWidget7 instanceof OooOO0) {
                        OooOO0 oooOO4 = (OooOO0) constraintWidget7;
                        if (oooOO4.f7063o0O0O00 == 0) {
                            o00Ooo.OooO0oO(1, oooOO4, oooO0O0);
                        }
                    }
                }
            }
            o00Ooo.OooO0oO(0, this, oooO0O0);
            if (z13) {
                for (int i25 = 0; i25 < size3; i25++) {
                    ConstraintWidget constraintWidget8 = arrayList.get(i25);
                    if (constraintWidget8 instanceof OooO00o) {
                        OooO00o oooO00o2 = (OooO00o) constraintWidget8;
                        if (oooO00o2.Oooooo0() == 1 && oooO00o2.OooooOo()) {
                            o00Ooo.OooO0oO(1, oooO00o2, oooO0O0);
                        }
                    }
                }
            }
            for (int i26 = 0; i26 < size3; i26++) {
                ConstraintWidget constraintWidget9 = arrayList.get(i26);
                if (constraintWidget9.Oooo00o() && o00Ooo.OooO00o(constraintWidget9)) {
                    o00o0O(constraintWidget9, oooO0O0, o00Ooo.f27870OooO00o);
                    if (!(constraintWidget9 instanceof OooOO0)) {
                        o00Ooo.OooO0O0(0, constraintWidget9, oooO0O0, z9);
                        o00Ooo.OooO0oO(0, constraintWidget9, oooO0O0);
                    } else if (((OooOO0) constraintWidget9).f7063o0O0O00 == 0) {
                        o00Ooo.OooO0oO(0, constraintWidget9, oooO0O0);
                    } else {
                        o00Ooo.OooO0O0(0, constraintWidget9, oooO0O0, z9);
                    }
                }
            }
            for (int i27 = 0; i27 < size2; i27++) {
                ConstraintWidget constraintWidget10 = this.f27656o0OOO0o.get(i27);
                if (constraintWidget10.Oooo00o() && !(constraintWidget10 instanceof OooOO0) && !(constraintWidget10 instanceof OooO00o) && !(constraintWidget10 instanceof OooOOO) && !constraintWidget10.f6932Oooo0) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo0 = constraintWidget10.OooOOo0(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo1 = constraintWidget10.OooOOo0(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (!(dimensionBehaviourOooOOo0 == dimensionBehaviour15 && constraintWidget10.f6921OooOo00 != 1 && dimensionBehaviourOooOOo1 == dimensionBehaviour15 && constraintWidget10.f6920OooOo0 != 1)) {
                        o00o0O(constraintWidget10, this.f7058o0O0O00, new OooOo.OooO00o());
                    }
                }
            }
        }
        if (size2 > 2 && ((dimensionBehaviour12 == (dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour11 == dimensionBehaviour8) && OooOO0O.OooO0O0(this.f7049o00000Oo, 1024))) {
            OooOo.OooO0O0 oooO0O1 = this.f7058o0O0O00;
            ArrayList<ConstraintWidget> arrayList2 = this.f27656o0OOO0o;
            int size4 = arrayList2.size();
            int i28 = 0;
            while (true) {
                if (i28 >= size4) {
                    i = size2;
                    ArrayList arrayList3 = null;
                    ArrayList<p058o0000OoO.OooOO0O> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<p058o0000OoO.OooOO0O> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    int i29 = 0;
                    while (i29 < size4) {
                        ConstraintWidget constraintWidget11 = arrayList2.get(i29);
                        int i30 = iMax8;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.f6947OoooOOO;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviour11;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr3[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr3[1];
                        int i31 = iMax7;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidget11.f6947OoooOOO;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour12;
                        if (!oo000o.OooO0OO(dimensionBehaviour17, dimensionBehaviour18, dimensionBehaviourArr4[0], dimensionBehaviourArr4[1])) {
                            o00o0O(constraintWidget11, oooO0O1, this.f7055o0000oO);
                        }
                        boolean z14 = constraintWidget11 instanceof OooOO0;
                        if (z14) {
                            OooOO0 oooOO5 = (OooOO0) constraintWidget11;
                            if (oooOO5.f7063o0O0O00 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(oooOO5);
                            }
                            if (oooOO5.f7063o0O0O00 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(oooOO5);
                            }
                        }
                        if (constraintWidget11 instanceof p058o0000OoO.OooOO0O) {
                            if (constraintWidget11 instanceof OooO00o) {
                                OooO00o oooO00o3 = (OooO00o) constraintWidget11;
                                if (oooO00o3.Oooooo0() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(oooO00o3);
                                }
                                if (oooO00o3.Oooooo0() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(oooO00o3);
                                }
                            } else {
                                p058o0000OoO.OooOO0O oooOO0O = (p058o0000OoO.OooOO0O) constraintWidget11;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(oooOO0O);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(oooOO0O);
                            }
                        }
                        if (constraintWidget11.f6939Oooo0o0.f6895OooO0o == null && constraintWidget11.f6940Oooo0oO.f6895OooO0o == null && !z14 && !(constraintWidget11 instanceof OooO00o)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(constraintWidget11);
                        }
                        if (constraintWidget11.f6938Oooo0o.f6895OooO0o == null && constraintWidget11.f6941Oooo0oo.f6895OooO0o == null && constraintWidget11.f6931Oooo.f6895OooO0o == null && !z14 && !(constraintWidget11 instanceof OooO00o)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(constraintWidget11);
                        }
                        i29++;
                        iMax8 = i30;
                        dimensionBehaviour11 = dimensionBehaviour16;
                        iMax7 = i31;
                        dimensionBehaviour12 = dimensionBehaviour19;
                    }
                    i13 = iMax7;
                    i14 = iMax8;
                    dimensionBehaviour9 = dimensionBehaviour12;
                    dimensionBehaviour10 = dimensionBehaviour11;
                    ArrayList<oo0o0Oo> arrayList9 = new ArrayList<>();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            oo000o.OooO00o((OooOO0) it.next(), 0, arrayList9, null);
                        }
                    }
                    oo0o0Oo oo0o0oo3 = null;
                    int i32 = 0;
                    if (arrayList4 != null) {
                        for (p058o0000OoO.OooOO0O oooOO0O2 : arrayList4) {
                            oo0o0Oo oo0o0ooOooO00o = oo000o.OooO00o(oooOO0O2, i32, arrayList9, oo0o0oo3);
                            oooOO0O2.OooooOO(arrayList9, i32, oo0o0ooOooO00o);
                            oo0o0ooOooO00o.OooO0O0(arrayList9);
                            oo0o0oo3 = null;
                            i32 = 0;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet = OooOOOO(ConstraintAnchor.Type.LEFT).f6891OooO00o;
                    if (hashSet != null) {
                        Iterator<ConstraintAnchor> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            oo000o.OooO00o(it2.next().f6894OooO0Oo, 0, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet2 = OooOOOO(ConstraintAnchor.Type.RIGHT).f6891OooO00o;
                    if (hashSet2 != null) {
                        Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            oo000o.OooO00o(it3.next().f6894OooO0Oo, 0, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet3 = OooOOOO(ConstraintAnchor.Type.CENTER).f6891OooO00o;
                    if (hashSet3 != null) {
                        Iterator<ConstraintAnchor> it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            oo000o.OooO00o(it4.next().f6894OooO0Oo, 0, arrayList9, null);
                        }
                    }
                    oo0o0Oo oo0o0oo4 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            oo000o.OooO00o((ConstraintWidget) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            oo000o.OooO00o((OooOO0) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i33 = 1;
                    if (arrayList6 != null) {
                        for (p058o0000OoO.OooOO0O oooOO0O3 : arrayList6) {
                            oo0o0Oo oo0o0ooOooO00o2 = oo000o.OooO00o(oooOO0O3, i33, arrayList9, oo0o0oo4);
                            oooOO0O3.OooooOO(arrayList9, i33, oo0o0ooOooO00o2);
                            oo0o0ooOooO00o2.OooO0O0(arrayList9);
                            oo0o0oo4 = null;
                            i33 = 1;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet4 = OooOOOO(ConstraintAnchor.Type.TOP).f6891OooO00o;
                    if (hashSet4 != null) {
                        Iterator<ConstraintAnchor> it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            oo000o.OooO00o(it7.next().f6894OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet5 = OooOOOO(ConstraintAnchor.Type.BASELINE).f6891OooO00o;
                    if (hashSet5 != null) {
                        Iterator<ConstraintAnchor> it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            oo000o.OooO00o(it8.next().f6894OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet6 = OooOOOO(ConstraintAnchor.Type.BOTTOM).f6891OooO00o;
                    if (hashSet6 != null) {
                        Iterator<ConstraintAnchor> it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            oo000o.OooO00o(it9.next().f6894OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet7 = OooOOOO(ConstraintAnchor.Type.CENTER).f6891OooO00o;
                    if (hashSet7 != null) {
                        Iterator<ConstraintAnchor> it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            oo000o.OooO00o(it10.next().f6894OooO0Oo, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            oo000o.OooO00o((ConstraintWidget) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i34 = 0; i34 < size4; i34++) {
                        ConstraintWidget constraintWidget12 = arrayList2.get(i34);
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = constraintWidget12.f6947OoooOOO;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviourArr5[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour20 == dimensionBehaviour21 && dimensionBehaviourArr5[1] == dimensionBehaviour21) {
                            oo0o0Oo oo0o0ooOooO0O0 = oo000o.OooO0O0(arrayList9, constraintWidget12.f6971o0ooOOo);
                            oo0o0Oo oo0o0ooOooO0O1 = oo000o.OooO0O0(arrayList9, constraintWidget12.f6972o0ooOoO);
                            if (oo0o0ooOooO0O0 != null && oo0o0ooOooO0O1 != null) {
                                oo0o0ooOooO0O0.OooO0Oo(0, oo0o0ooOooO0O1);
                                oo0o0ooOooO0O1.f27892OooO0OO = 2;
                                arrayList9.remove(oo0o0ooOooO0O0);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (this.f6947OoooOOO[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                            oo0o0oo = null;
                            int i35 = 0;
                            for (oo0o0Oo oo0o0oo5 : arrayList9) {
                                if (oo0o0oo5.f27892OooO0OO != 1 && (iOooO0OO2 = oo0o0oo5.OooO0OO(this.f7043o000000, 0)) > i35) {
                                    oo0o0oo = oo0o0oo5;
                                    i35 = iOooO0OO2;
                                }
                            }
                            if (oo0o0oo != null) {
                                o000oOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                                Ooooo00(i35);
                            } else {
                                oo0o0oo = null;
                            }
                        } else {
                            oo0o0oo = null;
                        }
                        if (this.f6947OoooOOO[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                            oo0o0oo2 = null;
                            int i36 = 0;
                            for (oo0o0Oo oo0o0oo6 : arrayList9) {
                                if (oo0o0oo6.f27892OooO0OO != 0 && (iOooO0OO = oo0o0oo6.OooO0OO(this.f7043o000000, 1)) > i36) {
                                    oo0o0oo2 = oo0o0oo6;
                                    i36 = iOooO0OO;
                                }
                            }
                            if (oo0o0oo2 != null) {
                                OoooOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                                OoooOO0(i36);
                            } else {
                                oo0o0oo2 = null;
                            }
                        } else {
                            oo0o0oo2 = null;
                        }
                        if (oo0o0oo != null || oo0o0oo2 != null) {
                            z8 = true;
                            break;
                        }
                    }
                } else {
                    ConstraintWidget constraintWidget13 = arrayList2.get(i28);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr6 = this.f6947OoooOOO;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = dimensionBehaviourArr6[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour23 = dimensionBehaviourArr6[1];
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr7 = constraintWidget13.f6947OoooOOO;
                    i = size2;
                    if (oo000o.OooO0OO(dimensionBehaviour22, dimensionBehaviour23, dimensionBehaviourArr7[0], dimensionBehaviourArr7[1]) && !(constraintWidget13 instanceof OooO)) {
                        i28++;
                        size2 = i;
                    } else {
                        i13 = iMax7;
                        i14 = iMax8;
                        dimensionBehaviour9 = dimensionBehaviour12;
                        dimensionBehaviour10 = dimensionBehaviour11;
                    }
                }
                z8 = false;
                break;
            }
            if (z8) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour24 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                dimensionBehaviour = dimensionBehaviour9;
                if (dimensionBehaviour == dimensionBehaviour24) {
                    i15 = i13;
                    if (i15 >= OooOoO0() || i15 <= 0) {
                        iOooOoO0 = OooOoO0();
                    } else {
                        Ooooo00(i15);
                        this.f7050o00000o0 = true;
                    }
                    dimensionBehaviour2 = dimensionBehaviour10;
                    if (dimensionBehaviour2 == dimensionBehaviour24) {
                        i16 = i14;
                        if (i16 < OooOOo() || i16 <= 0) {
                            iOooOOo = OooOOo();
                        } else {
                            OoooOO0(i16);
                            this.f7054o0000Ooo = true;
                        }
                        z = true;
                    } else {
                        i16 = i14;
                    }
                    iOooOOo = i16;
                    z = true;
                } else {
                    i15 = i13;
                }
                iOooOoO0 = i15;
                dimensionBehaviour2 = dimensionBehaviour10;
                if (dimensionBehaviour2 == dimensionBehaviour24) {
                    i16 = i14;
                    if (i16 < OooOOo()) {
                    }
                    iOooOOo = OooOOo();
                    z = true;
                } else {
                    i16 = i14;
                }
                iOooOOo = i16;
                z = true;
            } else {
                i2 = i14;
                dimensionBehaviour2 = dimensionBehaviour10;
                i3 = i13;
                dimensionBehaviour = dimensionBehaviour9;
            }
            if (!o00ooo(64) || o00ooo(128)) {
                z2 = true;
            } else {
                z2 = false;
            }
            androidx.constraintlayout.core.OooO0OO oooO0OO2 = this.f7043o000000;
            Objects.requireNonNull(oooO0OO2);
            oooO0OO2.f6809OooO0oO = false;
            if (this.f7049o00000Oo == 0 && z2) {
                c = 1;
                oooO0OO2.f6809OooO0oO = true;
            } else {
                c = 1;
            }
            ArrayList<ConstraintWidget> arrayList10 = this.f27656o0OOO0o;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr8 = this.f6947OoooOOO;
            dimensionBehaviour3 = dimensionBehaviourArr8[0];
            dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour3 != dimensionBehaviour4 || dimensionBehaviourArr8[c] == dimensionBehaviour4) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f7042o00000 = 0;
            this.f7047o00000O0 = 0;
            i4 = i;
            for (i5 = 0; i5 < i4; i5++) {
                constraintWidget2 = this.f27656o0OOO0o.get(i5);
                if (constraintWidget2 instanceof p058o0000OoO.OooOOO0) {
                    ((p058o0000OoO.OooOOO0) constraintWidget2).OooooOO();
                }
            }
            zO00ooo = o00ooo(64);
            z4 = z;
            i6 = 0;
            z5 = true;
            while (z5) {
                i7 = i6 + 1;
                try {
                    this.f7043o000000.OooOo0();
                    this.f7042o00000 = 0;
                    this.f7047o00000O0 = 0;
                    OooOOO0(this.f7043o000000);
                    for (i12 = 0; i12 < i4; i12++) {
                        this.f27656o0OOO0o.get(i12).OooOOO0(this.f7043o000000);
                    }
                    Oooooo(this.f7043o000000);
                    try {
                        weakReference = this.f7051o00000oO;
                        if (weakReference != null && weakReference.get() != null) {
                            this.f7043o000000.OooO0o(this.f7043o000000.OooOO0o(this.f7051o00000oO.get()), this.f7043o000000.OooOO0o(this.f6938Oooo0o), 0, 5);
                            try {
                                this.f7051o00000oO = null;
                            } catch (Exception e) {
                                e = e;
                                z5 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                            }
                        }
                        weakReference2 = this.f7041o0000;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            this.f7043o000000.OooO0o(this.f7043o000000.OooOO0o(this.f6941Oooo0oo), this.f7043o000000.OooOO0o(this.f7041o0000.get()), 0, 5);
                            this.f7041o0000 = null;
                        }
                        weakReference3 = this.f7052o00000oo;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            this.f7043o000000.OooO0o(this.f7043o000000.OooOO0o(this.f7052o00000oo.get()), this.f7043o000000.OooOO0o(this.f6939Oooo0o0), 0, 5);
                            this.f7052o00000oo = null;
                        }
                        weakReference4 = this.f7053o0000O00;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            this.f7043o000000.OooO0o(this.f7043o000000.OooOO0o(this.f6940Oooo0oO), this.f7043o000000.OooOO0o(this.f7053o0000O00.get()), 0, 5);
                            this.f7053o0000O00 = null;
                        }
                        this.f7043o000000.OooOOo0();
                        z5 = true;
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                if (z5) {
                    oooO0OO = this.f7043o000000;
                    OooOO0O.f7069OooO00o[2] = false;
                    zO00ooo2 = o00ooo(64);
                    OooooO0(oooO0OO, zO00ooo2);
                    size = this.f27656o0OOO0o.size();
                    i11 = 0;
                    z6 = false;
                    while (i11 < size) {
                        constraintWidget = this.f27656o0OOO0o.get(i11);
                        constraintWidget.OooooO0(oooO0OO, zO00ooo2);
                        androidx.constraintlayout.core.OooO0OO oooO0OO3 = oooO0OO;
                        boolean z15 = zO00ooo2;
                        if (constraintWidget.f6900OooO == -1 || constraintWidget.f6909OooOO0 != -1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            z6 = true;
                        }
                        i11++;
                        oooO0OO = oooO0OO3;
                        zO00ooo2 = z15;
                    }
                } else {
                    OooooO0(this.f7043o000000, zO00ooo);
                    for (i8 = 0; i8 < i4; i8++) {
                        this.f27656o0OOO0o.get(i8).OooooO0(this.f7043o000000, zO00ooo);
                    }
                    z6 = false;
                }
                if (z3 && i7 < 8 && OooOO0O.f7069OooO00o[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    for (i10 = 0; i10 < i4; i10++) {
                        ConstraintWidget constraintWidget14 = this.f27656o0OOO0o.get(i10);
                        iMax4 = Math.max(iMax4, constraintWidget14.OooOoO0() + constraintWidget14.f6953Ooooo0o);
                        iMax3 = Math.max(iMax3, constraintWidget14.OooOOo() + constraintWidget14.f6954OooooO0);
                    }
                    iMax5 = Math.max(this.f6956OooooOo, iMax4);
                    iMax6 = Math.max(this.f6958Oooooo0, iMax3);
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour7 && OooOoO0() < iMax5) {
                        Ooooo00(iMax5);
                        this.f6947OoooOOO[0] = dimensionBehaviour7;
                        z4 = true;
                        z6 = true;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour7 && OooOOo() < iMax6) {
                        OoooOO0(iMax6);
                        this.f6947OoooOOO[1] = dimensionBehaviour7;
                        z4 = true;
                        z6 = true;
                    }
                }
                iMax = Math.max(this.f6956OooooOo, OooOoO0());
                if (iMax > OooOoO0()) {
                    Ooooo00(iMax);
                    this.f6947OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    z4 = true;
                    z6 = true;
                }
                iMax2 = Math.max(this.f6958Oooooo0, OooOOo());
                if (iMax2 > OooOOo()) {
                    OoooOO0(iMax2);
                    r12 = 1;
                    this.f6947OoooOOO[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                    z4 = true;
                    z6 = true;
                } else {
                    r12 = 1;
                }
                if (z4) {
                    i9 = 8;
                } else {
                    dimensionBehaviour5 = this.f6947OoooOOO[0];
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour5 == dimensionBehaviour6 && iOooOoO0 > 0 && OooOoO0() > iOooOoO0) {
                        this.f7050o00000o0 = r12;
                        this.f6947OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        Ooooo00(iOooOoO0);
                        z4 = true;
                        z6 = true;
                    }
                    if (this.f6947OoooOOO[r12] == dimensionBehaviour6 || iOooOOo <= 0 || OooOOo() <= iOooOOo) {
                        i9 = 8;
                    } else {
                        this.f7054o0000Ooo = r12;
                        this.f6947OoooOOO[r12] = ConstraintWidget.DimensionBehaviour.FIXED;
                        OoooOO0(iOooOOo);
                        i9 = 8;
                        z4 = true;
                        z6 = true;
                    }
                }
                if (i7 > i9) {
                    z5 = false;
                } else {
                    z5 = z6;
                }
                i6 = i7;
            }
            this.f27656o0OOO0o = arrayList10;
            if (z4) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr9 = this.f6947OoooOOO;
                dimensionBehaviourArr9[0] = dimensionBehaviour;
                dimensionBehaviourArr9[1] = dimensionBehaviour2;
            }
            Oooo0oO(this.f7043o000000.f6813OooOO0o);
        }
        i = size2;
        i2 = iMax8;
        dimensionBehaviour = dimensionBehaviour12;
        dimensionBehaviour2 = dimensionBehaviour11;
        i3 = iMax7;
        iOooOoO0 = i3;
        iOooOOo = i2;
        z = false;
        if (o00ooo(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        androidx.constraintlayout.core.OooO0OO oooO0OO4 = this.f7043o000000;
        Objects.requireNonNull(oooO0OO4);
        oooO0OO4.f6809OooO0oO = false;
        if (this.f7049o00000Oo == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList<ConstraintWidget> arrayList11 = this.f27656o0OOO0o;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr10 = this.f6947OoooOOO;
        dimensionBehaviour3 = dimensionBehaviourArr10[0];
        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour3 != dimensionBehaviour4) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.f7042o00000 = 0;
        this.f7047o00000O0 = 0;
        i4 = i;
        while (i5 < i4) {
            constraintWidget2 = this.f27656o0OOO0o.get(i5);
            if (constraintWidget2 instanceof p058o0000OoO.OooOOO0) {
                ((p058o0000OoO.OooOOO0) constraintWidget2).OooooOO();
            }
        }
        zO00ooo = o00ooo(64);
        z4 = z;
        i6 = 0;
        z5 = true;
        while (z5) {
            i7 = i6 + 1;
            this.f7043o000000.OooOo0();
            this.f7042o00000 = 0;
            this.f7047o00000O0 = 0;
            OooOOO0(this.f7043o000000);
            while (i12 < i4) {
                this.f27656o0OOO0o.get(i12).OooOOO0(this.f7043o000000);
            }
            Oooooo(this.f7043o000000);
            weakReference = this.f7051o00000oO;
            if (weakReference != null) {
                this.f7043o000000.OooO0o(this.f7043o000000.OooOO0o(this.f7051o00000oO.get()), this.f7043o000000.OooOO0o(this.f6938Oooo0o), 0, 5);
                this.f7051o00000oO = null;
            }
            weakReference2 = this.f7041o0000;
            if (weakReference2 != null) {
                this.f7043o000000.OooO0o(this.f7043o000000.OooOO0o(this.f6941Oooo0oo), this.f7043o000000.OooOO0o(this.f7041o0000.get()), 0, 5);
                this.f7041o0000 = null;
            }
            weakReference3 = this.f7052o00000oo;
            if (weakReference3 != null) {
                this.f7043o000000.OooO0o(this.f7043o000000.OooOO0o(this.f7052o00000oo.get()), this.f7043o000000.OooOO0o(this.f6939Oooo0o0), 0, 5);
                this.f7052o00000oo = null;
            }
            weakReference4 = this.f7053o0000O00;
            if (weakReference4 == null) {
            }
            this.f7043o000000.OooOOo0();
            z5 = true;
            if (z5) {
                oooO0OO = this.f7043o000000;
                OooOO0O.f7069OooO00o[2] = false;
                zO00ooo2 = o00ooo(64);
                OooooO0(oooO0OO, zO00ooo2);
                size = this.f27656o0OOO0o.size();
                i11 = 0;
                z6 = false;
                while (i11 < size) {
                    constraintWidget = this.f27656o0OOO0o.get(i11);
                    constraintWidget.OooooO0(oooO0OO, zO00ooo2);
                    androidx.constraintlayout.core.OooO0OO oooO0OO5 = oooO0OO;
                    boolean z16 = zO00ooo2;
                    if (constraintWidget.f6900OooO == -1) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        z6 = true;
                    }
                    i11++;
                    oooO0OO = oooO0OO5;
                    zO00ooo2 = z16;
                }
            } else {
                OooooO0(this.f7043o000000, zO00ooo);
                while (i8 < i4) {
                    this.f27656o0OOO0o.get(i8).OooooO0(this.f7043o000000, zO00ooo);
                }
                z6 = false;
            }
            if (z3) {
                iMax3 = 0;
                iMax4 = 0;
                while (i10 < i4) {
                    ConstraintWidget constraintWidget15 = this.f27656o0OOO0o.get(i10);
                    iMax4 = Math.max(iMax4, constraintWidget15.OooOoO0() + constraintWidget15.f6953Ooooo0o);
                    iMax3 = Math.max(iMax3, constraintWidget15.OooOOo() + constraintWidget15.f6954OooooO0);
                }
                iMax5 = Math.max(this.f6956OooooOo, iMax4);
                iMax6 = Math.max(this.f6958Oooooo0, iMax3);
                dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour7) {
                    Ooooo00(iMax5);
                    this.f6947OoooOOO[0] = dimensionBehaviour7;
                    z4 = true;
                    z6 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour7) {
                    OoooOO0(iMax6);
                    this.f6947OoooOOO[1] = dimensionBehaviour7;
                    z4 = true;
                    z6 = true;
                }
            }
            iMax = Math.max(this.f6956OooooOo, OooOoO0());
            if (iMax > OooOoO0()) {
                Ooooo00(iMax);
                this.f6947OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z4 = true;
                z6 = true;
            }
            iMax2 = Math.max(this.f6958Oooooo0, OooOOo());
            if (iMax2 > OooOOo()) {
                OoooOO0(iMax2);
                r12 = 1;
                this.f6947OoooOOO[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                z4 = true;
                z6 = true;
            } else {
                r12 = 1;
            }
            if (z4) {
                dimensionBehaviour5 = this.f6947OoooOOO[0];
                dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    this.f7050o00000o0 = r12;
                    this.f6947OoooOOO[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    Ooooo00(iOooOoO0);
                    z4 = true;
                    z6 = true;
                }
                if (this.f6947OoooOOO[r12] == dimensionBehaviour6) {
                    i9 = 8;
                } else {
                    i9 = 8;
                }
            } else {
                i9 = 8;
            }
            if (i7 > i9) {
                z5 = false;
            } else {
                z5 = z6;
            }
            i6 = i7;
        }
        this.f27656o0OOO0o = arrayList11;
        if (z4) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr11 = this.f6947OoooOOO;
            dimensionBehaviourArr11[0] = dimensionBehaviour;
            dimensionBehaviourArr11[1] = dimensionBehaviour2;
        }
        Oooo0oO(this.f7043o000000.f6813OooOO0o);
    }

    public final void Oooooo(androidx.constraintlayout.core.OooO0OO oooO0OO) {
        boolean z;
        boolean zO00ooo = o00ooo(64);
        OooO0oO(oooO0OO, zO00ooo);
        int size = this.f27656o0OOO0o.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f27656o0OOO0o.get(i);
            boolean[] zArr = constraintWidget.f6961o000oOoO;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof OooO00o) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.f27656o0OOO0o.get(i2);
                if (constraintWidget2 instanceof OooO00o) {
                    OooO00o oooO00o = (OooO00o) constraintWidget2;
                    for (int i3 = 0; i3 < oooO00o.f27655o0Oo0oo; i3++) {
                        ConstraintWidget constraintWidget3 = oooO00o.f27654o0OOO0o[i3];
                        if (oooO00o.f7023oo0o0Oo || constraintWidget3.OooO0oo()) {
                            int i4 = oooO00o.f7022o0OO00O;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.f6961o000oOoO[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.f6961o000oOoO[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.f7056o0000oo.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = this.f27656o0OOO0o.get(i5);
            if (constraintWidget4.OooO0o()) {
                if (constraintWidget4 instanceof OooOOO) {
                    this.f7056o0000oo.add(constraintWidget4);
                } else {
                    constraintWidget4.OooO0oO(oooO0OO, zO00ooo);
                }
            }
        }
        while (this.f7056o0000oo.size() > 0) {
            int size2 = this.f7056o0000oo.size();
            Iterator<ConstraintWidget> it = this.f7056o0000oo.iterator();
            while (it.hasNext()) {
                OooOOO oooOOO = (OooOOO) it.next();
                HashSet<ConstraintWidget> hashSet = this.f7056o0000oo;
                int i6 = 0;
                while (true) {
                    if (i6 >= oooOOO.f27655o0Oo0oo) {
                        z = false;
                        break;
                    } else {
                        if (hashSet.contains(oooOOO.f27654o0OOO0o[i6])) {
                            z = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (z) {
                    oooOOO.OooO0oO(oooO0OO, zO00ooo);
                    this.f7056o0000oo.remove(oooOOO);
                    break;
                }
            }
            if (size2 == this.f7056o0000oo.size()) {
                Iterator<ConstraintWidget> it2 = this.f7056o0000oo.iterator();
                while (it2.hasNext()) {
                    it2.next().OooO0oO(oooO0OO, zO00ooo);
                }
                this.f7056o0000oo.clear();
            }
        }
        if (androidx.constraintlayout.core.OooO0OO.f6800OooOOOo) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = this.f27656o0OOO0o.get(i7);
                if (!constraintWidget5.OooO0o()) {
                    hashSet2.add(constraintWidget5);
                }
            }
            OooO0o0(this, oooO0OO, hashSet2, this.f6947OoooOOO[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget6 : hashSet2) {
                OooOO0O.OooO00o(this, oooO0OO, constraintWidget6);
                constraintWidget6.OooO0oO(oooO0OO, zO00ooo);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget7 = this.f27656o0OOO0o.get(i8);
                if (constraintWidget7 instanceof OooO0o) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f6947OoooOOO;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.o000oOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.OoooOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.OooO0oO(oooO0OO, zO00ooo);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.o000oOoO(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.OoooOoO(dimensionBehaviour2);
                    }
                } else {
                    OooOO0O.OooO00o(this, oooO0OO, constraintWidget7);
                    if (!constraintWidget7.OooO0o()) {
                        constraintWidget7.OooO0oO(oooO0OO, zO00ooo);
                    }
                }
            }
        }
        if (this.f7042o00000 > 0) {
            OooO0O0.OooO00o(this, oooO0OO, null, 0);
        }
        if (this.f7047o00000O0 > 0) {
            OooO0O0.OooO00o(this, oooO0OO, null, 1);
        }
    }

    public final void Oooooo0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.f7042o00000 + 1;
            OooO0OO[] oooO0OOArr = this.f7048o00000OO;
            if (i2 >= oooO0OOArr.length) {
                this.f7048o00000OO = (OooO0OO[]) Arrays.copyOf(oooO0OOArr, oooO0OOArr.length * 2);
            }
            OooO0OO[] oooO0OOArr2 = this.f7048o00000OO;
            int i3 = this.f7042o00000;
            oooO0OOArr2[i3] = new OooO0OO(constraintWidget, 0, this.f7057o000OOo);
            this.f7042o00000 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f7047o00000O0 + 1;
            OooO0OO[] oooO0OOArr3 = this.f7046o00000O;
            if (i4 >= oooO0OOArr3.length) {
                this.f7046o00000O = (OooO0OO[]) Arrays.copyOf(oooO0OOArr3, oooO0OOArr3.length * 2);
            }
            OooO0OO[] oooO0OOArr4 = this.f7046o00000O;
            int i5 = this.f7047o00000O0;
            oooO0OOArr4[i5] = new OooO0OO(constraintWidget, 1, this.f7057o000OOo);
            this.f7047o00000O0 = i5 + 1;
        }
    }

    public final void OoooooO(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f7053o0000O00;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.OooO0Oo() > this.f7053o0000O00.get().OooO0Oo()) {
            this.f7053o0000O00 = new WeakReference<>(constraintAnchor);
        }
    }

    public final void Ooooooo(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f7052o00000oo;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.OooO0Oo() > this.f7052o00000oo.get().OooO0Oo()) {
            this.f7052o00000oo = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    public final boolean o00O0O(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        o000oOoO o000oooo2 = this.f7059o0OO00O;
        boolean z3 = true;
        boolean z4 = z & true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo0 = o000oooo2.f27849OooO00o.OooOOo0(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo1 = o000oooo2.f27849OooO00o.OooOOo0(1);
        int iOooOoO = o000oooo2.f27849OooO00o.OooOoO();
        int iOooOoOO = o000oooo2.f27849OooO00o.OooOoOO();
        if (z4 && (dimensionBehaviourOooOOo0 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourOooOOo1 == dimensionBehaviour)) {
            for (o0O0O00 o0o0o00 : o000oooo2.f27854OooO0o0) {
                if (o0o0o00.f27876OooO0o == i && !o0o0o00.OooOO0O()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && dimensionBehaviourOooOOo0 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    o000oooo2.f27849OooO00o.o000oOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                    OooO0o oooO0o = o000oooo2.f27849OooO00o;
                    oooO0o.Ooooo00(o000oooo2.OooO0Oo(oooO0o, 0));
                    OooO0o oooO0o2 = o000oooo2.f27849OooO00o;
                    oooO0o2.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(oooO0o2.OooOoO0());
                }
            } else if (z4 && dimensionBehaviourOooOOo1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                o000oooo2.f27849OooO00o.OoooOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                OooO0o oooO0o3 = o000oooo2.f27849OooO00o;
                oooO0o3.OoooOO0(o000oooo2.OooO0Oo(oooO0o3, 1));
                OooO0o oooO0o4 = o000oooo2.f27849OooO00o;
                oooO0o4.f6906OooO0o0.f27877OooO0o0.OooO0Oo(oooO0o4.OooOOo());
            }
        }
        if (i == 0) {
            OooO0o oooO0o5 = o000oooo2.f27849OooO00o;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = oooO0o5.f6947OoooOOO;
            if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iOooOoO0 = oooO0o5.OooOoO0() + iOooOoO;
                o000oooo2.f27849OooO00o.f6904OooO0Oo.f27871OooO.OooO0Oo(iOooOoO0);
                o000oooo2.f27849OooO00o.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(iOooOoO0 - iOooOoO);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            OooO0o oooO0o6 = o000oooo2.f27849OooO00o;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = oooO0o6.f6947OoooOOO;
            if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iOooOOo = oooO0o6.OooOOo() + iOooOoOO;
                o000oooo2.f27849OooO00o.f6906OooO0o0.f27871OooO.OooO0Oo(iOooOOo);
                o000oooo2.f27849OooO00o.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iOooOOo - iOooOoOO);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        o000oooo2.OooO0oO();
        for (o0O0O00 o0o0o01 : o000oooo2.f27854OooO0o0) {
            if (o0o0o01.f27876OooO0o == i && (o0o0o01.f27873OooO0O0 != o000oooo2.f27849OooO00o || o0o0o01.f27878OooO0oO)) {
                o0o0o01.OooO0o0();
            }
        }
        for (o0O0O00 o0o0o02 : o000oooo2.f27854OooO0o0) {
            if (o0o0o02.f27876OooO0o == i && (z2 || o0o0o02.f27873OooO0O0 != o000oooo2.f27849OooO00o)) {
                if (!o0o0o02.f27879OooO0oo.f27866OooOO0 || !o0o0o02.f27871OooO.f27866OooOO0 || (!(o0o0o02 instanceof Oooo000) && !o0o0o02.f27877OooO0o0.f27866OooOO0)) {
                    z3 = false;
                    break;
                }
            }
        }
        o000oooo2.f27849OooO00o.o000oOoO(dimensionBehaviourOooOOo0);
        o000oooo2.f27849OooO00o.OoooOoO(dimensionBehaviourOooOOo1);
        return z3;
    }

    public final void o00Oo0() {
        this.f7059o0OO00O.f27850OooO0O0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x03f2 A[PHI: r13
      0x03f2: PHI (r13v11 boolean) = (r13v10 boolean), (r13v10 boolean), (r13v10 boolean), (r13v14 boolean) binds: [B:202:0x03bb, B:204:0x03c1, B:206:0x03c5, B:222:0x03e7] A[DONT_GENERATE, DONT_INLINE]] */
    public final void o00Ooo(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        boolean zO00O0O;
        int i10;
        boolean z;
        OooOo.OooO0O0 oooO0O0;
        int i11;
        boolean z2;
        o0OOO0o o0ooo0o2;
        o0OO00O o0oo00o2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        boolean z4;
        OooO0o oooO0o = this;
        oooO0o.f7044o000000O = i6;
        oooO0o.f7045o000000o = i7;
        OooOo oooOo = oooO0o.f7060o0Oo0oo;
        Objects.requireNonNull(oooOo);
        OooOo.OooO0O0 oooO0O1 = oooO0o.f7058o0O0O00;
        int size = oooO0o.f27656o0OOO0o.size();
        int iOooOoO0 = OooOoO0();
        int iOooOOo = OooOOo();
        boolean zOooO0O0 = OooOO0O.OooO0O0(i, 128);
        char c = 0;
        boolean z5 = zOooO0O0 || OooOO0O.OooO0O0(i, 64);
        if (z5) {
            int i16 = 0;
            while (i16 < size) {
                ConstraintWidget constraintWidget = oooO0o.f27656o0OOO0o.get(i16);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f6947OoooOOO;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[c];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z6 = (dimensionBehaviour == dimensionBehaviour2) && (dimensionBehaviourArr[1] == dimensionBehaviour2) && constraintWidget.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                if ((constraintWidget.Oooo000() && z6) || ((constraintWidget.Oooo00O() && z6) || (constraintWidget instanceof OooOOO) || constraintWidget.Oooo000() || constraintWidget.Oooo00O())) {
                    z5 = false;
                    break;
                } else {
                    i16++;
                    c = 0;
                }
            }
        }
        boolean z7 = z5 & ((i2 == 1073741824 && i4 == 1073741824) || zOooO0O0);
        if (z7) {
            int iMin = Math.min(oooO0o.f6930OooOooo[0], i3);
            int iMin2 = Math.min(oooO0o.f6930OooOooo[1], i5);
            if (i2 == 1073741824 && OooOoO0() != iMin) {
                oooO0o.Ooooo00(iMin);
                o00Oo0();
            }
            if (i4 == 1073741824 && OooOOo() != iMin2) {
                oooO0o.OoooOO0(iMin2);
                o00Oo0();
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                o000oOoO o000oooo2 = oooO0o.f7059o0OO00O;
                boolean z8 = zOooO0O0 & true;
                if (o000oooo2.f27850OooO0O0 || o000oooo2.f27851OooO0OO) {
                    for (ConstraintWidget constraintWidget2 : o000oooo2.f27849OooO00o.f27656o0OOO0o) {
                        constraintWidget2.OooOOO();
                        constraintWidget2.f6901OooO00o = false;
                        constraintWidget2.f6904OooO0Oo.OooOOO();
                        constraintWidget2.f6906OooO0o0.OooOOO0();
                    }
                    i15 = 0;
                    o000oooo2.f27849OooO00o.OooOOO();
                    OooO0o oooO0o2 = o000oooo2.f27849OooO00o;
                    oooO0o2.f6901OooO00o = false;
                    oooO0o2.f6904OooO0Oo.OooOOO();
                    o000oooo2.f27849OooO00o.f6906OooO0o0.OooOOO0();
                    o000oooo2.f27851OooO0OO = false;
                } else {
                    i15 = 0;
                }
                o000oooo2.OooO0O0(o000oooo2.f27852OooO0Oo);
                OooO0o oooO0o3 = o000oooo2.f27849OooO00o;
                oooO0o3.f6953Ooooo0o = i15;
                oooO0o3.f6954OooooO0 = i15;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo0 = oooO0o3.OooOOo0(i15);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo1 = o000oooo2.f27849OooO00o.OooOOo0(1);
                if (o000oooo2.f27850OooO0O0) {
                    o000oooo2.OooO0OO();
                }
                int iOooOoO = o000oooo2.f27849OooO00o.OooOoO();
                int iOooOoOO = o000oooo2.f27849OooO00o.OooOoOO();
                o000oooo2.f27849OooO00o.f6904OooO0Oo.f27879OooO0oo.OooO0Oo(iOooOoO);
                o000oooo2.f27849OooO00o.f6906OooO0o0.f27879OooO0oo.OooO0Oo(iOooOoOO);
                o000oooo2.OooO0oO();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviourOooOOo0 == dimensionBehaviour3 || dimensionBehaviourOooOOo1 == dimensionBehaviour3) {
                    if (z8) {
                        Iterator<o0O0O00> it = o000oooo2.f27854OooO0o0.iterator();
                        while (it.hasNext()) {
                            if (!it.next().OooOO0O()) {
                                z8 = false;
                                break;
                            }
                        }
                    }
                    if (z8 && dimensionBehaviourOooOOo0 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        o000oooo2.f27849OooO00o.o000oOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                        OooO0o oooO0o4 = o000oooo2.f27849OooO00o;
                        oooO0o4.Ooooo00(o000oooo2.OooO0Oo(oooO0o4, 0));
                        OooO0o oooO0o5 = o000oooo2.f27849OooO00o;
                        oooO0o5.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(oooO0o5.OooOoO0());
                    }
                    if (z8 && dimensionBehaviourOooOOo1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        o000oooo2.f27849OooO00o.OoooOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                        OooO0o oooO0o6 = o000oooo2.f27849OooO00o;
                        oooO0o6.OoooOO0(o000oooo2.OooO0Oo(oooO0o6, 1));
                        OooO0o oooO0o7 = o000oooo2.f27849OooO00o;
                        oooO0o7.f6906OooO0o0.f27877OooO0o0.OooO0Oo(oooO0o7.OooOOo());
                    }
                } else {
                    z7 = z7;
                    oooO0O1 = oooO0O1;
                }
                OooO0o oooO0o8 = o000oooo2.f27849OooO00o;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = oooO0o8.f6947OoooOOO;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr2[0];
                i8 = iOooOoO0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviourArr2[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    int iOooOoO1 = oooO0o8.OooOoO0() + iOooOoO;
                    o000oooo2.f27849OooO00o.f6904OooO0Oo.f27871OooO.OooO0Oo(iOooOoO1);
                    o000oooo2.f27849OooO00o.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(iOooOoO1 - iOooOoO);
                    o000oooo2.OooO0oO();
                    OooO0o oooO0o9 = o000oooo2.f27849OooO00o;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = oooO0o9.f6947OoooOOO;
                    if (dimensionBehaviourArr3[1] == dimensionBehaviour5 || dimensionBehaviourArr3[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        int iOooOOo2 = oooO0o9.OooOOo() + iOooOoOO;
                        o000oooo2.f27849OooO00o.f6906OooO0o0.f27871OooO.OooO0Oo(iOooOOo2);
                        o000oooo2.f27849OooO00o.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iOooOOo2 - iOooOoOO);
                    }
                    o000oooo2.OooO0oO();
                    z3 = true;
                } else {
                    z3 = false;
                }
                for (o0O0O00 o0o0o00 : o000oooo2.f27854OooO0o0) {
                    if (o0o0o00.f27873OooO0O0 != o000oooo2.f27849OooO00o || o0o0o00.f27878OooO0oO) {
                        o0o0o00.OooO0o0();
                    }
                }
                Iterator<o0O0O00> it2 = o000oooo2.f27854OooO0o0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z4 = true;
                        break;
                    }
                    o0O0O00 next = it2.next();
                    if (z3 || next.f27873OooO0O0 != o000oooo2.f27849OooO00o) {
                        if (!next.f27879OooO0oo.f27866OooOO0 || ((!next.f27871OooO.f27866OooOO0 && !(next instanceof o00oO0o)) || (!next.f27877OooO0o0.f27866OooOO0 && !(next instanceof Oooo000) && !(next instanceof o00oO0o)))) {
                            z4 = false;
                            break;
                        }
                    }
                }
                o000oooo2.f27849OooO00o.o000oOoO(dimensionBehaviourOooOOo0);
                o000oooo2.f27849OooO00o.OoooOoO(dimensionBehaviourOooOOo1);
                zO00O0O = z4;
                i13 = 1073741824;
                i9 = 2;
            } else {
                z7 = z7;
                oooO0O1 = oooO0O1;
                i8 = iOooOoO0;
                o000oOoO o000oooo3 = oooO0o.f7059o0OO00O;
                if (o000oooo3.f27850OooO0O0) {
                    for (ConstraintWidget constraintWidget3 : o000oooo3.f27849OooO00o.f27656o0OOO0o) {
                        constraintWidget3.OooOOO();
                        constraintWidget3.f6901OooO00o = false;
                        o0OOO0o o0ooo0o3 = constraintWidget3.f6904OooO0Oo;
                        o0ooo0o3.f27877OooO0o0.f27866OooOO0 = false;
                        o0ooo0o3.f27878OooO0oO = false;
                        o0ooo0o3.OooOOO();
                        o0OO00O o0oo00o3 = constraintWidget3.f6906OooO0o0;
                        o0oo00o3.f27877OooO0o0.f27866OooOO0 = false;
                        o0oo00o3.f27878OooO0oO = false;
                        o0oo00o3.OooOOO0();
                    }
                    i12 = 0;
                    o000oooo3.f27849OooO00o.OooOOO();
                    OooO0o oooO0o10 = o000oooo3.f27849OooO00o;
                    oooO0o10.f6901OooO00o = false;
                    o0OOO0o o0ooo0o4 = oooO0o10.f6904OooO0Oo;
                    o0ooo0o4.f27877OooO0o0.f27866OooOO0 = false;
                    o0ooo0o4.f27878OooO0oO = false;
                    o0ooo0o4.OooOOO();
                    o0OO00O o0oo00o4 = o000oooo3.f27849OooO00o.f6906OooO0o0;
                    o0oo00o4.f27877OooO0o0.f27866OooOO0 = false;
                    o0oo00o4.f27878OooO0oO = false;
                    o0oo00o4.OooOOO0();
                    o000oooo3.OooO0OO();
                } else {
                    i12 = 0;
                }
                o000oooo3.OooO0O0(o000oooo3.f27852OooO0Oo);
                OooO0o oooO0o11 = o000oooo3.f27849OooO00o;
                oooO0o11.f6953Ooooo0o = i12;
                oooO0o11.f6954OooooO0 = i12;
                oooO0o11.f6904OooO0Oo.f27879OooO0oo.OooO0Oo(i12);
                o000oooo3.f27849OooO00o.f6906OooO0o0.f27879OooO0oo.OooO0Oo(i12);
                i13 = 1073741824;
                if (i2 == 1073741824) {
                    i14 = 1;
                    zO00O0O = oooO0o.o00O0O(zOooO0O0, i12) & true;
                    i9 = 1;
                } else {
                    i14 = 1;
                    i9 = 0;
                    zO00O0O = true;
                }
                if (i4 == 1073741824) {
                    i9++;
                    zO00O0O &= oooO0o.o00O0O(zOooO0O0, i14);
                }
            }
            if (zO00O0O) {
                oooO0o.Ooooo0o(i2 == i13, i4 == i13);
            }
        } else {
            z7 = z7;
            oooO0O1 = oooO0O1;
            i8 = iOooOoO0;
            i9 = 0;
            zO00O0O = false;
        }
        if (zO00O0O && i9 == 2) {
            return;
        }
        int i17 = oooO0o.f7049o00000Oo;
        if (size > 0) {
            int size2 = oooO0o.f27656o0OOO0o.size();
            boolean zO00ooo = oooO0o.o00ooo(64);
            OooOo.OooO0O0 oooO0O2 = oooO0o.f7058o0O0O00;
            for (int i18 = 0; i18 < size2; i18++) {
                ConstraintWidget constraintWidget4 = oooO0o.f27656o0OOO0o.get(i18);
                if (!(constraintWidget4 instanceof OooOO0) && !(constraintWidget4 instanceof OooO00o) && !constraintWidget4.f6932Oooo0 && (!zO00ooo || (o0ooo0o2 = constraintWidget4.f6904OooO0Oo) == null || (o0oo00o2 = constraintWidget4.f6906OooO0o0) == null || !o0ooo0o2.f27877OooO0o0.f27866OooOO0 || !o0oo00o2.f27877OooO0o0.f27866OooOO0)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo2 = constraintWidget4.OooOOo0(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo3 = constraintWidget4.OooOOo0(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z9 = dimensionBehaviourOooOOo2 == dimensionBehaviour6 && constraintWidget4.f6921OooOo00 != 1 && dimensionBehaviourOooOOo3 == dimensionBehaviour6 && constraintWidget4.f6920OooOo0 != 1;
                    if (!z9 && oooO0o.o00ooo(1) && !(constraintWidget4 instanceof OooOOO)) {
                        if (dimensionBehaviourOooOOo2 == dimensionBehaviour6 && constraintWidget4.f6921OooOo00 == 0 && dimensionBehaviourOooOOo3 != dimensionBehaviour6 && !constraintWidget4.Oooo000()) {
                            z9 = true;
                        }
                        if (dimensionBehaviourOooOOo3 == dimensionBehaviour6 && constraintWidget4.f6920OooOo0 == 0 && dimensionBehaviourOooOOo2 != dimensionBehaviour6 && !constraintWidget4.Oooo000()) {
                            z9 = true;
                        }
                        if (dimensionBehaviourOooOOo2 == dimensionBehaviour6 || dimensionBehaviourOooOOo3 == dimensionBehaviour6) {
                            if (constraintWidget4.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                z9 = true;
                            }
                        }
                    }
                    if (!z9) {
                        oooOo.OooO00o(oooO0O2, constraintWidget4, 0);
                    }
                }
            }
            oooO0O2.OooO00o();
        }
        oooOo.OooO0OO(oooO0o);
        int size3 = oooOo.f27834OooO00o.size();
        int i19 = i8;
        if (size > 0) {
            oooOo.OooO0O0(oooO0o, 0, i19, iOooOOo);
        }
        if (size3 > 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = oooO0o.f6947OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr4[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z10 = dimensionBehaviour7 == dimensionBehaviour8;
            boolean z11 = dimensionBehaviourArr4[1] == dimensionBehaviour8;
            int iMax = Math.max(OooOoO0(), oooOo.f27836OooO0OO.f6956OooooOo);
            int iMax2 = Math.max(OooOOo(), oooOo.f27836OooO0OO.f6958Oooooo0);
            int i20 = 0;
            boolean z12 = false;
            while (i20 < size3) {
                ConstraintWidget constraintWidget5 = oooOo.f27834OooO00o.get(i20);
                if (constraintWidget5 instanceof OooOOO) {
                    int iOooOoO2 = constraintWidget5.OooOoO0();
                    int iOooOOo3 = constraintWidget5.OooOOo();
                    oooO0O0 = oooO0O1;
                    boolean zOooO00o = z12 | oooOo.OooO00o(oooO0O0, constraintWidget5, 1);
                    int iOooOoO3 = constraintWidget5.OooOoO0();
                    int iOooOOo4 = constraintWidget5.OooOOo();
                    if (iOooOoO3 != iOooOoO2) {
                        constraintWidget5.Ooooo00(iOooOoO3);
                        if (z10 && constraintWidget5.OooOo0() > iMax) {
                            iMax = Math.max(iMax, constraintWidget5.OooOOOO(ConstraintAnchor.Type.RIGHT).OooO0o0() + constraintWidget5.OooOo0());
                        }
                        i11 = iMax;
                        z2 = true;
                    } else {
                        i11 = iMax;
                        z2 = zOooO00o;
                    }
                    if (iOooOOo4 != iOooOOo3) {
                        constraintWidget5.OoooOO0(iOooOOo4);
                        if (z11 && constraintWidget5.OooOOOo() > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget5.OooOOOO(ConstraintAnchor.Type.BOTTOM).OooO0o0() + constraintWidget5.OooOOOo());
                        }
                        z2 = true;
                    }
                    boolean z13 = ((OooOOO) constraintWidget5).f7073o000000o | z2;
                    iMax = i11;
                    z12 = z13;
                } else {
                    oooO0O0 = oooO0O1;
                }
                i20++;
                oooO0O1 = oooO0O0;
                i17 = i17;
            }
            int i21 = i17;
            OooOo.OooO0O0 oooO0O3 = oooO0O1;
            int i22 = 2;
            int i23 = 0;
            while (i23 < i22) {
                int i24 = 0;
                while (i24 < size3) {
                    ConstraintWidget constraintWidget6 = oooOo.f27834OooO00o.get(i24);
                    if (((constraintWidget6 instanceof p058o0000OoO.OooOO0) && !(constraintWidget6 instanceof OooOOO)) || (constraintWidget6 instanceof OooOO0) || constraintWidget6.f6969o0OoOo0 == 8 || ((z7 && constraintWidget6.f6904OooO0Oo.f27877OooO0o0.f27866OooOO0 && constraintWidget6.f6906OooO0o0.f27877OooO0o0.f27866OooOO0) || (constraintWidget6 instanceof OooOOO))) {
                        i10 = size3;
                    } else {
                        int iOooOoO4 = constraintWidget6.OooOoO0();
                        int iOooOOo5 = constraintWidget6.OooOOo();
                        i10 = size3;
                        int i25 = constraintWidget6.f6955OooooOO;
                        boolean zOooO00o2 = oooOo.OooO00o(oooO0O3, constraintWidget6, i23 == 1 ? 2 : 1) | z12;
                        int iOooOoO5 = constraintWidget6.OooOoO0();
                        int iOooOOo6 = constraintWidget6.OooOOo();
                        if (iOooOoO5 != iOooOoO4) {
                            constraintWidget6.Ooooo00(iOooOoO5);
                            if (z10 && constraintWidget6.OooOo0() > iMax) {
                                iMax = Math.max(iMax, constraintWidget6.OooOOOO(ConstraintAnchor.Type.RIGHT).OooO0o0() + constraintWidget6.OooOo0());
                            }
                            z = true;
                        } else {
                            z = zOooO00o2;
                        }
                        if (iOooOOo6 != iOooOOo5) {
                            constraintWidget6.OoooOO0(iOooOOo6);
                            if (z11 && constraintWidget6.OooOOOo() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget6.OooOOOO(ConstraintAnchor.Type.BOTTOM).OooO0o0() + constraintWidget6.OooOOOo());
                            }
                            z = true;
                        }
                        z12 = (!constraintWidget6.f6934Oooo00O || i25 == constraintWidget6.f6955OooooOO) ? z : true;
                    }
                    i24++;
                    size3 = i10;
                }
                int i26 = size3;
                if (!z12) {
                    oooO0o = this;
                    break;
                }
                i23++;
                oooO0o = this;
                oooOo.OooO0O0(oooO0o, i23, i19, iOooOOo);
                size3 = i26;
                i22 = 2;
                z12 = false;
            }
            i17 = i21;
        }
        oooO0o.o00oO0o(i17);
    }

    public final void o00oO0O() {
        this.f7060o0Oo0oo.OooO0OO(this);
    }

    public final void o00oO0o(int i) {
        this.f7049o00000Oo = i;
        androidx.constraintlayout.core.OooO0OO.f6800OooOOOo = o00ooo(512);
    }

    public final boolean o00ooo(int i) {
        return (this.f7049o00000Oo & i) == i;
    }

    public final void o0OoOo0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f7041o0000;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.OooO0Oo() > this.f7041o0000.get().OooO0Oo()) {
            this.f7041o0000 = new WeakReference<>(constraintAnchor);
        }
    }

    public final void oo000o(OooOo.OooO0O0 oooO0O0) {
        this.f7058o0O0O00 = oooO0O0;
        this.f7059o0OO00O.f27853OooO0o = oooO0O0;
    }

    public final void ooOO(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f7051o00000oO;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.OooO0Oo() > this.f7051o00000oO.get().OooO0Oo()) {
            this.f7051o00000oO = new WeakReference<>(constraintAnchor);
        }
    }

    public OooO0o(int i, int i2) {
        super(0, 0);
        this.f7060o0Oo0oo = new OooOo(this);
        this.f7059o0OO00O = new o000oOoO(this);
        this.f7058o0O0O00 = null;
        this.f7057o000OOo = false;
        this.f7043o000000 = new androidx.constraintlayout.core.OooO0OO();
        this.f7042o00000 = 0;
        this.f7047o00000O0 = 0;
        this.f7046o00000O = new OooO0OO[4];
        this.f7048o00000OO = new OooO0OO[4];
        this.f7049o00000Oo = 257;
        this.f7050o00000o0 = false;
        this.f7054o0000Ooo = false;
        this.f7051o00000oO = null;
        this.f7052o00000oo = null;
        this.f7041o0000 = null;
        this.f7053o0000O00 = null;
        this.f7056o0000oo = new HashSet<>();
        this.f7055o0000oO = new OooOo.OooO00o();
    }
}
