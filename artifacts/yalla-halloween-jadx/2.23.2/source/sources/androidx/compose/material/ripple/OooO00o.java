package androidx.compose.material.ripple;

import android.animation.AnimatorSet;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.o00Oo0;
import com.google.android.material.search.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4163OooO0o0;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f4162OooO0Oo = i;
        this.f4163OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4162OooO0Oo;
        Object obj = this.f4163OooO0o0;
        switch (i) {
            case 0:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                break;
            default:
                oo000o oo000oVar = (oo000o) obj;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = oo000oVar.f17091OooO0OO;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                AnimatorSet animatorSetOooO0oO = oo000oVar.OooO0oO(true);
                animatorSetOooO0oO.addListener(new o00Oo0(oo000oVar));
                animatorSetOooO0oO.start();
                break;
        }
    }
}
