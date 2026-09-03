package p566o0oOo00O;

import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0O extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f45397Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(0);
        this.f45397Oooo0o = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        UserDefaultHeadActivity userDefaultHeadActivity = this.f45397Oooo0o;
        UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = userDefaultHeadActivity.f23431OooooO0;
        if (userDefaultHeadItemModel == null) {
            return null;
        }
        userDefaultHeadActivity.OooOooO(userDefaultHeadItemModel);
        return Unit.INSTANCE;
    }
}
