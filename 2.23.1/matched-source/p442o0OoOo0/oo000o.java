package p442o0OoOo0;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.internal.Intrinsics;
import p498o0o00Oo0.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo000o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47208OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f47209OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47210OooO0o0;

    public /* synthetic */ oo000o(int i, Object obj, Object obj2) {
        this.f47208OooO0Oo = i;
        this.f47210OooO0o0 = obj;
        this.f47209OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f47208OooO0Oo;
        Object obj = this.f47209OooO0o;
        Object obj2 = this.f47210OooO0o0;
        switch (i) {
            case 0:
                PreviewView.this.f4148OooOOO.OooO00o((SurfaceRequest) obj);
                break;
            default:
                o00O0O0O this$0 = (o00O0O0O) obj2;
                RoomUserInfoModel userModel = (RoomUserInfoModel) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(userModel, "$userModel");
                this$0.f49652OooO00o.OooOoO(userModel);
                break;
        }
    }
}
