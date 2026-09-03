package o000000;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import p416o0Oo0oo.oO00OOo0;
import p416o0Oo0oo.oO00Oo0;
import p416o0Oo0oo.oOo000o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO extends oOo000o0 {

    /* JADX INFO: renamed from: o000000.OooO$OooO, reason: collision with other inner class name */
    public static class C0386OooO extends OooO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f33220OooOO0O = false;

        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO0Oo(f, j, view, oo00oo0));
            } else {
                if (this.f33220OooOO0O) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f33220OooOO0O = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(OooO0Oo(f, j, view, oo00oo0)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.f46535OooO0oo;
        }
    }

    public static class OooO00o extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setAlpha(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final String f33221OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final SparseArray<ConstraintAttribute> f33222OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float[] f33223OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final SparseArray<float[]> f33224OooOOO0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float[] f33225OooOOOO;

        public OooO0O0(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f33221OooOO0O = str.split(",")[1];
            this.f33222OooOO0o = sparseArray;
        }

        @Override // p416o0Oo0oo.oOo000o0
        public final void OooO0O0(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // p416o0Oo0oo.oOo000o0
        public final void OooO0OO(int i) {
            SparseArray<ConstraintAttribute> sparseArray = this.f33222OooOO0o;
            int size = sparseArray.size();
            int iOooO0OO = sparseArray.valueAt(0).OooO0OO();
            double[] dArr = new double[size];
            int i2 = iOooO0OO + 2;
            this.f33223OooOOO = new float[i2];
            this.f33225OooOOOO = new float[iOooO0OO];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = sparseArray.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i3);
                float[] fArrValueAt = this.f33224OooOOO0.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.OooO0O0(this.f33223OooOOO);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f33223OooOOO;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iOooO0OO] = fArrValueAt[0];
                dArr3[iOooO0OO + 1] = fArrValueAt[1];
            }
            this.f46528OooO00o = oO00OOo0.OooO00o(i, dArr, dArr2);
        }

        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            this.f46528OooO00o.OooO0Oo(f, this.f33223OooOOO);
            float[] fArr = this.f33223OooOOO;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f46527OooO;
            if (Float.isNaN(this.f46536OooOO0)) {
                float fOooO00o = oo00oo0.OooO00o(this.f33221OooOO0O, view);
                this.f46536OooOO0 = fOooO00o;
                if (Float.isNaN(fOooO00o)) {
                    this.f46536OooOO0 = 0.0f;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f46536OooOO0)) % 1.0d);
            this.f46536OooOO0 = f4;
            this.f46527OooO = j;
            float fOooO00o2 = OooO00o(f4);
            this.f46535OooO0oo = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f33225OooOOOO;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f46535OooO0oo;
                float f5 = this.f33223OooOOO[i];
                this.f46535OooO0oo = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fOooO00o2) + f3;
                i++;
            }
            o000000.OooO00o.OooO0O0(this.f33222OooOO0o.valueAt(0), view, this.f33225OooOOOO);
            if (f2 != 0.0f) {
                this.f46535OooO0oo = true;
            }
            return this.f46535OooO0oo;
        }
    }

    public static class OooO0OO extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setElevation(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooO0o extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            return this.f46535OooO0oo;
        }
    }

    public static class OooOO0 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setRotation(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooOO0O extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setRotationX(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooOOO extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setScaleX(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooOOO0 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setRotationY(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooOOOO extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setScaleY(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooOo extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setTranslationY(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class OooOo00 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setTranslationX(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public static class Oooo000 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0) {
            view.setTranslationZ(OooO0Oo(f, j, view, oo00oo0));
            return this.f46535OooO0oo;
        }
    }

    public final float OooO0Oo(float f, long j, View view, oO00Oo0 oo00oo0) {
        float[] fArr = this.f46534OooO0oO;
        this.f46528OooO00o.OooO0Oo(f, fArr);
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f46535OooO0oo = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f46536OooOO0)) {
            float fOooO00o = oo00oo0.OooO00o(this.f46532OooO0o, view);
            this.f46536OooOO0 = fOooO00o;
            if (Float.isNaN(fOooO00o)) {
                this.f46536OooOO0 = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.f46527OooO) * 1.0E-9d) * ((double) f2)) + ((double) this.f46536OooOO0)) % 1.0d);
        this.f46536OooOO0 = f3;
        String str = this.f46532OooO0o;
        if (((HashMap) oo00oo0.f46471OooO00o).containsKey(view)) {
            HashMap map = (HashMap) ((HashMap) oo00oo0.f46471OooO00o).get(view);
            if (map == null) {
                map = new HashMap();
            }
            if (map.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map.put(str, fArrCopyOf);
            } else {
                map.put(str, new float[]{f3});
                ((HashMap) oo00oo0.f46471OooO00o).put(view, map);
            }
        } else {
            HashMap map2 = new HashMap();
            map2.put(str, new float[]{f3});
            ((HashMap) oo00oo0.f46471OooO00o).put(view, map2);
        }
        this.f46527OooO = j;
        float f4 = fArr[0];
        float fOooO00o2 = (OooO00o(this.f46536OooOO0) * f4) + fArr[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f46535OooO0oo = z;
        return fOooO00o2;
    }

    public abstract boolean OooO0o0(float f, long j, View view, oO00Oo0 oo00oo0);
}
