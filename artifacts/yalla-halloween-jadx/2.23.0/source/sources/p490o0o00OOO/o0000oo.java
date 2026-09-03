package p490o0o00OOO;

import OooOo.OooO0o;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p184o00o00o.OooOOOO;
import p184o00o00o.Oooo000;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.oOOO00o0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomGiftIconManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt$UpdateNewGiftList$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n76#2,2:269\n78#2:299\n82#2:314\n78#3,11:271\n91#3:313\n456#4,8:282\n464#4,3:296\n36#4:300\n467#4,3:310\n4144#5,6:290\n1097#6,6:301\n154#7:307\n154#7:308\n154#7:309\n*S KotlinDebug\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt$UpdateNewGiftList$1\n*L\n184#1:269,2\n184#1:299\n184#1:314\n184#1:271,11\n184#1:313\n184#1:282,8\n184#1:296,3\n195#1:300\n184#1:310,3\n184#1:290,6\n195#1:301,6\n222#1:307\n228#1:308\n229#1:309\n*E\n"})
public final class o0000oo extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RoomGameConfig.NewGift> f48588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f48589OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48590OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f48591OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f48592OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(int i, int i2, List list, Function1 function1, Function1 function2) {
        super(3);
        this.f48588OooO0Oo = list;
        this.f48590OooO0o0 = i;
        this.f48589OooO0o = function1;
        this.f48591OooO0oO = i2;
        this.f48592OooO0oo = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1899957042, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.UpdateNewGiftList.<anonymous> (RoomGiftIconManager.kt:176)");
        }
        Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.ic_room_gift_bg, composer2, 0);
        Modifier.Companion companion = Modifier.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        int i = this.f48590OooO0o0;
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        List<RoomGameConfig.NewGift> list = this.f48588OooO0Oo;
        boolean z = list.size() > 0;
        composer2.startReplaceableGroup(1157296644);
        Function1<Integer, Unit> function1 = this.f48589OooO0o;
        boolean zChanged = composer2.changed(function1);
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o00000OO(function1);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        Pair pairOooO00o = oOOO00o0.OooO00o(false, i, modifierFillMaxWidth$default, 1000L, z, 0.0f, (Function1) objRememberedValue, ComposableLambdaKt.composableLambda(composer2, 1470893053, true, new o0000O00(list, this.f48591OooO0oO, this.f48592OooO0oo)), composer2, 3462, 4064);
        composer2.startReplaceableGroup(-1898186072);
        if (i > 0) {
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(3), null, composer2, 6, 2);
            Oooo000 oooo000 = (Oooo000) pairOooO00o.getFirst();
            Function1 function2 = (Function1) pairOooO00o.getSecond();
            float f = 4;
            OooOOOO.OooO00o(oooo000, null, i, function2, o0oO0O0o.f46946OooO0O0, ColorKt.Color(1096525283327L), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, null, composer2, 14352384, 770);
        }
        if (OooO0o.OooO0O0(composer2)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
