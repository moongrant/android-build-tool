package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Map;
import p127o00O0oo.o0O0O00;
import p129o00O0ooo.o0000;
import p532o0o0Oo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends ContextWrapper {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @VisibleForTesting
    public static final OooO0O0 f9837OooOO0O = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f9838OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000 f9839OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000 f9840OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OOO00.OooOO0 f9841OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO.OooO00o f9842OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Class<?>, OooOo<?, ?>> f9843OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o00OO.OooO<Object>> f9844OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0O00 f9845OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0 f9846OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public o00OO.OooOO0 f9847OooOO0;

    public OooO(@NonNull Context context, @NonNull o0000 o0000Var, @NonNull OooOOO0 oooOOO0, @NonNull o00OOO00.OooOO0 oooOO1, @NonNull OooO0o.OooO00o oooO00o, @NonNull p188o00o0O.OooOO0 oooOO2, @NonNull List list, @NonNull o0O0O00 o0o0o00, @NonNull OooOO0 oooOO3, int i) {
        super(context.getApplicationContext());
        this.f9839OooO00o = o0000Var;
        this.f9841OooO0OO = oooOO1;
        this.f9842OooO0Oo = oooO00o;
        this.f9844OooO0o0 = list;
        this.f9843OooO0o = oooOO2;
        this.f9845OooO0oO = o0o0o00;
        this.f9846OooO0oo = oooOO3;
        this.f9838OooO = i;
        this.f9840OooO0O0 = new o00000(oooOOO0);
    }

    public final synchronized o00OO.OooOO0 OooO00o() {
        if (this.f9847OooOO0 == null) {
            ((OooO0o.OooO00o) this.f9842OooO0Oo).getClass();
            o00OO.OooOO0 oooOO1 = new o00OO.OooOO0();
            oooOO1.f37011OooOo0o = true;
            this.f9847OooOO0 = oooOO1;
        }
        return this.f9847OooOO0;
    }

    @NonNull
    public final Registry OooO0O0() {
        return (Registry) this.f9840OooO0O0.get();
    }
}
