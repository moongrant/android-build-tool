package androidx.compose.material.ripple;

import android.animation.AnimatorSet;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.o00O0O;
import com.google.android.material.search.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4166OooO0o0;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f4165OooO0Oo = i;
        this.f4166OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4165OooO0Oo;
        Object obj = this.f4166OooO0o0;
        switch (i) {
            case 0:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                break;
            default:
                o00Ooo o00ooo2 = (o00Ooo) obj;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = o00ooo2.f17095OooO0OO;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                AnimatorSet animatorSetOooO0oO = o00ooo2.OooO0oO(true);
                animatorSetOooO0oO.addListener(new o00O0O(o00ooo2));
                animatorSetOooO0oO.start();
                break;
        }
    }
}
