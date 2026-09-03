package p509o0o0O0;

import android.content.Context;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p515o0o0O0O0.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f51144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51145OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f51146OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f51147OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f51148OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z, boolean z2) {
        super(0);
        this.f51144OooO0Oo = z;
        this.f51146OooO0o0 = context;
        this.f51145OooO0o = momentDetailModel;
        this.f51147OooO0oO = momentAdapterTag;
        this.f51148OooO0oo = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f51144OooO0Oo) {
            o00oO0o.OooO00o(this.f51146OooO0o0, this.f51145OooO0o, this.f51147OooO0oO, this.f51148OooO0oo, 0, false, 48);
        }
        return Unit.INSTANCE;
    }
}
