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
import androidx.core.view.o000O0Oo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p058o0000Ooo.oo000o;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0O0O00;
import p078o000Oo0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class Slide extends Visibility {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooOO0O f8202OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final DecelerateInterpolator f8194OooOooo = new DecelerateInterpolator();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final AccelerateInterpolator f8196Oooo000 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO00o f8197Oooo00O = new OooO00o();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO0O0 f8198Oooo00o = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO0OO f8195Oooo0 = new OooO0OO();

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO0o f8199Oooo0O0 = new OooO0o();

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final OooO f8200Oooo0OO = new OooO();

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final OooOO0 f8201Oooo0o0 = new OooOO0();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface GravityFlag {
    }

    public class OooO extends OooOOO0 {
        @Override // androidx.transition.Slide.OooOO0O
        public final float OooO00o(View view, ViewGroup viewGroup) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
        this.f8202OooOooO = f8201Oooo0o0;
        Oooo(80);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
        int[] iArr = new int[2];
        o00000o1.f34937OooO0O0.getLocationOnScreen(iArr);
        o00000o1.f34936OooO00o.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
        int[] iArr = new int[2];
        o00000o1.f34937OooO0O0.getLocationOnScreen(iArr);
        o00000o1.f34936OooO00o.put("android:slide:screenPosition", iArr);
    }

    public final void Oooo(int i) {
        if (i == 3) {
            this.f8202OooOooO = f8197Oooo00O;
        } else if (i == 5) {
            this.f8202OooOooO = f8199Oooo0O0;
        } else if (i == 48) {
            this.f8202OooOooO = f8195Oooo0;
        } else if (i == 80) {
            this.f8202OooOooO = f8201Oooo0o0;
        } else if (i == 8388611) {
            this.f8202OooOooO = f8198Oooo00o;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f8202OooOooO = f8200Oooo0OO;
        }
        oo0o0Oo oo0o0oo = new oo0o0Oo();
        oo0o0oo.f34985OooO0O0 = i;
        this.f8225OooOo0O = oo0o0oo;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, o00000O0 o00000o1, o00000O0 o00000o2) {
        if (o00000o2 == null) {
            return null;
        }
        int[] iArr = (int[]) o00000o2.f34936OooO00o.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return OooOOOO.OooO00o(view, o00000o2, iArr[0], iArr[1], this.f8202OooOooO.OooO00o(view, viewGroup), this.f8202OooOooO.OooO0O0(view, viewGroup), translationX, translationY, f8194OooOooo, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oo(ViewGroup viewGroup, View view, o00000O0 o00000o1) {
        if (o00000o1 == null) {
            return null;
        }
        int[] iArr = (int[]) o00000o1.f34936OooO00o.get("android:slide:screenPosition");
        return OooOOOO.OooO00o(view, o00000o1, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f8202OooOooO.OooO00o(view, viewGroup), this.f8202OooOooO.OooO0O0(view, viewGroup), f8196Oooo000, this);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8202OooOooO = f8201Oooo0o0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0O00.f34979OooO0o);
        int iOooO0o0 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        Oooo(iOooO0o0);
    }
}
