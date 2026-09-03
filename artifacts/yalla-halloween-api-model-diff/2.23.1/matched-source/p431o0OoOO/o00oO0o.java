package p431o0OoOO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.o00000OO;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00oO0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46799OooO0o0;

    public /* synthetic */ o00oO0o(Object obj, int i) {
        this.f46798OooO0Oo = i;
        this.f46799OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46798OooO0Oo;
        Object obj2 = this.f46799OooO0o0;
        switch (i) {
            case 0:
                o0ooOOo this$0 = (o0ooOOo) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f46824OooO0O0.reset();
                break;
            case 1:
                RoomLiveService this$1 = (RoomLiveService) obj2;
                RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOOOO.OooO0OO("RoomLiveService", "Room_State_Disconnect");
                this$1.OooO0o0();
                this$1.OooO0O0();
                break;
            case 2:
                TopicDetailActivity this$2 = (TopicDetailActivity) obj2;
                Long l = (Long) obj;
                int i2 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel value = this$2.OooOoo0().getTopicDetailLocal().getValue();
                if (Intrinsics.areEqual(value != null ? Long.valueOf(value.getId()) : null, l)) {
                    this$2.OooOoo0().isFollow().setValue(Boolean.TRUE);
                }
                break;
            default:
                o00000OO this$3 = (o00000OO) obj2;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOo(!((Boolean) obj).booleanValue());
                break;
        }
    }
}
