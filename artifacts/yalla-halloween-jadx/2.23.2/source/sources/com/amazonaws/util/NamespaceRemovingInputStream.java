package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f12678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f12679OooO0o0;

    public static final class StringPrefixSlicer {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f12680OooO00o;

        public StringPrefixSlicer(String str) {
            this.f12680OooO00o = str;
        }

        public final boolean OooO00o(String str) {
            if (!this.f12680OooO00o.startsWith(str)) {
                return false;
            }
            this.f12680OooO00o = this.f12680OooO00o.substring(str.length());
            return true;
        }

        public final void OooO0O0() {
            if (this.f12680OooO00o.startsWith(ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
                while (this.f12680OooO00o.startsWith(ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
                    this.f12680OooO00o = this.f12680OooO00o.substring(1);
                }
            }
        }
    }

    public NamespaceRemovingInputStream(ByteArrayInputStream byteArrayInputStream) {
        super(new BufferedInputStream(byteArrayInputStream));
        this.f12678OooO0Oo = new byte[200];
        this.f12679OooO0o0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int length;
        boolean z;
        OooO0OO();
        int i = ((FilterInputStream) this).in.read();
        if (i != 120 || this.f12679OooO0o0) {
            return i;
        }
        this.f12678OooO0Oo[0] = (byte) i;
        ((FilterInputStream) this).in.mark(this.f12678OooO0Oo.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f12678OooO0Oo;
        int i2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        String str = new String(this.f12678OooO0Oo, 0, i2 + 1, StringUtils.f12681OooO00o);
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (stringPrefixSlicer.OooO00o("xmlns")) {
            stringPrefixSlicer.OooO0O0();
            if (stringPrefixSlicer.OooO00o("=")) {
                stringPrefixSlicer.OooO0O0();
                if (stringPrefixSlicer.OooO00o("\"")) {
                    int iIndexOf = stringPrefixSlicer.f12680OooO00o.indexOf("\"");
                    if (iIndexOf < 0) {
                        z = false;
                    } else {
                        stringPrefixSlicer.f12680OooO00o = stringPrefixSlicer.f12680OooO00o.substring(iIndexOf + 1);
                        z = true;
                    }
                    if (z) {
                        length = str.length() - stringPrefixSlicer.f12680OooO00o.length();
                    } else {
                        length = -1;
                    }
                } else {
                    length = -1;
                }
            } else {
                length = -1;
            }
        } else {
            length = -1;
        }
        if (length <= 0) {
            return i;
        }
        for (int i3 = 0; i3 < length - 1; i3++) {
            ((FilterInputStream) this).in.read();
        }
        int i4 = ((FilterInputStream) this).in.read();
        this.f12679OooO0o0 = true;
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = read();
            if (i4 == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) i4;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
