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
import p021OooOooo.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
@KeepForSdk
public final class ClientSettings {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SignInOptions f15544OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Account f15545OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Scope> f15546OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<Scope> f15547OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Api<?>, zab> f15548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f15549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f15550OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f15551OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f15552OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Integer f15553OooOO0;

    @KeepForSdk
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Account f15554OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0OoOo0<Scope> f15555OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f15556OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f15557OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public SignInOptions f15558OooO0o0 = SignInOptions.zaa;

        @NonNull
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.f15554OooO00o, this.f15555OooO0O0, null, 0, null, this.f15556OooO0OO, this.f15557OooO0Oo, this.f15558OooO0o0, false);
        }

        @NonNull
        @KeepForSdk
        public Builder setRealClientPackageName(@NonNull String str) {
            this.f15556OooO0OO = str;
            return this;
        }

        @NonNull
        public final Builder zaa(@NonNull Collection<Scope> collection) {
            if (this.f15555OooO0O0 == null) {
                this.f15555OooO0O0 = new o0OoOo0<>(0);
            }
            this.f15555OooO0O0.addAll(collection);
            return this;
        }

        @NonNull
        public final Builder zab(@Nullable Account account) {
            this.f15554OooO00o = account;
            return this;
        }

        @NonNull
        public final Builder zac(@NonNull String str) {
            this.f15557OooO0Oo = str;
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
        return this.f15545OooO00o;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        Account account = this.f15545OooO00o;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.f15545OooO00o;
        return account != null ? account : new Account("<<default account>>", AccountType.GOOGLE);
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.f15547OooO0OO;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@NonNull Api<?> api) {
        zab zabVar = this.f15548OooO0Oo.get(api);
        if (zabVar == null || zabVar.zaa.isEmpty()) {
            return this.f15546OooO0O0;
        }
        HashSet hashSet = new HashSet(this.f15546OooO0O0);
        hashSet.addAll(zabVar.zaa);
        return hashSet;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.f15550OooO0o0;
    }

    @NonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.f15551OooO0oO;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.f15546OooO0O0;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public View getViewForPopups() {
        return this.f15549OooO0o;
    }

    @NonNull
    public final SignInOptions zaa() {
        return this.f15544OooO;
    }

    @androidx.annotation.Nullable
    public final Integer zab() {
        return this.f15553OooOO0;
    }

    @androidx.annotation.Nullable
    public final String zac() {
        return this.f15552OooO0oo;
    }

    @NonNull
    public final Map<Api<?>, zab> zad() {
        return this.f15548OooO0Oo;
    }

    public final void zae(@NonNull Integer num) {
        this.f15553OooOO0 = num;
    }

    public ClientSettings(@Nullable Account account, @NonNull Set<Scope> set, @NonNull Map<Api<?>, zab> map, int i, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions, boolean z) {
        this.f15545OooO00o = account;
        Set<Scope> setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f15546OooO0O0 = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f15548OooO0Oo = map;
        this.f15549OooO0o = view;
        this.f15550OooO0o0 = i;
        this.f15551OooO0oO = str;
        this.f15552OooO0oo = str2;
        this.f15544OooO = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<zab> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().zaa);
        }
        this.f15547OooO0OO = Collections.unmodifiableSet(hashSet);
    }
}
