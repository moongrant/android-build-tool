package p045Oooooo;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements o000Oo0.OooO0OO, BaseQuickAdapter.OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1970OooO0Oo;

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO
    public final boolean OooO00o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        GiftSendFragment this$0 = (GiftSendFragment) this.f1970OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
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

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        ((AtomicReference) this.f1970OooO0Oo).set(oooO00o);
        return "Data closed";
    }
}
