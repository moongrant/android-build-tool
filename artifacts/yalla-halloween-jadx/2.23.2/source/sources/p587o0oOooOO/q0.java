package p587o0oOooOO;

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
import o0oo0000.OooO00o;
import p429o0OoOO.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p0 f56936OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f56937OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p0 p0Var, int i) {
        super(0);
        this.f56936OooO0Oo = p0Var;
        this.f56937OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        p0 p0Var = this.f56936OooO0Oo;
        BannerAdapter bannerAdapter = p0Var.f56918OooO0OO;
        BarBannerModel.BarBannerItem data = bannerAdapter != null ? bannerAdapter.getData(this.f56937OooO0o0) : null;
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
                    MutableState mutableState = o0Oo0oo.f46817OooO00o;
                    o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.AII_Banner_Room);
                }
            } else if (data.getExType() == 0 || data.getJumpType() == 0) {
                String url = data.getUrl();
                if (!(url == null || url.length() == 0)) {
                    int type = data.getType();
                    FragmentActivity fragmentActivity = p0Var.f56916OooO00o;
                    if (type == 2) {
                        ((AdVM) p0Var.f56921OooO0o0.getValue()).advertUserLogInsClick(o0OoOo0.OooO(0L, data.getId()));
                        OooO00o.OooO0O0("102265");
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
                        webPageInfo.OooO0o0(data.getUrl());
                        webPageInfo.f32280OooO = true;
                        int i = WebActivity.f25130OooOoO0;
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
                        OooO00o.OooO0OO("101010", MapsKt.mapOf(new Pair("url", data.getUrl())));
                        int i2 = WebActivity.f25130OooOoO0;
                        WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo2);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
