package p341o0OO0ooo;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p340o0OO0ooO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List f42636OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f42637OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00000 f42638OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(o00000 o00000Var, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f42638OooO0oO = o00000Var;
        this.f42637OooO0o0 = i;
        this.f42636OooO0o = arrayList;
    }

    @Override // p340o0OO0ooO.o0ooOOo
    public final void OooO00o() {
        this.f42638OooO0oO.f42614OooOOO.getClass();
        try {
            this.f42638OooO0oO.f42623OooOo0O.Oooo0oo(this.f42637OooO0o0, ErrorCode.CANCEL);
            synchronized (this.f42638OooO0oO) {
                this.f42638OooO0oO.f42624OooOo0o.remove(Integer.valueOf(this.f42637OooO0o0));
            }
        } catch (IOException unused) {
        }
    }
}
