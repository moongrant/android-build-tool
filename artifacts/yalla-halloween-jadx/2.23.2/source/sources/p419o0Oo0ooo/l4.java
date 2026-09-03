package p419o0Oo0ooo;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.developer.nettest.NetDevTestVM;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberTaskModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;
import p424o0OoO0Oo.o00OO0O0;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class l4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NetDevTestVM f46601OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f46602OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f46603OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(NetDevTestVM netDevTestVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f46601OooO0Oo = netDevTestVM;
        this.f46603OooO0o0 = o0ooo0o1;
        this.f46602OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OO0O0<ApiResult<List<RoomMemberTaskModel>>> o00oo0o0PostTest1 = this.f46601OooO0Oo.postTest1();
        o0oOO.OooO0O0(o00oo0o0PostTest1, this.f46603OooO0o0, false, 6);
        o00oo0o0PostTest1.observe(this.f46602OooO0o, new o000oOoO(j4.f46599OooO0Oo, k4.f46600OooO0Oo, null, false, 12));
        return Unit.INSTANCE;
    }
}
