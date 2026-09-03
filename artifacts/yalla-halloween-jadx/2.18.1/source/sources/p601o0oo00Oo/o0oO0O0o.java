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
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0O0o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f48230Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48231Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(int i, MomentDetailView momentDetailView) {
        super(1);
        this.f48230Oooo0o = i;
        this.f48231Oooo0oO = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        int i = this.f48230Oooo0o;
        if (i == 1) {
            String string = this.f48231Oooo0oO.getActivity().getString(R.string.user_top_pinned);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(string == null || StringsKt.isBlank(string))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
            MomentDetailView momentDetailView = this.f48231Oooo0oO;
            long j = momentDetailView.f24944OoooO00;
            MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
            LiveEventBus.get("MOMENT_TOP_OF_TOPIC").post(new OnTopPostForTopicModel(j, momentDetailModel != null ? momentDetailModel.getId() : 0L));
        } else if (i == 2) {
            String string2 = this.f48231Oooo0oO.getActivity().getString(R.string.user_top_unpinned);
            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
            if (!(string2 == null || StringsKt.isBlank(string2))) {
                o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                } else {
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                }
            }
            LiveEventBus.get("MOMENT_UN_TOP_OF_TOPIC").post(new OnTopPostForTopicModel(this.f48231Oooo0oO.f24944OoooO00, 0L));
        }
        return Unit.INSTANCE;
    }
}
