package p222o00oOOO0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.OooOOOO;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
import p217o00oO00o.o000000O;
import p221o00oOO.o0000;
import p221o00oOO.o00000;
import p221o00oOO.o00000O;
import p221o00oOO.o00000O0;
import p221o00oOO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOO0 implements o00000O0<o0Oo0oo, InputStream> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000000O<Integer> f33766OooO0O0 = o000000O.OooO00o("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00000<o0Oo0oo, o0Oo0oo> f33767OooO00o;

    public static class OooO00o implements o00000O<o0Oo0oo, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00000<o0Oo0oo, o0Oo0oo> f33768OooO00o = new o00000<>();

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<o0Oo0oo, InputStream> OooO00o(o0000 o0000Var) {
            return new o00OOOO0(this.f33768OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o00OOOO0(@Nullable o00000<o0Oo0oo, o0Oo0oo> o00000Var) {
        this.f33767OooO00o = o00000Var;
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull o0Oo0oo o0oo0oo2) {
        return true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<InputStream> OooO0O0(@NonNull o0Oo0oo o0oo0oo2, int i, int i2, @NonNull p217o00oO00o.o00000 o00000Var) {
        o0Oo0oo o0oo0oo3 = o0oo0oo2;
        o00000<o0Oo0oo, o0Oo0oo> o00000Var2 = this.f33767OooO00o;
        if (o00000Var2 != null) {
            o00000.OooO00o<o0Oo0oo> OooO00o2 = o00000.OooO00o.OooO00o(o0oo0oo3);
            o0Oo0oo o0oo0ooOooO00o = o00000Var2.f33691OooO00o.OooO00o(OooO00o2);
            Queue<o00000.OooO00o<?>> queue = o00000.OooO00o.f33692OooO0Oo;
            synchronized (queue) {
                queue.offer(OooO00o2);
            }
            o0Oo0oo o0oo0oo4 = o0oo0ooOooO00o;
            if (o0oo0oo4 == null) {
                o00000<o0Oo0oo, o0Oo0oo> o00000Var3 = this.f33767OooO00o;
                Objects.requireNonNull(o00000Var3);
                o00000Var3.f33691OooO00o.OooO0Oo(o00000.OooO00o.OooO00o(o0oo0oo3), o0oo0oo3);
            } else {
                o0oo0oo3 = o0oo0oo4;
            }
        }
        return new o00000O0.OooO00o<>(o0oo0oo3, new OooOOOO(o0oo0oo3, ((Integer) o00000Var.OooO0OO(f33766OooO0O0)).intValue()));
    }
}
