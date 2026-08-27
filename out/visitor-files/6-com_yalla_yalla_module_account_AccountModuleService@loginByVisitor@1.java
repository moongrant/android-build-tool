package com.yalla.yalla.module.account;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.yalla.yalla.module.account.AccountModuleService", f = "AccountModuleService.kt", i = {}, l = {85}, m = "loginByVisitor", n = {}, s = {})
final class AccountModuleService$loginByVisitor$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f50231OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public /* synthetic */ Object f50232OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f50233OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountModuleService$loginByVisitor$1(OooO0OO oooO0OO, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f50233OooO0oo = oooO0OO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f50232OooO0oO = obj;
        this.f50231OooO |= Integer.MIN_VALUE;
        return this.f50233OooO0oo.OooO0oO(this);
    }
}
