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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.weieyu.yalla.R;
import p348o0OOO0oO.OooOOOO;
import p348o0OOO0oO.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final int[] f17736OooOOoo = {p337o0OO0o0.OooO0o.snackbarButtonStyle, p337o0OO0o0.OooO0o.snackbarTextViewStyle};

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f17737OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17738OooOOo0;

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
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
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

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull OooOOOO oooOOOO) {
        super(context, viewGroup, view, oooOOOO);
        this.f17738OooOOo0 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:31:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:3:0x000d->B:36:?, LOOP_END, SYNTHETIC] */
    @NonNull
    public static Snackbar OooOO0O(@NonNull View view) {
        ViewGroup viewGroup;
        Object parent;
        CharSequence text = view.getResources().getText(R.string.login_feedback_tips);
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17736OooOOoo);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? false : true ? p337o0OO0o0.OooOOOO.mtrl_layout_snackbar_include : p337o0OO0o0.OooOOOO.design_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.f17694OooO0OO.getChildAt(0)).getMessageView().setText(text);
        snackbar.f17697OooO0o0 = 0;
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void OooO00o() {
        OooO0O0(3);
    }

    public final int OooOO0() {
        int i = this.f17697OooO0o0;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f17738OooOOo0.getRecommendedTimeoutMillis(i, (this.f17737OooOOo ? 4 : 0) | 1 | 2);
        }
        if (this.f17737OooOOo && this.f17738OooOOo0.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    @NonNull
    public final Snackbar OooOO0o(View.OnClickListener onClickListener) {
        CharSequence text = this.f17693OooO0O0.getText(R.string.feedback);
        Button actionView = ((SnackbarContentLayout) this.f17694OooO0OO.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f17737OooOOo = false;
        } else {
            this.f17737OooOOo = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new OooOo00(this, onClickListener));
        }
        return this;
    }

    public final void OooOOO0() {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        int iOooOO0 = OooOO0();
        BaseTransientBottomBar.OooO oooO = this.f17703OooOOO0;
        synchronized (oooOO0OOooO0O0.f17728OooO00o) {
            if (oooOO0OOooO0O0.OooO0OO(oooO)) {
                OooOO0O.OooO0OO oooO0OO = oooOO0OOooO0O0.f17730OooO0OO;
                oooO0OO.f17734OooO0O0 = iOooOO0;
                oooOO0OOooO0O0.f17729OooO0O0.removeCallbacksAndMessages(oooO0OO);
                oooOO0OOooO0O0.OooO0oO(oooOO0OOooO0O0.f17730OooO0OO);
                return;
            }
            if (oooOO0OOooO0O0.OooO0Oo(oooO)) {
                oooOO0OOooO0O0.f17731OooO0Oo.f17734OooO0O0 = iOooOO0;
            } else {
                oooOO0OOooO0O0.f17731OooO0Oo = new OooOO0O.OooO0OO(iOooOO0, oooO);
            }
            OooOO0O.OooO0OO oooO0OO2 = oooOO0OOooO0O0.f17730OooO0OO;
            if (oooO0OO2 == null || !oooOO0OOooO0O0.OooO00o(oooO0OO2, 4)) {
                oooOO0OOooO0O0.f17730OooO0OO = null;
                oooOO0OOooO0O0.OooO0oo();
            }
        }
    }
}
