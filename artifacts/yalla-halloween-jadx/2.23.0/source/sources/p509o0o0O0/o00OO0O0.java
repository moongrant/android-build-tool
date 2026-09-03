package p509o0o0O0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import com.yalla.yalla.ui.composable.moment.TempAtVM;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p510o0o0O00.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentInputFacePanelKt$MomentInputFacePanel$7$1$1$1", f = "MomentInputFacePanel.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
public final class o00OO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50917OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0O0O00> f50918OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f50919OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TempAtVM f50920OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f50921OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentInputFacePanelKt$MomentInputFacePanel$7$1$1$1$1", f = "MomentInputFacePanel.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND, 159}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f50922OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0O0O00> f50923OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<o0O0O00> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50923OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50923OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f50922OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            MutableState<o0O0O00> mutableState = this.f50923OooO0o0;
            o0O0O00 o0o0o00OooO0OO = o00O0OOO.OooO0OO(mutableState);
            boolean z = false;
            if (o0o0o00OooO0OO != null && o0o0o00OooO0OO.OooO0o()) {
                z = true;
            }
            if (z) {
                o0O0O00 o0o0o00OooO0OO2 = o00O0OOO.OooO0OO(mutableState);
                if (o0o0o00OooO0OO2 == null) {
                    return null;
                }
                this.f50922OooO0Oo = 1;
                if (o0o0o00OooO0OO2.OooO0oO(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            o0O0O00 o0o0o00OooO0OO3 = o00O0OOO.OooO0OO(mutableState);
            if (o0o0o00OooO0OO3 == null) {
                return null;
            }
            this.f50922OooO0Oo = 2;
            if (o0o0o00OooO0OO3.OooO0oO(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<UserInfo, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TempAtVM f50924OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50925OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TempAtVM tempAtVM, MutableState<Boolean> mutableState) {
            super(1);
            this.f50924OooO0Oo = tempAtVM;
            this.f50925OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UserInfo userInfo) {
            this.f50924OooO0Oo.setTempAtUser(userInfo);
            this.f50925OooO0o0.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(MutableState<o0O0O00> mutableState, TempAtVM tempAtVM, MutableState<Boolean> mutableState2, Continuation<? super o00OO0O0> continuation) {
        super(2, continuation);
        this.f50918OooO0o = mutableState;
        this.f50920OooO0oO = tempAtVM;
        this.f50921OooO0oo = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00OO0O0 o00oo0o1 = new o00OO0O0(this.f50918OooO0o, this.f50920OooO0oO, this.f50921OooO0oo, continuation);
        o00oo0o1.f50919OooO0o0 = obj;
        return o00oo0o1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50917OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f50919OooO0o0, null, null, new OooO00o(this.f50918OooO0o, null), 3, null);
            this.f50917OooO0Oo = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        int i2 = AtFriendsActivity.f25620OooOooO;
        AtFriendsActivity.OooO00o.OooO00o(new OooO0O0(this.f50920OooO0oO, this.f50921OooO0oo));
        return Unit.INSTANCE;
    }
}
