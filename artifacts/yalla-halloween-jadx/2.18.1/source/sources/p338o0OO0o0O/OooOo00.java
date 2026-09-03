package p338o0OO0o0O;

import OooO00o.OooO00o;
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
import java.util.ArrayList;
import java.util.List;
import p021OooOooo.o00oO0o;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o<String, OooOo> f37989OooO00o = new o00oO0o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00oO0o<String, PropertyValuesHolder[]> f37990OooO0O0 = new o00oO0o<>();

    @Nullable
    public static OooOo00 OooO00o(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return OooO0O0(context, resourceId);
    }

    @Nullable
    public static OooOo00 OooO0O0(@NonNull Context context, @AnimatorRes int i) {
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
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Can't load animation resource ID #0x");
            sbOooO0o0.append(Integer.toHexString(i));
            Log.w("MotionSpec", sbOooO0o0.toString(), e);
            return null;
        }
    }

    @NonNull
    public static OooOo00 OooO0OO(@NonNull List<Animator> list) {
        OooOo00 oooOo00 = new OooOo00();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            oooOo00.OooO0oo(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = OooO0o.f37973OooO0O0;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = OooO0o.f37974OooO0OO;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = OooO0o.f37975OooO0Oo;
            }
            OooOo oooOo = new OooOo(startDelay, duration, interpolator);
            oooOo.f37987OooO0Oo = objectAnimator.getRepeatCount();
            oooOo.f37988OooO0o0 = objectAnimator.getRepeatMode();
            oooOo00.f37989OooO00o.put(propertyName, oooOo);
        }
        return oooOo00;
    }

    @NonNull
    public final <T> ObjectAnimator OooO0Oo(@NonNull String str, @NonNull T t, @NonNull Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, OooO0o0(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        OooO0o(str).OooO00o(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final OooOo OooO0o(String str) {
        if (this.f37989OooO00o.getOrDefault(str, null) != null) {
            return this.f37989OooO00o.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public final PropertyValuesHolder[] OooO0o0(String str) {
        if (!OooO0oO(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] orDefault = this.f37990OooO0O0.getOrDefault(str, null);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
        for (int i = 0; i < orDefault.length; i++) {
            propertyValuesHolderArr[i] = orDefault[i].clone();
        }
        return propertyValuesHolderArr;
    }

    public final boolean OooO0oO(String str) {
        return this.f37990OooO0O0.getOrDefault(str, null) != null;
    }

    public final void OooO0oo(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f37990OooO0O0.put(str, propertyValuesHolderArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOo00) {
            return this.f37989OooO00o.equals(((OooOo00) obj).f37989OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37989OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('\n');
        sbOooO00o.append(OooOo00.class.getName());
        sbOooO00o.append('{');
        sbOooO00o.append(Integer.toHexString(System.identityHashCode(this)));
        sbOooO00o.append(" timings: ");
        sbOooO00o.append(this.f37989OooO00o);
        sbOooO00o.append("}\n");
        return sbOooO00o.toString();
    }
}
