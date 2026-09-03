package androidx.constraintlayout.widget;

import OooO0o.OooO0o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import p016OooOoO0.OooOo00;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAttribute {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f7495OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f7496OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AttributeType f7497OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f7499OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f7500OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f7501OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f7502OooO0oo;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f7503OooO00o;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f7503OooO00o = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7503OooO00o[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7503OooO00o[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7503OooO00o[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7503OooO00o[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7503OooO00o[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7503OooO00o[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7503OooO00o[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.f7496OooO0O0 = str;
        this.f7497OooO0OO = attributeType;
        this.f7495OooO00o = z;
        OooO0oO(obj);
    }

    public static void OooO0o(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String strOooO00o = !constraintAttribute.f7495OooO00o ? OooOo00.OooO00o("set", str) : str;
            try {
                switch (OooO00o.f7503OooO00o[constraintAttribute.f7497OooO0OO.ordinal()]) {
                    case 1:
                        cls.getMethod(strOooO00o, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f7498OooO0Oo));
                        break;
                    case 2:
                        cls.getMethod(strOooO00o, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f7501OooO0oO));
                        break;
                    case 3:
                        cls.getMethod(strOooO00o, CharSequence.class).invoke(view, constraintAttribute.f7499OooO0o);
                        break;
                    case 4:
                        cls.getMethod(strOooO00o, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f7502OooO0oo));
                        break;
                    case 5:
                        Method method = cls.getMethod(strOooO00o, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f7502OooO0oo);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(strOooO00o, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f7498OooO0Oo));
                        break;
                    case 7:
                        cls.getMethod(strOooO00o, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f7500OooO0o0));
                        break;
                    case 8:
                        cls.getMethod(strOooO00o, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f7500OooO0o0));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbOooO00o = OooO0o.OooO00o(" Custom Attribute \"", str, "\" not found on ");
                sbOooO00o.append(cls.getName());
                Log.e("TransitionLayout", sbOooO00o.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(strOooO00o);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e3) {
                StringBuilder sbOooO00o2 = OooO0o.OooO00o(" Custom Attribute \"", str, "\" not found on ");
                sbOooO00o2.append(cls.getName());
                Log.e("TransitionLayout", sbOooO00o2.toString());
                e3.printStackTrace();
            }
        }
    }

    public static void OooO0o0(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == o000O00.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == o000O00.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == o000O00.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == o000O00.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == o000O00.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == o000O00.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), context.getResources().getDisplayMetrics()));
                } else if (index == o000O00.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == o000O00.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == o000O00.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == o000O00.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new ConstraintAttribute(string, attributeType2, objValueOf2, z));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float OooO00o() {
        switch (OooO00o.f7503OooO00o[this.f7497OooO0OO.ordinal()]) {
            case 2:
                if (this.f7501OooO0oO) {
                    return 1.0f;
                }
                return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f7498OooO0Oo;
            case 7:
                return this.f7500OooO0o0;
            case 8:
                return this.f7500OooO0o0;
            default:
                return Float.NaN;
        }
    }

    public final void OooO0O0(float[] fArr) {
        switch (OooO00o.f7503OooO00o[this.f7497OooO0OO.ordinal()]) {
            case 2:
                fArr[0] = this.f7501OooO0oO ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.f7502OooO0oo;
                int i2 = (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i3 = (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i4 = (i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i5 = i & KotlinVersion.MAX_COMPONENT_VALUE;
                float fPow = (float) Math.pow(i3 / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(i4 / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow(i5 / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f7498OooO0Oo;
                return;
            case 7:
                fArr[0] = this.f7500OooO0o0;
                return;
            case 8:
                fArr[0] = this.f7500OooO0o0;
                return;
            default:
                return;
        }
    }

    public final boolean OooO0OO() {
        int i = OooO00o.f7503OooO00o[this.f7497OooO0OO.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public final int OooO0Oo() {
        int i = OooO00o.f7503OooO00o[this.f7497OooO0OO.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    public final void OooO0oO(Object obj) {
        switch (OooO00o.f7503OooO00o[this.f7497OooO0OO.ordinal()]) {
            case 1:
            case 6:
                this.f7498OooO0Oo = ((Integer) obj).intValue();
                break;
            case 2:
                this.f7501OooO0oO = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f7499OooO0o = (String) obj;
                break;
            case 4:
            case 5:
                this.f7502OooO0oo = ((Integer) obj).intValue();
                break;
            case 7:
                this.f7500OooO0o0 = ((Float) obj).floatValue();
                break;
            case 8:
                this.f7500OooO0o0 = ((Float) obj).floatValue();
                break;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f7495OooO00o = false;
        this.f7496OooO0O0 = constraintAttribute.f7496OooO0O0;
        this.f7497OooO0OO = constraintAttribute.f7497OooO0OO;
        OooO0oO(obj);
    }
}
