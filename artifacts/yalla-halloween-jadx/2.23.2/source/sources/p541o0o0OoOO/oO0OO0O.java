package p541o0o0OoOO;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.res.StringResources_androidKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207o00o0oO0.o000O0Oo;
import p482o0o000OO.OooOOO;
import p483o0o000Oo.o0000oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0OO0O f55130OooO00o = new oO0OO0O();

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55131OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomUserInfoModel roomUserInfoModel;
            MutableStateFlow<Long> userId;
            o0oo0000.OooO00o.OooO0O0("102237");
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            int iOooO0o0 = o0000ooVar.OooO0o0();
            MutableState mutableState = o0000ooVar.f48580OooO0o;
            Pair pair = (Pair) mutableState.getValue();
            long jLongValue = (pair == null || (roomUserInfoModel = (RoomUserInfoModel) pair.getFirst()) == null || (userId = roomUserInfoModel.getUserId()) == null) ? 0L : userId.getValue().longValue();
            Pair pair2 = (Pair) mutableState.getValue();
            boolean z = pair2 != null && ((Boolean) pair2.getSecond()).booleanValue();
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32335OooO00o;
                    com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new oOOO0OOO(iOooO0o0, jLongValue, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), z));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55132OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z;
            o0oo0000.OooO00o.OooO0O0("102238");
            Pair pair = (Pair) com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48580OooO0o.getValue();
            if (pair != null) {
                z = ((Boolean) pair.getSecond()).booleanValue();
            }
            OooOOO.OooO00o(false, z);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55134OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f55134OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55134OooO0o0 | 1);
            oO0OO0O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        String value;
        Composer composer2;
        RoomUserInfoModel roomUserInfoModel;
        MutableStateFlow<String> userName;
        Composer composerStartRestartGroup = composer.startRestartGroup(384244639);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(384244639, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenGlobalDialogs.OnDialog (LiveRoomScreenGlobalDialogs.kt:19)");
            }
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            MutableState<Boolean> mutableState = o0000ooVar.f48581OooO0o0;
            String strOooO0OO = o0000.OooO0OO(o000000.mic_tops_content);
            String[] strArr = new String[1];
            Pair pair = (Pair) o0000ooVar.f48580OooO0o.getValue();
            if (pair == null || (roomUserInfoModel = (RoomUserInfoModel) pair.getFirst()) == null || (userName = roomUserInfoModel.getUserName()) == null || (value = userName.getValue()) == null) {
                value = "";
            }
            strArr[0] = value;
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableState, null, o0000O.OooO00o(strOooO0OO, strArr), null, false, false, null, null, StringResources_androidKt.stringResource(o000000.Accept, composerStartRestartGroup, 0), false, null, false, OooO00o.f55131OooO0Oo, StringResources_androidKt.stringResource(o000000.Ignore, composerStartRestartGroup, 0), false, false, null, OooO0O0.f55132OooO0Oo, null, null, composer2, 0, 12583296, 904954);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i));
    }
}
