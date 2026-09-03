package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Map;
import p144o00Oo.o000O0;
import p170o00Ooo0o.o00O0O;
import p170o00Ooo0o.o0OoOo0;
import p172o00OooO0.o00000O0;
import p174o00OooOo.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends ContextWrapper {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @VisibleForTesting
    public static final OooO0O0 f12928OooOO0O = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f12929OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p156o00OoO00.OooO0o f12930OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0O0 f12931OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000O0 f12932OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO.OooO00o f12933OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Class<?>, OooOo<?, ?>> f12934OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o0OoOo0<Object>> f12935OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O0 f12936OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0 f12937OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public o00O0O f12938OooOO0;

    public OooO(@NonNull Context context, @NonNull p156o00OoO00.OooO0o oooO0o, @NonNull OooOOO0 oooOOO0, @NonNull o00000O0 o00000o1, @NonNull OooO0o.OooO00o oooO00o, @NonNull p190o00o0O.OooO oooO, @NonNull List list, @NonNull o000O0 o000o0, @NonNull OooOO0 oooOO1, int i) {
        super(context.getApplicationContext());
        this.f12930OooO00o = oooO0o;
        this.f12932OooO0OO = o00000o1;
        this.f12933OooO0Oo = oooO00o;
        this.f12935OooO0o0 = list;
        this.f12934OooO0o = oooO;
        this.f12936OooO0oO = o000o0;
        this.f12937OooO0oo = oooOO1;
        this.f12929OooO = i;
        this.f12931OooO0O0 = new oo0o0O0(oooOOO0);
    }

    public final synchronized o00O0O OooO00o() {
        if (this.f12938OooOO0 == null) {
            ((OooO0o.OooO00o) this.f12933OooO0Oo).getClass();
            o00O0O o00o0o2 = new o00O0O();
            o00o0o2.f38268OooOo0o = true;
            this.f12938OooOO0 = o00o0o2;
        }
        return this.f12938OooOO0;
    }

    @NonNull
    public final Registry OooO0O0() {
        return (Registry) this.f12931OooO0O0.get();
    }
}
