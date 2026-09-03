package o00OO0O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends Lambda implements Function2<String, Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31612Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o0OO00O o0oo00o2) {
        super(2);
        this.f31612Oooo0o = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        String notice = str;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(notice, "notice");
        Function2<? super String, ? super Boolean, Unit> function2 = this.f31612Oooo0o.f31595OoooOOO;
        if (function2 != null) {
            function2.invoke(notice, Boolean.valueOf(zBooleanValue));
        }
        return Unit.INSTANCE;
    }
}
