package com.yalla.yalla.ui.screen;

import android.app.Activity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.ScreenNavigationActivity$onCreate$1$1$1$1", f = "ScreenNavigationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f28616OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f28617OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(ScreenNavigationActivity screenNavigationActivity, o00O00OO o00o00oo2, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f28616OooO0Oo = screenNavigationActivity;
        this.f28617OooO0o0 = o00o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO00o(this.f28616OooO0Oo, this.f28617OooO0o0, continuation);
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
        OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
        ScreenNavigationActivity activity = this.f28616OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        o00O00OO navController = this.f28617OooO0o0;
        Intrinsics.checkNotNullParameter(navController, "navController");
        o00O00.f53494OooO00o.put(activity, navController);
        return Unit.INSTANCE;
    }
}
