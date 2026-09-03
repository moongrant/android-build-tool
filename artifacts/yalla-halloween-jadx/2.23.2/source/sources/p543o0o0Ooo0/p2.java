package p543o0o0Ooo0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import androidx.compose.animation.Oooo000;
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
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000O0;
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
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p121o00O0Ooo.o0000;
import p200o00o0OoO.o00OO00O;
import p203o00o0o00.o000O0o;
import p203o00o0o00.o000Oo0;
import p423o0OoO0OO.o000OO;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserOutFitDialogContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,284:1\n154#2:285\n154#2:286\n154#2:287\n154#2:288\n154#2:289\n154#2:361\n154#2:397\n154#2:398\n154#2:399\n154#2:407\n154#2:443\n154#2:444\n154#2:445\n154#2:496\n154#2:497\n66#3,6:290\n72#3:324\n66#3,6:362\n72#3:396\n66#3,6:408\n72#3:442\n76#3:490\n76#3:495\n76#3:507\n78#4,11:296\n78#4,11:332\n78#4,11:368\n78#4,11:414\n78#4,11:452\n91#4:484\n91#4:489\n91#4:494\n91#4:501\n91#4:506\n456#5,8:307\n464#5,3:321\n456#5,8:343\n464#5,3:357\n456#5,8:379\n464#5,3:393\n36#5:400\n456#5,8:425\n464#5,3:439\n456#5,8:463\n464#5,3:477\n467#5,3:481\n467#5,3:486\n467#5,3:491\n467#5,3:498\n467#5,3:503\n4144#6,6:315\n4144#6,6:351\n4144#6,6:387\n4144#6,6:433\n4144#6,6:471\n76#7:325\n72#8,6:326\n78#8:360\n82#8:502\n1097#9,6:401\n73#10,6:446\n79#10:480\n83#10:485\n*S KotlinDebug\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt\n*L\n81#1:285\n84#1:286\n85#1:287\n178#1:288\n179#1:289\n207#1:361\n217#1:397\n225#1:398\n226#1:399\n234#1:407\n245#1:443\n251#1:444\n252#1:445\n272#1:496\n280#1:497\n176#1:290,6\n176#1:324\n207#1:362,6\n207#1:396\n232#1:408,6\n232#1:442\n232#1:490\n207#1:495\n176#1:507\n176#1:296,11\n199#1:332,11\n207#1:368,11\n232#1:414,11\n249#1:452,11\n249#1:484\n232#1:489\n207#1:494\n199#1:501\n176#1:506\n176#1:307,8\n176#1:321,3\n199#1:343,8\n199#1:357,3\n207#1:379,8\n207#1:393,3\n227#1:400\n232#1:425,8\n232#1:439,3\n249#1:463,8\n249#1:477,3\n249#1:481,3\n232#1:486,3\n207#1:491,3\n199#1:498,3\n176#1:503,3\n176#1:315,6\n199#1:351,6\n207#1:387,6\n232#1:433,6\n249#1:471,6\n181#1:325\n199#1:326,6\n199#1:360\n199#1:502\n227#1:401,6\n249#1:446,6\n249#1:480\n249#1:485\n*E\n"})
public final class p2 {

