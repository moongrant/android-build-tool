package p089o000o000;

import OooO00o.OooO00o;
import androidx.annotation.IntRange;
import java.util.List;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00O00o0.OooO0O0.OooO0OO<Key, Value>> f28901OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Integer f28902OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O0000 f28903OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28904OooO0Oo;

    public o00O0(@NotNull List<o00O00o0.OooO0O0.OooO0OO<Key, Value>> pages, @Nullable Integer num, @NotNull o00O0000 config, @IntRange(from = ULong.MIN_VALUE) int i) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f28901OooO00o = pages;
        this.f28902OooO0O0 = num;
        this.f28903OooO0OO = config;
        this.f28904OooO0Oo = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00O0) {
            o00O0 o00o1 = (o00O0) obj;
            if (Intrinsics.areEqual(this.f28901OooO00o, o00o1.f28901OooO00o) && Intrinsics.areEqual(this.f28902OooO0O0, o00o1.f28902OooO0O0) && Intrinsics.areEqual(this.f28903OooO0OO, o00o1.f28903OooO0OO) && this.f28904OooO0Oo == o00o1.f28904OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f28901OooO00o.hashCode();
        Integer num = this.f28902OooO0O0;
        return this.f28903OooO0OO.hashCode() + iHashCode + (num != null ? num.hashCode() : 0) + this.f28904OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PagingState(pages=");
        sbOooO0o0.append(this.f28901OooO00o);
        sbOooO0o0.append(", anchorPosition=");
        sbOooO0o0.append(this.f28902OooO0O0);
        sbOooO0o0.append(", config=");
        sbOooO0o0.append(this.f28903OooO0OO);
        sbOooO0o0.append(", leadingPlaceholderCount=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f28904OooO0Oo, ')');
    }
}
