package com.amazonaws.auth;

import android.content.Context;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.model.NotAuthorizedException;
import com.amazonaws.util.VersionInfoUtils;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CognitoCachingCredentialsProvider extends CognitoCredentialsProvider {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f10336OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final String f10337OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Log f10338OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f10339OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f10340OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final String f10341OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f10342OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f10343OooOo0o;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public AWSKeyValueStore f10344OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final IdentityChangedListener f10345OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f10346OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f10347OooOOOO;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CognitoCachingCredentialsProvider.class.getName());
        sb.append("/");
        String str = VersionInfoUtils.f11191OooO00o;
        sb.append("2.18.0");
        f10336OooOOOo = sb.toString();
        f10338OooOOo0 = LogFactory.OooO00o(CognitoCachingCredentialsProvider.class);
        f10337OooOOo = "com.amazonaws.android.auth";
        f10339OooOOoo = "identityId";
        f10341OooOo00 = "accessKey";
        f10340OooOo0 = "secretKey";
        f10342OooOo0O = "sessionToken";
        f10343OooOo0o = "expirationDate";
    }

    public CognitoCachingCredentialsProvider(Context context, AWSCognitoIdentityProvider aWSCognitoIdentityProvider, Regions regions) {
        super(aWSCognitoIdentityProvider, regions);
        IdentityChangedListener identityChangedListener = new IdentityChangedListener() { // from class: com.amazonaws.auth.CognitoCachingCredentialsProvider.1
            @Override // com.amazonaws.auth.IdentityChangedListener
            public final void identityChanged(String str) {
                Log log = CognitoCachingCredentialsProvider.f10338OooOOo0;
                log.OooO00o("Identity id is changed");
                CognitoCachingCredentialsProvider.this.OooOOOO(str);
                CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider = CognitoCachingCredentialsProvider.this;
                cognitoCachingCredentialsProvider.f10359OooOO0.writeLock().lock();
                try {
                    cognitoCachingCredentialsProvider.f10359OooOO0.writeLock().lock();
                    try {
                        cognitoCachingCredentialsProvider.f10354OooO0Oo = null;
                        cognitoCachingCredentialsProvider.f10356OooO0o0 = null;
                        cognitoCachingCredentialsProvider.f10359OooOO0.writeLock().unlock();
                        log.OooO00o("Clearing credentials from SharedPreferences");
                        cognitoCachingCredentialsProvider.f10344OooOO0o.OooOO0O(cognitoCachingCredentialsProvider.OooOOO0(CognitoCachingCredentialsProvider.f10341OooOo00));
                        cognitoCachingCredentialsProvider.f10344OooOO0o.OooOO0O(cognitoCachingCredentialsProvider.OooOOO0(CognitoCachingCredentialsProvider.f10340OooOo0));
                        cognitoCachingCredentialsProvider.f10344OooOO0o.OooOO0O(cognitoCachingCredentialsProvider.OooOOO0(CognitoCachingCredentialsProvider.f10342OooOo0O));
                        cognitoCachingCredentialsProvider.f10344OooOO0o.OooOO0O(cognitoCachingCredentialsProvider.OooOOO0(CognitoCachingCredentialsProvider.f10343OooOo0o));
                    } finally {
                        cognitoCachingCredentialsProvider.f10359OooOO0.writeLock().unlock();
                    }
                } catch (Throwable th) {
                    cognitoCachingCredentialsProvider.f10359OooOO0.writeLock().unlock();
                    throw th;
                }
            }
        };
        this.f10345OooOOO = identityChangedListener;
        this.f10347OooOOOO = true;
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        AWSKeyValueStore aWSKeyValueStore = new AWSKeyValueStore(context, f10337OooOOo, this.f10347OooOOOO);
        this.f10344OooOO0o = aWSKeyValueStore;
        String str = f10339OooOOoo;
        if (aWSKeyValueStore.OooO00o(str)) {
            f10338OooOOo0.OooO0o("Identity id without namespace is detected. It will be saved under new namespace.");
            String strOooO0Oo = this.f10344OooOO0o.OooO0Oo(str);
            AWSKeyValueStore aWSKeyValueStore2 = this.f10344OooOO0o;
            synchronized (aWSKeyValueStore2) {
                aWSKeyValueStore2.f10428OooO00o.clear();
                if (aWSKeyValueStore2.f10429OooO0O0) {
                    aWSKeyValueStore2.f10431OooO0Oo.edit().clear().apply();
                }
            }
            this.f10344OooOO0o.OooOO0(OooOOO0(str), strOooO0Oo);
        }
        this.f10346OooOOO0 = OooOO0O();
        OooOO0o();
        this.f10353OooO0OO.registerIdentityChangedListener(identityChangedListener);
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        BasicSessionCredentials basicSessionCredentials;
        this.f10359OooOO0.writeLock().lock();
        try {
            try {
                if (this.f10354OooO0Oo == null) {
                    OooOO0o();
                }
                if (this.f10356OooO0o0 == null || OooO0o0()) {
                    f10338OooOOo0.OooO00o("Making a network call to fetch credentials.");
                    super.OooO0O0();
                    Date date = this.f10356OooO0o0;
                    if (date != null) {
                        OooOOO(this.f10354OooO0Oo, date.getTime());
                    }
                    basicSessionCredentials = this.f10354OooO0Oo;
                } else {
                    basicSessionCredentials = this.f10354OooO0Oo;
                }
            } catch (NotAuthorizedException e) {
                f10338OooOOo0.OooO0oo("Failure to get credentials", e);
                if (OooO0Oo() == null) {
                    throw e;
                }
                OooO0oo(null);
                super.OooO0O0();
                basicSessionCredentials = this.f10354OooO0Oo;
            }
            this.f10359OooOO0.writeLock().unlock();
            return basicSessionCredentials;
        } catch (Throwable th) {
            this.f10359OooOO0.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.amazonaws.auth.CognitoCredentialsProvider
    public final String OooO0OO() {
        String strOooOO0O = OooOO0O();
        this.f10346OooOOO0 = strOooOO0O;
        if (strOooOO0O == null) {
            String identityId = this.f10353OooO0OO.getIdentityId();
            this.f10346OooOOO0 = identityId;
            OooOOOO(identityId);
        }
        return this.f10346OooOOO0;
    }

    public final String OooOO0O() {
        String strOooO0Oo = this.f10344OooOO0o.OooO0Oo(OooOOO0(f10339OooOOoo));
        if (strOooO0Oo != null && this.f10346OooOOO0 == null) {
            OooO0oo(strOooO0Oo);
        }
        return strOooO0Oo;
    }

    public final void OooOO0o() {
        boolean z;
        Log log = f10338OooOOo0;
        log.OooO00o("Loading credentials from SharedPreferences");
        String strOooO0Oo = this.f10344OooOO0o.OooO0Oo(OooOOO0(f10343OooOo0o));
        if (strOooO0Oo == null) {
            this.f10356OooO0o0 = null;
            return;
        }
        try {
            this.f10356OooO0o0 = new Date(Long.parseLong(strOooO0Oo));
            AWSKeyValueStore aWSKeyValueStore = this.f10344OooOO0o;
            String str = f10341OooOo00;
            boolean zOooO00o = aWSKeyValueStore.OooO00o(OooOOO0(str));
            AWSKeyValueStore aWSKeyValueStore2 = this.f10344OooOO0o;
            String str2 = f10340OooOo0;
            boolean zOooO00o2 = aWSKeyValueStore2.OooO00o(OooOOO0(str2));
            AWSKeyValueStore aWSKeyValueStore3 = this.f10344OooOO0o;
            String str3 = f10342OooOo0O;
            boolean zOooO00o3 = aWSKeyValueStore3.OooO00o(OooOOO0(str3));
            if (zOooO00o || zOooO00o2 || zOooO00o3) {
                log.OooO00o("No valid credentials found in SharedPreferences");
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f10356OooO0o0 = null;
                return;
            }
            String strOooO0Oo2 = this.f10344OooOO0o.OooO0Oo(OooOOO0(str));
            String strOooO0Oo3 = this.f10344OooOO0o.OooO0Oo(OooOOO0(str2));
            String strOooO0Oo4 = this.f10344OooOO0o.OooO0Oo(OooOOO0(str3));
            if (strOooO0Oo2 != null && strOooO0Oo3 != null && strOooO0Oo4 != null) {
                this.f10354OooO0Oo = new BasicSessionCredentials(strOooO0Oo2, strOooO0Oo3, strOooO0Oo4);
            } else {
                log.OooO00o("No valid credentials found in SharedPreferences");
                this.f10356OooO0o0 = null;
            }
        } catch (NumberFormatException unused) {
            this.f10356OooO0o0 = null;
        }
    }

    public final void OooOOO(AWSSessionCredentials aWSSessionCredentials, long j) {
        f10338OooOOo0.OooO00o("Saving credentials to SharedPreferences");
        if (aWSSessionCredentials != null) {
            this.f10344OooOO0o.OooOO0(OooOOO0(f10341OooOo00), aWSSessionCredentials.OooO0O0());
            this.f10344OooOO0o.OooOO0(OooOOO0(f10340OooOo0), aWSSessionCredentials.OooO0OO());
            this.f10344OooOO0o.OooOO0(OooOOO0(f10342OooOo0O), aWSSessionCredentials.OooO00o());
            this.f10344OooOO0o.OooOO0(OooOOO0(f10343OooOo0o), String.valueOf(j));
        }
    }

    public final String OooOOO0(String str) {
        return this.f10353OooO0OO.getIdentityPoolId() + "." + str;
    }

    public final void OooOOOO(String str) {
        f10338OooOOo0.OooO00o("Saving identity id to SharedPreferences");
        this.f10346OooOOO0 = str;
        this.f10344OooOO0o.OooOO0(OooOOO0(f10339OooOOoo), str);
    }
}
