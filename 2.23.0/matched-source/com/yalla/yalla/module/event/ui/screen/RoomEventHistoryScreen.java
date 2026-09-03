package com.yalla.yalla.module.event.ui.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.android.billingclient.api.o000;
import com.android.billingclient.api.o000Oo0;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.RoomEventHistoryViewModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p186o00o00oO.o00O00o0;
import p442o0OoOoO0.oo0O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t1;
import p526o0o0OOO0.o00O00O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p642o0ooOOo.o;
import p642o0ooOOo.o0OO;
import p642o0ooOOo.o0OO0;
import p642o0ooOOo.o0OO00OO;
import p642o0ooOOo.o0OO0O0;
import p642o0ooOOo.o0OOooO0;
import p642o0ooOOo.o0o0000;
import p642o0ooOOo.oO00000;
import p642o0ooOOo.oO0000Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0013\u0010\u0016\u001a\u00020\u0005*\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/module/event/ui/screen/RoomEventHistoryScreen;", "Lo0o0OOO0/o00O00O;", "Lcom/yalla/yalla/model/event/EventModel;", "eventModel", "Lkotlin/Function0;", "", "request", "RoomEventHistoryItem", "(Lcom/yalla/yalla/model/event/EventModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RoomEventHistoryTime", "(Lcom/yalla/yalla/model/event/EventModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Lo0ooOOo/o0OO0O0;", "verticalLine", "content", "RoomEventHistoryVerticalLine", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lo0ooOOo/o0OO0O0;Lo0ooOOo/o0OO0O0;Lcom/yalla/yalla/model/event/EventModel;Landroidx/compose/runtime/Composer;I)V", "RoomEventHistoryContent", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lo0ooOOo/o0OO0O0;Lcom/yalla/yalla/model/event/EventModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "space", "RoomEventHistorySpace", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomEventHistoryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventHistoryScreen.kt\ncom/yalla/yalla/module/event/ui/screen/RoomEventHistoryScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,272:1\n81#2,11:273\n72#3,6:284\n78#3:318\n82#3:323\n72#3,6:324\n78#3:358\n82#3:394\n72#3,6:455\n78#3:489\n73#3,5:574\n78#3:607\n82#3:613\n82#3:623\n78#4,11:290\n91#4:322\n78#4,11:330\n91#4:393\n78#4,11:401\n91#4:436\n78#4,11:461\n78#4,11:497\n91#4:531\n78#4,11:541\n78#4,11:579\n91#4:612\n91#4:617\n91#4:622\n456#5,8:301\n464#5,3:315\n467#5,3:319\n456#5,8:341\n464#5,3:355\n25#5:363\n467#5,3:390\n456#5,8:412\n464#5,3:426\n467#5,3:433\n36#5:439\n36#5:448\n456#5,8:472\n464#5,3:486\n456#5,8:508\n464#5,3:522\n467#5,3:528\n456#5,8:552\n464#5,3:566\n456#5,8:590\n464#5,3:604\n467#5,3:609\n467#5,3:614\n467#5,3:619\n36#5:625\n4144#6,6:309\n4144#6,6:349\n4144#6,6:420\n4144#6,6:480\n4144#6,6:516\n4144#6,6:560\n4144#6,6:598\n73#7,4:359\n77#7,20:370\n955#8,6:364\n1097#8,6:440\n1097#8,6:449\n1097#8,6:626\n73#9,6:395\n79#9:429\n83#9:437\n73#9,6:491\n79#9:525\n83#9:532\n73#9,6:535\n79#9:569\n83#9:618\n154#10:430\n154#10:431\n154#10:432\n164#10:438\n154#10:446\n154#10:447\n154#10:490\n154#10:526\n154#10:527\n164#10:533\n154#10:534\n154#10:570\n154#10:571\n154#10:572\n154#10:573\n154#10:608\n154#10:624\n*S KotlinDebug\n*F\n+ 1 RoomEventHistoryScreen.kt\ncom/yalla/yalla/module/event/ui/screen/RoomEventHistoryScreen\n*L\n54#1:273,11\n55#1:284,6\n55#1:318\n55#1:323\n87#1:324,6\n87#1:358\n87#1:394\n160#1:455,6\n160#1:489\n218#1:574,5\n218#1:607\n218#1:613\n160#1:623\n55#1:290,11\n55#1:322\n87#1:330,11\n87#1:393\n101#1:401,11\n101#1:436\n160#1:461,11\n173#1:497,11\n173#1:531\n202#1:541,11\n218#1:579,11\n218#1:612\n202#1:617\n160#1:622\n55#1:301,8\n55#1:315,3\n55#1:319,3\n87#1:341,8\n87#1:355,3\n89#1:363\n87#1:390,3\n101#1:412,8\n101#1:426,3\n101#1:433,3\n133#1:439\n165#1:448\n160#1:472,8\n160#1:486,3\n173#1:508,8\n173#1:522,3\n173#1:528,3\n202#1:552,8\n202#1:566,3\n218#1:590,8\n218#1:604,3\n218#1:609,3\n202#1:614,3\n160#1:619,3\n263#1:625\n55#1:309,6\n87#1:349,6\n101#1:420,6\n160#1:480,6\n173#1:516,6\n202#1:560,6\n218#1:598,6\n89#1:359,4\n89#1:370,20\n89#1:364,6\n133#1:440,6\n165#1:449,6\n263#1:626,6\n101#1:395,6\n101#1:429\n101#1:437\n173#1:491,6\n173#1:525\n173#1:532\n202#1:535,6\n202#1:569\n202#1:618\n105#1:430\n108#1:431\n112#1:432\n132#1:438\n162#1:446\n163#1:447\n175#1:490\n181#1:526\n183#1:527\n198#1:533\n205#1:534\n213#1:570\n214#1:571\n217#1:572\n220#1:573\n236#1:608\n262#1:624\n*E\n"})
public final class RoomEventHistoryScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final RoomEventHistoryScreen INSTANCE = new RoomEventHistoryScreen();

    public static final class OooO extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f23885OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomEventHistoryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventHistoryScreen.kt\ncom/yalla/yalla/module/event/ui/screen/RoomEventHistoryScreen$Content$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,272:1\n154#2:273\n*S KotlinDebug\n*F\n+ 1 RoomEventHistoryScreen.kt\ncom/yalla/yalla/module/event/ui/screen/RoomEventHistoryScreen$Content$1$1\n*L\n70#1:273\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f23886OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<EventModel> f23887OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LazyListState lazyListState, o000O0.OooO0O0<EventModel> oooO0O0) {
            super(3);
            this.f23886OooO0Oo = lazyListState;
            this.f23887OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(570661584, iIntValue, -1, "com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen.Content.<anonymous>.<anonymous> (RoomEventHistoryScreen.kt:66)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f23886OooO0Oo, PaddingKt.m473PaddingValuesa9UjIt4$default(0.0f, Dp.m3765constructorimpl(17), 0.0f, 0.0f, 13, null), false, null, null, null, false, new o0000O0O(this.f23887OooO0o0), composer2, 390, 248);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23889OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23890OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f23890OooO0o0 = columnScope;
            this.f23889OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23889OooO0o | 1);
            RoomEventHistoryScreen.this.Content(this.f23890OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23891OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0) {
            super(0);
            this.f23891OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23891OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomEventHistoryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventHistoryScreen.kt\ncom/yalla/yalla/module/event/ui/screen/RoomEventHistoryScreen$RoomEventHistoryContent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,272:1\n154#2:273\n154#2:274\n154#2:275\n*S KotlinDebug\n*F\n+ 1 RoomEventHistoryScreen.kt\ncom/yalla/yalla/module/event/ui/screen/RoomEventHistoryScreen$RoomEventHistoryContent$2\n*L\n167#1:273\n168#1:274\n169#1:275\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f23892OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOooO0 o0ooooo0 = constrainAs.f59523OooO0o0;
            o0OO0O0 o0oo0o1 = constrainAs.f59520OooO0OO;
            float f = 8;
            o000.OooO00o(o0ooooo0, o0oo0o1.f59541OooO0OO, Dp.m3765constructorimpl(f), 4);
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, Dp.m3765constructorimpl(28), 4);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, Dp.m3765constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f23893OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23895OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f23896OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EventModel f23897OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23898OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ConstraintLayoutScope constraintLayoutScope, o0OO0O0 o0oo0o1, EventModel eventModel, Function0<Unit> function0, int i) {
            super(2);
            this.f23896OooO0o0 = constraintLayoutScope;
            this.f23895OooO0o = o0oo0o1;
            this.f23897OooO0oO = eventModel;
            this.f23898OooO0oo = function0;
            this.f23893OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomEventHistoryScreen.this.RoomEventHistoryContent(this.f23896OooO0o0, this.f23895OooO0o, this.f23897OooO0oO, this.f23898OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23893OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23900OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23901OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23902OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(EventModel eventModel, Function0<Unit> function0, int i) {
            super(2);
            this.f23901OooO0o0 = eventModel;
            this.f23900OooO0o = function0;
            this.f23902OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23902OooO0oO | 1);
            EventModel eventModel = this.f23901OooO0o0;
            Function0<Unit> function0 = this.f23900OooO0o;
            RoomEventHistoryScreen.this.RoomEventHistoryItem(eventModel, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f23903OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23905OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f23906OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23907OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23908OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ConstraintLayoutScope constraintLayoutScope, o0OO0O0 o0oo0o1, o0OO0O0 o0oo0o2, EventModel eventModel, int i) {
            super(2);
            this.f23906OooO0o0 = constraintLayoutScope;
            this.f23905OooO0o = o0oo0o1;
            this.f23907OooO0oO = o0oo0o2;
            this.f23908OooO0oo = eventModel;
            this.f23903OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomEventHistoryScreen.this.RoomEventHistorySpace(this.f23906OooO0o0, this.f23905OooO0o, this.f23907OooO0oO, this.f23908OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23903OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23909OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0OO0O0 o0oo0o1) {
            super(1);
            this.f23909OooO0Oo = o0oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o000.OooO00o(constrainAs.f59523OooO0o0, this.f23909OooO0Oo.f59543OooO0o0, 0.0f, 6);
            o0OO0O0 o0oo0o1 = constrainAs.f59520OooO0OO;
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23911OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23912OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(EventModel eventModel, int i) {
            super(2);
            this.f23912OooO0o0 = eventModel;
            this.f23911OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23911OooO0o | 1);
            RoomEventHistoryScreen.this.RoomEventHistoryTime(this.f23912OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f23913OooO0Oo = new OooOo();

        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float f = 2;
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(Canvas, o0oO0O0o.f46982Oooo0o, OffsetKt.Offset(Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) / f, 0.0f), OffsetKt.Offset(Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) / f, Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc())), Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()), StrokeCap.INSTANCE.m1997getSquareKaPHkGw(), PathEffect.INSTANCE.dashPathEffect(new float[]{com.code.android.util.o0000O0.OooO00o(f), com.code.android.util.o0000O0.OooO00o(4)}, 10.0f), 0.8f, null, 0, 384, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23914OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o0OO0O0 o0oo0o1) {
            super(1);
            this.f23914OooO0Oo = o0oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOooO0 o0ooooo0 = constrainAs.f59523OooO0o0;
            o0OO0O0 o0oo0o1 = constrainAs.f59520OooO0OO;
            o000.OooO00o(o0ooooo0, o0oo0o1.f59541OooO0OO, 0.0f, 6);
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59543OooO0o0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, this.f23914OooO0Oo.f59540OooO0O0, 0.0f, 6);
            o value = new o(o0o0000.f59575OooO0Oo);
            Intrinsics.checkNotNullParameter(value, "value");
            constrainAs.f59519OooO0O0.add(new o0OO00OO(constrainAs, value));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f23915OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23917OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f23918OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23919OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23920OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(ConstraintLayoutScope constraintLayoutScope, o0OO0O0 o0oo0o1, o0OO0O0 o0oo0o2, EventModel eventModel, int i) {
            super(2);
            this.f23918OooO0o0 = constraintLayoutScope;
            this.f23917OooO0o = o0oo0o1;
            this.f23919OooO0oO = o0oo0o2;
            this.f23920OooO0oo = eventModel;
            this.f23915OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomEventHistoryScreen.this.RoomEventHistoryVerticalLine(this.f23918OooO0o0, this.f23917OooO0o, this.f23919OooO0oO, this.f23920OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23915OooO | 1));
            return Unit.INSTANCE;
        }
    }

    private RoomEventHistoryScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void RoomEventHistoryContent(ConstraintLayoutScope constraintLayoutScope, o0OO0O0 o0oo0o1, EventModel eventModel, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229382754);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(o0oo0o1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(eventModel) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229382754, i2, -1, "com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen.RoomEventHistoryContent (RoomEventHistoryScreen.kt:154)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 8;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(com.facebook.OooOo.OooO0O0(f, SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(320))), o0oO0O0o.f46946OooO0O0, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO0OO(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM202clickableXHw0xAI$default = ClickableKt.m202clickableXHw0xAI$default(modifierM169backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
            OooO0o oooO0o = OooO0o.f23892OooO0Oo;
            constraintLayoutScope.getClass();
            Modifier modifierOooO00o = ConstraintLayoutScope.OooO00o(modifierM202clickableXHw0xAI$default, o0oo0o1, oooO0o);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(companion, Dp.m3765constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.ic_event_time, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(12)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
            oo0O.OooO00o(4, companion, composerStartRestartGroup, 6);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.event_history_start_time, composerStartRestartGroup, 0);
            long eventStartTime = eventModel.getEventStartTime();
            int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(eventStartTime).length();
            if (1 <= length) {
                int i3 = 1;
                while (true) {
                    eventStartTime *= (long) 10;
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            int i4 = p601o0oo0O0.o0000O0.f56870OooO00o;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
            Calendar.getInstance().setTimeInMillis(eventStartTime);
            String str = simpleDateFormat.format(Long.valueOf(eventStartTime));
            Intrinsics.checkNotNullExpressionValue(str, "formatter.format(millis)");
            String strOooO00o = p031OoooO0.o0OoOo0.OooO00o(strStringResource, ZegoConstants.ZegoVideoDataAuxPublishingStream, str);
            long j = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
            long sp = TextUnitKt.getSp(12);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3674getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130546);
            p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m3765constructorimpl((float) 0.5d)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, null, 2, null), composerStartRestartGroup, 0);
            Modifier modifierM476padding3ABfNKs2 = PaddingKt.m476padding3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m3765constructorimpl(f));
            Alignment.Companion companion6 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion6.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement2, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs2);
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
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            float f2 = 6;
            float f3 = 76;
            ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(eventModel.getEventImage(), OooO.f23885OooO0Oo, composerStartRestartGroup, 48, 0), (String) null, SizeKt.m525sizeVpY3zN4(ClipKt.clip(companion5, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), Dp.m3765constructorimpl(134), Dp.m3765constructorimpl(f3)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion5, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            Modifier modifierOooO00o2 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance2, SizeKt.m509height3ABfNKs(companion5, Dp.m3765constructorimpl(f3)), 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical center = arrangement2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o4 = o00O00o0.OooO00o(companion6, center, composerStartRestartGroup, 6, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
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
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
            if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            String eventName = eventModel.getEventName();
            long j2 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            long sp2 = TextUnitKt.getSp(13);
            int iM3674getLefte0LSkKk = companion4.m3674getLefte0LSkKk();
            TextOverflow.Companion companion8 = TextOverflow.INSTANCE;
            TextKt.m1251Text4IGK_g(eventName, (Modifier) null, j2, sp2, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3674getLefte0LSkKk), 0L, companion8.m3719getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 3120, 120274);
            composerStartRestartGroup.startReplaceableGroup(1808537818);
            if (!StringsKt.isBlank(eventModel.getEventDesc())) {
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion5, Dp.m3765constructorimpl(f2)), composerStartRestartGroup, 6);
                TextKt.m1251Text4IGK_g(eventModel.getEventDesc(), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3674getLefte0LSkKk()), 0L, companion8.m3719getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120306);
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
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(constraintLayoutScope, o0oo0o1, eventModel, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void RoomEventHistoryItem(final EventModel eventModel, final Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-739232638);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        final int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-739232638, i3, -1, "com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen.RoomEventHistoryItem (RoomEventHistoryScreen.kt:85)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            INSTANCE.RoomEventHistoryTime(eventModel, composerStartRestartGroup, EventModel.$stable | 48 | (i3 & 14));
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new oO00000();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO00000 oo00000 = (oO00000) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O0 = o0OO.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, oo00000, composerStartRestartGroup);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
            final Function0 function1 = (Function0) pairOooO0O0.component2();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxWidth$default2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen$RoomEventHistoryItem$lambda$2$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0000Oo.OooO00o(semantics, oo00000);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen$RoomEventHistoryItem$lambda$2$$inlined$ConstraintLayout$2

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ int f23923OooO0Oo = 6;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        int i4 = ((this.f23923OooO0Oo >> 3) & 112) | 8;
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                        RoomEventHistoryScreen roomEventHistoryScreen = RoomEventHistoryScreen.INSTANCE;
                        EventModel eventModel2 = eventModel;
                        int i5 = (i4 & 14) | 24584;
                        int i6 = EventModel.$stable;
                        int i7 = i3;
                        int i8 = (i6 << 9) | i5 | ((i7 << 9) & 7168);
                        roomEventHistoryScreen.RoomEventHistoryVerticalLine(constraintLayoutScope2, o0oo0o0OooO00o, o0oo0o0OooO0O0, eventModel2, composer3, i8);
                        int i9 = i7 << 6;
                        roomEventHistoryScreen.RoomEventHistoryContent(constraintLayoutScope2, o0oo0o0OooO0O0, eventModel, function0, composer3, (i6 << 6) | i5 | (i9 & 896) | (i9 & 7168));
                        roomEventHistoryScreen.RoomEventHistorySpace(constraintLayoutScope2, o0oo0o0OooO0OO, o0oo0o0OooO0O0, eventModel, composer3, i8);
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(eventModel, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void RoomEventHistorySpace(ConstraintLayoutScope constraintLayoutScope, o0OO0O0 o0oo0o1, o0OO0O0 o0oo0o2, EventModel eventModel, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-270580566);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(o0oo0o1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(o0oo0o2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(eventModel) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-270580566, i2, -1, "com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen.RoomEventHistorySpace (RoomEventHistoryScreen.kt:252)");
            }
            if (eventModel.getHasNextTimeNode()) {
                Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(15, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 1157296644);
                boolean zChanged = composerStartRestartGroup.changed(o0oo0o2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOOO0(o0oo0o2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                constraintLayoutScope.getClass();
                SpacerKt.Spacer(ConstraintLayoutScope.OooO00o(modifierOooO00o, o0oo0o1, (Function1) objRememberedValue), composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(constraintLayoutScope, o0oo0o1, o0oo0o2, eventModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void RoomEventHistoryTime(EventModel eventModel, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1597175236);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1597175236, i, -1, "com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen.RoomEventHistoryTime (RoomEventHistoryScreen.kt:98)");
            }
            if (eventModel.getIsNewTimeNode()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f = 12;
                oo0O.OooO00o(f, companion, composerStartRestartGroup, 6);
                SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(6)), RoundedCornerShapeKt.getCircleShape()), o0oO0O0o.f46993OoooOo0, null, 2, null), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(p601o0oo0O0.o0000oo.OooO0OO(eventModel.getEventStartTime(), "dd/MM yyyy"), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3674getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
                p426o0OoOO.o000oOoO.OooO00o(composer2);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(eventModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void RoomEventHistoryVerticalLine(ConstraintLayoutScope constraintLayoutScope, o0OO0O0 o0oo0o1, o0OO0O0 o0oo0o2, EventModel eventModel, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(104257758);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(o0oo0o1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(o0oo0o2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(eventModel) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(104257758, i2, -1, "com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen.RoomEventHistoryVerticalLine (RoomEventHistoryScreen.kt:123)");
            }
            if (!eventModel.getIsEndDay()) {
                Modifier modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl((float) 0.5d));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(o0oo0o2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOo00(o0oo0o2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                constraintLayoutScope.getClass();
                CanvasKt.Canvas(ConstraintLayoutScope.OooO00o(modifierM528width3ABfNKs, o0oo0o1, (Function1) objRememberedValue), OooOo.f23913OooO0Oo, composerStartRestartGroup, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(constraintLayoutScope, o0oo0o1, o0oo0o2, eventModel, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(775466850);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(775466850, i, -1, "com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen.Content (RoomEventHistoryScreen.kt:51)");
            }
            p149o00Oo0o0.o00000O.OooO0O0(true, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(RoomEventHistoryViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            RoomEventHistoryViewModel roomEventHistoryViewModel = (RoomEventHistoryViewModel) viewModel;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO, null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            t1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.room_event_history_title, composerStartRestartGroup, 0), 0.0f, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37715OooOOOO, null, null, null, null, null, BackgroundKt.m169backgroundbw27NRU$default(companion, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37716OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(roomEventHistoryViewModel.getEventHistoryPager().f37667OooO0oo, composer2);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 570661584, true, new OooO00o(lazyListStateRememberLazyListState, oooO0O0OooO00o));
            int i2 = o000O0.OooO0O0.f34327OooO0o0;
            p148o00Oo0o.o0O0O00.OooO00o(oooO0O0OooO00o, null, lazyListStateRememberLazyListState, null, false, null, null, null, composableLambda, composer2, 100663304, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
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
