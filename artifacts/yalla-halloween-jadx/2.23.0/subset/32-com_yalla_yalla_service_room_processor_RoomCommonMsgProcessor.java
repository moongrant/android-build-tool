package com.yalla.yalla.service.room.processor;

import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.db.model.RoomTheme;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.mixedroom.o000O000;
import com.yalla.yalla.mixedroom.o000O0o;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.MemberBadgeInfo;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.repository.RoomMemberRepo$getConveneMemberState$$inlined$call$1;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p381o0OOoo0O.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p385o0OOooOO.o00oOoo;
import p385o0OOooOO.oOO00O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p475o0o000.o00oO0o;
import p475o0o000.o0OoOo0;
import p475o0o000.oo000o;
import p475o0o000.oo0o0Oo;
import p476o0o0000o.o0000OO0;
import p579o0oOoo.oOo00OO0;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RoomCommonMsgProcessor implements com.yalla.yalla.service.room.processor.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final RoomCommonMsgProcessor f25128OooO00o = new RoomCommonMsgProcessor();

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$5", f = "RoomCommonMsgProcessor.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25129OooO0Oo;

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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25129OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().OooOOO()) {
                    long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                    this.f25129OooO0Oo = 1;
                    String str = o000oOoO.f44275OooO0oO;
                    o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(str, "url", str, 0);
                    o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "barid");
                    obj = com.code.android.util.OooOOO.OooO0Oo(new RoomMemberRepo$getConveneMemberState$$inlined$call$1(o0o0oooOooO00o, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.service.room.OooO00o.f24980OooO0oo.f47468OooO0O0.postValue((GetConveneMemberStateModel) ((ApiResult) obj).getData());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            com.yalla.yalla.service.room.OooO00o.OooO0oO(com.yalla.yalla.service.room.OooO0OO.OooO0o.f25055OooO00o);
            com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47492OooO0oO.setValue(-1);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$2$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MemberBadgeInfo f25130OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MemberBadgeInfo memberBadgeInfo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25130OooO0Oo = memberBadgeInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25130OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            MemberBadgeInfo memberBadgeInfo = this.f25130OooO0Oo;
            oo0o0oo.f47511OooO0o0.setValue(Boolean.valueOf(memberBadgeInfo.getBadgeState()));
            oo0o0oo.f47507OooO0O0.setValue(Integer.valueOf(memberBadgeInfo.getMemberLevel()));
            String badgeUrl = memberBadgeInfo.getBadgeUrl();
            Intrinsics.checkNotNullParameter(badgeUrl, "<set-?>");
            oo0o0oo.f47508OooO0OO.setValue(badgeUrl);
            String badgeLevelUrl = memberBadgeInfo.getBadgeLevelUrl();
            Intrinsics.checkNotNullParameter(badgeLevelUrl, "<set-?>");
            oo0o0oo.f47509OooO0Oo.setValue(badgeLevelUrl);
            oo0o0oo.f47510OooO0o.setValue(Boolean.valueOf(memberBadgeInfo.getIsTopRank()));
            if (memberBadgeInfo.getMemberLevel() > 0 && !memberBadgeInfo.getBadgeState()) {
                if (memberBadgeInfo.getMemberLevel() >= 15) {
                    str = "svga/anim_member_high_frozen.svga";
                } else {
                    int memberLevel = memberBadgeInfo.getMemberLevel();
                    str = 7 <= memberLevel && memberLevel < 15 ? "svga/anim_member_middle_frozen.svga" : "svga/anim_member_lower_frozen.svga";
                }
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                oo0o0oo.f47512OooO0oO.setValue(str);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$3", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomLoginInformation f25131OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$3$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25132OooO0Oo;

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
                int i = this.f25132OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<Boolean> mutableSharedFlow = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25004OooO0oO;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.f25132OooO0Oo = 1;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RoomLoginInformation roomLoginInformation, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25131OooO0Oo = roomLoginInformation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f25131OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00oO0o o00oo0o2 = com.yalla.yalla.service.room.OooO00o.f24992OooOo00;
            if (((Boolean) o00oo0o2.f47462OooO00o.getValue()).booleanValue()) {
                o00oo0o2.f47462OooO00o.setValue(Boolean.FALSE);
                RoomLoginInformation loginInformation = this.f25131OooO0Oo;
                Intrinsics.checkNotNullParameter(loginInformation, "loginInformation");
                if (loginInformation.code == 0) {
                    ChatModel chatModel = new ChatModel();
                    chatModel.setType(3);
                    chatModel.setMessage(o0000.OooO0OO(oO00OOo0.welcome_top));
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooO00o(null), 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseLoginRoom$4", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().OooOO0O()) {
                com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47506OooO00o.setValue(Boxing.boxBoolean(true));
            } else {
                com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47531OooOoOO.setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseRoomContributionMessage$1$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Room.SumAmountOut f25133OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Room.SumAmountOut sumAmountOut, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f25133OooO0Oo = sumAmountOut;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f25133OooO0Oo, continuation);
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
            o0OoOo0 o0oooo0 = com.yalla.yalla.service.room.OooO00o.f24972OooO;
            Room.SumAmountOut sumAmountOut = this.f25133OooO0Oo;
            o0oooo0.f47478OooO00o.setValue(Long.valueOf(sumAmountOut.getAmount()));
            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25011OooOOOO.postValue(Boxing.boxLong(sumAmountOut.getAmount()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseUserInfoChangedMessage$1", f = "RoomCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomCommonMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomCommonMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomCommonMsgProcessor$parseUserInfoChangedMessage$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n1011#2,2:316\n*S KotlinDebug\n*F\n+ 1 RoomCommonMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomCommonMsgProcessor$parseUserInfoChangedMessage$1\n*L\n269#1:316,2\n*E\n"})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ JSONObject f25134OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f25135OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f25136OooO0o0;

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RoomCommonMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomCommonMsgProcessor$parseUserInfoChangedMessage$1\n*L\n1#1,328:1\n269#2:329\n*E\n"})
        public static final class OooO00o<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                MutableStateFlow<Long> priority;
                MutableStateFlow<Long> priority2;
                long jLongValue = ((Number) t2).longValue();
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jLongValue));
                long jLongValue2 = 0;
                Long lValueOf = Long.valueOf((roomUserInfoModelOooO0o0 == null || (priority2 = roomUserInfoModelOooO0o0.getPriority()) == null) ? 0L : priority2.getValue().longValue());
                RoomUserInfoModel roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(((Number) t).longValue()));
                if (roomUserInfoModelOooO0o1 != null && (priority = roomUserInfoModelOooO0o1.getPriority()) != null) {
                    jLongValue2 = priority.getValue().longValue();
                }
                return ComparisonsKt.compareValues(lValueOf, Long.valueOf(jLongValue2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(JSONObject jSONObject, RoomUserInfoModel roomUserInfoModel, long j, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25134OooO0Oo = jSONObject;
            this.f25136OooO0o0 = roomUserInfoModel;
            this.f25135OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f25134OooO0Oo, this.f25136OooO0o0, this.f25135OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            JSONObject jSONObject = this.f25134OooO0Oo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            try {
                boolean zHas = jSONObject.has("isVIP");
                RoomUserInfoModel roomUserInfoModel = this.f25136OooO0o0;
                if (zHas) {
                    roomUserInfoModel.isPremium().setValue(Boxing.boxBoolean(o000000.OooO00o(Boxing.boxInt(jSONObject.getInt("isVIP")))));
                } else if (jSONObject.has("nVIPLv")) {
                    roomUserInfoModel.getPremiumLevel().setValue(Boxing.boxInt(jSONObject.getInt("nVIPLv")));
                }
                if (jSONObject.has("kaVipState")) {
                    roomUserInfoModel.getVipState().setValue(Boxing.boxInt(jSONObject.getInt("kaVipState")));
                }
                if (jSONObject.has("kaVipLv")) {
                    roomUserInfoModel.getVipLevel().setValue(Boxing.boxInt(jSONObject.getInt("kaVipLv")));
                }
                if (jSONObject.has("showKAVIP")) {
                    roomUserInfoModel.getShowVIP().setValue(Boxing.boxBoolean(o000000.OooO00o(Boxing.boxInt(jSONObject.getInt("showKAVIP")))));
                }
                if (jSONObject.has("showPremiumFirst")) {
                    roomUserInfoModel.getShowPremiumFirst().setValue(Boxing.boxBoolean(o000000.OooO00o(Boxing.boxInt(jSONObject.getInt("showPremiumFirst")))));
                }
                if (jSONObject.has("vehicleid")) {
                    roomUserInfoModel.getVehicleId().setValue(Boxing.boxInt(jSONObject.getInt("vehicleid")));
                }
                if (jSONObject.has("carsvga")) {
                    MutableStateFlow<String> vehicleSVGAUrl = roomUserInfoModel.getVehicleSVGAUrl();
                    String string = jSONObject.getString("carsvga");
                    Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"carsvga\")");
                    vehicleSVGAUrl.setValue(string);
                }
                if (jSONObject.has("carimg")) {
                    MutableStateFlow<String> vehicleUrl = roomUserInfoModel.getVehicleUrl();
                    String string2 = jSONObject.getString("carimg");
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"carimg\")");
                    vehicleUrl.setValue(string2);
                }
                if (jSONObject.has("prettyid")) {
                    roomUserInfoModel.getUserIdx().setValue(String.valueOf(jSONObject.getLong("prettyid")));
                }
                if (jSONObject.has("headwearexpired")) {
                    roomUserInfoModel.getHeaderCardId().setValue(Boxing.boxInt(0));
                    roomUserInfoModel.getHeaderCardUrl().setValue("");
                }
                if (jSONObject.has("memberLevel")) {
                    roomUserInfoModel.getMemberLevel().setValue(Boxing.boxInt(jSONObject.getInt("memberLevel")));
                }
                if (jSONObject.has("badgeUrl")) {
                    MutableStateFlow<String> badgeUrl = roomUserInfoModel.getBadgeUrl();
                    String string3 = jSONObject.getString("badgeUrl");
                    Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(\"badgeUrl\")");
                    badgeUrl.setValue(string3);
                }
                if (jSONObject.has("badgeLevelUrl")) {
                    MutableStateFlow<String> badgeLevelUrl = roomUserInfoModel.getBadgeLevelUrl();
                    String string4 = jSONObject.getString("badgeLevelUrl");
                    Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.getString(\"badgeLevelUrl\")");
                    badgeLevelUrl.setValue(string4);
                }
                if (jSONObject.has("isTopRank")) {
                    roomUserInfoModel.isTopRank().setValue(Boxing.boxBoolean(jSONObject.getBoolean("isTopRank")));
                }
                if (jSONObject.has("profileCardInfo")) {
                    roomUserInfoModel.getProfileCardInfo().setValue(jSONObject.getString("profileCardInfo"));
                    roomUserInfoModel.parseDataByDefaultJsonString();
                }
                boolean z = true;
                if (jSONObject.has("priority")) {
                    roomUserInfoModel.getPriority().setValue(Boxing.boxLong(jSONObject.getLong("priority")));
                    SnapshotStateList<Long> snapshotStateList = com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO;
                    if (snapshotStateList.size() > 1) {
                        CollectionsKt.sortWith(snapshotStateList, new OooO00o());
                    }
                }
                if (jSONObject.has("wealthLevel")) {
                    roomUserInfoModel.getWealthLevel().setValue(Boxing.boxInt(jSONObject.getInt("wealthLevel")));
                }
                boolean zHas2 = jSONObject.has("wealthShow");
                long j = this.f25135OooO0o;
                if (zHas2) {
                    boolean z2 = jSONObject.getBoolean("wealthShow");
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Long l = (Long) o000000O.OooOOo0().getValue();
                    if (l != null && j == l.longValue()) {
                        MutableLiveData mutableLiveDataOooOo = o000000O.OooOo();
                        if (!z2) {
                            z = false;
                        }
                        mutableLiveDataOooOo.postValue(Boxing.boxBoolean(z));
                        if (!z2) {
                            roomUserInfoModel.getWealthLevel().setValue(Boxing.boxInt(0));
                        }
                    }
                }
                if (jSONObject.has("wealthBadgeUrl")) {
                    MutableStateFlow<String> wealthBadge = roomUserInfoModel.getWealthBadge();
                    String string5 = jSONObject.getString("wealthBadgeUrl");
                    Intrinsics.checkNotNullExpressionValue(string5, "jsonObject.getString(\"wealthBadgeUrl\")");
                    wealthBadge.setValue(string5);
                }
                if (jSONObject.has("badgeRoundedImg")) {
                    MutableStateFlow<String> wealthBadgeWithBg = roomUserInfoModel.getWealthBadgeWithBg();
                    String string6 = jSONObject.getString("badgeRoundedImg");
                    Intrinsics.checkNotNullExpressionValue(string6, "jsonObject.getString(\"badgeRoundedImg\")");
                    wealthBadgeWithBg.setValue(string6);
                }
                if (jSONObject.has("profileCardImg")) {
                    MutableStateFlow<String> wealthProfileCardImg = roomUserInfoModel.getWealthProfileCardImg();
                    String string7 = jSONObject.getString("profileCardImg");
                    Intrinsics.checkNotNullExpressionValue(string7, "jsonObject.getString(\"profileCardImg\")");
                    wealthProfileCardImg.setValue(string7);
                }
                o000000O o000000o3 = o000000O.f46674OooO00o;
                Long l2 = (Long) o000000O.OooOOo0().getValue();
                if (l2 != null && j == l2.longValue()) {
                    if (jSONObject.has("wealthShow")) {
                        o000000O.OooOo().postValue(Boxing.boxBoolean(jSONObject.getBoolean("wealthShow")));
                    }
                    if (jSONObject.has("wealthLevel")) {
                        o000000O.OooO0oO().postValue(Boxing.boxInt(jSONObject.getInt("wealthLevel")));
                    }
                    if (jSONObject.has("wealthValue")) {
                        ((MutableLiveData) o000000O.f46713Oooo0oO.getValue()).postValue(Boxing.boxLong(jSONObject.getLong("wealthValue")));
                    }
                    if (jSONObject.has("wealthBadgeUrl")) {
                        o000000O.OooO0o().postValue(jSONObject.getString("wealthBadgeUrl"));
                    }
                }
            } catch (Exception e) {
                if (!o00Ooo.OooO0o0()) {
                    e.printStackTrace();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0O0(byte[] bArr) {
        RoomLoginInformation roomLoginInformation;
        String str = new String(bArr, Charsets.UTF_8);
        p592o0oo00O.OooOOO0.OooO0O0("parseBroadcastMessage->".concat(str));
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oOo00OO0.OooO0O0(str, new TypeToken<AbsJavaBeanApi<RoomBroadcastModel>>() { // from class: com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor$parseBroadcastMessage$1
        }.getType());
        if (absJavaBeanApi == null || (roomLoginInformation = MixedRoomDataSource.OooO0o0().f23461OooO0o0) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(roomLoginInformation, "MixedRoomDataSource.getI…oginInformation ?: return");
        Model model = absJavaBeanApi.data;
        if (model != 0) {
            RoomUserInfoDTO from = ((RoomBroadcastModel) model).getFrom();
            Long lValueOf = from != null ? Long.valueOf(from.getUserId()) : null;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(lValueOf, o000000O.OooOOo0().getValue()) && ((RoomBroadcastModel) absJavaBeanApi.data).getBalance() > 0) {
                MixedRoomDataSource.OooO0o0().f23463OooO0oo.postValue(Integer.valueOf(((RoomBroadcastModel) absJavaBeanApi.data).getBalance()));
            }
            MixedRoomDataSource.OooO0o0().OooOOOO(10019, absJavaBeanApi.data);
        }
    }

    public static void OooO0o(int i, byte[] bArr) throws InvalidProtocolBufferException {
        Room.InRoomUserSearchReply from = Room.InRoomUserSearchReply.parseFrom(bArr);
        if (from != null) {
            p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(f25128OooO00o), "parseSearchUserMessage what = " + i + "  data = " + from);
            LiveEventBus.get("SEARCH_ONLINE_USER").post(from.getUsersList());
        }
    }

    public static void OooO0o0(int i, byte[] bArr) throws InvalidProtocolBufferException {
        Room.SumAmountOut from = Room.SumAmountOut.parseFrom(bArr);
        if (from != null) {
            p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(f25128OooO00o), "parseRoomContributionMessage what = " + i + "  data = " + from);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0(from, null), 3, null);
        }
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(@NotNull RoomLoginInformation loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "loginInfo");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(null), 3, null);
        if (o00Oo0.OooO0Oo().OooO0O0("IsNewUserFirstEnterRoom", false)) {
            o00Oo0.OooO0Oo().OooO0o("IsNewUserFirstEnterRoom", false);
            o0OO000.OooO00o("101062");
        }
        MixedRoomDataSource mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
        mixedRoomDataSourceOooO0o0.getClass();
        p592o0oo00O.OooOOO0.OooO0OO("setRoomLoginInformation", loginInfo.toString());
        mixedRoomDataSourceOooO0o0.f23461OooO0o0 = loginInfo;
        RoomLoginInformation.RoomBean room = loginInfo.getRoom();
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o();
        oooO0O0OooO00o.f25010OooOOO0.postValue(room.getBackground());
        oooO0O0OooO00o.f25009OooOOO.postValue(room.getBackgroundvideo());
        oooO0O0OooO00o.f25008OooOO0o.postValue(Integer.valueOf(loginInfo.getPosition()));
        oooO0O0OooO00o.f25014OooOOo0.postValue(Integer.valueOf(loginInfo.getRoom().getDues()));
        oooO0O0OooO00o.f25003OooO0o0.postValue(Integer.valueOf(loginInfo.getRoom().getRegion()));
        oooO0O0OooO00o.OooO0o().postValue(Integer.valueOf(loginInfo.getRoom().getLucknumcost()));
        oooO0O0OooO00o.OooO().postValue(Boolean.valueOf(loginInfo.getRoom().getIsLuckNumAdmin()));
        oooO0O0OooO00o.OooO0oO().postValue(Long.valueOf(loginInfo.getRoom().getLuckNum()));
        oooO0O0OooO00o.OooO0oo().postValue(Integer.valueOf(loginInfo.getRoom().getLucknummode()));
        ((MutableLiveData) oooO0O0OooO00o.f25029Oooo0.getValue()).postValue(Integer.valueOf(loginInfo.getRoom().getLucknumset()));
        oo000o oo000oVar = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0;
        oo000oVar.f47490OooO0o.setValue(room.getNotice());
        oooO0O0OooO00o.f25002OooO0o.postValue(Integer.valueOf(room.getLevel()));
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (!((Boolean) o000000O.OooOo0O().getValue()).booleanValue()) {
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            if (o0o0o00OooO0o0.OooO0O0("touristLoginRoom" + o000000O.OooOOo0().getValue(), false)) {
                Job job = oooO0O0OooO00o.f25036Oooo0o0;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                oooO0O0OooO00o.f25036Oooo0o0 = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000OO0(oooO0O0OooO00o, null), 3, null);
            }
        }
        p409o0Oo0o0o.o000000O o000000oOooO0oo = o00Oo0.OooO0oo();
        int autoGrabBonus = loginInfo.getAutoGrabBonus();
        o000000oOooO0oo.getClass();
        o000000oOooO0oo.OooO0oO(autoGrabBonus, "autoShowLuckyPacketDialog" + o000000O.OooOOo0().getValue());
        RoomTheme roomTheme = new RoomTheme();
        roomTheme.roomId = room.getId();
        roomTheme.roomTheme = room.getBackground();
        o000OOo.OooO00o().OooOoo().OooO00o(roomTheme);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10052, null);
        }
        RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10054, null);
        }
        RoomLiveService roomLiveService3 = RoomLiveService.f25058OooOo00;
        if (roomLiveService3 != null) {
            roomLiveService3.OooO0oO(10053, null);
        }
        RoomLiveService roomLiveService4 = RoomLiveService.f25058OooOo00;
        if (roomLiveService4 != null) {
            roomLiveService4.OooO0oO(10044, null);
        }
        Long l = 0L;
        Room.RoshamboListRequest.Builder builderNewBuilder = Room.RoshamboListRequest.newBuilder();
        builderNewBuilder.setListkind(0);
        Intrinsics.checkNotNull(l);
        builderNewBuilder.setMorauuid(l.longValue());
        RoomLiveService roomLiveService5 = RoomLiveService.f25058OooOo00;
        if (roomLiveService5 != null) {
            roomLiveService5.OooO0oo(10065, builderNewBuilder.build().toByteArray());
        }
        Room.GetEnvelopListRequest.Builder builderNewBuilder2 = Room.GetEnvelopListRequest.newBuilder();
        builderNewBuilder2.setAutotype(1);
        RoomLiveService roomLiveService6 = RoomLiveService.f25058OooOo00;
        if (roomLiveService6 != null) {
            roomLiveService6.OooO0oo(10075, builderNewBuilder2.build().toByteArray());
        }
        mixedRoomDataSourceOooO0o0.OooO0oo(loginInfo);
        int region = loginInfo.getRoom().getRegion();
        o000O000 o000o001 = new o000O000(App.f22702OooO0o);
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.remove("region");
        linkedHashMapOooO00o.put("region", region + "");
        linkedHashMapOooO00o.put("s", "room");
        List<String> list = o0000O.f44100OooOoo;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, list, o0000O.f44179o0OO00O, linkedHashMapOooO00o, o000o001);
        Long lValueOf = Long.valueOf(oo000oVar.OooO0o0());
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        o000O0o o000o0o2 = new o000O0o();
        LinkedHashMap linkedHashMapOooO00o2 = oO00o000.OooO00o();
        linkedHashMapOooO00o2.put("barid", String.valueOf(lValueOf));
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, list, o0000O.f44186oo000o, linkedHashMapOooO00o2, o000o0o2);
        if (((Boolean) o000000O.OooOo0O().getValue()).booleanValue()) {
            mixedRoomDataSourceOooO0o0.OooOOO();
        }
        oOO00O.OooO0Oo(false);
        if (!mixedRoomDataSourceOooO0o0.f23468OooOOO0) {
            String notice = room.getNotice();
            ChatModel chatModel = new ChatModel();
            chatModel.setType(13);
            chatModel.setMessage(notice);
            mixedRoomDataSourceOooO0o0.OooO00o(chatModel);
        }
        mixedRoomDataSourceOooO0o0.f23468OooOOO0 = true;
        MemberBadgeInfo memberInfo = loginInfo.getMemberInfo();
        if (memberInfo != null && (loginInfo.getPosition() == 3 || loginInfo.getPosition() == 2)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(memberInfo, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(loginInfo, null), 3, null);
        if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47530OooOoO0.getValue()).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(null), 3, null);
    }

    public final void OooO0Oo(int i, @Nullable Object obj) {
        com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO0O0(this, i, obj);
        try {
            if (i == 10019) {
                OooO0O0((byte[]) obj);
            } else if (i == 10041) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p477o0o000O.OooOO0(new JSONObject(new String((byte[]) obj, Charsets.UTF_8)), null), 3, null);
            } else if (i == 10053) {
                OooO0o0(i, (byte[]) obj);
            } else if (i == 100702) {
                LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM").post(Boolean.FALSE);
            } else if (i != 1000700) {
            } else {
                OooO0o(i, (byte[]) obj);
            }
        } catch (Exception e) {
            if (!o00Ooo.OooO0o0()) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                com.code.android.util.o000O00O.OooO0O0(message);
                p592o0oo00O.OooOOO0.OooO0o0("RoomCommonMsgProcessor", "Exception", e);
            }
            e.printStackTrace();
        }
    }

    public final void OooO0oO(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "parseUserInfoChangedMessage data = ".concat(data));
        JSONObject jSONObject = new JSONObject(data);
        long jOptLong = jSONObject.optLong("uid", 0L);
        if (jOptLong == 0) {
            return;
        }
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jOptLong));
        if (roomUserInfoModelOooO0o0 == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(jSONObject, roomUserInfoModelOooO0o0, jOptLong, null), 3, null);
    }
}
