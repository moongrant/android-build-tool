package com.yalla.yalla.ui.vm.main;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadTagData$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMainRoomExploreViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomExploreViewModel.kt\ncom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel$loadTagData$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,131:1\n62#2:132\n*S KotlinDebug\n*F\n+ 1 MainRoomExploreViewModel.kt\ncom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel$loadTagData$1\n*L\n79#1:132\n*E\n"})
public final class MainRoomExploreViewModel$loadTagData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f31762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainRoomExploreViewModel f31763OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRoomExploreViewModel$loadTagData$1(MainRoomExploreViewModel mainRoomExploreViewModel, Continuation<? super MainRoomExploreViewModel$loadTagData$1> continuation) {
        super(2, continuation);
        this.f31763OooO0o0 = mainRoomExploreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainRoomExploreViewModel$loadTagData$1(this.f31763OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainRoomExploreViewModel$loadTagData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f31762OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = o0000O.f44184o0ooOOo;
            MainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1 mainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1 = new MainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null);
            this.f31762OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(mainRoomExploreViewModel$loadTagData$1$invokeSuspend$$inlined$call$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ((MutableLiveData) this.f31763OooO0o0.f31745OooO0O0.getValue()).setValue(((ApiResult) obj).getData());
        return Unit.INSTANCE;
    }
}
