package p029Oooo0oo;

import android.animation.AnimatorSet;
import androidx.camera.core.OooOo00;
import androidx.media3.ui.LegacyPlayerControlView;
import com.google.android.material.search.o000oOoO;
import com.google.android.material.search.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1243OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1244OooO0o0;

    public /* synthetic */ o0O00O0o(Object obj, int i) {
        this.f1243OooO0Oo = i;
        this.f1244OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1243OooO0Oo;
        Object obj = this.f1244OooO0o0;
        switch (i) {
            case 0:
                ((OooOo00) obj).OooO00o();
                break;
            case 1:
                ((LegacyPlayerControlView) obj).OooO00o();
                break;
            default:
                o00Ooo o00ooo2 = (o00Ooo) obj;
                AnimatorSet animatorSetOooO0OO = o00ooo2.OooO0OO(true);
                animatorSetOooO0OO.addListener(new o000oOoO(o00ooo2));
                animatorSetOooO0OO.start();
                break;
        }
    }
}
