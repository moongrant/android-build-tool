package p430o0OoOOO0;

import com.code.android.util.o000000;
import kotlin.jvm.internal.Intrinsics;
import p641o0ooOOOO.j5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f45797OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f45798OooO0o0;

    public /* synthetic */ o00O00(o00O00OO o00o00oo2, int i) {
        this.f45797OooO0Oo = o00o00oo2;
        this.f45798OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O00OO this$0 = this.f45797OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        j5 j5Var = this$0.f45813OooO0O0;
        if (j5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j5Var = null;
        }
        j5Var.f58171OooO0o.f58599OooOO0.setText(o000000.OooO0Oo(Float.valueOf((30000.0f - this.f45798OooO0o0) / 1000)) + "\"");
    }
}
