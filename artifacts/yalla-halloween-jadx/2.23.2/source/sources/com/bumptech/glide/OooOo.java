package com.bumptech.glide;

import com.bumptech.glide.OooOo;
import p171o00OooO.o00oO0o;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOo<CHILD extends OooOo<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00oO0o.OooO00o f12985OooO0Oo = o00oO0o.f38312OooO00o;

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
            return o00OO0O0.OooO0O0(this.f12985OooO0Oo, ((OooOo) obj).f12985OooO0Oo);
        }
        return false;
    }

    public int hashCode() {
        o00oO0o.OooO00o oooO00o = this.f12985OooO0Oo;
        if (oooO00o != null) {
            return oooO00o.hashCode();
        }
        return 0;
    }
}
