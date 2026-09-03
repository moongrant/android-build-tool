package p541o0o0OoOO;

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
import p483o0o000Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomScreenBottomMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenBottomMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenBottomMenuKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,117:1\n36#2:118\n36#2:125\n1097#3,6:119\n1097#3,6:126\n81#4:132\n81#4:133\n81#4:134\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenBottomMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenBottomMenuKt\n*L\n44#1:118\n59#1:125\n44#1:119,6\n59#1:126,6\n43#1:132\n47#1:133\n49#1:134\n*E\n"})
public final class ooOOO00O {
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
            o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
            if (!o0000ooVar.OooOO0()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new oO0O0O00(i));
                return;
            }
            OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24546OooOO0o, composerStartRestartGroup, 8);
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
            State stateCollectAsState = SnapshotStateKt.collectAsState(o0000ooVar.f48576OooO00o, null, composerStartRestartGroup, 8, 1);
            if (!zBooleanValue && ((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new oO0O0O0o(i));
                return;
            }
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24554OooOo, Boolean.FALSE, composerStartRestartGroup, 56);
            if (((zBooleanValue && ((Boolean) o0000ooVar.f48594OooOo0.getValue()).booleanValue()) || (!zBooleanValue && ((Boolean) o0000ooVar.f48596OooOo0O.getValue()).booleanValue())) && !((Boolean) OooO00o.f24529OooOo0.f48500OooO00o.getValue()).booleanValue() && !((Boolean) stateObserveAsState2.getValue()).booleanValue()) {
                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                PopupProperties popupProperties = new PopupProperties(false, false, false, null, false, false, 56, null);
                boolean zOooO00o = OooO0OO.OooO00o(zBooleanValue, composerStartRestartGroup, 1157296644);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new oOo0oooO(zBooleanValue);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.m4014PopupK5zGePQ(bottomCenter, 0L, (Function0) objRememberedValue2, popupProperties, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1633829858, true, new oOo0o0oO(zBooleanValue)), composerStartRestartGroup, 27654, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new ooOOO0Oo(i));
    }
}
