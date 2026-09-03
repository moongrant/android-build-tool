package p417o0OoO0;

import coil.request.OooO00o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import p533o0o0Oo0.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$1\n+ 3 CoilImageRequestExt.kt\ncom/yalla/yalla/ext/CoilImageRequestExtKt\n*L\n1#1,1056:1\n490#2:1057\n22#3:1058\n21#3:1059\n20#3:1060\n*E\n"})
public final class o00O0O implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0 f45520OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0 f45521OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0 f45522OooO0Oo;

    public o00O0O(o00O000o o00o000o2, o00O000o o00o000o3, o00O000o o00o000o4) {
        this.f45520OooO0O0 = o00o000o2;
        this.f45521OooO0OO = o00o000o3;
        this.f45522OooO0Oo = o00o000o4;
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onCancel() {
        this.f45520OooO0O0.invoke();
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onError() {
        this.f45521OooO0OO.invoke();
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onStart() {
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onSuccess() {
        this.f45522OooO0Oo.invoke();
    }
}
