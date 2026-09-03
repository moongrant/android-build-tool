package p475o0o000;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<T> f47473OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<T> f47474OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(@NotNull MutableLiveData<T> liveData, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f47473OooO00o = liveData;
        this.f47474OooO0O0 = initializer;
    }
}
