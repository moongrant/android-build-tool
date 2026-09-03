package com.yalla.yalla.ui.screen.user;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.google.accompanist.pager.Pager;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p105o000oo0o.o00O00OO;
import p230o00oOo0o.o00000;
import p230o00oOo0o.o000000;
import p516o0o0O00o.o00O0000;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p543o0o0Ooo0.ooooO0O0;
import p543o0o0Ooo0.z2;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0013\u0010\u000b\u001a\u00020\b*\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/MyOutfitScreen;", "Lo0o0OOo0/o000O0;", "", "pageNumber", "Lcom/yalla/yalla/ui/screen/user/RoomThemePageType;", "themePageType", "", "isFromStore", "", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMyOutfitScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyOutfitScreen.kt\ncom/yalla/yalla/ui/screen/user/MyOutfitScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,151:1\n76#2:152\n76#2:153\n*S KotlinDebug\n*F\n+ 1 MyOutfitScreen.kt\ncom/yalla/yalla/ui/screen/user/MyOutfitScreen\n*L\n81#1:152\n95#1:153\n*E\n"})
public final class MyOutfitScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final MyOutfitScreen INSTANCE = new MyOutfitScreen();

    @SourceDebugExtension({"SMAP\nMyOutfitScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyOutfitScreen.kt\ncom/yalla/yalla/ui/screen/user/MyOutfitScreen$Content$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,151:1\n154#2:152\n154#2:153\n*S KotlinDebug\n*F\n+ 1 MyOutfitScreen.kt\ncom/yalla/yalla/ui/screen/user/MyOutfitScreen$Content$1\n*L\n104#1:152\n105#1:153\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f29405OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f29406OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000000 o000000Var, FragmentActivity fragmentActivity) {
            super(3);
            this.f29405OooO0Oo = o000000Var;
            this.f29406OooO0o0 = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Toolbar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-275512482, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyOutfitScreen.Content.<anonymous> (MyOutfitScreen.kt:100)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_title_store, composer2, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(8), 0.0f, 11, null), Dp.m3775constructorimpl(24)), false, false, 0L, false, null, null, null, new OooOo00(this.f29405OooO0Oo, this.f29406OooO0o0), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f29407OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            o0oo0000.OooO00o.OooO0OO("105115", MapsKt.mapOf(TuplesKt.to("source", Integer.valueOf(num.intValue() + 1))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function4<p230o00oOo0o.o0O0O00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemePageType f29408OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RoomThemePageType roomThemePageType) {
            super(4);
            this.f29408OooO0Oo = roomThemePageType;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(p230o00oOo0o.o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
            p230o00oOo0o.o0O0O00 HorizontalPager = o0o0o00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(525945754, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.MyOutfitScreen.Content.<anonymous> (MyOutfitScreen.kt:138)");
                }
                if (iIntValue == 0) {
                    composer2.startReplaceableGroup(878268011);
                    ooooO0O0.OooO00o(0, composer2, 6);
                    composer2.endReplaceableGroup();
                } else if (iIntValue == 1) {
                    composer2.startReplaceableGroup(878268112);
                    ooooO0O0.OooO00o(1, composer2, 6);
                    composer2.endReplaceableGroup();
                } else if (iIntValue == 2) {
                    composer2.startReplaceableGroup(878268235);
                    StoreChatBubbleMineScreen.INSTANCE.MainContent(true, composer2, 54, 0);
                    composer2.endReplaceableGroup();
                } else if (iIntValue == 3) {
                    composer2.startReplaceableGroup(878268309);
                    RoomThemeScreen.INSTANCE.MainContent(this.f29408OooO0Oo, composer2, 48, 0);
                    composer2.endReplaceableGroup();
                } else if (iIntValue != 4) {
                    composer2.startReplaceableGroup(878268408);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(878268375);
                    z2.OooO00o(composer2, 0);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29410OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29411OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ColumnScope columnScope, int i) {
            super(2);
            this.f29411OooO0o0 = columnScope;
            this.f29410OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29410OooO0o | 1);
            MyOutfitScreen.this.Content(this.f29411OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private MyOutfitScreen() {
    }

    public static /* synthetic */ void navigate$default(MyOutfitScreen myOutfitScreen, int i, RoomThemePageType roomThemePageType, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            roomThemePageType = RoomThemePageType.Mine;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        myOutfitScreen.navigate(i, roomThemePageType, z);
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1893159233);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893159233, i, -1, "com.yalla.yalla.ui.screen.user.MyOutfitScreen.Content (MyOutfitScreen.kt:79)");
            }
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            Object obj = bundleOooO0O0.get("pageNumber");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 0;
            Object obj2 = bundleOooO0O0.get("themePageType");
            RoomThemePageType roomThemePageType = obj2 instanceof RoomThemePageType ? (RoomThemePageType) obj2 : null;
            if (roomThemePageType == null) {
                roomThemePageType = RoomThemePageType.Mine;
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{o0000.OooO0OO(p562o0oOo000.o000000.Entrance_Effects), o0000.OooO0OO(p562o0oOo000.o000000.Profile_Card_Skins), o0000.OooO0OO(p562o0oOo000.o000000.Chat_Boxes), o0000.OooO0OO(p562o0oOo000.o000000.Room_Themes), o0000.OooO0OO(p562o0oOo000.o000000.vehicle_store_enter)});
            o000000 o000000VarOooO00o = o00000.OooO00o(iIntValue, composerStartRestartGroup, 0, 0);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(p562o0oOo000.o000000.My_Items, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -275512482, true, new OooO00o(o000000VarOooO00o, (FragmentActivity) objConsume)), null, composerStartRestartGroup, 12582912, 382);
            o00O0000.OooO00o(listListOf, o000000VarOooO00o, null, 0L, 0L, 0L, false, OooO0O0.f29407OooO0Oo, composerStartRestartGroup, 12582912, 124);
            int size = listListOf.size();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 525945754, true, new OooO0OO(roomThemePageType));
            composer2 = composerStartRestartGroup;
            Pager.OooO00o(size, modifierFillMaxSize$default, o000000VarOooO00o, false, 0.0f, null, null, null, null, false, composableLambda, composerStartRestartGroup, 48, 6, 1016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(columnScope, i));
    }

    public final void navigate(int pageNumber, @NotNull RoomThemePageType themePageType, boolean isFromStore) {
        Intrinsics.checkNotNullParameter(themePageType, "themePageType");
        Bundle bundleOooO0O0 = p063o0000oO.o000oOoO.OooO0O0(TuplesKt.to("pageNumber", Integer.valueOf(pageNumber)), TuplesKt.to("themePageType", themePageType), TuplesKt.to("isFromStore", Boolean.valueOf(isFromStore)));
        p190o00o0O.OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
        MyOutfitScreen myOutfitScreen = INSTANCE;
        if (o00O00.OooO00o(myOutfitScreen)) {
            o00O00.OooO0O0(myOutfitScreen);
        } else {
            o00O00.OooO0o0(myOutfitScreen, bundleOooO0O0, false, null, 12);
        }
    }
}
