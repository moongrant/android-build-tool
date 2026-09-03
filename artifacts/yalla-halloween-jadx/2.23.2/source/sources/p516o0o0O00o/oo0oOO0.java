package p516o0o0O00o;

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
import p384o0OOoo0O.o000oOoO;
import p429o0OoOO.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MomentBannerModel.MomentBannerItem> f51754OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f51755OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f51756OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51757OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51758OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(List<MomentBannerModel.MomentBannerItem> list, int i, Context context, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f51754OooO0Oo = list;
        this.f51756OooO0o0 = i;
        this.f51755OooO0o = context;
        this.f51757OooO0oO = baseMomentDetailVM;
        this.f51758OooO0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentBannerModel.MomentBannerItem momentBannerItem = this.f51754OooO0Oo.get(this.f51756OooO0o0);
        int jumpType = momentBannerItem.getJumpType();
        Context context = this.f51755OooO0o;
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
                int i = WebActivity.f25130OooOoO0;
                WebActivity.OooO00o.OooO00o(context, webPageInfo);
            }
        } else if (jumpType == 1) {
            if (momentBannerItem.getRoomServerIp().length() > 0) {
                RoomModel roomModel = new RoomModel();
                roomModel.setRoomIp(momentBannerItem.getRoomServerIp());
                roomModel.websocketaddr = momentBannerItem.getWebsocketaddr();
                roomModel.setId(momentBannerItem.getTargetId());
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.AII_Banner_Room);
            }
        } else if (jumpType == 2) {
            String strOooOOO0 = o0OoOo0.OooOOO0("", Long.valueOf(momentBannerItem.getTargetId()));
            if (!(strOooOOO0.length() == 0)) {
                BaseMomentDetailVM.momentDetail$default(this.f51757OooO0oO, strOooOOO0, 0, 2, null).observe(this.f51758OooO0oo, new o000oOoO(new o00OO000(context), null, null, false, 14));
            }
        } else if (jumpType == 3) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            topicInfoModel.setId(momentBannerItem.getTargetId());
            int i2 = TopicDetailActivity.f25854OooOoOO;
            TopicDetailActivity.OooO00o.OooO00o(context, topicInfoModel);
        }
        return Unit.INSTANCE;
    }
}
