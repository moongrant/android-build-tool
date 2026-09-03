package p519o0o0O0oO;

import android.graphics.Paint;
import android.text.TextPaint;
import com.app.base.protobuf.room.Room;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.opensource.svgaplayer.OooO0OO;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO;
import o0OO0O0.OooOO0;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import p139o00OOooO.OooO0o;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ d2 f52176OooO00o;

    public b2(d2 d2Var) {
        this.f52176OooO00o = d2Var;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull oo000o videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        OooOO0 oooOO1 = new OooOO0();
        d2 d2Var = this.f52176OooO00o;
        String name = d2Var.f52196OooO.getFromuser().getName();
        Intrinsics.checkNotNullExpressionValue(name, "moraEndPkRequestReply.fromuser.name");
        Room.MoraStartPkRequestReply moraStartPkRequestReply = d2Var.f52196OooO;
        String headphoto = moraStartPkRequestReply.getFromuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto, "moraEndPkRequestReply.fromuser.headphoto");
        String name2 = moraStartPkRequestReply.getJoinuser().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "moraEndPkRequestReply.joinuser.name");
        String headphoto2 = moraStartPkRequestReply.getJoinuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto2, "moraEndPkRequestReply.joinuser.headphoto");
        int morastype = moraStartPkRequestReply.getMorastype();
        int morajtype = moraStartPkRequestReply.getMorajtype();
        TextPaint textPaint = new TextPaint();
        TextPaint textPaint2 = new TextPaint();
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint.setTextSize(24.0f);
        textPaint2.setTextSize(24.0f);
        textPaint.setTextAlign(Paint.Align.LEFT);
        oooOO1.OooO0O0(name, textPaint, "left_name");
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        oooOO1.OooO0O0(name2, textPaint2, "right_name");
        float f = 30;
        int iOooO00o = o0000O0.OooO00o(f);
        d2Var.OooOO0o(oooOO1, "left_head", OooO0o.OooO0oo(iOooO00o, iOooO00o, headphoto), -1, 1.0f);
        int iOooO00o2 = o0000O0.OooO00o(f);
        d2Var.OooOO0o(oooOO1, "right_head", OooO0o.OooO0oo(iOooO00o2, iOooO00o2, headphoto2), -1, 1.0f);
        oooOO1.OooO0OO("left_shitou", morastype != 0);
        oooOO1.OooO0OO("left_jiandao", morastype != 1);
        oooOO1.OooO0OO("left_bu", morastype != 2);
        oooOO1.OooO0OO("right_shitou", morajtype != 0);
        oooOO1.OooO0OO("right_jiandao", morajtype != 1);
        oooOO1.OooO0OO("right_bu", morajtype != 2);
        int moraresult = moraStartPkRequestReply.getMoraresult();
        String headphoto3 = moraStartPkRequestReply.getFromuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto3, "moraEndPkRequestReply.fromuser.headphoto");
        String headphoto4 = moraStartPkRequestReply.getJoinuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto4, "moraEndPkRequestReply.joinuser.headphoto");
        TextPaint textPaint3 = new TextPaint(65);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        textPaint3.setColor(-1);
        textPaint3.setTextSize(26.0f);
        textPaint3.setFakeBoldText(true);
        oooOO1.OooO0O0((String) d2Var.f52199OooOO0o.get(moraresult - 1), textPaint3, "title_win");
        if (moraresult == 1) {
            int iOooO00o3 = o0000O0.OooO00o(45);
            d2Var.OooOO0o(oooOO1, "head", OooO0o.OooO0oo(iOooO00o3, iOooO00o3, headphoto4), o0000.OooO00o(oO00O0o.color_B430FC), 2.0f);
            oooOO1.OooO0OO("head_Tie_1", true);
            oooOO1.OooO0OO("head_Tie_2", true);
        } else if (moraresult == 2) {
            float f2 = 35;
            int iOooO00o4 = o0000O0.OooO00o(f2);
            String strOooO0oo = OooO0o.OooO0oo(iOooO00o4, iOooO00o4, headphoto3);
            int i = oO00O0o.color_B430FC;
            d2Var.OooOO0o(oooOO1, "head_Tie_1", strOooO0oo, o0000.OooO00o(i), 2.0f);
            int iOooO00o5 = o0000O0.OooO00o(f2);
            d2Var.OooOO0o(oooOO1, "head_Tie_2", OooO0o.OooO0oo(iOooO00o5, iOooO00o5, headphoto4), o0000.OooO00o(i), 2.0f);
            oooOO1.OooO0OO("head", true);
        } else if (moraresult == 3) {
            int iOooO00o6 = o0000O0.OooO00o(45);
            d2Var.OooOO0o(oooOO1, "head", OooO0o.OooO0oo(iOooO00o6, iOooO00o6, headphoto3), o0000.OooO00o(oO00O0o.color_B430FC), 2.0f);
            oooOO1.OooO0OO("head_Tie_1", true);
            oooOO1.OooO0OO("head_Tie_2", true);
        }
        OooO oooO = new OooO(videoItem, oooOO1);
        SVGAView sVGAView = d2Var.f52197OooOO0;
        sVGAView.setImageDrawable(oooO);
        sVGAView.setLoops(1);
        sVGAView.OooO0Oo();
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void onError() {
    }
}
