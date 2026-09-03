package OooO;

import com.yallatech.support.platform.base.BaseReq;
import com.yallatech.support.platform.group.join.bean.GroupJoinRequest;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.OooOo00;
import p003OooO0Oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOooO/OooO0OO;", "LOooO00o/OooO00o/OooO00o/OooO00o/OooOOO0/OooO;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class OooO0OO extends OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO {
    @Override // OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO
    public final int OooO00o() {
        return -1008;
    }

    @Override // OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO
    @NotNull
    public final OooOo00 OooO0OO() {
        return new OooO0O0(this);
    }

    @Override // OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO
    @NotNull
    public final o00O0O OooO0Oo() {
        BaseReq baseReq = this.f21OoooO00;
        Objects.requireNonNull(baseReq, "null cannot be cast to non-null type com.yallatech.support.platform.group.join.bean.GroupJoinRequest");
        return new OooO0o((GroupJoinRequest) baseReq);
    }
}
