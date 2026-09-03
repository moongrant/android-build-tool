package p312o0O0oOO;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import p308o0O0oO.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O<T> implements ResponseHandler<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ResponseHandler<? extends T> f41829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Timer f41830OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f41831OooO0OO;

    public o00000O(ResponseHandler<? extends T> responseHandler, Timer timer, OooO oooO) {
        this.f41829OooO00o = responseHandler;
        this.f41830OooO0O0 = timer;
        this.f41831OooO0OO = oooO;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f41831OooO0OO.OooOO0(this.f41830OooO0O0.OooO00o());
        this.f41831OooO0OO.OooO0o0(httpResponse.getStatusLine().getStatusCode());
        Long lOooO00o = o0000Ooo.OooO00o(httpResponse);
        if (lOooO00o != null) {
            this.f41831OooO0OO.OooO(lOooO00o.longValue());
        }
        String strOooO0O0 = o0000Ooo.OooO0O0(httpResponse);
        if (strOooO0O0 != null) {
            this.f41831OooO0OO.OooO0oo(strOooO0O0);
        }
        this.f41831OooO0OO.OooO0O0();
        return this.f41829OooO00o.handleResponse(httpResponse);
    }
}
