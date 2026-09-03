package p485o0o00O0;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p427o0OoOO00.o0OOO0o;
import p488o0o00O0o.o000000;
import p488o0o00O0o.o000OOo;
import p488o0o00O0o.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47881OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(MomentSendActivity momentSendActivity) {
        super(0);
        this.f47881OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentSendActivity.f26175Oooo0OO;
        o0OO00O o0oo00oOooOoO = this.f47881OooO0Oo.OooOoO();
        o0oo00oOooOoO.getClass();
        MutableState mutableState = o0OOO0o.f45698OooO00o;
        if (o0OOO0o.OooO0oO() == RoomState.InRoom) {
            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.in_room_create_moment_to_camera));
        } else {
            MomentSendActivity momentSendActivity = o0oo00oOooOoO.f48448OooO00o;
            momentSendActivity.OooOo().f58558OooO0o.OooO0o0();
            OooO00o.OooO0OO(momentSendActivity, PermissionGroupReveal.f32885OooO0oO, o000OOo.f48446OooO0Oo, new o000000(o0oo00oOooOoO));
        }
        return Unit.INSTANCE;
    }
}
