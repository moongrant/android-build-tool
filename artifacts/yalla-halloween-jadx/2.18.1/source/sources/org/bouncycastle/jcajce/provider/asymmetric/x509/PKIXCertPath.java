package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import p016OooOoO0.OooOo00;
import p677o0oooo0o.ooOOO0Oo;
import p682o0oooooO.rk;
import p688oO000OoO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXCertPath extends CertPath {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final List f53657Oooo0o;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        f53657Oooo0o = Collections.unmodifiableList(arrayList);
    }

    @Override // java.security.cert.CertPath
    public final List getCertificates() {
        return Collections.unmodifiableList(new ArrayList((Collection) null));
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            new Vector();
            throw null;
        }
        if (str.equalsIgnoreCase("PKCS7")) {
            ooOOO0Oo ooooo0oo = rk.f52255OooO0o;
            new Vector();
            throw null;
        }
        if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException(OooOo00.OooO0Oo("unsupported encoding: ", str));
        }
        new o0O00o0(new OutputStreamWriter(new ByteArrayOutputStream()));
        try {
            throw null;
        } catch (Exception unused) {
            throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
        }
    }

    @Override // java.security.cert.CertPath
    public final Iterator getEncodings() {
        return f53657Oooo0o.iterator();
    }
}
