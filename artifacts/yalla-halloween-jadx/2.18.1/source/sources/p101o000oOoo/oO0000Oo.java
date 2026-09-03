package p101o000oOoo;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class oO0000Oo extends oO00o000 {
    @Override // p101o000oOoo.oO00O0o0
    public final long OooOOO0(ViewGroup viewGroup, Transition transition, oO00O0o oo00o0o, oO00O0o oo00o0o2) {
        int i;
        int iRound;
        int iCenterX;
        if (oo00o0o == null && oo00o0o2 == null) {
            return 0L;
        }
        if (oo00o0o2 == null || OooOoo(oo00o0o) == 0) {
            i = -1;
        } else {
            oo00o0o = oo00o0o2;
            i = 1;
        }
        int iOooOooO = OooOooO(oo00o0o);
        int iOooOooo = OooOooo(oo00o0o);
        Rect rectOooOOo0 = transition.OooOOo0();
        if (rectOooOOo0 != null) {
            iCenterX = rectOooOOo0.centerX();
            iRound = rectOooOOo0.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
            iCenterX = iRound2;
        }
        float f = iCenterX - iOooOooO;
        float f2 = iRound - iOooOooo;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float width = viewGroup.getWidth();
        float height = viewGroup.getHeight();
        float f3 = width - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f4 = height - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((f4 * f4) + (f3 * f3)));
        long j = transition.f9561Oooo0oo;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * fSqrt2);
    }
}
