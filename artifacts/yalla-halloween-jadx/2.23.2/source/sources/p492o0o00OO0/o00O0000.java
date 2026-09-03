package p492o0o00OO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.layout.o00oO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O0.OooOo;
import p195o00o0OO0.o00000OO;
import p516o0o0O00o.o0O0oo0o;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity$initView$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,769:1\n66#2,6:770\n72#2:804\n76#2:809\n78#3,11:776\n91#3:808\n456#4,8:787\n464#4,3:801\n467#4,3:805\n4144#5,6:795\n*S KotlinDebug\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity$initView$3\n*L\n259#1:770,6\n259#1:804\n259#1:809\n259#1:776,11\n259#1:808\n259#1:787,8\n259#1:801,3\n259#1:805,3\n259#1:795,6\n*E\n"})
public final class o00O0000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49155OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(MomentDetailActivity momentDetailActivity) {
        super(2);
        this.f49155OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1333242454, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailActivity.initView.<anonymous> (MomentDetailActivity.kt:248)");
            }
            o00000OO.OooO0O0(false, composer2, 6, 0);
            WindowInsets.Companion companion = WindowInsets.INSTANCE;
            if (o00oO0o.OooO00o(companion, "<this>", composer2, -2402530)) {
                ComposerKt.traceEventStart(-2402530, 8, -1, "com.code.android.theme.util.<get-statusBarHeight> (SystemUiUtil.kt:56)");
            }
            float top = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(companion, composer2, 8), composer2, 0).getTop();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            float fOooO00o = o00000OO.OooO00o(companion, composer2);
            Dp dpM3773boximpl = Dp.m3773boximpl(top);
            MomentDetailActivity momentDetailActivity = this.f49155OooO0Oo;
            EffectsKt.LaunchedEffect(dpM3773boximpl, new o000O0O0(momentDetailActivity, top, null), composer2, 64);
            EffectsKt.LaunchedEffect(Dp.m3773boximpl(fOooO00o), new o000O(momentDetailActivity, fOooO00o, null), composer2, 64);
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            o0O0oo0o.OooO00o(null, 0.0f, 0L, null, null, null, ComposableLambdaKt.composableLambda(composer2, -307978002, true, new o000OOo0(momentDetailActivity)), ComposableLambdaKt.composableLambda(composer2, 618776751, true, new o00(momentDetailActivity)), null, composer2, 14155776, 319);
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailModel momentDetailModel = (MomentDetailModel) OooOo.OooO00o(momentDetailActivity);
            composer2.startReplaceableGroup(-327862892);
            if (momentDetailModel != null) {
                o0O00O.OooO0O0(boxScopeInstance, momentDetailModel, momentDetailActivity.f25622Oooo000, momentDetailActivity.OooOooO(), (l) momentDetailActivity.f25610OooOo.getValue(), momentDetailActivity.OooOoOO(), composer2, 299078);
            }
            if (androidx.compose.animation.OooOo.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
