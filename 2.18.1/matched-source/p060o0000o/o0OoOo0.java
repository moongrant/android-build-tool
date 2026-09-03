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

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f27820Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f27818Oooo0o = 1.0f;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f27819Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f27817Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f27823OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f27822OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f27824OoooO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f27821OoooO = 1.0f;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f27825OoooOO0 = 1.0f;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f27833o000oOoO = Float.NaN;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f27826OoooOOO = Float.NaN;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f27827OoooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f27828OoooOo0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f27829OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f27830OoooOoo = Float.NaN;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f27831Ooooo00 = Float.NaN;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f27832Ooooo0o = new LinkedHashMap<>();

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
                    if (!Float.isNaN(this.f27822OoooO0)) {
                        f = this.f27822OoooO0;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 1:
                    if (!Float.isNaN(this.f27824OoooO0O)) {
                        f = this.f27824OoooO0O;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 2:
                    if (!Float.isNaN(this.f27827OoooOOo)) {
                        f = this.f27827OoooOOo;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 3:
                    if (!Float.isNaN(this.f27828OoooOo0)) {
                        f = this.f27828OoooOo0;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 4:
                    if (!Float.isNaN(this.f27829OoooOoO)) {
                        f = this.f27829OoooOoO;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 5:
                    if (!Float.isNaN(this.f27831Ooooo00)) {
                        f = this.f27831Ooooo00;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 6:
                    oo0o0oo.OooO0OO(i, Float.isNaN(this.f27821OoooO) ? 1.0f : this.f27821OoooO);
                    break;
                case 7:
                    oo0o0oo.OooO0OO(i, Float.isNaN(this.f27825OoooOO0) ? 1.0f : this.f27825OoooOO0);
                    break;
                case 8:
                    if (!Float.isNaN(this.f27833o000oOoO)) {
                        f = this.f27833o000oOoO;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 9:
                    if (!Float.isNaN(this.f27826OoooOOO)) {
                        f = this.f27826OoooOOO;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 10:
                    if (!Float.isNaN(this.f27823OoooO00)) {
                        f = this.f27823OoooO00;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.f27817Oooo)) {
                        f = this.f27817Oooo;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 12:
                    if (!Float.isNaN(this.f27830OoooOoo)) {
                        f = this.f27830OoooOoo;
                    }
                    oo0o0oo.OooO0OO(i, f);
                    break;
                case 13:
                    oo0o0oo.OooO0OO(i, Float.isNaN(this.f27818Oooo0o) ? 1.0f : this.f27818Oooo0o);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f27832Ooooo0o.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.f27832Ooooo0o.get(str2);
                            if (oo0o0oo instanceof oo0o0Oo.OooO0O0) {
                                ((oo0o0Oo.OooO0O0) oo0o0oo).f27910OooO0o.append(i, constraintAttribute);
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
        this.f27820Oooo0oo = view.getVisibility();
        this.f27818Oooo0o = view.getVisibility() != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : view.getAlpha();
        this.f27817Oooo = view.getElevation();
        this.f27823OoooO00 = view.getRotation();
        this.f27822OoooO0 = view.getRotationX();
        this.f27824OoooO0O = view.getRotationY();
        this.f27821OoooO = view.getScaleX();
        this.f27825OoooOO0 = view.getScaleY();
        this.f27833o000oOoO = view.getPivotX();
        this.f27826OoooOOO = view.getPivotY();
        this.f27827OoooOOo = view.getTranslationX();
        this.f27828OoooOo0 = view.getTranslationY();
        this.f27829OoooOoO = view.getTranslationZ();
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
        OooO00o.OooO0o oooO0o = c0043OooO00oOooO0oo.f7617OooO0OO;
        int i3 = oooO0o.f7720OooO0OO;
        this.f27819Oooo0oO = i3;
        int i4 = oooO0o.f7719OooO0O0;
        this.f27820Oooo0oo = i4;
        this.f27818Oooo0o = (i4 == 0 || i3 != 0) ? oooO0o.f7721OooO0Oo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        OooO00o.OooO oooO = c0043OooO00oOooO0oo.f7619OooO0o;
        boolean z = oooO.f7614OooOOO0;
        this.f27817Oooo = oooO.f7613OooOOO;
        this.f27823OoooO00 = oooO.f7603OooO0O0;
        this.f27822OoooO0 = oooO.f7604OooO0OO;
        this.f27824OoooO0O = oooO.f7605OooO0Oo;
        this.f27821OoooO = oooO.f7607OooO0o0;
        this.f27825OoooOO0 = oooO.f7606OooO0o;
        this.f27833o000oOoO = oooO.f7608OooO0oO;
        this.f27826OoooOOO = oooO.f7609OooO0oo;
        this.f27827OoooOOo = oooO.f7610OooOO0;
        this.f27828OoooOo0 = oooO.f7611OooOO0O;
        this.f27829OoooOoO = oooO.f7612OooOO0o;
        o000000O.OooO0OO(c0043OooO00oOooO0oo.f7618OooO0Oo.f7709OooO0Oo);
        this.f27830OoooOoo = c0043OooO00oOooO0oo.f7618OooO0Oo.f7713OooO0oo;
        this.f27831Ooooo00 = c0043OooO00oOooO0oo.f7617OooO0OO.f7722OooO0o0;
        for (String str : c0043OooO00oOooO0oo.f7621OooO0oO.keySet()) {
            ConstraintAttribute constraintAttribute = c0043OooO00oOooO0oo.f7621OooO0oO.get(str);
            if (constraintAttribute.OooO0OO()) {
                this.f27832Ooooo0o.put(str, constraintAttribute);
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
            float f = this.f27823OoooO00 + 90.0f;
            this.f27823OoooO00 = f;
            if (f > 180.0f) {
                this.f27823OoooO00 = f - 360.0f;
                return;
            }
            return;
        }
        this.f27823OoooO00 -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(o0OoOo0 o0oooo1) {
        Objects.requireNonNull(o0oooo1);
        return Float.compare(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }
}
