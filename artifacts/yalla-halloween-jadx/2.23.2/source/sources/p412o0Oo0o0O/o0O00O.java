package p412o0Oo0o0O;

import android.view.View;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0Oo.o0o0000;
import p408o0Oo0Oo0.o00Oo0;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo$getUserInfoAsync$1", f = "UserInfoRepo.kt", i = {0}, l = {122, 124}, m = "invokeSuspend", n = {"userInfo"}, s = {"L$0"})
public final class o0O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<UserInfo, Unit> f46273OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Ref.ObjectRef f46274OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f46275OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Ref.ObjectRef f46276OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f46277OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ View f46278OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo$getUserInfoAsync$1$1", f = "UserInfoRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f46279OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<UserInfo, Unit> f46280OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f46281OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<UserInfo> f46282OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(View view, long j, Function1<? super UserInfo, Unit> function1, Ref.ObjectRef<UserInfo> objectRef, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46279OooO0Oo = view;
            this.f46281OooO0o0 = j;
            this.f46280OooO0o = function1;
            this.f46282OooO0oO = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46279OooO0Oo, this.f46281OooO0o0, this.f46280OooO0o, this.f46282OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = o0OO00O.tag_userinfo;
            View view = this.f46279OooO0Oo;
            if (Intrinsics.areEqual(view.getTag(i), Boxing.boxLong(this.f46281OooO0o0))) {
                view.setTag(i, null);
                this.f46280OooO0o.invoke(this.f46282OooO0oO.element);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O00O(long j, View view, Function1<? super UserInfo, Unit> function1, Continuation<? super o0O00O> continuation) {
        super(2, continuation);
        this.f46277OooO0oO = j;
        this.f46278OooO0oo = view;
        this.f46273OooO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O00O(this.f46277OooO0oO, this.f46278OooO0oo, this.f46273OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, com.yalla.yalla.data.db.table.UserInfo] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        MainCoroutineDispatcher main;
        OooO00o oooO00o;
        T t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46275OooO0o;
        if (i != 0) {
            if (i == 1) {
                objectRef = this.f46276OooO0o0;
                objectRef3 = this.f46274OooO0Oo;
                ResultKt.throwOnFailure(obj);
                t = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objectRef = new Ref.ObjectRef();
        o0o0000 o0o0000VarOooo0 = o00Oo0.OooO00o().Oooo0();
        long j = this.f46277OooO0oO;
        ?? OooO0O1 = o0o0000VarOooo0.OooO0O0(j);
        objectRef.element = OooO0O1;
        if (OooO0O1 == 0) {
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f46274OooO0Oo = objectRef;
            this.f46276OooO0o0 = objectRef;
            this.f46275OooO0o = 1;
            Object objOooO0o = userInfoRepo.OooO0o(j, this);
            if (objOooO0o == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef3 = objectRef;
            t = objOooO0o;
        } else {
            objectRef2 = objectRef;
        }
        main = Dispatchers.getMain();
        oooO00o = new OooO00o(this.f46278OooO0oo, this.f46277OooO0oO, this.f46273OooO, objectRef2, null);
        this.f46274OooO0Oo = null;
        this.f46276OooO0o0 = null;
        this.f46275OooO0o = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        objectRef.element = t;
        objectRef2 = objectRef3;
        main = Dispatchers.getMain();
        oooO00o = new OooO00o(this.f46278OooO0oo, this.f46277OooO0oO, this.f46273OooO, objectRef2, null);
        this.f46274OooO0Oo = null;
        this.f46276OooO0o0 = null;
        this.f46275OooO0o = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
