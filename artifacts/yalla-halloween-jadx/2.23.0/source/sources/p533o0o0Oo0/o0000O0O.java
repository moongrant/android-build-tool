package p533o0o0Oo0;

import androidx.compose.foundation.gestures.OooO0OO;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import p475o0o000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomScreenBottomMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenBottomMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenBottomMenuKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,117:1\n36#2:118\n36#2:125\n1097#3,6:119\n1097#3,6:126\n81#4:132\n81#4:133\n81#4:134\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenBottomMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenBottomMenuKt\n*L\n44#1:118\n59#1:125\n44#1:119,6\n59#1:126,6\n43#1:132\n47#1:133\n49#1:134\n*E\n"})
public final class o0000O0O {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO00o(Composer composer, int i) {
        Integer num;
        Composer composerStartRestartGroup = composer.startRestartGroup(274143726);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274143726, i, -1, "com.yalla.yalla.ui.screen.room.live.ApplyMicGuide (LiveRoomScreenBottomMenu.kt:40)");
            }
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            if (!o000000Var.OooOO0()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00000OO(i));
                return;
            }
            OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f25008OooOO0o, composerStartRestartGroup, 8);
            Integer num2 = (Integer) stateObserveAsState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(num2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Integer num3 = (Integer) stateObserveAsState.getValue();
                objRememberedValue = Boolean.valueOf((num3 != null && num3.intValue() == 1) || ((num = (Integer) stateObserveAsState.getValue()) != null && num.intValue() == 2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            State stateCollectAsState = SnapshotStateKt.collectAsState(o000000Var.f47371OooO00o, null, composerStartRestartGroup, 8, 1);
            if (!zBooleanValue && ((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new o0000Ooo(i));
                return;
            }
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f25016OooOo, Boolean.FALSE, composerStartRestartGroup, 56);
            if (((zBooleanValue && ((Boolean) o000000Var.f47389OooOo0.getValue()).booleanValue()) || (!zBooleanValue && ((Boolean) o000000Var.f47391OooOo0O.getValue()).booleanValue())) && !((Boolean) OooO00o.f24991OooOo0.f47431OooO00o.getValue()).booleanValue() && !((Boolean) stateObserveAsState2.getValue()).booleanValue()) {
                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                PopupProperties popupProperties = new PopupProperties(false, false, false, null, false, false, 56, null);
                boolean zOooO00o = OooO0OO.OooO00o(zBooleanValue, composerStartRestartGroup, 1157296644);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new o0000(zBooleanValue);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.m4004PopupK5zGePQ(bottomCenter, 0L, (Function0) objRememberedValue2, popupProperties, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1633829858, true, new o0000oo(zBooleanValue)), composerStartRestartGroup, 27654, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new o0000O0(i));
    }
}
