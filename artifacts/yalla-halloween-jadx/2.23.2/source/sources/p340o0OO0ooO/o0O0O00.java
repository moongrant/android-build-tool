package p340o0OO0ooO;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f42572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f42573OooO0O0 = true;

    public o0O0O00(String str) {
        this.f42572OooO00o = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f42572OooO00o);
        thread.setDaemon(this.f42573OooO0O0);
        return thread;
    }
}
