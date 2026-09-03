package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jctools.util.Pow2;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f17363OooOoo = {o00000.snackbarButtonStyle, o00000.snackbarTextViewStyle};

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17364OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f17365OooOoo0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), Pow2.MAX_POW2));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context, null);
        }
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull SnackbarContentLayout snackbarContentLayout, @NonNull SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f17364OooOoOO = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:3:0x000a->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [android.view.View] */
    @NonNull
    public static Snackbar OooO0oo(@NonNull ViewGroup viewGroup, @StringRes int i) {
        ViewGroup viewGroup2;
        Object parent;
        CharSequence text = viewGroup.getResources().getText(i);
        ViewGroup viewGroup3 = null;
        while (true) {
            if (viewGroup instanceof CoordinatorLayout) {
                viewGroup2 = (ViewGroup) viewGroup;
                break;
            }
            if (!(viewGroup instanceof FrameLayout)) {
                parent = viewGroup.getParent();
                if (parent instanceof View) {
                    viewGroup = (View) parent;
                } else {
                    viewGroup = 0;
                }
                if (viewGroup == 0) {
                    viewGroup2 = viewGroup3;
                    break;
                }
            } else {
                if (viewGroup.getId() == 16908290) {
                    viewGroup2 = (ViewGroup) viewGroup;
                    break;
                }
                viewGroup3 = (ViewGroup) viewGroup;
                parent = viewGroup.getParent();
                if (parent instanceof View) {
                    viewGroup = (View) parent;
                } else {
                    viewGroup = 0;
                }
                if (viewGroup == 0) {
                    viewGroup2 = viewGroup3;
                    break;
                }
            }
        }
        if (viewGroup2 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup2.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17363OooOoo);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? false : true ? o0000O00.mtrl_layout_snackbar_include : o0000O00.design_layout_snackbar_include, viewGroup2, false);
        Snackbar snackbar = new Snackbar(context, viewGroup2, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.f17312OooO.getChildAt(0)).getMessageView().setText(text);
        snackbar.f17322OooOO0O = 0;
        return snackbar;
    }

    @NonNull
    @CanIgnoreReturnValue
    public final void OooO(@StringRes int i, final View.OnClickListener onClickListener) {
        CharSequence text = this.f17320OooO0oo.getText(i);
        Button actionView = ((SnackbarContentLayout) this.f17312OooO.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f17365OooOoo0 = false;
        } else {
            this.f17365OooOoo0 = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: o0O00o.o00O0O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar snackbar = this.f41044OooO0Oo;
                    snackbar.getClass();
                    onClickListener.onClick(view);
                    snackbar.OooO0O0(1);
                }
            });
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void OooO00o() {
        OooO0O0(3);
    }

    public final int OooO0oO() {
        int i = this.f17322OooOO0O;
        if (i == -2) {
            return -2;
        }
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f17364OooOoOO;
        if (i2 >= 29) {
            return accessibilityManager.getRecommendedTimeoutMillis(i, (this.f17365OooOoo0 ? 4 : 0) | 1 | 2);
        }
        if (this.f17365OooOoo0 && accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    public final void OooOO0() {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        int iOooO0oO = OooO0oO();
        BaseTransientBottomBar.OooO0OO oooO0OO = this.f17331OooOo00;
        synchronized (oooOO0OOooO0O0.f17355OooO00o) {
            if (oooOO0OOooO0O0.OooO0OO(oooO0OO)) {
                OooOO0O.OooO0OO oooO0OO2 = oooOO0OOooO0O0.f17357OooO0OO;
                oooO0OO2.f17361OooO0O0 = iOooO0oO;
                oooOO0OOooO0O0.f17356OooO0O0.removeCallbacksAndMessages(oooO0OO2);
                oooOO0OOooO0O0.OooO0o(oooOO0OOooO0O0.f17357OooO0OO);
                return;
            }
            OooOO0O.OooO0OO oooO0OO3 = oooOO0OOooO0O0.f17358OooO0Oo;
            boolean z = false;
            if (oooO0OO3 != null) {
                if (oooO0OO != null && oooO0OO3.f17360OooO00o.get() == oooO0OO) {
                    z = true;
                }
            }
            if (z) {
                oooOO0OOooO0O0.f17358OooO0Oo.f17361OooO0O0 = iOooO0oO;
            } else {
                oooOO0OOooO0O0.f17358OooO0Oo = new OooOO0O.OooO0OO(iOooO0oO, oooO0OO);
            }
            OooOO0O.OooO0OO oooO0OO4 = oooOO0OOooO0O0.f17357OooO0OO;
            if (oooO0OO4 == null || !oooOO0OOooO0O0.OooO00o(oooO0OO4, 4)) {
                oooOO0OOooO0O0.f17357OooO0OO = null;
                OooOO0O.OooO0OO oooO0OO5 = oooOO0OOooO0O0.f17358OooO0Oo;
                if (oooO0OO5 != null) {
                    oooOO0OOooO0O0.f17357OooO0OO = oooO0OO5;
                    oooOO0OOooO0O0.f17358OooO0Oo = null;
                    OooOO0O.OooO0O0 oooO0O0 = oooO0OO5.f17360OooO00o.get();
                    if (oooO0O0 != null) {
                        oooO0O0.show();
                    } else {
                        oooOO0OOooO0O0.f17357OooO0OO = null;
                    }
                }
            }
        }
    }
}
