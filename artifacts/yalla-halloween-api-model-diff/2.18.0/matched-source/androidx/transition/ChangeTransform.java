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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import org.xmlpull.v1.XmlPullParser;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO0000o0;
import p101o000oOoo.oO000O0;
import p101o000oOoo.oO000O0O;
import p101o000oOoo.oO000OOo;
import p101o000oOoo.oO000Oo;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00O0oO;
import p101o000oOoo.oO00OO0O;
import p101o000oOoo.oO0Oo0oo;
import p101o000oOoo.oO0Ooooo;
import p101o000oOoo.oO0o0o;

/* JADX INFO: loaded from: classes.dex */
public class ChangeTransform extends Transition {

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f9490o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f9491o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public Matrix f9492o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final String[] f9488o00ooo = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final Property<OooO0o, float[]> f9489oo000o = new OooO00o();

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final Property<OooO0o, PointF> f9487o00oO0o = new OooO0O0(PointF.class);

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static final boolean f9486o00oO0O = true;

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f9493OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f9494OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f9495OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f9496OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f9497OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f9498OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f9499OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f9500OooO0oo;

        public OooO(View view) {
            this.f9493OooO00o = view.getTranslationX();
            this.f9494OooO0O0 = view.getTranslationY();
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            this.f9495OooO0OO = ViewCompat.OooOOO.OooOO0o(view);
            this.f9496OooO0Oo = view.getScaleX();
            this.f9498OooO0o0 = view.getScaleY();
            this.f9497OooO0o = view.getRotationX();
            this.f9499OooO0oO = view.getRotationY();
            this.f9500OooO0oo = view.getRotation();
        }

        public final void OooO00o(View view) {
            ChangeTransform.Oooo0o(view, this.f9493OooO00o, this.f9494OooO0O0, this.f9495OooO0OO, this.f9496OooO0Oo, this.f9498OooO0o0, this.f9497OooO0o, this.f9499OooO0oO, this.f9500OooO0oo);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return oooO.f9493OooO00o == this.f9493OooO00o && oooO.f9494OooO0O0 == this.f9494OooO0O0 && oooO.f9495OooO0OO == this.f9495OooO0OO && oooO.f9496OooO0Oo == this.f9496OooO0Oo && oooO.f9498OooO0o0 == this.f9498OooO0o0 && oooO.f9497OooO0o == this.f9497OooO0o && oooO.f9499OooO0oO == this.f9499OooO0oO && oooO.f9500OooO0oo == this.f9500OooO0oo;
        }

        public final int hashCode() {
            float f = this.f9493OooO00o;
            int iFloatToIntBits = (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f9494OooO0O0;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f9495OooO0OO;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f9496OooO0Oo;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f9498OooO0o0;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f9497OooO0o;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f9499OooO0oO;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f9500OooO0oo;
            return iFloatToIntBits7 + (f8 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Float.floatToIntBits(f8) : 0);
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
            System.arraycopy(fArr2, 0, oooO0o2.f9505OooO0OO, 0, fArr2.length);
            oooO0o2.OooO00o();
        }
    }

    public class OooO0O0 extends Property<OooO0o, PointF> {
        public OooO0O0(Class cls) {
            super(cls, "translations");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(OooO0o oooO0o) {
            return null;
        }

        @Override // android.util.Property
        public final void set(OooO0o oooO0o, PointF pointF) {
            OooO0o oooO0o2 = oooO0o;
            PointF pointF2 = pointF;
            Objects.requireNonNull(oooO0o2);
            oooO0o2.f9506OooO0Oo = pointF2.x;
            oooO0o2.f9507OooO0o0 = pointF2.y;
            oooO0o2.OooO00o();
        }
    }

    public static class OooO0OO extends androidx.transition.OooO {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public View f9501Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public oO000O0 f9502OoooO00;

        public OooO0OO(View view, oO000O0 oo000o0) {
            this.f9501Oooo = view;
            this.f9502OoooO00 = oo000o0;
        }

