package p519o0o0O0O;

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
import p258o00ooOOo.f;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SimpleDateFormat f42209Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BuriedPoint f42210Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(SimpleDateFormat simpleDateFormat, BuriedPoint buriedPoint) {
        super(2);
        this.f42209Oooo0o = simpleDateFormat;
        this.f42210Oooo0oO = buriedPoint;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            String str = this.f42209Oooo0o.format(Long.valueOf(this.f42210Oooo0oO.getEventTime())) + "    eventId:" + this.f42210Oooo0oO.getEventId() + "   url:" + this.f42210Oooo0oO.getUrl();
            if (!TextUtils.isEmpty(this.f42210Oooo0oO.getExtInfoString())) {
                this.f42210Oooo0oO.getExtInfoString();
            }
            o000O0O0.OooO0OO(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 0, 0, 65534);
            f fVar = f.f34635OooO00o;
        }
        return Unit.INSTANCE;
    }
}
