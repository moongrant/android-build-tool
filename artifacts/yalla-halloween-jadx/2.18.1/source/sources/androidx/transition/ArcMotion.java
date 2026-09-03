package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.xmlpull.v1.XmlPullParser;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000Oo;

/* JADX INFO: loaded from: classes.dex */
public class ArcMotion extends PathMotion {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float f9432OooO0Oo = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f9433OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f9434OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f9435OooO0OO;

    public ArcMotion() {
        this.f9433OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f9434OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f9435OooO0OO = f9432OooO0Oo;
    }

    public static float OooO0O0(float f) {
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f > 90.0f) {
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
            f5 = this.f9434OooO0O0;
        } else {
            float f12 = f8 / (f6 * 2.0f);
            if (z) {
                fOooO00o2 = f2;
                fOooO00o = f12 + f;
            } else {
                fOooO00o = f3 - f12;
                fOooO00o2 = f4;
            }
            f5 = this.f9433OooO00o;
        }
        float f13 = f11 * f5 * f5;
        float f14 = f9 - fOooO00o;
        float f15 = f10 - fOooO00o2;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.f9435OooO0OO;
        float f18 = f11 * f17 * f17;
        if (f16 >= f13) {
            f13 = f16 > f18 ? f18 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (f13 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            float fSqrt = (float) Math.sqrt(f13 / f16);
            fOooO00o = Oooo000.OooO00o.OooO00o(fOooO00o, f9, fSqrt, f9);
            fOooO00o2 = Oooo000.OooO00o.OooO00o(fOooO00o2, f10, fSqrt, f10);
        }
        path.cubicTo((f + fOooO00o) / 2.0f, (f2 + fOooO00o2) / 2.0f, (fOooO00o + f3) / 2.0f, (fOooO00o2 + f4) / 2.0f, f3, f4);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9433OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f9434OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f9435OooO0OO = f9432OooO0Oo;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29738OooO0oo);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f9434OooO0O0 = OooO0O0(o00oO0o.OooO0o0(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        this.f9433OooO00o = OooO0O0(o00oO0o.OooO0o0(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        this.f9435OooO0OO = OooO0O0(o00oO0o.OooO0o0(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
