package o00OO0O0;

import android.view.View;
import com.app.base.model.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f31493Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatModel.BecomeMemberModel f31494Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(o0O0ooO o0o0ooo, ChatModel.BecomeMemberModel becomeMemberModel) {
        super(1);
        this.f31493Oooo0o = o0o0ooo;
        this.f31494Oooo0oO = becomeMemberModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O0ooO o0o0ooo = this.f31493Oooo0o;
        ChatModel.BecomeMemberModel becomeMemberModel = this.f31494Oooo0oO;
        Intrinsics.checkNotNullExpressionValue(becomeMemberModel, "becomeMemberModel");
        o0o0ooo.OooO0O0(becomeMemberModel);
        return Unit.INSTANCE;
    }
}
