package p535o0o0Oo0;

import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p381o0OOoOo0.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function1<o00O0O<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53837OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53838OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f53839OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53840OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(MomentReplyVM momentReplyVM, MomentReplyModel momentReplyModel, MomentCommentsVM momentCommentsVM, MomentVideoVM momentVideoVM) {
        super(1);
        this.f53837OooO0Oo = momentReplyVM;
        this.f53839OooO0o0 = momentReplyModel;
        this.f53838OooO0o = momentCommentsVM;
        this.f53840OooO0oO = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0O<Object> o00o0o2) {
        o00O0O<Object> launchCollectApi = o00o0o2;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f43270OooO00o = new oO0Oo(this.f53837OooO0Oo, this.f53839OooO0o0, this.f53838OooO0o, this.f53840OooO0oO);
        return Unit.INSTANCE;
    }
}
