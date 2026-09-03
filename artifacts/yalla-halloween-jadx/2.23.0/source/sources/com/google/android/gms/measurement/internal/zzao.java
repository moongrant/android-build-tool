package com.google.android.gms.measurement.internal;

import android.accounts.AccountManager;
import androidx.annotation.WorkerThread;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p031OoooO0.o0OoOo0;
import p269o00ooooo.oO000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzao extends oO000Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f15880OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f15881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Boolean f15882OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AccountManager f15883OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f15884OooO0oO;

    @Override // p269o00ooooo.oO000Oo
    public final boolean OooO0O0() {
        Calendar calendar = Calendar.getInstance();
        this.f15880OooO0OO = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f15881OooO0Oo = o0OoOo0.OooO00o(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    @WorkerThread
    public final long OooO0Oo() {
        zzg();
        return this.f15884OooO0oO;
    }

    public final long zzb() {
        OooO0OO();
        return this.f15880OooO0OO;
    }

    public final String zzc() {
        OooO0OO();
        return this.f15881OooO0Oo;
    }
}
