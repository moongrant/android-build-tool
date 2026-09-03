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
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TypedValue f4992Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TypedValue f4993Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TypedValue f4994Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TypedValue f4995Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO00o f4996OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TypedValue f4997OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TypedValue f4998OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Rect f4999OoooO0O;

    public interface OooO00o {
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4998OoooO00 == null) {
            this.f4998OoooO00 = new TypedValue();
        }
        return this.f4998OoooO00;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4997OoooO0 == null) {
            this.f4997OoooO0 = new TypedValue();
        }
        return this.f4997OoooO0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4995Oooo0oo == null) {
            this.f4995Oooo0oo = new TypedValue();
        }
        return this.f4995Oooo0oo;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4992Oooo == null) {
            this.f4992Oooo = new TypedValue();
        }
        return this.f4992Oooo;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4993Oooo0o == null) {
            this.f4993Oooo0o = new TypedValue();
        }
        return this.f4993Oooo0o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4994Oooo0oO == null) {
            this.f4994Oooo0oO = new TypedValue();
        }
        return this.f4994Oooo0oO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO00o oooO00o = this.f4996OoooO;
        if (oooO00o != null) {
            Objects.requireNonNull(oooO00o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO00o oooO00o = this.f4996OoooO;
        if (oooO00o != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((androidx.appcompat.app.OooOOO) oooO00o).f4521OooO00o;
            oo000o oo000oVar = appCompatDelegateImpl.f4430OoooOOO;
            if (oo000oVar != null) {
                oo000oVar.OooO();
            }
            if (appCompatDelegateImpl.f4435Ooooo00 != null) {
                appCompatDelegateImpl.f4427OoooO00.getDecorView().removeCallbacks(appCompatDelegateImpl.f4436Ooooo0o);
                if (appCompatDelegateImpl.f4435Ooooo00.isShowing()) {
                    try {
                        appCompatDelegateImpl.f4435Ooooo00.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                appCompatDelegateImpl.f4435Ooooo00 = null;
            }
            appCompatDelegateImpl.Oooo00o();
            androidx.appcompat.view.menu.OooO0o oooO0o = appCompatDelegateImpl.Oooo0o(0).f4498OooO0oo;
            if (oooO0o != null) {
                oooO0o.OooO0Oo(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
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
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f4992Oooo : this.f4995Oooo0oo;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
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
                        Rect rect = this.f4999OoooO0O;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    Rect rect2 = this.f4999OoooO0O;
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f4998OoooO00 : this.f4997OoooO0;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
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
                        Rect rect3 = this.f4999OoooO0O;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    Rect rect4 = this.f4999OoooO0O;
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f4994Oooo0oO : this.f4993Oooo0o;
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
                        Rect rect5 = this.f4999OoooO0O;
                        i4 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    Rect rect6 = this.f4999OoooO0O;
                    i4 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(OooO00o oooO00o) {
        this.f4996OoooO = oooO00o;
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4999OoooO0O = new Rect();
    }
}
