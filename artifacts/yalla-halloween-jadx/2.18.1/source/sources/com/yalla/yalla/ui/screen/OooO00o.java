package com.yalla.yalla.ui.screen;

import android.os.Bundle;
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
import p086o000OooO.o000000;
import p584o0oOoo.o000O;
import p584o0oOoo.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.ScreenNavigationActivity$onCreate$1$1$1$1", f = "ScreenNavigationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f24553Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000000 f24554Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f24555Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(ScreenNavigationActivity screenNavigationActivity, o000000 o000000Var, Bundle bundle, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f24553Oooo0o = screenNavigationActivity;
        this.f24554Oooo0oO = o000000Var;
        this.f24555Oooo0oo = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO00o(this.f24553Oooo0o, this.f24554Oooo0oO, this.f24555Oooo0oo, continuation);
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
        o000O o000o = o000O.f46945OooO00o;
        ScreenNavigationActivity activity = this.f24553Oooo0o;
        o000000 navController = this.f24554Oooo0oO;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        o000O.f46946OooO0O0.put(activity, navController);
        o000OO00.OooO00o(this.f24554Oooo0oO.OooO0o(), this.f24555Oooo0oo);
        return Unit.INSTANCE;
    }
}
