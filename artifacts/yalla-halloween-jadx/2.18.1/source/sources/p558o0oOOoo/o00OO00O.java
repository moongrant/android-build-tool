package p558o0oOOoo;

import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p391o0OOooOo.o0O00000;
import p579o0oOoOOo.oOO0O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<oOO0O00O> f44717Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f44718Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(o0O00OO<oOO0O00O> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f44717Oooo0o = o0o00oo2;
        this.f44718Oooo0oO = mixedRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oOO0O00O value;
        o0O00000.OooO0OO("InRoom_game_fruitparty");
        o0O00OO<oOO0O00O> o0o00oo2 = this.f44717Oooo0o;
        MixedRoomActivity mixedRoomActivity = this.f44718Oooo0oO;
        if (o0o00oo2.getValue() == null) {
            try {
                o0o00oo2.setValue(new oOO0O00O(mixedRoomActivity));
                value = o0o00oo2.getValue();
                if (value != null) {
                    value.OooOO0();
                }
            } catch (Exception unused) {
            }
        } else {
            value = o0o00oo2.getValue();
            if (value != null) {
                value.OooOO0();
            }
        }
        return Unit.INSTANCE;
    }
}
