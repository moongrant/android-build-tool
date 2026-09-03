package org.bouncycastle.jce.provider;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import org.conscrypt.EvpMdRef;
import p699oO0OOooo.OooO;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class BouncyCastleProvider extends Provider {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oO0OOoO0.OooO00o f53675Oooo0o = new oO0OOoO0.OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final HashMap f53676Oooo0oO = new HashMap();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final String[] f53677Oooo0oo = {"PBEPBKDF2", "PBEPKCS12", "TLSKDF"};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final String[] f53674Oooo = {"SipHash", "Poly1305"};

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final String[] f53680OoooO00 = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF"};

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final String[] f53679OoooO0 = {"X509", "IES"};

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final String[] f53681OoooO0O = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM"};

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final String[] f53678OoooO = {"GOST3411", "Keccak", "MD2", "MD4", EvpMdRef.MD5.JCA_NAME, "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b"};

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final String[] f53682OoooOO0 = {"BC", "BCFKS", "PKCS12"};

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final String[] f53683o000oOoO = {"DRBG"};

    public class OooO00o implements PrivilegedAction {
        public OooO00o() {
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            BouncyCastleProvider bouncyCastleProvider = BouncyCastleProvider.this;
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.digest.", BouncyCastleProvider.f53678OoooO);
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.f53677Oooo0oo);
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.f53674Oooo);
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.f53680OoooO00);
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.f53679OoooO0);
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.f53681OoooO0O);
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.keystore.", BouncyCastleProvider.f53682OoooOO0);
            bouncyCastleProvider.OooO0OO("org.bouncycastle.jcajce.provider.drbg.", BouncyCastleProvider.f53683o000oOoO);
            bouncyCastleProvider.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
            bouncyCastleProvider.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
            bouncyCastleProvider.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
            bouncyCastleProvider.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
            bouncyCastleProvider.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
            bouncyCastleProvider.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
            bouncyCastleProvider.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
            bouncyCastleProvider.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
            bouncyCastleProvider.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
            bouncyCastleProvider.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
            bouncyCastleProvider.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
            bouncyCastleProvider.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
            bouncyCastleProvider.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
            bouncyCastleProvider.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
            bouncyCastleProvider.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
            bouncyCastleProvider.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            bouncyCastleProvider.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            bouncyCastleProvider.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            bouncyCastleProvider.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            bouncyCastleProvider.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            bouncyCastleProvider.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            bouncyCastleProvider.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
            bouncyCastleProvider.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
            bouncyCastleProvider.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
            bouncyCastleProvider.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
            return null;
        }
    }

    public BouncyCastleProvider() {
        super("BC", 1.57d, "BouncyCastle Security Provider v1.57");
        AccessController.doPrivileged(new OooO00o());
    }

    public final void OooO0OO(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class<?> clsLoadClass = null;
            try {
                ClassLoader classLoader = BouncyCastleProvider.class.getClassLoader();
                clsLoadClass = classLoader != null ? classLoader.loadClass(str + strArr[i] + "$Mappings") : Class.forName(str + strArr[i] + "$Mappings");
            } catch (ClassNotFoundException unused) {
            }
            if (clsLoadClass != null) {
                try {
                    ((OooO) clsLoadClass.newInstance()).OooO00o();
                } catch (Exception e) {
                    StringBuilder sbOooO00o = Oooo0.OooO00o("cannot create instance of ", str);
                    sbOooO00o.append(strArr[i]);
                    sbOooO00o.append("$Mappings : ");
                    sbOooO00o.append(e);
                    throw new InternalError(sbOooO00o.toString());
                }
            }
        }
    }
}
