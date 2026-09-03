package p563o0oOOooo;

import com.facebook.appevents.AppEventsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p393o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo000Oo extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oO0OO00o f44951Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f44952OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000Oo(oO0OO00o oo0oo00o, int i) {
        super(0);
        this.f44951Oooo = oo0oo00o;
        this.f44952OoooO00 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        o0O00000.OooO0OO("InRoom_switch_mic_success");
        this.f44951Oooo.OooO(this.f44952OoooO00, AppEventsConstants.EVENT_PARAM_VALUE_NO, false, false);
        return null;
    }
}
