package p063o0000o0o;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p057o0000Oo0.o00000O;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OO00O extends o00000O {

    public static class OooO extends o0OO00O {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f27903OooO0oO = false;

        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO00o(f));
                return;
            }
            if (this.f27903OooO0oO) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f27903OooO0oO = true;
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

    public static class OooO00o extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setAlpha(OooO00o(f));
        }
    }

    public static class OooO0O0 extends o0OO00O {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float[] f27904OooO0oO = new float[1];

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ConstraintAttribute f27905OooO0oo;

        @Override // p057o0000Oo0.o00000O
        public final void OooO0OO(Object obj) {
            this.f27905OooO0oo = (ConstraintAttribute) obj;
        }

        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            this.f27904OooO0oO[0] = OooO00o(f);
            o0OOO0o.OooO0O0(this.f27905OooO0oo, view, this.f27904OooO0oO);
        }
    }

    public static class OooO0OO extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setElevation(OooO00o(f));
        }
    }

    public static class OooO0o extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
        }
    }

    public static class OooOO0 extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setRotation(OooO00o(f));
        }
    }

    public static class OooOO0O extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setRotationX(OooO00o(f));
        }
    }

    public static class OooOOO extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setScaleX(OooO00o(f));
        }
    }

    public static class OooOOO0 extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setRotationY(OooO00o(f));
        }
    }

    public static class OooOOOO extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setScaleY(OooO00o(f));
        }
    }

    public static class OooOo extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setTranslationY(OooO00o(f));
        }
    }

    public static class OooOo00 extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setTranslationX(OooO00o(f));
        }
    }

    public static class Oooo000 extends o0OO00O {
        @Override // p063o0000o0o.o0OO00O
        public final void OooO0o0(View view, float f) {
            view.setTranslationZ(OooO00o(f));
        }
    }

    public abstract void OooO0o0(View view, float f);
}
