package p662o0oooO0O;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f59743OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f59744OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0OOOO00 f59745OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Long f59746OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Long f59747OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Long f59748OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Long f59749OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, Object> f59750OooO0oo;

    public o0O(boolean z, boolean z2, @Nullable o0OOOO00 o0oooo01, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f59743OooO00o = z;
        this.f59744OooO0O0 = z2;
        this.f59745OooO0OO = o0oooo01;
        this.f59746OooO0Oo = l;
        this.f59748OooO0o0 = l2;
        this.f59747OooO0o = l3;
        this.f59749OooO0oO = l4;
        this.f59750OooO0oo = MapsKt.toMap(extras);
    }

    @NotNull
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f59743OooO00o) {
            arrayList.add("isRegularFile");
        }
        if (this.f59744OooO0O0) {
            arrayList.add("isDirectory");
        }
        Long l = this.f59746OooO0Oo;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.f59748OooO0o0;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.f59747OooO0o;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.f59749OooO0oO;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map<KClass<?>, Object> map = this.f59750OooO0oo;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ o0O(boolean z, boolean z2, o0OOOO00 o0oooo01, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, o0oooo01, l, l2, l3, l4, MapsKt.emptyMap());
    }
}
