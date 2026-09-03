package org.bouncycastle.asn1.eac;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class BidirectionalMap extends Hashtable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Hashtable f53613Oooo0o = new Hashtable();

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f53613Oooo0o.put(obj2, obj);
        return super.put(obj, obj2);
    }
}
