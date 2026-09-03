package p254o00ooO0o;

import com.google.android.gms.common.zze;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends o00O00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Callable f40257OooO0o;

    public /* synthetic */ o00O000o(zze zzeVar) {
        super(false, 1, null, null);
        this.f40257OooO0o = zzeVar;
    }

    @Override // p254o00ooO0o.o00O00
    public final String OooO00o() {
        try {
            return (String) this.f40257OooO0o.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
