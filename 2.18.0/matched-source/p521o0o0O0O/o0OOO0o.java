package p521o0o0O0O;

import android.text.TextUtils;
import com.yalla.yalla.data.db.model.BuriedPoint;
import java.text.SimpleDateFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p031OoooO.o000O0O0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p259o00ooOOo.i;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ SimpleDateFormat f42228Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ BuriedPoint f42229OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(SimpleDateFormat simpleDateFormat, BuriedPoint buriedPoint) {
        super(2);
        this.f42228Oooo = simpleDateFormat;
        this.f42229OoooO00 = buriedPoint;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            String str = this.f42228Oooo.format(Long.valueOf(this.f42229OoooO00.getEventTime())) + "    eventId:" + this.f42229OoooO00.getEventId() + "   url:" + this.f42229OoooO00.getUrl();
            if (!TextUtils.isEmpty(this.f42229OoooO00.getExtInfoString())) {
                this.f42229OoooO00.getExtInfoString();
            }
            o000O0O0.OooO0OO(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 0, 0, 65534);
            i iVar = i.f34657OooO00o;
        }
        return Unit.INSTANCE;
    }
}
