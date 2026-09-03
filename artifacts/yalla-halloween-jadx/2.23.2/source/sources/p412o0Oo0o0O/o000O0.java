package p412o0Oo0o0O;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.ImResult;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p269o00oooo0.o0O0oo0o;
import p384o0OOoo0O.Oooo0;
import p390o0OOooo.o00000;
import p475o0Ooooo0.o0O00oO0;
import p479o0o0000o.o000O000;
import p480o0o000O.OooOO0;
import p562o0oOo000.o000000;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$addFriend$1$1", f = "ImMessageRepo.kt", i = {}, l = {605}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f45967OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f45968OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f45969OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Integer> f45970OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$addFriend$1$1$1", f = "ImMessageRepo.kt", i = {}, l = {622}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45971OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f45972OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45972OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45972OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45971OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Friend friend = new Friend();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                friend.setUid(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                long j = this.f45972OooO0o0;
                friend.setFriendId(j);
                friend.setTime(System.currentTimeMillis());
                o000O000.OooO0o(friend);
                UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
                this.f45971OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$addFriend$1$1$2", f = "ImMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MutableLiveData<Boolean>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f45973OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f45973OooO0Oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f45973OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MutableLiveData<Boolean>> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage msg = o000OO.OooOo(this.f45973OooO0Oo, o0000.OooO0OO(o000000.addfriend_succeed_firstmessage), null, 0L, false, 60);
            o000OO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            MutableLiveData mutableLiveData = new MutableLiveData();
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O0O(msg, mutableLiveData, null), 2, null);
            return mutableLiveData;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$addFriend$1$1$3", f = "ImMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0OO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String strOooO0OO = o0000.OooO0OO(o000000.Friends_Already);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$addFriend$1$1$4", f = "ImMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            String strOooO0OO = o0000.OooO0OO(o000000.message_too_many_friend_request);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(long j, String str, String str2, MutableLiveData<Integer> mutableLiveData, Continuation<? super o000O0> continuation) {
        super(2, continuation);
        this.f45968OooO0o0 = j;
        this.f45967OooO0o = str;
        this.f45969OooO0oO = str2;
        this.f45970OooO0oo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0(this.f45968OooO0o0, this.f45967OooO0o, this.f45969OooO0oO, this.f45970OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object objOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45966OooO0Oo;
        long j = this.f45968OooO0o0;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strOooO00o = o0OoOo0.OooO00o();
            p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
            String strConcat = "ADD_FRIEND_".concat(strOooO00o);
            SharedPreferences sharedPreferences = oooO0oOooO00o.f48377OooO00o;
            if ((sharedPreferences != null ? sharedPreferences.getInt(strConcat, 0) : 0) == 0) {
                o00000.OooO00o("AFEventFriend", null);
                o0O0oo0o.OooO00o().OooO0OO(1, "ADD_FRIEND_".concat(strOooO00o));
            }
            this.f45966OooO0Oo = 1;
            MessageIM.FriendAddRequest.Builder builderNewBuilder = MessageIM.FriendAddRequest.newBuilder();
            builderNewBuilder.setToId(j);
            builderNewBuilder.setMsg(this.f45967OooO0o);
            builderNewBuilder.setSource(this.f45969OooO0oO);
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43342OooOO0O;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = OooOO0.OooO0O0(str, builderNewBuilder, this);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objOooO0O0 = obj;
        }
        ImResult error = (ImResult) objOooO0O0;
        boolean zIsSuccess = error.isSuccess();
        MutableLiveData<Integer> mutableLiveData = this.f45970OooO0oo;
        if (zIsSuccess) {
            MessageIM.FriendAddReply from = MessageIM.FriendAddReply.parseFrom(error.getBody());
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
            int result = from.getResult();
            if (result != 1) {
                i2 = 2;
                if (result != 2) {
                    i2 = 3;
                    if (result == 3) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(null), 3, null);
                    } else if (result != 6) {
                        i2 = -1;
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(null), 3, null);
                    }
                } else {
                    GlobalScope globalScope = GlobalScope.INSTANCE;
                    BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO00o(j, null), 3, null).start();
                    BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO0O0(j, null), 3, null).start();
                }
            }
            mutableLiveData.postValue(Boxing.boxInt(i2));
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
            mutableLiveData.postValue(Boxing.boxInt(-1));
        }
        return Unit.INSTANCE;
    }
}
