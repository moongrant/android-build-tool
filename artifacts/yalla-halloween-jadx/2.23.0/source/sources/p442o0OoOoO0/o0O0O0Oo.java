package p442o0OoOoO0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f46252OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f46253OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f46254OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(AnnotatedString annotatedString, String str, Context context) {
        super(1);
        this.f46252OooO0Oo = annotatedString;
        this.f46254OooO0o0 = str;
        this.f46253OooO0o = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (((AnnotatedString.Range) CollectionsKt.firstOrNull((List) this.f46252OooO0Oo.getStringAnnotations(this.f46254OooO0o0, iIntValue, iIntValue))) != null) {
            int i = RoomSettingActivity.f26645Oooo00O;
            Context context = this.f46253OooO0o;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            RoomSettingActivity.OooO00o.OooO00o((Activity) context, String.valueOf(OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue()));
        }
        return Unit.INSTANCE;
    }
}
