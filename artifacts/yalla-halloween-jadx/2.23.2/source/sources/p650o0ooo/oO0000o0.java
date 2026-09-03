package p650o0ooo;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58772OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(oO00OOOo oo00oooo) {
        super(1);
        this.f58772OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO00OOOo oo00oooo = this.f58772OooO0Oo;
        oo00oooo.OooOO0O(false);
        if (oo00oooo.OooOO0().f44019OooOOo.isShown()) {
            oo00oooo.OooOO0().f44019OooOOo.setVisibility(8);
        } else {
            oo00oooo.OooOO0().f44019OooOOo.setVisibility(0);
        }
        return Unit.INSTANCE;
    }
}
