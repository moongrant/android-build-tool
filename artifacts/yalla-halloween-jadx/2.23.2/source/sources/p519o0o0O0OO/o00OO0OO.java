package p519o0o0O0OO;

import android.content.Context;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f52148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52150OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52151OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, int i) {
        super(0);
        this.f52148OooO0Oo = context;
        this.f52150OooO0o0 = momentDetailModel;
        this.f52149OooO0o = momentAdapterTag;
        this.f52151OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0000oo.OooO00o(this.f52148OooO0Oo, this.f52150OooO0o0, this.f52149OooO0o, false, this.f52151OooO0oO, false, 32);
        return Unit.INSTANCE;
    }
}
