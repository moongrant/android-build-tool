package p063o0000o0o;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p057o0000Oo0.o000000;
import p057o0000Oo0.o0000oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class oo0o0Oo extends o0000oo {

    public static class OooO extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setPivotX(OooO00o(f));
        }
    }

    public static class OooO00o extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setAlpha(OooO00o(f));
        }
    }

    public static class OooO0O0 extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f27910OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float[] f27911OooO0oO;

        public OooO0O0(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f27910OooO0o = sparseArray;
        }

        @Override // p057o0000Oo0.o0000oo
        public final void OooO0OO(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p057o0000Oo0.o0000oo
        public final void OooO0Oo(int i) {
            int size = this.f27910OooO0o.size();
            int iOooO0Oo = this.f27910OooO0o.valueAt(0).OooO0Oo();
            double[] dArr = new double[size];
            this.f27911OooO0oO = new float[iOooO0Oo];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, iOooO0Oo);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f27910OooO0o.keyAt(i2);
                ConstraintAttribute constraintAttributeValueAt = this.f27910OooO0o.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.OooO0O0(this.f27911OooO0oO);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f27911OooO0oO;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.f27628OooO00o = o000000.OooO00o(i, dArr, dArr2);
        }

        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            this.f27628OooO00o.OooO0Oo(f, this.f27911OooO0oO);
            o0OOO0o.OooO0O0(this.f27910OooO0o.valueAt(0), view, this.f27911OooO0oO);
        }
    }

    public static class OooO0OO extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setElevation(OooO00o(f));
        }
    }

    public static class OooO0o extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
        }
    }

    public static class OooOO0 extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setPivotY(OooO00o(f));
        }
    }

    public static class OooOO0O extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f27912OooO0o = false;

        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO00o(f));
                return;
            }
            if (this.f27912OooO0o) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f27912OooO0o = true;
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

    public static class OooOOO extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setRotationX(OooO00o(f));
        }
    }

    public static class OooOOO0 extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setRotation(OooO00o(f));
        }
    }

    public static class OooOOOO extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setRotationY(OooO00o(f));
        }
    }

    public static class OooOo extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setScaleY(OooO00o(f));
        }
    }

    public static class OooOo00 extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setScaleX(OooO00o(f));
        }
    }

    public static class Oooo0 extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setTranslationY(OooO00o(f));
        }
    }

    public static class Oooo000 extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setTranslationX(OooO00o(f));
        }
    }

    public static class o000oOoO extends oo0o0Oo {
        @Override // p063o0000o0o.oo0o0Oo
        public final void OooO0o0(View view, float f) {
            view.setTranslationZ(OooO00o(f));
        }
    }

    public abstract void OooO0o0(View view, float f);
}
