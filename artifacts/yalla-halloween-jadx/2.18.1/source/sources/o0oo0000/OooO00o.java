package o0oo0000;

import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p484o0o000OO.OooOOOO;
import p571o0oOo0o.oo00o;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o {

    /* JADX INFO: renamed from: o0oo0000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0415OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0415OooO00o f47632Oooo0o = new C0415OooO00o();

        public C0415OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.report_thanks_for_report);
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
            o000O o000o = o000O.f46945OooO00o;
            o000O.OooO0OO(u5.f47570OooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO00o(@NotNull LifecycleOwner lifecycleOwner, @NotNull oO0Oo0oo loadingViewModel, @NotNull ReportVm viewModel, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(loadingViewModel, "loadingViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        OooOOOO<ApiResult<Object>> oooOOOOReport = viewModel.report(num != null ? num.intValue() : 0, num2, viewModel.getExtendSourceId());
        oo00o.OooO0O0(oooOOOOReport, loadingViewModel);
        oooOOOOReport.observe(lifecycleOwner, new OooOo(C0415OooO00o.f47632Oooo0o, null, null, false, 14));
    }
}
