package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p347o0OOO0o0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends o0OO00O implements Cloneable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f16581Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f16582Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f16583Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f16584Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f16585OoooO0 = -1.0f;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f16586OoooO00;

    public OooOO0(float f, float f2, float f3) {
        this.f16583Oooo0oO = f;
        this.f16582Oooo0o = f2;
        OooO0o0(f3);
        this.f16586OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p347o0OOO0o0.o0OO00O
    public final void OooO0Oo(float f, float f2, float f3, @NonNull com.google.android.material.shape.OooO0OO oooO0OO) {
        float f4;
        float f5;
        float f6 = this.f16584Oooo0oo;
        if (f6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            oooO0OO.OooO0o0(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return;
        }
        float f7 = ((this.f16583Oooo0oO * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f16582Oooo0o;
        float f9 = f2 + this.f16586OoooO00;
        float fOooO00o = Oooo000.OooO00o.OooO00o(1.0f, f3, f7, this.f16581Oooo * f3);
        if (fOooO00o / f7 >= 1.0f) {
            oooO0OO.OooO0o0(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return;
        }
        float f10 = this.f16585OoooO0;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            f5 = fOooO00o;
        } else {
            f4 = 1.75f;
            f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float f12 = f7 + f8;
        float f13 = f5 + f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - fSqrt;
        float f15 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = (90.0f - degrees) + f4;
        oooO0OO.OooO0o0(f14, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float f17 = f8 * 2.0f;
        oooO0OO.OooO00o(f14 - f8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f14 + f8, f17, 270.0f, degrees);
        if (z) {
            oooO0OO.OooO00o(f9 - f7, (-f7) - f5, f9 + f7, f7 - f5, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f18 = this.f16583Oooo0oO;
            float f19 = f11 * 2.0f;
            float f20 = f9 - f7;
            oooO0OO.OooO00o(f20, -(f11 + f18), f20 + f18 + f19, f18 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f21 = f9 + f7;
            float f22 = this.f16583Oooo0oO;
            oooO0OO.OooO0o0(f21 - ((f22 / 2.0f) + f11), f22 + f11);
            float f23 = this.f16583Oooo0oO;
            oooO0OO.OooO00o(f21 - (f19 + f23), -(f11 + f23), f21, f23 + f11, 90.0f, f16 - 90.0f);
        }
        oooO0OO.OooO00o(f15 - f8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f15 + f8, f17, 270.0f - degrees, degrees);
        oooO0OO.OooO0o0(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    public final void OooO0o0(@FloatRange(from = 0.0d) float f) {
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f16581Oooo = f;
    }
}
