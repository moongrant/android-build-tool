package p498o0o00o00;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p147o00Oo0Oo.o000OOo;
import p489o0o00OO0.OooOO0O;
import p584o0oOooO0.oO00O0oO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomEnterTipsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterTipsManager.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n314#2,11:63\n*S KotlinDebug\n*F\n+ 1 RoomEnterTipsManager.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsManager\n*L\n49#1:63,11\n*E\n"})
public final class o0O0o00O extends OooOO0O<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ComposeView f49329OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<CancellableContinuation<Boolean>> f49330OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<RoomUserInfoModel> f49331OooO0o0;

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
                    ComposerKt.traceEventStart(2065471869, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsManager.<anonymous> (RoomEnterTipsManager.kt:27)");
                }
                o0O0o00O o0o0o00o = o0O0o00O.this;
                if (o0o0o00o.f49331OooO0o0.getValue() != null) {
                    MutableState<CancellableContinuation<Boolean>> mutableState = o0o0o00o.f49330OooO0o;
                    if (mutableState.getValue() != null) {
                        MutableState<RoomUserInfoModel> mutableState2 = o0o0o00o.f49331OooO0o0;
                        RoomUserInfoModel value = mutableState2.getValue();
                        OooOOO0.OooO0O0("RoomEnterTipsManager: " + (value != null ? value.getInRoomEffectsInfoEntity() : null));
                        o0O0O0Oo.OooO0o(mutableState2, mutableState, composer2, 0);
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
    public o0O0o00O(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        ComposeView roomEnterComposeView = (ComposeView) this.f48470OooO00o.findViewById(oO00O0oO.composeViewRoomEnter);
        this.f49329OooO0Oo = roomEnterComposeView;
        this.f49331OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f49330OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Intrinsics.checkNotNullExpressionValue(roomEnterComposeView, "roomEnterComposeView");
        o000OOo.OooO0Oo(roomEnterComposeView, ComposableLambdaKt.composableLambdaInstance(2065471869, true, new OooO00o()));
        Intrinsics.checkNotNullExpressionValue(roomEnterComposeView, "roomEnterComposeView");
        o000OO00.OooO0O0(roomEnterComposeView);
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
    }
}
