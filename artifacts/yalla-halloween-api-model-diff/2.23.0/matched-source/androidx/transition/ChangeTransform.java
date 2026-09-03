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
import androidx.core.view.o000O0Oo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p058o0000Ooo.oo000o;
import p078o000Oo0O.Oooo0;
import p078o000Oo0O.o0000;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0000O00;
import p078o000Oo0O.o00O0O;
import p078o000Oo0O.o00Oo0;
import p078o000Oo0O.o00Ooo;
import p078o000Oo0O.o0O0O00;
import p078o000Oo0O.o0OOO0o;
import p078o000Oo0O.o0OoOo0;
import p078o000Oo0O.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeTransform extends Transition {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String[] f8118OooOooo = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO00o f8119Oooo000 = new OooO00o();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO0O0 f8120Oooo00O = new OooO0O0();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final boolean f8121Oooo00o = true;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f8122OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f8123OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Matrix f8124OooOooO;

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f8125OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f8126OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f8127OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f8128OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f8129OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f8130OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f8131OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f8132OooO0oo;

        public OooO(View view) {
            this.f8125OooO00o = view.getTranslationX();
            this.f8126OooO0O0 = view.getTranslationY();
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            this.f8127OooO0OO = ViewCompat.OooOOO.OooOO0o(view);
            this.f8128OooO0Oo = view.getScaleX();
            this.f8130OooO0o0 = view.getScaleY();
            this.f8129OooO0o = view.getRotationX();
            this.f8131OooO0oO = view.getRotationY();
            this.f8132OooO0oo = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return oooO.f8125OooO00o == this.f8125OooO00o && oooO.f8126OooO0O0 == this.f8126OooO0O0 && oooO.f8127OooO0OO == this.f8127OooO0OO && oooO.f8128OooO0Oo == this.f8128OooO0Oo && oooO.f8130OooO0o0 == this.f8130OooO0o0 && oooO.f8129OooO0o == this.f8129OooO0o && oooO.f8131OooO0oO == this.f8131OooO0oO && oooO.f8132OooO0oo == this.f8132OooO0oo;
        }

        public final int hashCode() {
            float f = this.f8125OooO00o;
            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f8126OooO0O0;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f8127OooO0OO;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f8128OooO0Oo;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f8130OooO0o0;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f8129OooO0o;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f8131OooO0oO;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f8132OooO0oo;
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
            System.arraycopy(fArr2, 0, oooO0o2.f8137OooO0OO, 0, fArr2.length);
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
            oooO0o2.f8138OooO0Oo = pointF2.x;
            oooO0o2.f8139OooO0o0 = pointF2.y;
            oooO0o2.OooO00o();
        }
    }

    public static class OooO0OO extends OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f8133OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0OoOo0 f8134OooO0o0;

        public OooO0OO(View view, o0OoOo0 o0oooo0) {
            this.f8133OooO0Oo = view;
            this.f8134OooO0o0 = o0oooo0;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            this.f8134OooO0o0.setVisibility(4);
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
            this.f8134OooO0o0.setVisibility(0);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            transition.OooOoO0(this);
            int i = Build.VERSION.SDK_INT;
            View view = this.f8133OooO0Oo;
            if (i == 28) {
                if (!o00Oo0.f34963OooOO0) {
                    try {
                        if (!o00Oo0.f34959OooO0o) {
                            try {
                                o00Oo0.f34960OooO0o0 = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException e) {
                                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
                            }
                            o00Oo0.f34959OooO0o = true;
                        }
                        Method declaredMethod = o00Oo0.f34960OooO0o0.getDeclaredMethod("removeGhost", View.class);
                        o00Oo0.f34958OooO = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e2) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
                    }
                    o00Oo0.f34963OooOO0 = true;
                }
                Method method = o00Oo0.f34958OooO;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException(e3.getCause());
                    }
                }
            } else {
                int i2 = o00Ooo.f34965OooOO0;
                o00Ooo o00ooo2 = (o00Ooo) view.getTag(o0OOO0o.ghost_view);
                if (o00ooo2 != null) {
                    int i3 = o00ooo2.f34970OooO0oO - 1;
                    o00ooo2.f34970OooO0oO = i3;
                    if (i3 <= 0) {
                        ((o00O0O) o00ooo2.getParent()).removeView(o00ooo2);
                    }
                }
            }
            view.setTag(o0OOO0o.transition_transform, null);
            view.setTag(o0OOO0o.parent_matrix, null);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f8135OooO00o = new Matrix();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f8136OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float[] f8137OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f8138OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f8139OooO0o0;

        public OooO0o(View view, float[] fArr) {
            this.f8136OooO0O0 = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f8137OooO0OO = fArr2;
            this.f8138OooO0Oo = fArr2[2];
            this.f8139OooO0o0 = fArr2[5];
            OooO00o();
        }

        public final void OooO00o() {
            float f = this.f8138OooO0Oo;
            float[] fArr = this.f8137OooO0OO;
            fArr[2] = f;
            fArr[5] = this.f8139OooO0o0;
            Matrix matrix = this.f8135OooO00o;
            matrix.setValues(fArr);
            o0000O00.f34939OooO00o.OooO0Oo(this.f8136OooO0O0, matrix);
        }
    }

    public ChangeTransform() {
        this.f8123OooOoo0 = true;
        this.f8122OooOoo = true;
        this.f8124OooOooO = new Matrix();
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
        if (f8121Oooo00o) {
            return;
        }
        View view = o00000o1.f34937OooO0O0;
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
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
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00000O0 o00000o1, @Nullable o00000O0 o00000o2) {
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
        o00O0O o00o0o2;
        o0OoOo0 o0oooo0;
        char c2;
        char c3;
        View view4;
        o00Oo0 o00oo1;
        boolean z4;
        if (o00000o1 == null || o00000o2 == null) {
            return null;
        }
        HashMap map = o00000o1.f34936OooO00o;
        if (!map.containsKey("android:changeTransform:parent")) {
            return null;
        }
        HashMap map2 = o00000o2.f34936OooO00o;
        if (!map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view5 = (ViewGroup) map2.get("android:changeTransform:parent");
        if (!this.f8122OooOoo) {
            z = false;
        } else if (OooOo0O(viewGroup2)) {
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
        View view6 = o00000o2.f34937OooO0O0;
        if (z) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view6.setTag(o0OOO0o.parent_matrix, matrix3);
            Matrix matrix4 = this.f8124OooOooO;
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
            matrix6 = o0ooOOo.f34984OooO00o;
        }
        if (matrix7 == null) {
            matrix7 = o0ooOOo.f34984OooO00o;
        }
        Matrix matrix8 = matrix7;
        if (matrix6.equals(matrix8)) {
            view = view6;
            animator = null;
            r13 = 1;
            obj = "android:changeTransform:parentMatrix";
        } else {
            OooO oooO = (OooO) map2.get("android:changeTransform:transforms");
            view6.setTranslationX(0.0f);
            view6.setTranslationY(0.0f);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(oooO0o, PropertyValuesHolder.ofObject(f8119Oooo000, new Oooo0(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(f8120Oooo00O, (TypeConverter) null, this.f8222OooOo.OooO00o(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            r13 = 1;
            androidx.transition.OooO00o oooO00o = new androidx.transition.OooO00o(this, z, matrix8, view, oooO, oooO0o);
            animatorOfPropertyValuesHolder.addListener(oooO00o);
            animatorOfPropertyValuesHolder.addPauseListener(oooO00o);
            animator = animatorOfPropertyValuesHolder;
        }
        boolean z5 = f8121Oooo00o;
        View view7 = o00000o1.f34937OooO0O0;
        if (z && animator != null && this.f8123OooOoo0) {
            Matrix matrix9 = new Matrix((Matrix) map2.get(obj));
            o0000O00.f34939OooO00o.OooO0o(viewGroup, matrix9);
            if (Build.VERSION.SDK_INT == 28) {
                if (o00Oo0.f34962OooO0oo) {
                    c2 = 2;
                    c3 = 0;
                } else {
                    try {
                        if (!o00Oo0.f34959OooO0o) {
                            try {
                                o00Oo0.f34960OooO0o0 = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException e) {
                                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
                            }
                            o00Oo0.f34959OooO0o = r13;
                        }
                        Class<?> cls = o00Oo0.f34960OooO0o0;
                        Class<?>[] clsArr = new Class[3];
                        c3 = 0;
                        try {
                            clsArr[0] = View.class;
                            clsArr[r13] = ViewGroup.class;
                            c2 = 2;
                            try {
                                clsArr[2] = Matrix.class;
                                Method declaredMethod = cls.getDeclaredMethod("addGhost", clsArr);
                                o00Oo0.f34961OooO0oO = declaredMethod;
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
                    o00Oo0.f34962OooO0oo = r13;
                }
                Method method = o00Oo0.f34961OooO0oO;
                if (method != null) {
                    try {
                        try {
                            Object[] objArr = new Object[3];
                            view4 = view;
                            try {
                                objArr[c3] = view4;
                                objArr[r13] = viewGroup;
                                objArr[c2] = matrix9;
                                o00oo1 = new o00Oo0((View) method.invoke(null, objArr));
                            } catch (IllegalAccessException unused) {
                                o00oo1 = null;
                            }
                        } catch (InvocationTargetException e5) {
                            throw new RuntimeException(e5.getCause());
                        }
                    } catch (IllegalAccessException unused2) {
                        view4 = view;
                    }
                } else {
                    view4 = view;
                    o00oo1 = null;
                }
                z2 = z5;
                animator2 = animator;
                view2 = view4;
                o0oooo0 = o00oo1;
            } else {
                View view8 = view;
                int i5 = 0;
                int i6 = o00Ooo.f34965OooOO0;
                if (!(view8.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i7 = o00O0O.f34955OooO0o;
                o00O0O o00o0o3 = (o00O0O) viewGroup.getTag(o0OOO0o.ghost_view_holder);
                o00Ooo o00ooo2 = (o00Ooo) view8.getTag(o0OOO0o.ghost_view);
                if (o00ooo2 == null || (o00o0o2 = (o00O0O) o00ooo2.getParent()) == o00o0o3) {
                    i = 0;
                } else {
                    i = o00ooo2.f34970OooO0oO;
                    o00o0o2.removeView(o00ooo2);
                    o00ooo2 = null;
                }
                if (o00ooo2 == null) {
                    o00ooo2 = new o00Ooo(view8);
                    o00ooo2.f34971OooO0oo = matrix9;
                    if (o00o0o3 == null) {
                        o00o0o3 = new o00O0O(viewGroup);
                    } else {
                        if (!o00o0o3.f34957OooO0o0) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        ViewGroup viewGroup3 = o00o0o3.f34956OooO0Oo;
                        viewGroup3.getOverlay().remove(o00o0o3);
                        viewGroup3.getOverlay().add(o00o0o3);
                    }
                    o00Ooo.OooO0O0(viewGroup, o00o0o3);
                    o00Ooo.OooO0O0(viewGroup, o00ooo2);
                    ArrayList arrayList2 = new ArrayList();
                    o00O0O.OooO00o(o00ooo2.f34968OooO0o, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int childCount = o00o0o3.getChildCount() - r13;
                    int i8 = 0;
                    while (i8 <= childCount) {
                        int i9 = (i8 + childCount) / 2;
                        o00O0O.OooO00o(((o00Ooo) o00o0o3.getChildAt(i9)).f34968OooO0o, arrayList3);
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
                                                        if (o0000.f34930OooO0OO) {
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
                                                                    o0000.f34929OooO0O0 = declaredMethod2;
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused3) {
                                                                    z3 = true;
                                                                }
                                                            } catch (NoSuchMethodException unused4) {
                                                                view3 = view8;
                                                            }
                                                            z3 = true;
                                                            o0000.f34930OooO0OO = z3;
                                                        }
                                                        Method method2 = o0000.f34929OooO0O0;
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
                    if (i8 < 0 || i8 >= o00o0o3.getChildCount()) {
                        o00o0o3.addView(o00ooo2);
                    } else {
                        o00o0o3.addView(o00ooo2, i8);
                    }
                    o00ooo2.f34970OooO0oO = i;
                } else {
                    z2 = z5;
                    animator2 = animator;
                    view2 = view8;
                    o00ooo2.f34971OooO0oo = matrix9;
                }
                o00Ooo o00ooo3 = o00ooo2;
                o00ooo3.f34970OooO0oO++;
                o0oooo0 = o00ooo3;
            }
            if (o0oooo0 != null) {
                o0oooo0.OooO00o(view7, (ViewGroup) map.get("android:changeTransform:parent"));
                Transition transition = this;
                while (true) {
                    Transition transition2 = transition.f8214OooOO0o;
                    if (transition2 == null) {
                        break;
                    }
                    transition = transition2;
                }
                View view11 = view2;
                transition.OooO0O0(new OooO0OO(view11, o0oooo0));
                if (z2) {
                    if (view7 != view11) {
                        o0000O00.OooO0O0(view7, 0.0f);
                    }
                    o0000O00.OooO0O0(view11, 1.0f);
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
    public final String[] OooOOoo() {
        return f8118OooOooo;
    }

    public final void Oooo0o0(o00000O0 o00000o1) {
        View view = o00000o1.f34937OooO0O0;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap map = o00000o1.f34936OooO00o;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new OooO(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f8122OooOoo) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            o0000O00.f34939OooO00o.OooO0o0(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(o0OOO0o.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(o0OOO0o.parent_matrix));
        }
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8123OooOoo0 = true;
        this.f8122OooOoo = true;
        this.f8124OooOooO = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0O00.f34980OooO0o0);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f8123OooOoo0 = oo000o.OooO00o(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f8122OooOoo = oo000o.OooO00o(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
