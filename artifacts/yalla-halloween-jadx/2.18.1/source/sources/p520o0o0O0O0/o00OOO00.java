package p520o0o0O0O0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
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
import p491o0o00O00.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo$getUserInfoAsync$1", f = "UserInfoRepo.kt", i = {0}, l = {111, 113}, m = "invokeSuspend", n = {"userInfo"}, s = {"L$0"})
public final class o00OOO00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ long f42721Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Ref.ObjectRef f42722Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Ref.ObjectRef f42723Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f42724Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function1<UserInfo, Unit> f42725OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ View f42726OoooO00;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo$getUserInfoAsync$1$1", f = "UserInfoRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<UserInfo> f42727Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f42728Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f42729Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<UserInfo, Unit> f42730Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(View view, long j, Function1<? super UserInfo, Unit> function1, Ref.ObjectRef<UserInfo> objectRef, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f42728Oooo0o = view;
            this.f42729Oooo0oO = j;
            this.f42730Oooo0oo = function1;
            this.f42727Oooo = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f42728Oooo0o, this.f42729Oooo0oO, this.f42730Oooo0oo, this.f42727Oooo, continuation);
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
            if (Intrinsics.areEqual(this.f42728Oooo0o.getTag(R.id.tag_userinfo), Boxing.boxLong(this.f42729Oooo0oO))) {
                this.f42728Oooo0o.setTag(R.id.tag_userinfo, null);
                this.f42730Oooo0oo.invoke(this.f42727Oooo.element);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OOO00(long j, View view, Function1<? super UserInfo, Unit> function1, Continuation<? super o00OOO00> continuation) {
        super(2, continuation);
        this.f42721Oooo = j;
        this.f42726OoooO00 = view;
        this.f42725OoooO0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OOO00(this.f42721Oooo, this.f42726OoooO00, this.f42725OoooO0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OOO00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, com.yalla.yalla.common.db.table.UserInfo] */
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
        int i = this.f42724Oooo0oo;
        if (i != 0) {
            if (i == 1) {
                objectRef = this.f42723Oooo0oO;
                objectRef3 = this.f42722Oooo0o;
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
        ?? OooO0O1 = OooO0OO.OooO00o().Oooo0O0().OooO0O0(this.f42721Oooo);
        objectRef.element = OooO0O1;
        if (OooO0O1 == 0) {
            oo0O oo0o = oo0O.f42896OooO00o;
            long j = this.f42721Oooo;
            this.f42722Oooo0o = objectRef;
            this.f42723Oooo0oO = objectRef;
            this.f42724Oooo0oo = 1;
            Object objOooO0o0 = oo0O.OooO0o0(oo0o, j, this);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef3 = objectRef;
            t = objOooO0o0;
        } else {
            objectRef2 = objectRef;
        }
        main = Dispatchers.getMain();
        oooO00o = new OooO00o(this.f42726OoooO00, this.f42721Oooo, this.f42725OoooO0, objectRef2, null);
        this.f42722Oooo0o = null;
        this.f42723Oooo0oO = null;
        this.f42724Oooo0oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        objectRef.element = t;
        objectRef2 = objectRef3;
        main = Dispatchers.getMain();
        oooO00o = new OooO00o(this.f42726OoooO00, this.f42721Oooo, this.f42725OoooO0, objectRef2, null);
        this.f42722Oooo0o = null;
        this.f42723Oooo0oO = null;
        this.f42724Oooo0oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
