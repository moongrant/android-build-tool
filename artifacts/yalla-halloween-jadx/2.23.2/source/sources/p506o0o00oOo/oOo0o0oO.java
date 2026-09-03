package p506o0o00oOo;

import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserDefaultHeadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDefaultHeadActivity.kt\ncom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity$showExitDialog$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public final class oOo0o0oO extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f50572OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o0oO(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(0);
        this.f50572OooO0Oo = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        UserDefaultHeadActivity userDefaultHeadActivity = this.f50572OooO0Oo;
        UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = userDefaultHeadActivity.f26755OooOo0O;
        if (userDefaultHeadItemModel == null) {
            return null;
        }
        userDefaultHeadActivity.OooOo(userDefaultHeadItemModel);
        return Unit.INSTANCE;
    }
}
