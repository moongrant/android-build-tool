package p269o00oooo0;

import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzm;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0oO0O0o extends zzai {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40428OooO0o0;

    public o0oO0O0o(int i, int i2) {
        zzm.zzb(i2, i, "index");
        this.f40427OooO0Oo = i;
        this.f40428OooO0o0 = i2;
    }

    public abstract Object OooO00o(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40428OooO0o0 < this.f40427OooO0Oo;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40428OooO0o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f40428OooO0o0;
        this.f40428OooO0o0 = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40428OooO0o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f40428OooO0o0 - 1;
        this.f40428OooO0o0 = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40428OooO0o0 - 1;
    }
}
