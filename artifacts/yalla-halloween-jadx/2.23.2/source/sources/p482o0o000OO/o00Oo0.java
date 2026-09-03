package p482o0o000OO;

import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import p355o0OOOo0o.OooO;
import p423o0OoO0OO.o000O0O0;
import p483o0o000Oo.o0000oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f48440OooO0Oo;

    public o00Oo0(RoomLiveService roomLiveService) {
        this.f48440OooO0Oo = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        o0000O00.OooO0OO("RoomLiveService", "observeOnMic onMic = " + zBooleanValue);
        RoomLiveService roomLiveService = this.f48440OooO0Oo;
        if (zBooleanValue) {
            OooO oooO = roomLiveService.f24601OooO0oO;
            if (oooO != null) {
                oooO.OooO();
            }
            o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
            roomLiveService.f24608OooOOOO = o000O0O0.OooO00o(o0000ooVar.f48577OooO0O0, roomLiveService.getLifecycle(), new o0OoOo0(roomLiveService));
            roomLiveService.f24609OooOOOo = o000O0O0.OooO00o(o0000ooVar.f48575OooO, roomLiveService.getLifecycle(), new o00Ooo(roomLiveService));
        } else {
            OooO oooO2 = roomLiveService.f24601OooO0oO;
            if (oooO2 != null) {
                oooO2.OooOOo();
            }
            Job job = roomLiveService.f24608OooOOOO;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            roomLiveService.f24608OooOOOO = null;
            Job job2 = roomLiveService.f24609OooOOOo;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            roomLiveService.f24609OooOOOo = null;
        }
        return Unit.INSTANCE;
    }
}
