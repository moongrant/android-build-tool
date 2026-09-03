package p419o0OoO00O;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import p052o00000oO.OooOO0;
import p270o0O0000o.o00000;
import p272o0O000oo.OooOOO;
import p545o0oO0Ooo.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int f45535OooO0o = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f45536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f45537OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f45538OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f45539OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f45540OooO0o0;

    public OooOOO0(@NonNull Context context) {
        boolean zOooO0O0 = b1.OooO0O0(context, o00000.elevationOverlayEnabled, false);
        int iOooO0O0 = OooOOO.OooO0O0(o00000.elevationOverlayColor, context, 0);
        int iOooO0O1 = OooOOO.OooO0O0(o00000.elevationOverlayAccentColor, context, 0);
        int iOooO0O2 = OooOOO.OooO0O0(o00000.colorSurface, context, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f45536OooO00o = zOooO0O0;
        this.f45537OooO0O0 = iOooO0O0;
        this.f45538OooO0OO = iOooO0O1;
        this.f45539OooO0Oo = iOooO0O2;
        this.f45540OooO0o0 = f;
    }

    @ColorInt
    public final int OooO00o(float f, @ColorInt int i) {
        int i2;
        if (this.f45536OooO00o) {
            if (OooOO0.OooO0Oo(i, 255) == this.f45539OooO0Oo) {
                float f2 = this.f45540OooO0o0;
                float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                int iAlpha = Color.alpha(i);
                int iOooO0o0 = OooOOO.OooO0o0(OooOO0.OooO0Oo(i, 255), fMin, this.f45537OooO0O0);
                if (fMin > 0.0f && (i2 = this.f45538OooO0OO) != 0) {
                    iOooO0o0 = OooOO0.OooO0OO(OooOO0.OooO0Oo(i2, f45535OooO0o), iOooO0o0);
                }
                return OooOO0.OooO0Oo(iOooO0o0, iAlpha);
            }
        }
        return i;
    }
}
