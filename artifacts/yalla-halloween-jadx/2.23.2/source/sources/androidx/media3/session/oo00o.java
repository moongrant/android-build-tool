package androidx.media3.session;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o0OO0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableSet<SessionCommand> f9498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final oo00o f9496OooO0o0 = new oo00o(new HashSet());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f9495OooO0o = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @UnstableApi
    public static final o00O00o0 f9497OooO0oO = new o00O00o0();

    public oo00o() {
        throw null;
    }

    public oo00o(HashSet hashSet) {
        this.f9498OooO0Oo = ImmutableSet.OooOO0O(hashSet);
    }

    public final boolean OooO0OO(int i) {
        p080o000OoO.o00Oo0.OooO0O0(i != 0, "Use contains(Command) for custom command");
        Iterator<SessionCommand> it = this.f9498OooO0Oo.iterator();
        while (it.hasNext()) {
            if (it.next().f9268OooO0Oo == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oo00o) {
            return this.f9498OooO0Oo.equals(((oo00o) obj).f9498OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return o000OO.OooO0OO.OooO0O0(this.f9498OooO0Oo);
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        o0OO0<SessionCommand> o0oo0OooO0oo = this.f9498OooO0Oo.iterator();
        while (o0oo0OooO0oo.hasNext()) {
            arrayList.add(o0oo0OooO0oo.next().toBundle());
        }
        bundle.putParcelableArrayList(f9495OooO0o, arrayList);
        return bundle;
    }
}
