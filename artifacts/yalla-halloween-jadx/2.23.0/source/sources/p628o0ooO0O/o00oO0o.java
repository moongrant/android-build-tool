package p628o0ooO0O;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import java.util.ArrayList;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import p631o0ooO0Oo.o00O000o;
import p633o0ooO0o0.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f57115OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseBooleanArray f57116OooO00o = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<Float> f57117OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f57118OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57119OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f57120OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f57121OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57122OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f57123OooO0oo;

    public interface OooO00o {
    }

    public final void OooO00o(int i) {
        OooO00o oooO00o = this.f57115OooO;
        if (oooO00o != null) {
            int i2 = this.f57118OooO0OO;
            LinearLayout linearLayout = ((CommonNavigator) oooO00o).f33645OooO0o0;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof o00O000o) {
                    ((o00O000o) childAt).OooO00o(i, i2);
                }
            }
        }
        this.f57116OooO00o.put(i, true);
    }

    public final void OooO0O0(int i, float f, boolean z, boolean z2) {
        if (this.f57123OooO0oo || i == this.f57119OooO0Oo || this.f57122OooO0oO == 1 || z2) {
            OooO00o oooO00o = this.f57115OooO;
            if (oooO00o != null) {
                int i2 = this.f57118OooO0OO;
                LinearLayout linearLayout = ((CommonNavigator) oooO00o).f33645OooO0o0;
                if (linearLayout != null) {
                    KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof o00O000o) {
                        ((o00O000o) childAt).OooO0O0(i, i2, f, z);
                    }
                }
            }
            this.f57117OooO0O0.put(i, Float.valueOf(1.0f - f));
        }
    }

    public final void OooO0OO(int i, float f, boolean z, boolean z2) {
        boolean z3 = this.f57123OooO0oo;
        SparseArray<Float> sparseArray = this.f57117OooO0O0;
        if (!z3 && i != this.f57121OooO0o0 && this.f57122OooO0oO != 1) {
            int i2 = this.f57119OooO0Oo;
            if (((i != i2 - 1 && i != i2 + 1) || sparseArray.get(i, Float.valueOf(0.0f)).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        OooO00o oooO00o = this.f57115OooO;
        if (oooO00o != null) {
            int i3 = this.f57118OooO0OO;
            LinearLayout linearLayout = ((CommonNavigator) oooO00o).f33645OooO0o0;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof o00O000o) {
                    ((o00O000o) childAt).OooO0Oo(i, i3, f, z);
                }
            }
        }
        sparseArray.put(i, Float.valueOf(f));
    }

    public final void OooO0Oo(int i) {
        OooO00o oooO00o = this.f57115OooO;
        if (oooO00o != null) {
            int i2 = this.f57118OooO0OO;
            CommonNavigator commonNavigator = (CommonNavigator) oooO00o;
            LinearLayout linearLayout = commonNavigator.f33645OooO0o0;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof o00O000o) {
                    ((o00O000o) childAt).OooO0OO(i, i2);
                }
                if (!commonNavigator.f33648OooOO0 && !commonNavigator.f33651OooOOO && commonNavigator.f33643OooO0Oo != null) {
                    ArrayList arrayList = commonNavigator.f33657OooOOoo;
                    if (arrayList.size() > 0) {
                        o0000O00 o0000o00 = (o0000O00) arrayList.get(Math.min(arrayList.size() - 1, i));
                        if (commonNavigator.f33649OooOO0O) {
                            int i3 = o0000o00.f57126OooO00o;
                            float fOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(o0000o00.f57128OooO0OO, i3, 2, i3) - (commonNavigator.f33643OooO0Oo.getWidth() * commonNavigator.f33650OooOO0o);
                            if (commonNavigator.f33652OooOOO0) {
                                commonNavigator.f33643OooO0Oo.smoothScrollTo((int) fOooO00o, 0);
                            } else {
                                commonNavigator.f33643OooO0Oo.scrollTo((int) fOooO00o, 0);
                            }
                        } else {
                            int scrollX = commonNavigator.f33643OooO0Oo.getScrollX();
                            int i4 = o0000o00.f57126OooO00o;
                            if (scrollX <= i4) {
                                int width = commonNavigator.getWidth() + commonNavigator.f33643OooO0Oo.getScrollX();
                                int i5 = o0000o00.f57128OooO0OO;
                                if (width < i5) {
                                    if (commonNavigator.f33652OooOOO0) {
                                        commonNavigator.f33643OooO0Oo.smoothScrollTo(i5 - commonNavigator.getWidth(), 0);
                                    } else {
                                        commonNavigator.f33643OooO0Oo.scrollTo(i5 - commonNavigator.getWidth(), 0);
                                    }
                                }
                            } else if (commonNavigator.f33652OooOOO0) {
                                commonNavigator.f33643OooO0Oo.smoothScrollTo(i4, 0);
                            } else {
                                commonNavigator.f33643OooO0Oo.scrollTo(i4, 0);
                            }
                        }
                    }
                }
            }
        }
        this.f57116OooO00o.put(i, false);
    }
}
