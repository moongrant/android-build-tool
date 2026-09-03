package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
@KeepForSdk
public final class ClientSettings {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SignInOptions f14564OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Account f14565OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Scope> f14566OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<Scope> f14567OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Api<?>, zab> f14568OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f14569OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14570OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f14571OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f14572OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Integer f14573OooOO0;

    @KeepForSdk
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Account f14574OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public p190o00o0O.OooOO0O<Scope> f14575OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f14576OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f14577OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final SignInOptions f14578OooO0o0 = SignInOptions.zaa;

        @NonNull
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.f14574OooO00o, this.f14575OooO0O0, null, 0, null, this.f14576OooO0OO, this.f14577OooO0Oo, this.f14578OooO0o0, false);
        }

        @NonNull
        @KeepForSdk
        public Builder setRealClientPackageName(@NonNull String str) {
            this.f14576OooO0OO = str;
            return this;
        }

        @NonNull
        public final Builder zaa(@NonNull Collection<Scope> collection) {
            if (this.f14575OooO0O0 == null) {
                this.f14575OooO0O0 = new p190o00o0O.OooOO0O<>();
            }
            this.f14575OooO0O0.addAll(collection);
            return this;
        }

        @NonNull
        public final Builder zab(@Nullable Account account) {
            this.f14574OooO00o = account;
            return this;
        }

        @NonNull
        public final Builder zac(@NonNull String str) {
            this.f14577OooO0Oo = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@NonNull Account account, @NonNull Set<Scope> set, @NonNull Map<Api<?>, zab> map, int i, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @NonNull
    @KeepForSdk
    public static ClientSettings createDefault(@NonNull Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.f14565OooO00o;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        Account account = this.f14565OooO00o;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.f14565OooO00o;
        return account != null ? account : new Account("<<default account>>", AccountType.GOOGLE);
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.f14567OooO0OO;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@NonNull Api<?> api) {
        zab zabVar = this.f14568OooO0Oo.get(api);
        Set<Scope> set = this.f14566OooO0O0;
        if (zabVar == null || zabVar.zaa.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet(set);
        hashSet.addAll(zabVar.zaa);
        return hashSet;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.f14570OooO0o0;
    }

    @NonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.f14571OooO0oO;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.f14566OooO0O0;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public View getViewForPopups() {
        return this.f14569OooO0o;
    }

    @NonNull
    public final SignInOptions zaa() {
        return this.f14564OooO;
    }

    @androidx.annotation.Nullable
    public final Integer zab() {
        return this.f14573OooOO0;
    }

    @androidx.annotation.Nullable
    public final String zac() {
        return this.f14572OooO0oo;
    }

    @NonNull
    public final Map<Api<?>, zab> zad() {
        return this.f14568OooO0Oo;
    }

    public final void zae(@NonNull Integer num) {
        this.f14573OooOO0 = num;
    }

    public ClientSettings(@Nullable Account account, @NonNull Set<Scope> set, @NonNull Map<Api<?>, zab> map, int i, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions, boolean z) {
        this.f14565OooO00o = account;
        Set<Scope> setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f14566OooO0O0 = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f14568OooO0Oo = map;
        this.f14569OooO0o = view;
        this.f14570OooO0o0 = i;
        this.f14571OooO0oO = str;
        this.f14572OooO0oo = str2;
        this.f14564OooO = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<zab> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().zaa);
        }
        this.f14567OooO0OO = Collections.unmodifiableSet(hashSet);
    }
}
