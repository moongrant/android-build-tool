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
import p413o0Oo0oo.o000oOoO;
import p413o0Oo0oo.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO extends o0O0O00 {

    /* JADX INFO: renamed from: o000000.OooO$OooO, reason: collision with other inner class name */
    public static class C0388OooO extends OooO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f33735OooOO0O = false;

        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO0Oo(f, j, view, o000oooo2));
            } else {
                if (this.f33735OooOO0O) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f33735OooOO0O = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(OooO0Oo(f, j, view, o000oooo2)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.f45332OooO0oo;
        }
    }

    public static class OooO00o extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setAlpha(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final String f33736OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final SparseArray<ConstraintAttribute> f33737OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float[] f33738OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final SparseArray<float[]> f33739OooOOO0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float[] f33740OooOOOO;

        public OooO0O0(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f33736OooOO0O = str.split(",")[1];
            this.f33737OooOO0o = sparseArray;
        }

        @Override // p413o0Oo0oo.o0O0O00
        public final void OooO0O0(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // p413o0Oo0oo.o0O0O00
        public final void OooO0OO(int i) {
            SparseArray<ConstraintAttribute> sparseArray = this.f33737OooOO0o;
            int size = sparseArray.size();
            int iOooO0OO = sparseArray.valueAt(0).OooO0OO();
            double[] dArr = new double[size];
            int i2 = iOooO0OO + 2;
            this.f33738OooOOO = new float[i2];
            this.f33740OooOOOO = new float[iOooO0OO];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = sparseArray.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i3);
                float[] fArrValueAt = this.f33739OooOOO0.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.OooO0O0(this.f33738OooOOO);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f33738OooOOO;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iOooO0OO] = fArrValueAt[0];
                dArr3[iOooO0OO + 1] = fArrValueAt[1];
            }
            this.f45325OooO00o = p413o0Oo0oo.Oooo000.OooO00o(i, dArr, dArr2);
        }

        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            this.f45325OooO00o.OooO0Oo(f, this.f33738OooOOO);
            float[] fArr = this.f33738OooOOO;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f45324OooO;
            if (Float.isNaN(this.f45333OooOO0)) {
                float fOooO00o = o000oooo2.OooO00o(this.f33736OooOO0O, view);
                this.f45333OooOO0 = fOooO00o;
                if (Float.isNaN(fOooO00o)) {
                    this.f45333OooOO0 = 0.0f;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f45333OooOO0)) % 1.0d);
            this.f45333OooOO0 = f4;
            this.f45324OooO = j;
            float fOooO00o2 = OooO00o(f4);
            this.f45332OooO0oo = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f33740OooOOOO;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f45332OooO0oo;
                float f5 = this.f33738OooOOO[i];
                this.f45332OooO0oo = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fOooO00o2) + f3;
                i++;
            }
            o000000.OooO00o.OooO0O0(this.f33737OooOO0o.valueAt(0), view, this.f33740OooOOOO);
            if (f2 != 0.0f) {
                this.f45332OooO0oo = true;
            }
            return this.f45332OooO0oo;
        }
    }

    public static class OooO0OO extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setElevation(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooO0o extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            return this.f45332OooO0oo;
        }
    }

    public static class OooOO0 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setRotation(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooOO0O extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setRotationX(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooOOO extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setScaleX(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooOOO0 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setRotationY(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooOOOO extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setScaleY(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooOo extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setTranslationY(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class OooOo00 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setTranslationX(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public static class Oooo000 extends OooO {
        @Override // o000000.OooO
        public final boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2) {
            view.setTranslationZ(OooO0Oo(f, j, view, o000oooo2));
            return this.f45332OooO0oo;
        }
    }

    public final float OooO0Oo(float f, long j, View view, o000oOoO o000oooo2) {
        float[] fArr = this.f45331OooO0oO;
        this.f45325OooO00o.OooO0Oo(f, fArr);
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f45332OooO0oo = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f45333OooOO0)) {
            float fOooO00o = o000oooo2.OooO00o(this.f45329OooO0o, view);
            this.f45333OooOO0 = fOooO00o;
            if (Float.isNaN(fOooO00o)) {
                this.f45333OooOO0 = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.f45324OooO) * 1.0E-9d) * ((double) f2)) + ((double) this.f45333OooOO0)) % 1.0d);
        this.f45333OooOO0 = f3;
        String str = this.f45329OooO0o;
        HashMap<Object, HashMap<String, float[]>> map = o000oooo2.f45294OooO00o;
        if (map.containsKey(view)) {
            HashMap<String, float[]> map2 = map.get(view);
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f3});
                map.put(view, map2);
            }
        } else {
            HashMap<String, float[]> map3 = new HashMap<>();
            map3.put(str, new float[]{f3});
            map.put(view, map3);
        }
        this.f45324OooO = j;
        float f4 = fArr[0];
        float fOooO00o2 = (OooO00o(this.f45333OooOO0) * f4) + fArr[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f45332OooO0oo = z;
        return fOooO00o2;
    }

    public abstract boolean OooO0o0(float f, long j, View view, o000oOoO o000oooo2);
}
