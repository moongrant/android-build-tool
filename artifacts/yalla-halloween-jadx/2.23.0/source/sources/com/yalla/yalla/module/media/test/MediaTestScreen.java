package com.yalla.yalla.module.media.test;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.OooOOO;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o0ooOOo;
import p454o0Ooo0O.Oooo000;
import p468o0OoooO0.o0OO0;
import p507o0o00ooo.t1;
import p526o0o0OOO0.o00O00O;
import p549o0oOOOoo.o0O0OOOo;
import p549o0oOOOoo.o0O0o000;
import p549o0oOOOoo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/module/media/test/MediaTestScreen;", "Lo0o0OOO0/o00O00O;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMediaTestScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaTestScreen.kt\ncom/yalla/yalla/module/media/test/MediaTestScreen\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n72#2,6:112\n78#2:146\n72#2,6:300\n78#2:334\n82#2:343\n72#2,6:344\n78#2:378\n82#2:387\n82#2:397\n78#3,11:118\n78#3,11:154\n91#3:186\n78#3,11:195\n91#3:227\n78#3,11:271\n78#3,11:306\n91#3:342\n78#3,11:350\n91#3:386\n91#3:391\n91#3:396\n456#4,8:129\n464#4,3:143\n456#4,8:165\n464#4,3:179\n467#4,3:183\n456#4,8:206\n464#4,3:220\n467#4,3:224\n25#4:229\n25#4:236\n50#4:243\n49#4:244\n25#4:251\n25#4:258\n456#4,8:282\n464#4,3:296\n456#4,8:317\n464#4,3:331\n467#4,3:339\n456#4,8:361\n464#4,3:375\n467#4,3:383\n467#4,3:388\n467#4,3:393\n4144#5,6:137\n4144#5,6:173\n4144#5,6:214\n4144#5,6:290\n4144#5,6:325\n4144#5,6:369\n72#6,7:147\n79#6:182\n83#6:187\n72#6,7:188\n79#6:223\n83#6:228\n73#6,6:265\n79#6:299\n83#6:392\n1097#7,6:230\n1097#7,6:237\n1097#7,6:245\n1097#7,6:252\n1097#7,6:259\n154#8:335\n154#8:337\n154#8:379\n154#8:381\n1855#9:336\n1856#9:338\n1855#9:380\n1856#9:382\n81#10:398\n107#10,2:399\n*S KotlinDebug\n*F\n+ 1 MediaTestScreen.kt\ncom/yalla/yalla/module/media/test/MediaTestScreen\n*L\n40#1:112,6\n40#1:146\n73#1:300,6\n73#1:334\n73#1:343\n91#1:344,6\n91#1:378\n91#1:387\n40#1:397\n40#1:118,11\n41#1:154,11\n41#1:186\n50#1:195,11\n50#1:227\n72#1:271,11\n73#1:306,11\n73#1:342\n91#1:350,11\n91#1:386\n72#1:391\n40#1:396\n40#1:129,8\n40#1:143,3\n41#1:165,8\n41#1:179,3\n41#1:183,3\n50#1:206,8\n50#1:220,3\n50#1:224,3\n59#1:229\n60#1:236\n62#1:243\n62#1:244\n68#1:251\n69#1:258\n72#1:282,8\n72#1:296,3\n73#1:317,8\n73#1:331,3\n73#1:339,3\n91#1:361,8\n91#1:375,3\n91#1:383,3\n72#1:388,3\n40#1:393,3\n40#1:137,6\n41#1:173,6\n50#1:214,6\n72#1:290,6\n73#1:325,6\n91#1:369,6\n41#1:147,7\n41#1:182\n41#1:187\n50#1:188,7\n50#1:223\n50#1:228\n72#1:265,6\n72#1:299\n72#1:392\n59#1:230,6\n60#1:237,6\n62#1:245,6\n68#1:252,6\n69#1:259,6\n74#1:335\n83#1:337\n92#1:379\n101#1:381\n75#1:336\n75#1:338\n93#1:380\n93#1:382\n69#1:398\n69#1:399,2\n*E\n"})
public final class MediaTestScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final MediaTestScreen INSTANCE = new MediaTestScreen();

    @SourceDebugExtension({"SMAP\nMediaTestScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaTestScreen.kt\ncom/yalla/yalla/module/media/test/MediaTestScreen$Content$1$4$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,111:1\n154#2:112\n*S KotlinDebug\n*F\n+ 1 MediaTestScreen.kt\ncom/yalla/yalla/module/media/test/MediaTestScreen$Content$1$4$1$1$2\n*L\n86#1:112\n*E\n"})
    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f24697OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(File file) {
            super(2);
            this.f24697OooO0Oo = file;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2091070348, iIntValue, -1, "com.yalla.yalla.module.media.test.MediaTestScreen.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaTestScreen.kt:84)");
                }
                String name = this.f24697OooO0Oo.getName();
                long j = o000OOo.OooO0OO(composer2).f37701OooO;
                Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(4));
                long sp = TextUnitKt.getSp(12);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                TextKt.m1251Text4IGK_g(name, modifierM476padding3ABfNKs, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f24698OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            o0O0o000.f55889OooO00o.setValue(Boolean.valueOf(zBooleanValue));
            Oooo000.f46496OooO0O0.OooO0O0("showDev", zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f24699OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            o0O0o000.f55890OooO0O0.setValue(Boolean.valueOf(zBooleanValue));
            Oooo000.f46496OooO0O0.OooO0O0("deleteAllCacheFile", zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.test.MediaTestScreen$Content$1$3$1", f = "MediaTestScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<File> f24700OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<File> f24701OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(SnapshotStateList<File> snapshotStateList, SnapshotStateList<File> snapshotStateList2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f24700OooO0Oo = snapshotStateList;
            this.f24701OooO0o0 = snapshotStateList2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f24700OooO0Oo, this.f24701OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Lazy lazy = o0OO0.f46906OooO00o;
            this.f24700OooO0Oo.addAll(com.code.android.util.Oooo000.OooO0OO(o0OO0.OooO0OO().getAbsolutePath()));
            this.f24701OooO0o0.addAll(com.code.android.util.Oooo000.OooO0OO(o0OO0.OooO0Oo().getAbsolutePath()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f24702OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24703OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24704OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(File file, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
            super(0);
            this.f24702OooO0Oo = file;
            this.f24704OooO0o0 = mutableState;
            this.f24703OooO0o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String absolutePath = this.f24702OooO0Oo.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "it.absolutePath");
            MediaTestScreen.Content$lambda$14$lambda$8(this.f24703OooO0o, absolutePath);
            this.f24704OooO0o0.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f24705OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24706OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24707OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(File file, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
            super(0);
            this.f24705OooO0Oo = file;
            this.f24707OooO0o0 = mutableState;
            this.f24706OooO0o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String absolutePath = this.f24705OooO0Oo.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "it.absolutePath");
            MediaTestScreen.Content$lambda$14$lambda$8(this.f24706OooO0o, absolutePath);
            this.f24707OooO0o0.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMediaTestScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaTestScreen.kt\ncom/yalla/yalla/module/media/test/MediaTestScreen$Content$1$4$2$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,111:1\n154#2:112\n*S KotlinDebug\n*F\n+ 1 MediaTestScreen.kt\ncom/yalla/yalla/module/media/test/MediaTestScreen$Content$1$4$2$1$2\n*L\n104#1:112\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f24708OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(File file) {
            super(2);
            this.f24708OooO0Oo = file;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1699648579, iIntValue, -1, "com.yalla.yalla.module.media.test.MediaTestScreen.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaTestScreen.kt:102)");
                }
                String name = this.f24708OooO0Oo.getName();
                long j = o000OOo.OooO0OO(composer2).f37701OooO;
                Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(4));
                long sp = TextUnitKt.getSp(12);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                TextKt.m1251Text4IGK_g(name, modifierM476padding3ABfNKs, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24710OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24711OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ColumnScope columnScope, int i) {
            super(2);
            this.f24711OooO0o0 = columnScope;
            this.f24710OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24710OooO0o | 1);
            MediaTestScreen.this.Content(this.f24711OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private MediaTestScreen() {
    }

    private static final String Content$lambda$14$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$14$lambda$8(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1037425548);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037425548, i, -1, "com.yalla.yalla.module.media.test.MediaTestScreen.Content (MediaTestScreen.kt:34)");
            }
            composer2 = composerStartRestartGroup;
            t1.OooO00o("Media Dev", 0.0f, 0L, null, null, null, null, o0O0OOOo.f55886OooO00o, null, composerStartRestartGroup, 12582918, 382);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composer2, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CheckboxKt.Checkbox(((Boolean) o0O0o000.f55889OooO00o.getValue()).booleanValue(), OooO00o.f24698OooO0Oo, null, false, null, null, composer2, 48, 60);
            TextKt.m1251Text4IGK_g("进入测试模式", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131070);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composer2, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            CheckboxKt.Checkbox(((Boolean) o0O0o000.f55890OooO0O0.getValue()).booleanValue(), OooO0O0.f24699OooO0Oo, null, false, null, null, composer2, 48, 60);
            TextKt.m1251Text4IGK_g("测试模式下：压缩成功后，清空所有缓存文件", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131070);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            SnapshotStateList<File> snapshotStateList = (SnapshotStateList) objRememberedValue;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf();
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            SnapshotStateList<File> snapshotStateList2 = (SnapshotStateList) objRememberedValue2;
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(snapshotStateList) | composer2.changed(snapshotStateList2);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged || objRememberedValue3 == companion4.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue3 = new OooO0OO(snapshotStateList, snapshotStateList2, null);
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                snapshotMutationPolicy = null;
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 70);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue4;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue5;
            o0OO000.OooO00o(6, composer2, mutableState, Content$lambda$14$lambda$7(mutableState2));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, snapshotMutationPolicy);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o4 = OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
            if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl5, measurePolicyOooO00o5, composerM1309constructorimpl5, currentCompositionLocalMap5);
            if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            float f = 4;
            MutableState mutableState3 = mutableState2;
            MutableState mutableState4 = mutableState;
            TextKt.m1251Text4IGK_g(android.support.v4.media.OooO00o.OooO00o("cache list count: ", snapshotStateList.size()), PaddingKt.m476padding3ABfNKs(companion, Dp.m3765constructorimpl(f)), o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
            composer2.startReplaceableGroup(-1423515683);
            for (File file : snapshotStateList) {
                MutableState mutableState5 = mutableState3;
                MutableState mutableState6 = mutableState4;
                CardKt.m999CardFjzlyU(SizeKt.fillMaxWidth$default(PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new OooO0o(file, mutableState6, mutableState5), 253), Dp.m3765constructorimpl(5)), 0.0f, 1, null), null, o000OOo.OooO0OO(composer2).f37704OooO0OO, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 2091070348, true, new OooO(file)), composer2, 1572864, 58);
                mutableState3 = mutableState5;
                mutableState4 = mutableState6;
            }
            MutableState mutableState7 = mutableState3;
            MutableState mutableState8 = mutableState4;
            o0ooOOo.OooO00o(composer2);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierOooO00o2 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion5, 1.0f, false, 2, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl6, measurePolicyOooO00o6, composerM1309constructorimpl6, currentCompositionLocalMap6);
            if (composerM1309constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash6, composerM1309constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            TextKt.m1251Text4IGK_g(android.support.v4.media.OooO00o.OooO00o("compress list count: ", snapshotStateList2.size()), PaddingKt.m476padding3ABfNKs(companion5, Dp.m3765constructorimpl(f)), o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
            composer2.startReplaceableGroup(-1423514749);
            for (File file2 : snapshotStateList2) {
                MutableState mutableState9 = mutableState7;
                MutableState mutableState10 = mutableState8;
                CardKt.m999CardFjzlyU(SizeKt.fillMaxWidth$default(PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new OooOO0(file2, mutableState10, mutableState9), 253), Dp.m3765constructorimpl(5)), 0.0f, 1, null), null, o000OOo.OooO0OO(composer2).f37704OooO0OO, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1699648579, true, new OooOO0O(file2)), composer2, 1572864, 58);
                mutableState7 = mutableState9;
                mutableState8 = mutableState10;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(columnScope, i));
    }
}
