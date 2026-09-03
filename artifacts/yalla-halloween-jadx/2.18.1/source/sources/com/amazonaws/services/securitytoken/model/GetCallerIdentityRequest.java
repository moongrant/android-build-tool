package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetCallerIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCallerIdentityRequest)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "{}";
    }
}
