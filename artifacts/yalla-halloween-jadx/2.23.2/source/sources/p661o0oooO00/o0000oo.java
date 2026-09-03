package p661o0oooO00;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo extends o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O f59740OooO00o;

    public o0000oo(@NotNull o0000O trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f59740OooO00o = trustRootIndex;
    }

    @Override // p661o0oooO00.o0000O0O
    @NotNull
    public final List OooO00o(@NotNull String hostname, @NotNull List chain) throws SSLPeerUnverifiedException {
        boolean z;
        X509Certificate x509Certificate;
        boolean z2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i = 0;
        boolean z3 = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate2 = (X509Certificate) OooOOO.OooO00o(arrayList, 1);
            X509Certificate x509CertificateOooO00o = this.f59740OooO00o.OooO00o(x509Certificate2);
            if (x509CertificateOooO00o != null) {
                if (arrayList.size() > 1 || !Intrinsics.areEqual(x509Certificate2, x509CertificateOooO00o)) {
                    arrayList.add(x509CertificateOooO00o);
                }
                if (Intrinsics.areEqual(x509CertificateOooO00o.getIssuerDN(), x509CertificateOooO00o.getSubjectDN())) {
                    try {
                        x509CertificateOooO00o.verify(x509CertificateOooO00o.getPublicKey());
                        z = true;
                    } catch (GeneralSecurityException unused) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return arrayList;
                }
                z3 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z3) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Failed to find a trusted cert that signed ", x509Certificate2));
                    }
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    x509Certificate = (X509Certificate) next;
                    if (Intrinsics.areEqual(x509Certificate2.getIssuerDN(), x509Certificate.getSubjectDN())) {
                        try {
                            x509Certificate2.verify(x509Certificate.getPublicKey());
                            z2 = true;
                        } catch (GeneralSecurityException unused2) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } while (!z2);
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Certificate chain too long: ", arrayList));
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o0000oo) && Intrinsics.areEqual(((o0000oo) obj).f59740OooO00o, this.f59740OooO00o);
    }

    public final int hashCode() {
        return this.f59740OooO00o.hashCode();
    }
}
