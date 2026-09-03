package org.conscrypt;

import androidx.lifecycle.OooOOO;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class OAEPParameters extends AlgorithmParametersSpi {
    private static final String MGF1_OID = "1.2.840.113549.1.1.8";
    private static final Map<String, String> NAME_TO_OID;
    private static final Map<String, String> OID_TO_NAME;
    private static final String PSPECIFIED_OID = "1.2.840.113549.1.1.9";
    private OAEPParameterSpec spec = OAEPParameterSpec.DEFAULT;

    static {
        HashMap map = new HashMap();
        OID_TO_NAME = map;
        NAME_TO_OID = new HashMap();
        map.put(EvpMdRef.SHA1.OID, EvpMdRef.SHA1.JCA_NAME);
        map.put(EvpMdRef.SHA224.OID, EvpMdRef.SHA224.JCA_NAME);
        map.put(EvpMdRef.SHA256.OID, EvpMdRef.SHA256.JCA_NAME);
        map.put(EvpMdRef.SHA384.OID, EvpMdRef.SHA384.JCA_NAME);
        map.put(EvpMdRef.SHA512.OID, EvpMdRef.SHA512.JCA_NAME);
        for (Map.Entry entry : map.entrySet()) {
            NAME_TO_OID.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    private static String getHashName(long j) throws Throwable {
        long jAsn1_read_sequence;
        try {
            jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(j);
            try {
                String strAsn1_read_oid = NativeCrypto.asn1_read_oid(jAsn1_read_sequence);
                if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence)) {
                    NativeCrypto.asn1_read_null(jAsn1_read_sequence);
                }
                if (NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence)) {
                    Map<String, String> map = OID_TO_NAME;
                    if (map.containsKey(strAsn1_read_oid)) {
                        String str = map.get(strAsn1_read_oid);
                        NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                        return str;
                    }
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jAsn1_read_sequence = 0;
        }
    }

    public static String readHash(long j) throws IOException {
        if (!NativeCrypto.asn1_read_next_tag_is(j, 0)) {
            return EvpMdRef.SHA1.JCA_NAME;
        }
        long jAsn1_read_tagged = 0;
        try {
            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(j);
            return getHashName(jAsn1_read_tagged);
        } finally {
            NativeCrypto.asn1_read_free(jAsn1_read_tagged);
        }
    }

    public static String readMgfHash(long j) throws Throwable {
        long jAsn1_read_tagged;
        if (!NativeCrypto.asn1_read_next_tag_is(j, 1)) {
            return EvpMdRef.SHA1.JCA_NAME;
        }
        try {
            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(j);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_tagged);
                if (!NativeCrypto.asn1_read_oid(jAsn1_read_sequence).equals("1.2.840.113549.1.1.8")) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                String hashName = getHashName(jAsn1_read_sequence);
                if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                return hashName;
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jAsn1_read_tagged = 0;
        }
    }

    private static long writeAlgorithmIdentifier(long j, String str) throws IOException {
        long jAsn1_write_sequence;
        try {
            jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(j);
            try {
                NativeCrypto.asn1_write_oid(jAsn1_write_sequence, str);
                return jAsn1_write_sequence;
            } catch (IOException e) {
                e = e;
                NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            jAsn1_write_sequence = 0;
        }
    }

    public static void writeHashAndMgfHash(long j, String str, MGF1ParameterSpec mGF1ParameterSpec) throws Throwable {
        long jAsn1_write_tag;
        long jWriteAlgorithmIdentifier;
        long jAsn1_write_tag2;
        long jWriteAlgorithmIdentifier2 = 0;
        if (!str.equals(EvpMdRef.SHA1.JCA_NAME)) {
            try {
                jAsn1_write_tag2 = NativeCrypto.asn1_write_tag(j, 0);
                try {
                    long jWriteAlgorithmIdentifier3 = writeAlgorithmIdentifier(jAsn1_write_tag2, NAME_TO_OID.get(str));
                    try {
                        NativeCrypto.asn1_write_null(jWriteAlgorithmIdentifier3);
                        NativeCrypto.asn1_write_flush(j);
                        NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier3);
                        NativeCrypto.asn1_write_free(jAsn1_write_tag2);
                    } catch (Throwable th) {
                        th = th;
                        jWriteAlgorithmIdentifier2 = jWriteAlgorithmIdentifier3;
                        NativeCrypto.asn1_write_flush(j);
                        NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier2);
                        NativeCrypto.asn1_write_free(jAsn1_write_tag2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                jAsn1_write_tag2 = 0;
            }
        }
        if (mGF1ParameterSpec.getDigestAlgorithm().equals(EvpMdRef.SHA1.JCA_NAME)) {
            return;
        }
        try {
            jAsn1_write_tag = NativeCrypto.asn1_write_tag(j, 1);
            try {
                jWriteAlgorithmIdentifier = writeAlgorithmIdentifier(jAsn1_write_tag, "1.2.840.113549.1.1.8");
                try {
                    jWriteAlgorithmIdentifier2 = writeAlgorithmIdentifier(jWriteAlgorithmIdentifier, NAME_TO_OID.get(mGF1ParameterSpec.getDigestAlgorithm()));
                    NativeCrypto.asn1_write_null(jWriteAlgorithmIdentifier2);
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier2);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                } catch (Throwable th4) {
                    th = th4;
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier2);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                jWriteAlgorithmIdentifier = 0;
            }
        } catch (Throwable th6) {
            th = th6;
            jAsn1_write_tag = 0;
            jWriteAlgorithmIdentifier = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws Throwable {
        long j;
        Throwable th;
        long jAsn1_write_init;
        IOException e;
        long jAsn1_write_tag;
        long jWriteAlgorithmIdentifier = 0;
        try {
            try {
                jAsn1_write_init = NativeCrypto.asn1_write_init();
                try {
                    long jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
                    try {
                        writeHashAndMgfHash(jAsn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                        PSource.PSpecified pSpecified = (PSource.PSpecified) this.spec.getPSource();
                        if (pSpecified.getValue().length != 0) {
                            try {
                                jAsn1_write_tag = NativeCrypto.asn1_write_tag(jAsn1_write_sequence, 2);
                                try {
                                    jWriteAlgorithmIdentifier = writeAlgorithmIdentifier(jAsn1_write_tag, PSPECIFIED_OID);
                                    NativeCrypto.asn1_write_octetstring(jWriteAlgorithmIdentifier, pSpecified.getValue());
                                    NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                                } catch (Throwable th2) {
                                    th = th2;
                                    NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                jAsn1_write_tag = 0;
                            }
                        }
                        byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                        NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                        NativeCrypto.asn1_write_free(jAsn1_write_init);
                        return bArrAsn1_write_finish;
                    } catch (IOException e2) {
                        e = e2;
                        NativeCrypto.asn1_write_cleanup(jAsn1_write_init);
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th4) {
                    th = th4;
                    j = 0;
                    NativeCrypto.asn1_write_free(j);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e4) {
            e = e4;
            jAsn1_write_init = 0;
        } catch (Throwable th6) {
            j = 0;
            th = th6;
            jAsn1_write_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls == null || cls != OAEPParameterSpec.class) {
            throw new InvalidParameterSpecException(OooOOO.OooO00o("Unsupported class: ", cls));
        }
        return this.spec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidParameterSpecException("Only OAEPParameterSpec is supported");
        }
        this.spec = (OAEPParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt OAEP AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws Throwable {
        long jAsn1_read_init;
        long jAsn1_read_tagged;
        long j = 0;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                try {
                    PSource.PSpecified pSpecified = PSource.PSpecified.DEFAULT;
                    String hash = readHash(jAsn1_read_sequence);
                    String mgfHash = readMgfHash(jAsn1_read_sequence);
                    if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 2)) {
                        try {
                            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                            try {
                                long jAsn1_read_sequence2 = NativeCrypto.asn1_read_sequence(jAsn1_read_tagged);
                                if (NativeCrypto.asn1_read_oid(jAsn1_read_sequence2).equals(PSPECIFIED_OID)) {
                                    pSpecified = new PSource.PSpecified(NativeCrypto.asn1_read_octetstring(jAsn1_read_sequence2));
                                    if (NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence2)) {
                                        NativeCrypto.asn1_read_free(jAsn1_read_sequence2);
                                        NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                                    } else {
                                        throw new IOException("Error reading ASN.1 encoding");
                                    }
                                } else {
                                    throw new IOException("Error reading ASN.1 encoding");
                                }
                            } catch (Throwable th) {
                                th = th;
                                NativeCrypto.asn1_read_free(0L);
                                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            jAsn1_read_tagged = 0;
                        }
                    }
                    if (NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) && NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                        this.spec = new OAEPParameterSpec(hash, EvpMdRef.MGF1_ALGORITHM_NAME, new MGF1ParameterSpec(mgfHash), pSpecified);
                        NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                        NativeCrypto.asn1_read_free(jAsn1_read_init);
                        return;
                    }
                    throw new IOException("Error reading ASN.1 encoding");
                } catch (Throwable th3) {
                    th = th3;
                    j = jAsn1_read_sequence;
                    NativeCrypto.asn1_read_free(j);
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException(OooOo00.OooO0Oo("Unsupported format: ", str));
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws Throwable {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException(OooOo00.OooO0Oo("Unsupported format: ", str));
        }
        engineInit(bArr);
    }
}
