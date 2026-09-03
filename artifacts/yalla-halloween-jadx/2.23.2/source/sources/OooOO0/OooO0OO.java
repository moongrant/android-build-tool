package OooOO0;

import com.yallatech.support.platform.base.BaseReq;
import com.yallatech.support.platform.group.join.bean.GroupJoinRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOooOO0/OooO0OO;", "LOooO00o/OooO00o/OooO00o/OooO00o/OooOOO0/OooO;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class OooO0OO extends OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO {
    @Override // OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO
    public final int OooO0O0() {
        return -1008;
    }

    @Override // OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO
    @NotNull
    public final o00Oo0 OooO0Oo() {
        return new OooO0O0(this);
    }

    @Override // OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO
    @NotNull
    public final o0Oo0oo OooO0o0() {
        BaseReq baseReq = this.f46OooO0oo;
        if (baseReq != null) {
            return new OooO0o((GroupJoinRequest) baseReq);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.group.join.bean.GroupJoinRequest");
    }
}
