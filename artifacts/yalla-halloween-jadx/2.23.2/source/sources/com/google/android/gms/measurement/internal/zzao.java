package com.google.android.gms.measurement.internal;

import android.accounts.AccountManager;
import androidx.annotation.WorkerThread;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p031OoooO0.o0OoOo0;
import p271o00ooooo.oO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzao extends oO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f15404OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f15405OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Boolean f15406OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AccountManager f15407OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f15408OooO0oO;

    @Override // p271o00ooooo.oO
    public final boolean OooO0O0() {
        Calendar calendar = Calendar.getInstance();
        this.f15404OooO0OO = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f15405OooO0Oo = o0OoOo0.OooO0O0(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    @WorkerThread
    public final long OooO0Oo() {
        zzg();
        return this.f15408OooO0oO;
    }

    public final long zzb() {
        OooO0OO();
        return this.f15404OooO0OO;
    }

    public final String zzc() {
        OooO0OO();
        return this.f15405OooO0Oo;
    }
}
