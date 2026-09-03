package androidx.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import org.xmlpull.v1.XmlPullParser;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000Oo;
import p101o000oOoo.oO000Oo0;
import p101o000oOoo.oO00O0o;

/* JADX INFO: loaded from: classes.dex */
public class Slide extends Visibility {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public OooOO0O f9554o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final DecelerateInterpolator f9546o00Oo0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final AccelerateInterpolator f9547o00Ooo = new AccelerateInterpolator();

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static final OooO00o f9548o00o0O = new OooO00o();

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final OooO0O0 f9551o00ooo = new OooO0O0();

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final OooO0OO f9553oo000o = new OooO0OO();

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final OooO0o f9550o00oO0o = new OooO0o();

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static final OooO f9549o00oO0O = new OooO();

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public static final OooOO0 f9552o0ooOO0 = new OooOO0();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface GravityFlag {
    }

    public class OooO extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(ViewGroup viewGroup, View view) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooO.OooO0Oo(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class OooO00o extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class OooO0O0 extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(ViewGroup viewGroup, View view) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooO.OooO0Oo(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class OooO0OO extends OooOOO {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public class OooO0o extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class OooOO0 extends OooOOO {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface OooOO0O {
        float OooO00o(ViewGroup viewGroup, View view);

        float OooO0O0(ViewGroup viewGroup, View view);
    }

    public static abstract class OooOOO implements OooOO0O {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public static abstract class OooOOO0 implements OooOO0O {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public Slide() {
        this.f9554o00O0O = f9552o0ooOO0;
        OoooO00(80);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
        int[] iArr = new int[2];
        oo00o0o.f29743OooO0O0.getLocationOnScreen(iArr);
        oo00o0o.f29742OooO00o.put("android:slide:screenPosition", iArr);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
        int[] iArr = new int[2];
        oo00o0o.f29743OooO0O0.getLocationOnScreen(iArr);
        oo00o0o.f29742OooO00o.put("android:slide:screenPosition", iArr);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, oO00O0o oo00o0o, oO00O0o oo00o0o2) {
        if (oo00o0o2 == null) {
            return null;
        }
        int[] iArr = (int[]) oo00o0o2.f29742OooO00o.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return androidx.transition.OooOOO0.OooO00o(view, oo00o0o2, iArr[0], iArr[1], this.f9554o00O0O.OooO0O0(viewGroup, view), this.f9554o00O0O.OooO00o(viewGroup, view), translationX, translationY, f9546o00Oo0, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oo(ViewGroup viewGroup, View view, oO00O0o oo00o0o) {
        if (oo00o0o == null) {
            return null;
        }
        int[] iArr = (int[]) oo00o0o.f29742OooO00o.get("android:slide:screenPosition");
        return androidx.transition.OooOOO0.OooO00o(view, oo00o0o, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f9554o00O0O.OooO0O0(viewGroup, view), this.f9554o00O0O.OooO00o(viewGroup, view), f9547o00Ooo, this);
    }

    public final void OoooO00(int i) {
        if (i == 3) {
            this.f9554o00O0O = f9548o00o0O;
        } else if (i == 5) {
            this.f9554o00O0O = f9550o00oO0o;
        } else if (i == 48) {
            this.f9554o00O0O = f9553oo000o;
        } else if (i == 80) {
            this.f9554o00O0O = f9552o0ooOO0;
        } else if (i == 8388611) {
            this.f9554o00O0O = f9551o00ooo;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f9554o00O0O = f9549o00oO0O;
        }
        oO000Oo0 oo000oo0 = new oO000Oo0();
        oo000oo0.f29739OooO0O0 = i;
        this.f9575OooooOO = oo000oo0;
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9554o00O0O = f9552o0ooOO0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29735OooO0o);
        int iOooO0o = o00oO0o.OooO0o(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        OoooO00(iOooO0o);
    }
}
