package p063o0000o0o;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import p057o0000Oo0.o00000;
import p057o0000Oo0.o000000;
import p057o0000Oo0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0O0O00 extends o0000OO0 {

    public static class OooO extends o0O0O00 {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f27897OooOO0O = false;

        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(OooO0Oo(f, j, view, o00000Var));
            } else {
                if (this.f27897OooOO0O) {
                    return false;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f27897OooOO0O = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(OooO0Oo(f, j, view, o00000Var)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.f27622OooO0oo;
        }
    }

    public static class OooO00o extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setAlpha(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooO0O0 extends o0O0O00 {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f27898OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f27899OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float[] f27900OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public SparseArray<float[]> f27901OooOOO0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float[] f27902OooOOOO;

        public OooO0O0(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f27898OooOO0O = str.split(",")[1];
            this.f27899OooOO0o = sparseArray;
        }

        @Override // p057o0000Oo0.o0000OO0
        public final void OooO0O0(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // p057o0000Oo0.o0000OO0
        public final void OooO0OO(int i) {
            int size = this.f27899OooOO0o.size();
            int iOooO0Oo = this.f27899OooOO0o.valueAt(0).OooO0Oo();
            double[] dArr = new double[size];
            int i2 = iOooO0Oo + 2;
            this.f27900OooOOO = new float[i2];
            this.f27902OooOOOO = new float[iOooO0Oo];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f27899OooOO0o.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = this.f27899OooOO0o.valueAt(i3);
                float[] fArrValueAt = this.f27901OooOOO0.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.OooO0O0(this.f27900OooOOO);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f27900OooOOO;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                dArr2[i3][iOooO0Oo] = fArrValueAt[0];
                dArr2[i3][iOooO0Oo + 1] = fArrValueAt[1];
            }
            this.f27615OooO00o = o000000.OooO00o(i, dArr, dArr2);
        }

        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            this.f27615OooO00o.OooO0Oo(f, this.f27900OooOOO);
            float[] fArr = this.f27900OooOOO;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f27614OooO;
            if (Float.isNaN(this.f27623OooOO0)) {
                float fOooO00o = o00000Var.OooO00o(view, this.f27898OooOO0O);
                this.f27623OooOO0 = fOooO00o;
                if (Float.isNaN(fOooO00o)) {
                    this.f27623OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f27623OooOO0)) % 1.0d);
            this.f27623OooOO0 = f4;
            this.f27614OooO = j;
            float fOooO00o2 = OooO00o(f4);
            this.f27622OooO0oo = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f27902OooOOOO;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f27622OooO0oo;
                float[] fArr3 = this.f27900OooOOO;
                this.f27622OooO0oo = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * fOooO00o2) + f3;
                i++;
            }
            o0OOO0o.OooO0O0(this.f27899OooOO0o.valueAt(0), view, this.f27902OooOOOO);
            if (f2 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f27622OooO0oo = true;
            }
            return this.f27622OooO0oo;
        }
    }

    public static class OooO0OO extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setElevation(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooO0o extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            return this.f27622OooO0oo;
        }
    }

    public static class OooOO0 extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setRotation(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooOO0O extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setRotationX(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooOOO extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setScaleX(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooOOO0 extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setRotationY(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooOOOO extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setScaleY(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooOo extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setTranslationY(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class OooOo00 extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setTranslationX(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public static class Oooo000 extends o0O0O00 {
        @Override // p063o0000o0o.o0O0O00
        public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
            view.setTranslationZ(OooO0Oo(f, j, view, o00000Var));
            return this.f27622OooO0oo;
        }
    }

    public final float OooO0Oo(float f, long j, View view, o00000 o00000Var) {
        this.f27615OooO00o.OooO0Oo(f, this.f27621OooO0oO);
        float[] fArr = this.f27621OooO0oO;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f27622OooO0oo = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f27623OooOO0)) {
            float fOooO00o = o00000Var.OooO00o(view, this.f27619OooO0o);
            this.f27623OooOO0 = fOooO00o;
            if (Float.isNaN(fOooO00o)) {
                this.f27623OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
        }
        float f3 = (float) (((((j - this.f27614OooO) * 1.0E-9d) * ((double) f2)) + ((double) this.f27623OooOO0)) % 1.0d);
        this.f27623OooOO0 = f3;
        String str = this.f27619OooO0o;
        if (o00000Var.f27556OooO00o.containsKey(view)) {
            HashMap<String, float[]> map = o00000Var.f27556OooO00o.get(view);
            if (map == null) {
                map = new HashMap<>();
            }
            if (map.containsKey(str)) {
                float[] fArrCopyOf = map.get(str);
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
                o00000Var.f27556OooO00o.put(view, map);
            }
        } else {
            HashMap<String, float[]> map2 = new HashMap<>();
            map2.put(str, new float[]{f3});
            o00000Var.f27556OooO00o.put(view, map2);
        }
        this.f27614OooO = j;
        float f4 = this.f27621OooO0oO[0];
        float fOooO00o2 = (OooO00o(this.f27623OooOO0) * f4) + this.f27621OooO0oO[2];
        if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            z = false;
        }
        this.f27622OooO0oo = z;
        return fOooO00o2;
    }

    public abstract boolean OooO0o0(View view, float f, long j, o00000 o00000Var);
}
