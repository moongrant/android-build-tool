package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AccessControlList implements Serializable, S3RequesterChargedResult {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashSet f9361OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Owner f9362OooO0o = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LinkedList f9363OooO0o0;

    public final List<Grant> OooO00o() {
        HashSet hashSet = this.f9361OooO0Oo;
        if (hashSet != null && this.f9363OooO0o0 != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
        if (this.f9363OooO0o0 == null) {
            if (hashSet == null) {
                this.f9363OooO0o0 = new LinkedList();
            } else {
                this.f9363OooO0o0 = new LinkedList(this.f9361OooO0Oo);
                this.f9361OooO0Oo = null;
            }
        }
        return this.f9363OooO0o0;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0oO(boolean z) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.f9362OooO0o;
        if (owner == null) {
            if (accessControlList.f9362OooO0o != null) {
                return false;
            }
        } else if (!owner.equals(accessControlList.f9362OooO0o)) {
            return false;
        }
        HashSet hashSet = this.f9361OooO0Oo;
        if (hashSet == null) {
            if (accessControlList.f9361OooO0Oo != null) {
                return false;
            }
        } else if (!hashSet.equals(accessControlList.f9361OooO0Oo)) {
            return false;
        }
        LinkedList linkedList = this.f9363OooO0o0;
        if (linkedList == null) {
            if (accessControlList.f9363OooO0o0 != null) {
                return false;
            }
        } else if (!linkedList.equals(accessControlList.f9363OooO0o0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Owner owner = this.f9362OooO0o;
        int iHashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        HashSet hashSet = this.f9361OooO0Oo;
        int iHashCode2 = (iHashCode + (hashSet == null ? 0 : hashSet.hashCode())) * 31;
        LinkedList linkedList = this.f9363OooO0o0;
        return iHashCode2 + (linkedList != null ? linkedList.hashCode() : 0);
    }

    public final String toString() {
        return "AccessControlList [owner=" + this.f9362OooO0o + ", grants=" + OooO00o() + "]";
    }
}
