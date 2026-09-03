package p224o00oOOoO;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.OooOO0;
import java.io.IOException;
import java.util.List;
import p224o00oOOoO.o00O00o0;
import p228o00oOo0o.oo000o;
import p244o00oo0Oo.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo00o<T extends o00O00o0<T>> implements OooOO0.OooO00o<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0.OooO00o<? extends T> f39756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final List<StreamKey> f39757OooO0o0;

    public oo00o(oo000o oo000oVar, @Nullable List list) {
        this.f39756OooO0Oo = oo000oVar;
        this.f39757OooO0o0 = list;
    }

    @Override // com.google.android.exoplayer2.upstream.OooOO0.OooO00o
    public final Object OooO00o(Uri uri, o00oOoo o00oooo2) throws IOException {
        o00O00o0 o00o00o1 = (o00O00o0) this.f39756OooO0Oo.OooO00o(uri, o00oooo2);
        List<StreamKey> list = this.f39757OooO0o0;
        return (list == null || list.isEmpty()) ? o00o00o1 : o00o00o1.OooO00o(list);
    }
}
