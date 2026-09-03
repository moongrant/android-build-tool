package p022Oooo00O;

import androidx.camera.core.OooOo00;
import com.google.android.exoplayer2.ui.o0000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f817OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f818OooO0o0;

    public /* synthetic */ o0OO0o(Object obj, int i) {
        this.f817OooO0Oo = i;
        this.f818OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f817OooO0Oo;
        Object obj = this.f818OooO0o0;
        switch (i) {
            case 0:
                ((OooOo00) obj).OooO00o();
                break;
            default:
                o0000 o0000Var = (o0000) obj;
                o0000Var.f14044OooOO0o.start();
                o0000Var.f14034OooO00o.postDelayed(o0000Var.f14053OooOo0, 2000L);
                break;
        }
    }
}
