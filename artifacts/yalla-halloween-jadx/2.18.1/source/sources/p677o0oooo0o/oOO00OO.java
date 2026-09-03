package p677o0oooo0o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00OO extends ooOOO00O {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ooOOO00O[] f52165Oooo0oO;

    public class OooO00o implements Enumeration {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f52166OooO00o = 0;

        public OooO00o() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f52166OooO00o < oOO00OO.this.f52165Oooo0oO.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            ooOOO00O[] ooooo00oArr = oOO00OO.this.f52165Oooo0oO;
            int i = this.f52166OooO00o;
            this.f52166OooO00o = i + 1;
            return ooooo00oArr[i];
        }
    }

    public oOO00OO(byte[] bArr) {
        super(bArr);
    }

    public oOO00OO(ooOOO00O[] ooooo00oArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != ooooo00oArr.length; i++) {
            try {
                byteArrayOutputStream.write(((oOOO0OO0) ooooo00oArr[i]).f52196Oooo0o);
            } catch (IOException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("exception converting octets ");
                sbOooO0o0.append(e.toString());
                throw new IllegalArgumentException(sbOooO0o0.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(ooooo00oArr[i].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        super(byteArrayOutputStream.toByteArray());
        this.f52165Oooo0oO = ooooo00oArr;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0OO(36);
        oo0oo00.OooO0OO(128);
        Enumeration enumerationOooOo00 = OooOo00();
        while (enumerationOooOo00.hasMoreElements()) {
            oo0oo00.OooO((oO0O00o0) enumerationOooOo00.nextElement());
        }
        oo0oo00.OooO0OO(0);
        oo0oo00.OooO0OO(0);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        Enumeration enumerationOooOo00 = OooOo00();
        int iOooOO0O = 0;
        while (enumerationOooOo00.hasMoreElements()) {
            iOooOO0O += ((oO0O00o0) enumerationOooOo00.nextElement()).OooO0O0().OooOO0O();
        }
        return iOooOO0O + 2 + 2;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return true;
    }

    @Override // p677o0oooo0o.ooOOO00O
    public final byte[] OooOOoo() {
        return this.f52196Oooo0o;
    }

    public final Enumeration OooOo00() {
        if (this.f52165Oooo0oO != null) {
            return new OooO00o();
        }
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f52196Oooo0o;
            if (i >= bArr.length) {
                return vector.elements();
            }
            int i2 = i + 1000;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            vector.addElement(new oOOO0OO0(bArr2));
            i = i2;
        }
    }
}
