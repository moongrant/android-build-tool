package p474o0o00;

import com.code.android.util.o000OO00;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginOnRoomDialogActivity f47261OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(LoginOnRoomDialogActivity loginOnRoomDialogActivity) {
        super(1);
        this.f47261OooO0Oo = loginOnRoomDialogActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        int i = LoginOnRoomDialogActivity.f25197OooOo0O;
        StateButton stateButton = this.f47261OooO0Oo.OooOo().f59361OooO0O0;
        Intrinsics.checkNotNullExpressionValue(stateButton, "binding.btFaceBook");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000OO00.OooOOO0(stateButton, it.booleanValue());
        return Unit.INSTANCE;
    }
}
