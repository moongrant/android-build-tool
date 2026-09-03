package o000O0O0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ViewParent f28123OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewParent f28124OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final View f28125OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f28126OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f28127OooO0o0;

    public o000oOoO(@NonNull View view) {
        this.f28125OooO0OO = view;
    }

    public final boolean OooO(int i) {
        return OooO0oo(i) != null;
    }

    public final boolean OooO00o(float f, float f2, boolean z) {
        ViewParent viewParentOooO0oo;
        if (!this.f28126OooO0Oo || (viewParentOooO0oo = OooO0oo(0)) == null) {
            return false;
        }
        try {
            return o00000.OooO00o(viewParentOooO0oo, this.f28125OooO0OO, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oo + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean OooO0O0(float f, float f2) {
        ViewParent viewParentOooO0oo;
        if (!this.f28126OooO0Oo || (viewParentOooO0oo = OooO0oo(0)) == null) {
            return false;
        }
        try {
            return o00000.OooO0O0(viewParentOooO0oo, this.f28125OooO0OO, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oo + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public final boolean OooO0OO(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return OooO0Oo(i, i2, iArr, iArr2, 0);
    }

    public final boolean OooO0Oo(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent viewParentOooO0oo;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f28126OooO0Oo || (viewParentOooO0oo = OooO0oo(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f28125OooO0OO.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f28127OooO0o0 == null) {
                this.f28127OooO0o0 = new int[2];
            }
            iArr3 = this.f28127OooO0o0;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f28125OooO0OO;
        if (viewParentOooO0oo instanceof o0OoOo0) {
            ((o0OoOo0) viewParentOooO0oo).OooOOOO(view, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                o00000.OooO0OO(viewParentOooO0oo, view, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oo + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            this.f28125OooO0OO.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean OooO0o(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return OooO0oO(i, i2, i3, i4, iArr, 0, null);
    }

    public final void OooO0o0(int i, int i2, int i3, @Nullable int[] iArr) {
        OooO0oO(0, i, 0, i2, null, i3, iArr);
    }

    public final boolean OooO0oO(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        ViewParent viewParentOooO0oo;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f28126OooO0Oo || (viewParentOooO0oo = OooO0oo(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f28125OooO0OO.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f28127OooO0o0 == null) {
                this.f28127OooO0o0 = new int[2];
            }
            int[] iArr4 = this.f28127OooO0o0;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f28125OooO0OO;
        if (viewParentOooO0oo instanceof o00O0O) {
            ((o00O0O) viewParentOooO0oo).OooOO0(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentOooO0oo instanceof o0OoOo0) {
                ((o0OoOo0) viewParentOooO0oo).OooOO0O(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    o00000.OooO0Oo(viewParentOooO0oo, view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oo + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            this.f28125OooO0OO.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent OooO0oo(int i) {
        if (i == 0) {
            return this.f28123OooO00o;
        }
        if (i != 1) {
            return null;
        }
        return this.f28124OooO0O0;
    }

    public final void OooOO0(boolean z) {
        if (this.f28126OooO0Oo) {
            View view = this.f28125OooO0OO;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO.OooOoO(view);
        }
        this.f28126OooO0Oo = z;
    }

    public final boolean OooOO0O(int i) {
        return OooOO0o(i, 0);
    }

    public final boolean OooOO0o(int i, int i2) {
        boolean zOooO0o;
        if (OooO(i2)) {
            return true;
        }
        if (this.f28126OooO0Oo) {
            View view = this.f28125OooO0OO;
            for (ViewParent parent = this.f28125OooO0OO.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f28125OooO0OO;
                boolean z = parent instanceof o0OoOo0;
                if (z) {
                    zOooO0o = ((o0OoOo0) parent).OooOO0o(view, view2, i, i2);
                } else if (i2 == 0) {
                    try {
                        zOooO0o = o00000.OooO0o(parent, view, view2, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        zOooO0o = false;
                    }
                } else {
                    zOooO0o = false;
                }
                if (zOooO0o) {
                    if (i2 == 0) {
                        this.f28123OooO00o = parent;
                    } else if (i2 == 1) {
                        this.f28124OooO0O0 = parent;
                    }
                    View view3 = this.f28125OooO0OO;
                    if (z) {
                        ((o0OoOo0) parent).OooOOO0(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            o00000.OooO0o0(parent, view, view3, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void OooOOO0(int i) {
        ViewParent viewParentOooO0oo = OooO0oo(i);
        if (viewParentOooO0oo != null) {
            View view = this.f28125OooO0OO;
            if (viewParentOooO0oo instanceof o0OoOo0) {
                ((o0OoOo0) viewParentOooO0oo).OooOOO(view, i);
            } else if (i == 0) {
                try {
                    o00000.OooO0oO(viewParentOooO0oo, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oo + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f28123OooO00o = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f28124OooO0O0 = null;
            }
        }
    }
}
