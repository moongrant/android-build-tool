package p546o0o0Ooo0;

import androidx.lifecycle.MutableLiveData;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p520o0o0O0O0.o000OO00;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomUserInfoManager$initObserver$5$1", f = "RoomUserInfoManager.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
public final class oO0O000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f44521Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public RoomUserInfoModel f44522Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oO0O00oO f44523Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f44524Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ oO0O00oO f44525OoooO00;

    public static final class OooO00o extends Lambda implements Function1<RoomUserInfoModel, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0O00oO f44526Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oO0O00oO oo0o00oo) {
            super(1);
            this.f44526Oooo0o = oo0o00oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
            RoomUserInfoModel roomUserInfoModel2 = roomUserInfoModel;
            if (roomUserInfoModel2 != null && this.f44526Oooo0o.OooO0Oo().OooO0OO()) {
                oO0O00oO oo0o00oo = this.f44526Oooo0o;
                oo0o00oo.OooO0o0(oo0o00oo.OooO0Oo(), roomUserInfoModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44527Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomUserInfoModel roomUserInfoModel) {
            super(1);
            this.f44527Oooo0o = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O000.OooO().OooO0oo(this.f44527Oooo0o.getUserId());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000o(RoomUserInfoModel roomUserInfoModel, oO0O00oO oo0o00oo, Continuation<? super oO0O000o> continuation) {
        super(2, continuation);
        this.f44521Oooo = roomUserInfoModel;
        this.f44525OoooO00 = oo0o00oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0O000o(this.f44521Oooo, this.f44525OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0O000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RoomUserInfoModel roomUserInfoModel;
        oO0O00oO oo0o00oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44524Oooo0oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RoomConfiguration roomConfiguration = o000O00O.OooO().f32427Oooo;
            if (roomConfiguration != null) {
                roomUserInfoModel = this.f44521Oooo;
                oO0O00oO oo0o00oo2 = this.f44525OoooO00;
                if (!(roomConfiguration.getBarid() == null)) {
                    o000OO00 o000oo01 = o000OO00.f42604OooO00o;
                    long userId = roomUserInfoModel.getUserId();
                    Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                    if (value != null) {
                        long jLongValue = value.longValue();
                        this.f44522Oooo0o = roomUserInfoModel;
                        this.f44523Oooo0oO = oo0o00oo2;
                        this.f44524Oooo0oo = 1;
                        obj = o000oo01.OooO0o0(userId, jLongValue, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oo0o00oo = oo0o00oo2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oo0o00oo = this.f44523Oooo0oO;
        roomUserInfoModel = this.f44522Oooo0o;
        ResultKt.throwOnFailure(obj);
        ((MutableLiveData) obj).observe(oo0o00oo.f44365OooO00o, new OooOo(new OooO00o(oo0o00oo), new OooO0O0(roomUserInfoModel), null, false, 12));
        return Unit.INSTANCE;
    }
}
