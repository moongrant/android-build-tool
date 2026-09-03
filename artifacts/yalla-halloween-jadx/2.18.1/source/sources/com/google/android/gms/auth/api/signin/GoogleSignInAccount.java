package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p021OooOooo.o0OoOo0;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    @NonNull
    @VisibleForTesting
    public static Clock zaa = DefaultClock.getInstance();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getEmail", id = 4)
    public String f15028Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15029Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getId", id = 2)
    public String f15030Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    public String f15031Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    public long f15032OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    public Uri f15033OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    public String f15034OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    public String f15035OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    public String f15036OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", id = 11)
    public String f15037OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", id = 12)
    public String f15038OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Set<Scope> f15039OoooOo0 = new HashSet();

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public List<Scope> f15040o000oOoO;

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) String str3, @Nullable @SafeParcelable.Param(id = 5) String str4, @Nullable @SafeParcelable.Param(id = 6) Uri uri, @Nullable @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List<Scope> list, @Nullable @SafeParcelable.Param(id = 11) String str7, @Nullable @SafeParcelable.Param(id = 12) String str8) {
        this.f15029Oooo0o = i;
        this.f15030Oooo0oO = str;
        this.f15031Oooo0oo = str2;
        this.f15028Oooo = str3;
        this.f15034OoooO00 = str4;
        this.f15033OoooO0 = uri;
        this.f15035OoooO0O = str5;
        this.f15032OoooO = j;
        this.f15036OoooOO0 = str6;
        this.f15040o000oOoO = list;
        this.f15037OoooOOO = str7;
        this.f15038OoooOOo = str8;
    }

    public static GoogleSignInAccount OooO00o(Account account, Set<Scope> set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        return OooO00o(new Account("<<default account>>", AccountType.GOOGLE), new HashSet());
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignInAccount fromAccount(@NonNull Account account) {
        return OooO00o(account, new o0OoOo0(0));
    }

    @NonNull
    public static GoogleSignInAccount zaa(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    @Nullable
    public static GoogleSignInAccount zab(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountZaa = zaa(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountZaa.f15035OoooO0O = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountZaa;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f15036OoooOO0.equals(this.f15036OoooOO0) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    @Nullable
    public Account getAccount() {
        String str = this.f15028Oooo;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    @Nullable
    public String getDisplayName() {
        return this.f15034OoooO00;
    }

    @Nullable
    public String getEmail() {
        return this.f15028Oooo;
    }

    @Nullable
    public String getFamilyName() {
        return this.f15038OoooOOo;
    }

    @Nullable
    public String getGivenName() {
        return this.f15037OoooOOO;
    }

    @NonNull
    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.f15040o000oOoO);
    }

    @Nullable
    public String getId() {
        return this.f15030Oooo0oO;
    }

    @Nullable
    public String getIdToken() {
        return this.f15031Oooo0oo;
    }

    @Nullable
    public Uri getPhotoUrl() {
        return this.f15033OoooO0;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.f15040o000oOoO);
        hashSet.addAll(this.f15039OoooOo0);
        return hashSet;
    }

    @Nullable
    public String getServerAuthCode() {
        return this.f15035OoooO0O;
    }

    public int hashCode() {
        return getRequestedScopes().hashCode() + o0O0O00.OooO00o(this.f15036OoooOO0, 527, 31);
    }

    @KeepForSdk
    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.f15032OoooO + (-300);
    }

    @NonNull
    @KeepForSdk
    public GoogleSignInAccount requestExtraScopes(@NonNull Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f15039OoooOo0, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15029Oooo0o);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.f15032OoooO);
        SafeParcelWriter.writeString(parcel, 9, this.f15036OoooOO0, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f15040o000oOoO, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final String zac() {
        return this.f15036OoooOO0;
    }

    @NonNull
    public final String zad() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.f15032OoooO);
            jSONObject.put("obfuscatedIdentifier", this.f15036OoooOO0);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f15040o000oOoO;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
