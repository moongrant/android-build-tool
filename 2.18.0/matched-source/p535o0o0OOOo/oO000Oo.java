package p535o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.GetMicModel;
import com.app.base.model.InOutRoomModel;
import com.app.base.model.RoomAdminUpgradeModel;
import com.app.base.model.SilenceModel;
import com.app.base.model.ThrowMicModel;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p160o00OoOO.o00O000;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0Oo0oo;
import p524o0o0O0o.o000O0;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO000Oo implements o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public oO00000 f43494OooO00o;

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$removeUserFormApplyMicList$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f43495Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ oO000Oo f43496OoooO00;

        /* JADX INFO: renamed from: o0o0OOOo.oO000Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0407OooO00o extends Lambda implements Function1<Long, Boolean> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ long f43497Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0407OooO00o(long j) {
                super(1);
                this.f43497Oooo = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long l) {
                return Boolean.valueOf(l.longValue() == this.f43497Oooo);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function1<Long, Boolean> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ long f43498Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(long j) {
                super(1);
                this.f43498Oooo = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long l) {
                return Boolean.valueOf(l.longValue() == this.f43498Oooo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, oO000Oo oo000oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43495Oooo = j;
            this.f43496OoooO00 = oo000oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f43495Oooo, this.f43496OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String userHeader;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000.OooO0o oooO0o = o00OO000.OooO0o.f43245OooO00o;
            if (oooO0o.OooO00o() > 0) {
                o00OO0OO<Long> o00oo0oo = o00OO000.OooO0o.f43255OooOO0o;
                o000O0.OooO0OO(o00oo0oo, new C0407OooO00o(this.f43495Oooo));
                int size = o00oo0oo.size();
                oooO0o.OooO0oO(size == 0 ? -1 : size);
                long j = this.f43495Oooo;
                Long value = OooOOO.f41235OooO00o.OooOo().getValue();
                if (value != null && j == value.longValue()) {
                    oooO0o.OooO(false);
                }
                String str = "";
                if (size > 0) {
                    RoomUserInfoModel roomUserInfoModelOooOO0 = o00OO000.f43171OooO00o.OooOO0(o00oo0oo.get(size - 1).longValue());
                    if (roomUserInfoModelOooOO0 != null && (userHeader = roomUserInfoModelOooOO0.getUserHeader()) != null) {
                        str = userHeader;
                    }
                    oooO0o.OooO0oo(str);
                    LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boxing.boxBoolean(true));
                } else {
                    oooO0o.OooO0oo("");
                    oO000Oo.OooO0O0(this.f43496OoooO00);
                }
            } else {
                o00OO0OO<Long> o00oo0oo2 = o00OO000.OooO0o.f43255OooOO0o;
                o000O0.OooO0OO(o00oo0oo2, new OooO0O0(this.f43495Oooo));
                if (o00oo0oo2.size() == 0) {
                    oO000Oo.OooO0O0(this.f43496OoooO00);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oO000Oo oo000oo) {
        Objects.requireNonNull(oo000oo);
        if (o00OO000.OooO0o.f43245OooO00o.OooO0Oo()) {
            o00O000.OooO().OooOOOo();
        }
    }

    @Override // p535o0o0OOOo.o
    @NotNull
    public final String OooO00o() {
        return o.OooO00o.OooO00o(this);
    }

    public final void OooO0OO(int i, @Nullable byte[] bArr) {
        SilenceModel silenceModel;
        InOutRoomModel inOutRoomModel;
        RoomUserInfoModel user;
        GetMicModel getMicModel;
        ThrowMicModel throwMicModel;
        RoomAdminUpgradeModel roomAdminUpgradeModel;
        Room.MicApplyReply from;
        Room.MicInviteFromApplyReply from2;
        Room.MicUpFromMicApplyInviteReply from3;
        Room.MicApplySwitchOpenReply from4;
        Room.AllowAdminOpenMicApplyReply from5;
        Room.MicApplyListReply from6;
        o.OooO00o.OooO0O0(this, i, bArr);
        switch (i) {
            case 10006:
                if (bArr != null && (silenceModel = (SilenceModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), SilenceModel.class)) != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseBeBarredSpeakingMessage " + silenceModel);
                    OooO0Oo(silenceModel.to.uid);
                    o00OO0O0.f43338OooooOo.OooO00o().f43394OooooO0.postValue(new Pair<>(Long.valueOf(silenceModel.to.uid), Boolean.valueOf(silenceModel.silence)));
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0Oo0oo(silenceModel, null), 3, null);
                }
                break;
            case 10007:
                if (bArr != null && (inOutRoomModel = (InOutRoomModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), InOutRoomModel.class)) != null && (user = inOutRoomModel.getUser()) != null && inOutRoomModel.getKind() != 0) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new ooOOOOoo(this, user, null), 3, null);
                }
                break;
            case 10016:
                if (bArr != null && (getMicModel = (GetMicModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), GetMicModel.class)) != null) {
                    OooO0Oo(getMicModel.user.getUserId());
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO000Oo0(getMicModel, null), 3, null);
                }
                break;
            case 10017:
                if (bArr != null && (throwMicModel = (ThrowMicModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), ThrowMicModel.class)) != null) {
                    long j = throwMicModel.userid;
                    Long value = OooOOO.f41235OooO00o.OooOo().getValue();
                    if (value != null && j == value.longValue()) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO000OOo(null), 3, null);
                    }
                }
                break;
            case 10023:
            case 100231:
            case 100232:
                if (bArr != null) {
                    if (i == 100231) {
                        roomAdminUpgradeModel = new RoomAdminUpgradeModel();
                        OooOOO oooOOO = OooOOO.f41235OooO00o;
                        roomAdminUpgradeModel.userid = ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue();
                        roomAdminUpgradeModel.setUsername(oooOOO.OooOoO().getValue());
                    } else {
                        roomAdminUpgradeModel = (RoomAdminUpgradeModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), RoomAdminUpgradeModel.class);
                    }
                    if (roomAdminUpgradeModel != null) {
                        o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseUpgradeAdminMessage " + roomAdminUpgradeModel);
                        OooO0Oo(roomAdminUpgradeModel.userid);
                        break;
                    }
                }
                break;
            case 100241:
                if (i == 100241) {
                    if (o00OO000.OooO0o.f43245OooO00o.OooO0Oo()) {
                        o00O000.OooO().OooOOOo();
                    }
                    LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boolean.TRUE);
                }
                break;
            case 1001100:
                if (bArr != null && (from = Room.MicApplyReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseApplyUpMicMessage " + from);
                    List<Room.UserModel> usersList = from.getUsersList();
                    Intrinsics.checkNotNullExpressionValue(usersList, "reply.usersList");
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList, 10));
                    for (Room.UserModel model : usersList) {
                        long userId = model.getUserId();
                        o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                        RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(model, "model");
                        o00oo001.OooOO0o(userId, companion.of(model));
                        arrayList.add(Long.valueOf(userId));
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0OoOO0(arrayList, from, this, null), 3, null);
                }
                break;
            case 1001103:
                if (bArr != null && (from2 = Room.MicInviteFromApplyReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseInviteUpMicMessage " + from2);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0OOo0o(from2, null), 3, null);
                }
                break;
            case 1001105:
                if (bArr != null && (from3 = Room.MicUpFromMicApplyInviteReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseAnswerInviteUpMicMessage " + from3);
                    OooO0Oo(from3.getUserId());
                }
                break;
            case 1001106:
                if (bArr != null && (from4 = Room.MicApplySwitchOpenReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseMicApplyOpenMessage " + from4);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0o0o(from4, this, null), 3, null);
                }
                break;
            case 1001108:
                if (bArr != null && (from5 = Room.AllowAdminOpenMicApplyReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseAllowManagerOpenApplyMicMessage " + from5);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO000O0O(from5, null), 3, null);
                }
                break;
            case 1001109:
                if (bArr != null && (from6 = Room.MicApplyListReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseMicApplyListMessage " + from6);
                    List<Room.UserModel> usersList2 = from6.getUsersList();
                    Intrinsics.checkNotNullExpressionValue(usersList2, "reply.usersList");
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList2, 10));
                    for (Room.UserModel it : usersList2) {
                        o00OO000 o00oo002 = o00OO000.f43171OooO00o;
                        long userId2 = it.getUserId();
                        RoomUserInfoModel.Companion companion2 = RoomUserInfoModel.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        o00oo002.OooOO0o(userId2, companion2.of(it));
                        arrayList2.add(Long.valueOf(it.getUserId()));
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0Ooooo(arrayList2, from6, null), 3, null);
                }
                break;
        }
    }

    public final void OooO0Oo(long j) {
        o00OO000.OooO0o oooO0o = o00OO000.OooO0o.f43245OooO00o;
        if (o00OO000.OooO0o.f43255OooOO0o.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(j, this, null), 3, null);
    }
}
