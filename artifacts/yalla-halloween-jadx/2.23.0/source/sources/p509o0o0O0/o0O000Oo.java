package p509o0o0O0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import com.code.android.util.o0O0O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentTopicEnterComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentTopicEnterComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentTopicEnterCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,133:1\n76#2:134\n76#2:135\n76#2:136\n76#2:137\n76#2:138\n76#2:146\n25#3:139\n456#3,8:166\n464#3,3:180\n467#3,3:189\n1097#4,6:140\n154#5:147\n154#5:148\n154#5:184\n154#5:185\n154#5:186\n154#5:187\n154#5:188\n73#6,6:149\n79#6:183\n83#6:193\n78#7,11:155\n91#7:192\n4144#8,6:174\n*S KotlinDebug\n*F\n+ 1 MomentTopicEnterComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentTopicEnterCompKt\n*L\n43#1:134\n47#1:135\n48#1:136\n53#1:137\n67#1:138\n71#1:146\n69#1:139\n73#1:166,8\n73#1:180,3\n73#1:189,3\n69#1:140,6\n75#1:147\n81#1:148\n101#1:184\n110#1:185\n111#1:186\n118#1:187\n119#1:188\n73#1:149,6\n73#1:183\n73#1:193\n73#1:155,11\n73#1:192\n73#1:174,6\n*E\n"})
public final class o0O000Oo {

    public static final class OooO00o extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f50987OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Drawable drawable) {
            super(1);
            this.f50987OooO0Oo = drawable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Drawable drawable = this.f50987OooO0Oo;
            if (drawable != null) {
                int iM1505getWidthimpl = (int) Size.m1505getWidthimpl(drawBehind.mo2108getSizeNHjbRc());
                int iM1502getHeightimpl = (int) Size.m1502getHeightimpl(drawBehind.mo2108getSizeNHjbRc());
                Intrinsics.checkNotNullParameter(drawable, "<this>");
                drawable.setBounds(0, 0, iM1505getWidthimpl, iM1502getHeightimpl);
            }
            if (drawable != null) {
                drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f50988OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Context f50989OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f50990OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MomentDetailModel momentDetailModel, Context context) {
            super(0);
            this.f50988OooO0Oo = z;
            this.f50990OooO0o0 = momentDetailModel;
            this.f50989OooO0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String circleName;
            if (!this.f50988OooO0Oo) {
                MomentDetailModel momentDetailModel = this.f50990OooO0o0;
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
                    int i = TopicDetailActivity.f26305OooOoOO;
                    TopicDetailActivity.OooO00o.OooO00o(this.f50989OooO0o, topicInfoModel);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f50991OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50992OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f50993OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50994OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, MomentDetailModel momentDetailModel, int i, int i2) {
            super(2);
            this.f50991OooO0Oo = modifier;
            this.f50993OooO0o0 = momentDetailModel;
            this.f50992OooO0o = i;
            this.f50994OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50992OooO0o | 1);
            MomentDetailModel momentDetailModel = this.f50993OooO0o0;
            int i = this.f50994OooO0oO;
            o0O000Oo.OooO0O0(this.f50991OooO0Oo, momentDetailModel, composer, iUpdateChangedFlags, i);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, int i2, @Nullable Composer composer, @Nullable Modifier modifier) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(309696291);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(309696291, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentTopicEnterComp (MomentTopicEnterComp.kt:39)");
            }
            if (((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0O000O(modifier, i, i2));
                return;
            }
            MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0O.f51348OooO0O0);
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
            if (((momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest || momentAdapterTag == MomentAdapterTag.PostDetailActivity || ((Boolean) composerStartRestartGroup.consume(oo0O.f51347OooO00o)).booleanValue()) ? false : true) && momentDetailModel.getContent() != null) {
                MomentSendContentModel content = momentDetailModel.getContent();
                if (o0OoOo0.OooOO0(content != null ? Long.valueOf(content.getCircleId()) : null) > 0 && !momentDetailModel.getCircleDisbanded()) {
                    OooO0O0(modifier, momentDetailModel, composerStartRestartGroup, (i3 & 14) | 64, 0);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o0OoOoOo(modifier, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(Modifier modifier, MomentDetailModel momentDetailModel, Composer composer, int i, int i2) {
        String circleName;
        Composer composerStartRestartGroup = composer.startRestartGroup(-931640365);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-931640365, i, -1, "com.yalla.yalla.ui.composable.moment.MomentTopicEnterContent (MomentTopicEnterComp.kt:62)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            int i3 = oO00OOO.ic_moment_topic_enter_bg;
            Object obj = ContextCompat.f5271OooO00o;
            objRememberedValue = ContextCompat.OooO0OO.OooO0O0(context, i3);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51346OooO)).booleanValue();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m478paddingVpY3zN4$default(DrawModifierKt.drawBehind(ClipKt.clip(SizeKt.m509height3ABfNKs(companion.then(modifier2), Dp.m3765constructorimpl(27)), RoundedCornerShapeKt.getCircleShape()), new OooO00o((Drawable) objRememberedValue)), Dp.m3765constructorimpl(8), 0.0f, 2, null), false, false, 0L, false, null, null, null, new OooO0O0(zBooleanValue, momentDetailModel, context), 253);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f = 15;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_moment_topic_enter, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        MomentSendContentModel content = momentDetailModel.getContent();
        if (content == null || (circleName = content.getCircleName()) == null) {
            circleName = "";
        }
        Modifier modifier3 = modifier2;
        TextKt.m1251Text4IGK_g(circleName, SizeKt.m530widthInVpY3zN4$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(24), 0.0f, 2, null), ColorKt.Color(4278239411L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3504, 0, 65520);
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_moment_topic_enter_arrow, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(modifier3, momentDetailModel, i, i2));
    }
}
