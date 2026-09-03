package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o000O0O0.o0OOO0o;
import p069o0000oo0.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o f7890OooO00o;

    public static abstract class Callback {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public WindowInsets f7891Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f7892Oooo0oO;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DispatchMode {
        }

        public Callback(int i) {
            this.f7892Oooo0oO = i;
        }

        public abstract void OooO0O0(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat);

        public abstract void OooO0OO(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat);

        @NonNull
        public abstract WindowInsetsCompat OooO0Oo(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list);

        @NonNull
        public abstract OooO00o OooO0o0(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull OooO00o oooO00o);
    }

    @RequiresApi(21)
    public static class OooO0O0 extends OooO0o {

        @RequiresApi(21)
        public static class OooO00o implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Callback f7895OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public WindowInsetsCompat f7896OooO0O0;

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0047OooO00o implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public final /* synthetic */ int f7897Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f7898Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f7899Oooo0oO;

                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f7900Oooo0oo;

                /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                public final /* synthetic */ View f7901OoooO00;

                public C0047OooO00o(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
                    this.f7898Oooo0o = windowInsetsAnimationCompat;
                    this.f7899Oooo0oO = windowInsetsCompat;
                    this.f7900Oooo0oo = windowInsetsCompat2;
                    this.f7897Oooo = i;
                    this.f7901OoooO00 = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    WindowInsetsCompat.OooO oooO0OO;
                    this.f7898Oooo0o.OooO00o(valueAnimator.getAnimatedFraction());
                    WindowInsetsCompat windowInsetsCompat = this.f7899Oooo0oO;
                    WindowInsetsCompat windowInsetsCompat2 = this.f7900Oooo0oo;
                    float fOooO0O0 = this.f7898Oooo0o.f7890OooO00o.OooO0O0();
                    int i = this.f7897Oooo;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30) {
                        oooO0OO = new WindowInsetsCompat.OooO0o(windowInsetsCompat);
                    } else {
                        oooO0OO = i2 >= 29 ? new WindowInsetsCompat.OooO0OO(windowInsetsCompat) : new WindowInsetsCompat.OooO0O0(windowInsetsCompat);
                    }
                    int i3 = 1;
                    while (i3 <= 256) {
                        if ((i & i3) == 0) {
                            oooO0OO.OooO0OO(i3, windowInsetsCompat.OooO0Oo(i3));
                        } else {
                            p071o000O0o.OooO oooOOooO0Oo = windowInsetsCompat.OooO0Oo(i3);
                            p071o000O0o.OooO oooOOooO0Oo2 = windowInsetsCompat2.OooO0Oo(i3);
                            float f = 1.0f - fOooO0O0;
                            oooO0OO.OooO0OO(i3, WindowInsetsCompat.OooOO0(oooOOooO0Oo, (int) (((double) ((oooOOooO0Oo.f28162OooO00o - oooOOooO0Oo2.f28162OooO00o) * f)) + 0.5d), (int) (((double) ((oooOOooO0Oo.f28163OooO0O0 - oooOOooO0Oo2.f28163OooO0O0) * f)) + 0.5d), (int) (((double) ((oooOOooO0Oo.f28164OooO0OO - oooOOooO0Oo2.f28164OooO0OO) * f)) + 0.5d), (int) (((double) ((oooOOooO0Oo.f28165OooO0Oo - oooOOooO0Oo2.f28165OooO0Oo) * f)) + 0.5d)));
                        }
                        i3 <<= 1;
                        windowInsetsCompat2 = windowInsetsCompat2;
                        fOooO0O0 = fOooO0O0;
                        windowInsetsCompat = windowInsetsCompat;
                    }
                    OooO0O0.OooO0oO(this.f7901OoooO00, oooO0OO.OooO0O0(), Collections.singletonList(this.f7898Oooo0o));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            public class C0048OooO0O0 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f7902Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ View f7903Oooo0oO;

                public C0048OooO0O0(WindowInsetsAnimationCompat windowInsetsAnimationCompat, View view) {
                    this.f7902Oooo0o = windowInsetsAnimationCompat;
                    this.f7903Oooo0oO = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.f7902Oooo0o.OooO00o(1.0f);
                    OooO0O0.OooO0o0(this.f7903Oooo0oO, this.f7902Oooo0o);
                }
            }

            public class OooO0OO implements Runnable {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f7904Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ View f7905Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f7906Oooo0oO;

                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                public final /* synthetic */ OooO00o f7907Oooo0oo;

                public OooO0OO(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, OooO00o oooO00o, ValueAnimator valueAnimator) {
                    this.f7905Oooo0o = view;
                    this.f7906Oooo0oO = windowInsetsAnimationCompat;
                    this.f7907Oooo0oo = oooO00o;
                    this.f7904Oooo = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OooO0O0.OooO0oo(this.f7905Oooo0o, this.f7906Oooo0oO, this.f7907Oooo0oo);
                    this.f7904Oooo.start();
                }
            }

            public OooO00o(@NonNull View view, @NonNull Callback callback) {
                WindowInsetsCompat windowInsetsCompatOooO0O0;
                this.f7895OooO00o = callback;
                WindowInsetsCompat windowInsetsCompatOooOOO0 = ViewCompat.OooOOO0(view);
                if (windowInsetsCompatOooOOO0 != null) {
                    int i = Build.VERSION.SDK_INT;
                    windowInsetsCompatOooO0O0 = (i >= 30 ? new WindowInsetsCompat.OooO0o(windowInsetsCompatOooOOO0) : i >= 29 ? new WindowInsetsCompat.OooO0OO(windowInsetsCompatOooOOO0) : new WindowInsetsCompat.OooO0O0(windowInsetsCompatOooOOO0)).OooO0O0();
                } else {
                    windowInsetsCompatOooO0O0 = null;
                }
                this.f7896OooO0O0 = windowInsetsCompatOooO0O0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f7896OooO0O0 = WindowInsetsCompat.OooOOOO(windowInsets, view);
                    return OooO0O0.OooO(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompatOooOOOO = WindowInsetsCompat.OooOOOO(windowInsets, view);
                if (this.f7896OooO0O0 == null) {
                    this.f7896OooO0O0 = ViewCompat.OooOOO0(view);
                }
                if (this.f7896OooO0O0 == null) {
                    this.f7896OooO0O0 = windowInsetsCompatOooOOOO;
                    return OooO0O0.OooO(view, windowInsets);
                }
                Callback callbackOooOO0 = OooO0O0.OooOO0(view);
                if (callbackOooOO0 != null && Objects.equals(callbackOooOO0.f7891Oooo0o, windowInsets)) {
                    return OooO0O0.OooO(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f7896OooO0O0;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!windowInsetsCompatOooOOOO.OooO0Oo(i2).equals(windowInsetsCompat.OooO0Oo(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return OooO0O0.OooO(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f7896OooO0O0;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i, new DecelerateInterpolator(), 160L);
                windowInsetsAnimationCompat.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                ValueAnimator duration = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f).setDuration(windowInsetsAnimationCompat.f7890OooO00o.OooO00o());
                p071o000O0o.OooO oooOOooO0Oo = windowInsetsCompatOooOOOO.OooO0Oo(i);
                p071o000O0o.OooO oooOOooO0Oo2 = windowInsetsCompat2.OooO0Oo(i);
                OooO00o oooO00o = new OooO00o(p071o000O0o.OooO.OooO0O0(Math.min(oooOOooO0Oo.f28162OooO00o, oooOOooO0Oo2.f28162OooO00o), Math.min(oooOOooO0Oo.f28163OooO0O0, oooOOooO0Oo2.f28163OooO0O0), Math.min(oooOOooO0Oo.f28164OooO0OO, oooOOooO0Oo2.f28164OooO0OO), Math.min(oooOOooO0Oo.f28165OooO0Oo, oooOOooO0Oo2.f28165OooO0Oo)), p071o000O0o.OooO.OooO0O0(Math.max(oooOOooO0Oo.f28162OooO00o, oooOOooO0Oo2.f28162OooO00o), Math.max(oooOOooO0Oo.f28163OooO0O0, oooOOooO0Oo2.f28163OooO0O0), Math.max(oooOOooO0Oo.f28164OooO0OO, oooOOooO0Oo2.f28164OooO0OO), Math.max(oooOOooO0Oo.f28165OooO0Oo, oooOOooO0Oo2.f28165OooO0Oo)));
                OooO0O0.OooO0o(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new C0047OooO00o(windowInsetsAnimationCompat, windowInsetsCompatOooOOOO, windowInsetsCompat2, i, view));
                duration.addListener(new C0048OooO0O0(windowInsetsAnimationCompat, view));
                o0OOO0o.OooO00o(view, new OooO0OO(view, windowInsetsAnimationCompat, oooO00o, duration));
                this.f7896OooO0O0 = windowInsetsCompatOooOOOO;
                return OooO0O0.OooO(view, windowInsets);
            }
        }

        public OooO0O0(int i, @Nullable Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @NonNull
        public static WindowInsets OooO(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(o000OO0O.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static void OooO0o(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            Callback callbackOooOO0 = OooOO0(view);
            if (callbackOooOO0 != null) {
                callbackOooOO0.f7891Oooo0o = windowInsets;
                if (!z) {
                    callbackOooOO0.OooO0OO(windowInsetsAnimationCompat);
                    z = callbackOooOO0.f7892Oooo0oO == 0;
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
                callbackOooOO0.OooO0O0(windowInsetsAnimationCompat);
                if (callbackOooOO0.f7892Oooo0oO == 0) {
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
                windowInsetsCompat = callbackOooOO0.OooO0Oo(windowInsetsCompat, list);
                if (callbackOooOO0.f7892Oooo0oO == 0) {
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
                callbackOooOO0.OooO0o0(windowInsetsAnimationCompat, oooO00o);
                if (callbackOooOO0.f7892Oooo0oO == 0) {
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
            Object tag = view.getTag(o000OO0O.tag_window_insets_animation_callback);
            if (tag instanceof OooO00o) {
                return ((OooO00o) tag).f7895OooO00o;
            }
            return null;
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7913OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f7914OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Interpolator f7915OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f7916OooO0Oo;

        public OooO0o(int i, @Nullable Interpolator interpolator, long j) {
            this.f7913OooO00o = i;
            this.f7915OooO0OO = interpolator;
            this.f7916OooO0Oo = j;
        }

        public long OooO00o() {
            return this.f7916OooO0Oo;
        }

        public float OooO0O0() {
            Interpolator interpolator = this.f7915OooO0OO;
            return interpolator != null ? interpolator.getInterpolation(this.f7914OooO0O0) : this.f7914OooO0O0;
        }

        public int OooO0OO() {
            return this.f7913OooO00o;
        }

        public void OooO0Oo(float f) {
            this.f7914OooO0O0 = f;
        }
    }

    public WindowInsetsAnimationCompat(int i, @Nullable Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7890OooO00o = new OooO0OO(i, interpolator, j);
        } else {
            this.f7890OooO00o = new OooO0O0(i, interpolator, j);
        }
    }

    public final void OooO00o(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f7890OooO00o.OooO0Oo(f);
    }

    @RequiresApi(30)
    public static class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final WindowInsetsAnimation f7908OooO0o0;

        @RequiresApi(30)
        public static class OooO00o extends WindowInsetsAnimation.Callback {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Callback f7909OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public List<WindowInsetsAnimationCompat> f7910OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public ArrayList<WindowInsetsAnimationCompat> f7911OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> f7912OooO0Oo;

            public OooO00o(@NonNull Callback callback) {
                super(callback.f7892Oooo0oO);
                this.f7912OooO0Oo = new HashMap<>();
                this.f7909OooO00o = callback;
            }

            @NonNull
            public final WindowInsetsAnimationCompat OooO00o(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f7912OooO0Oo.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        windowInsetsAnimationCompat.f7890OooO00o = new OooO0OO(windowInsetsAnimation);
                    }
                    this.f7912OooO0Oo.put(windowInsetsAnimation, windowInsetsAnimationCompat);
                }
                return windowInsetsAnimationCompat;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f7909OooO00o.OooO0O0(OooO00o(windowInsetsAnimation));
                this.f7912OooO0Oo.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f7909OooO00o.OooO0OO(OooO00o(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public final WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.f7911OooO0OO;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.f7911OooO0OO = arrayList2;
                    this.f7910OooO0O0 = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatOooO00o = OooO00o(windowInsetsAnimation);
                    windowInsetsAnimationCompatOooO00o.OooO00o(windowInsetsAnimation.getFraction());
                    this.f7911OooO0OO.add(windowInsetsAnimationCompatOooO00o);
                }
                return this.f7909OooO00o.OooO0Oo(WindowInsetsCompat.OooOOOO(windowInsets, null), this.f7910OooO0O0).OooOOO();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public final WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                OooO00o oooO00oOooO0o0 = this.f7909OooO00o.OooO0o0(OooO00o(windowInsetsAnimation), new OooO00o(bounds));
                Objects.requireNonNull(oooO00oOooO0o0);
                return OooO0OO.OooO0o0(oooO00oOooO0o0);
            }
        }

        public OooO0OO(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f7908OooO0o0 = windowInsetsAnimation;
        }

        @NonNull
        public static p071o000O0o.OooO OooO0o(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return p071o000O0o.OooO.OooO0Oo(bounds.getUpperBound());
        }

        @NonNull
        public static WindowInsetsAnimation.Bounds OooO0o0(@NonNull OooO00o oooO00o) {
            return new WindowInsetsAnimation.Bounds(oooO00o.f7893OooO00o.OooO0o0(), oooO00o.f7894OooO0O0.OooO0o0());
        }

        @NonNull
        public static p071o000O0o.OooO OooO0oO(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return p071o000O0o.OooO.OooO0Oo(bounds.getLowerBound());
        }

        public static void OooO0oo(@NonNull View view, @Nullable Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new OooO00o(callback) : null);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final long OooO00o() {
            return this.f7908OooO0o0.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final float OooO0O0() {
            return this.f7908OooO0o0.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final int OooO0OO() {
            return this.f7908OooO0o0.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.OooO0o
        public final void OooO0Oo(float f) {
            this.f7908OooO0o0.setFraction(f);
        }

        public OooO0OO(int i, Interpolator interpolator, long j) {
            WindowInsetsAnimation windowInsetsAnimation = new WindowInsetsAnimation(i, interpolator, j);
            super(0, null, 0L);
            this.f7908OooO0o0 = windowInsetsAnimation;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final p071o000O0o.OooO f7893OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final p071o000O0o.OooO f7894OooO0O0;

        public OooO00o(@NonNull p071o000O0o.OooO oooO, @NonNull p071o000O0o.OooO oooO2) {
            this.f7893OooO00o = oooO;
            this.f7894OooO0O0 = oooO2;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Bounds{lower=");
            sbOooO0o0.append(this.f7893OooO00o);
            sbOooO0o0.append(" upper=");
            sbOooO0o0.append(this.f7894OooO0O0);
            sbOooO0o0.append("}");
            return sbOooO0o0.toString();
        }

        @RequiresApi(30)
        public OooO00o(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.f7893OooO00o = OooO0OO.OooO0oO(bounds);
            this.f7894OooO0O0 = OooO0OO.OooO0o(bounds);
        }
    }
}
