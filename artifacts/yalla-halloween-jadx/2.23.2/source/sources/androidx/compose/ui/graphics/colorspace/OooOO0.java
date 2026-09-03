package androidx.compose.ui.graphics.colorspace;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o000OOoO.o0OoOo0;
import p092o000o0O0.o0O0O00;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements DoubleFunction, o0OoOo0, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4169OooO0Oo;

    public /* synthetic */ OooOO0(Object obj) {
        this.f4169OooO0Oo = obj;
    }

    @Override // o000OOoO.o0OoOo0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0O0();
    }

    public final Extractor[] OooO0O0() {
        androidx.media3.common.OooOO0 oooOO1 = (androidx.media3.common.OooOO0) this.f4169OooO0Oo;
        Extractor[] extractorArr = new Extractor[1];
        o000OO00.OooO0O0.OooO00o oooO00o = o000OO00.OooO0O0.f34387OooO00o;
        extractorArr[0] = oooO00o.OooO0O0(oooOO1) ? new o0O0O00(oooO00o.OooO00o(oooOO1), oooOO1) : new androidx.media3.exoplayer.source.OooO0o.OooO0O0(oooOO1);
        return extractorArr;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MemberListRemoveActivity this$0 = (MemberListRemoveActivity) this.f4169OooO0Oo;
        int i = MemberListRemoveActivity.f26110OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(false);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$3((Function1) this.f4169OooO0Oo, d);
    }
}
