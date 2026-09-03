package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p061o0000o0.oo000o;
import p061o0000o0.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAnchor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public SolverVariable f6890OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f6892OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f6893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConstraintWidget f6894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ConstraintAnchor f6895OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Type f6896OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f6891OooO00o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f6897OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f6898OooO0oo = Integer.MIN_VALUE;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f6899OooO00o;

        static {
            int[] iArr = new int[Type.values().length];
            f6899OooO00o = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6899OooO00o[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6899OooO00o[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6899OooO00o[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6899OooO00o[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6899OooO00o[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6899OooO00o[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6899OooO00o[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6899OooO00o[Type.NONE.ordinal()] = 9;
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
        this.f6894OooO0Oo = constraintWidget;
        this.f6896OooO0o0 = type;
    }

    public final boolean OooO() {
        return this.f6895OooO0o != null;
    }

    public final boolean OooO00o(ConstraintAnchor constraintAnchor, int i) {
        return OooO0O0(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public final boolean OooO0O0(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            OooOO0O();
            return true;
        }
        if (!z && !OooOO0(constraintAnchor)) {
            return false;
        }
        this.f6895OooO0o = constraintAnchor;
        if (constraintAnchor.f6891OooO00o == null) {
            constraintAnchor.f6891OooO00o = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f6895OooO0o.f6891OooO00o;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f6897OooO0oO = i;
        this.f6898OooO0oo = i2;
        return true;
    }

    public final void OooO0OO(int i, ArrayList<oo0o0Oo> arrayList, oo0o0Oo oo0o0oo) {
        HashSet<ConstraintAnchor> hashSet = this.f6891OooO00o;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                oo000o.OooO00o(it.next().f6894OooO0Oo, i, arrayList, oo0o0oo);
            }
        }
    }

    public final int OooO0Oo() {
        if (this.f6893OooO0OO) {
            return this.f6892OooO0O0;
        }
        return 0;
    }

    public final ConstraintAnchor OooO0o() {
        switch (OooO00o.f6899OooO00o[this.f6896OooO0o0.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f6894OooO0Oo.f6940Oooo0oO;
            case 3:
                return this.f6894OooO0Oo.f6939Oooo0o0;
            case 4:
                return this.f6894OooO0Oo.f6941Oooo0oo;
            case 5:
                return this.f6894OooO0Oo.f6938Oooo0o;
            default:
                throw new AssertionError(this.f6896OooO0o0.name());
        }
    }

    public final int OooO0o0() {
        ConstraintAnchor constraintAnchor;
        if (this.f6894OooO0Oo.f6969o0OoOo0 == 8) {
            return 0;
        }
        int i = this.f6898OooO0oo;
        return (i == Integer.MIN_VALUE || (constraintAnchor = this.f6895OooO0o) == null || constraintAnchor.f6894OooO0Oo.f6969o0OoOo0 != 8) ? this.f6897OooO0oO : i;
    }

    public final boolean OooO0oO() {
        HashSet<ConstraintAnchor> hashSet = this.f6891OooO00o;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0o().OooO()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0oo() {
        HashSet<ConstraintAnchor> hashSet = this.f6891OooO00o;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean OooOO0(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.f6896OooO0o0;
        Type type2 = this.f6896OooO0o0;
        if (type == type2) {
            return type2 != Type.BASELINE || (constraintAnchor.f6894OooO0Oo.f6934Oooo00O && this.f6894OooO0Oo.f6934Oooo00O);
        }
        switch (OooO00o.f6899OooO00o[type2.ordinal()]) {
            case 1:
                return (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = type == Type.LEFT || type == Type.RIGHT;
                if (constraintAnchor.f6894OooO0Oo instanceof OooOO0) {
                    return z || type == Type.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = type == Type.TOP || type == Type.BOTTOM;
                if (constraintAnchor.f6894OooO0Oo instanceof OooOO0) {
                    return z2 || type == Type.CENTER_Y;
                }
                return z2;
            case 6:
                return (type == Type.LEFT || type == Type.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f6896OooO0o0.name());
        }
    }

    public final void OooOO0O() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f6895OooO0o;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f6891OooO00o) != null) {
            hashSet.remove(this);
            if (this.f6895OooO0o.f6891OooO00o.size() == 0) {
                this.f6895OooO0o.f6891OooO00o = null;
            }
        }
        this.f6891OooO00o = null;
        this.f6895OooO0o = null;
        this.f6897OooO0oO = 0;
        this.f6898OooO0oo = Integer.MIN_VALUE;
        this.f6893OooO0OO = false;
        this.f6892OooO0O0 = 0;
    }

    public final void OooOO0o() {
        SolverVariable solverVariable = this.f6890OooO;
        if (solverVariable == null) {
            this.f6890OooO = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.OooO0Oo();
        }
    }

    public final void OooOOO(int i) {
        if (OooO()) {
            this.f6898OooO0oo = i;
        }
    }

    public final void OooOOO0(int i) {
        this.f6892OooO0O0 = i;
        this.f6893OooO0OO = true;
    }

    public final String toString() {
        return this.f6894OooO0Oo.f6962o00O0O + CertificateUtil.DELIMITER + this.f6896OooO0o0.toString();
    }
}
