package kotlinx.android.extensions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "Companion", "OooO00o", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 7, 1})
public enum CacheImplementation {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;


    @NotNull
    private static final CacheImplementation DEFAULT;

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.android.extensions.CacheImplementation$OooO00o] */
    static {
        CacheImplementation cacheImplementation = HASH_MAP;
        INSTANCE = new Object() { // from class: kotlinx.android.extensions.CacheImplementation.OooO00o
        };
        DEFAULT = cacheImplementation;
    }
}
