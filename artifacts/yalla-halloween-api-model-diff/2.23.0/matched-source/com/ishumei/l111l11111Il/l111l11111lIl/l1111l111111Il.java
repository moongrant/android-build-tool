package com.ishumei.l111l11111Il.l111l11111lIl;

import android.util.Pair;
import androidx.compose.ui.input.key.OooO00o;
import com.facebook.internal.security.OidcSecurityUtil;
import com.ishumei.l111l1111llIl.l111l1111lI1l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public class l1111l111111Il {
    private static final int l111l11111I1l = 1896449818;
    private static final int l111l11111Il = -1091571699;
    public final long l1111l111111Il;
    public final long l111l11111lIl;
    private ByteBuffer l111l1111l1Il;
    private ByteBuffer l111l1111lI1l;
    private long l111l1111llIl;

    /* JADX INFO: renamed from: com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
    public static class C0265l1111l111111Il {
        public final X509Certificate[][] l1111l111111Il;
        private byte[] l111l11111lIl;

        public C0265l1111l111111Il() {
        }

        public C0265l1111l111111Il(X509Certificate[][] x509CertificateArr, byte[] bArr) {
            this.l1111l111111Il = x509CertificateArr;
            this.l111l11111lIl = bArr;
        }

        public static HashMap<String, String> l1111l111111Il(boolean z) {
            String str;
            HashMap<String, String> map = new HashMap<>();
            try {
                String strL111l11111Il = l111l1111lI1l.l111l11111Il("9e919b8d90969bd1908cd1bd8a96939b");
                Field[] fieldArrL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(strL111l11111Il);
                if (z) {
                    try {
                        Object objL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(strL111l11111Il, l111l1111lI1l.l111l11111Il("989a8bac9a8d969e93"));
                        if (objL1111l111111Il != null) {
                            map.put(l111l1111lI1l.l111l11111Il("8c9a8d969e93a0af"), objL1111l111111Il.toString());
                        }
                    } catch (Throwable unused) {
                    }
                    str = "9d909e8d9bd392909b9a93d38c9a8d969e93d39d8d9e919bd3929e918a999e9c8b8a8d9a8dd3999691989a8d8f8d96918bd39c8f8aa09e9d96d39c8f8aa09e9d96cd";
                } else {
                    str = "9d909e8d9bd392909b9a93d39d8d9e919bd3929e918a999e9c8b8a8d9a8dd3999691989a8d8f8d96918bd39c8f8aa09e9d96d39c8f8aa09e9d96cd";
                }
                String strL111l11111Il2 = l111l1111lI1l.l111l11111Il(str);
                for (Field field : fieldArrL1111l111111Il) {
                    field.setAccessible(true);
                    String lowerCase = field.getName().toLowerCase();
                    if (strL111l11111Il2.contains(lowerCase)) {
                        map.put(lowerCase, field.get(null).toString());
                    }
                }
            } catch (Exception unused2) {
            }
            return map;
        }
    }

    public l1111l111111Il() {
    }

    public l1111l111111Il(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
        this.l111l1111l1Il = byteBuffer;
        this.l1111l111111Il = j;
        this.l111l11111lIl = j2;
        this.l111l1111llIl = j3;
        this.l111l1111lI1l = byteBuffer2;
    }

    public static C0265l1111l111111Il l1111l111111Il(RandomAccessFile randomAccessFile, l1111l111111Il l1111l111111il) throws IOException, CertificateException {
        byte[] bArrCopyOfRange;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        ByteBuffer byteBufferL1111l111111Il = l111l11111lIl.l1111l111111Il(l1111l111111il.l111l1111l1Il);
        while (byteBufferL1111l111111Il.hasRemaining()) {
            arrayList.add(l1111l111111Il(l111l11111lIl.l1111l111111Il(byteBufferL1111l111111Il), map, certificateFactory));
        }
        if (map.containsKey(3)) {
            byte[] bArr = (byte[]) map.get(3);
            long length = randomAccessFile.length();
            if (bArr.length != 40) {
                throw new SecurityException("Verity digest size is wrong: " + bArr.length);
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(32);
            if (byteBufferOrder.getLong() != length - (l1111l111111il.l111l11111lIl - l1111l111111il.l1111l111111Il)) {
                throw new SecurityException("APK content size did not verify");
            }
            bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 32);
        } else {
            bArrCopyOfRange = null;
        }
        return new C0265l1111l111111Il((X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]), bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public static l1111l111111Il l1111l111111Il(RandomAccessFile randomAccessFile) throws IOException {
        boolean z;
        Pair<ByteBuffer, Long> pairL1111l111111Il = l111l1111llIl.l1111l111111Il(randomAccessFile);
        if (pairL1111l111111Il == null) {
            throw new IOException("Not an APK file: ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBuffer = (ByteBuffer) pairL1111l111111Il.first;
        long jLongValue = ((Long) pairL1111l111111Il.second).longValue();
        long j = jLongValue - 20;
        if (j >= 0) {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == 1347094023) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            throw new IOException("ZIP64 APK not supported");
        }
        long jL1111l111111Il = l111l1111llIl.l1111l111111Il(byteBuffer);
        if (jL1111l111111Il > jLongValue) {
            StringBuilder sbOooO00o = o00O0000.OooO00o("ZIP Central Directory offset out of range: ", jL1111l111111Il, ". ZIP End of Central Directory offset: ");
            sbOooO00o.append(jLongValue);
            throw new IOException(sbOooO00o.toString());
        }
        if (l111l1111llIl.l111l11111lIl(byteBuffer) + jL1111l111111Il != jLongValue) {
            throw new IOException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        if (jL1111l111111Il < 32) {
            throw new IOException(OooO00o.OooO00o("APK too small for APK Signing Block. ZIP Central Directory offset: ", jL1111l111111Il));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(jL1111l111111Il - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new IOException("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            throw new IOException(OooO00o.OooO00o("APK Signing Block size out of range: ", j2));
        }
        int i = (int) (8 + j2);
        long j3 = jL1111l111111Il - ((long) i);
        if (j3 < 0) {
            throw new IOException(OooO00o.OooO00o("APK Signing Block offset out of range: ", j3));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j3);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 != j2) {
            StringBuilder sbOooO00o2 = o00O0000.OooO00o("APK Signing Block sizes in header and footer do not match: ", j4, " vs ");
            sbOooO00o2.append(j2);
            throw new IOException(sbOooO00o2.toString());
        }
        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j3));
        return new l1111l111111Il(l111l11111lIl.l1111l111111Il((ByteBuffer) pairCreate.first, l111l11111I1l), ((Long) pairCreate.second).longValue(), jL1111l111111Il, jLongValue, byteBuffer);
    }

    private static void l1111l111111Il(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferL1111l111111Il = l111l11111lIl.l1111l111111Il(byteBuffer);
            if (byteBufferL1111l111111Il.getInt() == l111l11111Il) {
                byteBufferL1111l111111Il.getInt();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    private static X509Certificate[] l1111l111111Il(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        String str2;
        int i;
        ByteBuffer byteBufferL1111l111111Il = l111l11111lIl.l1111l111111Il(byteBuffer);
        ByteBuffer byteBufferL1111l111111Il2 = l111l11111lIl.l1111l111111Il(byteBuffer);
        byte[] bArrL111l11111lIl = l111l11111lIl.l111l11111lIl(byteBuffer);
        ByteBuffer byteBufferL1111l111111Il3 = l111l11111lIl.l1111l111111Il(byteBufferL1111l111111Il2);
        int i2 = byteBufferL1111l111111Il3.getInt();
        byte[] bArrL111l11111lIl2 = l111l11111lIl.l111l11111lIl(byteBufferL1111l111111Il3);
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 == 769) {
            str = "DSA";
        } else {
            if (i2 != 1057) {
                if (i2 == 1059) {
                    str = "EC";
                } else if (i2 != 1061) {
                    switch (i2) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2));
                    }
                } else {
                    str = "DSA";
                }
            }
            str = "RSA";
        }
        PSSParameterSpec pSSParameterSpec = null;
        if (i2 == 513) {
            str2 = "SHA256withECDSA";
        } else if (i2 == 514) {
            str2 = "SHA512withECDSA";
        } else if (i2 == 769) {
            str2 = "SHA256withDSA";
        } else if (i2 == 1057) {
            str2 = OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256;
        } else if (i2 == 1059) {
            str2 = "SHA256withECDSA";
        } else if (i2 != 1061) {
            switch (i2) {
                case 257:
                    pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                    str2 = "SHA256withRSA/PSS";
                    break;
                case 258:
                    pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                    str2 = "SHA512withRSA/PSS";
                    break;
                case 259:
                    str2 = OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256;
                    break;
                case 260:
                    str2 = "SHA512withRSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2));
            }
        } else {
            str2 = "SHA256withDSA";
        }
        Pair pairCreate = Pair.create(str2, pSSParameterSpec);
        String str3 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrL111l11111lIl));
        Signature signature = Signature.getInstance(str3);
        signature.initVerify(publicKeyGeneratePublic);
        if (algorithmParameterSpec != null) {
            signature.setParameter(algorithmParameterSpec);
        }
        signature.update(byteBufferL1111l111111Il);
        signature.verify(bArrL111l11111lIl2);
        byteBufferL1111l111111Il.clear();
        ByteBuffer byteBufferL1111l111111Il4 = l111l11111lIl.l1111l111111Il(byteBufferL1111l111111Il);
        ArrayList arrayList = new ArrayList();
        ByteBuffer byteBufferL1111l111111Il5 = l111l11111lIl.l1111l111111Il(byteBufferL1111l111111Il4);
        arrayList.add(Integer.valueOf(byteBufferL1111l111111Il5.getInt()));
        byte[] bArrL111l11111lIl3 = l111l11111lIl.l111l11111lIl(byteBufferL1111l111111Il5);
        if (i2 == 513) {
            i = 1;
        } else if (i2 == 514) {
            i = 2;
        } else if (i2 == 769) {
            i = 1;
        } else if (i2 == 1057 || i2 == 1059 || i2 == 1061) {
            i = 3;
        } else {
            switch (i2) {
                case 257:
                case 259:
                    i = 1;
                    break;
                case 258:
                case 260:
                    i = 2;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2));
            }
        }
        map.put(Integer.valueOf(i), bArrL111l11111lIl3);
        ByteBuffer byteBufferL1111l111111Il6 = l111l11111lIl.l1111l111111Il(byteBufferL1111l111111Il);
        ArrayList arrayList2 = new ArrayList();
        while (byteBufferL1111l111111Il6.hasRemaining()) {
            byte[] bArrL111l11111lIl4 = l111l11111lIl.l111l11111lIl(byteBufferL1111l111111Il6);
            arrayList2.add(new l111l11111Il((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrL111l11111lIl4)), bArrL111l11111lIl4));
        }
        l1111l111111Il(l111l11111lIl.l1111l111111Il(byteBufferL1111l111111Il));
        return (X509Certificate[]) arrayList2.toArray(new X509Certificate[0]);
    }
}
