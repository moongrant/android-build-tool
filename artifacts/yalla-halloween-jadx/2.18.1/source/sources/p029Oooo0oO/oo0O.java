package p029Oooo0oO;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o0000O0O.OooOo;
import o0000O0O.o000oOoO;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0000O0O;

/* JADX INFO: loaded from: classes.dex */
public final class oo0O implements o00O0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f2480OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f2481OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f2482OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f2483OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Object f2484OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f2485OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f2486OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f2487OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f2488OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f2489OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f2490OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f2491OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o00O000 f2492OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final List<o00OO0OO> f2493OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f2494OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f2495OooOOOo;

    public oo0O(long j, long j2, int i, Object obj, int i2, int i3, long j3, int i4, int i5, int i6, int i7, boolean z, List list, o00O000 o00o001, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f2481OooO00o = j;
        this.f2482OooO0O0 = j2;
        this.f2483OooO0OO = i;
        this.f2484OooO0Oo = obj;
        this.f2486OooO0o0 = i2;
        this.f2485OooO0o = i3;
        this.f2487OooO0oO = j3;
        this.f2488OooO0oo = i4;
        this.f2480OooO = i5;
        this.f2489OooOO0 = i6;
        this.f2490OooOO0O = i7;
        this.f2491OooOO0o = z;
        this.f2493OooOOO0 = list;
        this.f2492OooOOO = o00o001;
        this.f2494OooOOOO = j4;
        int iOooO0o = OooO0o();
        boolean z2 = false;
        for (int i8 = 0; i8 < iOooO0o; i8++) {
            if (OooO0OO(i8) != null) {
                z2 = true;
                break;
            }
        }
        this.f2495OooOOOo = z2;
    }

    @Override // p029Oooo0oO.o00O0000
    public final int OooO00o() {
        return this.f2486OooO0o0;
    }

    @Override // p029Oooo0oO.o00O0000
    public final int OooO0O0() {
        return this.f2485OooO0o;
    }

    @Nullable
    public final o0000O0O<OooOo> OooO0OO(int i) {
        Object obj = this.f2493OooOOO0.get(i).f2349OooO0O0;
        if (obj instanceof o0000O0O) {
            return (o0000O0O) obj;
        }
        return null;
    }

    public final int OooO0Oo(int i) {
        o000O000 o000o001 = this.f2493OooOOO0.get(i).f2348OooO00o;
        return this.f2491OooOO0o ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o;
    }

    public final int OooO0o() {
        return this.f2493OooOOO0.size();
    }

    public final int OooO0o0() {
        return this.f2480OooO + (this.f2491OooOO0o ? o000oOoO.OooO0O0(this.f2487OooO0oO) : (int) (this.f2487OooO0oO >> 32));
    }

    @Override // p029Oooo0oO.o00O0000
    public final int getIndex() {
        return this.f2483OooO0OO;
    }
}
