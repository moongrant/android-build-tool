package p520o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.UserInfo;
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
import p023Oooo00O.o000O00;
import p254o00ooO0O.o000O0O0;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest$1$1", f = "ImMessageRepo.kt", i = {}, l = {594}, m = "invokeSuspend", n = {}, s = {})
public final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42883Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42884Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f42885Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f42886Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest$1$1$1", f = "ImMessageRepo.kt", i = {}, l = {604}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f42887Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f42888Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f42888Oooo0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f42888Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f42887Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oo0O oo0o = oo0O.f42896OooO00o;
                long j = this.f42888Oooo0oO;
                this.f42887Oooo0o = 1;
                obj = oo0o.OooOO0O(j, this);
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f42889Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f42889Oooo0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f42889Oooo0o, continuation);
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
            ChatMessage msg = OooOOO.f42227OooO00o.OooOo0o(this.f42889Oooo0o, o000O0O0.OooO0OO(R.string.addfriend_succeed_firstmessage), (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            MutableLiveData mutableLiveData = new MutableLiveData();
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000oo(msg, mutableLiveData, null), 2, null);
            return mutableLiveData;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(long j, boolean z, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o0ooOOo> continuation) {
        super(2, continuation);
        this.f42885Oooo0oO = j;
        this.f42886Oooo0oo = z;
        this.f42883Oooo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0ooOOo(this.f42885Oooo0oO, this.f42886Oooo0oo, this.f42883Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42884Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfo userInfoOooO00o = o000O00.OooO00o(this.f42885Oooo0oO);
            boolean z = this.f42886Oooo0oo;
            long j = this.f42885Oooo0oO;
            String userName = userInfoOooO00o != null ? userInfoOooO00o.getUserName() : null;
            String userHeader = userInfoOooO00o != null ? userInfoOooO00o.getUserHeader() : null;
            this.f42884Oooo0o = 1;
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
            o00O000 o00o001 = o00O000.f43398OooO00o;
            p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
            String str = p153o00Oo0oO.o0ooOOo.f32230OooOOO0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o00o001.OooO0O0(str, mRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ImResult imResult = (ImResult) obj;
        if (imResult.getBody() != null) {
            OooO0OO.OooO00o().OooOo0().OooO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), this.f42885Oooo0oO, this.f42886Oooo0oo ? 1 : 2);
            if (this.f42886Oooo0oo) {
                GlobalScope globalScope = GlobalScope.INSTANCE;
                BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO00o(this.f42885Oooo0oO, null), 3, null).start();
                BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new OooO0O0(this.f42885Oooo0oO, null), 3, null).start();
            }
            this.f42883Oooo.postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
        if (imResult.getCode() == 630) {
            OooO0OO.OooO00o().OooOo0().OooO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), this.f42885Oooo0oO, 3);
        }
        o000O error = new o000O(imResult.getCode());
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        this.f42883Oooo.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
