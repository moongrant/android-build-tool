package p536o0o0Oo0o;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.model.user.PreConfig;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import io.agora.rtc.Constants;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoo.o0000O0;
import p150o00Oo0oO.o00000OO;
import p154o00OoO00.OooOo00;
import p417o0OoO0.o00Oo0;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserOutFitDialogContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,284:1\n154#2:285\n154#2:286\n154#2:287\n154#2:288\n154#2:289\n154#2:361\n154#2:397\n154#2:398\n154#2:399\n154#2:407\n154#2:443\n154#2:444\n154#2:445\n154#2:496\n154#2:497\n66#3,6:290\n72#3:324\n66#3,6:362\n72#3:396\n66#3,6:408\n72#3:442\n76#3:490\n76#3:495\n76#3:507\n78#4,11:296\n78#4,11:332\n78#4,11:368\n78#4,11:414\n78#4,11:452\n91#4:484\n91#4:489\n91#4:494\n91#4:501\n91#4:506\n456#5,8:307\n464#5,3:321\n456#5,8:343\n464#5,3:357\n456#5,8:379\n464#5,3:393\n36#5:400\n456#5,8:425\n464#5,3:439\n456#5,8:463\n464#5,3:477\n467#5,3:481\n467#5,3:486\n467#5,3:491\n467#5,3:498\n467#5,3:503\n4144#6,6:315\n4144#6,6:351\n4144#6,6:387\n4144#6,6:433\n4144#6,6:471\n76#7:325\n72#8,6:326\n78#8:360\n82#8:502\n1097#9,6:401\n73#10,6:446\n79#10:480\n83#10:485\n*S KotlinDebug\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt\n*L\n81#1:285\n84#1:286\n85#1:287\n178#1:288\n179#1:289\n207#1:361\n217#1:397\n225#1:398\n226#1:399\n234#1:407\n245#1:443\n251#1:444\n252#1:445\n272#1:496\n280#1:497\n176#1:290,6\n176#1:324\n207#1:362,6\n207#1:396\n232#1:408,6\n232#1:442\n232#1:490\n207#1:495\n176#1:507\n176#1:296,11\n199#1:332,11\n207#1:368,11\n232#1:414,11\n249#1:452,11\n249#1:484\n232#1:489\n207#1:494\n199#1:501\n176#1:506\n176#1:307,8\n176#1:321,3\n199#1:343,8\n199#1:357,3\n207#1:379,8\n207#1:393,3\n227#1:400\n232#1:425,8\n232#1:439,3\n249#1:463,8\n249#1:477,3\n249#1:481,3\n232#1:486,3\n207#1:491,3\n199#1:498,3\n176#1:503,3\n176#1:315,6\n199#1:351,6\n207#1:387,6\n232#1:433,6\n249#1:471,6\n181#1:325\n199#1:326,6\n199#1:360\n199#1:502\n227#1:401,6\n249#1:446,6\n249#1:480\n249#1:485\n*E\n"})
public final class Oo0000 {

