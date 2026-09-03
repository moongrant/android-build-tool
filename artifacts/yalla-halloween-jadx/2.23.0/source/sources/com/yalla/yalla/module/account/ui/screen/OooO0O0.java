package com.yalla.yalla.module.account.ui.screen;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.http.ApiError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23630OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(MutableState<Boolean> mutableState) {
        super(1);
        this.f23630OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        if (error.getCode() == 3000) {
            DeleteAccountFirstWanScreen.MainContent$lambda$2(this.f23630OooO0Oo, false);
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
