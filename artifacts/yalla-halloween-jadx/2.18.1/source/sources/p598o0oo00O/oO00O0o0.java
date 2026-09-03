package p598o0oo00O;

import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00O0o0 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<StoreRoomChatBubbleModel> f47802Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o0(OooO0OO<StoreRoomChatBubbleModel> oooO0OO) {
        super(1);
        this.f47802Oooo0o = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        StoreRoomChatBubbleModel storeRoomChatBubbleModelOooO0O0 = this.f47802Oooo0o.OooO0O0(num.intValue());
        Intrinsics.checkNotNull(storeRoomChatBubbleModelOooO0O0);
        return Integer.valueOf(storeRoomChatBubbleModelOooO0O0.getShopId());
    }
}
