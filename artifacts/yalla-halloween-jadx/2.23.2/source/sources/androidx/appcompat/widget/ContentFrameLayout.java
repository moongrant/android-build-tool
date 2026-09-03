package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegateImpl;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TypedValue f2884OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TypedValue f2885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TypedValue f2886OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TypedValue f2887OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TypedValue f2888OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TypedValue f2889OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Rect f2890OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO00o f2891OooOO0O;

    public interface OooO00o {
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2889OooO0oo == null) {
            this.f2889OooO0oo = new TypedValue();
        }
        return this.f2889OooO0oo;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2884OooO == null) {
            this.f2884OooO = new TypedValue();
        }
        return this.f2884OooO;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2886OooO0o == null) {
            this.f2886OooO0o = new TypedValue();
        }
        return this.f2886OooO0o;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2888OooO0oO == null) {
            this.f2888OooO0oO = new TypedValue();
        }
        return this.f2888OooO0oO;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2885OooO0Oo == null) {
            this.f2885OooO0Oo = new TypedValue();
        }
        return this.f2885OooO0Oo;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2887OooO0o0 == null) {
            this.f2887OooO0o0 = new TypedValue();
        }
        return this.f2887OooO0o0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO00o oooO00o = this.f2891OooOO0O;
        if (oooO00o != null) {
            oooO00o.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO00o oooO00o = this.f2891OooOO0O;
        if (oooO00o != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((androidx.appcompat.app.OooOOO0) oooO00o).f2401OooO00o;
            o0OOO0o o0ooo0o2 = appCompatDelegateImpl.f2307OooOo0;
            if (o0ooo0o2 != null) {
                o0ooo0o2.OooO();
            }
            if (appCompatDelegateImpl.f2311OooOoO != null) {
                appCompatDelegateImpl.f2301OooOOOO.getDecorView().removeCallbacks(appCompatDelegateImpl.f2313OooOoOO);
                if (appCompatDelegateImpl.f2311OooOoO.isShowing()) {
                    try {
                        appCompatDelegateImpl.f2311OooOoO.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                appCompatDelegateImpl.f2311OooOoO = null;
            }
            androidx.core.view.o000OOo0 o000ooo1 = appCompatDelegateImpl.f2315OooOoo0;
            if (o000ooo1 != null) {
                o000ooo1.OooO0O0();
            }
            androidx.appcompat.view.menu.OooO oooO = appCompatDelegateImpl.Oooo(0).f2377OooO0oo;
            if (oooO != null) {
                oooO.OooO0OO(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f2890OooOO0;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f2888OooO0oO : this.f2886OooO0o;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), Pow2.MAX_POW2);
                        z = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), Pow2.MAX_POW2);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.f2889OooO0oo : this.f2884OooO;
            if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), Pow2.MAX_POW2);
                    } else {
                        iMakeMeasureSpec2 = i2;
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), Pow2.MAX_POW2);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Pow2.MAX_POW2);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f2887OooO0o0 : this.f2885OooO0Oo;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, Pow2.MAX_POW2);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, Pow2.MAX_POW2);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(OooO00o oooO00o) {
        this.f2891OooOO0O = oooO00o;
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2890OooOO0 = new Rect();
    }
}
