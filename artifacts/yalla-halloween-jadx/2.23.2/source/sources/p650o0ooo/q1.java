package p650o0ooo;

import android.view.View;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f59126OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(w1 w1Var) {
        super(1);
        this.f59126OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        new RoomLuckyNumberHistoryDialog(this.f59126OooO0Oo.f59194OooO0oO).OooOO0o();
        return Unit.INSTANCE;
    }
}
