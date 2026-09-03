package com.google.android.gms.common.data;

import android.support.v4.media.session.OooO0OO;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DataBuffer<T> f14476OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14477OooO0o0 = -1;

    public DataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        this.f14476OooO0Oo = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14477OooO0o0 < this.f14476OooO0Oo.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(OooO0OO.OooO00o(46, "Cannot advance the iterator beyond ", this.f14477OooO0o0));
        }
        int i = this.f14477OooO0o0 + 1;
        this.f14477OooO0o0 = i;
        return this.f14476OooO0Oo.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
