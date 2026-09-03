package p061o0000o0;

import Oooo000.OooO00o;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO0o;
import androidx.constraintlayout.core.widgets.OooOO0;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p058o0000OoO.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o f27849OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f27852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOo.OooO0O0 f27853OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOo.OooO00o f27855OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ArrayList<o0Oo0oo> f27856OooO0oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f27850OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f27851OooO0OO = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<o0O0O00> f27854OooO0o0 = new ArrayList<>();

    public o000oOoO(OooO0o oooO0o) {
        new ArrayList();
        this.f27853OooO0o = null;
        this.f27855OooO0oO = new OooOo.OooO00o();
        this.f27856OooO0oo = new ArrayList<>();
        this.f27849OooO00o = oooO0o;
        this.f27852OooO0Oo = oooO0o;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    public final void OooO00o(o00O0O o00o0o2, int i, int i2, o00O0O o00o0o3, ArrayList<o0Oo0oo> arrayList, o0Oo0oo o0oo0oo2) {
        o0O0O00 o0o0o00 = o00o0o2.f27861OooO0Oo;
        if (o0o0o00.f27874OooO0OO == null) {
            OooO0o oooO0o = this.f27849OooO00o;
            if (o0o0o00 == oooO0o.f6904OooO0Oo || o0o0o00 == oooO0o.f6906OooO0o0) {
                return;
            }
            if (o0oo0oo2 == null) {
                o0oo0oo2 = new o0Oo0oo(o0o0o00);
                arrayList.add(o0oo0oo2);
            }
            o0o0o00.f27874OooO0OO = o0oo0oo2;
            o0oo0oo2.f27888OooO0O0.add(o0o0o00);
            for (Oooo0 oooo0 : o0o0o00.f27879OooO0oo.f27867OooOO0O) {
                if (oooo0 instanceof o00O0O) {
                    OooO00o((o00O0O) oooo0, i, 0, o00o0o3, arrayList, o0oo0oo2);
                }
            }
            for (Oooo0 oooo1 : o0o0o00.f27871OooO.f27867OooOO0O) {
                if (oooo1 instanceof o00O0O) {
                    OooO00o((o00O0O) oooo1, i, 1, o00o0o3, arrayList, o0oo0oo2);
                }
            }
            if (i == 1 && (o0o0o00 instanceof o0OO00O)) {
                for (Oooo0 oooo2 : ((o0OO00O) o0o0o00).f27882OooOO0O.f27867OooOO0O) {
                    if (oooo2 instanceof o00O0O) {
                        OooO00o((o00O0O) oooo2, i, 2, o00o0o3, arrayList, o0oo0oo2);
                    }
                }
            }
            Iterator it = o0o0o00.f27879OooO0oo.f27868OooOO0o.iterator();
            while (it.hasNext()) {
                OooO00o((o00O0O) it.next(), i, 0, o00o0o3, arrayList, o0oo0oo2);
            }
            Iterator it2 = o0o0o00.f27871OooO.f27868OooOO0o.iterator();
            while (it2.hasNext()) {
                OooO00o((o00O0O) it2.next(), i, 1, o00o0o3, arrayList, o0oo0oo2);
            }
            if (i == 1 && (o0o0o00 instanceof o0OO00O)) {
                Iterator it3 = ((o0OO00O) o0o0o00).f27882OooOO0O.f27868OooOO0o.iterator();
                while (it3.hasNext()) {
                    OooO00o((o00O0O) it3.next(), i, 2, o00o0o3, arrayList, o0oo0oo2);
                }
            }
        }
    }

    public final void OooO0O0(OooO0o oooO0o) {
        int iOooOOo;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        for (ConstraintWidget constraintWidget : oooO0o.f27656o0OOO0o) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f6947OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (constraintWidget.f6969o0OoOo0 == 8) {
                constraintWidget.f6901OooO00o = true;
            } else {
                float f = constraintWidget.f6925OooOoO0;
                if (f < 1.0f && dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f6921OooOo00 = 2;
                }
                float f2 = constraintWidget.f6928OooOoo0;
                if (f2 < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f6920OooOo0 = 2;
                }
                if (constraintWidget.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f6921OooOo00 = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour6 && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f6920OooOo0 = 3;
                    } else if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour5 == dimensionBehaviour6) {
                        if (constraintWidget.f6921OooOo00 == 0) {
                            constraintWidget.f6921OooOo00 = 3;
                        }
                        if (constraintWidget.f6920OooOo0 == 0) {
                            constraintWidget.f6920OooOo0 = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour4 == dimensionBehaviour7 && constraintWidget.f6921OooOo00 == 1 && (constraintWidget.f6939Oooo0o0.f6895OooO0o == null || constraintWidget.f6940Oooo0oO.f6895OooO0o == null)) {
                    dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour5 == dimensionBehaviour7 && constraintWidget.f6920OooOo0 == 1 && (constraintWidget.f6938Oooo0o.f6895OooO0o == null || constraintWidget.f6941Oooo0oo.f6895OooO0o == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviour5;
                o0OOO0o o0ooo0o2 = constraintWidget.f6904OooO0Oo;
                o0ooo0o2.f27875OooO0Oo = dimensionBehaviour4;
                int i = constraintWidget.f6921OooOo00;
                o0ooo0o2.f27872OooO00o = i;
                o0OO00O o0oo00o2 = constraintWidget.f6906OooO0o0;
                o0oo00o2.f27875OooO0Oo = dimensionBehaviour8;
                int i2 = constraintWidget.f6920OooOo0;
                o0oo00o2.f27872OooO00o = i2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour4 == dimensionBehaviour9 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int iOooOoO0 = constraintWidget.OooOoO0();
                    if (dimensionBehaviour4 == dimensionBehaviour9) {
                        iOooOoO0 = (oooO0o.OooOoO0() - constraintWidget.f6939Oooo0o0.f6897OooO0oO) - constraintWidget.f6940Oooo0oO.f6897OooO0oO;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i3 = iOooOoO0;
                    int iOooOOo2 = constraintWidget.OooOOo();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        iOooOOo = (oooO0o.OooOOo() - constraintWidget.f6938Oooo0o.f6897OooO0oO) - constraintWidget.f6941Oooo0oo.f6897OooO0oO;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        iOooOOo = iOooOOo2;
                        dimensionBehaviour = dimensionBehaviour8;
                    }
                    OooO0o(constraintWidget, dimensionBehaviour4, i3, dimensionBehaviour, iOooOOo);
                    constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                    constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                    constraintWidget.f6901OooO00o = true;
                } else {
                    if (dimensionBehaviour4 == dimensionBehaviour7 && (dimensionBehaviour8 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i == 3) {
                            if (dimensionBehaviour8 == dimensionBehaviour3) {
                                OooO0o(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int iOooOOo3 = constraintWidget.OooOOo();
                            int i4 = (int) ((iOooOOo3 * constraintWidget.f6951OoooOoo) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                            OooO0o(constraintWidget, dimensionBehaviour10, i4, dimensionBehaviour10, iOooOOo3);
                            constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                            constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                            constraintWidget.f6901OooO00o = true;
                        } else if (i == 1) {
                            OooO0o(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour8, 0);
                            constraintWidget.f6904OooO0Oo.f27877OooO0o0.f27869OooOOO0 = constraintWidget.OooOoO0();
                        } else if (i == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = oooO0o.f6947OoooOOO;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr2[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour11 == dimensionBehaviour12 || dimensionBehaviourArr2[0] == dimensionBehaviour9) {
                                OooO0o(constraintWidget, dimensionBehaviour12, (int) ((f * oooO0o.OooOoO0()) + 0.5f), dimensionBehaviour8, constraintWidget.OooOOo());
                                constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                                constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                                constraintWidget.f6901OooO00o = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = constraintWidget.f6942OoooO;
                            if (constraintAnchorArr[0].f6895OooO0o == null || constraintAnchorArr[1].f6895OooO0o == null) {
                                OooO0o(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour8, 0);
                                constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                                constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                                constraintWidget.f6901OooO00o = true;
                            }
                        }
                    }
                    if (dimensionBehaviour8 == dimensionBehaviour7 && (dimensionBehaviour4 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i2 == 3) {
                            if (dimensionBehaviour4 == dimensionBehaviour2) {
                                OooO0o(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour2, 0);
                            }
                            int iOooOoO1 = constraintWidget.OooOoO0();
                            float f3 = constraintWidget.f6951OoooOoo;
                            if (constraintWidget.f6952Ooooo00 == -1) {
                                f3 = 1.0f / f3;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
                            OooO0o(constraintWidget, dimensionBehaviour13, iOooOoO1, dimensionBehaviour13, (int) ((iOooOoO1 * f3) + 0.5f));
                            constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                            constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                            constraintWidget.f6901OooO00o = true;
                        } else if (i2 == 1) {
                            OooO0o(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour2, 0);
                            constraintWidget.f6906OooO0o0.f27877OooO0o0.f27869OooOOO0 = constraintWidget.OooOOo();
                        } else if (i2 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = oooO0o.f6947OoooOOO;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr3[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour14 == dimensionBehaviour15 || dimensionBehaviourArr3[1] == dimensionBehaviour9) {
                                OooO0o(constraintWidget, dimensionBehaviour4, constraintWidget.OooOoO0(), dimensionBehaviour15, (int) ((f2 * oooO0o.OooOOo()) + 0.5f));
                                constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                                constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                                constraintWidget.f6901OooO00o = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.f6942OoooO;
                            if (constraintAnchorArr2[2].f6895OooO0o == null || constraintAnchorArr2[3].f6895OooO0o == null) {
                                OooO0o(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour8, 0);
                                constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                                constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                                constraintWidget.f6901OooO00o = true;
                            }
                        }
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour7 && dimensionBehaviour8 == dimensionBehaviour7) {
                        if (i == 1 || i2 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            OooO0o(constraintWidget, dimensionBehaviour16, 0, dimensionBehaviour16, 0);
                            constraintWidget.f6904OooO0Oo.f27877OooO0o0.f27869OooOOO0 = constraintWidget.OooOoO0();
                            constraintWidget.f6906OooO0o0.f27877OooO0o0.f27869OooOOO0 = constraintWidget.OooOOo();
                        } else if (i2 == 2 && i == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = oooO0o.f6947OoooOOO;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr4[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour17 == dimensionBehaviour18 && dimensionBehaviourArr4[1] == dimensionBehaviour18) {
                                OooO0o(constraintWidget, dimensionBehaviour18, (int) ((f * oooO0o.OooOoO0()) + 0.5f), dimensionBehaviour18, (int) ((f2 * oooO0o.OooOOo()) + 0.5f));
                                constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                                constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                                constraintWidget.f6901OooO00o = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void OooO0OO() {
        ArrayList<o0O0O00> arrayList = this.f27854OooO0o0;
        arrayList.clear();
        this.f27852OooO0Oo.f6904OooO0Oo.OooO0o();
        this.f27852OooO0Oo.f6906OooO0o0.OooO0o();
        arrayList.add(this.f27852OooO0Oo.f6904OooO0Oo);
        arrayList.add(this.f27852OooO0Oo.f6906OooO0o0);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.f27852OooO0Oo.f27656o0OOO0o) {
            if (constraintWidget instanceof OooOO0) {
                arrayList.add(new o00oO0o(constraintWidget));
            } else {
                if (constraintWidget.Oooo000()) {
                    if (constraintWidget.f6902OooO0O0 == null) {
                        constraintWidget.f6902OooO0O0 = new Oooo000(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f6902OooO0O0);
                } else {
                    arrayList.add(constraintWidget.f6904OooO0Oo);
                }
                if (constraintWidget.Oooo00O()) {
                    if (constraintWidget.f6903OooO0OO == null) {
                        constraintWidget.f6903OooO0OO = new Oooo000(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f6903OooO0OO);
                } else {
                    arrayList.add(constraintWidget.f6906OooO0o0);
                }
                if (constraintWidget instanceof OooOO0O) {
                    arrayList.add(new o0ooOOo(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o0O0O00> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().OooO0o();
        }
        for (o0O0O00 o0o0o00 : arrayList) {
            if (o0o0o00.f27873OooO0O0 != this.f27852OooO0Oo) {
                o0o0o00.OooO0Oo();
            }
        }
        this.f27856OooO0oo.clear();
        OooO0o0(this.f27849OooO00o.f6904OooO0Oo, 0, this.f27856OooO0oo);
        OooO0o0(this.f27849OooO00o.f6906OooO0o0, 1, this.f27856OooO0oo);
        this.f27850OooO0O0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    public final int OooO0Oo(OooO0o oooO0o, int i) {
        o0O0O00 o0o0o00;
        o0O0O00 o0o0o01;
        boolean zContains;
        boolean zContains2;
        long jOooOO0;
        float f;
        long j;
        o000oOoO o000oooo2 = this;
        int size = o000oooo2.f27856OooO0oo.size();
        long jMax = 0;
        long jOooOO1 = 0;
        int i2 = 0;
        while (i2 < size) {
            o0Oo0oo o0oo0oo2 = o000oooo2.f27856OooO0oo.get(i2);
            o0O0O00 o0o0o02 = o0oo0oo2.f27887OooO00o;
            if (o0o0o02 instanceof Oooo000) {
                if (((Oooo000) o0o0o02).f27876OooO0o == i) {
                    if (i == 0) {
                        o0o0o00 = oooO0o.f6904OooO0Oo;
                    } else {
                        o0o0o00 = oooO0o.f6906OooO0o0;
                    }
                    o00O0O o00o0o2 = o0o0o00.f27879OooO0oo;
                    if (i == 0) {
                        o0o0o01 = oooO0o.f6904OooO0Oo;
                    } else {
                        o0o0o01 = oooO0o.f6906OooO0o0;
                    }
                    o00O0O o00o0o3 = o0o0o01.f27871OooO;
                    zContains = o0o0o02.f27879OooO0oo.f27868OooOO0o.contains(o00o0o2);
                    zContains2 = o0oo0oo2.f27887OooO00o.f27871OooO.f27868OooOO0o.contains(o00o0o3);
                    jOooOO0 = o0oo0oo2.f27887OooO00o.OooOO0();
                    if (!zContains && zContains2) {
                        long jOooO0O0 = o0oo0oo2.OooO0O0(o0oo0oo2.f27887OooO00o.f27879OooO0oo, jOooOO1);
                        long jOooO00o = o0oo0oo2.OooO00o(o0oo0oo2.f27887OooO00o.f27871OooO, jOooOO1);
                        long j2 = jOooO0O0 - jOooOO0;
                        o0O0O00 o0o0o03 = o0oo0oo2.f27887OooO00o;
                        int i3 = o0o0o03.f27871OooO.f27862OooO0o;
                        if (j2 >= (-i3)) {
                            j2 += (long) i3;
                        }
                        long j3 = (-jOooO00o) - jOooOO0;
                        long j4 = o0o0o03.f27879OooO0oo.f27862OooO0o;
                        long j5 = j3 - j4;
                        if (j5 >= j4) {
                            j5 -= j4;
                        }
                        ConstraintWidget constraintWidget = o0o0o03.f27873OooO0O0;
                        Objects.requireNonNull(constraintWidget);
                        if (i == 0) {
                            f = constraintWidget.f6957Oooooo;
                        } else {
                            f = i == 1 ? constraintWidget.f6959OoooooO : -1.0f;
                        }
                        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            j = (long) ((j2 / (1.0f - f)) + (j5 / f));
                        } else {
                            j = 0;
                        }
                        float f2 = j;
                        long jOooO00o2 = ((long) ((f2 * f) + 0.5f)) + jOooOO0 + ((long) OooO00o.OooO00o(1.0f, f, f2, 0.5f));
                        o0O0O00 o0o0o04 = o0oo0oo2.f27887OooO00o;
                        jOooOO1 = (((long) o0o0o04.f27879OooO0oo.f27862OooO0o) + jOooO00o2) - ((long) o0o0o04.f27871OooO.f27862OooO0o);
                    } else if (zContains) {
                        o00O0O o00o0o4 = o0oo0oo2.f27887OooO00o.f27879OooO0oo;
                        jOooOO1 = Math.max(o0oo0oo2.OooO0O0(o00o0o4, o00o0o4.f27862OooO0o), ((long) o0oo0oo2.f27887OooO00o.f27879OooO0oo.f27862OooO0o) + jOooOO0);
                    } else if (zContains2) {
                        o00O0O o00o0o5 = o0oo0oo2.f27887OooO00o.f27871OooO;
                        jOooOO1 = Math.max(-o0oo0oo2.OooO00o(o00o0o5, o00o0o5.f27862OooO0o), ((long) (-o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o)) + jOooOO0);
                    } else {
                        o0O0O00 o0o0o05 = o0oo0oo2.f27887OooO00o;
                        jOooOO1 = (o0o0o05.OooOO0() + ((long) o0o0o05.f27879OooO0oo.f27862OooO0o)) - ((long) o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o);
                    }
                }
            } else if (i == 0) {
                if (o0o0o02 instanceof o0OOO0o) {
                    if (i == 0) {
                        o0o0o00 = oooO0o.f6904OooO0Oo;
                    } else {
                        o0o0o00 = oooO0o.f6906OooO0o0;
                    }
                    o00O0O o00o0o6 = o0o0o00.f27879OooO0oo;
                    if (i == 0) {
                        o0o0o01 = oooO0o.f6904OooO0Oo;
                    } else {
                        o0o0o01 = oooO0o.f6906OooO0o0;
                    }
                    o00O0O o00o0o7 = o0o0o01.f27871OooO;
                    zContains = o0o0o02.f27879OooO0oo.f27868OooOO0o.contains(o00o0o6);
                    zContains2 = o0oo0oo2.f27887OooO00o.f27871OooO.f27868OooOO0o.contains(o00o0o7);
                    jOooOO0 = o0oo0oo2.f27887OooO00o.OooOO0();
                    if (!zContains) {
                        if (zContains) {
                            o00O0O o00o0o8 = o0oo0oo2.f27887OooO00o.f27879OooO0oo;
                            jOooOO1 = Math.max(o0oo0oo2.OooO0O0(o00o0o8, o00o0o8.f27862OooO0o), ((long) o0oo0oo2.f27887OooO00o.f27879OooO0oo.f27862OooO0o) + jOooOO0);
                        } else if (zContains2) {
                            o00O0O o00o0o9 = o0oo0oo2.f27887OooO00o.f27871OooO;
                            jOooOO1 = Math.max(-o0oo0oo2.OooO00o(o00o0o9, o00o0o9.f27862OooO0o), ((long) (-o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o)) + jOooOO0);
                        } else {
                            o0O0O00 o0o0o06 = o0oo0oo2.f27887OooO00o;
                            jOooOO1 = (o0o0o06.OooOO0() + ((long) o0o0o06.f27879OooO0oo.f27862OooO0o)) - ((long) o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o);
                        }
                    } else if (zContains) {
                        o00O0O o00o0o10 = o0oo0oo2.f27887OooO00o.f27879OooO0oo;
                        jOooOO1 = Math.max(o0oo0oo2.OooO0O0(o00o0o10, o00o0o10.f27862OooO0o), ((long) o0oo0oo2.f27887OooO00o.f27879OooO0oo.f27862OooO0o) + jOooOO0);
                    } else if (zContains2) {
                        o00O0O o00o0o11 = o0oo0oo2.f27887OooO00o.f27871OooO;
                        jOooOO1 = Math.max(-o0oo0oo2.OooO00o(o00o0o11, o00o0o11.f27862OooO0o), ((long) (-o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o)) + jOooOO0);
                    } else {
                        o0O0O00 o0o0o07 = o0oo0oo2.f27887OooO00o;
                        jOooOO1 = (o0o0o07.OooOO0() + ((long) o0o0o07.f27879OooO0oo.f27862OooO0o)) - ((long) o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o);
                    }
                }
            } else if (o0o0o02 instanceof o0OO00O) {
                if (i == 0) {
                    o0o0o00 = oooO0o.f6904OooO0Oo;
                } else {
                    o0o0o00 = oooO0o.f6906OooO0o0;
                }
                o00O0O o00o0o12 = o0o0o00.f27879OooO0oo;
                if (i == 0) {
                    o0o0o01 = oooO0o.f6904OooO0Oo;
                } else {
                    o0o0o01 = oooO0o.f6906OooO0o0;
                }
                o00O0O o00o0o13 = o0o0o01.f27871OooO;
                zContains = o0o0o02.f27879OooO0oo.f27868OooOO0o.contains(o00o0o12);
                zContains2 = o0oo0oo2.f27887OooO00o.f27871OooO.f27868OooOO0o.contains(o00o0o13);
                jOooOO0 = o0oo0oo2.f27887OooO00o.OooOO0();
                if (!zContains) {
                    if (zContains) {
                        o00O0O o00o0o14 = o0oo0oo2.f27887OooO00o.f27879OooO0oo;
                        jOooOO1 = Math.max(o0oo0oo2.OooO0O0(o00o0o14, o00o0o14.f27862OooO0o), ((long) o0oo0oo2.f27887OooO00o.f27879OooO0oo.f27862OooO0o) + jOooOO0);
                    } else if (zContains2) {
                        o00O0O o00o0o15 = o0oo0oo2.f27887OooO00o.f27871OooO;
                        jOooOO1 = Math.max(-o0oo0oo2.OooO00o(o00o0o15, o00o0o15.f27862OooO0o), ((long) (-o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o)) + jOooOO0);
                    } else {
                        o0O0O00 o0o0o08 = o0oo0oo2.f27887OooO00o;
                        jOooOO1 = (o0o0o08.OooOO0() + ((long) o0o0o08.f27879OooO0oo.f27862OooO0o)) - ((long) o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o);
                    }
                } else if (zContains) {
                    o00O0O o00o0o16 = o0oo0oo2.f27887OooO00o.f27879OooO0oo;
                    jOooOO1 = Math.max(o0oo0oo2.OooO0O0(o00o0o16, o00o0o16.f27862OooO0o), ((long) o0oo0oo2.f27887OooO00o.f27879OooO0oo.f27862OooO0o) + jOooOO0);
                } else if (zContains2) {
                    o00O0O o00o0o17 = o0oo0oo2.f27887OooO00o.f27871OooO;
                    jOooOO1 = Math.max(-o0oo0oo2.OooO00o(o00o0o17, o00o0o17.f27862OooO0o), ((long) (-o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o)) + jOooOO0);
                } else {
                    o0O0O00 o0o0o09 = o0oo0oo2.f27887OooO00o;
                    jOooOO1 = (o0o0o09.OooOO0() + ((long) o0o0o09.f27879OooO0oo.f27862OooO0o)) - ((long) o0oo0oo2.f27887OooO00o.f27871OooO.f27862OooO0o);
                }
            }
            jMax = Math.max(jMax, jOooOO1);
            i2++;
            jOooOO1 = 0;
            o000oooo2 = this;
        }
        return (int) jMax;
    }

    public final void OooO0o(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        OooOo.OooO00o oooO00o = this.f27855OooO0oO;
        oooO00o.f27838OooO00o = dimensionBehaviour;
        oooO00o.f27839OooO0O0 = dimensionBehaviour2;
        oooO00o.f27840OooO0OO = i;
        oooO00o.f27841OooO0Oo = i2;
        this.f27853OooO0o.OooO0O0(constraintWidget, oooO00o);
        constraintWidget.Ooooo00(this.f27855OooO0oO.f27843OooO0o0);
        constraintWidget.OoooOO0(this.f27855OooO0oO.f27842OooO0o);
        OooOo.OooO00o oooO00o2 = this.f27855OooO0oO;
        constraintWidget.f6934Oooo00O = oooO00o2.f27845OooO0oo;
        constraintWidget.OoooO00(oooO00o2.f27844OooO0oO);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    public final void OooO0o0(o0O0O00 o0o0o00, int i, ArrayList<o0Oo0oo> arrayList) {
        for (Oooo0 oooo0 : o0o0o00.f27879OooO0oo.f27867OooOO0O) {
            if (oooo0 instanceof o00O0O) {
                OooO00o((o00O0O) oooo0, i, 0, o0o0o00.f27871OooO, arrayList, null);
            } else if (oooo0 instanceof o0O0O00) {
                OooO00o(((o0O0O00) oooo0).f27879OooO0oo, i, 0, o0o0o00.f27871OooO, arrayList, null);
            }
        }
        for (Oooo0 oooo1 : o0o0o00.f27871OooO.f27867OooOO0O) {
            if (oooo1 instanceof o00O0O) {
                OooO00o((o00O0O) oooo1, i, 1, o0o0o00.f27879OooO0oo, arrayList, null);
            } else if (oooo1 instanceof o0O0O00) {
                OooO00o(((o0O0O00) oooo1).f27871OooO, i, 1, o0o0o00.f27879OooO0oo, arrayList, null);
            }
        }
        if (i == 1) {
            for (Oooo0 oooo2 : ((o0OO00O) o0o0o00).f27882OooOO0O.f27867OooOO0O) {
                if (oooo2 instanceof o00O0O) {
                    OooO00o((o00O0O) oooo2, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void OooO0oO() {
        OooOo00 oooOo00;
        for (ConstraintWidget constraintWidget : this.f27849OooO00o.f27656o0OOO0o) {
            if (!constraintWidget.f6901OooO00o) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f6947OoooOOO;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.f6921OooOo00;
                int i2 = constraintWidget.f6920OooOo0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                o00Oo0 o00oo1 = constraintWidget.f6904OooO0Oo.f27877OooO0o0;
                boolean z3 = o00oo1.f27866OooOO0;
                o00Oo0 o00oo2 = constraintWidget.f6906OooO0o0.f27877OooO0o0;
                boolean z4 = o00oo2.f27866OooOO0;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    OooO0o(constraintWidget, dimensionBehaviour4, o00oo1.f27864OooO0oO, dimensionBehaviour4, o00oo2.f27864OooO0oO);
                    constraintWidget.f6901OooO00o = true;
                } else if (z3 && z) {
                    OooO0o(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, o00oo1.f27864OooO0oO, dimensionBehaviour3, o00oo2.f27864OooO0oO);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f6906OooO0o0.f27877OooO0o0.f27869OooOOO0 = constraintWidget.OooOOo();
                    } else {
                        constraintWidget.f6906OooO0o0.f27877OooO0o0.OooO0Oo(constraintWidget.OooOOo());
                        constraintWidget.f6901OooO00o = true;
                    }
                } else if (z4 && z2) {
                    OooO0o(constraintWidget, dimensionBehaviour3, o00oo1.f27864OooO0oO, ConstraintWidget.DimensionBehaviour.FIXED, o00oo2.f27864OooO0oO);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f6904OooO0Oo.f27877OooO0o0.f27869OooOOO0 = constraintWidget.OooOoO0();
                    } else {
                        constraintWidget.f6904OooO0Oo.f27877OooO0o0.OooO0Oo(constraintWidget.OooOoO0());
                        constraintWidget.f6901OooO00o = true;
                    }
                }
                if (constraintWidget.f6901OooO00o && (oooOo00 = constraintWidget.f6906OooO0o0.f27883OooOO0o) != null) {
                    oooOo00.OooO0Oo(constraintWidget.f6955OooooOO);
                }
            }
        }
    }
}
