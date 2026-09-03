package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final DataBuffer<T> f15455Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f15456Oooo0oO = -1;

    public DataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        this.f15455Oooo0o = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15456Oooo0oO < this.f15455Oooo0o.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(Oooo0.OooO00o(46, "Cannot advance the iterator beyond ", this.f15456Oooo0oO));
        }
        DataBuffer<T> dataBuffer = this.f15455Oooo0o;
        int i = this.f15456Oooo0oO + 1;
        this.f15456Oooo0oO = i;
        return dataBuffer.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
