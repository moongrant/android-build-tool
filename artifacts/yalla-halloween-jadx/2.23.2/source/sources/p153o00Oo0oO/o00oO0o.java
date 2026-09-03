package p153o00Oo0oO;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.OooO0o;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import o00OoO.OooOOO0;
import p174o00OooOo.o00O0O0;
import p174o00OooOo.o00OO00O;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o implements OooO0o<InputStream>, o00OOO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile o00OO f37822OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO.OooO00o f37823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O0O0 f37824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f37825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0O00oO0 f37826OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0o.OooO00o<? super InputStream> f37827OooO0oo;

    public o00oO0o(o00OO.OooO00o oooO00o, OooOOO0 oooOOO0) {
        this.f37823OooO0Oo = oooO00o;
        this.f37825OooO0o0 = oooOOO0;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        try {
            o00O0O0 o00o0o0 = this.f37824OooO0o;
            if (o00o0o0 != null) {
                o00o0o0.close();
            }
        } catch (IOException unused) {
        }
        o0O00oO0 o0o00oo1 = this.f37826OooO0oO;
        if (o0o00oo1 != null) {
            o0o00oo1.close();
        }
        this.f37827OooO0oo = null;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0Oo(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super InputStream> oooO00o) {
        o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o();
        oooO00o2.OooOO0(this.f37825OooO0o0.OooO0Oo());
        for (Map.Entry<String, String> entry : this.f37825OooO0o0.f37865OooO0O0.OooO00o().entrySet()) {
            oooO00o2.OooO00o(entry.getKey(), entry.getValue());
        }
        o0O00O0o o0o00o0oOooO0O0 = oooO00o2.OooO0O0();
        this.f37827OooO0oo = oooO00o;
        this.f37822OooO = this.f37823OooO0Oo.OooO0O0(o0o00o0oOooO0O0);
        FirebasePerfOkHttpClient.enqueue(this.f37822OooO, this);
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
        o00OO o00oo2 = this.f37822OooO;
        if (o00oo2 != null) {
            o00oo2.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onFailure(@NonNull o00OO o00oo2, @NonNull IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f37827OooO0oo.OooO0OO(iOException);
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onResponse(@NonNull o00OO o00oo2, @NonNull o0O00o00 o0o00o01) {
        this.f37826OooO0oO = o0o00o01.f57852OooOO0;
        if (!o0o00o01.OooO0oO()) {
            this.f37827OooO0oo.OooO0OO(new HttpException(null, o0o00o01.f57850OooO0oO, o0o00o01.f57848OooO0o));
            return;
        }
        o0O00oO0 o0o00oo1 = this.f37826OooO0oO;
        o00OO00O.OooO0O0(o0o00oo1);
        o00O0O0 o00o0o0 = new o00O0O0(this.f37826OooO0oO.OooOOo().o0000OoO(), o0o00oo1.OooO0OO());
        this.f37824OooO0o = o00o0o0;
        this.f37827OooO0oo.OooO0o0(o00o0o0);
    }
}
