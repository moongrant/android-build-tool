package p109o000ooo;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o000OOo f35829OooO0O0 = new o000OOo(MapsKt.emptyMap());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f35830OooO00o;

    public o000OOo(Map<Class<?>, ? extends Object> map) {
        this.f35830OooO00o = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000OOo) {
            if (Intrinsics.areEqual(this.f35830OooO00o, ((o000OOo) obj).f35830OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35830OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        return "Tags(tags=" + this.f35830OooO00o + ')';
    }
}
