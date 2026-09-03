package p590o0oOooo0;

import com.yalla.yalla.model.gift.GiftPropBlindSendResultModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Lambda implements Function1<List<GiftPropBlindSendResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f57114OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00000OO f57115OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GiftPropModel giftPropModel, o00000OO o00000oo2) {
        super(1);
        this.f57114OooO0Oo = giftPropModel;
        this.f57115OooO0o0 = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GiftPropBlindSendResultModel> list) {
        List<GiftPropBlindSendResultModel> result = list;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z = !result.isEmpty();
        GiftPropModel giftPropModel = this.f57114OooO0Oo;
        if (z) {
            giftPropModel.setLocalSendResultImageUrl(result.get(0).getPropImage());
        }
        o00000OO o00000oo2 = this.f57115OooO0o0;
        o00000oo2.getClass();
        Intrinsics.checkNotNullParameter(giftPropModel, "giftPropModel");
        int i = o00000OO.OooO00o.$EnumSwitchMapping$0[o00000oo2.f50958OooO.ordinal()];
        if (i == 3 || i == 4) {
            ArrayList arrayList = o00000oo2.f50982OooOooo;
            arrayList.add(giftPropModel.clone());
            o00000oo2.OooOo00((GiftPropModel) arrayList.get(0));
        }
        return Unit.INSTANCE;
    }
}