    @SourceDebugExtension({"SMAP\nUserOutFitDialogContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt$ProfilePreView$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,284:1\n154#2:285\n154#2:286\n154#2:287\n154#2:289\n154#2:326\n154#2:327\n154#2:333\n154#2:341\n154#2:342\n75#3:288\n58#3:290\n66#4,6:291\n72#4:325\n76#4:332\n78#5,11:297\n91#5:331\n456#6,8:308\n464#6,3:322\n467#6,3:328\n36#6:334\n4144#7,6:316\n1097#8,6:335\n81#9:343\n*S KotlinDebug\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt$ProfilePreView$1\n*L\n99#1:285\n101#1:286\n107#1:287\n109#1:289\n120#1:326\n123#1:327\n143#1:333\n158#1:341\n168#1:342\n109#1:288\n109#1:290\n103#1:291,6\n103#1:325\n103#1:332\n103#1:297,11\n103#1:331\n103#1:308,8\n103#1:322,3\n103#1:328,3\n144#1:334\n103#1:316,6\n144#1:335,6\n150#1:343\n*E\n"})
    public static final class OooO extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PreConfig f54905OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54906OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PreConfig preConfig, Function0<Unit> function0, int i) {
            super(3);
            this.f54905OooO0Oo = preConfig;
            this.f54906OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            int i;
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573573123, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ProfilePreView.<anonymous> (UserOutFitDialogContent.kt:85)");
                }
                boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
                PreConfig preConfig = this.f54905OooO0Oo;
                o0000O0 o0000o0OooO0OO = o00Oo0.OooO0OO(zOooO0o0 ? preConfig.getRoomBackgroundRTLUrl() : preConfig.getRoomBackgroundUrl(), a.f54922OooO0Oo, composer2, 48, 0);
                ContentScale.Companion companion = ContentScale.INSTANCE;
                ContentScale fillWidth = companion.getFillWidth();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f = 16;
                ImageKt.Image(o0000o0OooO0OO, "", OooOo.OooO0O0(f, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null)), (Alignment) null, fillWidth, 0.0f, (ColorFilter) null, composer2, 24624, 104);
                float fM3765constructorimpl = Dp.m3765constructorimpl(13);
                float f2 = 0;
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(BackgroundKt.m168backgroundbw27NRU(companion2, o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2))), Dp.m3765constructorimpl(Dp.m3765constructorimpl(BoxWithConstraints.mo415getMaxHeightD9Ej5fM() / 2) - Dp.m3765constructorimpl(6)));
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BoxWithConstraints.align(modifierM509height3ABfNKs, companion3.getBottomCenter()), 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ImageKt.Image(o00Oo0.OooO0OO(preConfig.getBackgroundUrl(), b.f54923OooO0Oo, composer2, 48, 0), "", ClipKt.clip(SizeKt.fillMaxWidth$default(BoxScopeInstance.INSTANCE.align(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(40), 7, null), companion3.getTopCenter()), 0.0f, 1, null), RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2))), (Alignment) null, companion.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                String backgroundEffectsUrl = preConfig.getBackgroundEffectsUrl();
                if (backgroundEffectsUrl == null) {
                    backgroundEffectsUrl = "";
                }
                OooOo00.OooO00o(backgroundEffectsUrl, true, 0, null, null, BoxWithConstraints.align(SizeKt.fillMaxSize$default(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, fM3765constructorimpl, 0.0f, 0.0f, 13, null), 0.0f, 1, null), companion3.getCenter()), composer2, 48, 28);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_profile_back, composer2, 0);
                float f3 = 12;
                Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(BoxWithConstraints.align(companion2, companion3.getTopEnd()), 0.0f, Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f3), 0.0f, 9, null);
                composer2.startReplaceableGroup(1157296644);
                Function0<Unit> function0 = this.f54906OooO0o0;
                boolean zChanged = composer2.changed(function0);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new c(function0);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m202clickableXHw0xAI$default(modifierM480paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o0000O0 o0000o0OooO0O0 = o00Oo0.OooO0O0((String) LiveDataAdapterKt.observeAsState(o000000O.OooO(), composer2, 8).getValue(), null, composer2, 0, 1);
                ContentScale crop = companion.getCrop();
                Modifier modifierClip = ClipKt.clip(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, fM3765constructorimpl, 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.getCircleShape());
                float f4 = 72;
                ImageKt.Image(o0000o0OooO0O0, (String) null, BoxWithConstraints.align(SizeKt.m523size3ABfNKs(modifierClip, Dp.m3765constructorimpl(f4)), companion3.getCenter()), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer2, 24624, 104);
                ImageKt.Image(o00Oo0.OooO0OO(preConfig.getAvatarBorder(), null, composer2, 0, 1), (String) null, BoxWithConstraints.align(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, fM3765constructorimpl, 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(f4)), companion3.getCenter()), (Alignment) null, companion.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f54907OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(1);
            this.f54907OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o00Oo0.OooO0o(it, p155o00OoO0o.OooOO0.OooO00o(this.f54907OooO0Oo, oO00OOO.entrance_effect_preview_default_bg, CollectionsKt.listOf(new p155o00OoO0o.OooOO0O(42, FacebookRequestErrorClassification.EC_INVALID_TOKEN)), CollectionsKt.listOf(new p155o00OoO0o.OooOO0O(42, 278))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54908OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o00Oo0.OooO0o(it, new ColorDrawable(0));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54909OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0) {
            super(0);
            this.f54909OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54909OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PreConfig f54910OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54911OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54912OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54913OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(PreConfig preConfig, String str, Function0<Unit> function0, int i) {
            super(2);
            this.f54910OooO0Oo = preConfig;
            this.f54912OooO0o0 = str;
            this.f54911OooO0o = function0;
            this.f54913OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54913OooO0oO | 1);
            String str = this.f54912OooO0o0;
            Function0<Unit> function0 = this.f54911OooO0o;
            Oo0000.OooO00o(this.f54910OooO0Oo, str, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PreConfig f54914OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54915OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54916OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PreConfig preConfig, Function0<Unit> function0, int i) {
            super(2);
            this.f54914OooO0Oo = preConfig;
            this.f54916OooO0o0 = function0;
            this.f54915OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54915OooO0o | 1);
            Oo0000.OooO0O0(this.f54914OooO0Oo, this.f54916OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f54917OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
            super(0);
            this.f54917OooO0Oo = entranceEffectProfileCardVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54917OooO0Oo.getShowProfilePreViewDialog().setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f54918OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54919OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f54920OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(EntranceEffectProfileCardVM entranceEffectProfileCardVM, UserMyOutFitModel userMyOutFitModel, int i) {
            super(2);
            this.f54918OooO0Oo = entranceEffectProfileCardVM;
            this.f54920OooO0o0 = userMyOutFitModel;
            this.f54919OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54919OooO0o | 1);
            Oo0000.OooO0OO(this.f54918OooO0Oo, this.f54920OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f54921OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
            super(0);
            this.f54921OooO0Oo = entranceEffectProfileCardVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54921OooO0Oo.getShowProfilePreViewDialog().setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull PreConfig model, @NotNull String description, @NotNull Function0<Unit> onClose, @Nullable Composer composer, int i) {
        String effectsUrl;
        String strOooO0oO;
        Color colorOooO00o;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(727208188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727208188, i, -1, "com.yalla.yalla.ui.screen.user.EntranceEffectPreView (UserOutFitDialogContent.kt:174)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 36;
        float f2 = 12;
        Modifier modifierClip = ClipKt.clip(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2)));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
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
        o0000O0 o0000o0OooO0OO = o00Oo0.OooO0OO(model.getMaskUrl(), new OooO00o((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 0, 0);
        Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
        ContentScale.Companion companion4 = ContentScale.INSTANCE;
        ImageKt.Image(o0000o0OooO0OO, (String) null, modifierMatchParentSize, (Alignment) null, companion4.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String backgroundRTLUrl = p591o0oo000O.OooO.OooO0o0() ? model.getBackgroundRTLUrl() : model.getBackgroundUrl();
        float f3 = 4;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f3), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        float f4 = 8;
        ImageKt.Image(o00Oo0.OooO0OO(backgroundRTLUrl, OooO0O0.f54908OooO0Oo, composerStartRestartGroup, 48, 0), "", OooOo.OooO0O0(f4, AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.9722222f, false, 2, null)), (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_profile_back, composerStartRestartGroup, 0);
        float f5 = 23;
        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopEnd()), 0.0f, Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(f4), 0.0f, 9, null), Dp.m3765constructorimpl(f5));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(onClose);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0OO(onClose);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m202clickableXHw0xAI$default(modifierM523size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        Modifier modifierM480paddingqDBjuR0$default2 = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED), Dp.m3765constructorimpl(27), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o4 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default2);
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
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        String effectsUrl2 = model.getEffectsUrl();
        if (!(effectsUrl2 != null && StringsKt.OooOO0O(effectsUrl2, ".svga")) ? (effectsUrl = model.getEffectsUrl()) == null || (strOooO0oO = p139o00OOooO.OooO0o.OooO0oO(com.code.android.util.o0000O0.OooO00o(246), com.code.android.util.o0000O0.OooO00o(60), effectsUrl)) == null : (strOooO0oO = model.getEffectsUrl()) == null) {
            strOooO0oO = "";
        }
        float f6 = 60;
        OooOo00.OooO00o(strOooO0oO, true, 0, null, null, o0O0O00.OooO0Oo(SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f6), 0.0f, 2, null), composerStartRestartGroup, 6), composerStartRestartGroup, 48, 28);
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(62), 0.0f, Dp.m3765constructorimpl(38), 0.0f, 10, null), Dp.m3765constructorimpl(f6));
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
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
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl5, measurePolicyOooO00o5, composerM1309constructorimpl5, currentCompositionLocalMap5);
        if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.entrance_effect_preview_user_enter, composerStartRestartGroup, 0);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        String textColor = model.getTextColor();
        TextKt.m1251Text4IGK_g(strStringResource, rowScopeInstance.weight(companion, 1.0f, false), (textColor == null || (colorOooO00o = com.code.android.util.OooO0o.OooO00o(textColor)) == null) ? o0oO0O0o.f46946OooO0O0 : colorOooO00o.m1680unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3072, 3120, 55280);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float f7 = 15;
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Description, composerStartRestartGroup, 0), PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f7), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f7), 0.0f, 8, null), o0oO0O0o.f46957OooOOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        TextKt.m1251Text4IGK_g(description, PaddingKt.m479paddingqDBjuR0(companion, Dp.m3765constructorimpl(f7), Dp.m3765constructorimpl(6), Dp.m3765constructorimpl(f7), Dp.m3765constructorimpl(f5)), o0oO0O0o.f46960OooOOo, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 3) & 14) | 3120, 0, 131056);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(model, description, onClose, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull PreConfig preConfig, @NotNull Function0<Unit> onClose, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(preConfig, "preConfig");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1721692263);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1721692263, i, -1, "com.yalla.yalla.ui.screen.user.ProfilePreView (UserOutFitDialogContent.kt:77)");
        }
        float f = 38;
        float f2 = 16;
        Modifier modifierOooO0O0 = OooOo.OooO0O0(f2, AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null), 0.0f, 1, null), 0.75f, false, 2, null));
        float fM3765constructorimpl = Dp.m3765constructorimpl(1);
        int i2 = o0oO0O0o.f47152o00OOOo;
        BoxWithConstraintsKt.BoxWithConstraints(BorderKt.m180borderxT4_qwU(modifierOooO0O0, fM3765constructorimpl, Color.m1669copywmQWz5c$default(o0oO0O0o.f47079o000o0O0, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1573573123, true, new OooO(preConfig, onClose, i)), composerStartRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(preConfig, onClose, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull EntranceEffectProfileCardVM viewModel, @NotNull UserMyOutFitModel userMyOutFitModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(userMyOutFitModel, "userMyOutFitModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(874837404);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874837404, i, -1, "com.yalla.yalla.ui.screen.user.UserOutFitDialogContent (UserOutFitDialogContent.kt:56)");
        }
        if (viewModel.getPageType() == 1) {
            composerStartRestartGroup.startReplaceableGroup(-1262245556);
            PreConfig preConfig = userMyOutFitModel.getPreConfig();
            if (preConfig != null) {
                OooO0O0(preConfig, new OooOO0O(viewModel), composerStartRestartGroup, 8);
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else if (viewModel.getPageType() == 0) {
            composerStartRestartGroup.startReplaceableGroup(-1262245312);
            PreConfig preConfig2 = userMyOutFitModel.getPreConfig();
            if (preConfig2 != null) {
                String shopDesc = userMyOutFitModel.getShopDesc();
                if (shopDesc == null) {
                    shopDesc = "";
                }
                OooO00o(preConfig2, shopDesc, new OooOOO0(viewModel), composerStartRestartGroup, 8);
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1262245099);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(viewModel, userMyOutFitModel, i));
    }
}
