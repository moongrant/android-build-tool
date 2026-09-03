package p520o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o00000O;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.ToastUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.ImResult;
import com.yalla.yalla.common.model.UserInfoModel;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p141o00OOoo.OooO;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$addFriend$1$1", f = "ImMessageRepo.kt", i = {}, l = {540}, m = "invokeSuspend", n = {}, s = {})
public final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Integer> f42755Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42756Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f42757Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f42758Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$addFriend$1$1$1", f = "ImMessageRepo.kt", i = {}, l = {556}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f42759Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f42760Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f42760Oooo0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f42760Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f42759Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Friend friend = new Friend();
                long j = this.f42760Oooo0oO;
                friend.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
                friend.setFriendId(j);
                friend.setTime(System.currentTimeMillis());
                o00O0O.f42677OooO00o.OooO0o(friend);
                oo0O oo0o = oo0O.f42896OooO00o;
                long j2 = this.f42760Oooo0oO;
                this.f42759Oooo0o = 1;
                obj = oo0o.OooOO0O(j2, this);
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f42761Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f42761Oooo0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f42761Oooo0o, continuation);
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
            OooOOO oooOOO = OooOOO.f42227OooO00o;
            ChatMessage msg = OooOOO.f42227OooO00o.OooOo0o(this.f42761Oooo0o, o000O0O0.OooO0OO(R.string.addfriend_succeed_firstmessage), (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            MutableLiveData mutableLiveData = new MutableLiveData();
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000oo(msg, mutableLiveData, null), 2, null);
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
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Friends_Already));
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
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_too_many_friend_request));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(long j, String str, MutableLiveData<Integer> mutableLiveData, Continuation<? super o00oO0o> continuation) {
        super(2, continuation);
        this.f42757Oooo0oO = j;
        this.f42758Oooo0oo = str;
        this.f42755Oooo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00oO0o(this.f42757Oooo0oO, this.f42758Oooo0oo, this.f42755Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        Object objOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42756Oooo0o;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String strOooO0O0 = kotlin.collections.unsigned.OooO00o.OooO0O0(OooOOO.f41216OooO00o);
            if (o00000O.OooO0O0().OooO00o("ADD_FRIEND_" + strOooO0O0) == 0) {
                OooO.OooO00o("AFEventFriend", null);
                o00000O.OooO0O0().OooO0o0("ADD_FRIEND_" + strOooO0O0, 1);
            }
            long j = this.f42757Oooo0oO;
            String str = this.f42758Oooo0oo;
            this.f42756Oooo0o = 1;
            MessageIM.FriendAddRequest.Builder mRequestBuilder = MessageIM.FriendAddRequest.newBuilder();
            mRequestBuilder.setToId(j);
            mRequestBuilder.setMsg(str);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str2 = o0ooOOo.f32227OooOO0O;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o00o001.OooO0O0(str2, mRequestBuilder, this);
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
        ImResult imResult = (ImResult) objOooO0O0;
        if (!(imResult.getBody() != null)) {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
            this.f42755Oooo.postValue(Boxing.boxInt(-1));
            return Unit.INSTANCE;
        }
        MessageIM.FriendAddReply from = MessageIM.FriendAddReply.parseFrom(imResult.getBody());
        Intrinsics.checkNotNullExpressionValue(from, "parseFrom(result.body)");
        MutableLiveData<Integer> mutableLiveData = this.f42755Oooo;
        int result = from.getResult();
        if (result != 1) {
            if (result != 2) {
                if (result == 3) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(null), 3, null);
                } else if (result != 6) {
                    i2 = -1;
                } else {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(null), 3, null);
                }
                i2 = 3;
            } else {
                GlobalScope globalScope = GlobalScope.INSTANCE;
                BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO00o(this.f42757Oooo0oO, null), 3, null).start();
                BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO0O0(this.f42757Oooo0oO, null), 3, null).start();
                i2 = 2;
            }
        }
        mutableLiveData.postValue(Boxing.boxInt(i2));
        return Unit.INSTANCE;
    }
}
