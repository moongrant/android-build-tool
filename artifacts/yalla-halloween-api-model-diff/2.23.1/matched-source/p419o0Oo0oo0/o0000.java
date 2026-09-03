package p419o0Oo0oo0;

import android.app.Activity;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.module.event.ui.screen.EventDetailScreen;
import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46551OooO0o0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f46550OooO0Oo = i;
        this.f46551OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46550OooO0Oo;
        Object obj2 = this.f46551OooO0o0;
        switch (i) {
            case 1:
                EventDetailScreen.EventDetailHeader$lambda$10$lambda$8$lambda$7((EventDetailViewModel) obj2, (SubscribeNotifyModel) obj);
                break;
            case 2:
                Activity activity = (Activity) obj2;
                ((Boolean) obj).booleanValue();
                if (activity != null) {
                    activity.finish();
                }
                break;
            default:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) obj2;
                List list = (List) obj;
                int i2 = RoomMoraGameListDialog.f27497OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (list != null) {
                    this$0.f27501OooOO0o.OooOoO0(list);
                    if (list.isEmpty()) {
                        this$0.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
