package p540o0o0OoO0;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f54705OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(long j) {
        super(0);
        this.f54705OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableLiveData<RoomUserInfoModel> mutableLiveData = OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0;
        ArrayList arrayList = OooO00o.f24511OooO00o;
        mutableLiveData.postValue(OooO00o.OooO0o0(Long.valueOf(this.f54705OooO0Oo)));
        return Unit.INSTANCE;
    }
}
