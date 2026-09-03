package p358o0OOOooO;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.album.AlbumActivity;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OOO0o implements BaseQuickAdapter.OooO0o, BaseQuickAdapter.OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f43811OooO0Oo;

    public /* synthetic */ o0OOO0o(Object obj) {
        this.f43811OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO
    public final boolean OooO00o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        GiftSendFragment this$0 = (GiftSendFragment) this.f43811OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.gift.GiftPropModel");
        GiftPropModel giftPropModel = (GiftPropModel) obj;
        if (this$0.showIn != GiftPropTypeShow.InRoom && (giftPropModel.isAllSiteGift() || giftPropModel.getIsSoundEffect())) {
            return false;
        }
        if (this$0.pageTypeUser == GiftPropTypeUser.Hot.getValue() || this$0.pageTypeUser == GiftPropTypeUser.Flags.getValue()) {
            LiveEventBus.get("OnLongClickShowIntroducingTagGiftWindow").post(view);
        }
        return true;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        AlbumActivity this$0 = (AlbumActivity) this.f43811OooO0Oo;
        int i2 = AlbumActivity.f22491OooOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOOoo(false);
        this$0.f22499OooOO0o = i;
        this$0.OooOOo0();
        this$0.OooOOOO().smoothScrollToPosition(0);
    }
}
