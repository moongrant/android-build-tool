package p498o0o00Oo0;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p675oO0Oo.l0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00oOoo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49849OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49850OooO0o0;

    public /* synthetic */ o00oOoo(Object obj, int i) {
        this.f49849OooO0Oo = i;
        this.f49850OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49849OooO0Oo;
        Object obj2 = this.f49850OooO0o0;
        switch (i) {
            case 0:
                o00O0O0O this$0 = (o00O0O0O) obj2;
                RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ArrayList arrayList = OooO00o.f24519OooO00o;
                RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(roomUserInfoModel.getUserId().getValue());
                OooO0O0.OooO00o oooO00o = OooO0O0.f24541OoooOOO;
                if (roomUserInfoModelOooO0o0 == null) {
                    oooO00o.OooO00o().f24586OoooO0.postValue(roomUserInfoModel);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0.f49652OooO00o), null, null, new oo00o(roomUserInfoModel, this$0, null), 3, null);
                } else {
                    oooO00o.OooO00o().f24586OoooO0.postValue(roomUserInfoModelOooO0o0);
                }
                break;
            default:
                l0 this$1 = (l0) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                View vMoraPoint = this$1.OooOO0().f44171OooOoo0;
                Intrinsics.checkNotNullExpressionValue(vMoraPoint, "vMoraPoint");
                if (obj == null) {
                    o000O.OooO0OO(vMoraPoint);
                } else {
                    o000O.OooOOOO(vMoraPoint);
                }
                break;
        }
    }
}
