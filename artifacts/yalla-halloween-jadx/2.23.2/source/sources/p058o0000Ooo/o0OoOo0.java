package p058o0000Ooo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.ArrayList;
import o00000O0.OooOO0O;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Shader f33742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ColorStateList f33743OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33744OooO0OO;

    public o0OoOo0(Shader shader, ColorStateList colorStateList, @ColorInt int i) {
        this.f33742OooO00o = shader;
        this.f33743OooO0O0 = colorStateList;
        this.f33744OooO0OO = i;
    }

    @NonNull
    public static o0OoOo0 OooO00o(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int i2;
        int color;
        float f;
        float f2;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListOooO0O0 = o000oOoO.OooO0O0(resources, xml, attributeSetAsAttributeSet, theme);
                return new o0OoOo0(null, colorStateListOooO0O0, colorStateListOooO0O0.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayOooO0oo = oo000o.OooO0oo(resources, theme, attributeSetAsAttributeSet, OooOO0O.GradientColor);
        float fOooO0Oo = oo000o.OooO0Oo(typedArrayOooO0oo, xml, "startX", OooOO0O.GradientColor_android_startX, 0.0f);
        float fOooO0Oo2 = oo000o.OooO0Oo(typedArrayOooO0oo, xml, "startY", OooOO0O.GradientColor_android_startY, 0.0f);
        float fOooO0Oo3 = oo000o.OooO0Oo(typedArrayOooO0oo, xml, "endX", OooOO0O.GradientColor_android_endX, 0.0f);
        float fOooO0Oo4 = oo000o.OooO0Oo(typedArrayOooO0oo, xml, "endY", OooOO0O.GradientColor_android_endY, 0.0f);
        float fOooO0Oo5 = oo000o.OooO0Oo(typedArrayOooO0oo, xml, "centerX", OooOO0O.GradientColor_android_centerX, 0.0f);
        float fOooO0Oo6 = oo000o.OooO0Oo(typedArrayOooO0oo, xml, "centerY", OooOO0O.GradientColor_android_centerY, 0.0f);
        int iOooO0o0 = oo000o.OooO0o0(typedArrayOooO0oo, xml, "type", OooOO0O.GradientColor_android_type, 0);
        int color2 = !oo000o.OooO0oO(xml, "startColor") ? 0 : typedArrayOooO0oo.getColor(OooOO0O.GradientColor_android_startColor, 0);
        boolean zOooO0oO = oo000o.OooO0oO(xml, "centerColor");
        int color3 = !oo000o.OooO0oO(xml, "centerColor") ? 0 : typedArrayOooO0oo.getColor(OooOO0O.GradientColor_android_centerColor, 0);
        int i3 = OooOO0O.GradientColor_android_endColor;
        if (oo000o.OooO0oO(xml, "endColor")) {
            i2 = 0;
            color = typedArrayOooO0oo.getColor(i3, 0);
        } else {
            i2 = 0;
            color = 0;
        }
        int iOooO0o1 = oo000o.OooO0o0(typedArrayOooO0oo, xml, "tileMode", OooOO0O.GradientColor_android_tileMode, i2);
        float fOooO0Oo7 = oo000o.OooO0Oo(typedArrayOooO0oo, xml, "gradientRadius", OooOO0O.GradientColor_android_gradientRadius, 0.0f);
        typedArrayOooO0oo.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        Resources resources2 = resources;
        while (true) {
            int next2 = xml.next();
            f = fOooO0Oo3;
            if (next2 == 1) {
                f2 = fOooO0Oo2;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = fOooO0Oo2;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2) {
                if (depth2 > depth) {
                    resources2 = resources;
                } else if (xml.getName().equals("item")) {
                    TypedArray typedArrayOooO0oo2 = oo000o.OooO0oo(resources2, theme, attributeSetAsAttributeSet, OooOO0O.GradientColorItem);
                    int i4 = OooOO0O.GradientColorItem_android_color;
                    boolean zHasValue = typedArrayOooO0oo2.hasValue(i4);
                    int i5 = OooOO0O.GradientColorItem_android_offset;
                    boolean zHasValue2 = typedArrayOooO0oo2.hasValue(i5);
                    if (!zHasValue || !zHasValue2) {
                        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                    }
                    int color4 = typedArrayOooO0oo2.getColor(i4, 0);
                    float f3 = typedArrayOooO0oo2.getFloat(i5, 0.0f);
                    typedArrayOooO0oo2.recycle();
                    arrayList2.add(Integer.valueOf(color4));
                    arrayList.add(Float.valueOf(f3));
                    resources2 = resources;
                } else {
                    continue;
                }
            }
            fOooO0Oo3 = f;
            fOooO0Oo2 = f2;
        }
        o00O0O o00o0o2 = arrayList2.size() > 0 ? new o00O0O(arrayList2, arrayList) : null;
        if (o00o0o2 == null) {
            o00o0o2 = zOooO0oO ? new o00O0O(color2, color3, color) : new o00O0O(color2, color);
        }
        if (iOooO0o0 != 1) {
            if (iOooO0o0 != 2) {
                int[] iArr = o00o0o2.f33724OooO00o;
                float[] fArr = o00o0o2.f33725OooO0O0;
                if (iOooO0o1 != 1) {
                    tileMode2 = iOooO0o1 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(fOooO0Oo, f2, f, fOooO0Oo4, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(fOooO0Oo5, fOooO0Oo6, o00o0o2.f33724OooO00o, o00o0o2.f33725OooO0O0);
            }
        } else {
            if (fOooO0Oo7 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = o00o0o2.f33724OooO00o;
            float[] fArr2 = o00o0o2.f33725OooO0O0;
            if (iOooO0o1 != 1) {
                tileMode = iOooO0o1 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(fOooO0Oo5, fOooO0Oo6, fOooO0Oo7, iArr2, fArr2, tileMode);
        }
        return new o0OoOo0(radialGradient, null, 0);
    }

    public final boolean OooO0O0() {
        ColorStateList colorStateList;
        return this.f33742OooO00o == null && (colorStateList = this.f33743OooO0O0) != null && colorStateList.isStateful();
    }
}
