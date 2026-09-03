package p521o0o0O0o0;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Long f52918OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52919OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f52920OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52921OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f52922OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l, Long l2) {
        super(0);
        this.f52918OooO0Oo = l;
        this.f52920OooO0o0 = activity;
        this.f52919OooO0o = momentDetailModel;
        this.f52921OooO0oO = baseMomentDetailVM;
        this.f52922OooO0oo = l2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000000O.OooO00o(this.f52920OooO0o0, this.f52919OooO0o, this.f52921OooO0oO, this.f52918OooO0Oo, this.f52922OooO0oo);
        return Unit.INSTANCE;
    }
}
