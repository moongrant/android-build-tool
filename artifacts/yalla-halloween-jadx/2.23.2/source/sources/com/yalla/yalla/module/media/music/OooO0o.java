package com.yalla.yalla.module.media.music;

import android.graphics.Bitmap;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.session.o00O0O0;
import com.yalla.yalla.data.db.model.MusicTable;
import io.agora.rtc.Constants;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p208o00o0oOO.o0O000o0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o0O0O00;
import p590o0oOooo0.O0OO00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicItemContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicItemContent.kt\ncom/yalla/yalla/module/media/music/MusicItemContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,308:1\n154#2:309\n154#2:310\n154#2:311\n154#2:347\n154#2:348\n154#2:349\n154#2:350\n154#2:351\n154#2:352\n154#2:353\n154#2:421\n154#2:422\n154#2:459\n154#2:470\n154#2:506\n154#2:507\n154#2:508\n154#2:524\n154#2:525\n154#2:561\n154#2:562\n154#2:570\n154#2:571\n154#2:572\n154#2:573\n164#2:574\n164#2:575\n154#2:576\n154#2:577\n73#3,6:312\n79#3:346\n77#3,2:354\n79#3:384\n72#3,7:423\n79#3:458\n83#3:464\n73#3,6:471\n79#3:505\n83#3:513\n83#3:518\n83#3:523\n78#4,11:318\n78#4,11:356\n78#4,11:391\n78#4,11:430\n91#4:463\n91#4:468\n78#4,11:477\n91#4:512\n91#4:517\n91#4:522\n78#4,11:532\n91#4:581\n456#5,8:329\n464#5,3:343\n456#5,8:367\n464#5,3:381\n456#5,8:402\n464#5,3:416\n456#5,8:441\n464#5,3:455\n467#5,3:460\n467#5,3:465\n456#5,8:488\n464#5,3:502\n467#5,3:509\n467#5,3:514\n467#5,3:519\n456#5,8:543\n464#5,3:557\n36#5:563\n467#5,3:578\n4144#6,6:337\n4144#6,6:375\n4144#6,6:410\n4144#6,6:449\n4144#6,6:496\n4144#6,6:551\n72#7,6:385\n78#7:419\n82#7:469\n1098#8:420\n66#9,6:526\n72#9:560\n76#9:582\n1097#10,6:564\n81#11:583\n*S KotlinDebug\n*F\n+ 1 MusicItemContent.kt\ncom/yalla/yalla/module/media/music/MusicItemContentKt\n*L\n81#1:309\n82#1:310\n83#1:311\n114#1:347\n115#1:348\n123#1:349\n124#1:350\n131#1:351\n132#1:352\n140#1:353\n165#1:421\n174#1:422\n188#1:459\n197#1:470\n204#1:506\n214#1:507\n215#1:508\n232#1:524\n248#1:525\n255#1:561\n256#1:562\n262#1:570\n263#1:571\n267#1:572\n268#1:573\n273#1:574\n275#1:575\n303#1:576\n304#1:577\n77#1:312,6\n77#1:346\n138#1:354,2\n138#1:384\n178#1:423,7\n178#1:458\n178#1:464\n195#1:471,6\n195#1:505\n195#1:513\n138#1:518\n77#1:523\n77#1:318,11\n138#1:356,11\n145#1:391,11\n178#1:430,11\n178#1:463\n145#1:468\n195#1:477,11\n195#1:512\n138#1:517\n77#1:522\n245#1:532,11\n245#1:581\n77#1:329,8\n77#1:343,3\n138#1:367,8\n138#1:381,3\n145#1:402,8\n145#1:416,3\n178#1:441,8\n178#1:455,3\n178#1:460,3\n145#1:465,3\n195#1:488,8\n195#1:502,3\n195#1:509,3\n138#1:514,3\n77#1:519,3\n245#1:543,8\n245#1:557,3\n257#1:563\n245#1:578,3\n77#1:337,6\n138#1:375,6\n145#1:410,6\n178#1:449,6\n195#1:496,6\n245#1:551,6\n145#1:385,6\n145#1:419\n145#1:469\n149#1:420\n245#1:526,6\n245#1:560\n245#1:582\n257#1:564,6\n238#1:583\n*E\n"})
public final class OooO0o {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24090OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24091OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function1<? super MusicTable, Unit> function1, MusicTable musicTable) {
            super(0);
            this.f24090OooO0Oo = function1;
            this.f24091OooO0o0 = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MusicTable, Unit> function1 = this.f24090OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f24091OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Float> f24092OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(State<Float> state) {
            super(1);
            this.f24092OooO0Oo = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationZ(this.f24092OooO0Oo.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f24093OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24094OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f24095OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24096OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f24097OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Bitmap f24098OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f24099OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MusicTable musicTable, boolean z, Modifier modifier, long j, Bitmap bitmap, int i, int i2) {
            super(2);
            this.f24094OooO0Oo = musicTable;
            this.f24096OooO0o0 = z;
            this.f24095OooO0o = modifier;
            this.f24097OooO0oO = j;
            this.f24098OooO0oo = bitmap;
            this.f24093OooO = i;
            this.f24099OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0o.OooO00o(this.f24094OooO0Oo, this.f24096OooO0o0, this.f24095OooO0o, this.f24097OooO0oO, this.f24098OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24093OooO | 1), this.f24099OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.module.media.music.OooO f24100OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24101OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24102OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(com.yalla.yalla.module.media.music.OooO oooO, Function1<? super MusicTable, Unit> function1, MusicTable musicTable) {
            super(0);
            this.f24100OooO0Oo = oooO;
            this.f24102OooO0o0 = function1;
            this.f24101OooO0o = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MusicTable, Unit> function1;
            if (Intrinsics.areEqual(this.f24100OooO0Oo, com.yalla.yalla.module.media.music.OooO.OooO0OO.f24083OooO00o) && (function1 = this.f24102OooO0o0) != null) {
                function1.invoke(this.f24101OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.media.music.OooO0o$OooO0o, reason: collision with other inner class name */
    public static final class C0305OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.module.media.music.OooO f24103OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24104OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24105OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f24106OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0305OooO0o(com.yalla.yalla.module.media.music.OooO oooO, Function1<? super MusicTable, Unit> function1, MusicTable musicTable, Function1<? super Boolean, Unit> function2) {
            super(0);
            this.f24103OooO0Oo = oooO;
            this.f24105OooO0o0 = function1;
            this.f24104OooO0o = musicTable;
            this.f24106OooO0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.module.media.music.OooO.OooO0OO oooO0OO = com.yalla.yalla.module.media.music.OooO.OooO0OO.f24083OooO00o;
            com.yalla.yalla.module.media.music.OooO oooO = this.f24103OooO0Oo;
            boolean zAreEqual = Intrinsics.areEqual(oooO, oooO0OO);
            MusicTable musicTable = this.f24104OooO0o;
            if (zAreEqual) {
                Function1<MusicTable, Unit> function1 = this.f24105OooO0o0;
                if (function1 != null) {
                    function1.invoke(musicTable);
                }
            } else {
                boolean zAreEqual2 = Intrinsics.areEqual(oooO, com.yalla.yalla.module.media.music.OooO.OooO0O0.f24082OooO00o);
                Function1<Boolean, Unit> function2 = this.f24106OooO0oO;
                if (zAreEqual2) {
                    MutableState<Boolean> mutableState = musicTable.isSelected;
                    mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
                    if (function2 != null) {
                        Boolean value = musicTable.isSelected.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                        function2.invoke(value);
                    }
                } else if (!musicTable.isExist) {
                    MutableState<Boolean> mutableState2 = musicTable.isSelected;
                    mutableState2.setValue(Boolean.valueOf(!mutableState2.getValue().booleanValue()));
                    if (function2 != null) {
                        Boolean value2 = musicTable.isSelected.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
                        function2.invoke(value2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24107OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24108OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Function1<? super MusicTable, Unit> function1, MusicTable musicTable) {
            super(0);
            this.f24107OooO0Oo = function1;
            this.f24108OooO0o0 = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MusicTable, Unit> function1 = this.f24107OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f24108OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24109OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24110OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24111OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.module.media.music.OooO f24112OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f24113OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24114OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f24115OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24116OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24117OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f24118OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f24119OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(MusicTable musicTable, com.yalla.yalla.module.media.music.OooO oooO, boolean z, String str, Function1<? super MusicTable, Unit> function1, Function1<? super MusicTable, Unit> function2, Function1<? super Boolean, Unit> function3, Function1<? super MusicTable, Unit> function4, Function1<? super MusicTable, Unit> function5, int i, int i2) {
            super(2);
            this.f24110OooO0Oo = musicTable;
            this.f24112OooO0o0 = oooO;
            this.f24111OooO0o = z;
            this.f24113OooO0oO = str;
            this.f24114OooO0oo = function1;
            this.f24109OooO = function2;
            this.f24115OooOO0 = function3;
            this.f24116OooOO0O = function4;
            this.f24117OooOO0o = function5;
            this.f24119OooOOO0 = i;
            this.f24118OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0o.OooO0O0(this.f24110OooO0Oo, this.f24112OooO0o0, this.f24111OooO0o, this.f24113OooO0oO, this.f24114OooO0oo, this.f24109OooO, this.f24115OooOO0, this.f24116OooOO0O, this.f24117OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24119OooOOO0 | 1), this.f24118OooOOO);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull MusicTable item, boolean z, @Nullable Modifier modifier, long j, @Nullable Bitmap bitmap, @Nullable Composer composer, int i, int i2) {
        long j2;
        int i3;
        float f;
        Modifier modifierM514requiredHeight3ABfNKs;
        Modifier modifierBorder;
        Bitmap bitmapOooO0O0;
        String str;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297864963);
        Modifier modifierM482paddingqDBjuR0$default = (i2 & 4) != 0 ? PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null) : modifier;
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            j2 = o0OOo000.f48342o00OOOOo;
        } else {
            j2 = j;
            i3 = i;
        }
        Bitmap bitmap2 = (i2 & 16) != 0 ? null : bitmap;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1297864963, i3, -1, "com.yalla.yalla.module.media.music.CoverContent (MusicItemContent.kt:235)");
        }
        State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("", composerStartRestartGroup, 6, 0), 0.0f, 360.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), "music playing", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f2 = 56;
        Modifier modifierM514requiredHeight3ABfNKs2 = SizeKt.m514requiredHeight3ABfNKs(companion2.then(modifierM482paddingqDBjuR0$default), Dp.m3775constructorimpl(f2));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM514requiredHeight3ABfNKs2);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(o0O0O00.ic_music_playing_bg, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1227239824);
        Boolean value = item.isPlaying.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
        if (value.booleanValue()) {
            f = f2;
            Modifier modifierM514requiredHeight3ABfNKs3 = SizeKt.m514requiredHeight3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloat);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(stateAnimateFloat);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierM514requiredHeight3ABfNKs = GraphicsLayerModifierKt.graphicsLayer(modifierM514requiredHeight3ABfNKs3, (Function1) objRememberedValue);
        } else {
            f = f2;
            modifierM514requiredHeight3ABfNKs = SizeKt.m514requiredHeight3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f));
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifier2 = modifierM482paddingqDBjuR0$default;
        long j3 = j2;
        ImageKt.Image(painterPainterResource, (String) null, modifierM514requiredHeight3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        Modifier modifierOooO00o = o00O0O0.OooO00o(10, SizeKt.m514requiredHeight3ABfNKs(companion2, Dp.m3775constructorimpl(f)));
        Boolean value2 = item.isPlaying.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, r7);
        if (value2.booleanValue()) {
            modifierBorder = BorderKt.border(companion2, BorderStrokeKt.m198BorderStrokecXLIe8U(Dp.m3775constructorimpl((float) 0.5d), j3), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl((float) 10.5d)));
        }
        if (bitmap2 == null) {
            modifierBorder = companion2;
            String mPath = item.mPath;
            Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
            bitmapOooO0O0 = O0OO00.OooO0O0(mPath);
        } else {
            modifierBorder = companion2;
            bitmapOooO0O0 = bitmap2;
        }
        if (bitmapOooO0O0 == null) {
            composerStartRestartGroup.startReplaceableGroup(-1227238875);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_music_default, composerStartRestartGroup, 0), (String) null, companion2.then(modifierOooO00o).then(modifierBorder), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
            str = "<get-value>(...)";
            companion = companion2;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1227238593);
            str = "<get-value>(...)";
            companion = companion2;
            ImageKt.m227Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapOooO0O0), null, companion2.then(modifierOooO00o).then(modifierBorder), null, null, 0.0f, null, 0, composerStartRestartGroup, 56, 248);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.startReplaceableGroup(1851617831);
        if (!z) {
            Boolean value3 = item.isPlaying.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, str);
            float f3 = 16;
            ImageKt.Image(PainterResources_androidKt.painterResource(value3.booleanValue() ? o0O0O00.ic_music_pause : o0O0O00.ic_music_play, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 12, null), Dp.m3775constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        }
        if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(item, z, modifier2, j3, bitmap2, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:102:0x0415  */
    /* JADX WARN: Code duplicated, block: B:104:0x0428  */
    /* JADX WARN: Code duplicated, block: B:105:0x042b  */
    /* JADX WARN: Code duplicated, block: B:108:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:110:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:111:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x0541  */
    /* JADX WARN: Code duplicated, block: B:118:0x054d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0551  */
    /* JADX WARN: Code duplicated, block: B:124:0x0570  */
    /* JADX WARN: Code duplicated, block: B:127:0x062a  */
    /* JADX WARN: Code duplicated, block: B:129:0x063b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0687  */
    /* JADX WARN: Code duplicated, block: B:134:0x0693  */
    /* JADX WARN: Code duplicated, block: B:135:0x0697  */
    /* JADX WARN: Code duplicated, block: B:140:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:142:0x0762  */
    /* JADX WARN: Code duplicated, block: B:145:0x0785  */
    /* JADX WARN: Code duplicated, block: B:149:0x078f  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x039b  */
    /* JADX WARN: Code duplicated, block: B:88:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x03e6  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull MusicTable item, @Nullable com.yalla.yalla.module.media.music.OooO oooO, boolean z, @Nullable String str, @Nullable Function1<? super MusicTable, Unit> function1, @Nullable Function1<? super MusicTable, Unit> function2, @Nullable Function1<? super Boolean, Unit> function3, @Nullable Function1<? super MusicTable, Unit> function4, @Nullable Function1<? super MusicTable, Unit> function5, @Nullable Composer composer, int i, int i2) {
        Modifier.Companion companion;
        ComposeUiNode.Companion companion2;
        Function1<? super MusicTable, Unit> function6;
        Function1<? super MusicTable, Unit> function7;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        boolean z2;
        Modifier.Companion companion3;
        Boolean value;
        long j;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        Function1<? super MusicTable, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Boolean value2;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM1320constructorimpl3;
        Function2 function2OooO00o3;
        AnnotatedString.Builder builder;
        int iIndexOf$default;
        int length;
        Boolean value3;
        long j2;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(334148135);
        com.yalla.yalla.module.media.music.OooO oooO2 = (i2 & 2) != 0 ? com.yalla.yalla.module.media.music.OooO.OooO0OO.f24083OooO00o : oooO;
        boolean z3 = (i2 & 4) != 0 ? false : z;
        String str2 = (i2 & 8) != 0 ? "" : str;
        Function1<? super MusicTable, Unit> function9 = (i2 & 16) != 0 ? null : function1;
        Function1<? super MusicTable, Unit> function10 = (i2 & 32) != 0 ? null : function2;
        Function1<? super Boolean, Unit> function11 = (i2 & 64) != 0 ? null : function3;
        Function1<? super MusicTable, Unit> function12 = (i2 & 128) != 0 ? null : function4;
        Function1<? super MusicTable, Unit> function13 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : function5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(334148135, i, -1, "com.yalla.yalla.module.media.music.MusicItemContent (MusicItemContent.kt:75)");
        }
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion4.getCenterVertically();
        Modifier.Companion companion5 = Modifier.INSTANCE;
        float f = 12;
        boolean z4 = z3;
        String str3 = str2;
        float f2 = 16;
        Function1<? super MusicTable, Unit> function14 = function10;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m170backgroundbw27NRU(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 8, null), Dp.m3775constructorimpl(80)), o0OOo000.f48184OoooOoo, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2))), false, false, 0L, false, null, null, new OooO0OO(oooO2, function12, item), new C0305OooO0o(oooO2, function13, item, function11), 191);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function1<? super MusicTable, Unit> function15 = function13;
        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
        Function1<? super MusicTable, Unit> function16 = function12;
        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        Function1<? super Boolean, Unit> function17 = function11;
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl4, measurePolicyOooO0O0, composerM1320constructorimpl4, currentCompositionLocalMap);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (Intrinsics.areEqual(oooO2, com.yalla.yalla.module.media.music.OooO.OooO0O0.f24082OooO00o)) {
            composerStartRestartGroup.startReplaceableGroup(727669715);
            Boolean value4 = item.isSelected.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "<get-value>(...)");
            companion = companion5;
            companion2 = companion6;
            function6 = function15;
            ImageKt.Image(PainterResources_androidKt.painterResource(value4.booleanValue() ? o0O0O00.ic_music_selected : o0O0O00.ic_music_unselected, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion5, Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(4), 0.0f, 10, null), Dp.m3775constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            companion = companion5;
            companion2 = companion6;
            function6 = function15;
            if (Intrinsics.areEqual(oooO2, com.yalla.yalla.module.media.music.OooO.OooO00o.f24081OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(727670110);
                if (item.isExist) {
                    composerStartRestartGroup.startReplaceableGroup(727670142);
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_music_exist, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(4), 0.0f, 10, null), Dp.m3775constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(727670465);
                    Boolean value5 = item.isSelected.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "<get-value>(...)");
                    ImageKt.Image(PainterResources_androidKt.painterResource(value5.booleanValue() ? o0O0O00.ic_music_selected : o0O0O00.ic_music_unselected, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(4), 0.0f, 10, null), Dp.m3775constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(727670856);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        OooO00o(item, !Intrinsics.areEqual(oooO2, com.yalla.yalla.module.media.music.OooO.OooO0OO.f24083OooO00o), null, 0L, null, composerStartRestartGroup, 8, 28);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
        ComposeUiNode.Companion companion7 = companion2;
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl5, measurePolicyRowMeasurePolicy, composerM1320constructorimpl5, currentCompositionLocalMap2);
        if (!composerM1320constructorimpl5.getInserting()) {
            function7 = function6;
            if (!Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion4, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO0O1, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str3.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                composerStartRestartGroup.startReplaceableGroup(-2116790613);
                builder = new AnnotatedString.Builder(0, 1, null);
                String mDisplayName = item.mDisplayName;
                Intrinsics.checkNotNullExpressionValue(mDisplayName, "mDisplayName");
                iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) mDisplayName, str3, 0, true, 2, (Object) null);
                length = str3.length() + iIndexOf$default;
                String mDisplayName2 = item.mDisplayName;
                Intrinsics.checkNotNullExpressionValue(mDisplayName2, "mDisplayName");
                builder.append(mDisplayName2);
                if (iIndexOf$default != -1) {
                    value3 = item.isPlaying.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "<get-value>(...)");
                    if (value3.booleanValue()) {
                        j2 = o0OOo000.f48342o00OOOOo;
                    } else {
                        j2 = o0OOo000.f48343o00OOOo;
                    }
                    builder.addStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, length);
                }
                str3 = str3;
                companion3 = companion;
                TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.m532widthInVpY3zN4$default(companion3, 0.0f, Dp.m3775constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null), o0OOo000.f48149OooOOo, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composerStartRestartGroup, 3120, 3120, 251888);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                companion3 = companion;
                composerStartRestartGroup.startReplaceableGroup(-2116789550);
                String str4 = item.mDisplayName;
                value = item.isPlaying.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                if (value.booleanValue()) {
                    j = o0OOo000.f48342o00OOOOo;
                } else {
                    j = o0OOo000.f48149OooOOo;
                }
                long sp = TextUnitKt.getSp(16);
                int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                Modifier modifierM532widthInVpY3zN4$default = SizeKt.m532widthInVpY3zN4$default(companion3, 0.0f, Dp.m3775constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null);
                Intrinsics.checkNotNull(str4);
                TextKt.m1261Text4IGK_g(str4, modifierM532widthInVpY3zN4$default, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3729getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
                composerStartRestartGroup.endReplaceableGroup();
            }
            Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion3);
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
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl2, measurePolicyOooO0O2, composerM1320constructorimpl2, currentCompositionLocalMap4);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Lazy lazy = o0O000o0.f39631OooO00o;
            String strOooO0OO = o0O000o0.OooO0OO(item.mDuration);
            long j3 = o0OOo000.f48142OooOO0;
            TextKt.m1261Text4IGK_g(strOooO0OO, (Modifier) null, j3, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            TextKt.m1261Text4IGK_g(com.code.android.util.o0OoOo0.OooOOO(item.mArtist, ""), PaddingKt.m482paddingqDBjuR0$default(companion3, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), j3, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(727673347);
            if (z4) {
                value2 = item.isPlaying.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
                if (value2.booleanValue()) {
                    Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m482paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), null, false, 3, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(companion4, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl3, measurePolicyOooO00o, composerM1320constructorimpl3, currentCompositionLocalMap5);
                    if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    float f3 = 24;
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_music_clip, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(f3)), false, false, 0L, false, null, null, null, new OooO(function9, item), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(o0O0O00.ic_music_select_done, composerStartRestartGroup, 0);
                    Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion3, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f3));
                    function8 = function14;
                    ImageKt.Image(painterPainterResource, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierM525size3ABfNKs, false, false, 0L, false, null, null, null, new OooOO0(function8, item), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    o0ooOOo.OooO00o(composerStartRestartGroup);
                } else {
                    function8 = function14;
                }
            } else {
                function8 = function14;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(item, oooO2, z4, str3, function9, function8, function17, function16, function7, i, i2));
        }
        function7 = function6;
        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Modifier modifierOooO00o2 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O3 = o0O00oO0.OooO0O0(companion4, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        constructor = companion7.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
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
        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO0O3, composerM1320constructorimpl, currentCompositionLocalMap6);
        if (composerM1320constructorimpl.getInserting()) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        } else {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        if (str3.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            composerStartRestartGroup.startReplaceableGroup(-2116790613);
            builder = new AnnotatedString.Builder(0, 1, null);
            String mDisplayName3 = item.mDisplayName;
            Intrinsics.checkNotNullExpressionValue(mDisplayName3, "mDisplayName");
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) mDisplayName3, str3, 0, true, 2, (Object) null);
            length = str3.length() + iIndexOf$default;
            String mDisplayName4 = item.mDisplayName;
            Intrinsics.checkNotNullExpressionValue(mDisplayName4, "mDisplayName");
            builder.append(mDisplayName4);
            if (iIndexOf$default != -1) {
                value3 = item.isPlaying.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "<get-value>(...)");
                if (value3.booleanValue()) {
                    j2 = o0OOo000.f48342o00OOOOo;
                } else {
                    j2 = o0OOo000.f48343o00OOOo;
                }
                builder.addStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, length);
            }
            str3 = str3;
            companion3 = companion;
            TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.m532widthInVpY3zN4$default(companion3, 0.0f, Dp.m3775constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null), o0OOo000.f48149OooOOo, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composerStartRestartGroup, 3120, 3120, 251888);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            companion3 = companion;
            composerStartRestartGroup.startReplaceableGroup(-2116789550);
            String str5 = item.mDisplayName;
            value = item.isPlaying.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            if (value.booleanValue()) {
                j = o0OOo000.f48342o00OOOOo;
            } else {
                j = o0OOo000.f48149OooOOo;
            }
            long sp2 = TextUnitKt.getSp(16);
            int iM3729getEllipsisgIe3tQ9 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            Modifier modifierM532widthInVpY3zN4$default2 = SizeKt.m532widthInVpY3zN4$default(companion3, 0.0f, Dp.m3775constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null);
            Intrinsics.checkNotNull(str5);
            TextKt.m1261Text4IGK_g(str5, modifierM532widthInVpY3zN4$default2, j, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3729getEllipsisgIe3tQ9, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
            composerStartRestartGroup.endReplaceableGroup();
        }
        Alignment.Vertical centerVertically4 = companion4.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O4 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically4, composerStartRestartGroup, 48, -1323940314);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        constructor2 = companion7.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion3);
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
        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl2, measurePolicyOooO0O4, composerM1320constructorimpl2, currentCompositionLocalMap7);
        if (composerM1320constructorimpl2.getInserting()) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        } else {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Lazy lazy2 = o0O000o0.f39631OooO00o;
        String strOooO0OO2 = o0O000o0.OooO0OO(item.mDuration);
        long j4 = o0OOo000.f48142OooOO0;
        TextKt.m1261Text4IGK_g(strOooO0OO2, (Modifier) null, j4, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        TextKt.m1261Text4IGK_g(com.code.android.util.o0OoOo0.OooOOO(item.mArtist, ""), PaddingKt.m482paddingqDBjuR0$default(companion3, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), j4, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(727673347);
        if (z4) {
            value2 = item.isPlaying.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
            if (value2.booleanValue()) {
                Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(PaddingKt.m482paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), null, false, 3, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0O.OooO00o(companion4, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap8);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                float f4 = 24;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_music_clip, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(f4)), false, false, 0L, false, null, null, null, new OooO(function9, item), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(o0O0O00.ic_music_select_done, composerStartRestartGroup, 0);
                Modifier modifierM525size3ABfNKs2 = SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion3, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f4));
                function8 = function14;
                ImageKt.Image(painterPainterResource2, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierM525size3ABfNKs2, false, false, 0L, false, null, null, null, new OooOO0(function8, item), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                o0ooOOo.OooO00o(composerStartRestartGroup);
            } else {
                function8 = function14;
            }
        } else {
            function8 = function14;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(item, oooO2, z4, str3, function9, function8, function17, function16, function7, i, i2));
    }
}
