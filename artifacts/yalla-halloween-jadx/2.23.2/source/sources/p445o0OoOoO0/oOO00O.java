package p445o0OoOoO0;

import android.app.Activity;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.compose.FlowExtKt;
import com.code.android.util.OooOO0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o00O0000;
import p475o0Ooooo0.o0O00oO0;
import p516o0o0O00o.o00O00o0;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0oO0Ooo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/AccountScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,106:1\n154#2:107\n76#3:108\n486#4,4:109\n490#4,2:117\n494#4:123\n25#5:113\n1097#6,3:114\n1100#6,3:120\n486#7:119\n81#8:124\n81#8:125\n81#8:126\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/AccountScreenKt\n*L\n57#1:107\n58#1:108\n61#1:109,4\n61#1:117,2\n61#1:123\n61#1:113\n61#1:114,3\n61#1:120,3\n61#1:119\n59#1:124\n60#1:125\n87#1:126\n*E\n"})
public final class oOO00O {
    /* JADX WARN: Code duplicated, block: B:21:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO00o(ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1585406937);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1585406937, i, -1, "com.yalla.yalla.module.account.ui.screen.AccountScreenContent (AccountScreen.kt:51)");
            }
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.Account, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, null, BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null), composerStartRestartGroup, 0, 254);
            Observable<Object> observable = LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new o0O0ooO(), composerStartRestartGroup, 72);
            OooOO0.OooO0o(Dp.m3775constructorimpl(10), null, composerStartRestartGroup, 6, 2);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) objConsume;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            MutableLiveData mutableLiveDataOooOo0 = o0O00oO0.OooOo0();
            Boolean bool = Boolean.FALSE;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(mutableLiveDataOooOo0, bool, composerStartRestartGroup, 56);
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(o0O00oO0.f47985OoooOoO, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new o00oOoo(coroutineScope, null), composerStartRestartGroup, 70);
            o0oO0Ooo.OooO00o(StringResources_androidKt.stringResource(o000000.Linked_Accounts, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1564815567, true, new o00O000(stateObserveAsState, stateCollectAsStateWithLifecycle)), false, 0.0f, null, o00O000o.f47303OooO0Oo, composerStartRestartGroup, 102236160, 384, 3774);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(p583o0oOoo00.o000000.f56634OooO00o, bool, composerStartRestartGroup, 56);
            Boolean bool2 = (Boolean) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(bool2, "AccountScreenContent$lambda$1(...)");
            if (bool2.booleanValue() || ((Boolean) o0O00oO0.f47984OoooOo0.getValue()).booleanValue()) {
                Boolean bool3 = (Boolean) stateObserveAsState2.getValue();
                Intrinsics.checkNotNullExpressionValue(bool3, "AccountScreenContent$lambda$3(...)");
                if (bool3.booleanValue()) {
                    String strStringResource = StringResources_androidKt.stringResource(o000000.account_login_protection, composerStartRestartGroup, 0);
                    float f = o00O00o0.f51373OooO00o;
                    ComposableLambda composableLambda = o00O00OO.f47306OooO00o;
                    o00O00 o00o01 = new o00O00(activity);
                    composer2 = composerStartRestartGroup;
                    o0oO0Ooo.OooO00o(strStringResource, 0L, 0.0f, null, null, false, true, null, composableLambda, false, f, null, o00o01, composer2, 102236160, 0, 2750);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O00O(columnScope, i));
    }
}
