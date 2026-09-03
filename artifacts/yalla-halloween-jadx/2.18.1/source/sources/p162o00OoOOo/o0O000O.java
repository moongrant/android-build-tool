package p162o00OoOOo;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.mixedroom.model.SendPicMessageModel;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p159o00OoOO.o00;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000O implements Function1<CloudFileInfo, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CloudFileInfo cloudFileInfo) {
        CloudFileInfo cloudFileInfo2 = cloudFileInfo;
        if (cloudFileInfo2 == null) {
            return null;
        }
        SendPicMessageModel sendPicMessageModel = new SendPicMessageModel();
        sendPicMessageModel.message = cloudFileInfo2.getUrl();
        sendPicMessageModel.picwidth = cloudFileInfo2.getImgWidth();
        sendPicMessageModel.picheight = cloudFileInfo2.getImgHight();
        Objects.requireNonNull(o00O000.OooO());
        o00 o00Var = o00O000.f32468OooO00o;
        if (o00Var == null) {
            return null;
        }
        o00Var.OooO0o(100031, o0Oo0oo.OooO0Oo(sendPicMessageModel));
        return null;
    }
}
