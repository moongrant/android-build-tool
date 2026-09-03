package OooO00o.OooO00o.OooO00o.OooO00o.OooOOOO.OooO0O0;

import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import com.yallatech.support.platform.group.join.bean.GroupJoinResponse;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f44OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy<OooO0OO> f45OooO0O0 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) OooO00o.f46Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<OooO0OO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f46Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0OO invoke() {
            return new OooO0OO();
        }
    }

    @Override // p003OooO0Oo.o000oOoO
    @NotNull
    public final BaseResp OooO0O0() {
        Objects.requireNonNull(GroupJoinResponse.INSTANCE);
        GroupJoinResponse groupJoinResponse = new GroupJoinResponse();
        groupJoinResponse.setCode(-1008);
        groupJoinResponse.setMsg("GroupJoin Canceled");
        return groupJoinResponse;
    }

    @Override // p003OooO0Oo.o000oOoO
    public final int OooO0o0() {
        return YCSDKCallbackManagerImpl.RequestCodeOffset.GroupJoin.OooO00o();
    }
}
