package p454o0Ooo000;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p121o00O0Ooo.o0000;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o000OO;
import p448o0OoOoo.oo0oOO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEventComposable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventComposable.kt\ncom/yalla/yalla/module/event/ui/view/EventComposable\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,202:1\n72#2,6:203\n78#2:237\n72#2,6:286\n78#2:320\n82#2:371\n82#2:381\n72#2,6:515\n78#2:549\n82#2:556\n78#3,11:209\n78#3,11:253\n78#3,11:292\n78#3,11:330\n91#3:364\n91#3:370\n91#3:375\n91#3:380\n78#3,11:388\n78#3,11:432\n91#3:466\n91#3:471\n78#3,11:479\n91#3:513\n78#3,11:521\n91#3:555\n456#4,8:220\n464#4,3:234\n36#4:239\n456#4,8:264\n464#4,3:278\n456#4,8:303\n464#4,3:317\n456#4,8:341\n464#4,3:355\n467#4,3:361\n467#4,3:367\n467#4,3:372\n467#4,3:377\n456#4,8:399\n464#4,3:413\n456#4,8:443\n464#4,3:457\n467#4,3:463\n467#4,3:468\n456#4,8:490\n464#4,3:504\n467#4,3:510\n456#4,8:532\n464#4,3:546\n467#4,3:552\n4144#5,6:228\n4144#5,6:272\n4144#5,6:311\n4144#5,6:349\n4144#5,6:407\n4144#5,6:451\n4144#5,6:498\n4144#5,6:540\n154#6:238\n154#6:246\n154#6:282\n154#6:283\n154#6:284\n154#6:285\n154#6:321\n154#6:322\n154#6:359\n154#6:360\n154#6:366\n154#6:417\n154#6:418\n154#6:419\n154#6:420\n154#6:421\n154#6:422\n154#6:423\n154#6:424\n154#6:425\n154#6:461\n154#6:462\n154#6:508\n154#6:509\n154#6:550\n154#6:551\n164#6:557\n1097#7,6:240\n73#8,6:247\n79#8:281\n72#8,7:323\n79#8:358\n83#8:365\n83#8:376\n73#8,6:426\n79#8:460\n83#8:467\n73#8,6:473\n79#8:507\n83#8:514\n66#9,6:382\n72#9:416\n76#9:472\n*S KotlinDebug\n*F\n+ 1 EventComposable.kt\ncom/yalla/yalla/module/event/ui/view/EventComposable\n*L\n36#1:203,6\n36#1:237\n53#1:286,6\n53#1:320\n53#1:371\n36#1:381\n180#1:515,6\n180#1:549\n180#1:556\n36#1:209,11\n42#1:253,11\n53#1:292,11\n70#1:330,11\n70#1:364\n53#1:370\n42#1:375\n36#1:380\n93#1:388,11\n133#1:432,11\n133#1:466\n93#1:471\n157#1:479,11\n157#1:513\n180#1:521,11\n180#1:555\n36#1:220,8\n36#1:234,3\n45#1:239\n42#1:264,8\n42#1:278,3\n53#1:303,8\n53#1:317,3\n70#1:341,8\n70#1:355,3\n70#1:361,3\n53#1:367,3\n42#1:372,3\n36#1:377,3\n93#1:399,8\n93#1:413,3\n133#1:443,8\n133#1:457,3\n133#1:463,3\n93#1:468,3\n157#1:490,8\n157#1:504,3\n157#1:510,3\n180#1:532,8\n180#1:546,3\n180#1:552,3\n36#1:228,6\n42#1:272,6\n53#1:311,6\n70#1:349,6\n93#1:407,6\n133#1:451,6\n157#1:498,6\n180#1:540,6\n44#1:238\n48#1:246\n50#1:282\n51#1:283\n52#1:284\n56#1:285\n58#1:321\n60#1:322\n73#1:359\n75#1:360\n84#1:366\n98#1:417\n99#1:418\n100#1:419\n111#1:420\n113#1:421\n118#1:422\n120#1:423\n129#1:424\n137#1:425\n142#1:461\n144#1:462\n164#1:508\n166#1:509\n183#1:550\n187#1:551\n198#1:557\n45#1:240,6\n42#1:247,6\n42#1:281\n70#1:323,7\n70#1:358\n70#1:365\n42#1:376\n133#1:426,6\n133#1:460\n133#1:467\n157#1:473,6\n157#1:507\n157#1:514\n93#1:382,6\n93#1:416\n93#1:472\n*E\n"})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOOO f47605OooO00o = new OooOOOO();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f47607OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f47608OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f47609OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f47610OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(EventModel eventModel, Modifier modifier, int i, int i2) {
            super(2);
            this.f47608OooO0o0 = eventModel;
            this.f47607OooO0o = modifier;
            this.f47609OooO0oO = i;
            this.f47610OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0OO(this.f47608OooO0o0, this.f47607OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47609OooO0oO | 1), this.f47610OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47611OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f47613OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f47614OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f47615OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f47616OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventModel eventModel, long j, int i, int i2) {
            super(2);
            this.f47614OooO0o0 = eventModel;
            this.f47613OooO0o = j;
            this.f47615OooO0oO = i;
            this.f47616OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO00o(this.f47614OooO0o0, this.f47613OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47615OooO0oO | 1), this.f47616OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f47618OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f47619OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f47620OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f47621OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(EventModel eventModel, Modifier modifier, int i, int i2) {
            super(2);
            this.f47619OooO0o0 = eventModel;
            this.f47618OooO0o = modifier;
            this.f47620OooO0oO = i;
            this.f47621OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0O0(this.f47619OooO0o0, this.f47618OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47620OooO0oO | 1), this.f47621OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f47622OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f47624OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f47624OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47624OooO0o0 | 1);
            OooOOOO.this.OooO0Oo(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f47625OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Function0<Unit> function0) {
            super(0);
            this.f47625OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47625OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f47627OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f47628OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f47629OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventModel eventModel, Function0<Unit> function0, int i) {
            super(2);
            this.f47628OooO0o0 = eventModel;
            this.f47627OooO0o = function0;
            this.f47629OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47629OooO0oO | 1);
            EventModel eventModel = this.f47628OooO0o0;
            Function0<Unit> function0 = this.f47627OooO0o;
            OooOOOO.this.OooO0o0(eventModel, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x016d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull EventModel eventModel, long j, @Nullable Composer composer, int i, int i2) {
        int i3;
        long j2;
        int i4;
        long sp;
        long j3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1645263617);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(eventModel) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    sp = TextUnitKt.getSp(18);
                } else {
                    sp = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1645263617, i4, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventDateHeader (EventComposable.kt:177)");
                }
                if (!StringsKt.isBlank(eventModel.getDateTag())) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, OooO00o.f47611OooO0Oo, 253);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
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
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(20)), composerStartRestartGroup, 6);
                    TextKt.m1261Text4IGK_g(eventModel.getDateTag(), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, sp, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 << 6) & 7168) | 196656, 0, 131024);
                    o0ooOOo.OooO00o(composerStartRestartGroup);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = sp;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j3 = j2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(eventModel, j3, i, i2));
        }
        i3 |= 48;
        j2 = j;
        i4 = i3;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                sp = TextUnitKt.getSp(18);
            } else {
                sp = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645263617, i4, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventDateHeader (EventComposable.kt:177)");
            }
            if (!StringsKt.isBlank(eventModel.getDateTag())) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierOooO0O1 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), false, false, 0L, false, null, null, null, OooO00o.f47611OooO0Oo, 253);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO0O1, composerM1320constructorimpl, currentCompositionLocalMap2);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion3, Dp.m3775constructorimpl(20)), composerStartRestartGroup, 6);
                TextKt.m1261Text4IGK_g(eventModel.getDateTag(), PaddingKt.m482paddingqDBjuR0$default(companion3, Dp.m3775constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, sp, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 << 6) & 7168) | 196656, 0, 131024);
                o0ooOOo.OooO00o(composerStartRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = sp;
        } else {
            if (i5 != 0) {
                sp = TextUnitKt.getSp(18);
            } else {
                sp = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645263617, i4, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventDateHeader (EventComposable.kt:177)");
            }
            if (!StringsKt.isBlank(eventModel.getDateTag())) {
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierOooO0O2 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), false, false, 0L, false, null, null, null, OooO00o.f47611OooO0Oo, 253);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O2 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyOooO0O2, composerM1320constructorimpl, currentCompositionLocalMap3);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion5, Dp.m3775constructorimpl(20)), composerStartRestartGroup, 6);
                TextKt.m1261Text4IGK_g(eventModel.getDateTag(), PaddingKt.m482paddingqDBjuR0$default(companion5, Dp.m3775constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, sp, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 << 6) & 7168) | 196656, 0, 131024);
                o0ooOOo.OooO00o(composerStartRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = sp;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(eventModel, j3, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(EventModel eventModel, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        boolean z;
        String strOooO0o;
        long j;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1806686250);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(eventModel) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1806686250, i3, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventItemTime (EventComposable.kt:155)");
                }
                int i5 = (i3 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                int i6 = i5 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, (i6 & 112) | (i6 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                int i7 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o((i7 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
                    z = true;
                } else {
                    z = false;
                }
                composerStartRestartGroup.startReplaceableGroup(562983121);
                if (z) {
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.ic_explore_event_live, composerStartRestartGroup, 0);
                    long j2 = o0OOo000.f48224o0000oO;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    IconKt.m1119Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(12)), j2, composerStartRestartGroup, 440, 0);
                    oo0oOO0.OooO00o(4, companion2, composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(562983544);
                if (z) {
                    strOooO0o = StringResources_androidKt.stringResource(o000000.Event_Live_Now, composerStartRestartGroup, 0);
                } else {
                    strOooO0o = o0O0O0o0.OooO0o(eventModel.getEventStartTime());
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(562983699);
                if (z) {
                    j = o0OOo000.f48224o0000oO;
                } else {
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(strOooO0o, (Modifier) null, j, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(eventModel, modifier2, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1806686250, i3, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventItemTime (EventComposable.kt:155)");
            }
            int i8 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            int i9 = i8 >> 3;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, (i9 & 112) | (i9 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
            int i10 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl, currentCompositionLocalMap2);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o((i10 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
                z = true;
            } else {
                z = false;
            }
            composerStartRestartGroup.startReplaceableGroup(562983121);
            if (z) {
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(o0Oo0oo.ic_explore_event_live, composerStartRestartGroup, 0);
                long j3 = o0OOo000.f48224o0000oO;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                IconKt.m1119Iconww6aTOc(painterPainterResource2, (String) null, SizeKt.m525size3ABfNKs(companion4, Dp.m3775constructorimpl(12)), j3, composerStartRestartGroup, 440, 0);
                oo0oOO0.OooO00o(4, companion4, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(562983544);
            if (z) {
                strOooO0o = StringResources_androidKt.stringResource(o000000.Event_Live_Now, composerStartRestartGroup, 0);
            } else {
                strOooO0o = o0O0O0o0.OooO0o(eventModel.getEventStartTime());
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(562983699);
            if (z) {
                j = o0OOo000.f48224o0000oO;
            } else {
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strOooO0o, (Modifier) null, j, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1806686250, i3, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventItemTime (EventComposable.kt:155)");
            }
            int i11 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            int i12 = i11 >> 3;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, (i12 & 112) | (i12 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
            int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyRowMeasurePolicy3, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o((i13 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            if (eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
                z = true;
            } else {
                z = false;
            }
            composerStartRestartGroup.startReplaceableGroup(562983121);
            if (z) {
                Painter painterPainterResource3 = PainterResources_androidKt.painterResource(o0Oo0oo.ic_explore_event_live, composerStartRestartGroup, 0);
                long j4 = o0OOo000.f48224o0000oO;
                Modifier.Companion companion6 = Modifier.INSTANCE;
                IconKt.m1119Iconww6aTOc(painterPainterResource3, (String) null, SizeKt.m525size3ABfNKs(companion6, Dp.m3775constructorimpl(12)), j4, composerStartRestartGroup, 440, 0);
                oo0oOO0.OooO00o(4, companion6, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(562983544);
            if (z) {
                strOooO0o = StringResources_androidKt.stringResource(o000000.Event_Live_Now, composerStartRestartGroup, 0);
            } else {
                strOooO0o = o0O0O0o0.OooO0o(eventModel.getEventStartTime());
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(562983699);
            if (z) {
                j = o0OOo000.f48224o0000oO;
            } else {
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strOooO0o, (Modifier) null, j, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(eventModel, modifier2, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x023f  */
    /* JADX WARN: Code duplicated, block: B:56:0x024b  */
    /* JADX WARN: Code duplicated, block: B:57:0x024f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0260  */
    /* JADX WARN: Code duplicated, block: B:62:0x026e  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(@NotNull EventModel eventModel, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1491078444);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(eventModel) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1491078444, i3, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventMainItemImageContent (EventComposable.kt:91)");
                }
                int i5 = (i3 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion = Alignment.INSTANCE;
                int i6 = i5 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, (i6 & 112) | (i6 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                int i7 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o((i7 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-552795778);
                if (eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    float f = 3;
                    float fM3775constructorimpl = Dp.m3775constructorimpl(f);
                    int i8 = o0OOo000.f48347o00OOooO;
                    BoxKt.Box(BorderKt.m182borderxT4_qwU(PaddingKt.m478padding3ABfNKs(BorderKt.m182borderxT4_qwU(modifierFillMaxSize$default, fM3775constructorimpl, o0OOo000.f48211o0000O0O, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(16))), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(2), o0OOo000.f48224o0000oO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(14))), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o0000 o0000VarOooO0OO = o000OO.OooO0OO(eventModel.getEventImage(), OooO0o.f47622OooO0Oo, composerStartRestartGroup, 48, 0);
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                float f2 = 5;
                float f3 = 12;
                ImageKt.Image(o0000VarOooO0OO, (String) null, o00O0O0.OooO00o(f3, SizeKt.fillMaxSize$default(PaddingKt.m478padding3ABfNKs(companion3, Dp.m3775constructorimpl(f2)), 0.0f, 1, null)), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m478padding3ABfNKs(companion3, Dp.m3775constructorimpl(f2)), 0.0f, 1, null), Dp.m3775constructorimpl(38)), companion.getBottomCenter());
                Brush.Companion companion4 = Brush.INSTANCE;
                int i9 = o0OOo000.f48347o00OOooO;
                BoxKt.Box(BackgroundKt.background$default(modifierAlign, Brush.Companion.m1644verticalGradient8A3gB4$default(companion4, CollectionsKt.mutableListOf(Color.m1671boximpl(o0OOo000.f48134OooO00o), Color.m1671boximpl(o0OOo000.f48160OooOoo)), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 3, null), 0.0f, 4, null), composerStartRestartGroup, 0);
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getBottomEnd()), 0.0f, 0.0f, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 3, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_event_time_remind, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion3, Dp.m3775constructorimpl(4)), composerStartRestartGroup, 6);
                TextKt.m1261Text4IGK_g(String.valueOf(eventModel.getEventNumber()), (Modifier) null, o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130546);
                if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(eventModel, modifier4, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1491078444, i3, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventMainItemImageContent (EventComposable.kt:91)");
            }
            int i10 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            int i11 = i10 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composerStartRestartGroup, (i11 & 112) | (i11 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
            int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o((i12 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-552795778);
            if (eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                float f4 = 3;
                float fM3775constructorimpl2 = Dp.m3775constructorimpl(f4);
                int i13 = o0OOo000.f48347o00OOooO;
                BoxKt.Box(BorderKt.m182borderxT4_qwU(PaddingKt.m478padding3ABfNKs(BorderKt.m182borderxT4_qwU(modifierFillMaxSize$default2, fM3775constructorimpl2, o0OOo000.f48211o0000O0O, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(16))), Dp.m3775constructorimpl(f4)), Dp.m3775constructorimpl(2), o0OOo000.f48224o0000oO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(14))), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o0000 o0000VarOooO0OO2 = o000OO.OooO0OO(eventModel.getEventImage(), OooO0o.f47622OooO0Oo, composerStartRestartGroup, 48, 0);
            ContentScale crop2 = ContentScale.INSTANCE.getCrop();
            Modifier.Companion companion7 = Modifier.INSTANCE;
            float f5 = 5;
            float f6 = 12;
            ImageKt.Image(o0000VarOooO0OO2, (String) null, o00O0O0.OooO00o(f6, SizeKt.fillMaxSize$default(PaddingKt.m478padding3ABfNKs(companion7, Dp.m3775constructorimpl(f5)), 0.0f, 1, null)), (Alignment) null, crop2, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            Modifier modifierAlign2 = boxScopeInstance2.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m478padding3ABfNKs(companion7, Dp.m3775constructorimpl(f5)), 0.0f, 1, null), Dp.m3775constructorimpl(38)), companion5.getBottomCenter());
            Brush.Companion companion8 = Brush.INSTANCE;
            int i14 = o0OOo000.f48347o00OOooO;
            BoxKt.Box(BackgroundKt.background$default(modifierAlign2, Brush.Companion.m1644verticalGradient8A3gB4$default(companion8, CollectionsKt.mutableListOf(Color.m1671boximpl(o0OOo000.f48134OooO00o), Color.m1671boximpl(o0OOo000.f48160OooOoo)), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f6), Dp.m3775constructorimpl(f6), 3, null), 0.0f, 4, null), composerStartRestartGroup, 0);
            Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
            Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance2.align(companion7, companion5.getBottomEnd()), 0.0f, 0.0f, Dp.m3775constructorimpl(f6), Dp.m3775constructorimpl(f6), 3, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap4);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_event_time_remind, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion7, Dp.m3775constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion7, Dp.m3775constructorimpl(4)), composerStartRestartGroup, 6);
            TextKt.m1261Text4IGK_g(String.valueOf(eventModel.getEventNumber()), (Modifier) null, o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130546);
            if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1491078444, i3, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventMainItemImageContent (EventComposable.kt:91)");
            }
            int i15 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion9 = Alignment.INSTANCE;
            int i16 = i15 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion9.getTopStart(), false, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
            constructor = companion10.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifier3);
            int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1320constructorimpl, currentCompositionLocalMap5);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o((i17 >> 3) & 112, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-552795778);
            if (eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                float f7 = 3;
                float fM3775constructorimpl3 = Dp.m3775constructorimpl(f7);
                int i18 = o0OOo000.f48347o00OOooO;
                BoxKt.Box(BorderKt.m182borderxT4_qwU(PaddingKt.m478padding3ABfNKs(BorderKt.m182borderxT4_qwU(modifierFillMaxSize$default3, fM3775constructorimpl3, o0OOo000.f48211o0000O0O, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(16))), Dp.m3775constructorimpl(f7)), Dp.m3775constructorimpl(2), o0OOo000.f48224o0000oO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(14))), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o0000 o0000VarOooO0OO3 = o000OO.OooO0OO(eventModel.getEventImage(), OooO0o.f47622OooO0Oo, composerStartRestartGroup, 48, 0);
            ContentScale crop3 = ContentScale.INSTANCE.getCrop();
            Modifier.Companion companion11 = Modifier.INSTANCE;
            float f8 = 5;
            float f9 = 12;
            ImageKt.Image(o0000VarOooO0OO3, (String) null, o00O0O0.OooO00o(f9, SizeKt.fillMaxSize$default(PaddingKt.m478padding3ABfNKs(companion11, Dp.m3775constructorimpl(f8)), 0.0f, 1, null)), (Alignment) null, crop3, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            Modifier modifierAlign3 = boxScopeInstance3.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m478padding3ABfNKs(companion11, Dp.m3775constructorimpl(f8)), 0.0f, 1, null), Dp.m3775constructorimpl(38)), companion9.getBottomCenter());
            Brush.Companion companion12 = Brush.INSTANCE;
            int i19 = o0OOo000.f48347o00OOooO;
            BoxKt.Box(BackgroundKt.background$default(modifierAlign3, Brush.Companion.m1644verticalGradient8A3gB4$default(companion12, CollectionsKt.mutableListOf(Color.m1671boximpl(o0OOo000.f48134OooO00o), Color.m1671boximpl(o0OOo000.f48160OooOoo)), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f9), Dp.m3775constructorimpl(f9), 3, null), 0.0f, 4, null), composerStartRestartGroup, 0);
            Alignment.Vertical centerVertically3 = companion9.getCenterVertically();
            Modifier modifierM482paddingqDBjuR0$default3 = PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance3.align(companion11, companion9.getBottomEnd()), 0.0f, 0.0f, Dp.m3775constructorimpl(f9), Dp.m3775constructorimpl(f9), 3, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion10.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion10, composerM1320constructorimpl2, measurePolicyOooO0O2, composerM1320constructorimpl2, currentCompositionLocalMap6);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_event_time_remind, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion11, Dp.m3775constructorimpl(f9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion11, Dp.m3775constructorimpl(4)), composerStartRestartGroup, 6);
            TextKt.m1261Text4IGK_g(String.valueOf(eventModel.getEventNumber()), (Modifier) null, o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130546);
            if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(eventModel, modifier4, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(566929106);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(566929106, i, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.EventSpitLine (EventComposable.kt:193)");
            }
            SpacerKt.Spacer(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl((float) 0.5d)), o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(@NotNull EventModel eventModel, @NotNull Function0<Unit> onItemClick, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1730673975);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onItemClick) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1730673975, i2, -1, "com.yalla.yalla.module.event.ui.view.EventComposable.MineEventItem (EventComposable.kt:34)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0OOo000.f48135OooO0O0, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            OooOOOO oooOOOO = f47605OooO00o;
            long sp = TextUnitKt.getSp(13);
            int i3 = EventModel.$stable;
            int i4 = i2 & 14;
            int i5 = i3 | 432 | i4;
            oooOOOO.OooO00o(eventModel, sp, composerStartRestartGroup, i5, 0);
            Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(120, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 1157296644);
            boolean zChanged = composerStartRestartGroup.changed(onItemClick);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0O(onItemClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(ClickableKt.m204clickableXHw0xAI$default(modifierOooO0O0, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, Dp.m3775constructorimpl(10), 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(companion2, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            oo0oOO0.OooO00o(7, companion, composerStartRestartGroup, 6);
            oooOOOO.OooO0OO(eventModel, SizeKt.m527sizeVpY3zN4(companion, Dp.m3775constructorimpl(170), Dp.m3775constructorimpl(100)), composerStartRestartGroup, i5, 0);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(6)), composerStartRestartGroup, 6);
            float f = 12;
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            float f2 = 5;
            androidx.compose.ui.semantics.OooO0O0.OooO0O0(f2, companion, composerStartRestartGroup, 6);
            oooOOOO.OooO0O0(eventModel, null, composerStartRestartGroup, i3 | 384 | i4, 2);
            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(8)), composerStartRestartGroup, 6);
            String eventName = eventModel.getEventName();
            long sp2 = TextUnitKt.getSp(14);
            long j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
            FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(eventName, (Modifier) null, j, sp2, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3729getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
            SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composer2, 48, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O2, composerM1320constructorimpl4, currentCompositionLocalMap4);
            if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_explore_event_room, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(4)), composer2, 6);
            TextKt.m1261Text4IGK_g(eventModel.getRoomName(), (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120818);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f2)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            oooOOOO.OooO0Oo(composer2, 6);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(eventModel, onItemClick, i));
    }
}
