package oo0o0Oo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p648o0ooOOo.c;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function1<c, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<OooO0OO, Boolean> f53358Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0O0(Function1<? super OooO0OO, Boolean> function1) {
        super(1);
        this.f53358Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(c cVar) {
        c e = cVar;
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof OooO0OO) {
            return this.f53358Oooo0o.invoke((OooO0OO) e);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
