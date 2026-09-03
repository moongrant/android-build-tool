package p651o0ooo00O;

import com.google.gson.internal.o00O0O;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000OO extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59872OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f59873OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List f59874OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(String str, o000OOo o000ooo2, int i, List list, boolean z) {
        super(str, true);
        this.f59873OooO0o0 = o000ooo2;
        this.f59872OooO0o = i;
        this.f59874OooO0oO = list;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        o00O0O o00o0o2 = this.f59873OooO0o0.f59949OooOOOO;
        List responseHeaders = this.f59874OooO0oO;
        o00o0o2.getClass();
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        try {
            this.f59873OooO0o0.f59963OooOoo0.OooOOo(this.f59872OooO0o, ErrorCode.CANCEL);
            synchronized (this.f59873OooO0o0) {
                this.f59873OooO0o0.f59964OooOooO.remove(Integer.valueOf(this.f59872OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
