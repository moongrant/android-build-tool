package p427o0OoOO00;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.service.room.OooO0OO;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o0O0OOO0;
import p475o0o000.oo000o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStateManager.kt\ncom/yalla/yalla/manager/RoomStateManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,217:1\n81#2:218\n107#2,2:219\n*S KotlinDebug\n*F\n+ 1 RoomStateManager.kt\ncom/yalla/yalla/manager/RoomStateManager\n*L\n67#1:218\n67#1:219,2\n*E\n"})
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableState f45698OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RoomState.Close, null, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f45699OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static Job f45700OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$closeRoom$1", f = "RoomStateManager.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45701OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45701OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f45701OooO0Oo = 1;
                if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o0OOO0o.f45699OooO0O0 = false;
            return Unit.INSTANCE;
        }
    }

    public static void OooO00o() {
        f45698OooO00o.setValue(RoomState.Close);
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
        if (!(com.yalla.yalla.service.room.OooO00o.OooO0OO() instanceof OooO0OO.OooO00o)) {
            com.yalla.yalla.service.room.OooO00o.OooO0oO(new OooO0OO.OooO00o(3, null));
        }
        LiveEventBus.get("Room_State_Close").post(null);
        f45699OooO0O0 = true;
        f45700OooO0OO = OooOOO.OooO0O0(GlobalScope.INSTANCE, new OooO00o(null));
    }

    public static void OooO0O0(int i, @Nullable String str) {
        OooOOO0.OooO0OO("RoomStateManager", "disconnectRoom errorCode = " + i + ", message = " + str);
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
        com.yalla.yalla.service.room.OooO00o.OooO0oO(new OooO0OO.OooO00o(i, str));
        LiveEventBus.get("Disconnect_Room").post(null);
    }

    public static /* synthetic */ void OooO0OO(int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        OooO0O0(i, null);
    }

    public static void OooO0Oo(RoomModel roomModel) {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            if (OooO0oO() == RoomState.Close) {
                MixedRoomDataSource mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
                if (MixedRoomDataSource.f23457OooOo00 != null) {
                    mixedRoomDataSourceOooO0o0.f23462OooO0oO = null;
                    com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0oO(false);
                    MixedRoomDataSource.f23457OooOo00 = null;
                } else {
                    mixedRoomDataSourceOooO0o0.getClass();
                }
                MixedRoomDataSource.f23457OooOo00 = new MixedRoomDataSource();
                com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().OooO00o();
            }
            f45698OooO00o.setValue(RoomState.InRoom);
            Intent intent = new Intent(activityOooO0O0, (Class<?>) MixedRoomActivity.class);
            intent.putExtra("room", roomModel);
            oo000o oo000oVar = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0;
            if (oo000oVar.OooO0o0() != roomModel.getId()) {
                oo000oVar.f47494OooOO0.setValue(Boolean.valueOf(!o00Oo0.OooO0o0().OooOO0O()));
                oo000oVar.f47489OooO0Oo.setValue(Boolean.valueOf(o00Oo0.OooO0o0().OooOO0o()));
            }
            activityOooO0O0.startActivity(intent);
        }
    }

    public static void OooO0o(@Nullable RoomModel roomModel, @Nullable EnterRoomParentPage sourcePage) {
        if (roomModel.getId() == 0 || f45699OooO0O0) {
            return;
        }
        if (sourcePage != null) {
            WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
            long id = roomModel.getId();
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            String roomId = sb.toString();
            webEventRepository.getClass();
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O0OOO0(roomId, sourcePage, null), 3, null);
        }
        if (OooO0oO() == RoomState.Close || roomModel.getId() == com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0()) {
            OooO0Oo(roomModel);
            return;
        }
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0ooOOo(activityOooO0O0, roomModel, null), 3, null);
        }
    }

    public static void OooO0o0(long j, @Nullable EnterRoomParentPage enterRoomParentPage) {
        RoomModel roomModel = new RoomModel();
        roomModel.setId(j);
        OooO0o(roomModel, enterRoomParentPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static RoomState OooO0oO() {
        return (RoomState) f45698OooO00o.getValue();
    }
}
