package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public final class o0000O00 extends ImmutableListMultimap<Object, Object> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final o0000O00 f18438OoooO0 = new o0000O00();

    public o0000O00() {
        super(o0O00000.f18579OoooO0O, 0);
    }

    private Object readResolve() {
        return f18438OoooO0;
    }
}
