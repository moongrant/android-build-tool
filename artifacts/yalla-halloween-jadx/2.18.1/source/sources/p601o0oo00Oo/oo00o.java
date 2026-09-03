package p601o0oo00Oo;

import com.app.base.model.BarBannerModel;
import com.app.base.model.RoomModel;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.common.vm.AdVM;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p563o0oOo0.Oooo000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0 f48262Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48263Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(o00O0 o00o1, int i) {
        super(0);
        this.f48262Oooo0o = o00o1;
        this.f48263Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O0 o00o1 = this.f48262Oooo0o;
        int i = this.f48263Oooo0oO;
        Oooo000 oooo000 = o00o1.f48072OooO0Oo;
        BarBannerModel.BarBannerItem data = oooo000 != null ? oooo000.getData(i) : null;
        if (data != null) {
            if (1 == data.getExType() || 1 == data.getJumpType()) {
                String roomServerip = data.getRoomServerip();
                if (!(roomServerip == null || roomServerip.length() == 0)) {
                    RoomModel roomModel = new RoomModel();
                    roomModel.setName(data.getTitle());
                    roomModel.setImage(data.getImageUrl());
                    roomModel.setBaridx(data.getBarId());
                    roomModel.setRoomIp(data.getRoomServerip());
                    roomModel.setId(Long.parseLong(data.getBarId()));
                    RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.AII_Banner_Room);
                }
            } else if (data.getExType() == 0 || data.getJumpType() == 0) {
                String url = data.getUrl();
                if (!(url == null || url.length() == 0)) {
                    if (data.getType() == 2) {
                        ((AdVM) o00o1.f48073OooO0o.getValue()).advertUserLogInsClick(OooO.OooO0o(data.getId()));
                        o0O00000.OooO0OO("Banner_ad");
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
                        webPageInfo.OooO0Oo(data.getUrl());
                        webPageInfo.f21220OoooO0 = true;
                        WebActivity.f22108OoooooO.OooO00o(o00o1.f48070OooO0O0, webPageInfo);
                    } else {
                        o0O00000.OooO0o0("Room_banner", data.getTitle());
                        WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.RoomMainBanner);
                        webPageInfo2.OooO0Oo(data.getUrl());
                        webPageInfo2.OooO0OO(data.getTitle());
                        webPageInfo2.OooO0O0(WebPageInfo.ShareType.INSTANCE.OooO00o(data.getIsShare()), data.getImageUrl(), "");
                        webPageInfo2.OooO00o("barId", data.getId());
                        OooOo.OooO0OO("101010", MapsKt.mapOf(new Pair("url", data.getUrl())));
                        WebActivity.f22108OoooooO.OooO00o(o00o1.f48070OooO0O0, webPageInfo2);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
