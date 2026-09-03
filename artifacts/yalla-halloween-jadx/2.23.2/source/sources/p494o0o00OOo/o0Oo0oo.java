package p494o0o00OOo;

import android.view.View;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSelectMedia f49587OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f49588OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentSendImageAdapter f49589OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(MomentSelectMedia momentSelectMedia, MomentSendImageAdapter momentSendImageAdapter, ViewHolder viewHolder) {
        super(1);
        this.f49587OooO0Oo = momentSelectMedia;
        this.f49589OooO0o0 = momentSendImageAdapter;
        this.f49588OooO0o = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f49587OooO0Oo.getDuration() > 0) {
            OooO00o.OooO0OO("106107", MapsKt.mapOf(TuplesKt.to("type", 1)));
        } else {
            OooO00o.OooO0OO("106107", MapsKt.mapOf(TuplesKt.to("type", 2)));
        }
        Function1<? super Integer, Unit> function1 = this.f49589OooO0o0.f25974OooOooo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f49588OooO0o.getLayoutPosition()));
        }
        return Unit.INSTANCE;
    }
}
