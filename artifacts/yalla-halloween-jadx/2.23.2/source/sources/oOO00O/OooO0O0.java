package oOO00O;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends o0000O0 {
    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    @Override // oOO00O.o00Ooo
    public final long OooO00o(ViewGroup viewGroup, Transition transition, o00oO0o o00oo0o2, o00oO0o o00oo0o3) {
        int i;
        int iRound;
        int iCenterX;
        Integer num;
        if (o00oo0o2 == null && o00oo0o3 == null) {
            return 0L;
        }
        if (o00oo0o3 != null) {
            int iIntValue = 8;
            if (o00oo0o2 != null && (num = (Integer) o00oo0o2.f60157OooO00o.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i = -1;
            } else {
                o00oo0o2 = o00oo0o3;
                i = 1;
            }
        } else {
            i = -1;
        }
        int iOooO0O0 = o0000O0.OooO0O0(o00oo0o2, 0);
        int iOooO0O1 = o0000O0.OooO0O0(o00oo0o2, 1);
        Transition.OooO0OO oooO0OO = transition.f11320OooOo0o;
        Rect rectOooO00o = oooO0OO == null ? null : oooO0OO.OooO00o();
        if (rectOooO00o != null) {
            iCenterX = rectOooO00o.centerX();
            iRound = rectOooO00o.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
            iCenterX = iRound2;
        }
        float f = iCenterX - iOooO0O0;
        float f2 = iRound - iOooO0O1;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j = transition.f11302OooO0o;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * fSqrt2);
    }
}
