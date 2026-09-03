package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o0O0O00.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAnchor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public SolverVariable f4330OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f4332OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f4333OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConstraintWidget f4334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ConstraintAnchor f4335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Type f4336OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f4331OooO00o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f4337OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f4338OooO0oo = Integer.MIN_VALUE;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4339OooO00o;

        static {
            int[] iArr = new int[Type.values().length];
            f4339OooO00o = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4339OooO00o[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4339OooO00o[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4339OooO00o[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4339OooO00o[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4339OooO00o[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4339OooO00o[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4339OooO00o[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4339OooO00o[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f4334OooO0Oo = constraintWidget;
        this.f4336OooO0o0 = type;
    }

    public final boolean OooO(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = this.f4336OooO0o0;
        ConstraintWidget constraintWidget = constraintAnchor.f4334OooO0Oo;
        Type type2 = constraintAnchor.f4336OooO0o0;
        if (type2 == type) {
            return type != Type.BASELINE || (constraintWidget.f4374Oooo00O && this.f4334OooO0Oo.f4374Oooo00O);
        }
        switch (OooO00o.f4339OooO00o[type.ordinal()]) {
            case 1:
                return (type2 == Type.BASELINE || type2 == Type.CENTER_X || type2 == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = type2 == Type.LEFT || type2 == Type.RIGHT;
                if (constraintWidget instanceof OooOO0) {
                    return z || type2 == Type.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = type2 == Type.TOP || type2 == Type.BOTTOM;
                if (constraintWidget instanceof OooOO0) {
                    return z2 || type2 == Type.CENTER_Y;
                }
                return z2;
            case 6:
                return (type2 == Type.LEFT || type2 == Type.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final void OooO00o(ConstraintAnchor constraintAnchor, int i) {
        OooO0O0(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public final boolean OooO0O0(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            OooOO0();
            return true;
        }
        if (!z && !OooO(constraintAnchor)) {
            return false;
        }
        this.f4335OooO0o = constraintAnchor;
        if (constraintAnchor.f4331OooO00o == null) {
            constraintAnchor.f4331OooO00o = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f4335OooO0o.f4331OooO00o;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4337OooO0oO = i;
        this.f4338OooO0oo = i2;
        return true;
    }

    public final void OooO0OO(int i, o000oOoO o000oooo2, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f4331OooO00o;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                o0O0O00.OooOOO.OooO00o(it.next().f4334OooO0Oo, i, arrayList, o000oooo2);
            }
        }
    }

    public final int OooO0Oo() {
        if (this.f4333OooO0OO) {
            return this.f4332OooO0O0;
        }
        return 0;
    }

    public final ConstraintAnchor OooO0o() {
        int[] iArr = OooO00o.f4339OooO00o;
        Type type = this.f4336OooO0o0;
        int i = iArr[type.ordinal()];
        ConstraintWidget constraintWidget = this.f4334OooO0Oo;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return constraintWidget.f4380Oooo0oO;
            case 3:
                return constraintWidget.f4379Oooo0o0;
            case 4:
                return constraintWidget.f4381Oooo0oo;
            case 5:
                return constraintWidget.f4378Oooo0o;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final int OooO0o0() {
        ConstraintAnchor constraintAnchor;
        if (this.f4334OooO0Oo.f4409o0OoOo0 == 8) {
            return 0;
        }
        int i = this.f4338OooO0oo;
        return (i == Integer.MIN_VALUE || (constraintAnchor = this.f4335OooO0o) == null || constraintAnchor.f4334OooO0Oo.f4409o0OoOo0 != 8) ? this.f4337OooO0oO : i;
    }

    public final boolean OooO0oO() {
        HashSet<ConstraintAnchor> hashSet = this.f4331OooO00o;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0o().OooO0oo()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0oo() {
        return this.f4335OooO0o != null;
    }

    public final void OooOO0() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f4335OooO0o;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f4331OooO00o) != null) {
            hashSet.remove(this);
            if (this.f4335OooO0o.f4331OooO00o.size() == 0) {
                this.f4335OooO0o.f4331OooO00o = null;
            }
        }
        this.f4331OooO00o = null;
        this.f4335OooO0o = null;
        this.f4337OooO0oO = 0;
        this.f4338OooO0oo = Integer.MIN_VALUE;
        this.f4333OooO0OO = false;
        this.f4332OooO0O0 = 0;
    }

    public final void OooOO0O() {
        SolverVariable solverVariable = this.f4330OooO;
        if (solverVariable == null) {
            this.f4330OooO = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.OooO0OO();
        }
    }

    public final void OooOO0o(int i) {
        this.f4332OooO0O0 = i;
        this.f4333OooO0OO = true;
    }

    public final String toString() {
        return this.f4334OooO0Oo.f4402o00O0O + CertificateUtil.DELIMITER + this.f4336OooO0o0.toString();
    }
}
