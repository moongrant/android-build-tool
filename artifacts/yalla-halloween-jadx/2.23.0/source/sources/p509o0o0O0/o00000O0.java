package p509o0o0O0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f50458OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f50459OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f50460OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50461OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000O0(boolean z, MomentAdapterTag momentAdapterTag, Function1<? super MomentDetailModel, Unit> function1, MomentDetailModel momentDetailModel) {
        super(0);
        this.f50458OooO0Oo = z;
        this.f50460OooO0o0 = momentAdapterTag;
        this.f50459OooO0o = function1;
        this.f50461OooO0oO = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<MomentDetailModel, Unit> function1;
        o0OO000.OooO00o("103011");
        if (!this.f50458OooO0Oo && this.f50460OooO0o0 != MomentAdapterTag.MomentEditRecord && (function1 = this.f50459OooO0o) != null) {
            function1.invoke(this.f50461OooO0oO);
        }
        return Unit.INSTANCE;
    }
}
