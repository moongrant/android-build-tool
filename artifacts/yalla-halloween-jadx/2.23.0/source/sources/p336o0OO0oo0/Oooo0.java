package p336o0OO0oo0;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f43325OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f43326OooO0O0 = true;

    public Oooo0(String str) {
        this.f43325OooO00o = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f43325OooO00o);
        thread.setDaemon(this.f43326OooO0O0);
        return thread;
    }
}
