package com.yalla.yalla.common.manager;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.fragment.ContributionFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.RoomModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p498o0o00Oo0.o00O0OO0;
import p522o0o0O0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013¨\u0006#"}, d2 = {"Lcom/yalla/yalla/common/manager/RoomStateManager;", "", "", ContributionFragment.ARG_1, "Lcom/yalla/yalla/common/event/webEvent/EnterRoomParentPage;", "enterRoomParentPage", "", "enterRoom", "Lcom/app/base/model/RoomModel;", "roomModel", "hookRoom", "closeRoom", "disconnectRoom", "", "roomHookY", "F", "getRoomHookY", "()F", "setRoomHookY", "(F)V", "Lcom/yalla/yalla/common/manager/RoomState;", "<set-?>", "roomState$delegate", "Lo000oOoO/o0O00OO;", "getRoomState", "()Lcom/yalla/yalla/common/manager/RoomState;", "setRoomState", "(Lcom/yalla/yalla/common/manager/RoomState;)V", "roomState", "roomHookX$delegate", "getRoomHookX", "setRoomHookX", "roomHookX", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomStateManager {

    @NotNull
    public static final RoomStateManager INSTANCE = new RoomStateManager();

    /* JADX INFO: renamed from: roomHookX$delegate, reason: from kotlin metadata */
    @NotNull
    private static final o0O00OO roomHookX = o0OOO00.OooO0Oo(Float.valueOf(OooOo00.OooO00o(230)));
    private static float roomHookY = o000O0Oo.f42986OooO0O0 / 2.0f;

    /* JADX INFO: renamed from: roomState$delegate, reason: from kotlin metadata */
    @NotNull
    private static final o0O00OO roomState = o0OOO00.OooO0Oo(RoomState.Close);
    public static final int $stable = 8;

    private RoomStateManager() {
    }

    public static /* synthetic */ void enterRoom$default(RoomStateManager roomStateManager, long j, EnterRoomParentPage enterRoomParentPage, int i, Object obj) {
        if ((i & 2) != 0) {
            enterRoomParentPage = null;
        }
        roomStateManager.enterRoom(j, enterRoomParentPage);
    }

    private final void setRoomState(RoomState roomState2) {
        roomState.setValue(roomState2);
    }

    public final void closeRoom() {
        setRoomState(RoomState.Close);
        LiveEventBus.get("Close_RoomUI").post(null);
        LiveEventBus.get("Disconnect_Room").post(null);
    }

    public final void disconnectRoom() {
        setRoomState(RoomState.Close);
        LiveEventBus.get("Disconnect_Room").post(null);
    }

    public final void enterRoom(long roomId, @Nullable EnterRoomParentPage enterRoomParentPage) {
        RoomModel roomModel = new RoomModel();
        roomModel.setId(roomId);
        enterRoom(roomModel, enterRoomParentPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getRoomHookX() {
        return ((Number) roomHookX.getValue()).floatValue();
    }

    public final float getRoomHookY() {
        return roomHookY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final RoomState getRoomState() {
        return (RoomState) roomState.getValue();
    }

    public final void hookRoom() {
        setRoomState(RoomState.Hook);
        LiveEventBus.get("Close_RoomUI").post(null);
    }

    public final void setRoomHookX(float f) {
        roomHookX.setValue(Float.valueOf(f));
    }

    public final void setRoomHookY(float f) {
        roomHookY = f;
    }

    public static /* synthetic */ void enterRoom$default(RoomStateManager roomStateManager, RoomModel roomModel, EnterRoomParentPage enterRoomParentPage, int i, Object obj) {
        if ((i & 2) != 0) {
            enterRoomParentPage = null;
        }
        roomStateManager.enterRoom(roomModel, enterRoomParentPage);
    }

    public final void enterRoom(@Nullable RoomModel roomModel, @Nullable EnterRoomParentPage enterRoomParentPage) {
        if (roomModel == null) {
            return;
        }
        setRoomState(RoomState.InRoom);
        Context context = null;
        if (enterRoomParentPage != null) {
            String roomId = roomModel.getId() + "";
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(enterRoomParentPage, "sourcePage");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO0(roomId, enterRoomParentPage, null), 3, null);
        }
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        Intent intent = new Intent(contextOooO0O0, (Class<?>) MixedRoomActivity.class);
        intent.putExtra("room", roomModel);
        Context contextOooO0O1 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O1 == null) {
            Context context2 = o0000O.f2657OooO00o;
            if (context2 != null) {
                context = context2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
            }
            contextOooO0O1 = context;
        }
        contextOooO0O1.startActivity(intent);
    }
}
