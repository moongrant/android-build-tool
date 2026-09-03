package p131o00O0oo0;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00000 f36779OooO0O0 = new o00000(MapsKt.emptyMap());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f36780OooO00o;

    public o00000(Map<Class<?>, ? extends Object> map) {
        this.f36780OooO00o = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00000) {
            if (Intrinsics.areEqual(this.f36780OooO00o, ((o00000) obj).f36780OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36780OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        return "Tags(tags=" + this.f36780OooO00o + ')';
    }
}
