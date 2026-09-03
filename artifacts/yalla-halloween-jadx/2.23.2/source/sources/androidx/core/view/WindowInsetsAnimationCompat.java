package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f5360OooO00o;

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DispatchMode {
        }

        public Callback(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        @NonNull
        public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list);

        @NonNull
        public OooO00o onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull OooO00o oooO00o) {
            return oooO00o;
        }
    }

    @RequiresApi(21)
    public static class OooO0O0 extends OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final PathInterpolator f5364OooO0o0 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p064o0000oO0.OooO f5363OooO0o = new p064o0000oO0.OooO();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final DecelerateInterpolator f5365OooO0oO = new DecelerateInterpolator();

        @RequiresApi(21)
        public static class OooO00o implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Callback f5366OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public WindowInsetsCompat f5367OooO0O0;

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0125OooO00o implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f5368OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f5369OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f5370OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ int f5371OooO0oO;

                /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                public final /* synthetic */ View f5372OooO0oo;

                public C0125OooO00o(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
                    this.f5368OooO0Oo = windowInsetsAnimationCompat;
                    this.f5370OooO0o0 = windowInsetsCompat;
                    this.f5369OooO0o = windowInsetsCompat2;
                    this.f5371OooO0oO = i;
                    this.f5372OooO0oo = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f5368OooO0Oo;
                    windowInsetsAnimationCompat.f5360OooO00o.OooO0Oo(animatedFraction);
                    float fOooO0O0 = windowInsetsAnimationCompat.f5360OooO00o.OooO0O0();
                    PathInterpolator pathInterpolator = OooO0O0.f5364OooO0o0;
                    int i = Build.VERSION.SDK_INT;
                    WindowInsetsCompat windowInsetsCompat = this.f5370OooO0o0;
                    WindowInsetsCompat.OooO oooO0o = i >= 30 ? new WindowInsetsCompat.OooO0o(windowInsetsCompat) : i >= 29 ? new WindowInsetsCompat.OooO0OO(windowInsetsCompat) : new WindowInsetsCompat.OooO0O0(windowInsetsCompat);
                    for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                        if ((this.f5371OooO0oO & i2) == 0) {
                            oooO0o.OooO0OO(i2, windowInsetsCompat.OooO00o(i2));
                        } else {
                            p052o00000oO.OooOO0O oooOO0OOooO00o = windowInsetsCompat.OooO00o(i2);
                            p052o00000oO.OooOO0O oooOO0OOooO00o2 = this.f5369OooO0o.OooO00o(i2);
                            float f = 1.0f - fOooO0O0;
                            oooO0o.OooO0OO(i2, WindowInsetsCompat.OooO0oO(oooOO0OOooO00o, (int) (((double) ((oooOO0OOooO00o.f33477OooO00o - oooOO0OOooO00o2.f33477OooO00o) * f)) + 0.5d), (int) (((double) ((oooOO0OOooO00o.f33478OooO0O0 - oooOO0OOooO00o2.f33478OooO0O0) * f)) + 0.5d), (int) (((double) ((oooOO0OOooO00o.f33479OooO0OO - oooOO0OOooO00o2.f33479OooO0OO) * f)) + 0.5d), (int) (((double) ((oooOO0OOooO00o.f33480OooO0Oo - oooOO0OOooO00o2.f33480OooO0Oo) * f)) + 0.5d)));
                        }
                    }
                    OooO0O0.OooO0oO(this.f5372OooO0oo, oooO0o.OooO0O0(), Collections.singletonList(windowInsetsAnimationCompat));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            public class C0126OooO0O0 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f5373OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ View f5374OooO0o0;

                public C0126OooO0O0(WindowInsetsAnimationCompat windowInsetsAnimationCompat, View view) {
                    this.f5373OooO0Oo = windowInsetsAnimationCompat;
                    this.f5374OooO0o0 = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f5373OooO0Oo;
                    windowInsetsAnimationCompat.f5360OooO00o.OooO0Oo(1.0f);
                    OooO0O0.OooO0o0(this.f5374OooO0o0, windowInsetsAnimationCompat);
                }
            }

            public class OooO0OO implements Runnable {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ View f5375OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ OooO00o f5376OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f5377OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f5378OooO0oO;

                public OooO0OO(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, OooO00o oooO00o, ValueAnimator valueAnimator) {
                    this.f5375OooO0Oo = view;
                    this.f5377OooO0o0 = windowInsetsAnimationCompat;
                    this.f5376OooO0o = oooO00o;
                    this.f5378OooO0oO = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OooO0O0.OooO0oo(this.f5375OooO0Oo, this.f5377OooO0o0, this.f5376OooO0o);
                    this.f5378OooO0oO.start();
                }
            }

            public OooO00o(@NonNull View view, @NonNull Callback callback) {
                WindowInsetsCompat windowInsetsCompatOooO0O0;
                this.f5366OooO00o = callback;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                WindowInsetsCompat windowInsetsCompatOooO00o = ViewCompat.OooOOOO.OooO00o(view);
                if (windowInsetsCompatOooO00o != null) {
                    int i = Build.VERSION.SDK_INT;
                    windowInsetsCompatOooO0O0 = (i >= 30 ? new WindowInsetsCompat.OooO0o(windowInsetsCompatOooO00o) : i >= 29 ? new WindowInsetsCompat.OooO0OO(windowInsetsCompatOooO00o) : new WindowInsetsCompat.OooO0O0(windowInsetsCompatOooO00o)).OooO0O0();
                } else {
                    windowInsetsCompatOooO0O0 = null;
                }
                this.f5367OooO0O0 = windowInsetsCompatOooO0O0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f5367OooO0O0 = WindowInsetsCompat.OooOO0(view, windowInsets);
                    return OooO0O0.OooO(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompatOooOO0 = WindowInsetsCompat.OooOO0(view, windowInsets);
                if (this.f5367OooO0O0 == null) {
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    this.f5367OooO0O0 = ViewCompat.OooOOOO.OooO00o(view);
                }
                if (this.f5367OooO0O0 == null) {
                    this.f5367OooO0O0 = windowInsetsCompatOooOO0;
                    return OooO0O0.OooO(view, windowInsets);
                }
                Callback callbackOooOO0 = OooO0O0.OooOO0(view);
                if (callbackOooOO0 != null && Objects.equals(callbackOooOO0.mDispachedInsets, windowInsets)) {
                    return OooO0O0.OooO(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f5367OooO0O0;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!windowInsetsCompatOooOO0.OooO00o(i2).equals(windowInsetsCompat.OooO00o(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return OooO0O0.OooO(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f5367OooO0O0;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i, (i & 8) != 0 ? windowInsetsCompatOooOO0.OooO00o(8).f33480OooO0Oo > windowInsetsCompat2.OooO00o(8).f33480OooO0Oo ? OooO0O0.f5364OooO0o0 : OooO0O0.f5363OooO0o : OooO0O0.f5365OooO0oO, 160L);
                OooO0o oooO0o = windowInsetsAnimationCompat.f5360OooO00o;
                oooO0o.OooO0Oo(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(oooO0o.OooO00o());
                p052o00000oO.OooOO0O oooOO0OOooO00o = windowInsetsCompatOooOO0.OooO00o(i);
                p052o00000oO.OooOO0O oooOO0OOooO00o2 = windowInsetsCompat2.OooO00o(i);
                int iMin = Math.min(oooOO0OOooO00o.f33477OooO00o, oooOO0OOooO00o2.f33477OooO00o);
                int i3 = oooOO0OOooO00o.f33478OooO0O0;
                int i4 = oooOO0OOooO00o2.f33478OooO0O0;
                int iMin2 = Math.min(i3, i4);
                int i5 = oooOO0OOooO00o.f33479OooO0OO;
                int i6 = oooOO0OOooO00o2.f33479OooO0OO;
                int iMin3 = Math.min(i5, i6);
                int i7 = oooOO0OOooO00o.f33480OooO0Oo;
                int i8 = i;
                int i9 = oooOO0OOooO00o2.f33480OooO0Oo;
                OooO00o oooO00o = new OooO00o(p052o00000oO.OooOO0O.OooO0O0(iMin, iMin2, iMin3, Math.min(i7, i9)), p052o00000oO.OooOO0O.OooO0O0(Math.max(oooOO0OOooO00o.f33477OooO00o, oooOO0OOooO00o2.f33477OooO00o), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                OooO0O0.OooO0o(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new C0125OooO00o(windowInsetsAnimationCompat, windowInsetsCompatOooOO0, windowInsetsCompat2, i8, view));
                duration.addListener(new C0126OooO0O0(windowInsetsAnimationCompat, view));
                o00000O.OooO00o(view, new OooO0OO(view, windowInsetsAnimationCompat, oooO00o, duration));
                this.f5367OooO0O0 = windowInsetsCompatOooOO0;
                return OooO0O0.OooO(view, windowInsets);
            }
        }

        @NonNull
        public static WindowInsets OooO(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(o00000O0.OooO.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static void OooO0o(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            Callback callbackOooOO0 = OooOO0(view);
            if (callbackOooOO0 != null) {
                callbackOooOO0.mDispachedInsets = windowInsets;
                if (!z) {
                    callbackOooOO0.onPrepare(windowInsetsAnimationCompat);
                    z = callbackOooOO0.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    OooO0o(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        public static void OooO0o0(@NonNull View view, @NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackOooOO0 = OooOO0(view);
            if (callbackOooOO0 != null) {
                callbackOooOO0.onEnd(windowInsetsAnimationCompat);
                if (callbackOooOO0.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    OooO0o0(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        public static void OooO0oO(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
            Callback callbackOooOO0 = OooOO0(view);
            if (callbackOooOO0 != null) {
                windowInsetsCompat = callbackOooOO0.onProgress(windowInsetsCompat, list);
                if (callbackOooOO0.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    OooO0oO(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        public static void OooO0oo(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, OooO00o oooO00o) {
            Callback callbackOooOO0 = OooOO0(view);
            if (callbackOooOO0 != null) {
                callbackOooOO0.onStart(windowInsetsAnimationCompat, oooO00o);
                if (callbackOooOO0.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    OooO0oo(viewGroup.getChildAt(i), windowInsetsAnimationCompat, oooO00o);
                }
            }
        }

        @Nullable
        public static Callback OooOO0(View view) {
            Object tag = view.getTag(o00000O0.OooO.tag_window_insets_animation_callback);
            if (tag instanceof OooO00o) {
                return ((OooO00o) tag).f5366OooO00o;
            }
            return null;
        }
    }

    @RequiresApi(30)
    public static class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final WindowInsetsAnimation f5379OooO0o0;

        @RequiresApi(30)
        public static class OooO00o extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Callback f5380OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public List<WindowInsetsAnimationCompat> f5381OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public ArrayList<WindowInsetsAnimationCompat> f5382OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> f5383OooO0Oo;

            public OooO00o(@NonNull Callback callback) {
                super(callback.getDispatchMode());
                this.f5383OooO0Oo = new HashMap<>();
                this.f5380OooO00o = callback;
            }

            @NonNull
            public final WindowInsetsAnimationCompat OooO00o(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f5383OooO0Oo.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = new WindowInsetsAnimationCompat(windowInsetsAnimation);
                this.f5383OooO0Oo.put(windowInsetsAnimation, windowInsetsAnimationCompat2);
                return windowInsetsAnimationCompat2;
            }

            public final void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f5380OooO00o.onEnd(OooO00o(windowInsetsAnimation));
                this.f5383OooO0Oo.remove(windowInsetsAnimation);
            }

            public final void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f5380OooO00o.onPrepare(OooO00o(windowInsetsAnimation));
            }

            @NonNull
            public final WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.f5382OooO0OO;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.f5382OooO0OO = arrayList2;
                    this.f5381OooO0O0 = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return this.f5380OooO00o.onProgress(WindowInsetsCompat.OooOO0(null, windowInsets), this.f5381OooO0O0).OooO();
                    }
                    WindowInsetsAnimation windowInsetsAnimationOooO00o = o00O0O0.OooO00o(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatOooO00o = OooO00o(windowInsetsAnimationOooO00o);
                    windowInsetsAnimationCompatOooO00o.f5360OooO00o.OooO0Oo(windowInsetsAnimationOooO00o.getFraction());
                    this.f5382OooO0OO.add(windowInsetsAnimationCompatOooO00o);
                }
            }

            @NonNull
            public final WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                OooO00o oooO00oOnStart = this.f5380OooO00o.onStart(OooO00o(windowInsetsAnimation), new OooO00o(bounds));
                oooO00oOnStart.getClass();
                oo00o.OooO00o();
                return o00O00o0.OooO00o(oooO00oOnStart.f5361OooO00o.OooO0Oo(), oooO00oOnStart.f5362OooO0O0.OooO0Oo());
            }
        }

        public OooO0OO(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f5379OooO0o0 = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final long OooO00o() {
            return this.f5379OooO0o0.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final float OooO0O0() {
            return this.f5379OooO0o0.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final int OooO0OO() {
            return this.f5379OooO0o0.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final void OooO0Oo(float f) {
            this.f5379OooO0o0.setFraction(f);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5384OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f5385OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Interpolator f5386OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f5387OooO0Oo;

        public OooO0o(int i, @Nullable Interpolator interpolator, long j) {
            this.f5384OooO00o = i;
            this.f5386OooO0OO = interpolator;
            this.f5387OooO0Oo = j;
        }

        public long OooO00o() {
            return this.f5387OooO0Oo;
        }

        public float OooO0O0() {
            Interpolator interpolator = this.f5386OooO0OO;
            return interpolator != null ? interpolator.getInterpolation(this.f5385OooO0O0) : this.f5385OooO0O0;
        }

        public int OooO0OO() {
            return this.f5384OooO00o;
        }

        public void OooO0Oo(float f) {
            this.f5385OooO0O0 = f;
        }
    }

    public WindowInsetsAnimationCompat(int i, @Nullable Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5360OooO00o = new OooO0OO(o00O00OO.OooO00o(i, interpolator, j));
        } else {
            this.f5360OooO00o = new OooO0O0(i, interpolator, j);
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final p052o00000oO.OooOO0O f5361OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final p052o00000oO.OooOO0O f5362OooO0O0;

        public OooO00o(@NonNull p052o00000oO.OooOO0O oooOO0O, @NonNull p052o00000oO.OooOO0O oooOO0O2) {
            this.f5361OooO00o = oooOO0O;
            this.f5362OooO0O0 = oooOO0O2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f5361OooO00o + " upper=" + this.f5362OooO0O0 + "}";
        }

        @RequiresApi(30)
        public OooO00o(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.f5361OooO00o = p052o00000oO.OooOO0O.OooO0OO(bounds.getLowerBound());
            this.f5362OooO0O0 = p052o00000oO.OooOO0O.OooO0OO(bounds.getUpperBound());
        }
    }

    @RequiresApi(30)
    public WindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5360OooO00o = new OooO0OO(windowInsetsAnimation);
        }
    }
}
