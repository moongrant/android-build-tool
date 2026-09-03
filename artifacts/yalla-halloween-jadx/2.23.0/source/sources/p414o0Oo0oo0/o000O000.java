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
public final class o000O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NetDevTestVM f45379OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f45380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f45381OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(NetDevTestVM netDevTestVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f45379OooO0Oo = netDevTestVM;
        this.f45381OooO0o0 = o0o0ooo0;
        this.f45380OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO00O<ApiResult<List<RoomMemberTaskModel>>> test1 = this.f45379OooO0Oo.getTest1();
        v0.OooO0O0(test1, this.f45381OooO0o0, false, 6);
        test1.observe(this.f45380OooO0o, new o0000OO0(o0000OO0.f45374OooO0Oo, o000.f45367OooO0Oo, null, false, 12));
        return Unit.INSTANCE;
    }
}
