package p508o0o00oOo;

import com.yalla.yalla.common.model.ShopVehicleListModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o00OO00O;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.o0Oo0oo;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.ui.view.RoomHookFloatingWindowKt$RoomHookFloatingWindow$3$1$2$2", f = "RoomHookFloatingWindow.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f41823Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f41824Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ float f41825Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f41826Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(float f, o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3, Continuation<? super o000O00> continuation) {
        super(2, continuation);
        this.f41825Oooo0oO = f;
        this.f41826Oooo0oo = o0o00oo2;
        this.f41823Oooo = o0o00oo3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00(this.f41825Oooo0oO, this.f41826Oooo0oo, this.f41823Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f41824Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Oooo0<Float, o0Oo0oo> oooo0 = o000O000.f41827OooO00o;
            Float fBoxFloat = Boxing.boxFloat(this.f41825Oooo0oO);
            o00OO00O o00oo00oOooO0Oo = o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6);
            this.f41824Oooo0o = 1;
            if (Oooo0.OooO0OO(oooo0, fBoxFloat, o00oo00oOooO0Oo, null, this, 12) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (o000O000.f41827OooO00o.OooO0o().floatValue() > o000OO00.OooO00o(124)) {
            o000O000.OooO0OO(this.f41826Oooo0oo, false);
            o000O000.OooO0O0(this.f41823Oooo, true);
        } else {
            o000O000.OooO0OO(this.f41826Oooo0oo, true);
            o000O000.OooO0O0(this.f41823Oooo, false);
        }
        return Unit.INSTANCE;
    }
}
