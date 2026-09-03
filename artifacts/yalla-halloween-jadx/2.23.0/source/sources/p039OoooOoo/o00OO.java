package p039OoooOoo;

import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Pair;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OO {
    public static StringBuilder OooO00o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static Pair OooO0O0(MomentDetailModel momentDetailModel, String str) {
        return TuplesKt.to(str, Long.valueOf(momentDetailModel.getId()));
    }
}
