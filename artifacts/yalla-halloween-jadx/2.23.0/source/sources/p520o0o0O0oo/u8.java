package p520o0o0O0oo;

import android.text.TextUtils;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u8 extends Lambda implements Function3<Integer, String, GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53349OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(x6 x6Var) {
        super(3);
        this.f53349OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, String str, GiftPropModel giftPropModel) {
        Integer num2 = num;
        String picUrl = str;
        GiftPropModel giftModel = giftPropModel;
        Intrinsics.checkNotNullParameter(picUrl, "picUrl");
        Intrinsics.checkNotNullParameter(giftModel, "giftModel");
        if (!TextUtils.isEmpty(picUrl)) {
            giftModel.setImageUrl(picUrl);
        }
        if (num2 != null) {
            giftModel.setPrice(num2.intValue());
        }
        GiftSendFragment giftSendFragment = this.f53349OooO0Oo.f53380OooOOO;
        if (giftSendFragment != null) {
            giftSendFragment.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
