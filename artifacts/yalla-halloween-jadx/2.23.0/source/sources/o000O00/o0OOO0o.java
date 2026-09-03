package o000O00;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f34412OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o00O0O o00o0o2) {
        super(0);
        this.f34412OooO0Oo = o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String str = this.f34412OooO0Oo.f34387OooO00o;
        return Boolean.valueOf((str == null || Uri.parse(str).getQuery() == null) ? false : true);
    }
}
