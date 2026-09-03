package p414o0Oo0oo0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.developer.nettest.NetDevTestVM;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberTaskModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p420o0OoO0OO.o0OO00O;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NetDevTestVM f45383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f45384OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f45385OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(NetDevTestVM netDevTestVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f45383OooO0Oo = netDevTestVM;
        this.f45385OooO0o0 = o0o0ooo0;
        this.f45384OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO00O<ApiResult<List<RoomMemberTaskModel>>> o0oo00oPostTest1 = this.f45383OooO0Oo.postTest1();
        v0.OooO0O0(o0oo00oPostTest1, this.f45385OooO0o0, false, 6);
        o0oo00oPostTest1.observe(this.f45384OooO0o, new o0000OO0(o000O00O.f45382OooO0Oo, o000O0.f45375OooO0Oo, null, false, 12));
        return Unit.INSTANCE;
    }
}
