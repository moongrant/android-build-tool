package o000000;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p413o0Oo0oo.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0o extends o0ooOOo {

    public static class OooO extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setPivotX(OooO00o(f));
        }
    }

    public static class OooO00o extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setAlpha(OooO00o(f));
        }
    }

    public static class OooO0O0 extends OooO0o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final SparseArray<ConstraintAttribute> f33748OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float[] f33749OooO0oO;

        public OooO0O0(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f33748OooO0o = sparseArray;
        }

        @Override // p413o0Oo0oo.o0ooOOo
        public final void OooO0O0(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p413o0Oo0oo.o0ooOOo
        public final void OooO0OO(int i) {
            SparseArray<ConstraintAttribute> sparseArray = this.f33748OooO0o;
            int size = sparseArray.size();
            int iOooO0OO = sparseArray.valueAt(0).OooO0OO();
            double[] dArr = new double[size];
            this.f33749OooO0oO = new float[iOooO0OO];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iOooO0OO);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.OooO0O0(this.f33749OooO0oO);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f33749OooO0oO;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.f45344OooO00o = p413o0Oo0oo.Oooo000.OooO00o(i, dArr, dArr2);
        }

        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            this.f45344OooO00o.OooO0Oo(f, this.f33749OooO0oO);
            o000000.OooO00o.OooO0O0(this.f33748OooO0o.valueAt(0), view, this.f33749OooO0oO);
        }
    }

    public static class OooO0OO extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setElevation(OooO00o(f));
        }
    }

    /* JADX INFO: renamed from: o000000.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class C0391OooO0o extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
        }
    }

    public static class OooOO0 extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setPivotY(OooO00o(f));
        }
    }

    public static class OooOO0O extends OooO0o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f33750OooO0o = false;

        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO00o(f));
                return;
            }
            if (this.f33750OooO0o) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f33750OooO0o = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(OooO00o(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }

    public static class OooOOO extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setRotationX(OooO00o(f));
        }
    }

    public static class OooOOO0 extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setRotation(OooO00o(f));
        }
    }

    public static class OooOOOO extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setRotationY(OooO00o(f));
        }
    }

    public static class OooOo extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setScaleY(OooO00o(f));
        }
    }

    public static class OooOo00 extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setScaleX(OooO00o(f));
        }
    }

    public static class Oooo0 extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setTranslationY(OooO00o(f));
        }
    }

    public static class Oooo000 extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setTranslationX(OooO00o(f));
        }
    }

    public static class o000oOoO extends OooO0o {
        @Override // o000000.OooO0o
        public final void OooO0Oo(View view, float f) {
            view.setTranslationZ(OooO00o(f));
        }
    }

    public abstract void OooO0Oo(View view, float f);
}
