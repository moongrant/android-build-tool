package com.yalla.yalla.ui.screen.report;

import android.os.Bundle;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.ReportFromData;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o000oOoO;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p537o0o0Oo0O.o000OO00;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%Jm\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u0017H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/yalla/yalla/ui/screen/report/ReportScreen;", "Lo0o0OOo0/o000O0;", "", "reportType", "", "sourceId", "", "Lcom/yalla/yalla/model/ReportFromData;", "messagesList", "extendSourceId", "", "fromRoomPage", "privateChatReportType", "", "friendRequestMessage", "viewSourceType", "Landroid/os/Bundle;", "bundleOf", "(IJLjava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Landroid/os/Bundle;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", ShareConstants.WEB_DIALOG_PARAM_TITLE, "showRightCloseView", "ReportTitleBar", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "PARAM_DATA", "Ljava/lang/String;", "PRIVATE_CHAT_REPORT_TYPE_MESSAGES", "I", "PRIVATE_CHAT_REPORT_TYPE_ITEM_MESSAGE", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ReportScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final ReportScreen INSTANCE = new ReportScreen();

    @NotNull
    public static final String PARAM_DATA = "report_params_data";
    public static final int PRIVATE_CHAT_REPORT_TYPE_ITEM_MESSAGE = 1;
    public static final int PRIVATE_CHAT_REPORT_TYPE_MESSAGES = 0;

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29059OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29060OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29060OooO0o0 = columnScope;
            this.f29059OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29059OooO0o | 1);
            ReportScreen.this.Content(this.f29060OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nReportScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportScreen.kt\ncom/yalla/yalla/ui/screen/report/ReportScreen$ReportTitleBar$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,97:1\n154#2:98\n*S KotlinDebug\n*F\n+ 1 ReportScreen.kt\ncom/yalla/yalla/ui/screen/report/ReportScreen$ReportTitleBar$1\n*L\n89#1:98\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f29061OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(3);
            this.f29061OooO0Oo = z;
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
                    ComposerKt.traceEventStart(473083938, iIntValue, -1, "com.yalla.yalla.ui.screen.report.ReportScreen.ReportTitleBar.<anonymous> (ReportScreen.kt:83)");
                }
                if (this.f29061OooO0Oo) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.event_preview_close, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(24)), false, false, 0L, false, null, null, null, com.yalla.yalla.ui.screen.report.OooO00o.f29051OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f29063OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f29064OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29065OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29066OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, boolean z, int i, int i2) {
            super(2);
            this.f29064OooO0o0 = str;
            this.f29063OooO0o = z;
            this.f29065OooO0oO = i;
            this.f29066OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ReportScreen.this.ReportTitleBar(this.f29064OooO0o0, this.f29063OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29065OooO0oO | 1), this.f29066OooO0oo);
            return Unit.INSTANCE;
        }
    }

    private ReportScreen() {
    }

    @JvmStatic
    @NotNull
    public static final Bundle bundleOf(int reportType, long sourceId, @Nullable List<ReportFromData> messagesList, @Nullable Long extendSourceId, @Nullable Boolean fromRoomPage, @Nullable Integer privateChatReportType, @Nullable String friendRequestMessage, @Nullable Integer viewSourceType) {
        Integer num;
        if (viewSourceType == null) {
            num = Intrinsics.areEqual(fromRoomPage, Boolean.TRUE) ? 1 : null;
        } else {
            num = viewSourceType;
        }
        return o000oOoO.OooO0O0(TuplesKt.to(PARAM_DATA, new ReportParam(reportType, Long.valueOf(sourceId), null, null, null, messagesList, extendSourceId, null, num, privateChatReportType, friendRequestMessage)));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1812351914);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1812351914, i2, -1, "com.yalla.yalla.ui.screen.report.ReportScreen.Content (ReportScreen.kt:71)");
            }
            o000OO00.f54510OooO00o.OooO0OO(columnScope, false, composerStartRestartGroup, (i2 & 14) | 432);
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

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ReportTitleBar(@NotNull String title, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(1399432609);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(title) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1399432609, i3, -1, "com.yalla.yalla.ui.screen.report.ReportScreen.ReportTitleBar (ReportScreen.kt:81)");
                }
                o0O0oo0o.OooO00o(title, 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 473083938, true, new OooO0O0(z3)), null, composerStartRestartGroup, (i3 & 14) | 12582912, 382);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(title, z2, i, i2));
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1399432609, i3, -1, "com.yalla.yalla.ui.screen.report.ReportScreen.ReportTitleBar (ReportScreen.kt:81)");
            }
            o0O0oo0o.OooO00o(title, 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 473083938, true, new OooO0O0(z3)), null, composerStartRestartGroup, (i3 & 14) | 12582912, 382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        } else {
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1399432609, i3, -1, "com.yalla.yalla.ui.screen.report.ReportScreen.ReportTitleBar (ReportScreen.kt:81)");
            }
            o0O0oo0o.OooO00o(title, 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 473083938, true, new OooO0O0(z3)), null, composerStartRestartGroup, (i3 & 14) | 12582912, 382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(title, z2, i, i2));
    }

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(982531921);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(982531921, i, -1, "com.yalla.yalla.ui.screen.report.ReportScreen.getWindowBackgroundColor (ReportScreen.kt:76)");
        }
        int i2 = o0OOo000.f48347o00OOooO;
        long j = o0OOo000.f48135OooO0O0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
