package p536o0o0Oo0o;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$UserMomentListContent$1$4$2$1$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n1#2:538\n*E\n"})
public final class oOOO00Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f55216OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f55217OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(Context context, String str) {
        super(0);
        this.f55216OooO0Oo = context;
        this.f55217OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = JoinTopicListActivity.f26043OooOoO0;
        Context context = this.f55216OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) JoinTopicListActivity.class);
        intent.putExtra("Id", this.f55217OooO0o0);
        context.startActivity(intent);
        return Unit.INSTANCE;
    }
}
