package p484o0o000OO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import p144o00Oo.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f40881OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(Function1<? super String, Unit> function1) {
        this.f40881OooO0O0 = function1;
    }

    @Override // p144o00Oo.OooO0o
    public final void OooO00o(@Nullable Exception exc) {
        this.f40881OooO0O0.invoke("");
    }

    @Override // p144o00Oo.OooO0o
    public final void OooO0O0(Object obj) {
        String str = (String) obj;
        Function1<String, Unit> function1 = this.f40881OooO0O0;
        if (str == null) {
            str = "";
        }
        function1.invoke(str);
    }
}
