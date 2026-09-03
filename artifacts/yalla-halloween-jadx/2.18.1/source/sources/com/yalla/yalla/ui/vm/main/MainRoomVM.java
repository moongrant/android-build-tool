package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.repository.MainRepository$checkSignIn$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$loadTaskListData$$inlined$call$1;
import com.yalla.yalla.model.CheckSignInModel;
import com.yalla.yalla.model.TaskModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p495o0o00OOO.Oooo0;
import p520o0o0O0O0.o0000OO0;
import p520o0o0O0O0.o00O0000;
import p617o0oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/MainRoomVM;", "Lo00OO/OooO00o;", "Lo0o00OOO/Oooo0;", "", "Lcom/yalla/yalla/model/TaskModel;", "loadTaskListData", "Lcom/yalla/yalla/model/CheckSignInModel;", "checkSignIn", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$checkSignIn$1$1", f = "MainRoomVM.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25487Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25488Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<CheckSignInModel> f25489Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<CheckSignInModel> oooo0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25489Oooo0oo = oooo0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25489Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25488Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<CheckSignInModel> oooo1 = this.f25489Oooo0oo;
                o0000OO0 o0000oo1 = o0000OO0.f42429OooO00o;
                this.f25487Oooo0o = oooo1;
                this.f25488Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new MainRepository$checkSignIn$$inlined$call$1(o0000oo1, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25487Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadTaskListData$1$1", f = "MainRoomVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25490Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo0<List<TaskModel>> f25491Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<List<TaskModel>> oooo0, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25491Oooo0oO = oooo0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25491Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25490Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O0000 o00o0001 = o00O0000.f42672OooO00o;
                this.f25490Oooo0o = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new SignTaskRepository$loadTaskListData$$inlined$call$1(o00o0001, null, 1), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            this.f25491Oooo0oO.postValue((List<TaskModel>) response);
            o00O000o.OooO00o(response, false);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Oooo0<CheckSignInModel> checkSignIn() {
        Oooo0<CheckSignInModel> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(oooo0, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<List<TaskModel>> loadTaskListData() {
        Oooo0<List<TaskModel>> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(oooo0, null), 3, null);
        return oooo0;
    }
}
