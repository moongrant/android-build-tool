package p490o0o00OOO;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 implements Observer<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48602OooO0Oo;

    public o000O0(o000O o000o) {
        this.f48602OooO0Oo = o000o;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel roomUserInfoModel2 = roomUserInfoModel;
        ArrayList arrayList = OooO00o.f24973OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(roomUserInfoModel2.getUserId().getValue());
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        if (roomUserInfoModelOooO0o0 != null) {
            oooO00o.OooO00o().f25040OoooO0.postValue(roomUserInfoModelOooO0o0);
            return;
        }
        oooO00o.OooO00o().f25040OoooO0.postValue(roomUserInfoModel2);
        o000O o000o = this.f48602OooO0Oo;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o000o.f48470OooO00o), null, null, new o000O00O(roomUserInfoModel2, o000o, null), 3, null);
    }
}
