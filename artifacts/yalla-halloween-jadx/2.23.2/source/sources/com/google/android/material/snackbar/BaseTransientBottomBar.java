package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.material.TextFieldImplKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.o000OOo;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jctools.util.Pow2;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O00;
import p272o0O0000o.o000OO;
import p274o0O000oo.OooOOO0;
import p278o0O00o.OooOOO;
import p278o0O00o.OooOo;
import p278o0O00o.OooOo00;
import p278o0O00o.Oooo0;
import p278o0O00o.Oooo000;
import p278o0O00o.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SnackbarBaseLayout f17312OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f17313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f17314OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f17315OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TimeInterpolator f17316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TimeInterpolator f17317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TimeInterpolator f17318OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ViewGroup f17319OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Context f17320OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final o0OoOo0 f17321OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17322OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f17324OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f17325OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f17326OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f17327OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f17328OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f17329OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17330OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final p064o0000oO0.OooOO0 f17307OooOo0 = o0O000.OooO0O0.f40881OooO0O0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final LinearInterpolator f17308OooOo0O = o0O000.OooO0O0.f40880OooO00o;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final p064o0000oO0.OooOO0O f17309OooOo0o = o0O000.OooO0O0.f40883OooO0Oo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f17311OooOoO0 = {o00000.snackbarStyle};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String f17310OooOoO = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NonNull
    public static final Handler f17306OooOo = new Handler(Looper.getMainLooper(), new OooO00o());

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @RequiresApi(29)
    public final OooO0O0 f17323OooOO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final OooO0OO f17331OooOo00 = new OooO0OO();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AnimationMode {
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NonNull
        public final OooO0o f17332OooOO0 = new OooO0o(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            OooO0o oooO0o = this.f17332OooOO0;
            oooO0o.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    OooOO0O.OooO0O0().OooO0o0(oooO0o.f17335OooO00o);
                }
            } else if (coordinatorLayout.OooOOO(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
                OooO0OO oooO0OO = oooO0o.f17335OooO00o;
                synchronized (oooOO0OOooO0O0.f17355OooO00o) {
                    if (oooOO0OOooO0O0.OooO0OO(oooO0OO)) {
                        OooOO0O.OooO0OO oooO0OO2 = oooOO0OOooO0O0.f17357OooO0OO;
                        if (!oooO0OO2.f17362OooO0OO) {
                            oooO0OO2.f17362OooO0OO = true;
                            oooOO0OOooO0O0.f17356OooO0O0.removeCallbacksAndMessages(oooO0OO2);
                        }
                    }
                }
            }
            return super.OooO0oO(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean OooOo00(View view) {
            this.f17332OooOO0.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    @IntRange(from = WorkQueueKt.NOTHING_TO_STEAL)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Duration {
    }

    public class OooO00o implements Handler.Callback {
        /* JADX WARN: Code duplicated, block: B:25:0x0098  */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.f17312OooO;
                if (snackbarBaseLayout.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.OooO0o) {
                        CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) layoutParams;
                        Behavior behavior = new Behavior();
                        OooO0o oooO0o2 = behavior.f17332OooOO0;
                        oooO0o2.getClass();
                        oooO0o2.f17335OooO00o = baseTransientBottomBar.f17331OooOo00;
                        behavior.f15880OooO0O0 = new OooO(baseTransientBottomBar);
                        oooO0o.OooO0O0(behavior);
                        oooO0o.f5223OooO0oO = 80;
                    }
                    snackbarBaseLayout.f17346OooOOO = true;
                    baseTransientBottomBar.f17319OooO0oO.addView(snackbarBaseLayout);
                    snackbarBaseLayout.f17346OooOOO = false;
                    baseTransientBottomBar.OooO0o();
                    snackbarBaseLayout.setVisibility(4);
                }
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                if (ViewCompat.OooOO0O.OooO0OO(snackbarBaseLayout)) {
                    baseTransientBottomBar.OooO0o0();
                } else {
                    baseTransientBottomBar.f17328OooOOo = true;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i2 = message.arg1;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.f17330OooOOoo;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar2.f17312OooO;
                if (snackbarBaseLayout2.getVisibility() != 0) {
                    baseTransientBottomBar2.OooO0OO();
                } else if (snackbarBaseLayout2.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar2.f17316OooO0Oo);
                    valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.snackbar.OooO00o(baseTransientBottomBar2));
                    valueAnimatorOfFloat.setDuration(baseTransientBottomBar2.f17314OooO0O0);
                    valueAnimatorOfFloat.addListener(new OooOOO(baseTransientBottomBar2, i2));
                    valueAnimatorOfFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int height = snackbarBaseLayout2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height);
                    valueAnimator.setInterpolator(baseTransientBottomBar2.f17318OooO0o0);
                    valueAnimator.setDuration(baseTransientBottomBar2.f17315OooO0OO);
                    valueAnimator.addListener(new OooOo00(baseTransientBottomBar2, i2));
                    valueAnimator.addUpdateListener(new com.google.android.material.snackbar.OooO0o(baseTransientBottomBar2));
                    valueAnimator.start();
                }
            } else {
                baseTransientBottomBar2.OooO0OO();
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
            if (baseTransientBottomBar.f17312OooO == null || (context = baseTransientBottomBar.f17320OooO0oo) == null) {
                return;
            }
            int iHeight = o000OOo.OooO00o(context).height();
            int[] iArr = new int[2];
            SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.f17312OooO;
            snackbarBaseLayout.getLocationOnScreen(iArr);
            int height = (iHeight - (snackbarBaseLayout.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f17312OooO.getTranslationY());
            int i = baseTransientBottomBar.f17327OooOOOo;
            if (height >= i) {
                baseTransientBottomBar.f17329OooOOo0 = i;
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f17312OooO.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f17310OooOoO, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            int i2 = baseTransientBottomBar.f17327OooOOOo;
            baseTransientBottomBar.f17329OooOOo0 = i2;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (i2 - height) + marginLayoutParams.bottomMargin;
            baseTransientBottomBar.f17312OooO.requestLayout();
        }
    }

    public class OooO0OO implements OooOO0O.OooO0O0 {
        public OooO0OO() {
        }

        @Override // com.google.android.material.snackbar.OooOO0O.OooO0O0
        public final void OooO00o(int i) {
            Handler handler = BaseTransientBottomBar.f17306OooOo;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.OooOO0O.OooO0O0
        public final void show() {
            Handler handler = BaseTransientBottomBar.f17306OooOo;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0OO f17335OooO00o;

        public OooO0o(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f15885OooO0oO = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f15886OooO0oo = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f15884OooO0o0 = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final OooO00o f17336OooOOOO = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f17337OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public BaseTransientBottomBar<?> f17338OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f17339OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final com.google.android.material.shape.OooO0O0 f17340OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f17341OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f17342OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f17343OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public ColorStateList f17344OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public PorterDuff.Mode f17345OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f17346OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public Rect f17347OooOOO0;

        public class OooO00o implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, o000OO.SnackbarLayout);
            int i = o000OO.SnackbarLayout_elevation;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i, 0);
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooOOO.OooOOoo(this, dimensionPixelSize);
            }
            this.f17339OooO0o = typedArrayObtainStyledAttributes.getInt(o000OO.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(o000OO.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(o000OO.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f17340OooO0o0 = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context2, attributeSet, 0, 0));
            }
            this.f17341OooO0oO = typedArrayObtainStyledAttributes.getFloat(o000OO.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayObtainStyledAttributes, o000OO.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(oo0o0Oo.OooO0oO(typedArrayObtainStyledAttributes.getInt(o000OO.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f17342OooO0oo = typedArrayObtainStyledAttributes.getFloat(o000OO.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f17337OooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.SnackbarLayout_android_maxWidth, -1);
            this.f17343OooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f17336OooOOOO);
            setFocusable(true);
            if (getBackground() == null) {
                int iOooO0o0 = OooOOO0.OooO0o0(OooOOO0.OooO0OO(o00000.colorSurface, this), getBackgroundOverlayColorAlpha(), OooOOO0.OooO0OO(o00000.colorOnSurface, this));
                com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17340OooO0o0;
                if (oooO0O0 != null) {
                    p064o0000oO0.OooOO0 oooOO1 = BaseTransientBottomBar.f17307OooOo0;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(oooO0O0);
                    materialShapeDrawable.OooOOO(ColorStateList.valueOf(iOooO0o0));
                    drawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    p064o0000oO0.OooOO0 oooOO2 = BaseTransientBottomBar.f17307OooOo0;
                    float dimension = resources.getDimension(o00000O.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iOooO0o0);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.f17344OooOO0O;
                if (colorStateList != null) {
                    o00Ooo.OooO0O0.OooO0oo(drawable, colorStateList);
                }
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOo0(this, drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f17338OooO0Oo = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f17342OooO0oo;
        }

        public int getAnimationMode() {
            return this.f17339OooO0o;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f17341OooO0oO;
        }

        public int getMaxInlineActionWidth() {
            return this.f17343OooOO0;
        }

        public int getMaxWidth() {
            return this.f17337OooO;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17338OooO0Oo;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f17312OooO.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        baseTransientBottomBar.f17327OooOOOo = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                        baseTransientBottomBar.OooO0o();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOOO0.OooO0OO(this);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x002f  */
        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z;
            boolean z2;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17338OooO0Oo;
            if (baseTransientBottomBar != null) {
                OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
                OooO0OO oooO0OO = baseTransientBottomBar.f17331OooOo00;
                synchronized (oooOO0OOooO0O0.f17355OooO00o) {
                    try {
                        z = true;
                        if (!oooOO0OOooO0O0.OooO0OO(oooO0OO)) {
                            OooOO0O.OooO0OO oooO0OO2 = oooOO0OOooO0O0.f17358OooO0Oo;
                            if (oooO0OO2 == null) {
                                z2 = false;
                            } else {
                                if (oooO0OO != null && oooO0OO2.f17360OooO00o.get() == oooO0OO) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (!z2) {
                                z = false;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    BaseTransientBottomBar.f17306OooOo.post(new Oooo0(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17338OooO0Oo;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f17328OooOOo) {
                return;
            }
            baseTransientBottomBar.OooO0o0();
            baseTransientBottomBar.f17328OooOOo = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.f17337OooO;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, Pow2.MAX_POW2), i2);
        }

        public void setAnimationMode(int i) {
            this.f17339OooO0o = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f17344OooOO0O != null) {
                drawable = drawable.mutate();
                o00Ooo.OooO0O0.OooO0oo(drawable, this.f17344OooOO0O);
                o00Ooo.OooO0O0.OooO(drawable, this.f17345OooOO0o);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f17344OooOO0O = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                o00Ooo.OooO0O0.OooO0oo(drawableMutate, colorStateList);
                o00Ooo.OooO0O0.OooO(drawableMutate, this.f17345OooOO0o);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f17345OooOO0o = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                o00Ooo.OooO0O0.OooO(drawableMutate, mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f17346OooOOO || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f17347OooOOO0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f17338OooO0Oo;
            if (baseTransientBottomBar != null) {
                p064o0000oO0.OooOO0 oooOO1 = BaseTransientBottomBar.f17307OooOo0;
                baseTransientBottomBar.OooO0o();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f17336OooOOOO);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull SnackbarContentLayout snackbarContentLayout, @NonNull SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f17319OooO0oO = viewGroup;
        this.f17321OooOO0 = snackbarContentLayout2;
        this.f17320OooO0oo = context;
        o00oO0o.OooO0OO(context, o00oO0o.f16848OooO00o, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17311OooOoO0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) layoutInflaterFrom.inflate(resourceId != -1 ? o0000O00.mtrl_layout_snackbar : o0000O00.design_layout_snackbar, viewGroup, false);
        this.f17312OooO = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f17368OooO0o0.setTextColor(OooOOO0.OooO0o0(OooOOO0.OooO0OO(o00000.colorSurface, snackbarContentLayout), actionTextColorAlpha, snackbarContentLayout.f17368OooO0o0.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        snackbarBaseLayout.addView(snackbarContentLayout);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOO0O.OooO0o(snackbarBaseLayout, 1);
        ViewCompat.OooO0o.OooOOoo(snackbarBaseLayout, 1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        ViewCompat.OooOOO.OooOo0(snackbarBaseLayout, new OooOo(this));
        ViewCompat.OooOOOO(snackbarBaseLayout, new Oooo000(this));
        this.f17330OooOOoo = (AccessibilityManager) context.getSystemService("accessibility");
        int i = o00000.motionDurationLong2;
        this.f17315OooO0OO = o0O00OOO.OooO00o.OooO0OO(i, context, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
        this.f17313OooO00o = o0O00OOO.OooO00o.OooO0OO(i, context, TextFieldImplKt.AnimationDuration);
        this.f17314OooO0O0 = o0O00OOO.OooO00o.OooO0OO(o00000.motionDurationMedium1, context, 75);
        int i2 = o00000.motionEasingEmphasizedInterpolator;
        this.f17316OooO0Oo = o0O00OOO.OooO00o.OooO0Oo(context, i2, f17308OooOo0O);
        this.f17317OooO0o = o0O00OOO.OooO00o.OooO0Oo(context, i2, f17309OooOo0o);
        this.f17318OooO0o0 = o0O00OOO.OooO00o.OooO0Oo(context, i2, f17307OooOo0);
    }

    public void OooO00o() {
        OooO0O0(3);
    }

    public final void OooO0O0(int i) {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        OooO0OO oooO0OO = this.f17331OooOo00;
        synchronized (oooOO0OOooO0O0.f17355OooO00o) {
            if (oooOO0OOooO0O0.OooO0OO(oooO0OO)) {
                oooOO0OOooO0O0.OooO00o(oooOO0OOooO0O0.f17357OooO0OO, i);
            } else {
                OooOO0O.OooO0OO oooO0OO2 = oooOO0OOooO0O0.f17358OooO0Oo;
                boolean z = false;
                if (oooO0OO2 != null) {
                    if (oooO0OO != null && oooO0OO2.f17360OooO00o.get() == oooO0OO) {
                        z = true;
                    }
                }
                if (z) {
                    oooOO0OOooO0O0.OooO00o(oooOO0OOooO0O0.f17358OooO0Oo, i);
                }
            }
        }
    }

    public final void OooO0OO() {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        OooO0OO oooO0OO = this.f17331OooOo00;
        synchronized (oooOO0OOooO0O0.f17355OooO00o) {
            try {
                if (oooOO0OOooO0O0.OooO0OO(oooO0OO)) {
                    oooOO0OOooO0O0.f17357OooO0OO = null;
                    OooOO0O.OooO0OO oooO0OO2 = oooOO0OOooO0O0.f17358OooO0Oo;
                    if (oooO0OO2 != null && oooO0OO2 != null) {
                        oooOO0OOooO0O0.f17357OooO0OO = oooO0OO2;
                        oooOO0OOooO0O0.f17358OooO0Oo = null;
                        OooOO0O.OooO0O0 oooO0O0 = oooO0OO2.f17360OooO00o.get();
                        if (oooO0O0 != null) {
                            oooO0O0.show();
                        } else {
                            oooOO0OOooO0O0.f17357OooO0OO = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f17312OooO.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f17312OooO);
        }
    }

    public final void OooO0Oo() {
        OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
        OooO0OO oooO0OO = this.f17331OooOo00;
        synchronized (oooOO0OOooO0O0.f17355OooO00o) {
            if (oooOO0OOooO0O0.OooO0OO(oooO0OO)) {
                oooOO0OOooO0O0.OooO0o(oooOO0OOooO0O0.f17357OooO0OO);
            }
        }
    }

    public final void OooO0o() {
        SnackbarBaseLayout snackbarBaseLayout = this.f17312OooO;
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f17310OooOoO;
        if (!z) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (snackbarBaseLayout.f17347OooOOO0 == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (snackbarBaseLayout.getParent() == null) {
            return;
        }
        int i = this.f17325OooOOO0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = snackbarBaseLayout.f17347OooOOO0;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.f17324OooOOO;
        int i4 = rect.right + this.f17326OooOOOO;
        int i5 = rect.top;
        boolean z2 = false;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            snackbarBaseLayout.requestLayout();
        }
        if ((z3 || this.f17329OooOOo0 != this.f17327OooOOOo) && Build.VERSION.SDK_INT >= 29) {
            if (this.f17327OooOOOo > 0) {
                ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout.getLayoutParams();
                if ((layoutParams2 instanceof CoordinatorLayout.OooO0o) && (((CoordinatorLayout.OooO0o) layoutParams2).f5217OooO00o instanceof SwipeDismissBehavior)) {
                    z2 = true;
                }
            }
            if (z2) {
                OooO0O0 oooO0O0 = this.f17323OooOO0o;
                snackbarBaseLayout.removeCallbacks(oooO0O0);
                snackbarBaseLayout.post(oooO0O0);
            }
        }
    }

    public final void OooO0o0() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.f17330OooOOoo;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        SnackbarBaseLayout snackbarBaseLayout = this.f17312OooO;
        if (z) {
            snackbarBaseLayout.post(new OooOO0(this));
            return;
        }
        if (snackbarBaseLayout.getParent() != null) {
            snackbarBaseLayout.setVisibility(0);
        }
        OooO0Oo();
    }
}
