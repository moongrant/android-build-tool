package androidx.compose.ui.graphics.colorspace;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o000OOoO.o0OoOo0;
import p092o000o0O0.o0O0O00;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements DoubleFunction, o0OoOo0, o0O0OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4171OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4172OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f4171OooO0Oo = i;
        this.f4172OooO0o0 = obj;
    }

    @Override // o000OOoO.o0OoOo0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0O0();
    }

    public final Extractor[] OooO0O0() {
        androidx.media3.common.OooOO0 oooOO1 = (androidx.media3.common.OooOO0) this.f4172OooO0o0;
        Extractor[] extractorArr = new Extractor[1];
        o000OO00.OooO0O0.OooO00o oooO00o = o000OO00.OooO0O0.f34384OooO00o;
        extractorArr[0] = oooO00o.OooO0O0(oooOO1) ? new o0O0O00(oooO00o.OooO00o(oooOO1), oooOO1) : new androidx.media3.exoplayer.source.OooO0o.OooO0O0(oooOO1);
        return extractorArr;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f4171OooO0Oo;
        Object obj = this.f4172OooO0o0;
        switch (i) {
            case 2:
                TaskActivity this$0 = (TaskActivity) obj;
                int i2 = TaskActivity.f25084OooOooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO();
                break;
            default:
                MemberListRemoveActivity this$1 = (MemberListRemoveActivity) obj;
                int i3 = MemberListRemoveActivity.f26112OooOoO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO(true);
                break;
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$3((Function1) this.f4172OooO0o0, d);
    }
}
