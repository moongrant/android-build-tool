package p078o000Oo0O;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.transition.Transition;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends o000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f34985OooO0O0 = 80;

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    @Override // p078o000Oo0O.o000000O
    public final long OooO00o(ViewGroup viewGroup, Transition transition, o00000O0 o00000o1, o00000O0 o00000o2) {
        int i;
        int iCenterX;
        int iCenterY;
        int i2;
        int iAbs;
        Integer num;
        o00000O0 o00000o3 = o00000o1;
        if (o00000o3 == null && o00000o2 == null) {
            return 0L;
        }
        Transition.OooO0OO oooO0OO = transition.f8226OooOo0o;
        Rect rectOooO00o = oooO0OO == null ? null : oooO0OO.OooO00o();
        if (o00000o2 != null) {
            int iIntValue = 8;
            if (o00000o3 != null && (num = (Integer) o00000o3.f34936OooO00o.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i = -1;
            } else {
                o00000o3 = o00000o2;
                i = 1;
            }
        } else {
            i = -1;
        }
        int iOooO0O0 = o000O0.OooO0O0(o00000o3, 0);
        int iOooO0O1 = o000O0.OooO0O0(o00000o3, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectOooO00o != null) {
            iCenterX = rectOooO00o.centerX();
            iCenterY = rectOooO00o.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i3 = this.f34985OooO0O0;
        if (i3 == 8388611) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO.OooO0Oo(viewGroup) == 1) {
                i2 = 3;
                i3 = 5;
            } else {
                i2 = 3;
                i3 = 3;
            }
        } else if (i3 == 8388613) {
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO.OooO0Oo(viewGroup) == 1) {
                i2 = 3;
                i3 = 3;
            } else {
                i2 = 3;
                i3 = 5;
            }
        } else {
            i2 = 3;
        }
        if (i3 == i2) {
            iAbs = Math.abs(iCenterY - iOooO0O1) + (width - iOooO0O0);
        } else if (i3 == 5) {
            iAbs = Math.abs(iCenterY - iOooO0O1) + (iOooO0O0 - iRound);
        } else if (i3 != 48) {
            iAbs = i3 != 80 ? 0 : Math.abs(iCenterX - iOooO0O0) + (iOooO0O1 - iRound2);
        } else {
            iAbs = Math.abs(iCenterX - iOooO0O0) + (height - iOooO0O1);
        }
        float f = iAbs;
        int i4 = this.f34985OooO0O0;
        float width2 = f / ((i4 == 3 || i4 == 5 || i4 == 8388611 || i4 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = transition.f8208OooO0o;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * width2);
    }
}
