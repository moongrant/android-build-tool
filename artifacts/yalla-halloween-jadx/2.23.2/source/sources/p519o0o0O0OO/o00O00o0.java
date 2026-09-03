package p519o0o0O0OO;

import android.content.Context;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f52060OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52061OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f52062OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52063OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f52064OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z, boolean z2) {
        super(0);
        this.f52060OooO0Oo = z;
        this.f52062OooO0o0 = context;
        this.f52061OooO0o = momentDetailModel;
        this.f52063OooO0oO = momentAdapterTag;
        this.f52064OooO0oo = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f52060OooO0Oo) {
            o0000oo.OooO00o(this.f52062OooO0o0, this.f52061OooO0o, this.f52063OooO0oO, this.f52064OooO0oo, 0, false, 48);
        }
        return Unit.INSTANCE;
    }
}
