package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p657o0oooO.Oo0000;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"T", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "Landroidx/lifecycle/LiveData;", "liveData", "Lo0oooO/Oo0000;", "toPublisher", "fromPublisher", "(Lo0oooO/Oo0000;)Landroidx/lifecycle/LiveData;", "toLiveData", "lifecycle-reactivestreams_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "LiveDataReactiveStreams")
public final class LiveDataReactiveStreams {
    @JvmName(name = "fromPublisher")
    @NotNull
    public static final <T> LiveData<T> fromPublisher(@NotNull Oo0000<T> oo0000) {
        Intrinsics.checkNotNullParameter(oo0000, "<this>");
        return new PublisherLiveData(oo0000);
    }

    @SuppressLint({"LambdaLast"})
    @NotNull
    public static final <T> Oo0000<T> toPublisher(@NotNull LifecycleOwner lifecycle, @NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        return new LiveDataPublisher(lifecycle, liveData);
    }

    @SuppressLint({"LambdaLast"})
    @JvmName(name = "toPublisher")
    @NotNull
    public static final <T> Oo0000<T> toPublisher(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner lifecycle) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        return new LiveDataPublisher(lifecycle, liveData);
    }
}
