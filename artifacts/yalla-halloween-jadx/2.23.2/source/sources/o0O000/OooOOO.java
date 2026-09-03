package o0O000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p190o00o0O.OooOo<String, OooOOOO> f40888OooO00o = new p190o00o0O.OooOo<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p190o00o0O.OooOo<String, PropertyValuesHolder[]> f40889OooO0O0 = new p190o00o0O.OooOo<>();

    @Nullable
    public static OooOOO OooO00o(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return OooO0O0(resourceId, context);
    }

    @Nullable
    public static OooOOO OooO0O0(@AnimatorRes int i, @NonNull Context context) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return OooO0OO(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return OooO0OO(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @NonNull
    public static OooOOO OooO0OO(@NonNull ArrayList arrayList) {
        OooOOO oooOOO = new OooOOO();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            oooOOO.OooO0oo(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = OooO0O0.f40881OooO0O0;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = OooO0O0.f40882OooO0OO;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = OooO0O0.f40883OooO0Oo;
            }
            OooOOOO oooOOOO = new OooOOOO(startDelay, duration, interpolator);
            oooOOOO.f40896OooO0Oo = objectAnimator.getRepeatCount();
            oooOOOO.f40897OooO0o0 = objectAnimator.getRepeatMode();
            oooOOO.f40888OooO00o.put(propertyName, oooOOOO);
        }
        return oooOOO;
    }

    @NonNull
    public final ObjectAnimator OooO0Oo(@NonNull String str, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, OooO0o0(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        OooO0o(str).OooO00o(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final OooOOOO OooO0o(String str) {
        p190o00o0O.OooOo<String, OooOOOO> oooOo = this.f40888OooO00o;
        if (oooOo.getOrDefault(str, null) != null) {
            return oooOo.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public final PropertyValuesHolder[] OooO0o0(String str) {
        if (!OooO0oO(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] orDefault = this.f40889OooO0O0.getOrDefault(str, null);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
        for (int i = 0; i < orDefault.length; i++) {
            propertyValuesHolderArr[i] = orDefault[i].clone();
        }
        return propertyValuesHolderArr;
    }

    public final boolean OooO0oO(String str) {
        return this.f40889OooO0O0.getOrDefault(str, null) != null;
    }

    public final void OooO0oo(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f40889OooO0O0.put(str, propertyValuesHolderArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOOO) {
            return this.f40888OooO00o.equals(((OooOOO) obj).f40888OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40888OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        return "\n" + OooOOO.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f40888OooO00o + "}\n";
    }
}
