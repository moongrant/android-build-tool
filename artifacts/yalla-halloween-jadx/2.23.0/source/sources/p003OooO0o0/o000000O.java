package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.os.RemoteException;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.OooOOOO;
import o000O0O0.OooOo;
import o000O0O0.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f125OooO0o0;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f124OooO0Oo = i;
        this.f125OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f124OooO0Oo;
        Object obj = this.f125OooO0o0;
        switch (i) {
            case 0:
                o0OoOo0 this$0 = (o0OoOo0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o();
                break;
            default:
                o000oOoO this$1 = (o000oOoO) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                try {
                    OooOOOO oooOOOO = this$1.f34777OooO0o;
                    if (oooOOOO != null) {
                        this$1.f34776OooO0Oo = oooOOOO.OooO0oO(this$1.f34779OooO0oO, this$1.f34773OooO00o);
                        OooOo oooOo = this$1.f34774OooO0O0;
                        OooOo.OooO0OO oooO0OO = this$1.f34778OooO0o0;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("observer");
                            oooO0OO = null;
                        }
                        oooOo.OooO00o(oooO0OO);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                    return;
                }
                break;
        }
    }
}
