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
    public static final byte[] f9010OooOOOo = new byte[0];

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Log f9011OooOOo0 = LogFactory.OooO00o(AwsChunkedEncodingInputStream.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f9012OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f9013OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f9014OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9015OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f9016OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f9017OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public String f9018OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AWS4Signer f9019OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ChunkContentIterator f9020OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public DecodedStreamBuffer f9022OooOOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f9021OooOOO = true;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f9023OooOOOO = false;

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this.f9013OooO0Oo = null;
        int iMax = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            iMax = Math.max(awsChunkedEncodingInputStream.f9015OooO0o0, 262144);
            this.f9013OooO0Oo = awsChunkedEncodingInputStream.f9013OooO0Oo;
            this.f9022OooOOO0 = awsChunkedEncodingInputStream.f9022OooOOO0;
        } else {
            this.f9013OooO0Oo = inputStream;
            this.f9022OooOOO0 = null;
        }
        if (iMax < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f9015OooO0o0 = iMax;
        this.f9014OooO0o = bArr;
        this.f9016OooO0oO = str;
        this.f9017OooO0oo = str2;
        this.f9012OooO = str3;
        this.f9018OooOO0 = str3;
        this.f9019OooOO0O = aWS4Signer;
    }

    public static long OooO0OO(long j) {
        return ((long) (Long.toHexString(j).length() + 17 + 64 + 2)) + j + ((long) 2);
    }

    public final byte[] OooO0oO(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        StringBuilder sb2 = new StringBuilder("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb2.append(this.f9016OooO0oO);
        sb2.append("\n");
        sb2.append(this.f9017OooO0oo);
        sb2.append("\n");
        sb2.append(this.f9018OooOO0);
        sb2.append("\n");
        this.f9019OooOO0O.getClass();
        sb2.append(BinaryUtils.OooO0O0(AbstractAWSSigner.OooO0Oo("")));
        sb2.append("\n");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            sb2.append(BinaryUtils.OooO0O0(messageDigest.digest()));
            String strOooO0O0 = BinaryUtils.OooO0O0(AbstractAWSSigner.OooOO0O(SigningAlgorithm.HmacSHA256, sb2.toString(), this.f9014OooO0o));
            this.f9018OooOO0 = strOooO0O0;
            sb.append(";chunk-signature=" + strOooO0O0);
            sb.append("\r\n");
            try {
                String string = sb.toString();
                Charset charset = StringUtils.f9590OooO00o;
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
        if (!this.f9021OooOOO) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.f9013OooO0Oo.markSupported()) {
            Log log = f9011OooOOo0;
            if (log.OooO0O0()) {
                log.OooO0oO("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f9013OooO0Oo.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f9011OooOOo0;
            if (log2.OooO0O0()) {
                log2.OooO0oO("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f9022OooOOO0 = new DecodedStreamBuffer(this.f9015OooO0o0);
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
        Log log = f9011OooOOo0;
        if (log.OooO0O0()) {
            log.OooO0oO("One byte read from the stream.");
        }
        return bArr[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        OooO00o();
        this.f9020OooOO0o = null;
        this.f9018OooOO0 = this.f9012OooO;
        if (this.f9013OooO0Oo.markSupported()) {
            Log log = f9011OooOOo0;
            if (log.OooO0O0()) {
                log.OooO0oO("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f9013OooO0Oo.reset();
        } else {
            Log log2 = f9011OooOOo0;
            if (log2.OooO0O0()) {
                log2.OooO0oO("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f9022OooOOO0;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            if (decodedStreamBuffer.f9060OooO0o0) {
                throw new AmazonClientException("The input stream is not repeatable since the buffer size " + decodedStreamBuffer.f9057OooO0O0 + " has been exceeded.");
            }
            decodedStreamBuffer.f9059OooO0Oo = 0;
        }
        this.f9020OooOO0o = null;
        this.f9021OooOOO = true;
        this.f9023OooOOOO = false;
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
        ChunkContentIterator chunkContentIterator = this.f9020OooOO0o;
        int iMin = -1;
        if (chunkContentIterator != null) {
            if (!(chunkContentIterator.f9030OooO0O0 < chunkContentIterator.f9029OooO00o.length)) {
                if (this.f9023OooOOOO) {
                    return -1;
                }
                bArr2 = new byte[131072];
                i3 = 0;
                while (i3 < 131072) {
                    decodedStreamBuffer = this.f9022OooOOO0;
                    if (decodedStreamBuffer == null) {
                        i8 = decodedStreamBuffer.f9059OooO0Oo;
                        if (i8 != -1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            decodedStreamBuffer.f9059OooO0Oo = i8 + 1;
                            bArr2[i3] = decodedStreamBuffer.f9056OooO00o[i8];
                            i3++;
                        }
                    }
                    i4 = this.f9013OooO0Oo.read(bArr2, i3, 131072 - i3);
                    if (i4 != -1) {
                        break;
                        break;
                    }
                    decodedStreamBuffer2 = this.f9022OooOOO0;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.f9059OooO0Oo = -1;
                        i5 = decodedStreamBuffer2.f9058OooO0OO;
                        i6 = i5 + i4;
                        i7 = decodedStreamBuffer2.f9057OooO0O0;
                        if (i6 > i7) {
                            log = DecodedStreamBuffer.f9055OooO0o;
                            if (log.OooO0O0()) {
                                log.OooO0oO("Buffer size " + i7 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
                            }
                            decodedStreamBuffer2.f9060OooO0o0 = true;
                        } else {
                            System.arraycopy(bArr2, i3, decodedStreamBuffer2.f9056OooO00o, i5, i4);
                            decodedStreamBuffer2.f9058OooO0OO += i4;
                        }
                    }
                    i3 += i4;
                }
                if (i3 == 0) {
                    this.f9020OooOO0o = new ChunkContentIterator(OooO0oO(f9010OooOOOo));
                    z = true;
                } else {
                    if (i3 < 131072) {
                        byte[] bArr3 = new byte[i3];
                        System.arraycopy(bArr2, 0, bArr3, 0, i3);
                        bArr2 = bArr3;
                    }
                    this.f9020OooOO0o = new ChunkContentIterator(OooO0oO(bArr2));
                    z = false;
                }
                this.f9023OooOOOO = z;
            }
        } else {
            if (this.f9023OooOOOO) {
                return -1;
            }
            bArr2 = new byte[131072];
            i3 = 0;
            while (i3 < 131072) {
                decodedStreamBuffer = this.f9022OooOOO0;
                if (decodedStreamBuffer == null) {
                    i8 = decodedStreamBuffer.f9059OooO0Oo;
                    if (i8 != -1 || i8 >= decodedStreamBuffer.f9058OooO0OO) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        decodedStreamBuffer.f9059OooO0Oo = i8 + 1;
                        bArr2[i3] = decodedStreamBuffer.f9056OooO00o[i8];
                        i3++;
                    }
                }
                i4 = this.f9013OooO0Oo.read(bArr2, i3, 131072 - i3);
                if (i4 != -1) {
                    break;
                }
                decodedStreamBuffer2 = this.f9022OooOOO0;
                if (decodedStreamBuffer2 != null) {
                    decodedStreamBuffer2.f9059OooO0Oo = -1;
                    i5 = decodedStreamBuffer2.f9058OooO0OO;
                    i6 = i5 + i4;
                    i7 = decodedStreamBuffer2.f9057OooO0O0;
                    if (i6 > i7) {
                        log = DecodedStreamBuffer.f9055OooO0o;
                        if (log.OooO0O0()) {
                            log.OooO0oO("Buffer size " + i7 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
                        }
                        decodedStreamBuffer2.f9060OooO0o0 = true;
                    } else {
                        System.arraycopy(bArr2, i3, decodedStreamBuffer2.f9056OooO00o, i5, i4);
                        decodedStreamBuffer2.f9058OooO0OO += i4;
                    }
                }
                i3 += i4;
            }
            if (i3 == 0) {
                this.f9020OooOO0o = new ChunkContentIterator(OooO0oO(f9010OooOOOo));
                z = true;
            } else {
                if (i3 < 131072) {
                    byte[] bArr4 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr4, 0, i3);
                    bArr2 = bArr4;
                }
                this.f9020OooOO0o = new ChunkContentIterator(OooO0oO(bArr2));
                z = false;
            }
            this.f9023OooOOOO = z;
        }
        ChunkContentIterator chunkContentIterator2 = this.f9020OooOO0o;
        if (i2 == 0) {
            chunkContentIterator2.getClass();
            iMin = 0;
        } else {
            int i9 = chunkContentIterator2.f9030OooO0O0;
            byte[] bArr5 = chunkContentIterator2.f9029OooO00o;
            if (i9 < bArr5.length) {
                iMin = Math.min(bArr5.length - i9, i2);
                System.arraycopy(bArr5, chunkContentIterator2.f9030OooO0O0, bArr, i, iMin);
                chunkContentIterator2.f9030OooO0O0 += iMin;
            }
        }
        if (iMin > 0) {
            this.f9021OooOOO = false;
            Log log2 = f9011OooOOo0;
            if (log2.OooO0O0()) {
                log2.OooO0oO(iMin + " byte read from the stream.");
            }
        }
        return iMin;
    }
}
