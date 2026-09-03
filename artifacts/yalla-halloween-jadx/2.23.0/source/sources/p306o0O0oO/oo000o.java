package p306o0O0oO;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o<T> implements ResponseHandler<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ResponseHandler<? extends T> f42472OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Timer f42473OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O f42474OooO0OO;

    public oo000o(ResponseHandler<? extends T> responseHandler, Timer timer, o00O0O o00o0o2) {
        this.f42472OooO00o = responseHandler;
        this.f42473OooO0O0 = timer;
        this.f42474OooO0OO = o00o0o2;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f42474OooO0OO.OooOO0(this.f42473OooO0O0.OooO00o());
        this.f42474OooO0OO.OooO0o0(httpResponse.getStatusLine().getStatusCode());
        Long lOooO00o = o0ooOOo.OooO00o(httpResponse);
        if (lOooO00o != null) {
            this.f42474OooO0OO.OooO(lOooO00o.longValue());
        }
        String strOooO0O0 = o0ooOOo.OooO0O0(httpResponse);
        if (strOooO0O0 != null) {
            this.f42474OooO0OO.OooO0oo(strOooO0O0);
        }
        this.f42474OooO0OO.OooO0O0();
        return this.f42472OooO00o.handleResponse(httpResponse);
    }
}
