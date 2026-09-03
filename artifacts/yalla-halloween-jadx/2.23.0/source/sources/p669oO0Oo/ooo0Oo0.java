package p669oO0Oo;

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
public final class ooo0Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f60829OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(MutableState<String> mutableState) {
        super(0);
        this.f60829OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList arrayList = OooO00o.f24973OooO00o;
        OooO00o.OooO0oO(OooO0OO.AbstractC0318OooO0OO.OooO0O0.f25054OooO00o);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            String value = this.f60829OooO0Oo.getValue();
            RoomLoginModel roomLoginModel = roomLiveService.f25066OooOO0O;
            if (roomLoginModel != null) {
                roomLoginModel.setPassword(value);
            }
            roomLiveService.OooO0o();
        }
        return Unit.INSTANCE;
    }
}
