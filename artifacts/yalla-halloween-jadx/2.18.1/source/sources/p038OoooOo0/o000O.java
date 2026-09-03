package p038OoooOo0;

import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O<E> extends o000<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public Object[] f3690Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f3691Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f3692OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public o000O(@NotNull Object[] root, int i, int i2, int i3) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(root, "root");
        this.f3691Oooo0oo = i3;
        Object[] objArr = new Object[i3];
        this.f3690Oooo = objArr;
        ?? r5 = i == i2 ? 1 : 0;
        this.f3692OoooO00 = r5;
        objArr[0] = root;
        OooO0Oo(i - r5, 1);
    }

    public final E OooO0OO() {
        int i = this.f3688Oooo0o & 31;
        Object obj = this.f3690Oooo[this.f3691Oooo0oo - 1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i];
    }

    public final void OooO0Oo(int i, int i2) {
        int i3 = (this.f3691Oooo0oo - i2) * 5;
        while (i2 < this.f3691Oooo0oo) {
            Object[] objArr = this.f3690Oooo;
            Object obj = objArr[i2 - 1];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public final void OooO0o0(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = this.f3688Oooo0o;
            if (((i2 >> i3) & 31) != i) {
                break;
            } else {
                i3 += 5;
            }
        }
        if (i3 > 0) {
            OooO0Oo(i2, ((this.f3691Oooo0oo - 1) - (i3 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eOooO0OO = OooO0OO();
        int i = this.f3688Oooo0o + 1;
        this.f3688Oooo0o = i;
        if (i == this.f3689Oooo0oO) {
            this.f3692OoooO00 = true;
            return eOooO0OO;
        }
        OooO0o0(0);
        return eOooO0OO;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f3688Oooo0o--;
        if (this.f3692OoooO00) {
            this.f3692OoooO00 = false;
            return OooO0OO();
        }
        OooO0o0(31);
        return OooO0OO();
    }
}
