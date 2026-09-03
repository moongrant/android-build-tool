package p102o000oo0;

import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o000O00O;
import p659o0oooO00.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O0O f35646OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOO0O f35647OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooOO0O.OooO00o f35648OooO00o;

        public OooO00o(@NotNull OooOO0O.OooO00o oooO00o) {
            this.f35648OooO00o = oooO00o;
        }

        public final void OooO00o() {
            this.f35648OooO00o.OooO00o(false);
        }

        public final OooO0O0 OooO0O0() {
            OooOO0O.OooO0OO oooO0OOOooOOo0;
            OooOO0O.OooO00o oooO00o = this.f35648OooO00o;
            OooOO0O oooOO0O = OooOO0O.this;
            synchronized (oooOO0O) {
                oooO00o.OooO00o(true);
                oooO0OOOooOOo0 = oooOO0O.OooOOo0(oooO00o.f35626OooO00o.f35631OooO00o);
            }
            if (oooO0OOOooOOo0 != null) {
                return new OooO0O0(oooO0OOOooOOo0);
            }
            return null;
        }

        @NotNull
        public final o000OO00 OooO0OO() {
            return this.f35648OooO00o.OooO0O0(1);
        }

        @NotNull
        public final o000OO00 OooO0Oo() {
            return this.f35648OooO00o.OooO0O0(0);
        }
    }

    public static final class OooO0O0 implements OooOO0.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final OooOO0O.OooO0OO f35649OooO0Oo;

        public OooO0O0(@NotNull OooOO0O.OooO0OO oooO0OO) {
            this.f35649OooO0Oo = oooO0OO;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f35649OooO0Oo.close();
        }

        @Override // o000oo0.OooOO0.OooO0O0
        @NotNull
        public final o000OO00 getData() {
            return this.f35649OooO0Oo.OooO00o(1);
        }

        @Override // o000oo0.OooOO0.OooO0O0
        @NotNull
        public final o000OO00 getMetadata() {
            return this.f35649OooO0Oo.OooO00o(0);
        }

        @Override // o000oo0.OooOO0.OooO0O0
        public final OooO00o o000000O() {
            OooOO0O.OooO00o oooO00oOooO0oO;
            OooOO0O.OooO0OO oooO0OO = this.f35649OooO0Oo;
            OooOO0O oooOO0O = OooOO0O.this;
            synchronized (oooOO0O) {
                oooO0OO.close();
                oooO00oOooO0oO = oooOO0O.OooO0oO(oooO0OO.f35639OooO0Oo.f35631OooO00o);
            }
            if (oooO00oOooO0oO != null) {
                return new OooO00o(oooO00oOooO0oO);
            }
            return null;
        }
    }

    public OooOo00(long j, @NotNull o000OO00 o000oo01, @NotNull o000O00O o000o00o2, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.f35646OooO00o = o000o00o2;
        this.f35647OooO0O0 = new OooOO0O(o000o00o2, o000oo01, coroutineDispatcher, j);
    }

    @Override // p102o000oo0.OooOO0
    @NotNull
    public final o0000O0O OooO00o() {
        return this.f35646OooO00o;
    }

    @Override // p102o000oo0.OooOO0
    @Nullable
    public final OooO00o OooO0O0(@NotNull String str) {
        ByteString byteString = ByteString.f60866OooO0oO;
        OooOO0O.OooO00o oooO00oOooO0oO = this.f35647OooO0O0.OooO0oO(ByteString.OooO00o.OooO0OO(str).OooO0Oo("SHA-256").OooO0o());
        if (oooO00oOooO0oO != null) {
            return new OooO00o(oooO00oOooO0oO);
        }
        return null;
    }

    @Override // p102o000oo0.OooOO0
    @Nullable
    public final OooO0O0 get(@NotNull String str) {
        ByteString byteString = ByteString.f60866OooO0oO;
        OooOO0O.OooO0OO oooO0OOOooOOo0 = this.f35647OooO0O0.OooOOo0(ByteString.OooO00o.OooO0OO(str).OooO0Oo("SHA-256").OooO0o());
        if (oooO0OOOooOOo0 != null) {
            return new OooO0O0(oooO0OOOooOOo0);
        }
        return null;
    }
}
