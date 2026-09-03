package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f6873OooO0o = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f6874OooO0oO = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.compiler.plugins.kotlin.k2.OooO00o f6875OooO0oo = new androidx.compose.compiler.plugins.kotlin.k2.OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000oOoO f6876OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ImmutableList<Integer> f6877OooO0o0;

    public o0OoOo0(o000oOoO o000oooo2, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= o000oooo2.f6765OooO0Oo)) {
            throw new IndexOutOfBoundsException();
        }
        this.f6876OooO0Oo = o000oooo2;
        this.f6877OooO0o0 = ImmutableList.OooOO0O(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0OoOo0.class != obj.getClass()) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        return this.f6876OooO0Oo.equals(o0oooo1.f6876OooO0Oo) && this.f6877OooO0o0.equals(o0oooo1.f6877OooO0o0);
    }

    public final int hashCode() {
        return (this.f6877OooO0o0.hashCode() * 31) + this.f6876OooO0Oo.hashCode();
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f6873OooO0o, this.f6876OooO0Oo.toBundle());
        bundle.putIntArray(f6874OooO0oO, com.google.common.primitives.OooO0OO.OooO0Oo(this.f6877OooO0o0));
        return bundle;
    }
}
