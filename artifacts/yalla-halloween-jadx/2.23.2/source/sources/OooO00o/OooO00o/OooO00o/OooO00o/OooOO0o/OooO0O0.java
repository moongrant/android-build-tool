package OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o;

import android.util.Log;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.basecore.net.BizResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p609o0oo0OOO.h5;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function3<Integer, String, Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f38OooO0Oo = "v1/oauth2/app_check";

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f39OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f40OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(Ref.IntRef intRef, Ref.ObjectRef objectRef) {
        super(3);
        this.f40OooO0o0 = intRef;
        this.f39OooO0o = objectRef;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, com.yallatech.support.basecore.net.BizResponse] */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, String str, Throwable th) {
        int iIntValue = num.intValue();
        String errorResponse = str;
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        StringBuilder sb = new StringBuilder("Http ResponseCode = ");
        sb.append(iIntValue);
        sb.append(" ｜ Path = ");
        OooO0OO.OooO0O0.OooO00o(sb, this.f38OooO0Oo, " | ErrorMessage = ", errorResponse, " | e = ");
        sb.append(th);
        String msg = sb.toString();
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (h5.f57416OooO0O0) {
            Log.e(h5.f57415OooO00o, msg);
        }
        boolean z = false;
        boolean z2 = 500 <= iIntValue && iIntValue <= 599;
        Ref.ObjectRef objectRef = this.f39OooO0o;
        Ref.IntRef intRef = this.f40OooO0o0;
        if (z2) {
            int i = intRef.element + 1;
            intRef.element = i;
            if (i >= 3 && objectRef.element == 0) {
                objectRef.element = new BizResponse(ResponseInfo.NetworkConnectionLost, "Json parse failed", null, 4, null);
            }
        } else {
            if (400 <= iIntValue && iIntValue <= 499) {
                intRef.element = 3;
                objectRef.element = new BizResponse(ResponseInfo.CannotConnectToHost, "Request 400+, client error.", null, 4, null);
            } else {
                if (300 <= iIntValue && iIntValue <= 399) {
                    z = true;
                }
                if (z) {
                    intRef.element = 3;
                    objectRef.element = new BizResponse(ResponseInfo.UnknownHost, "Request 300+, request redirected.", null, 4, null);
                } else {
                    intRef.element = 3;
                    objectRef.element = new BizResponse(-1006, OooO0OO.OooO00o.OooO00o("Request ", iIntValue, ", Unknown error."), null, 4, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
