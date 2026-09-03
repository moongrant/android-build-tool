package p538o0o0Oo0o;

import android.app.Activity;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p384o0OOoo0O.o000oOoO;
import p424o0OoO0Oo.o00OO0O0;
import p516o0o0O00o.o0oOO;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000 {

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54544OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            String strOooO0OO = o0000.OooO0OO(o000000.report_thanks_for_report);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
            o00O00.OooO0oO(ReportScreen.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public static void OooO00o(@NotNull LifecycleOwner lifecycleOwner, @NotNull o0oOo0O0 loadingViewModel, @NotNull ReportVm viewModel, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(loadingViewModel, "loadingViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        o00OO0O0<ApiResult<Object>> o00oo0o0Report = viewModel.report(num != null ? num.intValue() : 0, num2, viewModel.getExtendSourceId());
        o0oOO.OooO0O0(o00oo0o0Report, loadingViewModel, false, 6);
        o00oo0o0Report.observe(lifecycleOwner, new o000oOoO(OooO00o.f54544OooO0Oo, null, null, false, 14));
    }
}
