package p125o00O0oOO;

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
import o00OO00O.OooOOO0;
import p532o0o0Oo.o0000O00;
import p532o0o0Oo.o000OOo;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements OooO0o<InputStream>, oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile o00O00o0 f36718OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00o0.OooO00o f36719OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000OOo f36720OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f36721OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0O0o f36722OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0o.OooO00o<? super InputStream> f36723OooO0oo;

    public oo0o0Oo(o00O00o0.OooO00o oooO00o, OooOOO0 oooOOO0) {
        this.f36719OooO0Oo = oooO00o;
        this.f36721OooO0o0 = oooOOO0;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        try {
            o000OOo o000ooo2 = this.f36720OooO0o;
            if (o000ooo2 != null) {
                o000ooo2.close();
            }
        } catch (IOException unused) {
        }
        o0O0o o0o0o = this.f36722OooO0oO;
        if (o0o0o != null) {
            o0o0o.close();
        }
        this.f36723OooO0oo = null;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0Oo(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super InputStream> oooO00o) {
        o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o();
        oooO00o2.OooOO0(this.f36721OooO0o0.OooO0Oo());
        for (Map.Entry<String, String> entry : this.f36721OooO0o0.f37103OooO0O0.OooO00o().entrySet()) {
            oooO00o2.OooO00o(entry.getKey(), entry.getValue());
        }
        o00OOOOo o00oooooOooO0O0 = oooO00o2.OooO0O0();
        this.f36723OooO0oo = oooO00o;
        this.f36718OooO = this.f36719OooO0Oo.OooO0O0(o00oooooOooO0O0);
        FirebasePerfOkHttpClient.enqueue(this.f36718OooO, this);
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
        o00O00o0 o00o00o1 = this.f36718OooO;
        if (o00o00o1 != null) {
            o00o00o1.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onFailure(@NonNull o00O00o0 o00o00o1, @NonNull IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f36723OooO0oo.OooO0OO(iOException);
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onResponse(@NonNull o00O00o0 o00o00o1, @NonNull o0oOOo o0oooo) {
        this.f36722OooO0oO = o0oooo.f57347OooOO0;
        if (!o0oooo.OooO0oO()) {
            this.f36723OooO0oo.OooO0OO(new HttpException(null, o0oooo.f57345OooO0oO, o0oooo.f57343OooO0o));
            return;
        }
        o0O0o o0o0o = this.f36722OooO0oO;
        o0000O00.OooO0O0(o0o0o);
        o000OOo o000ooo2 = new o000OOo(this.f36722OooO0oO.OooOOo0().o0000OoO(), o0o0o.OooO0OO());
        this.f36720OooO0o = o000ooo2;
        this.f36723OooO0oo.OooO0o0(o000ooo2);
    }
}
