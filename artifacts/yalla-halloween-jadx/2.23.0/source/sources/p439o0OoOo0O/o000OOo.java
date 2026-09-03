package p439o0OoOo0O;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Observer;
import com.google.firebase.messaging.o0OO00O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import kotlin.jvm.internal.Intrinsics;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO000o00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f46099OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f46100OooO0o0;

    public o000OOo(RoomFrameUIController roomFrameUIController, OooO0O0 oooO0O0) {
        this.f46099OooO0Oo = roomFrameUIController;
        this.f46100OooO0o0 = oooO0O0;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Activity activityOooO00o = com.code.android.util.OooO0O0.OooO00o(LoginActivity.class);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            T value = o000000O.OooOo0O().getValue();
            Boolean bool2 = Boolean.FALSE;
            if (Intrinsics.areEqual(value, bool2) && activityOooO00o == null) {
                int i = LoginOnRoomDialogActivity.f25197OooOo0O;
                MixedRoomActivity context = this.f46099OooO0Oo.f23544OooO00o;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) LoginOnRoomDialogActivity.class));
                context.overridePendingTransition(oO000o00.alpha_in, oO000o00.anim_empty);
                this.f46100OooO0o0.f25025OooOoo0.setValue(bool2);
                o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
                o0o0o00OooO0o0.getClass();
                o0OO00O.OooO00o("touristLoginRoom", o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
            }
        }
    }
}
