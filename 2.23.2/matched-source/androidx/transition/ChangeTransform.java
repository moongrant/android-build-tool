package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import oOO00O.OooOo;
import oOO00O.o00oO0o;
import oOO00O.o0OO00O;
import oOO00O.o0OoOo0;
import oOO00O.oo0o0Oo;
import org.xmlpull.v1.XmlPullParser;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeTransform extends Transition {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String[] f11212OooOooo = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO00o f11213Oooo000 = new OooO00o();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO0O0 f11214Oooo00O = new OooO0O0();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final boolean f11215Oooo00o = true;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f11216OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f11217OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Matrix f11218OooOooO;

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f11219OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f11220OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f11221OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f11222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f11223OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f11224OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f11225OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f11226OooO0oo;

        public OooO(View view) {
            this.f11219OooO00o = view.getTranslationX();
            this.f11220OooO0O0 = view.getTranslationY();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            this.f11221OooO0OO = ViewCompat.OooOOO.OooOO0o(view);
            this.f11222OooO0Oo = view.getScaleX();
            this.f11224OooO0o0 = view.getScaleY();
            this.f11223OooO0o = view.getRotationX();
            this.f11225OooO0oO = view.getRotationY();
            this.f11226OooO0oo = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return oooO.f11219OooO00o == this.f11219OooO00o && oooO.f11220OooO0O0 == this.f11220OooO0O0 && oooO.f11221OooO0OO == this.f11221OooO0OO && oooO.f11222OooO0Oo == this.f11222OooO0Oo && oooO.f11224OooO0o0 == this.f11224OooO0o0 && oooO.f11223OooO0o == this.f11223OooO0o && oooO.f11225OooO0oO == this.f11225OooO0oO && oooO.f11226OooO0oo == this.f11226OooO0oo;
        }

        public final int hashCode() {
            float f = this.f11219OooO00o;
            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f11220OooO0O0;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f11221OooO0OO;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f11222OooO0Oo;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f11224OooO0o0;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f11223OooO0o;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f11225OooO0oO;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f11226OooO0oo;
            return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    public class OooO00o extends Property<OooO0o, float[]> {
        public OooO00o() {
            super(float[].class, "nonTranslations");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(OooO0o oooO0o) {
            return null;
        }

        @Override // android.util.Property
        public final void set(OooO0o oooO0o, float[] fArr) {
            OooO0o oooO0o2 = oooO0o;
            float[] fArr2 = fArr;
            oooO0o2.getClass();
            System.arraycopy(fArr2, 0, oooO0o2.f11231OooO0OO, 0, fArr2.length);
            oooO0o2.OooO00o();
        }
    }

    public class OooO0O0 extends Property<OooO0o, PointF> {
        public OooO0O0() {
            super(PointF.class, "translations");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(OooO0o oooO0o) {
            return null;
        }

        @Override // android.util.Property
        public final void set(OooO0o oooO0o, PointF pointF) {
            OooO0o oooO0o2 = oooO0o;
            PointF pointF2 = pointF;
            oooO0o2.getClass();
            oooO0o2.f11232OooO0Oo = pointF2.x;
            oooO0o2.f11233OooO0o0 = pointF2.y;
            oooO0o2.OooO00o();
        }
    }

    public static class OooO0OO extends OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f11227OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final oOO00O.OooO f11228OooO0o0;

        public OooO0OO(View view, oOO00O.OooO oooO) {
            this.f11227OooO0Oo = view;
            this.f11228OooO0o0 = oooO;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            this.f11228OooO0o0.setVisibility(4);
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
            this.f11228OooO0o0.setVisibility(0);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            transition.OooOo(this);
            int i = Build.VERSION.SDK_INT;
            View view = this.f11227OooO0Oo;
            if (i == 28) {
                if (!oOO00O.OooOO0O.f60130OooOO0) {
                    try {
                        if (!oOO00O.OooOO0O.f60126OooO0o) {
                            try {
                                oOO00O.OooOO0O.f60127OooO0o0 = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException e) {
                                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
                            }
                            oOO00O.OooOO0O.f60126OooO0o = true;
                        }
                        Method declaredMethod = oOO00O.OooOO0O.f60127OooO0o0.getDeclaredMethod("removeGhost", View.class);
                        oOO00O.OooOO0O.f60125OooO = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e2) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
                    }
                    oOO00O.OooOO0O.f60130OooOO0 = true;
                }
                Method method = oOO00O.OooOO0O.f60125OooO;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException(e3.getCause());
                    }
                }
            } else {
                int i2 = oOO00O.OooOOO0.f60132OooOO0;
                oOO00O.OooOOO0 oooOOO0 = (oOO00O.OooOOO0) view.getTag(OooOo.ghost_view);
                if (oooOOO0 != null) {
                    int i3 = oooOOO0.f60137OooO0oO - 1;
                    oooOOO0.f60137OooO0oO = i3;
                    if (i3 <= 0) {
                        ((oOO00O.OooOO0) oooOOO0.getParent()).removeView(oooOOO0);
                    }
                }
            }
            view.setTag(OooOo.transition_transform, null);
            view.setTag(OooOo.parent_matrix, null);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f11229OooO00o = new Matrix();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f11230OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float[] f11231OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f11232OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f11233OooO0o0;

        public OooO0o(View view, float[] fArr) {
            this.f11230OooO0O0 = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f11231OooO0OO = fArr2;
            this.f11232OooO0Oo = fArr2[2];
            this.f11233OooO0o0 = fArr2[5];
            OooO00o();
        }

        public final void OooO00o() {
            float f = this.f11232OooO0Oo;
            float[] fArr = this.f11231OooO0OO;
            fArr[2] = f;
            fArr[5] = this.f11233OooO0o0;
            Matrix matrix = this.f11229OooO00o;
            matrix.setValues(fArr);
            oo0o0Oo.f60176OooO00o.OooO0Oo(this.f11230OooO0O0, matrix);
        }
    }

    public ChangeTransform() {
        this.f11217OooOoo0 = true;
        this.f11216OooOoo = true;
        this.f11218OooOooO = new Matrix();
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
        if (f11215Oooo00o) {
            return;
        }
        View view = o00oo0o2.f60158OooO0O0;
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03c1 A[PHI: r4 r16 r18 r19 r21 r27 r29
      0x03c1: PHI (r4v15 char) = (r4v14 char), (r4v25 char), (r4v29 char) binds: [B:163:0x03be, B:234:0x03c1, B:123:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x03c1: PHI (r16v8 int) = (r16v7 int), (r16v13 int), (r16v14 int) binds: [B:163:0x03be, B:234:0x03c1, B:123:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x03c1: PHI (r18v4 int) = (r18v3 int), (r18v11 int), (r18v13 int) binds: [B:163:0x03be, B:234:0x03c1, B:123:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x03c1: PHI (r19v10 boolean) = (r19v9 boolean), (r19v15 boolean), (r19v17 boolean) binds: [B:163:0x03be, B:234:0x03c1, B:123:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x03c1: PHI (r21v9 android.view.View) = (r21v8 android.view.View), (r21v17 android.view.View), (r21v19 android.view.View) binds: [B:163:0x03be, B:234:0x03c1, B:123:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x03c1: PHI (r27v5 java.util.ArrayList) = (r27v4 java.util.ArrayList), (r27v6 java.util.ArrayList), (r27v6 java.util.ArrayList) binds: [B:163:0x03be, B:234:0x03c1, B:123:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x03c1: PHI (r29v10 android.animation.Animator) = (r29v9 android.animation.Animator), (r29v12 android.animation.Animator), (r29v13 android.animation.Animator) binds: [B:163:0x03be, B:234:0x03c1, B:123:0x02fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:170:0x03da  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.transition.Transition
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00oO0o o00oo0o2, @Nullable o00oO0o o00oo0o3) {
        boolean z;
        View view;
        Object obj;
        ?? r13;
        Animator animator;
        Animator animator2;
        int i;
        boolean z2;
        View view2;
        ArrayList arrayList;
        Animator animator3;
        View view3;
        int i2;
        int i3;
        char c;
        int i4;
        int iIntValue;
        boolean z3;
        oOO00O.OooOO0 oooOO1;
        oOO00O.OooO oooO;
        char c2;
        char c3;
        View view4;
        oOO00O.OooOO0O oooOO0O;
        boolean z4;
        if (o00oo0o2 == null || o00oo0o3 == null) {
            return null;
        }
        HashMap map = o00oo0o2.f60157OooO00o;
        if (!map.containsKey("android:changeTransform:parent")) {
            return null;
        }
        HashMap map2 = o00oo0o3.f60157OooO00o;
        if (!map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view5 = (ViewGroup) map2.get("android:changeTransform:parent");
        if (!this.f11216OooOoo) {
            z = false;
        } else if (OooOo0(viewGroup2)) {
            z4 = false;
            if (z4) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z4 = false;
            if (z4) {
                z = true;
            } else {
                z = false;
            }
        }
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        View view6 = o00oo0o3.f60158OooO0O0;
        if (z) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view6.setTag(OooOo.parent_matrix, matrix3);
            Matrix matrix4 = this.f11218OooOooO;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = oOO00O.OooOo00.f60141OooO00o;
        }
        if (matrix7 == null) {
            matrix7 = oOO00O.OooOo00.f60141OooO00o;
        }
        Matrix matrix8 = matrix7;
        if (matrix6.equals(matrix8)) {
            view = view6;
            animator = null;
            r13 = 1;
            obj = "android:changeTransform:parentMatrix";
        } else {
            OooO oooO2 = (OooO) map2.get("android:changeTransform:transforms");
            view6.setTranslationX(0.0f);
            view6.setTranslationY(0.0f);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOOO.OooOo0o(view6, 0.0f);
            view6.setScaleX(1.0f);
            view6.setScaleY(1.0f);
            view6.setRotationX(0.0f);
            view6.setRotationY(0.0f);
            view6.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix8.getValues(fArr2);
            OooO0o oooO0o = new OooO0o(view6, fArr);
            view = view6;
            Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(oooO0o, PropertyValuesHolder.ofObject(f11213Oooo000, new oOO00O.OooO0OO(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(f11214Oooo00O, (TypeConverter) null, this.f11316OooOo.OooO00o(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            r13 = 1;
            androidx.transition.OooO00o oooO00o = new androidx.transition.OooO00o(this, z, matrix8, view, oooO2, oooO0o);
            animatorOfPropertyValuesHolder.addListener(oooO00o);
            animatorOfPropertyValuesHolder.addPauseListener(oooO00o);
            animator = animatorOfPropertyValuesHolder;
        }
        boolean z5 = f11215Oooo00o;
        View view7 = o00oo0o2.f60158OooO0O0;
        if (z && animator != null && this.f11217OooOoo0) {
            Matrix matrix9 = new Matrix((Matrix) map2.get(obj));
            oo0o0Oo.f60176OooO00o.OooO0o(viewGroup, matrix9);
            if (Build.VERSION.SDK_INT == 28) {
                if (oOO00O.OooOO0O.f60129OooO0oo) {
                    c2 = 2;
                    c3 = 0;
                } else {
                    try {
                        if (!oOO00O.OooOO0O.f60126OooO0o) {
                            try {
                                oOO00O.OooOO0O.f60127OooO0o0 = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException e) {
                                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
                            }
                            oOO00O.OooOO0O.f60126OooO0o = r13;
                        }
                        Class<?> cls = oOO00O.OooOO0O.f60127OooO0o0;
                        Class<?>[] clsArr = new Class[3];
                        c3 = 0;
                        try {
                            clsArr[0] = View.class;
                            clsArr[r13] = ViewGroup.class;
                            c2 = 2;
                            try {
                                clsArr[2] = Matrix.class;
                                Method declaredMethod = cls.getDeclaredMethod("addGhost", clsArr);
                                oOO00O.OooOO0O.f60128OooO0oO = declaredMethod;
                                declaredMethod.setAccessible(r13);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
                            }
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            c2 = 2;
                        }
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        c2 = 2;
                        c3 = 0;
                    }
                    oOO00O.OooOO0O.f60129OooO0oo = r13;
                }
                Method method = oOO00O.OooOO0O.f60128OooO0oO;
                if (method != null) {
                    try {
                        try {
                            Object[] objArr = new Object[3];
                            view4 = view;
                            try {
                                objArr[c3] = view4;
                                objArr[r13] = viewGroup;
                                objArr[c2] = matrix9;
                                oooOO0O = new oOO00O.OooOO0O((View) method.invoke(null, objArr));
                            } catch (IllegalAccessException unused) {
                                oooOO0O = null;
                            }
                        } catch (InvocationTargetException e5) {
                            throw new RuntimeException(e5.getCause());
                        }
                    } catch (IllegalAccessException unused2) {
                        view4 = view;
                    }
                } else {
                    view4 = view;
                    oooOO0O = null;
                }
                z2 = z5;
                animator2 = animator;
                view2 = view4;
                oooO = oooOO0O;
            } else {
                View view8 = view;
                int i5 = 0;
                int i6 = oOO00O.OooOOO0.f60132OooOO0;
                if (!(view8.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i7 = oOO00O.OooOO0.f60122OooO0o;
                oOO00O.OooOO0 oooOO2 = (oOO00O.OooOO0) viewGroup.getTag(OooOo.ghost_view_holder);
                oOO00O.OooOOO0 oooOOO0 = (oOO00O.OooOOO0) view8.getTag(OooOo.ghost_view);
                if (oooOOO0 == null || (oooOO1 = (oOO00O.OooOO0) oooOOO0.getParent()) == oooOO2) {
                    i = 0;
                } else {
                    i = oooOOO0.f60137OooO0oO;
                    oooOO1.removeView(oooOOO0);
                    oooOOO0 = null;
                }
                if (oooOOO0 == null) {
                    oooOOO0 = new oOO00O.OooOOO0(view8);
                    oooOOO0.f60138OooO0oo = matrix9;
                    if (oooOO2 == null) {
                        oooOO2 = new oOO00O.OooOO0(viewGroup);
                    } else {
                        if (!oooOO2.f60124OooO0o0) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        ViewGroup viewGroup3 = oooOO2.f60123OooO0Oo;
                        viewGroup3.getOverlay().remove(oooOO2);
                        viewGroup3.getOverlay().add(oooOO2);
                    }
                    oOO00O.OooOOO0.OooO0O0(viewGroup, oooOO2);
                    oOO00O.OooOOO0.OooO0O0(viewGroup, oooOOO0);
                    ArrayList arrayList2 = new ArrayList();
                    oOO00O.OooOO0.OooO00o(oooOOO0.f60135OooO0o, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int childCount = oooOO2.getChildCount() - r13;
                    int i8 = 0;
                    while (i8 <= childCount) {
                        int i9 = (i8 + childCount) / 2;
                        oOO00O.OooOO0.OooO00o(((oOO00O.OooOOO0) oooOO2.getChildAt(i9)).f60135OooO0o, arrayList3);
                        if (arrayList2.isEmpty() || arrayList3.isEmpty() || arrayList2.get(i5) != arrayList3.get(i5)) {
                            z5 = z5;
                            arrayList = arrayList2;
                            animator3 = animator;
                            view3 = view8;
                            i2 = i5;
                            i3 = childCount;
                            c = 2;
                        } else {
                            int iMin = Math.min(arrayList2.size(), arrayList3.size());
                            int i10 = 1;
                            while (true) {
                                if (i10 < iMin) {
                                    View view9 = (View) arrayList2.get(i10);
                                    arrayList = arrayList2;
                                    View view10 = (View) arrayList3.get(i10);
                                    if (view9 != view10) {
                                        ViewGroup viewGroup4 = (ViewGroup) view9.getParent();
                                        int childCount2 = viewGroup4.getChildCount();
                                        if (view9.getZ() != view10.getZ()) {
                                            z5 = z5;
                                            animator3 = animator;
                                            view3 = view8;
                                            i3 = childCount;
                                            c = 2;
                                            i2 = 0;
                                            if (view9.getZ() <= view10.getZ()) {
                                                i4 = i2;
                                            }
                                        } else {
                                            i3 = childCount;
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 < childCount2) {
                                                    int i12 = childCount2;
                                                    animator3 = animator;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        z5 = z5;
                                                        iIntValue = viewGroup4.getChildDrawingOrder(i11);
                                                        view3 = view8;
                                                        c = 2;
                                                        i2 = 0;
                                                    } else {
                                                        if (o0OO00O.f60162OooO0OO) {
                                                            view3 = view8;
                                                        } else {
                                                            try {
                                                                Class[] clsArr2 = new Class[2];
                                                                Class cls2 = Integer.TYPE;
                                                                clsArr2[0] = cls2;
                                                                view3 = view8;
                                                                try {
                                                                    clsArr2[1] = cls2;
                                                                    Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", clsArr2);
                                                                    o0OO00O.f60161OooO0O0 = declaredMethod2;
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused3) {
                                                                    z3 = true;
                                                                }
                                                            } catch (NoSuchMethodException unused4) {
                                                                view3 = view8;
                                                            }
                                                            z3 = true;
                                                            o0OO00O.f60162OooO0OO = z3;
                                                        }
                                                        Method method2 = o0OO00O.f60161OooO0O0;
                                                        if (method2 != null) {
                                                            c = 2;
                                                            try {
                                                                Object[] objArr2 = new Object[2];
                                                                i2 = 0;
                                                                try {
                                                                    objArr2[0] = Integer.valueOf(viewGroup4.getChildCount());
                                                                    objArr2[1] = Integer.valueOf(i11);
                                                                    iIntValue = ((Integer) method2.invoke(viewGroup4, objArr2)).intValue();
                                                                } catch (IllegalAccessException | InvocationTargetException unused5) {
                                                                    iIntValue = i11;
                                                                }
                                                            } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                i2 = 0;
                                                            }
                                                        } else {
                                                            c = 2;
                                                        }
                                                        i2 = 0;
                                                        iIntValue = i11;
                                                    }
                                                    View childAt = viewGroup4.getChildAt(iIntValue);
                                                    if (childAt == view9) {
                                                        i4 = i2;
                                                    } else if (childAt != view10) {
                                                        i11++;
                                                        childCount2 = i12;
                                                        animator = animator3;
                                                        z5 = z5;
                                                        view8 = view3;
                                                    }
                                                } else {
                                                    z5 = z5;
                                                    animator3 = animator;
                                                    view3 = view8;
                                                    c = 2;
                                                    i2 = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        i10++;
                                        arrayList2 = arrayList;
                                        animator = animator;
                                        i5 = 0;
                                    }
                                } else {
                                    z5 = z5;
                                    arrayList = arrayList2;
                                    animator3 = animator;
                                    view3 = view8;
                                    i2 = i5;
                                    i3 = childCount;
                                    c = 2;
                                    if (arrayList3.size() != iMin) {
                                        i4 = i2;
                                    }
                                }
                                if (i4 != 0) {
                                    i8 = i9 + 1;
                                    childCount = i3;
                                } else {
                                    childCount = i9 - 1;
                                }
                                arrayList3.clear();
                                arrayList2 = arrayList;
                                i5 = i2;
                                z5 = z5;
                                view8 = view3;
                                animator = animator3;
                            }
                        }
                        i4 = 1;
                        if (i4 != 0) {
                            i8 = i9 + 1;
                            childCount = i3;
                        } else {
                            childCount = i9 - 1;
                        }
                        arrayList3.clear();
                        arrayList2 = arrayList;
                        i5 = i2;
                        z5 = z5;
                        view8 = view3;
                        animator = animator3;
                    }
                    z2 = z5;
                    animator2 = animator;
                    view2 = view8;
                    if (i8 < 0 || i8 >= oooOO2.getChildCount()) {
                        oooOO2.addView(oooOOO0);
                    } else {
                        oooOO2.addView(oooOOO0, i8);
                    }
                    oooOOO0.f60137OooO0oO = i;
                } else {
                    z2 = z5;
                    animator2 = animator;
                    view2 = view8;
                    oooOOO0.f60138OooO0oo = matrix9;
                }
                oOO00O.OooOOO0 oooOOO1 = oooOOO0;
                oooOOO1.f60137OooO0oO++;
                oooO = oooOOO1;
            }
            if (oooO != null) {
                oooO.OooO00o(view7, (ViewGroup) map.get("android:changeTransform:parent"));
                Transition transition = this;
                while (true) {
                    Transition transition2 = transition.f11308OooOO0o;
                    if (transition2 == null) {
                        break;
                    }
                    transition = transition2;
                }
                View view11 = view2;
                transition.OooO0O0(new OooO0OO(view11, oooO));
                if (z2) {
                    if (view7 != view11) {
                        oo0o0Oo.OooO0O0(view7, 0.0f);
                    }
                    oo0o0Oo.OooO0O0(view11, 1.0f);
                }
            }
        } else {
            animator2 = animator;
            if (!z5) {
                viewGroup2.endViewTransition(view7);
            }
        }
        return animator2;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOOo() {
        return f11212OooOooo;
    }

    public final void Oooo0OO(o00oO0o o00oo0o2) {
        View view = o00oo0o2.f60158OooO0O0;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap map = o00oo0o2.f60157OooO00o;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new OooO(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f11216OooOoo) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            oo0o0Oo.f60176OooO00o.OooO0o0(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(OooOo.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(OooOo.parent_matrix));
        }
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11217OooOoo0 = true;
        this.f11216OooOoo = true;
        this.f11218OooOooO = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60169OooO0o0);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f11217OooOoo0 = oo000o.OooO00o(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f11216OooOoo = oo000o.OooO00o(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
