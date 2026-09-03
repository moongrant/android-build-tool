package p502o0o00oOO;

import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O00O f49563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel.BecomeMemberModel f49564OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00(ChatModel.BecomeMemberModel becomeMemberModel, oO0O00O oo0o00o) {
        super(1);
        this.f49563OooO0Oo = oo0o00o;
        this.f49564OooO0o0 = becomeMemberModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49563OooO0Oo.getClass();
        oO0O00O.OooO0O0(this.f49564OooO0o0);
        return Unit.INSTANCE;
    }
}
