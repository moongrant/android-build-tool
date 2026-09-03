package p413o0Oo0o0O;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f39349OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f39350OooO0O0 = true;

    public o000OOo(String str) {
        this.f39349OooO00o = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f39349OooO00o);
        thread.setDaemon(this.f39350OooO0O0);
        return thread;
    }
}
