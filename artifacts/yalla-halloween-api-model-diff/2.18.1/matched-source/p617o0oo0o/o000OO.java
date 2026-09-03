package p617o0oo0o;

import com.yalla.yalla.model.GiftPropBlindSendResultModel;
import com.yalla.yalla.model.GiftPropModel;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p501o0o00o.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO extends Lambda implements Function1<List<GiftPropBlindSendResultModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f48525Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O000 f48526Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(GiftPropModel giftPropModel, o000O000 o000o001) {
        super(1);
        this.f48525Oooo0o = giftPropModel;
        this.f48526Oooo0oO = o000o001;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.GiftPropModel>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.GiftPropModel>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GiftPropBlindSendResultModel> list) {
        List<GiftPropBlindSendResultModel> result = list;
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.isEmpty()) {
            this.f48525Oooo0o.setLocalSendResultImageUrl(result.get(0).getPropImage());
        }
        o000 o000Var = (o000) this.f48526Oooo0oO.f48501OooO0o0.getValue();
        GiftPropModel giftPropModel = this.f48525Oooo0o;
        Objects.requireNonNull(o000Var);
        Intrinsics.checkNotNullParameter(giftPropModel, "giftPropModel");
        int i = o000.OooO00o.$EnumSwitchMapping$0[o000Var.f41394OooO.ordinal()];
        if (i == 3 || i == 4) {
            o000Var.f41417OooOooO.add(giftPropModel.clone());
            o000Var.OooOo0O((GiftPropModel) o000Var.f41417OooOooO.get(0));
        }
        return Unit.INSTANCE;
    }
}
