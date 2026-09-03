package p027Oooo0o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O {

    public static final class OooO00o extends Lambda implements Function1 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f1827Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooO0O0(o000 o000Var, int i, Function1 function1, Function1 function2, Function4 function4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        o000Var.OooO0OO(i, function1, (i2 & 4) != 0 ? OooO00o.f1827Oooo0o : null, function4);
    }
}
