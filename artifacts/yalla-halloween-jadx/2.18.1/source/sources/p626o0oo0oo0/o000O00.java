package p626o0oo0oo0;

import com.yallatech.support.basecore.net.BizResponse;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00 implements ParameterizedType {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Type f48671Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Type[] f48672Oooo0oO;

    public o000O00(@NotNull Type... argTypes) {
        Intrinsics.checkNotNullParameter(BizResponse.class, "raw");
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        this.f48671Oooo0o = BizResponse.class;
        this.f48672Oooo0oO = argTypes;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type[] getActualTypeArguments() {
        return this.f48672Oooo0oO;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type getRawType() {
        return this.f48671Oooo0o;
    }
}
