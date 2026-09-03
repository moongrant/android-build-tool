package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import oOO00O.o0OoOo0;
import org.xmlpull.v1.XmlPullParser;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class ArcMotion extends PathMotion {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float f11176OooO0Oo = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f11177OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f11178OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f11179OooO0OO;

    public ArcMotion() {
        this.f11177OooO00o = 0.0f;
        this.f11178OooO0O0 = 0.0f;
        this.f11179OooO0OO = f11176OooO0Oo;
    }

    public static float OooO0O0(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public final Path OooO00o(float f, float f2, float f3, float f4) {
        float fOooO00o;
        float fOooO00o2;
        float f5;
        Path path = new Path();
        path.moveTo(f, f2);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        float f8 = (f7 * f7) + (f6 * f6);
        float f9 = (f + f3) / 2.0f;
        float f10 = (f2 + f4) / 2.0f;
        float f11 = 0.25f * f8;
        boolean z = f2 > f4;
        if (Math.abs(f6) < Math.abs(f7)) {
            float fAbs = Math.abs(f8 / (f7 * 2.0f));
            if (z) {
                fOooO00o2 = fAbs + f4;
                fOooO00o = f3;
            } else {
                fOooO00o2 = fAbs + f2;
                fOooO00o = f;
            }
            f5 = this.f11178OooO0O0;
        } else {
            float f12 = f8 / (f6 * 2.0f);
            if (z) {
                fOooO00o2 = f2;
                fOooO00o = f12 + f;
            } else {
                fOooO00o = f3 - f12;
                fOooO00o2 = f4;
            }
            f5 = this.f11177OooO00o;
        }
        float f13 = f11 * f5 * f5;
        float f14 = f9 - fOooO00o;
        float f15 = f10 - fOooO00o2;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.f11179OooO0OO;
        float f18 = f11 * f17 * f17;
        if (f16 >= f13) {
            f13 = f16 > f18 ? f18 : 0.0f;
        }
        if (f13 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f13 / f16);
            fOooO00o = OooOo.OooO0o.OooO00o(fOooO00o, f9, fSqrt, f9);
            fOooO00o2 = OooOo.OooO0o.OooO00o(fOooO00o2, f10, fSqrt, f10);
        }
        path.cubicTo((f + fOooO00o) / 2.0f, (f2 + fOooO00o2) / 2.0f, (fOooO00o + f3) / 2.0f, (fOooO00o2 + f4) / 2.0f, f3, f4);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11177OooO00o = 0.0f;
        this.f11178OooO0O0 = 0.0f;
        this.f11179OooO0OO = f11176OooO0Oo;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60171OooO0oo);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f11178OooO0O0 = OooO0O0(oo000o.OooO0Oo(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f11177OooO00o = OooO0O0(oo000o.OooO0Oo(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.f11179OooO0OO = OooO0O0(oo000o.OooO0Oo(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
