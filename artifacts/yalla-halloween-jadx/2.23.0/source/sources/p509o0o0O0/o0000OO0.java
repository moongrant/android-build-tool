package p509o0o0O0;

import android.content.Context;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p515o0o0O0O0.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f50514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f50515OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50516OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f50517OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, int i) {
        super(0);
        this.f50514OooO0Oo = context;
        this.f50516OooO0o0 = momentDetailModel;
        this.f50515OooO0o = momentAdapterTag;
        this.f50517OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00oO0o.OooO00o(this.f50514OooO0Oo, this.f50516OooO0o0, this.f50515OooO0o, false, this.f50517OooO0oO, false, 32);
        return Unit.INSTANCE;
    }
}
