package p534o0o0OOo0;

import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LoginOnRoomDialogActivity f43554Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(LoginOnRoomDialogActivity loginOnRoomDialogActivity) {
        super(0);
        this.f43554Oooo0o = loginOnRoomDialogActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f43554Oooo0o.finish();
        return Unit.INSTANCE;
    }
}
