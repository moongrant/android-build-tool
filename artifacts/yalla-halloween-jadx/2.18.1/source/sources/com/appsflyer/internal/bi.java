package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class bi<Body> {
    private final boolean AFInAppEventParameterName;
    public final int valueOf;

    @NonNull
    public final Body values;

    public bi(@NonNull Body body, int i, boolean z) {
        this.values = body;
        this.valueOf = i;
        this.AFInAppEventParameterName = z;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bi.class == obj.getClass()) {
            bi biVar = (bi) obj;
            if (this.valueOf != biVar.valueOf || this.AFInAppEventParameterName != biVar.AFInAppEventParameterName) {
                return false;
            }
            Body body = this.values;
            Body body2 = biVar.values;
            if (body != null) {
                return body.equals(body2);
            }
            if (body2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Body body = this.values;
        return ((((body != null ? body.hashCode() : 0) * 31) + this.valueOf) * 31) + (this.AFInAppEventParameterName ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{body=");
        sb.append(this.values);
        sb.append(", statusCode=");
        sb.append(this.valueOf);
        sb.append(", isSuccessful=");
        sb.append(this.AFInAppEventParameterName);
        sb.append('}');
        return sb.toString();
    }
}
