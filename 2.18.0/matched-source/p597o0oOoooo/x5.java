package p597o0oOoooo;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import com.yalla.yalla.ui.vm.main.SearchVM;
import com.yalla.yalla.ui.vm.report.ReportVm;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.oo0o0Oo;
import o0O0O00.o000000;
import o0O0O00.o00Ooo;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o00OO00O;
import p028Oooo0o0.o0O000;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O0O0o0;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0OoOoOo;
import p028Oooo0o0.o0oO0Ooo;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p032OoooO0.o000O0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p169o00Ooo0.oo000o;
import p255o00ooO0O.o000O0o;
import p262o00ooOoO.s;
import p262o00ooOoO.x;
import p509o0o00oOO.o0000O0;
import p573o0oOo0o.oo00o;
import p580o0oOoOOO.oO0;
import p586o0oOoo.o0000O;
import p586o0oOoo.o000OO00;
import p606o0oo00oO.oO000OOo;
import p619o0oo0o.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class x5 extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final x5 f47606OooO00o = new x5();

    public static final class OooO extends Lambda implements Function3<Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f47607Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0O00O<String> o0o00o2) {
            super(3);
            this.f47607Oooo = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super oOO00O, ? super Integer, ? extends Unit> function2, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2;
            Function2<? super oOO00O, ? super Integer, ? extends Unit> innerTextField = function2;
            oOO00O ooo00o3 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o3.Oooo0oo(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && ooo00o3.OooOo0()) {
                ooo00o3.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
                ooo00o3.OooO0o0(-1829189714);
                if (x5.OooO(this.f47607Oooo).length() == 0) {
                    ooo00o2 = ooo00o3;
                    o000O0O0.OooO0OO(p255o00ooO0O.o000O0O0.OooO0OO(R.string.report_rule_user_enter_id_warn), null, x.OooO0O0(ooo00o3).OooOO0(), o00Oo0.OooO00o(15, ooo00o3), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 0, 0, 65522);
                } else {
                    ooo00o2 = ooo00o3;
                }
                ooo00o2.Oooo0o0();
                innerTextField.invoke(ooo00o2, Integer.valueOf(i & 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f47609OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47610OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47610OoooO00 = o00o0o01;
            this.f47609OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x5.this.OooO00o(this.f47610OoooO00, ooo00o, this.f47609OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f47612OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47613OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47613OoooO00 = o00o0o01;
            this.f47612OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x5.this.OooO00o(this.f47613OoooO00, ooo00o, this.f47612OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ ReportParam f47615OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ ReportVm f47616OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f47617OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ReportVm reportVm, ReportParam reportParam, int i) {
            super(2);
            this.f47616OoooO00 = reportVm;
            this.f47615OoooO0 = reportParam;
            this.f47617OoooO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x5.this.OooO0o0(this.f47616OoooO00, this.f47615OoooO0, ooo00o, this.f47617OoooO0O | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f47618Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0O00O<String> o0o00o2) {
            super(1);
            this.f47618Oooo = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f47618Oooo.setValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ SearchVM f47619Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f47620OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ oO000OOo f47621OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47622OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ ReportVm f47623OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(SearchVM searchVM, LifecycleOwner lifecycleOwner, oO000OOo oo000ooo, ReportVm reportVm, o0O00O<String> o0o00o2) {
            super(0);
            this.f47619Oooo = searchVM;
            this.f47622OoooO00 = lifecycleOwner;
            this.f47621OoooO0 = oo000ooo;
            this.f47623OoooO0O = reportVm;
            this.f47620OoooO = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!(x5.OooO(this.f47620OoooO).length() == 0)) {
                SearchVM searchVM = this.f47619Oooo;
                LifecycleOwner lifecycleOwner = this.f47622OoooO00;
                String strOooO = x5.OooO(this.f47620OoooO);
                oO000OOo oo000ooo = this.f47621OoooO0;
                ReportVm reportVm = this.f47623OoooO0O;
                p486o0o000OO.OooOOO<ApiResult<List<UserInfoModel>>> oooOOOSearchUser = searchVM.searchUser(strOooO, 1);
                oo00o.OooO0O0(oooOOOSearchUser, oo000ooo);
                oooOOOSearchUser.observe(lifecycleOwner, new OooOo(new y5(strOooO, reportVm), null, z5.f47641Oooo, false, 10));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f47625OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ ReportVm f47626OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ReportVm reportVm, int i) {
            super(2);
            this.f47626OoooO00 = reportVm;
            this.f47625OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x5.this.OooO0o(this.f47626OoooO00, ooo00o, this.f47625OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f47627Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ReportVm reportVm) {
            super(0);
            this.f47627Oooo = reportVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47627Oooo.setSearchUser(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f47628Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str) {
            super(2);
            this.f47628Oooo = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
                o000O0O0.OooO0OO(this.f47628Oooo, null, x.OooO0O0(ooo00o2).OooO(), o00Oo0.OooO00o(13, ooo00o2), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 0, 0, 65522);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f47629Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ ReportParam f47630OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47631OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ UserInfo f47632OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ oO000OOo f47633OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(ReportVm reportVm, UserInfo userInfo, LifecycleOwner lifecycleOwner, oO000OOo oo000ooo, ReportParam reportParam) {
            super(0);
            this.f47629Oooo = reportVm;
            this.f47632OoooO00 = userInfo;
            this.f47631OoooO0 = lifecycleOwner;
            this.f47633OoooO0O = oo000ooo;
            this.f47630OoooO = reportParam;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47629Oooo.setExtendSourceId(Long.valueOf(this.f47632OoooO00.getUserId()));
            LifecycleOwner lifecycleOwner = this.f47631OoooO0;
            oO000OOo oo000ooo = this.f47633OoooO0O;
            ReportVm reportVm = this.f47629Oooo;
            ReportParam reportParam = this.f47630OoooO;
            o0oo0000.OooO00o.OooO00o(lifecycleOwner, oo000ooo, reportVm, reportParam.f24764OoooO0O, reportParam.f24761OoooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f47635OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ ReportVm f47636OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ UserInfo f47637OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ ReportParam f47638OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(UserInfo userInfo, ReportVm reportVm, ReportParam reportParam, int i) {
            super(2);
            this.f47637OoooO00 = userInfo;
            this.f47636OoooO0 = reportVm;
            this.f47638OoooO0O = reportParam;
            this.f47635OoooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x5.this.OooO0oo(this.f47637OoooO00, this.f47636OoooO0, this.f47638OoooO0O, ooo00o, this.f47635OoooO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String OooO(o0O00O o0o00o2) {
        return (String) o0o00o2.getValue();
    }

    public static final String OooO0oO(o0O00O<String> o0o00o2) {
        return o0o00o2.getValue();
    }

    @Override // p586o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1373965750);
        if ((i & 112) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(ReportVm.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            ReportVm reportVm = (ReportVm) viewModel;
            Object obj = o000OO00.OooO0O0((NavBackStackEntry) ooo00oOooOOo.OooOO0o(o000OO00.f46970OooO00o), ooo00oOooOOo).get("report_params_data");
            ReportParam reportParam = obj instanceof ReportParam ? (ReportParam) obj : null;
            if (reportParam == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0O0(o00o0o01, i));
                return;
            }
            reportVm.setReportType(reportParam.f24760Oooo);
            reportVm.setSourceId(reportParam.f24763OoooO00);
            Pair<String, String> pairOooO00o = o0oo0000.OooO0O0.f47649OooO00o.OooO00o(reportVm.getReportType(), 2, null);
            t5.f47585OooO00o.OooO0o0(pairOooO00o.getFirst(), false, ooo00oOooOOo, 384, 2);
            o000O0O0.OooO0OO(pairOooO00o.getSecond(), PaddingKt.OooO0o(o00OOOO0.OooO00o.f4215Oooo, 15, 16), x.OooO0O0(ooo00oOooOOo).OooO(), o00Oo0.OooO00o(13, ooo00oOooOOo), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00oOooOOo, 48, 0, 65520);
            OooO0o0(reportVm, reportParam, ooo00oOooOOo, ((i2 << 3) & 896) | 72);
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO00o(o00o0o01, i));
    }

    @Override // p586o0oOoo.o0000O
    @Composable
    public final long OooO0OO(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(1164602801);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        o0000O0 o0000o1 = o0000O0.f41710OooO00o;
        long j = o0000O0.f41712OooO0OO;
        ooo00o.Oooo0o0();
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(ReportVm reportVm, oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        o00OOOO0 other;
        long jOooO;
        oOO00O composer = ooo00o.OooOOo(-1097504875);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6618OooO0Oo);
        composer.OooO0o0(1729797275);
        LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
        ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(SearchVM.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
        composer.Oooo0o0();
        SearchVM searchVM = (SearchVM) viewModel;
        composer.OooO0o0(1729797275);
        ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer, 6);
        if (current2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current2 instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "{\n        viewModelStore…ModelCreationExtras\n    }");
        } else {
            defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel2 = ViewModelKt.viewModel(oO000OOo.class, current2, null, null, defaultViewModelCreationExtras2, composer, 36936, 0);
        composer.Oooo0o0();
        oO000OOo oo000ooo = (oO000OOo) viewModel2;
        composer.OooO0o0(-492369756);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o0OOO00.OooO0Oo("");
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        o0O00O o0o00o2 = (o0O00O) objOooO0o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
        IntrinsicSize intrinsicSize = IntrinsicSize.Min;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i2 = o00OO00O.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i2 == 1) {
            other = o0OoOoOo.f2198Oooo;
            Intrinsics.checkNotNullParameter(other, "other");
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            other = o0O000O.f2136Oooo;
            Intrinsics.checkNotNullParameter(other, "other");
        }
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
        o000000 o000000VarOooO00o = o0oO0Ooo.OooO00o(p028Oooo0o0.o00O000.f2040OooO0O0, o00OO0O0.OooO00o.f4197OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(other);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        String strOooO0oO = OooO0oO(o0o00o2);
        o000O0 o000o0 = new o000O0(3, 11);
        oo0o0Oo oo0o0oo = new oo0o0Oo(x.OooO0O0(composer).OooO0o(), o00Oo0.OooO00o(15, composer), null, null, null, 0L, null, null, 0L, 262140);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6585OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6585OooO00o;
        o0O000 o0o001 = new o0O000(true);
        oooO00o.OooOOoo(o0o001);
        float f = 20;
        float f2 = 15;
        o00OOOO0 o00oooo0OooO0o = PaddingKt.OooO0o(o0o001, f2, f);
        composer.OooO0o0(1157296644);
        boolean zOooo0oo = composer.Oooo0oo(o0o00o2);
        Object objOooO0o2 = composer.OooO0o();
        if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = new OooO0o(o0o00o2);
            composer.Oooo00o(objOooO0o2);
        }
        composer.Oooo0o0();
        p032OoooO0.OooOo.OooO00o(strOooO0oO, (Function1) objOooO0o2, o00oooo0OooO0o, false, false, oo0o0oo, o000o0, null, true, 0, null, null, null, null, o00O0000.OooO00o(composer, -1195806200, new OooO(o0o00o2)), composer, 100663296, 24576, 16024);
        p512o0o00oo0.o0O00O.OooO0O0(PaddingKt.OooO0oO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, 1), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0L, composer, 6, 6);
        String strOooO0OO = p255o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm);
        composer.OooO0o0(681637355);
        if (((String) o0o00o2.getValue()).length() == 0) {
            jOooO = x.OooO0O0(composer).OooO();
        } else {
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            jOooO = o0000O0.f41729OooOo0;
        }
        composer.Oooo0o0();
        o000O0O0.OooO0OO(strOooO0OO, PaddingKt.OooO0o(o000O0o.OooO0O0(oooO00o, false, false, null, new OooOO0(searchVM, lifecycleOwner, oo000ooo, reportVm, o0o00o2), 253), f2, f), jOooO, o00Oo0.OooO00o(13, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65520);
        o0O0O0o0.OooO00o(composer);
        p031OoooO.o00Oo0.OooO00o(PaddingKt.OooO0oO(oooO00o, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), x.OooO0O0(composer).OooOO0o(), (float) 0.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, composer, 390, 8);
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0O(reportVm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(ReportVm reportVm, ReportParam reportParam, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1866801801);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        if (reportVm.getSearchUser() == null) {
            ooo00oOooOOo.OooO0o0(1177472479);
            OooO0o(reportVm, ooo00oOooOOo, ((i >> 3) & 112) | 8);
            ooo00oOooOOo.Oooo0o0();
        } else {
            ooo00oOooOOo.OooO0o0(1177472547);
            UserInfo searchUser = reportVm.getSearchUser();
            Intrinsics.checkNotNull(searchUser);
            OooO0oo(searchUser, reportVm, reportParam, ooo00oOooOOo, ((i << 3) & 7168) | 584);
            ooo00oOooOOo.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(reportVm, reportParam, i));
    }

    /* JADX WARN: Type inference failed for: r19v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(UserInfo userInfo, ReportVm reportVm, ReportParam reportParam, oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        String string;
        oOO00O composer = ooo00o.OooOOo(-588513046);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6618OooO0Oo);
        composer.OooO0o0(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(oO000OOo.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
        composer.Oooo0o0();
        oO000OOo oo000ooo = (oO000OOo) viewModel;
        composer.OooO0o0(-483455358);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
        Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2042OooO0Oo;
        o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4199OooOOO;
        o000000 o000000VarOooO00o = p028Oooo0o0.oo00o.OooO00o(oooOo00, oooO00o2, composer);
        composer.OooO0o0(-1323940314);
        p100o000oOoO.o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6371OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        p100o000oOoO.o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6375OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        p100o000oOoO.o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6379OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(oooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r6 = o000000.OooO00o.C0279OooO00o.f26600OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r6);
        ?? r5 = o000000.OooO00o.C0279OooO00o.f26598OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r5);
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26599OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r2);
        ?? r19 = o000000.OooO00o.C0279OooO00o.f26601OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r19, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
        composer.OooO0o0(693286680);
        o000000 o000000VarOooO00o2 = o0oO0Ooo.OooO00o(p028Oooo0o0.o00O000.f2040OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Ooo.OooO0O0(oooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r6, composer, oooO2, r5, composer, layoutDirection2, r2, composer, o00ooooo3, r19, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        float f = 50;
        float f2 = 15;
        float f3 = 16;
        oO0.f45799OooO00o.OooO0Oo(CloudImageUtilKt.imgSize$default(userInfo.getUserHeader(), p255o00ooO0O.o000OO00.OooO00o(f), false, 2, null), SizeKt.OooOO0(PaddingKt.OooO0oo(oooO00o, f2, f3, 8, f3), f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, composer, 196608, 28);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6585OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6585OooO00o;
        o0O000 o0o001 = new o0O000(true);
        oooO00o.OooOOoo(o0o001);
        composer.OooO0o0(-483455358);
        o000000 o000000VarOooO00o3 = p028Oooo0o0.oo00o.OooO00o(oooOo00, oooO00o2, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Ooo.OooO0O0(o0o001);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r6, composer, oooO3, r5, composer, layoutDirection3, r2, composer, o00ooooo4, r19, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o000O0O0.OooO0OO(userInfo.getUserName(), null, x.OooO0O0(composer).OooO0o(), o00Oo0.OooO00o(15, composer), null, null, null, 0L, null, null, 0L, 2, false, 1, null, null, composer, 0, 3120, 55282);
        o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, 4), composer, 6);
        if (oo000o.OooO0o0()) {
            string = userInfo.getUserIdx() + ":ID";
        } else {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("ID:");
            sbOooO0O0.append(userInfo.getUserIdx());
            string = sbOooO0O0.toString();
        }
        p100o000oOoO.o00OO0O0.OooO00o(new p100o000oOoO.o0O0OO0[]{o0o0o0o1.OooO0O0(LayoutDirection.Ltr)}, o00O0000.OooO00o(composer, 293382746, new OooOOO0(string)), composer, 56);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_delete_gray, composer), null, PaddingKt.OooO0o0(ClickableKt.OooO0Oo(SizeKt.OooOO0(oooO00o, 44), false, new OooOOO(reportVm), 7), f2), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function4 = o00oOoo.f6585OooO00o;
        Function1<o00O000o, Unit> function5 = o00oOoo.f6585OooO00o;
        o0O000 o0o002 = new o0O000(true);
        oooO00o.OooOOoo(o0o002);
        o0O0OO0.OooO00o(o0o002, composer, 0);
        s.OooO0O0(p255o00ooO0O.o000O0O0.OooO0OO(R.string.button_submit), 0L, null, false, false, null, null, null, null, null, null, null, SizeKt.OooO0oO(PaddingKt.OooO0o(SizeKt.OooO0o(oooO00o), 25, 12), 37), new OooOOOO(reportVm, userInfo, lifecycleOwner, oo000ooo, reportParam), composer, 0, 0, 4094);
        oo0ooO oo0oooOooO00o = p032OoooO0.oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooOo00(userInfo, reportVm, reportParam, i));
    }
}
