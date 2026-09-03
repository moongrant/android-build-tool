package p516o0o0O0OO;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomMemberUserRankComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberUserRankComp.kt\ncom/yalla/yalla/ui/composable/room/RoomMemberUserRankCompKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,286:1\n154#2:287\n65#3,7:288\n72#3:323\n76#3:328\n78#4,11:295\n91#4:327\n78#4,11:336\n91#4:368\n456#5,8:306\n464#5,3:320\n467#5,3:324\n456#5,8:347\n464#5,3:361\n467#5,3:365\n4144#6,6:314\n4144#6,6:355\n71#7,7:329\n78#7:364\n82#7:369\n*S KotlinDebug\n*F\n+ 1 RoomMemberUserRankComp.kt\ncom/yalla/yalla/ui/composable/room/RoomMemberUserRankCompKt\n*L\n253#1:287\n262#1:288,7\n262#1:323\n262#1:328\n262#1:295,11\n262#1:327\n282#1:336,11\n282#1:368\n262#1:306,8\n262#1:320,3\n262#1:324,3\n282#1:347,8\n282#1:361,3\n282#1:365,3\n262#1:314,6\n282#1:355,6\n282#1:329,7\n282#1:364\n282#1:369\n*E\n"})
public final class o00000O0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f51903OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51904OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51905OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, int i, int i2) {
            super(2);
            this.f51903OooO0Oo = boxScope;
            this.f51905OooO0o0 = i;
            this.f51904OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51904OooO0o | 1);
            o00000O0.OooO00o(this.f51903OooO0Oo, this.f51905OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f51906OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51907OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51908OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, int i, int i2) {
            super(2);
            this.f51906OooO0Oo = boxScope;
            this.f51908OooO0o0 = i;
            this.f51907OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51907OooO0o | 1);
            o00000O0.OooO00o(this.f51906OooO0Oo, this.f51908OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope boxScope, int i, @Nullable Composer composer, int i2) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(936382007);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(936382007, i2, -1, "com.yalla.yalla.ui.composable.room.RoomMemberUserRankBadge (RoomMemberUserRankComp.kt:232)");
            }
            if (i > 3 || i < 1) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, i, i2));
                return;
            }
            if (i != 1) {
                i4 = i != 2 ? oO00OOO.ic_room_member_user_rank_number_3 : oO00OOO.ic_room_member_user_rank_number_2;
            } else {
                i4 = oO00OOO.ic_room_member_user_rank_number_1;
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(24)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(boxScope, i, i2));
    }
}
