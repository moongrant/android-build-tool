package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public final class Dimension {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f6840OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f6841OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f6842OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f6843OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f6844OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f6836OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f6837OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f6838OooO0oo = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Object f6835OooO = new Object();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f6839OooOO0 = new Object();

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public Dimension() {
        this.f6840OooO00o = 0;
        this.f6841OooO0O0 = Integer.MAX_VALUE;
        this.f6842OooO0OO = 0;
        this.f6843OooO0Oo = f6837OooO0oO;
        this.f6844OooO0o0 = false;
    }

    public static Dimension OooO00o() {
        Object obj = f6837OooO0oO;
        Dimension dimension = new Dimension(f6836OooO0o);
        dimension.f6843OooO0Oo = obj;
        if (obj instanceof Integer) {
            dimension.f6842OooO0OO = ((Integer) obj).intValue();
            dimension.f6843OooO0Oo = null;
        }
        return dimension;
    }

    public final void OooO0O0(ConstraintWidget constraintWidget, int i) {
        int i2 = 2;
        if (i == 0) {
            if (this.f6844OooO0o0) {
                constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f6843OooO0Oo;
                if (obj == f6837OooO0oO) {
                    i2 = 1;
                } else if (obj != f6839OooOO0) {
                    i2 = 0;
                }
                constraintWidget.OoooOOO(i2, this.f6840OooO00o, this.f6841OooO0O0, 1.0f);
                return;
            }
            int i3 = this.f6840OooO00o;
            if (i3 > 0) {
                constraintWidget.OoooOo0(i3);
            }
            int i4 = this.f6841OooO0O0;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.f6930OooOooo[0] = i4;
            }
            Object obj2 = this.f6843OooO0Oo;
            if (obj2 == f6837OooO0oO) {
                constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == f6835OooO) {
                constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.Ooooo00(this.f6842OooO0OO);
                    return;
                }
                return;
            }
        }
        if (this.f6844OooO0o0) {
            constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f6843OooO0Oo;
            if (obj3 == f6837OooO0oO) {
                i2 = 1;
            } else if (obj3 != f6839OooOO0) {
                i2 = 0;
            }
            constraintWidget.OoooOoo(i2, this.f6840OooO00o, this.f6841OooO0O0, 1.0f);
            return;
        }
        int i5 = this.f6840OooO00o;
        if (i5 > 0) {
            constraintWidget.OoooOOo(i5);
        }
        int i6 = this.f6841OooO0O0;
        if (i6 < Integer.MAX_VALUE) {
            constraintWidget.f6930OooOooo[1] = i6;
        }
        Object obj4 = this.f6843OooO0Oo;
        if (obj4 == f6837OooO0oO) {
            constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == f6835OooO) {
            constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.OoooOO0(this.f6842OooO0OO);
        }
    }

    public Dimension(Object obj) {
        this.f6840OooO00o = 0;
        this.f6841OooO0O0 = Integer.MAX_VALUE;
        this.f6842OooO0OO = 0;
        this.f6844OooO0o0 = false;
        this.f6843OooO0Oo = obj;
    }
}
