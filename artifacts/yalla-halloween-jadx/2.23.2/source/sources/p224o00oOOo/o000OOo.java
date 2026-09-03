package p224o00oOOo;

import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OO0o00;
import p662o0oooO0O.o0OOOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OO000 f39664OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f39665OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o0Oo0oo.OooO00o f39666OooO00o;

        public OooO00o(@NotNull o0Oo0oo.OooO00o oooO00o) {
            this.f39666OooO00o = oooO00o;
        }

        public final void OooO00o() {
            this.f39666OooO00o.OooO00o(false);
        }

        public final OooO0O0 OooO0O0() {
            o0Oo0oo.OooO0OO oooO0OOOooOOo;
            o0Oo0oo.OooO00o oooO00o = this.f39666OooO00o;
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            synchronized (o0oo0oo2) {
                oooO00o.OooO00o(true);
                oooO0OOOooOOo = o0oo0oo2.OooOOo(oooO00o.f39693OooO00o.f39698OooO00o);
            }
            if (oooO0OOOooOOo != null) {
                return new OooO0O0(oooO0OOOooOOo);
            }
            return null;
        }

        @NotNull
        public final o0OOOO00 OooO0OO() {
            return this.f39666OooO00o.OooO0O0(1);
        }

        @NotNull
        public final o0OOOO00 OooO0Oo() {
            return this.f39666OooO00o.OooO0O0(0);
        }
    }

    public static final class OooO0O0 implements o0OOO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0Oo0oo.OooO0OO f39667OooO0Oo;

        public OooO0O0(@NotNull o0Oo0oo.OooO0OO oooO0OO) {
            this.f39667OooO0Oo = oooO0OO;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f39667OooO0Oo.close();
        }

        @Override // o00oOOo.o0OOO0o.OooO0O0
        @NotNull
        public final o0OOOO00 getData() {
            return this.f39667OooO0Oo.OooO00o(1);
        }

        @Override // o00oOOo.o0OOO0o.OooO0O0
        @NotNull
        public final o0OOOO00 getMetadata() {
            return this.f39667OooO0Oo.OooO00o(0);
        }

        @Override // o00oOOo.o0OOO0o.OooO0O0
        public final OooO00o o00000() {
            o0Oo0oo.OooO00o oooO00oOooO0oO;
            o0Oo0oo.OooO0OO oooO0OO = this.f39667OooO0Oo;
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            synchronized (o0oo0oo2) {
                oooO0OO.close();
                oooO00oOooO0oO = o0oo0oo2.OooO0oO(oooO0OO.f39706OooO0Oo.f39698OooO00o);
            }
            if (oooO00oOooO0oO != null) {
                return new OooO00o(oooO00oOooO0oO);
            }
            return null;
        }
    }

    public o000OOo(long j, @NotNull o0OOOO00 o0oooo01, @NotNull o0OO0o00 o0oo0o01, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.f39664OooO00o = o0oo0o01;
        this.f39665OooO0O0 = new o0Oo0oo(o0oo0o01, o0oooo01, coroutineDispatcher, j);
    }

    @Override // p224o00oOOo.o0OOO0o
    @NotNull
    public final o0OO000 OooO00o() {
        return this.f39664OooO00o;
    }

    @Override // p224o00oOOo.o0OOO0o
    @Nullable
    public final OooO00o OooO0O0(@NotNull String str) {
        ByteString byteString = ByteString.f60193OooO0oO;
        o0Oo0oo.OooO00o oooO00oOooO0oO = this.f39665OooO0O0.OooO0oO(ByteString.OooO00o.OooO0OO(str).OooO0Oo("SHA-256").OooO0o());
        if (oooO00oOooO0oO != null) {
            return new OooO00o(oooO00oOooO0oO);
        }
        return null;
    }

    @Override // p224o00oOOo.o0OOO0o
    @Nullable
    public final OooO0O0 get(@NotNull String str) {
        ByteString byteString = ByteString.f60193OooO0oO;
        o0Oo0oo.OooO0OO oooO0OOOooOOo = this.f39665OooO0O0.OooOOo(ByteString.OooO00o.OooO0OO(str).OooO0Oo("SHA-256").OooO0o());
        if (oooO0OOOooOOo != null) {
            return new OooO0O0(oooO0OOOooOOo);
        }
        return null;
    }
}
