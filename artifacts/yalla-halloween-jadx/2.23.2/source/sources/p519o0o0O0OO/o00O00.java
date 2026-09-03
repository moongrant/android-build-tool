package p519o0o0O0OO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.o00O0000;
import p443o0OoOo0o.o000O0;
import p443o0OoOo0o.o000O00;
import p443o0OoOo0o.o000O0Oo;
import p443o0OoOo0o.o000O0o;
import p443o0OoOo0o.o000Oo0;
import p487o0o00O.o000;
import p645o0ooOOoo.l3;
import p645o0ooOOoo.m3;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52010OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f52010OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f52010OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f52011OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52012OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52013OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52014OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BaseMomentVM baseMomentVM, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f52011OooO0Oo = baseMomentVM;
            this.f52013OooO0o0 = function0;
            this.f52012OooO0o = i;
            this.f52014OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52012OooO0o | 1);
            o00O00.OooO00o(this.f52011OooO0Oo, this.f52013OooO0o0, composer, iUpdateChangedFlags, this.f52014OooO0oO);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@NotNull final BaseMomentVM newMomentVM, @Nullable final Function0<Unit> function0, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(newMomentVM, "newMomentVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(1153700464);
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1153700464, i, -1, "com.yalla.yalla.ui.composable.moment.initMomentCommonObservers (MomentCommonObservers.kt:18)");
        }
        Observable<Object> observable = LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM");
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        int i3 = 1;
        o00O0000.OooO00o(observable, new o000(newMomentVM, i3), composerStartRestartGroup, 72);
        Observable<Object> observable2 = LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM");
        Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
        int i4 = 2;
        o00O0000.OooO00o(observable2, new l3(newMomentVM, 2), composerStartRestartGroup, 72);
        Observable<Object> observable3 = LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
        o00O0000.OooO00o(observable3, new m3(newMomentVM, i4), composerStartRestartGroup, 72);
        Observable<Object> observable4 = LiveEventBus.get("POST_DETAIL_DATA_REFRESH");
        Intrinsics.checkNotNullExpressionValue(observable4, "get(...)");
        int i5 = 0;
        o00O0000.OooO00o(observable4, new o00O000(newMomentVM, i5), composerStartRestartGroup, 72);
        Observable<Object> observable5 = LiveEventBus.get("POST_DETAIL_DATA_REFRESH_PART");
        Intrinsics.checkNotNullExpressionValue(observable5, "get(...)");
        o00O0000.OooO00o(observable5, new o000O0o(newMomentVM, i3), composerStartRestartGroup, 72);
        Observable<Object> observable6 = LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE_FROM_MOMENT_DETAIL");
        Intrinsics.checkNotNullExpressionValue(observable6, "get(...)");
        o00O0000.OooO00o(observable6, new o000Oo0(newMomentVM, i4), composerStartRestartGroup, 72);
        Observable<Object> observable7 = LiveEventBus.get("MOMENT_BY_USER_REMOVE_FROM_MOMENT_DETAIL");
        Intrinsics.checkNotNullExpressionValue(observable7, "get(...)");
        o00O0000.OooO00o(observable7, new o000O00(newMomentVM, i4), composerStartRestartGroup, 72);
        Observable<Object> observable8 = LiveEventBus.get("EVENT_DELETED");
        Intrinsics.checkNotNullExpressionValue(observable8, "get(...)");
        o00O0000.OooO00o(observable8, new o00O000o(newMomentVM, i5), composerStartRestartGroup, 72);
        Observable<Object> observable9 = LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS");
        Intrinsics.checkNotNullExpressionValue(observable9, "get(...)");
        o00O0000.OooO00o(observable9, new o000O0(newMomentVM, i3), composerStartRestartGroup, 72);
        Observable<Object> observable10 = LiveEventBus.get("MOMENT_POST_COMMENT");
        Intrinsics.checkNotNullExpressionValue(observable10, "get(...)");
        o00O0000.OooO00o(observable10, new o000O0Oo(newMomentVM, 3), composerStartRestartGroup, 72);
        Observable<Object> observable11 = LiveEventBus.get("MOMENT_POST_DELETE");
        Intrinsics.checkNotNullExpressionValue(observable11, "get(...)");
        o00O0000.OooO00o(observable11, new Observer() { // from class: o0o0O0OO.o00oOoo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentDetailModel it = (MomentDetailModel) obj;
                BaseMomentVM newMomentVM2 = newMomentVM;
                Intrinsics.checkNotNullParameter(newMomentVM2, "$newMomentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                newMomentVM2.deleteMoment(it, new o00O00.OooO00o(function0));
                newMomentVM2.setRefreshTrigger(Boolean.TRUE);
            }
        }, composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(newMomentVM, function0, i, i2));
    }
}
