package p650o0ooo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000Oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f59023OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f59024OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BoxScope f59025OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f59026OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000Oo(oOo000o0 ooo000o0, BoxScope boxScope, MainRoomVM mainRoomVM, int i) {
        super(2);
        this.f59023OooO0Oo = ooo000o0;
        this.f59025OooO0o0 = boxScope;
        this.f59024OooO0o = mainRoomVM;
        this.f59026OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f59026OooO0oO | 1);
        BoxScope boxScope = this.f59025OooO0o0;
        MainRoomVM mainRoomVM = this.f59024OooO0o;
        oOo000o0.OooO0OO(this.f59023OooO0Oo, boxScope, mainRoomVM, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
