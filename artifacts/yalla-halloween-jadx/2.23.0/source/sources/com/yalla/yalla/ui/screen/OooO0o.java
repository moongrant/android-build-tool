package com.yalla.yalla.ui.screen;

import android.content.Context;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostKt;
import androidx.navigation.compose.Oooo0;
import androidx.navigation.compose.o000oOoO;
import androidx.navigation.compose.o0OoOo0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00.o00000O;
import p018OooOoo0.OooOOO;
import p148o00Oo0o.o0ooOOo;
import p539o0o0OoOO.c2;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScreenNavigationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenNavigationActivity.kt\ncom/yalla/yalla/ui/screen/ScreenNavigationActivity$onCreate$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,137:1\n66#2,6:138\n72#2:172\n76#2:177\n78#3,11:144\n91#3:176\n456#4,8:155\n464#4,3:169\n467#4,3:173\n4144#5,6:163\n*S KotlinDebug\n*F\n+ 1 ScreenNavigationActivity.kt\ncom/yalla/yalla/ui/screen/ScreenNavigationActivity$onCreate$1$1\n*L\n67#1:138,6\n67#1:172\n67#1:177\n67#1:144,11\n67#1:176\n67#1:155,8\n67#1:169,3\n67#1:173,3\n67#1:163,6\n*E\n"})
public final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f29154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f29155OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(String str, ScreenNavigationActivity screenNavigationActivity) {
        super(2);
        this.f29154OooO0Oo = str;
        this.f29155OooO0o0 = screenNavigationActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-344805032, iIntValue, -1, "com.yalla.yalla.ui.screen.ScreenNavigationActivity.onCreate.<anonymous>.<anonymous> (ScreenNavigationActivity.kt:65)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
            String str = this.f29154OooO0Oo;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierNavigationBarsPadding);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Navigator[] navigatorArr = new Navigator[0];
            composer2.startReplaceableGroup(-312215566);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312215566, 8, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
            }
            Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            o00000O o00000o = (o00000O) RememberSaveableKt.m1322rememberSaveable(Arrays.copyOf(navigatorArr, 0), SaverKt.Saver(Oooo0.f7041OooO0Oo, new o000oOoO(context)), (String) null, (Function0) new o0OoOo0(context), composer2, 72, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            ScreenNavigationActivity screenNavigationActivity = this.f29155OooO0o0;
            EffectsKt.LaunchedEffect(o00000o, new OooO00o(screenNavigationActivity, o00000o, null), composer2, 72);
            NavHostKt.OooO0O0(o00000o, str, null, null, null, null, null, null, null, new OooO0O0(o00000o), composer2, 8, 508);
            composer2.startReplaceableGroup(-938422131);
            if (((Boolean) screenNavigationActivity.f29157OooO0o.getValue()).booleanValue()) {
                c2.f55477OooO00o.OooO0O0(composer2, 6);
            }
            o0ooOOo.OooO00o(composer2);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO0OO(screenNavigationActivity, null), composer2, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
