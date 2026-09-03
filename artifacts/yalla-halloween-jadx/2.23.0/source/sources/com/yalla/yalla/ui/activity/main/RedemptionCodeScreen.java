package com.yalla.yalla.ui.activity.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.ui.vm.main.RedemptionCodeVm;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00Ooo;
import p147o00Oo0Oo.o000OOo;
import p469o0OoooOO.o0oO0O0o;
import p486o0o00O00.o0000oo;
import p507o0o00ooo.x;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u0013\u0010\r\u001a\u00020\u0004*\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/RedemptionCodeScreen;", "Lo0o0OOO0/o00O00O;", "Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm;", "vm", "", "TopContent", "(Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm;Landroidx/compose/runtime/Composer;I)V", "RecordInfoView", "(Landroidx/compose/runtime/Composer;I)V", "", "code", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "TitleView", "Info1View", "ErrorView", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/yalla/yalla/ui/vm/main/RedemptionCodeVm;Landroidx/compose/runtime/Composer;I)V", "EditView", "TextButton", RedemptionCodeScreen.Code_Key, "Ljava/lang/String;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRedemptionCodeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedemptionCodeScreen.kt\ncom/yalla/yalla/ui/activity/main/RedemptionCodeScreen\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,305:1\n154#2:306\n154#2:307\n154#2:308\n154#2:349\n154#2:350\n154#2:351\n154#2:352\n154#2:361\n154#2:362\n154#2:364\n154#2:372\n154#2:373\n154#2:413\n154#2:449\n154#2:450\n72#3,6:309\n78#3:343\n82#3:348\n78#4,11:315\n91#4:347\n78#4,11:379\n91#4:411\n78#4,11:420\n91#4:454\n456#5,8:326\n464#5,3:340\n467#5,3:344\n25#5:354\n25#5:365\n456#5,8:390\n464#5,3:404\n467#5,3:408\n456#5,8:431\n464#5,3:445\n467#5,3:451\n4144#6,6:334\n4144#6,6:398\n4144#6,6:439\n76#7:353\n76#7:363\n1097#8,6:355\n1097#8,6:366\n67#9,5:374\n72#9:407\n76#9:412\n73#10,6:414\n79#10:448\n83#10:455\n81#11:456\n*S KotlinDebug\n*F\n+ 1 RedemptionCodeScreen.kt\ncom/yalla/yalla/ui/activity/main/RedemptionCodeScreen\n*L\n135#1:306\n136#1:307\n137#1:308\n150#1:349\n163#1:350\n178#1:351\n192#1:352\n218#1:361\n219#1:362\n230#1:364\n236#1:372\n238#1:373\n272#1:413\n285#1:449\n287#1:450\n132#1:309,6\n132#1:343\n132#1:348\n132#1:315,11\n132#1:347\n234#1:379,11\n234#1:411\n277#1:420,11\n277#1:454\n132#1:326,8\n132#1:340,3\n132#1:344,3\n194#1:354\n231#1:365\n234#1:390,8\n234#1:404,3\n234#1:408,3\n277#1:431,8\n277#1:445,3\n277#1:451,3\n132#1:334,6\n234#1:398,6\n277#1:439,6\n193#1:353\n228#1:363\n194#1:355,6\n231#1:366,6\n234#1:374,5\n234#1:407\n234#1:412\n277#1:414,6\n277#1:448\n277#1:455\n231#1:456\n*E\n"})
public final class RedemptionCodeScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    private static final String Code_Key = "Code_Key";

    @NotNull
    public static final RedemptionCodeScreen INSTANCE = new RedemptionCodeScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25501OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25502OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RedemptionCodeVm redemptionCodeVm, int i) {
            super(2);
            this.f25502OooO0o0 = redemptionCodeVm;
            this.f25501OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25501OooO0o | 1);
            RedemptionCodeScreen.this.EditView(this.f25502OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25504OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f25505OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f25505OooO0o0 = columnScope;
            this.f25504OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25504OooO0o | 1);
            RedemptionCodeScreen.this.Content(this.f25505OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25506OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RedemptionCodeVm redemptionCodeVm) {
            super(1);
            this.f25506OooO0Oo = redemptionCodeVm;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            RedemptionCodeVm redemptionCodeVm = this.f25506OooO0Oo;
            redemptionCodeVm.setSearchText(it);
            redemptionCodeVm.setRedemptionCodeState(RedemptionCodeVm.RedemptionCodeState.Default);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Function1<? super String, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25507OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RedemptionCodeVm redemptionCodeVm) {
            super(1);
            this.f25507OooO0Oo = redemptionCodeVm;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super String, ? extends Unit> function1) {
            Function1<? super String, ? extends Unit> it = function1;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25507OooO0Oo.setSearchTextSetter(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f25508OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25510OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f25511OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f25512OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ColumnScope columnScope, RedemptionCodeVm redemptionCodeVm, int i) {
            super(2);
            this.f25511OooO0o0 = columnScope;
            this.f25510OooO0o = redemptionCodeVm;
            this.f25512OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25512OooO0oO | 1);
            ColumnScope columnScope = this.f25511OooO0o0;
            RedemptionCodeVm redemptionCodeVm = this.f25510OooO0o;
            RedemptionCodeScreen.this.ErrorView(columnScope, redemptionCodeVm, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25514OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f25515OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ColumnScope columnScope, int i) {
            super(2);
            this.f25515OooO0o0 = columnScope;
            this.f25514OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25514OooO0o | 1);
            RedemptionCodeScreen.this.Info1View(this.f25515OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25517OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i) {
            super(2);
            this.f25517OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25517OooO0o0 | 1);
            RedemptionCodeScreen.this.RecordInfoView(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f25518OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("105135");
            RedemptionCodeRecordScreen.INSTANCE.navigate();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25519OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Context f25520OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f25521OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(RedemptionCodeVm redemptionCodeVm, SoftwareKeyboardController softwareKeyboardController, Context context) {
            super(0);
            this.f25519OooO0Oo = redemptionCodeVm;
            this.f25521OooO0o0 = softwareKeyboardController;
            this.f25520OooO0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("105134");
            RedemptionCodeVm redemptionCodeVm = this.f25519OooO0Oo;
            if (redemptionCodeVm.getRedemptionCodeState() == RedemptionCodeVm.RedemptionCodeState.Default) {
                SoftwareKeyboardController softwareKeyboardController = this.f25521OooO0o0;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                redemptionCodeVm.toRedemptionCode(this.f25520OooO0o);
            } else {
                redemptionCodeVm.toLocalCodeRedemptionFailed();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25522OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RedemptionCodeVm redemptionCodeVm) {
            super(0);
            this.f25522OooO0Oo = redemptionCodeVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f25522OooO0Oo.getSearchText().length() > 0);
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25524OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25525OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RedemptionCodeVm redemptionCodeVm, int i) {
            super(2);
            this.f25525OooO0o0 = redemptionCodeVm;
            this.f25524OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25524OooO0o | 1);
            RedemptionCodeScreen.this.TextButton(this.f25525OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25527OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f25528OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(RedemptionCodeVm redemptionCodeVm, int i) {
            super(2);
            this.f25528OooO0o0 = redemptionCodeVm;
            this.f25527OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25527OooO0o | 1);
            RedemptionCodeScreen.this.TopContent(this.f25528OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25530OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f25531OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(ColumnScope columnScope, int i) {
            super(2);
            this.f25531OooO0o0 = columnScope;
            this.f25530OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25530OooO0o | 1);
            RedemptionCodeScreen.this.TitleView(this.f25531OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private RedemptionCodeScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void RecordInfoView(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(693157117);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693157117, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.RecordInfoView (RedemptionCodeScreen.kt:275)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, OooOOO0.f25518OooO0Oo, 255);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.iic_redemption_code_history, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(24)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(6), null, composerStartRestartGroup, 6, 2);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Exchange_Records, composerStartRestartGroup, 0), (Modifier) null, o0oO0O0o.o00O0o00, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i));
    }

    private static final boolean TextButton$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopContent(RedemptionCodeVm redemptionCodeVm, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1800126572);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1800126572, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.TopContent (RedemptionCodeScreen.kt:130)");
        }
        Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m168backgroundbw27NRU(SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(387), 0.0f, 2, null), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(20))), Dp.m3765constructorimpl(24), 0.0f, 2, null);
        Alignment.Horizontal start = Alignment.INSTANCE.getStart();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(Arrangement.INSTANCE, start, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        RedemptionCodeScreen redemptionCodeScreen = INSTANCE;
        redemptionCodeScreen.TitleView(columnScopeInstance, composerStartRestartGroup, 54);
        redemptionCodeScreen.Info1View(columnScopeInstance, composerStartRestartGroup, 54);
        redemptionCodeScreen.EditView(redemptionCodeVm, composerStartRestartGroup, 56);
        redemptionCodeScreen.ErrorView(columnScopeInstance, redemptionCodeVm, composerStartRestartGroup, 454);
        redemptionCodeScreen.TextButton(redemptionCodeVm, composerStartRestartGroup, 56);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(redemptionCodeVm, i));
    }

    public static /* synthetic */ void navigate$default(RedemptionCodeScreen redemptionCodeScreen, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        redemptionCodeScreen.navigate(str);
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(505240788);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(505240788, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.Content (RedemptionCodeScreen.kt:63)");
            }
            o000OOo.OooO00o(true, o0000oo.f48274OooO00o, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EditView(@NotNull RedemptionCodeVm vm, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1965816671);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1965816671, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.EditView (RedemptionCodeScreen.kt:190)");
        }
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(32), null, composerStartRestartGroup, 6, 2);
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            int i2 = oO00OOO.ic_redemption_code_reward_error_bg;
            Object obj = ContextCompat.f5271OooO00o;
            objRememberedValue = ContextCompat.OooO0OO.OooO0O0(context, i2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Drawable drawable = (Drawable) objRememberedValue;
        x xVar = x.f50308OooO00o;
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.redemption_hint);
        long sp = TextUnitKt.getSp(16);
        TextAlign.Companion companion = TextAlign.INSTANCE;
        int iM3671getCentere0LSkKk = companion.m3671getCentere0LSkKk();
        RedemptionCodeVm.RedemptionCodeState redemptionCodeState = vm.getRedemptionCodeState();
        RedemptionCodeVm.RedemptionCodeState redemptionCodeState2 = RedemptionCodeVm.RedemptionCodeState.Error;
        if (redemptionCodeState == redemptionCodeState2) {
            composerStartRestartGroup.startReplaceableGroup(-1596504111);
            j = o000OOo.OooO0OO(composerStartRestartGroup).f37708OooO0oO;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1596504091);
            j = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
        }
        long j2 = j;
        composerStartRestartGroup.endReplaceableGroup();
        xVar.OooO00o(new OooO0O0(vm), null, new OooO0OO(vm), strOooO0OO, 0L, sp, 0, iM3671getCentere0LSkKk, null, j2, TextUnitKt.getSp(22), 0, companion.m3671getCentere0LSkKk(), null, vm.getRedemptionCodeState() == redemptionCodeState2 ? drawable : null, false, null, null, o0oO0O0o.f46945OooO00o, null, 15, OooO0o.f25508OooO0Oo, BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(12))), Dp.m3765constructorimpl(72)), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO, null, 2, null), composerStartRestartGroup, 196608, 32774, 4150, 764242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(vm, i));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0091  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ErrorView(@NotNull ColumnScope columnScope, @NotNull RedemptionCodeVm vm, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1000476271);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1000476271, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.ErrorView (RedemptionCodeScreen.kt:173)");
        }
        if (vm.getRedemptionCodeState() == RedemptionCodeVm.RedemptionCodeState.Error) {
            String errorMessage$default = RedemptionCodeVm.getErrorMessage$default(vm, null, 1, null);
            if (errorMessage$default.length() > 0) {
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, 6, 2);
                long sp = TextUnitKt.getSp(12);
                int i2 = o0oO0O0o.f47152o00OOOo;
                long j = o0oO0O0o.f47003OoooooO;
                int iM3676getStarte0LSkKk = TextAlign.INSTANCE.m3676getStarte0LSkKk();
                Modifier modifierAlign = columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getStart());
                TextAlign textAlignM3664boximpl = TextAlign.m3664boximpl(iM3676getStarte0LSkKk);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(errorMessage$default, modifierAlign, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM3664boximpl, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130544);
            } else {
                composer2 = composerStartRestartGroup;
            }
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(columnScope, vm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void Info1View(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1382506267);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1382506267, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.Info1View (RedemptionCodeScreen.kt:161)");
            }
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, 6, 2);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.redemption_info_1, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(14);
            int i3 = o0oO0O0o.f47152o00OOOo;
            long j = o0oO0O0o.f46983Oooo0o0;
            int iM3676getStarte0LSkKk = TextAlign.INSTANCE.m3676getStarte0LSkKk();
            Modifier modifierAlign = columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getStart());
            TextAlign textAlignM3664boximpl = TextAlign.m3664boximpl(iM3676getStarte0LSkKk);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strStringResource, modifierAlign, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM3664boximpl, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TextButton(@NotNull RedemptionCodeVm vm, @Nullable Composer composer, int i) {
        Painter painterPainterResource;
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1247225649);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1247225649, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.TextButton (RedemptionCodeScreen.kt:226)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composerStartRestartGroup, LocalSoftwareKeyboardController.$stable);
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(24), null, composerStartRestartGroup, 6, 2);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new OooOo(vm));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        State state = (State) objRememberedValue;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(ClipKt.clip(companion, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(26))), 0.0f, 1, null), Dp.m3765constructorimpl(52)), TextButton$lambda$3(state), false, 0L, false, null, null, null, new OooOOOO(vm, current, context), 254);
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (TextButton$lambda$3(state)) {
            composerStartRestartGroup.startReplaceableGroup(-812055500);
            painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_btn_bg_click, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-812055393);
            painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_btn_bg_click_no, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        ImageKt.Image(painterPainterResource, "", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.OK, composerStartRestartGroup, 0), (Modifier) null, TextButton$lambda$3(state) ? o0oO0O0o.f47159o00oOOo : o0oO0O0o.f47124o00O0o0, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 130514);
        p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(40), null, composerStartRestartGroup, 6, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(vm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TitleView(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1078426160);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1078426160, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeScreen.TitleView (RedemptionCodeScreen.kt:148)");
            }
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(40), null, composerStartRestartGroup, 6, 2);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.redemption_title, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(28);
            int i3 = o0oO0O0o.f47152o00OOOo;
            long j = o0oO0O0o.f46976Oooo0;
            int iM3676getStarte0LSkKk = TextAlign.INSTANCE.m3676getStarte0LSkKk();
            FontWeight extraBold = FontWeight.INSTANCE.getExtraBold();
            Modifier modifierAlign = columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getStart());
            TextAlign textAlignM3664boximpl = TextAlign.m3664boximpl(iM3676getStarte0LSkKk);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strStringResource, modifierAlign, j, sp, (FontStyle) null, extraBold, (FontFamily) null, 0L, (TextDecoration) null, textAlignM3664boximpl, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(columnScope, i));
    }

    public final void navigate(@Nullable String code) {
        if (p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("redemptionCodeIsOpenCDK", false)) {
            oo0oOO0.OooO0o0(INSTANCE, o00Ooo.OooO0O0(new Pair(Code_Key, com.code.android.util.o0OoOo0.OooOOO(code, ""))), false, null, 12);
        } else {
            o000O00O.OooO00o(oO00OOo0.redemption_error_3017);
        }
    }
}
