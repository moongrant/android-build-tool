package p107o000ooO0;

import androidx.paging.compose.PagingPlaceholderKey;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p101o000oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Object> f35801OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<Object> f35802OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOOOO oooOOOO, Function1 function1) {
        super(1);
        this.f35801OooO0Oo = function1;
        this.f35802OooO0o0 = oooOOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        Function1<Object, Object> function1 = this.f35801OooO0Oo;
        if (function1 == null) {
            return new PagingPlaceholderKey(iIntValue);
        }
        Object obj = ((o0000oo) this.f35802OooO0o0.f35806OooO0OO.getValue()).get(iIntValue);
        return obj == null ? new PagingPlaceholderKey(iIntValue) : function1.invoke(obj);
    }
}
