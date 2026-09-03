package p022Oooo00O;

import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import p037OoooOo0.o00O0000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f753OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f754OooO0o0;

    public /* synthetic */ o0O0OO0(Object obj, int i) {
        this.f753OooO0Oo = i;
        this.f754OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f753OooO0Oo;
        Object obj = this.f754OooO0o0;
        switch (i) {
            case 0:
                o0O0OOOo o0o0oooo = (o0O0OOOo) obj;
                o0o0oooo.OooOOOo(o0o0oooo);
                break;
            case 1:
                ((o00O0000.OooO00o) obj).OooO0O0();
                break;
            default:
                float[] fArr = StyledPlayerControlView.f13882o0OOO0o;
                ((StyledPlayerControlView) obj).OooOOOO();
                break;
        }
    }
}
