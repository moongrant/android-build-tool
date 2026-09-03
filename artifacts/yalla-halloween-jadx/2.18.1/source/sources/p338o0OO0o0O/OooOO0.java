package p338o0OO0o0O;

import Oooo000.OooO00o;
import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f37977OooO00o = new OooOO0();

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Integer evaluate(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f3 = ((iIntValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((iIntValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f5 = (iIntValue & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f6 = ((iIntValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((iIntValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f8 = ((iIntValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f9 = (iIntValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float fPow = (float) Math.pow(f3, 2.2d);
        float fPow2 = (float) Math.pow(f4, 2.2d);
        float fPow3 = (float) Math.pow(f5, 2.2d);
        float fPow4 = (float) Math.pow(f7, 2.2d);
        float fPow5 = (float) Math.pow(f8, 2.2d);
        float fPow6 = (float) Math.pow(f9, 2.2d);
        float fOooO00o = OooO00o.OooO00o(f6, f2, f, f2);
        float fOooO00o2 = OooO00o.OooO00o(fPow4, fPow, f, fPow);
        float fOooO00o3 = OooO00o.OooO00o(fPow5, fPow2, f, fPow2);
        float fOooO00o4 = OooO00o.OooO00o(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fOooO00o2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fOooO00o3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fOooO00o4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fOooO00o * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
