package p440o0OoOo0o;

import android.app.Activity;
import androidx.compose.animation.OooOOOO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOO0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p147o00Oo0Oo.o000OOo;
import p402o0Oo0OOO.o00;
import p417o0OoO0.o00000O;
import p464o0Oooo.o000000O;
import p507o0o00ooo.o1;
import p507o0o00ooo.t1;
import p507o0o00ooo.v;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/AccountScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,104:1\n154#2:105\n76#3:106\n486#4,4:107\n490#4,2:115\n494#4:121\n25#5:111\n1097#6,3:112\n1100#6,3:118\n486#7:117\n81#8:122\n81#8:123\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/AccountScreenKt\n*L\n56#1:105\n57#1:106\n59#1:107,4\n59#1:115,2\n59#1:121\n59#1:111\n59#1:112,3\n59#1:118,3\n59#1:117\n58#1:122\n85#1:123\n*E\n"})
public final class o0000oo {
    /* JADX WARN: Code duplicated, block: B:21:0x015e  */
    public static final void OooO00o(ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1585406937);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1585406937, i, -1, "com.yalla.yalla.module.account.ui.screen.AccountScreenContent (AccountScreen.kt:50)");
            }
            t1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Account, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, null, BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, null, 2, null), composerStartRestartGroup, 0, 254);
            Observable<Object> observable = LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.ACCOUNT_CHANGE_PASSWORD)");
            o00000O.OooO00o(observable, o00000O0.f46118OooO0Oo, composerStartRestartGroup, 8);
            OooOO0.OooO0o(Dp.m3765constructorimpl(10), null, composerStartRestartGroup, 6, 2);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) objConsume;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            MutableLiveData mutableLiveDataOooOo0 = o000000O.OooOo0();
            Boolean bool = Boolean.FALSE;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(mutableLiveDataOooOo0, bool, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new o00000O(coroutineScope, null), composerStartRestartGroup, 70);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Linked_Accounts, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1564815567, true, new o00000OO(stateObserveAsState)), false, 0.0f, null, o0000Ooo.f46127OooO0Oo, composerStartRestartGroup, 102236160, 384, 3774);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(o00.f44461OooO00o, bool, composerStartRestartGroup, 56);
            Boolean isBindingPhone = (Boolean) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(isBindingPhone, "isBindingPhone");
            if (isBindingPhone.booleanValue() || o000000O.OooOoO0()) {
                Boolean showLoginProtection = (Boolean) stateObserveAsState2.getValue();
                Intrinsics.checkNotNullExpressionValue(showLoginProtection, "showLoginProtection");
                if (showLoginProtection.booleanValue()) {
                    String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.account_login_protection, composerStartRestartGroup, 0);
                    float f = v.f50294OooO00o;
                    ComposableLambda composableLambda = o0000O0.f46121OooO00o;
                    o0000 o0000Var = new o0000(activity);
                    composer2 = composerStartRestartGroup;
                    o1.OooO00o(strStringResource, 0L, 0.0f, null, null, false, true, null, composableLambda, false, f, null, o0000Var, composer2, 102236160, 0, 2750);
                } else {
                    composer2 = composerStartRestartGroup;
                }
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0000O00(columnScope, i));
    }
}
