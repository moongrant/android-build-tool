package p587o0oOoo0O;

import android.app.Activity;
import android.content.Context;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.OooO00o;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00O0oO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f47051Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f47052Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Context f47053Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(OooO00o oooO00o, String str, Context context) {
        super(1);
        this.f47051Oooo0o = oooO00o;
        this.f47052Oooo0oO = str;
        this.f47053Oooo0oo = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (((OooO00o.OooO0O0) CollectionsKt.firstOrNull((List) this.f47051Oooo0o.OooO00o(this.f47052Oooo0oO, iIntValue, iIntValue))) != null) {
            Context context = this.f47053Oooo0oo;
            RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22969o00Ooo;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            oooO00o.OooO00o((Activity) context, String.valueOf(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue()));
        }
        return Unit.INSTANCE;
    }
}
