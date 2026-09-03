package p494o0o00OOo;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendImageAdapter f49582OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f49583OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(MomentSendImageAdapter momentSendImageAdapter, ViewHolder viewHolder) {
        super(1);
        this.f49582OooO0Oo = momentSendImageAdapter;
        this.f49583OooO0o0 = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super Integer, Unit> function1 = this.f49582OooO0Oo.f25974OooOooo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f49583OooO0o0.getLayoutPosition()));
        }
        return Unit.INSTANCE;
    }
}
