package p434o0OoOOOO;

import com.code.android.util.o000000;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.oO0O00oO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0oOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f46975OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f46976OooO0o0;

    public /* synthetic */ o0oOO(o0oOOo o0oooo, int i) {
        this.f46975OooO0Oo = o0oooo;
        this.f46976OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0oOOo this$0 = this.f46975OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oO0O00oO oo0o00oo = this$0.f46979OooO0O0;
        if (oo0o00oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oo0o00oo = null;
        }
        oo0o00oo.f44883OooO0o.f45241OooOO0.setText(o000000.OooO0Oo(Float.valueOf((30000.0f - this.f46976OooO0o0) / 1000)) + "\"");
    }
}
