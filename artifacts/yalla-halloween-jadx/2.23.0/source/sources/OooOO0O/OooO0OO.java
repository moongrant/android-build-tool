package OooOO0O;

import androidx.camera.core.impl.SessionConfig;
import kotlin.jvm.internal.Intrinsics;
import p039OoooOoo.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f174OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f175OooO0o0;

    public /* synthetic */ OooO0OO(int i, Object obj, Object obj2) {
        this.f173OooO0Oo = i;
        this.f175OooO0o0 = obj;
        this.f174OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f173OooO0Oo;
        Object obj = this.f174OooO0o;
        Object obj2 = this.f175OooO0o0;
        switch (i) {
            case 0:
                OooO0o this$0 = (OooO0o) obj2;
                OooO0O0.OooO0o nativeAppInfo = (OooO0O0.OooO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                break;
            default:
                o0O00o0 o0o00o1 = (o0O00o0) obj2;
                SessionConfig.OooO0O0 oooO0O0 = (SessionConfig.OooO0O0) obj;
                o0o00o1.getClass();
                oooO0O0.f3626OooO0O0.f3660OooO0o0.remove(o0o00o1);
                oooO0O0.f3629OooO0o.remove(o0o00o1);
                break;
        }
    }
}
