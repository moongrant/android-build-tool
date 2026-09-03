package p588o0oOooO;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
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
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.vm.account.DeleteAccountVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O00;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p261o00ooOoO.p;
import p261o00ooOoO.u;
import p484o0o000OO.OooOOOO;
import p507o0o00oOO.o0000O0;
import p571o0oOo0o.o00O0OO;
import p571o0oOo0o.oo00o;
import p584o0oOoo.o0000O;
import p584o0oOoo.o000OO00;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOOOOo0O extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOOOOo0O f47137OooO00o = new oOOOOo0O();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47139Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47140Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47139Oooo0oO = o00o0o01;
            this.f47140Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOOOOo0O.this.OooO00o(this.f47139Oooo0oO, ooo00o, this.f47140Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ AccountBindInfo f47141Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountVM f47142Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47143Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47144Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47145OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(DeleteAccountVM deleteAccountVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner, AccountBindInfo accountBindInfo, o0O00OO<Boolean> o0o00oo2) {
            super(0);
            this.f47142Oooo0o = deleteAccountVM;
            this.f47143Oooo0oO = oo0oo0oo;
            this.f47144Oooo0oo = lifecycleOwner;
            this.f47141Oooo = accountBindInfo;
            this.f47145OoooO00 = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOOOO<ApiResult<Object>> oooOOOOCheckAccountDeleteEnable = this.f47142Oooo0o.checkAccountDeleteEnable();
            oo00o.OooO0O0(oooOOOOCheckAccountDeleteEnable, this.f47143Oooo0oO);
            oooOOOOCheckAccountDeleteEnable.observe(this.f47144Oooo0oo, new OooOo(new oOOo0000(this.f47141Oooo), new oOOo0O00(this.f47145OoooO00), null, true, 4));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47147Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47148Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47147Oooo0oO = o00o0o01;
            this.f47148Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOOOOo0O.this.OooO0o0(this.f47147Oooo0oO, ooo00o, this.f47148Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47150Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47151Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47150Oooo0oO = o00o0o01;
            this.f47151Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOOOOo0O.this.OooO0o0(this.f47150Oooo0oO, ooo00o, this.f47151Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final boolean OooO0o(o0O00OO<Boolean> o0o00oo2) {
        return o0o00oo2.getValue().booleanValue();
    }

    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1786935373);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o0o01) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(this) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00O0OO.OooO00o(o000O0O0.OooO0OO(R.string.delete_account), 0L, 0, null, null, null, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 0, 0, 2046);
            OooO0o0(o00o0o01, ooo00oOooOOo, (i3 & 14) | (i3 & 112));
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00o0o01, i));
    }

    @Override // p584o0oOoo.o0000O
    @Composable
    public final long OooO0OO(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(635723096);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        long j = o0000O0.f41693OooO0OO;
        ooo00o.Oooo0o0();
        return j;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(o00O0O00 o00o0o01, oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        oOO00O composer = ooo00o.OooOOo(1492770554);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(o00o0o01) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
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
            ViewModel viewModel = ViewModelKt.viewModel(DeleteAccountVM.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            DeleteAccountVM deleteAccountVM = (DeleteAccountVM) viewModel;
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
            ViewModel viewModel2 = ViewModelKt.viewModel(oO0Oo0oo.class, current2, null, null, defaultViewModelCreationExtras2, composer, 36936, 0);
            composer.Oooo0o0();
            oO0Oo0oo oo0oo0oo = (oO0Oo0oo) viewModel2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
            Object obj = o000OO00.OooO0O0((NavBackStackEntry) composer.OooOO0o(o000OO00.f46954OooO00o), composer).get("accountInfo");
            AccountBindInfo accountBindInfo = obj instanceof AccountBindInfo ? (AccountBindInfo) obj : null;
            if (accountBindInfo == null) {
                oo0ooO oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(o00o0o01, i));
                return;
            }
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO00o = o00o0o01.OooO00o(PaddingKt.OooO0oO(oooO00o, 40, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), true);
            o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = p028Oooo0o0.oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o2, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o);
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
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            o0000oo.OooO0OO(74, null, composer, 6, 2);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(OooO0o(o0o00oo2) ? R.drawable.ic_delete_account_goodbye_warn : R.drawable.ic_delete_account_goodbye_warn_error, composer), null, SizeKt.OooOO0(oooO00o, OooO0o(o0o00oo2) ? 105 : 80), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
            float f = 32;
            o0000oo.OooO0OO(f, null, composer, 6, 2);
            p031OoooO.o000O0O0.OooO0OO(o000O0O0.OooO0OO(OooO0o(o0o00oo2) ? R.string.delete_account_request_delete_warn_1 : R.string.delete_account_request_delete_error_1), null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 0, 0, 65010);
            o0000oo.OooO0OO(f, null, composer, 6, 2);
            p031OoooO.o000O0O0.OooO0OO(o000O0O0.OooO0OO(OooO0o(o0o00oo2) ? R.string.delete_account_request_delete_warn_2 : R.string.delete_account_request_delete_error_2), null, u.OooO0O0(composer).OooO(), p617o0oo0o.o00Oo0.OooO00o(13, composer), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 0, 0, 65010);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            if (OooO0o(o0o00oo2)) {
                p.OooO0O0(o000O0O0.OooO0OO(R.string.Next), 0L, null, false, false, null, null, null, null, null, null, null, SizeKt.OooO0oO(PaddingKt.OooO0o(SizeKt.OooO0o(oooO00o), 30, 12), 37), new OooO0O0(deleteAccountVM, oo0oo0oo, lifecycleOwner, accountBindInfo, o0o00oo2), composer, 0, 384, 4094);
            }
        }
        oo0ooO oo0oooOooOo2 = composer.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0OO(o00o0o01, i));
    }
}
