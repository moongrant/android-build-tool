package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import p078o000Oo0O.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeScroll extends Transition {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final String[] f8117OooOoo0 = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00000O0 o00000o1, @Nullable o00000O0 o00000o2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (o00000o1 == null || o00000o2 == null) {
            return null;
        }
        HashMap map = o00000o1.f34936OooO00o;
        int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
        HashMap map2 = o00000o2.f34936OooO00o;
        int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
        View view = o00000o2.f34937OooO0O0;
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
        boolean z = OooOOO.f8166OooO00o;
        if (objectAnimatorOfInt == null) {
            return objectAnimatorOfInt2;
        }
        if (objectAnimatorOfInt2 == null) {
            return objectAnimatorOfInt;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
        return animatorSet;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public final String[] OooOOoo() {
        return f8117OooOoo0;
    }

    public final void Oooo0o0(o00000O0 o00000o1) {
        HashMap map = o00000o1.f34936OooO00o;
        View view = o00000o1.f34937OooO0O0;
        map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    public ChangeScroll(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
