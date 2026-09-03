package p482o0o000OO;

import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import p355o0OOOo0o.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f48445OooO0Oo;

    public o0OoOo0(RoomLiveService roomLiveService) {
        this.f48445OooO0Oo = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO oooO = this.f48445OooO0Oo.f24601OooO0oO;
        if (oooO != null) {
            oooO.OooOo0o(zBooleanValue);
        }
        return Unit.INSTANCE;
    }
}
