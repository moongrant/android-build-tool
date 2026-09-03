package OooO00o.OooO00o.OooO00o.OooO00o.OooOOOO.OooO00o;

import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import com.yallatech.support.platform.group.create.bean.GroupCreateResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy<OooO0OO> f66OooO00o = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) OooO00o.f67OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<OooO0OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f67OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0OO invoke() {
            return new OooO0OO();
        }
    }

    @Override // p003OooO0o0.o0ooOOo
    @NotNull
    public final BaseResp OooO0O0() {
        GroupCreateResponse.INSTANCE.getClass();
        GroupCreateResponse groupCreateResponse = new GroupCreateResponse();
        groupCreateResponse.setCode(-1007);
        groupCreateResponse.setMsg("GroupCreate Canceled");
        return groupCreateResponse;
    }

    @Override // p003OooO0o0.o0ooOOo
    public final int OooO0o0() {
        return YCSDKCallbackManagerImpl.RequestCodeOffset.GroupCreate.OooO00o();
    }
}
