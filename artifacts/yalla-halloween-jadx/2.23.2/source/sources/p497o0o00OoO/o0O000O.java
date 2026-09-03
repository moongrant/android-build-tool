package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o0oo0000.OooO00o;
import p541o0o0OoOO.oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49879OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49880OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49879OooO0Oo = oo0o;
        this.f49880OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        this.f49879OooO0Oo.getClass();
        OooO00o.OooO0O0("102190");
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
            Iterator<T> it = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((oo00) next).f55307OooO0OO.getValue().longValue() == this.f49880OooO0o0.getUserId().getValue().longValue()));
            oo00 oo00Var = (oo00) next;
            if (oo00Var != null) {
                MutableStateFlow<Boolean> mutableStateFlow = oo00Var.f55308OooO0Oo;
                mutableStateFlow.setValue(Boolean.valueOf(!mutableStateFlow.getValue().booleanValue()));
            }
        }
        return Unit.INSTANCE;
    }
}
