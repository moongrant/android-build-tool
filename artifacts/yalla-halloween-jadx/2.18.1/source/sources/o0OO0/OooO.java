package o0OO0;

import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends zzai {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f37189Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f37190Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final zzu f37191Oooo0oo;

    public OooO(zzu zzuVar, int i) {
        int size = zzuVar.size();
        zzm.zzb(i, size, "index");
        this.f37189Oooo0o = size;
        this.f37190Oooo0oO = i;
        this.f37191Oooo0oo = zzuVar;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f37190Oooo0oO < this.f37189Oooo0o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37190Oooo0oO > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f37190Oooo0oO;
        this.f37190Oooo0oO = i + 1;
        return this.f37191Oooo0oo.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37190Oooo0oO;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f37190Oooo0oO - 1;
        this.f37190Oooo0oO = i;
        return this.f37191Oooo0oo.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37190Oooo0oO - 1;
    }
}
