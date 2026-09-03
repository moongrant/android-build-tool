package p404o0Oo0OO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.ViewModelLazy;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;
import p587o0oOooOO.z0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nBaseFragmentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragmentActivity.kt\ncom/yalla/yalla/base/activity/BaseFragmentActivity$roomHook$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,250:1\n66#2,6:251\n72#2:285\n76#2:290\n78#3,11:257\n91#3:289\n456#4,8:268\n464#4,3:282\n467#4,3:286\n4144#5,6:276\n*S KotlinDebug\n*F\n+ 1 BaseFragmentActivity.kt\ncom/yalla/yalla/base/activity/BaseFragmentActivity$roomHook$1\n*L\n121#1:251,6\n121#1:285\n121#1:290\n121#1:257,11\n121#1:289\n121#1:268,8\n121#1:282,3\n121#1:286,3\n121#1:276,6\n*E\n"})
public final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f43657OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(BaseFragmentActivity baseFragmentActivity) {
        super(2);
        this.f43657OooO0Oo = baseFragmentActivity;
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
                ComposerKt.traceEventStart(1205661657, iIntValue, -1, "com.yalla.yalla.base.activity.BaseFragmentActivity.roomHook.<anonymous> (BaseFragmentActivity.kt:120)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-1802357810);
            BaseFragmentActivity baseFragmentActivity = this.f43657OooO0Oo;
            if (((Boolean) baseFragmentActivity.f22284OooOO0o.getValue()).booleanValue() && baseFragmentActivity.OooOOOo()) {
                z0.f57028OooO00o.OooO0O0(composer2, 6);
            }
            composer2.endReplaceableGroup();
            ViewModelLazy viewModelLazy = baseFragmentActivity.f22283OooOO0O;
            o0oOO.OooO00o(((o0oOo0O0) viewModelLazy.getValue()).f56520OooO00o, (String) ((o0oOo0O0) viewModelLazy.getValue()).f56521OooO0O0.getValue(), false, composer2, 8, 4);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
