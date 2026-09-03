package o000O0;

import androidx.paging.compose.PagingPlaceholderKey;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o000O00O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Object> f34325OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<Object> f34326OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(OooO0O0 oooO0O0, Function1 function1) {
        super(1);
        this.f34325OooO0Oo = function1;
        this.f34326OooO0o0 = oooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        Function1<Object, Object> function1 = this.f34325OooO0Oo;
        if (function1 == null) {
            return new PagingPlaceholderKey(iIntValue);
        }
        Object obj = ((o0Oo0oo) this.f34326OooO0o0.f34330OooO0OO.getValue()).get(iIntValue);
        return obj == null ? new PagingPlaceholderKey(iIntValue) : function1.invoke(obj);
    }
}
