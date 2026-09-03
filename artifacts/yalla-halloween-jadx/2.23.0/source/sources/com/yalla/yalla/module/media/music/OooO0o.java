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
import com.code.android.util.o0O0O00;
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
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p161o00OoOo0.o000OOo;
import p469o0OoooOO.o0oO0O0o;
import p579o0oOoo.oOo00ooO;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicItemContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicItemContent.kt\ncom/yalla/yalla/module/media/music/MusicItemContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,307:1\n154#2:308\n154#2:309\n154#2:310\n154#2:346\n154#2:347\n154#2:348\n154#2:349\n154#2:350\n154#2:351\n154#2:352\n154#2:420\n154#2:421\n154#2:458\n154#2:469\n154#2:505\n154#2:506\n154#2:507\n154#2:523\n154#2:524\n154#2:560\n154#2:561\n154#2:569\n154#2:570\n154#2:571\n154#2:572\n164#2:573\n164#2:574\n154#2:575\n154#2:576\n73#3,6:311\n79#3:345\n77#3,2:353\n79#3:383\n72#3,7:422\n79#3:457\n83#3:463\n73#3,6:470\n79#3:504\n83#3:512\n83#3:517\n83#3:522\n78#4,11:317\n78#4,11:355\n78#4,11:390\n78#4,11:429\n91#4:462\n91#4:467\n78#4,11:476\n91#4:511\n91#4:516\n91#4:521\n78#4,11:531\n91#4:580\n456#5,8:328\n464#5,3:342\n456#5,8:366\n464#5,3:380\n456#5,8:401\n464#5,3:415\n456#5,8:440\n464#5,3:454\n467#5,3:459\n467#5,3:464\n456#5,8:487\n464#5,3:501\n467#5,3:508\n467#5,3:513\n467#5,3:518\n456#5,8:542\n464#5,3:556\n36#5:562\n467#5,3:577\n4144#6,6:336\n4144#6,6:374\n4144#6,6:409\n4144#6,6:448\n4144#6,6:495\n4144#6,6:550\n72#7,6:384\n78#7:418\n82#7:468\n1098#8:419\n66#9,6:525\n72#9:559\n76#9:581\n1097#10,6:563\n81#11:582\n*S KotlinDebug\n*F\n+ 1 MusicItemContent.kt\ncom/yalla/yalla/module/media/music/MusicItemContentKt\n*L\n80#1:308\n81#1:309\n82#1:310\n113#1:346\n114#1:347\n122#1:348\n123#1:349\n130#1:350\n131#1:351\n139#1:352\n164#1:420\n173#1:421\n187#1:458\n196#1:469\n203#1:505\n213#1:506\n214#1:507\n231#1:523\n247#1:524\n254#1:560\n255#1:561\n261#1:569\n262#1:570\n266#1:571\n267#1:572\n272#1:573\n274#1:574\n302#1:575\n303#1:576\n76#1:311,6\n76#1:345\n137#1:353,2\n137#1:383\n177#1:422,7\n177#1:457\n177#1:463\n194#1:470,6\n194#1:504\n194#1:512\n137#1:517\n76#1:522\n76#1:317,11\n137#1:355,11\n144#1:390,11\n177#1:429,11\n177#1:462\n144#1:467\n194#1:476,11\n194#1:511\n137#1:516\n76#1:521\n244#1:531,11\n244#1:580\n76#1:328,8\n76#1:342,3\n137#1:366,8\n137#1:380,3\n144#1:401,8\n144#1:415,3\n177#1:440,8\n177#1:454,3\n177#1:459,3\n144#1:464,3\n194#1:487,8\n194#1:501,3\n194#1:508,3\n137#1:513,3\n76#1:518,3\n244#1:542,8\n244#1:556,3\n256#1:562\n244#1:577,3\n76#1:336,6\n137#1:374,6\n144#1:409,6\n177#1:448,6\n194#1:495,6\n244#1:550,6\n144#1:384,6\n144#1:418\n144#1:468\n148#1:419\n244#1:525,6\n244#1:559\n244#1:581\n256#1:563,6\n237#1:582\n*E\n"})
public final class OooO0o {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24554OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24555OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function1<? super MusicTable, Unit> function1, MusicTable musicTable) {
            super(0);
            this.f24554OooO0Oo = function1;
            this.f24555OooO0o0 = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MusicTable, Unit> function1 = this.f24554OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f24555OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Float> f24556OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(State<Float> state) {
            super(1);
            this.f24556OooO0Oo = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationZ(this.f24556OooO0Oo.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f24557OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24558OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f24559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24560OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f24561OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Bitmap f24562OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f24563OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MusicTable musicTable, boolean z, Modifier modifier, long j, Bitmap bitmap, int i, int i2) {
            super(2);
            this.f24558OooO0Oo = musicTable;
            this.f24560OooO0o0 = z;
            this.f24559OooO0o = modifier;
            this.f24561OooO0oO = j;
            this.f24562OooO0oo = bitmap;
            this.f24557OooO = i;
            this.f24563OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0o.OooO00o(this.f24558OooO0Oo, this.f24560OooO0o0, this.f24559OooO0o, this.f24561OooO0oO, this.f24562OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24557OooO | 1), this.f24563OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.module.media.music.OooO f24564OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24565OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24566OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(com.yalla.yalla.module.media.music.OooO oooO, Function1<? super MusicTable, Unit> function1, MusicTable musicTable) {
            super(0);
            this.f24564OooO0Oo = oooO;
            this.f24566OooO0o0 = function1;
            this.f24565OooO0o = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MusicTable, Unit> function1;
            if (Intrinsics.areEqual(this.f24564OooO0Oo, com.yalla.yalla.module.media.music.OooO.OooO0OO.f24547OooO00o) && (function1 = this.f24566OooO0o0) != null) {
                function1.invoke(this.f24565OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.media.music.OooO0o$OooO0o, reason: collision with other inner class name */
    public static final class C0306OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.module.media.music.OooO f24567OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24568OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24569OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f24570OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0306OooO0o(com.yalla.yalla.module.media.music.OooO oooO, Function1<? super MusicTable, Unit> function1, MusicTable musicTable, Function1<? super Boolean, Unit> function2) {
            super(0);
            this.f24567OooO0Oo = oooO;
            this.f24569OooO0o0 = function1;
            this.f24568OooO0o = musicTable;
            this.f24570OooO0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.module.media.music.OooO.OooO0OO oooO0OO = com.yalla.yalla.module.media.music.OooO.OooO0OO.f24547OooO00o;
            com.yalla.yalla.module.media.music.OooO oooO = this.f24567OooO0Oo;
            boolean zAreEqual = Intrinsics.areEqual(oooO, oooO0OO);
            MusicTable musicTable = this.f24568OooO0o;
            if (zAreEqual) {
                Function1<MusicTable, Unit> function1 = this.f24569OooO0o0;
                if (function1 != null) {
                    function1.invoke(musicTable);
                }
            } else {
                boolean zAreEqual2 = Intrinsics.areEqual(oooO, com.yalla.yalla.module.media.music.OooO.OooO0O0.f24546OooO00o);
                Function1<Boolean, Unit> function2 = this.f24570OooO0oO;
                if (zAreEqual2) {
                    MutableState<Boolean> mutableState = musicTable.isSelected;
                    mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
                    if (function2 != null) {
                        Boolean value = musicTable.isSelected.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "item.isSelected.value");
                        function2.invoke(value);
                    }
                } else if (!musicTable.isExist) {
                    MutableState<Boolean> mutableState2 = musicTable.isSelected;
                    mutableState2.setValue(Boolean.valueOf(!mutableState2.getValue().booleanValue()));
                    if (function2 != null) {
                        Boolean value2 = musicTable.isSelected.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "item.isSelected.value");
                        function2.invoke(value2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24571OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24572OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Function1<? super MusicTable, Unit> function1, MusicTable musicTable) {
            super(0);
            this.f24571OooO0Oo = function1;
            this.f24572OooO0o0 = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MusicTable, Unit> function1 = this.f24571OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f24572OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24573OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24574OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24575OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.module.media.music.OooO f24576OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f24577OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24578OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f24579OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24580OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicTable, Unit> f24581OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f24582OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f24583OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(MusicTable musicTable, com.yalla.yalla.module.media.music.OooO oooO, boolean z, String str, Function1<? super MusicTable, Unit> function1, Function1<? super MusicTable, Unit> function2, Function1<? super Boolean, Unit> function3, Function1<? super MusicTable, Unit> function4, Function1<? super MusicTable, Unit> function5, int i, int i2) {
            super(2);
            this.f24574OooO0Oo = musicTable;
            this.f24576OooO0o0 = oooO;
            this.f24575OooO0o = z;
            this.f24577OooO0oO = str;
            this.f24578OooO0oo = function1;
            this.f24573OooO = function2;
            this.f24579OooOO0 = function3;
            this.f24580OooOO0O = function4;
            this.f24581OooOO0o = function5;
            this.f24583OooOOO0 = i;
            this.f24582OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0o.OooO0O0(this.f24574OooO0Oo, this.f24576OooO0o0, this.f24575OooO0o, this.f24577OooO0oO, this.f24578OooO0oo, this.f24573OooO, this.f24579OooOO0, this.f24580OooOO0O, this.f24581OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24583OooOOO0 | 1), this.f24582OooOOO);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull MusicTable item, boolean z, @Nullable Modifier modifier, long j, @Nullable Bitmap bitmap, @Nullable Composer composer, int i, int i2) {
        Modifier.Companion companion;
        Modifier modifierM512requiredHeight3ABfNKs;
        Bitmap bitmapOooO0O0;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297864963);
        Modifier modifierM480paddingqDBjuR0$default = (i2 & 4) != 0 ? PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null) : modifier;
        long j2 = (i2 & 8) != 0 ? o0oO0O0o.f47145o00OOO : j;
        Bitmap bitmap2 = (i2 & 16) != 0 ? null : bitmap;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1297864963, i, -1, "com.yalla.yalla.module.media.music.CoverContent (MusicItemContent.kt:227)");
        }
        State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("", composerStartRestartGroup, 6, 0), 0.0f, 360.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), "music playing", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 56;
        Modifier modifierM512requiredHeight3ABfNKs2 = SizeKt.m512requiredHeight3ABfNKs(companion2.then(modifierM480paddingqDBjuR0$default), Dp.m3765constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM512requiredHeight3ABfNKs2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_music_playing_bg, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1227239881);
        Boolean value = item.isPlaying.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "item.isPlaying.value");
        if (value.booleanValue()) {
            companion = companion2;
            Modifier modifierM512requiredHeight3ABfNKs3 = SizeKt.m512requiredHeight3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloat);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(stateAnimateFloat);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierM512requiredHeight3ABfNKs = GraphicsLayerModifierKt.graphicsLayer(modifierM512requiredHeight3ABfNKs3, (Function1) objRememberedValue);
        } else {
            companion = companion2;
            modifierM512requiredHeight3ABfNKs = SizeKt.m512requiredHeight3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(f));
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion4 = companion;
        Modifier modifier2 = modifierM480paddingqDBjuR0$default;
        long j3 = j2;
        ImageKt.Image(painterPainterResource, (String) null, modifierM512requiredHeight3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(10, SizeKt.m512requiredHeight3ABfNKs(companion4, Dp.m3765constructorimpl(f)));
        Boolean value2 = item.isPlaying.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, r8);
        Modifier modifierBorder = value2.booleanValue() ? BorderKt.border(companion4, BorderStrokeKt.m196BorderStrokecXLIe8U(Dp.m3765constructorimpl((float) 0.5d), j3), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 10.5d))) : companion4;
        if (bitmap2 == null) {
            String str = item.mPath;
            Intrinsics.checkNotNullExpressionValue(str, "item.mPath");
            bitmapOooO0O0 = oOo00ooO.OooO0O0(str);
        } else {
            bitmapOooO0O0 = bitmap2;
        }
        if (bitmapOooO0O0 == null) {
            composerStartRestartGroup.startReplaceableGroup(-1227238932);
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_music_default, composerStartRestartGroup, 0), (String) null, companion4.then(modifierOooO0O0).then(modifierBorder), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1227238650);
            ImageKt.m225Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapOooO0O0), null, companion4.then(modifierOooO0O0).then(modifierBorder), null, null, 0.0f, null, 0, composerStartRestartGroup, 56, 248);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.startReplaceableGroup(1851617774);
        if (!z) {
            Boolean value3 = item.isPlaying.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "item.isPlaying.value");
            float f2 = 16;
            ImageKt.Image(PainterResources_androidKt.painterResource(value3.booleanValue() ? oO00OOO.ic_music_pause : oO00OOO.ic_music_play, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion4, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 0.0f, 0.0f, 12, null), Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(item, z, modifier2, j3, bitmap2, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0758  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull MusicTable item, @Nullable com.yalla.yalla.module.media.music.OooO oooO, boolean z, @Nullable String str, @Nullable Function1<? super MusicTable, Unit> function1, @Nullable Function1<? super MusicTable, Unit> function2, @Nullable Function1<? super Boolean, Unit> function3, @Nullable Function1<? super MusicTable, Unit> function4, @Nullable Function1<? super MusicTable, Unit> function5, @Nullable Composer composer, int i, int i2) {
        Modifier.Companion companion;
        ComposeUiNode.Companion companion2;
        Function1<? super MusicTable, Unit> function6;
        Function1<? super MusicTable, Unit> function7;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(334148135);
        com.yalla.yalla.module.media.music.OooO oooO2 = (i2 & 2) != 0 ? com.yalla.yalla.module.media.music.OooO.OooO0OO.f24547OooO00o : oooO;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        String str2 = (i2 & 8) != 0 ? "" : str;
        Function1<? super MusicTable, Unit> function8 = (i2 & 16) != 0 ? null : function1;
        Function1<? super MusicTable, Unit> function9 = (i2 & 32) != 0 ? null : function2;
        Function1<? super Boolean, Unit> function10 = (i2 & 64) != 0 ? null : function3;
        Function1<? super MusicTable, Unit> function11 = (i2 & 128) != 0 ? null : function4;
        Function1<? super MusicTable, Unit> function12 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : function5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(334148135, i, -1, "com.yalla.yalla.module.media.music.MusicItemContent (MusicItemContent.kt:64)");
        }
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Modifier.Companion companion4 = Modifier.INSTANCE;
        float f = 12;
        boolean z3 = z2;
        String str3 = str2;
        float f2 = 16;
        Function1<? super MusicTable, Unit> function13 = function9;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 8, null), Dp.m3765constructorimpl(80)), o0oO0O0o.f46992OoooOOo, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), false, false, 0L, false, null, null, new OooO0OO(oooO2, function11, item), new C0306OooO0o(oooO2, function12, item, function10), 191);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function1<? super MusicTable, Unit> function14 = function12;
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function1<? super MusicTable, Unit> function15 = function11;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        Function1<? super Boolean, Unit> function16 = function10;
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (Intrinsics.areEqual(oooO2, com.yalla.yalla.module.media.music.OooO.OooO0O0.f24546OooO00o)) {
            composerStartRestartGroup.startReplaceableGroup(727669673);
            Boolean value = item.isSelected.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "item.isSelected.value");
            int i3 = value.booleanValue() ? oO00OOO.ic_music_selected : oO00OOO.ic_music_unselected;
            companion2 = companion5;
            function6 = function14;
            ImageKt.Image(PainterResources_androidKt.painterResource(i3, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion4, Dp.m3765constructorimpl(f2), 0.0f, Dp.m3765constructorimpl(4), 0.0f, 10, null), Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
            companion = companion4;
        } else {
            companion = companion4;
            companion2 = companion5;
            function6 = function14;
            if (Intrinsics.areEqual(oooO2, com.yalla.yalla.module.media.music.OooO.OooO00o.f24545OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(727670068);
                if (item.isExist) {
                    composerStartRestartGroup.startReplaceableGroup(727670100);
                    ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_music_exist, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f2), 0.0f, Dp.m3765constructorimpl(4), 0.0f, 10, null), Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(727670423);
                    Boolean value2 = item.isSelected.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "item.isSelected.value");
                    ImageKt.Image(PainterResources_androidKt.painterResource(value2.booleanValue() ? oO00OOO.ic_music_selected : oO00OOO.ic_music_unselected, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f2), 0.0f, Dp.m3765constructorimpl(4), 0.0f, 10, null), Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(727670814);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        OooO00o(item, !Intrinsics.areEqual(oooO2, com.yalla.yalla.module.media.music.OooO.OooO0OO.f24547OooO00o), null, 0L, null, composerStartRestartGroup, 8, 28);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion3, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl3, measurePolicyOooO00o2, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (str3.length() > 0) {
            composerStartRestartGroup.startReplaceableGroup(-2116790655);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            String str4 = item.mDisplayName;
            Intrinsics.checkNotNullExpressionValue(str4, "item.mDisplayName");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str4, str3, 0, true, 2, (Object) null);
            int length = str3.length() + iIndexOf$default;
            String str5 = item.mDisplayName;
            Intrinsics.checkNotNullExpressionValue(str5, "item.mDisplayName");
            builder.append(str5);
            if (iIndexOf$default != -1) {
                Boolean value3 = item.isPlaying.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "item.isPlaying.value");
                builder.addStyle(new SpanStyle(value3.booleanValue() ? o0oO0O0o.f47145o00OOO : o0oO0O0o.f47151o00OOOOo, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, length);
            }
            str3 = str3;
            TextKt.m1252TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.m530widthInVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null), o0oO0O0o.f46960OooOOo, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composerStartRestartGroup, 3120, 3120, 251888);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-2116789592);
            String mDisplayName = item.mDisplayName;
            Boolean value4 = item.isPlaying.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "item.isPlaying.value");
            long j = value4.booleanValue() ? o0oO0O0o.f47145o00OOO : o0oO0O0o.f46960OooOOo;
            long sp = TextUnitKt.getSp(16);
            int iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
            Modifier modifierM530widthInVpY3zN4$default = SizeKt.m530widthInVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null);
            Intrinsics.checkNotNullExpressionValue(mDisplayName, "mDisplayName");
            TextKt.m1251Text4IGK_g(mDisplayName, modifierM530widthInVpY3zN4$default, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
            composerStartRestartGroup.endReplaceableGroup();
        }
        Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl4, measurePolicyOooO00o3, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Lazy lazy = o000OOo.f38508OooO00o;
        String strOooO0OO = o000OOo.OooO0OO(item.mDuration);
        long j2 = o0oO0O0o.f46953OooOO0;
        TextKt.m1251Text4IGK_g(strOooO0OO, (Modifier) null, j2, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        String mArtist = item.mArtist;
        long sp2 = TextUnitKt.getSp(13);
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
        Intrinsics.checkNotNullExpressionValue(mArtist, "mArtist");
        TextKt.m1251Text4IGK_g(mArtist, modifierM480paddingqDBjuR0$default, j2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(727673290);
        if (z3) {
            Boolean value5 = item.isPlaying.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "item.isPlaying.value");
            if (value5.booleanValue()) {
                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 0.0f, 11, null), null, false, 3, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooOOO.OooO00o(companion3, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl5, measurePolicyOooO00o4, composerM1309constructorimpl5, currentCompositionLocalMap5);
                if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                float f3 = 24;
                ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_music_clip, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f3)), false, false, 0L, false, null, null, null, new OooO(function8, item), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_music_select_done, composerStartRestartGroup, 0);
                Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(f3));
                function7 = function13;
                ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0O0(modifierM523size3ABfNKs, false, false, 0L, false, null, null, null, new OooOO0(function7, item), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            } else {
                function7 = function13;
            }
        } else {
            function7 = function13;
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(item, oooO2, z3, str3, function8, function7, function16, function15, function6, i, i2));
    }
}
