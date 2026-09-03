package p579o0oOoo;

import com.yalla.yalla.model.gift.GiftPropBlindSendResultModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p520o0o0O0oo.x6;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O00 extends Lambda implements Function1<List<GiftPropBlindSendResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f56564OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ x6 f56565OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00(GiftPropModel giftPropModel, x6 x6Var) {
        super(1);
        this.f56564OooO0Oo = giftPropModel;
        this.f56565OooO0o0 = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GiftPropBlindSendResultModel> list) {
        List<GiftPropBlindSendResultModel> result = list;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z = !result.isEmpty();
        GiftPropModel giftPropModel = this.f56564OooO0Oo;
        if (z) {
            giftPropModel.setLocalSendResultImageUrl(result.get(0).getPropImage());
        }
        x6 x6Var = this.f56565OooO0o0;
        x6Var.getClass();
        Intrinsics.checkNotNullParameter(giftPropModel, "giftPropModel");
        int i = x6.OooO00o.$EnumSwitchMapping$0[x6Var.f53374OooO.ordinal()];
        if (i == 3 || i == 4) {
            ArrayList arrayList = x6Var.f53398OooOooo;
            arrayList.add(giftPropModel.clone());
            x6Var.OooOo0((GiftPropModel) arrayList.get(0));
        }
        return Unit.INSTANCE;
    }
}
