package p533o0o0OOOo;

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
import p159o00OoOO.o00O000;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0Oo0oo;
import p522o0o0O0o.o000O0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO000o00 implements oO00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public oO00000o f43481OooO00o;

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$removeUserFormApplyMicList$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f43482Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO000o00 f43483Oooo0oO;

        /* JADX INFO: renamed from: o0o0OOOo.oO000o00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0407OooO00o extends Lambda implements Function1<Long, Boolean> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ long f43484Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0407OooO00o(long j) {
                super(1);
                this.f43484Oooo0o = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long l) {
                return Boolean.valueOf(l.longValue() == this.f43484Oooo0o);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function1<Long, Boolean> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ long f43485Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(long j) {
                super(1);
                this.f43485Oooo0o = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long l) {
                return Boolean.valueOf(l.longValue() == this.f43485Oooo0o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, oO000o00 oo000o00, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43482Oooo0o = j;
            this.f43483Oooo0oO = oo000o00;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f43482Oooo0o, this.f43483Oooo0oO, continuation);
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
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            if (oooO0o.OooO00o() > 0) {
                o00OO0OO<Long> o00oo0oo = o00O.OooO0o.f43226OooOO0o;
                o000O0.OooO0OO(o00oo0oo, new C0407OooO00o(this.f43482Oooo0o));
                int size = o00oo0oo.size();
                oooO0o.OooO0oO(size == 0 ? -1 : size);
                long j = this.f43482Oooo0o;
                Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                if (value != null && j == value.longValue()) {
                    oooO0o.OooO(false);
                }
                String str = "";
                if (size > 0) {
                    RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(o00oo0oo.get(size - 1).longValue());
                    if (roomUserInfoModelOooOO0 != null && (userHeader = roomUserInfoModelOooOO0.getUserHeader()) != null) {
                        str = userHeader;
                    }
                    oooO0o.OooO0oo(str);
                    LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boxing.boxBoolean(true));
                } else {
                    oooO0o.OooO0oo("");
                    oO000o00.OooO0O0(this.f43483Oooo0oO);
                }
            } else {
                o00OO0OO<Long> o00oo0oo2 = o00O.OooO0o.f43226OooOO0o;
                o000O0.OooO0OO(o00oo0oo2, new OooO0O0(this.f43482Oooo0o));
                if (o00oo0oo2.size() == 0) {
                    oO000o00.OooO0O0(this.f43483Oooo0oO);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oO000o00 oo000o00) {
        Objects.requireNonNull(oo000o00);
        if (o00O.OooO0o.f43216OooO00o.OooO0Oo()) {
            o00O000.OooO().OooOOOo();
        }
    }

    @Override // p533o0o0OOOo.oO00000
    @NotNull
    public final String OooO00o() {
        return oO00000.OooO00o.OooO00o(this);
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
        oO00000.OooO00o.OooO0O0(this, i, bArr);
        switch (i) {
            case 10006:
                if (bArr != null && (silenceModel = (SilenceModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), SilenceModel.class)) != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseBeBarredSpeakingMessage " + silenceModel);
                    OooO0Oo(silenceModel.to.uid);
                    o00OO00O.f43313OooooOo.OooO00o().f43369OooooO0.postValue(new Pair<>(Long.valueOf(silenceModel.to.uid), Boolean.valueOf(silenceModel.silence)));
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO000OOo(silenceModel, null), 3, null);
                }
                break;
            case 10007:
                if (bArr != null && (inOutRoomModel = (InOutRoomModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), InOutRoomModel.class)) != null && (user = inOutRoomModel.getUser()) != null && inOutRoomModel.getKind() != 0) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0OOo0o(this, user, null), 3, null);
                }
                break;
            case 10016:
                if (bArr != null && (getMicModel = (GetMicModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), GetMicModel.class)) != null) {
                    OooO0Oo(getMicModel.user.getUserId());
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO000Oo(getMicModel, null), 3, null);
                }
                break;
            case 10017:
                if (bArr != null && (throwMicModel = (ThrowMicModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), ThrowMicModel.class)) != null) {
                    long j = throwMicModel.userid;
                    Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                    if (value != null && j == value.longValue()) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new ooOOOOoo(null), 3, null);
                    }
                }
                break;
            case 10023:
            case 100231:
            case 100232:
                if (bArr != null) {
                    if (i == 100231) {
                        roomAdminUpgradeModel = new RoomAdminUpgradeModel();
                        OooOOO oooOOO = OooOOO.f41216OooO00o;
                        roomAdminUpgradeModel.userid = ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue();
                        roomAdminUpgradeModel.setUsername(oooOOO.OooOoO().getValue());
                    } else {
                        roomAdminUpgradeModel = (RoomAdminUpgradeModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), RoomAdminUpgradeModel.class);
                    }
                    if (roomAdminUpgradeModel != null) {
                        o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseUpgradeAdminMessage " + roomAdminUpgradeModel);
                        OooO0Oo(roomAdminUpgradeModel.userid);
                        break;
                    }
                }
                break;
            case 100241:
                if (i == 100241) {
                    if (o00O.OooO0o.f43216OooO00o.OooO0Oo()) {
                        o00O000.OooO().OooOOOo();
                    }
                    LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boolean.TRUE);
                }
                break;
            case 1001100:
                if (bArr != null && (from = Room.MicApplyReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseApplyUpMicMessage " + from);
                    List<Room.UserModel> usersList = from.getUsersList();
                    Intrinsics.checkNotNullExpressionValue(usersList, "reply.usersList");
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList, 10));
                    for (Room.UserModel model : usersList) {
                        long userId = model.getUserId();
                        o00O o00o2 = o00O.f43140OooO00o;
                        RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(model, "model");
                        o00o2.OooOO0o(userId, companion.of(model));
                        arrayList.add(Long.valueOf(userId));
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0Oo0oo(arrayList, from, this, null), 3, null);
                }
                break;
            case 1001103:
                if (bArr != null && (from2 = Room.MicInviteFromApplyReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseInviteUpMicMessage " + from2);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO000Oo0(from2, null), 3, null);
                }
                break;
            case 1001105:
                if (bArr != null && (from3 = Room.MicUpFromMicApplyInviteReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseAnswerInviteUpMicMessage " + from3);
                    OooO0Oo(from3.getUserId());
                }
                break;
            case 1001106:
                if (bArr != null && (from4 = Room.MicApplySwitchOpenReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseMicApplyOpenMessage " + from4);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0OoOO0(from4, this, null), 3, null);
                }
                break;
            case 1001108:
                if (bArr != null && (from5 = Room.AllowAdminOpenMicApplyReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseAllowManagerOpenApplyMicMessage " + from5);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0Ooooo(from5, null), 3, null);
                }
                break;
            case 1001109:
                if (bArr != null && (from6 = Room.MicApplyListReply.parseFrom(bArr)) != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "parseMicApplyListMessage " + from6);
                    List<Room.UserModel> usersList2 = from6.getUsersList();
                    Intrinsics.checkNotNullExpressionValue(usersList2, "reply.usersList");
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList2, 10));
                    for (Room.UserModel it : usersList2) {
                        o00O o00o3 = o00O.f43140OooO00o;
                        long userId2 = it.getUserId();
                        RoomUserInfoModel.Companion companion2 = RoomUserInfoModel.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        o00o3.OooOO0o(userId2, companion2.of(it));
                        arrayList2.add(Long.valueOf(it.getUserId()));
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0o0o(arrayList2, from6, null), 3, null);
                }
                break;
        }
    }

    public final void OooO0Oo(long j) {
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        if (o00O.OooO0o.f43226OooOO0o.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(j, this, null), 3, null);
    }
}
