package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final byte[] f12100OooOOOo = new byte[0];

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Log f12101OooOOo0 = LogFactory.OooO00o(AwsChunkedEncodingInputStream.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f12102OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f12103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f12104OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f12105OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f12106OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f12107OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public String f12108OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AWS4Signer f12109OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ChunkContentIterator f12110OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public DecodedStreamBuffer f12112OooOOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f12111OooOOO = true;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f12113OooOOOO = false;

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this.f12103OooO0Oo = null;
        int iMax = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            iMax = Math.max(awsChunkedEncodingInputStream.f12105OooO0o0, 262144);
            this.f12103OooO0Oo = awsChunkedEncodingInputStream.f12103OooO0Oo;
            this.f12112OooOOO0 = awsChunkedEncodingInputStream.f12112OooOOO0;
        } else {
            this.f12103OooO0Oo = inputStream;
            this.f12112OooOOO0 = null;
        }
        if (iMax < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f12105OooO0o0 = iMax;
        this.f12104OooO0o = bArr;
        this.f12106OooO0oO = str;
        this.f12107OooO0oo = str2;
        this.f12102OooO = str3;
        this.f12108OooOO0 = str3;
        this.f12109OooOO0O = aWS4Signer;
    }

    public static long OooO0OO(long j) {
        return ((long) (Long.toHexString(j).length() + 17 + 64 + 2)) + j + ((long) 2);
    }

    public final byte[] OooO0oO(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        StringBuilder sb2 = new StringBuilder("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb2.append(this.f12106OooO0oO);
        sb2.append("\n");
        sb2.append(this.f12107OooO0oo);
        sb2.append("\n");
        sb2.append(this.f12108OooOO0);
        sb2.append("\n");
        this.f12109OooOO0O.getClass();
        sb2.append(BinaryUtils.OooO0O0(AbstractAWSSigner.OooO0Oo("")));
        sb2.append("\n");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            sb2.append(BinaryUtils.OooO0O0(messageDigest.digest()));
            String strOooO0O0 = BinaryUtils.OooO0O0(AbstractAWSSigner.OooOO0O(SigningAlgorithm.HmacSHA256, sb2.toString(), this.f12104OooO0o));
            this.f12108OooOO0 = strOooO0O0;
            sb.append(";chunk-signature=" + strOooO0O0);
            sb.append("\r\n");
            try {
                String string = sb.toString();
                Charset charset = StringUtils.f12681OooO00o;
                byte[] bytes = string.getBytes(charset);
                byte[] bytes2 = "\r\n".getBytes(charset);
                byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
                System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
                System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
                System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
                return bArr2;
            } catch (Exception e) {
                throw new AmazonClientException("Unable to sign the chunked data. " + e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e2.getMessage(), e2);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        OooO00o();
        if (!this.f12111OooOOO) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.f12103OooO0Oo.markSupported()) {
            Log log = f12101OooOOo0;
            if (log.OooO0O0()) {
                log.OooO0oO("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f12103OooO0Oo.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f12101OooOOo0;
            if (log2.OooO0O0()) {
                log2.OooO0oO("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f12112OooOOO0 = new DecodedStreamBuffer(this.f12105OooO0o0);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == -1) {
            return i;
        }
        Log log = f12101OooOOo0;
        if (log.OooO0O0()) {
            log.OooO0oO("One byte read from the stream.");
        }
        return bArr[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        OooO00o();
        this.f12110OooOO0o = null;
        this.f12108OooOO0 = this.f12102OooO;
        if (this.f12103OooO0Oo.markSupported()) {
            Log log = f12101OooOOo0;
            if (log.OooO0O0()) {
                log.OooO0oO("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f12103OooO0Oo.reset();
        } else {
            Log log2 = f12101OooOOo0;
            if (log2.OooO0O0()) {
                log2.OooO0oO("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f12112OooOOO0;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            if (decodedStreamBuffer.f12150OooO0o0) {
                throw new AmazonClientException("The input stream is not repeatable since the buffer size " + decodedStreamBuffer.f12147OooO0O0 + " has been exceeded.");
            }
            decodedStreamBuffer.f12149OooO0Oo = 0;
        }
        this.f12110OooOO0o = null;
        this.f12111OooOOO = true;
        this.f12113OooOOOO = false;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int i;
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(262144L, j);
        byte[] bArr = new byte[iMin];
        long j2 = j;
        while (j2 > 0 && (i = read(bArr, 0, iMin)) >= 0) {
            j2 -= (long) i;
        }
        return j - j2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0029  */
    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    /* JADX WARN: Code duplicated, block: B:24:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x003e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0094 A[EDGE_INSN: B:70:0x0094->B:44:0x0094 BREAK  A[LOOP:0: B:21:0x002e->B:72:0x002e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x006f, please report this as an issue */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int i3;
        boolean z;
        DecodedStreamBuffer decodedStreamBuffer;
        int i4;
        DecodedStreamBuffer decodedStreamBuffer2;
        int i5;
        int i6;
        int i7;
        Log log;
        int i8;
        boolean z2;
        OooO00o();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.f12110OooOO0o;
        int iMin = -1;
        if (chunkContentIterator != null) {
            if (!(chunkContentIterator.f12120OooO0O0 < chunkContentIterator.f12119OooO00o.length)) {
                if (this.f12113OooOOOO) {
                    return -1;
                }
                bArr2 = new byte[131072];
                i3 = 0;
                while (i3 < 131072) {
                    decodedStreamBuffer = this.f12112OooOOO0;
                    if (decodedStreamBuffer == null) {
                        i8 = decodedStreamBuffer.f12149OooO0Oo;
                        if (i8 != -1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            decodedStreamBuffer.f12149OooO0Oo = i8 + 1;
                            bArr2[i3] = decodedStreamBuffer.f12146OooO00o[i8];
                            i3++;
                        }
                    }
                    i4 = this.f12103OooO0Oo.read(bArr2, i3, 131072 - i3);
                    if (i4 != -1) {
                        break;
                        break;
                    }
                    decodedStreamBuffer2 = this.f12112OooOOO0;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.f12149OooO0Oo = -1;
                        i5 = decodedStreamBuffer2.f12148OooO0OO;
                        i6 = i5 + i4;
                        i7 = decodedStreamBuffer2.f12147OooO0O0;
                        if (i6 > i7) {
                            log = DecodedStreamBuffer.f12145OooO0o;
                            if (log.OooO0O0()) {
                                log.OooO0oO("Buffer size " + i7 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
                            }
                            decodedStreamBuffer2.f12150OooO0o0 = true;
                        } else {
                            System.arraycopy(bArr2, i3, decodedStreamBuffer2.f12146OooO00o, i5, i4);
                            decodedStreamBuffer2.f12148OooO0OO += i4;
                        }
                    }
                    i3 += i4;
                }
                if (i3 == 0) {
                    this.f12110OooOO0o = new ChunkContentIterator(OooO0oO(f12100OooOOOo));
                    z = true;
                } else {
                    if (i3 < 131072) {
                        byte[] bArr3 = new byte[i3];
                        System.arraycopy(bArr2, 0, bArr3, 0, i3);
                        bArr2 = bArr3;
                    }
                    this.f12110OooOO0o = new ChunkContentIterator(OooO0oO(bArr2));
                    z = false;
                }
                this.f12113OooOOOO = z;
            }
        } else {
            if (this.f12113OooOOOO) {
                return -1;
            }
            bArr2 = new byte[131072];
            i3 = 0;
            while (i3 < 131072) {
                decodedStreamBuffer = this.f12112OooOOO0;
                if (decodedStreamBuffer == null) {
                    i8 = decodedStreamBuffer.f12149OooO0Oo;
                    if (i8 != -1 || i8 >= decodedStreamBuffer.f12148OooO0OO) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        decodedStreamBuffer.f12149OooO0Oo = i8 + 1;
                        bArr2[i3] = decodedStreamBuffer.f12146OooO00o[i8];
                        i3++;
                    }
                }
                i4 = this.f12103OooO0Oo.read(bArr2, i3, 131072 - i3);
                if (i4 != -1) {
                    break;
                }
                decodedStreamBuffer2 = this.f12112OooOOO0;
                if (decodedStreamBuffer2 != null) {
                    decodedStreamBuffer2.f12149OooO0Oo = -1;
                    i5 = decodedStreamBuffer2.f12148OooO0OO;
                    i6 = i5 + i4;
                    i7 = decodedStreamBuffer2.f12147OooO0O0;
                    if (i6 > i7) {
                        log = DecodedStreamBuffer.f12145OooO0o;
                        if (log.OooO0O0()) {
                            log.OooO0oO("Buffer size " + i7 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
                        }
                        decodedStreamBuffer2.f12150OooO0o0 = true;
                    } else {
                        System.arraycopy(bArr2, i3, decodedStreamBuffer2.f12146OooO00o, i5, i4);
                        decodedStreamBuffer2.f12148OooO0OO += i4;
                    }
                }
                i3 += i4;
            }
            if (i3 == 0) {
                this.f12110OooOO0o = new ChunkContentIterator(OooO0oO(f12100OooOOOo));
                z = true;
            } else {
                if (i3 < 131072) {
                    byte[] bArr4 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr4, 0, i3);
                    bArr2 = bArr4;
                }
                this.f12110OooOO0o = new ChunkContentIterator(OooO0oO(bArr2));
                z = false;
            }
            this.f12113OooOOOO = z;
        }
        ChunkContentIterator chunkContentIterator2 = this.f12110OooOO0o;
        if (i2 == 0) {
            chunkContentIterator2.getClass();
            iMin = 0;
        } else {
            int i9 = chunkContentIterator2.f12120OooO0O0;
            byte[] bArr5 = chunkContentIterator2.f12119OooO00o;
            if (i9 < bArr5.length) {
                iMin = Math.min(bArr5.length - i9, i2);
                System.arraycopy(bArr5, chunkContentIterator2.f12120OooO0O0, bArr, i, iMin);
                chunkContentIterator2.f12120OooO0O0 += iMin;
            }
        }
        if (iMin > 0) {
            this.f12111OooOOO = false;
            Log log2 = f12101OooOOo0;
            if (log2.OooO0O0()) {
                log2.OooO0oO(iMin + " byte read from the stream.");
            }
        }
        return iMin;
    }
}
