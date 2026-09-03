package p058o0000Ooo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Array;
import o00000O0.OooO00o;
import o00000O0.OooO0o;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f34236OooO00o = new ThreadLocal<>();

    @NonNull
    public static ColorStateList OooO00o(@NonNull Resources resources, @NonNull XmlResourceParser xmlResourceParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return OooO0O0(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    @NonNull
    public static ColorStateList OooO0O0(@NonNull Resources resources, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        float f2;
        int[] iArr;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z2 = true;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z2 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = OooO0o.ColorStateListItem;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i, i);
                int i3 = OooO0o.ColorStateListItem_android_color;
                int resourceId = typedArrayObtainAttributes.getResourceId(i3, -1);
                if (resourceId == -1) {
                    color = typedArrayObtainAttributes.getColor(i3, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = f34236OooO00o;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, z2);
                    int i4 = typedValue.type;
                    if (((i4 < 28 || i4 > 31) ? i : z2) == 0) {
                        try {
                            color = OooO00o(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(OooO0o.ColorStateListItem_android_color, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i3, -65281);
                    }
                }
                int i5 = OooO0o.ColorStateListItem_android_alpha;
                if (typedArrayObtainAttributes.hasValue(i5)) {
                    f = typedArrayObtainAttributes.getFloat(i5, 1.0f);
                } else {
                    int i6 = OooO0o.ColorStateListItem_alpha;
                    f = typedArrayObtainAttributes.hasValue(i6) ? typedArrayObtainAttributes.getFloat(i6, 1.0f) : 1.0f;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i7 = OooO0o.ColorStateListItem_android_lStar;
                    if (typedArrayObtainAttributes.hasValue(i7)) {
                        f2 = typedArrayObtainAttributes.getFloat(i7, -1.0f);
                    } else {
                        f2 = typedArrayObtainAttributes.getFloat(OooO0o.ColorStateListItem_lStar, -1.0f);
                    }
                } else {
                    f2 = typedArrayObtainAttributes.getFloat(OooO0o.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i8 = i;
                for (int i9 = i8; i9 < attributeCount; i9++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i9);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != OooO00o.alpha && attributeNameResource != OooO00o.lStar) {
                        int i10 = i8 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i9, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i8] = attributeNameResource;
                        i8 = i10;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i8);
                float f7 = 0.0f;
                float f8 = 100.0f;
                boolean z3 = f2 >= 0.0f && f2 <= 100.0f;
                if (f != 1.0f || z3) {
                    int iOooO0O0 = o0000O00.OooO00o.OooO0O0((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z3) {
                        Oooo000 oooo000OooO00o = Oooo000.OooO00o(color);
                        o00oO0o o00oo0o2 = o00oO0o.f34243OooOO0O;
                        float f9 = oooo000OooO00o.f34231OooO0O0;
                        if (f9 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                            float f10 = oooo000OooO00o.f34230OooO00o;
                            float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
                            float f11 = 0.0f;
                            float f12 = f9;
                            Oooo000 oooo000 = null;
                            boolean z4 = true;
                            while (true) {
                                if (Math.abs(f11 - f9) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z = true;
                                    if (oooo000 != null) {
                                        color = oooo000.OooO0OO(o00oo0o2);
                                        break;
                                    }
                                    color = Oooo0.OooO00o(f2);
                                    break;
                                }
                                float f13 = 1000.0f;
                                float f14 = f7;
                                float f15 = f8;
                                float f16 = 1000.0f;
                                Oooo000 oooo001 = null;
                                while (true) {
                                    if (Math.abs(f14 - f15) <= 0.01f) {
                                        depth2 = depth2;
                                        f3 = fMin;
                                        f4 = f8;
                                        z = true;
                                        float f17 = f7;
                                        iArr = iArrTrimStateSet;
                                        f5 = f17;
                                        break;
                                    }
                                    float f18 = ((f15 - f14) / 2.0f) + f14;
                                    int iOooO0OO = Oooo000.OooO0O0(f18, f12, fMin).OooO0OO(o00oO0o.f34243OooOO0O);
                                    float fOooO0O0 = Oooo0.OooO0O0(Color.red(iOooO0OO));
                                    float fOooO0O1 = Oooo0.OooO0O0(Color.green(iOooO0OO));
                                    float fOooO0O2 = Oooo0.OooO0O0(Color.blue(iOooO0OO));
                                    z = true;
                                    float[] fArr = Oooo0.f34229OooO0Oo[1];
                                    f4 = 100.0f;
                                    float f19 = ((fOooO0O2 * fArr[2]) + ((fOooO0O1 * fArr[1]) + (fOooO0O0 * fArr[0]))) / 100.0f;
                                    float fCbrt = f19 <= 0.008856452f ? f19 * 903.2963f : (((float) Math.cbrt(f19)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f2 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        Oooo000 oooo000OooO00o2 = Oooo000.OooO00o(iOooO0OO);
                                        Oooo000 oooo000OooO0O0 = Oooo000.OooO0O0(oooo000OooO00o2.f34232OooO0OO, oooo000OooO00o2.f34231OooO0O0, fMin);
                                        f6 = f18;
                                        float f20 = oooo000OooO00o2.f34233OooO0Oo - oooo000OooO0O0.f34233OooO0Oo;
                                        f3 = fMin;
                                        float f21 = oooo000OooO00o2.f34235OooO0o0 - oooo000OooO0O0.f34235OooO0o0;
                                        float f22 = oooo000OooO00o2.f34234OooO0o - oooo000OooO0O0.f34234OooO0o;
                                        double dSqrt = Math.sqrt((f22 * f22) + (f21 * f21) + (f20 * f20));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f16 = fPow;
                                            oooo001 = oooo000OooO00o2;
                                            f13 = fAbs;
                                        }
                                    } else {
                                        f6 = f18;
                                        f3 = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f5 = 0.0f;
                                    if (f13 == 0.0f && f16 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f2) {
                                        f14 = f6;
                                    } else {
                                        f15 = f6;
                                    }
                                    f8 = 100.0f;
                                    depth2 = depth2;
                                    fMin = f3;
                                    int[] iArr5 = iArr;
                                    f7 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                Oooo000 oooo002 = oooo001;
                                if (!z4) {
                                    if (oooo002 == null) {
                                        f9 = f12;
                                        f12 = f11;
                                    } else {
                                        oooo000 = oooo002;
                                    }
                                    f11 = f12;
                                    f12 = ((f9 - f12) / 2.0f) + f12;
                                } else {
                                    if (oooo002 != null) {
                                        color = oooo002.OooO0OO(o00oo0o2);
                                        break;
                                    }
                                    f12 = ((f9 - f11) / 2.0f) + f11;
                                    z4 = false;
                                }
                                f8 = f4;
                                depth2 = depth2;
                                fMin = f3;
                                int[] iArr6 = iArr;
                                f7 = f5;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z = true;
                            color = Oooo0.OooO00o(f2);
                        }
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z = true;
                    }
                    color = (16777215 & color) | (iOooO0O0 << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z = true;
                }
                int i11 = i2 + 1;
                if (i11 > iArr2.length) {
                    int[] iArr7 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i2);
                    iArr2 = iArr7;
                }
                iArr2[i2] = color;
                if (i11 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArr;
                objArr = (int[][]) objArr;
                i2 = i11;
                z2 = z;
                depth2 = depth2;
                i = 0;
            } else {
                z2 = z2;
                depth2 = depth2;
                i = 0;
            }
        }
        int[] iArr8 = new int[i2];
        int[][] iArr9 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr8, 0, i2);
        System.arraycopy(objArr, 0, iArr9, 0, i2);
        return new ColorStateList(iArr9, iArr8);
    }
}
