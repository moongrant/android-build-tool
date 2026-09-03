package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    @NonNull
    public static final SignInOptions zaa = new SignInOptions();

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        Objects.requireNonNull((SignInOptions) obj);
        return com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return com.google.android.gms.common.internal.Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
