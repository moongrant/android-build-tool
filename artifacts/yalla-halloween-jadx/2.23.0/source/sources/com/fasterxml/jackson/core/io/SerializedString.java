package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p178o00o000.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public class SerializedString implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f10740OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public transient String f10741OooO0o0;

    static {
        int i = o00oO0o.f38584OooO00o;
    }

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f10740OooO0Oo = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.f10741OooO0o0 = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f10740OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f10740OooO0Oo.equals(((SerializedString) obj).f10740OooO0Oo);
    }

    public final int hashCode() {
        return this.f10740OooO0Oo.hashCode();
    }

    public Object readResolve() {
        return new SerializedString(this.f10741OooO0o0);
    }

    public final String toString() {
        return this.f10740OooO0Oo;
    }
}
