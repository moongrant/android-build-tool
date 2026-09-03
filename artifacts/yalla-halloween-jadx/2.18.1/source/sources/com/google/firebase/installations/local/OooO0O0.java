package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f19150OooO00o = 0;

    @AutoValue.Builder
    public static abstract class OooO00o {
    }

    static {
        com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o = new com.google.firebase.installations.local.OooO00o.C0152OooO00o();
        c0152OooO00o.OooO0Oo(0L);
        c0152OooO00o.OooO0OO(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        c0152OooO00o.OooO0O0(0L);
        c0152OooO00o.OooO00o();
    }

    public final boolean OooO() {
        PersistedInstallation.RegistrationStatus registrationStatus = ((com.google.firebase.installations.local.OooO00o) this).f19137OooO0OO;
        return registrationStatus == PersistedInstallation.RegistrationStatus.NOT_GENERATED || registrationStatus == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
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

    public final boolean OooO0oo() {
        return OooO0o() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public final boolean OooOO0() {
        return OooO0o() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }
}
