package p450o0OoOooO;

import android.app.Activity;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.module.event.ui.screen.EventDetailScreen;
import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import p482o0o000OO.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0O0o0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47533OooO0o0;

    public /* synthetic */ o0O0O0o0(Object obj, int i) {
        this.f47532OooO0Oo = i;
        this.f47533OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47532OooO0Oo;
        Object obj2 = this.f47533OooO0o0;
        switch (i) {
            case 0:
                EventDetailScreen.EventDetailHeader$lambda$10$lambda$8$lambda$7((EventDetailViewModel) obj2, (SubscribeNotifyModel) obj);
                break;
            case 1:
                Activity activity = (Activity) obj2;
                ((Boolean) obj).booleanValue();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 2:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) obj2;
                o00oO0o it = (o00oO0o) obj;
                int i2 = RoomMoraGameListDialog.f27488OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                XRefreshLayout xRefreshLayout = this$0.f27490OooOO0;
                boolean z = it.f48443OooO0O0;
                xRefreshLayout.OooOooo(z, true, !z && it.f48444OooO0OO);
                break;
            default:
                MainRoomRecommendFragment.onLazyInit$lambda$1((MainRoomRecommendFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
