package p037OoooOo0;

import com.google.android.exoplayer2.ui.PlayerControlView;
import p033OoooO0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1574OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1575OooO0o0;

    public /* synthetic */ o000OO0O(Object obj, int i) {
        this.f1574OooO0Oo = i;
        this.f1575OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1574OooO0Oo;
        Object obj = this.f1575OooO0o0;
        switch (i) {
            case 0:
                o00O0000 o00o0001 = (o00O0000) obj;
                o00o0001.getClass();
                o00oO0o.OooO0OO().execute(new o000O(o00o0001, 0));
                break;
            default:
                int i2 = PlayerControlView.f13799OooooO0;
                ((PlayerControlView) obj).OooO0oo();
                break;
        }
    }
}
