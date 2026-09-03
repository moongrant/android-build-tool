package com.google.android.gms.measurement.internal;

import OooO0o.OooO0OO;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.AccountType;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o000O000.OooO00o;
import o0OO0OoO.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaq extends o000OO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f16084OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f16085OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Boolean f16086OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AccountManager f16087OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f16088OooO0oO;

    public zzaq(zzfy zzfyVar) {
        super(zzfyVar);
    }

    @Override // o0OO0OoO.o000OO0O
    public final boolean OooO0O0() {
        Calendar calendar = Calendar.getInstance();
        this.f16084OooO0OO = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f16085OooO0Oo = OooO0OO.OooO00o(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    @WorkerThread
    public final boolean OooO0o() {
        zzg();
        long jCurrentTimeMillis = this.f37615OooO00o.zzav().currentTimeMillis();
        if (jCurrentTimeMillis - this.f16088OooO0oO > 86400000) {
            this.f16086OooO0o = null;
        }
        Boolean bool = this.f16086OooO0o;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (OooO00o.OooO00o(this.f37615OooO00o.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f37615OooO00o.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
            this.f16088OooO0oO = jCurrentTimeMillis;
            this.f16086OooO0o = Boolean.FALSE;
            return false;
        }
        if (this.f16087OooO0o0 == null) {
            this.f16087OooO0o0 = AccountManager.get(this.f37615OooO00o.zzau());
        }
        try {
            Account[] result = this.f16087OooO0o0.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
            if (result != null && result.length > 0) {
                this.f16086OooO0o = Boolean.TRUE;
                this.f16088OooO0oO = jCurrentTimeMillis;
                return true;
            }
            Account[] result2 = this.f16087OooO0o0.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f16086OooO0o = Boolean.TRUE;
                this.f16088OooO0oO = jCurrentTimeMillis;
                return true;
            }
            this.f16088OooO0oO = jCurrentTimeMillis;
            this.f16086OooO0o = Boolean.FALSE;
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f37615OooO00o.zzay().zzh().zzb("Exception checking account types", e);
        }
    }

    @WorkerThread
    public final long OooO0o0() {
        zzg();
        return this.f16088OooO0oO;
    }

    public final long zzb() {
        OooO0OO();
        return this.f16084OooO0OO;
    }

    public final String zzc() {
        OooO0OO();
        return this.f16085OooO0Oo;
    }
}
