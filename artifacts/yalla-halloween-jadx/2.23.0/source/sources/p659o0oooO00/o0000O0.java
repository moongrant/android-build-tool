package p659o0oooO00;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f60187OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f60188OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o000OO00 f60189OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Long f60190OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Long f60191OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Long f60192OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Long f60193OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, Object> f60194OooO0oo;

    public o0000O0(boolean z, boolean z2, @Nullable o000OO00 o000oo01, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f60187OooO00o = z;
        this.f60188OooO0O0 = z2;
        this.f60189OooO0OO = o000oo01;
        this.f60190OooO0Oo = l;
        this.f60192OooO0o0 = l2;
        this.f60191OooO0o = l3;
        this.f60193OooO0oO = l4;
        this.f60194OooO0oo = MapsKt.toMap(extras);
    }

    @NotNull
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f60187OooO00o) {
            arrayList.add("isRegularFile");
        }
        if (this.f60188OooO0O0) {
            arrayList.add("isDirectory");
        }
        Long l = this.f60190OooO0Oo;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.f60192OooO0o0;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.f60191OooO0o;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.f60193OooO0oO;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map<KClass<?>, Object> map = this.f60194OooO0oo;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ o0000O0(boolean z, boolean z2, o000OO00 o000oo01, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, o000oo01, l, l2, l3, l4, MapsKt.emptyMap());
    }
}
