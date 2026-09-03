package p482o0o000OO;

import com.code.android.util.o000000;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import p355o0OOOo0o.OooO;
import p541o0o0OoOO.oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo00 f48438OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f48439OooO0o0;

    public o00O0O(oo00 oo00Var, RoomLiveService roomLiveService) {
        this.f48438OooO0Oo = oo00Var;
        this.f48439OooO0o0 = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        OooO oooO;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        oo00 oo00Var = this.f48438OooO0Oo;
        if (oo00Var.f55307OooO0OO.getValue().longValue() > 0 && (oooO = this.f48439OooO0o0.f24601OooO0oO) != null) {
            oooO.OooO0o(o000000.OooO0OO(oo00Var.f55307OooO0OO.getValue()), zBooleanValue);
        }
        return Unit.INSTANCE;
    }
}
