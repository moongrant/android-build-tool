package p175o00OooOo;

import com.app.base.view.FacePanelView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0OOOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f32716Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f32717Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(FacePanelView facePanelView, int i) {
        super(2);
        this.f32716Oooo0o = facePanelView;
        this.f32717Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        FacePanelView.OooO00o(this.f32716Oooo0o, ooo00o, this.f32717Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
