package p541o0o0OoOO;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p004OooO0oO.o0OoOo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOO f55197OooO0Oo = new oOO();

    public oOO() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            OooO00o.OooO0O0("102274");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strOooO00o = o0OoOo0.OooO00o();
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10017, "{\"to\":" + strOooO00o + "}");
            }
        } else if (iIntValue == 1) {
            OooO00o.OooO0O0("102275");
            MutableLiveData<RoomUserInfoModel> mutableLiveData = OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0;
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            mutableLiveData.postValue(com.yalla.yalla.service.room.OooO00o.OooO0o0((Long) o0O00oO0.OooOOo0().getValue()));
        }
        return Unit.INSTANCE;
    }
}
