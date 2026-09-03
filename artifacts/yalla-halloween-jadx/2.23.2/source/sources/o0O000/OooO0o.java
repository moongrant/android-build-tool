package o0O000;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f40885OooO00o = new OooO0o();

    @NonNull
    public static Integer OooO00o(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fOooO00o = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
        float fOooO00o2 = OooOo.OooO0o.OooO00o(fPow4, fPow, f, fPow);
        float fOooO00o3 = OooOo.OooO0o.OooO00o(fPow5, fPow2, f, fPow2);
        float fOooO00o4 = OooOo.OooO0o.OooO00o(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fOooO00o2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fOooO00o3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fOooO00o4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fOooO00o * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    @NonNull
    public final /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return OooO00o(f, num, num2);
    }
}
