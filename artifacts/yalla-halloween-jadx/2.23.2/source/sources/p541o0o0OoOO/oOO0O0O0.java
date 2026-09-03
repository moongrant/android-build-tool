package p541o0o0OoOO;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p384o0OOoo0O.o00O0O;
import p424o0OoO0Oo.o00OO0O0;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f55237OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55238OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55239OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O0(LiveRoomVM liveRoomVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f55237OooO0Oo = liveRoomVM;
        this.f55239OooO0o0 = o0ooo0o1;
        this.f55238OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102162");
        o00OO0O0<ApiResult<Object>> o00oo0o0FollowRoom = this.f55237OooO0Oo.followRoom(true);
        o0oOO.OooO0O0(o00oo0o0FollowRoom, this.f55239OooO0o0, false, 6);
        o00O0O.OooO0Oo(o00oo0o0FollowRoom, this.f55238OooO0o, false, null, null, oOO0O0.f55233OooO0Oo, 14);
        return Unit.INSTANCE;
    }
}
