package p537o0o0OoO;

import androidx.compose.runtime.MutableState;
import coil.request.OooO00o;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$1\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$2\n+ 4 ListWelfareItem.kt\ncom/yalla/yalla/ui/screen/user/vip/ListWelfareItemKt$MainTopArea$1$1$1$1\n*L\n1#1,1056:1\n490#2:1057\n491#3:1058\n244#4,2:1059\n241#4,2:1061\n*E\n"})
public final class o0oO0Ooo implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f55400OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ MutableState f55401OooO0OO;

    public o0oO0Ooo(MutableState mutableState, MutableState mutableState2) {
        this.f55400OooO0O0 = mutableState;
        this.f55401OooO0OO = mutableState2;
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onCancel() {
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onError() {
        this.f55400OooO0O0.setValue(Boolean.FALSE);
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onStart() {
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onSuccess() {
        this.f55401OooO0OO.setValue(Boolean.FALSE);
    }
}
