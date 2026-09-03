package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p533o0o0Oo0.oo0O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48653OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48652OooO0Oo = o000o;
        this.f48653OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        this.f48652OooO0Oo.getClass();
        o0OO000.OooO00o("102190");
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(OooO00o.f24978OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
            Iterator<T> it = OooO00o.f24979OooO0oO.f47380OooOO0O.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((oo0O) next).f54838OooO0OO.getValue().longValue() == this.f48653OooO0o0.getUserId().getValue().longValue()));
            oo0O oo0o = (oo0O) next;
            if (oo0o != null) {
                MutableStateFlow<Boolean> mutableStateFlow = oo0o.f54839OooO0Oo;
                mutableStateFlow.setValue(Boolean.valueOf(!mutableStateFlow.getValue().booleanValue()));
            }
        }
        return Unit.INSTANCE;
    }
}
