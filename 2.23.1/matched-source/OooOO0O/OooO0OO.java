package OooOO0O;

import android.hardware.camera2.CameraCaptureSession;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.OooOo;
import o000OOO.o000oOoO;
import o0O0OOOo.OooOo00;
import p023Oooo00o.oO0000O;
import p080o000OoO.o000OO00;
import p407o0Oo0OOO.oOo00OO0;
import p488o0o000oo.o0000O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f170OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f171OooO0o0;

    public /* synthetic */ OooO0OO(int i, Object obj, Object obj2) {
        this.f169OooO0Oo = i;
        this.f171OooO0o0 = obj;
        this.f170OooO0o = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f169OooO0Oo) {
            case 0:
                OooO0o this$0 = (OooO0o) this.f171OooO0o0;
                OooO0O0.OooO0o nativeAppInfo = (OooO0O0.OooO0o) this.f170OooO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                break;
            case 1:
                ((oO0000O.OooO0OO) this.f171OooO0o0).f922OooO00o.onClosed((CameraCaptureSession) this.f170OooO0o);
                break;
            case 2:
                o000oOoO.OooO00o oooO00o = (o000oOoO.OooO00o) this.f171OooO0o0;
                OooOo oooOo = (OooOo) this.f170OooO0o;
                oooO00o.getClass();
                synchronized (oooOo) {
                }
                o000oOoO o000oooo2 = oooO00o.f34591OooO0O0;
                int i = o000OO00.f34965OooO00o;
                o000oooo2.OooO00o(oooOo);
                break;
            case 3:
                Runnable runnable = (Runnable) this.f171OooO0o0;
                OooOo00.OooO0O0 oooO0O0 = (OooOo00.OooO0O0) this.f170OooO0o;
                try {
                    runnable.run();
                    OooOo00.this.OooOO0(null);
                } catch (Exception e) {
                    OooOo00.this.OooOO0O(e);
                }
                break;
            default:
                MainRoomRecommendFragment this$1 = (MainRoomRecommendFragment) this.f171OooO0o0;
                List list = (List) this.f170OooO0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                try {
                    if (!this$1.isFirstApiStatistical) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        o0000O00.OooO00o oooO00oOooO0O0 = o0000O00.OooO0O0(((oOo00OO0) this$1.getBinding()).f45251OooO0Oo);
                        int i2 = oooO00oOooO0O0.f48724OooO0OO;
                        for (int i3 = oooO00oOooO0O0.f48722OooO00o; i3 < i2; i3++) {
                            if ((list != null ? list.size() : 0) > i3) {
                                Intrinsics.checkNotNull(list);
                                arrayList.add(((RoomIndexModel) list.get(i3)).barid);
                                arrayList2.add(((RoomIndexModel) list.get(i3)).sessionId);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            this$1.isFirstApiStatistical = true;
                            WebEventRepository webEventRepository = WebEventRepository.f24438OooO00o;
                            EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_New;
                            webEventRepository.getClass();
                            WebEventRepository.OooO0oO(this$1, arrayList, arrayList2, enterRoomParentPage);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
        }
    }
}
