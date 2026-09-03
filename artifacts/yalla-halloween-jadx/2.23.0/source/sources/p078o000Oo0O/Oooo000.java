package p078o000Oo0O;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends o000O0 {
    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    @Override // p078o000Oo0O.o000000O
    public final long OooO00o(ViewGroup viewGroup, Transition transition, o00000O0 o00000o1, o00000O0 o00000o2) {
        int i;
        int iRound;
        int iCenterX;
        Integer num;
        if (o00000o1 == null && o00000o2 == null) {
            return 0L;
        }
        if (o00000o2 != null) {
            int iIntValue = 8;
            if (o00000o1 != null && (num = (Integer) o00000o1.f34936OooO00o.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i = -1;
            } else {
                o00000o1 = o00000o2;
                i = 1;
            }
        } else {
            i = -1;
        }
        int iOooO0O0 = o000O0.OooO0O0(o00000o1, 0);
        int iOooO0O1 = o000O0.OooO0O0(o00000o1, 1);
        Transition.OooO0OO oooO0OO = transition.f8226OooOo0o;
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
        long j = transition.f8208OooO0o;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * fSqrt2);
    }
}
