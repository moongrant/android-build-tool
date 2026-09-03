package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
import p166o00Ooo00.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public T f14975OooO0o;

    public SingleRefDataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @NonNull
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(o0OOO0o.OooO00o(46, "Cannot advance the iterator beyond ", this.f14953OooO0o0));
        }
        int i = this.f14953OooO0o0 + 1;
        this.f14953OooO0o0 = i;
        if (i == 0) {
            T t = (T) Preconditions.checkNotNull(this.f14952OooO0Oo.get(0));
            this.f14975OooO0o = t;
            if (!(t instanceof DataBufferRef)) {
                String strValueOf = String.valueOf(t.getClass());
                throw new IllegalStateException(OooO0OO.OooO0OO(new StringBuilder(strValueOf.length() + 44), "DataBuffer reference of type ", strValueOf, " is not movable"));
            }
        } else {
            DataBufferRef dataBufferRef = (DataBufferRef) Preconditions.checkNotNull(this.f14975OooO0o);
            int i2 = this.f14953OooO0o0;
            DataHolder dataHolder = dataBufferRef.f14955OooO00o;
            Preconditions.checkState(i2 >= 0 && i2 < dataHolder.getCount());
            dataBufferRef.f14956OooO0O0 = i2;
            dataBufferRef.f14957OooO0OO = dataHolder.getWindowIndex(i2);
        }
        return this.f14975OooO0o;
    }
}
