package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Long f37503OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f37504OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f37505OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f37506OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f37507OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f37508OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f37509OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f37510OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Long f37511OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Long f37512OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Boolean f37513OooOO0O;

    public OooOOOO(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        this.f37504OooO00o = str;
        this.f37505OooO0O0 = str2;
        this.f37506OooO0OO = j;
        this.f37507OooO0Oo = j2;
        this.f37509OooO0o0 = j3;
        this.f37508OooO0o = j4;
        this.f37510OooO0oO = j5;
        this.f37511OooO0oo = l;
        this.f37503OooO = l2;
        this.f37512OooOO0 = l3;
        this.f37513OooOO0O = bool;
    }

    public final OooOOOO OooO00o(Long l, Long l2, Boolean bool) {
        return new OooOOOO(this.f37504OooO00o, this.f37505OooO0O0, this.f37506OooO0OO, this.f37507OooO0Oo, this.f37509OooO0o0, this.f37508OooO0o, this.f37510OooO0oO, this.f37511OooO0oo, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final OooOOOO OooO0O0(long j, long j2) {
        return new OooOOOO(this.f37504OooO00o, this.f37505OooO0O0, this.f37506OooO0OO, this.f37507OooO0Oo, this.f37509OooO0o0, this.f37508OooO0o, j, Long.valueOf(j2), this.f37503OooO, this.f37512OooOO0, this.f37513OooOO0O);
    }

    public final OooOOOO OooO0OO(long j) {
        return new OooOOOO(this.f37504OooO00o, this.f37505OooO0O0, this.f37506OooO0OO, this.f37507OooO0Oo, this.f37509OooO0o0, j, this.f37510OooO0oO, this.f37511OooO0oo, this.f37503OooO, this.f37512OooOO0, this.f37513OooOO0O);
    }
}
