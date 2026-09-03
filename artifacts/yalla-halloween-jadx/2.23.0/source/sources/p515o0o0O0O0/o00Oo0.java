package p515o0o0O0O0;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f51816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Long f51817OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51818OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51819OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l) {
        super(0);
        this.f51816OooO0Oo = activity;
        this.f51818OooO0o0 = momentDetailModel;
        this.f51817OooO0o = l;
        this.f51819OooO0oO = baseMomentDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BaseMomentDetailVM baseMomentDetailVM = this.f51819OooO0oO;
        Long l = this.f51817OooO0o;
        if (l != null) {
            l.longValue();
            long jLongValue = l.longValue();
            MomentDetailModel momentDetailModel = this.f51818OooO0o0;
            LiveData<ApiResult<Object>> liveDataCircleBlackIns = baseMomentDetailVM.circleBlackIns(jLongValue, momentDetailModel != null ? momentDetailModel.getUserId() : 0L, 1);
            ComponentCallbacks2 componentCallbacks2 = this.f51816OooO0Oo;
            Intrinsics.checkNotNull(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            liveDataCircleBlackIns.observe((LifecycleOwner) componentCallbacks2, new o0000OO0(new o00Ooo(momentDetailModel), new oo000o(momentDetailModel), null, false));
        }
        return Unit.INSTANCE;
    }
}
