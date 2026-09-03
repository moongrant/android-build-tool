package p022Oooo00O;

import androidx.media3.ui.PlayerControlView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0o000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f783OooO0o0;

    public /* synthetic */ o0O0o000(Object obj, int i) {
        this.f782OooO0Oo = i;
        this.f783OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f782OooO0Oo;
        Object obj = this.f783OooO0o0;
        switch (i) {
            case 0:
                o0O0o0.OooOo0O((o0O0o0) obj);
                break;
            default:
                float[] fArr = PlayerControlView.f6577o00ooo;
                ((PlayerControlView) obj).OooOO0o();
                break;
        }
    }
}
