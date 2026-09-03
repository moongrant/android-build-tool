package p541o0o0Oo0o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0o;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f44165Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooO0o f44166OoooO00;

    public o00O00OO(o00O00o0 o00o00o1, OooO0o oooO0o) {
        this.f44165Oooo = o00o00o1;
        this.f44166OoooO00 = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Function1<? super Integer, Unit> function1 = this.f44165Oooo.f44170OooO0Oo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f44166OoooO00.getLayoutPosition()));
        }
    }
}
