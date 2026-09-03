package p530o0o0OOoO;

import android.app.Activity;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o000O00.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o0O.OooOO0;
import p377o0OOoOo.o0000OO0;
import p420o0OoO0OO.o0OO00O;
import p507o0o00ooo.v0;
import p526o0o0OOO0.oo0oOO0;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class O0OO00 {

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54458OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.report_thanks_for_report);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
            oo0oOO0.OooO0oO(ReportScreen.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public static void OooO00o(@NotNull LifecycleOwner lifecycleOwner, @NotNull o0O0OOO0 loadingViewModel, @NotNull ReportVm viewModel, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(loadingViewModel, "loadingViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        o0OO00O<ApiResult<Object>> o0oo00oReport = viewModel.report(num != null ? num.intValue() : 0, num2, viewModel.getExtendSourceId());
        v0.OooO0O0(o0oo00oReport, loadingViewModel, false, 6);
        o0oo00oReport.observe(lifecycleOwner, new o0000OO0(OooO00o.f54458OooO0Oo, null, null, false, 14));
    }
}