        @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            this.f9502OoooO00.setVisibility(4);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            transition.OooOoO(this);
            View view = this.f9501Oooo;
            if (Build.VERSION.SDK_INT == 28) {
                if (!oO0Ooooo.f29785o000oOoO) {
                    try {
                        oO0Ooooo.OooO0O0();
                        Method declaredMethod = oO0Ooooo.f29782OoooO00.getDeclaredMethod("removeGhost", View.class);
                        oO0Ooooo.f29784OoooOO0 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                    }
                    oO0Ooooo.f29785o000oOoO = true;
                }
                Method method = oO0Ooooo.f29784OoooOO0;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause());
                    }
                }
            } else {
                int i = oO0o0o.f29787o000oOoO;
                oO0o0o oo0o0o = (oO0o0o) view.getTag(oO000OOo.ghost_view);
                if (oo0o0o != null) {
                    int i2 = oo0o0o.f29792OoooO0O - 1;
                    oo0o0o.f29792OoooO0O = i2;
                    if (i2 <= 0) {
                        ((oO000O0O) oo0o0o.getParent()).removeView(oo0o0o);
                    }
                }
            }
            this.f9501Oooo.setTag(oO000OOo.transition_transform, null);
            this.f9501Oooo.setTag(oO000OOo.parent_matrix, null);
        }

        @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
        public final void OooO0o0() {
            this.f9502OoooO00.setVisibility(0);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f9503OooO00o = new Matrix();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f9504OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float[] f9505OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f9506OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f9507OooO0o0;

        public OooO0o(View view, float[] fArr) {
            this.f9504OooO0O0 = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f9505OooO0OO = fArr2;
            this.f9506OooO0Oo = fArr2[2];
            this.f9507OooO0o0 = fArr2[5];
            OooO00o();
        }

        public final void OooO00o() {
            float[] fArr = this.f9505OooO0OO;
            fArr[2] = this.f9506OooO0Oo;
            fArr[5] = this.f9507OooO0o0;
            this.f9503OooO00o.setValues(fArr);
            oO00OO0O.f29766OooO00o.OooO0o0(this.f9504OooO0O0, this.f9503OooO00o);
        }
    }

    public ChangeTransform() {
        this.f9490o00Oo0 = true;
        this.f9491o00Ooo = true;
        this.f9492o00o0O = new Matrix();
    }

    public static void Oooo0o(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
        ViewCompat.OooOOO.OooOo0o(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
        if (f9486o00oO0O) {
            return;
        }
        ((ViewGroup) oo00o0o.f29761OooO0O0.getParent()).startViewTransition(oo00o0o.f29761OooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02f8 A[PHI: r28
      0x02f8: PHI (r28v5 java.util.ArrayList) = (r28v4 java.util.ArrayList), (r28v6 java.util.ArrayList), (r28v6 java.util.ArrayList) binds: [B:113:0x02f5, B:165:0x02f8, B:101:0x02cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0301  */
    /* JADX WARN: Code duplicated, block: B:120:0x0307  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.transition.Transition
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        boolean z;
        char c;
        Object obj;
        Animator animator;
        oO0o0o oo0o0o;
        int i;
        oO0o0o oo0o0o2;
        ArrayList arrayList;
        int i2;
        boolean z2;
        oO000O0O oo000o0o;
        oO000O0 oo0ooooo;
        char c2;
        boolean z3;
        if (oo00o0o == null || oo00o0o2 == null || !oo00o0o.f29760OooO00o.containsKey("android:changeTransform:parent") || !oo00o0o2.f29760OooO00o.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) oo00o0o.f29760OooO00o.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) oo00o0o2.f29760OooO00o.get("android:changeTransform:parent");
        if (!this.f9491o00Ooo) {
            z = false;
        } else if (OooOo0o(viewGroup2)) {
            z3 = false;
            if (z3) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z3 = false;
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        }
        Matrix matrix = (Matrix) oo00o0o.f29760OooO00o.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            oo00o0o.f29760OooO00o.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) oo00o0o.f29760OooO00o.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            oo00o0o.f29760OooO00o.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            Matrix matrix3 = (Matrix) oo00o0o2.f29760OooO00o.get("android:changeTransform:parentMatrix");
            oo00o0o2.f29761OooO0O0.setTag(oO000OOo.parent_matrix, matrix3);
            Matrix matrix4 = this.f9492o00o0O;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) oo00o0o.f29760OooO00o.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                oo00o0o.f29760OooO00o.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) oo00o0o.f29760OooO00o.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) oo00o0o.f29760OooO00o.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) oo00o0o2.f29760OooO00o.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = oO0Oo0oo.f29778OooO00o;
        }
        if (matrix7 == null) {
            matrix7 = oO0Oo0oo.f29778OooO00o;
        }
        Matrix matrix8 = matrix7;
        if (matrix6.equals(matrix8)) {
            obj = "android:changeTransform:parentMatrix";
            animator = null;
            c = 2;
        } else {
            OooO oooO = (OooO) oo00o0o2.f29760OooO00o.get("android:changeTransform:transforms");
            View view = oo00o0o2.f29761OooO0O0;
            Oooo0o(view, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix8.getValues(fArr2);
            OooO0o oooO0o = new OooO0o(view, fArr);
            Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(oooO0o, PropertyValuesHolder.ofObject(f9489oo000o, new oO0000o0(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(f9487o00oO0o, (TypeConverter) null, this.f9593Ooooooo.OooO00o(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            c = 2;
            obj = "android:changeTransform:parentMatrix";
            androidx.transition.OooO00o oooO00o = new androidx.transition.OooO00o(this, z, matrix8, view, oooO, oooO0o);
            animatorOfPropertyValuesHolder.addListener(oooO00o);
            animatorOfPropertyValuesHolder.addPauseListener(oooO00o);
            animator = animatorOfPropertyValuesHolder;
        }
        if (z && animator != null && this.f9490o00Oo0) {
            View view2 = oo00o0o2.f29761OooO0O0;
            Matrix matrix9 = new Matrix((Matrix) oo00o0o2.f29760OooO00o.get(obj));
            oO00OO0O.OooO0o(viewGroup, matrix9);
            if (Build.VERSION.SDK_INT == 28) {
                if (oO0Ooooo.f29780OoooO) {
                    c2 = 1;
                } else {
                    try {
                        oO0Ooooo.OooO0O0();
                        Class<?> cls = oO0Ooooo.f29782OoooO00;
                        Class<?>[] clsArr = new Class[3];
                        clsArr[0] = View.class;
                        clsArr[1] = ViewGroup.class;
                        clsArr[c] = Matrix.class;
                        Method declaredMethod = cls.getDeclaredMethod("addGhost", clsArr);
                        oO0Ooooo.f29783OoooO0O = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
                    }
                    c2 = 1;
                    oO0Ooooo.f29780OoooO = true;
                }
                Method method = oO0Ooooo.f29783OoooO0O;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[3];
                        objArr[0] = view2;
                        objArr[c2] = viewGroup;
                        objArr[c] = matrix9;
                        oo0ooooo = new oO0Ooooo((View) method.invoke(null, objArr));
                    } catch (IllegalAccessException unused) {
                        oo0ooooo = null;
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause());
                    }
                } else {
                    oo0ooooo = null;
                }
            } else {
                int i3 = oO0o0o.f29787o000oOoO;
                if (!(view2.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i4 = oO000O0O.f29745OoooO0;
                oO000O0O oo000o0o2 = (oO000O0O) viewGroup.getTag(oO000OOo.ghost_view_holder);
                oO0o0o oo0o0o3 = (oO0o0o) view2.getTag(oO000OOo.ghost_view);
                if (oo0o0o3 == null || (oo000o0o = (oO000O0O) oo0o0o3.getParent()) == oo000o0o2) {
                    oo0o0o = oo0o0o3;
                    i = 0;
                } else {
                    i = oo0o0o3.f29792OoooO0O;
                    oo000o0o.removeView(oo0o0o3);
                    oo0o0o = null;
                }
                if (oo0o0o == null) {
                    oO0o0o oo0o0o4 = new oO0o0o(view2);
                    oo0o0o4.f29789OoooO = matrix9;
                    if (oo000o0o2 == null) {
                        oo000o0o2 = new oO000O0O(viewGroup);
                    } else {
                        if (!oo000o0o2.f29747OoooO00) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        oo000o0o2.f29746Oooo.getOverlay().remove(oo000o0o2);
                        oo000o0o2.f29746Oooo.getOverlay().add(oo000o0o2);
                    }
                    oO0o0o.OooO0O0(viewGroup, oo000o0o2);
                    oO0o0o.OooO0O0(viewGroup, oo0o0o4);
                    ArrayList arrayList2 = new ArrayList();
                    oO000O0O.OooO00o(oo0o0o4.f29790OoooO0, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int childCount = oo000o0o2.getChildCount() - 1;
                    int i5 = 0;
                    while (i5 <= childCount) {
                        int i6 = (i5 + childCount) / 2;
                        oO000O0O.OooO00o(((oO0o0o) oo000o0o2.getChildAt(i6)).f29790OoooO0, arrayList3);
                        if (arrayList2.isEmpty() || arrayList3.isEmpty()) {
                            arrayList = arrayList2;
                            i2 = childCount;
                        } else {
                            i2 = childCount;
                            if (arrayList2.get(0) != arrayList3.get(0)) {
                                arrayList = arrayList2;
                            } else {
                                int iMin = Math.min(arrayList2.size(), arrayList3.size());
                                int i7 = 1;
                                while (true) {
                                    if (i7 < iMin) {
                                        View view3 = (View) arrayList2.get(i7);
                                        arrayList = arrayList2;
                                        View view4 = (View) arrayList3.get(i7);
                                        if (view3 != view4) {
                                            ViewGroup viewGroup4 = (ViewGroup) view3.getParent();
                                            int childCount2 = viewGroup4.getChildCount();
                                            if (view3.getZ() == view4.getZ()) {
                                                int i8 = 0;
                                                while (true) {
                                                    if (i8 < childCount2) {
                                                        int i9 = childCount2;
                                                        View childAt = viewGroup4.getChildAt(oO00O0oO.OooO00o(viewGroup4, i8));
                                                        if (childAt == view3) {
                                                            z2 = false;
                                                        } else if (childAt != view4) {
                                                            i8++;
                                                            childCount2 = i9;
                                                        }
                                                    }
                                                }
                                            } else if (view3.getZ() <= view4.getZ()) {
                                                z2 = false;
                                            }
                                        } else {
                                            i7++;
                                            arrayList2 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                        if (arrayList3.size() != iMin) {
                                            z2 = false;
                                        }
                                    }
                                    if (z2) {
                                        i5 = i6 + 1;
                                        childCount = i2;
                                    } else {
                                        childCount = i6 - 1;
                                    }
                                    arrayList3.clear();
                                    arrayList2 = arrayList;
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                            i5 = i6 + 1;
                            childCount = i2;
                        } else {
                            childCount = i6 - 1;
                        }
                        arrayList3.clear();
                        arrayList2 = arrayList;
                    }
                    if (i5 < 0 || i5 >= oo000o0o2.getChildCount()) {
                        oo000o0o2.addView(oo0o0o4);
                    } else {
                        oo000o0o2.addView(oo0o0o4, i5);
                    }
                    oo0o0o4.f29792OoooO0O = i;
                    oo0o0o2 = oo0o0o4;
                } else {
                    oo0o0o.f29789OoooO = matrix9;
                    oo0o0o2 = oo0o0o;
                }
                oo0o0o2.f29792OoooO0O++;
                oo0ooooo = oo0o0o2;
            }
            if (oo0ooooo != null) {
                oo0ooooo.OooO00o((ViewGroup) oo00o0o.f29760OooO00o.get("android:changeTransform:parent"), oo00o0o.f29761OooO0O0);
                Transition transition = this;
                while (true) {
                    TransitionSet transitionSet = transition.f9581OoooOOo;
                    if (transitionSet == null) {
                        break;
                    }
                    transition = transitionSet;
                }
                transition.OooO0OO(new OooO0OO(view2, oo0ooooo));
                if (f9486o00oO0O) {
                    View view5 = oo00o0o.f29761OooO0O0;
                    if (view5 != oo00o0o2.f29761OooO0O0) {
                        oO00OO0O.OooO0OO(view5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    }
                    oO00OO0O.OooO0OO(view2, 1.0f);
                }
            }
        } else if (!f9486o00oO0O) {
            viewGroup2.endViewTransition(oo00o0o.f29761OooO0O0);
        }
        return animator;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOo00() {
        return f9488o00ooo;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void Oooo0o0(oO00O0o oo00o0o) {
        View view = oo00o0o.f29761OooO0O0;
        if (view.getVisibility() == 8) {
            return;
        }
        oo00o0o.f29760OooO00o.put("android:changeTransform:parent", view.getParent());
        oo00o0o.f29760OooO00o.put("android:changeTransform:transforms", new OooO(view));
        Matrix matrix = view.getMatrix();
        oo00o0o.f29760OooO00o.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f9491o00Ooo) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            oO00OO0O.OooO0o0(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            oo00o0o.f29760OooO00o.put("android:changeTransform:parentMatrix", matrix2);
            oo00o0o.f29760OooO00o.put("android:changeTransform:intermediateMatrix", view.getTag(oO000OOo.transition_transform));
            oo00o0o.f29760OooO00o.put("android:changeTransform:intermediateParentMatrix", view.getTag(oO000OOo.parent_matrix));
        }
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9490o00Oo0 = true;
        this.f9491o00Ooo = true;
        this.f9492o00o0O = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29754OooO0o0);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f9490o00Oo0 = o00oO0o.OooO00o(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f9491o00Ooo = o00oO0o.OooO00o(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
