package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.xmlpull.v1.XmlPullParser;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000Oo;

/* JADX INFO: loaded from: classes.dex */
public class PatternPathMotion extends PathMotion {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f9544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f9545OooO0O0;

    public PatternPathMotion() {
        Path path = new Path();
        this.f9544OooO00o = path;
        this.f9545OooO0O0 = new Matrix();
        path.lineTo(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public final Path OooO00o(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        double dAtan2 = Math.atan2(f6, f5);
        this.f9545OooO0O0.setScale(fSqrt, fSqrt);
        this.f9545OooO0O0.postRotate((float) Math.toDegrees(dAtan2));
        this.f9545OooO0O0.postTranslate(f, f2);
        Path path = new Path();
        this.f9544OooO00o.transform(this.f9545OooO0O0, path);
        return path;
    }

    public final void OooO0O0(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f9545OooO0O0.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
        this.f9545OooO0O0.postScale(fSqrt, fSqrt);
        this.f9545OooO0O0.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.f9545OooO0O0, this.f9544OooO00o);
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.f9544OooO00o = new Path();
        this.f9545OooO0O0 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29730OooO);
        try {
            String strOooO0oo = o00oO0o.OooO0oo(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strOooO0oo != null) {
                OooO0O0(p071o000O0o.OooOO0O.OooO0Oo(strOooO0oo));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
