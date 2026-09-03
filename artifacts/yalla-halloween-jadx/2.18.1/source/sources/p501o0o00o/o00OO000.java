package p501o0o00o;

import android.text.TextUtils;
import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.model.GiftPropModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 extends Lambda implements Function3<Integer, String, GiftPropModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41506Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(o000 o000Var) {
        super(3);
        this.f41506Oooo0o = o000Var;
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
        GiftSendFragment giftSendFragment = this.f41506Oooo0o.f41400OooOOO;
        if (giftSendFragment != null) {
            giftSendFragment.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
