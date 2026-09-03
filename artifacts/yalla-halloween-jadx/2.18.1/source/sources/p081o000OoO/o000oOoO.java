package p081o000OoO;

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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p069o0000oo0.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Shader f28334OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ColorStateList f28335OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f28336OooO0OO;

    public o000oOoO(Shader shader, ColorStateList colorStateList, @ColorInt int i) {
        this.f28334OooO00o = shader;
        this.f28335OooO0O0 = colorStateList;
        this.f28336OooO0OO = i;
    }

    @NonNull
    public static o000oOoO OooO00o(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
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
        Objects.requireNonNull(name);
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListOooO0O0 = Oooo0.OooO0O0(resources, xml, attributeSetAsAttributeSet, theme);
                return new o000oOoO(null, colorStateListOooO0O0, colorStateListOooO0O0.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(resources, theme, attributeSetAsAttributeSet, o000O0O0.GradientColor);
        float fOooO0o0 = o00oO0o.OooO0o0(typedArrayOooOO0, xml, "startX", o000O0O0.GradientColor_android_startX, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float fOooO0o1 = o00oO0o.OooO0o0(typedArrayOooOO0, xml, "startY", o000O0O0.GradientColor_android_startY, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float fOooO0o2 = o00oO0o.OooO0o0(typedArrayOooOO0, xml, "endX", o000O0O0.GradientColor_android_endX, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float fOooO0o3 = o00oO0o.OooO0o0(typedArrayOooOO0, xml, "endY", o000O0O0.GradientColor_android_endY, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float fOooO0o4 = o00oO0o.OooO0o0(typedArrayOooOO0, xml, "centerX", o000O0O0.GradientColor_android_centerX, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float fOooO0o5 = o00oO0o.OooO0o0(typedArrayOooOO0, xml, "centerY", o000O0O0.GradientColor_android_centerY, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        int iOooO0o = o00oO0o.OooO0o(typedArrayOooOO0, xml, "type", o000O0O0.GradientColor_android_type, 0);
        int iOooO0O0 = o00oO0o.OooO0O0(typedArrayOooOO0, xml, "startColor", o000O0O0.GradientColor_android_startColor);
        boolean zOooO = o00oO0o.OooO(xml, "centerColor");
        int iOooO0O1 = o00oO0o.OooO0O0(typedArrayOooOO0, xml, "centerColor", o000O0O0.GradientColor_android_centerColor);
        int iOooO0O2 = o00oO0o.OooO0O0(typedArrayOooOO0, xml, "endColor", o000O0O0.GradientColor_android_endColor);
        int iOooO0o2 = o00oO0o.OooO0o(typedArrayOooOO0, xml, "tileMode", o000O0O0.GradientColor_android_tileMode, 0);
        float fOooO0o6 = o00oO0o.OooO0o0(typedArrayOooOO0, xml, "gradientRadius", o000O0O0.GradientColor_android_gradientRadius, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        typedArrayOooOO0.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        Resources resources2 = resources;
        while (true) {
            int next2 = xml.next();
            f = fOooO0o2;
            if (next2 == 1) {
                f2 = fOooO0o1;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = fOooO0o1;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2) {
                if (depth2 > depth) {
                    resources2 = resources;
                } else if (xml.getName().equals("item")) {
                    TypedArray typedArrayOooOO1 = o00oO0o.OooOO0(resources2, theme, attributeSetAsAttributeSet, o000O0O0.GradientColorItem);
                    int i2 = o000O0O0.GradientColorItem_android_color;
                    boolean zHasValue = typedArrayOooOO1.hasValue(i2);
                    int i3 = o000O0O0.GradientColorItem_android_offset;
                    boolean zHasValue2 = typedArrayOooOO1.hasValue(i3);
                    if (!zHasValue || !zHasValue2) {
                        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                    }
                    int color = typedArrayOooOO1.getColor(i2, 0);
                    float f3 = typedArrayOooOO1.getFloat(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    typedArrayOooOO1.recycle();
                    arrayList2.add(Integer.valueOf(color));
                    arrayList.add(Float.valueOf(f3));
                    resources2 = resources;
                } else {
                    continue;
                }
            }
            fOooO0o2 = f;
            fOooO0o1 = f2;
        }
        o0OoOo0 o0oooo1 = arrayList2.size() > 0 ? new o0OoOo0(arrayList2, arrayList) : null;
        if (o0oooo1 == null) {
            o0oooo1 = zOooO ? new o0OoOo0(iOooO0O0, iOooO0O1, iOooO0O2) : new o0OoOo0(iOooO0O0, iOooO0O2);
        }
        if (iOooO0o != 1) {
            if (iOooO0o != 2) {
                int[] iArr = o0oooo1.f28345OooO00o;
                float[] fArr = o0oooo1.f28346OooO0O0;
                if (iOooO0o2 != 1) {
                    tileMode2 = iOooO0o2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(fOooO0o0, f2, f, fOooO0o3, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(fOooO0o4, fOooO0o5, o0oooo1.f28345OooO00o, o0oooo1.f28346OooO0O0);
            }
        } else {
            if (fOooO0o6 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = o0oooo1.f28345OooO00o;
            float[] fArr2 = o0oooo1.f28346OooO0O0;
            if (iOooO0o2 != 1) {
                tileMode = iOooO0o2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(fOooO0o4, fOooO0o5, fOooO0o6, iArr2, fArr2, tileMode);
        }
        return new o000oOoO(radialGradient, null, 0);
    }

    public final boolean OooO0O0() {
        return this.f28334OooO00o != null;
    }

    public final boolean OooO0OO() {
        ColorStateList colorStateList;
        return this.f28334OooO00o == null && (colorStateList = this.f28335OooO0O0) != null && colorStateList.isStateful();
    }

    public final boolean OooO0Oo(int[] iArr) {
        if (OooO0OO()) {
            ColorStateList colorStateList = this.f28335OooO0O0;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f28336OooO0OO) {
                this.f28336OooO0OO = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0o0() {
        return OooO0O0() || this.f28336OooO0OO != 0;
    }
}
