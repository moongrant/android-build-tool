package p482o0o000OO;

import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import p355o0OOOo0o.OooO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f48437OooO0Oo;

    public o000oOoO(RoomLiveService roomLiveService) {
        this.f48437OooO0Oo = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        o0000O00.OooO0OO("RoomLiveService", "muteSoundJob muteSound = " + zBooleanValue);
        OooO oooO = this.f48437OooO0Oo.f24601OooO0oO;
        if (oooO != null) {
            oooO.OooOOOo(zBooleanValue);
        }
        return Unit.INSTANCE;
    }
}