    @SourceDebugExtension({"SMAP\nUserOutFitDialogContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt$ProfilePreView$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,284:1\n154#2:285\n154#2:286\n154#2:287\n154#2:289\n154#2:326\n154#2:327\n154#2:333\n154#2:341\n154#2:342\n75#3:288\n58#3:290\n66#4,6:291\n72#4:325\n76#4:332\n78#5,11:297\n91#5:331\n456#6,8:308\n464#6,3:322\n467#6,3:328\n36#6:334\n4144#7,6:316\n1097#8,6:335\n81#9:343\n*S KotlinDebug\n*F\n+ 1 UserOutFitDialogContent.kt\ncom/yalla/yalla/ui/screen/user/UserOutFitDialogContentKt$ProfilePreView$1\n*L\n99#1:285\n101#1:286\n107#1:287\n109#1:289\n120#1:326\n123#1:327\n143#1:333\n158#1:341\n168#1:342\n109#1:288\n109#1:290\n103#1:291,6\n103#1:325\n103#1:332\n103#1:297,11\n103#1:331\n103#1:308,8\n103#1:322,3\n103#1:328,3\n144#1:334\n103#1:316,6\n144#1:335,6\n150#1:343\n*E\n"})
    public static final class OooO extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PreConfig f55642OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55643OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PreConfig preConfig, Function0<Unit> function0, int i) {
            super(3);
            this.f55642OooO0Oo = preConfig;
            this.f55643OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573573123, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ProfilePreView.<anonymous> (UserOutFitDialogContent.kt:87)");
                }
                boolean zOooO0o0 = OooOo00.OooO0o0();
                PreConfig preConfig = this.f55642OooO0Oo;
                o0000 o0000VarOooO0OO = o000OO.OooO0OO(zOooO0o0 ? preConfig.getRoomBackgroundRTLUrl() : preConfig.getRoomBackgroundUrl(), q2.f55665OooO0Oo, composer2, 48, 0);
                ContentScale.Companion companion = ContentScale.INSTANCE;
                ContentScale fillWidth = companion.getFillWidth();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f = 16;
                ImageKt.Image(o0000VarOooO0OO, "", o00O0O0.OooO00o(f, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null)), (Alignment) null, fillWidth, 0.0f, (ColorFilter) null, composer2, 24624, 104);
                float fM3775constructorimpl = Dp.m3775constructorimpl(13);
                float f2 = 0;
                Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(BackgroundKt.m170backgroundbw27NRU(companion2, o0OOo000.f48135OooO0O0, RoundedCornerShapeKt.m730RoundedCornerShapea9UjIt4(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2))), Dp.m3775constructorimpl(Dp.m3775constructorimpl(BoxWithConstraints.mo417getMaxHeightD9Ej5fM() / 2) - Dp.m3775constructorimpl(6)));
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BoxWithConstraints.align(modifierM511height3ABfNKs, companion3.getBottomCenter()), 0.0f, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ImageKt.Image(o000OO.OooO0OO(preConfig.getBackgroundUrl(), r2.f55673OooO0Oo, composer2, 48, 0), "", ClipKt.clip(SizeKt.fillMaxWidth$default(BoxScopeInstance.INSTANCE.align(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(40), 7, null), companion3.getTopCenter()), 0.0f, 1, null), RoundedCornerShapeKt.m730RoundedCornerShapea9UjIt4(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2))), (Alignment) null, companion.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                String backgroundEffectsUrl = preConfig.getBackgroundEffectsUrl();
                if (backgroundEffectsUrl == null) {
                    backgroundEffectsUrl = "";
                }
                o00OO00O.OooO00o(backgroundEffectsUrl, true, 0, null, null, BoxWithConstraints.align(SizeKt.fillMaxSize$default(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, fM3775constructorimpl, 0.0f, 0.0f, 13, null), 0.0f, 1, null), companion3.getCenter()), composer2, 48, 28);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(o0O0O00.ic_profile_back, composer2, 0);
                float f3 = 12;
                Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(BoxWithConstraints.align(companion2, companion3.getTopEnd()), 0.0f, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 0.0f, 9, null);
                composer2.startReplaceableGroup(1157296644);
                Function0<Unit> function0 = this.f55643OooO0o0;
                boolean zChanged = composer2.changed(function0);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new s2(function0);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0000 o0000VarOooO0O0 = o000OO.OooO0O0((String) LiveDataAdapterKt.observeAsState(o0O00oO0.OooO(), composer2, 8).getValue(), null, composer2, 0, 1);
                ContentScale crop = companion.getCrop();
                Modifier modifierClip = ClipKt.clip(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, fM3775constructorimpl, 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.getCircleShape());
                float f4 = 72;
                ImageKt.Image(o0000VarOooO0O0, (String) null, BoxWithConstraints.align(SizeKt.m525size3ABfNKs(modifierClip, Dp.m3775constructorimpl(f4)), companion3.getCenter()), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer2, 24624, 104);
                ImageKt.Image(o000OO.OooO0OO(preConfig.getAvatarBorder(), null, composer2, 0, 1), (String) null, BoxWithConstraints.align(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, fM3775constructorimpl, 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(f4)), companion3.getCenter()), (Alignment) null, companion.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55644OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(1);
            this.f55644OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o000OO.OooO0o(it, o000O0o.OooO00o(this.f55644OooO0Oo, o0O0O00.entrance_effect_preview_default_bg, CollectionsKt.listOf(new o000Oo0(42, FacebookRequestErrorClassification.EC_INVALID_TOKEN)), CollectionsKt.listOf(new o000Oo0(42, 278))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55645OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o000OO.OooO0o(it, new ColorDrawable(0));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55646OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0) {
            super(0);
            this.f55646OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55646OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PreConfig f55647OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55648OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f55649OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55650OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(PreConfig preConfig, String str, Function0<Unit> function0, int i) {
            super(2);
            this.f55647OooO0Oo = preConfig;
            this.f55649OooO0o0 = str;
            this.f55648OooO0o = function0;
            this.f55650OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55650OooO0oO | 1);
            String str = this.f55649OooO0o0;
            Function0<Unit> function0 = this.f55648OooO0o;
            p2.OooO00o(this.f55647OooO0Oo, str, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PreConfig f55651OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55652OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55653OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PreConfig preConfig, Function0<Unit> function0, int i) {
            super(2);
            this.f55651OooO0Oo = preConfig;
            this.f55653OooO0o0 = function0;
            this.f55652OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55652OooO0o | 1);
            p2.OooO0O0(this.f55651OooO0Oo, this.f55653OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55654OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
            super(0);
            this.f55654OooO0Oo = entranceEffectProfileCardVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55654OooO0Oo.getShowProfilePreViewDialog().setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55655OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55656OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f55657OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(EntranceEffectProfileCardVM entranceEffectProfileCardVM, UserMyOutFitModel userMyOutFitModel, int i) {
            super(2);
            this.f55655OooO0Oo = entranceEffectProfileCardVM;
            this.f55657OooO0o0 = userMyOutFitModel;
            this.f55656OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55656OooO0o | 1);
            p2.OooO0OO(this.f55655OooO0Oo, this.f55657OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55658OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
            super(0);
            this.f55658OooO0Oo = entranceEffectProfileCardVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55658OooO0Oo.getShowProfilePreViewDialog().setValue(Boolean.FALSE);
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
        Modifier modifierClip = ClipKt.clip(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2)));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        o0000 o0000VarOooO0OO = o000OO.OooO0OO(model.getMaskUrl(), new OooO00o((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 0, 0);
        Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
        ContentScale.Companion companion4 = ContentScale.INSTANCE;
        ImageKt.Image(o0000VarOooO0OO, (String) null, modifierMatchParentSize, (Alignment) null, companion4.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String backgroundRTLUrl = OooOo00.OooO0o0() ? model.getBackgroundRTLUrl() : model.getBackgroundUrl();
        float f3 = 4;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        float f4 = 8;
        ImageKt.Image(o000OO.OooO0OO(backgroundRTLUrl, OooO0O0.f55645OooO0Oo, composerStartRestartGroup, 48, 0), "", o00O0O0.OooO00o(f4, AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.9722222f, false, 2, null)), (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(o0O0O00.ic_profile_back, composerStartRestartGroup, 0);
        float f5 = 23;
        Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopEnd()), 0.0f, Dp.m3775constructorimpl(f4), Dp.m3775constructorimpl(f4), 0.0f, 9, null), Dp.m3775constructorimpl(f5));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(onClose);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0OO(onClose);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m204clickableXHw0xAI$default(modifierM525size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f4), Dp.m3775constructorimpl(Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED), Dp.m3775constructorimpl(27), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o3 = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default2);
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
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO00o3, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        String effectsUrl2 = model.getEffectsUrl();
        if (!(effectsUrl2 != null && StringsKt__StringsJVMKt.endsWith$default(effectsUrl2, ".svga", false, 2, null)) ? (effectsUrl = model.getEffectsUrl()) == null || (strOooO0oO = p184o00o00O0.OooO0OO.OooO0oO(o0000O0.OooO00o(246), o0000O0.OooO00o(60), effectsUrl)) == null : (strOooO0oO = model.getEffectsUrl()) == null) {
            strOooO0oO = "";
        }
        float f6 = 60;
        o00OO00O.OooO00o(strOooO0oO, true, 0, null, null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f6), 0.0f, 2, null), composerStartRestartGroup, 6), composerStartRestartGroup, 48, 28);
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(62), 0.0f, Dp.m3775constructorimpl(38), 0.0f, 10, null), Dp.m3775constructorimpl(f6));
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO0O1, composerM1320constructorimpl5, currentCompositionLocalMap5);
        if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String strStringResource = StringResources_androidKt.stringResource(o000000.entrance_effect_preview_user_enter, composerStartRestartGroup, 0);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        String textColor = model.getTextColor();
        TextKt.m1261Text4IGK_g(strStringResource, rowScopeInstance.weight(companion, 1.0f, false), (textColor == null || (colorOooO00o = com.code.android.util.OooO0o.OooO00o(textColor)) == null) ? o0OOo000.f48135OooO0O0 : colorOooO00o.m1691unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3072, 3120, 55280);
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
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Description, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f7), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f7), 0.0f, 8, null), o0OOo000.f48146OooOOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        TextKt.m1261Text4IGK_g(description, PaddingKt.m481paddingqDBjuR0(companion, Dp.m3775constructorimpl(f7), Dp.m3775constructorimpl(6), Dp.m3775constructorimpl(f7), Dp.m3775constructorimpl(f5)), o0OOo000.f48149OooOOo, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 3) & 14) | 3120, 0, 131056);
        if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
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
        Modifier modifierOooO00o = o00O0O0.OooO00o(f2, AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null), 0.0f, 1, null), 0.75f, false, 2, null));
        float fM3775constructorimpl = Dp.m3775constructorimpl(1);
        int i2 = o0OOo000.f48347o00OOooO;
        BoxWithConstraintsKt.BoxWithConstraints(BorderKt.m182borderxT4_qwU(modifierOooO00o, fM3775constructorimpl, Color.m1680copywmQWz5c$default(o0OOo000.f48270o000o0Oo, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2))), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1573573123, true, new OooO(preConfig, onClose, i)), composerStartRestartGroup, 3072, 6);
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
            ComposerKt.traceEventStart(874837404, i, -1, "com.yalla.yalla.ui.screen.user.UserOutFitDialogContent (UserOutFitDialogContent.kt:59)");
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
