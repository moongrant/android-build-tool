package p655o0ooo0O;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p652o0ooo000.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00000 extends o00000O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59514OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000 f59515OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List f59516OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(String str, o0OOo000 o0ooo001, int i, List list, boolean z) {
        super(str, true);
        this.f59515OooO0o0 = o0ooo001;
        this.f59514OooO0o = i;
        this.f59516OooO0oO = list;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        oO0o0o oo0o0o = this.f59515OooO0o0.f59462OooOOOO;
        List responseHeaders = this.f59516OooO0oO;
        oo0o0o.getClass();
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        try {
            this.f59515OooO0o0.f59476OooOoo0.OooOo00(this.f59514OooO0o, ErrorCode.CANCEL);
            synchronized (this.f59515OooO0o0) {
                this.f59515OooO0o0.f59477OooOooO.remove(Integer.valueOf(this.f59514OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
