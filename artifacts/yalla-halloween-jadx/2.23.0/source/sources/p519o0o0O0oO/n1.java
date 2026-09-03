package p519o0o0O0oO;

import android.view.View;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t1 f52437OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(t1 t1Var) {
        super(1);
        this.f52437OooO0Oo = t1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        new RoomLuckyNumberHistoryDialog(this.f52437OooO0Oo.f53148OooO0oO).OooOO0o();
        return Unit.INSTANCE;
    }
}
