package p509o0o00ooO;

import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ s3 f50796OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel.BecomeMemberModel f50797OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(ChatModel.BecomeMemberModel becomeMemberModel, s3 s3Var) {
        super(1);
        this.f50796OooO0Oo = s3Var;
        this.f50797OooO0o0 = becomeMemberModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f50796OooO0Oo.getClass();
        s3.OooO0O0(this.f50797OooO0o0);
        return Unit.INSTANCE;
    }
}
