package com.bumptech.glide;

import com.bumptech.glide.OooOo;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOo<CHILD extends OooOo<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOO0.OooO00o.C0434OooO00o f9894OooO0Oo = o00OOO0.OooO00o.f37331OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof OooOo) {
            return o0000oo.OooO0O0(this.f9894OooO0Oo, ((OooOo) obj).f9894OooO0Oo);
        }
        return false;
    }

    public int hashCode() {
        o00OOO0.OooO00o.C0434OooO00o c0434OooO00o = this.f9894OooO0Oo;
        if (c0434OooO00o != null) {
            return c0434OooO00o.hashCode();
        }
        return 0;
    }
}
