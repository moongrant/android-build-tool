package p591o0oOooOo;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p193o00o0O00.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f47210Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f47211Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(FragmentActivity fragmentActivity, EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f47210Oooo0o = fragmentActivity;
        this.f47211Oooo0oO = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Oooo0.f33130OooO00o.OooO0O0(this.f47210Oooo0o, 16.0f, 9.0f, true, true, new c4(this.f47211Oooo0oO));
        } else {
            this.f47211Oooo0oO.setShowPermission(false);
        }
        return Unit.INSTANCE;
    }
}
