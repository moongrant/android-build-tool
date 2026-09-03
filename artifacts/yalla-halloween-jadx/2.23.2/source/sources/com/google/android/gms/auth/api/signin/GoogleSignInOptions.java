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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p251o00ooO0.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    @NonNull
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;

    @NonNull
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o0O0O00 f14065OooOOOO;

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

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 6)
    public final boolean f14066OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f14067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getAccount", id = 3)
    public final Account f14068OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getScopes", id = 2)
    public final ArrayList<Scope> f14069OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    public final boolean f14070OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", id = 5)
    public final boolean f14071OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", id = 7)
    public final String f14072OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getHostedDomain", id = 8)
    public final String f14073OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExtensions", id = 9)
    public final ArrayList<GoogleSignInOptionsExtensionParcelable> f14074OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Map<Integer, GoogleSignInOptionsExtensionParcelable> f14075OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getLogSessionId", id = 10)
    public final String f14076OooOOO0;

    public static final class Builder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public String f14077OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f14078OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f14079OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f14080OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f14081OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public Account f14082OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public String f14083OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public String f14084OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final HashMap f14085OooO0oo;

        public Builder() {
            this.f14078OooO00o = new HashSet();
            this.f14085OooO0oo = new HashMap();
        }

        @NonNull
        public Builder addExtension(@NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            Integer numValueOf = Integer.valueOf(googleSignInOptionsExtension.getExtensionType());
            HashMap map = this.f14085OooO0oo;
            if (map.containsKey(numValueOf)) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List<Scope> impliedScopes = googleSignInOptionsExtension.getImpliedScopes();
            if (impliedScopes != null) {
                this.f14078OooO00o.addAll(impliedScopes);
            }
            map.put(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        @NonNull
        public GoogleSignInOptions build() {
            Scope scope = GoogleSignInOptions.zae;
            HashSet hashSet = this.f14078OooO00o;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.zad;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            if (this.f14081OooO0Oo && (this.f14082OooO0o == null || !hashSet.isEmpty())) {
                requestId();
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f14082OooO0o, this.f14081OooO0Oo, this.f14079OooO0O0, this.f14080OooO0OO, this.f14083OooO0o0, this.f14084OooO0oO, this.f14085OooO0oo, this.f14077OooO);
        }

        @NonNull
        public Builder requestEmail() {
            this.f14078OooO00o.add(GoogleSignInOptions.zab);
            return this;
        }

        @NonNull
        public Builder requestId() {
            this.f14078OooO00o.add(GoogleSignInOptions.zac);
            return this;
        }

        @NonNull
        public Builder requestIdToken(@NonNull String str) {
            boolean z = true;
            this.f14081OooO0Oo = true;
            Preconditions.checkNotEmpty(str);
            String str2 = this.f14083OooO0o0;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            this.f14083OooO0o0 = str;
            return this;
        }

        @NonNull
        public Builder requestProfile() {
            this.f14078OooO00o.add(GoogleSignInOptions.zaa);
            return this;
        }

        @NonNull
        public Builder requestScopes(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            HashSet hashSet = this.f14078OooO00o;
            hashSet.add(scope);
            hashSet.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public Builder requestServerAuthCode(@NonNull String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            this.f14082OooO0o = new Account(Preconditions.checkNotEmpty(str), AccountType.GOOGLE);
            return this;
        }

        @NonNull
        public Builder setHostedDomain(@NonNull String str) {
            this.f14084OooO0oO = Preconditions.checkNotEmpty(str);
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setLogSessionId(@NonNull String str) {
            this.f14077OooO = str;
            return this;
        }

        @NonNull
        public Builder requestServerAuthCode(@NonNull String str, boolean z) {
            boolean z2 = true;
            this.f14079OooO0O0 = true;
            Preconditions.checkNotEmpty(str);
            String str2 = this.f14083OooO0o0;
            if (str2 != null && !str2.equals(str)) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "two different server client ids provided");
            this.f14083OooO0o0 = str;
            this.f14080OooO0OO = z;
            return this;
        }

        public Builder(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f14078OooO00o = new HashSet();
            this.f14085OooO0oo = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.f14078OooO00o = new HashSet(googleSignInOptions.f14069OooO0o0);
            this.f14079OooO0O0 = googleSignInOptions.f14071OooO0oo;
            this.f14080OooO0OO = googleSignInOptions.f14066OooO;
            this.f14081OooO0Oo = googleSignInOptions.f14070OooO0oO;
            this.f14083OooO0o0 = googleSignInOptions.f14072OooOO0;
            this.f14082OooO0o = googleSignInOptions.f14068OooO0o;
            this.f14084OooO0oO = googleSignInOptions.f14073OooOO0O;
            this.f14085OooO0oo = GoogleSignInOptions.OooO00o(googleSignInOptions.f14074OooOO0o);
            this.f14077OooO = googleSignInOptions.f14076OooOOO0;
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
        f14065OooOOOO = new o0O0O00();
    }

    @SafeParcelable.Constructor
    public GoogleSignInOptions() {
        throw null;
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, @Nullable String str3) {
        this.f14067OooO0Oo = i;
        this.f14069OooO0o0 = arrayList;
        this.f14068OooO0o = account;
        this.f14070OooO0oO = z;
        this.f14071OooO0oo = z2;
        this.f14066OooO = z3;
        this.f14072OooOO0 = str;
        this.f14073OooOO0O = str2;
        this.f14074OooOO0o = new ArrayList<>(map.values());
        this.f14075OooOOO = map;
        this.f14076OooOOO0 = str3;
    }

    public static HashMap OooO00o(@Nullable ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList == null) {
            return map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
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

    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: ClassCastException -> 0x008c, TryCatch #0 {ClassCastException -> 0x008c, blocks: (B:5:0x0008, B:7:0x0012, B:10:0x001c, B:12:0x002a, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0050, B:30:0x0066, B:32:0x006e, B:34:0x0076, B:36:0x007e, B:27:0x005b, B:20:0x0040), top: B:42:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[Catch: ClassCastException -> 0x008c, TryCatch #0 {ClassCastException -> 0x008c, blocks: (B:5:0x0008, B:7:0x0012, B:10:0x001c, B:12:0x002a, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0050, B:30:0x0066, B:32:0x006e, B:34:0x0076, B:36:0x007e, B:27:0x005b, B:20:0x0040), top: B:42:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[Catch: ClassCastException -> 0x008c, TryCatch #0 {ClassCastException -> 0x008c, blocks: (B:5:0x0008, B:7:0x0012, B:10:0x001c, B:12:0x002a, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0050, B:30:0x0066, B:32:0x006e, B:34:0x0076, B:36:0x007e, B:27:0x005b, B:20:0x0040), top: B:42:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: ClassCastException -> 0x008c, TryCatch #0 {ClassCastException -> 0x008c, blocks: (B:5:0x0008, B:7:0x0012, B:10:0x001c, B:12:0x002a, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0050, B:30:0x0066, B:32:0x006e, B:34:0x0076, B:36:0x007e, B:27:0x005b, B:20:0x0040), top: B:42:0x0008 }] */
    public boolean equals(@Nullable Object obj) {
        String str = this.f14072OooOO0;
        ArrayList<Scope> arrayList = this.f14069OooO0o0;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f14074OooOO0o.size() <= 0 && googleSignInOptions.f14074OooOO0o.size() <= 0 && arrayList.size() == googleSignInOptions.getScopes().size() && arrayList.containsAll(googleSignInOptions.getScopes())) {
                Account account = this.f14068OooO0o;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                        if (TextUtils.isEmpty(str)) {
                            if (TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                                if (this.f14066OooO != googleSignInOptions.isForceCodeForRefreshToken() && this.f14070OooO0oO == googleSignInOptions.isIdTokenRequested() && this.f14071OooO0oo == googleSignInOptions.isServerAuthCodeRequested() && TextUtils.equals(this.f14076OooOOO0, googleSignInOptions.getLogSessionId())) {
                                    return true;
                                }
                            }
                        } else if (!str.equals(googleSignInOptions.getServerClientId())) {
                            if (this.f14066OooO != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.getAccount())) {
                    if (TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                            if (this.f14066OooO != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    } else if (!str.equals(googleSignInOptions.getServerClientId())) {
                        if (this.f14066OooO != googleSignInOptions.isForceCodeForRefreshToken()) {
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
        return this.f14068OooO0o;
    }

    @NonNull
    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.f14074OooOO0o;
    }

    @Nullable
    @KeepForSdk
    public String getLogSessionId() {
        return this.f14076OooOOO0;
    }

    @NonNull
    public Scope[] getScopeArray() {
        ArrayList<Scope> arrayList = this.f14069OooO0o0;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @NonNull
    @KeepForSdk
    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.f14069OooO0o0);
    }

    @Nullable
    @KeepForSdk
    public String getServerClientId() {
        return this.f14072OooOO0;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f14069OooO0o0;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).getScopeUri());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.addObject(arrayList);
        hashAccumulator.addObject(this.f14068OooO0o);
        hashAccumulator.addObject(this.f14072OooOO0);
        hashAccumulator.zaa(this.f14066OooO);
        hashAccumulator.zaa(this.f14070OooO0oO);
        hashAccumulator.zaa(this.f14071OooO0oo);
        hashAccumulator.addObject(this.f14076OooOOO0);
        return hashAccumulator.hash();
    }

    @KeepForSdk
    public boolean isForceCodeForRefreshToken() {
        return this.f14066OooO;
    }

    @KeepForSdk
    public boolean isIdTokenRequested() {
        return this.f14070OooO0oO;
    }

    @KeepForSdk
    public boolean isServerAuthCodeRequested() {
        return this.f14071OooO0oo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14067OooO0Oo);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 8, this.f14073OooOO0O, false);
        SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final String zaf() {
        String str = this.f14073OooOO0O;
        String str2 = this.f14072OooOO0;
        ArrayList<Scope> arrayList = this.f14069OooO0o0;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(arrayList, f14065OooOOOO);
            Iterator<Scope> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f14068OooO0o;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f14070OooO0oO);
            jSONObject.put("forceCodeForRefreshToken", this.f14066OooO);
            jSONObject.put("serverAuthRequested", this.f14071OooO0oo);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("serverClientId", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("hostedDomain", str);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
