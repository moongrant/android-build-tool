package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import p072o000O0o0.o0000OO0;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.Oooo0;
import p348o0OOO0oO.OooOOOO;
import p352o0OOOOoO.OooOOO0;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f17691OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ViewGroup f17692OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f17693OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SnackbarBaseLayout f17694OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OooOOOO f17695OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f17697OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f17698OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f17699OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17700OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f17701OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17702OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final int[] f17689OooOOOO = {p337o0OO0o0.OooO0o.snackbarStyle};

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f17690OooOOOo = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public static final Handler f17688OooOOO = new Handler(Looper.getMainLooper(), new OooO00o());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @RequiresApi(29)
    public final OooO0O0 f17696OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public OooO f17703OooOOO0 = new OooO();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AnimationMode {
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NonNull
        public final OooOO0 f17704OooO = new OooOO0(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            OooOO0 oooOO1 = this.f17704OooO;
            Objects.requireNonNull(oooOO1);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    OooOO0O.OooO0O0().OooO0o(oooOO1.f17709OooO00o);
                }
            } else if (coordinatorLayout.OooOo0(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                OooOO0O.OooO0O0().OooO0o0(oooOO1.f17709OooO00o);
            }
            return super.OooO0oO(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean OooOo00(View view) {
            Objects.requireNonNull(this.f17704OooO);
            return view instanceof SnackbarBaseLayout;
        }
    }

    @IntRange(from = WorkQueueKt.NOTHING_TO_STEAL)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Duration {
    }

    public class OooO implements OooOO0O.OooO0O0 {
        public OooO() {
        }

        @Override // com.google.android.material.snackbar.OooOO0O.OooO0O0
        public final void OooO00o() {
            Handler handler = BaseTransientBottomBar.f17688OooOOO;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.OooOO0O.OooO0O0
        public final void OooO0O0(int i) {
            Handler handler = BaseTransientBottomBar.f17688OooOOO;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    public class OooO00o implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i2 = message.arg1;
                if (!baseTransientBottomBar.OooO0oO() || baseTransientBottomBar.f17694OooO0OO.getVisibility() != 0) {
                    baseTransientBottomBar.OooO0o0();
                } else if (baseTransientBottomBar.f17694OooO0OO.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    valueAnimatorOfFloat.setInterpolator(p338o0OO0o0O.OooO0o.f37972OooO00o);
                    valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.snackbar.OooO00o(baseTransientBottomBar));
                    valueAnimatorOfFloat.setDuration(75L);
                    valueAnimatorOfFloat.addListener(new p348o0OOO0oO.OooO(baseTransientBottomBar, i2));
                    valueAnimatorOfFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar.OooO0OO());
                    valueAnimator.setInterpolator(p338o0OO0o0O.OooO0o.f37973OooO0O0);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new p348o0OOO0oO.OooOO0O(baseTransientBottomBar, i2));
                    valueAnimator.addUpdateListener(new com.google.android.material.snackbar.OooO0o(baseTransientBottomBar));
                    valueAnimator.start();
                }
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            if (baseTransientBottomBar2.f17694OooO0OO.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f17694OooO0OO.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.OooO0o) {
                    CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) layoutParams;
                    Behavior behavior = new Behavior();
                    OooOO0 oooOO1 = behavior.f17704OooO;
                    Objects.requireNonNull(oooOO1);
                    oooOO1.f17709OooO00o = baseTransientBottomBar2.f17703OooOOO0;
                    behavior.f16522OooO0O0 = new com.google.android.material.snackbar.OooO(baseTransientBottomBar2);
                    oooO0o.OooO0O0(behavior);
                    oooO0o.f7767OooO0oO = 80;
                }
                SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar2.f17694OooO0OO;
                ViewGroup viewGroup = baseTransientBottomBar2.f17692OooO00o;
                snackbarBaseLayout.f17720o000oOoO = true;
                viewGroup.addView(snackbarBaseLayout);
                snackbarBaseLayout.f17720o000oOoO = false;
                baseTransientBottomBar2.OooO();
                baseTransientBottomBar2.f17694OooO0OO.setVisibility(4);
            }
            SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar2.f17694OooO0OO;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(snackbarBaseLayout2)) {
                baseTransientBottomBar2.OooO0oo();
            } else {
                baseTransientBottomBar2.f17701OooOO0O = true;
            }
            return true;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f17694OooO0OO == null || (context = baseTransientBottomBar.f17693OooO0O0) == null) {
                return;
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
            int[] iArr = new int[2];
            baseTransientBottomBar2.f17694OooO0OO.getLocationOnScreen(iArr);
            int height = (i - (baseTransientBottomBar2.f17694OooO0OO.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f17694OooO0OO.getTranslationY());
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            if (height >= baseTransientBottomBar3.f17700OooOO0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f17694OooO0OO.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Handler handler = BaseTransientBottomBar.f17688OooOOO;
                Log.w(BaseTransientBottomBar.f17690OooOOOo, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = marginLayoutParams.bottomMargin;
            BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
            marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f17700OooOO0 - height) + i2;
            baseTransientBottomBar4.f17694OooO0OO.requestLayout();
        }
    }

    public class OooO0OO implements oo000o {
        public OooO0OO() {
        }

        @Override // o000O0O0.oo000o
        @NonNull
        public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f17698OooO0oO = windowInsetsCompat.OooO0o();
            BaseTransientBottomBar.this.f17699OooO0oo = windowInsetsCompat.OooO0oO();
            BaseTransientBottomBar.this.f17691OooO = windowInsetsCompat.OooO0oo();
            BaseTransientBottomBar.this.OooO();
            return windowInsetsCompat;
        }
    }

    public class OooO0o extends androidx.core.view.OooO00o {
        public OooO0o() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            o0000oo1.OooO00o(1048576);
            o0000oo1.Oooo0OO(true);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO0oO(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.OooO0oO(view, i, bundle);
            }
            BaseTransientBottomBar.this.OooO00o();
            return true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO f17709OooO00o;

        public OooOO0(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            Objects.requireNonNull(swipeDismissBehavior);
            swipeDismissBehavior.f16525OooO0o = SwipeDismissBehavior.OooOo0(0.1f);
            swipeDismissBehavior.f16527OooO0oO = SwipeDismissBehavior.OooOo0(0.6f);
            swipeDismissBehavior.f16524OooO0Oo = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public static final OooO00o f17710OoooOOO = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final float f17711Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Nullable
        public BaseTransientBottomBar<?> f17712Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f17713Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final float f17714Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public PorterDuff.Mode f17715OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f17716OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f17717OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public ColorStateList f17718OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @Nullable
        public Rect f17719OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public boolean f17720o000oOoO;

        public class OooO00o implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            Drawable drawableOooO0o0;
            super(OooOOO0.OooO00o(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Oooo0.SnackbarLayout);
            int i = Oooo0.SnackbarLayout_elevation;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i, 0);
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooOOO.OooOOoo(this, dimensionPixelSize);
            }
            this.f17713Oooo0oO = typedArrayObtainStyledAttributes.getInt(Oooo0.SnackbarLayout_animationMode, 0);
            this.f17714Oooo0oo = typedArrayObtainStyledAttributes.getFloat(Oooo0.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(o0OOO0O.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, Oooo0.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(o00Ooo.OooO0oO(typedArrayObtainStyledAttributes.getInt(Oooo0.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f17711Oooo = typedArrayObtainStyledAttributes.getFloat(Oooo0.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f17717OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.SnackbarLayout_android_maxWidth, -1);
            this.f17716OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f17710OoooOOO);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(p337o0OO0o0.OooOO0.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(o0O0000O.OooO0o0(o0O0000O.OooO0OO(this, p337o0OO0o0.OooO0o.colorSurface), o0O0000O.OooO0OO(this, p337o0OO0o0.OooO0o.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.f17718OoooO0O != null) {
                    drawableOooO0o0 = o0OOO0o.OooO0o0(gradientDrawable);
                    o0OOO0o.OooO0O0.OooO0oo(drawableOooO0o0, this.f17718OoooO0O);
                } else {
                    drawableOooO0o0 = o0OOO0o.OooO0o0(gradientDrawable);
                }
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOo0(this, drawableOooO0o0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f17712Oooo0o = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f17711Oooo;
        }

        public int getAnimationMode() {
            return this.f17713Oooo0oO;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f17714Oooo0oo;
        }

        public int getMaxInlineActionWidth() {
            return this.f17716OoooO0;
        }

        public int getMaxWidth() {
            return this.f17717OoooO00;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17712Oooo0o;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.OooO0Oo();
            }
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO0.OooO0OO(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17712Oooo0o;
            if (baseTransientBottomBar != null) {
                OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
                OooO oooO = baseTransientBottomBar.f17703OooOOO0;
                synchronized (oooOO0OOooO0O0.f17728OooO00o) {
                    z = oooOO0OOooO0O0.OooO0OO(oooO) || oooOO0OOooO0O0.OooO0Oo(oooO);
                }
                if (z) {
                    BaseTransientBottomBar.f17688OooOOO.post(new p348o0OOO0oO.OooOOO0(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17712Oooo0o;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f17701OooOO0O) {
                return;
            }
            baseTransientBottomBar.OooO0oo();
            baseTransientBottomBar.f17701OooOO0O = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f17717OoooO00 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f17717OoooO00;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.f17713Oooo0oO = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f17718OoooO0O != null) {
                drawable = o0OOO0o.OooO0o0(drawable.mutate());
                o0OOO0o.OooO0O0.OooO0oo(drawable, this.f17718OoooO0O);
                o0OOO0o.OooO0O0.OooO(drawable, this.f17715OoooO);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f17718OoooO0O = colorStateList;
            if (getBackground() != null) {
                Drawable drawableOooO0o0 = o0OOO0o.OooO0o0(getBackground().mutate());
                o0OOO0o.OooO0O0.OooO0oo(drawableOooO0o0, colorStateList);
                o0OOO0o.OooO0O0.OooO(drawableOooO0o0, this.f17715OoooO);
                if (drawableOooO0o0 != getBackground()) {
                    super.setBackgroundDrawable(drawableOooO0o0);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f17715OoooO = mode;
            if (getBackground() != null) {
                Drawable drawableOooO0o0 = o0OOO0o.OooO0o0(getBackground().mutate());
                o0OOO0o.OooO0O0.OooO(drawableOooO0o0, mode);
                if (drawableOooO0o0 != getBackground()) {
                    super.setBackgroundDrawable(drawableOooO0o0);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f17720o000oOoO || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f17719OoooOO0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17712Oooo0o;
            if (baseTransientBottomBar != null) {
                Handler handler = BaseTransientBottomBar.f17688OooOOO;
                baseTransientBottomBar.OooO();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f17710OoooOOO);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull OooOOOO oooOOOO) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (oooOOOO == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f17692OooO00o = viewGroup;
        this.f17695OooO0Oo = oooOOOO;
        this.f17693OooO0O0 = context;
        o000oOoO.OooO0OO(context, o000oOoO.f17355OooO00o, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17689OooOOOO);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) layoutInflaterFrom.inflate(resourceId != -1 ? p337o0OO0o0.OooOOOO.mtrl_layout_snackbar : p337o0OO0o0.OooOOOO.design_layout_snackbar, viewGroup, false);
        this.f17694OooO0OO = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f17740Oooo0oO.setTextColor(o0O0000O.OooO0o0(o0O0000O.OooO0OO(snackbarContentLayout, p337o0OO0o0.OooO0o.colorSurface), snackbarContentLayout.f17740Oooo0oO.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOO0O.OooO0o(snackbarBaseLayout, 1);
        ViewCompat.OooO0o.OooOOoo(snackbarBaseLayout, 1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        ViewCompat.OooOOO.OooOo0(snackbarBaseLayout, new OooO0OO());
        ViewCompat.OooOo0o(snackbarBaseLayout, new OooO0o());
        this.f17702OooOO0o = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    public final void OooO() {
        boolean z;
        ViewGroup.LayoutParams layoutParams = this.f17694OooO0OO.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            SnackbarBaseLayout snackbarBaseLayout = this.f17694OooO0OO;
            if (snackbarBaseLayout.f17719OoooOO0 != null) {
                if (snackbarBaseLayout.getParent() == null) {
                    return;
                }
                int i = this.f17698OooO0oO;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                SnackbarBaseLayout snackbarBaseLayout2 = this.f17694OooO0OO;
                Rect rect = snackbarBaseLayout2.f17719OoooOO0;
                marginLayoutParams.bottomMargin = rect.bottom + i;
                marginLayoutParams.leftMargin = rect.left + this.f17699OooO0oo;
                marginLayoutParams.rightMargin = rect.right + this.f17691OooO;
                marginLayoutParams.topMargin = rect.top;
                snackbarBaseLayout2.requestLayout();
                if (Build.VERSION.SDK_INT >= 29) {
                    if (this.f17700OooOO0 > 0) {
                        ViewGroup.LayoutParams layoutParams2 = this.f17694OooO0OO.getLayoutParams();
                        z = (layoutParams2 instanceof CoordinatorLayout.OooO0o) && (((CoordinatorLayout.OooO0o) layoutParams2).f7761OooO00o instanceof SwipeDismissBehavior);
                    }
                    if (z) {
                        this.f17694OooO0OO.removeCallbacks(this.f17696OooO0o);
                        this.f17694OooO0OO.post(this.f17696OooO0o);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.w(f17690OooOOOo, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    public void OooO00o() {
        OooO0O0(3);
    }

    public final void OooO0O0(int i) {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        OooO oooO = this.f17703OooOOO0;
        synchronized (oooOO0OOooO0O0.f17728OooO00o) {
            if (oooOO0OOooO0O0.OooO0OO(oooO)) {
                oooOO0OOooO0O0.OooO00o(oooOO0OOooO0O0.f17730OooO0OO, i);
            } else if (oooOO0OOooO0O0.OooO0Oo(oooO)) {
                oooOO0OOooO0O0.OooO00o(oooOO0OOooO0O0.f17731OooO0Oo, i);
            }
        }
    }

    public final int OooO0OO() {
        int height = this.f17694OooO0OO.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f17694OooO0OO.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final void OooO0Oo() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f17694OooO0OO.getRootWindowInsets()) == null) {
            return;
        }
        this.f17700OooOO0 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        OooO();
    }

    public final void OooO0o() {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        OooO oooO = this.f17703OooOOO0;
        synchronized (oooOO0OOooO0O0.f17728OooO00o) {
            if (oooOO0OOooO0O0.OooO0OO(oooO)) {
                oooOO0OOooO0O0.OooO0oO(oooOO0OOooO0O0.f17730OooO0OO);
            }
        }
    }

    public final void OooO0o0() {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        OooO oooO = this.f17703OooOOO0;
        synchronized (oooOO0OOooO0O0.f17728OooO00o) {
            if (oooOO0OOooO0O0.OooO0OO(oooO)) {
                oooOO0OOooO0O0.f17730OooO0OO = null;
                if (oooOO0OOooO0O0.f17731OooO0Oo != null) {
                    oooOO0OOooO0O0.OooO0oo();
                }
            }
        }
        ViewParent parent = this.f17694OooO0OO.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f17694OooO0OO);
        }
    }

    public final boolean OooO0oO() {
        AccessibilityManager accessibilityManager = this.f17702OooOO0o;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void OooO0oo() {
        if (OooO0oO()) {
            this.f17694OooO0OO.post(new com.google.android.material.snackbar.OooOO0(this));
            return;
        }
        if (this.f17694OooO0OO.getParent() != null) {
            this.f17694OooO0OO.setVisibility(0);
        }
        OooO0o();
    }
}
