package p497o0o00OoO;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.MoraGiftListModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p650o0ooo.oOOO0OO0;
import p650o0ooo.oOOOoo00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O0O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49840OooO0o0;

    public /* synthetic */ o00O0O0(Object obj, int i) {
        this.f49839OooO0Oo = i;
        this.f49840OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49839OooO0Oo;
        oOOOoo00 oooooo00 = null;
        Object obj2 = this.f49840OooO0o0;
        switch (i) {
            case 0:
                oo0O this$0 = (oo0O) obj2;
                RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ArrayList arrayList = OooO00o.f24511OooO00o;
                RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(roomUserInfoModel.getUserId().getValue());
                OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
                if (roomUserInfoModelOooO0o0 == null) {
                    oooO00o.OooO00o().f24578OoooO0.postValue(roomUserInfoModel);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0.f49626OooO00o), null, null, new o00OO000(roomUserInfoModel, this$0, null), 3, null);
                } else {
                    oooO00o.OooO00o().f24578OoooO0.postValue(roomUserInfoModelOooO0o0);
                }
                break;
            default:
                final oOOO0OO0 this$1 = (oOOO0OO0) obj2;
                List<MoraGiftListModel> it = (List) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                oOOOoo00 oooooo01 = this$1.f58990OooOO0O;
                if (oooooo01 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooooo00 = oooooo01;
                }
                oooooo00.OooOoO0(it);
                this$1.OooOO0().f44151OooOoO0.postDelayed(new Runnable() { // from class: o0ooo.oOOO00o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        oOOO0OO0 this$2 = this$1;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.OooOO0().f44151OooOoO0.scrollToPosition(0);
                    }
                }, 200L);
                this$1.f58992OooOOO = it;
                break;
        }
    }
}
