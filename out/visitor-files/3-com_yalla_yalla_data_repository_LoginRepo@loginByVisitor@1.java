package com.yalla.yalla.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {0}, l = {388}, m = "loginByVisitor", n = {"this_$iv"}, s = {"L$0"})
final class LoginRepo$loginByVisitor$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f46718OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public com.yalla.yalla.api.call.OooO f46719OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public /* synthetic */ Object f46720OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f46721OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginRepo$loginByVisitor$1(o00Ooo o00ooo2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46718OooO = o00ooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f46720OooO0oo = obj;
        this.f46721OooOO0 |= Integer.MIN_VALUE;
        return this.f46718OooO.OooOOO(0, null, this);
    }
}
