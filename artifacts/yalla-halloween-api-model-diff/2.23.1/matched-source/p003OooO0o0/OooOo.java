package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO;
import android.os.Process;
import android.os.StrictMode;
import com.yallatech.support.platform.base.BaseResp;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOOo.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f117OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f118OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f119OooO0o0;

    public /* synthetic */ OooOo(int i, Object obj, Object obj2) {
        this.f117OooO0Oo = i;
        this.f119OooO0o0 = obj;
        this.f118OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f117OooO0Oo;
        Object obj = this.f118OooO0o;
        Object obj2 = this.f119OooO0o0;
        switch (i) {
            case 0:
                OooO this$0 = (OooO) obj2;
                BaseResp response = (BaseResp) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(response, "$response");
                this$0.OooO0OO(response);
                break;
            default:
                OooO00o oooO00o = (OooO00o) obj2;
                Runnable runnable = (Runnable) obj;
                Process.setThreadPriority(oooO00o.f41377OooO0OO);
                StrictMode.ThreadPolicy threadPolicy = oooO00o.f41378OooO0Oo;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                break;
        }
    }
}
