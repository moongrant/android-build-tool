package p476o0o0000o;

import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import p351o0OOOo0O.OooOO0;
import p475o0o000.o000000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O implements FlowCollector<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f47574OooO0Oo;

    public o000O(RoomLiveService roomLiveService) {
        this.f47574OooO0Oo = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Boolean bool, Continuation continuation) {
        boolean zBooleanValue = bool.booleanValue();
        OooOOO0.OooO0OO("RoomLiveService", "observeOnMic onMic = " + zBooleanValue);
        RoomLiveService roomLiveService = this.f47574OooO0Oo;
        if (zBooleanValue) {
            OooOO0 oooOO1 = roomLiveService.f25063OooO0oO;
            if (oooOO1 != null) {
                oooOO1.OooO();
            }
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            roomLiveService.f25070OooOOOO = p417o0OoO0.o000000.OooO00o(o000000Var.f47372OooO0O0, roomLiveService.getLifecycle(), new o000OO0O(roomLiveService));
            roomLiveService.f25071OooOOOo = p417o0OoO0.o000000.OooO00o(o000000Var.f47370OooO, roomLiveService.getLifecycle(), new o000OO00(roomLiveService));
        } else {
            OooOO0 oooOO2 = roomLiveService.f25063OooO0oO;
            if (oooOO2 != null) {
                oooOO2.OooOOo0();
            }
            Job job = roomLiveService.f25070OooOOOO;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            roomLiveService.f25070OooOOOO = null;
            Job job2 = roomLiveService.f25071OooOOOo;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            roomLiveService.f25071OooOOOo = null;
        }
        return Unit.INSTANCE;
    }
}
