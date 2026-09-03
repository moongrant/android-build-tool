package p507o0o00ooo;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.moment.MomentBannerModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.util.WebPageInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p427o0OoOO00.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MomentBannerModel.MomentBannerItem> f49854OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f49855OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49856OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f49857OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f49858OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(List<MomentBannerModel.MomentBannerItem> list, int i, Context context, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f49854OooO0Oo = list;
        this.f49856OooO0o0 = i;
        this.f49855OooO0o = context;
        this.f49857OooO0oO = baseMomentDetailVM;
        this.f49858OooO0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentBannerModel.MomentBannerItem momentBannerItem = this.f49854OooO0Oo.get(this.f49856OooO0o0);
        int jumpType = momentBannerItem.getJumpType();
        Context context = this.f49855OooO0o;
        if (jumpType == 0) {
            if (momentBannerItem.getUrl().length() > 0) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.MomentActivityBanner);
                webPageInfo.OooO0o0(momentBannerItem.getUrl());
                webPageInfo.OooO0Oo(momentBannerItem.getTitle());
                WebPageInfo.ShareType.Companion companion = WebPageInfo.ShareType.INSTANCE;
                int isShare = momentBannerItem.getIsShare();
                companion.getClass();
                webPageInfo.OooO0OO(WebPageInfo.ShareType.Companion.OooO00o(isShare), momentBannerItem.getImageUrl(), "");
                webPageInfo.OooO00o("barId", String.valueOf(momentBannerItem.getId()));
                int i = WebActivity.f25584OooOoO0;
                WebActivity.OooO00o.OooO00o(context, webPageInfo);
            }
        } else if (jumpType == 1) {
            if (momentBannerItem.getRoomServerIp().length() > 0) {
                RoomModel roomModel = new RoomModel();
                roomModel.setRoomIp(momentBannerItem.getRoomServerIp());
                roomModel.websocketaddr = momentBannerItem.getWebsocketaddr();
                roomModel.setId(momentBannerItem.getTargetId());
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.AII_Banner_Room);
            }
        } else if (jumpType == 2) {
            String strOooOOO0 = o0OoOo0.OooOOO0("", Long.valueOf(momentBannerItem.getTargetId()));
            if (!(strOooOOO0.length() == 0)) {
                BaseMomentDetailVM.momentDetail$default(this.f49857OooO0oO, strOooOOO0, 0, 2, null).observe(this.f49858OooO0oo, new o0000OO0(new h0(context), null, null, false, 14));
            }
        } else if (jumpType == 3) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            topicInfoModel.setId(momentBannerItem.getTargetId());
            int i2 = TopicDetailActivity.f26305OooOoOO;
            TopicDetailActivity.OooO00o.OooO00o(context, topicInfoModel);
        }
        return Unit.INSTANCE;
    }
}
