package p558o0oOOoo;

import com.app.base.mixedroom.MixedRoomActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.fragment.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f44722Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<MessageBoxFragment> f44723Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(MixedRoomActivity mixedRoomActivity, o0O00OO<MessageBoxFragment> o0o00oo2) {
        super(0);
        this.f44722Oooo0o = mixedRoomActivity;
        this.f44723Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0O0("102249");
        o0O00000.OooO0OO("InRoom_message");
        this.f44723Oooo0oO.setValue(new MessageBoxFragment());
        MessageBoxFragment messageBoxFragmentOooO0O0 = o00OOO00.OooO0O0(this.f44723Oooo0oO);
        if (messageBoxFragmentOooO0O0 != null) {
            messageBoxFragmentOooO0O0.show(this.f44722Oooo0o.getSupportFragmentManager(), o000O0O0.OooO0OO(R.string.nav_title_message));
        }
        return Unit.INSTANCE;
    }
}
