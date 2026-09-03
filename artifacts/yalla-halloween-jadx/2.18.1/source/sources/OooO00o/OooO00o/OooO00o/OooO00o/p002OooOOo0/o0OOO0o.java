package OooO00o.OooO00o.OooO00o.OooO00o.p002OooOOo0;

import OooO00o.OooOo00;
import android.content.Context;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.base.BaseReq;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.yallatech.support.platform.share.bean.ShareResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.o000oOoO;
import p003OooO0Oo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f57OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy<o0OOO0o> f58OooO0O0 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) OooO00o.f59Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<o0OOO0o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f59Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOO0o invoke() {
            return new o0OOO0o();
        }
    }

    @Override // p003OooO0Oo.o000oOoO
    @NotNull
    public final BaseResp OooO0O0() {
        return ShareResponse.INSTANCE.createShareResponse(ResponseInfo.CannotConnectToHost, "Share Canceled");
    }

    @Override // p003OooO0Oo.o000oOoO
    public final boolean OooO0Oo(@NotNull Context context, @NotNull BaseReq baseReq, @NotNull o00oO0o startActivityDelegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseReq, "baseReq");
        Intrinsics.checkNotNullParameter(startActivityDelegate, "startActivityDelegate");
        if (baseReq instanceof ShareRequest) {
            OooOo00.f87OooO00o = (ShareRequest) baseReq;
        }
        return super.OooO0Oo(context, new ShareRequest(null, null, null, null, 15, null), startActivityDelegate);
    }

    @Override // p003OooO0Oo.o000oOoO
    public final int OooO0o0() {
        return YCSDKCallbackManagerImpl.RequestCodeOffset.Share.OooO00o();
    }
}
