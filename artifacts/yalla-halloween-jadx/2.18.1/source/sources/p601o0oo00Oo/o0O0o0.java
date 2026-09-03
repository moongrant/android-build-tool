package p601o0oo00Oo;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentDetailModel;
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
public final class o0O0o0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48188Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(MomentDetailView momentDetailView) {
        super(1);
        this.f48188Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        MomentDetailModel momentDetailModel = this.f48188Oooo0o.f24941Oooo0oo;
        boolean z = true;
        if (momentDetailModel != null) {
            momentDetailModel.setIsblack(true);
        }
        String string = this.f48188Oooo0o.getActivity().getString(R.string.post_operation_success);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (string != null && !StringsKt.isBlank(string)) {
            z = false;
        }
        if (!z) {
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string, "runnable");
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
