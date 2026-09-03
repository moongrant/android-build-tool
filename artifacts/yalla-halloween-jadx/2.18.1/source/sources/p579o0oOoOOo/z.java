package p579o0oOoOOo;

import android.graphics.Paint;
import android.text.TextPaint;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p405o0Oo0OO0.OooO;
import p405o0Oo0OO0.OooOO0;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements OooOo00.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ y f46375OooO00o;

    public z(y yVar) {
        this.f46375OooO00o = yVar;
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @Override // o0Oo0OO0.OooOo00.OooO0O0
    public final void onComplete(@NotNull OooOo videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        OooOO0 oooOO1 = new OooOO0();
        y yVar = this.f46375OooO00o;
        String name = yVar.f46367OoooO0.getFromuser().getName();
        Intrinsics.checkNotNullExpressionValue(name, "moraEndPkRequestReply.fromuser.name");
        String headphoto = this.f46375OooO00o.f46367OoooO0.getFromuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto, "moraEndPkRequestReply.fromuser.headphoto");
        String name2 = this.f46375OooO00o.f46367OoooO0.getJoinuser().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "moraEndPkRequestReply.joinuser.name");
        String headphoto2 = this.f46375OooO00o.f46367OoooO0.getJoinuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto2, "moraEndPkRequestReply.joinuser.headphoto");
        int morastype = this.f46375OooO00o.f46367OoooO0.getMorastype();
        int morajtype = this.f46375OooO00o.f46367OoooO0.getMorajtype();
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
        yVar.OooOOO(oooOO1, "left_head", CloudImageUtilKt.imgSize$default(headphoto, com.yalla.support.common.util.OooOo00.OooO00o(f), false, 2, null), -1, 1.0f);
        yVar.OooOOO(oooOO1, "right_head", CloudImageUtilKt.imgSize$default(headphoto2, com.yalla.support.common.util.OooOo00.OooO00o(f), false, 2, null), -1, 1.0f);
        oooOO1.OooO0OO(morastype != 0, "left_shitou");
        oooOO1.OooO0OO(morastype != 1, "left_jiandao");
        oooOO1.OooO0OO(morastype != 2, "left_bu");
        oooOO1.OooO0OO(morajtype != 0, "right_shitou");
        oooOO1.OooO0OO(morajtype != 1, "right_jiandao");
        oooOO1.OooO0OO(morajtype != 2, "right_bu");
        y yVar2 = this.f46375OooO00o;
        int moraresult = yVar2.f46367OoooO0.getMoraresult();
        String headphoto3 = this.f46375OooO00o.f46367OoooO0.getFromuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto3, "moraEndPkRequestReply.fromuser.headphoto");
        String headphoto4 = this.f46375OooO00o.f46367OoooO0.getJoinuser().getHeadphoto();
        Intrinsics.checkNotNullExpressionValue(headphoto4, "moraEndPkRequestReply.joinuser.headphoto");
        TextPaint textPaint3 = new TextPaint(65);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        textPaint3.setColor(-1);
        textPaint3.setTextSize(26.0f);
        textPaint3.setFakeBoldText(true);
        oooOO1.OooO0O0((String) yVar2.f46369OoooOO0.get(moraresult - 1), textPaint3, "title_win");
        if (moraresult == 1) {
            yVar2.OooOOO(oooOO1, "head", CloudImageUtilKt.imgSize$default(headphoto4, com.yalla.support.common.util.OooOo00.OooO00o(45), false, 2, null), o000O0O0.OooO00o(R.color.color_B430FC), 2.0f);
            oooOO1.OooO0OO(true, "head_Tie_1");
            oooOO1.OooO0OO(true, "head_Tie_2");
        } else if (moraresult == 2) {
            float f2 = 35;
            yVar2.OooOOO(oooOO1, "head_Tie_1", CloudImageUtilKt.imgSize$default(headphoto3, com.yalla.support.common.util.OooOo00.OooO00o(f2), false, 2, null), o000O0O0.OooO00o(R.color.color_B430FC), 2.0f);
            yVar2.OooOOO(oooOO1, "head_Tie_2", CloudImageUtilKt.imgSize$default(headphoto4, com.yalla.support.common.util.OooOo00.OooO00o(f2), false, 2, null), o000O0O0.OooO00o(R.color.color_B430FC), 2.0f);
            oooOO1.OooO0OO(true, "head");
        } else if (moraresult == 3) {
            yVar2.OooOOO(oooOO1, "head", CloudImageUtilKt.imgSize$default(headphoto3, com.yalla.support.common.util.OooOo00.OooO00o(45), false, 2, null), o000O0O0.OooO00o(R.color.color_B430FC), 2.0f);
            oooOO1.OooO0OO(true, "head_Tie_1");
            oooOO1.OooO0OO(true, "head_Tie_2");
        }
        this.f46375OooO00o.f46368OoooO0O.setImageDrawable(new OooO(videoItem, oooOO1));
        this.f46375OooO00o.f46368OoooO0O.setLoops(1);
        this.f46375OooO00o.f46368OoooO0O.OooO0OO();
    }

    @Override // o0Oo0OO0.OooOo00.OooO0O0
    public final void onError() {
    }
}
