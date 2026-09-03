package p491o0o00O0o;

import com.code.android.util.o000O;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginOnRoomDialogActivity f48984OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(LoginOnRoomDialogActivity loginOnRoomDialogActivity) {
        super(1);
        this.f48984OooO0Oo = loginOnRoomDialogActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        int i = LoginOnRoomDialogActivity.f24738OooOo0O;
        StateButton btLoginPhone = this.f48984OooO0Oo.OooOo().f44549OooO0OO;
        Intrinsics.checkNotNullExpressionValue(btLoginPhone, "btLoginPhone");
        Intrinsics.checkNotNull(bool2);
        o000O.OooOOO0(btLoginPhone, bool2.booleanValue());
        return Unit.INSTANCE;
    }
}
