package p536o0o0Oo0o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.State;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/MyUserInfoScreenKt$MyInfoData$1$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1071:1\n1#2:1072\n*E\n"})
public final class oO0000o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ State<Integer> f55089OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(State<Integer> state) {
        super(0);
        this.f55089OooO0Oo = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O0.f10354OooO00o;
        Activity context2 = OooO0O0.OooO0O0();
        if (context2 != null) {
            int i = FollowerActivity.f27105OooOo0o;
            Integer value = this.f55089OooO0Oo.getValue();
            int iIntValue = value != null ? value.intValue() : 0;
            Intrinsics.checkNotNullParameter(context2, "context");
            Intent intent = new Intent(context2, (Class<?>) FollowerActivity.class);
            intent.putExtra("fans", iIntValue);
            context2.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
