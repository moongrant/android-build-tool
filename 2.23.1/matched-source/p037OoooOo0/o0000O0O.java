package p037OoooOo0;

import com.facebook.appevents.AppEventQueue;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1514OooO0Oo;

    public /* synthetic */ o0000O0O(int i) {
        this.f1514OooO0Oo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1514OooO0Oo) {
            case 0:
                break;
            default:
                AppEventQueue.m4061flushRunnable$lambda0();
                break;
        }
    }
}
