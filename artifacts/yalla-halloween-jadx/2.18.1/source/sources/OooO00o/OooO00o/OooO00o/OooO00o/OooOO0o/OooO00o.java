package OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o;

import OooO0O0.OooO0OO;
import android.util.Log;
import com.google.gson.JsonParseException;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.login.bean.AppStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p625o0oo0oo.o000OO00;
import p625o0oo0oo.o000OO0O;
import p626o0oo0oo0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f9Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Class f10Oooo0oO = AppStatus.class;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f11Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(Ref.ObjectRef objectRef, Ref.IntRef intRef) {
        super(2);
        this.f9Oooo0o = objectRef;
        this.f11Oooo0oo = intRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [T] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.yallatech.support.basecore.net.BizResponse] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        ?? bizResponse;
        int iIntValue = num.intValue();
        String response = str;
        Intrinsics.checkNotNullParameter(response, "response");
        String message = "Http ResponseCode " + iIntValue + " | RawResponse = " + response;
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, message);
        }
        Ref.ObjectRef objectRef = this.f9Oooo0o;
        OooO0OO oooO0OO = OooO0OO.f88OooO00o;
        try {
            bizResponse = (BizResponse) o000OO00.f48668OooO00o.OooO0Oo(response, new o000O00(this.f10Oooo0oO));
        } catch (JsonParseException t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (o000OO0O.f48670OooO0O0) {
                Log.e(o000OO0O.f48669OooO00o, "", t);
            }
            bizResponse = 0;
        }
        if (bizResponse == 0) {
            bizResponse = new BizResponse(ResponseInfo.TimedOut, "Json parse failed", null, 4, null);
        }
        objectRef.element = bizResponse;
        this.f11Oooo0oo.element = 3;
        return Unit.INSTANCE;
    }
}
