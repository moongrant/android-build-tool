package p175o00OooOo;

import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.FacePanelView;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.GifFaceBuyModel;
import com.yalla.yalla.model.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o0 extends Lambda implements Function1<GifFaceBuyModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView.OooO0O0 f32718Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(FacePanelView.OooO0O0 oooO0O0) {
        super(1);
        this.f32718Oooo0o = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GifFaceBuyModel gifFaceBuyModel) {
        GifListJson gifListJsonCopy;
        GifFaceBuyModel gifFaceBuyModel2 = gifFaceBuyModel;
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.face_buy_success));
        GifListJson value = this.f32718Oooo0o.f11973OooO0O0.getValue();
        if (value != null && (gifListJsonCopy = value.copy((8191 & 1) != 0 ? value.catalogId : 0, (8191 & 2) != 0 ? value.buyType : 0, (8191 & 4) != 0 ? value.isCanUse : false, (8191 & 8) != 0 ? value.isNew : false, (8191 & 16) != 0 ? value.expireTime : 0L, (8191 & 32) != 0 ? value.dayNum : 0, (8191 & 64) != 0 ? value.payType : 0, (8191 & 128) != 0 ? value.price : 0, (8191 & 256) != 0 ? value.promotionPrice : 0, (8191 & 512) != 0 ? value.folderName : null, (8191 & 1024) != 0 ? value.folderIcon : null, (8191 & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? value.themeConfig : null, (8191 & 4096) != 0 ? value.item : null)) != null) {
            gifListJsonCopy.setThemeConfig(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getThemeConfig() : null);
            gifListJsonCopy.setCanUse(true);
            gifListJsonCopy.setExpireTime(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getExpireTime() : 0L);
            gifListJsonCopy.setDayNum(gifFaceBuyModel2 != null ? gifFaceBuyModel2.getDayNum() : 1);
            this.f32718Oooo0o.f11973OooO0O0.postValue(gifListJsonCopy);
        }
        return Unit.INSTANCE;
    }
}
