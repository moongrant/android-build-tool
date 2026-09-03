package p435o0OoOOO0;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.o00000OO;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000Ooo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46917OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46918OooO0o0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f46917OooO0Oo = i;
        this.f46918OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46917OooO0Oo;
        Object obj2 = this.f46918OooO0o0;
        switch (i) {
            case 0:
                MutableLiveData mutableLiveData = (MutableLiveData) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(Integer.valueOf(iIntValue));
                    break;
                }
                break;
            case 1:
                RoomLiveService this$0 = (RoomLiveService) obj2;
                RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOOOO.OooO0OO("RoomLiveService", "Room_State_Disconnect");
                this$0.OooO0o0();
                this$0.OooO0O0();
                this$0.stopSelf();
                break;
            case 2:
                TopicDetailActivity this$1 = (TopicDetailActivity) obj2;
                Long l = (Long) obj;
                int i2 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoModel topicInfoModel = this$1.f25860OooOo00;
                if (topicInfoModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                    topicInfoModel = null;
                }
                long id = topicInfoModel.getId();
                if (l != null && l.longValue() == id) {
                    this$1.OooOoo().getGroupInfo();
                }
                break;
            default:
                o00000OO this$2 = (o00000OO) obj2;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOoO0();
                break;
        }
    }
}
