package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO0o;
import androidx.constraintlayout.core.widgets.OooOO0;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooOo.OooO00o f27870OooO00o = new OooOo.OooO00o();

    public static boolean OooO00o(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f6947OoooOOO;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f6948OoooOOo;
        OooO0o oooO0o = constraintWidget2 != null ? (OooO0o) constraintWidget2 : null;
        if (oooO0o != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = oooO0o.f6947OoooOOO[0];
        }
        if (oooO0o != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = oooO0o.f6947OoooOOO[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviour3 == dimensionBehaviour7 || constraintWidget.Oooo0() || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f6921OooOo00 == 0 && constraintWidget.f6951OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && constraintWidget.OooOoo0(0)) || (dimensionBehaviour3 == dimensionBehaviour2 && constraintWidget.f6921OooOo00 == 1 && constraintWidget.OooOoo(0, constraintWidget.OooOoO0()));
        boolean z2 = dimensionBehaviour4 == dimensionBehaviour7 || constraintWidget.Oooo0O0() || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f6920OooOo0 == 0 && constraintWidget.f6951OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && constraintWidget.OooOoo0(1)) || (dimensionBehaviour4 == dimensionBehaviour && constraintWidget.f6920OooOo0 == 1 && constraintWidget.OooOoo(1, constraintWidget.OooOOo()));
        if (constraintWidget.f6951OoooOoo <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void OooO0O0(int i, ConstraintWidget constraintWidget, OooOo.OooO0O0 oooO0O0, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f6914OooOOOO) {
            return;
        }
        if (!(constraintWidget instanceof OooO0o) && constraintWidget.Oooo00o() && OooO00o(constraintWidget)) {
            OooO0o.o00o0O(constraintWidget, oooO0O0, new OooOo.OooO00o());
        }
        ConstraintAnchor constraintAnchorOooOOOO = constraintWidget.OooOOOO(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorOooOOOO2 = constraintWidget.OooOOOO(ConstraintAnchor.Type.RIGHT);
        int iOooO0Oo = constraintAnchorOooOOOO.OooO0Oo();
        int iOooO0Oo2 = constraintAnchorOooOOOO2.OooO0Oo();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorOooOOOO.f6891OooO00o;
        if (hashSet != null && constraintAnchorOooOOOO.f6893OooO0OO) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f6894OooO0Oo;
                int i2 = i + 1;
                boolean zOooO00o = OooO00o(constraintWidget2);
                if (constraintWidget2.Oooo00o() && zOooO00o) {
                    OooO0o.o00o0O(constraintWidget2, oooO0O0, new OooOo.OooO00o());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f6939Oooo0o0;
                boolean z2 = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.f6940Oooo0oO.f6895OooO0o) != null && constraintAnchor4.f6893OooO0OO) || (next == constraintWidget2.f6940Oooo0oO && (constraintAnchor3 = constraintAnchor5.f6895OooO0o) != null && constraintAnchor3.f6893OooO0OO);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.f6947OoooOOO;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || zOooO00o) {
                    if (!constraintWidget2.Oooo00o()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f6939Oooo0o0;
                        if (next == constraintAnchor6 && constraintWidget2.f6940Oooo0oO.f6895OooO0o == null) {
                            int iOooO0o0 = constraintAnchor6.OooO0o0() + iOooO0Oo;
                            constraintWidget2.OoooO0O(iOooO0o0, constraintWidget2.OooOoO0() + iOooO0o0);
                            OooO0O0(i2, constraintWidget2, oooO0O0, z);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.f6940Oooo0oO;
                            if (next == constraintAnchor7 && constraintAnchor6.f6895OooO0o == null) {
                                int iOooO0o1 = iOooO0Oo - constraintAnchor7.OooO0o0();
                                constraintWidget2.OoooO0O(iOooO0o1 - constraintWidget2.OooOoO0(), iOooO0o1);
                                OooO0O0(i2, constraintWidget2, oooO0O0, z);
                            } else if (z2 && !constraintWidget2.Oooo000()) {
                                OooO0OO(i2, oooO0O0, constraintWidget2, z);
                            }
                        }
                    }
                } else if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget2.f6919OooOo >= 0 && constraintWidget2.f6923OooOo0o >= 0 && (constraintWidget2.f6969o0OoOo0 == 8 || (constraintWidget2.f6921OooOo00 == 0 && constraintWidget2.f6951OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
                    if (!constraintWidget2.Oooo000() && !constraintWidget2.f6932Oooo0 && z2 && !constraintWidget2.Oooo000()) {
                        OooO0Oo(i2, constraintWidget, oooO0O0, constraintWidget2, z);
                    }
                }
            }
        }
        if (constraintWidget instanceof OooOO0) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorOooOOOO2.f6891OooO00o;
        if (hashSet2 != null && constraintAnchorOooOOOO2.f6893OooO0OO) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f6894OooO0Oo;
                int i3 = i + 1;
                boolean zOooO00o2 = OooO00o(constraintWidget3);
                if (constraintWidget3.Oooo00o() && zOooO00o2) {
                    OooO0o.o00o0O(constraintWidget3, oooO0O0, new OooOo.OooO00o());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f6939Oooo0o0;
                boolean z3 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.f6940Oooo0oO.f6895OooO0o) != null && constraintAnchor2.f6893OooO0OO) || (next2 == constraintWidget3.f6940Oooo0oO && (constraintAnchor = constraintAnchor8.f6895OooO0o) != null && constraintAnchor.f6893OooO0OO);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget3.f6947OoooOOO;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr2[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || zOooO00o2) {
                    if (!constraintWidget3.Oooo00o()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.f6939Oooo0o0;
                        if (next2 == constraintAnchor9 && constraintWidget3.f6940Oooo0oO.f6895OooO0o == null) {
                            int iOooO0o2 = constraintAnchor9.OooO0o0() + iOooO0Oo2;
                            constraintWidget3.OoooO0O(iOooO0o2, constraintWidget3.OooOoO0() + iOooO0o2);
                            OooO0O0(i3, constraintWidget3, oooO0O0, z);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.f6940Oooo0oO;
                            if (next2 == constraintAnchor10 && constraintAnchor9.f6895OooO0o == null) {
                                int iOooO0o3 = iOooO0Oo2 - constraintAnchor10.OooO0o0();
                                constraintWidget3.OoooO0O(iOooO0o3 - constraintWidget3.OooOoO0(), iOooO0o3);
                                OooO0O0(i3, constraintWidget3, oooO0O0, z);
                            } else if (z3 && !constraintWidget3.Oooo000()) {
                                OooO0OO(i3, oooO0O0, constraintWidget3, z);
                            }
                        }
                    }
                } else if (dimensionBehaviourArr2[0] == dimensionBehaviour4 && constraintWidget3.f6919OooOo >= 0 && constraintWidget3.f6923OooOo0o >= 0) {
                    if (constraintWidget3.f6969o0OoOo0 != 8) {
                        if (constraintWidget3.f6921OooOo00 == 0) {
                            if (constraintWidget3.f6951OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            }
                        }
                    }
                    if (!constraintWidget3.Oooo000() && !constraintWidget3.f6932Oooo0 && z3 && !constraintWidget3.Oooo000()) {
                        OooO0Oo(i3, constraintWidget, oooO0O0, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.f6914OooOOOO = true;
    }

    public static void OooO0OO(int i, OooOo.OooO0O0 oooO0O0, ConstraintWidget constraintWidget, boolean z) {
        float f = constraintWidget.f6957Oooooo;
        int iOooO0Oo = constraintWidget.f6939Oooo0o0.f6895OooO0o.OooO0Oo();
        int iOooO0Oo2 = constraintWidget.f6940Oooo0oO.f6895OooO0o.OooO0Oo();
        int iOooO0o0 = constraintWidget.f6939Oooo0o0.OooO0o0() + iOooO0Oo;
        int iOooO0o1 = iOooO0Oo2 - constraintWidget.f6940Oooo0oO.OooO0o0();
        if (iOooO0Oo == iOooO0Oo2) {
            f = 0.5f;
        } else {
            iOooO0Oo = iOooO0o0;
            iOooO0Oo2 = iOooO0o1;
        }
        int iOooOoO0 = constraintWidget.OooOoO0();
        int i2 = (iOooO0Oo2 - iOooO0Oo) - iOooOoO0;
        if (iOooO0Oo > iOooO0Oo2) {
            i2 = (iOooO0Oo - iOooO0Oo2) - iOooOoO0;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iOooO0Oo;
        int i4 = i3 + iOooOoO0;
        if (iOooO0Oo > iOooO0Oo2) {
            i4 = i3 - iOooOoO0;
        }
        constraintWidget.OoooO0O(i3, i4);
        OooO0O0(i + 1, constraintWidget, oooO0O0, z);
    }

    public static void OooO0Oo(int i, ConstraintWidget constraintWidget, OooOo.OooO0O0 oooO0O0, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.f6957Oooooo;
        int iOooO0o0 = constraintWidget2.f6939Oooo0o0.OooO0o0() + constraintWidget2.f6939Oooo0o0.f6895OooO0o.OooO0Oo();
        int iOooO0Oo = constraintWidget2.f6940Oooo0oO.f6895OooO0o.OooO0Oo() - constraintWidget2.f6940Oooo0oO.OooO0o0();
        if (iOooO0Oo >= iOooO0o0) {
            int iOooOoO0 = constraintWidget2.OooOoO0();
            if (constraintWidget2.f6969o0OoOo0 != 8) {
                int i2 = constraintWidget2.f6921OooOo00;
                if (i2 == 2) {
                    iOooOoO0 = (int) (constraintWidget2.f6957Oooooo * 0.5f * (constraintWidget instanceof OooO0o ? constraintWidget.OooOoO0() : constraintWidget.f6948OoooOOo.OooOoO0()));
                } else if (i2 == 0) {
                    iOooOoO0 = iOooO0Oo - iOooO0o0;
                }
                iOooOoO0 = Math.max(constraintWidget2.f6923OooOo0o, iOooOoO0);
                int i3 = constraintWidget2.f6919OooOo;
                if (i3 > 0) {
                    iOooOoO0 = Math.min(i3, iOooOoO0);
                }
            }
            int i4 = iOooO0o0 + ((int) ((f * ((iOooO0Oo - iOooO0o0) - iOooOoO0)) + 0.5f));
            constraintWidget2.OoooO0O(i4, iOooOoO0 + i4);
            OooO0O0(i + 1, constraintWidget2, oooO0O0, z);
        }
    }

    public static void OooO0o(int i, ConstraintWidget constraintWidget, OooOo.OooO0O0 oooO0O0, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.f6959OoooooO;
        int iOooO0o0 = constraintWidget2.f6938Oooo0o.OooO0o0() + constraintWidget2.f6938Oooo0o.f6895OooO0o.OooO0Oo();
        int iOooO0Oo = constraintWidget2.f6941Oooo0oo.f6895OooO0o.OooO0Oo() - constraintWidget2.f6941Oooo0oo.OooO0o0();
        if (iOooO0Oo >= iOooO0o0) {
            int iOooOOo = constraintWidget2.OooOOo();
            if (constraintWidget2.f6969o0OoOo0 != 8) {
                int i2 = constraintWidget2.f6920OooOo0;
                if (i2 == 2) {
                    iOooOOo = (int) (f * 0.5f * (constraintWidget instanceof OooO0o ? constraintWidget.OooOOo() : constraintWidget.f6948OoooOOo.OooOOo()));
                } else if (i2 == 0) {
                    iOooOOo = iOooO0Oo - iOooO0o0;
                }
                iOooOOo = Math.max(constraintWidget2.f6924OooOoO, iOooOOo);
                int i3 = constraintWidget2.f6926OooOoOO;
                if (i3 > 0) {
                    iOooOOo = Math.min(i3, iOooOOo);
                }
            }
            int i4 = iOooO0o0 + ((int) ((f * ((iOooO0Oo - iOooO0o0) - iOooOOo)) + 0.5f));
            constraintWidget2.OoooO(i4, iOooOOo + i4);
            OooO0oO(i + 1, constraintWidget2, oooO0O0);
        }
    }

    public static void OooO0o0(int i, OooOo.OooO0O0 oooO0O0, ConstraintWidget constraintWidget) {
        float f = constraintWidget.f6959OoooooO;
        int iOooO0Oo = constraintWidget.f6938Oooo0o.f6895OooO0o.OooO0Oo();
        int iOooO0Oo2 = constraintWidget.f6941Oooo0oo.f6895OooO0o.OooO0Oo();
        int iOooO0o0 = constraintWidget.f6938Oooo0o.OooO0o0() + iOooO0Oo;
        int iOooO0o1 = iOooO0Oo2 - constraintWidget.f6941Oooo0oo.OooO0o0();
        if (iOooO0Oo == iOooO0Oo2) {
            f = 0.5f;
        } else {
            iOooO0Oo = iOooO0o0;
            iOooO0Oo2 = iOooO0o1;
        }
        int iOooOOo = constraintWidget.OooOOo();
        int i2 = (iOooO0Oo2 - iOooO0Oo) - iOooOOo;
        if (iOooO0Oo > iOooO0Oo2) {
            i2 = (iOooO0Oo - iOooO0Oo2) - iOooOOo;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iOooO0Oo + i3;
        int i5 = i4 + iOooOOo;
        if (iOooO0Oo > iOooO0Oo2) {
            i4 = iOooO0Oo - i3;
            i5 = i4 - iOooOOo;
        }
        constraintWidget.OoooO(i4, i5);
        OooO0oO(i + 1, constraintWidget, oooO0O0);
    }

    public static void OooO0oO(int i, ConstraintWidget constraintWidget, OooOo.OooO0O0 oooO0O0) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f6915OooOOOo) {
            return;
        }
        if (!(constraintWidget instanceof OooO0o) && constraintWidget.Oooo00o() && OooO00o(constraintWidget)) {
            OooO0o.o00o0O(constraintWidget, oooO0O0, new OooOo.OooO00o());
        }
        ConstraintAnchor constraintAnchorOooOOOO = constraintWidget.OooOOOO(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorOooOOOO2 = constraintWidget.OooOOOO(ConstraintAnchor.Type.BOTTOM);
        int iOooO0Oo = constraintAnchorOooOOOO.OooO0Oo();
        int iOooO0Oo2 = constraintAnchorOooOOOO2.OooO0Oo();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorOooOOOO.f6891OooO00o;
        if (hashSet != null && constraintAnchorOooOOOO.f6893OooO0OO) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f6894OooO0Oo;
                int i2 = i + 1;
                boolean zOooO00o = OooO00o(constraintWidget2);
                if (constraintWidget2.Oooo00o() && zOooO00o) {
                    OooO0o.o00o0O(constraintWidget2, oooO0O0, new OooOo.OooO00o());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f6938Oooo0o;
                boolean z = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.f6941Oooo0oo.f6895OooO0o) != null && constraintAnchor4.f6893OooO0OO) || (next == constraintWidget2.f6941Oooo0oo && (constraintAnchor3 = constraintAnchor5.f6895OooO0o) != null && constraintAnchor3.f6893OooO0OO);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.f6947OoooOOO;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || zOooO00o) {
                    if (!constraintWidget2.Oooo00o()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f6938Oooo0o;
                        if (next == constraintAnchor6 && constraintWidget2.f6941Oooo0oo.f6895OooO0o == null) {
                            int iOooO0o0 = constraintAnchor6.OooO0o0() + iOooO0Oo;
                            constraintWidget2.OoooO(iOooO0o0, constraintWidget2.OooOOo() + iOooO0o0);
                            OooO0oO(i2, constraintWidget2, oooO0O0);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.f6941Oooo0oo;
                            if (next == constraintAnchor7 && constraintAnchor6.f6895OooO0o == null) {
                                int iOooO0o1 = iOooO0Oo - constraintAnchor7.OooO0o0();
                                constraintWidget2.OoooO(iOooO0o1 - constraintWidget2.OooOOo(), iOooO0o1);
                                OooO0oO(i2, constraintWidget2, oooO0O0);
                            } else if (z && !constraintWidget2.Oooo00O()) {
                                OooO0o0(i2, oooO0O0, constraintWidget2);
                            }
                        }
                    }
                } else if (dimensionBehaviourArr[1] == dimensionBehaviour2 && constraintWidget2.f6926OooOoOO >= 0 && constraintWidget2.f6924OooOoO >= 0 && (constraintWidget2.f6969o0OoOo0 == 8 || (constraintWidget2.f6920OooOo0 == 0 && constraintWidget2.f6951OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
                    if (!constraintWidget2.Oooo00O() && !constraintWidget2.f6932Oooo0 && z && !constraintWidget2.Oooo00O()) {
                        OooO0o(i2, constraintWidget, oooO0O0, constraintWidget2);
                    }
                }
            }
        }
        if (constraintWidget instanceof OooOO0) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorOooOOOO2.f6891OooO00o;
        if (hashSet2 != null && constraintAnchorOooOOOO2.f6893OooO0OO) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f6894OooO0Oo;
                int i3 = i + 1;
                boolean zOooO00o2 = OooO00o(constraintWidget3);
                if (constraintWidget3.Oooo00o() && zOooO00o2) {
                    OooO0o.o00o0O(constraintWidget3, oooO0O0, new OooOo.OooO00o());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f6938Oooo0o;
                boolean z2 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.f6941Oooo0oo.f6895OooO0o) != null && constraintAnchor2.f6893OooO0OO) || (next2 == constraintWidget3.f6941Oooo0oo && (constraintAnchor = constraintAnchor8.f6895OooO0o) != null && constraintAnchor.f6893OooO0OO);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget3.f6947OoooOOO;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr2[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || zOooO00o2) {
                    if (!constraintWidget3.Oooo00o()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.f6938Oooo0o;
                        if (next2 == constraintAnchor9 && constraintWidget3.f6941Oooo0oo.f6895OooO0o == null) {
                            int iOooO0o2 = constraintAnchor9.OooO0o0() + iOooO0Oo2;
                            constraintWidget3.OoooO(iOooO0o2, constraintWidget3.OooOOo() + iOooO0o2);
                            OooO0oO(i3, constraintWidget3, oooO0O0);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.f6941Oooo0oo;
                            if (next2 == constraintAnchor10 && constraintAnchor9.f6895OooO0o == null) {
                                int iOooO0o3 = iOooO0Oo2 - constraintAnchor10.OooO0o0();
                                constraintWidget3.OoooO(iOooO0o3 - constraintWidget3.OooOOo(), iOooO0o3);
                                OooO0oO(i3, constraintWidget3, oooO0O0);
                            } else if (z2 && !constraintWidget3.Oooo00O()) {
                                OooO0o0(i3, oooO0O0, constraintWidget3);
                            }
                        }
                    }
                } else if (dimensionBehaviourArr2[1] == dimensionBehaviour4 && constraintWidget3.f6926OooOoOO >= 0 && constraintWidget3.f6924OooOoO >= 0) {
                    if (constraintWidget3.f6969o0OoOo0 != 8) {
                        if (constraintWidget3.f6920OooOo0 == 0) {
                            if (constraintWidget3.f6951OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            }
                        }
                    }
                    if (!constraintWidget3.Oooo00O() && !constraintWidget3.f6932Oooo0 && z2 && !constraintWidget3.Oooo00O()) {
                        OooO0o(i3, constraintWidget, oooO0O0, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorOooOOOO3 = constraintWidget.OooOOOO(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorOooOOOO3.f6891OooO00o != null && constraintAnchorOooOOOO3.f6893OooO0OO) {
            int iOooO0Oo3 = constraintAnchorOooOOOO3.OooO0Oo();
            for (ConstraintAnchor constraintAnchor11 : constraintAnchorOooOOOO3.f6891OooO00o) {
                ConstraintWidget constraintWidget4 = constraintAnchor11.f6894OooO0Oo;
                int i4 = i + 1;
                boolean zOooO00o3 = OooO00o(constraintWidget4);
                if (constraintWidget4.Oooo00o() && zOooO00o3) {
                    OooO0o.o00o0O(constraintWidget4, oooO0O0, new OooOo.OooO00o());
                }
                if (constraintWidget4.f6947OoooOOO[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zOooO00o3) {
                    if (!constraintWidget4.Oooo00o() && constraintAnchor11 == constraintWidget4.f6931Oooo) {
                        int iOooO0o4 = constraintAnchor11.OooO0o0() + iOooO0Oo3;
                        if (constraintWidget4.f6934Oooo00O) {
                            int i5 = iOooO0o4 - constraintWidget4.f6955OooooOO;
                            int i6 = constraintWidget4.f6950OoooOoO + i5;
                            constraintWidget4.f6954OooooO0 = i5;
                            constraintWidget4.f6938Oooo0o.OooOOO0(i5);
                            constraintWidget4.f6941Oooo0oo.OooOOO0(i6);
                            constraintWidget4.f6931Oooo.OooOOO0(iOooO0o4);
                            constraintWidget4.f6912OooOOO = true;
                        }
                        OooO0oO(i4, constraintWidget4, oooO0O0);
                    }
                }
            }
        }
        constraintWidget.f6915OooOOOo = true;
    }
}
