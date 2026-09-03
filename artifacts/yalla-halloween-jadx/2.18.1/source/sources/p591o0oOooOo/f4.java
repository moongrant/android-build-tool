package p591o0oOooOo;

import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class f4 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventDetailScreen f47230Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f47231Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(EventDetailScreen eventDetailScreen, int i) {
        super(2);
        this.f47230Oooo0o = eventDetailScreen;
        this.f47231Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        EventDetailScreen.OooOOo(this.f47230Oooo0o, ooo00o, this.f47231Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
