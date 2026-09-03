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
public final class o00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ NetDevTestVM f42933Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f42934Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f42935Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(NetDevTestVM netDevTestVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f42933Oooo0o = netDevTestVM;
        this.f42934Oooo0oO = oo0oo0oo;
        this.f42935Oooo0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOOOO<ApiResult<List<RoomMemberTaskModel>>> test1 = this.f42933Oooo0o.getTest1();
        oo00o.OooO0O0(test1, this.f42934Oooo0oO);
        test1.observe(this.f42935Oooo0oo, new OooOo(o00OO0OO.f42947Oooo0o, oo0O.f42959Oooo0o, null, false, 12));
        return Unit.INSTANCE;
    }
}
