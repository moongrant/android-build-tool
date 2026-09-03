package com.yallatech.support.basecore.net;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yallatech/support/basecore/net/ResponseParameterizedType;", "Ljava/lang/reflect/ParameterizedType;", "lib-basecore_release"}, k = 1, mv = {1, 5, 1})
public final class ResponseParameterizedType implements ParameterizedType {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Type f32927OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Type[] f32928OooO0o0;

    public ResponseParameterizedType(@NotNull Type... argTypes) {
        Intrinsics.checkNotNullParameter(BizResponse.class, "raw");
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        this.f32927OooO0Oo = BizResponse.class;
        this.f32928OooO0o0 = argTypes;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type[] getActualTypeArguments() {
        return this.f32928OooO0o0;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type getRawType() {
        return this.f32927OooO0Oo;
    }
}
