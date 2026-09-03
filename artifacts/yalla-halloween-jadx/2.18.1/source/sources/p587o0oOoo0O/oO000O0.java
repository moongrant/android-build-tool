package p587o0oOoo0O;

import android.os.Bundle;
import android.os.Parcelable;
import com.app.base.fragment.ContributionFragment;
import com.yalla.yalla.model.SquareEventRoomModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p047Oooooo0.o00OO0OO;
import p584o0oOoo.o000O;
import p591o0oOooOo.n4;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SquareEventRoomModel f47033Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OO0OO<SquareEventRoomModel> f47034Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(SquareEventRoomModel squareEventRoomModel, o00OO0OO<SquareEventRoomModel> o00oo0oo) {
        super(0);
        this.f47033Oooo0o = squareEventRoomModel;
        this.f47034Oooo0oO = o00oo0oo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long roomId = this.f47033Oooo0o.getRoomId();
        o00OO0OO<SquareEventRoomModel> o00oo0oo = this.f47034Oooo0oO;
        ArrayList<? extends Parcelable> list = new ArrayList<>();
        int size = o00oo0oo.size();
        for (int i = 0; i < size; i++) {
            list.add(o00oo0oo.get(i));
        }
        Intrinsics.checkNotNullParameter(list, "list");
        Bundle bundleOooO00o = OooO0OO.OooO00o();
        bundleOooO00o.putLong(ContributionFragment.ARG_1, roomId);
        bundleOooO00o.putParcelableArrayList("roomList", list);
        o000O.OooO00o(n4.f47289OooO00o, bundleOooO00o);
        return Unit.INSTANCE;
    }
}
