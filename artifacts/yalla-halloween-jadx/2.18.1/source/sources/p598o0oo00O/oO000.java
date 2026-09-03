package p598o0oo00O;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p498o0o00Oo0.OooOOO;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000 extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oO000 f47702Oooo0o = new oO000();

    public oO000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        LiveEventBus.get("ROOM_THEME_UPDATE").post(null);
        OooOOO.f41216OooO00o.OooO0OO().postValue(renewCustomizeTheme2 != null ? Long.valueOf(renewCustomizeTheme2.getBalance()) : null);
        o000O o000o = o000O.f46945OooO00o;
        o000O.OooO0O0();
        return Unit.INSTANCE;
    }
}
