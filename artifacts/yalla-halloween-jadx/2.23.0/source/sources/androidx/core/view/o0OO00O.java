package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ViewParent f5444OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewParent f5445OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final View f5446OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f5447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f5448OooO0o0;

    public o0OO00O(@NonNull View view) {
        this.f5446OooO0OO = view;
    }

    public final void OooO(boolean z) {
        if (this.f5447OooO0Oo) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO.OooOoO(this.f5446OooO0OO);
        }
        this.f5447OooO0Oo = z;
    }

    public final boolean OooO00o(float f, float f2, boolean z) {
        ViewParent viewParentOooO0oO;
        if (!this.f5447OooO0Oo || (viewParentOooO0oO = OooO0oO(0)) == null) {
            return false;
        }
        try {
            return o000O00.OooO00o(viewParentOooO0oO, this.f5446OooO0OO, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oO + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean OooO0O0(float f, float f2) {
        ViewParent viewParentOooO0oO;
        if (!this.f5447OooO0Oo || (viewParentOooO0oO = OooO0oO(0)) == null) {
            return false;
        }
        try {
            return o000O00.OooO0O0(viewParentOooO0oO, this.f5446OooO0OO, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oO + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public final boolean OooO0OO(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent viewParentOooO0oO;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f5447OooO0Oo || (viewParentOooO0oO = OooO0oO(i3)) == null) {
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
        View view = this.f5446OooO0OO;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f5448OooO0o0 == null) {
                this.f5448OooO0o0 = new int[2];
            }
            iArr3 = this.f5448OooO0o0;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f5446OooO0OO;
        if (viewParentOooO0oO instanceof oo0o0Oo) {
            ((oo0o0Oo) viewParentOooO0oO).onNestedPreScroll(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                o000O00.OooO0OO(viewParentOooO0oO, view2, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oO + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void OooO0Oo(int i, int i2, int i3, @Nullable int[] iArr) {
        OooO0o(0, i, 0, i2, null, i3, iArr);
    }

    public final boolean OooO0o(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        ViewParent viewParentOooO0oO;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f5447OooO0Oo || (viewParentOooO0oO = OooO0oO(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f5446OooO0OO;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f5448OooO0o0 == null) {
                this.f5448OooO0o0 = new int[2];
            }
            int[] iArr4 = this.f5448OooO0o0;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f5446OooO0OO;
        if (viewParentOooO0oO instanceof o0O0O00) {
            ((o0O0O00) viewParentOooO0oO).onNestedScroll(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentOooO0oO instanceof oo0o0Oo) {
                ((oo0o0Oo) viewParentOooO0oO).onNestedScroll(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    o000O00.OooO0Oo(viewParentOooO0oO, view2, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oO + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final boolean OooO0o0(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return OooO0o(i, i2, i3, i4, iArr, 0, null);
    }

    public final ViewParent OooO0oO(int i) {
        if (i == 0) {
            return this.f5444OooO00o;
        }
        if (i != 1) {
            return null;
        }
        return this.f5445OooO0O0;
    }

    public final boolean OooO0oo(int i) {
        return OooO0oO(i) != null;
    }

    public final boolean OooOO0(int i, int i2) {
        boolean zOooO0o;
        if (OooO0oo(i2)) {
            return true;
        }
        if (this.f5447OooO0Oo) {
            View view = this.f5446OooO0OO;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof oo0o0Oo;
                if (z) {
                    zOooO0o = ((oo0o0Oo) parent).onStartNestedScroll(view2, view, i, i2);
                } else if (i2 == 0) {
                    try {
                        zOooO0o = o000O00.OooO0o(parent, view2, view, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        zOooO0o = false;
                    }
                } else {
                    zOooO0o = false;
                }
                if (zOooO0o) {
                    if (i2 == 0) {
                        this.f5444OooO00o = parent;
                    } else if (i2 == 1) {
                        this.f5445OooO0O0 = parent;
                    }
                    if (z) {
                        ((oo0o0Oo) parent).onNestedScrollAccepted(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            o000O00.OooO0o0(parent, view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void OooOO0O(int i) {
        ViewParent viewParentOooO0oO = OooO0oO(i);
        if (viewParentOooO0oO != null) {
            boolean z = viewParentOooO0oO instanceof oo0o0Oo;
            View view = this.f5446OooO0OO;
            if (z) {
                ((oo0o0Oo) viewParentOooO0oO).onStopNestedScroll(view, i);
            } else if (i == 0) {
                try {
                    o000O00.OooO0oO(viewParentOooO0oO, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0oO + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f5444OooO00o = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f5445OooO0O0 = null;
            }
        }
    }
}
