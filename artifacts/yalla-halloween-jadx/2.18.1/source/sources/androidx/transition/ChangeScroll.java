package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p101o000oOoo.oO00O0o;

/* JADX INFO: loaded from: classes.dex */
public class ChangeScroll extends Transition {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final String[] f9469o0OoOo0 = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (oo00o0o == null || oo00o0o2 == null) {
            return null;
        }
        View view = oo00o0o2.f29743OooO0O0;
        int iIntValue = ((Integer) oo00o0o.f29742OooO00o.get("android:changeScroll:x")).intValue();
        int iIntValue2 = ((Integer) oo00o0o2.f29742OooO00o.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) oo00o0o.f29742OooO00o.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) oo00o0o2.f29742OooO00o.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return OooOO0O.OooO0O0(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public final String[] OooOo00() {
        return f9469o0OoOo0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void Oooo0o0(oO00O0o oo00o0o) {
        oo00o0o.f29742OooO00o.put("android:changeScroll:x", Integer.valueOf(oo00o0o.f29743OooO0O0.getScrollX()));
        oo00o0o.f29742OooO00o.put("android:changeScroll:y", Integer.valueOf(oo00o0o.f29743OooO0O0.getScrollY()));
    }

    public ChangeScroll(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
