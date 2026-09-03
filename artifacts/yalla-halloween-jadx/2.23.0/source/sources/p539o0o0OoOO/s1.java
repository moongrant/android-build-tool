package p539o0o0OoOO;

import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.BarBannerModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.adapter.BannerAdapter;
import com.yalla.yalla.ui.vm.AdVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p427o0OoOO00.o0OOO0o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
public final class s1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ r1 f55681OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55682OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(r1 r1Var, int i) {
        super(0);
        this.f55681OooO0Oo = r1Var;
        this.f55682OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        r1 r1Var = this.f55681OooO0Oo;
        BannerAdapter bannerAdapter = r1Var.f55657OooO0OO;
        BarBannerModel.BarBannerItem data = bannerAdapter != null ? bannerAdapter.getData(this.f55682OooO0o0) : null;
        if (data != null) {
            if (1 == data.getExType() || 1 == data.getJumpType()) {
                String roomServerip = data.getRoomServerip();
                if (!(roomServerip == null || roomServerip.length() == 0)) {
                    RoomModel roomModel = new RoomModel();
                    roomModel.setName(data.getTitle());
                    roomModel.setImage(data.getImageUrl());
                    roomModel.setBaridx(data.getBarId());
                    roomModel.setRoomIp(data.getRoomServerip());
                    roomModel.websocketaddr = data.getWebsocketaddr();
                    roomModel.setId(Long.parseLong(data.getBarId()));
                    MutableState mutableState = o0OOO0o.f45698OooO00o;
                    o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.AII_Banner_Room);
                }
            } else if (data.getExType() == 0 || data.getJumpType() == 0) {
                String url = data.getUrl();
                if (!(url == null || url.length() == 0)) {
                    int type = data.getType();
                    FragmentActivity fragmentActivity = r1Var.f55655OooO00o;
                    if (type == 2) {
                        ((AdVM) r1Var.f55660OooO0o0.getValue()).advertUserLogInsClick(o0OoOo0.OooO(0L, data.getId()));
                        o0OO000.OooO00o("102265");
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
                        webPageInfo.OooO0o0(data.getUrl());
                        webPageInfo.f32816OooO = true;
                        int i = WebActivity.f25584OooOoO0;
                        WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo);
                    } else {
                        WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.RoomMainBanner);
                        webPageInfo2.OooO0o0(data.getUrl());
                        webPageInfo2.OooO0Oo(data.getTitle());
                        WebPageInfo.ShareType.Companion companion = WebPageInfo.ShareType.INSTANCE;
                        int isShare = data.getIsShare();
                        companion.getClass();
                        webPageInfo2.OooO0OO(WebPageInfo.ShareType.Companion.OooO00o(isShare), data.getImageUrl(), "");
                        webPageInfo2.OooO00o("barId", data.getId());
                        o0OO000.OooO0O0("101010", MapsKt.mapOf(new Pair("url", data.getUrl())));
                        int i2 = WebActivity.f25584OooOoO0;
                        WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo2);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
