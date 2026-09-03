package p659o0ooo0o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f51181OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f51182OooO0O0;

    public o00OO(String str, boolean z) {
        this.f51181OooO00o = str;
        this.f51182OooO0O0 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f51181OooO00o);
        thread.setDaemon(this.f51182OooO0O0);
        return thread;
    }
}
