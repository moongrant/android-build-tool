package p423o0OoO0OO;

import coil.request.OooO00o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import p541o0o0OoOO.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$1\n+ 3 CoilImageRequestExt.kt\ncom/yalla/yalla/ext/CoilImageRequestExtKt\n*L\n1#1,1056:1\n490#2:1057\n22#3:1058\n21#3:1059\n20#3:1060\n*E\n"})
public final class o0000O0O implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0 f46636OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0 f46637OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0 f46638OooO0Oo;

    public o0000O0O(oOO0O0O ooo0o0o, oOO0O0O ooo0o0o2, oOO0O0O ooo0o0o3) {
        this.f46636OooO0O0 = ooo0o0o;
        this.f46637OooO0OO = ooo0o0o2;
        this.f46638OooO0Oo = ooo0o0o3;
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onCancel() {
        this.f46636OooO0O0.invoke();
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onError() {
        this.f46637OooO0OO.invoke();
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onStart() {
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onSuccess() {
        this.f46638OooO0Oo.invoke();
    }
}
