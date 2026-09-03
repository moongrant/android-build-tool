package p541o0o0Oo0o;

import android.text.TextUtils;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0o;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f44142Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f44143OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f44144OoooO00;

    public o00O00(String str, o00O00o0 o00o00o1, OooO0o oooO0o) {
        this.f44142Oooo = str;
        this.f44144OoooO00 = o00o00o1;
        this.f44143OoooO0 = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!TextUtils.isEmpty(this.f44142Oooo)) {
            o00O00o0.OooO00o(this.f44144OoooO00, this.f44143OoooO0.getLayoutPosition());
            return;
        }
        Function0<Unit> function0 = this.f44144OoooO00.f44168OooO0O0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
