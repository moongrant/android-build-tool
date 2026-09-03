package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p327o0O0ooO0.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    @NonNull
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;

    @NonNull
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static Comparator<Scope> f15041OoooOOo;

    @NonNull
    @VisibleForTesting
    public static final Scope zaa = new Scope(Scopes.PROFILE);

    @NonNull
    @VisibleForTesting
    public static final Scope zab = new Scope("email");

    @NonNull
    @VisibleForTesting
    public static final Scope zac = new Scope("openid");

    @NonNull
    @VisibleForTesting
    public static final Scope zad;

    @NonNull
    @VisibleForTesting
    public static final Scope zae;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    public boolean f15042Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15043Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getScopes", id = 2)
    public final ArrayList<Scope> f15044Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getAccount", id = 3)
    public Account f15045Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getHostedDomain", id = 8)
    public String f15046OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 6)
    public final boolean f15047OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", id = 5)
    public final boolean f15048OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", id = 7)
    public String f15049OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExtensions", id = 9)
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f15050OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Map<Integer, GoogleSignInOptionsExtensionParcelable> f15051OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getLogSessionId", id = 10)
    public String f15052o000oOoO;

    public static final class Builder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public String f15053OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Set<Scope> f15054OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f15055OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f15056OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f15057OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public Account f15058OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public String f15059OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public String f15060OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Map<Integer, GoogleSignInOptionsExtensionParcelable> f15061OooO0oo;

        public Builder() {
            this.f15054OooO00o = new HashSet();
            this.f15061OooO0oo = new HashMap();
        }

        public final String OooO00o(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.f15059OooO0o0;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable>] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable>] */
        @NonNull
        public Builder addExtension(@NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (this.f15061OooO0oo.containsKey(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List<Scope> impliedScopes = googleSignInOptionsExtension.getImpliedScopes();
            if (impliedScopes != null) {
                this.f15054OooO00o.addAll(impliedScopes);
            }
            this.f15061OooO0oo.put(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        @NonNull
        public GoogleSignInOptions build() {
            if (this.f15054OooO00o.contains(GoogleSignInOptions.zae)) {
                ?? r0 = this.f15054OooO00o;
                Scope scope = GoogleSignInOptions.zad;
                if (r0.contains(scope)) {
                    this.f15054OooO00o.remove(scope);
                }
            }
            if (this.f15057OooO0Oo && (this.f15058OooO0o == null || !this.f15054OooO00o.isEmpty())) {
                requestId();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f15054OooO00o), this.f15058OooO0o, this.f15057OooO0Oo, this.f15055OooO0O0, this.f15056OooO0OO, this.f15059OooO0o0, this.f15060OooO0oO, this.f15061OooO0oo, this.f15053OooO);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        @NonNull
        public Builder requestEmail() {
            this.f15054OooO00o.add(GoogleSignInOptions.zab);
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        @NonNull
        public Builder requestId() {
            this.f15054OooO00o.add(GoogleSignInOptions.zac);
            return this;
        }

        @NonNull
        public Builder requestIdToken(@NonNull String str) {
            this.f15057OooO0Oo = true;
            OooO00o(str);
            this.f15059OooO0o0 = str;
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        @NonNull
        public Builder requestProfile() {
            this.f15054OooO00o.add(GoogleSignInOptions.zaa);
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        @NonNull
        public Builder requestScopes(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f15054OooO00o.add(scope);
            this.f15054OooO00o.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public Builder requestServerAuthCode(@NonNull String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            this.f15058OooO0o = new Account(Preconditions.checkNotEmpty(str), AccountType.GOOGLE);
            return this;
        }

        @NonNull
        public Builder setHostedDomain(@NonNull String str) {
            this.f15060OooO0oO = Preconditions.checkNotEmpty(str);
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setLogSessionId(@NonNull String str) {
            this.f15053OooO = str;
            return this;
        }

        @NonNull
        public Builder requestServerAuthCode(@NonNull String str, boolean z) {
            this.f15055OooO0O0 = true;
            OooO00o(str);
            this.f15059OooO0o0 = str;
            this.f15056OooO0OO = z;
            return this;
        }

        public Builder(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f15054OooO00o = new HashSet();
            this.f15061OooO0oo = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.f15054OooO00o = new HashSet(googleSignInOptions.f15044Oooo0oO);
            this.f15055OooO0O0 = googleSignInOptions.f15048OoooO00;
            this.f15056OooO0OO = googleSignInOptions.f15047OoooO0;
            this.f15057OooO0Oo = googleSignInOptions.f15042Oooo;
            this.f15059OooO0o0 = googleSignInOptions.f15049OoooO0O;
            this.f15058OooO0o = googleSignInOptions.f15045Oooo0oo;
            this.f15060OooO0oO = googleSignInOptions.f15046OoooO;
            this.f15061OooO0oo = (HashMap) GoogleSignInOptions.OooO00o(googleSignInOptions.f15050OoooOO0);
            this.f15053OooO = googleSignInOptions.f15052o000oOoO;
        }
    }

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        zad = scope;
        zae = new Scope(Scopes.GAMES);
        Builder builder = new Builder();
        builder.requestId();
        builder.requestProfile();
        DEFAULT_SIGN_IN = builder.build();
        Builder builder2 = new Builder();
        builder2.requestScopes(scope, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = builder2.build();
        CREATOR = new zae();
        f15041OoooOOo = new o000O000();
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, @Nullable String str3) {
        this.f15043Oooo0o = i;
        this.f15044Oooo0oO = arrayList;
        this.f15045Oooo0oo = account;
        this.f15042Oooo = z;
        this.f15048OoooO00 = z2;
        this.f15047OoooO0 = z3;
        this.f15049OoooO0O = str;
        this.f15046OoooO = str2;
        this.f15050OoooOO0 = new ArrayList<>(map.values());
        this.f15051OoooOOO = map;
        this.f15052o000oOoO = str3;
    }

    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> OooO00o(@Nullable List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
        }
        return map;
    }

    @Nullable
    public static GoogleSignInOptions zab(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, AccountType.GOOGLE) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f15050OoooOO0.size() <= 0 && googleSignInOptions.f15050OoooOO0.size() <= 0 && this.f15044Oooo0oO.size() == googleSignInOptions.getScopes().size() && this.f15044Oooo0oO.containsAll(googleSignInOptions.getScopes())) {
                Account account = this.f15045Oooo0oo;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                        if (TextUtils.isEmpty(this.f15049OoooO0O)) {
                            if (TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                                if (this.f15047OoooO0 != googleSignInOptions.isForceCodeForRefreshToken() && this.f15042Oooo == googleSignInOptions.isIdTokenRequested() && this.f15048OoooO00 == googleSignInOptions.isServerAuthCodeRequested() && TextUtils.equals(this.f15052o000oOoO, googleSignInOptions.getLogSessionId())) {
                                    return true;
                                }
                            }
                        } else if (!this.f15049OoooO0O.equals(googleSignInOptions.getServerClientId())) {
                            if (this.f15047OoooO0 != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.getAccount())) {
                    if (TextUtils.isEmpty(this.f15049OoooO0O)) {
                        if (TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                            if (this.f15047OoooO0 != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    } else if (!this.f15049OoooO0O.equals(googleSignInOptions.getServerClientId())) {
                        if (this.f15047OoooO0 != googleSignInOptions.isForceCodeForRefreshToken()) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    @Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.f15045Oooo0oo;
    }

    @NonNull
    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.f15050OoooOO0;
    }

    @Nullable
    @KeepForSdk
    public String getLogSessionId() {
        return this.f15052o000oOoO;
    }

    @NonNull
    public Scope[] getScopeArray() {
        ArrayList<Scope> arrayList = this.f15044Oooo0oO;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @NonNull
    @KeepForSdk
    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.f15044Oooo0oO);
    }

    @Nullable
    @KeepForSdk
    public String getServerClientId() {
        return this.f15049OoooO0O;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f15044Oooo0oO;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).getScopeUri());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.addObject(arrayList);
        hashAccumulator.addObject(this.f15045Oooo0oo);
        hashAccumulator.addObject(this.f15049OoooO0O);
        hashAccumulator.zaa(this.f15047OoooO0);
        hashAccumulator.zaa(this.f15042Oooo);
        hashAccumulator.zaa(this.f15048OoooO00);
        hashAccumulator.addObject(this.f15052o000oOoO);
        return hashAccumulator.hash();
    }

    @KeepForSdk
    public boolean isForceCodeForRefreshToken() {
        return this.f15047OoooO0;
    }

    @KeepForSdk
    public boolean isIdTokenRequested() {
        return this.f15042Oooo;
    }

    @KeepForSdk
    public boolean isServerAuthCodeRequested() {
        return this.f15048OoooO00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15043Oooo0o);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 8, this.f15046OoooO, false);
        SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final String zaf() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f15044Oooo0oO, f15041OoooOOo);
            Iterator<Scope> it = this.f15044Oooo0oO.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f15045Oooo0oo;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f15042Oooo);
            jSONObject.put("forceCodeForRefreshToken", this.f15047OoooO0);
            jSONObject.put("serverAuthRequested", this.f15048OoooO00);
            if (!TextUtils.isEmpty(this.f15049OoooO0O)) {
                jSONObject.put("serverClientId", this.f15049OoooO0O);
            }
            if (!TextUtils.isEmpty(this.f15046OoooO)) {
                jSONObject.put("hostedDomain", this.f15046OoooO);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
