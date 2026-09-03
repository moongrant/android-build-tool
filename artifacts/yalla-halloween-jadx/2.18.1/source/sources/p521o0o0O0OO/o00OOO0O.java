package p521o0o0O0OO;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.developer.nettest.NetDevTestVM;
import com.yalla.yalla.model.RoomMemberTaskModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import p484o0o000OO.OooOOOO;
import p571o0oOo0o.oo00o;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ NetDevTestVM f42950Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f42951Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f42952Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(NetDevTestVM netDevTestVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f42950Oooo0o = netDevTestVM;
        this.f42951Oooo0oO = oo0oo0oo;
        this.f42952Oooo0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOOOO<ApiResult<List<RoomMemberTaskModel>>> test2 = this.f42950Oooo0o.getTest2();
        oo00o.OooO0O0(test2, this.f42951Oooo0oO);
        test2.observe(this.f42952Oooo0oo, new OooOo(o00OOO00.f42949Oooo0o, o00OOO0.f42948Oooo0o, null, false, 12));
        return Unit.INSTANCE;
    }
}
