package p060o0000o;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.OooO00o;
import com.umeng.analytics.pro.bz;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import p057o0000Oo0.o000000O;
import p063o0000o0o.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements Comparable<o0OoOo0> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f27839OoooO0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f27837Oooo = 1.0f;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f27840OoooO00 = 0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f27841OoooO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f27838OoooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f27842OoooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f27853o000oOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f27843OoooOOO = 1.0f;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f27844OoooOOo = 1.0f;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f27845OoooOo0 = Float.NaN;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f27846OoooOoO = Float.NaN;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f27847OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f27848Ooooo00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f27849Ooooo0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f27850OooooO0 = Float.NaN;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f27851OooooOO = Float.NaN;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f27852OooooOo = new LinkedHashMap<>();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooO00o(HashMap<String, oo0o0Oo> map, int i) {
        for (String str : map.keySet()) {
            oo0o0Oo oo0o0oo = map.get(str);
            Objects.requireNonNull(str);
            byte b = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        b = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        b = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        b = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b = 12;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b = bz.k;
                    }
                    break;
            }
            float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            switch (b) {
                case 0:
                    if (!Float.isNaN(this.f27842OoooOO0)) {
                        f = this.f27842OoooOO0;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 1:
                    if (!Float.isNaN(this.f27853o000oOoO)) {
                        f = this.f27853o000oOoO;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 2:
                    if (!Float.isNaN(this.f27847OoooOoo)) {
                        f = this.f27847OoooOoo;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 3:
                    if (!Float.isNaN(this.f27848Ooooo00)) {
                        f = this.f27848Ooooo00;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 4:
                    if (!Float.isNaN(this.f27849Ooooo0o)) {
                        f = this.f27849Ooooo0o;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 5:
                    if (!Float.isNaN(this.f27851OooooOO)) {
                        f = this.f27851OooooOO;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 6:
                    oo0o0oo.OooO0OO(i, Float.isNaN(this.f27843OoooOOO) ? 1.0f : this.f27843OoooOOO);
                    break;
                case 7:
                    oo0o0oo.OooO0OO(i, Float.isNaN(this.f27844OoooOOo) ? 1.0f : this.f27844OoooOOo);
                    break;
                case 8:
                    if (!Float.isNaN(this.f27845OoooOo0)) {
                        f = this.f27845OoooOo0;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 9:
                    if (!Float.isNaN(this.f27846OoooOoO)) {
                        f = this.f27846OoooOoO;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 10:
                    if (!Float.isNaN(this.f27838OoooO)) {
                        f = this.f27838OoooO;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.f27841OoooO0O)) {
                        f = this.f27841OoooO0O;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 12:
                    if (!Float.isNaN(this.f27850OooooO0)) {
                        f = this.f27850OooooO0;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 13:
                    oo0o0oo.OooO0OO(i, Float.isNaN(this.f27837Oooo) ? 1.0f : this.f27837Oooo);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f27852OooooOo.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.f27852OooooOo.get(str2);
                            if (oo0o0oo instanceof oo0o0Oo.OooO0O0) {
                                ((oo0o0Oo.OooO0O0) oo0o0oo).f27930OooO0o.append(i, constraintAttribute);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.OooO00o() + oo0o0oo);
                            }
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    public final void OooO0O0(View view) {
        this.f27839OoooO0 = view.getVisibility();
        this.f27837Oooo = view.getVisibility() != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : view.getAlpha();
        this.f27841OoooO0O = view.getElevation();
        this.f27838OoooO = view.getRotation();
        this.f27842OoooOO0 = view.getRotationX();
        this.f27853o000oOoO = view.getRotationY();
        this.f27843OoooOOO = view.getScaleX();
        this.f27844OoooOOo = view.getScaleY();
        this.f27845OoooOo0 = view.getPivotX();
        this.f27846OoooOoO = view.getPivotY();
        this.f27847OoooOoo = view.getTranslationX();
        this.f27848Ooooo00 = view.getTranslationY();
        this.f27849Ooooo0o = view.getTranslationZ();
    }

    public final boolean OooO0Oo(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public final void OooO0o(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        OooO0O0(view);
    }

    public final void OooO0o0(Rect rect, OooO00o oooO00o, int i, int i2) {
        rect.width();
        rect.height();
        OooO00o.C0043OooO00o c0043OooO00oOooO0oo = oooO00o.OooO0oo(i2);
        OooO00o.OooO0o oooO0o = c0043OooO00oOooO0oo.f7632OooO0OO;
        int i3 = oooO0o.f7735OooO0OO;
        this.f27840OoooO00 = i3;
        int i4 = oooO0o.f7734OooO0O0;
        this.f27839OoooO0 = i4;
        this.f27837Oooo = (i4 == 0 || i3 != 0) ? oooO0o.f7736OooO0Oo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        OooO00o.OooO oooO = c0043OooO00oOooO0oo.f7634OooO0o;
        boolean z = oooO.f7629OooOOO0;
        this.f27841OoooO0O = oooO.f7628OooOOO;
        this.f27838OoooO = oooO.f7618OooO0O0;
        this.f27842OoooOO0 = oooO.f7619OooO0OO;
        this.f27853o000oOoO = oooO.f7620OooO0Oo;
        this.f27843OoooOOO = oooO.f7622OooO0o0;
        this.f27844OoooOOo = oooO.f7621OooO0o;
        this.f27845OoooOo0 = oooO.f7623OooO0oO;
        this.f27846OoooOoO = oooO.f7624OooO0oo;
        this.f27847OoooOoo = oooO.f7625OooOO0;
        this.f27848Ooooo00 = oooO.f7626OooOO0O;
        this.f27849Ooooo0o = oooO.f7627OooOO0o;
        o000000O.OooO0OO(c0043OooO00oOooO0oo.f7633OooO0Oo.f7724OooO0Oo);
        this.f27850OooooO0 = c0043OooO00oOooO0oo.f7633OooO0Oo.f7728OooO0oo;
        this.f27851OooooOO = c0043OooO00oOooO0oo.f7632OooO0OO.f7737OooO0o0;
        for (String str : c0043OooO00oOooO0oo.f7636OooO0oO.keySet()) {
            ConstraintAttribute constraintAttribute = c0043OooO00oOooO0oo.f7636OooO0oO.get(str);
            if (constraintAttribute.OooO0OO()) {
                this.f27852OooooOo.put(str, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f27838OoooO + 90.0f;
            this.f27838OoooO = f;
            if (f > 180.0f) {
                this.f27838OoooO = f - 360.0f;
                return;
            }
            return;
        }
        this.f27838OoooO -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(o0OoOo0 o0oooo1) {
        Objects.requireNonNull(o0oooo1);
        return Float.compare(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }
}
