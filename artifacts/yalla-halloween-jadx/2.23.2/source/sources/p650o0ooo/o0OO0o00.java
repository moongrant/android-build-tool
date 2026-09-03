package p650o0ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOo;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nIdentitySelectDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentitySelectDialogUtil.kt\ncom/yalla/yalla/ui/dialog/IdentitySelectDialogUtil$showIdentitySelectDialog$1$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n72#2,6:147\n78#2:181\n82#2:228\n78#3,11:153\n78#3,11:184\n91#3:220\n91#3:227\n456#4,8:164\n464#4,3:178\n456#4,8:195\n464#4,3:209\n467#4,3:217\n467#4,3:224\n4144#5,6:172\n4144#5,6:203\n77#6,2:182\n79#6:212\n83#6:221\n154#7:213\n154#7:214\n154#7:215\n154#7:216\n154#7:222\n154#7:223\n*S KotlinDebug\n*F\n+ 1 IdentitySelectDialogUtil.kt\ncom/yalla/yalla/ui/dialog/IdentitySelectDialogUtil$showIdentitySelectDialog$1$4\n*L\n102#1:147,6\n102#1:181\n102#1:228\n102#1:153,11\n103#1:184,11\n103#1:220\n102#1:227\n102#1:164,8\n102#1:178,3\n103#1:195,8\n103#1:209,3\n103#1:217,3\n102#1:224,3\n102#1:172,6\n103#1:203,6\n103#1:182,2\n103#1:212\n103#1:221\n111#1:213\n116#1:214\n119#1:215\n126#1:216\n131#1:222\n134#1:223\n*E\n"})
public final class o0OO0o00 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f58684OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f58685OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f58686OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f58687OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f58688OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(RoomUserInfoModel roomUserInfoModel, Ref.IntRef intRef, Ref.ObjectRef<String> objectRef, Ref.LongRef longRef, Ref.LongRef longRef2) {
        super(3);
        this.f58684OooO0Oo = roomUserInfoModel;
        this.f58686OooO0o0 = intRef;
        this.f58685OooO0o = objectRef;
        this.f58687OooO0oO = longRef;
        this.f58688OooO0oo = longRef2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        ColumnScope TextDialog = columnScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1162769802, iIntValue, -1, "com.yalla.yalla.ui.dialog.IdentitySelectDialogUtil.showIdentitySelectDialog.<anonymous>.<anonymous> (IdentitySelectDialogUtil.kt:101)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composer2.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(arrangement, centerHorizontally, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1261Text4IGK_g(o0000.OooO0OO(o000000.current_role), (Modifier) null, ColorKt.Color(1409286144), oOO0O00O.OooO0OO(16, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 384, 0, 131058);
            float f = 4;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(this.f58686OooO0o0.element, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
            String str = this.f58685OooO0o.element;
            if (str == null) {
                str = "";
            }
            TextKt.m1261Text4IGK_g(str, BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(3), 0.0f, 2, null), ColorKt.Color(this.f58688OooO0oo.element), null, 2, null), ColorKt.Color(this.f58687OooO0oO.element), oOO0O00O.OooO0OO(12, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
            o0ooOOo.OooO00o(composer2);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(15), null, composer2, 6, 2);
            composer2.startReplaceableGroup(1009619393);
            if (((Number) SnapshotStateKt.collectAsState(this.f58684OooO0Oo.getRoomMemberType(), null, composer2, 8, 1).getValue()).intValue() == 0) {
                TextKt.m1261Text4IGK_g(o0000.OooO0OO(o000000.invite_to_member), PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(25), 0.0f, 2, null), ColorKt.Color(4278228616L), oOO0O00O.OooO0OO(15, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 432, 0, 130544);
            }
            if (OooOo.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
