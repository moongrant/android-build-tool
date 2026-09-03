package p343o0OO0ooO;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.KotlinVersion;
import o0OOO0O.OooO0O0;
import p337o0OO0o0.OooO0o;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOOO0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int f38018OooO0o = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f38019OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38020OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38021OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38022OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f38023OooO0o0;

    public o0OOOO0o(@NonNull Context context) {
        TypedValue typedValueOooO00o = OooO0O0.OooO00o(context, OooO0o.elevationOverlayEnabled);
        boolean z = (typedValueOooO00o == null || typedValueOooO00o.type != 18 || typedValueOooO00o.data == 0) ? false : true;
        int iOooO0O0 = o0O0000O.OooO0O0(context, OooO0o.elevationOverlayColor, 0);
        int iOooO0O1 = o0O0000O.OooO0O0(context, OooO0o.elevationOverlayAccentColor, 0);
        int iOooO0O2 = o0O0000O.OooO0O0(context, OooO0o.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f38019OooO00o = z;
        this.f38020OooO0O0 = iOooO0O0;
        this.f38021OooO0OO = iOooO0O1;
        this.f38022OooO0Oo = iOooO0O2;
        this.f38023OooO0o0 = f;
    }

    @ColorInt
    public final int OooO00o(@ColorInt int i, float f) {
        int i2;
        if (!this.f38019OooO00o) {
            return i;
        }
        if (!(p071o000O0o.OooO0o.OooO0o0(i, KotlinVersion.MAX_COMPONENT_VALUE) == this.f38022OooO0Oo)) {
            return i;
        }
        float f2 = this.f38023OooO0o0;
        float fMin = (f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iOooO0o0 = o0O0000O.OooO0o0(p071o000O0o.OooO0o.OooO0o0(i, KotlinVersion.MAX_COMPONENT_VALUE), this.f38020OooO0O0, fMin);
        if (fMin > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (i2 = this.f38021OooO0OO) != 0) {
            iOooO0o0 = p071o000O0o.OooO0o.OooO0O0(p071o000O0o.OooO0o.OooO0o0(i2, f38018OooO0o), iOooO0o0);
        }
        return p071o000O0o.OooO0o.OooO0o0(iOooO0o0, iAlpha);
    }
}
