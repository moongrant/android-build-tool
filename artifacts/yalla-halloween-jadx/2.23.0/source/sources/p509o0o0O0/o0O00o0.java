package p509o0o0O0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.moment.MomentTypeDelete;
import com.yalla.yalla.model.moment.MomentTypeKt;
import com.yalla.yalla.model.moment.MomentTypeShareKt;
import com.yalla.yalla.ui.composable.moment.MomentShareEventKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentShareComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,43:1\n76#2:44\n*S KotlinDebug\n*F\n+ 1 MomentShareComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareCompKt\n*L\n15#1:44\n*E\n"})
public final class o0O00o0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51128OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51129OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f51130OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51131OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Modifier modifier, EnterRoomParentPage enterRoomParentPage, int i, int i2) {
            super(2);
            this.f51128OooO0Oo = modifier;
            this.f51130OooO0o0 = enterRoomParentPage;
            this.f51129OooO0o = i;
            this.f51131OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51129OooO0o | 1);
            o0O00o0.OooO00o(this.f51128OooO0Oo, this.f51130OooO0o0, composer, iUpdateChangedFlags, this.f51131OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51132OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51133OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f51134OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51135OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Modifier modifier, EnterRoomParentPage enterRoomParentPage, int i, int i2) {
            super(2);
            this.f51132OooO0Oo = modifier;
            this.f51134OooO0o0 = enterRoomParentPage;
            this.f51133OooO0o = i;
            this.f51135OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51133OooO0o | 1);
            o0O00o0.OooO00o(this.f51132OooO0Oo, this.f51134OooO0o0, composer, iUpdateChangedFlags, this.f51135OooO0oO);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @Nullable EnterRoomParentPage enterRoomParentPage, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1161400331);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(enterRoomParentPage) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1161400331, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentShareComp (MomentShareComp.kt:13)");
            }
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
            composerStartRestartGroup.startReplaceableGroup(-440965448);
            if (!MomentTypeKt.isSupportMomentType(momentDetailModel)) {
                o0oOOo.OooO00o(modifier, StringResources_androidKt.stringResource(oO00OOo0.moment_content_not_support, composerStartRestartGroup, 0), true, composerStartRestartGroup, (i3 & 14) | 384, 0);
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier, enterRoomParentPage, i, i2));
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MomentForwardContent forwardContent = momentDetailModel.getForwardContent();
            if (momentDetailModel.getIsForward() && momentDetailModel.getDeleteType() == MomentTypeDelete.FORWARD.getValue()) {
                composerStartRestartGroup.startReplaceableGroup(-440965131);
                o0oOOo.OooO00o(modifier, StringResources_androidKt.stringResource(oO00OOo0.This_moment_has_been_deleted, composerStartRestartGroup, 0), false, composerStartRestartGroup, i3 & 14, 4);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (momentDetailModel.getDeleteType() == MomentTypeDelete.EVENT.getValue()) {
                composerStartRestartGroup.startReplaceableGroup(-440964955);
                o0oOOo.OooO00o(modifier, StringResources_androidKt.stringResource(oO00OOo0.event_has_been_deleted, composerStartRestartGroup, 0), false, composerStartRestartGroup, i3 & 14, 4);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (forwardContent != null && !MomentTypeShareKt.isSupportMomentTypeShare(forwardContent.getShareType())) {
                composerStartRestartGroup.startReplaceableGroup(-440964742);
                o0oOOo.OooO00o(modifier, StringResources_androidKt.stringResource(oO00OOo0.moment_content_not_support, composerStartRestartGroup, 0), true, composerStartRestartGroup, (i3 & 14) | 384, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (forwardContent != null && momentDetailModel.getType() == MomentType.Share.getValue()) {
                composerStartRestartGroup.startReplaceableGroup(-440964538);
                oo00oO.OooO00o(modifier, forwardContent, enterRoomParentPage, composerStartRestartGroup, (i3 & 14) | 64 | ((i3 << 3) & 896), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (forwardContent == null || momentDetailModel.getType() != MomentType.Event.getValue()) {
                composerStartRestartGroup.startReplaceableGroup(-440964299);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-440964372);
                MomentShareEventKt.OooO00o(modifier, forwardContent, composerStartRestartGroup, (i3 & 14) | 64, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(modifier, enterRoomParentPage, i, i2));
    }
}
