package com.yalla.yalla.base.loadcache;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.base.loadcache.LoadLogic", f = "LoadLogic.kt", i = {0, 0, 0, 1, 1, 1, 2, 3, 3, 4, 4, 4, 5}, l = {39, 41, 42, 47, 48, 49}, m = "load", n = {"this", "key", "loadLevel", "this", "key", "loadLevel", "$this$load_u24lambda_u241", "this", "key", "this", "key", "$this$load_u24lambda_u242", "$this$load_u24lambda_u242"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
public final class OooO00o extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f22768OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f22769OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object f22770OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f22771OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public /* synthetic */ Object f22772OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LoadLogic<Object, Object> f22773OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(LoadLogic<Object, Object> loadLogic, Continuation<? super OooO00o> continuation) {
        super(continuation);
        this.f22773OooO0oo = loadLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f22772OooO0oO = obj;
        this.f22768OooO |= Integer.MIN_VALUE;
        return this.f22773OooO0oo.OooO0O0(null, null, this);
    }
}
