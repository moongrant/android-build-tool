package p045OooooOo;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00o0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<o00O<Object, Object>> f4006Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Object> f4007Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0OO f4008Oooo0oo;

    public static final class OooO00o implements o00OO00O {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0OO f4009Oooo0o;

        public OooO00o(o00O0OO o00o0oo2) {
            this.f4009Oooo0o = o00o0oo2;
        }

        @Override // p045OooooOo.o00OO00O
        public final boolean canBeSaved(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f4009Oooo0o.canBeSaved(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O00o0(oO0Oo<? extends o00O<Object, Object>> oo0oo, oO0Oo<Object> oo0oo2, o00O0OO o00o0oo2) {
        super(0);
        this.f4006Oooo0o = oo0oo;
        this.f4007Oooo0oO = oo0oo2;
        this.f4008Oooo0oo = o00o0oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        return this.f4006Oooo0o.getValue().OooO0O0(new OooO00o(this.f4008Oooo0oo), this.f4007Oooo0oO.getValue());
    }
}
