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
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f51812OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51813OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51814OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Long f51815OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l) {
        super(0);
        this.f51812OooO0Oo = activity;
        this.f51814OooO0o0 = momentDetailModel;
        this.f51813OooO0o = baseMomentDetailVM;
        this.f51815OooO0oO = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Long l = this.f51815OooO0oO;
        if (l != null) {
            l.longValue();
            long jLongValue = l.longValue();
            MomentDetailModel momentDetailModel = this.f51814OooO0o0;
            LiveData<ApiResult<Object>> liveDataCircleDiscoveryDelete = this.f51813OooO0o.circleDiscoveryDelete(jLongValue, momentDetailModel != null ? momentDetailModel.getId() : 0L);
            ComponentCallbacks2 componentCallbacks2 = this.f51812OooO0Oo;
            Intrinsics.checkNotNull(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            liveDataCircleDiscoveryDelete.observe((LifecycleOwner) componentCallbacks2, new o0000OO0(new OooOOOO(l, momentDetailModel), null, null, false));
        }
        return Unit.INSTANCE;
    }
}
