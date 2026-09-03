package o0000O;

import com.facebook.internal.FetchedAppGateKeepersManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f27261Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f27262OoooO00;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f27261Oooo = i;
        this.f27262OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27261Oooo) {
            case 0:
                Function0 tmp0 = (Function0) this.f27262OoooO00;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            default:
                ((FetchedAppGateKeepersManager.Callback) this.f27262OoooO00).onCompleted();
                break;
        }
    }
}
