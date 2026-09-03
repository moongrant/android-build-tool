package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.animation.OooO0O0;
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
import p190o00o0O.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    @NonNull
    @VisibleForTesting
    public static Clock zaa = DefaultClock.getInstance();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    public final Uri f14052OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f14053OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    public final String f14054OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getId", id = 2)
    public final String f14055OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getEmail", id = 4)
    public final String f14056OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    public final String f14057OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    public String f14058OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    public final long f14059OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    public final String f14060OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", id = 11)
    public final String f14061OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public final List<Scope> f14062OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", id = 12)
    public final String f14063OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final HashSet f14064OooOOOo = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) String str3, @Nullable @SafeParcelable.Param(id = 5) String str4, @Nullable @SafeParcelable.Param(id = 6) Uri uri, @Nullable @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) ArrayList arrayList, @Nullable @SafeParcelable.Param(id = 11) String str7, @Nullable @SafeParcelable.Param(id = 12) String str8) {
        this.f14053OooO0Oo = i;
        this.f14055OooO0o0 = str;
        this.f14054OooO0o = str2;
        this.f14056OooO0oO = str3;
        this.f14057OooO0oo = str4;
        this.f14052OooO = uri;
        this.f14058OooOO0 = str5;
        this.f14059OooOO0O = j;
        this.f14060OooOO0o = str6;
        this.f14062OooOOO0 = arrayList;
        this.f14061OooOOO = str7;
        this.f14063OooOOOO = str8;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        Account account = new Account("<<default account>>", AccountType.GOOGLE);
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, new HashSet());
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignInAccount fromAccount(@NonNull Account account) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, new OooOO0O());
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
        googleSignInAccountZaa.f14058OooOO0 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        return googleSignInAccount.f14060OooOO0o.equals(this.f14060OooOO0o) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    @Nullable
    public Account getAccount() {
        String str = this.f14056OooO0oO;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    @Nullable
    public String getDisplayName() {
        return this.f14057OooO0oo;
    }

    @Nullable
    public String getEmail() {
        return this.f14056OooO0oO;
    }

    @Nullable
    public String getFamilyName() {
        return this.f14063OooOOOO;
    }

    @Nullable
    public String getGivenName() {
        return this.f14061OooOOO;
    }

    @NonNull
    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.f14062OooOOO0);
    }

    @Nullable
    public String getId() {
        return this.f14055OooO0o0;
    }

    @Nullable
    public String getIdToken() {
        return this.f14054OooO0o;
    }

    @Nullable
    public Uri getPhotoUrl() {
        return this.f14052OooO;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.f14062OooOOO0);
        hashSet.addAll(this.f14064OooOOOo);
        return hashSet;
    }

    @Nullable
    public String getServerAuthCode() {
        return this.f14058OooOO0;
    }

    public int hashCode() {
        return getRequestedScopes().hashCode() + OooO0O0.OooO00o(this.f14060OooOO0o, 527, 31);
    }

    @KeepForSdk
    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.f14059OooOO0O + (-300);
    }

    @NonNull
    @KeepForSdk
    public GoogleSignInAccount requestExtraScopes(@NonNull Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f14064OooOOOo, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14053OooO0Oo);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.f14059OooOO0O);
        SafeParcelWriter.writeString(parcel, 9, this.f14060OooOO0o, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f14062OooOOO0, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final String zac() {
        return this.f14060OooOO0o;
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
            jSONObject.put("expirationTime", this.f14059OooOO0O);
            jSONObject.put("obfuscatedIdentifier", this.f14060OooOO0o);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f14062OooOOO0;
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
