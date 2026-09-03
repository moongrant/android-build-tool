package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooO0o<T> extends o0OO0<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f18827OooO0Oo = OooO0O0.NOT_READY;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public T f18828OooO0o0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f18829OooO00o;

        static {
            int[] iArr = new int[OooO0O0.values().length];
            f18829OooO00o = iArr;
            try {
                iArr[OooO0O0.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18829OooO00o[OooO0O0.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum OooO0O0 {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @CheckForNull
    public abstract T OooO00o();

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        OooO0O0 oooO0O0 = this.f18827OooO0Oo;
        OooO0O0 oooO0O1 = OooO0O0.FAILED;
        com.google.common.base.o0OoOo0.OooOOO0(oooO0O0 != oooO0O1);
        int i = OooO00o.f18829OooO00o[this.f18827OooO0Oo.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.f18827OooO0Oo = oooO0O1;
        this.f18828OooO0o0 = OooO00o();
        if (this.f18827OooO0Oo == OooO0O0.DONE) {
            return false;
        }
        this.f18827OooO0Oo = OooO0O0.READY;
        return true;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18827OooO0Oo = OooO0O0.NOT_READY;
        T t = this.f18828OooO0o0;
        this.f18828OooO0o0 = null;
        return t;
    }
}
