package oO0o0o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O0O0o;
import p677o0oooo0o.oO0OO00;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Hashtable f52964OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Vector f52965OooO0O0;

    public OooO0O0() {
        Hashtable hashtable = new Hashtable();
        Vector vector = new Vector();
        this.f52964OooO00o = hashtable;
        this.f52965OooO0O0 = vector;
    }

    public final void OooO00o(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object object = objectInputStream.readObject();
        if (object instanceof Hashtable) {
            this.f52964OooO00o = (Hashtable) object;
            this.f52965OooO0O0 = (Vector) objectInputStream.readObject();
            return;
        }
        oO0O0O0o oo0o0o0o = new oO0O0O0o((byte[]) object);
        while (true) {
            ooOOO0Oo ooooo0oo = (ooOOO0Oo) oo0o0o0o.OooOOO();
            if (ooooo0oo == null) {
                return;
            }
            oO0OO0O oo0oo0oOooOOO = oo0o0o0o.OooOOO();
            if (this.f52964OooO00o.containsKey(ooooo0oo)) {
                this.f52964OooO00o.put(ooooo0oo, oo0oo0oOooOOO);
            } else {
                this.f52964OooO00o.put(ooooo0oo, oo0oo0oOooOOO);
                this.f52965OooO0O0.addElement(ooooo0oo);
            }
        }
    }

    public final void OooO0O0(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.f52965OooO0O0.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        oO0OO00 oo0oo00 = new oO0OO00(byteArrayOutputStream);
        Enumeration enumerationElements = this.f52965OooO0O0.elements();
        while (enumerationElements.hasMoreElements()) {
            ooOOO0Oo ooooo0oo = (ooOOO0Oo) enumerationElements.nextElement();
            oo0oo00.OooO(ooooo0oo);
            oo0oo00.OooO((oO0O00o0) this.f52964OooO00o.get(ooooo0oo));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }
}
