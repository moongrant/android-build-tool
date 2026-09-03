package p053o00000oO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public interface o000O0 extends oO0Oo<Object> {

    public static final class OooO00o implements o000O0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final Object f27138Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final boolean f27139Oooo0oO;

        public OooO00o(@NotNull Object value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f27138Oooo0o = value;
            this.f27139Oooo0oO = z;
        }

        @Override // p053o00000oO.o000O0
        public final boolean OooO0O0() {
            return this.f27139Oooo0oO;
        }

        @Override // p100o000oOoO.oO0Oo
        @NotNull
        public final Object getValue() {
            return this.f27138Oooo0o;
        }
    }

    boolean OooO0O0();
}
