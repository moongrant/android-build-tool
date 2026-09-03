package p633o0ooO0Oo;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import java.util.ArrayList;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import p636o0ooO0oO.o0O00oO0;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OoO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f57690OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseBooleanArray f57691OooO00o = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<Float> f57692OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f57693OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57694OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f57695OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f57696OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57697OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f57698OooO0oo;

    public interface OooO00o {
    }

    public final void OooO00o(int i) {
        OooO00o oooO00o = this.f57690OooO;
        if (oooO00o != null) {
            int i2 = this.f57693OooO0OO;
            LinearLayout linearLayout = ((CommonNavigator) oooO00o).f33112OooO0o0;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof o0O00oO0) {
                    ((o0O00oO0) childAt).OooO00o(i, i2);
                }
            }
        }
        this.f57691OooO00o.put(i, true);
    }

    public final void OooO0O0(int i, float f, boolean z, boolean z2) {
        if (this.f57698OooO0oo || i == this.f57694OooO0Oo || this.f57697OooO0oO == 1 || z2) {
            OooO00o oooO00o = this.f57690OooO;
            if (oooO00o != null) {
                int i2 = this.f57693OooO0OO;
                LinearLayout linearLayout = ((CommonNavigator) oooO00o).f33112OooO0o0;
                if (linearLayout != null) {
                    KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof o0O00oO0) {
                        ((o0O00oO0) childAt).OooO0O0(i, i2, f, z);
                    }
                }
            }
            this.f57692OooO0O0.put(i, Float.valueOf(1.0f - f));
        }
    }

    public final void OooO0OO(int i, float f, boolean z, boolean z2) {
        boolean z3 = this.f57698OooO0oo;
        SparseArray<Float> sparseArray = this.f57692OooO0O0;
        if (!z3 && i != this.f57696OooO0o0 && this.f57697OooO0oO != 1) {
            int i2 = this.f57694OooO0Oo;
            if (((i != i2 - 1 && i != i2 + 1) || sparseArray.get(i, Float.valueOf(0.0f)).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        OooO00o oooO00o = this.f57690OooO;
        if (oooO00o != null) {
            int i3 = this.f57693OooO0OO;
            LinearLayout linearLayout = ((CommonNavigator) oooO00o).f33112OooO0o0;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof o0O00oO0) {
                    ((o0O00oO0) childAt).OooO0Oo(i, i3, f, z);
                }
            }
        }
        sparseArray.put(i, Float.valueOf(f));
    }

    public final void OooO0Oo(int i) {
        OooO00o oooO00o = this.f57690OooO;
        if (oooO00o != null) {
            int i2 = this.f57693OooO0OO;
            CommonNavigator commonNavigator = (CommonNavigator) oooO00o;
            LinearLayout linearLayout = commonNavigator.f33112OooO0o0;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof o0O00oO0) {
                    ((o0O00oO0) childAt).OooO0OO(i, i2);
                }
                if (!commonNavigator.f33115OooOO0 && !commonNavigator.f33118OooOOO && commonNavigator.f33110OooO0Oo != null) {
                    ArrayList arrayList = commonNavigator.f33124OooOOoo;
                    if (arrayList.size() > 0) {
                        o0O0O0O o0o0o0o = (o0O0O0O) arrayList.get(Math.min(arrayList.size() - 1, i));
                        if (commonNavigator.f33116OooOO0O) {
                            int i3 = o0o0o0o.f57700OooO00o;
                            float fOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(o0o0o0o.f57702OooO0OO, i3, 2, i3) - (commonNavigator.f33110OooO0Oo.getWidth() * commonNavigator.f33117OooOO0o);
                            if (commonNavigator.f33119OooOOO0) {
                                commonNavigator.f33110OooO0Oo.smoothScrollTo((int) fOooO00o, 0);
                            } else {
                                commonNavigator.f33110OooO0Oo.scrollTo((int) fOooO00o, 0);
                            }
                        } else {
                            int scrollX = commonNavigator.f33110OooO0Oo.getScrollX();
                            int i4 = o0o0o0o.f57700OooO00o;
                            if (scrollX <= i4) {
                                int width = commonNavigator.getWidth() + commonNavigator.f33110OooO0Oo.getScrollX();
                                int i5 = o0o0o0o.f57702OooO0OO;
                                if (width < i5) {
                                    if (commonNavigator.f33119OooOOO0) {
                                        commonNavigator.f33110OooO0Oo.smoothScrollTo(i5 - commonNavigator.getWidth(), 0);
                                    } else {
                                        commonNavigator.f33110OooO0Oo.scrollTo(i5 - commonNavigator.getWidth(), 0);
                                    }
                                }
                            } else if (commonNavigator.f33119OooOOO0) {
                                commonNavigator.f33110OooO0Oo.smoothScrollTo(i4, 0);
                            } else {
                                commonNavigator.f33110OooO0Oo.scrollTo(i4, 0);
                            }
                        }
                    }
                }
            }
        }
        this.f57691OooO00o.put(i, false);
    }
}
