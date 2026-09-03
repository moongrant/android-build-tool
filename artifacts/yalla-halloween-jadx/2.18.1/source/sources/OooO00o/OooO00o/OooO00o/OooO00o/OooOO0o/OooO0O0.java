package OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o;

import android.util.Log;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.basecore.net.BizResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function3<Integer, String, Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f12Oooo0o = "v1/oauth2/app_check";

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f13Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f14Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(Ref.IntRef intRef, Ref.ObjectRef objectRef) {
        super(3);
        this.f13Oooo0oO = intRef;
        this.f14Oooo0oo = objectRef;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    /* JADX WARN: Type inference failed for: r8v14, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    /* JADX WARN: Type inference failed for: r8v20, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, String str, Throwable th) {
        int iIntValue = num.intValue();
        String errorResponse = str;
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        StringBuilder sb = new StringBuilder();
        sb.append("Http ResponseCode = ");
        sb.append(iIntValue);
        sb.append(" ｜ Path = ");
        OooO0O0.OooO0O0.OooO00o(sb, this.f12Oooo0o, " | ErrorMessage = ", errorResponse, " | e = ");
        sb.append(th);
        String msg = sb.toString();
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (o000OO0O.f48670OooO0O0) {
            Log.e(o000OO0O.f48669OooO00o, msg);
        }
        boolean z = false;
        if (500 <= iIntValue && iIntValue <= 599) {
            Ref.IntRef intRef = this.f13Oooo0oO;
            int i = intRef.element + 1;
            intRef.element = i;
            if (i >= 3) {
                Ref.ObjectRef objectRef = this.f14Oooo0oo;
                if (objectRef.element == 0) {
                    objectRef.element = new BizResponse(ResponseInfo.NetworkConnectionLost, "Json parse failed", null, 4, null);
                }
            }
        } else {
            if (400 <= iIntValue && iIntValue <= 499) {
                this.f13Oooo0oO.element = 3;
                this.f14Oooo0oo.element = new BizResponse(ResponseInfo.CannotConnectToHost, "Request 400+, client error.", null, 4, null);
            } else {
                if (300 <= iIntValue && iIntValue <= 399) {
                    z = true;
                }
                if (z) {
                    this.f13Oooo0oO.element = 3;
                    this.f14Oooo0oo.element = new BizResponse(ResponseInfo.UnknownHost, "Request 300+, request redirected.", null, 4, null);
                } else {
                    this.f13Oooo0oO.element = 3;
                    this.f14Oooo0oo.element = new BizResponse(-1006, OooO0O0.OooO00o.OooO00o("Request ", iIntValue, ", Unknown error."), null, 4, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
