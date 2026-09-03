package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.room.RoomLoginModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0OO;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f54980OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO0O(MutableState<String> mutableState) {
        super(0);
        this.f54980OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList arrayList = OooO00o.f24511OooO00o;
        OooO00o.OooO0oO(OooO0OO.AbstractC0317OooO0OO.OooO0O0.f24592OooO00o);
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            String value = this.f54980OooO0Oo.getValue();
            RoomLoginModel roomLoginModel = roomLiveService.f24604OooOO0O;
            if (roomLoginModel != null) {
                roomLoginModel.setPassword(value);
            }
            roomLiveService.OooO0o();
        }
        return Unit.INSTANCE;
    }
}
