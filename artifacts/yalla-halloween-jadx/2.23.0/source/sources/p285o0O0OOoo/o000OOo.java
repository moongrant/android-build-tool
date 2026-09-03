package p285o0O0OOoo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f42175OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f42176OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f42177OooO0OO;

    public o000OOo(o0O0O00 o0o0o00, long j, String str) {
        this.f42177OooO0OO = o0o0o00;
        this.f42175OooO00o = j;
        this.f42176OooO0O0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        o0O0O00 o0o0o00 = this.f42177OooO0OO;
        o0000O0O o0000o0o2 = o0o0o00.f42205OooOOO0;
        if (o0000o0o2 != null && o0000o0o2.f42132OooO0o0.get()) {
            return null;
        }
        o0o0o00.f42192OooO.f46624OooO0O0.OooO0OO(this.f42175OooO00o, this.f42176OooO0O0);
        return null;
    }
}
