package com.yalla.yalla.ui.screen.message;

import android.os.Bundle;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p130o00O0oo.o000O00O;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000Oo0;
import p193o00o0O0O.o0000oo;
import p195o00o0OO0.o00000OO;
import p423o0OoO0OO.o000OO;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/screen/message/YallaTeamImageMessageScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "", "Key_Title", "Ljava/lang/String;", "Key_ImageUrl", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nYallaTeamImageMessageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamImageMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/YallaTeamImageMessageScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,55:1\n76#2:56\n72#3,6:57\n78#3:91\n82#3:96\n78#4,11:63\n91#4:95\n456#5,8:74\n464#5,3:88\n467#5,3:92\n4144#6,6:82\n*S KotlinDebug\n*F\n+ 1 YallaTeamImageMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/YallaTeamImageMessageScreen\n*L\n32#1:56\n35#1:57,6\n35#1:91\n35#1:96\n35#1:63,11\n35#1:95\n35#1:74,8\n35#1:88,3\n35#1:92,3\n35#1:82,6\n*E\n"})
public final class YallaTeamImageMessageScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final YallaTeamImageMessageScreen INSTANCE = new YallaTeamImageMessageScreen();

    @NotNull
    public static final String Key_ImageUrl = "ImageUrl";

    @NotNull
    public static final String Key_Title = "Title";

    public static final class OooO00o extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f28691OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o000Oo0.OooO0O0 oooO0O0 = o000Oo0.OooO0O0.f36778OooO00o;
            it.getClass();
            it.f11713Oooo0OO = new o000O00O(new o000O0Oo(oooO0O0, oooO0O0));
            it.OooO0o0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28693OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f28694OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f28694OooO0o0 = columnScope;
            this.f28693OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28693OooO0o | 1);
            YallaTeamImageMessageScreen.this.Content(this.f28694OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Bundle f28695OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Bundle bundle) {
            super(0);
            this.f28695OooO0Oo = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f28695OooO0Oo.getString(YallaTeamImageMessageScreen.Key_ImageUrl, "");
        }
    }

    public static final class OooO0o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Bundle f28696OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Bundle bundle) {
            super(0);
            this.f28696OooO0Oo = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f28696OooO0Oo.getString(YallaTeamImageMessageScreen.Key_Title, "");
        }
    }

    private YallaTeamImageMessageScreen() {
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-413300211);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-413300211, i, -1, "com.yalla.yalla.ui.screen.message.YallaTeamImageMessageScreen.Content (YallaTeamImageMessageScreen.kt:29)");
            }
            o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            String str = (String) RememberSaveableKt.m1333rememberSaveable(new Object[]{bundleOooO0O0}, (Saver) null, (String) null, (Function0) new OooO0o(bundleOooO0O0), composerStartRestartGroup, 8, 6);
            String str2 = (String) RememberSaveableKt.m1333rememberSaveable(new Object[]{bundleOooO0O0}, (Saver) null, (String) null, (Function0) new OooO0OO(bundleOooO0O0), composerStartRestartGroup, 8, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Intrinsics.checkNotNull(str);
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(str, 0.0f, o0000oo.OooO0OO(composerStartRestartGroup).f38630OooOOOO, null, null, null, null, null, BackgroundKt.m171backgroundbw27NRU$default(companion, o0000oo.OooO0OO(composerStartRestartGroup).f38631OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            ImageKt.Image(o000OO.OooO0Oo(str2, OooO00o.f28691OooO0Oo, composer2, 48, 0), (String) null, ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), companion2.getTopCenter(), ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 27696, 96);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(columnScope, i));
    }
}
