package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.o0ooOOo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.jctools.util.Pow2;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final int f16251Ooooo0o = o0000O0O.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f16252OooooO0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public Integer f16253OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f16254OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f16255OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ImageView.ScaleType f16256OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public Boolean f16257Ooooo00;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void OooOO0O(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof androidx.appcompat.view.menu.OooO;
        if (z) {
            ((androidx.appcompat.view.menu.OooO) menu).OooOoO0();
        }
        super.OooOO0O(i);
        if (z) {
            ((androidx.appcompat.view.menu.OooO) menu).OooOo();
        }
    }

    public final void OooOo00(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, Pow2.MAX_POW2), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f16256OoooOoo;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f16253OoooOOo;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O00o00.OooOOO.OooO0OO(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView2 = null;
        if (this.f16254OoooOo0 || this.f16255OoooOoO) {
            ArrayList arrayListOooO0OO = o0ooOOo.OooO0OO(this, getTitle());
            boolean zIsEmpty = arrayListOooO0OO.isEmpty();
            o0ooOOo.OooO00o oooO00o = o0ooOOo.f17333OooO00o;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListOooO0OO, oooO00o);
            ArrayList arrayListOooO0OO2 = o0ooOOo.OooO0OO(this, getSubtitle());
            TextView textView2 = arrayListOooO0OO2.isEmpty() ? null : (TextView) Collections.max(arrayListOooO0OO2, oooO00o);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f16254OoooOo0 && textView != null) {
                    OooOo00(textView, pair);
                }
                if (this.f16255OoooOoO && textView2 != null) {
                    OooOo00(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f16257Ooooo00;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f16256OoooOoo;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        o0O00o00.OooOOO.OooO0O0(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f16257Ooooo00;
        if (bool == null || bool.booleanValue() != z) {
            this.f16257Ooooo00 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f16256OoooOoo != scaleType) {
            this.f16256OoooOoo = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f16253OoooOOo != null) {
            drawable = drawable.mutate();
            o00Ooo.OooO0O0.OooO0oO(drawable, this.f16253OoooOOo.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f16253OoooOOo = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f16255OoooOoO != z) {
            this.f16255OoooOoO = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f16254OoooOo0 != z) {
            this.f16254OoooOo0 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16251Ooooo0o;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.MaterialToolbar, i, i2, new int[0]);
        int i3 = o000OO.MaterialToolbar_navigationIconTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            setNavigationIconTint(typedArrayOooO0Oo.getColor(i3, -1));
        }
        this.f16254OoooOo0 = typedArrayOooO0Oo.getBoolean(o000OO.MaterialToolbar_titleCentered, false);
        this.f16255OoooOoO = typedArrayOooO0Oo.getBoolean(o000OO.MaterialToolbar_subtitleCentered, false);
        int i4 = typedArrayOooO0Oo.getInt(o000OO.MaterialToolbar_logoScaleType, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f16252OooooO0;
            if (i4 < scaleTypeArr.length) {
                this.f16256OoooOoo = scaleTypeArr[i4];
            }
        }
        int i5 = o000OO.MaterialToolbar_logoAdjustViewBounds;
        if (typedArrayOooO0Oo.hasValue(i5)) {
            this.f16257Ooooo00 = Boolean.valueOf(typedArrayOooO0Oo.getBoolean(i5, false));
        }
        typedArrayOooO0Oo.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.OooOOO(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.OooOO0O(context2);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            materialShapeDrawable.OooOOO0(ViewCompat.OooOOO.OooO(this));
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
    }
}
