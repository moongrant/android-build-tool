package OooO;

import android.os.Bundle;
import com.facebook.login.LoginLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f32OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33OooO0o0;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f31OooO0Oo = i;
        this.f33OooO0o0 = obj;
        this.f32OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f31OooO0Oo;
        Object obj = this.f32OooO0o;
        Object obj2 = this.f33OooO0o0;
        switch (i) {
            case 0:
                OooO this$0 = (OooO) obj2;
                OooO0O0.OooO0o nativeAppInfo = (OooO0O0.OooO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                break;
            default:
                LoginLogger.m4173logHeartbeatEvent$lambda0((LoginLogger) obj2, (Bundle) obj);
                break;
        }
    }
}
