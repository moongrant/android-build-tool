package p509o0o0O0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o00000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo {

    public static final class OooO implements Observer<MomentChangeUserIsInRoomModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51306OooO0Oo;

        public OooO(BaseMomentVM baseMomentVM) {
            this.f51306OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel) {
            MomentChangeUserIsInRoomModel it = momentChangeUserIsInRoomModel;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f51306OooO0Oo.updateInRoom(it);
        }
    }

    public static final class OooO00o implements Observer<MomentDetailModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51307OooO0Oo;

        public OooO00o(BaseMomentVM baseMomentVM) {
            this.f51307OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f51307OooO0Oo.updateComment(it);
        }
    }

    public static final class OooO0O0 implements Observer<MomentDetailModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51308OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51309OooO0o0;

        public OooO0O0(BaseMomentVM baseMomentVM, Function0<Unit> function0) {
            this.f51308OooO0Oo = baseMomentVM;
            this.f51309OooO0o0 = function0;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OOO0o o0ooo0o2 = new o0OOO0o(this.f51309OooO0o0);
            BaseMomentVM baseMomentVM = this.f51308OooO0Oo;
            baseMomentVM.deleteMoment(it, o0ooo0o2);
            baseMomentVM.setRefreshTrigger(Boolean.TRUE);
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51310OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51311OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51312OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51313OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BaseMomentVM baseMomentVM, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f51310OooO0Oo = baseMomentVM;
            this.f51312OooO0o0 = function0;
            this.f51311OooO0o = i;
            this.f51313OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51311OooO0o | 1);
            o0ooOOo.OooO00o(this.f51310OooO0Oo, this.f51312OooO0o0, composer, iUpdateChangedFlags, this.f51313OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer<MomentChangeUserIsInRoomModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51314OooO0Oo;

        public OooO0o(BaseMomentVM baseMomentVM) {
            this.f51314OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel) {
            MomentChangeUserIsInRoomModel it = momentChangeUserIsInRoomModel;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f51314OooO0Oo.updateInRoom(it);
        }
    }

    public static final class OooOO0 implements Observer<MomentDetailModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51315OooO0Oo;

        public OooOO0(BaseMomentVM baseMomentVM) {
            this.f51315OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentDetailModel momentDetailModel) {
            MomentDetailModel result = momentDetailModel;
            Intrinsics.checkNotNullParameter(result, "result");
            this.f51315OooO0Oo.updatePoll(result);
        }
    }

    public static final class OooOO0O implements Observer<MomentDetailModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51316OooO0Oo;

        public OooOO0O(BaseMomentVM baseMomentVM) {
            this.f51316OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f51316OooO0Oo.refreshData(it);
        }
    }

    public static final class OooOOO implements Observer<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51317OooO0Oo;

        public OooOOO(BaseMomentVM baseMomentVM) {
            this.f51317OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            this.f51317OooO0Oo.removeMoment(l.longValue());
        }
    }

    public static final class OooOOO0 implements Observer<MomentDetailModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51318OooO0Oo;

        public OooOOO0(BaseMomentVM baseMomentVM) {
            this.f51318OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f51318OooO0Oo.refreshPartData(it);
        }
    }

    public static final class OooOOOO implements Observer<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51319OooO0Oo;

        public OooOOOO(BaseMomentVM baseMomentVM) {
            this.f51319OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            this.f51319OooO0Oo.removeMoment(l.longValue());
        }
    }

    public static final class OooOo implements Observer<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51320OooO0Oo;

        public OooOo(BaseMomentVM baseMomentVM) {
            this.f51320OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            long jLongValue = l.longValue();
            p592o0oo00O.OooOOO0.OooO("动态编辑 发送成功 刷新 = " + jLongValue);
            this.f51320OooO0Oo.squareSingle4Edited(jLongValue);
        }
    }

    public static final class OooOo00 implements Observer<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f51321OooO0Oo;

        public OooOo00(BaseMomentVM baseMomentVM) {
            this.f51321OooO0Oo = baseMomentVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            this.f51321OooO0Oo.isEventDeleted(Long.valueOf(l.longValue()));
        }
    }

    @Composable
    public static final void OooO00o(@NotNull BaseMomentVM newMomentVM, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(newMomentVM, "newMomentVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(1153700464);
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1153700464, i, -1, "com.yalla.yalla.ui.composable.moment.initMomentCommonObservers (MomentCommonObservers.kt:15)");
        }
        Observable<Object> observable = LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM");
        Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.POST_DETAIL_DATA_CHANGE_ISINROOM)");
        o00000O.OooO00o(observable, new OooO0o(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable2 = LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM");
        Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.POST_DETAIL_DATA_CHANGE_ISINROOM)");
        o00000O.OooO00o(observable2, new OooO(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable3 = LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.POST_DETAIL_POLL_DATA_REFRESH)");
        o00000O.OooO00o(observable3, new OooOO0(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable4 = LiveEventBus.get("POST_DETAIL_DATA_REFRESH");
        Intrinsics.checkNotNullExpressionValue(observable4, "get(EventKey.POST_DETAIL_DATA_REFRESH)");
        o00000O.OooO00o(observable4, new OooOO0O(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable5 = LiveEventBus.get("POST_DETAIL_DATA_REFRESH_PART");
        Intrinsics.checkNotNullExpressionValue(observable5, "get(EventKey.POST_DETAIL_DATA_REFRESH_PART)");
        o00000O.OooO00o(observable5, new OooOOO0(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable6 = LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE_FROM_MOMENT_DETAIL");
        Intrinsics.checkNotNullExpressionValue(observable6, "get(EventKey.MOMENT_BY_S…EMOVE_FROM_MOMENT_DETAIL)");
        o00000O.OooO00o(observable6, new OooOOO(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable7 = LiveEventBus.get("MOMENT_BY_USER_REMOVE_FROM_MOMENT_DETAIL");
        Intrinsics.checkNotNullExpressionValue(observable7, "get(EventKey.MOMENT_BY_U…EMOVE_FROM_MOMENT_DETAIL)");
        o00000O.OooO00o(observable7, new OooOOOO(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable8 = LiveEventBus.get("EVENT_DELETED");
        Intrinsics.checkNotNullExpressionValue(observable8, "get(EventKey.EVENT_DELETED)");
        o00000O.OooO00o(observable8, new OooOo00(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable9 = LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS");
        Intrinsics.checkNotNullExpressionValue(observable9, "get(EventKey.MOMENT_EDIT_SEND_SUCCESS)");
        o00000O.OooO00o(observable9, new OooOo(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable10 = LiveEventBus.get("MOMENT_POST_COMMENT");
        Intrinsics.checkNotNullExpressionValue(observable10, "get(EventKey.MOMENT_POST_COMMENT)");
        o00000O.OooO00o(observable10, new OooO00o(newMomentVM), composerStartRestartGroup, 8);
        Observable<Object> observable11 = LiveEventBus.get("MOMENT_POST_DELETE");
        Intrinsics.checkNotNullExpressionValue(observable11, "get(EventKey.MOMENT_POST_DELETE)");
        o00000O.OooO00o(observable11, new OooO0O0(newMomentVM, function0), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(newMomentVM, function0, i, i2));
    }
}
