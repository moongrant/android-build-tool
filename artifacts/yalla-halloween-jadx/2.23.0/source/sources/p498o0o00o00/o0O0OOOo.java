package p498o0o00o00;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterDisplayTime$1", f = "RoomEnterTipsComp.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f49316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f49317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49318OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterDisplayTime$1$1", f = "RoomEnterTipsComp.kt", i = {}, l = {359}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f49319OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f49320OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Ref.LongRef longRef, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f49320OooO0o0 = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f49320OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f49319OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f49320OooO0o0.element;
                this.f49319OooO0Oo = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
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
    public o0O0OOOo(RoomUserInfoModel roomUserInfoModel, Function0<Unit> function0, Continuation<? super o0O0OOOo> continuation) {
        super(2, continuation);
        this.f49318OooO0o0 = roomUserInfoModel;
        this.f49317OooO0o = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0OOOo(this.f49318OooO0o0, this.f49317OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0OOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f49316OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RoomUserInfoModel roomUserInfoModel = this.f49318OooO0o0;
            MutableStateFlow<Integer> premiumLevel = roomUserInfoModel.getPremiumLevel();
            Ref.LongRef longRef = new Ref.LongRef();
            try {
                int[] iArr = o0O0O0Oo.f49217OooO0O0;
                if (iArr.length > premiumLevel.getValue().intValue() / 100) {
                    longRef.element = (roomUserInfoModel.isPremium().getValue().booleanValue() ? iArr[premiumLevel.getValue().intValue() / 100] : 2) * 1000;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            OooOOO0.OooO0O0("RoomEnterTipsManager:  display time: " + longRef.element);
            OooO00o oooO00o = new OooO00o(longRef, null);
            this.f49316OooO0Oo = 1;
            if (OooOOO.OooO0Oo(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f49317OooO0o.invoke();
        return Unit.INSTANCE;
    }
}
