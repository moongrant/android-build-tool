package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DescribeKeyRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f12362OooO0oO = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeKeyRequest)) {
            return false;
        }
        ArrayList arrayList = ((DescribeKeyRequest) obj).f12362OooO0oO;
        boolean z = arrayList == null;
        ArrayList arrayList2 = this.f12362OooO0oO;
        if (z ^ (arrayList2 == null)) {
            return false;
        }
        return arrayList == null || arrayList.equals(arrayList2);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f12362OooO0oO;
        return (arrayList == null ? 0 : arrayList.hashCode()) + 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = this.f12362OooO0oO;
        if (arrayList != null) {
            sb.append("GrantTokens: " + arrayList);
        }
        sb.append("}");
        return sb.toString();
    }
}
