package p079o000Oo0o;

import OooOo.OooO0o;
import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0O0ooO implements TypeEvaluator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0ooO f35079OooO00o = new o0O0ooO();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fOooO00o = OooO0o.OooO00o(f3, f2, f, f2);
        float fOooO00o2 = OooO0o.OooO00o(fPow4, fPow, f, fPow);
        float fOooO00o3 = OooO0o.OooO00o(fPow5, fPow2, f, fPow2);
        float fOooO00o4 = OooO0o.OooO00o(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fOooO00o2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fOooO00o3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fOooO00o4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fOooO00o * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
