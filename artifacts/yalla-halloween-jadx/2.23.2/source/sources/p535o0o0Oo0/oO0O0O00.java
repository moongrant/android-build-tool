package p535o0o0Oo0;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.session.o0000O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p022Oooo00O.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p521o0o0O0o0.oo000o;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVideoLeftArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoLeftArea.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoLeftAreaKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,219:1\n76#2:220\n76#2:264\n76#2:273\n154#3:221\n154#3:257\n154#3:258\n154#3:269\n154#3:274\n154#3:275\n154#3:276\n154#3:320\n154#3:356\n154#3:357\n154#3:358\n154#3:359\n154#3:360\n154#3:361\n154#3:372\n154#3:373\n72#4,6:222\n78#4:256\n82#4:263\n78#5,11:228\n91#5:262\n78#5,11:291\n78#5,11:327\n91#5:365\n91#5:370\n456#6,8:239\n464#6,3:253\n467#6,3:259\n25#6:265\n50#6:277\n49#6:278\n456#6,8:302\n464#6,3:316\n456#6,8:338\n464#6,3:352\n467#6,3:362\n467#6,3:367\n4144#7,6:247\n4144#7,6:310\n4144#7,6:346\n1097#8,3:266\n1100#8,3:270\n1097#8,6:279\n66#9,6:285\n72#9:319\n76#9:371\n73#10,6:321\n79#10:355\n83#10:366\n81#11:374\n107#11,2:375\n*S KotlinDebug\n*F\n+ 1 VideoLeftArea.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoLeftAreaKt\n*L\n75#1:220\n124#1:264\n127#1:273\n78#1:221\n84#1:257\n102#1:258\n125#1:269\n135#1:274\n136#1:275\n137#1:276\n149#1:320\n170#1:356\n171#1:357\n182#1:358\n183#1:359\n190#1:360\n191#1:361\n208#1:372\n211#1:373\n76#1:222,6\n76#1:256\n76#1:263\n76#1:228,11\n76#1:262\n132#1:291,11\n152#1:327,11\n152#1:365\n132#1:370\n76#1:239,8\n76#1:253,3\n76#1:259,3\n125#1:265\n138#1:277\n138#1:278\n132#1:302,8\n132#1:316,3\n152#1:338,8\n152#1:352,3\n152#1:362,3\n132#1:367,3\n76#1:247,6\n132#1:310,6\n152#1:346,6\n125#1:266,3\n125#1:270,3\n138#1:279,6\n132#1:285,6\n132#1:319\n132#1:371\n152#1:321,6\n152#1:355\n152#1:366\n125#1:374\n125#1:375,2\n*E\n"})
public final class oO0O0O00 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f53983OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53984OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f53985OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53986OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RowScope rowScope, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f53983OooO0Oo = rowScope;
            this.f53985OooO0o0 = momentDetailModel;
            this.f53984OooO0o = mutableState;
            this.f53986OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53986OooO0oO | 1);
            MomentDetailModel momentDetailModel = this.f53985OooO0o0;
            MutableState<Boolean> mutableState = this.f53984OooO0o;
            oO0O0O00.OooO0O0(this.f53983OooO0Oo, momentDetailModel, mutableState, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVideoLeftArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoLeftArea.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoLeftAreaKt$MomentTopicEnterContent$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<IntSize, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Density f53987OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f53988OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Density density, MutableState<Dp> mutableState) {
            super(1);
            this.f53987OooO0Oo = density;
            this.f53988OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            this.f53988OooO0o0.setValue(Dp.m3773boximpl(this.f53987OooO0Oo.mo323toDpu2uoSUM(IntSize.m3935getWidthimpl(intSize.getPackedValue()))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f53989OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f53990OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentDetailModel momentDetailModel, Context context) {
            super(0);
            this.f53989OooO0Oo = momentDetailModel;
            this.f53990OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String circleName;
            MomentDetailModel momentDetailModel = this.f53989OooO0Oo;
            MomentSendContentModel content = momentDetailModel.getContent();
            if ((content != null ? content.getCircleId() : 0L) > 0) {
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                MomentSendContentModel content2 = momentDetailModel.getContent();
                topicInfoModel.setId(content2 != null ? content2.getCircleId() : 0L);
                MomentSendContentModel content3 = momentDetailModel.getContent();
                if (content3 == null || (circleName = content3.getCircleName()) == null) {
                    circleName = "";
                }
                topicInfoModel.setName(circleName);
                int i = TopicDetailActivity.f25854OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(this.f53990OooO0o0, topicInfoModel);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f53991OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53992OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f53993OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53994OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, MomentDetailModel momentDetailModel, int i, int i2) {
            super(2);
            this.f53991OooO0Oo = modifier;
            this.f53993OooO0o0 = momentDetailModel;
            this.f53992OooO0o = i;
            this.f53994OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53992OooO0o | 1);
            MomentDetailModel momentDetailModel = this.f53993OooO0o0;
            int i = this.f53994OooO0oO;
            oO0O0O00.OooO00o(this.f53991OooO0Oo, momentDetailModel, composer, iUpdateChangedFlags, i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f53995OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f53996OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(AppCompatActivity appCompatActivity, MomentDetailModel momentDetailModel) {
            super(0);
            this.f53995OooO0Oo = appCompatActivity;
            this.f53996OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AppCompatActivity appCompatActivity = this.f53995OooO0Oo;
            if (appCompatActivity != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, appCompatActivity, o0000O00.OooO00o(this.f53996OooO0o0.getUserId()), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0381  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(Modifier modifier, MomentDetailModel momentDetailModel, Composer composer, int i, int i2) {
        Modifier modifier2;
        Composer composer2;
        String circleName;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1278466005);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1278466005, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentTopicEnterContent (VideoLeftArea.kt:122)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        if (momentDetailModel.getContent() == null) {
            modifier2 = modifier3;
            composer2 = composerStartRestartGroup;
        } else {
            MomentSendContentModel content = momentDetailModel.getContent();
            if (o0OoOo0.OooOO0(content != null ? Long.valueOf(content.getCircleId()) : null) <= 0 || momentDetailModel.getCircleDisbanded()) {
                modifier2 = modifier3;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f = 14;
                Modifier modifierClip = ClipKt.clip(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2.then(modifier3), 0.0f, Dp.m3775constructorimpl(12), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(27)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(density);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new OooO00o(density, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierClip, (Function1) objRememberedValue2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifier4 = modifier3;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_video_topic_enter_bg, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(ClipKt.clip(SizeKt.fillMaxHeight$default(SizeKt.m530width3ABfNKs(companion2, ((Dp) mutableState.getValue()).m3789unboximpl()), 0.0f, 1, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), composerStartRestartGroup, 0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.fillMaxHeight$default(SizeKt.wrapContentWidth$default(companion2, null, false, 3, null), 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooO0O0(momentDetailModel, context), 253);
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f2 = 8;
                float f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_moment_topic_enter, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                MomentSendContentModel content2 = momentDetailModel.getContent();
                if (content2 == null || (circleName = content2.getCircleName()) == null) {
                    circleName = "";
                }
                modifier2 = modifier4;
                TextKt.m1261Text4IGK_g(circleName, SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(185), 1, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3120, 3120, 55280);
                composer2 = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_video_topic_enter_arrow, composer2, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(2), 0.0f, Dp.m3775constructorimpl(f2), 0.0f, 10, null), Dp.m3775constructorimpl(f3)), composer2, 6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(modifier2, momentDetailModel, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x019c  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull RowScope rowScope, @NotNull MomentDetailModel videoDetailModel, @NotNull MutableState<Boolean> isExpanded, @Nullable Composer composer, int i) {
        Modifier modifier;
        Composer composer2;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(videoDetailModel, "videoDetailModel");
        Intrinsics.checkNotNullParameter(isExpanded, "isExpanded");
        Composer composerStartRestartGroup = composer.startRestartGroup(2014264416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2014264416, i, -1, "com.yalla.yalla.ui.screen.moment.media.VideoLeftArea (VideoLeftArea.kt:73)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = OooOO0O.OooO00o(rowScope, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(16), 0.0f, Dp.m3775constructorimpl(43), 0.0f, 10, null), 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(o00O00OO.OooO00o("@", videoDetailModel.getNickName()), com.code.android.util.o0O0O00.OooO0O0(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null), false, false, 0L, false, null, null, null, new OooO0o(appCompatActivity, videoDetailModel), 255), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 199680, 3120, 55248);
        MomentSendContentModel content = videoDetailModel.getContent();
        String content2 = content != null ? content.getContent() : null;
        composerStartRestartGroup.startReplaceableGroup(484537735);
        if (content2 != null) {
            if (content2.length() > 0) {
                modifier = null;
                Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, 3, null);
                MomentSendContentModel content3 = videoDetailModel.getContent();
                String str = content2;
                composer2 = composerStartRestartGroup;
                oo000o.OooO0O0(modifierAnimateContentSize$default, str, isExpanded, content3 != null ? content3.getAt() : null, null, null, composer2, (i & 896) | 4096, 48);
            } else {
                composer2 = composerStartRestartGroup;
                modifier = null;
            }
        } else {
            composer2 = composerStartRestartGroup;
            modifier = null;
        }
        composer2.endReplaceableGroup();
        OooO00o(modifier, videoDetailModel, composer2, 64, 1);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(rowScope, videoDetailModel, isExpanded, i));
    }
}
