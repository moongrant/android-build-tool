package p267o00oooOo;

import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzs;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public abstract class oO0Oo0oo extends zzak {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40407OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40408OooO0o0;

    public oO0Oo0oo(int i, int i2) {
        zzs.zzb(i2, i, "index");
        this.f40407OooO0Oo = i;
        this.f40408OooO0o0 = i2;
    }

    public abstract Object OooO00o(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40408OooO0o0 < this.f40407OooO0Oo;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40408OooO0o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f40408OooO0o0;
        this.f40408OooO0o0 = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40408OooO0o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f40408OooO0o0 - 1;
        this.f40408OooO0o0 = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40408OooO0o0 - 1;
    }
}
