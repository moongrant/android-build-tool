package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.ooooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6057OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6058OooO0o0;

    public /* synthetic */ OooOOO(Object obj, int i) {
        this.f6057OooO0Oo = i;
        this.f6058OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6057OooO0Oo;
        Object obj = this.f6058OooO0o0;
        switch (i) {
            case 0:
                PublisherLiveData.LiveDataSubscriber.onError$lambda$0((Throwable) obj);
                break;
            default:
                ooooO0O0 this$0 = (ooooO0O0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0().f59491OooOoO0.scrollToPosition(0);
                break;
        }
    }
}
