package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public class bc {
    private final ByteArrayOutputStream a;
    private final ce b;
    private bs c;

    public bc() {
        this(new bm.a());
    }

    public byte[] a(at atVar) throws az {
        this.a.reset();
        atVar.write(this.c);
        return this.a.toByteArray();
    }

    public String b(at atVar) throws az {
        return new String(a(atVar));
    }

    public bc(bu buVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        ce ceVar = new ce(byteArrayOutputStream);
        this.b = ceVar;
        this.c = buVar.a(ceVar);
    }

    public String a(at atVar, String str) throws az {
        try {
            return new String(a(atVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new az(OooOo00.OooO0Oo("JVM DOES NOT SUPPORT ENCODING: ", str));
        }
    }
}
