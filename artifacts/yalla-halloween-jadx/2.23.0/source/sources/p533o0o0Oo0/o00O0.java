package p533o0o0Oo0;

import androidx.compose.runtime.Oooo0;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0 f54736OooO0Oo = new o00O0();

    public o00O0() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            o0OO000.OooO00o("102274");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String strOooO00o = Oooo0.OooO00o();
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10017, "{\"to\":" + strOooO00o + "}");
            }
        } else if (iIntValue == 1) {
            o0OO000.OooO00o("102275");
            MutableLiveData<RoomUserInfoModel> mutableLiveData = OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0;
            ArrayList arrayList = OooO00o.f24973OooO00o;
            o000000O o000000o3 = o000000O.f46674OooO00o;
            mutableLiveData.postValue(OooO00o.OooO0o0((Long) o000000O.OooOOo0().getValue()));
        }
        return Unit.INSTANCE;
    }
}
