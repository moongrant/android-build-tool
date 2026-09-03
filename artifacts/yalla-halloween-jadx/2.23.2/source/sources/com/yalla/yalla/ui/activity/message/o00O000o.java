package com.yalla.yalla.ui.activity.message;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPrivateChatNotFriendComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatNotFriendComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatNotFriendCompKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,103:1\n154#2:104\n154#2:105\n154#2:106\n154#2:138\n154#2:139\n154#2:146\n154#2:147\n154#2:148\n77#3,2:107\n79#3:137\n83#3:145\n73#3,6:149\n79#3:183\n83#3:189\n78#4,11:109\n91#4:144\n78#4,11:155\n91#4:188\n456#5,8:120\n464#5,3:134\n467#5,3:141\n456#5,8:166\n464#5,3:180\n467#5,3:185\n4144#6,6:128\n4144#6,6:174\n76#7:140\n76#7:184\n*S KotlinDebug\n*F\n+ 1 PrivateChatNotFriendComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatNotFriendCompKt\n*L\n39#1:104\n40#1:105\n51#1:106\n56#1:138\n58#1:139\n79#1:146\n80#1:147\n96#1:148\n34#1:107,2\n34#1:137\n34#1:145\n93#1:149,6\n93#1:183\n93#1:189\n34#1:109,11\n34#1:144\n93#1:155,11\n93#1:188\n34#1:120,8\n34#1:134,3\n34#1:141,3\n93#1:166,8\n93#1:180,3\n93#1:185,3\n34#1:128,6\n93#1:174,6\n60#1:140\n100#1:184\n*E\n"})
public final class o00O000o {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f25419OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f25420OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f25421OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo000 oooo000, AppCompatActivity appCompatActivity) {
            super(0);
            this.f25420OooO0Oo = oooo000;
            this.f25421OooO0o0 = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("104019");
            Oooo000 oooo000 = this.f25420OooO0Oo;
            if (oooo000.OooO0O0().userInfo() != null) {
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                AppCompatActivity appCompatActivity = this.f25421OooO0o0;
                UserInfo userInfo = oooo000.OooO0O0().userInfo();
                Intrinsics.checkNotNull(userInfo);
                UserInfoActivity.OooO00o.OooO0O0(appCompatActivity, androidx.media3.session.o0000O00.OooO00o(userInfo.getUserId()), true, false, true, false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f25422OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo000 oooo000) {
            super(0);
            this.f25422OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Oooo000 oooo000 = this.f25422OooO0Oo;
            p434o0OoOOOO.o00O0OO o00o0oo2 = oooo000.f25225OooO0O0;
            if (o00o0oo2 != null) {
                o00o0oo2.OooO0O0(oooo000);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f25423OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25424OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f25425OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(RowScope rowScope, Oooo000 oooo000, int i) {
            super(2);
            this.f25423OooO0Oo = rowScope;
            this.f25425OooO0o0 = oooo000;
            this.f25424OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25424OooO0o | 1);
            o00O000o.OooO00o(this.f25423OooO0Oo, this.f25425OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull RowScope rowScope, @NotNull Oooo000 chatBottomState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1588018105);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1588018105, i, -1, "com.yalla.yalla.ui.activity.message.PrivateChatNotFriendComp (PrivateChatNotFriendComp.kt:32)");
        }
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 15;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, BackgroundKt.background$default(ClipKt.clip(PaddingKt.m479paddingVpY3zN4(SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(54), 0.0f, 2, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(8)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m1636horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(ColorKt.Color(4284081889L)), Color.m1671boximpl(o0OOo000.f48185Ooooo00)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 1.0f, false, 2, null), Dp.m3775constructorimpl(38)), false, false, 0L, false, null, null, null, OooO00o.f25419OooO0Oo, 255);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_private_chat_add_friend, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.become_friend_to_chat, composerStartRestartGroup, 0), com.code.android.util.o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, new OooO0O0(chatBottomState, objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null), 253), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65520);
        o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_private_chat_not_friend_gift, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(ClipKt.clip(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(6), 3, null), Dp.m3775constructorimpl(42)), RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, new OooO0OO(chatBottomState), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(rowScope, chatBottomState, i));
    }
}
