package p515o0o0O0O0;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51771OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Activity f51772OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51773OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Long f51774OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f51775OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Long f51776OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51777OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51778OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Long l, MomentDetailModel momentDetailModel, boolean z) {
            super(1);
            this.f51776OooO0Oo = l;
            this.f51778OooO0o0 = momentDetailModel;
            this.f51777OooO0o = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.post_operation_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            Long l = this.f51776OooO0Oo;
            long jLongValue = l != null ? l.longValue() : 0L;
            MomentDetailModel momentDetailModel = this.f51778OooO0o0;
            LiveEventBus.get("POST_DELETE_OF_TOPIC").post(new OnTopPostForTopicModel(jLongValue, momentDetailModel != null ? momentDetailModel.getId() : 0L));
            LiveEventBus.get("MOMENT_POST_DELETE").post(momentDetailModel);
            if (this.f51777OooO0o) {
                LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD_AND_FINISH").post(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l, boolean z) {
        super(0);
        this.f51771OooO0Oo = baseMomentDetailVM;
        this.f51773OooO0o0 = momentDetailModel;
        this.f51772OooO0o = activity;
        this.f51774OooO0oO = l;
        this.f51775OooO0oo = z;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        MomentDetailModel momentDetailModel = this.f51773OooO0o0;
        LiveData<ApiResult<Object>> liveDataDelMoment = this.f51771OooO0Oo.delMoment(momentDetailModel != null ? momentDetailModel.getId() : 0L);
        ComponentCallbacks2 componentCallbacks2 = this.f51772OooO0o;
        Intrinsics.checkNotNull(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataDelMoment.observe((LifecycleOwner) componentCallbacks2, new o0000OO0(new OooO00o(this.f51774OooO0oO, momentDetailModel, this.f51775OooO0oo), null, null, false));
        return null;
    }
}
