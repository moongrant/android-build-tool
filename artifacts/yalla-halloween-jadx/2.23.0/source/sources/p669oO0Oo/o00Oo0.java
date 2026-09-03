package p669oO0Oo;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f60575OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(long j) {
        super(0);
        this.f60575OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableLiveData<RoomUserInfoModel> mutableLiveData = OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0;
        ArrayList arrayList = OooO00o.f24973OooO00o;
        mutableLiveData.postValue(OooO00o.OooO0o0(Long.valueOf(this.f60575OooO0Oo)));
        return Unit.INSTANCE;
    }
}
