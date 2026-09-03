package androidx.camera.core.impl;

import androidx.fragment.app.SpecialEffectsController;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3663OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f3664OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3665OooO0o0;

    public /* synthetic */ o00000O(int i, Object obj, Object obj2) {
        this.f3663OooO0Oo = i;
        this.f3665OooO0o0 = obj;
        this.f3664OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3663OooO0Oo;
        Object obj = this.f3664OooO0o;
        Object obj2 = this.f3665OooO0o0;
        switch (i) {
            case 0:
                o00000OO o00000oo2 = (o00000OO) obj2;
                o00O00o0.OooO00o oooO00o = (o00O00o0.OooO00o) obj;
                o00000oo2.getClass();
                try {
                    oooO00o.OooO00o(o00000oo2.f3667OooO00o.f1375OooO0Oo);
                } catch (InterruptedException | ExecutionException e) {
                    oooO00o.onError(e);
                    return;
                }
                break;
            default:
                SpecialEffectsController this$0 = (SpecialEffectsController) obj2;
                SpecialEffectsController.OooO00o operation = (SpecialEffectsController.OooO00o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                this$0.f5929OooO0O0.remove(operation);
                this$0.f5930OooO0OO.remove(operation);
                break;
        }
    }
}
