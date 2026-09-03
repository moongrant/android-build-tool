package androidx.appcompat.widget;

import androidx.lifecycle.LiveDataPublisher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3291OooO0o0;

    public /* synthetic */ o000OO00(Object obj, int i) {
        this.f3290OooO0Oo = i;
        this.f3291OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3290OooO0Oo;
        Object obj = this.f3291OooO0o0;
        switch (i) {
            case 0:
                ((o000OOo0) obj).OooO00o();
                break;
            default:
                LiveDataPublisher.LiveDataSubscription.cancel$lambda$1((LiveDataPublisher.LiveDataSubscription) obj);
                break;
        }
    }
}
