package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p023Oooo00O.o00O0;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0003CDEB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011B\u000f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010.\u001a\u00020/2\n\u00100\u001a\u000601j\u0002`2H\u0002J\u001a\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u00105\u001a\u000206H\u0016J\u0013\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u000206H\u0016J\r\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\b\u0010>\u001a\u00020\u0003H\u0016J\b\u0010?\u001a\u00020\u0003H\u0002J\u0018\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u000206H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0016¨\u0006F"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "accessToken", "", "applicationId", "userId", "permissions", "", "declinedPermissions", "expiredPermissions", "accessTokenSource", "Lcom/facebook/AccessTokenSource;", "expirationTime", "Ljava/util/Date;", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getApplicationId", "()Ljava/lang/String;", "getDataAccessExpirationTime", "()Ljava/util/Date;", "", "getDeclinedPermissions", "()Ljava/util/Set;", "getExpiredPermissions", "expires", "getExpires", "getGraphDomain", "isDataAccessExpired", "", "()Z", "isExpired", "isInstagramToken", "lastRefresh", "getLastRefresh", "getPermissions", "source", "getSource", "()Lcom/facebook/AccessTokenSource;", "token", "getToken", "getUserId", "appendPermissions", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "convertTokenSourceForGraphDomain", "tokenSource", "describeContents", "", "equals", "other", "", "hashCode", "toJSONObject", "Lorg/json/JSONObject;", "toJSONObject$facebook_core_release", "toString", "tokenToString", "writeToParcel", "dest", "flags", "AccessTokenCreationCallback", "AccessTokenRefreshCallback", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AccessToken implements Parcelable {

    @NotNull
    public static final String ACCESS_TOKEN_KEY = "access_token";

    @NotNull
    private static final String APPLICATION_ID_KEY = "application_id";

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";

    @NotNull
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";

    @NotNull
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;

    @NotNull
    private static final Date DEFAULT_EXPIRATION_TIME;

    @NotNull
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";

    @NotNull
    private static final Date DEFAULT_LAST_REFRESH_TIME;

    @NotNull
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";

    @NotNull
    private static final String EXPIRES_AT_KEY = "expires_at";

    @NotNull
    public static final String EXPIRES_IN_KEY = "expires_in";

    @NotNull
    public static final String GRAPH_DOMAIN = "graph_domain";

    @NotNull
    private static final String LAST_REFRESH_KEY = "last_refresh";

    @NotNull
    private static final Date MAX_DATE;

    @NotNull
    private static final String PERMISSIONS_KEY = "permissions";

    @NotNull
    private static final String SOURCE_KEY = "source";

    @NotNull
    private static final String TOKEN_KEY = "token";

    @NotNull
    public static final String USER_ID_KEY = "user_id";

    @NotNull
    private static final String VERSION_KEY = "version";

    @NotNull
    private final String applicationId;

    @NotNull
    private final Date dataAccessExpirationTime;

    @NotNull
    private final Set<String> declinedPermissions;

    @NotNull
    private final Set<String> expiredPermissions;

    @NotNull
    private final Date expires;

    @Nullable
    private final String graphDomain;

    @NotNull
    private final Date lastRefresh;

    @NotNull
    private final Set<String> permissions;

    @NotNull
    private final AccessTokenSource source;

    @NotNull
    private final String token;

    @NotNull
    private final String userId;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "", "onError", "", "error", "Lcom/facebook/FacebookException;", "onSuccess", "token", "Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface AccessTokenCreationCallback {
        void onError(@Nullable FacebookException error);

        void onSuccess(@Nullable AccessToken token);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "", "OnTokenRefreshFailed", "", "exception", "Lcom/facebook/FacebookException;", "OnTokenRefreshed", "accessToken", "Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(@Nullable FacebookException exception);

        void OnTokenRefreshed(@Nullable AccessToken accessToken);
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0002\b J<\u0010!\u001a\u0004\u0018\u00010\b2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0015\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,J\u0017\u0010-\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b.J \u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u0010(\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0007J\u001f\u00105\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b6J\b\u00107\u001a\u000200H\u0007J\n\u00108\u001a\u0004\u0018\u00010\bH\u0007J'\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040#2\u0006\u0010$\u001a\u00020%2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b;J\b\u0010<\u001a\u00020=H\u0007J\b\u0010>\u001a\u00020=H\u0007J\b\u0010?\u001a\u00020=H\u0007J\b\u0010@\u001a\u000200H\u0007J\u0012\u0010@\u001a\u0002002\b\u0010A\u001a\u0004\u0018\u00010BH\u0007J\u0012\u0010C\u001a\u0002002\b\u0010D\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/facebook/AccessToken$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "APPLICATION_ID_KEY", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "CURRENT_JSON_FORMAT", "", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "createExpired", "current", "createExpired$facebook_core_release", "createFromBundle", "requestedPermissions", "", "bundle", "Landroid/os/Bundle;", "source", "expirationBase", "applicationId", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "createFromLegacyCache", "createFromLegacyCache$facebook_core_release", "createFromNativeLinkingIntent", "", "intent", "Landroid/content/Intent;", "accessTokenCallback", "Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "createFromRefresh", "createFromRefresh$facebook_core_release", "expireCurrentAccessToken", "getCurrentAccessToken", "getPermissionsFromBundle", "key", "getPermissionsFromBundle$facebook_core_release", "isCurrentAccessTokenActive", "", "isDataAccessActive", "isLoggedInWithInstagram", "refreshCurrentAccessTokenAsync", "callback", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "setCurrentAccessToken", "accessToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessToken createFromBundle(List<String> requestedPermissions, Bundle bundle, AccessTokenSource source, Date expirationBase, String applicationId) {
            String string;
            String string2 = bundle.getString("access_token");
            if (string2 == null) {
                return null;
            }
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, expirationBase);
            if (bundleLongAsDate == null || (string = bundle.getString(AccessToken.USER_ID_KEY)) == null) {
                return null;
            }
            return new AccessToken(string2, applicationId, string, requestedPermissions, null, null, source, bundleLongAsDate, new Date(), Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L)), null, 1024, null);
        }

        @NotNull
        public final AccessToken createExpired$facebook_core_release(@NotNull AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        @JvmStatic
        @NotNull
        public final AccessToken createFromJSONObject$facebook_core_release(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong(AccessToken.EXPIRES_AT_KEY));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
            Date date2 = new Date(jsonObject.getLong(AccessToken.LAST_REFRESH_KEY));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string);
            String applicationId = jsonObject.getString(AccessToken.APPLICATION_ID_KEY);
            String userId = jsonObject.getString(AccessToken.USER_ID_KEY);
            Date date3 = new Date(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
            String strOptString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Utility utility = Utility.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            List<String> listJsonArrayToStringList = Utility.jsonArrayToStringList(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            return new AccessToken(token, applicationId, userId, listJsonArrayToStringList, Utility.jsonArrayToStringList(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : Utility.jsonArrayToStringList(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
        }

        @JvmStatic
        @Nullable
        public final AccessToken createFromLegacyCache$facebook_core_release(@NotNull Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.DECLINED_PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY);
            LegacyTokenHelper.Companion companion = LegacyTokenHelper.INSTANCE;
            String applicationId = companion.getApplicationId(bundle);
            Utility utility = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(applicationId)) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                applicationId = FacebookSdk.getApplicationId();
            }
            String str = applicationId;
            String token = companion.getToken(bundle);
            if (token == null) {
                return null;
            }
            JSONObject jSONObjectAwaitGetGraphMeRequestWithCache = Utility.awaitGetGraphMeRequestWithCache(token);
            if (jSONObjectAwaitGetGraphMeRequestWithCache == null) {
                string = null;
            } else {
                try {
                    string = jSONObjectAwaitGetGraphMeRequestWithCache.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(token, str, string, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, companion.getSource(bundle), companion.getExpirationDate(bundle), companion.getLastRefreshDate(bundle), null, null, 1024, null);
        }

        @JvmStatic
        public final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull final String applicationId, @NotNull final AccessTokenCreationCallback accessTokenCallback) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(accessTokenCallback, "accessTokenCallback");
            if (intent.getExtras() == null) {
                accessTokenCallback.onError(new FacebookException("No extras found on intent"));
                return;
            }
            final Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string != null) {
                if (!(string.length() == 0)) {
                    String string2 = bundle.getString(AccessToken.USER_ID_KEY);
                    if (string2 != null) {
                        if (!(string2.length() == 0)) {
                            accessTokenCallback.onSuccess(createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
                            return;
                        }
                    }
                    Utility utility = Utility.INSTANCE;
                    Utility.getGraphMeRequestWithCacheAsync(string, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.AccessToken$Companion$createFromNativeLinkingIntent$1
                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onFailure(@Nullable FacebookException error) {
                            accessTokenCallback.onError(error);
                        }

                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onSuccess(@Nullable JSONObject userInfo) {
                            String string3;
                            if (userInfo == null) {
                                string3 = null;
                            } else {
                                try {
                                    string3 = userInfo.getString("id");
                                } catch (Exception unused) {
                                    accessTokenCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
                                    return;
                                }
                            }
                            if (string3 == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            bundle.putString(AccessToken.USER_ID_KEY, string3);
                            accessTokenCallback.onSuccess(AccessToken.INSTANCE.createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
                        }
                    });
                    return;
                }
            }
            accessTokenCallback.onError(new FacebookException("No access token found on intent"));
        }

        @JvmStatic
        @SuppressLint({"FieldGetter"})
        @Nullable
        public final AccessToken createFromRefresh$facebook_core_release(@NotNull AccessToken current, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_WEB && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                throw new FacebookException(Intrinsics.stringPlus("Invalid token source: ", current.getSource()));
            }
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, new Date(0L));
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString("graph_domain");
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            if (Utility.isNullOrEmpty(string)) {
                return null;
            }
            return new AccessToken(string, current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), bundleLongAsDate, new Date(), bundleLongAsDate2, string2);
        }

        @JvmStatic
        public final void expireCurrentAccessToken() {
            AccessToken currentAccessToken = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            if (currentAccessToken != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(currentAccessToken));
            }
        }

        @JvmStatic
        @Nullable
        public final AccessToken getCurrentAccessToken() {
            return AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
        }

        @JvmStatic
        @NotNull
        public final List<String> getPermissionsFromBundle$facebook_core_release(@NotNull Bundle bundle, @Nullable String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
            if (stringArrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return listUnmodifiableList;
        }

        @JvmStatic
        public final boolean isCurrentAccessTokenActive() {
            AccessToken currentAccessToken = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessToken == null || currentAccessToken.isExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isDataAccessActive() {
            AccessToken currentAccessToken = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessToken == null || currentAccessToken.isDataAccessExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isLoggedInWithInstagram() {
            AccessToken currentAccessToken = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessToken == null || currentAccessToken.isExpired() || !currentAccessToken.isInstagramToken()) ? false : true;
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync() {
            AccessTokenManager.INSTANCE.getInstance().refreshCurrentAccessToken(null);
        }

        @JvmStatic
        public final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
            AccessTokenManager.INSTANCE.getInstance().setCurrentAccessToken(accessToken);
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync(@Nullable AccessTokenRefreshCallback callback) {
            AccessTokenManager.INSTANCE.getInstance().refreshCurrentAccessToken(callback);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.valuesCustom().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new Parcelable.Creator<AccessToken>() { // from class: com.facebook.AccessToken$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public AccessToken createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new AccessToken(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public AccessToken[] newArray(int size) {
                return new AccessToken[size];
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AccessToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null);
        OooO00o.OooO0O0(str, "accessToken", str2, "applicationId", str3, "userId");
    }

    private final void appendPermissions(StringBuilder builder) {
        builder.append(" permissions:");
        builder.append("[");
        builder.append(TextUtils.join(", ", this.permissions));
        builder.append("]");
    }

    private final AccessTokenSource convertTokenSourceForGraphDomain(AccessTokenSource tokenSource, String graphDomain) {
        if (graphDomain == null || !graphDomain.equals(FacebookSdk.INSTAGRAM)) {
            return tokenSource;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[tokenSource.ordinal()];
        if (i == 1) {
            return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        if (i != 2) {
            return i != 3 ? tokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW;
        }
        return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    @JvmStatic
    public static final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull String str, @NotNull AccessTokenCreationCallback accessTokenCreationCallback) {
        INSTANCE.createFromNativeLinkingIntent(intent, str, accessTokenCreationCallback);
    }

    @JvmStatic
    public static final void expireCurrentAccessToken() {
        INSTANCE.expireCurrentAccessToken();
    }

    @JvmStatic
    @Nullable
    public static final AccessToken getCurrentAccessToken() {
        return INSTANCE.getCurrentAccessToken();
    }

    @JvmStatic
    public static final boolean isCurrentAccessTokenActive() {
        return INSTANCE.isCurrentAccessTokenActive();
    }

    @JvmStatic
    public static final boolean isDataAccessActive() {
        return INSTANCE.isDataAccessActive();
    }

    @JvmStatic
    public static final boolean isLoggedInWithInstagram() {
        return INSTANCE.isLoggedInWithInstagram();
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync() {
        INSTANCE.refreshCurrentAccessTokenAsync();
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync(@Nullable AccessTokenRefreshCallback accessTokenRefreshCallback) {
        INSTANCE.refreshCurrentAccessTokenAsync(accessTokenRefreshCallback);
    }

    @JvmStatic
    public static final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
        INSTANCE.setCurrentAccessToken(accessToken);
    }

    private final String tokenToString() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        boolean zAreEqual;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        if (Intrinsics.areEqual(this.expires, accessToken.expires) && Intrinsics.areEqual(this.permissions, accessToken.permissions) && Intrinsics.areEqual(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.areEqual(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.areEqual(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.areEqual(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.areEqual(this.applicationId, accessToken.applicationId) && Intrinsics.areEqual(this.userId, accessToken.userId) && Intrinsics.areEqual(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                zAreEqual = str2 == null;
            } else {
                zAreEqual = Intrinsics.areEqual(str, str2);
            }
            if (zAreEqual) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    @NotNull
    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    @NotNull
    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    @NotNull
    public final Date getExpires() {
        return this.expires;
    }

    @Nullable
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    @NotNull
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    @NotNull
    public final Set<String> getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final AccessTokenSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.dataAccessExpirationTime.hashCode() + o0O0O00.OooO0O0(this.userId, o0O0O00.OooO0O0(this.applicationId, (this.lastRefresh.hashCode() + ((this.source.hashCode() + o0O0O00.OooO0O0(this.token, (this.expiredPermissions.hashCode() + ((this.declinedPermissions.hashCode() + ((this.permissions.hashCode() + ((this.expires.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.graphDomain;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        return str != null && str.equals(FacebookSdk.INSTAGRAM);
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put(USER_ID_KEY, this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0O0 = o00O0.OooO0O0("{AccessToken", " token:");
        sbOooO0O0.append(tokenToString());
        appendPermissions(sbOooO0O0);
        sbOooO0O0.append("}");
        String string = sbOooO0O0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    @JvmOverloads
    public AccessToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str4) {
        String str5 = str4;
        OooO00o.OooO0O0(str, "accessToken", str2, "applicationId", str3, "userId");
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(str, "accessToken");
        Validate.notEmpty(str2, "applicationId");
        Validate.notEmpty(str3, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = str;
        this.source = convertTokenSourceForGraphDomain(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str5);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str5 == null ? DEFAULT_GRAPH_DOMAIN : str5;
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    public AccessToken(@NotNull Parcel parcel) {
        AccessTokenSource accessTokenSourceValueOf;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = setUnmodifiableSet3;
        String string = parcel.readString();
        Validate validate = Validate.INSTANCE;
        this.token = Validate.notNullOrEmpty(string, "token");
        String string2 = parcel.readString();
        if (string2 != null) {
            accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
        } else {
            accessTokenSourceValueOf = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSourceValueOf;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
        this.userId = Validate.notNullOrEmpty(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
