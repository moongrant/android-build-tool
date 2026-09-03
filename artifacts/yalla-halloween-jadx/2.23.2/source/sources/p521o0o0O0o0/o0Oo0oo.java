package p521o0o0O0o0;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p384o0OOoo0O.o000oOoO;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Activity f52987OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52988OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Long f52989OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f52990OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Long f52991OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f52992OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52993OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Long l, MomentDetailModel momentDetailModel, boolean z) {
            super(1);
            this.f52991OooO0Oo = l;
            this.f52993OooO0o0 = momentDetailModel;
            this.f52992OooO0o = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            String strOooO0OO = o0000.OooO0OO(o000000.post_operation_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            Long l = this.f52991OooO0Oo;
            long jLongValue = l != null ? l.longValue() : 0L;
            MomentDetailModel momentDetailModel = this.f52993OooO0o0;
            LiveEventBus.get("POST_DELETE_OF_TOPIC").post(new OnTopPostForTopicModel(jLongValue, momentDetailModel != null ? momentDetailModel.getId() : 0L));
            LiveEventBus.get("MOMENT_POST_DELETE").post(momentDetailModel);
            if (this.f52992OooO0o) {
                LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD_AND_FINISH").post(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l, boolean z) {
        super(0);
        this.f52986OooO0Oo = baseMomentDetailVM;
        this.f52988OooO0o0 = momentDetailModel;
        this.f52987OooO0o = activity;
        this.f52989OooO0oO = l;
        this.f52990OooO0oo = z;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        MomentDetailModel momentDetailModel = this.f52988OooO0o0;
        LiveData<ApiResult<Object>> liveDataDelMoment = this.f52986OooO0Oo.delMoment(momentDetailModel != null ? momentDetailModel.getId() : 0L);
        ComponentCallbacks2 componentCallbacks2 = this.f52987OooO0o;
        Intrinsics.checkNotNull(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataDelMoment.observe((LifecycleOwner) componentCallbacks2, new o000oOoO(new OooO00o(this.f52989OooO0oO, momentDetailModel, this.f52990OooO0oo), null, null, false));
        return null;
    }
}
