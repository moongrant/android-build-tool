package p497o0o00OoO;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOo;
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
import p230o00oOo0o.o000000;
import p230o00oOo0o.oo0o0Oo;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o00000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomGiftIconManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt$UpdateNewGiftList$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,270:1\n76#2,2:271\n78#2:301\n82#2:316\n78#3,11:273\n91#3:315\n456#4,8:284\n464#4,3:298\n36#4:302\n467#4,3:312\n4144#5,6:292\n1097#6,6:303\n154#7:309\n154#7:310\n154#7:311\n*S KotlinDebug\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt$UpdateNewGiftList$2\n*L\n186#1:271,2\n186#1:301\n186#1:316\n186#1:273,11\n186#1:315\n186#1:284,8\n186#1:298,3\n197#1:302\n186#1:312,3\n186#1:292,6\n197#1:303,6\n224#1:309\n230#1:310\n231#1:311\n*E\n"})
public final class o00O00o0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RoomGameConfig.NewGift> f49834OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f49835OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49836OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49837OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f49838OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(int i, int i2, List list, Function1 function1, Function1 function2) {
        super(3);
        this.f49834OooO0Oo = list;
        this.f49836OooO0o0 = i;
        this.f49835OooO0o = function1;
        this.f49837OooO0oO = i2;
        this.f49838OooO0oo = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1899957042, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.UpdateNewGiftList.<anonymous> (RoomGiftIconManager.kt:179)");
        }
        Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.ic_room_gift_bg, composer2, 0);
        Modifier.Companion companion = Modifier.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        int i = this.f49836OooO0o0;
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        List<RoomGameConfig.NewGift> list = this.f49834OooO0Oo;
        boolean z = list.size() > 0;
        composer2.startReplaceableGroup(1157296644);
        Function1<Integer, Unit> function1 = this.f49835OooO0o;
        boolean zChanged = composer2.changed(function1);
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o00O00(function1);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        Pair pairOooO00o = o00000.OooO00o(false, i, modifierFillMaxWidth$default, 1000L, z, 0.0f, (Function1) objRememberedValue, ComposableLambdaKt.composableLambda(composer2, 1470893053, true, new o00O00OO(list, this.f49837OooO0oO, this.f49838OooO0oo)), composer2, 3462, 4064);
        composer2.startReplaceableGroup(-1898185998);
        if (i > 0) {
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(3), null, composer2, 6, 2);
            o000000 o000000Var = (o000000) pairOooO00o.getFirst();
            Function1 function2 = (Function1) pairOooO00o.getSecond();
            float f = 4;
            oo0o0Oo.OooO00o(o000000Var, null, i, function2, o0OOo000.f48135OooO0O0, ColorKt.Color(1096525283327L), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, null, composer2, 14352384, 770);
        }
        if (OooOo.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
