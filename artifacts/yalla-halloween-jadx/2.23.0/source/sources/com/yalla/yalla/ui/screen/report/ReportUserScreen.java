package com.yalla.yalla.ui.screen.report;

import android.os.Looper;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
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
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import com.yalla.yalla.ui.vm.main.SearchVM;
import com.yalla.yalla.ui.vm.report.ReportVm;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
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
import p022Oooo00O.o00O00OO;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o00000O0;
import p377o0OOoOo.o0000OO0;
import p420o0OoO0OO.o0OO00O;
import p426o0OoOO.o000oOoO;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t0;
import p507o0o00ooo.v0;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p530o0o0OOoO.O0OO00;
import p530o0o0OOoO.Oo0000;
import p571o0oOoOO.o0O0OOO0;
import p579o0oOoo.oO0Ooooo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0006*\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001aH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/yalla/yalla/ui/screen/report/ReportUserScreen;", "Lo0o0OOO0/o00O00O;", "Lcom/yalla/yalla/ui/vm/report/ReportVm;", "reportViewModel", "Lcom/yalla/yalla/ui/screen/report/utils/ReportParam;", "reportParam", "", "MainContent", "(Lcom/yalla/yalla/ui/vm/report/ReportVm;Lcom/yalla/yalla/ui/screen/report/utils/ReportParam;Landroidx/compose/runtime/Composer;I)V", "SearchUserEditCompose", "(Lcom/yalla/yalla/ui/vm/report/ReportVm;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/ui/vm/main/SearchVM;", "searchViewModel", "Landroidx/lifecycle/LifecycleOwner;", "viewLifecycleOwner", "", "userId", "Lo0oOoOO/o0O0OOO0;", "loadingViewModel", "searchUser", "Lcom/yalla/yalla/data/db/table/UserInfo;", "ShowSearchUser", "(Lcom/yalla/yalla/data/db/table/UserInfo;Lcom/yalla/yalla/ui/vm/report/ReportVm;Lcom/yalla/yalla/ui/screen/report/utils/ReportParam;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportUserScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportUserScreen.kt\ncom/yalla/yalla/ui/screen/report/ReportUserScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,240:1\n81#2,11:241\n81#2,11:255\n81#2,11:266\n81#2,11:337\n76#3:252\n76#3:254\n76#3:336\n154#4:253\n154#4:319\n154#4:327\n154#4:328\n164#4:334\n154#4:335\n154#4:420\n154#4:421\n154#4:457\n154#4:463\n154#4:464\n154#4:470\n154#4:471\n25#5:277\n456#5,8:301\n464#5,3:315\n36#5:320\n467#5,3:329\n456#5,8:366\n464#5,3:380\n456#5,8:402\n464#5,3:416\n456#5,8:439\n464#5,3:453\n467#5,3:458\n467#5,3:465\n467#5,3:472\n1097#6,6:278\n1097#6,6:321\n73#7,6:284\n79#7:318\n83#7:333\n72#7,7:384\n79#7:419\n83#7:469\n78#8,11:290\n91#8:332\n78#8,11:355\n78#8,11:391\n78#8,11:428\n91#8:461\n91#8:468\n91#8:475\n4144#9,6:309\n4144#9,6:374\n4144#9,6:410\n4144#9,6:447\n71#10,7:348\n78#10:383\n72#10,6:422\n78#10:456\n82#10:462\n82#10:476\n81#11:477\n107#11,2:478\n*S KotlinDebug\n*F\n+ 1 ReportUserScreen.kt\ncom/yalla/yalla/ui/screen/report/ReportUserScreen\n*L\n57#1:241,11\n95#1:255,11\n96#1:266,11\n170#1:337,11\n59#1:252\n93#1:254\n168#1:336\n74#1:253\n119#1:319\n122#1:327\n134#1:328\n138#1:334\n138#1:335\n177#1:420\n178#1:421\n189#1:457\n206#1:463\n210#1:464\n219#1:470\n220#1:471\n98#1:277\n100#1:301,8\n100#1:315,3\n115#1:320\n100#1:329,3\n172#1:366,8\n172#1:380,3\n173#1:402,8\n173#1:416,3\n181#1:439,8\n181#1:453,3\n181#1:458,3\n173#1:465,3\n172#1:472,3\n98#1:278,6\n115#1:321,6\n100#1:284,6\n100#1:318\n100#1:333\n173#1:384,7\n173#1:419\n173#1:469\n100#1:290,11\n100#1:332\n172#1:355,11\n173#1:391,11\n181#1:428,11\n181#1:461\n173#1:468\n172#1:475\n100#1:309,6\n172#1:374,6\n173#1:410,6\n181#1:447,6\n172#1:348,7\n172#1:383\n181#1:422,6\n181#1:456\n181#1:462\n172#1:476\n98#1:477\n98#1:478,2\n*E\n"})
public final class ReportUserScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final ReportUserScreen INSTANCE = new ReportUserScreen();

    public static final class OooO extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f29614OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<String> mutableState) {
            super(3);
            this.f29614OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Composer composer2;
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer3.changedInstance(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-952269337, i, -1, "com.yalla.yalla.ui.screen.report.ReportUserScreen.SearchUserEditCompose.<anonymous>.<anonymous> (ReportUserScreen.kt:108)");
                }
                composer3.startReplaceableGroup(-1829189687);
                if (ReportUserScreen.SearchUserEditCompose$lambda$1(this.f29614OooO0Oo).length() == 0) {
                    composer2 = composer3;
                    TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.report_rule_user_enter_id_warn), (Modifier) null, o000OOo.OooO0OO(composer3).f37714OooOOO0, oO0Ooooo.OooO0O0(15, composer3), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                } else {
                    composer2 = composer3;
                }
                composer2.endReplaceableGroup();
                if (androidx.compose.animation.OooOO0O.OooO00o(i & 14, innerTextField, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29616OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29617OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29617OooO0o0 = columnScope;
            this.f29616OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29616OooO0o | 1);
            ReportUserScreen.this.Content(this.f29617OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29619OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29620OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f29620OooO0o0 = columnScope;
            this.f29619OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29619OooO0o | 1);
            ReportUserScreen.this.Content(this.f29620OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ReportParam f29622OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ReportVm f29623OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29624OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ReportVm reportVm, ReportParam reportParam, int i) {
            super(2);
            this.f29623OooO0o0 = reportVm;
            this.f29622OooO0o = reportParam;
            this.f29624OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29624OooO0oO | 1);
            ReportVm reportVm = this.f29623OooO0o0;
            ReportParam reportParam = this.f29622OooO0o;
            ReportUserScreen.this.MainContent(reportVm, reportParam, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f29625OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<String> mutableState) {
            super(1);
            this.f29625OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            ReportUserScreen.SearchUserEditCompose$lambda$2(this.f29625OooO0Oo, it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SearchVM f29626OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f29627OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29628OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ReportVm f29629OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f29630OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(SearchVM searchVM, LifecycleOwner lifecycleOwner, o0O0OOO0 o0o0ooo0, ReportVm reportVm, MutableState<String> mutableState) {
            super(0);
            this.f29626OooO0Oo = searchVM;
            this.f29628OooO0o0 = lifecycleOwner;
            this.f29627OooO0o = o0o0ooo0;
            this.f29629OooO0oO = reportVm;
            this.f29630OooO0oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<String> mutableState = this.f29630OooO0oo;
            if (!(ReportUserScreen.SearchUserEditCompose$lambda$1(mutableState).length() == 0)) {
                ReportUserScreen.INSTANCE.searchUser(this.f29626OooO0Oo, this.f29628OooO0o0, ReportUserScreen.SearchUserEditCompose$lambda$1(mutableState), this.f29627OooO0o, this.f29629OooO0oO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29632OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ReportVm f29633OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ReportVm reportVm, int i) {
            super(2);
            this.f29633OooO0o0 = reportVm;
            this.f29632OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29632OooO0o | 1);
            ReportUserScreen.this.SearchUserEditCompose(this.f29633OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f29634OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ReportVm reportVm) {
            super(0);
            this.f29634OooO0Oo = reportVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29634OooO0Oo.setSearchUser(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f29635OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str) {
            super(2);
            this.f29635OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(293382746, iIntValue, -1, "com.yalla.yalla.ui.screen.report.ReportUserScreen.ShowSearchUser.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportUserScreen.kt:196)");
                }
                TextKt.m1251Text4IGK_g(this.f29635OooO0Oo, (Modifier) null, o000OOo.OooO0OO(composer2).f37712OooOO0o, oO0Ooooo.OooO0O0(13, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f29636OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29637OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserInfo f29638OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f29639OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ReportParam f29640OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(ReportVm reportVm, UserInfo userInfo, LifecycleOwner lifecycleOwner, o0O0OOO0 o0o0ooo0, ReportParam reportParam) {
            super(0);
            this.f29636OooO0Oo = reportVm;
            this.f29638OooO0o0 = userInfo;
            this.f29637OooO0o = lifecycleOwner;
            this.f29639OooO0oO = o0o0ooo0;
            this.f29640OooO0oo = reportParam;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Long lValueOf = Long.valueOf(this.f29638OooO0o0.getUserId());
            ReportVm reportVm = this.f29636OooO0Oo;
            reportVm.setExtendSourceId(lValueOf);
            ReportParam reportParam = this.f29640OooO0oo;
            O0OO00.OooO00o(this.f29637OooO0o, this.f29639OooO0oO, reportVm, reportParam.f29653OooO0oO, reportParam.f29654OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f29641OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ReportVm f29642OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(String str, ReportVm reportVm) {
            super(1);
            this.f29641OooO0Oo = str;
            this.f29642OooO0o0 = reportVm;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserInfoModel> list) {
            List<? extends UserInfoModel> list2 = list;
            boolean z = true;
            if ((list2 == null || list2.isEmpty()) || !Intrinsics.areEqual(list2.get(0).getUserIdx(), this.f29641OooO0Oo)) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.report_rule_user_not_exist);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                this.f29642OooO0o0.setSearchUser(list2.get(0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ReportVm f29644OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserInfo f29645OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ReportParam f29646OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29647OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(UserInfo userInfo, ReportVm reportVm, ReportParam reportParam, int i) {
            super(2);
            this.f29645OooO0o0 = userInfo;
            this.f29644OooO0o = reportVm;
            this.f29646OooO0oO = reportParam;
            this.f29647OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ReportUserScreen.this.ShowSearchUser(this.f29645OooO0o0, this.f29644OooO0o, this.f29646OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29647OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiResult<List<? extends UserInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f29648OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends UserInfoModel>> apiResult) {
            ApiResult<List<? extends UserInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private ReportUserScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(ReportVm reportVm, ReportParam reportParam, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1866801801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1866801801, i, -1, "com.yalla.yalla.ui.screen.report.ReportUserScreen.MainContent (ReportUserScreen.kt:82)");
        }
        if (reportVm.getSearchUser() == null) {
            composerStartRestartGroup.startReplaceableGroup(1177472511);
            SearchUserEditCompose(reportVm, composerStartRestartGroup, ((i >> 3) & 112) | 8);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1177472579);
            UserInfo searchUser = reportVm.getSearchUser();
            Intrinsics.checkNotNull(searchUser);
            ShowSearchUser(searchUser, reportVm, reportParam, composerStartRestartGroup, ((i << 3) & 7168) | 584);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(reportVm, reportParam, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void SearchUserEditCompose(ReportVm reportVm, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1097504875);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1097504875, i, -1, "com.yalla.yalla.ui.screen.report.ReportUserScreen.SearchUserEditCompose (ReportUserScreen.kt:91)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
        ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(SearchVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        SearchVM searchVM = (SearchVM) viewModel;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
        if (current2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel2 = ViewModelKt.viewModel(o0O0OOO0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel2;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierHeight = IntrinsicKt.height(companion2, IntrinsicSize.Min);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierHeight);
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String strSearchUserEditCompose$lambda$1 = SearchUserEditCompose$lambda$1(mutableState);
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m3516getNumberPjHm6EE(), 0, 11, null);
        TextStyle textStyle = new TextStyle(o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, oO0Ooooo.OooO0O0(15, composerStartRestartGroup), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
        float f = 20;
        float f2 = 15;
        Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new OooO0o(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BasicTextFieldKt.BasicTextField(strSearchUserEditCompose$lambda$1, (Function1<? super String, Unit>) objRememberedValue2, modifierM477paddingVpY3zN4, false, false, textStyle, keyboardOptions, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -952269337, true, new OooO(mutableState)), composerStartRestartGroup, 102236160, 196608, 32408);
        t0.OooO0O0(PaddingKt.m478paddingVpY3zN4$default(companion2, 0.0f, Dp.m3765constructorimpl(f), 1, null), 0.0f, 0L, composerStartRestartGroup, 6, 6);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Confirm);
        composerStartRestartGroup.startReplaceableGroup(681637377);
        long j = SearchUserEditCompose$lambda$1(mutableState).length() == 0 ? o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o : o0oO0O0o.f46993OoooOo0;
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m1251Text4IGK_g(strOooO0OO, PaddingKt.m477paddingVpY3zN4(o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, new OooOO0(searchVM, lifecycleOwner, o0o0ooo0, reportVm, mutableState), 253), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f)), j, oO0Ooooo.OooO0O0(13, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131056);
        o000oOoO.OooO00o(composerStartRestartGroup);
        DividerKt.m1058DivideroMI9zvI(PaddingKt.m478paddingVpY3zN4$default(companion2, Dp.m3765constructorimpl(f2), 0.0f, 2, null), o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, Dp.m3765constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 390, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(reportVm, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SearchUserEditCompose$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchUserEditCompose$lambda$2(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ShowSearchUser(UserInfo userInfo, ReportVm reportVm, ReportParam reportParam, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-588513046);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-588513046, i, -1, "com.yalla.yalla.ui.screen.report.ReportUserScreen.ShowSearchUser (ReportUserScreen.kt:166)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(o0O0OOO0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel;
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.INSTANCE;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        p517o0o0O0o.OooOOOO oooOOOO = p517o0o0O0o.OooOOOO.f51970OooO00o;
        String userHeader = userInfo.getUserHeader();
        float f = 50;
        int iOooO00o = o0000O0.OooO00o(f);
        float f2 = 15;
        float f3 = 16;
        oooOOOO.OooOO0(p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, userHeader), SizeKt.m523size3ABfNKs(PaddingKt.m479paddingqDBjuR0(companion, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(f3)), Dp.m3765constructorimpl(f)), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1251Text4IGK_g(userInfo.getUserName(), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, oO0Ooooo.OooO0O0(15, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3120, 120818);
        SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(4)), composerStartRestartGroup, 6);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 293382746, true, new OooOOO0(p591o0oo000O.OooO.OooO0o0() ? androidx.camera.core.impl.OooOOOO.OooO00o(userInfo.getUserIdx(), ":ID") : o00O00OO.OooO00o("ID:", userInfo.getUserIdx()))), composerStartRestartGroup, 56);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_delete_gray, composerStartRestartGroup, 0), (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(44)), false, null, null, new OooOOO(reportVm), 7, null), Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        o000oOoO.OooO00o(composerStartRestartGroup);
        SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
        o00000O0.OooO00o(o0000.OooO0OO(oO00OOo0.button_submit), 0L, null, null, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m509height3ABfNKs(PaddingKt.m477paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(25), Dp.m3765constructorimpl(12)), Dp.m3765constructorimpl(37)), new OooOOOO(reportVm, userInfo, lifecycleOwner, o0o0ooo0, reportParam), composerStartRestartGroup, 0, 0, 262142);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(userInfo, reportVm, reportParam, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchUser(SearchVM searchViewModel, LifecycleOwner viewLifecycleOwner, String userId, o0O0OOO0 loadingViewModel, ReportVm reportViewModel) {
        o0OO00O<ApiResult<List<UserInfoModel>>> o0oo00oSearchUser = searchViewModel.searchUser(userId, 1);
        v0.OooO0O0(o0oo00oSearchUser, loadingViewModel, false, 6);
        o0oo00oSearchUser.observe(viewLifecycleOwner, new o0000OO0(new OooOo(userId, reportViewModel), null, Oooo000.f29648OooO0Oo, false, 10));
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1373965750);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1373965750, i2, -1, "com.yalla.yalla.ui.screen.report.ReportUserScreen.Content (ReportUserScreen.kt:55)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(ReportVm.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            ReportVm reportVm = (ReportVm) viewModel;
            Object obj = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup).get(ReportScreen.PARAM_DATA);
            ReportParam reportParam = obj instanceof ReportParam ? (ReportParam) obj : null;
            if (reportParam == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(columnScope, i));
                return;
            }
            reportVm.setReportType(reportParam.f29650OooO0Oo);
            reportVm.setSourceId(reportParam.f29652OooO0o0);
            reportVm.setFriendRequestMessage(reportParam.f29658OooOOO);
            Pair pairOooO00o = Oo0000.OooO00o(reportVm.getReportType(), 2, null);
            ReportScreen.INSTANCE.ReportTitleBar((String) pairOooO00o.getFirst(), false, composerStartRestartGroup, 384, 2);
            TextKt.m1251Text4IGK_g((String) pairOooO00o.getSecond(), PaddingKt.m477paddingVpY3zN4(Modifier.INSTANCE, Dp.m3765constructorimpl(15), Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, oO0Ooooo.OooO0O0(13, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131056);
            composer2 = composerStartRestartGroup;
            MainContent(reportVm, reportParam, composer2, ((i2 << 3) & 896) | 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO00o(columnScope, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4198getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1164602801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1164602801, i, -1, "com.yalla.yalla.ui.screen.report.ReportUserScreen.getWindowBackgroundColor (ReportUserScreen.kt:234)");
        }
        int i2 = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f46946OooO0O0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
