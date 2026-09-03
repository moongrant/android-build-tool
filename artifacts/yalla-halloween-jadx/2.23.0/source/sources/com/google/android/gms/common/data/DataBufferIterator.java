package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p166o00Ooo00.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DataBuffer<T> f14952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14953OooO0o0 = -1;

    public DataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        this.f14952OooO0Oo = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14953OooO0o0 < this.f14952OooO0Oo.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(o0OOO0o.OooO00o(46, "Cannot advance the iterator beyond ", this.f14953OooO0o0));
        }
        int i = this.f14953OooO0o0 + 1;
        this.f14953OooO0o0 = i;
        return this.f14952OooO0Oo.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
