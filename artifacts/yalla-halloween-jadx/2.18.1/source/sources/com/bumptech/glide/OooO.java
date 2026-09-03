package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Map;
import p214o00oO0.o00OO000;
import p219o00oO0O0.o0O00o0;
import p234o00oOoOO.oOO0O0O;
import p234o00oOoOO.oOO0OO0O;
import p235o00oOoOo.oOOO00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends ContextWrapper {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @VisibleForTesting
    public static final OooOOOO<?, ?> f12358OooOO0O = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f12359OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O00o0 f12360OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Registry f12361OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oOOO00 f12362OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO.OooO00o f12363OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Class<?>, OooOOOO<?, ?>> f12364OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<oOO0O0O<Object>> f12365OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO000 f12366OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0 f12367OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public oOO0OO0O f12368OooOO0;

    public OooO(@NonNull Context context, @NonNull o0O00o0 o0o00o1, @NonNull Registry registry, @NonNull oOOO00 oooo00, @NonNull OooO0OO.OooO00o oooO00o, @NonNull Map<Class<?>, OooOOOO<?, ?>> map, @NonNull List<oOO0O0O<Object>> list, @NonNull o00OO000 o00oo001, @NonNull OooOO0 oooOO1, int i) {
        super(context.getApplicationContext());
        this.f12360OooO00o = o0o00o1;
        this.f12361OooO0O0 = registry;
        this.f12362OooO0OO = oooo00;
        this.f12363OooO0Oo = oooO00o;
        this.f12365OooO0o0 = list;
        this.f12364OooO0o = map;
        this.f12366OooO0oO = o00oo001;
        this.f12367OooO0oo = oooOO1;
        this.f12359OooO = i;
    }
}
