package p406o0Oo0Ooo;

import androidx.compose.ui.graphics.colorspace.OooO0OO;
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
import p377o0OOoOo.o0000O;
import p403o0Oo0OOo.o0O0O0o0;
import p464o0Oooo.o000000O;
import p471o0Ooooo.o0O00OO;
import p542o0o0o00O.o000oOoO;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest$1$1", f = "ImMessageRepo.kt", i = {}, l = {659}, m = "invokeSuspend", n = {}, s = {})
public final class ooooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45061OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f45062OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f45063OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f45064OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest$1$1$1", f = "ImMessageRepo.kt", i = {}, l = {668}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45065OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f45066OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45066OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45066OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45065OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
                this.f45065OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f45066OooO0o0, this);
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
        public final /* synthetic */ long f45067OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f45067OooO0Oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f45067OooO0Oo, continuation);
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
            ChatMessage msg = oOO0O000.OooOo(this.f45067OooO0Oo, o0000.OooO0OO(oO00OOo0.addfriend_succeed_firstmessage), null, 0L, false, 60);
            oOO0O000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            MutableLiveData mutableLiveData = new MutableLiveData();
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(msg, mutableLiveData, null), 2, null);
            return mutableLiveData;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(long j, boolean z, MutableLiveData<Boolean> mutableLiveData, Continuation<? super ooooO0O0> continuation) {
        super(2, continuation);
        this.f45063OooO0o0 = j;
        this.f45062OooO0o = z;
        this.f45064OooO0oO = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ooooO0O0(this.f45063OooO0o0, this.f45062OooO0o, this.f45064OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ooooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45061OooO0Oo;
        boolean z = this.f45062OooO0o;
        long j = this.f45063OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfoRepo.f23204OooO00o.getClass();
            UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(j);
            String userName = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserName() : null;
            String userHeader = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserHeader() : null;
            this.f45061OooO0Oo = 1;
            MessageIM.FriendApplyRequest.Builder mRequestBuilder = MessageIM.FriendApplyRequest.newBuilder();
            mRequestBuilder.setFromId(j);
            mRequestBuilder.setResult(z ? 1 : 0);
            if (userName == null) {
                userName = "";
            }
            mRequestBuilder.setNickname(userName);
            if (userHeader == null) {
                userHeader = "";
            }
            mRequestBuilder.setHeadphoto(userHeader);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44086OooOOO0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, this);
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
        MutableLiveData<Boolean> mutableLiveData = this.f45064OooO0oO;
        if (!zIsSuccess) {
            if (error.getCode() == 630) {
                long j2 = this.f45063OooO0o0;
                o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o0o0o0o0OooOOoo.OooOO0O(3, ((Number) OooO0OO.OooO0O0()).longValue(), j2);
            }
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
            mutableLiveData.postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        long j3 = this.f45063OooO0o0;
        int i2 = z ? 1 : 2;
        o0O0O0o0 o0o0o0o0OooOOoo2 = o000OOo.OooO00o().OooOOoo();
        o000000O o000000o3 = o000000O.f46674OooO00o;
        o0o0o0o0OooOOoo2.OooOO0O(i2, ((Number) OooO0OO.OooO0O0()).longValue(), j3);
        if (z) {
            GlobalScope globalScope = GlobalScope.INSTANCE;
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO00o(j, null), 3, null).start();
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO0O0(j, null), 3, null).start();
        }
        mutableLiveData.postValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
