package p542o0o0OoOo;

import androidx.compose.runtime.MutableState;
import coil.request.OooO00o;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$1\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$2\n+ 4 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$ItemBubbleInfo$1$2$1\n*L\n1#1,1056:1\n490#2:1057\n491#3:1058\n202#4,2:1059\n198#4,3:1061\n*E\n"})
public final class Oo0000 implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f55346OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ MutableState f55347OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState f55348OooO0Oo;

    public Oo0000(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f55346OooO0O0 = mutableState;
        this.f55347OooO0OO = mutableState2;
        this.f55348OooO0Oo = mutableState3;
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onCancel() {
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onError() {
        StoreChatBubbleMineScreen.ItemBubbleInfo$lambda$11$lambda$6(this.f55346OooO0O0, false);
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onStart() {
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void onSuccess() {
        StoreChatBubbleMineScreen.ItemBubbleInfo$lambda$11$lambda$6(this.f55347OooO0OO, false);
        StoreChatBubbleMineScreen.ItemBubbleInfo$lambda$11$lambda$3(this.f55348OooO0Oo, true);
    }
}
