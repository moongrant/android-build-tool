package p443o0OoOo0o;

import android.content.Intent;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f47285OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(RoomFrameUIController roomFrameUIController) {
        super(1);
        this.f47285OooO0Oo = roomFrameUIController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            int i = LoginOnRoomDialogActivity.f24738OooOo0O;
            MixedRoomActivity context = this.f47285OooO0Oo.f23084OooO00o;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) LoginOnRoomDialogActivity.class));
            context.overridePendingTransition(oo000o.alpha_in, oo000o.anim_empty);
        }
        return Unit.INSTANCE;
    }
}
