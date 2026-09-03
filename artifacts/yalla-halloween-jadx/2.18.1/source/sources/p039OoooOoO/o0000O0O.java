package p039OoooOoO;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class o0000O0O<K, V, T> extends o0000oo<K, V, T> implements KMutableIterator {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o0000O0<K, V> f3732Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f3733OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public K f3734OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f3735OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(@NotNull o0000O0<K, V> builder, @NotNull o000O<K, V, T>[] path) {
        super(builder.f3725Oooo0oo, path);
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f3732Oooo = builder;
        this.f3735OoooO0O = builder.f3727OoooO00;
    }

    public final void OooO0Oo(int i, o000O0O0<?, ?> o000o0o1, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int i4 = 1 << ((i >> i3) & 31);
            if (o000o0o1.OooOO0(i4)) {
                this.f3739Oooo0o[i2].OooO0Oo(o000o0o1.f3752OooO0Oo, o000o0o1.OooO0oO() * 2, o000o0o1.OooO0oo(i4));
                this.f3740Oooo0oO = i2;
                return;
            } else {
                int iOooOo0O = o000o0o1.OooOo0O(i4);
                o000O0O0<?, ?> o000o0o0OooOo0 = o000o0o1.OooOo0(iOooOo0O);
                this.f3739Oooo0o[i2].OooO0Oo(o000o0o1.f3752OooO0Oo, o000o0o1.OooO0oO() * 2, iOooOo0O);
                OooO0Oo(i, o000o0o0OooOo0, k, i2 + 1);
                return;
            }
        }
        o000O<K, V, T> o000o = this.f3739Oooo0o[i2];
        Object[] objArr = o000o0o1.f3752OooO0Oo;
        o000o.OooO0Oo(objArr, objArr.length, 0);
        while (true) {
            o000O<K, V, T> o000o2 = this.f3739Oooo0o[i2];
            if (Intrinsics.areEqual(o000o2.f3742Oooo0o[o000o2.f3744Oooo0oo], k)) {
                this.f3740Oooo0oO = i2;
                return;
            } else {
                this.f3739Oooo0o[i2].f3744Oooo0oo += 2;
            }
        }
    }

    @Override // p039OoooOoO.o0000oo, java.util.Iterator
    public final T next() {
        if (this.f3732Oooo.f3727OoooO00 != this.f3735OoooO0O) {
            throw new ConcurrentModificationException();
        }
        this.f3734OoooO00 = OooO00o();
        this.f3733OoooO0 = true;
        return (T) super.next();
    }

    @Override // p039OoooOoO.o0000oo, java.util.Iterator
    public final void remove() {
        if (!this.f3733OoooO0) {
            throw new IllegalStateException();
        }
        if (this.f3741Oooo0oo) {
            K kOooO00o = OooO00o();
            TypeIntrinsics.asMutableMap(this.f3732Oooo).remove(this.f3734OoooO00);
            OooO0Oo(kOooO00o != null ? kOooO00o.hashCode() : 0, this.f3732Oooo.f3725Oooo0oo, kOooO00o, 0);
        } else {
            TypeIntrinsics.asMutableMap(this.f3732Oooo).remove(this.f3734OoooO00);
        }
        this.f3734OoooO00 = null;
        this.f3733OoooO0 = false;
        this.f3735OoooO0O = this.f3732Oooo.f3727OoooO00;
    }
}
