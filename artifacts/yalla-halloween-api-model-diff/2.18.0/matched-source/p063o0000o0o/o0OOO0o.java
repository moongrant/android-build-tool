package p063o0000o0o;

import OooO0o.OooO0o;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.KotlinVersion;
import p060o0000o.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f27926OooO00o;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            f27926OooO00o = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27926OooO00o[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27926OooO00o[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27926OooO00o[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27926OooO00o[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27926OooO00o[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27926OooO00o[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static int OooO00o(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static void OooO0O0(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("set");
        sbOooO0O0.append(constraintAttribute.f7496OooO0O0);
        String string = sbOooO0O0.toString();
        try {
            boolean z = true;
            switch (OooO00o.f27926OooO00o[constraintAttribute.f7497OooO0OO.ordinal()]) {
                case 1:
                    cls.getMethod(string, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(string, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(string, Drawable.class);
                    int iOooO00o = (OooO00o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (OooO00o((int) (fArr[3] * 255.0f)) << 24) | (OooO00o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | OooO00o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iOooO00o);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(string, Integer.TYPE).invoke(view, Integer.valueOf((OooO00o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (OooO00o((int) (fArr[3] * 255.0f)) << 24) | (OooO00o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | OooO00o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.f7496OooO0O0);
                case 6:
                    Method method2 = cls.getMethod(string, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(string, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sbOooO00o = OooO0o.OooO00o("cannot access method ", string, " on View \"");
            sbOooO00o.append(OooO.OooO0Oo(view));
            sbOooO00o.append("\"");
            Log.e("CustomSupport", sbOooO00o.toString());
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            StringBuilder sbOooO00o2 = OooO0o.OooO00o("no method ", string, " on View \"");
            sbOooO00o2.append(OooO.OooO0Oo(view));
            sbOooO00o2.append("\"");
            Log.e("CustomSupport", sbOooO00o2.toString());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }
}
