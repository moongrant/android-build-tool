package p216o00oO00O;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.OooO0o;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import p221o00oOO.o0Oo0oo;
import p243o00oo00O.o0000O00;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements OooO0o<InputStream>, o00oOoo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o00OOOOo f33624Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0O0ooO.OooO00o f33625Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0Oo0oo f33626Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0000O00 f33627Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public volatile o0O0ooO f33628OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO0o.OooO00o<? super InputStream> f33629OoooO00;

    public o0O0O00(o0O0ooO.OooO00o oooO00o, o0Oo0oo o0oo0oo2) {
        this.f33625Oooo0o = oooO00o;
        this.f33626Oooo0oO = o0oo0oo2;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        try {
            o0000O00 o0000o00 = this.f33627Oooo0oo;
            if (o0000o00 != null) {
                o0000o00.close();
            }
        } catch (IOException unused) {
        }
        o00OOOOo o00ooooo2 = this.f33624Oooo;
        if (o00ooooo2 != null) {
            o00ooooo2.close();
        }
        this.f33629OoooO00 = null;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource OooO0Oo() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super InputStream> oooO00o) {
        o00OOO00.OooO00o oooO00o2 = new o00OOO00.OooO00o();
        oooO00o2.OooOO0o(this.f33626Oooo0oO.OooO0Oo());
        for (Map.Entry<String, String> entry : this.f33626Oooo0oO.f33754OooO0O0.OooO00o().entrySet()) {
            oooO00o2.OooO00o(entry.getKey(), entry.getValue());
        }
        o00OOO00 o00ooo00OooO0O0 = oooO00o2.OooO0O0();
        this.f33629OoooO00 = oooO00o;
        this.f33628OoooO0 = this.f33625Oooo0o.OooO0OO(o00ooo00OooO0O0);
        this.f33628OoooO0.OoooO0O(this);
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
        o0O0ooO o0o0ooo = this.f33628OoooO0;
        if (o0o0ooo != null) {
            o0o0ooo.cancel();
        }
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onFailure(@NonNull o0O0ooO o0o0ooo, @NonNull IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f33629OoooO00.OooO0OO(iOException);
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onResponse(@NonNull o0O0ooO o0o0ooo, @NonNull o00OOOO0 o00oooo1) {
        this.f33624Oooo = o00oooo1.f51441OoooO;
        if (!o00oooo1.OooO0Oo()) {
            this.f33629OoooO00.OooO0OO(new HttpException(o00oooo1.f51437Oooo, o00oooo1.f51443OoooO00, null));
            return;
        }
        o00OOOOo o00ooooo2 = this.f33624Oooo;
        Objects.requireNonNull(o00ooooo2, "Argument must not be null");
        o0000O00 o0000o00 = new o0000O00(this.f33624Oooo.OooO00o(), o00ooooo2.OooO0Oo());
        this.f33627Oooo0oo = o0000o00;
        this.f33629OoooO00.OooO0o(o0000o00);
    }
}
