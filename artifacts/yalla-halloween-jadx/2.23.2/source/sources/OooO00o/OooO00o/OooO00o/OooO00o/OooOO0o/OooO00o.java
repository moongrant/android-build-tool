package OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o;

import OooO0OO.OooOO0O;
import android.util.Log;
import com.google.gson.JsonParseException;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.basecore.net.ResponseParameterizedType;
import com.yallatech.support.platform.login.bean.AppStatus;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p609o0oo0OOO.h5;
import p609o0oo0OOO.k5;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f35OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f36OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Class f37OooO0o0 = AppStatus.class;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(Ref.ObjectRef objectRef, Ref.IntRef intRef) {
        super(2);
        this.f35OooO0Oo = objectRef;
        this.f36OooO0o = intRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [T] */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.yallatech.support.basecore.net.BizResponse] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        ?? bizResponse;
        int iIntValue = num.intValue();
        String response = str;
        Intrinsics.checkNotNullParameter(response, "response");
        String message = "Http ResponseCode " + iIntValue + " | RawResponse = " + response;
        Intrinsics.checkNotNullParameter(message, "message");
        if (h5.f57416OooO0O0) {
            Log.d(h5.f57415OooO00o, message);
        }
        Pair<String, String>[] pairArr = OooOO0O.f109OooO00o;
        try {
            bizResponse = (BizResponse) k5.f57417OooO00o.OooO0Oo(response, new ResponseParameterizedType(this.f37OooO0o0));
        } catch (JsonParseException t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (h5.f57416OooO0O0) {
                Log.e(h5.f57415OooO00o, "", t);
            }
            bizResponse = 0;
        }
        if (bizResponse == 0) {
            bizResponse = new BizResponse(-1001, "Json parse failed", null, 4, null);
        }
        this.f35OooO0Oo.element = bizResponse;
        this.f36OooO0o.element = 3;
        return Unit.INSTANCE;
    }
}
