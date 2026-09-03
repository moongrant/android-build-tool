package com.amazonaws.util;

import OooO00o.OooO00o;
import android.support.v4.media.session.OooOOO0;
import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f11179Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f11180Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f11181Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f11182Oooo0oo;

    public LengthCheckInputStream(InputStream inputStream, long j, boolean z) {
        super(inputStream);
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        this.f11180Oooo0o = j;
        this.f11181Oooo0oO = z;
    }

    public final void OooO0Oo(boolean z) {
        if (z) {
            if (this.f11182Oooo0oo == this.f11180Oooo0o) {
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Data read (");
            sbOooO0o0.append(this.f11182Oooo0oo);
            sbOooO0o0.append(") has a different length than the expected (");
            throw new AmazonClientException(OooOOO0.OooO00o(sbOooO0o0, this.f11180Oooo0o, ")"));
        }
        if (this.f11182Oooo0oo <= this.f11180Oooo0o) {
            return;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("More data read (");
        sbOooO0o1.append(this.f11182Oooo0oo);
        sbOooO0o1.append(") than expected (");
        throw new AmazonClientException(OooOOO0.OooO00o(sbOooO0o1, this.f11180Oooo0o, ")"));
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        super.mark(i);
        this.f11179Oooo = this.f11182Oooo0oo;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i >= 0) {
            this.f11182Oooo0oo++;
        }
        OooO0Oo(i == -1);
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        if (super.markSupported()) {
            this.f11182Oooo0oo = this.f11179Oooo;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (this.f11181Oooo0oO && jSkip > 0) {
            this.f11182Oooo0oo += jSkip;
            OooO0Oo(false);
        }
        return jSkip;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        this.f11182Oooo0oo += i3 >= 0 ? i3 : 0L;
        OooO0Oo(i3 == -1);
        return i3;
    }
}
