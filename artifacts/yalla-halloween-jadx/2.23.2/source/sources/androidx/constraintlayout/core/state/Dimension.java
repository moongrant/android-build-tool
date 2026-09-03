package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public final class Dimension {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f4279OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f4280OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f4281OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f4282OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f4283OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f4284OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f4275OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f4276OooO0oo = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Object f4274OooO = new Object();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f4277OooOO0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Object f4278OooOO0O = new Object();

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public Dimension() {
        this.f4279OooO00o = 0;
        this.f4280OooO0O0 = Integer.MAX_VALUE;
        this.f4281OooO0OO = 1.0f;
        this.f4282OooO0Oo = 0;
        this.f4284OooO0o0 = f4276OooO0oo;
        this.f4283OooO0o = false;
    }

    public static Dimension OooO00o() {
        Object obj = f4276OooO0oo;
        Dimension dimension = new Dimension(f4275OooO0oO);
        dimension.f4284OooO0o0 = obj;
        if (obj instanceof Integer) {
            dimension.f4282OooO0Oo = ((Integer) obj).intValue();
            dimension.f4284OooO0o0 = null;
        }
        return dimension;
    }

    public final void OooO0O0(ConstraintWidget constraintWidget, int i) {
        Object obj = f4277OooOO0;
        Object obj2 = f4278OooOO0O;
        Object obj3 = f4276OooO0oo;
        int i2 = 1;
        float f = this.f4281OooO0OO;
        if (i == 0) {
            if (this.f4283OooO0o) {
                constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj4 = this.f4284OooO0o0;
                if (obj4 != obj3) {
                    i2 = obj4 == obj2 ? 2 : 0;
                }
                constraintWidget.OoooO0O(i2, f, this.f4279OooO00o, this.f4280OooO0O0);
                return;
            }
            int i3 = this.f4279OooO00o;
            if (i3 > 0) {
                if (i3 < 0) {
                    constraintWidget.f4396OooooOo = 0;
                } else {
                    constraintWidget.f4396OooooOo = i3;
                }
            }
            int i4 = this.f4280OooO0O0;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.f4370OooOooo[0] = i4;
            }
            Object obj5 = this.f4284OooO0o0;
            if (obj5 == obj3) {
                constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj5 == obj) {
                constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj5 == null) {
                    constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.o000oOoO(this.f4282OooO0Oo);
                    return;
                }
                return;
            }
        }
        if (this.f4283OooO0o) {
            constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj6 = this.f4284OooO0o0;
            if (obj6 != obj3) {
                i2 = obj6 == obj2 ? 2 : 0;
            }
            constraintWidget.OoooOO0(i2, f, this.f4279OooO00o, this.f4280OooO0O0);
            return;
        }
        int i5 = this.f4279OooO00o;
        if (i5 > 0) {
            if (i5 < 0) {
                constraintWidget.f4398Oooooo0 = 0;
            } else {
                constraintWidget.f4398Oooooo0 = i5;
            }
        }
        int i6 = this.f4280OooO0O0;
        if (i6 < Integer.MAX_VALUE) {
            constraintWidget.f4370OooOooo[1] = i6;
        }
        Object obj7 = this.f4284OooO0o0;
        if (obj7 == obj3) {
            constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj7 == obj) {
            constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj7 == null) {
            constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.OoooO00(this.f4282OooO0Oo);
        }
    }

    public Dimension(Object obj) {
        this.f4279OooO00o = 0;
        this.f4280OooO0O0 = Integer.MAX_VALUE;
        this.f4281OooO0OO = 1.0f;
        this.f4282OooO0Oo = 0;
        this.f4283OooO0o = false;
        this.f4284OooO0o0 = obj;
    }
}
