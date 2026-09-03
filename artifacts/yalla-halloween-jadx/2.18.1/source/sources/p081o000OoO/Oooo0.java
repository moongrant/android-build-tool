package p081o000OoO;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.lang.reflect.Array;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p021OooOooo.o00O0O;
import p069o0000oo0.o000O0;
import p069o0000oo0.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f28329OooO00o = new ThreadLocal<>();

    @NonNull
    public static ColorStateList OooO00o(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return OooO0O0(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    @NonNull
    public static ColorStateList OooO0O0(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int[] iArr;
        int color;
        float f;
        float f2;
        float f3;
        TypedValue typedValue;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = true;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = o000O0O0.ColorStateListItem;
                TypedArray typedArrayObtainAttributes = theme == 0 ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i, i);
                int i3 = o000O0O0.ColorStateListItem_android_color;
                int resourceId = typedArrayObtainAttributes.getResourceId(i3, -1);
                if (resourceId == -1) {
                    color = typedArrayObtainAttributes.getColor(i3, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = f28329OooO00o;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, z);
                    int i4 = typedValue.type;
                    if (i4 >= 28 && i4 <= 31) {
                        color = typedArrayObtainAttributes.getColor(i3, -65281);
                    } else {
                        try {
                            color = OooO00o(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(o000O0O0.ColorStateListItem_android_color, -65281);
                        }
                    }
                }
                int i5 = o000O0O0.ColorStateListItem_android_alpha;
                if (typedArrayObtainAttributes.hasValue(i5)) {
                    f = typedArrayObtainAttributes.getFloat(i5, 1.0f);
                } else {
                    int i6 = o000O0O0.ColorStateListItem_alpha;
                    f = typedArrayObtainAttributes.hasValue(i6) ? typedArrayObtainAttributes.getFloat(i6, 1.0f) : 1.0f;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i7 = o000O0O0.ColorStateListItem_android_lStar;
                    if (typedArrayObtainAttributes.hasValue(i7)) {
                        f2 = typedArrayObtainAttributes.getFloat(i7, -1.0f);
                    } else {
                        f2 = typedArrayObtainAttributes.getFloat(o000O0O0.ColorStateListItem_lStar, -1.0f);
                    }
                } else {
                    f2 = typedArrayObtainAttributes.getFloat(o000O0O0.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i8 = 0;
                for (int i9 = 0; i9 < attributeCount; i9++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i9);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != o000O0.alpha && attributeNameResource != o000O0.lStar) {
                        int i10 = i8 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i9, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i8] = attributeNameResource;
                        i8 = i10;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i8);
                boolean z2 = f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 <= 100.0f;
                if (f != 1.0f || z2) {
                    int iOooO0o0 = o00O0O.OooO0o0((int) ((Color.alpha(color) * f) + 0.5f), 0, KotlinVersion.MAX_COMPONENT_VALUE);
                    if (z2) {
                        OooOo oooOoOooO00o = OooOo.OooO00o(color);
                        float f4 = oooOoOooO00o.f28323OooO00o;
                        float f5 = oooOoOooO00o.f28324OooO0O0;
                        o0ooOOo o0ooooo2 = o0ooOOo.f28347OooOO0O;
                        if (f5 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                            float fMin = f4 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : Math.min(360.0f, f4);
                            float f6 = f5;
                            OooOo oooOo = null;
                            boolean z3 = true;
                            float f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            while (true) {
                                if (Math.abs(f7 - f5) < 0.4f) {
                                    depth2 = depth2;
                                    iArr2 = iArr2;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    if (oooOo != null) {
                                        color = oooOo.OooO0OO(o0ooooo2);
                                        break;
                                    }
                                    color = Oooo000.OooO00o(f2);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = 1000.0f;
                                float f10 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                float f11 = 100.0f;
                                OooOo oooOo2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f11) <= 0.01f) {
                                        depth2 = depth2;
                                        iArr2 = iArr2;
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        break;
                                    }
                                    float f12 = ((f11 - f10) / 2.0f) + f10;
                                    int iOooO0OO = OooOo.OooO0O0(f12, f6, fMin).OooO0OO(o0ooOOo.f28347OooOO0O);
                                    float fOooO0O0 = Oooo000.OooO0O0(Color.red(iOooO0OO));
                                    float fOooO0O1 = Oooo000.OooO0O0(Color.green(iOooO0OO));
                                    float fOooO0O2 = Oooo000.OooO0O0(Color.blue(iOooO0OO));
                                    float[][] fArr = Oooo000.f28333OooO0Oo;
                                    float f13 = ((fOooO0O2 * fArr[1][2]) + ((fOooO0O1 * fArr[1][1]) + (fOooO0O0 * fArr[1][0]))) / 100.0f;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f2 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        OooOo oooOoOooO00o2 = OooOo.OooO00o(iOooO0OO);
                                        depth2 = depth2;
                                        OooOo oooOoOooO0O0 = OooOo.OooO0O0(oooOoOooO00o2.f28325OooO0OO, oooOoOooO00o2.f28324OooO0O0, fMin);
                                        float f14 = oooOoOooO00o2.f28326OooO0Oo - oooOoOooO0O0.f28326OooO0Oo;
                                        f3 = f12;
                                        float f15 = oooOoOooO00o2.f28328OooO0o0 - oooOoOooO0O0.f28328OooO0o0;
                                        float f16 = oooOoOooO00o2.f28327OooO0o - oooOoOooO0O0.f28327OooO0o;
                                        double dSqrt = Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14));
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f9 = fPow;
                                            oooOo2 = oooOoOooO00o2;
                                            f8 = fAbs;
                                        }
                                    } else {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f3 = f12;
                                    }
                                    if (f8 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f9 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        break;
                                    }
                                    if (fCbrt < f2) {
                                        f10 = f3;
                                    } else {
                                        f11 = f3;
                                    }
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    iArr2 = iArr2;
                                    depth2 = depth2;
                                }
                                OooOo oooOo3 = oooOo2;
                                if (!z3) {
                                    if (oooOo3 == null) {
                                        f5 = f6;
                                    } else {
                                        oooOo = oooOo3;
                                        f7 = f6;
                                    }
                                    f6 = ((f5 - f7) / 2.0f) + f7;
                                } else {
                                    if (oooOo3 != null) {
                                        color = oooOo3.OooO0OO(o0ooooo2);
                                        break;
                                    }
                                    f6 = ((f5 - f7) / 2.0f) + f7;
                                    z3 = false;
                                }
                            }
                        } else {
                            depth2 = depth2;
                            iArr2 = iArr2;
                            iArrTrimStateSet = iArrTrimStateSet;
                            color = Oooo000.OooO00o(f2);
                        }
                    } else {
                        depth2 = depth2;
                        iArr2 = iArr2;
                        iArrTrimStateSet = iArrTrimStateSet;
                    }
                    color = (16777215 & color) | (iOooO0o0 << 24);
                } else {
                    depth2 = depth2;
                    iArr2 = iArr2;
                    iArrTrimStateSet = iArrTrimStateSet;
                }
                int i11 = i2 + 1;
                iArr = iArr2;
                if (i11 > iArr.length) {
                    int[] iArr5 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr5, 0, i2);
                    iArr = iArr5;
                }
                iArr[i2] = color;
                if (i11 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i11;
            } else {
                depth2 = depth2;
                iArr = iArr2;
            }
            iArr2 = iArr;
            depth2 = depth2;
            z = true;
            i = 0;
        }
        int[] iArr6 = new int[i2];
        int[][] iArr7 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr6, 0, i2);
        System.arraycopy(objArr, 0, iArr7, 0, i2);
        return new ColorStateList(iArr7, iArr6);
    }
}
