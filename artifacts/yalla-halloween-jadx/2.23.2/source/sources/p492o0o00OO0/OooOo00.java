package p492o0o00OO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p022Oooo00O.o0O00oO0;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0OoO00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAddTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$initView$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,556:1\n72#2,6:557\n78#2:591\n82#2:603\n78#3,11:563\n91#3:602\n456#4,8:574\n464#4,3:588\n36#4:592\n467#4,3:599\n4144#5,6:582\n1097#6,6:593\n*S KotlinDebug\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$initView$1\n*L\n158#1:557,6\n158#1:591\n158#1:603\n158#1:563,11\n158#1:602\n158#1:574,8\n158#1:588,3\n164#1:592\n158#1:599,3\n158#1:582,6\n164#1:593,6\n*E\n"})
public final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f49098OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(AddTopicListActivity addTopicListActivity) {
        super(2);
        this.f49098OooO0Oo = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548062655, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.AddTopicListActivity.initView.<anonymous> (AddTopicListActivity.kt:157)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.Add_a_topic, composer2, 0), 0.0f, 0L, Integer.valueOf(o0Oo0oo.icv_close), null, null, null, null, null, composer2, 0, YallaTeamMessage.JumpId.RoomList_Recommended);
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, LocalSoftwareKeyboardController.$stable);
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(current);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0O(current, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 70);
            o0OoO00O o0ooo00o2 = o0OoO00O.f51610OooO00o;
            String strStringResource = StringResources_androidKt.stringResource(o000000.Search_topics, composer2, 0);
            AddTopicListActivity addTopicListActivity = this.f49098OooO0Oo;
            o0ooo00o2.OooO00o(new OooOOO0(addTopicListActivity), new OooOOO(addTopicListActivity), new OooOOOO(addTopicListActivity), null, strStringResource, 0L, false, 0L, null, 0, null, null, null, 0L, 0L, 0, composer2, 1572864, 2097152, 65448);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
