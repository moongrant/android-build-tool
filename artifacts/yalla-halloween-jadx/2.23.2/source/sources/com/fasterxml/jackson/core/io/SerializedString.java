package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p221o00oOOO0.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public class SerializedString implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f13788OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public transient String f13789OooO0o0;

    static {
        int i = o0000O00.f39663OooO00o;
    }

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f13788OooO0Oo = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.f13789OooO0o0 = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f13788OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f13788OooO0Oo.equals(((SerializedString) obj).f13788OooO0Oo);
    }

    public final int hashCode() {
        return this.f13788OooO0Oo.hashCode();
    }

    public Object readResolve() {
        return new SerializedString(this.f13789OooO0o0);
    }

    public final String toString() {
        return this.f13788OooO0Oo;
    }
}
