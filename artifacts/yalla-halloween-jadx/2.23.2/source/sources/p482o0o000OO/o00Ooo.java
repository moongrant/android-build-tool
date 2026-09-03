package p482o0o000OO;

import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;
import p355o0OOOo0o.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f48441OooO0Oo;

    public o00Ooo(RoomLiveService roomLiveService) {
        this.f48441OooO0Oo = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int iIntValue = ((Number) obj).intValue();
        OooO oooO = this.f48441OooO0Oo.f24601OooO0oO;
        if (oooO != null) {
            Boxing.boxInt(oooO.OooOO0(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
