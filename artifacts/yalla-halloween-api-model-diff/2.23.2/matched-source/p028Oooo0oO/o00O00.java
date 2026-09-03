package p028Oooo0oO;

import androidx.camera.core.OooOo00;
import androidx.camera.core.impl.SessionConfig;
import p039OoooOoo.o0O0000O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1121OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1122OooO0o0;

    public /* synthetic */ o00O00(int i, Object obj, Object obj2) {
        this.f1120OooO0Oo = i;
        this.f1122OooO0o0 = obj;
        this.f1121OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1120OooO0Oo;
        Object obj = this.f1121OooO0o;
        Object obj2 = this.f1122OooO0o0;
        switch (i) {
            case 0:
                OooOo00 oooOo00 = (OooOo00) obj;
                ((OooOo00) obj2).OooO00o();
                if (oooOo00 != null) {
                    oooOo00.OooO00o();
                }
                break;
            default:
                o0O0000O o0o0000o2 = (o0O0000O) obj2;
                SessionConfig.OooO0O0 oooO0O0 = (SessionConfig.OooO0O0) obj;
                o0o0000o2.getClass();
                oooO0O0.f3624OooO0O0.f3659OooO0o0.remove(o0o0000o2);
                oooO0O0.f3627OooO0o.remove(o0o0000o2);
                break;
        }
    }
}
