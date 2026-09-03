package o000000;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p416o0Oo0oo.oO00o000;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO extends oO00o000 {

    public static class OooO extends OooO0OO {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f33230OooO0oO = false;

        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO00o(f));
                return;
            }
            if (this.f33230OooO0oO) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f33230OooO0oO = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(OooO00o(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    public static class OooO00o extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setAlpha(OooO00o(f));
        }
    }

    public static class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float[] f33231OooO0oO = new float[1];

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ConstraintAttribute f33232OooO0oo;

        @Override // p416o0Oo0oo.oO00o000
        public final void OooO0OO(ConstraintAttribute constraintAttribute) {
            this.f33232OooO0oo = constraintAttribute;
        }

        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            float fOooO00o = OooO00o(f);
            float[] fArr = this.f33231OooO0oO;
            fArr[0] = fOooO00o;
            o000000.OooO00o.OooO0O0(this.f33232OooO0oo, view, fArr);
        }
    }

    /* JADX INFO: renamed from: o000000.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C0388OooO0OO extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setElevation(OooO00o(f));
        }
    }

    public static class OooO0o extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
        }
    }

    public static class OooOO0 extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setRotation(OooO00o(f));
        }
    }

    public static class OooOO0O extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setRotationX(OooO00o(f));
        }
    }

    public static class OooOOO extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setScaleX(OooO00o(f));
        }
    }

    public static class OooOOO0 extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setRotationY(OooO00o(f));
        }
    }

    public static class OooOOOO extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setScaleY(OooO00o(f));
        }
    }

    public static class OooOo extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setTranslationY(OooO00o(f));
        }
    }

    public static class OooOo00 extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setTranslationX(OooO00o(f));
        }
    }

    public static class Oooo000 extends OooO0OO {
        @Override // o000000.OooO0OO
        public final void OooO0o0(View view, float f) {
            view.setTranslationZ(OooO00o(f));
        }
    }

    public abstract void OooO0o0(View view, float f);
}
