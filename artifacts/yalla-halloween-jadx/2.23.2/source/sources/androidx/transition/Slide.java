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
import androidx.core.view.o000OOo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import oOO00O.o000oOoO;
import oOO00O.o00oO0o;
import oOO00O.o0OoOo0;
import org.xmlpull.v1.XmlPullParser;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class Slide extends Visibility {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooOO0O f11296OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final DecelerateInterpolator f11288OooOooo = new DecelerateInterpolator();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final AccelerateInterpolator f11290Oooo000 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO00o f11291Oooo00O = new OooO00o();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO0O0 f11292Oooo00o = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO0OO f11289Oooo0 = new OooO0OO();

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO0o f11293Oooo0O0 = new OooO0o();

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final OooO f11294Oooo0OO = new OooO();

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final OooOO0 f11295Oooo0o0 = new OooOO0();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface GravityFlag {
    }

    public class OooO extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(View view, ViewGroup viewGroup) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            return ViewCompat.OooO.OooO0Oo(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class OooO00o extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class OooO0O0 extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(View view, ViewGroup viewGroup) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            return ViewCompat.OooO.OooO0Oo(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class OooO0OO extends OooOOO {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public class OooO0o extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class OooOO0 extends OooOOO {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface OooOO0O {
        float OooO00o(View view, ViewGroup viewGroup);

        float OooO0O0(View view, ViewGroup viewGroup);
    }

    public static abstract class OooOOO implements OooOO0O {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    public static abstract class OooOOO0 implements OooOO0O {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO0O0(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    public Slide() {
        this.f11296OooOooO = f11295Oooo0o0;
        Oooo0oo(80);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
        int[] iArr = new int[2];
        o00oo0o2.f60158OooO0O0.getLocationOnScreen(iArr);
        o00oo0o2.f60157OooO00o.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO0o(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
        int[] iArr = new int[2];
        o00oo0o2.f60158OooO0O0.getLocationOnScreen(iArr);
        o00oo0o2.f60157OooO00o.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0o(ViewGroup viewGroup, View view, o00oO0o o00oo0o2, o00oO0o o00oo0o3) {
        if (o00oo0o3 == null) {
            return null;
        }
        int[] iArr = (int[]) o00oo0o3.f60157OooO00o.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return OooOOOO.OooO00o(view, o00oo0o3, iArr[0], iArr[1], this.f11296OooOooO.OooO00o(view, viewGroup), this.f11296OooOooO.OooO0O0(view, viewGroup), translationX, translationY, f11288OooOooo, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, o00oO0o o00oo0o2) {
        if (o00oo0o2 == null) {
            return null;
        }
        int[] iArr = (int[]) o00oo0o2.f60157OooO00o.get("android:slide:screenPosition");
        return OooOOOO.OooO00o(view, o00oo0o2, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f11296OooOooO.OooO00o(view, viewGroup), this.f11296OooOooO.OooO0O0(view, viewGroup), f11290Oooo000, this);
    }

    public final void Oooo0oo(int i) {
        if (i == 3) {
            this.f11296OooOooO = f11291Oooo00O;
        } else if (i == 5) {
            this.f11296OooOooO = f11293Oooo0O0;
        } else if (i == 48) {
            this.f11296OooOooO = f11289Oooo0;
        } else if (i == 80) {
            this.f11296OooOooO = f11295Oooo0o0;
        } else if (i == 8388611) {
            this.f11296OooOooO = f11292Oooo00o;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f11296OooOooO = f11294Oooo0OO;
        }
        o000oOoO o000oooo2 = new o000oOoO();
        o000oooo2.f60153OooO0O0 = i;
        this.f11319OooOo0O = o000oooo2;
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11296OooOooO = f11295Oooo0o0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60168OooO0o);
        int iOooO0o0 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        Oooo0oo(iOooO0o0);
    }
}
