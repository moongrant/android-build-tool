package p593o0oOooo0;

import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
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
import com.yalla.yalla.ui.vm.main.VipSettingVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0o0000.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O0O0O;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o000O0O0;
import p484o0o000OO.OooOOOO;
import p498o0o00Oo0.OooOOO;
import p571o0oOo0o.o00O0OO;
import p571o0oOo0o.oo00o;
import p584o0oOoo.o0000O;
import p584o0oOoo.o000OO00;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOoOo extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoOoOo f47469OooO00o = new o0OoOoOo();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f47470Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47471Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47472Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f47470Oooo0o = vipSettingVM;
            this.f47471Oooo0oO = oo0oo0oo;
            this.f47472Oooo0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipSettingVM vipSettingVM = this.f47470Oooo0o;
            OooOOOO<ApiResult<String>> oooOOOOChangeShowPremiumFirst = vipSettingVM.changeShowPremiumFirst(!vipSettingVM.getShowPremiumFirst());
            oo00o.OooO0O0(oooOOOOChangeShowPremiumFirst, this.f47471Oooo0oO);
            o000oOoO.OooO0Oo(oooOOOOChangeShowPremiumFirst, this.f47472Oooo0oo, o0O00O.f47452Oooo0o);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.main.VipSettingScreen$Content$1", f = "VipSettingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f47473Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Bundle f47474Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(VipSettingVM vipSettingVM, Bundle bundle, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47473Oooo0o = vipSettingVM;
            this.f47474Oooo0oO = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f47473Oooo0o, this.f47474Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f47473Oooo0o.setHideVip(this.f47474Oooo0oO.getBoolean("VIP_CHECK", false));
            this.f47473Oooo0o.setShowPremiumFirst(this.f47474Oooo0oO.getBoolean("SHOW_PREMIUM_FIRST", false));
            this.f47473Oooo0o.setInvisibleVisitor(this.f47474Oooo0oO.getBoolean("InvisibleVisitor", false));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o0O0O0O, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f47475Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47476Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47477Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f47475Oooo0o = vipSettingVM;
            this.f47476Oooo0oO = oo0oo0oo;
            this.f47477Oooo0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O0O0O o0o0o0o, oOO00O ooo00o, Integer num) {
            o0O0O0O SettingItem = o0o0o0o;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                p571o0oOo0o.oo0o0O0.OooO0O0(this.f47475Oooo0o.getHideVip(), false, new o0O000o0(this.f47475Oooo0o, this.f47476Oooo0oO, this.f47477Oooo0oo), ooo00o2, 0, 2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f47478Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47479Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47480Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f47478Oooo0o = vipSettingVM;
            this.f47479Oooo0oO = oo0oo0oo;
            this.f47480Oooo0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipSettingVM vipSettingVM = this.f47478Oooo0o;
            OooOOOO<ApiResult<String>> oooOOOOChangeVipShowState = vipSettingVM.changeVipShowState(!vipSettingVM.getHideVip());
            oo00o.OooO0O0(oooOOOOChangeVipShowState, this.f47479Oooo0oO);
            o000oOoO.OooO0Oo(oooOOOOChangeVipShowState, this.f47480Oooo0oo, o0O00.f47423Oooo0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<o0O0O0O, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f47481Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47482Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47483Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f47481Oooo0o = vipSettingVM;
            this.f47482Oooo0oO = oo0oo0oo;
            this.f47483Oooo0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O0O0O o0o0o0o, oOO00O ooo00o, Integer num) {
            o0O0O0O SettingItem = o0o0o0o;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                p571o0oOo0o.oo0o0O0.OooO0O0(this.f47481Oooo0o.getShowPremiumFirst(), false, new o0O00O0o(this.f47481Oooo0o, this.f47482Oooo0oO, this.f47483Oooo0oo), ooo00o2, 0, 2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<o0O0O0O, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f47484Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47485Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47486Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f47484Oooo0o = vipSettingVM;
            this.f47485Oooo0oO = oo0oo0oo;
            this.f47486Oooo0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O0O0O o0o0o0o, oOO00O ooo00o, Integer num) {
            o0O0O0O SettingItem = o0o0o0o;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                p571o0oOo0o.oo0o0O0.OooO0O0(this.f47484Oooo0o.getInvisibleVisitor(), false, new o0O00OOO(this.f47484Oooo0o, this.f47485Oooo0oO, this.f47486Oooo0oo), ooo00o2, 0, 2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f47487Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47488Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47489Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f47487Oooo0o = vipSettingVM;
            this.f47488Oooo0oO = oo0oo0oo;
            this.f47489Oooo0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipSettingVM vipSettingVM = this.f47487Oooo0o;
            OooOOOO<ApiResult<String>> oooOOOOChangeInvisibleVisitor = vipSettingVM.changeInvisibleVisitor(!vipSettingVM.getInvisibleVisitor());
            oo00o.OooO0O0(oooOOOOChangeInvisibleVisitor, this.f47488Oooo0oO);
            o000oOoO.OooO0Oo(oooOOOOChangeInvisibleVisitor, this.f47489Oooo0oo, o0oO0Ooo.f47493Oooo0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47491Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47492Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47491Oooo0oO = o00o0o01;
            this.f47492Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OoOoOo.this.OooO00o(this.f47491Oooo0oO, ooo00o, this.f47492Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        VipSettingVM vipSettingVM;
        LifecycleOwner lifecycleOwner;
        oO0Oo0oo oo0oo0oo;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-494723503);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00O0OO.OooO00o(o000O0O0.OooO0OO(R.string.Settings), 0L, 0, null, null, null, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 0, 0, 2046);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) ooo00oOooOOo.OooOO0o(o000OO00.f46954OooO00o);
            ooo00oOooOOo.OooO0o0(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(VipSettingVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            VipSettingVM vipSettingVM2 = (VipSettingVM) viewModel;
            Bundle bundleOooO0O0 = o000OO00.OooO0O0(navBackStackEntry, ooo00oOooOOo);
            o00Oo00.OooO0o0(bundleOooO0O0, new OooO00o(vipSettingVM2, bundleOooO0O0, null), ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(ooo00oOooOOo, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current2 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(oO0Oo0oo.class, current2, null, null, defaultViewModelCreationExtras2, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            oO0Oo0oo oo0oo0oo2 = (oO0Oo0oo) viewModel2;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            p571o0oOo0o.oo0o0O0.OooO00o(o000O0O0.OooO0OO(R.string.user_ka_vip_setting_content), 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, o000O0O0.OooO0OO(R.string.user_ka_vip_setting_bottom_tip), false, false, null, o00O0000.OooO00o(ooo00oOooOOo, -1546491735, new OooO0O0(vipSettingVM2, oo0oo0oo2, lifecycleOwner2)), false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, new OooO0OO(vipSettingVM2, oo0oo0oo2, lifecycleOwner2), ooo00oOooOOo, 100663296, 0, 3822);
            ooo00oOooOOo.OooO0o0(819380918);
            Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
            if (value != null && value.getFirst().booleanValue()) {
                lifecycleOwner = lifecycleOwner2;
                vipSettingVM = vipSettingVM2;
                oo0oo0oo = oo0oo0oo2;
                p571o0oOo0o.oo0o0O0.OooO00o(o00000.OooO0OO.OooO00o(R.string.user_ka_vip_show_aristocrat_content, ooo00oOooOOo), 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, o00000.OooO0OO.OooO00o(R.string.user_ka_vip_show_aristocrat_bottom_tip, ooo00oOooOOo), false, false, null, o00O0000.OooO00o(ooo00oOooOOo, -1869828754, new OooO0o(vipSettingVM2, oo0oo0oo2, lifecycleOwner2)), false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, new OooO(vipSettingVM2, oo0oo0oo2, lifecycleOwner2), ooo00oOooOOo, 100663296, 0, 3822);
            } else {
                vipSettingVM = vipSettingVM2;
                lifecycleOwner = lifecycleOwner2;
                oo0oo0oo = oo0oo0oo2;
            }
            ooo00oOooOOo.Oooo0o0();
            LifecycleOwner lifecycleOwner3 = lifecycleOwner;
            VipSettingVM vipSettingVM3 = vipSettingVM;
            p571o0oOo0o.oo0o0O0.OooO00o(o000O0O0.OooO0OO(R.string.Mysterious_Visitor), 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, o00000.OooO0OO.OooO00o(R.string.Mysterious_Visitor_desc, ooo00oOooOOo), false, false, null, o00O0000.OooO00o(ooo00oOooOOo, 1679803410, new OooOO0(vipSettingVM3, oo0oo0oo, lifecycleOwner3)), false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, new OooOO0O(vipSettingVM3, oo0oo0oo, lifecycleOwner3), ooo00oOooOOo, 100663296, 0, 3822);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO0(o00o0o01, i));
    }
}
