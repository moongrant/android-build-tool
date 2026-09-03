package p089o000o000;

import androidx.paging.LoadType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO<K> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final K f28894OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(@NotNull LoadType type, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f28894OooO00o = obj;
        if (type != LoadType.REFRESH && obj == 0) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }
}
