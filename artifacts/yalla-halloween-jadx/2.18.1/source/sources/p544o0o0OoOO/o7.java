package p544o0o0OoOO;

import android.view.View;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o00OOO.OooO00o;
import org.jetbrains.annotations.NotNull;
import p502o0o00o0.o00000O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o7 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O f44285Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f44286Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f44287Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(o00000O o00000o, VoteGameCreateActivity voteGameCreateActivity, Ref.ObjectRef<VoteGameGift> objectRef) {
        super(0L, 1, null);
        this.f44285Oooo0o = o00000o;
        this.f44286Oooo0oO = voteGameCreateActivity;
        this.f44287Oooo0oo = objectRef;
    }

    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f44285Oooo0o.OooO0O0();
        this.f44286Oooo0oO.f23077OooooO0 = this.f44287Oooo0oo.element;
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f44285Oooo0o.f41543Oooo0o);
        oooO00o.OooO00o(OooO00o.OooO0Oo());
        VoteGameGift voteGameGift = this.f44286Oooo0oO.f23077OooooO0;
        oooO00o.f48429OooO0OO = voteGameGift != null ? voteGameGift.getGiftImageUrl() : null;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f44286Oooo0oO.OooOoo().f51030OooO0OO);
    }
}
