package p558o0oOOoo;

import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<TreasureBoxDialog> f44741Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f44742Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(o0O00OO<TreasureBoxDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f44741Oooo0o = o0o00oo2;
        this.f44742Oooo0oO = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00OO<TreasureBoxDialog> o0o00oo2 = this.f44741Oooo0o;
        MixedRoomActivity mixedRoomActivity = this.f44742Oooo0oO;
        if (o0o00oo2.getValue() == null) {
            o0o00oo2.setValue(new TreasureBoxDialog(mixedRoomActivity));
        }
        TreasureBoxDialog value = o0o00oo2.getValue();
        if (value != null) {
            value.OooOO0();
        }
        return Unit.INSTANCE;
    }
}
