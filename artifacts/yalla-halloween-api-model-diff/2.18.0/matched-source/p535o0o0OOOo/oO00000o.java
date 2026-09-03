package p535o0o0OOOo;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.application.App;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.ChatModel;
import com.app.base.model.InOutRoomModel;
import com.app.base.model.roomBroadcastModel.RoomBroadcastModel;
import com.app.base.protobuf.room.Room;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.ak;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.RoomLoginState;
import com.yalla.yalla.data.db.model.RoomTheme;
import com.yalla.yalla.model.MemberBadgeInfo;
import com.yalla.yalla.model.RoomUserInfoModel;
import io.agora.rtc.Constants;
import io.agora.rtc.internal.RtcEngineEvent;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p047Oooooo0.o00OO0OO;
import p143o00OOooO.o000OO00;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p154o00Oo0oO.oo0o0Oo;
import p160o00OoOO.o00;
import p160o00OoOO.o000O00O;
import p160o00OoOO.o000O0O0;
import p160o00OoOO.o000OO0O;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.o00O000;
import p390o0OOooO.o00000O0;
import p393o0OOooOo.o0O00000;
import p448o0OoOo0o.o0O0o000;
import p489o0o000oO.o0ooOOo;
import p500o0o00Oo0.OooOOO;
import p501o0o00OoO.o0OO00O;
import p517o0o0O00.o00O00;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p534o0o0OOOO.ooo0Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00000o implements o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO00000 f43460OooO00o;

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$4", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (o00OO0O0.f43338OooooOo.OooO00o().OooOOO()) {
                o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                o00OO000.f43170OooO.setValue(Boxing.boxBoolean(true));
            } else {
                o00OO000 o00oo002 = o00OO000.f43171OooO00o;
                o00OO000.f43199OooOooO.setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<RoomBroadcastModel>> {
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00OO0O0.OooO0O0.C0405OooO0O0 c0405OooO0O0 = o00OO0O0.OooO0O0.C0405OooO0O0.f43399OooO00o;
            Intrinsics.checkNotNullParameter(c0405OooO0O0, "<set-?>");
            o00OO000.f43174OooO0Oo.setValue(c0405OooO0O0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$2$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MemberBadgeInfo f43461Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MemberBadgeInfo memberBadgeInfo, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f43461Oooo = memberBadgeInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f43461Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00OO000.f43183OooOOO0.setValue(Boolean.valueOf(this.f43461Oooo.getBadgeState()));
            o00oo001.OooOOoo(this.f43461Oooo.getMemberLevel());
            o00oo001.OooOOOo(this.f43461Oooo.getBadgeUrl());
            o00oo001.OooOo00(this.f43461Oooo.getBadgeLevelUrl());
            o00oo001.OooOOo(this.f43461Oooo.getIsTopRank());
            if (this.f43461Oooo.getMemberLevel() > 0 && !this.f43461Oooo.getBadgeState()) {
                if (this.f43461Oooo.getMemberLevel() >= 15) {
                    str = "svga/anim_member_high_frozen.svga";
                } else {
                    int memberLevel = this.f43461Oooo.getMemberLevel();
                    boolean z = false;
                    if (7 <= memberLevel && memberLevel < 15) {
                        z = true;
                    }
                    str = z ? "svga/anim_member_middle_frozen.svga" : "svga/anim_member_lower_frozen.svga";
                }
                o00oo001.OooOOo0(str);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$3", f = "RoomCommonMsgProcessor.kt", i = {}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f43462Oooo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f43462Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Boolean> mutableSharedFlow = o00OO0O0.f43338OooooOo.OooO00o().f43348OooO0oo;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f43462Oooo = 1;
                if (mutableSharedFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$5", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomLoginInformation f43463Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RoomLoginInformation roomLoginInformation, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f43463Oooo = roomLoginInformation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f43463Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000.OooO0o oooO0o = o00OO000.OooO0o.f43245OooO00o;
            o00OO000.OooO0o.f43249OooO0o.setValue(Boolean.valueOf(this.f43463Oooo.getRoom().micapplyopen));
            String str = this.f43463Oooo.getRoom().topinapplylist;
            if (str == null) {
                str = "";
            }
            oooO0o.OooO0oo(str);
            oooO0o.OooO0oO(this.f43463Oooo.getRoom().applylistlen);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseRoomContributionMessage$1$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Room.SumAmountOut f43464Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Room.SumAmountOut sumAmountOut, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f43464Oooo = sumAmountOut;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f43464Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000.OooO00o.f43225OooO00o.OooO00o(this.f43464Oooo.getAmount());
            o00OO0O0.f43338OooooOo.OooO00o().f43356OooOOo.postValue(Boxing.boxLong(this.f43464Oooo.getAmount()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseUserInfoChangedMessage$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ JSONObject f43465Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f43466OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f43467OoooO00;

        public static final class OooO00o<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                long jLongValue = ((Number) t2).longValue();
                o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                RoomUserInfoModel roomUserInfoModelOooOO0 = o00oo001.OooOO0(jLongValue);
                Long lValueOf = Long.valueOf(roomUserInfoModelOooOO0 != null ? roomUserInfoModelOooOO0.getPriority() : 0L);
                RoomUserInfoModel roomUserInfoModelOooOO1 = o00oo001.OooOO0(((Number) t).longValue());
                return ComparisonsKt.compareValues(lValueOf, Long.valueOf(roomUserInfoModelOooOO1 != null ? roomUserInfoModelOooOO1.getPriority() : 0L));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(JSONObject jSONObject, RoomUserInfoModel roomUserInfoModel, long j, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f43465Oooo = jSONObject;
            this.f43467OoooO00 = roomUserInfoModel;
            this.f43466OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f43465Oooo, this.f43467OoooO00, this.f43466OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0066 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:16:0x0079 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x008c A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x00a7 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x00c3 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x00d6 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00ee A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0106 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x011f A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x012e A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0141 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0159 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0173 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0188 A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x019d A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x01a7 A[Catch: Exception -> 0x01b7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0029, B:5:0x0034, B:11:0x005e, B:13:0x0066, B:14:0x0071, B:16:0x0079, B:17:0x0084, B:19:0x008c, B:20:0x009f, B:22:0x00a7, B:23:0x00bb, B:25:0x00c3, B:26:0x00ce, B:28:0x00d6, B:29:0x00e6, B:31:0x00ee, B:32:0x00fe, B:34:0x0106, B:35:0x0115, B:37:0x011f, B:38:0x0126, B:40:0x012e, B:41:0x0139, B:43:0x0141, B:44:0x0151, B:46:0x0159, B:47:0x0169, B:49:0x0173, B:50:0x017e, B:52:0x0188, B:54:0x019d, B:56:0x01a7, B:7:0x0049, B:9:0x0051), top: B:64:0x0029 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            o00OO0OO<Long> o00oo0oo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            try {
                if (!this.f43465Oooo.has("isVIP")) {
                    if (this.f43465Oooo.has("nVIPLv")) {
                        this.f43467OoooO00.setPremiumLevel(this.f43465Oooo.getInt("nVIPLv"));
                    } else {
                        z = false;
                    }
                    if (this.f43465Oooo.has("kaVipState")) {
                        this.f43467OoooO00.setVipState(this.f43465Oooo.getInt("kaVipState"));
                    }
                    if (this.f43465Oooo.has("kaVipLv")) {
                        this.f43467OoooO00.setVipLevel(this.f43465Oooo.getInt("kaVipLv"));
                    }
                    if (this.f43465Oooo.has("showKAVIP")) {
                        this.f43467OoooO00.setShowVIP(o000Oo0.OooO00o(Boxing.boxInt(this.f43465Oooo.getInt("showKAVIP"))));
                    }
                    if (this.f43465Oooo.has("showPremiumFirst")) {
                        this.f43467OoooO00.setShowPremiumFirst(o000Oo0.OooO00o(Boxing.boxInt(this.f43465Oooo.getInt("showPremiumFirst"))));
                        z = true;
                    }
                    if (this.f43465Oooo.has("vehicleid")) {
                        this.f43467OoooO00.setVehicleId(this.f43465Oooo.getInt("vehicleid"));
                    }
                    if (this.f43465Oooo.has("carsvga")) {
                        RoomUserInfoModel roomUserInfoModel = this.f43467OoooO00;
                        String string = this.f43465Oooo.getString("carsvga");
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"carsvga\")");
                        roomUserInfoModel.setVehicleSVGAUrl(string);
                    }
                    if (this.f43465Oooo.has("carimg")) {
                        RoomUserInfoModel roomUserInfoModel2 = this.f43467OoooO00;
                        String string2 = this.f43465Oooo.getString("carimg");
                        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"carimg\")");
                        roomUserInfoModel2.setVehicleUrl(string2);
                    }
                    if (this.f43465Oooo.has("prettyid")) {
                        this.f43467OoooO00.setUserIdx(String.valueOf(this.f43465Oooo.getLong("prettyid")));
                    }
                    if (this.f43465Oooo.has("HeadWearExpired")) {
                        this.f43467OoooO00.setHeaderCardId(0);
                        z = true;
                    }
                    if (this.f43465Oooo.has("memberLevel")) {
                        this.f43467OoooO00.setMemberLevel(this.f43465Oooo.getInt("memberLevel"));
                    }
                    if (this.f43465Oooo.has("badgeUrl")) {
                        RoomUserInfoModel roomUserInfoModel3 = this.f43467OoooO00;
                        String string3 = this.f43465Oooo.getString("badgeUrl");
                        Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(\"badgeUrl\")");
                        roomUserInfoModel3.setBadgeUrl(string3);
                    }
                    if (this.f43465Oooo.has("badgeLevelUrl")) {
                        RoomUserInfoModel roomUserInfoModel4 = this.f43467OoooO00;
                        String string4 = this.f43465Oooo.getString("badgeLevelUrl");
                        Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.getString(\"badgeLevelUrl\")");
                        roomUserInfoModel4.setBadgeLevelUrl(string4);
                    }
                    if (this.f43465Oooo.has("isTopRank")) {
                        this.f43467OoooO00.setTopRank(this.f43465Oooo.getBoolean("isTopRank"));
                    }
                    if (this.f43465Oooo.has("priority")) {
                        this.f43467OoooO00.setPriority(this.f43465Oooo.getLong("priority"));
                        o00OO000.OooOO0 oooOO1 = o00OO000.OooOO0.f43272OooO00o;
                        o00oo0oo = o00OO000.OooOO0.f43275OooO0Oo;
                        if (o00oo0oo.size() > 1) {
                            CollectionsKt.sortWith(o00oo0oo, new OooO00o());
                        }
                    }
                    if (z) {
                        LiveEventBus.get("ROOM_UPDATE_MIC_LIST").post(Boxing.boxLong(this.f43466OoooO0));
                    }
                    return Unit.INSTANCE;
                }
                this.f43467OoooO00.setPremium(o000Oo0.OooO00o(Boxing.boxInt(this.f43465Oooo.getInt("isVIP"))));
                z = true;
                if (this.f43465Oooo.has("kaVipState")) {
                    this.f43467OoooO00.setVipState(this.f43465Oooo.getInt("kaVipState"));
                }
                if (this.f43465Oooo.has("kaVipLv")) {
                    this.f43467OoooO00.setVipLevel(this.f43465Oooo.getInt("kaVipLv"));
                }
                if (this.f43465Oooo.has("showKAVIP")) {
                    this.f43467OoooO00.setShowVIP(o000Oo0.OooO00o(Boxing.boxInt(this.f43465Oooo.getInt("showKAVIP"))));
                }
                if (this.f43465Oooo.has("showPremiumFirst")) {
                    this.f43467OoooO00.setShowPremiumFirst(o000Oo0.OooO00o(Boxing.boxInt(this.f43465Oooo.getInt("showPremiumFirst"))));
                    z = true;
                }
                if (this.f43465Oooo.has("vehicleid")) {
                    this.f43467OoooO00.setVehicleId(this.f43465Oooo.getInt("vehicleid"));
                }
                if (this.f43465Oooo.has("carsvga")) {
                    RoomUserInfoModel roomUserInfoModel5 = this.f43467OoooO00;
                    String string5 = this.f43465Oooo.getString("carsvga");
                    Intrinsics.checkNotNullExpressionValue(string5, "jsonObject.getString(\"carsvga\")");
                    roomUserInfoModel5.setVehicleSVGAUrl(string5);
                }
                if (this.f43465Oooo.has("carimg")) {
                    RoomUserInfoModel roomUserInfoModel6 = this.f43467OoooO00;
                    String string6 = this.f43465Oooo.getString("carimg");
                    Intrinsics.checkNotNullExpressionValue(string6, "jsonObject.getString(\"carimg\")");
                    roomUserInfoModel6.setVehicleUrl(string6);
                }
                if (this.f43465Oooo.has("prettyid")) {
                    this.f43467OoooO00.setUserIdx(String.valueOf(this.f43465Oooo.getLong("prettyid")));
                }
                if (this.f43465Oooo.has("HeadWearExpired")) {
                    this.f43467OoooO00.setHeaderCardId(0);
                    z = true;
                }
                if (this.f43465Oooo.has("memberLevel")) {
                    this.f43467OoooO00.setMemberLevel(this.f43465Oooo.getInt("memberLevel"));
                }
                if (this.f43465Oooo.has("badgeUrl")) {
                    RoomUserInfoModel roomUserInfoModel7 = this.f43467OoooO00;
                    String string7 = this.f43465Oooo.getString("badgeUrl");
                    Intrinsics.checkNotNullExpressionValue(string7, "jsonObject.getString(\"badgeUrl\")");
                    roomUserInfoModel7.setBadgeUrl(string7);
                }
                if (this.f43465Oooo.has("badgeLevelUrl")) {
                    RoomUserInfoModel roomUserInfoModel8 = this.f43467OoooO00;
                    String string8 = this.f43465Oooo.getString("badgeLevelUrl");
                    Intrinsics.checkNotNullExpressionValue(string8, "jsonObject.getString(\"badgeLevelUrl\")");
                    roomUserInfoModel8.setBadgeLevelUrl(string8);
                }
                if (this.f43465Oooo.has("isTopRank")) {
                    this.f43467OoooO00.setTopRank(this.f43465Oooo.getBoolean("isTopRank"));
                }
                if (this.f43465Oooo.has("priority")) {
                    this.f43467OoooO00.setPriority(this.f43465Oooo.getLong("priority"));
                    o00OO000.OooOO0 oooOO2 = o00OO000.OooOO0.f43272OooO00o;
                    o00oo0oo = o00OO000.OooOO0.f43275OooO0Oo;
                    if (o00oo0oo.size() > 1) {
                        CollectionsKt.sortWith(o00oo0oo, new OooO00o());
                    }
                }
                if (z) {
                    LiveEventBus.get("ROOM_UPDATE_MIC_LIST").post(Boxing.boxLong(this.f43466OoooO0));
                }
            } catch (Exception e) {
                if (!o0ooOOo.OooO0OO()) {
                    e.printStackTrace();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // p535o0o0OOOo.o
    @NotNull
    public final String OooO00o() {
        return o.OooO00o.OooO00o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(byte[] bArr) {
        RoomLoginInformation roomLoginInformation;
        String str = bArr == null ? "" : new String(bArr, Charsets.UTF_8);
        o00O00.OooO0O0("parseBroadcastMessage->" + str);
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
        if (absJavaBeanApi == null || (roomLoginInformation = o000O00O.OooO().f32451OoooO0) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(roomLoginInformation, "MixedRoomDataSource.getI…oginInformation ?: return");
        Model model = absJavaBeanApi.data;
        if (model != 0) {
            RoomUserInfoModel from = ((RoomBroadcastModel) model).getFrom();
            if (Intrinsics.areEqual(from != null ? Long.valueOf(from.getUserId()) : null, OooOOO.f41235OooO00o.OooOo().getValue()) && ((RoomBroadcastModel) absJavaBeanApi.data).getBalance() != null) {
                o000O00O o000o00oOooO = o000O00O.OooO();
                Integer balance = ((RoomBroadcastModel) absJavaBeanApi.data).getBalance();
                Intrinsics.checkNotNullExpressionValue(balance, "it.data.balance");
                o000o00oOooO.Oooo00o(balance.intValue());
            }
            o000O00O.OooO().OooOooO(10019, 0, absJavaBeanApi.data);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(byte[] bArr) {
        RoomUserInfoModel roomUserInfoModel;
        HashMap<Long, Boolean> map;
        RoomUserInfoModel roomUserInfoModel2;
        if (bArr == null) {
            return;
        }
        String str = new String(bArr, Charsets.UTF_8);
        o00O00.OooO0OO(o.OooO00o.OooO00o(this), " loginInformation = " + str);
        RoomLoginInformation loginInformation = (RoomLoginInformation) p518o0o0O000.o0Oo0oo.OooO0OO(str, RoomLoginInformation.class);
        if (loginInformation == null) {
            return;
        }
        int i = loginInformation.f11855code;
        if (i == 0) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(null), 3, null);
            p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
            if (p499o0o00Oo.OooOOO0.OooO0Oo().OooO00o("IsNewUserFirstEnterRoom", false)) {
                p499o0o00Oo.OooOOO0.OooO0Oo().OooO0o("IsNewUserFirstEnterRoom", false);
                o0O00000.OooO0OO("Go_have_fun_click");
            }
            o00OO000.f43171OooO00o.OooOOOO(0);
            o00OO000.f43178OooO0oo.setValue(Boolean.valueOf(loginInformation.noisereduce));
            o000O00O o000o00oOooO = o000O00O.OooO();
            Objects.requireNonNull(o000o00oOooO);
            o00O00.OooO0OO("setRoomLoginInformation", loginInformation.toString());
            o000o00oOooO.f32451OoooO0 = loginInformation;
            RoomLoginInformation.RoomBean room = loginInformation.getRoom();
            o00OO0O0 o00oo0o0OooO00o = o00OO0O0.f43338OooooOo.OooO00o();
            o00oo0o0OooO00o.f43350OooOO0O.postValue(RoomLoginState.Succes);
            o00oo0o0OooO00o.f43355OooOOOo.postValue(room.getBackground());
            o00oo0o0OooO00o.f43357OooOOo0.postValue(room.getBackgroundvideo());
            o00oo0o0OooO00o.f43354OooOOOO.postValue(Integer.valueOf(loginInformation.getPosition()));
            o00oo0o0OooO00o.f43363OooOo0o.postValue(Integer.valueOf(loginInformation.getRoom().getDues()));
            o00oo0o0OooO00o.f43346OooO0o0.postValue(Integer.valueOf(loginInformation.getRoom().getRegion()));
            o00oo0o0OooO00o.OooO0oO().postValue(Integer.valueOf(loginInformation.getRoom().getLucknumcost()));
            o00oo0o0OooO00o.OooOO0O().postValue(Boolean.valueOf(loginInformation.getRoom().isLuckNumAdmin()));
            o00oo0o0OooO00o.OooO0oo().postValue(Long.valueOf(loginInformation.getRoom().getLuckNum()));
            o00oo0o0OooO00o.OooO().postValue(Integer.valueOf(loginInformation.getRoom().getLucknummode()));
            o00oo0o0OooO00o.OooOO0().postValue(Integer.valueOf(loginInformation.getRoom().getLucknumset()));
            o00oo0o0OooO00o.f43362OooOo0O.postValue(room.getNotice());
            o00oo0o0OooO00o.f43345OooO0o.postValue(Integer.valueOf(room.getLevel()));
            OooOOO oooOOO = OooOOO.f41235OooO00o;
            if (!oooOOO.OooOooO().getValue().booleanValue()) {
                o0OO00O o0oo00oOooO0o0 = p499o0o00Oo.OooOOO0.OooO0o0();
                StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "touristLoginRoom");
                sbOooO00o.append(oooOOO.OooOo().getValue());
                if (o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false)) {
                    Job job = o00oo0o0OooO00o.f43385OoooO0O;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    o00oo0o0OooO00o.f43385OoooO0O = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new p532o0o0OOO.o00OO0OO(o00oo0o0OooO00o, null), 3, null);
                }
            }
            p499o0o00Oo.OooOOO0.OooO0oO().OooOOoo(loginInformation.getAutoGrabBonus());
            RoomTheme roomTheme = new RoomTheme();
            roomTheme.roomId = room.getId();
            roomTheme.roomTheme = room.getBackground();
            p493o0o00O00.OooO0OO.OooO00o().OooOooo().OooO00o(roomTheme);
            o000o00oOooO.f32455OoooOOO.clear();
            o000o00oOooO.f32455OoooOOO.put(0, loginInformation.getMicone());
            o000o00oOooO.f32455OoooOOO.put(1, loginInformation.getMictwo());
            o000o00oOooO.f32455OoooOOO.put(2, loginInformation.getMicthree());
            o000o00oOooO.f32455OoooOOO.put(3, loginInformation.getMicfour());
            o000o00oOooO.f32455OoooOOO.put(4, loginInformation.getMicfive());
            if (loginInformation.getRoom().getMictype() == 1) {
                o000o00oOooO.f32455OoooOOO.put(5, loginInformation.getMicsix());
                o000o00oOooO.f32455OoooOOO.put(6, loginInformation.getMicseven());
                o000o00oOooO.f32455OoooOOO.put(7, loginInformation.getMiceight());
                o000o00oOooO.f32455OoooOOO.put(8, loginInformation.getMicnine());
                o000o00oOooO.f32455OoooOOO.put(9, loginInformation.getMicten());
            }
            final boolean z = false;
            for (int i2 = 0; i2 < o000o00oOooO.f32455OoooOOO.size(); i2++) {
                RoomLoginInformation.MIC mic = o000o00oOooO.f32455OoooOOO.get(i2);
                if (mic != null && (map = o000o00oOooO.f32456OoooOOo) != null && (roomUserInfoModel2 = mic.user) != null && map.containsKey(Long.valueOf(roomUserInfoModel2.getUserId())) && o000o00oOooO.f32456OoooOOo.get(Long.valueOf(mic.user.getUserId())).booleanValue()) {
                    mic.setMuteSound(true);
                }
                if (mic != null && (roomUserInfoModel = mic.user) != null && roomUserInfoModel.getUserId() == OooOOO.f41235OooO00o.OooOo().getValue().longValue()) {
                    o0O0o000.OooO0O0().OooO00o().OooO0Oo(o000o00oOooO.OooOO0(mic.getVoicecard()));
                    z = true;
                }
            }
            o00O000 o00o001 = o00O000.f34368OooO00o;
            o00O000.f34370OooO0OO.post(new Runnable() { // from class: o00OoOO.o000O00
                @Override // java.lang.Runnable
                public final void run() {
                    o00OO000.OooO0o.f43245OooO00o.OooOO0(z);
                }
            });
            Objects.requireNonNull(p160o00OoOO.o00O000.OooO());
            o00 o00Var = p160o00OoOO.o00O000.f32490OooO00o;
            if (o00Var != null) {
                o00Var.OooO0o(10052, null);
            }
            p160o00OoOO.o00O000.OooO().OooOO0O();
            Objects.requireNonNull(p160o00OoOO.o00O000.OooO());
            o00 o00Var2 = p160o00OoOO.o00O000.f32490OooO00o;
            if (o00Var2 != null) {
                o00Var2.OooO0o(10053, null);
            }
            Objects.requireNonNull(p160o00OoOO.o00O000.OooO());
            o00 o00Var3 = p160o00OoOO.o00O000.f32490OooO00o;
            if (o00Var3 != null) {
                o00Var3.OooO0o(10044, null);
            }
            p160o00OoOO.o00O000.OooO().OooOOo0(0L, true);
            Objects.requireNonNull(p160o00OoOO.o00O000.OooO());
            if (p160o00OoOO.o00O000.f32490OooO00o != null) {
                Room.GetEnvelopListRequest.Builder builderNewBuilder = Room.GetEnvelopListRequest.newBuilder();
                builderNewBuilder.setAutotype(1);
                p160o00OoOO.o00O000.f32490OooO00o.OooO0oO(10075, builderNewBuilder.build().toByteArray());
            }
            o000o00oOooO.OooOo00(loginInformation);
            int region = loginInformation.getRoom().getRegion();
            o000OO0O o000oo0o2 = new o000OO0O(App.f11473OoooO00);
            Map<String, String> mapOooO0O0 = p161o00OoOO0.o00OO0OO.OooO0O0();
            mapOooO0O0.remove("region");
            mapOooO0O0.put("region", region + "");
            mapOooO0O0.put(ak.aB, "room");
            p154o00Oo0oO.o0ooOOo o0ooooo2 = p154o00Oo0oO.o0ooOOo.f32239OooO00o;
            List<String> list = p154o00Oo0oO.o0ooOOo.f32265OooOoo;
            p161o00OoOO0.o00OO0OO.OooO0OO(null, list, p154o00Oo0oO.o0ooOOo.f32302o000000, mapOooO0O0, o000oo0o2);
            Long value = o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue();
            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
            oo0o0Oo oo0o0oo = o00000OO.f32231OooO0Oo;
            o000O0O0 o000o0o1 = new o000O0O0();
            Map<String, String> mapOooO0O1 = p161o00OoOO0.o00OO0OO.OooO0O0();
            mapOooO0O1.put("barid", String.valueOf(value));
            p161o00OoOO0.o00OO0OO.OooO0OO(null, list, p154o00Oo0oO.o0ooOOo.f32360o0ooOOo, mapOooO0O1, o000o0o1);
            if (OooOOO.f41235OooO00o.OooOooO().getValue().booleanValue()) {
                o000o00oOooO.OooOoo0(o000o00oOooO.f32454OoooOO0);
            }
            oo0O.OooO0OO.f53343OooO00o.OooO0Oo(false);
            if (!o000o00oOooO.f32460Ooooo00) {
                String notice = room.getNotice();
                ChatModel chatModel = new ChatModel();
                chatModel.type = 13;
                chatModel.message = notice;
                o000o00oOooO.OooO00o(chatModel);
            }
            o000o00oOooO.f32460Ooooo00 = true;
            MemberBadgeInfo memberBadgeInfo = loginInformation.memberInfo;
            if (memberBadgeInfo != null && (loginInformation.getPosition() == 3 || loginInformation.getPosition() == 2)) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(memberBadgeInfo, null), 3, null);
            }
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = o00OO000.f43177OooO0oO;
            if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                oO00000 oo00000 = this.f43460OooO00o;
                if (oo00000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
                    oo00000 = null;
                }
                Objects.requireNonNull(oo00000);
                Intrinsics.checkNotNullParameter(loginInformation, "loginInformation");
                if (loginInformation.f11855code == 0) {
                    ChatModel chatModel2 = new ChatModel();
                    chatModel2.type = 3;
                    chatModel2.message = p255o00ooO0O.o000O0O0.OooO0OO(R.string.welcome_top);
                    o000O00O.OooO().OooO00o(chatModel2);
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooO0o(null), 2, null);
            }
            if (o00OO000.f43208Oooo0o) {
                o00OO000.f43208Oooo0o = false;
                o00OO000.f43201Oooo.postValue(Boolean.TRUE);
            }
            if (((Boolean) o00OO000.f43213OoooO0.getValue()).booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(null), 3, null);
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0(loginInformation, null), 3, null);
        } else {
            ooo0Oo0.OooO0OO(i, RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS, str);
        }
        o000O00O.OooO().OooOooO(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS, 0, str);
    }

    public final void OooO0Oo(int i, @Nullable byte[] bArr) {
        o.OooO00o.OooO0O0(this, i, bArr);
        try {
            if (i == 10001) {
                OooO0OO(bArr);
            } else if (i == 10007) {
                OooO0o0(bArr);
            } else if (i == 10019) {
                OooO0O0(bArr);
            } else if (i != 10041) {
                if (i == 10045) {
                    OooO0oo(i, bArr);
                } else if (i == 10053) {
                    OooO0o(i, bArr);
                } else if (i != 1000700) {
                } else {
                    OooO0oO(i, bArr);
                }
            } else {
                if (bArr == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0000O(new JSONObject(new String(bArr, Charsets.UTF_8)), null), 3, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0o(int i, byte[] bArr) throws InvalidProtocolBufferException {
        Room.SumAmountOut from = Room.SumAmountOut.parseFrom(bArr);
        if (from != null) {
            o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseRoomContributionMessage what = " + i + "  data = " + from);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(from, null), 3, null);
        }
    }

    public final void OooO0o0(byte[] bArr) {
        RoomUserInfoModel user;
        if (bArr == null) {
            return;
        }
        String str = new String(bArr, Charsets.UTF_8);
        o00O00.OooO0OO(o.OooO00o.OooO00o(this), " OtherUserLoginRoom = " + str);
        InOutRoomModel inOutRoomModel = (InOutRoomModel) p518o0o0O000.o0Oo0oo.OooO0OO(str, InOutRoomModel.class);
        if (inOutRoomModel == null || (user = inOutRoomModel.getUser()) == null || inOutRoomModel.getKind() != 0 || inOutRoomModel.getSource() != 1) {
            return;
        }
        oO00000 oo00000 = this.f43460OooO00o;
        if (oo00000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
            oo00000 = null;
        }
        Objects.requireNonNull(oo00000);
        Intrinsics.checkNotNullParameter(user, "user");
        ChatModel chatModel = new ChatModel();
        chatModel.type = 35;
        chatModel.from = user;
        o000O00O.OooO().OooO00o(chatModel);
    }

    public final void OooO0oO(int i, byte[] bArr) throws InvalidProtocolBufferException {
        Room.InRoomUserSearchReply from = Room.InRoomUserSearchReply.parseFrom(bArr);
        if (from != null) {
            o00O00.OooO0OO(o.OooO00o.OooO00o(this), "parseSearchUserMessage what = " + i + "  data = " + from);
            LiveEventBus.get("SEARCH_ONLINE_USER").post(from.getUsersList());
        }
    }

    public final void OooO0oo(int i, byte[] bArr) {
        RoomUserInfoModel roomUserInfoModelOooOO0;
        if (bArr == null) {
            return;
        }
        String strOooO00o = o.OooO00o.OooO00o(this);
        StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("parseUserInfoChangedMessage type = ", i, "  data = ");
        Charset charset = Charsets.UTF_8;
        sbOooO00o.append(new String(bArr, charset));
        o00O00.OooO0OO(strOooO00o, sbOooO00o.toString());
        JSONObject jSONObject = new JSONObject(new String(bArr, charset));
        long jOptLong = jSONObject.optLong("uid", 0L);
        if (jOptLong == 0 || (roomUserInfoModelOooOO0 = o00OO000.f43171OooO00o.OooOO0(jOptLong)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(jSONObject, roomUserInfoModelOooOO0, jOptLong, null), 3, null);
    }
}
