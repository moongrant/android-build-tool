package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class AbortIncompleteMultipartUpload implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12436OooO0Oo;

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f12436OooO0Oo == ((AbortIncompleteMultipartUpload) obj).f12436OooO0Oo;
    }

    public final int hashCode() {
        return this.f12436OooO0Oo;
    }
}
