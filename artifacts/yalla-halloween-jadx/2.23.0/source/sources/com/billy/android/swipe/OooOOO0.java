package com.billy.android.swipe;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import com.android.billingclient.api.o0000O0;
import com.billy.android.swipe.internal.ScrimView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f9797OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SmartSwipeWrapper f9798OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f9799OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f9800OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f9801OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f9802OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f9803OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f9804OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f9805OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f9806OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f9807OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o00O0o0.OooO00o f9808OooOO0o;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f9813OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public o0000O0 f9815OooOOoo;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f9810OooOOO0 = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f9809OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final float f9811OooOOOO = 1.0f;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f9812OooOOOo = 1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final CopyOnWriteArrayList f9814OooOOo0 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f9816OooOo00 = 255;

    /* JADX WARN: Code duplicated, block: B:72:0x00e7 A[EDGE_INSN: B:72:0x00e7->B:73:0x00e8 BREAK  A[LOOP:1: B:34:0x007a->B:98:0x007a]] */
    public static boolean OooO0O0(ViewGroup viewGroup, int i, int i2, float f, float f2, float f3, float f4) {
        View childAt;
        OooOOO0 oooOOO0;
        int i3 = (int) f;
        int i4 = (int) f2;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom() && childAt.getVisibility() == 0 && (!(childAt instanceof ScrimView) || childAt.isFocusable() || childAt.isClickable())) {
                break;
            }
            childCount--;
        }
        View view = childAt;
        boolean z = true;
        boolean zCanScrollHorizontally = false;
        if (view instanceof SmartSwipeWrapper) {
            SmartSwipeWrapper smartSwipeWrapper = (SmartSwipeWrapper) view;
            o00O0o0.OooO00o oooO00o = smartSwipeWrapper.mHelper;
            if (oooO00o != null && (oooOOO0 = oooO00o.f36685OooOOO) != null) {
                if (oooOOO0.OooO00o(i2, f, f2, f3, f4) == 0 || oooOOO0.f9807OooOO0O >= 1.0f) {
                    z = false;
                    break;
                }
            } else {
                Iterator<OooOOO0> it = smartSwipeWrapper.getAllConsumers().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    OooOOO0 next = it.next();
                    if (next != null && next.OooO00o(i2, f, f2, f3, f4) != 0) {
                        break;
                    }
                }
            }
            zCanScrollHorizontally = z;
        } else if (view != null) {
            if (i == 1 || i == 2) {
                if (view instanceof AbsSeekBar) {
                    AbsSeekBar absSeekBar = (AbsSeekBar) view;
                    int progress = absSeekBar.getProgress();
                    int min = Build.VERSION.SDK_INT >= 26 ? absSeekBar.getMin() : 0;
                    int max = absSeekBar.getMax();
                    if ((f3 <= 0.0f || progress >= max) && (f3 >= 0.0f || progress <= min)) {
                        z = false;
                        break;
                    }
                    zCanScrollHorizontally = z;
                } else {
                    zCanScrollHorizontally = view.canScrollHorizontally(f3 <= 0.0f ? 1 : -1);
                }
            } else if (i == 4 || i == 8) {
                int i5 = f4 <= 0.0f ? 1 : -1;
                zCanScrollHorizontally = view instanceof AbsListView ? ((AbsListView) view).canScrollList(i5) : view.canScrollVertically(i5);
            }
        }
        return (zCanScrollHorizontally || !(view instanceof ViewGroup)) ? zCanScrollHorizontally : OooO0O0((ViewGroup) view, i, i2, f - view.getLeft(), f2 - view.getTop(), f3, f4);
    }

    public final boolean OooO(int i, int i2) {
        int i3 = this.f9816OooOo00;
        if (i == -2) {
            if (!((i3 & i2) == i2)) {
                return true;
            }
        }
        if (i == -3) {
            if (!(((i3 >> 4) & i2) == i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0070  */
    /* JADX WARN: Code duplicated, block: B:50:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x007b  */
    /* JADX WARN: Code duplicated, block: B:53:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0080 A[PHI: r2
      0x0080: PHI (r2v5 int) = (r2v2 int), (r2v3 int), (r2v11 int) binds: [B:54:0x007e, B:47:0x006e, B:38:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    public final int OooO00o(int i, float f, float f2, float f3, float f4) {
        int i2;
        ?? r1;
        int i3;
        int i4;
        int i5 = this.f9799OooO0O0;
        int i6 = this.f9816OooOo00;
        if (i5 == 0 && ((i == -2 && (i6 & 15) == 0) || (i == -3 && ((i6 >> 4) & 15) == 0))) {
            return 0;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        if (this.f9803OooO0o0 != 0 || this.f9802OooO0o != 0) {
            if (f3 == 0.0f && f4 == 0.0f) {
                return 0;
            }
            int i7 = this.f9799OooO0O0;
            if (((i7 & 3) <= 0 || fAbs <= fAbs2) && ((i7 & 12) <= 0 || fAbs >= fAbs2)) {
                return 0;
            }
            if ((i7 != 0 && (this.f9809OooOOO & i7) == i7) || OooO(i, i7) || OooO0O0(this.f9798OooO00o, this.f9799OooO0O0, i, f, f2, f3, f4)) {
                return 0;
            }
            return this.f9799OooO0O0;
        }
        if (fAbs == 0.0f && fAbs2 == 0.0f) {
            i3 = 0;
            i4 = 0;
        } else if (fAbs > fAbs2) {
            if (f3 > 0.0f) {
                if (((this.f9810OooOOO0 & 1) != 0) != false) {
                    i3 = 1;
                }
                i4 = i3;
                if (i3 != 0) {
                    i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
                }
            }
            if (f3 < 0.0f) {
                i2 = 2;
                if (((this.f9810OooOOO0 & 2) != 0) != false) {
                    i4 = i2;
                    i3 = 1;
                }
                if (i3 != 0) {
                    i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
                }
            }
            i3 = 0;
            i4 = i3;
            if (i3 != 0) {
                i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
            }
        } else if (f4 <= 0.0f) {
            if (f4 < 0.0f) {
                i2 = 8;
                if ((this.f9810OooOOO0 & 8) != 0) {
                    r1 = true;
                } else {
                    r1 = false;
                }
                if (r1 != false) {
                    i4 = i2;
                    i3 = 1;
                }
                if (i3 != 0) {
                    i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
                }
            }
            i3 = 0;
            i4 = i3;
            if (i3 != 0) {
                i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
            }
        } else {
            if (((this.f9810OooOOO0 & 4) != 0) == true) {
                i2 = 4;
            } else {
                if (f4 < 0.0f) {
                    i2 = 8;
                    if ((this.f9810OooOOO0 & 8) != 0) {
                        r1 = true;
                    } else {
                        r1 = false;
                    }
                    if (r1 != false) {
                    }
                    if (i3 != 0) {
                        i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
                    }
                }
                i3 = 0;
                i4 = i3;
                if (i3 != 0) {
                    i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
                }
            }
            i4 = i2;
            i3 = 1;
            if (i3 != 0) {
                i3 = !OooO0O0(this.f9798OooO00o, i4, i, f, f2, f3, f4) ? 1 : 0;
            }
        }
        if (i3 == 0) {
            return 0;
        }
        if (i == -3) {
            if ((((i6 >> 4) & i4) == i4) != false) {
                return i4;
            }
        }
        if ((i4 != 0 && (this.f9809OooOOO & i4) == i4) || OooO(i, i4)) {
            return 0;
        }
        return i4;
    }

    public final int OooO0OO(int i) {
        int i2 = this.f9800OooO0OO;
        if (i2 != 0) {
            i += i2;
            this.f9800OooO0OO = 0;
        }
        int i3 = this.f9799OooO0O0;
        if ((i3 & 1) > 0) {
            if ((this.f9810OooOOO0 & 1) != 0) {
                int i4 = this.f9805OooO0oo;
                OooO.OooO00o oooO00o = OooO.f9795OooO00o;
                return Math.max(0, Math.min(i, i4));
            }
        }
        if ((i3 & 2) > 0) {
            if ((this.f9810OooOOO0 & 2) != 0) {
                int i5 = -this.f9805OooO0oo;
                OooO.OooO00o oooO00o2 = OooO.f9795OooO00o;
                return Math.max(i5, Math.min(i, 0));
            }
        }
        return 0;
    }

    public final int OooO0Oo(int i) {
        int i2 = this.f9801OooO0Oo;
        if (i2 != 0) {
            i += i2;
            this.f9801OooO0Oo = 0;
        }
        int i3 = this.f9799OooO0O0;
        if ((i3 & 4) > 0) {
            if ((this.f9810OooOOO0 & 4) != 0) {
                int i4 = this.f9805OooO0oo;
                OooO.OooO00o oooO00o = OooO.f9795OooO00o;
                return Math.max(0, Math.min(i, i4));
            }
        }
        if ((i3 & 8) > 0) {
            if ((this.f9810OooOOO0 & 8) != 0) {
                int i5 = -this.f9805OooO0oo;
                OooO.OooO00o oooO00o2 = OooO.f9795OooO00o;
                return Math.max(i5, Math.min(i, 0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    /* JADX WARN: Code duplicated, block: B:20:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x002b  */
    /* JADX WARN: Code duplicated, block: B:23:0x002e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0035  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        if (((r4.f9809OooOOO & 2) != 0) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0o(float f) {
        boolean z;
        if (this.f9803OooO0o0 == 0) {
            if (f <= 0.0f) {
                if (f < 0.0f) {
                    if ((this.f9810OooOOO0 & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                return 0;
            }
            if (!((this.f9810OooOOO0 & 1) != 0)) {
                if (f < 0.0f) {
                    if ((this.f9810OooOOO0 & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                return 0;
            }
            if ((this.f9809OooOOO & 1) != 0) {
                if (f < 0.0f) {
                    if ((this.f9810OooOOO0 & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                return 0;
            }
        }
        return OooO0oO();
    }

    public final void OooO0o0() {
        if (this.f9799OooO0O0 == 0 || this.f9807OooOO0O == 0.0f) {
            return;
        }
        OooOOO0();
        this.f9800OooO0OO = 0;
        this.f9801OooO0Oo = 0;
        int i = this.f9799OooO0O0;
        if (!(i != 0 && (this.f9809OooOOO & i) == i)) {
            this.f9809OooOOO = i | this.f9809OooOOO;
            OooOO0O oooOO0O = new OooOO0O(this);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9814OooOOo0;
            if (!copyOnWriteArrayList.contains(oooOO0O)) {
                copyOnWriteArrayList.add(oooOO0O);
            }
        }
        o00O0o0.OooO00o oooO00o = this.f9808OooOO0o;
        if (oooO00o == null || this.f9798OooO00o == null) {
            return;
        }
        oooO00o.f36688OooOOOo = 0;
        oooO00o.f36689OooOOo0 = 0;
        oooO00o.OooOOOo(0, 0);
        this.f9798OooO00o.postInvalidateOnAnimation();
    }

    public final int OooO0oO() {
        o0000O0 o0000o1 = this.f9815OooOOoo;
        if (o0000o1 == null) {
            return this.f9813OooOOo;
        }
        float f = this.f9813OooOOo;
        o0000o1.getClass();
        return (int) (f / 0.5f);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:26:0x0037  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (((r4.f9809OooOOO & 8) != 0) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0oo(float f) {
        boolean z;
        if (this.f9802OooO0o == 0) {
            if (f <= 0.0f) {
                if (f < 0.0f) {
                    if ((this.f9810OooOOO0 & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                return 0;
            }
            if (!((this.f9810OooOOO0 & 4) != 0)) {
                if (f < 0.0f) {
                    if ((this.f9810OooOOO0 & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                return 0;
            }
            if ((this.f9809OooOOO & 4) != 0) {
                if (f < 0.0f) {
                    if ((this.f9810OooOOO0 & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                return 0;
            }
        }
        return OooO0oO();
    }

    public void OooOO0() {
        for (p122o00O0o0O.OooO0OO oooO0OO : this.f9814OooOOo0) {
            if (oooO0OO != null) {
                oooO0OO.OooO0Oo();
            }
        }
        this.f9799OooO0O0 = 0;
        this.f9807OooOO0O = 0.0f;
        this.f9797OooO = 0;
        this.f9803OooO0o0 = 0;
        this.f9800OooO0OO = 0;
        this.f9806OooOO0 = 0;
        this.f9802OooO0o = 0;
        this.f9801OooO0Oo = 0;
    }

    public abstract void OooOO0O(int i, int i2);

    public final void OooOO0o() {
        for (p122o00O0o0O.OooO0OO oooO0OO : this.f9814OooOOo0) {
            if (oooO0OO != null) {
                oooO0OO.OooO0O0();
            }
        }
    }

    public final void OooOOO(int i, int i2, int i3, int i4) {
        if (this.f9813OooOOo <= 0) {
            return;
        }
        float f = this.f9807OooOO0O;
        if (i != this.f9803OooO0o0 || i2 != this.f9802OooO0o) {
            this.f9803OooO0o0 = i;
            this.f9802OooO0o = i2;
            int i5 = this.f9804OooO0oO;
            if (i5 <= 0) {
                this.f9807OooOO0O = 0.0f;
            } else {
                int i6 = this.f9799OooO0O0;
                if (i6 == 1 || i6 == 2) {
                    this.f9807OooOO0O = Math.abs(i / i5);
                } else if (i6 == 4 || i6 == 8) {
                    this.f9807OooOO0O = Math.abs(i2 / i5);
                }
            }
            int i7 = this.f9799OooO0O0;
            if ((i7 & 3) > 0) {
                if (this.f9815OooOOoo != null) {
                    i = (int) (i * 0.5f);
                }
                this.f9797OooO = i;
            } else if ((i7 & 12) > 0) {
                if (this.f9815OooOOoo != null) {
                    i2 = (int) (i2 * 0.5f);
                }
                this.f9806OooOO0 = i2;
            }
            OooOO0O(this.f9797OooO, this.f9806OooOO0);
        }
        if (this.f9807OooOO0O != f) {
            int i8 = this.f9808OooOO0o.f36675OooO0O0;
            for (p122o00O0o0O.OooO0OO oooO0OO : this.f9814OooOOo0) {
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(this.f9798OooO00o, this.f9807OooOO0O);
                }
            }
        }
    }

    public final void OooOOO0() {
        ViewParent parent = this.f9798OooO00o.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        int i = this.f9803OooO0o0;
        if (i != 0 || this.f9802OooO0o != 0) {
            this.f9800OooO0OO = i;
            this.f9801OooO0Oo = this.f9802OooO0o;
        }
        int iOooO0oO = OooO0oO();
        this.f9804OooO0oO = iOooO0oO;
        this.f9805OooO0oo = iOooO0oO;
        for (p122o00O0o0O.OooO0OO oooO0OO : this.f9814OooOOo0) {
            if (oooO0OO != null) {
                oooO0OO.OooO0oO();
            }
        }
    }

    public final void OooOOOO(float f) {
        OooO.OooO00o oooO00o = OooO.f9795OooO00o;
        int iMax = (int) (this.f9804OooO0oO * Math.max(0.0f, Math.min(f, 1.0f)));
        int i = this.f9799OooO0O0;
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                iMax = -iMax;
            } else if (i == 4) {
                i2 = iMax;
                iMax = 0;
            } else if (i != 8) {
                iMax = 0;
            } else {
                iMax = -iMax;
                i2 = iMax;
                iMax = 0;
            }
        }
        o00O0o0.OooO00o oooO00o2 = this.f9808OooOO0o;
        if (oooO00o2 == null || this.f9798OooO00o == null) {
            return;
        }
        oooO00o2.OooOOOo(iMax, i2);
        this.f9798OooO00o.postInvalidateOnAnimation();
    }
}
