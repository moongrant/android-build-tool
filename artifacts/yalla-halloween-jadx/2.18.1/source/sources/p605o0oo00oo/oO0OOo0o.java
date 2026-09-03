package p605o0oo00oo;

import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.TopExploreModel;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OOo0o extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MainRoomExploreViewModel f48297OooO00o;

    public oO0OOo0o(MainRoomExploreViewModel mainRoomExploreViewModel) {
        this.f48297OooO00o = mainRoomExploreViewModel;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        TopExploreModel topExploreModel = (TopExploreModel) o0Oo0oo.OooO0O0(response, TopExploreModel.class);
        if (topExploreModel == null) {
            return;
        }
        topExploreModel.room.add(topExploreModel.hourData.barSendData);
        topExploreModel.room.add(topExploreModel.dayData.barSendData);
        topExploreModel.room.add(topExploreModel.weekData.barSendData);
        topExploreModel.room.add(topExploreModel.monthData.barSendData);
        topExploreModel.giftSend.add(topExploreModel.hourData.perSendData);
        topExploreModel.giftSend.add(topExploreModel.dayData.perSendData);
        topExploreModel.giftSend.add(topExploreModel.weekData.perSendData);
        topExploreModel.giftSend.add(topExploreModel.monthData.perSendData);
        topExploreModel.giftReceived.add(topExploreModel.hourData.perGetData);
        topExploreModel.giftReceived.add(topExploreModel.dayData.perGetData);
        topExploreModel.giftReceived.add(topExploreModel.weekData.perGetData);
        topExploreModel.giftReceived.add(topExploreModel.monthData.perGetData);
        topExploreModel.total.add(topExploreModel.hourData.totalRankData);
        topExploreModel.total.add(topExploreModel.dayData.totalRankData);
        topExploreModel.total.add(topExploreModel.weekData.totalRankData);
        topExploreModel.total.add(topExploreModel.monthData.totalRankData);
        ((MutableLiveData) this.f48297OooO00o.f25465OooO00o.getValue()).postValue(topExploreModel);
    }
}
