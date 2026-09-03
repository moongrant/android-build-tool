package p504o0o00oO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p193o00o0O0O.o0000oo;
import p495o0o00Oo.OooOOO;
import p562o0oOo000.o0OO00O;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomEnterTipsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterTipsManager.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n314#2,11:63\n*S KotlinDebug\n*F\n+ 1 RoomEnterTipsManager.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsManager\n*L\n49#1:63,11\n*E\n"})
public final class x extends OooOOO<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ComposeView f50297OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<CancellableContinuation<Boolean>> f50298OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<RoomUserInfoModel> f50299OooO0o0;

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2065471869, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsManager.<anonymous> (RoomEnterTipsManager.kt:28)");
                }
                x xVar = x.this;
                if (xVar.f50299OooO0o0.getValue() != null) {
                    MutableState<CancellableContinuation<Boolean>> mutableState = xVar.f50298OooO0o;
                    if (mutableState.getValue() != null) {
                        MutableState<RoomUserInfoModel> mutableState2 = xVar.f50299OooO0o0;
                        RoomUserInfoModel value = mutableState2.getValue();
                        o0000O00.OooO0O0("RoomEnterTipsManager: " + (value != null ? value.getInRoomEffectsInfoEntity() : null));
                        q.OooO0o(mutableState2, mutableState, composer2, 0);
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        ComposeView roomEnterComposeView = (ComposeView) this.f49626OooO00o.findViewById(o0OO00O.composeViewRoomEnter);
        this.f50297OooO0Oo = roomEnterComposeView;
        this.f50299OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f50298OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Intrinsics.checkNotNullExpressionValue(roomEnterComposeView, "roomEnterComposeView");
        o0000oo.OooO0Oo(roomEnterComposeView, ComposableLambdaKt.composableLambdaInstance(2065471869, true, new OooO00o()));
        Intrinsics.checkNotNullExpressionValue(roomEnterComposeView, "roomEnterComposeView");
        o000O.OooO0O0(roomEnterComposeView);
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO00o() {
    }
}
