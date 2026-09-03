package p650o0ooo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f58841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f58842OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f58843OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f58844OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO00o00O(oOo000o0 ooo000o0, MainRoomVM mainRoomVM, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, int i) {
        super(2);
        this.f58841OooO0Oo = ooo000o0;
        this.f58843OooO0o0 = mainRoomVM;
        this.f58842OooO0o = function3;
        this.f58844OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58844OooO0oO | 1);
        MainRoomVM mainRoomVM = this.f58843OooO0o0;
        Function3<BoxScope, Composer, Integer, Unit> function3 = this.f58842OooO0o;
        oOo000o0.OooO0O0(this.f58841OooO0Oo, mainRoomVM, function3, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
