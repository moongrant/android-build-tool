package p476o0o0000o;

import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import p351o0OOOo0O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O implements FlowCollector<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f47593OooO0Oo;

    public o000OO0O(RoomLiveService roomLiveService) {
        this.f47593OooO0Oo = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Boolean bool, Continuation continuation) {
        boolean zBooleanValue = bool.booleanValue();
        OooOO0 oooOO1 = this.f47593OooO0Oo.f25063OooO0oO;
        if (oooOO1 != null) {
            oooOO1.OooOo0O(zBooleanValue);
        }
        return Unit.INSTANCE;
    }
}
