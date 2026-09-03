package p598o0oo00O;

import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.StoreRoomChatBubbleBuyModel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOOo extends Lambda implements Function1<StoreRoomChatBubbleBuyModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleVM f47811Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleModel f47812Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(StoreRoomChatBubbleVM storeRoomChatBubbleVM, StoreRoomChatBubbleModel storeRoomChatBubbleModel) {
        super(1);
        this.f47811Oooo0o = storeRoomChatBubbleVM;
        this.f47812Oooo0oO = storeRoomChatBubbleModel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StoreRoomChatBubbleBuyModel storeRoomChatBubbleBuyModel) {
        List<T> list = this.f47811Oooo0o.getBubblePagingSource().f48682OooO0Oo;
        StoreRoomChatBubbleModel storeRoomChatBubbleModel = this.f47812Oooo0oO;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((StoreRoomChatBubbleModel) it.next()).getShopId() == storeRoomChatBubbleModel.getShopId()) {
                break;
            }
            i++;
        }
        List<T> list2 = this.f47811Oooo0o.getBubblePagingSource().f48682OooO0Oo;
        StoreRoomChatBubbleModel storeRoomChatBubbleModel2 = (StoreRoomChatBubbleModel) this.f47811Oooo0o.getBubblePagingSource().f48682OooO0Oo.get(i);
        list2.set(i, (T) storeRoomChatBubbleModel2.copy((8126463 & 1) != 0 ? storeRoomChatBubbleModel2.attachedPicUrl : null, (8126463 & 2) != 0 ? storeRoomChatBubbleModel2.backgroundUrl : null, (8126463 & 4) != 0 ? storeRoomChatBubbleModel2.bubbleColour : null, (8126463 & 8) != 0 ? storeRoomChatBubbleModel2.canBuy : false, (8126463 & 16) != 0 ? storeRoomChatBubbleModel2.canBuyUserType : 0, (8126463 & 32) != 0 ? storeRoomChatBubbleModel2.dayNum : 0, (8126463 & 64) != 0 ? storeRoomChatBubbleModel2.exclusiveLv : 0, (8126463 & 128) != 0 ? storeRoomChatBubbleModel2.flagType : 0, (8126463 & 256) != 0 ? storeRoomChatBubbleModel2.frozenDay : 0, (8126463 & 512) != 0 ? storeRoomChatBubbleModel2.h5Url : null, (8126463 & 1024) != 0 ? storeRoomChatBubbleModel2.isHave : true, (8126463 & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? storeRoomChatBubbleModel2.limitNum : 0, (8126463 & 4096) != 0 ? storeRoomChatBubbleModel2.obtainType : 0, (8126463 & 8192) != 0 ? storeRoomChatBubbleModel2.obtainLevel : 0, (8126463 & 16384) != 0 ? storeRoomChatBubbleModel2.picUrl : null, (8126463 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? storeRoomChatBubbleModel2.price : 0, (8126463 & 65536) != 0 ? storeRoomChatBubbleModel2.promotionPrice : 0, (8126463 & 131072) != 0 ? storeRoomChatBubbleModel2.replyColour : null, (8126463 & 262144) != 0 ? storeRoomChatBubbleModel2.selected : false, (8126463 & 524288) != 0 ? storeRoomChatBubbleModel2.shopId : 0, (8126463 & 1048576) != 0 ? storeRoomChatBubbleModel2.timeLong : 0, (8126463 & 2097152) != 0 ? storeRoomChatBubbleModel2.waresName : null, (8126463 & 4194304) != 0 ? storeRoomChatBubbleModel2.bubbleText : null));
        this.f47811Oooo0o.getBubblePagingSource().OooO0O0();
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Purchase_successful);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        o000O.OooO00o(oO0Oo0oo.f47855OooO00o, null);
        return Unit.INSTANCE;
    }
}
