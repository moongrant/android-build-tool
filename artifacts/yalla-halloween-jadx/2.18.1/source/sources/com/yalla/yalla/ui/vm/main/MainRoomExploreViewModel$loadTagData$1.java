package com.yalla.yalla.ui.vm.main;

import androidx.lifecycle.MutableLiveData;
import com.app.base.app.appConfig.apiDataModela.OooO00o;
import com.yalla.yalla.common.model.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadTagData$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class MainRoomExploreViewModel$loadTagData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f25483Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MainRoomExploreViewModel f25484Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRoomExploreViewModel$loadTagData$1(MainRoomExploreViewModel mainRoomExploreViewModel, Continuation<? super MainRoomExploreViewModel$loadTagData$1> continuation) {
        super(2, continuation);
        this.f25484Oooo0oO = mainRoomExploreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainRoomExploreViewModel$loadTagData$1(this.f25484Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainRoomExploreViewModel$loadTagData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f25483Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32333o0OO00O;
            MainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1 mainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1 = new MainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1(OooO00o.OooO0O0(str, "url", str, 0), null);
            this.f25483Oooo0o = 1;
            obj = o0000O0.OooO0OO(mainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ((MutableLiveData) this.f25484Oooo0oO.f25466OooO0O0.getValue()).setValue(((ApiResult) obj).getData());
        return Unit.INSTANCE;
    }
}
