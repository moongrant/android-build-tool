package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((AbstractDataBuffer) this.f15194Oooo0o).close();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @NonNull
    public final T get(int i) {
        return (T) ((AbstractDataBuffer) this.f15194Oooo0o).get(i);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer) this.f15194Oooo0o).getCount();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @Nullable
    public final Bundle getMetadata() {
        return ((AbstractDataBuffer) this.f15194Oooo0o).getMetadata();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
        return ((AbstractDataBuffer) this.f15194Oooo0o).isClosed();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    @NonNull
    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) this.f15194Oooo0o).iterator();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        ((AbstractDataBuffer) this.f15194Oooo0o).release();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @NonNull
    public final Iterator<T> singleRefIterator() {
        return ((AbstractDataBuffer) this.f15194Oooo0o).singleRefIterator();
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public DataBufferResponse(@NonNull AbstractDataBuffer abstractDataBuffer) {
        super(abstractDataBuffer);
    }
}
