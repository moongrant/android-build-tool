package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f19355Oooo0o = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f19356Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ByteString f19357Oooo0oo;

    public OooOO0(ByteString byteString) {
        this.f19357Oooo0oo = byteString;
        this.f19356Oooo0oO = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19355Oooo0o < this.f19356Oooo0oO;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            ByteString byteString = this.f19357Oooo0oo;
            int i = this.f19355Oooo0o;
            this.f19355Oooo0o = i + 1;
            return Byte.valueOf(byteString.OooO00o(i));
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
