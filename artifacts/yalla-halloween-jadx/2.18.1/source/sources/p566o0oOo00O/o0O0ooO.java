package p566o0oOo00O;

import android.content.Intent;
import com.yalla.yalla.ui.activity.user.AristocracyPresentationActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45318Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(PremiumActivity premiumActivity) {
        super(0);
        this.f45318Oooo0o = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f45318Oooo0o.startActivity(new Intent(this.f45318Oooo0o, (Class<?>) AristocracyPresentationActivity.class));
        return Unit.INSTANCE;
    }
}
