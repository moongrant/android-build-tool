package p533o0o0Oo0;

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
import com.code.android.util.o000O0;
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
import p158o00OoOOO.oo000o;
import p475o0o000.o000000;
import p476o0o0000o.o0000O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000OO0 f54689OooO00o = new o0000OO0();

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54690OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomUserInfoModel roomUserInfoModel;
            MutableStateFlow<Long> userId;
            o0OO000.OooO00o("102237");
            o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
            int iOooO0o0 = o000000Var.OooO0o0();
            MutableState mutableState = o000000Var.f47375OooO0o;
            Pair pair = (Pair) mutableState.getValue();
            long jLongValue = (pair == null || (roomUserInfoModel = (RoomUserInfoModel) pair.getFirst()) == null || (userId = roomUserInfoModel.getUserId()) == null) ? 0L : userId.getValue().longValue();
            Pair pair2 = (Pair) mutableState.getValue();
            boolean z = pair2 != null && ((Boolean) pair2.getSecond()).booleanValue();
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32879OooO00o;
                    com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new o00O0OOO(iOooO0o0, jLongValue, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), z));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54691OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z;
            o0OO000.OooO00o("102238");
            Pair pair = (Pair) com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47375OooO0o.getValue();
            if (pair != null) {
                z = ((Boolean) pair.getSecond()).booleanValue();
            }
            o0000O.OooO00o(false, z);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54693OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f54693OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54693OooO0o0 | 1);
            o0000OO0.this.OooO00o(composer, iUpdateChangedFlags);
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
            o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
            MutableState<Boolean> mutableState = o000000Var.f47376OooO0o0;
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.mic_tops_content);
            String[] strArr = new String[1];
            Pair pair = (Pair) o000000Var.f47375OooO0o.getValue();
            if (pair == null || (roomUserInfoModel = (RoomUserInfoModel) pair.getFirst()) == null || (userName = roomUserInfoModel.getUserName()) == null || (value = userName.getValue()) == null) {
                value = "";
            }
            strArr[0] = value;
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(mutableState, null, com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr), null, false, false, null, null, StringResources_androidKt.stringResource(oO00OOo0.Accept, composerStartRestartGroup, 0), false, null, false, OooO00o.f54690OooO0Oo, StringResources_androidKt.stringResource(oO00OOo0.Ignore, composerStartRestartGroup, 0), false, false, null, OooO0O0.f54691OooO0Oo, null, null, composer2, 0, 12583296, 904954);
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
