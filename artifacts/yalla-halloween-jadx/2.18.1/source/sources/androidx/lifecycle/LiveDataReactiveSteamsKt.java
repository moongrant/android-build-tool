package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¨\u0006\u0007"}, d2 = {"T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "LoO000o00/OooO00o;", "toPublisher", "toLiveData", "lifecycle-reactivestreams-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class LiveDataReactiveSteamsKt {
    @NotNull
    public static final <T> LiveData<T> toLiveData(@NotNull oO000o00.OooO00o<T> oooO00o) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        LiveData<T> liveDataFromPublisher = LiveDataReactiveStreams.fromPublisher(oooO00o);
        Intrinsics.checkNotNullExpressionValue(liveDataFromPublisher, "fromPublisher(this)");
        return liveDataFromPublisher;
    }

    @NotNull
    public static final <T> oO000o00.OooO00o<T> toPublisher(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner lifecycle) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        oO000o00.OooO00o<T> publisher = LiveDataReactiveStreams.toPublisher(lifecycle, liveData);
        Intrinsics.checkNotNullExpressionValue(publisher, "toPublisher(lifecycle, this)");
        return publisher;
    }
}
