package com.yalla.yalla.ui.activity.main;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.StartActivity", f = "StartActivity.kt", i = {0}, l = {405}, m = "autoVisitorLogin", n = {"this"}, s = {"L$0"})
final class StartActivity$autoVisitorLogin$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ StartActivity f75874OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public StartActivity f75875OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public /* synthetic */ Object f75876OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f75877OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartActivity$autoVisitorLogin$1(StartActivity startActivity, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f75874OooO = startActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f75876OooO0oo = obj;
        this.f75877OooOO0 |= Integer.MIN_VALUE;
        int i = StartActivity.f75869OooOo0o;
        return this.f75874OooO.OooOooo(this);
    }
}
