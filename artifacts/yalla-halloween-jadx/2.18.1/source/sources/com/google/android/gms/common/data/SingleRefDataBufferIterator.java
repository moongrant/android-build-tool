package com.google.android.gms.common.data;

import Oooo000.o00O0O;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public T f15478Oooo0oo;

    public SingleRefDataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @NonNull
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(Oooo0.OooO00o(46, "Cannot advance the iterator beyond ", this.f15456Oooo0oO));
        }
        int i = this.f15456Oooo0oO + 1;
        this.f15456Oooo0oO = i;
        if (i == 0) {
            T t = (T) Preconditions.checkNotNull(this.f15455Oooo0o.get(0));
            this.f15478Oooo0oo = t;
            if (!(t instanceof DataBufferRef)) {
                String strValueOf = String.valueOf(t.getClass());
                throw new IllegalStateException(o00O0O.OooO0O0(new StringBuilder(strValueOf.length() + 44), "DataBuffer reference of type ", strValueOf, " is not movable"));
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.f15478Oooo0oo)).OooO00o(this.f15456Oooo0oO);
        }
        return this.f15478Oooo0oo;
    }
}
