package p519o0o0O0oO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import p476o0o0000o.o00;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements Observer<o00> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameListDialog f53188OooO0Oo;

    public w1(RoomMoraGameListDialog roomMoraGameListDialog) {
        this.f53188OooO0Oo = roomMoraGameListDialog;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(o00 o00Var) {
        o00 it = o00Var;
        Intrinsics.checkNotNullParameter(it, "it");
        XRefreshLayout xRefreshLayout = this.f53188OooO0Oo.f27953OooOO0;
        boolean z = it.f47570OooO0O0;
        xRefreshLayout.OooOooo(z, true, !z && it.f47571OooO0OO);
    }
}
