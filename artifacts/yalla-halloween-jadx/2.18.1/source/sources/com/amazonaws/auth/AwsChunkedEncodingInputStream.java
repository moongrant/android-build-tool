package com.amazonaws.auth;

import OooO00o.OooO00o;
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
import java.util.Objects;
import kotlin.UByte;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final byte[] f10314OoooOo0 = new byte[0];

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final Log f10315OoooOoO = LogFactory.OooO00o(AwsChunkedEncodingInputStream.class);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f10316Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public InputStream f10317Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f10318Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final byte[] f10319Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final AWS4Signer f10320OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final String f10321OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f10322OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public String f10323OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ChunkContentIterator f10324OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f10325OoooOOO = true;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f10326OoooOOo = false;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public DecodedStreamBuffer f10327o000oOoO;

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this.f10317Oooo0o = null;
        int iMax = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            iMax = Math.max(awsChunkedEncodingInputStream.f10318Oooo0oO, 262144);
            this.f10317Oooo0o = awsChunkedEncodingInputStream.f10317Oooo0o;
            this.f10327o000oOoO = awsChunkedEncodingInputStream.f10327o000oOoO;
        } else {
            this.f10317Oooo0o = inputStream;
            this.f10327o000oOoO = null;
        }
        if (iMax < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f10318Oooo0oO = iMax;
        this.f10319Oooo0oo = bArr;
        this.f10316Oooo = str;
        this.f10322OoooO00 = str2;
        this.f10321OoooO0 = str3;
        this.f10323OoooO0O = str3;
        this.f10320OoooO = aWS4Signer;
    }

    public static long OooO0O0(long j) {
        return ((long) (Long.toHexString(j).length() + 17 + 64 + 2)) + j + ((long) 2);
    }

    public final byte[] OooO0Oo(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb2.append(this.f10316Oooo);
        sb2.append("\n");
        sb2.append(this.f10322OoooO00);
        sb2.append("\n");
        sb2.append(this.f10323OoooO0O);
        sb2.append("\n");
        Objects.requireNonNull(this.f10320OoooO);
        sb2.append(BinaryUtils.OooO0O0(AbstractAWSSigner.OooO0o0("")));
        sb2.append("\n");
        Objects.requireNonNull(this.f10320OoooO);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME);
            messageDigest.update(bArr);
            sb2.append(BinaryUtils.OooO0O0(messageDigest.digest()));
            String strOooO0O0 = BinaryUtils.OooO0O0(this.f10320OoooO.OooOO0o(sb2.toString(), this.f10319Oooo0oo, SigningAlgorithm.HmacSHA256));
            this.f10323OoooO0O = strOooO0O0;
            sb.append(";chunk-signature=" + strOooO0O0);
            sb.append("\r\n");
            try {
                String string = sb.toString();
                Charset charset = StringUtils.f11186OooO00o;
                byte[] bytes = string.getBytes(charset);
                byte[] bytes2 = "\r\n".getBytes(charset);
                byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
                System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
                System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
                System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
                return bArr2;
            } catch (Exception e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to sign the chunked data. ");
                sbOooO0o0.append(e.getMessage());
                throw new AmazonClientException(sbOooO0o0.toString(), e);
            }
        } catch (Exception e2) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Unable to compute hash while signing request: ");
            sbOooO0o1.append(e2.getMessage());
            throw new AmazonClientException(sbOooO0o1.toString(), e2);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        OooO00o();
        if (!this.f10325OoooOOO) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.f10317Oooo0o.markSupported()) {
            Log log = f10315OoooOoO;
            if (log.OooO0OO()) {
                log.OooO00o("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f10317Oooo0o.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f10315OoooOoO;
            if (log2.OooO0OO()) {
                log2.OooO00o("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f10327o000oOoO = new DecodedStreamBuffer(this.f10318Oooo0oO);
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
        Log log = f10315OoooOoO;
        if (log.OooO0OO()) {
            log.OooO00o("One byte read from the stream.");
        }
        return bArr[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        OooO00o();
        this.f10324OoooOO0 = null;
        this.f10323OoooO0O = this.f10321OoooO0;
        if (this.f10317Oooo0o.markSupported()) {
            Log log = f10315OoooOoO;
            if (log.OooO0OO()) {
                log.OooO00o("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f10317Oooo0o.reset();
        } else {
            Log log2 = f10315OoooOoO;
            if (log2.OooO0OO()) {
                log2.OooO00o("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f10327o000oOoO;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            if (decodedStreamBuffer.f10365OooO0o0) {
                throw new AmazonClientException("The input stream is not repeatable since the buffer size " + decodedStreamBuffer.f10362OooO0O0 + " has been exceeded.");
            }
            decodedStreamBuffer.f10364OooO0Oo = 0;
        }
        this.f10324OoooOO0 = null;
        this.f10325OoooOOO = true;
        this.f10326OoooOOo = false;
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
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0095 A[EDGE_INSN: B:70:0x0095->B:44:0x0095 BREAK  A[LOOP:0: B:21:0x002e->B:72:0x002e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0041 A[SYNTHETIC] */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int i3;
        boolean z;
        DecodedStreamBuffer decodedStreamBuffer;
        int i4;
        DecodedStreamBuffer decodedStreamBuffer2;
        int i5;
        Log log;
        int i6;
        boolean z2;
        OooO00o();
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.f10324OoooOO0;
        int iMin = -1;
        if (chunkContentIterator != null) {
            if (!(chunkContentIterator.f10334OooO0O0 < chunkContentIterator.f10333OooO00o.length)) {
                if (this.f10326OoooOOo) {
                    return -1;
                }
                bArr2 = new byte[131072];
                i3 = 0;
                while (i3 < 131072) {
                    decodedStreamBuffer = this.f10327o000oOoO;
                    if (decodedStreamBuffer == null) {
                        i6 = decodedStreamBuffer.f10364OooO0Oo;
                        if (i6 != -1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            byte[] bArr3 = decodedStreamBuffer.f10361OooO00o;
                            decodedStreamBuffer.f10364OooO0Oo = i6 + 1;
                            bArr2[i3] = bArr3[i6];
                            i3++;
                        }
                    }
                    i4 = this.f10317Oooo0o.read(bArr2, i3, 131072 - i3);
                    if (i4 != -1) {
                        break;
                        break;
                    }
                    decodedStreamBuffer2 = this.f10327o000oOoO;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.f10364OooO0Oo = -1;
                        i5 = decodedStreamBuffer2.f10363OooO0OO;
                        if (i5 + i4 > decodedStreamBuffer2.f10362OooO0O0) {
                            log = DecodedStreamBuffer.f10360OooO0o;
                            if (log.OooO0OO()) {
                                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Buffer size ");
                                sbOooO0o0.append(decodedStreamBuffer2.f10362OooO0O0);
                                sbOooO0o0.append(" has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
                                log.OooO00o(sbOooO0o0.toString());
                            }
                            decodedStreamBuffer2.f10365OooO0o0 = true;
                        } else {
                            System.arraycopy(bArr2, i3, decodedStreamBuffer2.f10361OooO00o, i5, i4);
                            decodedStreamBuffer2.f10363OooO0OO += i4;
                        }
                    }
                    i3 += i4;
                }
                if (i3 == 0) {
                    this.f10324OoooOO0 = new ChunkContentIterator(OooO0Oo(f10314OoooOo0));
                    z = true;
                } else {
                    if (i3 < 131072) {
                        byte[] bArr4 = new byte[i3];
                        System.arraycopy(bArr2, 0, bArr4, 0, i3);
                        bArr2 = bArr4;
                    }
                    this.f10324OoooOO0 = new ChunkContentIterator(OooO0Oo(bArr2));
                    z = false;
                }
                this.f10326OoooOOo = z;
            }
        } else {
            if (this.f10326OoooOOo) {
                return -1;
            }
            bArr2 = new byte[131072];
            i3 = 0;
            while (i3 < 131072) {
                decodedStreamBuffer = this.f10327o000oOoO;
                if (decodedStreamBuffer == null) {
                    i6 = decodedStreamBuffer.f10364OooO0Oo;
                    if (i6 != -1 || i6 >= decodedStreamBuffer.f10363OooO0OO) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        byte[] bArr5 = decodedStreamBuffer.f10361OooO00o;
                        decodedStreamBuffer.f10364OooO0Oo = i6 + 1;
                        bArr2[i3] = bArr5[i6];
                        i3++;
                    }
                }
                i4 = this.f10317Oooo0o.read(bArr2, i3, 131072 - i3);
                if (i4 != -1) {
                    break;
                }
                decodedStreamBuffer2 = this.f10327o000oOoO;
                if (decodedStreamBuffer2 != null) {
                    decodedStreamBuffer2.f10364OooO0Oo = -1;
                    i5 = decodedStreamBuffer2.f10363OooO0OO;
                    if (i5 + i4 > decodedStreamBuffer2.f10362OooO0O0) {
                        log = DecodedStreamBuffer.f10360OooO0o;
                        if (log.OooO0OO()) {
                            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Buffer size ");
                            sbOooO0o1.append(decodedStreamBuffer2.f10362OooO0O0);
                            sbOooO0o1.append(" has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
                            log.OooO00o(sbOooO0o1.toString());
                        }
                        decodedStreamBuffer2.f10365OooO0o0 = true;
                    } else {
                        System.arraycopy(bArr2, i3, decodedStreamBuffer2.f10361OooO00o, i5, i4);
                        decodedStreamBuffer2.f10363OooO0OO += i4;
                    }
                }
                i3 += i4;
            }
            if (i3 == 0) {
                this.f10324OoooOO0 = new ChunkContentIterator(OooO0Oo(f10314OoooOo0));
                z = true;
            } else {
                if (i3 < 131072) {
                    byte[] bArr6 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr6, 0, i3);
                    bArr2 = bArr6;
                }
                this.f10324OoooOO0 = new ChunkContentIterator(OooO0Oo(bArr2));
                z = false;
            }
            this.f10326OoooOOo = z;
        }
        ChunkContentIterator chunkContentIterator2 = this.f10324OoooOO0;
        Objects.requireNonNull(chunkContentIterator2);
        if (i2 == 0) {
            iMin = 0;
        } else {
            int i7 = chunkContentIterator2.f10334OooO0O0;
            byte[] bArr7 = chunkContentIterator2.f10333OooO00o;
            if (i7 < bArr7.length) {
                iMin = Math.min(bArr7.length - i7, i2);
                System.arraycopy(chunkContentIterator2.f10333OooO00o, chunkContentIterator2.f10334OooO0O0, bArr, i, iMin);
                chunkContentIterator2.f10334OooO0O0 += iMin;
            }
        }
        if (iMin > 0) {
            this.f10325OoooOOO = false;
            Log log2 = f10315OoooOoO;
            if (log2.OooO0OO()) {
                log2.OooO00o(iMin + " byte read from the stream.");
            }
        }
        return iMin;
    }
}
