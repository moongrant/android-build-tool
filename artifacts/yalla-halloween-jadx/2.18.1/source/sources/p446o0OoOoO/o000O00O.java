package p446o0OoOoO;

import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzs;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O extends zzak {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f40260Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f40261Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final zzag f40262Oooo0oo;

    public o000O00O(zzag zzagVar, int i) {
        int size = zzagVar.size();
        zzs.zzb(i, size, "index");
        this.f40260Oooo0o = size;
        this.f40261Oooo0oO = i;
        this.f40262Oooo0oo = zzagVar;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40261Oooo0oO < this.f40260Oooo0o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40261Oooo0oO > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f40261Oooo0oO;
        this.f40261Oooo0oO = i + 1;
        return this.f40262Oooo0oo.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40261Oooo0oO;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f40261Oooo0oO - 1;
        this.f40261Oooo0oO = i;
        return this.f40262Oooo0oo.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40261Oooo0oO - 1;
    }
}
