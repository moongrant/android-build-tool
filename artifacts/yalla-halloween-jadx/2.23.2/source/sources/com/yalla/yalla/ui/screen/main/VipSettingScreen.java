package com.yalla.yalla.ui.screen.main;

import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.core.view.o0;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.main.VipSettingVM;
import kotlin.Metadata;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p195o00o0OO0.o00000OO;
import p232o00oOoO0.o000;
import p232o00oOoO0.o000Oo0;
import p384o0OOoo0O.o00O0O;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p516o0o0O00o.o00O00o0;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0oO0Ooo;
import p516o0o0O00o.o0oOO;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00O;
import p562o0oOo000.o000000;
import p577o0oOoOo.o0oOo0O0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/screen/main/VipSettingScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "", "HideVip", "Ljava/lang/String;", "ShowPremiumFirst", VipSettingScreen.InvisibleVisitor, "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVipSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/VipSettingScreen\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,112:1\n36#2:113\n1097#3,6:114\n76#4:120\n76#4:143\n81#5,11:121\n81#5,11:132\n*S KotlinDebug\n*F\n+ 1 VipSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/VipSettingScreen\n*L\n45#1:113\n45#1:114,6\n48#1:120\n57#1:143\n49#1:121,11\n56#1:132,11\n*E\n"})
public final class VipSettingScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final String HideVip = "VIP_CHECK";

    @NotNull
    public static final VipSettingScreen INSTANCE = new VipSettingScreen();

    @NotNull
    public static final String InvisibleVisitor = "InvisibleVisitor";

    @NotNull
    public static final String ShowPremiumFirst = "SHOW_PREMIUM_FIRST";

    public static final class OooO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f28661OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28662OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f28663OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(VipSettingVM vipSettingVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f28661OooO0Oo = vipSettingVM;
            this.f28663OooO0o0 = o0ooo0o1;
            this.f28662OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope SettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1869828754, iIntValue, -1, "com.yalla.yalla.ui.screen.main.VipSettingScreen.Content.<anonymous> (VipSettingScreen.kt:80)");
                }
                VipSettingVM vipSettingVM = this.f28661OooO0Oo;
                o0oO0Ooo.OooO0O0(vipSettingVM.getShowPremiumFirst(), false, new com.yalla.yalla.ui.screen.main.OooOO0O(vipSettingVM, this.f28663OooO0o0, this.f28662OooO0o), composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.main.VipSettingScreen$Content$1$1", f = "VipSettingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28664OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f28664OooO0Oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f28664OooO0Oo, continuation);
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
            o0000O00.OooO0O0("darkContentEnabled = " + this.f28664OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.main.VipSettingScreen$Content$2", f = "VipSettingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f28665OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Bundle f28666OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(VipSettingVM vipSettingVM, Bundle bundle, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f28665OooO0Oo = vipSettingVM;
            this.f28666OooO0o0 = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f28665OooO0Oo, this.f28666OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Bundle bundle = this.f28666OooO0o0;
            boolean z = bundle.getBoolean(VipSettingScreen.HideVip, false);
            VipSettingVM vipSettingVM = this.f28665OooO0Oo;
            vipSettingVM.setHideVip(z);
            vipSettingVM.setShowPremiumFirst(bundle.getBoolean(VipSettingScreen.ShowPremiumFirst, false));
            vipSettingVM.setInvisibleVisitor(bundle.getBoolean(VipSettingScreen.InvisibleVisitor, false));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f28667OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28668OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f28669OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(VipSettingVM vipSettingVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f28667OooO0Oo = vipSettingVM;
            this.f28669OooO0o0 = o0ooo0o1;
            this.f28668OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope SettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1546491735, iIntValue, -1, "com.yalla.yalla.ui.screen.main.VipSettingScreen.Content.<anonymous> (VipSettingScreen.kt:62)");
                }
                VipSettingVM vipSettingVM = this.f28667OooO0Oo;
                o0oO0Ooo.OooO0O0(vipSettingVM.getHideVip(), false, new com.yalla.yalla.ui.screen.main.OooO0o(vipSettingVM, this.f28669OooO0o0, this.f28668OooO0o), composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f28670OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28671OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f28672OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VipSettingVM vipSettingVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f28670OooO0Oo = vipSettingVM;
            this.f28672OooO0o0 = o0ooo0o1;
            this.f28671OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipSettingVM vipSettingVM = this.f28670OooO0Oo;
            o00OO0O0<ApiResult<String>> o00oo0o0ChangeVipShowState = vipSettingVM.changeVipShowState(!vipSettingVM.getHideVip());
            o0oOO.OooO0O0(o00oo0o0ChangeVipShowState, this.f28672OooO0o0, false, 6);
            o00O0O.OooO0Oo(o00oo0o0ChangeVipShowState, this.f28671OooO0o, false, null, null, com.yalla.yalla.ui.screen.main.OooO.f28637OooO0Oo, 14);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f28673OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28674OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f28675OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(VipSettingVM vipSettingVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f28673OooO0Oo = vipSettingVM;
            this.f28675OooO0o0 = o0ooo0o1;
            this.f28674OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipSettingVM vipSettingVM = this.f28673OooO0Oo;
            o00OO0O0<ApiResult<String>> o00oo0o0ChangeShowPremiumFirst = vipSettingVM.changeShowPremiumFirst(!vipSettingVM.getShowPremiumFirst());
            o0oOO.OooO0O0(o00oo0o0ChangeShowPremiumFirst, this.f28675OooO0o0, false, 6);
            o00O0O.OooO0Oo(o00oo0o0ChangeShowPremiumFirst, this.f28674OooO0o, false, null, null, com.yalla.yalla.ui.screen.main.OooOOO0.f28649OooO0Oo, 14);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f28676OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28677OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f28678OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(VipSettingVM vipSettingVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f28676OooO0Oo = vipSettingVM;
            this.f28678OooO0o0 = o0ooo0o1;
            this.f28677OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope SettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1679803410, iIntValue, -1, "com.yalla.yalla.ui.screen.main.VipSettingScreen.Content.<anonymous> (VipSettingScreen.kt:98)");
                }
                VipSettingVM vipSettingVM = this.f28676OooO0Oo;
                o0oO0Ooo.OooO0O0(vipSettingVM.getInvisibleVisitor(), false, new OooOOOO(vipSettingVM, this.f28678OooO0o0, this.f28677OooO0o), composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28680OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f28681OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ColumnScope columnScope, int i) {
            super(2);
            this.f28681OooO0o0 = columnScope;
            this.f28680OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28680OooO0o | 1);
            VipSettingScreen.this.Content(this.f28681OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f28682OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28683OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f28684OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(VipSettingVM vipSettingVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f28682OooO0Oo = vipSettingVM;
            this.f28684OooO0o0 = o0ooo0o1;
            this.f28683OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipSettingVM vipSettingVM = this.f28682OooO0Oo;
            o00OO0O0<ApiResult<String>> o00oo0o0ChangeInvisibleVisitor = vipSettingVM.changeInvisibleVisitor(!vipSettingVM.getInvisibleVisitor());
            o0oOO.OooO0O0(o00oo0o0ChangeInvisibleVisitor, this.f28684OooO0o0, false, 6);
            o00O0O.OooO0Oo(o00oo0o0ChangeInvisibleVisitor, this.f28683OooO0o, false, null, null, OooOo00.f28653OooO0Oo, 14);
            return Unit.INSTANCE;
        }
    }

    private VipSettingScreen() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        VipSettingVM vipSettingVM;
        LifecycleOwner lifecycleOwner;
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-494723503);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-494723503, i, -1, "com.yalla.yalla.ui.screen.main.VipSettingScreen.Content (VipSettingScreen.kt:35)");
            }
            o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
            o000 o000VarOooO00o = o000Oo0.OooO00o(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(o0000.OooO0OO(o000000.Settings), 0.0f, o0000oo.OooO0OO(composerStartRestartGroup).f38630OooOOOO, null, null, null, null, null, BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, o0000oo.OooO0OO(composerStartRestartGroup).f38631OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            o0 o0Var = o000VarOooO00o.f39898OooO0OO;
            boolean z = o0Var != null && o0Var.f5420OooO00o.OooO0OO();
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composer2, 1157296644);
            Object objRememberedValue = composer2.rememberedValue();
            if (zOooO00o || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(z, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 64);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) composer2.consume(o00O00O.f53500OooO00o);
            composer2.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer2, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(VipSettingVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
            composer2.endReplaceableGroup();
            VipSettingVM vipSettingVM2 = (VipSettingVM) viewModel;
            Bundle bundleOooO0O0 = o00O00O.OooO0O0(navBackStackEntry, composer2);
            EffectsKt.LaunchedEffect(bundleOooO0O0, new OooO0O0(vipSettingVM2, bundleOooO0O0, null), composer2, 72);
            composer2.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer2, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0oOo0O0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
            composer2.endReplaceableGroup();
            o0oOo0O0 o0ooo0o1 = (o0oOo0O0) viewModel2;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            String strOooO0OO = o0000.OooO0OO(o000000.user_ka_vip_setting_content);
            String strOooO0OO2 = o0000.OooO0OO(o000000.user_ka_vip_setting_bottom_tip);
            float f = o00O00o0.f51373OooO00o;
            o0oO0Ooo.OooO00o(strOooO0OO, 0L, 0.0f, null, strOooO0OO2, false, false, null, ComposableLambdaKt.composableLambda(composer2, -1546491735, true, new OooO0OO(vipSettingVM2, o0ooo0o1, lifecycleOwner2)), false, f, null, new OooO0o(vipSettingVM2, o0ooo0o1, lifecycleOwner2), composer2, 100663296, 6, 2798);
            composer2.startReplaceableGroup(819381766);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
            if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
                i2 = 0;
                lifecycleOwner = lifecycleOwner2;
                vipSettingVM = vipSettingVM2;
                o0oO0Ooo.OooO00o(StringResources_androidKt.stringResource(o000000.user_ka_vip_show_aristocrat_content, composer2, 0), 0L, 0.0f, null, StringResources_androidKt.stringResource(o000000.user_ka_vip_show_aristocrat_bottom_tip, composer2, 0), false, false, null, ComposableLambdaKt.composableLambda(composer2, -1869828754, true, new OooO(vipSettingVM2, o0ooo0o1, lifecycleOwner2)), false, f, null, new OooOO0(vipSettingVM2, o0ooo0o1, lifecycleOwner2), composer2, 100663296, 6, 2798);
            } else {
                vipSettingVM = vipSettingVM2;
                lifecycleOwner = lifecycleOwner2;
                i2 = 0;
            }
            composer2.endReplaceableGroup();
            LifecycleOwner lifecycleOwner3 = lifecycleOwner;
            VipSettingVM vipSettingVM3 = vipSettingVM;
            o0oO0Ooo.OooO00o(o0000.OooO0OO(o000000.Mysterious_Visitor), 0L, 0.0f, null, StringResources_androidKt.stringResource(o000000.Mysterious_Visitor_desc, composer2, i2), false, false, null, ComposableLambdaKt.composableLambda(composer2, 1679803410, true, new OooOO0O(vipSettingVM3, o0ooo0o1, lifecycleOwner3)), false, f, null, new OooOOO0(vipSettingVM3, o0ooo0o1, lifecycleOwner3), composer2, 100663296, 6, 2798);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(columnScope, i));
    }
}
