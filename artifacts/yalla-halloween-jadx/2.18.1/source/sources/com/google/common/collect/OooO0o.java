package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class OooO0o<T> extends o0O0o000<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f18311Oooo0o = 2;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NullableDecl
    public T f18312Oooo0oO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f18313OooO00o;

        static {
            int[] iArr = new int[p418o0Oo0oo.o00000O0.OooO0OO(4).length];
            f18313OooO00o = iArr;
            try {
                iArr[p418o0Oo0oo.o00000O0.OooO0O0(3)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18313OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(1)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract T OooO00o();

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        o0OOOO0o.OooOOOO.OooOOO0(this.f18311Oooo0o != 4);
        int i = OooO00o.f18313OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(this.f18311Oooo0o)];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.f18311Oooo0o = 4;
        this.f18312Oooo0oO = OooO00o();
        if (this.f18311Oooo0o == 3) {
            return false;
        }
        this.f18311Oooo0o = 1;
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18311Oooo0o = 2;
        T t = this.f18312Oooo0oO;
        this.f18312Oooo0oO = null;
        return t;
    }
}
