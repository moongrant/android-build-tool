package p497o0o00OoO;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o00OO0O.OooOOO;
import o00OO0O.OooOOO0;
import o00OO0O.o00O0O;
import o00OO0O.o00Oo0;
import o00OO0O.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o0O0ooO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomGiftIconManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,270:1\n36#2:271\n456#2,8:294\n464#2,3:308\n467#2,3:313\n1097#3,6:272\n67#4,5:278\n72#4:311\n76#4:317\n78#5,11:283\n91#5:316\n4144#6,6:302\n154#7:312\n154#7:318\n154#7:319\n76#8:320\n76#8:321\n81#9:322\n*S KotlinDebug\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt\n*L\n135#1:271\n133#1:294,8\n133#1:308,3\n133#1:313,3\n135#1:272,6\n133#1:278,5\n133#1:311\n133#1:317\n133#1:283,11\n133#1:316\n133#1:302,6\n154#1:312\n174#1:318\n175#1:319\n243#1:320\n267#1:321\n141#1:322\n*E\n"})
public final class o00O0 {

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f49822OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f49822OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f49822OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f49822OooO0Oo;
        }

        public final int hashCode() {
            return this.f49822OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49822OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO00o(MixedRoomActivity mixedRoomActivity, Function0 function0, Composer composer, int i, int i2) {
        Function0 function1;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-733226042);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            function1 = function0;
        } else if ((i & 112) == 0) {
            function1 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 32 : 16) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i2 & 1) == 1 && (i3 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Function0 function2 = i4 != 0 ? null : function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-733226042, i3, -1, "com.yalla.yalla.ui.activity.room.live.bottom.GiftCompose (RoomGiftIconManager.kt:131)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            o0O0ooO o0o0ooo = o0O0ooO.f49885OooO0Oo;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o00oOoo(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, o0o0ooo, (Function0) objRememberedValue, 189);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment center = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1618028093);
            if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState((MutableLiveData) com.yalla.yalla.service.room.OooO00o.f24527OooOOo0.f48619OooO00o.getValue(), composerStartRestartGroup, 8).getValue(), Boolean.TRUE)) {
                Intrinsics.checkNotNullParameter("lottie/guide_send_gift.json", "assetName");
                OooOOO.OooO00o spec = new OooOOO.OooO00o();
                Intrinsics.checkNotNullParameter(spec, "spec");
                composerStartRestartGroup.startReplaceableGroup(1388713460);
                o0OoOo0 o0oooo1 = new o0OoOo0(null);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                boolean zChanged2 = composerStartRestartGroup.changed(spec);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new OooOOO0(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                boolean zChanged3 = composerStartRestartGroup.changed(spec) | composerStartRestartGroup.changed("__LottieInternalDefaultCacheKey__");
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(o00Oo0.OooO0OO(context, spec, "__LottieInternalDefaultCacheKey__", true));
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(spec, "__LottieInternalDefaultCacheKey__", new o00O0O(o0oooo1, context, spec, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", mutableState, null), composerStartRestartGroup, 6);
                OooOOO0 oooOOO0 = (OooOOO0) mutableState.getValue();
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                o00OO0O.OooO.OooO0O0((com.airbnb.lottie.OooOO0) oooOOO0.getValue(), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, null, null, composer2, 1572920, 0, 8124);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            o0O0ooO.OooO00o(o00oO0o.anim_room_bottom_gift, 3000L, ContentScale.INSTANCE.getCrop(), 0, null, null, null, boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(57)), companion2.getCenter()), composer2, 432, 120);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            function1 = function2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O000(mixedRoomActivity, function1, i, i2));
    }

    public static final void OooO0O0(List list, Function1 function1, Function1 function2, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-781397514);
        Function1 function3 = (i2 & 2) != 0 ? null : function1;
        Function1 function4 = (i2 & 4) != 0 ? null : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-781397514, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.UpdateNewGiftList (RoomGiftIconManager.kt:168)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(true, SemanticsModifierKt.semantics$default(o00O0O0.OooO00o(21, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(42))), false, o00O000o.f49829OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1899957042, true, new o00O00o0(list.size(), i, list, function3, function4)), composerStartRestartGroup, 200070, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo00o(i, i2, list, function3, function4));
    }

    public static final void OooO0OO(@Nullable MixedRoomActivity mixedRoomActivity) {
        o00O0O00 onLogin = new o00O0O00(mixedRoomActivity);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
