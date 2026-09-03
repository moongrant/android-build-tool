package p601o0oo00Oo;

import android.content.ComponentCallbacks2;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.ui.view.MomentDetailView;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0o0000.OooOo;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48066Oooo0o;

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailView f48067Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailView momentDetailView) {
            super(1);
            this.f48067Oooo0o = momentDetailView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.post_operation_success);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
            MomentDetailView momentDetailView = this.f48067Oooo0o;
            long j = momentDetailView.f24944OoooO00;
            MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
            LiveEventBus.get("POST_DELETE_OF_TOPIC").post(new OnTopPostForTopicModel(j, momentDetailModel != null ? momentDetailModel.getId() : 0L));
            LiveEventBus.get("MOMENT_POST_DELETE").post(this.f48067Oooo0o.f24941Oooo0oo);
            if (this.f48067Oooo0o.f24952Ooooo00) {
                LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD_AND_FINISH").post(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(MomentDetailView momentDetailView) {
        super(0);
        this.f48066Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        MomentVM momentVM = this.f48066Oooo0o.getMomentVM();
        MomentDetailModel momentDetailModel = this.f48066Oooo0o.f24941Oooo0oo;
        LiveData<ApiResult<Object>> liveDataDelMoment = momentVM.delMoment(momentDetailModel != null ? momentDetailModel.getId() : 0L);
        ComponentCallbacks2 activity = this.f48066Oooo0o.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataDelMoment.observe((LifecycleOwner) activity, new OooOo(new OooO00o(this.f48066Oooo0o), null, null, false));
        return null;
    }
}
