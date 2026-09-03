package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f19735OooO00o = 0;

    @AutoValue.Builder
    public static abstract class OooO00o {
    }

    static {
        com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00o = new com.google.firebase.installations.local.OooO00o.C0255OooO00o();
        c0255OooO00o.f19732OooO0o = 0L;
        c0255OooO00o.OooO0O0(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        c0255OooO00o.f19733OooO0o0 = 0L;
        c0255OooO00o.OooO00o();
    }

    @Nullable
    public abstract String OooO00o();

    public abstract long OooO0O0();

    @Nullable
    public abstract String OooO0OO();

    @Nullable
    public abstract String OooO0Oo();

    @NonNull
    public abstract PersistedInstallation.RegistrationStatus OooO0o();

    @Nullable
    public abstract String OooO0o0();

    public abstract long OooO0oO();
}
