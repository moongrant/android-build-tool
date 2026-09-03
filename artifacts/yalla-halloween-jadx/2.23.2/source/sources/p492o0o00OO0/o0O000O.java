package p492o0o00OO0;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p429o0OoOO.o0Oo0oo;
import p494o0o00OOo.o00Ooo;
import p494o0o00OOo.o0OoOo0;
import p494o0o00OOo.oo000o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49207OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(MomentSendActivity momentSendActivity) {
        super(0);
        this.f49207OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentSendActivity.f25726Oooo0OO;
        o0OoOo0 o0oooo0OooOoO = this.f49207OooO0Oo.OooOoO();
        o0oooo0OooOoO.getClass();
        MutableState mutableState = o0Oo0oo.f46817OooO00o;
        if (o0Oo0oo.OooO0oO() == RoomState.InRoom) {
            o000O00.OooO0O0(o0000.OooO0OO(o000000.in_room_create_moment_to_camera));
        } else {
            MomentSendActivity momentSendActivity = o0oooo0OooOoO.f49590OooO00o;
            momentSendActivity.OooOo().f44320OooO0o.OooO0o0();
            OooO00o.OooO0OO(momentSendActivity, PermissionGroupReveal.f32341OooO0oO, o00Ooo.f49580OooO0Oo, new oo000o(o0oooo0OooOoO));
        }
        return Unit.INSTANCE;
    }
}
