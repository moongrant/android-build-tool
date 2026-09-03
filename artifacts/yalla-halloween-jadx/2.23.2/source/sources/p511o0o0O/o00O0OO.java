package p511o0o0O;

import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function1<List<GiftPropModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51036OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(o00000OO o00000oo2) {
        super(1);
        this.f51036OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GiftPropModel> list) {
        List<GiftPropModel> data = list;
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zIsEmpty = data.isEmpty();
        o00000OO o00000oo2 = this.f51036OooO0Oo;
        if (zIsEmpty) {
            o00000oo2.OooOOo0().f44508OooO0oo.setEnabled(false);
            o00000oo2.OooOOo0().f44508OooO0oo.setClickable(false);
            o00000oo2.OooOOo0().f44519OooOo.setEnabled(false);
            o00000oo2.OooOOo0().f44519OooOo.setClickable(false);
        } else {
            o00000oo2.OooOOo0().f44508OooO0oo.setEnabled(true);
            o00000oo2.OooOOo0().f44508OooO0oo.setClickable(true);
            o00000oo2.OooOOo0().f44519OooOo.setEnabled(true);
            o00000oo2.OooOOo0().f44519OooOo.setClickable(true);
        }
        return Unit.INSTANCE;
    }
}
