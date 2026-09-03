package p101o000oOoo;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class oO000Oo0 extends oO00o000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f29739OooO0O0 = 80;

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    @Override // p101o000oOoo.oO00O0o0
    public final long OooOOO0(ViewGroup viewGroup, Transition transition, oO00O0o oo00o0o, oO00O0o oo00o0o2) {
        int i;
        int iCenterX;
        int iCenterY;
        int iAbs;
        oO00O0o oo00o0o3 = oo00o0o;
        if (oo00o0o3 == null && oo00o0o2 == null) {
            return 0L;
        }
        Rect rectOooOOo0 = transition.OooOOo0();
        if (oo00o0o2 == null || OooOoo(oo00o0o3) == 0) {
            i = -1;
        } else {
            oo00o0o3 = oo00o0o2;
            i = 1;
        }
        int iOooOooO = OooOooO(oo00o0o3);
        int iOooOooo = OooOooo(oo00o0o3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectOooOOo0 != null) {
            iCenterX = rectOooOOo0.centerX();
            iCenterY = rectOooOOo0.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i2 = this.f29739OooO0O0;
        if (i2 == 8388611) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO.OooO0Oo(viewGroup) == 1) {
                i2 = 5;
            } else {
                i2 = 3;
            }
        } else if (i2 == 8388613) {
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO.OooO0Oo(viewGroup) == 1) {
                i2 = 3;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 3) {
            iAbs = Math.abs(iCenterY - iOooOooo) + (width - iOooOooO);
        } else if (i2 == 5) {
            iAbs = Math.abs(iCenterY - iOooOooo) + (iOooOooO - iRound);
        } else if (i2 != 48) {
            iAbs = i2 != 80 ? 0 : (iOooOooo - iRound2) + Math.abs(iCenterX - iOooOooO);
        } else {
            iAbs = Math.abs(iCenterX - iOooOooO) + (height - iOooOooo);
        }
        float f = iAbs;
        int i3 = this.f29739OooO0O0;
        float width2 = f / ((i3 == 3 || i3 == 5 || i3 == 8388611 || i3 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = transition.f9561Oooo0oo;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * width2);
    }
}
