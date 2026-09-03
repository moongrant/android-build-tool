package p412o0Oo0o0O;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p407o0Oo0Oo.o00;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p479o0o0000o.o000O000;
import p480o0o000O.OooOO0;
import p562o0oOo000.o000000;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest$1$1", f = "ImMessageRepo.kt", i = {}, l = {659}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45990OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f45991OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f45992OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f45993OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest$1$1$1", f = "ImMessageRepo.kt", i = {}, l = {668}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45994OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f45995OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45995OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45995OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45994OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
                this.f45994OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f45995OooO0o0, this);
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

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest$1$1$2", f = "ImMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MutableLiveData<Boolean>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f45996OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f45996OooO0Oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f45996OooO0Oo, continuation);
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
            ChatMessage msg = o000OO.OooOo(this.f45996OooO0Oo, o0000.OooO0OO(o000000.addfriend_succeed_firstmessage), null, 0L, false, 60);
            o000OO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            MutableLiveData mutableLiveData = new MutableLiveData();
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O0O(msg, mutableLiveData, null), 2, null);
            return mutableLiveData;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(long j, boolean z, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o000O0Oo> continuation) {
        super(2, continuation);
        this.f45992OooO0o0 = j;
        this.f45991OooO0o = z;
        this.f45993OooO0oO = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0Oo(this.f45992OooO0o0, this.f45991OooO0o, this.f45993OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45990OooO0Oo;
        boolean z = this.f45991OooO0o;
        long j = this.f45992OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfoRepo.f22735OooO00o.getClass();
            UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(j);
            String userName = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserName() : null;
            String userHeader = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserHeader() : null;
            this.f45990OooO0Oo = 1;
            MessageIM.FriendApplyRequest.Builder builderNewBuilder = MessageIM.FriendApplyRequest.newBuilder();
            builderNewBuilder.setFromId(j);
            builderNewBuilder.setResult(z ? 1 : 0);
            if (userName == null) {
                userName = "";
            }
            builderNewBuilder.setNickname(userName);
            if (userHeader == null) {
                userHeader = "";
            }
            builderNewBuilder.setHeadphoto(userHeader);
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43345OooOOO0;
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
        MutableLiveData<Boolean> mutableLiveData = this.f45993OooO0oO;
        if (!zIsSuccess) {
            if (error.getCode() == 630) {
                long j2 = this.f45992OooO0o0;
                o00 o00VarOooOo00 = o00Oo0.OooO00o().OooOo00();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o00VarOooOo00.OooOO0O(3, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j2);
            }
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
            mutableLiveData.postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        long j3 = this.f45992OooO0o0;
        int i2 = z ? 1 : 2;
        o00 o00VarOooOo01 = o00Oo0.OooO00o().OooOo00();
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        o00VarOooOo01.OooOO0O(i2, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j3);
        if (z) {
            GlobalScope globalScope = GlobalScope.INSTANCE;
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO00o(j, null), 3, null).start();
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO0O0(j, null), 3, null).start();
        }
        mutableLiveData.postValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
