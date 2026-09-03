package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AccessControlList implements Serializable, S3RequesterChargedResult {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Set<Grant> f10703Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<Grant> f10704Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Owner f10705Oooo0oo = null;

    @Deprecated
    public final Set<Grant> OooO00o() {
        Set<Grant> set = this.f10703Oooo0o;
        if (set != null && this.f10704Oooo0oO != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
        if (set == null) {
            if (this.f10704Oooo0oO == null) {
                this.f10703Oooo0o = new HashSet();
            } else {
                this.f10703Oooo0o = new HashSet(this.f10704Oooo0oO);
                this.f10704Oooo0oO = null;
            }
        }
        return this.f10703Oooo0o;
    }

    public final List<Grant> OooO0O0() {
        Set<Grant> set = this.f10703Oooo0o;
        if (set != null && this.f10704Oooo0oO != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
        if (this.f10704Oooo0oO == null) {
            if (set == null) {
                this.f10704Oooo0oO = new LinkedList();
            } else {
                this.f10704Oooo0oO = new LinkedList(this.f10703Oooo0o);
                this.f10703Oooo0o = null;
            }
        }
        return this.f10704Oooo0oO;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0o(boolean z) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.f10705Oooo0oo;
        if (owner == null) {
            if (accessControlList.f10705Oooo0oo != null) {
                return false;
            }
        } else if (!owner.equals(accessControlList.f10705Oooo0oo)) {
            return false;
        }
        Set<Grant> set = this.f10703Oooo0o;
        if (set == null) {
            if (accessControlList.f10703Oooo0o != null) {
                return false;
            }
        } else if (!set.equals(accessControlList.f10703Oooo0o)) {
            return false;
        }
        List<Grant> list = this.f10704Oooo0oO;
        if (list == null) {
            if (accessControlList.f10704Oooo0oO != null) {
                return false;
            }
        } else if (!list.equals(accessControlList.f10704Oooo0oO)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Owner owner = this.f10705Oooo0oo;
        int iHashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        Set<Grant> set = this.f10703Oooo0o;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        List<Grant> list = this.f10704Oooo0oO;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AccessControlList [owner=");
        sbOooO0o0.append(this.f10705Oooo0oo);
        sbOooO0o0.append(", grants=");
        sbOooO0o0.append(OooO0O0());
        sbOooO0o0.append("]");
        return sbOooO0o0.toString();
    }
}
