package com.amazonaws.auth;

import android.content.Context;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.model.NotAuthorizedException;
import com.amazonaws.util.VersionInfoUtils;
import java.util.Date;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p138o00OOoo.OooO;

/* JADX INFO: loaded from: classes2.dex */
public class CognitoCachingCredentialsProvider extends CognitoCredentialsProvider {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f9032OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Log f9033OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final String f9034OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final String f9035OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f9036OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f9037OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final String f9038OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f9039OooOo0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public AWSKeyValueStore f9040OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final IdentityChangedListener f9041OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f9042OooOOO0;

    static {
        String name = CognitoCachingCredentialsProvider.class.getName();
        String str = VersionInfoUtils.f9595OooO00o;
        f9032OooOOOO = name.concat("/2.18.0");
        f9033OooOOOo = LogFactory.OooO00o(CognitoCachingCredentialsProvider.class);
        f9035OooOOo0 = "com.amazonaws.android.auth";
        f9034OooOOo = "identityId";
        f9036OooOOoo = "accessKey";
        f9038OooOo00 = "secretKey";
        f9037OooOo0 = "sessionToken";
        f9039OooOo0O = "expirationDate";
    }

    public CognitoCachingCredentialsProvider(Context context, OooO.OooO00o oooO00o, Regions regions) {
        super(oooO00o, regions);
        IdentityChangedListener identityChangedListener = new IdentityChangedListener() { // from class: com.amazonaws.auth.CognitoCachingCredentialsProvider.1
            @Override // com.amazonaws.auth.IdentityChangedListener
            public final void OooO00o(String str) {
                Log log = CognitoCachingCredentialsProvider.f9033OooOOOo;
                log.OooO0oO("Identity id is changed");
                CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider = CognitoCachingCredentialsProvider.this;
                cognitoCachingCredentialsProvider.OooOO0(str);
                ReentrantReadWriteLock reentrantReadWriteLock = cognitoCachingCredentialsProvider.f9054OooOO0;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    reentrantReadWriteLock.writeLock().lock();
                    try {
                        cognitoCachingCredentialsProvider.f9049OooO0Oo = null;
                        cognitoCachingCredentialsProvider.f9051OooO0o0 = null;
                        reentrantReadWriteLock.writeLock().unlock();
                        log.OooO0oO("Clearing credentials from SharedPreferences");
                        cognitoCachingCredentialsProvider.f9040OooOO0o.OooO(cognitoCachingCredentialsProvider.OooO0oo(CognitoCachingCredentialsProvider.f9036OooOOoo));
                        cognitoCachingCredentialsProvider.f9040OooOO0o.OooO(cognitoCachingCredentialsProvider.OooO0oo(CognitoCachingCredentialsProvider.f9038OooOo00));
                        cognitoCachingCredentialsProvider.f9040OooOO0o.OooO(cognitoCachingCredentialsProvider.OooO0oo(CognitoCachingCredentialsProvider.f9037OooOo0));
                        cognitoCachingCredentialsProvider.f9040OooOO0o.OooO(cognitoCachingCredentialsProvider.OooO0oo(CognitoCachingCredentialsProvider.f9039OooOo0O));
                    } finally {
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
        };
        this.f9041OooOOO = identityChangedListener;
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        AWSKeyValueStore aWSKeyValueStore = new AWSKeyValueStore(context, f9035OooOOo0, true);
        this.f9040OooOO0o = aWSKeyValueStore;
        String str = f9034OooOOo;
        if (aWSKeyValueStore.OooO00o(str)) {
            f9033OooOOOo.OooO0oo("Identity id without namespace is detected. It will be saved under new namespace.");
            String strOooO0o0 = this.f9040OooOO0o.OooO0o0(str);
            AWSKeyValueStore aWSKeyValueStore2 = this.f9040OooOO0o;
            synchronized (aWSKeyValueStore2) {
                aWSKeyValueStore2.f9122OooO00o.clear();
                if (aWSKeyValueStore2.f9123OooO0O0) {
                    aWSKeyValueStore2.f9124OooO0OO.edit().clear().apply();
                }
            }
            this.f9040OooOO0o.OooO0oo(OooO0oo(str), strOooO0o0);
        }
        String strOooO0o1 = this.f9040OooOO0o.OooO0o0(OooO0oo(str));
        if (strOooO0o1 != null && this.f9042OooOOO0 == null) {
            this.f9048OooO0OO.OooO00o(strOooO0o1);
        }
        this.f9042OooOOO0 = strOooO0o1;
        OooO0oO();
        this.f9048OooO0OO.OooO0o0(identityChangedListener);
    }

    public final void OooO(AWSSessionCredentials aWSSessionCredentials, long j) {
        f9033OooOOOo.OooO0oO("Saving credentials to SharedPreferences");
        if (aWSSessionCredentials != null) {
            this.f9040OooOO0o.OooO0oo(OooO0oo(f9036OooOOoo), aWSSessionCredentials.OooO00o());
            this.f9040OooOO0o.OooO0oo(OooO0oo(f9038OooOo00), aWSSessionCredentials.OooO0OO());
            this.f9040OooOO0o.OooO0oo(OooO0oo(f9037OooOo0), aWSSessionCredentials.OooO0O0());
            this.f9040OooOO0o.OooO0oo(OooO0oo(f9039OooOo0O), String.valueOf(j));
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        BasicSessionCredentials basicSessionCredentials;
        AWSCognitoIdentityProvider aWSCognitoIdentityProvider = this.f9048OooO0OO;
        Log log = f9033OooOOOo;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f9054OooOO0;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                if (this.f9049OooO0Oo == null) {
                    OooO0oO();
                }
                if (this.f9051OooO0o0 == null || OooO0Oo()) {
                    log.OooO0oO("Making a network call to fetch credentials.");
                    super.OooO0O0();
                    Date date = this.f9051OooO0o0;
                    if (date != null) {
                        OooO(this.f9049OooO0Oo, date.getTime());
                    }
                    basicSessionCredentials = this.f9049OooO0Oo;
                } else {
                    basicSessionCredentials = this.f9049OooO0Oo;
                }
            } catch (NotAuthorizedException e) {
                log.OooO0Oo("Failure to get credentials", e);
                if (aWSCognitoIdentityProvider.OooO0oO() == null) {
                    throw e;
                }
                aWSCognitoIdentityProvider.OooO00o(null);
                super.OooO0O0();
                basicSessionCredentials = this.f9049OooO0Oo;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return basicSessionCredentials;
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.amazonaws.auth.CognitoCredentialsProvider
    public final String OooO0OO() {
        String strOooO0o0 = this.f9040OooOO0o.OooO0o0(OooO0oo(f9034OooOOo));
        AWSCognitoIdentityProvider aWSCognitoIdentityProvider = this.f9048OooO0OO;
        if (strOooO0o0 != null && this.f9042OooOOO0 == null) {
            aWSCognitoIdentityProvider.OooO00o(strOooO0o0);
        }
        this.f9042OooOOO0 = strOooO0o0;
        if (strOooO0o0 == null) {
            String strOooO0o = aWSCognitoIdentityProvider.OooO0o();
            this.f9042OooOOO0 = strOooO0o;
            OooOO0(strOooO0o);
        }
        return this.f9042OooOOO0;
    }

    public final void OooO0oO() {
        boolean z;
        Log log = f9033OooOOOo;
        log.OooO0oO("Loading credentials from SharedPreferences");
        String strOooO0o0 = this.f9040OooOO0o.OooO0o0(OooO0oo(f9039OooOo0O));
        if (strOooO0o0 == null) {
            this.f9051OooO0o0 = null;
            return;
        }
        try {
            this.f9051OooO0o0 = new Date(Long.parseLong(strOooO0o0));
            AWSKeyValueStore aWSKeyValueStore = this.f9040OooOO0o;
            String str = f9036OooOOoo;
            boolean zOooO00o = aWSKeyValueStore.OooO00o(OooO0oo(str));
            AWSKeyValueStore aWSKeyValueStore2 = this.f9040OooOO0o;
            String str2 = f9038OooOo00;
            boolean zOooO00o2 = aWSKeyValueStore2.OooO00o(OooO0oo(str2));
            AWSKeyValueStore aWSKeyValueStore3 = this.f9040OooOO0o;
            String str3 = f9037OooOo0;
            boolean zOooO00o3 = aWSKeyValueStore3.OooO00o(OooO0oo(str3));
            if (zOooO00o || zOooO00o2 || zOooO00o3) {
                log.OooO0oO("No valid credentials found in SharedPreferences");
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f9051OooO0o0 = null;
                return;
            }
            String strOooO0o1 = this.f9040OooOO0o.OooO0o0(OooO0oo(str));
            String strOooO0o2 = this.f9040OooOO0o.OooO0o0(OooO0oo(str2));
            String strOooO0o3 = this.f9040OooOO0o.OooO0o0(OooO0oo(str3));
            if (strOooO0o1 != null && strOooO0o2 != null && strOooO0o3 != null) {
                this.f9049OooO0Oo = new BasicSessionCredentials(strOooO0o1, strOooO0o2, strOooO0o3);
            } else {
                log.OooO0oO("No valid credentials found in SharedPreferences");
                this.f9051OooO0o0 = null;
            }
        } catch (NumberFormatException unused) {
            this.f9051OooO0o0 = null;
        }
    }

    public final String OooO0oo(String str) {
        return this.f9048OooO0OO.OooO0Oo() + "." + str;
    }

    public final void OooOO0(String str) {
        f9033OooOOOo.OooO0oO("Saving identity id to SharedPreferences");
        this.f9042OooOOO0 = str;
        this.f9040OooOO0o.OooO0oo(OooO0oo(f9034OooOOo), str);
    }
}
