package p612o0oo0OoO;

import kotlin.jvm.internal.Intrinsics;
import p616o0oo0o00.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ r5 f57457OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f57458OooO0o0;

    public /* synthetic */ q5(r5 r5Var, Oooo0 oooo0) {
        this.f57457OooO0Oo = r5Var;
        this.f57458OooO0o0 = oooo0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r5 this$0 = this.f57457OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Oooo0 evaFileContainer = this.f57458OooO0o0;
        Intrinsics.checkNotNullParameter(evaFileContainer, "$evaFileContainer");
        this$0.OooO00o(evaFileContainer);
    }
}
