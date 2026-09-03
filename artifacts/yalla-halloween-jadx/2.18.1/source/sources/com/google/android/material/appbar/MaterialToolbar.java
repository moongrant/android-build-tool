package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o0OoOo0;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public static final int f16449o00000O = Oooo000.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public static final ImageView.ScaleType[] f16450o00000OO = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @Nullable
    public ImageView.ScaleType f16451o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @Nullable
    public Integer f16452o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f16453o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f16454o000000o;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @Nullable
    public Boolean f16455o00000O0;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    public final void OooOoO0(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f16451o00000;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f16452o000000;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0OO(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView2 = null;
        if (this.f16453o000000O || this.f16454o000000o) {
            List<TextView> listOooO00o = o0OoOo0.OooO00o(this, getTitle());
            TextView textView = ((ArrayList) listOooO00o).isEmpty() ? null : (TextView) Collections.min(listOooO00o, o0OoOo0.f17365OooO00o);
            List<TextView> listOooO00o2 = o0OoOo0.OooO00o(this, getSubtitle());
            TextView textView2 = ((ArrayList) listOooO00o2).isEmpty() ? null : (TextView) Collections.max(listOooO00o2, o0OoOo0.f17365OooO00o);
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
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f16453o000000O && textView != null) {
                    OooOoO0(textView, pair);
                }
                if (this.f16454o000000o && textView2 != null) {
                    OooOoO0(textView2, pair);
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
            Boolean bool = this.f16455o00000O0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f16451o00000;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        o0O0O00.OooO0O0(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f16455o00000O0;
        if (bool == null || bool.booleanValue() != z) {
            this.f16455o00000O0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f16451o00000 != scaleType) {
            this.f16451o00000 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f16452o000000 != null) {
            drawable = o0OOO0o.OooO0o0(drawable.mutate());
            o0OOO0o.OooO0O0.OooO0oO(drawable, this.f16452o000000.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f16452o000000 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f16454o000000o != z) {
            this.f16454o000000o = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f16453o000000O != z) {
            this.f16453o000000O = z;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16449o00000O;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.MaterialToolbar, i, i2, new int[0]);
        int i3 = Oooo0.MaterialToolbar_navigationIconTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            setNavigationIconTint(typedArrayOooO0Oo.getColor(i3, -1));
        }
        this.f16453o000000O = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialToolbar_titleCentered, false);
        this.f16454o000000o = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialToolbar_subtitleCentered, false);
        int i4 = typedArrayOooO0Oo.getInt(Oooo0.MaterialToolbar_logoScaleType, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f16450o00000OO;
            if (i4 < scaleTypeArr.length) {
                this.f16451o00000 = scaleTypeArr[i4];
            }
        }
        int i5 = Oooo0.MaterialToolbar_logoAdjustViewBounds;
        if (typedArrayOooO0Oo.hasValue(i5)) {
            this.f16455o00000O0 = Boolean.valueOf(typedArrayOooO0Oo.getBoolean(i5, false));
        }
        typedArrayOooO0Oo.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.OooOOOo(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.OooOOO0(context2);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            materialShapeDrawable.OooOOOO(ViewCompat.OooOOO.OooO(this));
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
    }
}
