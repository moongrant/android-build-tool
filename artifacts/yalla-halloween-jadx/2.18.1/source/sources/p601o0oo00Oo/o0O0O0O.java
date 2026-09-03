package p601o0oo00Oo;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0O extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48179Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(MomentDetailView momentDetailView) {
        super(1);
        this.f48179Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        MomentDetailView momentDetailView = this.f48179Oooo0o;
        long j = momentDetailView.f24944OoooO00;
        MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
        LiveEventBus.get("POST_REMOVE_OF_TOPIC").post(new OnTopPostForTopicModel(j, momentDetailModel != null ? momentDetailModel.getId() : 0L));
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
        return Unit.INSTANCE;
    }
}
